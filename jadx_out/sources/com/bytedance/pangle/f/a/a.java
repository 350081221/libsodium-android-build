package com.bytedance.pangle.f.a;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    int f4385a;

    /* renamed from: b, reason: collision with root package name */
    b f4386b;

    /* renamed from: c, reason: collision with root package name */
    int[] f4387c;

    /* renamed from: i, reason: collision with root package name */
    private boolean f4393i;

    /* renamed from: k, reason: collision with root package name */
    private f f4395k;

    /* renamed from: j, reason: collision with root package name */
    private boolean f4394j = false;

    /* renamed from: l, reason: collision with root package name */
    private final c f4396l = new c();

    /* renamed from: d, reason: collision with root package name */
    int f4388d = 0;

    /* renamed from: e, reason: collision with root package name */
    int f4389e = 1;

    /* renamed from: f, reason: collision with root package name */
    int f4390f = 2;

    /* renamed from: g, reason: collision with root package name */
    int f4391g = 3;

    /* renamed from: h, reason: collision with root package name */
    int f4392h = 4;

    public a() {
        c();
    }

    private int e(int i5) {
        if (this.f4385a == 2) {
            int i6 = i5 * 5;
            if (i6 < this.f4387c.length) {
                return i6;
            }
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i5 + ").");
        }
        throw new IndexOutOfBoundsException("Current event is not START_TAG.");
    }

    public final void a() {
        if (this.f4394j) {
            this.f4394j = false;
            b bVar = this.f4386b;
            InputStream inputStream = bVar.f4397a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                bVar.a((InputStream) null);
            }
            this.f4395k = null;
            this.f4386b = null;
            c cVar = this.f4396l;
            cVar.f4400b = 0;
            cVar.f4401c = 0;
            c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x021f, code lost:
    
        throw new java.io.IOException("Invalid chunk type (" + r1 + ").");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0106, code lost:
    
        throw new java.io.IOException("Invalid resource ids size (" + r1 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pangle.f.a.a.b():int");
    }

    public final int c(int i5) {
        return this.f4387c[e(i5) + 4];
    }

    public final String d(int i5) {
        int e5 = e(i5);
        int[] iArr = this.f4387c;
        if (iArr[e5 + 3] == 3) {
            return this.f4395k.a(iArr[e5 + 2]);
        }
        return "";
    }

    private void c() {
        this.f4387c = null;
        this.f4385a = -1;
    }

    public final String a(int i5) {
        int i6 = this.f4387c[e(i5) + 1];
        return i6 == -1 ? "" : this.f4395k.a(i6);
    }

    public final int b(int i5) {
        return this.f4387c[e(i5) + 3];
    }
}
