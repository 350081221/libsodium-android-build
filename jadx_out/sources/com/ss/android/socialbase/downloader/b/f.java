package com.ss.android.socialbase.downloader.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.b.b;
import com.ss.android.socialbase.downloader.b.c;
import com.ss.android.socialbase.downloader.downloader.SqlDownloadCacheService;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.t;
import com.ss.android.socialbase.downloader.f.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class f implements ServiceConnection, t {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10459b;

    /* renamed from: c, reason: collision with root package name */
    private static int f10460c;

    /* renamed from: d, reason: collision with root package name */
    private static long f10461d;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private c f10462a;

    /* renamed from: g, reason: collision with root package name */
    private c.a.InterfaceC0215a f10465g;

    /* renamed from: i, reason: collision with root package name */
    private Future<?> f10467i;

    /* renamed from: e, reason: collision with root package name */
    private Handler f10463e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private b f10464f = null;

    /* renamed from: h, reason: collision with root package name */
    private Runnable f10466h = new Runnable() { // from class: com.ss.android.socialbase.downloader.b.f.1
        @Override // java.lang.Runnable
        public void run() {
            if (!f.f10459b && f.this.f10465g != null) {
                f.this.f10465g.a();
            }
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private CountDownLatch f10468j = new CountDownLatch(1);

    public f() {
        SqlDownloadCacheService.a(com.ss.android.socialbase.downloader.downloader.c.O(), this);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayList<i> n(int i5) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean a(int i5, Map<Long, i> map) {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo i(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.i(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo j(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.j(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public Map<Long, i> l(int i5) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void m(int i5) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        f10459b = true;
        this.f10463e.removeCallbacks(this.f10466h);
        try {
            this.f10462a = c.a.a(iBinder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f10467i = com.ss.android.socialbase.downloader.downloader.c.l().submit(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.f.2
            @Override // java.lang.Runnable
            public void run() {
                IBinder iBinder2;
                IBinder.DeathRecipient deathRecipient;
                synchronized (this) {
                    try {
                        try {
                            if (f.this.f10464f != null && f.this.f10462a != null) {
                                f.this.f10462a.a(f.this.f10464f);
                            }
                            iBinder2 = iBinder;
                            deathRecipient = new IBinder.DeathRecipient() { // from class: com.ss.android.socialbase.downloader.b.f.2.1
                                @Override // android.os.IBinder.DeathRecipient
                                public void binderDied() {
                                    boolean unused = f.f10459b = false;
                                    if (!f.this.g() && f.this.f10465g != null) {
                                        f.this.f10463e.postDelayed(f.this.f10466h, 2000L);
                                    }
                                }
                            };
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        try {
                            com.ss.android.socialbase.downloader.c.a.b("SqlDownloadCacheAidlWra", "onServiceConnected fail", th2);
                            if (f.this.f10465g != null) {
                                f.this.f10465g.a();
                            }
                            f.this.f10468j.countDown();
                            iBinder2 = iBinder;
                            deathRecipient = new IBinder.DeathRecipient() { // from class: com.ss.android.socialbase.downloader.b.f.2.1
                                @Override // android.os.IBinder.DeathRecipient
                                public void binderDied() {
                                    boolean unused2 = f.f10459b = false;
                                    if (!f.this.g() && f.this.f10465g != null) {
                                        f.this.f10463e.postDelayed(f.this.f10466h, 2000L);
                                    }
                                }
                            };
                        } finally {
                            f.this.f10468j.countDown();
                            try {
                                iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.ss.android.socialbase.downloader.b.f.2.1
                                    @Override // android.os.IBinder.DeathRecipient
                                    public void binderDied() {
                                        boolean unused2 = f.f10459b = false;
                                        if (!f.this.g() && f.this.f10465g != null) {
                                            f.this.f10463e.postDelayed(f.this.f10466h, 2000L);
                                        }
                                    }
                                }, 0);
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    iBinder2.linkToDeath(deathRecipient, 0);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f10462a = null;
        f10459b = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        if (Build.VERSION.SDK_INT >= 26 || f10459b) {
            return false;
        }
        if (f10460c > 5) {
            com.ss.android.socialbase.downloader.c.a.d("SqlDownloadCacheAidlWra", "bindMainProcess: bind too many times!!! ");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f10461d < 15000) {
            com.ss.android.socialbase.downloader.c.a.d("SqlDownloadCacheAidlWra", "bindMainProcess: time too short since last bind!!! ");
            return false;
        }
        f10460c++;
        f10461d = currentTimeMillis;
        this.f10463e.postDelayed(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.f.3
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCacheService.a(com.ss.android.socialbase.downloader.downloader.c.O(), f.this);
            }
        }, 1000L);
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo b(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.b(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> c(String str) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.c(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> d(String str) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.d(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean e(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.e(i5);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo h(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.h(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void a(c.a.InterfaceC0215a interfaceC0215a) {
        this.f10465g = interfaceC0215a;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean f(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.f(i5);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.t
    public void a(final SparseArray<DownloadInfo> sparseArray, final SparseArray<List<com.ss.android.socialbase.downloader.model.b>> sparseArray2, final d dVar) {
        com.ss.android.socialbase.downloader.downloader.c.l().submit(new Runnable() { // from class: com.ss.android.socialbase.downloader.b.f.4
            @Override // java.lang.Runnable
            public void run() {
                boolean z4;
                d dVar2;
                Future future;
                f.this.a(new b.a() { // from class: com.ss.android.socialbase.downloader.b.f.4.1
                    @Override // com.ss.android.socialbase.downloader.b.b
                    public void a(Map map, Map map2) {
                        com.ss.android.socialbase.downloader.i.f.a(sparseArray, map);
                        com.ss.android.socialbase.downloader.i.f.a(sparseArray2, map2);
                        dVar.a();
                        f.this.a((b) null);
                    }
                });
                try {
                    z4 = !f.this.f10468j.await(5000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th.printStackTrace();
                    z4 = false;
                }
                if (z4 && (future = f.this.f10467i) != null) {
                    future.cancel(true);
                }
                f.this.a();
                if (z4 && (dVar2 = dVar) != null) {
                    dVar2.a();
                }
            }
        });
    }

    public void a(b bVar) {
        synchronized (this) {
            c cVar = this.f10462a;
            if (cVar != null) {
                try {
                    cVar.a(bVar);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            } else {
                this.f10464f = bVar;
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> b(String str) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.b(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<com.ss.android.socialbase.downloader.model.b> c(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.c(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void d(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.d(i5);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean e() {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.e();
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> b() {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.b();
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void c() {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.c();
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo d(int i5, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.d(i5, j5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void a() {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a();
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(com.ss.android.socialbase.downloader.model.b bVar) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.b(bVar);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo c(int i5, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.c(i5, j5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean d() {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.d();
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo g(int i5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.g(i5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public List<DownloadInfo> a(String str) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.a(str);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo b(int i5, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.b(i5, j5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(com.ss.android.socialbase.downloader.model.b bVar) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a(bVar);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(DownloadInfo downloadInfo) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.b(downloadInfo);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a(i5, i6, j5);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void b(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.b(i5, list);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, int i7, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a(i5, i6, i7, j5);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, int i6, int i7, int i8) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a(i5, i6, i7, i8);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, int i6) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.a(i5, i6);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public boolean a(DownloadInfo downloadInfo) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.a(downloadInfo);
            }
            return false;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5, String str, String str2) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.a(i5, j5, str, str2);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public DownloadInfo a(int i5, long j5) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                return cVar.a(i5, j5);
            }
            return null;
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.j
    public void a(int i5, List<com.ss.android.socialbase.downloader.model.b> list) {
        try {
            c cVar = this.f10462a;
            if (cVar != null) {
                cVar.a(i5, list);
            }
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
