package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.actions.SearchIntents;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.collections.b0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.apache.http.cookie.ClientCookie;

@i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010:\u001a\u00020\u0001\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010@\u001a\u00020?¢\u0006\u0004\b]\u0010^J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u000eH\u0096\u0001J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0097\u0001J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0096\u0001JF\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\u0010\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0016J\b\u00101\u001a\u00020\u0002H\u0016J\b\u00102\u001a\u00020\u0002H\u0016J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u0004H\u0016J)\u00103\u001a\u0002042\u0006\u00103\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b3\u00105J\u0010\u00103\u001a\u0002042\u0006\u00103\u001a\u000206H\u0016J\u001a\u00103\u001a\u0002042\u0006\u00103\u001a\u0002062\b\u00108\u001a\u0004\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J)\u00109\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b9\u0010\u0013R\u0014\u0010:\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR(\u0010F\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040C\u0018\u00010B8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010HR\u0014\u0010J\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010K\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010HR\u0014\u0010L\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010HR\u0014\u0010M\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010HR\u0014\u0010P\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001c\u0010T\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bQ\u0010O\"\u0004\bR\u0010SR\u0016\u0010W\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\\\u001a\u00020\n8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Landroidx/room/QueryInterceptorDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "", "table", "whereClause", "", "", "whereArgs", "", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "", "enableWriteAheadLogging", "sql", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "inTransaction", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "insert", "newVersion", "needUpgrade", "enabled", "setForeignKeyConstraintsEnabled", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "numBytes", "setMaximumSize", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "execSQL", "delegate", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "()Z", "isDbLockedByCurrentThread", "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "getVersion", "()I", "setVersion", "(I)V", "version", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
@Instrumented
@r1({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
/* loaded from: classes2.dex */
public final class QueryInterceptorDatabase implements SupportSQLiteDatabase {

    @p4.l
    private final SupportSQLiteDatabase delegate;

    @p4.l
    private final RoomDatabase.QueryCallback queryCallback;

    @p4.l
    private final Executor queryCallbackExecutor;

    public QueryInterceptorDatabase(@p4.l SupportSQLiteDatabase delegate, @p4.l Executor queryCallbackExecutor, @p4.l RoomDatabase.QueryCallback queryCallback) {
        l0.p(delegate, "delegate");
        l0.p(queryCallbackExecutor, "queryCallbackExecutor");
        l0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransaction$lambda$0(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListener$lambda$2(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("BEGIN DEFERRED TRANSACTION", E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endTransaction$lambda$4(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("END TRANSACTION", E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$10(QueryInterceptorDatabase this$0, String sql) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        l0.p(sql, "$sql");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery(sql, E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execSQL$lambda$12(QueryInterceptorDatabase this$0, String sql, List inputArguments) {
        l0.p(this$0, "this$0");
        l0.p(sql, "$sql");
        l0.p(inputArguments, "$inputArguments");
        this$0.queryCallback.onQuery(sql, inputArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$6(QueryInterceptorDatabase this$0, String query) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        l0.p(query, "$query");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery(query, E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$7(QueryInterceptorDatabase this$0, String query, Object[] bindArgs) {
        List<? extends Object> Jy;
        l0.p(this$0, "this$0");
        l0.p(query, "$query");
        l0.p(bindArgs, "$bindArgs");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        Jy = kotlin.collections.p.Jy(bindArgs);
        queryCallback.onQuery(query, Jy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$8(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        l0.p(this$0, "this$0");
        l0.p(query, "$query");
        l0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void query$lambda$9(QueryInterceptorDatabase this$0, SupportSQLiteQuery query, QueryInterceptorProgram queryInterceptorProgram) {
        l0.p(this$0, "this$0");
        l0.p(query, "$query");
        l0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.onQuery(query.getSql(), queryInterceptorProgram.getBindArgsCache$room_runtime_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransactionSuccessful$lambda$5(QueryInterceptorDatabase this$0) {
        List<? extends Object> E;
        l0.p(this$0, "this$0");
        RoomDatabase.QueryCallback queryCallback = this$0.queryCallback;
        E = kotlin.collections.w.E();
        queryCallback.onQuery("TRANSACTION SUCCESSFUL", E);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.o
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransaction$lambda$0(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.g
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@p4.l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.i
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@p4.l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.m
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.l
    public SupportSQLiteStatement compileStatement(@p4.l String sql) {
        l0.p(sql, "sql");
        return new QueryInterceptorStatement(this.delegate.compileStatement(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@p4.l String table, @p4.m String str, @p4.m Object[] objArr) {
        l0.p(table, "table");
        return this.delegate.delete(table, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.endTransaction$lambda$4(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@p4.l String sql, @SuppressLint({"ArrayReturn"}) @p4.m Object[] objArr) {
        l0.p(sql, "sql");
        this.delegate.execPerConnectionSQL(sql, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@p4.l final String sql) {
        l0.p(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.h
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$10(QueryInterceptorDatabase.this, sql);
            }
        });
        SupportSQLiteDatabase supportSQLiteDatabase = this.delegate;
        if (supportSQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, sql);
        } else {
            supportSQLiteDatabase.execSQL(sql);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.m
    public List<Pair<String, String>> getAttachedDbs() {
        return this.delegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.delegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.m
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(@p4.l String table, int i5, @p4.l ContentValues values) {
        l0.p(table, "table");
        l0.p(values, "values");
        return this.delegate.insert(table, i5, values);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return this.delegate.isExecPerConnectionSQLSupported();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i5) {
        return this.delegate.needUpgrade(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.l
    public Cursor query(@p4.l final String query) {
        l0.p(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$6(QueryInterceptorDatabase.this, query);
            }
        });
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z4) {
        this.delegate.setForeignKeyConstraintsEnabled(z4);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@p4.l Locale locale) {
        l0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i5) {
        this.delegate.setMaxSqlCacheSize(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j5) {
        return this.delegate.setMaximumSize(j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j5) {
        this.delegate.setPageSize(j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.l
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(QueryInterceptorDatabase.this);
            }
        });
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i5) {
        this.delegate.setVersion(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@p4.l String table, int i5, @p4.l ContentValues values, @p4.m String str, @p4.m Object[] objArr) {
        l0.p(table, "table");
        l0.p(values, "values");
        return this.delegate.update(table, i5, values, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j5) {
        return this.delegate.yieldIfContendedSafely(j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@p4.l final String sql, @p4.l Object[] bindArgs) {
        List i5;
        final List a5;
        l0.p(sql, "sql");
        l0.p(bindArgs, "bindArgs");
        i5 = kotlin.collections.v.i();
        b0.p0(i5, bindArgs);
        a5 = kotlin.collections.v.a(i5);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.s
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.execSQL$lambda$12(QueryInterceptorDatabase.this, sql, a5);
            }
        });
        SupportSQLiteDatabase supportSQLiteDatabase = this.delegate;
        Object[] array = a5.toArray(new Object[0]);
        if (supportSQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, sql, array);
        } else {
            supportSQLiteDatabase.execSQL(sql, array);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.l
    public Cursor query(@p4.l final String query, @p4.l final Object[] bindArgs) {
        l0.p(query, "query");
        l0.p(bindArgs, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.k
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$7(QueryInterceptorDatabase.this, query, bindArgs);
            }
        });
        return this.delegate.query(query, bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.l
    public Cursor query(@p4.l final SupportSQLiteQuery query) {
        l0.p(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.n
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$8(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @p4.l
    public Cursor query(@p4.l final SupportSQLiteQuery query, @p4.m CancellationSignal cancellationSignal) {
        l0.p(query, "query");
        final QueryInterceptorProgram queryInterceptorProgram = new QueryInterceptorProgram();
        query.bindTo(queryInterceptorProgram);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.j
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorDatabase.query$lambda$9(QueryInterceptorDatabase.this, query, queryInterceptorProgram);
            }
        });
        return this.delegate.query(query);
    }
}
