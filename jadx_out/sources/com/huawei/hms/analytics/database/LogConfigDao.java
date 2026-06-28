package com.huawei.hms.analytics.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huawei.hms.analytics.bf;
import com.umeng.analytics.pro.bm;
import org.greenrobot.greendao.a;
import org.greenrobot.greendao.database.c;
import org.greenrobot.greendao.i;

/* loaded from: classes3.dex */
public class LogConfigDao extends a<LogConfig, Long> {
    public static final String TABLENAME = "ha_lgcf";

    /* loaded from: classes3.dex */
    public static class Properties {
        public static final i lmn = new i(0, Long.class, "id", true, bm.f12336d);
        public static final i klm = new i(1, String.class, "region", false, "_eg");
        public static final i ikl = new i(2, String.class, "projectId", false, "lg_pid");
        public static final i ijk = new i(3, String.class, "logGroupId", false, "lg_gid");
        public static final i hij = new i(4, String.class, "logStreamId", false, "lg_sid");
        public static final i ghi = new i(5, String.class, "logTags", false, "lg_tag");
    }

    public LogConfigDao(org.greenrobot.greendao.internal.a aVar) {
        super(aVar);
    }

    public LogConfigDao(org.greenrobot.greendao.internal.a aVar, bf bfVar) {
        super(aVar, bfVar);
    }

    public static void createTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        aVar.execSQL("CREATE TABLE " + (z4 ? "IF NOT EXISTS " : "") + "\"ha_lgcf\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"_eg\" TEXT,\"lg_pid\" TEXT,\"lg_gid\" TEXT,\"lg_sid\" TEXT,\"lg_tag\" TEXT);");
    }

    public static void dropTable(org.greenrobot.greendao.database.a aVar, boolean z4) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z4 ? "IF EXISTS " : "");
        sb.append("\"ha_lgcf\"");
        aVar.execSQL(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(SQLiteStatement sQLiteStatement, LogConfig logConfig) {
        sQLiteStatement.clearBindings();
        Long id = logConfig.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String region = logConfig.getRegion();
        if (region != null) {
            sQLiteStatement.bindString(2, region);
        }
        String projectId = logConfig.getProjectId();
        if (projectId != null) {
            sQLiteStatement.bindString(3, projectId);
        }
        String logGroupId = logConfig.getLogGroupId();
        if (logGroupId != null) {
            sQLiteStatement.bindString(4, logGroupId);
        }
        String logStreamId = logConfig.getLogStreamId();
        if (logStreamId != null) {
            sQLiteStatement.bindString(5, logStreamId);
        }
        String logTags = logConfig.getLogTags();
        if (logTags != null) {
            sQLiteStatement.bindString(6, logTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final void bindValues(c cVar, LogConfig logConfig) {
        cVar.clearBindings();
        Long id = logConfig.getId();
        if (id != null) {
            cVar.bindLong(1, id.longValue());
        }
        String region = logConfig.getRegion();
        if (region != null) {
            cVar.bindString(2, region);
        }
        String projectId = logConfig.getProjectId();
        if (projectId != null) {
            cVar.bindString(3, projectId);
        }
        String logGroupId = logConfig.getLogGroupId();
        if (logGroupId != null) {
            cVar.bindString(4, logGroupId);
        }
        String logStreamId = logConfig.getLogStreamId();
        if (logStreamId != null) {
            cVar.bindString(5, logStreamId);
        }
        String logTags = logConfig.getLogTags();
        if (logTags != null) {
            cVar.bindString(6, logTags);
        }
    }

    @Override // org.greenrobot.greendao.a
    public Long getKey(LogConfig logConfig) {
        if (logConfig != null) {
            return logConfig.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.a
    public boolean hasKey(LogConfig logConfig) {
        return logConfig.getId() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.greenrobot.greendao.a
    public final boolean isEntityUpdateable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.a
    public LogConfig readEntity(Cursor cursor, int i5) {
        int i6 = i5 + 0;
        Long valueOf = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i5 + 1;
        String string = cursor.isNull(i7) ? null : cursor.getString(i7);
        int i8 = i5 + 2;
        String string2 = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i5 + 3;
        String string3 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i5 + 4;
        int i11 = i5 + 5;
        return new LogConfig(valueOf, string, string2, string3, cursor.isNull(i10) ? null : cursor.getString(i10), cursor.isNull(i11) ? null : cursor.getString(i11));
    }

    @Override // org.greenrobot.greendao.a
    public void readEntity(Cursor cursor, LogConfig logConfig, int i5) {
        int i6 = i5 + 0;
        logConfig.setId(cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6)));
        int i7 = i5 + 1;
        logConfig.setRegion(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i5 + 2;
        logConfig.setProjectId(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i5 + 3;
        logConfig.setLogGroupId(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i5 + 4;
        logConfig.setLogStreamId(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i5 + 5;
        logConfig.setLogStreamId(cursor.isNull(i11) ? null : cursor.getString(i11));
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
    public final Long updateKeyAfterInsert(LogConfig logConfig, long j5) {
        logConfig.setId(Long.valueOf(j5));
        return Long.valueOf(j5);
    }
}
