package com.huawei.hms.analytics;

import com.huawei.hms.analytics.database.LogConfig;
import com.huawei.hms.analytics.database.LogConfigDao;
import com.huawei.hms.analytics.database.LogEvent;
import com.huawei.hms.analytics.database.LogEventDao;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bf extends org.greenrobot.greendao.c {
    private final org.greenrobot.greendao.internal.a ijk;
    private final org.greenrobot.greendao.internal.a ikl;
    public final LogEventDao klm;
    public final LogConfigDao lmn;

    public bf(org.greenrobot.greendao.database.a aVar, o4.d dVar, Map<Class<? extends org.greenrobot.greendao.a<?, ?>>, org.greenrobot.greendao.internal.a> map) {
        super(aVar);
        org.greenrobot.greendao.internal.a clone = map.get(LogEventDao.class).clone();
        this.ikl = clone;
        clone.d(dVar);
        org.greenrobot.greendao.internal.a clone2 = map.get(LogConfigDao.class).clone();
        this.ijk = clone2;
        clone2.d(dVar);
        LogEventDao logEventDao = new LogEventDao(clone, this);
        this.klm = logEventDao;
        LogConfigDao logConfigDao = new LogConfigDao(clone2, this);
        this.lmn = logConfigDao;
        registerDao(LogEvent.class, logEventDao);
        registerDao(LogConfig.class, logConfigDao);
    }

    public final void lmn() {
        this.ikl.a();
        this.ijk.a();
    }
}
