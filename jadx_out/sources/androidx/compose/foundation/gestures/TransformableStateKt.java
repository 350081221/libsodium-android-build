package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u000b\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000\u001a\\\u0010\f\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a,\u0010\u0011\u001a\u00020\b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a,\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0012\u001a/\u0010\u0018\u001a\u00020\b*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001c\u0010\u0019\u001a\u00020\b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001f\u0010\u001e\u001a\u00020\b*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010!\u001a\u00020\b*\u00020\n2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Lkotlin/Function3;", "", "Lkotlin/v0;", "name", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "Lkotlin/r2;", "onTransformation", "Landroidx/compose/foundation/gestures/TransformableState;", "TransformableState", "rememberTransformableState", "(Lv3/q;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TransformableState;", "zoomFactor", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateZoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "degrees", "animateRotateBy", TypedValues.CycleType.S_WAVE_OFFSET, "animatePanBy-ubNVwUQ", "(Landroidx/compose/foundation/gestures/TransformableState;JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animatePanBy", "zoomBy", "(Landroidx/compose/foundation/gestures/TransformableState;FLkotlin/coroutines/d;)Ljava/lang/Object;", "rotateBy", "panBy-d-4ec7I", "(Landroidx/compose/foundation/gestures/TransformableState;JLkotlin/coroutines/d;)Ljava/lang/Object;", "panBy", "Landroidx/compose/foundation/MutatePriority;", "terminationPriority", "stopTransformation", "(Landroidx/compose/foundation/gestures/TransformableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,262:1\n25#2:263\n1116#3,6:264\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/TransformableStateKt\n*L\n119#1:263\n119#1:264,6\n*E\n"})
/* loaded from: classes.dex */
public final class TransformableStateKt {
    @l
    public static final TransformableState TransformableState(@l q<? super Float, ? super Offset, ? super Float, r2> qVar) {
        return new DefaultTransformableState(qVar);
    }

    @m
    /* renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m414animatePanByubNVwUQ(@l TransformableState transformableState, long j5, @l AnimationSpec<Offset> animationSpec, @l d<? super r2> dVar) {
        Object l5;
        k1.g gVar = new k1.g();
        gVar.element = Offset.Companion.m3509getZeroF1C5BW0();
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(gVar, j5, animationSpec, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (transform$default == l5) {
            return transform$default;
        }
        return r2.f19517a;
    }

    /* renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m415animatePanByubNVwUQ$default(TransformableState transformableState, long j5, AnimationSpec animationSpec, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m414animatePanByubNVwUQ(transformableState, j5, animationSpec, dVar);
    }

    @m
    public static final Object animateRotateBy(@l TransformableState transformableState, float f5, @l AnimationSpec<Float> animationSpec, @l d<? super r2> dVar) {
        Object l5;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateRotateBy$2(new k1.e(), f5, animationSpec, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (transform$default == l5) {
            return transform$default;
        }
        return r2.f19517a;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f5, AnimationSpec animationSpec, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f5, animationSpec, dVar);
    }

    @m
    public static final Object animateZoomBy(@l TransformableState transformableState, float f5, @l AnimationSpec<Float> animationSpec, @l d<? super r2> dVar) {
        boolean z4;
        Object l5;
        if (f5 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            k1.e eVar = new k1.e();
            eVar.element = 1.0f;
            Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animateZoomBy$3(eVar, f5, animationSpec, null), dVar, 1, null);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (transform$default == l5) {
                return transform$default;
            }
            return r2.f19517a;
        }
        throw new IllegalArgumentException("zoom value should be greater than 0".toString());
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f5, AnimationSpec animationSpec, d dVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f5, animationSpec, dVar);
    }

    @m
    /* renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m416panByd4ec7I(@l TransformableState transformableState, long j5, @l d<? super r2> dVar) {
        Object l5;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j5, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return transform$default == l5 ? transform$default : r2.f19517a;
    }

    @l
    @Composable
    public static final TransformableState rememberTransformableState(@l q<? super Float, ? super Offset, ? super Float, r2> qVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(1681419281);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i5, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(qVar, composer, i5 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TransformableState(new TransformableStateKt$rememberTransformableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TransformableState transformableState = (TransformableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transformableState;
    }

    @m
    public static final Object rotateBy(@l TransformableState transformableState, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$rotateBy$2(f5, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return transform$default == l5 ? transform$default : r2.f19517a;
    }

    @m
    public static final Object stopTransformation(@l TransformableState transformableState, @l MutatePriority mutatePriority, @l d<? super r2> dVar) {
        Object l5;
        Object transform = transformableState.transform(mutatePriority, new TransformableStateKt$stopTransformation$2(null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return transform == l5 ? transform : r2.f19517a;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, dVar);
    }

    @m
    public static final Object zoomBy(@l TransformableState transformableState, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object transform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$zoomBy$2(f5, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return transform$default == l5 ? transform$default : r2.f19517a;
    }
}
