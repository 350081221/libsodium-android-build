package com.huawei.hms.analytics.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huawei.hms.analytics.core.storage.Event;
import com.umeng.analytics.pro.bm;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.i;

/* loaded from: classes3.dex */
public class EventDao extends a<Event, Long> {
    public static final String TABLENAME = "EVENT";

    /* loaded from: classes3.dex */
    public static class Properties {
        public static final i lmn = new i(0, Long.class, "id", true, bm.f12336d);
        public static final i klm = new i(1, String.class, "evtid", false, "EVTID");
        public static final i ikl = new i(2, String.class, "evttype", false, "EVTTYPE");
        public static final i ijk = new i(3, String.class, "content", false, "CONTENT");
        public static final i hij = new i(4, String.class, "evttime", false, "EVTTIME");
        public static final i ghi = new i(5, String.class, "servicetag", false, "SERVICETAG");
        public static final i fgh = new i(6, String.class, "sessionid", false, "SESSIONID");
        public static final i efg = new i(7, String.class, "sessionname", false, "SESSIONNAME");
        public static final i def = new i(8, String.class, "associationId", false, "ID");
        public static final i cde = new i(9, String.class, "pid", false, "PID");
    }

    public EventDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public EventDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        aVar.execSQL("CREATE TABLE " + (z4 ? "IF NOT EXISTS " : "") + "\"EVENT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"EVTID\" TEXT,\"EVTTYPE\" TEXT,\"CONTENT\" TEXT,\"EVTTIME\" TEXT,\"SERVICETAG\" TEXT,\"SESSIONID\" TEXT,\"SESSIONNAME\" TEXT,\"ID\" TEXT,\"PID\" TEXT)");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z4 ? "IF EXISTS " : "");
        sb.append("\"EVENT\"");
        aVar.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, Event event) {
        sQLiteStatement.clearBindings();
        Long id = event.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String evtId = event.getEvtId();
        if (evtId != null) {
            sQLiteStatement.bindString(2, evtId);
        }
        String evtType = event.getEvtType();
        if (evtType != null) {
            sQLiteStatement.bindString(3, evtType);
        }
        String content = event.getContent();
        if (content != null) {
            sQLiteStatement.bindString(4, content);
        }
        String evtTime = event.getEvtTime();
        if (evtTime != null) {
            sQLiteStatement.bindString(5, evtTime);
        }
        String serviceTag = event.getServiceTag();
        if (serviceTag != null) {
            sQLiteStatement.bindString(6, serviceTag);
        }
        String sessionid = event.getSessionid();
        if (sessionid != null) {
            sQLiteStatement.bindString(7, sessionid);
        }
        String sessionName = event.getSessionName();
        if (sessionName != null) {
            sQLiteStatement.bindString(8, sessionName);
        }
        String associationid = event.getAssociationid();
        if (associationid != null) {
            sQLiteStatement.bindString(9, associationid);
        }
        String pid = event.getPid();
        if (pid != null) {
            sQLiteStatement.bindString(10, pid);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, Event event) {
        cVar.clearBindings();
        Long id = event.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String evtId = event.getEvtId();
        if (evtId != null) {
            cVar.bindString(2, evtId);
        }
        String evtType = event.getEvtType();
        if (evtType != null) {
            cVar.bindString(3, evtType);
        }
        String content = event.getContent();
        if (content != null) {
            cVar.bindString(4, content);
        }
        String evtTime = event.getEvtTime();
        if (evtTime != null) {
            cVar.bindString(5, evtTime);
        }
        String serviceTag = event.getServiceTag();
        if (serviceTag != null) {
            cVar.bindString(6, serviceTag);
        }
        String sessionid = event.getSessionid();
        if (sessionid != null) {
            cVar.bindString(7, sessionid);
        }
        String sessionName = event.getSessionName();
        if (sessionName != null) {
            cVar.bindString(8, sessionName);
        }
        String associationid = event.getAssociationid();
        if (associationid != null) {
            cVar.bindString(9, associationid);
        }
        String pid = event.getPid();
        if (pid != null) {
            cVar.bindString(10, pid);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(Event event) {
        if (event != null) {
            return event.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(Event event) {
        return event.getId() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.a
    public Event readEntity(Cursor cursor, int i5) {
        int i6 = i5 + 0;
        Long valueOf = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i5 + 1;
        String string = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i5 + 2;
        String string2 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i5 + 3;
        String string3 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i5 + 4;
        String string4 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i5 + 5;
        String string5 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i5 + 6;
        String string6 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i5 + 7;
        String string7 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i5 + 8;
        int i15 = i5 + 9;
        return new Event(valueOf, string, string2, string3, string4, string5, string6, string7, cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, Event event, int i5) {
        int i6 = i5 + 0;
        event.setId(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i5 + 1;
        event.setEvtId(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i5 + 2;
        event.setEvtType(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i5 + 3;
        event.setContent(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i5 + 4;
        event.setEvtTime(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i5 + 5;
        event.setServiceTag(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i5 + 6;
        event.setSessionid(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i5 + 7;
        event.setSessionName(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i5 + 8;
        event.setAssociationid(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i5 + 9;
        event.setPid(cursor.isNull(i15) ? null : cursor.getString(i15));
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
    public final Long updateKeyAfterInsert(Event event, long j5) {
        event.setId(Long.valueOf(j5));
        return Long.valueOf(j5);
    }
}
