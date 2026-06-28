package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.ae;
import com.ss.android.socialbase.downloader.depend.aj;
import com.ss.android.socialbase.downloader.depend.y;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* loaded from: classes3.dex */
public class m extends i.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11029a = "m";

    /* renamed from: b, reason: collision with root package name */
    private final com.ss.android.socialbase.downloader.downloader.m f11030b = new p(true);

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(com.ss.android.socialbase.downloader.model.a aVar) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.b(com.ss.android.socialbase.downloader.i.g.a(aVar));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean b(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.b(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void c(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.c(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void d(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.d(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public long e(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return 0L;
        }
        return mVar.e(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public int f(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return 0;
        }
        return mVar.f(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean g(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.g(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public DownloadInfo h(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.h(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<com.ss.android.socialbase.downloader.model.b> i(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.i(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void j(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.j(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean k(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.l(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void l(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.k(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public int m(int i5) throws RemoteException {
        return com.ss.android.socialbase.downloader.downloader.d.a().b(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean n(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.n(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void o(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.o(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean p(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.p(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public y q(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return com.ss.android.socialbase.downloader.i.g.a(mVar.q(i5));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public ae r(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return com.ss.android.socialbase.downloader.i.g.a(mVar.r(i5));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public com.ss.android.socialbase.downloader.depend.g s(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return com.ss.android.socialbase.downloader.i.g.a(mVar.s(i5));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public DownloadInfo b(String str, String str2) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.b(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> c(String str) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.c(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> d(String str) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.e(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> e(String str) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.d(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean f() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.b();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> b(String str) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.b(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void c(int i5, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.b(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean d() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.f();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void e() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.g();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> b() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.d();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean c() throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void d(int i5, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.d.a().b(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public List<DownloadInfo> a(String str) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return null;
        }
        return mVar.a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void b(List<String> list) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar != null) {
            mVar.b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public int a(String str, String str2) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return 0;
        }
        return mVar.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void b(int i5, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.b(i5, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(List<String> list) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void b(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iVar), com.ss.android.socialbase.downloader.i.f.e(i7), z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.b(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iVar), com.ss.android.socialbase.downloader.i.f.e(i7), z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean b(DownloadInfo downloadInfo) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.c(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6, com.ss.android.socialbase.downloader.depend.i iVar, int i7, boolean z4, boolean z5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6, com.ss.android.socialbase.downloader.i.g.a(iVar), com.ss.android.socialbase.downloader.i.f.e(i7), z4, z5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public boolean a(DownloadInfo downloadInfo) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return false;
        }
        return mVar.a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, Notification notification) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, notification);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(boolean z4) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(true, z4);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, long j5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(com.ss.android.socialbase.downloader.model.b bVar) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(bVar);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6, long j5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6, int i7, long j5) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6, i7, j5);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6, int i7, int i8) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6, i7, i8);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.b(i5, list);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(aj ajVar) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(com.ss.android.socialbase.downloader.i.g.a(ajVar));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, int i6) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, i6);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.i
    public void a(int i5, y yVar) throws RemoteException {
        com.ss.android.socialbase.downloader.downloader.m mVar = this.f11030b;
        if (mVar == null) {
            return;
        }
        mVar.a(i5, com.ss.android.socialbase.downloader.i.g.a(yVar));
    }
}
