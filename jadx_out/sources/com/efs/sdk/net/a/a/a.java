package com.efs.sdk.net.a.a;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class a extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f6780a;

    public a(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i5) {
        ((FilterOutputStream) this).out.write(i5);
        this.f6780a++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i6) {
        ((FilterOutputStream) this).out.write(bArr, i5, i6);
        this.f6780a += i6;
    }
}
