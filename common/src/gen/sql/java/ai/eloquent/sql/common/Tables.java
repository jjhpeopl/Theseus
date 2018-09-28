/*
 * This file is generated by jOOQ.
*/
package ai.eloquent.sql.common;


import ai.eloquent.sql.common.tables.CacheTestDummy;
import ai.eloquent.sql.common.tables.Credential;
import ai.eloquent.sql.common.tables.Fs;
import ai.eloquent.sql.common.tables.LatencyState;
import ai.eloquent.sql.common.tables.MturkHitTypeIds;
import ai.eloquent.sql.common.tables.Sentence;
import ai.eloquent.sql.common.tables.SqlLock;
import ai.eloquent.sql.common.tables.Timing;
import ai.eloquent.sql.common.tables.Variable;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in common
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>common.cache_test_dummy</code>.
     */
    public static final CacheTestDummy CACHE_TEST_DUMMY = ai.eloquent.sql.common.tables.CacheTestDummy.CACHE_TEST_DUMMY;

    /**
     * The table <code>common.credential</code>.
     */
    public static final Credential CREDENTIAL = ai.eloquent.sql.common.tables.Credential.CREDENTIAL;

    /**
     * The table <code>common.fs</code>.
     */
    public static final Fs FS = ai.eloquent.sql.common.tables.Fs.FS;

    /**
     * The table <code>common.latency_state</code>.
     */
    public static final LatencyState LATENCY_STATE = ai.eloquent.sql.common.tables.LatencyState.LATENCY_STATE;

    /**
     * The table <code>common.mturk_hit_type_ids</code>.
     */
    public static final MturkHitTypeIds MTURK_HIT_TYPE_IDS = ai.eloquent.sql.common.tables.MturkHitTypeIds.MTURK_HIT_TYPE_IDS;

    /**
     * The table <code>common.sentence</code>.
     */
    public static final Sentence SENTENCE = ai.eloquent.sql.common.tables.Sentence.SENTENCE;

    /**
     * The table <code>common.sql_lock</code>.
     */
    public static final SqlLock SQL_LOCK = ai.eloquent.sql.common.tables.SqlLock.SQL_LOCK;

    /**
     * The table <code>common.timing</code>.
     */
    public static final Timing TIMING = ai.eloquent.sql.common.tables.Timing.TIMING;

    /**
     * The table <code>common.variable</code>.
     */
    public static final Variable VARIABLE = ai.eloquent.sql.common.tables.Variable.VARIABLE;
}