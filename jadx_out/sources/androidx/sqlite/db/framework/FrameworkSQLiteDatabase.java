package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.huawei.hms.actions.SearchIntents;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0002^]B\u000f\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\b[\u0010\\J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001eH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017J \u0010&\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016J5\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016H\u0016¢\u0006\u0004\b-\u0010\u001aJ\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\"H\u0016J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\"H\u0016J\u0010\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000fH\u0017J\b\u00107\u001a\u00020\u000fH\u0016J\b\u00108\u001a\u00020\u0006H\u0017J\b\u00109\u001a\u00020\u0006H\u0016J\u000e\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R$\u0010F\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010J\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\b\u0015\u0010IR\u0014\u0010K\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010@R$\u0010N\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010H\"\u0004\bM\u0010IR\u0014\u0010O\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010@R\u0014\u0010P\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010@R\u0016\u0010S\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010@R(\u0010Y\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020V\u0018\u00010U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010@¨\u0006_"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "Lkotlin/r2;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "numBytes", "setMaximumSize", "", "", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "newVersion", "needUpgrade", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "enabled", "setForeignKeyConstraintsEnabled", "enableWriteAheadLogging", "disableWriteAheadLogging", ILivePush.ClickType.CLOSE, "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "isDelegate", "delegate", "Landroid/database/sqlite/SQLiteDatabase;", "isDbLockedByCurrentThread", "()Z", t0.b.f22420d, "getVersion", "()I", "setVersion", "(I)V", "version", "getMaximumSize", "()J", "(J)V", "maximumSize", "isExecPerConnectionSQLSupported", "getPageSize", "setPageSize", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Companion", "Api30Impl", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
@Instrumented
@r1({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
/* loaded from: classes2.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    @l
    private final SQLiteDatabase delegate;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    @l
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Api30Impl;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "Lkotlin/r2;", "execPerConnectionSQL", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(30)
    /* loaded from: classes2.dex */
    public static final class Api30Impl {

        @l
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        public final void execPerConnectionSQL(@l SQLiteDatabase sQLiteDatabase, @l String sql, @m Object[] objArr) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            l0.p(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, objArr);
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$Companion;", "", "()V", "CONFLICT_VALUES", "", "", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public FrameworkSQLiteDatabase(@l SQLiteDatabase delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$0(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l0.p(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor query$lambda$1(SupportSQLiteQuery query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l0.p(query, "$query");
        l0.m(sQLiteQuery);
        query.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(@l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(@l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public SupportSQLiteStatement compileStatement(@l String sql) {
        l0.p(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        l0.o(compileStatement, "delegate.compileStatement(sql)");
        return new FrameworkSQLiteStatement(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(@l String table, @m String str, @m Object[] objArr) {
        boolean z4;
        l0.p(table, "table");
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(table);
        if (str != null && str.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            sb.append(" WHERE ");
            sb.append(str);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        SupportSQLiteStatement compileStatement = compileStatement(sb2);
        SimpleSQLiteQuery.Companion.bind(compileStatement, objArr);
        return compileStatement.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void disableWriteAheadLogging() {
        SupportSQLiteCompat.Api16Impl.disableWriteAheadLogging(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execPerConnectionSQL(@l String sql, @m Object[] objArr) {
        l0.p(sql, "sql");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            Api30Impl.INSTANCE.execPerConnectionSQL(this.delegate, sql, objArr);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@l String sql) throws SQLException {
        l0.p(sql, "sql");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, sql);
        } else {
            sQLiteDatabase.execSQL(sql);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @m
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
    @m
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
    public long insert(@l String table, int i5, @l ContentValues values) throws SQLException {
        l0.p(table, "table");
        l0.p(values, "values");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
            return sQLiteDatabase.insertWithOnConflict(table, null, values, i5);
        }
        return SQLiteInstrumentation.insertWithOnConflict(sQLiteDatabase, table, null, values, i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    public final boolean isDelegate(@l SQLiteDatabase sqLiteDatabase) {
        l0.p(sqLiteDatabase, "sqLiteDatabase");
        return l0.g(this.delegate, sqLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isExecPerConnectionSQLSupported() {
        return Build.VERSION.SDK_INT >= 30;
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
        return SupportSQLiteCompat.Api16Impl.isWriteAheadLoggingEnabled(this.delegate);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i5) {
        return this.delegate.needUpgrade(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor query(@l String query) {
        l0.p(query, "query");
        return query(new SimpleSQLiteQuery(query));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @RequiresApi(api = 16)
    public void setForeignKeyConstraintsEnabled(boolean z4) {
        SupportSQLiteCompat.Api16Impl.setForeignKeyConstraintsEnabled(this.delegate, z4);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(@l Locale locale) {
        l0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i5) {
        this.delegate.setMaxSqlCacheSize(i5);
    }

    /* renamed from: setMaximumSize, reason: collision with other method in class */
    public void m6418setMaximumSize(long j5) {
        this.delegate.setMaximumSize(j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j5) {
        this.delegate.setPageSize(j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i5) {
        this.delegate.setVersion(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(@l String table, int i5, @l ContentValues values, @m String str, @m Object[] objArr) {
        boolean z4;
        int length;
        String str2;
        l0.p(table, "table");
        l0.p(values, "values");
        int i6 = 0;
        if (values.size() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int size = values.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(CONFLICT_VALUES[i5]);
            sb.append(table);
            sb.append(" SET ");
            for (String str3 : values.keySet()) {
                if (i6 > 0) {
                    str2 = ",";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(str3);
                objArr2[i6] = values.get(str3);
                sb.append("=?");
                i6++;
            }
            if (objArr != null) {
                for (int i7 = size; i7 < length; i7++) {
                    objArr2[i7] = objArr[i7 - size];
                }
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append(" WHERE ");
                sb.append(str);
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            SupportSQLiteStatement compileStatement = compileStatement(sb2);
            SimpleSQLiteQuery.Companion.bind(compileStatement, objArr2);
            return compileStatement.executeUpdateDelete();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(@l String sql, @l Object[] bindArgs) throws SQLException {
        l0.p(sql, "sql");
        l0.p(bindArgs, "bindArgs");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.execSQL(sQLiteDatabase, sql, bindArgs);
        } else {
            sQLiteDatabase.execSQL(sql, bindArgs);
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor query(@l String query, @l Object[] bindArgs) {
        l0.p(query, "query");
        l0.p(bindArgs, "bindArgs");
        return query(new SimpleSQLiteQuery(query, bindArgs));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j5) {
        this.delegate.setMaximumSize(j5);
        return this.delegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j5) {
        return this.delegate.yieldIfContendedSafely(j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    public Cursor query(@l SupportSQLiteQuery query) {
        l0.p(query, "query");
        final FrameworkSQLiteDatabase$query$cursorFactory$1 frameworkSQLiteDatabase$query$cursorFactory$1 = new FrameworkSQLiteDatabase$query$cursorFactory$1(query);
        SQLiteDatabase sQLiteDatabase = this.delegate;
        SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$0;
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0(r.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$0;
            }
        };
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        Cursor rawQueryWithFactory = !(sQLiteDatabase instanceof SQLiteDatabase) ? sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, strArr, null) : SQLiteInstrumentation.rawQueryWithFactory(sQLiteDatabase, cursorFactory, sql, strArr, null);
        l0.o(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    @l
    @RequiresApi(16)
    public Cursor query(@l final SupportSQLiteQuery query, @m CancellationSignal cancellationSignal) {
        l0.p(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String sql = query.getSql();
        String[] strArr = EMPTY_STRING_ARRAY;
        l0.m(cancellationSignal);
        return SupportSQLiteCompat.Api16Impl.rawQueryWithFactory(sQLiteDatabase, sql, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor query$lambda$1;
                query$lambda$1 = FrameworkSQLiteDatabase.query$lambda$1(SupportSQLiteQuery.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return query$lambda$1;
            }
        });
    }
}
