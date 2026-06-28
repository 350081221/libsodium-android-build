package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\b\u001a\u00020\u0006H\u0096\u0001J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u0014\u0010\u0019\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/room/QueryInterceptorStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", "bindIndex", "", t0.b.f22420d, "Lkotlin/r2;", "saveArgsToCache", ILivePush.ClickType.CLOSE, "execute", "executeUpdateDelete", "", "executeInsert", "simpleQueryForLong", "", "simpleQueryForString", "index", "bindNull", "bindLong", "", "bindDouble", "bindString", "", "bindBlob", "clearBindings", "delegate", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sqlStatement", "Ljava/lang/String;", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "", "bindArgsCache", "Ljava/util/List;", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$QueryCallback;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {

    @p4.l
    private final List<Object> bindArgsCache;

    @p4.l
    private final SupportSQLiteStatement delegate;

    @p4.l
    private final RoomDatabase.QueryCallback queryCallback;

    @p4.l
    private final Executor queryCallbackExecutor;

    @p4.l
    private final String sqlStatement;

    public QueryInterceptorStatement(@p4.l SupportSQLiteStatement delegate, @p4.l String sqlStatement, @p4.l Executor queryCallbackExecutor, @p4.l RoomDatabase.QueryCallback queryCallback) {
        l0.p(delegate, "delegate");
        l0.p(sqlStatement, "sqlStatement");
        l0.p(queryCallbackExecutor, "queryCallbackExecutor");
        l0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(QueryInterceptorStatement this$0) {
        l0.p(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement this$0) {
        l0.p(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement this$0) {
        l0.p(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void saveArgsToCache(int i5, Object obj) {
        int i6 = i5 - 1;
        if (i6 >= this.bindArgsCache.size()) {
            int size = (i6 - this.bindArgsCache.size()) + 1;
            for (int i7 = 0; i7 < size; i7++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i6, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement this$0) {
        l0.p(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement this$0) {
        l0.p(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, @p4.l byte[] value) {
        l0.p(value, "value");
        saveArgsToCache(i5, value);
        this.delegate.bindBlob(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        saveArgsToCache(i5, Double.valueOf(d5));
        this.delegate.bindDouble(i5, d5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        saveArgsToCache(i5, Long.valueOf(j5));
        this.delegate.bindLong(i5, j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        saveArgsToCache(i5, null);
        this.delegate.bindNull(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, @p4.l String value) {
        l0.p(value, "value");
        saveArgsToCache(i5, value);
        this.delegate.bindString(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.u
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.execute$lambda$0(QueryInterceptorStatement.this);
            }
        });
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.v
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeInsert$lambda$2(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.x
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    @p4.m
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.w
            @Override // java.lang.Runnable
            public final void run() {
                QueryInterceptorStatement.simpleQueryForString$lambda$4(QueryInterceptorStatement.this);
            }
        });
        return this.delegate.simpleQueryForString();
    }
}
