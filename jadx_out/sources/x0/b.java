package x0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import v0.a;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    public static String f22634e = "OpenDeviceId library";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f22635f = false;

    /* renamed from: b, reason: collision with root package name */
    public v0.a f22637b;

    /* renamed from: c, reason: collision with root package name */
    public ServiceConnection f22638c;

    /* renamed from: a, reason: collision with root package name */
    public Context f22636a = null;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0666b f22639d = null;

    /* loaded from: classes2.dex */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.f22637b = a.AbstractBinderC0664a.a(iBinder);
            if (b.this.f22639d != null) {
                b.this.f22639d.a("Deviceid Service Connected", b.this);
            }
            b.this.i("Service onServiceConnected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f22637b = null;
            b.this.i("Service onServiceDisconnected");
        }
    }

    /* renamed from: x0.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0666b<T> {
        void a(T t5, b bVar);
    }

    private void e(String str) {
        if (f22635f) {
            Log.e(f22634e, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        if (f22635f) {
            Log.i(f22634e, str);
        }
    }

    public int a(Context context, InterfaceC0666b<String> interfaceC0666b) {
        if (context != null) {
            this.f22636a = context;
            this.f22639d = interfaceC0666b;
            this.f22638c = new a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.f22636a.bindService(intent, this.f22638c, 1)) {
                i("bindService Successful!");
                return 1;
            }
            i("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }

    public String b() {
        Context context = this.f22636a;
        if (context != null) {
            String packageName = context.getPackageName();
            i("liufeng, getAAID package：" + packageName);
            if (packageName != null && !packageName.equals("")) {
                try {
                    v0.a aVar = this.f22637b;
                    if (aVar == null) {
                        return null;
                    }
                    String a5 = aVar.a(packageName);
                    if ((a5 == null || "".equals(a5)) && this.f22637b.c(packageName)) {
                        return this.f22637b.a(packageName);
                    }
                    return a5;
                } catch (RemoteException unused) {
                    e("getAAID error, RemoteException!");
                    return null;
                }
            }
            i("input package is null!");
            return null;
        }
        i("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public void g(boolean z4) {
        f22635f = z4;
    }

    public String h() {
        if (this.f22636a != null) {
            try {
                v0.a aVar = this.f22637b;
                if (aVar != null) {
                    return aVar.a();
                }
                return null;
            } catch (RemoteException e5) {
                e("getOAID error, RemoteException!");
                e5.printStackTrace();
                return null;
            }
        }
        e("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public String j() {
        if (this.f22636a != null) {
            try {
                v0.a aVar = this.f22637b;
                if (aVar != null) {
                    return aVar.b();
                }
                return null;
            } catch (RemoteException e5) {
                e("getUDID error, RemoteException!");
                e5.printStackTrace();
                return null;
            } catch (Exception e6) {
                e("getUDID error, Exception!");
                e6.printStackTrace();
                return null;
            }
        }
        e("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public String k() {
        Context context = this.f22636a;
        if (context != null) {
            String packageName = context.getPackageName();
            i("liufeng, getVAID package：" + packageName);
            if (packageName != null && !packageName.equals("")) {
                try {
                    v0.a aVar = this.f22637b;
                    if (aVar != null) {
                        return aVar.b(packageName);
                    }
                    return null;
                } catch (RemoteException e5) {
                    e("getVAID error, RemoteException!");
                    e5.printStackTrace();
                    return null;
                }
            }
            i("input package is null!");
            return null;
        }
        i("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    public boolean l() {
        try {
            if (this.f22637b == null) {
                return false;
            }
            i("Device support opendeviceid");
            return this.f22637b.c();
        } catch (RemoteException unused) {
            e("isSupport error, RemoteException!");
            return false;
        }
    }

    public void m() {
        try {
            this.f22636a.unbindService(this.f22638c);
            i("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            e("unBind Service exception");
        }
        this.f22637b = null;
    }
}
