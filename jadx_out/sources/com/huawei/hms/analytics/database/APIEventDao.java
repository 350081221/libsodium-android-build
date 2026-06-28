package com.huawei.hms.analytics.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.umeng.analytics.pro.bm;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.i;

/* loaded from: classes3.dex */
public class APIEventDao extends a<APIEvent, Long> {
    public static final String TABLENAME = "APIEVENT";

    /* loaded from: classes3.dex */
    public static class Properties {
        public static final i lmn = new i(0, Long.class, "id", true, bm.f12336d);
        public static final i klm = new i(1, String.class, PluginConstants.KEY_ERROR_CODE, false, "CODE");
        public static final i ikl = new i(2, String.class, "timestamp", false, "TIMESTAMP");
        public static final i ijk = new i(3, String.class, "type", false, "TYPE");
        public static final i hij = new i(4, String.class, "name", false, "NAME");
        public static final i ghi = new i(5, String.class, "result", false, "RESULT");
        public static final i fgh = new i(6, String.class, MediationConstant.KEY_ERROR_CODE, false, "ERROR_CODE");
        public static final i efg = new i(7, String.class, "eventId", false, "EVENT_ID");
        public static final i def = new i(8, String.class, "eventCnt", false, "EVENT_CNT");
        public static final i cde = new i(9, String.class, WiseOpenHianalyticsData.UNION_COSTTIME, false, "COST_TIME");
    }

    public APIEventDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public APIEventDao(org.greenrobot.greendao.internal.a aVar, DaoSession daoSession) {
        super(aVar, daoSession);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        aVar.execSQL("CREATE TABLE " + (z4 ? "IF NOT EXISTS " : "") + "\"APIEVENT\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"CODE\" TEXT,\"TIMESTAMP\" TEXT,\"TYPE\" TEXT,\"NAME\" TEXT,\"RESULT\" TEXT,\"ERROR_CODE\" TEXT,\"EVENT_ID\" TEXT,\"EVENT_CNT\" TEXT,\"COST_TIME\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z4 ? "IF EXISTS " : "");
        sb.append("\"APIEVENT\"");
        aVar.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, APIEvent aPIEvent) {
        sQLiteStatement.clearBindings();
        Long id = aPIEvent.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String code = aPIEvent.getCode();
        if (code != null) {
            sQLiteStatement.bindString(2, code);
        }
        String timestamp = aPIEvent.getTimestamp();
        if (timestamp != null) {
            sQLiteStatement.bindString(3, timestamp);
        }
        String type = aPIEvent.getType();
        if (type != null) {
            sQLiteStatement.bindString(4, type);
        }
        String name = aPIEvent.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        String result = aPIEvent.getResult();
        if (result != null) {
            sQLiteStatement.bindString(6, result);
        }
        String errorCode = aPIEvent.getErrorCode();
        if (errorCode != null) {
            sQLiteStatement.bindString(7, errorCode);
        }
        String eventId = aPIEvent.getEventId();
        if (eventId != null) {
            sQLiteStatement.bindString(8, eventId);
        }
        String eventCnt = aPIEvent.getEventCnt();
        if (eventCnt != null) {
            sQLiteStatement.bindString(9, eventCnt);
        }
        String costTime = aPIEvent.getCostTime();
        if (costTime != null) {
            sQLiteStatement.bindString(10, costTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, APIEvent aPIEvent) {
        cVar.clearBindings();
        Long id = aPIEvent.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String code = aPIEvent.getCode();
        if (code != null) {
            cVar.bindString(2, code);
        }
        String timestamp = aPIEvent.getTimestamp();
        if (timestamp != null) {
            cVar.bindString(3, timestamp);
        }
        String type = aPIEvent.getType();
        if (type != null) {
            cVar.bindString(4, type);
        }
        String name = aPIEvent.getName();
        if (name != null) {
            cVar.bindString(5, name);
        }
        String result = aPIEvent.getResult();
        if (result != null) {
            cVar.bindString(6, result);
        }
        String errorCode = aPIEvent.getErrorCode();
        if (errorCode != null) {
            cVar.bindString(7, errorCode);
        }
        String eventId = aPIEvent.getEventId();
        if (eventId != null) {
            cVar.bindString(8, eventId);
        }
        String eventCnt = aPIEvent.getEventCnt();
        if (eventCnt != null) {
            cVar.bindString(9, eventCnt);
        }
        String costTime = aPIEvent.getCostTime();
        if (costTime != null) {
            cVar.bindString(10, costTime);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(APIEvent aPIEvent) {
        if (aPIEvent != null) {
            return aPIEvent.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(APIEvent aPIEvent) {
        return aPIEvent.getId() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.a
    public APIEvent readEntity(Cursor cursor, int i5) {
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
        return new APIEvent(valueOf, string, string2, string3, string4, string5, string6, string7, cursor.isNull(i14) ? null : cursor.getString(i14), cursor.isNull(i15) ? null : cursor.getString(i15));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, APIEvent aPIEvent, int i5) {
        int i6 = i5 + 0;
        aPIEvent.setId(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i5 + 1;
        aPIEvent.setCode(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i5 + 2;
        aPIEvent.setTimestamp(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i5 + 3;
        aPIEvent.setType(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i5 + 4;
        aPIEvent.setName(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i5 + 5;
        aPIEvent.setResult(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i5 + 6;
        aPIEvent.setErrorCode(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i5 + 7;
        aPIEvent.setEventId(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i5 + 8;
        aPIEvent.setEventCnt(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i5 + 9;
        aPIEvent.setCostTime(cursor.isNull(i15) ? null : cursor.getString(i15));
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
    public final Long updateKeyAfterInsert(APIEvent aPIEvent, long j5) {
        aPIEvent.setId(Long.valueOf(j5));
        return Long.valueOf(j5);
    }
}
