package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0084\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012*\b\n\u0010\b\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u0006¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2&\u0010\u000e\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aD\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"S", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "transitionSpec", "", TTDownloadField.TT_LABEL, "Lkotlin/v0;", "name", "state", "targetValueByState", "Landroidx/compose/runtime/State;", "animateColor", "(Landroidx/compose/animation/core/Transition;Lv3/q;Ljava/lang/String;Lv3/q;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animationSpec", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n36#2:125\n25#2:137\n1116#3,6:126\n1116#3,6:138\n1083#4,5:132\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125\n103#1:137\n70#1:126,6\n103#1:138,6\n74#1:132,5\n*E\n"})
/* loaded from: classes.dex */
public final class TransitionKt {
    @l
    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final <S> State<Color> animateColor(@l Transition<S> transition, @m q<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> qVar, @m String str, @l q<? super S, ? super Composer, ? super Integer, Color> qVar2, @m Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1939694975);
        if ((i6 & 1) != 0) {
            qVar = TransitionKt$animateColor$1.INSTANCE;
        }
        if ((i6 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace m3738getColorSpaceimpl = Color.m3738getColorSpaceimpl(qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf((i5 >> 6) & 112)).m3744unboximpl());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m3738getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m3738getColorSpaceimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
        int i7 = (i5 & 14) | 64;
        int i8 = i5 << 3;
        int i9 = i7 | (i8 & 896) | (i8 & 7168) | (i8 & 57344);
        composer.startReplaceableGroup(-142660079);
        int i10 = (i9 >> 9) & 112;
        State<Color> createTransitionAnimation = androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, qVar2.invoke(transition.getCurrentState(), composer, Integer.valueOf(i10)), qVar2.invoke(transition.getTargetState(), composer, Integer.valueOf(i10)), qVar.invoke(transition.getSegment(), composer, Integer.valueOf((i9 >> 3) & 112)), twoWayConverter, str2, composer, (i9 & 14) | ((i9 << 9) & 57344) | ((i9 << 6) & 458752));
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return createTransitionAnimation;
    }

    @l
    @Composable
    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m106animateColorDTcfvLk(@l InfiniteTransition infiniteTransition, long j5, long j6, @l InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, @m String str, @m Composer composer, int i5, int i6) {
        String str2;
        composer.startReplaceableGroup(1901963533);
        if ((i6 & 8) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i5, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m3738getColorSpaceimpl(j6));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i7 = i5 << 3;
        State<Color> animateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m3724boximpl(j5), Color.m3724boximpl(j6), (TwoWayConverter) rememberedValue, infiniteRepeatableSpec, str2, composer, InfiniteTransition.$stable | 4096 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i7) | (i7 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValue;
    }

    @Composable
    @k(level = kotlin.m.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m107animateColorRIQooxk(InfiniteTransition infiniteTransition, long j5, long j6, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i5) {
        composer.startReplaceableGroup(1400583834);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i5, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        State<Color> m106animateColorDTcfvLk = m106animateColorDTcfvLk(infiniteTransition, j5, j6, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i5 & 14) | (i5 & 112) | (i5 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i5 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m106animateColorDTcfvLk;
    }
}
