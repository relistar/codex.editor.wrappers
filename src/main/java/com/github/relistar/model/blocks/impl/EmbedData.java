package com.github.relistar.model.blocks.impl;

import com.github.relistar.model.blocks.BlockData;

public class EmbedData extends BlockData {
    private String service;
    private String source;
    private String embed;
    private int width;
    private int height;
    private String caption;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "EmbedData{" +
                "service='" + service + '\'' +
                ", source='" + source + '\'' +
                ", embed='" + embed + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", caption='" + caption + '\'' +
                '}';
    }
}
