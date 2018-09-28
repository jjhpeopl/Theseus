/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables.records;


import ai.eloquent.sql.common.tables.LatencyState;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class LatencyStateRecord extends UpdatableRecordImpl<LatencyStateRecord> implements Record3<LocalDateTime, Long, Integer> {

    private static final long serialVersionUID = 2094853659;

    /**
     * Setter for <code>common.latency_state.timestamp</code>.
     */
    public LatencyStateRecord setTimestamp(LocalDateTime value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>common.latency_state.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(0);
    }

    /**
     * Setter for <code>common.latency_state.latency</code>.
     */
    public LatencyStateRecord setLatency(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>common.latency_state.latency</code>.
     */
    public Long getLatency() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>common.latency_state.onlineWorkers</code>.
     */
    public LatencyStateRecord setOnlineworkers(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>common.latency_state.onlineWorkers</code>.
     */
    public Integer getOnlineworkers() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<LocalDateTime> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<LocalDateTime, Long, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<LocalDateTime, Long, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field1() {
        return LatencyState.LATENCY_STATE.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return LatencyState.LATENCY_STATE.LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LatencyState.LATENCY_STATE.ONLINEWORKERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component1() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getOnlineworkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value1() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOnlineworkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatencyStateRecord value1(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatencyStateRecord value2(Long value) {
        setLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatencyStateRecord value3(Integer value) {
        setOnlineworkers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatencyStateRecord values(LocalDateTime value1, Long value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LatencyStateRecord
     */
    public LatencyStateRecord() {
        super(LatencyState.LATENCY_STATE);
    }

    /**
     * Create a detached, initialised LatencyStateRecord
     */
    public LatencyStateRecord(LocalDateTime timestamp, Long latency, Integer onlineworkers) {
        super(LatencyState.LATENCY_STATE);

        set(0, timestamp);
        set(1, latency);
        set(2, onlineworkers);
    }
}