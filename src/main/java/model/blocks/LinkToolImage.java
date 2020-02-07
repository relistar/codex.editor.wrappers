package model.blocks;

public class LinkToolImage {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "LinkToolImage{" +
                "url='" + url + '\'' +
                '}';
    }
}
