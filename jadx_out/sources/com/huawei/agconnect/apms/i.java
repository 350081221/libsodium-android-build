package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class i extends InputStream implements n {
    public static final AgentLog fgh = AgentLogManager.getAgentLog();
    public InputStream abc;
    public m bcd;
    public final ByteBuffer cde;
    public boolean def;
    public long efg;

    public i(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    @Override // com.huawei.agconnect.apms.n
    public void abc(l lVar) {
        this.bcd.bcd(lVar);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i5;
        if (this.def) {
            i5 = this.cde.remaining();
        } else {
            i5 = 0;
        }
        try {
            return i5 + this.abc.available();
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    public final void bcd() {
        int read;
        ByteBuffer byteBuffer = this.cde;
        if (byteBuffer == null || !byteBuffer.hasArray()) {
            return;
        }
        synchronized (this.cde) {
            int i5 = 0;
            while (i5 < this.cde.capacity() && (read = this.abc.read(this.cde.array(), i5, this.cde.capacity() - i5)) > 0) {
                try {
                    i5 += read;
                } catch (IOException unused) {
                    fgh.warn("fill buffer error");
                    this.cde.limit(0);
                }
            }
            this.cde.limit(i5);
        }
    }

    public final void cde() {
        if (!this.bcd.cde()) {
            this.bcd.abc(new k(this, this.efg));
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.abc.close();
            cde();
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i5) {
        if (!markSupported()) {
            return;
        }
        this.abc.mark(i5);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.abc.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.def) {
            synchronized (this.cde) {
                if (abc(1L)) {
                    int i5 = abc() ? -1 : this.cde.get() & kotlin.y1.f19838d;
                    if (i5 >= 0) {
                        this.efg++;
                    }
                    return i5;
                }
            }
        }
        try {
            int read = this.abc.read();
            if (read >= 0) {
                this.efg++;
            } else {
                cde();
            }
            return read;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (!markSupported()) {
            return;
        }
        try {
            this.abc.reset();
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j5) throws IOException {
        if (this.def) {
            synchronized (this.cde) {
                if (abc(j5)) {
                    this.cde.position((int) j5);
                    this.efg += j5;
                    return j5;
                }
                j5 -= this.cde.remaining();
                if (j5 > 0) {
                    ByteBuffer byteBuffer = this.cde;
                    byteBuffer.position(byteBuffer.remaining());
                } else {
                    throw new IOException("failed to skip partial read from buffer.");
                }
            }
        }
        try {
            long skip = this.abc.skip(j5);
            this.efg += skip;
            return skip;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }

    public i(InputStream inputStream, boolean z4) throws IOException {
        this.efg = 0L;
        if (inputStream != null) {
            this.abc = inputStream;
            this.def = z4;
            this.bcd = new m();
            if (z4) {
                this.cde = ByteBuffer.allocate(4096);
                bcd();
                return;
            } else {
                this.cde = null;
                return;
            }
        }
        throw new IOException("InputStreamExtension: input stream can not be null.");
    }

    public final boolean abc(long j5) {
        return ((long) this.cde.remaining()) >= j5;
    }

    public final boolean abc() {
        return !this.cde.hasRemaining();
    }

    public final int abc(byte[] bArr, int i5, int i6) {
        if (!this.cde.hasRemaining()) {
            return -1;
        }
        int remaining = this.cde.remaining();
        this.cde.get(bArr, i5, i6);
        return remaining - this.cde.remaining();
    }

    public final void abc(Exception exc) {
        if (this.bcd.cde()) {
            return;
        }
        this.bcd.bcd(new k(this, this.efg, exc));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i5 = 0;
        if (this.def) {
            synchronized (this.cde) {
                if (abc(length)) {
                    int abc = abc(bArr, 0, bArr.length);
                    if (abc >= 0) {
                        this.efg += abc;
                        return abc;
                    }
                    throw new IOException("failed to read buffer bytes.");
                }
                int remaining = this.cde.remaining();
                if (remaining > 0) {
                    i5 = abc(bArr, 0, remaining);
                    if (i5 >= 0) {
                        length -= i5;
                        this.efg += i5;
                    } else {
                        throw new IOException("failed to partial read from buffer.");
                    }
                }
            }
        }
        try {
            int read = this.abc.read(bArr, i5, length);
            if (read >= 0) {
                this.efg += read;
                return read + i5;
            }
            if (i5 > 0) {
                return i5;
            }
            cde();
            return read;
        } catch (IOException e5) {
            fgh.warn("failed to read input stream");
            abc(e5);
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7 = 0;
        if (this.def) {
            synchronized (this.cde) {
                if (abc(i6)) {
                    int abc = abc(bArr, i5, i6);
                    if (abc >= 0) {
                        this.efg += abc;
                        return abc;
                    }
                    throw new IOException("failed to read buffer bytes.");
                }
                int remaining = this.cde.remaining();
                if (remaining > 0) {
                    i7 = abc(bArr, i5, remaining);
                    if (i7 >= 0) {
                        i6 -= i7;
                        this.efg += i7;
                    } else {
                        throw new IOException("failed to partial read from buffer.");
                    }
                }
            }
        }
        try {
            int read = this.abc.read(bArr, i5 + i7, i6);
            if (read >= 0) {
                this.efg += read;
                return read + i7;
            }
            if (i7 > 0) {
                return i7;
            }
            cde();
            return read;
        } catch (IOException e5) {
            abc(e5);
            throw e5;
        }
    }
}
