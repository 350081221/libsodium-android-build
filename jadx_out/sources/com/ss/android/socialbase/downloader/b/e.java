package com.ss.android.socialbase.downloader.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.android.dex.DexFormat;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.SQLiteInstrumentation;
import com.ss.android.socialbase.downloader.b.c;
import com.ss.android.socialbase.downloader.downloader.t;
import com.ss.android.socialbase.downloader.f.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;

@Instrumented
/* loaded from: classes3.dex */
public class e extends c.a implements t {

    /* renamed from: b, reason: collision with root package name */
    private static volatile SQLiteDatabase f10421b;

    /* renamed from: a, reason: collision with root package name */
    b f10422a;

    /* renamed from: c, reason: collision with root package name */
    private g f10423c;

    /* renamed from: d, reason: collision with root package name */
    private g f10424d;

    /* renamed from: e, reason: collision with root package name */
    private g f10425e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f10426f;

    public e() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (f10421b == null) {
            synchronized (e.class) {
                if (f10421b == null) {
                    try {
                        f10421b = a.a().getWritableDatabase();
                        this.f10423c = new g(f10421b, "downloader", com.ss.android.socialbase.downloader.constants.c.f10501a, com.ss.android.socialbase.downloader.constants.c.f10502b);
                        this.f10424d = new g(f10421b, "downloadChunk", com.ss.android.socialbase.downloader.constants.c.f10503c, com.ss.android.socialbase.downloader.constants.c.f10504d);
                        this.f10425e = new g(f10421b, "segments", com.ss.android.socialbase.downloader.constants.c.f10505e, com.ss.android.socialbase.downloader.constants.c.f10506f);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    private void i() {
        f10421b.beginTransaction();
    }

    private void j() {
        try {
            if (f10421b == null || !f10421b.inTransaction()) {
                return;
            }
            f10421b.endTransaction();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        try {
            i();
            SQLiteDatabase sQLiteDatabase = f10421b;
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.delete(sQLiteDatabase, "downloader", null, null);
            } else {
                sQLiteDatabase.delete("downloader", null, null);
            }
            SQLiteDatabase sQLiteDatabase2 = f10421b;
            if (sQLiteDatabase2 instanceof SQLiteDatabase) {
                SQLiteInstrumentation.delete(sQLiteDatabase2, "downloadChunk", null, null);
            } else {
                sQLiteDatabase2.delete("downloadChunk", null, null);
            }
            f10421b.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<DownloadInfo> b() {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<DownloadInfo> b(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void b(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<DownloadInfo> c(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<DownloadInfo> d(String str) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean e() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean e(int i5) {
        g gVar;
        h();
        if (f10421b != null && (gVar = this.f10423c) != null) {
            try {
                a(i5, gVar.b());
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean f(final int i5) {
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.11
            @Override // java.lang.Runnable
            public void run() {
                e.this.e(i5);
                e.this.d(i5);
                e.this.m(i5);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo g(int i5) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public Map<Long, i> l(int i5) {
        Cursor cursor;
        Cursor rawQuery;
        String str;
        h();
        if (f10421b != null) {
            try {
                SQLiteDatabase sQLiteDatabase = f10421b;
                String format = String.format("SELECT * FROM %s WHERE %s = ?", "segments", bm.f12336d);
                String[] strArr = {Integer.toString(i5)};
                if (!(sQLiteDatabase instanceof SQLiteDatabase)) {
                    rawQuery = sQLiteDatabase.rawQuery(format, strArr);
                } else {
                    rawQuery = SQLiteInstrumentation.rawQuery(sQLiteDatabase, format, strArr);
                }
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
                if (rawQuery.moveToNext()) {
                    int columnIndex = rawQuery.getColumnIndex("info");
                    if (columnIndex >= 0) {
                        str = rawQuery.getString(columnIndex);
                    } else {
                        str = null;
                    }
                    HashMap hashMap = new HashMap();
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        i iVar = new i(jSONArray.getJSONObject(i6));
                        hashMap.put(Long.valueOf(iVar.c()), iVar);
                    }
                    com.ss.android.socialbase.downloader.i.f.a(rawQuery);
                    return hashMap;
                }
                com.ss.android.socialbase.downloader.i.f.a(rawQuery);
            } catch (Throwable th2) {
                cursor = rawQuery;
                th = th2;
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    return null;
                } catch (Throwable th3) {
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    throw th3;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void m(int i5) {
        h();
        if (f10421b == null) {
            return;
        }
        try {
            a(i5, this.f10425e.b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public e(boolean z4) {
        this.f10422a = null;
        if (z4) {
            this.f10426f = false;
            a();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo b(int i5) {
        Cursor cursor;
        Cursor rawQuery;
        h();
        if (f10421b != null) {
            try {
                SQLiteDatabase sQLiteDatabase = f10421b;
                String format = String.format("SELECT * FROM %s WHERE %s = ?", "downloader", bm.f12336d);
                String[] strArr = {Integer.toString(i5)};
                rawQuery = !(sQLiteDatabase instanceof SQLiteDatabase) ? sQLiteDatabase.rawQuery(format, strArr) : SQLiteInstrumentation.rawQuery(sQLiteDatabase, format, strArr);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
                if (rawQuery.moveToNext()) {
                    DownloadInfo downloadInfo = new DownloadInfo(rawQuery);
                    com.ss.android.socialbase.downloader.i.f.a(rawQuery);
                    return downloadInfo;
                }
                com.ss.android.socialbase.downloader.i.f.a(rawQuery);
            } catch (Throwable th2) {
                cursor = rawQuery;
                th = th2;
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    return null;
                } catch (Throwable th3) {
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    throw th3;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<com.ss.android.socialbase.downloader.model.b> c(int i5) {
        ArrayList arrayList = new ArrayList();
        h();
        if (f10421b != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = f10421b;
                String format = String.format("SELECT * FROM %s WHERE %s = ?", "downloadChunk", bm.f12336d);
                String[] strArr = {Integer.toString(i5)};
                cursor = !(sQLiteDatabase instanceof SQLiteDatabase) ? sQLiteDatabase.rawQuery(format, strArr) : SQLiteInstrumentation.rawQuery(sQLiteDatabase, format, strArr);
                while (cursor.moveToNext()) {
                    arrayList.add(new com.ss.android.socialbase.downloader.model.b(cursor));
                }
                com.ss.android.socialbase.downloader.i.f.a(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                } catch (Throwable th2) {
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void d(final int i5) {
        h();
        if (f10421b == null || this.f10424d == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.a(i5, e.this.f10424d.b());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo i(int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo j(int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-7));
        a(i5, contentValues);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        try {
            if (!a(downloadInfo.getId())) {
                c(downloadInfo);
            } else {
                g gVar = this.f10423c;
                if (gVar == null) {
                    return;
                }
                try {
                    b(downloadInfo, gVar.c());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo e(int i5, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-4));
        contentValues.put("curBytes", Long.valueOf(j5));
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public ArrayList<i> n(int i5) {
        Map<Long, i> l5 = l(i5);
        if (l5 == null || l5.isEmpty()) {
            return null;
        }
        return new ArrayList<>(l5.values());
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo h(int i5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put("isFirstDownload", (Integer) 0);
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void b(com.ss.android.socialbase.downloader.model.b bVar) {
        a(bVar);
    }

    private void b(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, downloadInfo.getId());
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a() {
        a(new SparseArray<>(), new SparseArray<>(), (d) null);
    }

    private void c(final DownloadInfo downloadInfo) {
        h();
        if (f10421b == null || this.f10423c == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e eVar = e.this;
                    eVar.a(downloadInfo, eVar.f10423c.a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.t
    public void a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<com.ss.android.socialbase.downloader.model.b>> sparseArray2, final d dVar) {
        try {
            Runnable runnable = new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.1
                /* JADX WARN: Code restructure failed: missing block: B:101:0x01b7, code lost:
                
                    if (r0 == null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x0284, code lost:
                
                    if (r0 == null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:0x028e, code lost:
                
                    if (r0 == null) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:187:0x0349, code lost:
                
                    if (r0 == null) goto L174;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:188:0x035c, code lost:
                
                    r18.f10430d.a(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:189:0x0365, code lost:
                
                    throw r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:190:0x0354, code lost:
                
                    r0.a();
                    r18.f10430d.f10426f = true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:195:0x0352, code lost:
                
                    if (r0 == null) goto L174;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
                
                    if (r0 != null) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x01c1, code lost:
                
                    r18.f10430d.a(r2, r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x0292, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
                
                    r0.a();
                    r18.f10430d.f10426f = true;
                 */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 896
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.b.e.AnonymousClass1.run():void");
                }
            };
            ExecutorService r5 = com.ss.android.socialbase.downloader.downloader.c.r();
            if (r5 != null) {
                r5.execute(runnable);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo d(int i5, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-2));
        contentValues.put("curBytes", Long.valueOf(j5));
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void c() {
        h();
        if (f10421b == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.2
            @Override // java.lang.Runnable
            public void run() {
                e.this.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<DownloadInfo> list) {
        if (list == null) {
            return;
        }
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    com.ss.android.socialbase.downloader.i.f.b(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean d() {
        return this.f10426f;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo b(int i5, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-1));
        contentValues.put("curBytes", Long.valueOf(j5));
        if (j5 > 0) {
            contentValues.put("isFirstDownload", (Integer) 0);
        }
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo c(int i5, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-3));
        contentValues.put("curBytes", Long.valueOf(j5));
        contentValues.put("isFirstDownload", (Integer) 0);
        contentValues.put("isFirstSuccess", (Integer) 0);
        a(i5, contentValues);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<DownloadInfo> list, List<Integer> list2, SparseArray<DownloadInfo> sparseArray, SparseArray<DownloadInfo> sparseArray2, SparseArray<List<com.ss.android.socialbase.downloader.model.b>> sparseArray3) {
        int size = sparseArray.size();
        if (size < 0 || f10421b == null) {
            return;
        }
        synchronized (f10421b) {
            try {
                try {
                    i();
                    if (!list.isEmpty()) {
                        if (com.ss.android.socialbase.downloader.g.a.c().a("clear_invalid_task_error")) {
                            String[] strArr = new String[list.size()];
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                strArr[i5] = String.valueOf(list.get(i5));
                            }
                            String str = "CAST(_id AS TEXT) IN (" + new String(new char[list.size() - 1]).replace(DexFormat.MAGIC_SUFFIX, "?,") + "?)";
                            SQLiteDatabase sQLiteDatabase = f10421b;
                            if (sQLiteDatabase instanceof SQLiteDatabase) {
                                SQLiteInstrumentation.delete(sQLiteDatabase, "downloader", str, strArr);
                            } else {
                                sQLiteDatabase.delete("downloader", str, strArr);
                            }
                            SQLiteDatabase sQLiteDatabase2 = f10421b;
                            if (sQLiteDatabase2 instanceof SQLiteDatabase) {
                                SQLiteInstrumentation.delete(sQLiteDatabase2, "downloadChunk", str, strArr);
                            } else {
                                sQLiteDatabase2.delete("downloadChunk", str, strArr);
                            }
                        } else {
                            String join = TextUtils.join(", ", list2);
                            SQLiteDatabase sQLiteDatabase3 = f10421b;
                            String[] strArr2 = {join};
                            if (sQLiteDatabase3 instanceof SQLiteDatabase) {
                                SQLiteInstrumentation.delete(sQLiteDatabase3, "downloader", "_id IN (?)", strArr2);
                            } else {
                                sQLiteDatabase3.delete("downloader", "_id IN (?)", strArr2);
                            }
                            SQLiteDatabase sQLiteDatabase4 = f10421b;
                            String[] strArr3 = {join};
                            if (sQLiteDatabase4 instanceof SQLiteDatabase) {
                                SQLiteInstrumentation.delete(sQLiteDatabase4, "downloadChunk", "_id IN (?)", strArr3);
                            } else {
                                sQLiteDatabase4.delete("downloadChunk", "_id IN (?)", strArr3);
                            }
                        }
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = sparseArray.keyAt(i6);
                        DownloadInfo downloadInfo = sparseArray.get(keyAt);
                        SQLiteDatabase sQLiteDatabase5 = f10421b;
                        String[] strArr4 = {String.valueOf(keyAt)};
                        if (sQLiteDatabase5 instanceof SQLiteDatabase) {
                            SQLiteInstrumentation.delete(sQLiteDatabase5, "downloader", "_id = ?", strArr4);
                        } else {
                            sQLiteDatabase5.delete("downloader", "_id = ?", strArr4);
                        }
                        SQLiteDatabase sQLiteDatabase6 = f10421b;
                        ContentValues contentValues = downloadInfo.toContentValues();
                        if (sQLiteDatabase6 instanceof SQLiteDatabase) {
                            SQLiteInstrumentation.insert(sQLiteDatabase6, "downloader", null, contentValues);
                        } else {
                            sQLiteDatabase6.insert("downloader", null, contentValues);
                        }
                        if (downloadInfo.getChunkCount() > 1) {
                            List<com.ss.android.socialbase.downloader.model.b> c5 = c(keyAt);
                            if (c5.size() > 0) {
                                SQLiteDatabase sQLiteDatabase7 = f10421b;
                                String[] strArr5 = {String.valueOf(keyAt)};
                                if (sQLiteDatabase7 instanceof SQLiteDatabase) {
                                    SQLiteInstrumentation.delete(sQLiteDatabase7, "downloadChunk", "_id = ?", strArr5);
                                } else {
                                    sQLiteDatabase7.delete("downloadChunk", "_id = ?", strArr5);
                                }
                                for (com.ss.android.socialbase.downloader.model.b bVar : c5) {
                                    bVar.b(downloadInfo.getId());
                                    SQLiteDatabase sQLiteDatabase8 = f10421b;
                                    ContentValues a5 = bVar.a();
                                    if (sQLiteDatabase8 instanceof SQLiteDatabase) {
                                        SQLiteInstrumentation.insert(sQLiteDatabase8, "downloadChunk", null, a5);
                                    } else {
                                        sQLiteDatabase8.insert("downloadChunk", null, a5);
                                    }
                                }
                            }
                        }
                    }
                    if (sparseArray2 != null && sparseArray3 != null) {
                        int size2 = sparseArray2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            int id = sparseArray2.valueAt(i7).getId();
                            List<com.ss.android.socialbase.downloader.model.b> a6 = com.ss.android.socialbase.downloader.i.f.a(c(id));
                            if (a6 != null && a6.size() > 0) {
                                sparseArray3.put(id, a6);
                            }
                        }
                    }
                    f10421b.setTransactionSuccessful();
                } finally {
                    try {
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        try {
            d(i5);
            if (list != null) {
                for (com.ss.android.socialbase.downloader.model.b bVar : list) {
                    if (bVar != null) {
                        a(bVar);
                        if (bVar.f()) {
                            Iterator<com.ss.android.socialbase.downloader.model.b> it = bVar.g().iterator();
                            while (it.hasNext()) {
                                a(it.next());
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0036 -> B:17:0x003e). Please report as a decompilation issue!!! */
    public void b(int i5, ContentValues contentValues) {
        int i6 = 10;
        while (f10421b.isDbLockedByCurrentThread() && i6 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5L);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        try {
            SQLiteDatabase sQLiteDatabase = f10421b;
            String[] strArr = {String.valueOf(i5)};
            if (sQLiteDatabase instanceof SQLiteDatabase) {
                SQLiteInstrumentation.update(sQLiteDatabase, "downloader", contentValues, "_id = ? ", strArr);
            } else {
                sQLiteDatabase.update("downloader", contentValues, "_id = ? ", strArr);
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean a(int i5) {
        try {
            return b(i5) != null;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public List<DownloadInfo> a(String str) {
        h();
        ArrayList arrayList = new ArrayList();
        if (f10421b != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase = f10421b;
                String format = String.format("SELECT * FROM %s WHERE %s = ?", "downloader", "url");
                String[] strArr = {str};
                cursor = !(sQLiteDatabase instanceof SQLiteDatabase) ? sQLiteDatabase.rawQuery(format, strArr) : SQLiteInstrumentation.rawQuery(sQLiteDatabase, format, strArr);
                if (cursor.moveToNext()) {
                    arrayList.add(new DownloadInfo(cursor));
                }
                com.ss.android.socialbase.downloader.i.f.a(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                } catch (Throwable th2) {
                    com.ss.android.socialbase.downloader.i.f.a(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                sQLiteStatement.bindLong(1, i5);
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(final com.ss.android.socialbase.downloader.model.b bVar) {
        h();
        if (f10421b == null || this.f10424d == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.a(bVar, e.this.f10424d.a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.executeInsert();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ss.android.socialbase.downloader.model.b bVar, SQLiteStatement sQLiteStatement) {
        if (bVar == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                bVar.a(sQLiteStatement);
                sQLiteStatement.executeInsert();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(final int i5, final int i6, final long j5) {
        h();
        if (i5 == 0 || i6 < 0 || j5 < 0 || f10421b == null || this.f10424d == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.a(i5, i6, j5, e.this.f10424d.c());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(final int i5, final int i6, final int i7, final long j5) {
        h();
        if (i5 == 0 || i6 < 0 || i7 < 0 || j5 < 0 || f10421b == null || this.f10424d == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.a(i5, i6, i7, j5, e.this.f10424d.c());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(final int i5, final int i6, final int i7, final int i8) {
        h();
        if (i5 == 0 || i7 < 0 || i8 == i6 || i8 < 0 || f10421b == null || this.f10424d == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    e.this.a(i5, i6, i7, i8, e.this.f10424d.c());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, int i7, int i8, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chunkIndex", Integer.valueOf(i8));
                SQLiteDatabase sQLiteDatabase = f10421b;
                String[] strArr = {Integer.toString(i5), Integer.toString(i6), Integer.toString(i7)};
                if (sQLiteDatabase instanceof SQLiteDatabase) {
                    SQLiteInstrumentation.update(sQLiteDatabase, "downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", strArr);
                } else {
                    sQLiteDatabase.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", strArr);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, long j5, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j5));
                SQLiteDatabase sQLiteDatabase = f10421b;
                String[] strArr = {Integer.toString(i5), Integer.toString(i6)};
                if (sQLiteDatabase instanceof SQLiteDatabase) {
                    SQLiteInstrumentation.update(sQLiteDatabase, "downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", strArr);
                } else {
                    sQLiteDatabase.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ?", strArr);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5, int i6, int i7, long j5, SQLiteStatement sQLiteStatement) {
        try {
            synchronized (sQLiteStatement) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("curOffset", Long.valueOf(j5));
                SQLiteDatabase sQLiteDatabase = f10421b;
                String[] strArr = {Integer.toString(i5), Integer.toString(i6), Integer.toString(i7)};
                if (sQLiteDatabase instanceof SQLiteDatabase) {
                    SQLiteInstrumentation.update(sQLiteDatabase, "downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", strArr);
                } else {
                    sQLiteDatabase.update("downloadChunk", contentValues, "_id = ? AND chunkIndex = ? AND hostChunkIndex = ?", strArr);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo a(int i5, int i6) {
        h();
        if (f10421b == null) {
            return null;
        }
        int i7 = 10;
        while (f10421b.isDbLockedByCurrentThread() && i7 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5L);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("chunkCount", Integer.valueOf(i6));
        SQLiteDatabase sQLiteDatabase = f10421b;
        String[] strArr = {Integer.toString(i5)};
        if (sQLiteDatabase instanceof SQLiteDatabase) {
            SQLiteInstrumentation.update(sQLiteDatabase, "downloader", contentValues, "_id = ? ", strArr);
        } else {
            sQLiteDatabase.update("downloader", contentValues, "_id = ? ", strArr);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public boolean a(final DownloadInfo downloadInfo) {
        h();
        if (downloadInfo == null || f10421b == null) {
            return false;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.10
            @Override // java.lang.Runnable
            public void run() {
                e.this.d(downloadInfo);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo a(int i5, long j5, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put("totalBytes", Long.valueOf(j5));
        contentValues.put("eTag", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public DownloadInfo a(int i5, long j5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put("curBytes", Long.valueOf(j5));
        a(i5, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean a(int i5, Map<Long, i> map) {
        long currentTimeMillis = System.currentTimeMillis();
        h();
        if (f10421b == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<Long> it = map.keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(map.get(Long.valueOf(it.next().longValue())).k());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        Log.d("SqlDownloadCache", "json=" + jSONArray);
        SQLiteStatement d5 = this.f10425e.d();
        synchronized (d5) {
            d5.clearBindings();
            d5.bindLong(1, i5);
            d5.bindString(2, jSONArray.toString());
            d5.execute();
        }
        com.ss.android.socialbase.downloader.c.a.b("SqlDownloadCache", "updateSegments cost=" + com.ss.android.socialbase.downloader.i.f.c(currentTimeMillis));
        return false;
    }

    private void a(final int i5, final ContentValues contentValues) {
        h();
        if (f10421b == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.c.c(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.b(i5, contentValues);
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.b.c
    public void a(b bVar) {
        this.f10422a = bVar;
    }

    public void a(SparseArray<DownloadInfo> sparseArray, SparseArray<List<com.ss.android.socialbase.downloader.model.b>> sparseArray2) {
        try {
            HashMap a5 = com.ss.android.socialbase.downloader.i.f.a(sparseArray);
            HashMap a6 = com.ss.android.socialbase.downloader.i.f.a(sparseArray2);
            b bVar = this.f10422a;
            if (bVar != null) {
                bVar.a(a5, a6);
            }
        } catch (Throwable unused) {
        }
    }
}
