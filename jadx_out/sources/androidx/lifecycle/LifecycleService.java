package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0017J\"\u0010\r\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/r2;", "onCreate", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/os/IBinder;", "onBind", "", "startId", "onStart", "flags", "onStartCommand", "onDestroy", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "dispatcher", "Landroidx/lifecycle/ServiceLifecycleDispatcher;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class LifecycleService extends Service implements LifecycleOwner {

    @l
    private final ServiceLifecycleDispatcher dispatcher = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.dispatcher.getLifecycle();
    }

    @Override // android.app.Service
    @CallSuper
    @m
    public IBinder onBind(@l Intent intent) {
        l0.p(intent, "intent");
        this.dispatcher.onServicePreSuperOnBind();
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.dispatcher.onServicePreSuperOnCreate();
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.dispatcher.onServicePreSuperOnDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    @k(message = "Deprecated in Java")
    @CallSuper
    public void onStart(@m Intent intent, int i5) {
        this.dispatcher.onServicePreSuperOnStart();
        super.onStart(intent, i5);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@m Intent intent, int i5, int i6) {
        return super.onStartCommand(intent, i5, i6);
    }
}
