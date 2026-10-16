package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.dto.ClickResponseDto;
import ma.youcode.clicktrack.dto.LienRequestDto;
import ma.youcode.clicktrack.dto.OffreDto;
import ma.youcode.clicktrack.entity.Lien;
import ma.youcode.clicktrack.entity.Publisher;
import ma.youcode.clicktrack.repository.LienRepoiteryInterface;
import ma.youcode.clicktrack.repository.PublisherRepositeryInterface;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LienService implements LienServiceInterface{

    private final LienRepoiteryInterface lien;
    private final PublisherRepositeryInterface publisher;

    public LienService(LienRepoiteryInterface lien, PublisherRepositeryInterface publisher) {
        this.lien = lien;
        this.publisher = publisher;
    }

    @Override
    public void save(long pubId, LienRequestDto dto){
        long id = lien.getAll().size() + 1;
        Lien newLien = new Lien(id, dto.getOffre(), dto.getUrl(), pubId);
        lien.save(newLien);
    }

    @Override
    public List<OffreDto> getOffres(long id){
        List<Lien> liens = lien.getAll();
        return liens.stream().filter(l -> l.getPublisherId() == id).collect(Collectors.groupingBy(Lien::getOffre)).entrySet().stream().map(entry ->{
            String offre = entry.getKey();
            List<Lien> lienList = entry.getValue();

            long nombreLiens = lienList.size();
            long totalClicks = lienList.stream().mapToLong(Lien::getClicks).sum();
            return new OffreDto(offre, nombreLiens, totalClicks);
        }).toList();
    }

    @Override
    public List<Lien> getPublisherLiens(long id){
        return lien.getAll().stream().filter(l -> l.getPublisherId() == id).toList();
    }

    @Override
    public ClickResponseDto click(long id){
        Lien lienone = lien.getAll().stream().filter(l -> l.getId() == id).findFirst().orElse(null);

        if (lienone == null) {
            return null;
        }


        lienone.setClicks(lienone.getClicks() + 1);
        Publisher publisher = this.publisher.getAll().stream().filter(p -> p.getId() == lienone.getPublisherId()).findFirst().orElse(null);
        String fullName = publisher.getNom() + " " + publisher.getPrenom();

        return new ClickResponseDto(
                lienone.getUrlDestination(),
                fullName,
                lienone.getOffre(),
                lienone.getClicks()
        );
    }
}
