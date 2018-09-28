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

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>common</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CACHE_TEST_DUMMY_PRIMARY = Indexes0.CACHE_TEST_DUMMY_PRIMARY;
    public static final Index CREDENTIAL_PRIMARY = Indexes0.CREDENTIAL_PRIMARY;
    public static final Index FS_PRIMARY = Indexes0.FS_PRIMARY;
    public static final Index LATENCY_STATE_PRIMARY = Indexes0.LATENCY_STATE_PRIMARY;
    public static final Index MTURK_HIT_TYPE_IDS_ID = Indexes0.MTURK_HIT_TYPE_IDS_ID;
    public static final Index MTURK_HIT_TYPE_IDS_PRIMARY = Indexes0.MTURK_HIT_TYPE_IDS_PRIMARY;
    public static final Index SENTENCE_PRIMARY = Indexes0.SENTENCE_PRIMARY;
    public static final Index SENTENCE_SENTENCE__CONVERSATION_ID_INDEX = Indexes0.SENTENCE_SENTENCE__CONVERSATION_ID_INDEX;
    public static final Index SENTENCE_SENTENCE__DATE_ADDED = Indexes0.SENTENCE_SENTENCE__DATE_ADDED;
    public static final Index SQL_LOCK_PRIMARY = Indexes0.SQL_LOCK_PRIMARY;
    public static final Index TIMING_PRIMARY = Indexes0.TIMING_PRIMARY;
    public static final Index VARIABLE_KEY = Indexes0.VARIABLE_KEY;
    public static final Index VARIABLE_PRIMARY = Indexes0.VARIABLE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CACHE_TEST_DUMMY_PRIMARY = Internal.createIndex("PRIMARY", CacheTestDummy.CACHE_TEST_DUMMY, new OrderField[] { CacheTestDummy.CACHE_TEST_DUMMY.ID }, true);
        public static Index CREDENTIAL_PRIMARY = Internal.createIndex("PRIMARY", Credential.CREDENTIAL, new OrderField[] { Credential.CREDENTIAL.KEY }, true);
        public static Index FS_PRIMARY = Internal.createIndex("PRIMARY", Fs.FS, new OrderField[] { Fs.FS.BUCKET, Fs.FS.PATH }, true);
        public static Index LATENCY_STATE_PRIMARY = Internal.createIndex("PRIMARY", LatencyState.LATENCY_STATE, new OrderField[] { LatencyState.LATENCY_STATE.TIMESTAMP }, true);
        public static Index MTURK_HIT_TYPE_IDS_ID = Internal.createIndex("id", MturkHitTypeIds.MTURK_HIT_TYPE_IDS, new OrderField[] { MturkHitTypeIds.MTURK_HIT_TYPE_IDS.ID }, true);
        public static Index MTURK_HIT_TYPE_IDS_PRIMARY = Internal.createIndex("PRIMARY", MturkHitTypeIds.MTURK_HIT_TYPE_IDS, new OrderField[] { MturkHitTypeIds.MTURK_HIT_TYPE_IDS.ID }, true);
        public static Index SENTENCE_PRIMARY = Internal.createIndex("PRIMARY", Sentence.SENTENCE, new OrderField[] { Sentence.SENTENCE.ID }, true);
        public static Index SENTENCE_SENTENCE__CONVERSATION_ID_INDEX = Internal.createIndex("sentence__conversation_id_index", Sentence.SENTENCE, new OrderField[] { Sentence.SENTENCE.CONVERSATION_ID, Sentence.SENTENCE.CONVERSATION_INDEX }, false);
        public static Index SENTENCE_SENTENCE__DATE_ADDED = Internal.createIndex("sentence__date_added", Sentence.SENTENCE, new OrderField[] { Sentence.SENTENCE.DATE_ADDED }, false);
        public static Index SQL_LOCK_PRIMARY = Internal.createIndex("PRIMARY", SqlLock.SQL_LOCK, new OrderField[] { SqlLock.SQL_LOCK.LOCK_NAME }, true);
        public static Index TIMING_PRIMARY = Internal.createIndex("PRIMARY", Timing.TIMING, new OrderField[] { Timing.TIMING.ID }, true);
        public static Index VARIABLE_KEY = Internal.createIndex("key", Variable.VARIABLE, new OrderField[] { Variable.VARIABLE.KEY }, true);
        public static Index VARIABLE_PRIMARY = Internal.createIndex("PRIMARY", Variable.VARIABLE, new OrderField[] { Variable.VARIABLE.KEY }, true);
    }
}