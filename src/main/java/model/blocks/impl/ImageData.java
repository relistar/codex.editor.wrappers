package model.blocks.impl;

import model.blocks.BlockData;
import model.blocks.FileData;

public class ImageData extends BlockData {
    private FileData file;
    private String caption;
    private boolean withBorder;
    private boolean stretched;
    private boolean withBackground;

    public FileData getFile() {
        return file;
    }

    public void setFile(FileData file) {
        this.file = file;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public boolean isWithBorder() {
        return withBorder;
    }

    public void setWithBorder(boolean withBorder) {
        this.withBorder = withBorder;
    }

    public boolean isStretched() {
        return stretched;
    }

    public void setStretched(boolean stretched) {
        this.stretched = stretched;
    }

    public boolean isWithBackground() {
        return withBackground;
    }

    public void setWithBackground(boolean withBackground) {
        this.withBackground = withBackground;
    }

    @Override
    public String toString() {
        return "ImageData{" +
                "file=" + file +
                ", caption='" + caption + '\'' +
                ", withBorder=" + withBorder +
                ", stretched=" + stretched +
                ", withBackground=" + withBackground +
                '}';
    }
}
