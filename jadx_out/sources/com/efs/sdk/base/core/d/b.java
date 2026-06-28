package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public a f6591a;

    /* renamed from: b, reason: collision with root package name */
    public c f6592b = new c();

    /* renamed from: c, reason: collision with root package name */
    public byte[] f6593c;

    /* renamed from: d, reason: collision with root package name */
    public File f6594d;

    public b(String str, byte b5) {
        this.f6591a = new a(str, b5);
    }

    private void d() {
        byte[] bArr;
        a aVar = this.f6591a;
        int i5 = aVar.f6586c;
        if (i5 == 0 && (bArr = this.f6593c) != null) {
            aVar.f6589f = bArr.length;
        } else if (i5 == 1 && this.f6594d.exists()) {
            this.f6591a.f6589f = this.f6594d.length();
        }
    }

    public final long a() {
        d();
        return this.f6591a.f6589f;
    }

    public final boolean b() {
        return !"none".equals(this.f6591a.f6587d);
    }

    public final void c() {
        this.f6592b.f6595a = true;
    }

    public final void b(int i5) {
        this.f6591a.f6586c = i5;
    }

    public final void a(String str) {
        this.f6591a.f6587d = str;
    }

    public final void a(int i5) {
        this.f6591a.f6588e = i5;
        d();
    }

    public final void a(byte[] bArr) {
        this.f6593c = bArr;
        d();
    }

    public static b a(ILogProtocol iLogProtocol) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e5) {
            e = e5;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType == 0) {
                bVar.b(0);
                bVar.a(iLogProtocol.generate());
            } else if (bodyType != 1) {
                Log.w("efs.base", "Can not support body type: " + iLogProtocol.getBodyType());
            } else {
                bVar.b(1);
                bVar.f6594d = new File(iLogProtocol.getFilePath());
            }
            return bVar;
        } catch (Exception e6) {
            e = e6;
            bVar2 = bVar;
            Log.e("efs.base", "log send error", e);
            return bVar2;
        }
    }
}
