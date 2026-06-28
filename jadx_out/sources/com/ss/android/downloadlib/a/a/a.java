package com.ss.android.downloadlib.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.downloadlib.a.a.c;
import com.ss.android.downloadlib.addownload.k;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static String f9541d = "";

    /* renamed from: e, reason: collision with root package name */
    private static String f9542e = "";

    /* renamed from: f, reason: collision with root package name */
    private static String f9543f = "";

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f9544g;

    /* renamed from: a, reason: collision with root package name */
    public c f9545a;

    /* renamed from: k, reason: collision with root package name */
    private Context f9551k;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9548h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9549i = false;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f9550j = false;

    /* renamed from: l, reason: collision with root package name */
    private final List<Pair<b, d>> f9552l = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC0180a> f9546b = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private final ServiceConnection f9553m = new ServiceConnection() { // from class: com.ss.android.downloadlib.a.a.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (a.this.f9547c) {
                a.this.a(false);
                a.this.f9545a = c.a.a(iBinder);
                a.this.c();
                Iterator<InterfaceC0180a> it = a.this.f9546b.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (a.this.f9547c) {
                a.this.a(false);
                a aVar = a.this;
                aVar.f9545a = null;
                Iterator<InterfaceC0180a> it = aVar.f9546b.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private String f9554n = "";

    /* renamed from: c, reason: collision with root package name */
    public final Object f9547c = new Object();

    /* renamed from: com.ss.android.downloadlib.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0180a {
        void a();

        void b();
    }

    private a() {
    }

    public static a a() {
        if (f9544g == null) {
            synchronized (a.class) {
                if (f9544g == null) {
                    f9544g = new a();
                }
            }
        }
        return f9544g;
    }

    public void b() {
        if (this.f9545a != null) {
            this.f9551k.unbindService(this.f9553m);
            this.f9545a = null;
        }
        this.f9546b.clear();
        this.f9552l.clear();
    }

    public void c() {
        for (Pair<b, d> pair : this.f9552l) {
            try {
                this.f9545a.a((b) pair.first, (d) pair.second);
            } catch (RemoteException e5) {
                e5.printStackTrace();
            }
        }
        this.f9552l.clear();
    }

    public boolean d() {
        return this.f9550j;
    }

    public boolean a(Context context, boolean z4) {
        if (TextUtils.isEmpty(f9541d)) {
            JSONObject j5 = k.j();
            String optString = j5.optString(bi.aE);
            f9541d = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("q"), optString);
            f9542e = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString(bi.aK), optString);
            f9543f = com.ss.android.socialbase.appdownloader.f.c.a(j5.optString("w"), optString);
        }
        this.f9549i = z4;
        if (context == null) {
            return true;
        }
        this.f9551k = context.getApplicationContext();
        if (TextUtils.isEmpty(f9543f)) {
            f9543f = this.f9551k.getPackageName();
        }
        if (this.f9545a != null || d()) {
            return true;
        }
        return this.f9551k.bindService(a(context), this.f9553m, 33);
    }

    public Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction(f9541d);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() != 1) {
            return null;
        }
        Iterator<ResolveInfo> it = queryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (f9542e.equals(str)) {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    public void a(b bVar, d dVar) {
        synchronized (this.f9547c) {
            bVar.f9560e = f9543f;
            if (TextUtils.isEmpty(bVar.f9561f)) {
                bVar.f9561f = this.f9554n;
            }
            c cVar = this.f9545a;
            if (cVar != null) {
                try {
                    cVar.a(bVar, dVar);
                } catch (RemoteException e5) {
                    e5.printStackTrace();
                }
            } else if (d() || a(this.f9551k, this.f9549i)) {
                this.f9552l.add(Pair.create(bVar, dVar));
            }
        }
    }

    public void a(boolean z4) {
        this.f9550j = z4;
    }
}
