package ma.youcode.clicktrack.repository;

import ma.youcode.clicktrack.entity.Publisher;

import java.util.List;

public interface PublisherRepositeryInterface {
    List<Publisher> getAll();
    Publisher getById(long id);
}
