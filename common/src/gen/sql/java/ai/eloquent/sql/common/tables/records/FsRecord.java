/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables.records;


import ai.eloquent.sql.common.tables.Fs;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FsRecord extends UpdatableRecordImpl<FsRecord> implements Record7<String, String, String, LocalDateTime, LocalDateTime, String, byte[]> {

    private static final long serialVersionUID = 1401886871;

    /**
     * Setter for <code>common.fs.bucket</code>.
     */
    public FsRecord setBucket(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.bucket</code>.
     */
    public String getBucket() {
        return (String) get(0);
    }

    /**
     * Setter for <code>common.fs.path</code>.
     */
    public FsRecord setPath(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.path</code>.
     */
    public String getPath() {
        return (String) get(1);
    }

    /**
     * Setter for <code>common.fs.content_type</code>.
     */
    public FsRecord setContentType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.content_type</code>.
     */
    public String getContentType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>common.fs.created_on</code>.
     */
    public FsRecord setCreatedOn(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.created_on</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>common.fs.updated_on</code>.
     */
    public FsRecord setUpdatedOn(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.updated_on</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>common.fs.metadata_json</code>.
     */
    public FsRecord setMetadataJson(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.metadata_json</code>.
     */
    public String getMetadataJson() {
        return (String) get(5);
    }

    /**
     * Setter for <code>common.fs.contents</code>.
     */
    public FsRecord setContents(byte... value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>common.fs.contents</code>.
     */
    public byte[] getContents() {
        return (byte[]) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, LocalDateTime, LocalDateTime, String, byte[]> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, LocalDateTime, LocalDateTime, String, byte[]> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Fs.FS.BUCKET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Fs.FS.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Fs.FS.CONTENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Fs.FS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return Fs.FS.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Fs.FS.METADATA_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field7() {
        return Fs.FS.CONTENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getBucket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMetadataJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component7() {
        return getContents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getBucket();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMetadataJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value7() {
        return getContents();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value1(String value) {
        setBucket(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value2(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value3(String value) {
        setContentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value4(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value5(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value6(String value) {
        setMetadataJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord value7(byte... value) {
        setContents(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FsRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5, String value6, byte[] value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FsRecord
     */
    public FsRecord() {
        super(Fs.FS);
    }

    /**
     * Create a detached, initialised FsRecord
     */
    public FsRecord(String bucket, String path, String contentType, LocalDateTime createdOn, LocalDateTime updatedOn, String metadataJson, byte[] contents) {
        super(Fs.FS);

        set(0, bucket);
        set(1, path);
        set(2, contentType);
        set(3, createdOn);
        set(4, updatedOn);
        set(5, metadataJson);
        set(6, contents);
    }
}