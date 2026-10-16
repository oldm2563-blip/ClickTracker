package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.entity.Lien;

import java.util.List;

public interface LienRepoiteryInterface {
    List<Lien> getAll();
    void save(Lien lien);
}
