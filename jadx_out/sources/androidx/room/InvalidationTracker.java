package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.collections.a1;
import kotlin.collections.k1;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.text.e0;
import org.apache.http.client.methods.HttpDelete;

@i0(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 v2\u00020\u0001:\u0005vwxyzBX\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020=\u0012\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0A\u0012\u001d\u0010F\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0D¢\u0006\u0002\bE0A\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\bs\u0010tB%\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020=\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\bs\u0010uJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010!\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0017J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0017J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0017J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u0002H\u0017J#\u00101\u001a\u00020\u00022\u0012\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u0010#J;\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u001052\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u000006H\u0017¢\u0006\u0004\b9\u0010:JC\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008\"\u0004\b\u0000\u001052\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010;\u001a\u00020*2\u000e\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u000006H\u0017¢\u0006\u0004\b9\u0010<R\u001a\u0010\u0016\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR+\u0010F\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000b0D¢\u0006\u0002\bE0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010CR&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010IR\"\u0010J\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010NR\u001a\u0010P\u001a\u00020O8GX\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR&\u0010e\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020d0c8\u0000X\u0081\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010mR\u001a\u0010p\u001a\u00020o8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010#¨\u0006{"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Lkotlin/r2;", "onAutoCloseCallback", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "tableId", "stopTrackingTable", "startTrackingTable", "", "", "tableNames", "validateAndResolveTableNames", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "resolveViews", "Landroidx/room/AutoCloser;", "autoCloser", "setAutoCloser$room_runtime_release", "(Landroidx/room/AutoCloser;)V", "setAutoCloser", "database", "internalInit$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "internalInit", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "name", "Landroid/content/Intent;", "serviceIntent", "startMultiInstanceInvalidation$room_runtime_release", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "startMultiInstanceInvalidation", "stopMultiInstanceInvalidation$room_runtime_release", "()V", "stopMultiInstanceInvalidation", "Landroidx/room/InvalidationTracker$Observer;", "observer", "addObserver", "addWeakObserver", "removeObserver", "", "ensureInitialization$room_runtime_release", "()Z", "ensureInitialization", "refreshVersionsAsync", "refreshVersionsSync", "tables", "notifyObserversByTableNames", "([Ljava/lang/String;)V", "syncTriggers$room_runtime_release", "syncTriggers", "T", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "createLiveData", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "Landroidx/room/RoomDatabase;", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "", "shadowTablesMap", "Ljava/util/Map;", "", "Lu3/n;", "viewTables", "tableIdLookup", "getTableIdLookup$room_runtime_release", "()Ljava/util/Map;", "tablesNames", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "Landroidx/room/AutoCloser;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPendingRefresh", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Z", "Landroidx/sqlite/db/SupportSQLiteStatement;", "cleanupStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getCleanupStatement$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "Landroidx/room/InvalidationTracker$ObservedTableTracker;", "observedTableTracker", "Landroidx/room/InvalidationTracker$ObservedTableTracker;", "Landroidx/room/InvalidationLiveDataContainer;", "invalidationLiveDataContainer", "Landroidx/room/InvalidationLiveDataContainer;", "Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/InvalidationTracker$ObserverWrapper;", "observerMap", "Landroidx/arch/core/internal/SafeIterableMap;", "getObserverMap$room_runtime_release", "()Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/MultiInstanceInvalidationClient;", "multiInstanceInvalidationClient", "Landroidx/room/MultiInstanceInvalidationClient;", "syncTriggersLock", "Ljava/lang/Object;", "trackerLock", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@Instrumented
@r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
/* loaded from: classes2.dex */
public class InvalidationTracker {

    @p4.l
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    @p4.l
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";

    @p4.l
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    @p4.l
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    @p4.l
    private static final String TABLE_ID_COLUMN_NAME = "table_id";

    @p4.l
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";

    @p4.m
    private AutoCloser autoCloser;

    @p4.m
    private volatile SupportSQLiteStatement cleanupStatement;

    @p4.l
    private final RoomDatabase database;
    private volatile boolean initialized;

    @p4.l
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;

    @p4.m
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;

    @p4.l
    private final ObservedTableTracker observedTableTracker;

    @p4.l
    @GuardedBy("observerMap")
    private final SafeIterableMap<Observer, ObserverWrapper> observerMap;

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    private final AtomicBoolean pendingRefresh;

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @u3.e
    public final Runnable refreshRunnable;

    @p4.l
    private final Map<String, String> shadowTablesMap;

    @p4.l
    private final Object syncTriggersLock;

    @p4.l
    private final Map<String, Integer> tableIdLookup;

    @p4.l
    private final String[] tablesNames;

    @p4.l
    private final Object trackerLock;

    @p4.l
    private final Map<String, Set<String>> viewTables;

    @p4.l
    public static final Companion Companion = new Companion(null);

    @p4.l
    private static final String[] TRIGGERS = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u0012\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "", "tableName", "triggerType", "getTriggerName$room_runtime_release", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getTriggerName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "database", "Lkotlin/r2;", "beginTransactionInternal$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "beginTransactionInternal", "CREATE_TRACKING_TABLE_SQL", "Ljava/lang/String;", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "()V", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "<init>", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(@p4.l SupportSQLiteDatabase database) {
            l0.p(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        @p4.l
        public final String getTriggerName$room_runtime_release(@p4.l String tableName, @p4.l String triggerType) {
            l0.p(tableName, "tableName");
            l0.p(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003J\u0006\u0010\t\u001a\u00020\bJ\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "", "", "tableIds", "", "onAdded", "onRemoved", "Lkotlin/r2;", "resetTriggerState", "getTablesToSync", "", "tableObservers", "[J", "getTableObservers", "()[J", "", "triggerStates", "[Z", "triggerStateChanges", "[I", "needsSync", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "tableCount", "<init>", "(I)V", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ObservedTableTracker {
        public static final int ADD = 1;

        @p4.l
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;
        private boolean needsSync;

        @p4.l
        private final long[] tableObservers;

        @p4.l
        private final int[] triggerStateChanges;

        @p4.l
        private final boolean[] triggerStates;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "()V", "ADD", "", "NO_OP", "REMOVE", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }
        }

        public ObservedTableTracker(int i5) {
            this.tableObservers = new long[i5];
            this.triggerStates = new boolean[i5];
            this.triggerStateChanges = new int[i5];
        }

        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        @p4.l
        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @u3.h(name = "getTablesToSync")
        @VisibleForTesting
        @p4.m
        public final int[] getTablesToSync() {
            boolean z4;
            synchronized (this) {
                if (!this.needsSync) {
                    return null;
                }
                long[] jArr = this.tableObservers;
                int length = jArr.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i6 + 1;
                    int i8 = 1;
                    if (jArr[i5] > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean[] zArr = this.triggerStates;
                    if (z4 != zArr[i6]) {
                        int[] iArr = this.triggerStateChanges;
                        if (!z4) {
                            i8 = 2;
                        }
                        iArr[i6] = i8;
                    } else {
                        this.triggerStateChanges[i6] = 0;
                    }
                    zArr[i6] = z4;
                    i5++;
                    i6 = i7;
                }
                this.needsSync = false;
                return (int[]) this.triggerStateChanges.clone();
            }
        }

        public final boolean onAdded(@p4.l int... tableIds) {
            boolean z4;
            l0.p(tableIds, "tableIds");
            synchronized (this) {
                z4 = false;
                for (int i5 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j5 = jArr[i5];
                    jArr[i5] = 1 + j5;
                    if (j5 == 0) {
                        z4 = true;
                        this.needsSync = true;
                    }
                }
                r2 r2Var = r2.f19517a;
            }
            return z4;
        }

        public final boolean onRemoved(@p4.l int... tableIds) {
            boolean z4;
            l0.p(tableIds, "tableIds");
            synchronized (this) {
                z4 = false;
                for (int i5 : tableIds) {
                    long[] jArr = this.tableObservers;
                    long j5 = jArr[i5];
                    jArr[i5] = j5 - 1;
                    if (j5 == 1) {
                        z4 = true;
                        this.needsSync = true;
                    }
                }
                r2 r2Var = r2.f19517a;
            }
            return z4;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                r2 r2Var = r2.f19517a;
            }
        }

        public final void setNeedsSync(boolean z4) {
            this.needsSync = z4;
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0014\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0007\"\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&R\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "", "", "tables", "Lkotlin/r2;", "onInvalidated", "", "[Ljava/lang/String;", "getTables$room_runtime_release", "()[Ljava/lang/String;", "", "isRemote$room_runtime_release", "()Z", "isRemote", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static abstract class Observer {

        @p4.l
        private final String[] tables;

        public Observer(@p4.l String[] tables) {
            l0.p(tables, "tables");
            this.tables = tables;
        }

        @p4.l
        public final String[] getTables$room_runtime_release() {
            return this.tables;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@p4.l Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected Observer(@p4.l java.lang.String r3, @p4.l java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.l0.p(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.l0.p(r4, r0)
                java.util.List r0 = kotlin.collections.u.i()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                kotlin.collections.u.p0(r1, r4)
                r0.add(r3)
                java.util.List r3 = kotlin.collections.u.a(r0)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\b\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "", "", "invalidatedTablesIds", "Lkotlin/r2;", "notifyByTableInvalidStatus$room_runtime_release", "(Ljava/util/Set;)V", "notifyByTableInvalidStatus", "", "", "tables", "notifyByTableNames$room_runtime_release", "([Ljava/lang/String;)V", "notifyByTableNames", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "", "tableIds", "[I", "getTableIds$room_runtime_release", "()[I", "tableNames", "[Ljava/lang/String;", "singleTableSet", "Ljava/util/Set;", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ObserverWrapper {

        @p4.l
        private final Observer observer;

        @p4.l
        private final Set<String> singleTableSet;

        @p4.l
        private final int[] tableIds;

        @p4.l
        private final String[] tableNames;

        public ObserverWrapper(@p4.l Observer observer, @p4.l int[] tableIds, @p4.l String[] tableNames) {
            boolean z4;
            Set<String> k5;
            l0.p(observer, "observer");
            l0.p(tableIds, "tableIds");
            l0.p(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            if (tableNames.length == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                k5 = k1.f(tableNames[0]);
            } else {
                k5 = l1.k();
            }
            this.singleTableSet = k5;
            if (tableIds.length == tableNames.length) {
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @p4.l
        public final Observer getObserver$room_runtime_release() {
            return this.observer;
        }

        @p4.l
        public final int[] getTableIds$room_runtime_release() {
            return this.tableIds;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@p4.l Set<Integer> invalidatedTablesIds) {
            Set<String> k5;
            Set d5;
            l0.p(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i5 = 0;
                if (length != 1) {
                    d5 = k1.d();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i6 = 0;
                    while (i5 < length2) {
                        int i7 = i6 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i5]))) {
                            d5.add(this.tableNames[i6]);
                        }
                        i5++;
                        i6 = i7;
                    }
                    k5 = k1.a(d5);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    k5 = this.singleTableSet;
                } else {
                    k5 = l1.k();
                }
            } else {
                k5 = l1.k();
            }
            if (!k5.isEmpty()) {
                this.observer.onInvalidated(k5);
            }
        }

        public final void notifyByTableNames$room_runtime_release(@p4.l String[] tables) {
            Set<String> k5;
            boolean K1;
            Set d5;
            boolean K12;
            l0.p(tables, "tables");
            int length = this.tableNames.length;
            if (length != 0) {
                boolean z4 = false;
                if (length != 1) {
                    d5 = k1.d();
                    for (String str : tables) {
                        for (String str2 : this.tableNames) {
                            K12 = e0.K1(str2, str, true);
                            if (K12) {
                                d5.add(str2);
                            }
                        }
                    }
                    k5 = k1.a(d5);
                } else {
                    int length2 = tables.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        K1 = e0.K1(tables[i5], this.tableNames[0], true);
                        if (K1) {
                            z4 = true;
                            break;
                        }
                        i5++;
                    }
                    if (z4) {
                        k5 = this.singleTableSet;
                    } else {
                        k5 = l1.k();
                    }
                }
            } else {
                k5 = l1.k();
            }
            if (!k5.isEmpty()) {
                this.observer.onInvalidated(k5);
            }
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "", "", "tables", "Lkotlin/r2;", "onInvalidated", "Landroidx/room/InvalidationTracker;", "tracker", "Landroidx/room/InvalidationTracker;", "getTracker", "()Landroidx/room/InvalidationTracker;", "Ljava/lang/ref/WeakReference;", "delegateRef", "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegate", "<init>", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class WeakObserver extends Observer {

        @p4.l
        private final WeakReference<Observer> delegateRef;

        @p4.l
        private final InvalidationTracker tracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(@p4.l InvalidationTracker tracker, @p4.l Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            l0.p(tracker, "tracker");
            l0.p(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @p4.l
        public final WeakReference<Observer> getDelegateRef() {
            return this.delegateRef;
        }

        @p4.l
        public final InvalidationTracker getTracker() {
            return this.tracker;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@p4.l Set<String> tables) {
            l0.p(tables, "tables");
            Observer observer = this.delegateRef.get();
            if (observer == null) {
                this.tracker.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@p4.l RoomDatabase database, @p4.l Map<String, String> shadowTablesMap, @p4.l Map<String, Set<String>> viewTables, @p4.l String... tableNames) {
        Object K;
        String str;
        l0.p(database, "database");
        l0.p(shadowTablesMap, "shadowTablesMap");
        l0.p(viewTables, "viewTables");
        l0.p(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new ObservedTableTracker(tableNames.length);
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.observerMap = new SafeIterableMap<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = tableNames[i5];
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = str2.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i5));
            String str3 = this.shadowTablesMap.get(tableNames[i5]);
            if (str3 != null) {
                l0.o(US, "US");
                str = str3.toLowerCase(US);
                l0.o(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i5] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            l0.o(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String key = entry.getKey();
                l0.o(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                l0.o(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                K = a1.K(map, lowerCase2);
                map.put(lowerCase3, K);
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            private final Set<Integer> checkUpdatedTable() {
                Set d5;
                Set<Integer> a5;
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                d5 = k1.d();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                try {
                    Cursor cursor = query$default;
                    while (cursor.moveToNext()) {
                        d5.add(Integer.valueOf(cursor.getInt(0)));
                    }
                    r2 r2Var = r2.f19517a;
                    kotlin.io.c.a(query$default, null);
                    a5 = k1.a(d5);
                    if (!a5.isEmpty()) {
                        if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() != null) {
                            SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                            if (cleanupStatement$room_runtime_release != null) {
                                cleanupStatement$room_runtime_release.executeUpdateDelete();
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    return a5;
                } finally {
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
            
                if (r0 != null) goto L26;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
            
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
            
                if ((!r3.isEmpty()) == false) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
            
                r0 = r5.this$0.getObserverMap$room_runtime_release();
                r1 = r5.this$0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
            
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
            
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
            
                if (r1.hasNext() == false) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
            
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
            
                r1 = kotlin.r2.f19517a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
            
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
            
                if (r0 == null) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
            
                if (r0 == null) goto L42;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 261
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }
        };
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAutoCloseCallback() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.resetTriggerState();
            SupportSQLiteStatement supportSQLiteStatement = this.cleanupStatement;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                r2 r2Var = r2.f19517a;
            }
        }
    }

    private final String[] resolveViews(String[] strArr) {
        Set d5;
        Set a5;
        d5 = k1.d();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                l0.o(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                l0.m(set);
                d5.addAll(set);
            } else {
                d5.add(str);
            }
        }
        a5 = k1.a(d5);
        return (String[]) a5.toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i5) {
        String str = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i5 + ", 0)";
        boolean z4 = supportSQLiteDatabase instanceof SQLiteDatabase;
        if (!z4) {
            supportSQLiteDatabase.execSQL(str);
        } else {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, str);
        }
        String str2 = this.tablesNames[i5];
        for (String str3 : TRIGGERS) {
            String str4 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str2, str3) + " AFTER " + str3 + " ON `" + str2 + "` BEGIN UPDATE " + UPDATE_TABLE_NAME + " SET " + INVALIDATED_COLUMN_NAME + " = 1 WHERE " + TABLE_ID_COLUMN_NAME + " = " + i5 + " AND " + INVALIDATED_COLUMN_NAME + " = 0; END";
            l0.o(str4, "StringBuilder().apply(builderAction).toString()");
            if (!z4) {
                supportSQLiteDatabase.execSQL(str4);
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, str4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i5) {
        String str = this.tablesNames[i5];
        for (String str2 : TRIGGERS) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            l0.o(str3, "StringBuilder().apply(builderAction).toString()");
            if (!(supportSQLiteDatabase instanceof SQLiteDatabase)) {
                supportSQLiteDatabase.execSQL(str3);
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, str3);
            }
        }
    }

    private final String[] validateAndResolveTableNames(String[] strArr) {
        String[] resolveViews = resolveViews(strArr);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return resolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@p4.l Observer observer) {
        int[] R5;
        ObserverWrapper putIfAbsent;
        l0.p(observer, "observer");
        String[] resolveViews = resolveViews(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(resolveViews.length);
        for (String str : resolveViews) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        R5 = kotlin.collections.e0.R5(arrayList);
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, R5, resolveViews);
        synchronized (this.observerMap) {
            putIfAbsent = this.observerMap.putIfAbsent(observer, observerWrapper);
        }
        if (putIfAbsent == null && this.observedTableTracker.onAdded(Arrays.copyOf(R5, R5.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(@p4.l Observer observer) {
        l0.p(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    @p4.l
    @kotlin.k(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(@p4.l String[] tableNames, @p4.l Callable<T> computeFunction) {
        l0.p(tableNames, "tableNames");
        l0.p(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().getWritableDatabase();
        }
        if (!this.initialized) {
            Log.e(Room.LOG_TAG, "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    @p4.m
    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.cleanupStatement;
    }

    @p4.l
    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.database;
    }

    @p4.l
    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.observerMap;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @p4.l
    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.tableIdLookup;
    }

    @p4.l
    public final String[] getTablesNames$room_runtime_release() {
        return this.tablesNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void internalInit$room_runtime_release(@p4.l SupportSQLiteDatabase database) {
        l0.p(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                Log.e(Room.LOG_TAG, "Invalidation tracker is initialized twice :/.");
                return;
            }
            if (!(database instanceof SQLiteDatabase)) {
                database.execSQL("PRAGMA temp_store = MEMORY;");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, "PRAGMA temp_store = MEMORY;");
            }
            if (!(database instanceof SQLiteDatabase)) {
                database.execSQL("PRAGMA recursive_triggers='ON';");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, "PRAGMA recursive_triggers='ON';");
            }
            if (!(database instanceof SQLiteDatabase)) {
                database.execSQL(CREATE_TRACKING_TABLE_SQL);
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, CREATE_TRACKING_TABLE_SQL);
            }
            syncTriggers$room_runtime_release(database);
            this.cleanupStatement = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.initialized = true;
            r2 r2Var = r2.f19517a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyObserversByTableNames(@p4.l String... tables) {
        l0.p(tables, "tables");
        synchronized (this.observerMap) {
            Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                l0.o(entry, "(observer, wrapper)");
                Observer observer = (Observer) entry.getKey();
                ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                if (!observer.isRemote$room_runtime_release()) {
                    observerWrapper.notifyByTableNames$room_runtime_release(tables);
                }
            }
            r2 r2Var = r2.f19517a;
        }
    }

    public void refreshVersionsAsync() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.autoCloser;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@p4.l Observer observer) {
        ObserverWrapper remove;
        l0.p(observer, "observer");
        synchronized (this.observerMap) {
            remove = this.observerMap.remove(observer);
        }
        if (remove != null) {
            ObservedTableTracker observedTableTracker = this.observedTableTracker;
            int[] tableIds$room_runtime_release = remove.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@p4.l AutoCloser autoCloser) {
        l0.p(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: androidx.room.c
            @Override // java.lang.Runnable
            public final void run() {
                InvalidationTracker.this.onAutoCloseCallback();
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(@p4.m SupportSQLiteStatement supportSQLiteStatement) {
        this.cleanupStatement = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@p4.l Context context, @p4.l String name, @p4.l Intent serviceIntent) {
        l0.p(context, "context");
        l0.p(name, "name");
        l0.p(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.multiInstanceInvalidationClient = null;
    }

    public final void syncTriggers$room_runtime_release(@p4.l SupportSQLiteDatabase database) {
        l0.p(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] tablesToSync = this.observedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        return;
                    }
                    Companion.beginTransactionInternal$room_runtime_release(database);
                    try {
                        int length = tablesToSync.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            int i7 = tablesToSync[i5];
                            int i8 = i6 + 1;
                            if (i7 == 1) {
                                startTrackingTable(database, i6);
                            } else if (i7 == 2) {
                                stopTrackingTable(database, i6);
                            }
                            i5++;
                            i6 = i8;
                        }
                        database.setTransactionSuccessful();
                        database.endTransaction();
                        r2 r2Var = r2.f19517a;
                    } catch (Throwable th) {
                        database.endTransaction();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e5) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e5);
        } catch (IllegalStateException e6) {
            Log.e(Room.LOG_TAG, "Cannot run invalidation tracker. Is the db closed?", e6);
        }
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(@p4.l String[] tableNames, boolean z4, @p4.l Callable<T> computeFunction) {
        l0.p(tableNames, "tableNames");
        l0.p(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.create(validateAndResolveTableNames(tableNames), z4, computeFunction);
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.database.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.database.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InvalidationTracker(@p4.l androidx.room.RoomDatabase r4, @p4.l java.lang.String... r5) {
        /*
            r3 = this;
            java.lang.String r0 = "database"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.l0.p(r5, r0)
            java.util.Map r0 = kotlin.collections.x0.z()
            java.util.Map r1 = kotlin.collections.x0.z()
            int r2 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r3.<init>(r4, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.<init>(androidx.room.RoomDatabase, java.lang.String[]):void");
    }
}
