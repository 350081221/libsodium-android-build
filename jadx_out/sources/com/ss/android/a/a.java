package com.ss.android.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f9386a;

    public a(File file) throws FileNotFoundException {
        this.f9386a = new RandomAccessFile(file, "r");
    }

    @Override // com.ss.android.a.b
    public long a() throws IOException {
        return this.f9386a.length();
    }

    @Override // com.ss.android.a.b
    public void b() throws IOException {
        this.f9386a.close();
    }

    @Override // com.ss.android.a.b
    public int a(byte[] bArr, int i5, int i6) throws IOException {
        return this.f9386a.read(bArr, i5, i6);
    }

    @Override // com.ss.android.a.b
    public void a(long j5, long j6) throws IOException {
        this.f9386a.seek(j5);
    }
}
