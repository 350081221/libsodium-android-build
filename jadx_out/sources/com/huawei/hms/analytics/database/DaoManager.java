package com.huawei.hms.analytics.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.analytics.bg;
import com.huawei.hms.analytics.core.log.HiLog;
import o4.d;
import org.greenrobot.greendao.b;
import org.greenrobot.greendao.database.a;
import org.greenrobot.greendao.database.f;

/* loaded from: classes3.dex */
public class DaoManager extends b {
    public static final int SCHEMA_VERSION = 2;

    /* loaded from: classes3.dex */
    public static abstract class klm extends org.greenrobot.greendao.database.b {
        public klm(Context context, String str) {
            super(context, str, 2);
        }

        public klm(Context context, String str, byte b5) {
            super(context, str, null, 2);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onCreate(a aVar) {
            HiLog.i("greenDAO", "Creating tables for schema version 2");
            DaoManager.createAllTables(aVar, false);
        }
    }

    /* loaded from: classes3.dex */
    public static class lmn extends klm {
        public lmn(Context context, String str) {
            super(context, str);
        }

        public lmn(Context context, String str, byte b5) {
            super(context, str, (byte) 0);
        }

        @Override // org.greenrobot.greendao.database.b
        public final void onUpgrade(a aVar, int i5, int i6) {
            HiLog.i("greenDAO", "Upgrading schema from version " + i5 + " to " + i6 + " by dropping all tables");
            Class[] clsArr = {EventDao.class};
            bg.klm(aVar, clsArr);
            DaoManager.createEventTable(aVar, false);
            bg.lmn(aVar, (Class<? extends org.greenrobot.greendao.a<?, ?>>[]) clsArr);
        }
    }

    public DaoManager(SQLiteDatabase sQLiteDatabase) {
        this(new f(sQLiteDatabase));
    }

    public DaoManager(a aVar) {
        super(aVar, 2);
        registerDaoClass(APIEventDao.class);
        registerDaoClass(EventDao.class);
    }

    public static void createAPIEventTable(a aVar, boolean z4) {
        APIEventDao.createTable(aVar, z4);
    }

    public static void createAllTables(a aVar, boolean z4) {
        APIEventDao.createTable(aVar, z4);
        EventDao.createTable(aVar, z4);
    }

    public static void createEventTable(a aVar, boolean z4) {
        EventDao.createTable(aVar, z4);
    }

    public static void dropAllTables(a aVar, boolean z4) {
        APIEventDao.dropTable(aVar, z4);
        EventDao.dropTable(aVar, z4);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoManager(new lmn(context, str).getWritableDb()).newSession();
    }

    @Override // org.greenrobot.greendao.b
    public DaoSession newSession() {
        return new DaoSession(this.db, d.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.b
    public DaoSession newSession(d dVar) {
        return new DaoSession(this.db, dVar, this.daoConfigMap);
    }
}
