package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ak;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

/* loaded from: classes3.dex */
public class o implements com.ss.android.socialbase.downloader.downloader.m, com.ss.android.socialbase.downloader.downloader.n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11035a = "o";

    /* renamed from: b, reason: collision with root package name */
    private volatile com.ss.android.socialbase.downloader.downloader.i f11036b;

    /* renamed from: c, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> f11037c;

    /* renamed from: d, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.m f11038d = new p();

    public o() {
        com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> A = com.ss.android.socialbase.downloader.downloader.c.A();
        this.f11037c = A;
        A.a(this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean b(int i5) {
        if (this.f11036b == null) {
            return false;
        }
        try {
            return this.f11036b.b(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void c(int i5) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.c(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void d(int i5) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.d(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public long e(int i5) {
        if (this.f11036b == null) {
            return 0L;
        }
        try {
            return this.f11036b.e(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int f(int i5) {
        if (this.f11036b == null) {
            return 0;
        }
        try {
            return this.f11036b.f(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean g(int i5) {
        if (this.f11036b == null) {
            return false;
        }
        try {
            return this.f11036b.g(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public DownloadInfo h(int i5) {
        if (this.f11036b == null) {
            return this.f11038d.h(i5);
        }
        try {
            return this.f11036b.h(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<com.ss.android.socialbase.downloader.model.b> i(int i5) {
        if (this.f11036b == null) {
            return this.f11038d.i(i5);
        }
        try {
            return this.f11036b.i(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void j(int i5) {
        if (this.f11036b == null) {
            this.f11038d.j(i5);
            return;
        }
        try {
            this.f11036b.j(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void k(int i5) {
        com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> oVar = this.f11037c;
        if (oVar != null) {
            oVar.a(i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean l(int i5) {
        if (this.f11036b == null) {
            return false;
        }
        try {
            return this.f11036b.k(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int m(int i5) {
        if (this.f11036b == null) {
            return com.ss.android.socialbase.downloader.downloader.d.a().b(i5);
        }
        try {
            return this.f11036b.m(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean n(int i5) {
        if (this.f11036b == null) {
            return this.f11038d.n(i5);
        }
        try {
            return this.f11036b.n(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void o(int i5) {
        if (this.f11036b == null) {
            this.f11038d.o(i5);
            return;
        }
        try {
            this.f11036b.o(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean p(int i5) {
        if (this.f11036b == null) {
            return this.f11038d.p(i5);
        }
        try {
            return this.f11036b.p(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public z q(int i5) {
        if (this.f11036b != null) {
            try {
                return com.ss.android.socialbase.downloader.i.g.a(this.f11036b.q(i5));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public af r(int i5) {
        if (this.f11036b != null) {
            try {
                return com.ss.android.socialbase.downloader.i.g.a(this.f11036b.r(i5));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public IDownloadFileUriProvider s(int i5) {
        if (this.f11036b != null) {
            try {
                return com.ss.android.socialbase.downloader.i.g.a(this.f11036b.s(i5));
            } catch (RemoteException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, boolean z4) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a(i5, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public DownloadInfo b(String str, String str2) {
        return h(a(str, str2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> c(String str) {
        if (this.f11036b == null) {
            return this.f11038d.c(str);
        }
        try {
            return this.f11036b.c(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> d() {
        if (this.f11036b == null) {
            return this.f11038d.d();
        }
        try {
            return this.f11036b.b();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> e(String str) {
        if (this.f11036b == null) {
            return null;
        }
        try {
            return this.f11036b.d(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean f() {
        if (this.f11036b == null) {
            return this.f11038d.f();
        }
        try {
            return this.f11036b.d();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void g() {
        if (this.f11036b == null) {
            this.f11038d.g();
            return;
        }
        try {
            this.f11036b.e();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean h() {
        return this.f11036b != null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.n
    public void i() {
        this.f11036b = null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> b(String str) {
        if (this.f11036b == null) {
            return this.f11038d.b(str);
        }
        try {
            return this.f11036b.b(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a() {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a();
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void e() {
        com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> oVar = this.f11037c;
        if (oVar != null) {
            oVar.f();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean c() {
        return com.ss.android.socialbase.downloader.downloader.c.P();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> d(String str) {
        if (this.f11036b == null) {
            return this.f11038d.d(str);
        }
        try {
            return this.f11036b.e(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void c(int i5, boolean z4) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.d(i5, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public List<DownloadInfo> a(String str) {
        if (this.f11036b == null) {
            return this.f11038d.a(str);
        }
        try {
            return this.f11036b.a(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(List<String> list) {
        if (this.f11036b == null) {
            this.f11038d.b(list);
            return;
        }
        try {
            this.f11036b.b(list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean c(DownloadInfo downloadInfo) {
        if (this.f11036b == null) {
            return this.f11038d.c(downloadInfo);
        }
        try {
            return this.f11036b.b(downloadInfo);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public int a(String str, String str2) {
        return com.ss.android.socialbase.downloader.downloader.c.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, boolean z4) {
        if (this.f11036b == null) {
            this.f11038d.b(i5, z4);
            return;
        }
        try {
            this.f11036b.b(i5, z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(List<String> list) {
        if (this.f11036b == null) {
            this.f11038d.a(list);
            return;
        }
        try {
            this.f11036b.a(list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iDownloadListener, fVar != com.ss.android.socialbase.downloader.constants.f.SUB), fVar.ordinal(), z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.b(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iDownloadListener, fVar != com.ss.android.socialbase.downloader.constants.f.SUB), fVar.ordinal(), z4);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean b() {
        if (this.f11036b == null) {
            com.ss.android.socialbase.downloader.c.a.d(f11035a, "isServiceForeground, aidlService is null");
            return false;
        }
        com.ss.android.socialbase.downloader.c.a.c(f11035a, "aidlService.isServiceForeground");
        try {
            return this.f11036b.f();
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, IDownloadListener iDownloadListener, com.ss.android.socialbase.downloader.constants.f fVar, boolean z4, boolean z5) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iDownloadListener, fVar != com.ss.android.socialbase.downloader.constants.f.SUB), fVar.ordinal(), z4, z5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public boolean a(DownloadInfo downloadInfo) {
        if (this.f11036b == null) {
            return this.f11038d.a(downloadInfo);
        }
        try {
            this.f11036b.a(downloadInfo);
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> oVar;
        if (downloadTask == null || (oVar = this.f11037c) == null) {
            return;
        }
        oVar.c(downloadTask);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (this.f11036b == null) {
            this.f11038d.b(i5, list);
            return;
        }
        try {
            this.f11036b.a(i5, list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, Notification notification) {
        if (this.f11036b == null) {
            com.ss.android.socialbase.downloader.c.a.d(f11035a, "startForeground, aidlService is null");
            return;
        }
        com.ss.android.socialbase.downloader.c.a.c(f11035a, "aidlService.startForeground, id = " + i5);
        try {
            this.f11036b.a(i5, notification);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(boolean z4, boolean z5) {
        if (this.f11036b == null) {
            com.ss.android.socialbase.downloader.c.a.d(f11035a, "stopForeground, aidlService is null");
            return;
        }
        com.ss.android.socialbase.downloader.c.a.c(f11035a, "aidlService.stopForeground");
        try {
            this.f11036b.a(z5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(DownloadTask downloadTask) {
        com.ss.android.socialbase.downloader.downloader.o<IndependentProcessDownloadService> oVar;
        if (downloadTask == null || (oVar = this.f11037c) == null) {
            return;
        }
        oVar.b(downloadTask);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.b(i5, list);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(com.ss.android.socialbase.downloader.model.b bVar) {
        if (this.f11036b == null) {
            this.f11038d.a(bVar);
            return;
        }
        try {
            this.f11036b.a(bVar);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, long j5) {
        if (this.f11036b == null) {
            this.f11038d.a(i5, i6, j5);
            return;
        }
        try {
            this.f11036b.a(i5, i6, j5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, int i7, long j5) {
        if (this.f11036b == null) {
            this.f11038d.a(i5, i6, i7, j5);
            return;
        }
        try {
            this.f11036b.a(i5, i6, i7, j5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6, int i7, int i8) {
        if (this.f11036b == null) {
            this.f11038d.a(i5, i6, i7, i8);
            return;
        }
        try {
            this.f11036b.a(i5, i6, i7, i8);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(ak akVar) {
        if (this.f11036b != null) {
            try {
                this.f11036b.a(com.ss.android.socialbase.downloader.i.g.a(akVar));
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, int i6) {
        if (this.f11036b != null) {
            try {
                this.f11036b.a(i5, i6);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, z zVar) {
        if (this.f11036b != null) {
            try {
                this.f11036b.a(i5, com.ss.android.socialbase.downloader.i.g.a(zVar));
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.n
    public void a(IBinder iBinder) {
        this.f11036b = i.a.a(iBinder);
        if (com.ss.android.socialbase.downloader.i.f.a()) {
            a(new ak() { // from class: com.ss.android.socialbase.downloader.impls.o.1
                @Override // com.ss.android.socialbase.downloader.depend.ak
                public void a(int i5, int i6) {
                    if (i6 == 1) {
                        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).pause(i5);
                        List<com.ss.android.socialbase.downloader.model.b> i7 = l.a(false).i(i5);
                        if (i7 != null) {
                            l.a(true).a(i5, com.ss.android.socialbase.downloader.i.f.a(i7));
                            return;
                        }
                        return;
                    }
                    if (i6 == 2) {
                        Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).cancel(i5);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.m
    public void a(int i5, long j5) {
        if (this.f11036b == null) {
            return;
        }
        try {
            this.f11036b.a(i5, j5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
