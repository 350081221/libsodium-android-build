package com.ss.android.socialbase.downloader.e;

import com.ss.android.socialbase.downloader.i.f;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f10693a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.f.a f10694b;

    public c(InputStream inputStream, int i5) {
        this.f10693a = inputStream;
        this.f10694b = new com.ss.android.socialbase.downloader.f.a(i5);
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public com.ss.android.socialbase.downloader.f.a a() throws IOException {
        com.ss.android.socialbase.downloader.f.a aVar = this.f10694b;
        aVar.f10705c = this.f10693a.read(aVar.f10703a);
        return this.f10694b;
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public void a(com.ss.android.socialbase.downloader.f.a aVar) {
    }

    @Override // com.ss.android.socialbase.downloader.e.b
    public void b() {
        f.a(this.f10693a);
    }
}
