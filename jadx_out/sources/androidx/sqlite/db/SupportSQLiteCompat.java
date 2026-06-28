package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.d;
import java.io.File;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "()V", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class SupportSQLiteCompat {

    @Instrumented
    @i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007JK\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\tH\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\tH\u0007¨\u0006!"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/r2;", "cancel", "createCancellationSignal", "Ljava/io/File;", "file", "", "deleteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "rawQueryWithFactory", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "enable", "setForeignKeyConstraintsEnabled", "disableWriteAheadLogging", "isWriteAheadLoggingEnabled", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "setWriteAheadLoggingEnabled", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api16Impl {

        @l
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void cancel(@l CancellationSignal cancellationSignal) {
            l0.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final boolean deleteDatabase(@l File file) {
            l0.p(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void disableWriteAheadLogging(@l SQLiteDatabase sQLiteDatabase) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final boolean isWriteAheadLoggingEnabled(@l SQLiteDatabase sQLiteDatabase) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final Cursor rawQueryWithFactory(@l SQLiteDatabase sQLiteDatabase, @l String sql, @l String[] selectionArgs, @p4.m String str, @l CancellationSignal cancellationSignal, @l SQLiteDatabase.CursorFactory cursorFactory) {
            Cursor rawQueryWithFactory;
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            l0.p(sql, "sql");
            l0.p(selectionArgs, "selectionArgs");
            l0.p(cancellationSignal, "cancellationSignal");
            l0.p(cursorFactory, "cursorFactory");
            if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            } else {
                rawQueryWithFactory = SQLiteInstrumentation.rawQueryWithFactory(sQLiteDatabase, cursorFactory, sql, selectionArgs, str, cancellationSignal);
            }
            l0.o(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void setForeignKeyConstraintsEnabled(@l SQLiteDatabase sQLiteDatabase, boolean z4) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z4);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void setWriteAheadLoggingEnabled(@l SQLiteOpenHelper sQLiteOpenHelper, boolean z4) {
            l0.p(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z4);
        }
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "()V", "getNotificationUri", "Landroid/net/Uri;", "cursor", "Landroid/database/Cursor;", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api19Impl {

        @l
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final Uri getNotificationUri(@l Cursor cursor) {
            l0.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            l0.o(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final boolean isLowRamDevice(@l ActivityManager activityManager) {
            l0.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "()V", "getNoBackupFilesDir", "Ljava/io/File;", d.X, "Landroid/content/Context;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api21Impl {

        @l
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final File getNoBackupFilesDir(@l Context context) {
            l0.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            l0.o(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "Lkotlin/r2;", "setExtras", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api23Impl {

        @l
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void setExtras(@l Cursor cursor, @l Bundle extras) {
            l0.p(cursor, "cursor");
            l0.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "Lkotlin/r2;", "setNotificationUris", "getNotificationUris", "<init>", "()V", "sqlite_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api29Impl {

        @l
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @l
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final List<Uri> getNotificationUris(@l Cursor cursor) {
            List<Uri> notificationUris;
            l0.p(cursor, "cursor");
            notificationUris = cursor.getNotificationUris();
            l0.m(notificationUris);
            return notificationUris;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @m
        public static final void setNotificationUris(@l Cursor cursor, @l ContentResolver cr, @l List<? extends Uri> uris) {
            l0.p(cursor, "cursor");
            l0.p(cr, "cr");
            l0.p(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
