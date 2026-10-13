package ma.youcode.clicktrack.entity;

public class Lien {
    private long id;
    private String offre;
    private String urlDestination;
    private long clicks;
    private long publisherId;

    public Lien() {}

    public Lien(long id, String offre, String urlDestination, long publisherId) {
        this.id = id;
        this.offre = offre;
        this.urlDestination = urlDestination;
        this.clicks = 0;
        this.publisherId = publisherId;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public String getUrlDestination() {
        return urlDestination;
    }

    public void setUrlDestination(String urlDestination) {
        this.urlDestination = urlDestination;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }
}