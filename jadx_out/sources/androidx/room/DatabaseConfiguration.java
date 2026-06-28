package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001Bi\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017B\u0081\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\u0010\u001bB\u0095\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fB¥\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\u0002\u0010#B¯\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&B½\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010(BË\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000b¢\u0006\u0002\u0010+BÍ\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000b¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0016H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u0016H\u0017R\u0010\u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "name", "", "sqliteOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "allowMainThreadQueries", "", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "queryExecutor", "Ljava/util/concurrent/Executor;", "requireMigration", "migrationNotRequiredFrom", "", "", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "transactionExecutor", "multiInstanceInvalidation", "allowDestructiveMigrationOnDowngrade", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)V", "typeConverters", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;)V", "autoMigrationSpecs", "Landroidx/room/migration/AutoMigrationSpec;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "multiInstanceInvalidationServiceIntent", "Landroid/content/Intent;", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "isMigrationRequired", "fromVersion", "toVersion", "isMigrationRequiredFrom", "version", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DatabaseConfiguration {

    @u3.e
    public final boolean allowDestructiveMigrationOnDowngrade;

    @u3.e
    public final boolean allowMainThreadQueries;

    @p4.l
    @u3.e
    public final List<AutoMigrationSpec> autoMigrationSpecs;

    @p4.m
    @u3.e
    public final List<RoomDatabase.Callback> callbacks;

    @p4.l
    @u3.e
    public final Context context;

    @p4.m
    @u3.e
    public final String copyFromAssetPath;

    @p4.m
    @u3.e
    public final File copyFromFile;

    @p4.m
    @u3.e
    public final Callable<InputStream> copyFromInputStream;

    @p4.l
    @u3.e
    public final RoomDatabase.JournalMode journalMode;

    @p4.l
    @u3.e
    public final RoomDatabase.MigrationContainer migrationContainer;

    @p4.m
    private final Set<Integer> migrationNotRequiredFrom;

    @u3.e
    public final boolean multiInstanceInvalidation;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @p4.m
    @u3.e
    public final Intent multiInstanceInvalidationServiceIntent;

    @p4.m
    @u3.e
    public final String name;

    @p4.m
    @u3.e
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

    @p4.l
    @u3.e
    public final Executor queryExecutor;

    @u3.e
    public final boolean requireMigration;

    @p4.l
    @u3.e
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    @p4.l
    @u3.e
    public final Executor transactionExecutor;

    @p4.l
    @u3.e
    public final List<Object> typeConverters;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@p4.l Context context, @p4.m String str, @p4.l SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @p4.l RoomDatabase.MigrationContainer migrationContainer, @p4.m List<? extends RoomDatabase.Callback> list, boolean z4, @p4.l RoomDatabase.JournalMode journalMode, @p4.l Executor queryExecutor, @p4.l Executor transactionExecutor, @p4.m Intent intent, boolean z5, boolean z6, @p4.m Set<Integer> set, @p4.m String str2, @p4.m File file, @p4.m Callable<InputStream> callable, @p4.m RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @p4.l List<? extends Object> typeConverters, @p4.l List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        l0.p(context, "context");
        l0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        l0.p(migrationContainer, "migrationContainer");
        l0.p(journalMode, "journalMode");
        l0.p(queryExecutor, "queryExecutor");
        l0.p(transactionExecutor, "transactionExecutor");
        l0.p(typeConverters, "typeConverters");
        l0.p(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z4;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z5;
        this.allowDestructiveMigrationOnDowngrade = z6;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean isMigrationRequired(int i5, int i6) {
        boolean z4;
        Set<Integer> set;
        if (i5 > i6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && this.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        if (this.requireMigration && ((set = this.migrationNotRequiredFrom) == null || !set.contains(Integer.valueOf(i5)))) {
            return true;
        }
        return false;
    }

    @kotlin.k(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @b1(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int i5) {
        return isMigrationRequired(i5, i5 + 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, boolean r29, @p4.m java.util.Set<java.lang.Integer> r30) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r28
            r11 = r29
            r13 = r30
            java.lang.String r10 = "context"
            r12 = r21
            kotlin.jvm.internal.l0.p(r12, r10)
            java.lang.String r10 = "sqliteOpenHelperFactory"
            r12 = r23
            kotlin.jvm.internal.l0.p(r12, r10)
            java.lang.String r10 = "migrationContainer"
            r12 = r24
            kotlin.jvm.internal.l0.p(r12, r10)
            java.lang.String r10 = "journalMode"
            r12 = r27
            kotlin.jvm.internal.l0.p(r12, r10)
            java.lang.String r10 = "queryExecutor"
            r12 = r28
            kotlin.jvm.internal.l0.p(r12, r10)
            java.util.List r18 = kotlin.collections.u.E()
            java.util.List r19 = kotlin.collections.u.E()
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, @p4.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @p4.m java.util.Set<java.lang.Integer> r33) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L36
        L35:
            r0 = 0
        L36:
            r10 = r0
            java.util.List r18 = kotlin.collections.u.E()
            java.util.List r19 = kotlin.collections.u.E()
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, @p4.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @p4.m java.util.Set<java.lang.Integer> r33, @p4.m java.lang.String r34, @p4.m java.io.File r35) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L36
        L35:
            r0 = 0
        L36:
            r10 = r0
            java.util.List r18 = kotlin.collections.u.E()
            java.util.List r19 = kotlin.collections.u.E()
            r16 = 0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, @p4.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @p4.m java.util.Set<java.lang.Integer> r33, @p4.m java.lang.String r34, @p4.m java.io.File r35, @p4.m java.util.concurrent.Callable<java.io.InputStream> r36) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L36
        L35:
            r0 = 0
        L36:
            r10 = r0
            java.util.List r18 = kotlin.collections.u.E()
            java.util.List r19 = kotlin.collections.u.E()
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, @p4.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @p4.m java.util.Set<java.lang.Integer> r33, @p4.m java.lang.String r34, @p4.m java.io.File r35, @p4.m java.util.concurrent.Callable<java.io.InputStream> r36, @p4.m androidx.room.RoomDatabase.PrepackagedDatabaseCallback r37) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L36
        L35:
            r0 = 0
        L36:
            r10 = r0
            java.util.List r18 = kotlin.collections.u.E()
            java.util.List r19 = kotlin.collections.u.E()
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$PrepackagedDatabaseCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DatabaseConfiguration(@p4.l android.content.Context r21, @p4.m java.lang.String r22, @p4.l androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r23, @p4.l androidx.room.RoomDatabase.MigrationContainer r24, @p4.m java.util.List<? extends androidx.room.RoomDatabase.Callback> r25, boolean r26, @p4.l androidx.room.RoomDatabase.JournalMode r27, @p4.l java.util.concurrent.Executor r28, @p4.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @p4.m java.util.Set<java.lang.Integer> r33, @p4.m java.lang.String r34, @p4.m java.io.File r35, @p4.m java.util.concurrent.Callable<java.io.InputStream> r36, @p4.m androidx.room.RoomDatabase.PrepackagedDatabaseCallback r37, @p4.l java.util.List<? extends java.lang.Object> r38) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            java.lang.String r0 = "typeConverters"
            r15 = r38
            kotlin.jvm.internal.l0.p(r15, r0)
            if (r30 == 0) goto L3d
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r10 = r0
            java.util.List r19 = kotlin.collections.u.E()
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.DatabaseConfiguration.<init>(android.content.Context, java.lang.String, androidx.sqlite.db.SupportSQLiteOpenHelper$Factory, androidx.room.RoomDatabase$MigrationContainer, java.util.List, boolean, androidx.room.RoomDatabase$JournalMode, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.RoomDatabase$PrepackagedDatabaseCallback, java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @b1(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@p4.l Context context, @p4.m String str, @p4.l SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @p4.l RoomDatabase.MigrationContainer migrationContainer, @p4.m List<? extends RoomDatabase.Callback> list, boolean z4, @p4.l RoomDatabase.JournalMode journalMode, @p4.l Executor queryExecutor, @p4.l Executor transactionExecutor, boolean z5, boolean z6, boolean z7, @p4.m Set<Integer> set, @p4.m String str2, @p4.m File file, @p4.m Callable<InputStream> callable, @p4.m RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @p4.l List<? extends Object> typeConverters, @p4.l List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z6, z7, set, str2, file, callable, (RoomDatabase.PrepackagedDatabaseCallback) null, typeConverters, autoMigrationSpecs);
        l0.p(context, "context");
        l0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        l0.p(migrationContainer, "migrationContainer");
        l0.p(journalMode, "journalMode");
        l0.p(queryExecutor, "queryExecutor");
        l0.p(transactionExecutor, "transactionExecutor");
        l0.p(typeConverters, "typeConverters");
        l0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
