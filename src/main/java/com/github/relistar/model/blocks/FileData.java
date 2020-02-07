package com.github.relistar.model.blocks;

public class FileData {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "url='" + url + '\'' +
                '}';
    }
}
