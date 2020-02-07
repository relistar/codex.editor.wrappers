package com.github.relistar.model.blocks;

public class LinkToolMeta {
    private String url;
    private String domain;
    private String title;
    private String description;
    private LinkToolImage image;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkToolImage getImage() {
        return image;
    }

    public void setImage(LinkToolImage image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "LinkToolMeta{" +
                "url='" + url + '\'' +
                ", domain='" + domain + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image=" + image +
                '}';
    }
}
