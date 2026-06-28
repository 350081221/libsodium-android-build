package com.jakewharton.disklrucache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
class b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    private static final byte f9149f = 13;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f9150g = 10;

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f9151a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f9152b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f9153c;

    /* renamed from: d, reason: collision with root package name */
    private int f9154d;

    /* renamed from: e, reason: collision with root package name */
    private int f9155e;

    /* loaded from: classes3.dex */
    class a extends ByteArrayOutputStream {
        a(int i5) {
            super(i5);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i5 = ((ByteArrayOutputStream) this).count;
            if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                i5--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i5, b.this.f9152b.name());
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f9151a;
        byte[] bArr = this.f9153c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f9154d = 0;
            this.f9155e = read;
            return;
        }
        throw new EOFException();
    }

    public String c() throws IOException {
        int i5;
        byte[] bArr;
        int i6;
        synchronized (this.f9151a) {
            if (this.f9153c != null) {
                if (this.f9154d >= this.f9155e) {
                    b();
                }
                for (int i7 = this.f9154d; i7 != this.f9155e; i7++) {
                    byte[] bArr2 = this.f9153c;
                    if (bArr2[i7] == 10) {
                        int i8 = this.f9154d;
                        if (i7 != i8) {
                            i6 = i7 - 1;
                            if (bArr2[i6] == 13) {
                                String str = new String(bArr2, i8, i6 - i8, this.f9152b.name());
                                this.f9154d = i7 + 1;
                                return str;
                            }
                        }
                        i6 = i7;
                        String str2 = new String(bArr2, i8, i6 - i8, this.f9152b.name());
                        this.f9154d = i7 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f9155e - this.f9154d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f9153c;
                    int i9 = this.f9154d;
                    aVar.write(bArr3, i9, this.f9155e - i9);
                    this.f9155e = -1;
                    b();
                    i5 = this.f9154d;
                    while (i5 != this.f9155e) {
                        bArr = this.f9153c;
                        if (bArr[i5] == 10) {
                            break loop1;
                        }
                        i5++;
                    }
                }
                int i10 = this.f9154d;
                if (i5 != i10) {
                    aVar.write(bArr, i10, i5 - i10);
                }
                this.f9154d = i5 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f9151a) {
            if (this.f9153c != null) {
                this.f9153c = null;
                this.f9151a.close();
            }
        }
    }

    public b(InputStream inputStream, int i5, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i5 >= 0) {
            if (charset.equals(c.f9157a)) {
                this.f9151a = inputStream;
                this.f9152b = charset;
                this.f9153c = new byte[i5];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
