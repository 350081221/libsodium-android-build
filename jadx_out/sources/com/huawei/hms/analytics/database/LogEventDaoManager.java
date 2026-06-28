package com.huawei.hms.analytics.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.analytics.bf;
import com.huawei.hms.analytics.core.log.HiLog;
import o4.d;
import org.greenrobot.greendao.b;
import org.greenrobot.greendao.database.a;
import org.greenrobot.greendao.database.f;

/* loaded from: classes3.dex */
public class LogEventDaoManager extends b {
    public static final int SCHEMA_VERSION = 1;

    /* loaded from: classes3.dex */
    public static abstract class klm extends org.greenrobot.greendao.database.b {
        public klm(Context context, String str) {
            super(context, str, 1);
        }

        public klm(Context context, String str, byte b5) {
            super(context, str, null, 1);
        }

        @Override // org.greenrobot.greendao.database.b
        public void onCreate(a aVar) {
            HiLog.i("greenDAO", "Creating tables for schema version 1");
            LogEventDaoManager.createAllTables(aVar, false);
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
        }
    }

    public LogEventDaoManager(SQLiteDatabase sQLiteDatabase) {
        this(new f(sQLiteDatabase));
    }

    public LogEventDaoManager(a aVar) {
        super(aVar, 1);
        registerDaoClass(LogEventDao.class);
        registerDaoClass(LogConfigDao.class);
    }

    public static void createAllTables(a aVar, boolean z4) {
        LogEventDao.createTable(aVar, z4);
        LogConfigDao.createTable(aVar, z4);
    }

    public static bf newDevSession(Context context, String str) {
        return new LogEventDaoManager(new lmn(context, str).getWritableDb()).newSession();
    }

    @Override // org.greenrobot.greendao.b
    public bf newSession() {
        return new bf(this.db, d.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.b
    public bf newSession(d dVar) {
        return new bf(this.db, dVar, this.daoConfigMap);
    }
}
