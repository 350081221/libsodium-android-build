package com.ss.android.socialbase.appdownloader.f.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private InputStream f10335a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10336b;

    /* renamed from: c, reason: collision with root package name */
    private int f10337c;

    public d() {
    }

    public final void a(InputStream inputStream, boolean z4) {
        this.f10335a = inputStream;
        this.f10336b = z4;
        this.f10337c = 0;
    }

    public final int b() throws IOException {
        return a(4);
    }

    public final void c(int i5) throws IOException {
        if (i5 > 0) {
            long j5 = i5;
            long skip = this.f10335a.skip(j5);
            this.f10337c = (int) (this.f10337c + skip);
            if (skip != j5) {
                throw new EOFException();
            }
        }
    }

    public d(InputStream inputStream, boolean z4) {
        a(inputStream, z4);
    }

    public final int[] b(int i5) throws IOException {
        int[] iArr = new int[i5];
        a(iArr, 0, i5);
        return iArr;
    }

    public final void a() {
        InputStream inputStream = this.f10335a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            a(null, false);
        }
    }

    public final void c() throws IOException {
        c(4);
    }

    public final int a(int i5) throws IOException {
        if (i5 >= 0 && i5 <= 4) {
            int i6 = 0;
            if (this.f10336b) {
                for (int i7 = (i5 - 1) * 8; i7 >= 0; i7 -= 8) {
                    int read = this.f10335a.read();
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f10337c++;
                    i6 |= read << i7;
                }
                return i6;
            }
            int i8 = i5 * 8;
            int i9 = 0;
            while (i6 != i8) {
                int read2 = this.f10335a.read();
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.f10337c++;
                i9 |= read2 << i6;
                i6 += 8;
            }
            return i9;
        }
        throw new IllegalArgumentException();
    }

    public final void a(int[] iArr, int i5, int i6) throws IOException {
        while (i6 > 0) {
            iArr[i5] = b();
            i6--;
            i5++;
        }
    }
}
