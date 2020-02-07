package com.github.relistar.model.blocks.impl;

import com.github.relistar.model.blocks.BlockData;

public class ParagraphData extends BlockData {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "ParagraphData{" +
                "text='" + text + '\'' +
                '}';
    }
}
