/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Fs implements Serializable {

    private static final long serialVersionUID = -1724591057;

    private final String        bucket;
    private final String        path;
    private final String        contentType;
    private final LocalDateTime createdOn;
    private final LocalDateTime updatedOn;
    private final String        metadataJson;
    private final byte[]        contents;

    public Fs(Fs value) {
        this.bucket = value.bucket;
        this.path = value.path;
        this.contentType = value.contentType;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.metadataJson = value.metadataJson;
        this.contents = value.contents;
    }

    public Fs(
        String        bucket,
        String        path,
        String        contentType,
        LocalDateTime createdOn,
        LocalDateTime updatedOn,
        String        metadataJson,
        byte[]        contents
    ) {
        this.bucket = bucket;
        this.path = path;
        this.contentType = contentType;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.metadataJson = metadataJson;
        this.contents = contents;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getPath() {
        return this.path;
    }

    public String getContentType() {
        return this.contentType;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    public String getMetadataJson() {
        return this.metadataJson;
    }

    public byte[] getContents() {
        return this.contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fs (");

        sb.append(bucket);
        sb.append(", ").append(path);
        sb.append(", ").append(contentType);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(metadataJson);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
