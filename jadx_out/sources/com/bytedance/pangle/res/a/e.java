package com.bytedance.pangle.res.a;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class e extends j {

    /* renamed from: a, reason: collision with root package name */
    private long f4571a;

    public e(InputStream inputStream) {
        super(inputStream);
    }

    @Override // com.bytedance.pangle.res.a.j
    protected final synchronized void a(int i5) {
        if (i5 != -1) {
            this.f4571a += i5;
        }
    }

    public final synchronized long b() {
        return this.f4571a;
    }

    @Override // com.bytedance.pangle.res.a.j, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j5) {
        long skip;
        skip = super.skip(j5);
        this.f4571a += skip;
        return skip;
    }

    public final int a() {
        long b5 = b();
        if (b5 <= 2147483647L) {
            return (int) b5;
        }
        throw new ArithmeticException("The byte count " + b5 + " is too large to be converted to an int");
    }
}
