package model.blocks.impl;

import model.blocks.BlockData;

public class HeaderData extends BlockData {

    private String text;
    private int level;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "HeaderData{" +
                "text='" + text + '\'' +
                ", level=" + level +
                '}';
    }
}
