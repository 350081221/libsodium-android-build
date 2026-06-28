package com.ss.android.socialbase.downloader.model;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.i.f;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private BufferedOutputStream f11134a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f11135b;

    /* renamed from: c, reason: collision with root package name */
    private RandomAccessFile f11136c;

    public e(File file, int i5) throws BaseException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f11136c = randomAccessFile;
            this.f11135b = randomAccessFile.getFD();
            if (i5 > 0) {
                int i6 = 8192;
                if (i5 >= 8192) {
                    i6 = 131072;
                    if (i5 > 131072) {
                    }
                    this.f11134a = new BufferedOutputStream(new FileOutputStream(this.f11136c.getFD()), i5);
                    return;
                }
                i5 = i6;
                this.f11134a = new BufferedOutputStream(new FileOutputStream(this.f11136c.getFD()), i5);
                return;
            }
            this.f11134a = new BufferedOutputStream(new FileOutputStream(this.f11136c.getFD()));
        } catch (IOException e5) {
            throw new BaseException(1039, e5);
        }
    }

    public void a(byte[] bArr, int i5, int i6) throws IOException {
        this.f11134a.write(bArr, i5, i6);
    }

    public void b() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f11134a;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
    }

    public void c() throws IOException {
        FileDescriptor fileDescriptor = this.f11135b;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        f.a(this.f11136c, this.f11134a);
    }

    public void a() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f11134a;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.f11135b;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    public void b(long j5) throws IOException {
        this.f11136c.setLength(j5);
    }

    public void a(long j5) throws IOException {
        this.f11136c.seek(j5);
    }
}
