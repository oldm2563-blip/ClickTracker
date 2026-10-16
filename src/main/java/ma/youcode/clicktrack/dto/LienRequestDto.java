package ma.youcode.clicktrack.dto;

public class LienRequestDto {
    private String offre;
    private String url;

    public LienRequestDto() {}

    public String getOffre() { return offre; }
    public void setOffre(String offre) { this.offre = offre; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}