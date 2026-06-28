package com.yuanqi.master.database;

import android.database.sqlite.SQLiteDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0001\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"MIGRATION_1_2", "com/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1", "Lcom/yuanqi/master/database/DataBaseHelperKt$MIGRATION_1_2$1;", "MIGRATION_2_3", "Landroidx/room/migration/Migration;", "getMIGRATION_2_3", "()Landroidx/room/migration/Migration;", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataBaseHelperKt {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final DataBaseHelperKt$MIGRATION_1_2$1 f14572a = new Migration() { // from class: com.yuanqi.master.database.DataBaseHelperKt$MIGRATION_1_2$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.migration.Migration
        public void migrate(@l SupportSQLiteDatabase database) {
            l0.p(database, "database");
            if (!(database instanceof SQLiteDatabase)) {
                database.execSQL("ALTER TABLE AppNote ADD COLUMN 'app_pwd' TEXT NOT NULL DEFAULT ''");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, "ALTER TABLE AppNote ADD COLUMN 'app_pwd' TEXT NOT NULL DEFAULT ''");
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final Migration f14573b = new Migration() { // from class: com.yuanqi.master.database.DataBaseHelperKt$MIGRATION_2_3$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.migration.Migration
        public void migrate(@l SupportSQLiteDatabase database) {
            l0.p(database, "database");
            boolean z4 = database instanceof SQLiteDatabase;
            if (!z4) {
                database.execSQL("CREATE TABLE history (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    app_name TEXT NOT NULL,\n    package_name TEXT NOT NULL,\n    address TEXT NOT NULL,\n    latitude REAL NOT NULL,\n    longitude REAL NOT NULL,\n    timestamp INTEGER\n)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, "CREATE TABLE history (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    app_name TEXT NOT NULL,\n    package_name TEXT NOT NULL,\n    address TEXT NOT NULL,\n    latitude REAL NOT NULL,\n    longitude REAL NOT NULL,\n    timestamp INTEGER\n)");
            }
            if (!z4) {
                database.execSQL("CREATE UNIQUE INDEX index_history_id ON history(id ASC)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) database, "CREATE UNIQUE INDEX index_history_id ON history(id ASC)");
            }
        }
    };

    @l
    public static final Migration b() {
        return f14573b;
    }
}
