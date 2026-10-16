package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.entity.Publisher;

import java.util.ArrayList;
import java.util.List;

public class PublisherRepositery implements PublisherRepositeryInterface {

    List<Publisher> publishers = new ArrayList<>();

    public PublisherRepositery() {
        publishers.add(new Publisher(1, "Alaoui", "Youssef", "youssef.alaoui@mail.com", Publisher.Categorie.YOUTUBEUR));
        publishers.add(new Publisher(2, "Bennani", "Salma", "salma.bennani@mail.com", Publisher.Categorie.INFLUENCEUR));
        publishers.add(new Publisher(3, "Idrissi", "Karim", "karim.idrissi@mail.com", Publisher.Categorie.BLOGUEUR));
        publishers.add(new Publisher(4, "Tazi", "Imane", "imane.tazi@mail.com", Publisher.Categorie.INFLUENCEUR));
    }

    @Override
    public List<Publisher> getAll(){
        return publishers;
    }
    @Override
    public Publisher getById(long id){
        return publishers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
