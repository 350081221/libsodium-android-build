package com.ss.android.socialbase.downloader.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.ss.android.socialbase.downloader.model.b.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i5) {
            return new b[i5];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private static final String f11104a = "b";

    /* renamed from: b, reason: collision with root package name */
    private int f11105b;

    /* renamed from: c, reason: collision with root package name */
    private long f11106c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicLong f11107d;

    /* renamed from: e, reason: collision with root package name */
    private long f11108e;

    /* renamed from: f, reason: collision with root package name */
    private long f11109f;

    /* renamed from: g, reason: collision with root package name */
    private int f11110g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicInteger f11111h;

    /* renamed from: i, reason: collision with root package name */
    private long f11112i;

    /* renamed from: j, reason: collision with root package name */
    private List<b> f11113j;

    /* renamed from: k, reason: collision with root package name */
    private b f11114k;

    /* renamed from: l, reason: collision with root package name */
    private int f11115l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11116m;

    /* renamed from: n, reason: collision with root package name */
    private AtomicBoolean f11117n;

    /* renamed from: o, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.h.b f11118o;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f11119a;

        /* renamed from: b, reason: collision with root package name */
        private long f11120b;

        /* renamed from: c, reason: collision with root package name */
        private long f11121c;

        /* renamed from: d, reason: collision with root package name */
        private long f11122d;

        /* renamed from: e, reason: collision with root package name */
        private long f11123e;

        /* renamed from: f, reason: collision with root package name */
        private int f11124f;

        /* renamed from: g, reason: collision with root package name */
        private long f11125g;

        /* renamed from: h, reason: collision with root package name */
        private b f11126h;

        public a(int i5) {
            this.f11119a = i5;
        }

        public a a(long j5) {
            this.f11120b = j5;
            return this;
        }

        public a b(long j5) {
            this.f11121c = j5;
            return this;
        }

        public a c(long j5) {
            this.f11122d = j5;
            return this;
        }

        public a d(long j5) {
            this.f11123e = j5;
            return this;
        }

        public a e(long j5) {
            this.f11125g = j5;
            return this;
        }

        public a a(int i5) {
            this.f11124f = i5;
            return this;
        }

        public a a(b bVar) {
            this.f11126h = bVar;
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(bm.f12336d, Integer.valueOf(this.f11105b));
        contentValues.put("chunkIndex", Integer.valueOf(this.f11110g));
        contentValues.put("startOffset", Long.valueOf(this.f11106c));
        contentValues.put("curOffset", Long.valueOf(n()));
        contentValues.put("endOffset", Long.valueOf(this.f11108e));
        contentValues.put("chunkContentLen", Long.valueOf(this.f11109f));
        contentValues.put("hostChunkIndex", Integer.valueOf(b()));
        return contentValues;
    }

    public int b() {
        AtomicInteger atomicInteger = this.f11111h;
        if (atomicInteger == null) {
            return -1;
        }
        return atomicInteger.get();
    }

    public boolean c() {
        AtomicBoolean atomicBoolean = this.f11117n;
        if (atomicBoolean == null) {
            return false;
        }
        return atomicBoolean.get();
    }

    public boolean d() {
        return b() == -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e() {
        b bVar;
        if (!d()) {
            bVar = this.f11114k;
        } else {
            bVar = this;
        }
        if (bVar != null && bVar.f()) {
            return bVar.g().get(0);
        }
        return null;
    }

    public boolean f() {
        List<b> list = this.f11113j;
        return list != null && list.size() > 0;
    }

    public List<b> g() {
        return this.f11113j;
    }

    public boolean h() {
        b bVar = this.f11114k;
        if (bVar == null) {
            return true;
        }
        if (!bVar.f()) {
            return false;
        }
        for (int i5 = 0; i5 < this.f11114k.g().size(); i5++) {
            b bVar2 = this.f11114k.g().get(i5);
            if (bVar2 != null) {
                int indexOf = this.f11114k.g().indexOf(this);
                if (indexOf > i5 && !bVar2.i()) {
                    return false;
                }
                if (indexOf == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean i() {
        long j5 = this.f11106c;
        if (d()) {
            long j6 = this.f11112i;
            if (j6 > this.f11106c) {
                j5 = j6;
            }
        }
        if (n() - j5 >= this.f11109f) {
            return true;
        }
        return false;
    }

    public long j() {
        b bVar = this.f11114k;
        if (bVar != null && bVar.g() != null) {
            int indexOf = this.f11114k.g().indexOf(this);
            boolean z4 = false;
            for (int i5 = 0; i5 < this.f11114k.g().size(); i5++) {
                b bVar2 = this.f11114k.g().get(i5);
                if (bVar2 != null) {
                    if (z4) {
                        return bVar2.n();
                    }
                    if (indexOf == i5) {
                        z4 = true;
                    }
                }
            }
        }
        return -1L;
    }

    public int k() {
        return this.f11105b;
    }

    public long l() {
        return this.f11106c;
    }

    public long m() {
        AtomicLong atomicLong = this.f11107d;
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public long n() {
        if (d() && f()) {
            long j5 = 0;
            for (int i5 = 0; i5 < this.f11113j.size(); i5++) {
                b bVar = this.f11113j.get(i5);
                if (bVar != null) {
                    if (!bVar.i()) {
                        return bVar.m();
                    }
                    if (j5 < bVar.m()) {
                        j5 = bVar.m();
                    }
                }
            }
            return j5;
        }
        return m();
    }

    public long o() {
        long n5 = n() - this.f11106c;
        if (f()) {
            n5 = 0;
            for (int i5 = 0; i5 < this.f11113j.size(); i5++) {
                b bVar = this.f11113j.get(i5);
                if (bVar != null) {
                    n5 += bVar.n() - bVar.l();
                }
            }
        }
        return n5;
    }

    public long p() {
        return this.f11108e;
    }

    public long q() {
        return this.f11109f;
    }

    public void r() {
        this.f11112i = n();
    }

    public int s() {
        return this.f11110g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        long j5;
        int i6;
        parcel.writeInt(this.f11105b);
        parcel.writeLong(this.f11106c);
        AtomicLong atomicLong = this.f11107d;
        if (atomicLong != null) {
            j5 = atomicLong.get();
        } else {
            j5 = 0;
        }
        parcel.writeLong(j5);
        parcel.writeLong(this.f11108e);
        parcel.writeLong(this.f11109f);
        parcel.writeInt(this.f11110g);
        AtomicInteger atomicInteger = this.f11111h;
        if (atomicInteger != null) {
            i6 = atomicInteger.get();
        } else {
            i6 = -1;
        }
        parcel.writeInt(i6);
    }

    private b(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11105b = aVar.f11119a;
        this.f11106c = aVar.f11120b;
        this.f11107d = new AtomicLong(aVar.f11121c);
        this.f11108e = aVar.f11122d;
        this.f11109f = aVar.f11123e;
        this.f11110g = aVar.f11124f;
        this.f11112i = aVar.f11125g;
        this.f11111h = new AtomicInteger(-1);
        a(aVar.f11126h);
        this.f11117n = new AtomicBoolean(false);
    }

    public void b(boolean z4) {
        this.f11116m = z4;
    }

    public void c(int i5) {
        this.f11110g = i5;
    }

    public void b(int i5) {
        this.f11105b = i5;
    }

    public long c(boolean z4) {
        long n5 = n();
        long j5 = this.f11109f;
        long j6 = this.f11112i;
        long j7 = j5 - (n5 - j6);
        if (!z4 && n5 == j6) {
            j7 = j5 - (n5 - this.f11106c);
        }
        com.ss.android.socialbase.downloader.c.a.b("DownloadChunk", "contentLength:" + this.f11109f + " curOffset:" + n() + " oldOffset:" + this.f11112i + " retainLen:" + j7);
        if (j7 < 0) {
            return 0L;
        }
        return j7;
    }

    public void b(long j5) {
        AtomicLong atomicLong = this.f11107d;
        if (atomicLong != null) {
            atomicLong.set(j5);
        } else {
            this.f11107d = new AtomicLong(j5);
        }
    }

    public void a(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        this.f11115l = 0;
        sQLiteStatement.clearBindings();
        int i5 = this.f11115l + 1;
        this.f11115l = i5;
        sQLiteStatement.bindLong(i5, this.f11105b);
        int i6 = this.f11115l + 1;
        this.f11115l = i6;
        sQLiteStatement.bindLong(i6, this.f11110g);
        int i7 = this.f11115l + 1;
        this.f11115l = i7;
        sQLiteStatement.bindLong(i7, this.f11106c);
        int i8 = this.f11115l + 1;
        this.f11115l = i8;
        sQLiteStatement.bindLong(i8, n());
        int i9 = this.f11115l + 1;
        this.f11115l = i9;
        sQLiteStatement.bindLong(i9, this.f11108e);
        int i10 = this.f11115l + 1;
        this.f11115l = i10;
        sQLiteStatement.bindLong(i10, this.f11109f);
        int i11 = this.f11115l + 1;
        this.f11115l = i11;
        sQLiteStatement.bindLong(i11, b());
    }

    public b(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        this.f11105b = cursor.getInt(cursor.getColumnIndex(bm.f12336d));
        this.f11110g = cursor.getInt(cursor.getColumnIndex("chunkIndex"));
        this.f11106c = cursor.getLong(cursor.getColumnIndex("startOffset"));
        int columnIndex = cursor.getColumnIndex("curOffset");
        if (columnIndex != -1) {
            this.f11107d = new AtomicLong(cursor.getLong(columnIndex));
        } else {
            this.f11107d = new AtomicLong(0L);
        }
        this.f11108e = cursor.getLong(cursor.getColumnIndex("endOffset"));
        int columnIndex2 = cursor.getColumnIndex("hostChunkIndex");
        if (columnIndex2 != -1) {
            this.f11111h = new AtomicInteger(cursor.getInt(columnIndex2));
        } else {
            this.f11111h = new AtomicInteger(-1);
        }
        int columnIndex3 = cursor.getColumnIndex("chunkContentLen");
        if (columnIndex3 != -1) {
            this.f11109f = cursor.getLong(columnIndex3);
        }
        this.f11117n = new AtomicBoolean(false);
    }

    public void a(int i5) {
        AtomicInteger atomicInteger = this.f11111h;
        if (atomicInteger == null) {
            this.f11111h = new AtomicInteger(i5);
        } else {
            atomicInteger.set(i5);
        }
    }

    public void a(com.ss.android.socialbase.downloader.h.b bVar) {
        this.f11118o = bVar;
        r();
    }

    public void a(boolean z4) {
        AtomicBoolean atomicBoolean = this.f11117n;
        if (atomicBoolean == null) {
            this.f11117n = new AtomicBoolean(z4);
        } else {
            atomicBoolean.set(z4);
        }
        this.f11118o = null;
    }

    protected b(Parcel parcel) {
        this.f11105b = parcel.readInt();
        this.f11106c = parcel.readLong();
        this.f11107d = new AtomicLong(parcel.readLong());
        this.f11108e = parcel.readLong();
        this.f11109f = parcel.readLong();
        this.f11110g = parcel.readInt();
        this.f11111h = new AtomicInteger(parcel.readInt());
    }

    public void a(b bVar) {
        this.f11114k = bVar;
        if (bVar != null) {
            a(bVar.s());
        }
    }

    public void a(List<b> list) {
        this.f11113j = list;
    }

    public void a(long j5) {
        this.f11109f = j5;
    }

    public List<b> a(int i5, long j5) {
        b bVar;
        long p5;
        long j6;
        long j7;
        long j8;
        long j9;
        b bVar2 = this;
        int i6 = i5;
        if (!d() || f()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long m5 = m();
        long c5 = bVar2.c(true);
        long j10 = c5 / i6;
        com.ss.android.socialbase.downloader.c.a.b(f11104a, "retainLen:" + c5 + " divideChunkForReuse chunkSize:" + j10 + " current host downloadChunk index:" + bVar2.f11110g);
        int i7 = 0;
        while (i7 < i6) {
            if (i7 == 0) {
                j7 = l();
                j6 = (m5 + j10) - 1;
            } else {
                int i8 = i6 - 1;
                if (i7 == i8) {
                    long p6 = p();
                    j8 = p6 > m5 ? (p6 - m5) + 1 : c5 - (i8 * j10);
                    j9 = p6;
                    j7 = m5;
                    long j11 = c5;
                    long j12 = j9;
                    b a5 = new a(bVar2.f11105b).a((-i7) - 1).a(j7).b(m5).e(m5).c(j12).d(j8).a(bVar2).a();
                    com.ss.android.socialbase.downloader.c.a.b(f11104a, "divide sub chunk : " + i7 + " startOffset:" + j7 + " curOffset:" + m5 + " endOffset:" + j12 + " contentLen:" + j8);
                    arrayList.add(a5);
                    m5 += j10;
                    i7++;
                    bVar2 = this;
                    i6 = i5;
                    c5 = j11;
                } else {
                    j6 = (m5 + j10) - 1;
                    j7 = m5;
                }
            }
            j8 = j10;
            j9 = j6;
            long j112 = c5;
            long j122 = j9;
            b a52 = new a(bVar2.f11105b).a((-i7) - 1).a(j7).b(m5).e(m5).c(j122).d(j8).a(bVar2).a();
            com.ss.android.socialbase.downloader.c.a.b(f11104a, "divide sub chunk : " + i7 + " startOffset:" + j7 + " curOffset:" + m5 + " endOffset:" + j122 + " contentLen:" + j8);
            arrayList.add(a52);
            m5 += j10;
            i7++;
            bVar2 = this;
            i6 = i5;
            c5 = j112;
        }
        long j13 = 0;
        for (int size = arrayList.size() - 1; size > 0; size--) {
            b bVar3 = arrayList.get(size);
            if (bVar3 != null) {
                j13 += bVar3.q();
            }
        }
        com.ss.android.socialbase.downloader.c.a.b(f11104a, "reuseChunkContentLen:" + j13);
        b bVar4 = arrayList.get(0);
        if (bVar4 != null) {
            if (p() == 0) {
                p5 = j5 - l();
            } else {
                p5 = (p() - l()) + 1;
            }
            bVar4.a(p5 - j13);
            bVar = this;
            bVar4.c(bVar.f11110g);
            com.ss.android.socialbase.downloader.h.b bVar5 = bVar.f11118o;
            if (bVar5 != null) {
                bVar5.a(bVar4.p(), q() - j13);
            }
        } else {
            bVar = this;
        }
        bVar.a(arrayList);
        return arrayList;
    }
}
