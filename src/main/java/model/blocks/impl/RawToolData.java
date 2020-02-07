package model.blocks.impl;

import model.blocks.BlockData;

public class RawToolData extends BlockData {
    private String html;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "RawToolData{" +
                "html='" + html + '\'' +
                '}';
    }
}
