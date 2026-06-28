package androidx.sqlite.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.huawei.hms.actions.SearchIntents;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&J-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0016\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H&J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H&J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H&¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001eH&J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH'J \u0010&\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H&J5\u0010)\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H&¢\u0006\u0004\b)\u0010*JE\u0010+\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u00022\u0012\u0010(\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0014H&¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u0010-\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0016\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014H&¢\u0006\u0004\b-\u0010\u0018J\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\"H&J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H&J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\"H&J\u0010\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000fH'J\b\u00107\u001a\u00020\u000fH&J\b\u00108\u001a\u00020\u0006H'R\u0014\u00109\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010:R\u001c\u0010@\u001a\u00020\"8&@&X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001c\u0010G\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010B\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010:R\u0014\u0010I\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010:R\u0016\u0010L\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010:R(\u0010R\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020O\u0018\u00010N8fX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010:ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006TÀ\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "Lkotlin/r2;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "", "", "bindArgs", "execPerConnectionSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "numBytes", "setMaximumSize", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "newVersion", "needUpgrade", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "enabled", "setForeignKeyConstraintsEnabled", "enableWriteAheadLogging", "disableWriteAheadLogging", "isDbLockedByCurrentThread", "()Z", "isExecPerConnectionSQLSupported", "getVersion", "()I", "setVersion", "(I)V", "version", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "sqlite_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionWithListener(@l SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransactionWithListenerNonExclusive(@l SQLiteTransactionListener sQLiteTransactionListener);

    @l
    SupportSQLiteStatement compileStatement(@l String str);

    int delete(@l String str, @m String str2, @m Object[] objArr);

    @RequiresApi(api = 16)
    void disableWriteAheadLogging();

    boolean enableWriteAheadLogging();

    void endTransaction();

    default void execPerConnectionSQL(@l String sql, @SuppressLint({"ArrayReturn"}) @m Object[] objArr) {
        l0.p(sql, "sql");
        throw new UnsupportedOperationException();
    }

    void execSQL(@l String str) throws SQLException;

    void execSQL(@l String str, @l Object[] objArr) throws SQLException;

    @m
    List<Pair<String, String>> getAttachedDbs();

    long getMaximumSize();

    long getPageSize();

    @m
    String getPath();

    int getVersion();

    boolean inTransaction();

    long insert(@l String str, int i5, @l ContentValues contentValues) throws SQLException;

    boolean isDatabaseIntegrityOk();

    boolean isDbLockedByCurrentThread();

    default boolean isExecPerConnectionSQLSupported() {
        return false;
    }

    boolean isOpen();

    boolean isReadOnly();

    @RequiresApi(api = 16)
    boolean isWriteAheadLoggingEnabled();

    boolean needUpgrade(int i5);

    @l
    Cursor query(@l SupportSQLiteQuery supportSQLiteQuery);

    @l
    @RequiresApi(api = 16)
    Cursor query(@l SupportSQLiteQuery supportSQLiteQuery, @m CancellationSignal cancellationSignal);

    @l
    Cursor query(@l String str);

    @l
    Cursor query(@l String str, @l Object[] objArr);

    @RequiresApi(api = 16)
    void setForeignKeyConstraintsEnabled(boolean z4);

    void setLocale(@l Locale locale);

    void setMaxSqlCacheSize(int i5);

    long setMaximumSize(long j5);

    void setPageSize(long j5);

    void setTransactionSuccessful();

    void setVersion(int i5);

    int update(@l String str, int i5, @l ContentValues contentValues, @m String str2, @m Object[] objArr);

    boolean yieldIfContendedSafely();

    boolean yieldIfContendedSafely(long j5);
}
