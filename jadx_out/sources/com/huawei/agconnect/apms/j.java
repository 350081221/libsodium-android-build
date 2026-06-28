package com.huawei.agconnect.apms;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class j extends OutputStream implements n {
    public OutputStream abc;
    public long bcd = 0;
    public m cde = new m();

    public j(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            this.abc = outputStream;
            return;
        }
        throw new IOException("OutputStreamExtension: output stream can not be null.");
    }

    @Override // com.huawei.agconnect.apms.n
    public void abc(l lVar) {
        this.cde.bcd(lVar);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.abc.close();
            if (!this.cde.cde()) {
                this.cde.abc(new k(this, this.bcd));
            }
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.abc.flush();
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i5) throws IOException {
        try {
            this.abc.write(i5);
            this.bcd++;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    public final void abc(Exception exc) {
        if (this.cde.cde()) {
            return;
        }
        this.cde.bcd(new k(this, this.bcd, exc));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.abc.write(bArr);
            this.bcd += bArr.length;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i5, int i6) throws IOException {
        try {
            this.abc.write(bArr, i5, i6);
            this.bcd += i6;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }
}
