package ma.youcode.clicktrack.controller;

import ma.youcode.clicktrack.dto.LienRequestDto;
import ma.youcode.clicktrack.dto.OffreDto;
import ma.youcode.clicktrack.entity.Lien;
import ma.youcode.clicktrack.entity.Publisher;
import ma.youcode.clicktrack.service.LienServiceInterface;
import ma.youcode.clicktrack.service.PublisherServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publishers")
public class PublisherController {

    private final PublisherServiceInterface serviceP;
    private final LienServiceInterface serviceL;

    public PublisherController(PublisherServiceInterface serviceP, LienServiceInterface serviceL) {
        this.serviceP = serviceP;
        this.serviceL = serviceL;
    }

    @GetMapping
    public List<Publisher> getAll(){
        return serviceP.getAll();
    }

    @PostMapping("/{id}/liens")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@PathVariable("id") long id, @RequestBody LienRequestDto dto){
        serviceL.save(id, dto);
    }

    @GetMapping("/{id}/offres")
    public List<OffreDto> getOffres(@PathVariable("id") long id){
        return serviceL.getOffres(id);
    }

    @GetMapping("/{id}/liens")
    public List<Lien> getLiens(@PathVariable("id") long id){
        return serviceL.getPublisherLiens(id);
    }

}
