package androidx.lifecycle;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "postDispatchRunnable", "onServicePreSuperOnCreate", "onServicePreSuperOnBind", "onServicePreSuperOnStart", "onServicePreSuperOnDestroy", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "lastDispatchRunnable", "Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "provider", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class ServiceLifecycleDispatcher {

    @l
    private final Handler handler;

    @m
    private DispatchRunnable lastDispatchRunnable;

    @l
    private final LifecycleRegistry registry;

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "Lkotlin/r2;", "run", "Landroidx/lifecycle/LifecycleRegistry;", "registry", "Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "", "wasExecuted", "Z", "<init>", "(Landroidx/lifecycle/LifecycleRegistry;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class DispatchRunnable implements Runnable {

        @l
        private final Lifecycle.Event event;

        @l
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(@l LifecycleRegistry registry, @l Lifecycle.Event event) {
            l0.p(registry, "registry");
            l0.p(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @l
        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.wasExecuted) {
                this.registry.handleLifecycleEvent(this.event);
                this.wasExecuted = true;
            }
        }
    }

    public ServiceLifecycleDispatcher(@l LifecycleOwner provider) {
        l0.p(provider, "provider");
        this.registry = new LifecycleRegistry(provider);
        this.handler = new Handler();
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        Handler handler = this.handler;
        l0.m(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    @l
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
