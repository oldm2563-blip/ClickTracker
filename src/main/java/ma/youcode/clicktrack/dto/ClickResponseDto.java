package ma.youcode.clicktrack.dto;

public class ClickResponseDto {
    private String urlRedirection;
    private String publisher;
    private String offre;
    private long clicks;

    public ClickResponseDto() {}

    public ClickResponseDto(String urlRedirection, String publisher, String offre, long clicks) {
        this.urlRedirection = urlRedirection;
        this.publisher = publisher;
        this.offre = offre;
        this.clicks = clicks;
    }

    // Getters and Setters
    public String getUrlRedirection() {
        return urlRedirection;
    }

    public void setUrlRedirection(String urlRedirection) {
        this.urlRedirection = urlRedirection;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }
}