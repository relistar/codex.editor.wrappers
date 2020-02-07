package com.github.relistar.model.blocks.impl;

import com.github.relistar.model.blocks.BlockData;

import java.util.List;

public class ListData extends BlockData {
    private String style;
    private List<String> items;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ListData{" +
                "style='" + style + '\'' +
                ", items=" + items +
                '}';
    }
}
