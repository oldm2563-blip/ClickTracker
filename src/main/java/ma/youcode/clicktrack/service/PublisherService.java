package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.entity.Publisher;
import ma.youcode.clicktrack.repository.PublisherRepositeryInterface;

import java.util.List;

public class PublisherService implements PublisherServiceInterface {

    private final PublisherRepositeryInterface publisher;

    public PublisherService(PublisherRepositeryInterface publisher) {   // Spring injects it
        this.publisher = publisher;
    }

    @Override
    public List<Publisher> getAll(){
        return publisher.getAll();
    }

    @Override
    public Publisher getPublisherById(long id){
        return null;
    }

}
