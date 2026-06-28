package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "Lkotlin/r2;", "init", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "DispatcherActivityCallback", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LifecycleDispatcher {

    @l
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();

    @l
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/r2;", "onActivityCreated", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l Activity activity, @m Bundle bundle) {
            l0.p(activity, "activity");
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }

    private LifecycleDispatcher() {
    }

    @u3.m
    public static final void init(@l Context context) {
        l0.p(context, "context");
        if (initialized.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        l0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }
}
