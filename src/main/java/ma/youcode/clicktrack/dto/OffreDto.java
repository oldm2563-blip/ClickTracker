package ma.youcode.clicktrack.dto;

public class OffreDto {
    private String offre;
    private long nombreLiens;
    private long clicks;

    public OffreDto() {}

    public OffreDto(String offre, long nombreLiens, long clicks) {
        this.offre = offre;
        this.nombreLiens = nombreLiens;
        this.clicks = clicks;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public long getNombreLiens() {
        return nombreLiens;
    }

    public void setNombreLiens(long nombreLiens) {
        this.nombreLiens = nombreLiens;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }
}