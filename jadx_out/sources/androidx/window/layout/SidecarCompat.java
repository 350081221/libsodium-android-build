package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0005&'()*B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006+"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroid/app/Activity;", "activity", "Lkotlin/r2;", "registerConfigurationChangeListener", "unregisterComponentCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "setExtensionCallback", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "onWindowLayoutChangeListenerAdded", "Landroid/os/IBinder;", "windowToken", "register", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "", "windowListenerRegisteredContexts", "Ljava/util/Map;", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", com.umeng.analytics.pro.d.X, "(Landroid/content/Context;)V", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class SidecarCompat implements ExtensionInterfaceCompat {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String TAG = "SidecarCompat";

    @l
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;

    @m
    private ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;

    @m
    private final SidecarInterface sidecar;

    @l
    private final SidecarAdapter sidecarAdapter;

    @l
    private final Map<IBinder, Activity> windowListenerRegisteredContexts;

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @m
        public final IBinder getActivityWindowToken$window_release(@m Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @m
        public final SidecarInterface getSidecarCompat$window_release(@l Context context) {
            l0.p(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @m
        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return Version.Companion.parse(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Lkotlin/r2;", "onWindowLayoutChanged", "callbackInterface", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "<init>", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    private static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {

        @l
        @GuardedBy("mLock")
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo;

        @l
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;

        @l
        private final ReentrantLock lock;

        public DistinctElementCallback(@l ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface) {
            l0.p(callbackInterface, "callbackInterface");
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.activityWindowLayoutInfo = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface
        public void onWindowLayoutChanged(@l Activity activity, @l WindowLayoutInfo newLayout) {
            l0.p(activity, "activity");
            l0.p(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (l0.g(newLayout, this.activityWindowLayoutInfo.get(activity))) {
                    return;
                }
                this.activityWindowLayoutInfo.put(activity, newLayout);
                reentrantLock.unlock();
                this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/r2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "callbackInterface", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "Ljava/util/WeakHashMap;", "mActivityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "<init>", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        @l
        private final SidecarInterface.SidecarCallback callbackInterface;

        @GuardedBy("lock")
        @m
        private SidecarDeviceState lastDeviceState;

        @l
        private final ReentrantLock lock;

        @l
        @GuardedBy("mLock")
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo;

        @l
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(@l SidecarAdapter sidecarAdapter, @l SidecarInterface.SidecarCallback callbackInterface) {
            l0.p(sidecarAdapter, "sidecarAdapter");
            l0.p(callbackInterface, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter;
            this.callbackInterface = callbackInterface;
            this.lock = new ReentrantLock();
            this.mActivityWindowLayoutInfo = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@l SidecarDeviceState newDeviceState) {
            l0.p(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    return;
                }
                this.lastDeviceState = newDeviceState;
                this.callbackInterface.onDeviceStateChanged(newDeviceState);
                r2 r2Var = r2.f19517a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@l IBinder token, @l SidecarWindowLayoutInfo newLayout) {
            l0.p(token, "token");
            l0.p(newLayout, "newLayout");
            synchronized (this.lock) {
                if (this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    return;
                }
                this.mActivityWindowLayoutInfo.put(token, newLayout);
                this.callbackInterface.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/r2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "activity", "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    private static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {

        @l
        private final WeakReference<Activity> activityWeakReference;

        @l
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(@l SidecarCompat sidecarCompat, @l Activity activity) {
            l0.p(sidecarCompat, "sidecarCompat");
            l0.p(activity, "activity");
            this.sidecarCompat = sidecarCompat;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@l View view) {
            l0.p(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity == null || activityWindowToken$window_release == null) {
                return;
            }
            this.sidecarCompat.register(activityWindowToken$window_release, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@l View view) {
            l0.p(view, "view");
        }
    }

    @i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/r2;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$0) {
            l0.p(this$0, "this$0");
            this.this$0 = this$0;
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDeviceStateChanged(@l SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            l0.p(newDeviceState, "newDeviceState");
            Collection<Activity> values = this.this$0.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (activityWindowToken$window_release != null && (sidecar = sidecarCompat.getSidecar()) != null) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = sidecarCompat.extensionCallback;
                if (extensionCallbackInterface != null) {
                    extensionCallbackInterface.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, newDeviceState));
                }
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@l IBinder windowToken, @l SidecarWindowLayoutInfo newLayout) {
            SidecarDeviceState deviceState;
            l0.p(windowToken, "windowToken");
            l0.p(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter sidecarAdapter = this.this$0.sidecarAdapter;
            SidecarInterface sidecar = this.this$0.getSidecar();
            if (sidecar == null) {
                deviceState = null;
            } else {
                deviceState = sidecar.getDeviceState();
            }
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo translate = sidecarAdapter.translate(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.this$0.extensionCallback;
            if (extensionCallbackInterface != null) {
                extensionCallbackInterface.onWindowLayoutChanged(activity, translate);
            }
        }
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting @m SidecarInterface sidecarInterface, @l SidecarAdapter sidecarAdapter) {
        l0.p(sidecarAdapter, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: androidx.window.layout.SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(@l Configuration newConfig) {
                    l0.p(newConfig, "newConfig");
                    ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = SidecarCompat.this.extensionCallback;
                    if (extensionCallbackInterface != null) {
                        Activity activity2 = activity;
                        extensionCallbackInterface.onWindowLayoutChanged(activity2, SidecarCompat.this.getWindowLayoutInfo(activity2));
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            this.componentCallbackMap.put(activity, componentCallbacks);
            activity.registerComponentCallbacks(componentCallbacks);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    @m
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @l
    @VisibleForTesting
    public final WindowLayoutInfo getWindowLayoutInfo(@l Activity activity) {
        SidecarWindowLayoutInfo windowLayoutInfo;
        List E;
        l0.p(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            E = kotlin.collections.w.E();
            return new WindowLayoutInfo(E);
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarDeviceState sidecarDeviceState = null;
        if (sidecarInterface == null) {
            windowLayoutInfo = null;
        } else {
            windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release);
        }
        SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, sidecarDeviceState);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerAdded(@l Activity activity) {
        l0.p(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
        }
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void onWindowLayoutChangeListenerRemoved(@l Activity activity) {
        boolean z4;
        SidecarInterface sidecarInterface;
        l0.p(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        unregisterComponentCallback(activity);
        if (this.windowListenerRegisteredContexts.size() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (z4 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void register(@l IBinder windowToken, @l Activity activity) {
        SidecarInterface sidecarInterface;
        l0.p(windowToken, "windowToken");
        l0.p(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    @Override // androidx.window.layout.ExtensionInterfaceCompat
    public void setExtensionCallback(@l ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback) {
        l0.p(extensionCallback, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a6 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0059 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0020 A[Catch: all -> 0x0196, TryCatch #1 {all -> 0x0196, blocks: (B:3:0x0001, B:8:0x0024, B:10:0x002c, B:13:0x0034, B:16:0x003c, B:22:0x005d, B:24:0x0065, B:29:0x0084, B:31:0x008c, B:36:0x00aa, B:38:0x00b2, B:41:0x00b8, B:42:0x00ee, B:44:0x010a, B:49:0x010d, B:51:0x013c, B:53:0x0146, B:54:0x014d, B:55:0x014e, B:56:0x0155, B:58:0x00bb, B:60:0x00e6, B:62:0x0156, B:63:0x015d, B:64:0x015e, B:65:0x0165, B:66:0x0166, B:67:0x0171, B:68:0x00a6, B:69:0x0092, B:72:0x0099, B:73:0x0172, B:74:0x017d, B:75:0x0080, B:76:0x006b, B:79:0x0072, B:80:0x017e, B:81:0x0189, B:82:0x0059, B:83:0x0044, B:86:0x004b, B:87:0x0039, B:88:0x0031, B:89:0x018a, B:90:0x0195, B:91:0x0020, B:92:0x0009, B:95:0x0010), top: B:2:0x0001, inners: #0, #2 }] */
    @Override // androidx.window.layout.ExtensionInterfaceCompat
    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean validateExtensionInterface() {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SidecarCompat(@l Context context) {
        this(Companion.getSidecarCompat$window_release(context), new SidecarAdapter(null, 1, 0 == true ? 1 : 0));
        l0.p(context, "context");
    }
}
