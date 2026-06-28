package com.huawei.hms.analytics.database;

import com.huawei.hms.analytics.core.storage.Event;
import java.util.Map;
import o4.d;
import org.greenrobot.greendao.c;
import org.greenrobot.greendao.internal.a;

/* loaded from: classes3.dex */
public class DaoSession extends c {
    private final APIEventDao aPIEventDao;
    private final a aPIEventDaoConfig;
    private final EventDao eventDao;
    private final a eventDaoConfig;

    public DaoSession(org.greenrobot.greendao.database.a aVar, d dVar, Map<Class<? extends org.greenrobot.greendao.a<?, ?>>, a> map) {
        super(aVar);
        a clone = map.get(APIEventDao.class).clone();
        this.aPIEventDaoConfig = clone;
        clone.d(dVar);
        a clone2 = map.get(EventDao.class).clone();
        this.eventDaoConfig = clone2;
        clone2.d(dVar);
        APIEventDao aPIEventDao = new APIEventDao(clone, this);
        this.aPIEventDao = aPIEventDao;
        EventDao eventDao = new EventDao(clone2, this);
        this.eventDao = eventDao;
        registerDao(APIEvent.class, aPIEventDao);
        registerDao(Event.class, eventDao);
    }

    public void clear() {
        this.aPIEventDaoConfig.a();
        this.eventDaoConfig.a();
    }

    public APIEventDao getAPIEventDao() {
        return this.aPIEventDao;
    }

    public EventDao getEventDao() {
        return this.eventDao;
    }
}
