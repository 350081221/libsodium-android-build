package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ak;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes3.dex */
public class p implements com.ss.android.socialbase.downloader.downloader.m {

    /* renamed from: a, reason: collision with root package name */
    private final a f11040a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.j f11041b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.o f11042c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11043d;

    public p() {
        this(false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.e(i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean b(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.n(i5);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void c(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.f(i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void d(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.g(i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public long e(int i5) {
        DownloadInfo b5;
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f11041b;
        if (jVar == null || (b5 = jVar.b(i5)) == null) {
            return 0L;
        }
        int chunkCount = b5.getChunkCount();
        if (chunkCount <= 1) {
            return b5.getCurBytes();
        }
        List<com.ss.android.socialbase.downloader.model.b> c5 = this.f11041b.c(i5);
        if (c5 == null || c5.size() != chunkCount) {
            return 0L;
        }
        return com.ss.android.socialbase.downloader.i.f.b(c5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void e() {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int f(int i5) {
        DownloadInfo d5;
        a aVar = this.f11040a;
        if (aVar == null || (d5 = aVar.d(i5)) == null) {
            return 0;
        }
        return d5.getStatus();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean g(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.a(i5);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public DownloadInfo h(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.d(i5);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<com.ss.android.socialbase.downloader.model.b> i(int i5) {
        return this.f11041b.c(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void j(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.m(i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void k(int i5) {
        com.ss.android.socialbase.downloader.c.a.a(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean l(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.k(i5);
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int m(int i5) {
        return com.ss.android.socialbase.downloader.downloader.d.a().a(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean n(int i5) {
        return this.f11041b.e(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void o(int i5) {
        this.f11041b.d(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean p(int i5) {
        return this.f11041b.f(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public z q(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.i(i5);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public af r(int i5) {
        af afVar;
        a aVar = this.f11040a;
        if (aVar != null) {
            afVar = aVar.h(i5);
        } else {
            afVar = null;
        }
        if (afVar == null) {
            return com.ss.android.socialbase.downloader.downloader.c.K();
        }
        return afVar;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public IDownloadFileUriProvider s(int i5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.j(i5);
        }
        return null;
    }

    public p(boolean z4) {
        this.f11040a = com.ss.android.socialbase.downloader.downloader.c.D();
        this.f11041b = com.ss.android.socialbase.downloader.downloader.c.y();
        if (!z4) {
            this.f11042c = com.ss.android.socialbase.downloader.downloader.c.z();
        } else {
            this.f11042c = com.ss.android.socialbase.downloader.downloader.c.A();
        }
        this.f11043d = com.ss.android.socialbase.downloader.g.a.c().b("service_alive", false);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, boolean z4) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.a(i5, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> b(String str) {
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f11041b;
        if (jVar != null) {
            return jVar.b(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> c(String str) {
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f11041b;
        if (jVar != null) {
            return jVar.c(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> d() {
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f11041b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void g() {
        this.f11041b.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean h() {
        com.ss.android.socialbase.downloader.downloader.o oVar;
        return this.f11043d && (oVar = this.f11042c) != null && oVar.a();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean f() {
        return this.f11041b.d();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a() {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(List<String> list) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean c() {
        return com.ss.android.socialbase.downloader.downloader.c.P();
    }

    public void d(int i5, boolean z4) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.c(i5, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void c(int i5, boolean z4) {
        com.ss.android.socialbase.downloader.downloader.d.a().a(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(List<String> list) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.a(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public DownloadInfo b(String str, String str2) {
        return h(com.ss.android.socialbase.downloader.downloader.c.a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean c(DownloadInfo downloadInfo) {
        return this.f11041b.a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> d(String str) {
        com.ss.android.socialbase.downloader.downloader.j jVar = this.f11041b;
        if (jVar != null) {
            return jVar.d(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> e(String str) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.b(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> a(String str) {
        a aVar = this.f11040a;
        if (aVar != null) {
            return aVar.a(str);
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, boolean z4) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.b(i5, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int a(String str, String str2) {
        return com.ss.android.socialbase.downloader.downloader.c.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.a(i5, i6, iDownloadListener, fVar, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.b(i5, i6, iDownloadListener, fVar, z4);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean b() {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f11042c;
        if (oVar != null) {
            return oVar.b();
        }
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4, boolean z5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.a(i5, i6, iDownloadListener, fVar, z4, z5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f11042c;
        if (oVar != null) {
            oVar.c(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a5 = com.ss.android.socialbase.downloader.i.f.a(downloadInfo.getStatus(), downloadInfo.getSavePath(), downloadInfo.getName());
        if (a5) {
            if (com.ss.android.socialbase.downloader.i.a.a(33554432)) {
                b(downloadInfo.getId(), true);
            } else {
                d(downloadInfo.getId(), true);
            }
        }
        return a5;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(DownloadInfo downloadInfo) {
        this.f11041b.b(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        this.f11041b.b(i5, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, Notification notification) {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f11042c;
        if (oVar != null) {
            oVar.a(i5, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(boolean z4, boolean z5) {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f11042c;
        if (oVar != null) {
            oVar.a(z5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.o oVar = this.f11042c;
        if (oVar != null) {
            oVar.b(downloadTask);
        } else if (downloadTask != null) {
            com.ss.android.socialbase.downloader.d.a.a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        this.f11041b.a(i5, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(com.ss.android.socialbase.downloader.model.b bVar) {
        this.f11041b.a(bVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, long j5) {
        this.f11041b.a(i5, i6, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, int i7, long j5) {
        this.f11041b.a(i5, i6, i7, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, int i7, int i8) {
        this.f11041b.a(i5, i6, i7, i8);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(ak akVar) {
        com.ss.android.socialbase.downloader.downloader.c.a(akVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6) {
        if (com.ss.android.socialbase.downloader.downloader.c.e() != null) {
            for (ak akVar : com.ss.android.socialbase.downloader.downloader.c.e()) {
                if (akVar != null) {
                    akVar.a(i6, i5);
                }
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, z zVar) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.a(i5, zVar);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, long j5) {
        a aVar = this.f11040a;
        if (aVar != null) {
            aVar.b(i5, j5);
        }
    }
}
