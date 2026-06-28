package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0007¢\u0006\u0002\u0010\r\u001a?\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u000e\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\fH\u0007¢\u0006\u0002\u0010\u0015\u001ac\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0011*\u00020\u0012*\u00020\u00012\u0006\u0010\t\u001a\u0002H\u00102\u0006\u0010\n\u001a\u0002H\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00110\u00142\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00100\f2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", TTDownloadField.TT_LABEL, "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n25#2:365\n25#2:372\n1116#3,6:366\n1116#3,6:373\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365\n263#1:372\n46#1:366,6\n263#1:373,6\n*E\n"})
/* loaded from: classes.dex */
public final class InfiniteTransitionKt {
    @l
    @Composable
    public static final State<Float> animateFloat(@l InfiniteTransition infiniteTransition, float f5, float f6, @l InfiniteRepeatableSpec<Float> infiniteRepeatableSpec, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-644770905);
        String str2 = (i6 & 8) != 0 ? "FloatAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-644770905, i5, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i7 = i5 << 3;
        State<Float> animateValue = animateValue(infiniteTransition, Float.valueOf(f5), Float.valueOf(f6), VectorConvertersKt.getVectorConverter(a0.f19382a), infiniteRepeatableSpec, str2, composer, (i5 & 112) | 8 | (i5 & 896) | (57344 & i7) | (i7 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @l
    @Composable
    public static final <T, V extends AnimationVector> State<T> animateValue(@l InfiniteTransition infiniteTransition, T t5, T t6, @l TwoWayConverter<T, V> twoWayConverter, @l InfiniteRepeatableSpec<T> infiniteRepeatableSpec, @m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1062847727);
        String str2 = (i6 & 16) != 0 ? "ValueAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1062847727, i5, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition.TransitionAnimationState(t5, t6, twoWayConverter, infiniteRepeatableSpec, str2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition.TransitionAnimationState transitionAnimationState = (InfiniteTransition.TransitionAnimationState) rememberedValue;
        EffectsKt.SideEffect(new InfiniteTransitionKt$animateValue$1(t5, transitionAnimationState, t6, infiniteRepeatableSpec), composer, 0);
        EffectsKt.DisposableEffect(transitionAnimationState, new InfiniteTransitionKt$animateValue$2(infiniteTransition, transitionAnimationState), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return transitionAnimationState;
    }

    @l
    @Composable
    public static final InfiniteTransition rememberInfiniteTransition(@m String str, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(1013651573);
        if ((i6 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1013651573, i5, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new InfiniteTransition(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InfiniteTransition infiniteTransition = (InfiniteTransition) rememberedValue;
        infiniteTransition.run$animation_core_release(composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return infiniteTransition;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animateFloat APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloat(InfiniteTransition infiniteTransition, float f5, float f6, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i5) {
        composer.startReplaceableGroup(469472752);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469472752, i5, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:356)");
        }
        State<Float> animateFloat = animateFloat(infiniteTransition, f5, f6, infiniteRepeatableSpec, "FloatAnimation", composer, (i5 & 112) | 24584 | (i5 & 896) | (i5 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateFloat;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "rememberInfiniteTransition APIs now have a new label parameter added.")
    public static final /* synthetic */ InfiniteTransition rememberInfiniteTransition(Composer composer, int i5) {
        composer.startReplaceableGroup(-840193660);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840193660, i5, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:323)");
        }
        InfiniteTransition rememberInfiniteTransition = rememberInfiniteTransition("InfiniteTransition", composer, 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberInfiniteTransition;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animateValue APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValue(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i5) {
        composer.startReplaceableGroup(-1695411770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695411770, i5, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:337)");
        }
        int i6 = (i5 >> 3) & 8;
        State animateValue = animateValue(infiniteTransition, obj, obj2, twoWayConverter, infiniteRepeatableSpec, "ValueAnimation", composer, (i6 << 6) | (i6 << 3) | 196616 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }
}
