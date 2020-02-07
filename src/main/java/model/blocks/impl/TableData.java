package model.blocks.impl;

import model.blocks.BlockData;

import java.util.List;

public class TableData extends BlockData {
    private List<List<String>> content;

    public List<List<String>> getContent() {
        return content;
    }

    public void setContent(List<List<String>> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "TableData{" +
                "content=" + content +
                '}';
    }
}
