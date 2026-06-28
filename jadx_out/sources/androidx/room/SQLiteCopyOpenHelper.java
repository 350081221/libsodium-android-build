package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b2\u00103J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00064"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "", "writable", "Lkotlin/r2;", "verifyDatabaseFile", "Ljava/io/File;", "destinationFile", "copyDatabaseFile", "databaseFile", "dispatchOnOpenPrepackagedDatabase", "createFrameworkOpenHelper", "enabled", "setWriteAheadLoggingEnabled", ILivePush.ClickType.CLOSE, "Landroidx/room/DatabaseConfiguration;", "databaseConfiguration", "setDatabaseConfiguration", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "", "copyFromAssetPath", "Ljava/lang/String;", "copyFromFile", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "", "databaseVersion", "I", "delegate", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DatabaseConfiguration;", "verified", "Z", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SQLiteCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    @p4.l
    private final Context context;

    @p4.m
    private final String copyFromAssetPath;

    @p4.m
    private final File copyFromFile;

    @p4.m
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;

    @p4.l
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(@p4.l Context context, @p4.m String str, @p4.m File file, @p4.m Callable<InputStream> callable, int i5, @p4.l SupportSQLiteOpenHelper delegate) {
        l0.p(context, "context");
        l0.p(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i5;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File file, boolean z4) throws IOException {
        ReadableByteChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            l0.o(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
            l0.o(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                    l0.o(newChannel, "newChannel(inputStream)");
                } catch (Exception e5) {
                    throw new IOException("inputStreamCallable exception on call", e5);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        l0.o(output, "output");
        FileUtil.copy(newChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        l0.o(intermediateFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(intermediateFile, z4);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        final int u4;
        try {
            final int readVersion = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder name = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            u4 = kotlin.ranges.u.u(readVersion, 1);
            return frameworkSQLiteOpenHelperFactory.create(name.callback(new SupportSQLiteOpenHelper.Callback(u4) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(@p4.l SupportSQLiteDatabase db) {
                    l0.p(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(@p4.l SupportSQLiteDatabase db) {
                    l0.p(db, "db");
                    int i5 = readVersion;
                    if (i5 < 1) {
                        db.setVersion(i5);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(@p4.l SupportSQLiteDatabase db, int i5, int i6) {
                    l0.p(db, "db");
                }
            }).build());
        } catch (IOException e5) {
            throw new RuntimeException("Malformed database file, unable to read version.", e5);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z4) {
        SupportSQLiteDatabase readableDatabase;
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            l0.S("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            if (z4) {
                readableDatabase = createFrameworkOpenHelper.getWritableDatabase();
            } else {
                readableDatabase = createFrameworkOpenHelper.getReadableDatabase();
            }
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                l0.S("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            l0.m(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(readableDatabase);
            r2 r2Var = r2.f19517a;
            kotlin.io.c.a(createFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z4) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databaseFile = this.context.getDatabasePath(databaseName);
            DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
            DatabaseConfiguration databaseConfiguration2 = null;
            if (databaseConfiguration == null) {
                l0.S("databaseConfiguration");
                databaseConfiguration = null;
            }
            ProcessLock processLock = new ProcessLock(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
            try {
                ProcessLock.lock$default(processLock, false, 1, null);
                if (!databaseFile.exists()) {
                    try {
                        l0.o(databaseFile, "databaseFile");
                        copyDatabaseFile(databaseFile, z4);
                        processLock.unlock();
                        return;
                    } catch (IOException e5) {
                        throw new RuntimeException("Unable to copy database file.", e5);
                    }
                }
                try {
                    l0.o(databaseFile, "databaseFile");
                    int readVersion = DBUtil.readVersion(databaseFile);
                    if (readVersion == this.databaseVersion) {
                        processLock.unlock();
                        return;
                    }
                    DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                    if (databaseConfiguration3 == null) {
                        l0.S("databaseConfiguration");
                    } else {
                        databaseConfiguration2 = databaseConfiguration3;
                    }
                    if (databaseConfiguration2.isMigrationRequired(readVersion, this.databaseVersion)) {
                        processLock.unlock();
                        return;
                    }
                    if (this.context.deleteDatabase(databaseName)) {
                        try {
                            copyDatabaseFile(databaseFile, z4);
                        } catch (IOException e6) {
                            Log.w(Room.LOG_TAG, "Unable to copy database file.", e6);
                        }
                    } else {
                        Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    processLock.unlock();
                    return;
                } catch (IOException e7) {
                    Log.w(Room.LOG_TAG, "Unable to read database version.", e7);
                    processLock.unlock();
                    return;
                }
            } catch (Throwable th) {
                processLock.unlock();
                throw th;
            }
            processLock.unlock();
            throw th;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.m
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    @p4.l
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.l
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @p4.l
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(@p4.l DatabaseConfiguration databaseConfiguration) {
        l0.p(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z4) {
        getDelegate().setWriteAheadLoggingEnabled(z4);
    }
}
