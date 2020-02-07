package model.blocks.impl;

import model.blocks.LinkToolMeta;
import model.blocks.BlockData;

public class LinkToolData extends BlockData {
    private String link;
    private LinkToolMeta meta;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LinkToolMeta getMeta() {
        return meta;
    }

    public void setMeta(LinkToolMeta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "LinkToolData{" +
                "link='" + link + '\'' +
                ", meta=" + meta +
                '}';
    }
}
