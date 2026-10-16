package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.dto.OffreDto;
import ma.youcode.clicktrack.entity.Lien;

import java.util.ArrayList;
import java.util.List;

public class LienRepositery implements LienRepoiteryInterface {

    List<Lien> liens = new ArrayList<>();

    @Override
    public List<Lien> getAll(){
        return liens;
    }

    @Override
    public void save(Lien lien){
        liens.add(lien);
    }

}
