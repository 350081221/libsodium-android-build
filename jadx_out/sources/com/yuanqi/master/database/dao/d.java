package com.yuanqi.master.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d implements com.yuanqi.master.database.dao.c {

    /* renamed from: a, reason: collision with root package name */
    private final RoomDatabase f14581a;

    /* renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter<v2.b> f14582b;

    /* renamed from: c, reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter<v2.b> f14583c;

    /* renamed from: d, reason: collision with root package name */
    private final EntityDeletionOrUpdateAdapter<v2.b> f14584d;

    /* renamed from: e, reason: collision with root package name */
    private final SharedSQLiteStatement f14585e;

    /* loaded from: classes3.dex */
    class a extends EntityInsertionAdapter<v2.b> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull v2.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.getId());
            if (bVar.getPackageName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.getPackageName());
            }
            supportSQLiteStatement.bindLong(3, bVar.getUserId());
            if (bVar.getNoteName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, bVar.getNoteName());
            }
            if (bVar.getAppPwd() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, bVar.getAppPwd());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `AppNote` (`id`,`package_name`,`user_id`,`note_name`,`app_pwd`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* loaded from: classes3.dex */
    class b extends EntityDeletionOrUpdateAdapter<v2.b> {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull v2.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        @NonNull
        protected String createQuery() {
            return "DELETE FROM `AppNote` WHERE `id` = ?";
        }
    }

    /* loaded from: classes3.dex */
    class c extends EntityDeletionOrUpdateAdapter<v2.b> {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull v2.b bVar) {
            supportSQLiteStatement.bindLong(1, bVar.getId());
            if (bVar.getPackageName() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, bVar.getPackageName());
            }
            supportSQLiteStatement.bindLong(3, bVar.getUserId());
            if (bVar.getNoteName() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, bVar.getNoteName());
            }
            if (bVar.getAppPwd() == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindString(5, bVar.getAppPwd());
            }
            supportSQLiteStatement.bindLong(6, bVar.getId());
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        @NonNull
        protected String createQuery() {
            return "UPDATE OR ABORT `AppNote` SET `id` = ?,`package_name` = ?,`user_id` = ?,`note_name` = ?,`app_pwd` = ? WHERE `id` = ?";
        }
    }

    /* renamed from: com.yuanqi.master.database.dao.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0329d extends SharedSQLiteStatement {
        C0329d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        public String createQuery() {
            return "DELETE from AppNote where package_name=? and user_id=?";
        }
    }

    public d(@NonNull RoomDatabase roomDatabase) {
        this.f14581a = roomDatabase;
        this.f14582b = new a(roomDatabase);
        this.f14583c = new b(roomDatabase);
        this.f14584d = new c(roomDatabase);
        this.f14585e = new C0329d(roomDatabase);
    }

    @NonNull
    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    @Override // com.yuanqi.master.database.dao.c
    public void a(List<v2.b> list) {
        this.f14581a.assertNotSuspendingTransaction();
        this.f14581a.beginTransaction();
        try {
            this.f14582b.insert(list);
            this.f14581a.setTransactionSuccessful();
        } finally {
            this.f14581a.endTransaction();
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public v2.b b(String str, int i5) {
        String string;
        String string2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from AppNote where package_name=? and user_id=? limit 1", 2);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i5);
        this.f14581a.assertNotSuspendingTransaction();
        v2.b bVar = null;
        String string3 = null;
        Cursor query = DBUtil.query(this.f14581a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, bi.f12269o);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "user_id");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "note_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "app_pwd");
            if (query.moveToFirst()) {
                v2.b bVar2 = new v2.b();
                bVar2.setId(query.getInt(columnIndexOrThrow));
                if (query.isNull(columnIndexOrThrow2)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow2);
                }
                bVar2.setPackageName(string);
                bVar2.setUserId(query.getInt(columnIndexOrThrow3));
                if (query.isNull(columnIndexOrThrow4)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow4);
                }
                bVar2.setNoteName(string2);
                if (!query.isNull(columnIndexOrThrow5)) {
                    string3 = query.getString(columnIndexOrThrow5);
                }
                bVar2.setAppPwd(string3);
                bVar = bVar2;
            }
            return bVar;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public void c(v2.b bVar) {
        this.f14581a.assertNotSuspendingTransaction();
        this.f14581a.beginTransaction();
        try {
            this.f14583c.handle(bVar);
            this.f14581a.setTransactionSuccessful();
        } finally {
            this.f14581a.endTransaction();
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public void d(v2.b bVar) {
        this.f14581a.assertNotSuspendingTransaction();
        this.f14581a.beginTransaction();
        try {
            this.f14582b.insert((EntityInsertionAdapter<v2.b>) bVar);
            this.f14581a.setTransactionSuccessful();
        } finally {
            this.f14581a.endTransaction();
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public void e(v2.b bVar) {
        this.f14581a.assertNotSuspendingTransaction();
        this.f14581a.beginTransaction();
        try {
            this.f14584d.handle(bVar);
            this.f14581a.setTransactionSuccessful();
        } finally {
            this.f14581a.endTransaction();
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public void f(String str, int i5) {
        this.f14581a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f14585e.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i5);
        try {
            this.f14581a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.f14581a.setTransactionSuccessful();
            } finally {
                this.f14581a.endTransaction();
            }
        } finally {
            this.f14585e.release(acquire);
        }
    }

    @Override // com.yuanqi.master.database.dao.c
    public List<v2.b> getAll() {
        String string;
        String string2;
        String string3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select `AppNote`.`id` AS `id`, `AppNote`.`package_name` AS `package_name`, `AppNote`.`user_id` AS `user_id`, `AppNote`.`note_name` AS `note_name`, `AppNote`.`app_pwd` AS `app_pwd` from AppNote", 0);
        this.f14581a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14581a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                v2.b bVar = new v2.b();
                bVar.setId(query.getInt(0));
                if (query.isNull(1)) {
                    string = null;
                } else {
                    string = query.getString(1);
                }
                bVar.setPackageName(string);
                bVar.setUserId(query.getInt(2));
                if (query.isNull(3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(3);
                }
                bVar.setNoteName(string2);
                if (query.isNull(4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(4);
                }
                bVar.setAppPwd(string3);
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
