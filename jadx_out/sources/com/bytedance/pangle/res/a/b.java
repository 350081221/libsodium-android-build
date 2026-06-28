package com.bytedance.pangle.res.a;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    g f4548c;

    /* renamed from: i, reason: collision with root package name */
    private final h f4554i;

    /* renamed from: j, reason: collision with root package name */
    private final byte[] f4555j;

    /* renamed from: l, reason: collision with root package name */
    private int[] f4557l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4559n;

    /* renamed from: o, reason: collision with root package name */
    private int f4560o;

    /* renamed from: p, reason: collision with root package name */
    private int[] f4561p;

    /* renamed from: q, reason: collision with root package name */
    private int f4562q;

    /* renamed from: a, reason: collision with root package name */
    HashMap<Integer, Integer> f4546a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    boolean f4547b = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4556k = false;

    /* renamed from: m, reason: collision with root package name */
    private final a f4558m = new a();

    /* renamed from: d, reason: collision with root package name */
    int f4549d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f4550e = 1;

    /* renamed from: f, reason: collision with root package name */
    int f4551f = 2;

    /* renamed from: g, reason: collision with root package name */
    int f4552g = 3;

    /* renamed from: h, reason: collision with root package name */
    int f4553h = 4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        int[] f4563a = new int[32];

        /* renamed from: b, reason: collision with root package name */
        int f4564b;

        /* renamed from: c, reason: collision with root package name */
        int f4565c;

        public final void a() {
            b();
            int i5 = this.f4564b;
            int[] iArr = this.f4563a;
            iArr[i5] = 0;
            iArr[i5 + 1] = 0;
            this.f4564b = i5 + 2;
            this.f4565c++;
        }

        final void b() {
            int[] iArr = this.f4563a;
            int length = iArr.length;
            int i5 = this.f4564b;
            int i6 = length - i5;
            if (i6 > 2) {
                return;
            }
            int[] iArr2 = new int[(iArr.length + i6) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.f4563a = iArr2;
        }
    }

    public b(byte[] bArr, h hVar) {
        this.f4554i = hVar;
        this.f4555j = bArr;
        c();
    }

    private void c() {
        this.f4560o = -1;
        this.f4561p = null;
        this.f4562q = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0290, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r6 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0128, code lost:
    
        throw new java.io.IOException("Invalid resource ids size (" + r6 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.res.a.b.d():void");
    }

    public final void a() {
        if (!this.f4556k) {
            return;
        }
        this.f4556k = false;
        this.f4548c = null;
        this.f4557l = null;
        a aVar = this.f4558m;
        aVar.f4564b = 0;
        aVar.f4565c = 0;
        c();
    }

    public final int b() {
        if (this.f4548c != null) {
            try {
                d();
                return this.f4560o;
            } catch (IOException e5) {
                a();
                throw e5;
            }
        }
        throw new RuntimeException("Parser is not opened.");
    }
}
