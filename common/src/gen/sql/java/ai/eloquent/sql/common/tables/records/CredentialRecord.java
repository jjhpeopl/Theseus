/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables.records;


import ai.eloquent.sql.common.tables.Credential;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class CredentialRecord extends UpdatableRecordImpl<CredentialRecord> implements Record2<String, byte[]> {

    private static final long serialVersionUID = -634198069;

    /**
     * Setter for <code>common.credential.key</code>.
     */
    public CredentialRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>common.credential.key</code>.
     */
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>common.credential.value</code>.
     */
    public CredentialRecord setValue(byte... value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>common.credential.value</code>.
     */
    public byte[] getValue() {
        return (byte[]) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, byte[]> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, byte[]> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Credential.CREDENTIAL.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field2() {
        return Credential.CREDENTIAL.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value2() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CredentialRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CredentialRecord value2(byte... value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CredentialRecord values(String value1, byte[] value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CredentialRecord
     */
    public CredentialRecord() {
        super(Credential.CREDENTIAL);
    }

    /**
     * Create a detached, initialised CredentialRecord
     */
    public CredentialRecord(String key, byte[] value) {
        super(Credential.CREDENTIAL);

        set(0, key);
        set(1, value);
    }
}