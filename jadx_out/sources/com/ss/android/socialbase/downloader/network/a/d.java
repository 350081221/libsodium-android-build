package com.ss.android.socialbase.downloader.network.a;

import com.ss.android.socialbase.downloader.network.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes3.dex */
public class d implements i {

    /* renamed from: a, reason: collision with root package name */
    protected final Object f11158a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.ss.android.socialbase.downloader.model.c> f11159b;

    /* renamed from: c, reason: collision with root package name */
    private i f11160c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11161d;

    /* renamed from: e, reason: collision with root package name */
    private long f11162e;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f11163f;

    @Override // com.ss.android.socialbase.downloader.network.i
    public InputStream a() throws IOException {
        InputStream inputStream = this.f11163f;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public boolean a(int i5) {
        return i5 >= 200 && i5 < 300;
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public int b() throws IOException {
        i iVar = this.f11160c;
        if (iVar != null) {
            return iVar.b();
        }
        return 0;
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public void c() {
        i iVar = this.f11160c;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // com.ss.android.socialbase.downloader.network.i
    public void d() {
        i iVar = this.f11160c;
        if (iVar != null) {
            iVar.d();
        }
    }

    public void e() throws InterruptedException {
        synchronized (this.f11158a) {
            if (this.f11161d && this.f11160c == null) {
                this.f11158a.wait();
            }
        }
    }

    public List<com.ss.android.socialbase.downloader.model.c> f() {
        return this.f11159b;
    }

    public boolean g() {
        try {
            i iVar = this.f11160c;
            if (iVar == null) {
                return false;
            }
            if (!a(iVar.b())) {
                return false;
            }
            return true;
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public boolean h() {
        return System.currentTimeMillis() - this.f11162e < b.f11141a;
    }

    @Override // com.ss.android.socialbase.downloader.network.g
    public String a(String str) {
        i iVar = this.f11160c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }
}
