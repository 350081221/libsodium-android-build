package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", TTDownloadField.TT_LABEL, "Lkotlin/Function1;", "Lkotlin/r2;", "finishedListener", "Landroidx/compose/runtime/State;", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateColorAsState", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lv3/l;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "initialValue", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "Animatable", "Landroidx/compose/animation/core/SpringSpec;", "colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "animation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n36#2:112\n1116#3,6:113\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:112\n63#1:113,6\n*E\n"})
/* loaded from: classes.dex */
public final class SingleValueAnimationKt {

    @l
    private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);

    @l
    /* renamed from: Animatable-8_81llA, reason: not valid java name */
    public static final Animatable<Color, AnimationVector4D> m94Animatable8_81llA(long j5) {
        return new Animatable<>(Color.m3724boximpl(j5), ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m3738getColorSpaceimpl(j5)), null, null, 12, null);
    }

    @Composable
    @k(level = m.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateColorAsState-KTwxG1Y, reason: not valid java name */
    public static final /* synthetic */ State m95animateColorAsStateKTwxG1Y(long j5, AnimationSpec animationSpec, v3.l lVar, Composer composer, int i5, int i6) {
        composer.startReplaceableGroup(-1942442407);
        if ((i6 & 2) != 0) {
            animationSpec = colorDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i6 & 4) != 0) {
            lVar = null;
        }
        v3.l lVar2 = lVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1942442407, i5, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:79)");
        }
        State<Color> m96animateColorAsStateeuL9pac = m96animateColorAsStateeuL9pac(j5, animationSpec2, null, lVar2, composer, (i5 & 14) | 64 | ((i5 << 3) & 7168), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m96animateColorAsStateeuL9pac;
    }

    @l
    @Composable
    /* renamed from: animateColorAsState-euL9pac, reason: not valid java name */
    public static final State<Color> m96animateColorAsStateeuL9pac(long j5, @p4.m AnimationSpec<Color> animationSpec, @p4.m String str, @p4.m v3.l<? super Color, r2> lVar, @p4.m Composer composer, int i5, int i6) {
        AnimationSpec<Color> animationSpec2;
        String str2;
        v3.l<? super Color, r2> lVar2;
        composer.startReplaceableGroup(-451899108);
        if ((i6 & 2) != 0) {
            animationSpec2 = colorDefaultSpring;
        } else {
            animationSpec2 = animationSpec;
        }
        if ((i6 & 4) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if ((i6 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-451899108, i5, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)");
        }
        ColorSpace m3738getColorSpaceimpl = Color.m3738getColorSpaceimpl(j5);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(m3738getColorSpaceimpl);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.m3738getColorSpaceimpl(j5));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        int i7 = i5 << 6;
        State<Color> animateValueAsState = AnimateAsStateKt.animateValueAsState(Color.m3724boximpl(j5), (TwoWayConverter) rememberedValue, animationSpec2, null, str2, lVar2, composer, (i5 & 14) | 576 | (57344 & i7) | (i7 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return animateValueAsState;
    }
}
