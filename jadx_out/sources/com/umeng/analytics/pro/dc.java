package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class dc extends de {

    /* renamed from: a, reason: collision with root package name */
    protected InputStream f12505a;

    /* renamed from: b, reason: collision with root package name */
    protected OutputStream f12506b;

    protected dc() {
        this.f12505a = null;
        this.f12506b = null;
    }

    @Override // com.umeng.analytics.pro.de
    public int a(byte[] bArr, int i5, int i6) throws df {
        InputStream inputStream = this.f12505a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i5, i6);
                if (read >= 0) {
                    return read;
                }
                throw new df(4);
            } catch (IOException e5) {
                throw new df(0, e5);
            }
        }
        throw new df(1, "Cannot read from null inputStream");
    }

    @Override // com.umeng.analytics.pro.de
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.de
    public void b() throws df {
    }

    @Override // com.umeng.analytics.pro.de
    public void b(byte[] bArr, int i5, int i6) throws df {
        OutputStream outputStream = this.f12506b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i5, i6);
                return;
            } catch (IOException e5) {
                throw new df(0, e5);
            }
        }
        throw new df(1, "Cannot write to null outputStream");
    }

    @Override // com.umeng.analytics.pro.de
    public void c() {
        InputStream inputStream = this.f12505a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.f12505a = null;
        }
        OutputStream outputStream = this.f12506b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            this.f12506b = null;
        }
    }

    @Override // com.umeng.analytics.pro.de
    public void d() throws df {
        OutputStream outputStream = this.f12506b;
        if (outputStream != null) {
            try {
                outputStream.flush();
                return;
            } catch (IOException e5) {
                throw new df(0, e5);
            }
        }
        throw new df(1, "Cannot flush null outputStream");
    }

    public dc(InputStream inputStream) {
        this.f12506b = null;
        this.f12505a = inputStream;
    }

    public dc(OutputStream outputStream) {
        this.f12505a = null;
        this.f12506b = outputStream;
    }

    public dc(InputStream inputStream, OutputStream outputStream) {
        this.f12505a = inputStream;
        this.f12506b = outputStream;
    }
}
