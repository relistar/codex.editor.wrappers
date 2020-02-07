package model;

import java.util.List;

/**
 * Main editor.js output json wrapper made for
 * serialize/deserialize with ObjectMapper class from FasterXML/jackson library
 */
public class EditorContent {
    
    private long time;
    private List<Block> blocks;
    private String version;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "EditorContent{" +
                "time=" + time +
                ", blocks=" + blocks +
                ", version='" + version + '\'' +
                '}';
    }
}
