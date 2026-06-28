package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.huawei.hms.actions.SearchIntents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.i0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.x0;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001e\u001f B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018¨\u0006!"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "", "enabled", "Lkotlin/r2;", "setWriteAheadLoggingEnabled", ILivePush.ClickType.CLOSE, "delegate", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "KeepAliveCursor", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @p4.l
    @u3.e
    public final AutoCloser autoCloser;

    @p4.l
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;

    @p4.l
    private final SupportSQLiteOpenHelper delegate;

    @i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bW\u0010XJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J)\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00042\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001dH\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017J \u0010%\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016J5\u0010(\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00042\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H\u0016¢\u0006\u0004\b(\u0010)JE\u0010*\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\u00042\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J)\u0010,\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020!H\u0016J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u00020!H\u0016J\u0010\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0010H\u0017J\b\u00107\u001a\u00020\u0010H\u0016J\b\u00108\u001a\u00020\u0002H\u0016J\b\u00109\u001a\u00020\u0002H\u0016R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010?\u001a\u00020!2\u0006\u0010?\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER$\u0010J\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010E\"\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010>R\u0014\u0010L\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010>R\u0016\u0010O\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010>R(\u0010U\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040R\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010>¨\u0006Y"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Lkotlin/r2;", "pokeOpen", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "beginTransactionWithListener", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "yieldIfContendedSafely", "", "sleepAfterYieldDelayMillis", "numBytes", "setMaximumSize", SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "", "", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "cancellationSignal", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "insert", "whereClause", "whereArgs", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "setMaxSqlCacheSize", "enabled", "setForeignKeyConstraintsEnabled", "enableWriteAheadLogging", "disableWriteAheadLogging", ILivePush.ClickType.CLOSE, "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "isDbLockedByCurrentThread", "()Z", "version", "getVersion", "()I", "setVersion", "(I)V", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", ClientCookie.PATH_ATTR, "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "<init>", "(Landroidx/room/AutoCloser;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {

        @p4.l
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(@p4.l AutoCloser autoCloser) {
            l0.p(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(@p4.l SQLiteTransactionListener transactionListener) {
            l0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(@p4.l SQLiteTransactionListener transactionListener) {
            l0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.l
        public SupportSQLiteStatement compileStatement(@p4.l String sql) {
            l0.p(sql, "sql");
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(@p4.l String table, @p4.m String str, @p4.m Object[] objArr) {
            l0.p(table, "table");
            return ((Number) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1(table, str, objArr))).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() != null) {
                try {
                    SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
                    l0.m(delegateDatabase$room_runtime_release);
                    delegateDatabase$room_runtime_release.endTransaction();
                    return;
                } finally {
                    this.autoCloser.decrementCountAndScheduleClose();
                }
            }
            throw new IllegalStateException("End transaction called but delegateDb is null".toString());
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@p4.l String sql) throws SQLException {
            l0.p(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1(sql));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.m
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1.INSTANCE);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new g1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
                @p4.m
                public Object get(@p4.m Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new x0() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.x0, kotlin.reflect.q
                @p4.m
                public Object get(@p4.m Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.x0, kotlin.reflect.l
                public void set(@p4.m Object obj, @p4.m Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.m
        public String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1.INSTANCE);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new x0() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.x0, kotlin.reflect.q
                @p4.m
                public Object get(@p4.m Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.x0, kotlin.reflect.l
                public void set(@p4.m Object obj, @p4.m Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(@p4.l String table, int i5, @p4.l ContentValues values) throws SQLException {
            l0.p(table, "table");
            l0.p(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1(table, i5, values))).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase$room_runtime_release() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new g1() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
                @p4.m
                public Object get(@p4.m Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release == null) {
                return false;
            }
            return delegateDatabase$room_runtime_release.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(int i5) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1(i5))).booleanValue();
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1.INSTANCE);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.l
        public Cursor query(@p4.l String query) {
            l0.p(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(boolean z4) {
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1(z4));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(@p4.l Locale locale) {
            l0.p(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1(locale));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(int i5) {
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1(i5));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(long j5) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1(j5))).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(long j5) {
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2(j5));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            r2 r2Var;
            SupportSQLiteDatabase delegateDatabase$room_runtime_release = this.autoCloser.getDelegateDatabase$room_runtime_release();
            if (delegateDatabase$room_runtime_release != null) {
                delegateDatabase$room_runtime_release.setTransactionSuccessful();
                r2Var = r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var != null) {
            } else {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(int i5) {
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2(i5));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(@p4.l String table, int i5, @p4.l ContentValues values, @p4.m String str, @p4.m Object[] objArr) {
            l0.p(table, "table");
            l0.p(values, "values");
            return ((Number) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1(table, i5, values, str, objArr))).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(@p4.l String sql, @p4.l Object[] bindArgs) throws SQLException {
            l0.p(sql, "sql");
            l0.p(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2(sql, bindArgs));
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j5) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.l
        public Cursor query(@p4.l String query, @p4.l Object[] bindArgs) {
            l0.p(query, "query");
            l0.p(bindArgs, "bindArgs");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.l
        public Cursor query(@p4.l SupportSQLiteQuery query) {
            l0.p(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        @p4.l
        @RequiresApi(api = 24)
        public Cursor query(@p4.l SupportSQLiteQuery query, @p4.m CancellationSignal cancellationSignal) {
            l0.p(query, "query");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010*J)\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0015H\u0016J\u0018\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\f0%j\n\u0012\u0006\u0012\u0004\u0018\u00010\f`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "T", "Lkotlin/Function1;", "block", "executeSqliteStatementWithRefCount", "(Lv3/l;)Ljava/lang/Object;", "supportSQLiteStatement", "Lkotlin/r2;", "doBinds", "", "bindIndex", "", t0.b.f22420d, "saveBinds", ILivePush.ClickType.CLOSE, "execute", "executeUpdateDelete", "", "executeInsert", "simpleQueryForLong", "", "simpleQueryForString", "index", "bindNull", "bindLong", "", "bindDouble", "bindString", "", "bindBlob", "clearBindings", "sql", "Ljava/lang/String;", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "binds", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Landroidx/room/AutoCloser;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nAutoClosingRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,571:1\n1864#2,3:572\n*S KotlinDebug\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n*L\n478#1:572,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class AutoClosingSupportSqliteStatement implements SupportSQLiteStatement {

        @p4.l
        private final AutoCloser autoCloser;

        @p4.l
        private final ArrayList<Object> binds;

        @p4.l
        private final String sql;

        public AutoClosingSupportSqliteStatement(@p4.l String sql, @p4.l AutoCloser autoCloser) {
            l0.p(sql, "sql");
            l0.p(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(SupportSQLiteStatement supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.w.W();
                }
                Object obj = this.binds.get(i5);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i6);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i6, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i6, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i6, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i6, (byte[]) obj);
                }
                i5 = i6;
            }
        }

        private final <T> T executeSqliteStatementWithRefCount(v3.l<? super SupportSQLiteStatement, ? extends T> lVar) {
            return (T) this.autoCloser.executeRefCountingFunction(new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1(this, lVar));
        }

        private final void saveBinds(int i5, Object obj) {
            int size;
            int i6 = i5 - 1;
            if (i6 >= this.binds.size() && (size = this.binds.size()) <= i6) {
                while (true) {
                    this.binds.add(null);
                    if (size == i6) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i6, obj);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int i5, @p4.l byte[] value) {
            l0.p(value, "value");
            saveBinds(i5, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int i5, double d5) {
            saveBinds(i5, Double.valueOf(d5));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int i5, long j5) {
            saveBinds(i5, Long.valueOf(j5));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int i5) {
            saveBinds(i5, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int i5, @p4.l String value) {
            l0.p(value, "value");
            saveBinds(i5, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
            this.binds.clear();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1.INSTANCE);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((Number) executeSqliteStatementWithRefCount(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((Number) executeSqliteStatementWithRefCount(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1.INSTANCE)).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((Number) executeSqliteStatementWithRefCount(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1.INSTANCE)).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        @p4.m
        public String simpleQueryForString() {
            return (String) executeSqliteStatementWithRefCount(AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1.INSTANCE);
        }
    }

    @i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010E\u001a\u00020\u0001\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bJ\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0096\u0001J\t\u0010\t\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\n0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\f\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\r0\rH\u0096\u0001J\u0019\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u0012\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\r0\r \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\r0\r\u0018\u00010\u00110\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\r0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010$\u001a\u00020#H\u0096\u0001J\t\u0010%\u001a\u00020#H\u0096\u0001J\t\u0010&\u001a\u00020#H\u0096\u0001J\t\u0010'\u001a\u00020#H\u0096\u0001J\t\u0010(\u001a\u00020#H\u0096\u0001J\t\u0010)\u001a\u00020#H\u0096\u0001J\u0011\u0010*\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010+\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u0010,\u001a\u00020#H\u0096\u0001J\t\u0010-\u001a\u00020#H\u0096\u0001J\t\u0010.\u001a\u00020#H\u0096\u0001J\u0011\u0010/\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\t\u00100\u001a\u00020#H\u0096\u0001J\u0019\u00102\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u00104\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\t\u00105\u001a\u00020#H\u0097\u0001J!\u00106\u001a\n \u0005*\u0004\u0018\u00010\u00170\u00172\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J)\u00109\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u000107072\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010808H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010101H\u0096\u0001J\u0019\u0010;\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010303H\u0096\u0001J\b\u0010<\u001a\u00020\u0007H\u0016J\u001e\u0010@\u001a\u00020\u00072\u0006\u0010=\u001a\u0002072\f\u0010?\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\b\u0010A\u001a\u000208H\u0017J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u0002080>H\u0017J\u0010\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u0017H\u0017R\u0014\u0010E\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "Lkotlin/r2;", "copyStringToBuffer", "deactivate", "", "getBlob", "getColumnCount", "", "getColumnIndex", "getColumnIndexOrThrow", "getColumnName", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "Landroid/os/Bundle;", "getExtras", "", "getFloat", "getInt", "", "getLong", "getPosition", "", "getShort", "getString", "getType", "", "getWantsAllOnMoveCalls", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "requery", "respond", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "unregisterContentObserver", "unregisterDataSetObserver", ILivePush.ClickType.CLOSE, "cr", "", "uris", "setNotificationUris", "getNotificationUri", "getNotificationUris", "extras", "setExtras", "delegate", "Landroid/database/Cursor;", "Landroidx/room/AutoCloser;", "autoCloser", "Landroidx/room/AutoCloser;", "<init>", "(Landroid/database/Cursor;Landroidx/room/AutoCloser;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    private static final class KeepAliveCursor implements Cursor {

        @p4.l
        private final AutoCloser autoCloser;

        @p4.l
        private final Cursor delegate;

        public KeepAliveCursor(@p4.l Cursor delegate, @p4.l AutoCloser autoCloser) {
            l0.p(delegate, "delegate");
            l0.p(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i5, CharArrayBuffer charArrayBuffer) {
            this.delegate.copyStringToBuffer(i5, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i5) {
            return this.delegate.getBlob(i5);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.delegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.delegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i5) {
            return this.delegate.getColumnName(i5);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i5) {
            return this.delegate.getDouble(i5);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i5) {
            return this.delegate.getFloat(i5);
        }

        @Override // android.database.Cursor
        public int getInt(int i5) {
            return this.delegate.getInt(i5);
        }

        @Override // android.database.Cursor
        public long getLong(int i5) {
            return this.delegate.getLong(i5);
        }

        @Override // android.database.Cursor
        @p4.l
        @RequiresApi(api = 19)
        public Uri getNotificationUri() {
            return SupportSQLiteCompat.Api19Impl.getNotificationUri(this.delegate);
        }

        @Override // android.database.Cursor
        @p4.l
        @RequiresApi(api = 29)
        public List<Uri> getNotificationUris() {
            return SupportSQLiteCompat.Api29Impl.getNotificationUris(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i5) {
            return this.delegate.getShort(i5);
        }

        @Override // android.database.Cursor
        public String getString(int i5) {
            return this.delegate.getString(i5);
        }

        @Override // android.database.Cursor
        public int getType(int i5) {
            return this.delegate.getType(i5);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i5) {
            return this.delegate.isNull(i5);
        }

        @Override // android.database.Cursor
        public boolean move(int i5) {
            return this.delegate.move(i5);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i5) {
            return this.delegate.moveToPosition(i5);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.delegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.delegate.respond(bundle);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 23)
        public void setExtras(@p4.l Bundle extras) {
            l0.p(extras, "extras");
            SupportSQLiteCompat.Api23Impl.setExtras(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.delegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        public void setNotificationUris(@p4.l ContentResolver cr, @p4.l List<? extends Uri> uris) {
            l0.p(cr, "cr");
            l0.p(uris, "uris");
            SupportSQLiteCompat.Api29Impl.setNotificationUris(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.delegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.delegate.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public AutoClosingRoomOpenHelper(@p4.l SupportSQLiteOpenHelper delegate, @p4.l AutoCloser autoCloser) {
        l0.p(delegate, "delegate");
        l0.p(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.m
    public String getDatabaseName() {
        return this.delegate.getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @p4.l
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.l
    @RequiresApi(api = 24)
    public SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.l
    @RequiresApi(api = 24)
    public SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z4) {
        this.delegate.setWriteAheadLoggingEnabled(z4);
    }
}
