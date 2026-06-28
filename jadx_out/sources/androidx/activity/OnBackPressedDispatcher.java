package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.apache.commons.logging.LogFactory;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00042345B!\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 ¢\u0006\u0004\b/\u00100B\u0015\b\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b/\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003J\b\u0010\u000b\u001a\u00020\u0004H\u0003J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0018\u001a\u00020\u0002H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u001b\u001a\u00020\u0004H\u0007J\b\u0010\u001c\u001a\u00020\u0004H\u0007R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0018\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010.¨\u00066"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "", "shouldBeRegistered", "Lkotlin/r2;", "updateBackInvokedCallbackState", "updateEnabledCallbacks", "Landroidx/activity/BackEventCompat;", "backEvent", "onBackStarted", "onBackProgressed", "onBackCancelled", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "setOnBackInvokedDispatcher", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "(Landroidx/activity/OnBackPressedCallback;)Landroidx/activity/Cancellable;", "addCancellableCallback", "Landroidx/lifecycle/LifecycleOwner;", "owner", "hasEnabledCallbacks", "dispatchOnBackStarted", "dispatchOnBackProgressed", "onBackPressed", "dispatchOnBackCancelled", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Ljava/lang/Runnable;", "Landroidx/core/util/Consumer;", "onHasEnabledCallbacksChanged", "Landroidx/core/util/Consumer;", "Lkotlin/collections/k;", "onBackPressedCallbacks", "Lkotlin/collections/k;", "inProgressCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "backInvokedCallbackRegistered", "Z", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1747#2,3:434\n533#2,6:437\n533#2,6:443\n533#2,6:449\n533#2,6:455\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:434,3\n233#1:437,6\n254#1:443,6\n274#1:449,6\n293#1:455,6\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;

    @p4.m
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;

    @p4.m
    private OnBackPressedCallback inProgressCallback;

    @p4.m
    private OnBackInvokedDispatcher invokedDispatcher;

    @p4.m
    private OnBackInvokedCallback onBackInvokedCallback;

    @p4.l
    private final kotlin.collections.k<OnBackPressedCallback> onBackPressedCallbacks;

    @p4.m
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Lkotlin/r2;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<BackEventCompat, r2> {
        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BackEventCompat backEventCompat) {
            invoke2(backEventCompat);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l BackEventCompat backEvent) {
            l0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackStarted(backEvent);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/activity/BackEventCompat;", "backEvent", "Lkotlin/r2;", "invoke", "(Landroidx/activity/BackEventCompat;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends n0 implements v3.l<BackEventCompat, r2> {
        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(BackEventCompat backEventCompat) {
            invoke2(backEventCompat);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l BackEventCompat backEvent) {
            l0.p(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackProgressed(backEvent);
        }
    }

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends n0 implements v3.a<r2> {
        AnonymousClass3() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends n0 implements v3.a<r2> {
        AnonymousClass4() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.onBackCancelled();
        }
    }

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.OnBackPressedDispatcher$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends n0 implements v3.a<r2> {
        AnonymousClass5() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "dispatcher", "", LogFactory.PRIORITY_KEY, "callback", "Lkotlin/r2;", "registerOnBackInvokedCallback", "unregisterOnBackInvokedCallback", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "createOnBackInvokedCallback", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(33)
    /* loaded from: classes.dex */
    public static final class Api33Impl {

        @p4.l
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(v3.a onBackInvoked) {
            l0.p(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        @p4.l
        @DoNotInline
        public final OnBackInvokedCallback createOnBackInvokedCallback(@p4.l final v3.a<r2> onBackInvoked) {
            l0.p(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.u
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(v3.a.this);
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(@p4.l Object dispatcher, int i5, @p4.l Object callback) {
            l0.p(dispatcher, "dispatcher");
            l0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i5, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(@p4.l Object dispatcher, @p4.l Object callback) {
            l0.p(dispatcher, "dispatcher");
            l0.p(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u000e\u001a\u00020\r2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0007¨\u0006\u0011"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "Lkotlin/v0;", "name", "backEvent", "Lkotlin/r2;", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "createOnBackAnimationCallback", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(34)
    /* loaded from: classes.dex */
    public static final class Api34Impl {

        @p4.l
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @p4.l
        @DoNotInline
        public final OnBackInvokedCallback createOnBackAnimationCallback(@p4.l final v3.l<? super BackEventCompat, r2> onBackStarted, @p4.l final v3.l<? super BackEventCompat, r2> onBackProgressed, @p4.l final v3.a<r2> onBackInvoked, @p4.l final v3.a<r2> onBackCancelled) {
            l0.p(onBackStarted, "onBackStarted");
            l0.p(onBackProgressed, "onBackProgressed");
            l0.p(onBackInvoked, "onBackInvoked");
            l0.p(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(@p4.l BackEvent backEvent) {
                    l0.p(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(@p4.l BackEvent backEvent) {
                    l0.p(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/r2;", "onStateChanged", "cancel", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "currentCancellable", "Landroidx/activity/Cancellable;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {

        @p4.m
        private Cancellable currentCancellable;

        @p4.l
        private final Lifecycle lifecycle;

        @p4.l
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(@p4.l OnBackPressedDispatcher onBackPressedDispatcher, @p4.l Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            l0.p(lifecycle, "lifecycle");
            l0.p(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@p4.l LifecycleOwner source, @p4.l Lifecycle.Event event) {
            l0.p(source, "source");
            l0.p(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "Lkotlin/r2;", "cancel", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class OnBackPressedCancellable implements Cancellable {

        @p4.l
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(@p4.l OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            l0.p(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (l0.g(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            v3.a<r2> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u3.i
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OnBackPressedDispatcher(@p4.m Runnable runnable, @p4.m Consumer<Boolean> consumer) {
        OnBackInvokedCallback createOnBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new kotlin.collections.k<>();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            if (i5 >= 34) {
                createOnBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4());
            } else {
                createOnBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new AnonymousClass5());
            }
            this.onBackInvokedCallback = createOnBackInvokedCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            kotlin.collections.k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = null;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            kotlin.collections.k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = null;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackStarted(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallback;
        kotlin.collections.k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                onBackPressedCallback = listIterator.previous();
                if (onBackPressedCallback.isEnabled()) {
                    break;
                }
            } else {
                onBackPressedCallback = null;
                break;
            }
        }
        OnBackPressedCallback onBackPressedCallback2 = onBackPressedCallback;
        if (this.inProgressCallback != null) {
            onBackCancelled();
        }
        this.inProgressCallback = onBackPressedCallback2;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z4 && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = true;
            } else if (!z4 && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z4 = this.hasEnabledCallbacks;
        kotlin.collections.k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
        boolean z5 = false;
        if (!(kVar instanceof Collection) || !kVar.isEmpty()) {
            Iterator<OnBackPressedCallback> it = kVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z5 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z5;
        if (z5 != z4) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z5));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z5);
            }
        }
    }

    @MainThread
    public final void addCallback(@p4.l OnBackPressedCallback onBackPressedCallback) {
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @p4.l
    @MainThread
    public final Cancellable addCancellableCallback$activity_release(@p4.l OnBackPressedCallback onBackPressedCallback) {
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(@p4.l BackEventCompat backEvent) {
        l0.p(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(@p4.l BackEventCompat backEvent) {
        l0.p(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            kotlin.collections.k<OnBackPressedCallback> kVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = kVar.listIterator(kVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    onBackPressedCallback = listIterator.previous();
                    if (onBackPressedCallback.isEnabled()) {
                        break;
                    }
                } else {
                    onBackPressedCallback = null;
                    break;
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(@p4.l OnBackInvokedDispatcher invoker) {
        l0.p(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    @MainThread
    public final void addCallback(@p4.l LifecycleOwner owner, @p4.l OnBackPressedCallback onBackPressedCallback) {
        l0.p(owner, "owner");
        l0.p(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? null : runnable);
    }

    @u3.i
    public OnBackPressedDispatcher(@p4.m Runnable runnable) {
        this(runnable, null);
    }
}
