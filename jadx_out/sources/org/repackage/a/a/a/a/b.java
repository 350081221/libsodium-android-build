package org.repackage.a.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.a.a.a.a;

/* loaded from: classes4.dex */
public class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f22097a;

    public b(c cVar) {
        this.f22097a = cVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22097a.f22098a = a.AbstractBinderC0656a.a(iBinder);
        synchronized (this.f22097a.f22101d) {
            this.f22097a.f22101d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f22097a.f22098a = null;
    }
}
