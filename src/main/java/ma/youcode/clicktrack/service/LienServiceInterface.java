package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.dto.ClickResponseDto;
import ma.youcode.clicktrack.dto.LienRequestDto;
import ma.youcode.clicktrack.dto.OffreDto;
import ma.youcode.clicktrack.entity.Lien;

import java.util.List;

public interface LienServiceInterface {
    void save(long Id, LienRequestDto dto);
    public List<OffreDto> getOffres(long id);
    public List<Lien> getPublisherLiens(long id);
    public ClickResponseDto click(long id);
}
