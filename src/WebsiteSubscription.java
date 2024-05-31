public class WebsiteSubscription {
    private Website website;
    private int frequency;
    private String lastcontent;

    public WebsiteSubscription(Website website) {
        this.website = website;
        this.lastcontent = "";
    }

    public Website getWebsite() {
        return website;
    }

    public String getLastcontent() {
        return lastcontent;
    }

    public void setLastcontent(String lastcontent) {
        this.lastcontent = lastcontent;
    }
}
