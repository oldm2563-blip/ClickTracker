package ma.youcode.clicktrack.service;

import ma.youcode.clicktrack.entity.Publisher;

import java.util.List;

public interface PublisherServiceInterface {
    List<Publisher> getAll();
    Publisher getPublisherById(long id);
}
