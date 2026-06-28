package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import j0.a;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class g implements q.b {

    /* loaded from: classes2.dex */
    public static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22333a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f22334b;

        public b() {
            this.f22333a = false;
            this.f22334b = new LinkedBlockingQueue<>();
        }

        public IBinder a() throws InterruptedException {
            if (!this.f22333a) {
                this.f22333a = true;
                return this.f22334b.poll(5L, TimeUnit.SECONDS);
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f22334b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // q.b
    public String a(Context context) {
        b bVar = new b();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return a.AbstractBinderC0538a.a(bVar.a()).a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
