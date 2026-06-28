package com.ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class n extends com.ss.android.socialbase.downloader.downloader.a implements ServiceConnection {

    /* renamed from: e, reason: collision with root package name */
    private static final String f11031e = "n";

    /* renamed from: f, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.i f11032f;

    /* renamed from: g, reason: collision with root package name */
    private com.ss.android.socialbase.downloader.downloader.n f11033g;

    /* renamed from: h, reason: collision with root package name */
    private int f11034h = -1;

    private void h() {
        SparseArray<List<DownloadTask>> clone;
        try {
            synchronized (this.f10586a) {
                clone = this.f10586a.clone();
                this.f10586a.clear();
            }
            if (clone != null && clone.size() > 0 && com.ss.android.socialbase.downloader.downloader.c.D() != null) {
                for (int i5 = 0; i5 < clone.size(); i5++) {
                    List<DownloadTask> list = clone.get(clone.keyAt(i5));
                    if (list != null) {
                        Iterator<DownloadTask> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                this.f11032f.a(com.ss.android.socialbase.downloader.i.g.a(it.next()));
                            } catch (RemoteException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.ss.android.socialbase.downloader.c.a.b(f11031e, "resumePendingTaskForIndependent failed", th);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a
    public void a(Context context, ServiceConnection serviceConnection) {
        try {
            com.ss.android.socialbase.downloader.c.a.b(f11031e, "bindService");
            Intent intent = new Intent(context, (Class<?>) IndependentProcessDownloadService.class);
            if (com.ss.android.socialbase.downloader.i.f.a()) {
                intent.putExtra("fix_downloader_db_sigbus", com.ss.android.socialbase.downloader.g.a.c().a("fix_sigbus_downloader_db"));
            }
            if (serviceConnection != null) {
                context.bindService(intent, serviceConnection, 1);
            }
            context.startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void b(DownloadTask downloadTask) {
        boolean z4;
        if (downloadTask == null) {
            return;
        }
        String str = f11031e;
        StringBuilder sb = new StringBuilder();
        sb.append("tryDownload aidlService == null:");
        if (this.f11032f == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sb.append(z4);
        com.ss.android.socialbase.downloader.c.a.b(str, sb.toString());
        if (this.f11032f == null) {
            a(downloadTask);
            a(com.ss.android.socialbase.downloader.downloader.c.O(), this);
            return;
        }
        h();
        try {
            this.f11032f.a(com.ss.android.socialbase.downloader.i.g.a(downloadTask));
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void c(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.ss.android.socialbase.downloader.downloader.d.a().a(downloadTask.getDownloadId(), true);
        a D = com.ss.android.socialbase.downloader.downloader.c.D();
        if (D != null) {
            D.a(downloadTask);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void f() {
        if (this.f11032f == null) {
            a(com.ss.android.socialbase.downloader.downloader.c.O(), this);
        }
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        this.f11032f = null;
        com.ss.android.socialbase.downloader.downloader.n nVar = this.f11033g;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z4;
        String str = f11031e;
        com.ss.android.socialbase.downloader.c.a.b(str, "onServiceConnected ");
        this.f11032f = i.a.a(iBinder);
        com.ss.android.socialbase.downloader.downloader.n nVar = this.f11033g;
        if (nVar != null) {
            nVar.a(iBinder);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onServiceConnected aidlService!=null");
        if (this.f11032f != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sb.append(z4);
        sb.append(" pendingTasks.size:");
        sb.append(this.f10586a.size());
        com.ss.android.socialbase.downloader.c.a.b(str, sb.toString());
        if (this.f11032f != null) {
            com.ss.android.socialbase.downloader.downloader.d.a().b();
            this.f10587b = true;
            this.f10589d = false;
            int i5 = this.f11034h;
            if (i5 != -1) {
                try {
                    this.f11032f.l(i5);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            }
            if (this.f11032f != null) {
                h();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        com.ss.android.socialbase.downloader.c.a.b(f11031e, "onServiceDisconnected ");
        this.f11032f = null;
        this.f10587b = false;
        com.ss.android.socialbase.downloader.downloader.n nVar = this.f11033g;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public IBinder a(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            Log.w(f11031e, "downloader process sync database on main process!");
            com.ss.android.socialbase.downloader.g.a.a("fix_sigbus_downloader_db", true);
        }
        com.ss.android.socialbase.downloader.c.a.b(f11031e, "onBind IndependentDownloadBinder");
        return new m();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void a(com.ss.android.socialbase.downloader.downloader.n nVar) {
        this.f11033g = nVar;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.a, com.ss.android.socialbase.downloader.downloader.o
    public void a(int i5) {
        com.ss.android.socialbase.downloader.downloader.i iVar = this.f11032f;
        if (iVar == null) {
            this.f11034h = i5;
            return;
        }
        try {
            iVar.l(i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
