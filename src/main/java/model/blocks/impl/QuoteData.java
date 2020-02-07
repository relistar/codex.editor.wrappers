package model.blocks.impl;

import model.blocks.BlockData;

public class QuoteData extends BlockData {
    private String text;
    private String caption;
    private String alignment;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Override
    public String toString() {
        return "QuoteData{" +
                "text='" + text + '\'' +
                ", caption='" + caption + '\'' +
                ", alignment='" + alignment + '\'' +
                '}';
    }
}
