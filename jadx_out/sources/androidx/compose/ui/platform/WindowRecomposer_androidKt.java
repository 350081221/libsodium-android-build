package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.R;
import androidx.core.os.HandlerCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.flow.o0;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0011\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\"\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\"&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\",\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0019\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u001e\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/CompositionContext;", "findViewTreeCompositionContext", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/t0;", "", "getAnimationScaleFlowFor", "Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "createLifecycleAwareWindowRecomposer", "", "animationScale", "Ljava/util/Map;", t0.b.f22420d, "getCompositionContext", "(Landroid/view/View;)Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroid/view/View;Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "getContentChild", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "getWindowRecomposer", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n35#2:443\n361#3,7:444\n1#4:451\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:443\n99#1:444,7\n*E\n"})
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    @p4.l
    private static final Map<Context, kotlinx.coroutines.flow.t0<Float>> animationScale = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.ui.platform.MotionDurationScaleImpl] */
    @p4.l
    @ExperimentalComposeUiApi
    public static final Recomposer createLifecycleAwareWindowRecomposer(@p4.l final View view, @p4.l kotlin.coroutines.g gVar, @p4.m Lifecycle lifecycle) {
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        kotlin.coroutines.g gVar2;
        if (gVar.get(kotlin.coroutines.e.S) == null || gVar.get(MonotonicFrameClock.Key) == null) {
            gVar = AndroidUiDispatcher.Companion.getCurrentThread().plus(gVar);
        }
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) gVar.get(MonotonicFrameClock.Key);
        if (monotonicFrameClock != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
            pausableMonotonicFrameClock2.pause();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        final k1.h hVar = new k1.h();
        MotionDurationScale motionDurationScale = (MotionDurationScale) gVar.get(MotionDurationScale.Key);
        MotionDurationScale motionDurationScale2 = motionDurationScale;
        if (motionDurationScale == null) {
            ?? motionDurationScaleImpl = new MotionDurationScaleImpl();
            hVar.element = motionDurationScaleImpl;
            motionDurationScale2 = motionDurationScaleImpl;
        }
        if (pausableMonotonicFrameClock != null) {
            gVar2 = pausableMonotonicFrameClock;
        } else {
            gVar2 = kotlin.coroutines.i.INSTANCE;
        }
        kotlin.coroutines.g plus = gVar.plus(gVar2).plus(motionDurationScale2);
        final Recomposer recomposer = new Recomposer(plus);
        recomposer.pauseCompositionFrameClock();
        final kotlinx.coroutines.s0 a5 = kotlinx.coroutines.t0.a(plus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
            if (lifecycleOwner != null) {
                lifecycle = lifecycleOwner.getLifecycle();
            } else {
                lifecycle = null;
            }
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@p4.l View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@p4.l View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.cancel();
                }
            });
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
                /* loaded from: classes.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        try {
                            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@p4.l LifecycleOwner lifecycleOwner2, @p4.l Lifecycle.Event event) {
                    int i5 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 == 4) {
                                    recomposer.cancel();
                                    return;
                                }
                                return;
                            }
                            recomposer.pauseCompositionFrameClock();
                            return;
                        }
                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock3 != null) {
                            pausableMonotonicFrameClock3.resume();
                        }
                        recomposer.resumeCompositionFrameClock();
                        return;
                    }
                    kotlinx.coroutines.k.f(kotlinx.coroutines.s0.this, null, kotlinx.coroutines.u0.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(hVar, recomposer, lifecycleOwner2, this, view, null), 1, null);
                }
            });
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer createLifecycleAwareWindowRecomposer$default(View view, kotlin.coroutines.g gVar, Lifecycle lifecycle, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            gVar = kotlin.coroutines.i.INSTANCE;
        }
        if ((i5 & 2) != 0) {
            lifecycle = null;
        }
        return createLifecycleAwareWindowRecomposer(view, gVar, lifecycle);
    }

    @p4.m
    public static final CompositionContext findViewTreeCompositionContext(@p4.l View view) {
        CompositionContext compositionContext = getCompositionContext(view);
        if (compositionContext != null) {
            return compositionContext;
        }
        for (ViewParent parent = view.getParent(); compositionContext == null && (parent instanceof View); parent = parent.getParent()) {
            compositionContext = getCompositionContext((View) parent);
        }
        return compositionContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1] */
    public static final kotlinx.coroutines.flow.t0<Float> getAnimationScaleFlowFor(Context context) {
        kotlinx.coroutines.flow.t0<Float> t0Var;
        Map<Context, kotlinx.coroutines.flow.t0<Float>> map = animationScale;
        synchronized (map) {
            kotlinx.coroutines.flow.t0<Float> t0Var2 = map.get(context);
            if (t0Var2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                final kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                final Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
                t0Var2 = kotlinx.coroutines.flow.k.O1(kotlinx.coroutines.flow.k.J0(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new ContentObserver(createAsync) { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z4, @p4.m Uri uri) {
                        d5.p(r2.f19517a);
                    }
                }, d5, context, null)), kotlinx.coroutines.t0.b(), o0.a.b(kotlinx.coroutines.flow.o0.f20189a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, t0Var2);
            }
            t0Var = t0Var2;
        }
        return t0Var;
    }

    @p4.m
    public static final CompositionContext getCompositionContext(@p4.l View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof CompositionContext) {
            return (CompositionContext) tag;
        }
        return null;
    }

    private static final View getContentChild(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @p4.l
    public static final Recomposer getWindowRecomposer(@p4.l View view) {
        if (view.isAttachedToWindow()) {
            View contentChild = getContentChild(view);
            CompositionContext compositionContext = getCompositionContext(contentChild);
            if (compositionContext == null) {
                return WindowRecomposerPolicy.INSTANCE.createAndInstallWindowRecomposer$ui_release(contentChild);
            }
            if (compositionContext instanceof Recomposer) {
                return (Recomposer) compositionContext;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static /* synthetic */ void getWindowRecomposer$annotations(View view) {
    }

    public static final void setCompositionContext(@p4.l View view, @p4.m CompositionContext compositionContext) {
        view.setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
    }
}
