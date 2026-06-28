package com.yuanqi.master.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class f implements com.yuanqi.master.database.dao.e {

    /* renamed from: a, reason: collision with root package name */
    private final RoomDatabase f14590a;

    /* renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter<v2.c> f14591b;

    /* renamed from: c, reason: collision with root package name */
    private final com.yuanqi.master.tools.c f14592c = new com.yuanqi.master.tools.c();

    /* renamed from: d, reason: collision with root package name */
    private final SharedSQLiteStatement f14593d;

    /* renamed from: e, reason: collision with root package name */
    private final SharedSQLiteStatement f14594e;

    /* loaded from: classes3.dex */
    class a extends EntityInsertionAdapter<v2.c> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull v2.c cVar) {
            supportSQLiteStatement.bindLong(1, cVar.l());
            if (cVar.k() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, cVar.k());
            }
            if (cVar.o() == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, cVar.o());
            }
            if (cVar.j() == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, cVar.j());
            }
            supportSQLiteStatement.bindDouble(5, cVar.m());
            supportSQLiteStatement.bindDouble(6, cVar.n());
            Long a5 = f.this.f14592c.a(cVar.p());
            if (a5 == null) {
                supportSQLiteStatement.bindNull(7);
            } else {
                supportSQLiteStatement.bindLong(7, a5.longValue());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `history` (`id`,`app_name`,`package_name`,`address`,`latitude`,`longitude`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    /* loaded from: classes3.dex */
    class b extends SharedSQLiteStatement {
        b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        public String createQuery() {
            return "DELETE FROM history WHERE package_name = ?";
        }
    }

    /* loaded from: classes3.dex */
    class c extends SharedSQLiteStatement {
        c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        public String createQuery() {
            return "DELETE FROM history";
        }
    }

    /* loaded from: classes3.dex */
    class d implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v2.c f14598a;

        d(v2.c cVar) {
            this.f14598a = cVar;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            f.this.f14590a.beginTransaction();
            try {
                f.this.f14591b.insert((EntityInsertionAdapter) this.f14598a);
                f.this.f14590a.setTransactionSuccessful();
                f.this.f14590a.endTransaction();
                return null;
            } catch (Throwable th) {
                f.this.f14590a.endTransaction();
                throw th;
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14600a;

        e(String str) {
            this.f14600a = str;
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            SupportSQLiteStatement acquire = f.this.f14593d.acquire();
            String str = this.f14600a;
            if (str == null) {
                acquire.bindNull(1);
            } else {
                acquire.bindString(1, str);
            }
            try {
                f.this.f14590a.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    f.this.f14590a.setTransactionSuccessful();
                    f.this.f14593d.release(acquire);
                    return null;
                } finally {
                    f.this.f14590a.endTransaction();
                }
            } catch (Throwable th) {
                f.this.f14593d.release(acquire);
                throw th;
            }
        }
    }

    /* renamed from: com.yuanqi.master.database.dao.f$f, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class CallableC0330f implements Callable<Void> {
        CallableC0330f() {
        }

        @Override // java.util.concurrent.Callable
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            SupportSQLiteStatement acquire = f.this.f14594e.acquire();
            try {
                f.this.f14590a.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    f.this.f14590a.setTransactionSuccessful();
                    f.this.f14594e.release(acquire);
                    return null;
                } finally {
                    f.this.f14590a.endTransaction();
                }
            } catch (Throwable th) {
                f.this.f14594e.release(acquire);
                throw th;
            }
        }
    }

    public f(@NonNull RoomDatabase roomDatabase) {
        this.f14590a = roomDatabase;
        this.f14591b = new a(roomDatabase);
        this.f14593d = new b(roomDatabase);
        this.f14594e = new c(roomDatabase);
    }

    @NonNull
    public static List<Class<?>> i() {
        return Collections.emptyList();
    }

    @Override // com.yuanqi.master.database.dao.e
    public List<v2.c> a(String str) {
        String string;
        String string2;
        String string3;
        Long valueOf;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from history where package_name=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14590a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14590a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "app_name");
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, bi.f12269o);
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "address");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "latitude");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "longitude");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i5 = query.getInt(columnIndexOrThrow);
                if (query.isNull(columnIndexOrThrow2)) {
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow2);
                }
                if (query.isNull(columnIndexOrThrow3)) {
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                }
                double d5 = query.getDouble(columnIndexOrThrow5);
                double d6 = query.getDouble(columnIndexOrThrow6);
                if (query.isNull(columnIndexOrThrow7)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(columnIndexOrThrow7));
                }
                arrayList.add(new v2.c(i5, string, string2, string3, d5, d6, this.f14592c.b(valueOf)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.yuanqi.master.database.dao.e
    public io.reactivex.rxjava3.core.c b(v2.c cVar) {
        return io.reactivex.rxjava3.core.c.Y(new d(cVar));
    }

    @Override // com.yuanqi.master.database.dao.e
    public io.reactivex.rxjava3.core.c c(String str) {
        return io.reactivex.rxjava3.core.c.Y(new e(str));
    }

    @Override // com.yuanqi.master.database.dao.e
    public io.reactivex.rxjava3.core.c deleteAll() {
        return io.reactivex.rxjava3.core.c.Y(new CallableC0330f());
    }

    @Override // com.yuanqi.master.database.dao.e
    public List<v2.c> getAll() {
        String string;
        String string2;
        String string3;
        Long valueOf;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select `history`.`id` AS `id`, `history`.`app_name` AS `app_name`, `history`.`package_name` AS `package_name`, `history`.`address` AS `address`, `history`.`latitude` AS `latitude`, `history`.`longitude` AS `longitude`, `history`.`timestamp` AS `timestamp` from history ORDER BY timestamp DESC", 0);
        this.f14590a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14590a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                int i5 = query.getInt(0);
                if (query.isNull(1)) {
                    string = null;
                } else {
                    string = query.getString(1);
                }
                if (query.isNull(2)) {
                    string2 = null;
                } else {
                    string2 = query.getString(2);
                }
                if (query.isNull(3)) {
                    string3 = null;
                } else {
                    string3 = query.getString(3);
                }
                double d5 = query.getDouble(4);
                double d6 = query.getDouble(5);
                if (query.isNull(6)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(6));
                }
                arrayList.add(new v2.c(i5, string, string2, string3, d5, d6, this.f14592c.b(valueOf)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
