package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0016\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "animatedCenter", "platformMagnifier", "animatedSelectionMagnifier", "targetCalculation", "Landroidx/compose/runtime/State;", "rememberAnimatedMagnifierPosition", "(Lv3/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/TwoWayConverter;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "OffsetDisplacementThreshold", "J", "getOffsetDisplacementThreshold", "()J", "Landroidx/compose/animation/core/SpringSpec;", "MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n25#2:110\n25#2:117\n1116#3,6:111\n1116#3,6:118\n81#4:124\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n78#1:110\n79#1:117\n78#1:111,6\n79#1:118,6\n78#1:124\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionMagnifierKt {

    @l
    private static final SpringSpec<Offset> MagnifierSpringSpec;
    private static final long OffsetDisplacementThreshold;

    @l
    private static final AnimationVector2D UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);

    @l
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);

    static {
        long Offset = OffsetKt.Offset(0.01f, 0.01f);
        OffsetDisplacementThreshold = Offset;
        MagnifierSpringSpec = new SpringSpec<>(0.0f, 0.0f, Offset.m3482boximpl(Offset), 3, null);
    }

    @l
    public static final Modifier animatedSelectionMagnifier(@l Modifier modifier, @l v3.a<Offset> aVar, @l v3.l<? super v3.a<Offset>, ? extends Modifier> lVar) {
        return ComposedModifierKt.composed$default(modifier, null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, lVar), 1, null);
    }

    @l
    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    @l
    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final State<Offset> rememberAnimatedMagnifierPosition(v3.a<Offset> aVar, Composer composer, int i5) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i5, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.derivedStateOf(aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Animatable(Offset.m3482boximpl(rememberAnimatedMagnifierPosition$lambda$1(state)), getUnspecifiedSafeOffsetVectorConverter(), Offset.m3482boximpl(getOffsetDisplacementThreshold()), null, 8, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue2;
        EffectsKt.LaunchedEffect(r2.f19517a, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(state, animatable, null), composer, 70);
        State<Offset> asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> state) {
        return state.getValue().m3503unboximpl();
    }
}
