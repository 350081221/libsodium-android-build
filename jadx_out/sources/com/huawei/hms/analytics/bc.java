package com.huawei.hms.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.database.APIEvent;
import com.huawei.hms.analytics.database.DaoManager;
import com.huawei.hms.analytics.database.DaoSession;
import com.huawei.hms.analytics.database.EventDao;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class bc {
    private static bc klm;
    public DaoSession lmn;

    /* loaded from: classes3.dex */
    public static class lmn extends Exception {
        public lmn(String str) {
            super(str);
        }
    }

    private bc(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("context is null,or dbName is empty");
        }
        try {
            this.lmn = new DaoManager(new DaoManager.lmn(context, str, (byte) 0).getWritableDatabase()).newSession();
        } catch (Exception e5) {
            throw new lmn(e5.getMessage());
        }
    }

    private static synchronized void klm(Context context) {
        synchronized (bc.class) {
            if (klm == null) {
                klm = new bc(context, "userEvent.db");
            }
        }
    }

    public static bc lmn(Context context) {
        if (klm == null) {
            klm(context);
        }
        return klm;
    }

    public final List<APIEvent> ijk() {
        try {
            return this.lmn.getAPIEventDao().loadAll();
        } catch (SQLiteBlobTooBigException e5) {
            HiLog.w("DBCommander", "SQLite blob too big exception");
            this.lmn.getAPIEventDao().deleteAll();
            di.lmn(e5);
            return new ArrayList();
        }
    }

    public final List<Event> ikl() {
        try {
            return this.lmn.getEventDao().loadAll();
        } catch (SQLiteBlobTooBigException e5) {
            HiLog.w("DBCommander", "SQLite blob too big exception");
            this.lmn.getAPIEventDao().deleteAll();
            di.lmn(e5);
            return new ArrayList();
        }
    }

    public final void klm() {
        this.lmn.getAPIEventDao().deleteAll();
    }

    public final void lmn() {
        HiLog.i("DBCommander", "delete all");
        this.lmn.getEventDao().deleteAll();
        this.lmn.clear();
    }

    public final void lmn(String str) {
        this.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).h().g();
    }

    public final void lmn(String str, String str2) {
        this.lmn.getEventDao().queryBuilder().M(EventDao.Properties.ghi.b(str), new org.greenrobot.greendao.query.m[0]).M(EventDao.Properties.ikl.b(str2), new org.greenrobot.greendao.query.m[0]).h().g();
    }

    public final void lmn(List<Event> list) {
        this.lmn.getEventDao().insertInTx(list);
    }
}
