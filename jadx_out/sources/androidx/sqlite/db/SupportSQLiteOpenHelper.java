package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0006\u001a\u00020\u0004H&R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "", "enabled", "Lkotlin/r2;", "setWriteAheadLoggingEnabled", ILivePush.ClickType.CLOSE, "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Callback", "Configuration", "Factory", "sqlite_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "", TTDownloadField.TT_FILE_NAME, "Lkotlin/r2;", "deleteDatabaseFile", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "onConfigure", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "onDowngrade", "onOpen", "onCorruption", "version", "I", "<init>", "(I)V", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSupportSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,426:1\n1#2:427\n1855#3,2:428\n107#4:430\n79#4,22:431\n*S KotlinDebug\n*F\n+ 1 SupportSQLiteOpenHelper.kt\nandroidx/sqlite/db/SupportSQLiteOpenHelper$Callback\n*L\n243#1:428,2\n251#1:430\n251#1:431,22\n*E\n"})
    /* loaded from: classes2.dex */
    public static abstract class Callback {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final String TAG = "SupportSQLite";

        @e
        public final int version;

        @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback$Companion;", "", "()V", "TAG", "", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }
        }

        public Callback(int i5) {
            this.version = i5;
        }

        private final void deleteDatabaseFile(String str) {
            boolean K1;
            int i5;
            boolean z4;
            boolean z5 = true;
            K1 = e0.K1(str, ":memory:", true);
            if (!K1) {
                int length = str.length() - 1;
                int i6 = 0;
                boolean z6 = false;
                while (i6 <= length) {
                    if (!z6) {
                        i5 = i6;
                    } else {
                        i5 = length;
                    }
                    if (l0.t(str.charAt(i5), 32) <= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z6) {
                        if (!z4) {
                            z6 = true;
                        } else {
                            i6++;
                        }
                    } else if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i6, length + 1).toString().length() != 0) {
                    z5 = false;
                }
                if (!z5) {
                    Log.w(TAG, "deleting the database file: " + str);
                    try {
                        SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
                    } catch (Exception e5) {
                        Log.w(TAG, "delete failed: ", e5);
                    }
                }
            }
        }

        public void onConfigure(@l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        public void onCorruption(@l SupportSQLiteDatabase db) {
            l0.p(db, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        l0.o(obj, "p.second");
                        deleteDatabaseFile((String) obj);
                    }
                } else {
                    String path2 = db.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                    }
                }
            }
        }

        public abstract void onCreate(@l SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(@l SupportSQLiteDatabase db, int i5, int i6) {
            l0.p(db, "db");
            throw new SQLiteException("Can't downgrade database from version " + i5 + " to " + i6);
        }

        public void onOpen(@l SupportSQLiteDatabase db) {
            l0.p(db, "db");
        }

        public abstract void onUpgrade(@l SupportSQLiteDatabase supportSQLiteDatabase, int i5, int i6);
    }

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "create", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface Factory {
        @l
        SupportSQLiteOpenHelper create(@l Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @m
    String getDatabaseName();

    @l
    SupportSQLiteDatabase getReadableDatabase();

    @l
    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z4);

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR\u0010\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", d.X, "Landroid/content/Context;", "name", "", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "useNoBackupDirectory", "", "allowDataLossOnRecovery", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "Builder", "Companion", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Configuration {

        @l
        public static final Companion Companion = new Companion(null);

        @e
        public final boolean allowDataLossOnRecovery;

        @l
        @e
        public final Callback callback;

        @l
        @e
        public final Context context;

        @m
        @e
        public final String name;

        @e
        public final boolean useNoBackupDirectory;

        @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", d.X, "Landroid/content/Context;", "(Landroid/content/Context;)V", "allowDataLossOnRecovery", "", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "name", "", "useNoBackupDirectory", "build", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "noBackupDirectory", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static class Builder {
            private boolean allowDataLossOnRecovery;

            @m
            private Callback callback;

            @l
            private final Context context;

            @m
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(@l Context context) {
                l0.p(context, "context");
                this.context = context;
            }

            @l
            public Builder allowDataLossOnRecovery(boolean z4) {
                this.allowDataLossOnRecovery = z4;
                return this;
            }

            @l
            public Configuration build() {
                boolean z4;
                Callback callback = this.callback;
                if (callback != null) {
                    boolean z5 = true;
                    if (this.useNoBackupDirectory) {
                        String str = this.name;
                        if (str != null && str.length() != 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            z5 = false;
                        }
                    }
                    if (z5) {
                        return new Configuration(this.context, this.name, callback, this.useNoBackupDirectory, this.allowDataLossOnRecovery);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            @l
            public Builder callback(@l Callback callback) {
                l0.p(callback, "callback");
                this.callback = callback;
                return this;
            }

            @l
            public Builder name(@m String str) {
                this.name = str;
                return this;
            }

            @l
            public Builder noBackupDirectory(boolean z4) {
                this.useNoBackupDirectory = z4;
                return this;
            }
        }

        @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "()V", "builder", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", d.X, "Landroid/content/Context;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            @u3.m
            public final Builder builder(@l Context context) {
                l0.p(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(@l Context context, @m String str, @l Callback callback, boolean z4, boolean z5) {
            l0.p(context, "context");
            l0.p(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z4;
            this.allowDataLossOnRecovery = z5;
        }

        @l
        @u3.m
        public static final Builder builder(@l Context context) {
            return Companion.builder(context);
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z4, boolean z5, int i5, w wVar) {
            this(context, str, callback, (i5 & 8) != 0 ? false : z4, (i5 & 16) != 0 ? false : z5);
        }
    }
}
