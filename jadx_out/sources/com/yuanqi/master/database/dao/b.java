package com.yuanqi.master.database.dao;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class b implements com.yuanqi.master.database.dao.a {

    /* renamed from: a, reason: collision with root package name */
    private final RoomDatabase f14578a;

    /* renamed from: b, reason: collision with root package name */
    private final EntityInsertionAdapter<v2.a> f14579b;

    /* loaded from: classes3.dex */
    class a extends EntityInsertionAdapter<v2.a> {
        a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull v2.a aVar) {
            supportSQLiteStatement.bindLong(1, aVar.b());
            if (aVar.a() == null) {
                supportSQLiteStatement.bindNull(2);
            } else {
                supportSQLiteStatement.bindString(2, aVar.a());
            }
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `AdModel` (`id`,`date`) VALUES (nullif(?, 0),?)";
        }
    }

    public b(@NonNull RoomDatabase roomDatabase) {
        this.f14578a = roomDatabase;
        this.f14579b = new a(roomDatabase);
    }

    @NonNull
    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // com.yuanqi.master.database.dao.a
    public v2.a a(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from AdModel where date=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f14578a.assertNotSuspendingTransaction();
        v2.a aVar = null;
        String string = null;
        Cursor query = DBUtil.query(this.f14578a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "date");
            if (query.moveToFirst()) {
                v2.a aVar2 = new v2.a();
                aVar2.d(query.getInt(columnIndexOrThrow));
                if (!query.isNull(columnIndexOrThrow2)) {
                    string = query.getString(columnIndexOrThrow2);
                }
                aVar2.c(string);
                aVar = aVar2;
            }
            return aVar;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // com.yuanqi.master.database.dao.a
    public void b(v2.a aVar) {
        this.f14578a.assertNotSuspendingTransaction();
        this.f14578a.beginTransaction();
        try {
            this.f14579b.insert((EntityInsertionAdapter<v2.a>) aVar);
            this.f14578a.setTransactionSuccessful();
        } finally {
            this.f14578a.endTransaction();
        }
    }

    @Override // com.yuanqi.master.database.dao.a
    public List<v2.a> getAll() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select `AdModel`.`id` AS `id`, `AdModel`.`date` AS `date` from AdModel", 0);
        this.f14578a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f14578a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                v2.a aVar = new v2.a();
                aVar.d(query.getInt(0));
                if (query.isNull(1)) {
                    string = null;
                } else {
                    string = query.getString(1);
                }
                aVar.c(string);
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
