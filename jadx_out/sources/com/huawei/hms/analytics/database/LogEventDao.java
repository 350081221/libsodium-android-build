package com.huawei.hms.analytics.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huawei.hms.analytics.bf;
import com.umeng.analytics.pro.bm;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.i;

/* loaded from: classes3.dex */
public class LogEventDao extends a<LogEvent, Long> {
    public static final String TABLENAME = "ha_lg";

    /* loaded from: classes3.dex */
    public static class Properties {
        public static final i lmn = new i(0, Long.class, "id", true, bm.f12336d);
        public static final i klm = new i(1, String.class, "evtTime", false, "ev_t");
        public static final i ikl = new i(2, Long.class, "evtType", false, "cf_id");
        public static final i ijk = new i(3, String.class, "content", false, "ev_ct");
        public static final i hij = new i(4, String.class, "eventId", false, "ev_id");
    }

    public LogEventDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public LogEventDao(org.greenrobot.greendao.internal.a aVar, bf bfVar) {
        super(aVar, bfVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        aVar.execSQL("CREATE TABLE " + (z4 ? "IF NOT EXISTS " : "") + "\"ha_lg\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"ev_t\" TEXT,\"cf_id\" INTEGER,\"ev_ct\" TEXT,\"ev_id\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z4 ? "IF EXISTS " : "");
        sb.append("\"ha_lg\"");
        aVar.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LogEvent logEvent) {
        sQLiteStatement.clearBindings();
        Long id = logEvent.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String evtTime = logEvent.getEvtTime();
        if (evtTime != null) {
            sQLiteStatement.bindString(2, evtTime);
        }
        Long configId = logEvent.getConfigId();
        if (configId != null) {
            sQLiteStatement.bindLong(3, configId.longValue());
        }
        String content = logEvent.getContent();
        if (content != null) {
            sQLiteStatement.bindString(4, content);
        }
        String eventId = logEvent.getEventId();
        if (eventId != null) {
            sQLiteStatement.bindString(5, eventId);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, LogEvent logEvent) {
        cVar.clearBindings();
        Long id = logEvent.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String evtTime = logEvent.getEvtTime();
        if (evtTime != null) {
            cVar.bindString(2, evtTime);
        }
        Long configId = logEvent.getConfigId();
        if (configId != null) {
            cVar.bindLong(3, configId.longValue());
        }
        String content = logEvent.getContent();
        if (content != null) {
            cVar.bindString(4, content);
        }
        String eventId = logEvent.getEventId();
        if (eventId != null) {
            cVar.bindString(5, eventId);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(LogEvent logEvent) {
        if (logEvent != null) {
            return logEvent.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LogEvent logEvent) {
        return logEvent.getId() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.a
    public LogEvent readEntity(Cursor cursor, int i5) {
        int i6 = i5 + 0;
        Long valueOf = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i5 + 1;
        String string = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i5 + 2;
        Long valueOf2 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i5 + 3;
        return new LogEvent(valueOf, string, valueOf2, cursor.isNull(i9) ? null : cursor.getString(i9), cursor.isNull(i5 + 5) ? null : cursor.getString(i5 + 4));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LogEvent logEvent, int i5) {
        int i6 = i5 + 0;
        logEvent.setId(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i5 + 1;
        logEvent.setEvtTime(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i5 + 2;
        logEvent.setConfigId(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i5 + 3;
        logEvent.setContent(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i5 + 4;
        logEvent.setEventId(cursor.isNull(i10) ? null : cursor.getString(i10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.a
    public Long readKey(Cursor cursor, int i5) {
        int i6 = i5 + 0;
        if (cursor.isNull(i6)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final Long updateKeyAfterInsert(LogEvent logEvent, long j5) {
        logEvent.setId(Long.valueOf(j5));
        return Long.valueOf(j5);
    }
}
