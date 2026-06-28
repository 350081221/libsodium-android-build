package com.bytedance.pangle.util.b.a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import kotlin.y1;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4622a = new byte[2];

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f4623b = new byte[4];

    public final int a(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f4623b);
        return b(this.f4623b);
    }

    public final int b(RandomAccessFile randomAccessFile) {
        randomAccessFile.readFully(this.f4622a);
        return a(this.f4622a);
    }

    private static int b(byte[] bArr) {
        return ((((bArr[3] & y1.f19838d) << 8) | (bArr[2] & y1.f19838d)) << 16) | (bArr[0] & y1.f19838d) | ((bArr[1] & y1.f19838d) << 8);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream, int i5) {
        a(this.f4622a, i5);
        byteArrayOutputStream.write(this.f4622a);
    }

    private static void b(byte[] bArr, int i5) {
        bArr[3] = (byte) (i5 >>> 24);
        bArr[2] = (byte) (i5 >>> 16);
        bArr[1] = (byte) (i5 >>> 8);
        bArr[0] = (byte) (i5 & 255);
    }

    public final void a(OutputStream outputStream, int i5) {
        b(this.f4623b, i5);
        outputStream.write(this.f4623b);
    }

    private static int a(byte[] bArr) {
        return ((bArr[1] & y1.f19838d) << 8) | (bArr[0] & y1.f19838d);
    }

    public static void a(byte[] bArr, int i5) {
        bArr[1] = (byte) (i5 >>> 8);
        bArr[0] = (byte) (i5 & 255);
    }
}
