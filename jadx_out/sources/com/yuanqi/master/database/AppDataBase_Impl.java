package com.yuanqi.master.database;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.umeng.analytics.pro.bi;
import com.yuanqi.master.database.dao.b;
import com.yuanqi.master.database.dao.c;
import com.yuanqi.master.database.dao.d;
import com.yuanqi.master.database.dao.e;
import com.yuanqi.master.database.dao.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Instrumented
/* loaded from: classes3.dex */
public final class AppDataBase_Impl extends AppDataBase {

    /* renamed from: b, reason: collision with root package name */
    private volatile c f14568b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.yuanqi.master.database.dao.a f14569c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f14570d;

    @Instrumented
    /* loaded from: classes3.dex */
    class a extends RoomOpenHelper.Delegate {
        a(int i5) {
            super(i5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            boolean z4 = supportSQLiteDatabase instanceof SQLiteDatabase;
            if (!z4) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `AppNote` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `note_name` TEXT NOT NULL, `app_pwd` TEXT NOT NULL)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `AppNote` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `package_name` TEXT NOT NULL, `user_id` INTEGER NOT NULL, `note_name` TEXT NOT NULL, `app_pwd` TEXT NOT NULL)");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `AdModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `AdModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` TEXT NOT NULL)");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `app_name` TEXT NOT NULL, `package_name` TEXT NOT NULL, `address` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `timestamp` INTEGER)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `app_name` TEXT NOT NULL, `package_name` TEXT NOT NULL, `address` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `timestamp` INTEGER)");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_history_id` ON `history` (`id`)");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "CREATE UNIQUE INDEX IF NOT EXISTS `index_history_id` ON `history` (`id`)");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, RoomMasterTable.CREATE_QUERY);
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ff4fef14337f4c003e19ed2c97aeadd7')");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ff4fef14337f4c003e19ed2c97aeadd7')");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            boolean z4 = supportSQLiteDatabase instanceof SQLiteDatabase;
            if (!z4) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `AppNote`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "DROP TABLE IF EXISTS `AppNote`");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `AdModel`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "DROP TABLE IF EXISTS `AdModel`");
            }
            if (!z4) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `history`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) supportSQLiteDatabase, "DROP TABLE IF EXISTS `history`");
            }
            List list = ((RoomDatabase) AppDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((RoomDatabase) AppDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) AppDataBase_Impl.this).mDatabase = supportSQLiteDatabase;
            AppDataBase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            List list = ((RoomDatabase) AppDataBase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        @NonNull
        public RoomOpenHelper.ValidationResult onValidateSchema(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(5);
            hashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap.put(bi.f12269o, new TableInfo.Column(bi.f12269o, "TEXT", true, 0, null, 1));
            hashMap.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 0, null, 1));
            hashMap.put("note_name", new TableInfo.Column("note_name", "TEXT", true, 0, null, 1));
            hashMap.put("app_pwd", new TableInfo.Column("app_pwd", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("AppNote", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "AppNote");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "AppNote(com.yuanqi.master.database.model.AppNote).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap2.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, 1));
            TableInfo tableInfo2 = new TableInfo("AdModel", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "AdModel");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "AdModel(com.yuanqi.master.database.model.AdModel).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(7);
            hashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            hashMap3.put("app_name", new TableInfo.Column("app_name", "TEXT", true, 0, null, 1));
            hashMap3.put(bi.f12269o, new TableInfo.Column(bi.f12269o, "TEXT", true, 0, null, 1));
            hashMap3.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, 1));
            hashMap3.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, 1));
            hashMap3.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, 1));
            hashMap3.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_history_id", true, Arrays.asList("id"), Arrays.asList("ASC")));
            TableInfo tableInfo3 = new TableInfo("history", hashMap3, hashSet, hashSet2);
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "history");
            if (!tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(false, "history(com.yuanqi.master.database.model.History).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
            }
            return new RoomOpenHelper.ValidationResult(true, null);
        }
    }

    @Override // com.yuanqi.master.database.AppDataBase
    public com.yuanqi.master.database.dao.a a() {
        com.yuanqi.master.database.dao.a aVar;
        if (this.f14569c != null) {
            return this.f14569c;
        }
        synchronized (this) {
            if (this.f14569c == null) {
                this.f14569c = new b(this);
            }
            aVar = this.f14569c;
        }
        return aVar;
    }

    @Override // com.yuanqi.master.database.AppDataBase
    public c b() {
        c cVar;
        if (this.f14568b != null) {
            return this.f14568b;
        }
        synchronized (this) {
            if (this.f14568b == null) {
                this.f14568b = new d(this);
            }
            cVar = this.f14568b;
        }
        return cVar;
    }

    @Override // com.yuanqi.master.database.AppDataBase
    public e c() {
        e eVar;
        if (this.f14570d != null) {
            return this.f14570d;
        }
        synchronized (this) {
            if (this.f14570d == null) {
                this.f14570d = new f(this);
            }
            eVar = this.f14570d;
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            if (!(writableDatabase instanceof SQLiteDatabase)) {
                writableDatabase.execSQL("DELETE FROM `AppNote`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) writableDatabase, "DELETE FROM `AppNote`");
            }
            if (!(writableDatabase instanceof SQLiteDatabase)) {
                writableDatabase.execSQL("DELETE FROM `AdModel`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) writableDatabase, "DELETE FROM `AdModel`");
            }
            if (!(writableDatabase instanceof SQLiteDatabase)) {
                writableDatabase.execSQL("DELETE FROM `history`");
            } else {
                SQLiteInstrumentation.execSQL((SQLiteDatabase) writableDatabase, "DELETE FROM `history`");
            }
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                if (!(writableDatabase instanceof SQLiteDatabase)) {
                    writableDatabase.execSQL("VACUUM");
                } else {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) writableDatabase, "VACUUM");
                }
            }
        } catch (Throwable th) {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                if (!(writableDatabase instanceof SQLiteDatabase)) {
                    writableDatabase.execSQL("VACUUM");
                } else {
                    SQLiteInstrumentation.execSQL((SQLiteDatabase) writableDatabase, "VACUUM");
                }
            }
            throw th;
        }
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "AppNote", "AdModel", "history");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    protected SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(3), "ff4fef14337f4c003e19ed2c97aeadd7", "5cfbaa2b450ae1c65a8be1ac7a7c4d96")).build());
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.class, d.g());
        hashMap.put(com.yuanqi.master.database.dao.a.class, b.c());
        hashMap.put(e.class, f.i());
        return hashMap;
    }
}
