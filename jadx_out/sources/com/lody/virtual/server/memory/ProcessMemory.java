package com.lody.virtual.server.memory;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* loaded from: classes3.dex */
public class ProcessMemory {
    private RandomAccessFile memFile;
    private int pid;

    public ProcessMemory(int i5) throws IOException {
        this.pid = i5;
        this.memFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/mem", Integer.valueOf(i5)), "rw");
    }

    public void close() throws IOException {
        this.memFile.close();
    }

    public int read(long j5, byte[] bArr, int i5) throws IOException {
        this.memFile.seek(j5);
        return this.memFile.read(bArr, 0, i5);
    }

    public void write(long j5, byte[] bArr) throws IOException {
        this.memFile.seek(j5);
        this.memFile.write(bArr);
    }
}
