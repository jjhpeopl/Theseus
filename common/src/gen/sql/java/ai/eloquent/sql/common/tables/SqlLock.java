/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common.tables;


import ai.eloquent.sql.common.Common;
import ai.eloquent.sql.common.Indexes;
import ai.eloquent.sql.common.Keys;
import ai.eloquent.sql.common.tables.records.SqlLockRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class SqlLock extends TableImpl<SqlLockRecord> {

    private static final long serialVersionUID = -566758075;

    /**
     * The reference instance of <code>common.sql_lock</code>
     */
    public static final SqlLock SQL_LOCK = new SqlLock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SqlLockRecord> getRecordType() {
        return SqlLockRecord.class;
    }

    /**
     * The column <code>common.sql_lock.lock_name</code>.
     */
    public final TableField<SqlLockRecord, String> LOCK_NAME = createField("lock_name", org.jooq.impl.SQLDataType.VARCHAR(127).nullable(false), this, "");

    /**
     * The column <code>common.sql_lock.host</code>.
     */
    public final TableField<SqlLockRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>common.sql_lock.expire_at</code>.
     */
    public final TableField<SqlLockRecord, LocalDateTime> EXPIRE_AT = createField("expire_at", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>common.sql_lock</code> table reference
     */
    public SqlLock() {
        this(DSL.name("sql_lock"), null);
    }

    /**
     * Create an aliased <code>common.sql_lock</code> table reference
     */
    public SqlLock(String alias) {
        this(DSL.name(alias), SQL_LOCK);
    }

    /**
     * Create an aliased <code>common.sql_lock</code> table reference
     */
    public SqlLock(Name alias) {
        this(alias, SQL_LOCK);
    }

    private SqlLock(Name alias, Table<SqlLockRecord> aliased) {
        this(alias, aliased, null);
    }

    private SqlLock(Name alias, Table<SqlLockRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Common.COMMON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SQL_LOCK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SqlLockRecord> getPrimaryKey() {
        return Keys.KEY_SQL_LOCK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SqlLockRecord>> getKeys() {
        return Arrays.<UniqueKey<SqlLockRecord>>asList(Keys.KEY_SQL_LOCK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLock as(String alias) {
        return new SqlLock(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlLock as(Name alias) {
        return new SqlLock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlLock rename(String name) {
        return new SqlLock(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SqlLock rename(Name name) {
        return new SqlLock(name, null);
    }
}
