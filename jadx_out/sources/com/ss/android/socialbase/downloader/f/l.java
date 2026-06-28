package com.ss.android.socialbase.downloader.f;

import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class l implements e {

    /* renamed from: a, reason: collision with root package name */
    private final i f10777a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.model.e f10778b;

    /* renamed from: c, reason: collision with root package name */
    private final e f10779c;

    public l(DownloadInfo downloadInfo, b bVar, i iVar) throws BaseException {
        this.f10777a = iVar;
        this.f10778b = a(downloadInfo, iVar);
        this.f10779c = new h(bVar, this);
    }

    public e a() {
        return this.f10779c;
    }

    @Override // com.ss.android.socialbase.downloader.f.e
    public void b(@NonNull a aVar) throws IOException {
        this.f10778b.a(aVar.f10703a, 0, aVar.f10705c);
        this.f10777a.b(aVar.f10705c);
    }

    public void c() throws IOException {
        this.f10778b.c();
    }

    public void d() {
        com.ss.android.socialbase.downloader.i.f.a(this.f10778b);
    }

    public i e() {
        return this.f10777a;
    }

    private com.ss.android.socialbase.downloader.model.e a(DownloadInfo downloadInfo, i iVar) throws BaseException {
        com.ss.android.socialbase.downloader.model.e a5 = com.ss.android.socialbase.downloader.i.f.a(downloadInfo, downloadInfo.getTempPath(), downloadInfo.getTempName(), com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("flush_buffer_size_byte", -1));
        try {
            a5.a(iVar.e());
            return a5;
        } catch (IOException e5) {
            throw new BaseException(1054, e5);
        }
    }

    public void b() throws IOException {
        this.f10778b.b();
    }
}
