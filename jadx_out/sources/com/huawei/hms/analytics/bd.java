package com.huawei.hms.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteFullException;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.database.EventDao;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes3.dex */
public final class bd implements IStorageHandler {
    private static IStorageHandler lmn;
    private bc klm;

    private bd(Context context) {
        this.klm = bc.lmn(context);
    }

    private static synchronized void klm(Context context) {
        synchronized (bd.class) {
            if (lmn == null) {
                lmn = new bd(context);
            }
        }
    }

    public static IStorageHandler lmn(Context context) {
        if (lmn == null) {
            klm(context);
        }
        return lmn;
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final long count(String str) {
        return this.klm.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).m();
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final void deleteAll() {
        this.klm.lmn();
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final void deleteByTag(String str) {
        this.klm.lmn(str);
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final void deleteByTagType(String str, String str2) {
        this.klm.lmn(str, str2);
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final void deleteEvents(List<Event> list) {
        this.klm.lmn.getEventDao().deleteInTx(list);
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final long insert(Event event) {
        try {
            return this.klm.lmn.getEventDao().insert(event);
        } catch (SQLiteFullException e5) {
            HiLog.w("StorageHandler", "SQLite full exception");
            this.klm.lmn();
            di.lmn(e5);
            return 0L;
        }
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final void insertEx(List<Event> list) {
        try {
            this.klm.lmn(list);
        } catch (SQLiteFullException e5) {
            HiLog.w("StorageHandler", "SQLite full exception");
            this.klm.lmn();
            di.lmn(e5);
        }
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final List<Event> readBySql(String str) {
        return this.klm.lmn.getEventDao().queryBuilder().M(new m.c(str), new org.greenrobot.greendao.query.m[0]).e().l().n();
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final List<Event> readEvents(String str) {
        try {
            return this.klm.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).e().l().n();
        } catch (SQLiteBlobTooBigException e5) {
            HiLog.w("StorageHandler", "SQLite blob too big exception");
            this.klm.lmn(str);
            di.lmn(e5);
            return new ArrayList();
        }
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final List<Event> readEvents(String str, String str2) {
        try {
            return this.klm.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).M(EventDao.Properties.ikl.b(str2), new org.greenrobot.greendao.query.m[0]).e().l().n();
        } catch (SQLiteBlobTooBigException e5) {
            HiLog.w("StorageHandler", "SQLite blob too big exception");
            this.klm.lmn(str, str2);
            di.lmn(e5);
            return new ArrayList();
        }
    }

    @Override // com.huawei.hms.analytics.core.storage.IStorageHandler
    public final List<Event> readEvents(String str, String str2, int i5) {
        try {
            return this.klm.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).M(EventDao.Properties.ikl.b(str2), new org.greenrobot.greendao.query.m[0]).u(i5).e().l().n();
        } catch (SQLiteBlobTooBigException e5) {
            HiLog.w("StorageHandler", "SQLite blob too big exception");
            this.klm.lmn(str, str2);
            di.lmn(e5);
            return new ArrayList();
        }
    }
}
