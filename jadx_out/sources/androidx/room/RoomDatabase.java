package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.hms.actions.SearchIntents;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.b1;
import kotlin.collections.a1;
import kotlin.collections.l1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b&\u0018\u0000 {2\u00020\u0001:\t|}{~\u007f\u0080\u0001\u0081\u0001B\u0007¢\u0006\u0004\bz\u0010DJ-\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u001a\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0003\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0013H$J\b\u0010\u001f\u001a\u00020\u001eH$J\"\u0010 \u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00190\u0016H\u0015J\u0016\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u00030!H\u0017J\b\u0010#\u001a\u00020\tH'J\b\u0010$\u001a\u00020\tH\u0016J\b\u0010%\u001a\u00020\tH\u0017J\b\u0010&\u001a\u00020\tH\u0017J+\u0010(\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010,J\u001c\u0010(\u001a\u00020+2\u0006\u0010(\u001a\u00020-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.H\u0017J\u0010\u00102\u001a\u0002012\u0006\u00100\u001a\u00020'H\u0016J\b\u00103\u001a\u00020\tH\u0017J\b\u00104\u001a\u00020\tH\u0017J\b\u00105\u001a\u00020\tH\u0017J\u0010\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0016J#\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001092\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000:H\u0016¢\u0006\u0004\b8\u0010;J\u0010\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020<H\u0014J\b\u0010@\u001a\u00020?H\u0016R\u001e\u0010A\u001a\u0004\u0018\u00010<8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010GR\u0016\u0010I\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR$\u0010S\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u00198\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010DRR\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0003\u0012\u0004\u0012\u00020\u00170V2\u001a\u0010W\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0003\u0012\u0004\u0012\u00020\u00170V8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c8G¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR#\u0010i\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00010V8G¢\u0006\f\n\u0004\bi\u0010X\u001a\u0004\bj\u0010ZR$\u0010k\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010XR\u0014\u0010n\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010mR\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020?8VX\u0096\u0004¢\u0006\f\u0012\u0004\bu\u0010D\u001a\u0004\bs\u0010tR\u0017\u0010v\u001a\u00020?8G¢\u0006\f\u0012\u0004\bw\u0010D\u001a\u0004\bv\u0010tR\u0014\u0010y\u001a\u00020?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bx\u0010t¨\u0006\u0082\u0001"}, d2 = {"Landroidx/room/RoomDatabase;", "", "T", "Ljava/lang/Class;", "clazz", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Ljava/lang/Object;", "Lkotlin/r2;", "internalBeginTransaction", "internalEndTransaction", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/DatabaseConfiguration;", "configuration", "init", "", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "", "Landroidx/room/migration/Migration;", "getAutoMigrations", "config", "createOpenHelper", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "getRequiredTypeConverters", "", "getRequiredAutoMigrationSpecs", "clearAllTables", ILivePush.ClickType.CLOSE, "assertNotMainThread", "assertNotSuspendingTransaction", "", SearchIntents.EXTRA_QUERY, "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "signal", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "internalInitInvalidationTracker", "", "inTransaction", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "()V", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "Landroidx/room/RoomDatabase$Callback;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "()Ljava/util/Map;", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "isOpen", "()Z", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "isMainThread$room_runtime_release", "isMainThread", "<init>", "Companion", "Builder", "Callback", "JournalMode", "MigrationContainer", "PrepackagedDatabaseCallback", "QueryCallback", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
/* loaded from: classes2.dex */
public abstract class RoomDatabase {

    @p4.l
    public static final Companion Companion = new Companion(null);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @p4.m
    private AutoCloser autoCloser;

    @p4.l
    private final Map<String, Object> backingFieldMap;
    private SupportSQLiteOpenHelper internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p4.m
    @u3.e
    protected List<? extends Callback> mCallbacks;

    @p4.m
    @u3.e
    protected volatile SupportSQLiteDatabase mDatabase;

    @p4.l
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @p4.l
    private final InvalidationTracker invalidationTracker = createInvalidationTracker();

    @p4.l
    private Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs = new LinkedHashMap();

    @p4.l
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @p4.l
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    @i0(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0016\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00104\u001a\u00020\u0014H\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00106\u001a\u00020\u0016H\u0016J'\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020:09\"\u00020:H\u0016¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010=\u001a\u00020\u0003H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\r\u0010>\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020\tH\u0016J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u00106\u001a\u00020*H\u0017J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u00020\u0019H\u0016J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u00020\u00192\u0006\u00106\u001a\u00020*H\u0017J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0017J$\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u00020*H\u0017J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010I\u001a\u00020J\"\u00020%H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010P\u001a\u00020(H\u0017J\u001e\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010R\u001a\u00020.H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020.H\u0016J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010R\u001a\u00020.H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "klass", "Ljava/lang/Class;", "name", "", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "allowDestructiveMigrationOnDowngrade", "", "allowMainThreadQueries", "autoCloseTimeUnit", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeout", "", "autoMigrationSpecs", "", "Landroidx/room/migration/AutoMigrationSpec;", "callbacks", "Landroidx/room/RoomDatabase$Callback;", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "factory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationStartAndEndVersions", "", "", "migrationsNotRequiredFrom", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "queryExecutor", "requireMigration", "transactionExecutor", "typeConverters", "addAutoMigrationSpec", "autoMigrationSpec", "addCallback", "callback", "addMigrations", "migrations", "", "Landroidx/room/migration/Migration;", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "addTypeConverter", "typeConverter", "build", "()Landroidx/room/RoomDatabase;", "createFromAsset", "databaseFilePath", "createFromFile", "databaseFile", "createFromInputStream", "inputStreamCallable", "enableMultiInstanceInvalidation", "fallbackToDestructiveMigration", "fallbackToDestructiveMigrationFrom", "startVersions", "", "fallbackToDestructiveMigrationOnDowngrade", "openHelperFactory", "setAutoCloseTimeout", "setJournalMode", "setMultiInstanceInvalidationServiceIntent", "invalidationServiceIntent", "setQueryCallback", "executor", "setQueryExecutor", "setTransactionExecutor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    /* loaded from: classes2.dex */
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;

        @p4.m
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;

        @p4.l
        private List<AutoMigrationSpec> autoMigrationSpecs;

        @p4.l
        private final List<Callback> callbacks;

        @p4.l
        private final Context context;

        @p4.m
        private String copyFromAssetPath;

        @p4.m
        private File copyFromFile;

        @p4.m
        private Callable<InputStream> copyFromInputStream;

        @p4.m
        private SupportSQLiteOpenHelper.Factory factory;

        @p4.l
        private JournalMode journalMode;

        @p4.l
        private final Class<T> klass;

        @p4.l
        private final MigrationContainer migrationContainer;

        @p4.m
        private Set<Integer> migrationStartAndEndVersions;

        @p4.l
        private Set<Integer> migrationsNotRequiredFrom;

        @p4.m
        private Intent multiInstanceInvalidationIntent;

        @p4.m
        private final String name;

        @p4.m
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;

        @p4.m
        private QueryCallback queryCallback;

        @p4.m
        private Executor queryCallbackExecutor;

        @p4.m
        private Executor queryExecutor;
        private boolean requireMigration;

        @p4.m
        private Executor transactionExecutor;

        @p4.l
        private final List<Object> typeConverters;

        public Builder(@p4.l Context context, @p4.l Class<T> klass, @p4.m String str) {
            l0.p(context, "context");
            l0.p(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @p4.l
        public Builder<T> addAutoMigrationSpec(@p4.l AutoMigrationSpec autoMigrationSpec) {
            l0.p(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @p4.l
        public Builder<T> addCallback(@p4.l Callback callback) {
            l0.p(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @p4.l
        public Builder<T> addMigrations(@p4.l Migration... migrations) {
            l0.p(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (Migration migration : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                l0.m(set);
                set.add(Integer.valueOf(migration.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                l0.m(set2);
                set2.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @p4.l
        public Builder<T> addTypeConverter(@p4.l Object typeConverter) {
            l0.p(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @p4.l
        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @p4.l
        public T build() {
            SupportSQLiteOpenHelper.Factory factory;
            int i5;
            int i6;
            int i7;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            boolean z4 = true;
            if (set != null) {
                l0.m(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!(!this.migrationsNotRequiredFrom.contains(Integer.valueOf(intValue)))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue).toString());
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory factory2 = this.factory;
            if (factory2 == null) {
                factory2 = new FrameworkSQLiteOpenHelperFactory();
            }
            if (factory2 != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name != null) {
                        long j5 = this.autoCloseTimeout;
                        TimeUnit timeUnit = this.autoCloseTimeUnit;
                        if (timeUnit != null) {
                            Executor executor2 = this.queryExecutor;
                            if (executor2 != null) {
                                factory2 = new AutoClosingRoomOpenHelperFactory(factory2, new AutoCloser(j5, timeUnit, executor2));
                            } else {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name != null) {
                        if (str == null) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        File file = this.copyFromFile;
                        if (file == null) {
                            i6 = 0;
                        } else {
                            i6 = 1;
                        }
                        Callable<InputStream> callable = this.copyFromInputStream;
                        if (callable == null) {
                            i7 = 0;
                        } else {
                            i7 = 1;
                        }
                        if (i5 + i6 + i7 != 1) {
                            z4 = false;
                        }
                        if (z4) {
                            factory2 = new SQLiteCopyOpenHelperFactory(str, file, callable, factory2);
                        } else {
                            throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                }
            } else {
                factory2 = null;
            }
            if (factory2 != null) {
                QueryCallback queryCallback = this.queryCallback;
                if (queryCallback != null) {
                    Executor executor3 = this.queryCallbackExecutor;
                    if (executor3 != null) {
                        if (queryCallback != null) {
                            factory = new QueryInterceptorOpenHelperFactory(factory2, executor3, queryCallback);
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    factory = factory2;
                }
                Context context = this.context;
                String str2 = this.name;
                MigrationContainer migrationContainer = this.migrationContainer;
                List<Callback> list = this.callbacks;
                boolean z5 = this.allowMainThreadQueries;
                JournalMode resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
                Executor executor4 = this.queryExecutor;
                if (executor4 != null) {
                    Executor executor5 = this.transactionExecutor;
                    if (executor5 != null) {
                        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z5, resolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
                        T t5 = (T) Room.getGeneratedImplementation(this.klass, "_Impl");
                        t5.init(databaseConfiguration);
                        return t5;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @p4.l
        public Builder<T> createFromAsset(@p4.l String databaseFilePath) {
            l0.p(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @p4.l
        public Builder<T> createFromFile(@p4.l File databaseFile) {
            l0.p(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @p4.l
        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromInputStream(@p4.l Callable<InputStream> inputStreamCallable) {
            l0.p(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @p4.l
        public Builder<T> enableMultiInstanceInvalidation() {
            Intent intent;
            if (this.name != null) {
                intent = new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class);
            } else {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        @p4.l
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @p4.l
        public Builder<T> fallbackToDestructiveMigrationFrom(@p4.l int... startVersions) {
            l0.p(startVersions, "startVersions");
            for (int i5 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i5));
            }
            return this;
        }

        @p4.l
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @p4.l
        public Builder<T> openHelperFactory(@p4.m SupportSQLiteOpenHelper.Factory factory) {
            this.factory = factory;
            return this;
        }

        @p4.l
        @ExperimentalRoomApi
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long j5, @p4.l TimeUnit autoCloseTimeUnit) {
            boolean z4;
            l0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (j5 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.autoCloseTimeout = j5;
                this.autoCloseTimeUnit = autoCloseTimeUnit;
                return this;
            }
            throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
        }

        @p4.l
        public Builder<T> setJournalMode(@p4.l JournalMode journalMode) {
            l0.p(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @p4.l
        @ExperimentalRoomApi
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@p4.l Intent invalidationServiceIntent) {
            l0.p(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @p4.l
        public Builder<T> setQueryCallback(@p4.l QueryCallback queryCallback, @p4.l Executor executor) {
            l0.p(queryCallback, "queryCallback");
            l0.p(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        @p4.l
        public Builder<T> setQueryExecutor(@p4.l Executor executor) {
            l0.p(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        @p4.l
        public Builder<T> setTransactionExecutor(@p4.l Executor executor) {
            l0.p(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }

        @p4.l
        @SuppressLint({"BuilderSetStyle"})
        public Builder<T> createFromAsset(@p4.l String databaseFilePath, @p4.l PrepackagedDatabaseCallback callback) {
            l0.p(databaseFilePath, "databaseFilePath");
            l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @p4.l
        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public Builder<T> createFromFile(@p4.l File databaseFile, @p4.l PrepackagedDatabaseCallback callback) {
            l0.p(databaseFile, "databaseFile");
            l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @p4.l
        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public Builder<T> createFromInputStream(@p4.l Callable<InputStream> inputStreamCallable, @p4.l PrepackagedDatabaseCallback callback) {
            l0.p(inputStreamCallable, "inputStreamCallable");
            l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "onCreate", "onOpen", "onDestructiveMigration", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static abstract class Callback {
        public void onCreate(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        public void onDestructiveMigration(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        public void onOpen(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }
    }

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomDatabase$Companion;", "", "()V", "MAX_BIND_PARAMETER_CNT", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "(Ljava/lang/String;I)V", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "resolve", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "resolve$room_runtime_release", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return SupportSQLiteCompat.Api19Impl.isLowRamDevice(activityManager);
        }

        @p4.l
        public final JournalMode resolve$room_runtime_release(@p4.l Context context) {
            ActivityManager activityManager;
            l0.p(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "Lkotlin/r2;", "onOpenPrepackagedDatabase", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@p4.l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }
    }

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "", "sqlQuery", "", "bindArgs", "Lkotlin/r2;", "onQuery", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public interface QueryCallback {
        void onQuery(@p4.l String str, @p4.l List<? extends Object> list);
    }

    public RoomDatabase() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        l0.o(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @kotlin.k(message = "Will be hidden in a future release.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @kotlin.k(message = "Will be hidden in the next release.")
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        getInvalidationTracker().syncTriggers$room_runtime_release(writableDatabase);
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (!inTransaction()) {
            getInvalidationTracker().refreshVersionsAsync();
        }
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i5 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> cls, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (cls.isInstance(supportSQLiteOpenHelper)) {
            return supportSQLiteOpenHelper;
        }
        if (supportSQLiteOpenHelper instanceof DelegatingOpenHelper) {
            return (T) unwrapOpenHelper(cls, ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate());
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (this.allowMainThreadQueries || (!isMainThread$room_runtime_release())) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!(inTransaction() || this.suspendingTransactionId.get() == null)) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    @kotlin.k(message = "beginTransaction() is deprecated", replaceWith = @b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$beginTransaction$1(this));
        }
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            l0.o(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().stopMultiInstanceInvalidation$room_runtime_release();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @p4.l
    public SupportSQLiteStatement compileStatement(@p4.l String sql) {
        l0.p(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @p4.l
    protected abstract InvalidationTracker createInvalidationTracker();

    @p4.l
    protected abstract SupportSQLiteOpenHelper createOpenHelper(@p4.l DatabaseConfiguration databaseConfiguration);

    @kotlin.k(message = "endTransaction() is deprecated", replaceWith = @b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new RoomDatabase$endTransaction$1(this));
        }
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @p4.l
    @u3.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public List<Migration> getAutoMigrations(@p4.l Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        List<Migration> E;
        l0.p(autoMigrationSpecs, "autoMigrationSpecs");
        E = kotlin.collections.w.E();
        return E;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @p4.l
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        l0.o(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @p4.l
    public InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @p4.l
    public SupportSQLiteOpenHelper getOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.internalOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        l0.S("internalOpenHelper");
        return null;
    }

    @p4.l
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        l0.S("internalQueryExecutor");
        return null;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        Set<Class<? extends AutoMigrationSpec>> k5;
        k5 = l1.k();
        return k5;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        Map<Class<?>, List<Class<?>>> z4;
        z4 = a1.z();
        return z4;
    }

    @p4.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @p4.l
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        l0.S("internalTransactionExecutor");
        return null;
    }

    @p4.m
    public <T> T getTypeConverter(@p4.l Class<T> klass) {
        l0.p(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@p4.l DatabaseConfiguration configuration) {
        boolean z4;
        boolean z5;
        l0.p(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends AutoMigrationSpec>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            boolean z6 = true;
            int i5 = -1;
            if (it.hasNext()) {
                Class<? extends AutoMigrationSpec> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i6 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i5 = size;
                            break;
                        } else if (i6 < 0) {
                            break;
                        } else {
                            size = i6;
                        }
                    }
                }
                if (i5 < 0) {
                    z6 = false;
                }
                if (z6) {
                    this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i5));
                } else {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i7 = size2 - 1;
                        if (bitSet.get(size2)) {
                            if (i7 < 0) {
                                break;
                            } else {
                                size2 = i7;
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                        }
                    }
                }
                for (Migration migration : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.contains(migration.startVersion, migration.endVersion)) {
                        configuration.migrationContainer.addMigrations(migration);
                    }
                }
                SQLiteCopyOpenHelper sQLiteCopyOpenHelper = (SQLiteCopyOpenHelper) unwrapOpenHelper(SQLiteCopyOpenHelper.class, getOpenHelper());
                if (sQLiteCopyOpenHelper != null) {
                    sQLiteCopyOpenHelper.setDatabaseConfiguration(configuration);
                }
                AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) unwrapOpenHelper(AutoClosingRoomOpenHelper.class, getOpenHelper());
                if (autoClosingRoomOpenHelper != null) {
                    this.autoCloser = autoClosingRoomOpenHelper.autoCloser;
                    getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.autoCloser);
                }
                if (configuration.journalMode == JournalMode.WRITE_AHEAD_LOGGING) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                getOpenHelper().setWriteAheadLoggingEnabled(z4);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z4;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name != null) {
                        getInvalidationTracker().startMultiInstanceInvalidation$room_runtime_release(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i8 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i8 < 0) {
                                    break;
                                } else {
                                    size3 = i8;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 >= 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                        } else {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i9 = size4 - 1;
                    if (bitSet2.get(size4)) {
                        if (i9 >= 0) {
                            size4 = i9;
                        } else {
                            return;
                        }
                    } else {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void internalInitInvalidationTracker(@p4.l SupportSQLiteDatabase db) {
        l0.p(db, "db");
        getInvalidationTracker().internalInit$room_runtime_release(db);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            isOpen = autoCloser.isActive();
        } else {
            SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
            if (supportSQLiteDatabase == null) {
                bool = null;
                return l0.g(bool, Boolean.TRUE);
            }
            isOpen = supportSQLiteDatabase.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return l0.g(bool, Boolean.TRUE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.mDatabase;
        return supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen();
    }

    @p4.l
    @u3.i
    public final Cursor query(@p4.l SupportSQLiteQuery query) {
        l0.p(query, "query");
        return query$default(this, query, null, 2, null);
    }

    @p4.l
    public Cursor query(@p4.l String query, @p4.m Object[] objArr) {
        l0.p(query, "query");
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, objArr));
    }

    public void runInTransaction(@p4.l Runnable body) {
        l0.p(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected final void setAutoMigrationSpecs(@p4.l Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        l0.p(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @kotlin.k(message = "setTransactionSuccessful() is deprecated", replaceWith = @b1(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    @p4.l
    @u3.i
    public Cursor query(@p4.l SupportSQLiteQuery query, @p4.m CancellationSignal cancellationSignal) {
        l0.p(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (cancellationSignal != null) {
            return getOpenHelper().getWritableDatabase().query(query, cancellationSignal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }

    @i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J#\u0010\u0011\u001a\u00020\u00042\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000f\"\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016J \u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00130\u0013H\u0016J \u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nR,\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "Landroidx/room/migration/Migration;", "migration", "Lkotlin/r2;", "addMigration", "", "result", "", "upgrade", "", "start", "end", "", "findUpMigrationPath", "", "migrations", "addMigrations", "([Landroidx/room/migration/Migration;)V", "", "getMigrations", "findMigrationPath", "startVersion", "endVersion", "contains", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    /* loaded from: classes2.dex */
    public static class MigrationContainer {

        @p4.l
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        private final void addMigration(Migration migration) {
            int i5 = migration.startVersion;
            int i6 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i5);
            TreeMap<Integer, Migration> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i6))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i6)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i6), migration);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r6 <= r12) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
        
            if (r6 < r11) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r9, boolean r10, int r11, int r12) {
            /*
                r8 = this;
            L0:
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L7
                if (r11 >= r12) goto Lb
                goto L9
            L7:
                if (r11 <= r12) goto Lb
            L9:
                r2 = r0
                goto Lc
            Lb:
                r2 = r1
            Lc:
                if (r2 == 0) goto L6e
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r2 = r8.migrations
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                r3 = 0
                if (r2 != 0) goto L1e
                return r3
            L1e:
                if (r10 == 0) goto L25
                java.util.NavigableSet r4 = r2.descendingKeySet()
                goto L29
            L25:
                java.util.Set r4 = r2.keySet()
            L29:
                java.util.Iterator r4 = r4.iterator()
            L2d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L6a
                java.lang.Object r5 = r4.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                java.lang.String r6 = "targetVersion"
                if (r10 == 0) goto L4b
                int r7 = r11 + 1
                kotlin.jvm.internal.l0.o(r5, r6)
                int r6 = r5.intValue()
                if (r7 > r6) goto L58
                if (r6 > r12) goto L58
                goto L56
            L4b:
                kotlin.jvm.internal.l0.o(r5, r6)
                int r6 = r5.intValue()
                if (r12 > r6) goto L58
                if (r6 >= r11) goto L58
            L56:
                r6 = r0
                goto L59
            L58:
                r6 = r1
            L59:
                if (r6 == 0) goto L2d
                java.lang.Object r11 = r2.get(r5)
                kotlin.jvm.internal.l0.m(r11)
                r9.add(r11)
                int r11 = r5.intValue()
                goto L6b
            L6a:
                r0 = r1
            L6b:
                if (r0 != 0) goto L0
                return r3
            L6e:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.MigrationContainer.findUpMigrationPath(java.util.List, boolean, int, int):java.util.List");
        }

        public void addMigrations(@p4.l List<? extends Migration> migrations) {
            l0.p(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i5, int i6) {
            Map<Integer, Map<Integer, Migration>> migrations = getMigrations();
            if (migrations.containsKey(Integer.valueOf(i5))) {
                Map<Integer, Migration> map = migrations.get(Integer.valueOf(i5));
                if (map == null) {
                    map = a1.z();
                }
                return map.containsKey(Integer.valueOf(i6));
            }
            return false;
        }

        @p4.m
        public List<Migration> findMigrationPath(int i5, int i6) {
            boolean z4;
            List<Migration> E;
            if (i5 == i6) {
                E = kotlin.collections.w.E();
                return E;
            }
            if (i6 > i5) {
                z4 = true;
            } else {
                z4 = false;
            }
            return findUpMigrationPath(new ArrayList(), z4, i5, i6);
        }

        @p4.l
        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public void addMigrations(@p4.l Migration... migrations) {
            l0.p(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    public <V> V runInTransaction(@p4.l Callable<V> body) {
        l0.p(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
