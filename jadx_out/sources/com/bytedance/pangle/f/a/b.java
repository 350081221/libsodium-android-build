package com.bytedance.pangle.f.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    InputStream f4397a;

    /* renamed from: b, reason: collision with root package name */
    private int f4398b;

    public b(InputStream inputStream) {
        a(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(InputStream inputStream) {
        this.f4397a = inputStream;
        this.f4398b = 0;
    }

    public final void b() {
        long skip = this.f4397a.skip(4L);
        this.f4398b = (int) (this.f4398b + skip);
        if (skip != 4) {
            throw new EOFException();
        }
    }

    public final int a() {
        int i5 = 0;
        for (int i6 = 0; i6 != 32; i6 += 8) {
            int read = this.f4397a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f4398b++;
            i5 |= read << i6;
        }
        return i5;
    }

    public final void b(int i5) {
        int a5 = a();
        if (a5 != i5) {
            throw new IOException(String.format("Expected: 0x%08x got: 0x%08x", Integer.valueOf(i5), Integer.valueOf(a5)));
        }
    }

    public final int[] a(int i5) {
        int[] iArr = new int[i5];
        int i6 = 0;
        while (i5 > 0) {
            iArr[i6] = a();
            i5--;
            i6++;
        }
        return iArr;
    }
}
