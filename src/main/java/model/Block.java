package model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import model.blocks.BlockData;
import model.blocks.impl.*;

public class Block {

    private String type;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", include = JsonTypeInfo.As.EXTERNAL_PROPERTY)
    @JsonSubTypes(value = {
            @JsonSubTypes.Type(value = DelimiterData.class, name = "delimiter"),
            @JsonSubTypes.Type(value = EmbedData.class, name = "embed"),
            @JsonSubTypes.Type(value = HeaderData.class, name = "header"),
            @JsonSubTypes.Type(value = ImageData.class, name = "image"),
            @JsonSubTypes.Type(value = LinkToolData.class, name = "linkTool"),
            @JsonSubTypes.Type(value = ListData.class, name = "list"),
            @JsonSubTypes.Type(value = ParagraphData.class, name = "paragraph"),
            @JsonSubTypes.Type(value = QuoteData.class, name = "quote"),
            @JsonSubTypes.Type(value = RawToolData.class, name = "rawTool"),
            @JsonSubTypes.Type(value = TableData.class, name = "table")
    })
    private BlockData data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BlockData getData() {
        return data;
    }

    public void setData(BlockData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Block{" +
                "type='" + type + '\'' +
                ", data=" + data +
                '}';
    }
}
