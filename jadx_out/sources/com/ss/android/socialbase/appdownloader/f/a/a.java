package com.ss.android.socialbase.appdownloader.f.a;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class a implements i {

    /* renamed from: b, reason: collision with root package name */
    private d f10318b;

    /* renamed from: d, reason: collision with root package name */
    private f f10320d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f10321e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10323g;

    /* renamed from: h, reason: collision with root package name */
    private int f10324h;

    /* renamed from: i, reason: collision with root package name */
    private int f10325i;

    /* renamed from: j, reason: collision with root package name */
    private int f10326j;

    /* renamed from: k, reason: collision with root package name */
    private int f10327k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f10328l;

    /* renamed from: m, reason: collision with root package name */
    private int f10329m;

    /* renamed from: n, reason: collision with root package name */
    private int f10330n;

    /* renamed from: o, reason: collision with root package name */
    private int f10331o;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10319c = false;

    /* renamed from: f, reason: collision with root package name */
    private C0195a f10322f = new C0195a();

    public a() {
        g();
    }

    private final void g() {
        this.f10324h = -1;
        this.f10325i = -1;
        this.f10326j = -1;
        this.f10327k = -1;
        this.f10328l = null;
        this.f10329m = -1;
        this.f10330n = -1;
        this.f10331o = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x018a, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r5 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.f.a.a.h():void");
    }

    public void a(InputStream inputStream) {
        a();
        if (inputStream != null) {
            this.f10318b = new d(inputStream, false);
        }
    }

    public int b() throws h, IOException {
        if (this.f10318b != null) {
            try {
                h();
                return this.f10324h;
            } catch (IOException e5) {
                a();
                throw e5;
            }
        }
        throw new h("Parser is not opened.", this, null);
    }

    @Override // com.ss.android.socialbase.appdownloader.f.a.g
    public int c() {
        return this.f10325i;
    }

    @Override // com.ss.android.socialbase.appdownloader.f.a.g
    public String d() {
        return "XML line #" + c();
    }

    public int e() {
        if (this.f10324h != 2) {
            return -1;
        }
        return this.f10328l.length / 5;
    }

    @Override // com.ss.android.socialbase.appdownloader.f.a.g
    public int f() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.appdownloader.f.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0195a {

        /* renamed from: a, reason: collision with root package name */
        private int[] f10332a = new int[32];

        /* renamed from: b, reason: collision with root package name */
        private int f10333b;

        /* renamed from: c, reason: collision with root package name */
        private int f10334c;

        public final void a() {
            this.f10333b = 0;
            this.f10334c = 0;
        }

        public final int b() {
            int i5 = this.f10333b;
            if (i5 == 0) {
                return 0;
            }
            return this.f10332a[i5 - 1];
        }

        public final boolean c() {
            int i5;
            int[] iArr;
            int i6;
            int i7 = this.f10333b;
            if (i7 == 0 || (i6 = (iArr = this.f10332a)[i7 - 1]) == 0) {
                return false;
            }
            int i8 = i6 - 1;
            int i9 = i5 - 2;
            iArr[i9] = i8;
            iArr[i9 - ((i8 * 2) + 1)] = i8;
            this.f10333b = i7 - 2;
            return true;
        }

        public final int d() {
            return this.f10334c;
        }

        public final void e() {
            a(2);
            int i5 = this.f10333b;
            int[] iArr = this.f10332a;
            iArr[i5] = 0;
            iArr[i5 + 1] = 0;
            this.f10333b = i5 + 2;
            this.f10334c++;
        }

        public final void f() {
            int i5 = this.f10333b;
            if (i5 != 0) {
                int i6 = i5 - 1;
                int i7 = this.f10332a[i6] * 2;
                if ((i6 - 1) - i7 != 0) {
                    this.f10333b = i5 - (i7 + 2);
                    this.f10334c--;
                }
            }
        }

        public final void a(int i5, int i6) {
            if (this.f10334c == 0) {
                e();
            }
            a(2);
            int i7 = this.f10333b;
            int i8 = i7 - 1;
            int[] iArr = this.f10332a;
            int i9 = iArr[i8];
            int i10 = (i8 - 1) - (i9 * 2);
            int i11 = i9 + 1;
            iArr[i10] = i11;
            iArr[i8] = i5;
            iArr[i8 + 1] = i6;
            iArr[i8 + 2] = i11;
            this.f10333b = i7 + 2;
        }

        private void a(int i5) {
            int[] iArr = this.f10332a;
            int length = iArr.length;
            int i6 = this.f10333b;
            int i7 = length - i6;
            if (i7 <= i5) {
                int[] iArr2 = new int[(iArr.length + i7) * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i6);
                this.f10332a = iArr2;
            }
        }
    }

    private final int e(int i5) {
        if (this.f10324h == 2) {
            int i6 = i5 * 5;
            if (i6 < this.f10328l.length) {
                return i6;
            }
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i5 + ").");
        }
        throw new IndexOutOfBoundsException("Current event is not START_TAG.");
    }

    public int c(int i5) {
        return this.f10328l[e(i5) + 4];
    }

    public String d(int i5) {
        int e5 = e(i5);
        int[] iArr = this.f10328l;
        if (iArr[e5 + 3] == 3) {
            return this.f10320d.a(iArr[e5 + 2]);
        }
        int i6 = iArr[e5 + 4];
        return "";
    }

    public void a() {
        if (this.f10319c) {
            this.f10319c = false;
            this.f10318b.a();
            this.f10318b = null;
            this.f10320d = null;
            this.f10321e = null;
            this.f10322f.a();
            g();
        }
    }

    public int b(int i5) {
        return this.f10328l[e(i5) + 3];
    }

    public String a(int i5) {
        int i6 = this.f10328l[e(i5) + 1];
        return i6 == -1 ? "" : this.f10320d.a(i6);
    }
}
