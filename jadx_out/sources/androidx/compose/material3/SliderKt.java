package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.umeng.analytics.pro.bi;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.s0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001au\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u0013\u0010\u001b\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aæ\u0001\u0010\u001c\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0003\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001c\u0010#\u001a\u009a\u0001\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020 2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0004\b\u001c\u0010$\u001aa\u0010%\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b%\u0010&\u001a\u0082\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b'\u0010(\u001a(\u0010.\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0002\u001a5\u00108\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0000\u0018\u000104*\u00020/2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0082@ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a\u0010\u00109\u001a\u00020*2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010?\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0002\u001a:\u0010?\u001a\u00020@2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a \u0010G\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000H\u0002\u001a\u001c\u0010H\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u001c\u0010I\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u001c\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a$\u0010K\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003\u001a,\u0010L\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001a\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0003\u001a\u001f\u0010O\u001a\u00020@2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0000H\u0001¢\u0006\u0004\bO\u0010P\u001a\u001d\u0010O\u001a\u00020@2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0001¢\u0006\u0004\bO\u0010R\"\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0014\u0010X\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010U\"\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[\"\u0014\u0010\\\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010U\"\u0014\u0010]\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010U\"\u0014\u0010^\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010U\"\u001a\u0010_\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010U\u001a\u0004\b`\u0010W\"\u001e\u0010e\u001a\u00020\u0007*\u00020@8@X\u0081\u0004¢\u0006\f\u0012\u0004\bc\u0010d\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006f"}, d2 = {"", t0.b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/f;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Slider", "(FLv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderState;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "(FLv3/l;Landroidx/compose/ui/Modifier;ZLv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILv3/q;Lv3/q;Lkotlin/ranges/f;Landroidx/compose/runtime/Composer;III)V", "state", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "Landroidx/compose/material3/RangeSliderState;", "startThumb", "endThumb", "(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;Lv3/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;ILandroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Landroidx/compose/runtime/Composer;I)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/q;Lv3/q;Lv3/q;Landroidx/compose/runtime/Composer;I)V", "current", "", "tickFractions", "minPx", "maxPx", "snapValueToTick", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/u0;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/d;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "a1", "b1", "x1", "a2", "b2", "scale", "Landroidx/compose/material3/SliderRange;", "x", "scale-ziovWd0", "(FFJFF)J", bi.ay, "b", "pos", "calcFraction", "sliderSemantics", "rangeSliderStartThumbSemantics", "rangeSliderEndThumbSemantics", "sliderTapModifier", "rangeSliderPressDragModifier", "start", "endInclusive", "SliderRange", "(FF)J", "range", "(Lkotlin/ranges/f;)J", "Landroidx/compose/ui/unit/Dp;", "ThumbWidth", "F", "getThumbWidth", "()F", "ThumbHeight", "Landroidx/compose/ui/unit/DpSize;", "ThumbSize", "J", "ThumbDefaultElevation", "ThumbPressedElevation", "TickSize", "TrackHeight", "getTrackHeight", "isSpecified-If1S1O4", "(J)Z", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2164\n1116#2,6:2170\n1116#2,6:2177\n1116#2,6:2183\n1116#2,6:2189\n1116#2,6:2195\n1116#2,6:2201\n1116#2,6:2207\n1116#2,6:2213\n1116#2,6:2219\n1116#2,6:2226\n1116#2,6:2232\n1116#2,6:2353\n1116#2,6:2387\n1116#2,6:2433\n1#3:2176\n74#4:2225\n74#4:2350\n78#5,11:2238\n78#5,11:2272\n91#5:2304\n78#5,11:2312\n91#5:2344\n91#5:2349\n78#5,11:2359\n78#5,11:2399\n91#5:2431\n78#5,11:2445\n91#5:2477\n78#5,11:2485\n91#5:2517\n91#5:2522\n456#6,8:2249\n464#6,3:2263\n456#6,8:2283\n464#6,3:2297\n467#6,3:2301\n456#6,8:2323\n464#6,3:2337\n467#6,3:2341\n467#6,3:2346\n456#6,8:2370\n464#6,3:2384\n456#6,8:2410\n464#6,3:2424\n467#6,3:2428\n456#6,8:2456\n464#6,3:2470\n467#6,3:2474\n456#6,8:2496\n464#6,3:2510\n467#6,3:2514\n467#6,3:2519\n3737#7,6:2257\n3737#7,6:2291\n3737#7,6:2331\n3737#7,6:2378\n3737#7,6:2418\n3737#7,6:2464\n3737#7,6:2504\n68#8,6:2266\n74#8:2300\n78#8:2305\n68#8,6:2306\n74#8:2340\n78#8:2345\n68#8,6:2393\n74#8:2427\n78#8:2432\n68#8,6:2439\n74#8:2473\n78#8:2478\n68#8,6:2479\n74#8:2513\n78#8:2518\n52#9:2351\n53#9:2352\n16867#10,14:2523\n25#11,3:2537\n25#11,3:2540\n154#12:2543\n154#12:2544\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n157#1:2152,6\n248#1:2158,6\n268#1:2164,6\n344#1:2170,6\n418#1:2177,6\n419#1:2183,6\n519#1:2189,6\n520#1:2195,6\n546#1:2201,6\n559#1:2207,6\n626#1:2213,6\n627#1:2219,6\n685#1:2226,6\n712#1:2232,6\n808#1:2353,6\n783#1:2387,6\n791#1:2433,6\n674#1:2225\n764#1:2350\n690#1:2238,11\n692#1:2272,11\n692#1:2304\n695#1:2312,11\n695#1:2344\n690#1:2349\n779#1:2359,11\n781#1:2399,11\n781#1:2431\n789#1:2445,11\n789#1:2477\n797#1:2485,11\n797#1:2517\n779#1:2522\n690#1:2249,8\n690#1:2263,3\n692#1:2283,8\n692#1:2297,3\n692#1:2301,3\n695#1:2323,8\n695#1:2337,3\n695#1:2341,3\n690#1:2346,3\n779#1:2370,8\n779#1:2384,3\n781#1:2410,8\n781#1:2424,3\n781#1:2428,3\n789#1:2456,8\n789#1:2470,3\n789#1:2474,3\n797#1:2496,8\n797#1:2510,3\n797#1:2514,3\n779#1:2519,3\n690#1:2257,6\n692#1:2291,6\n695#1:2331,6\n779#1:2378,6\n781#1:2418,6\n789#1:2464,6\n797#1:2504,6\n692#1:2266,6\n692#1:2300\n692#1:2305\n695#1:2306,6\n695#1:2340\n695#1:2345\n781#1:2393,6\n781#1:2427\n781#1:2432\n789#1:2439,6\n789#1:2473\n789#1:2478\n797#1:2479,6\n797#1:2513\n797#1:2518\n776#1:2351\n777#1:2352\n1248#1:2523,14\n2124#1:2537,3\n2142#1:2540,3\n1710#1:2543\n1711#1:2544\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt {
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float m3116getHandleWidthD9Ej5fM = sliderTokens.m3116getHandleWidthD9Ej5fM();
        ThumbWidth = m3116getHandleWidthD9Ej5fM;
        float m3115getHandleHeightD9Ej5fM = sliderTokens.m3115getHandleHeightD9Ej5fM();
        ThumbHeight = m3115getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m6066DpSizeYgX7TsA(m3116getHandleWidthD9Ej5fM, m3115getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = Dp.m6044constructorimpl(1);
        ThumbPressedElevation = Dp.m6044constructorimpl(6);
        TickSize = sliderTokens.m3122getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = sliderTokens.m3117getInactiveTrackHeightD9Ej5fM();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00be  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@p4.l kotlin.ranges.f<java.lang.Float> r29, @p4.l v3.l<? super kotlin.ranges.f<java.lang.Float>, kotlin.r2> r30, @p4.m androidx.compose.ui.Modifier r31, boolean r32, @p4.m kotlin.ranges.f<java.lang.Float> r33, @androidx.annotation.IntRange(from = 0) int r34, @p4.m v3.a<kotlin.r2> r35, @p4.m androidx.compose.material3.SliderColors r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.f, v3.l, androidx.compose.ui.Modifier, boolean, kotlin.ranges.f, int, v3.a, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RangeSliderImpl(Modifier modifier, final RangeSliderState rangeSliderState, boolean z4, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar2, v3.q<? super RangeSliderState, ? super Composer, ? super Integer, r2> qVar3, Composer composer, int i5) {
        int i6;
        boolean z5;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1411725677);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i6 = i14 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(rangeSliderState)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i6 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z4)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i6 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i6 |= i11;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource2)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i6 |= i10;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i6 |= i9;
        }
        if ((1572864 & i5) == 0) {
            if (startRestartGroup.changedInstance(qVar2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i6 |= i8;
        }
        if ((12582912 & i5) == 0) {
            if (startRestartGroup.changedInstance(qVar3)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i6 |= i7;
        }
        if ((4793491 & i6) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i6, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:762)");
            }
            if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z5 = true;
            } else {
                z5 = false;
            }
            rangeSliderState.setRtl$material3_release(z5);
            Modifier.Companion companion = Modifier.Companion;
            Modifier rangeSliderPressDragModifier = rangeSliderPressDragModifier(companion, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z4);
            Modifier rangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(companion, rangeSliderState, z4);
            Modifier rangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(companion, rangeSliderState, z4);
            Strings.Companion companion2 = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(androidx.compose.ui.R.string.range_start), startRestartGroup, 0);
            String m2294getStringNWtq282 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(androidx.compose.ui.R.string.range_end), startRestartGroup, 0);
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier then = SizeKt.m598requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, sliderTokens.m3116getHandleWidthD9Ej5fM(), sliderTokens.m3115getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier);
            startRestartGroup.startReplaceableGroup(1300547382);
            if ((i6 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ int $endThumbOffsetX;
                        final /* synthetic */ int $endThumbOffsetY;
                        final /* synthetic */ Placeable $endThumbPlaceable;
                        final /* synthetic */ int $startThumbOffsetX;
                        final /* synthetic */ int $startThumbOffsetY;
                        final /* synthetic */ Placeable $startThumbPlaceable;
                        final /* synthetic */ int $trackOffsetX;
                        final /* synthetic */ int $trackOffsetY;
                        final /* synthetic */ Placeable $trackPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Placeable placeable, int i5, int i6, Placeable placeable2, int i7, int i8, Placeable placeable3, int i9, int i10) {
                            super(1);
                            this.$trackPlaceable = placeable;
                            this.$trackOffsetX = i5;
                            this.$trackOffsetY = i6;
                            this.$startThumbPlaceable = placeable2;
                            this.$startThumbOffsetX = i7;
                            this.$startThumbOffsetY = i8;
                            this.$endThumbPlaceable = placeable3;
                            this.$endThumbOffsetX = i9;
                            this.$endThumbOffsetY = i10;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$startThumbPlaceable, this.$startThumbOffsetX, this.$startThumbOffsetY, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$endThumbPlaceable, this.$endThumbOffsetX, this.$endThumbOffsetY, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        boolean z7;
                        boolean z8;
                        boolean z9;
                        int L0;
                        int L02;
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            Measurable measurable = list.get(i15);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
                                int size2 = list.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    Measurable measurable2 = list.get(i16);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        Placeable mo4998measureBRTryo02 = measurable2.mo4998measureBRTryo0(j5);
                                        int size3 = list.size();
                                        for (int i17 = 0; i17 < size3; i17++) {
                                            Measurable measurable3 = list.get(i17);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z9) {
                                                Placeable mo4998measureBRTryo03 = measurable3.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6017offsetNN6EwU$default(j5, (-(mo4998measureBRTryo0.getWidth() + mo4998measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = mo4998measureBRTryo03.getWidth() + ((mo4998measureBRTryo0.getWidth() + mo4998measureBRTryo02.getWidth()) / 2);
                                                int max = Math.max(mo4998measureBRTryo03.getHeight(), Math.max(mo4998measureBRTryo0.getHeight(), mo4998measureBRTryo02.getHeight()));
                                                RangeSliderState.this.setStartThumbWidth$material3_release(mo4998measureBRTryo0.getWidth());
                                                RangeSliderState.this.setEndThumbWidth$material3_release(mo4998measureBRTryo02.getWidth());
                                                RangeSliderState.this.setTotalWidth$material3_release(width);
                                                RangeSliderState.this.updateMinMaxPx$material3_release();
                                                int width2 = mo4998measureBRTryo0.getWidth() / 2;
                                                L0 = kotlin.math.d.L0(mo4998measureBRTryo03.getWidth() * RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release());
                                                L02 = kotlin.math.d.L0((mo4998measureBRTryo03.getWidth() * RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release()) + ((mo4998measureBRTryo0.getWidth() - mo4998measureBRTryo02.getWidth()) / 2));
                                                return MeasureScope.layout$default(measureScope, width, max, null, new AnonymousClass1(mo4998measureBRTryo03, width2, (max - mo4998measureBRTryo03.getHeight()) / 2, mo4998measureBRTryo0, L0, (max - mo4998measureBRTryo0.getHeight()) / 2, mo4998measureBRTryo02, L02, (max - mo4998measureBRTryo02.getHeight()) / 2), 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, RangeSliderComponents.STARTTHUMB);
            startRestartGroup.startReplaceableGroup(-2040261114);
            boolean changed = startRestartGroup.changed(m2294getStringNWtq28);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new SliderKt$RangeSliderImpl$1$1$1(m2294getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then2 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId, true, (v3.l) rememberedValue2), z4, mutableInteractionSource).then(rangeSliderStartThumbSemantics);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i15 = (i6 >> 3) & 14;
            qVar.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i6 >> 12) & 112) | i15));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId2 = LayoutIdKt.layoutId(companion, RangeSliderComponents.ENDTHUMB);
            startRestartGroup.startReplaceableGroup(-2040260744);
            boolean changed2 = startRestartGroup.changed(m2294getStringNWtq282);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new SliderKt$RangeSliderImpl$1$3$1(m2294getStringNWtq282);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = FocusableKt.focusable(SemanticsModifierKt.semantics(layoutId2, true, (v3.l) rememberedValue3), z4, mutableInteractionSource2).then(rangeSliderEndThumbSemantics);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            qVar2.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i6 >> 15) & 112) | i15));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier layoutId3 = LayoutIdKt.layoutId(companion, RangeSliderComponents.TRACK);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(layoutId3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl4 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            qVar3.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i6 >> 18) & 112) | i15));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$3(modifier, rangeSliderState, z4, mutableInteractionSource, mutableInteractionSource2, qVar, qVar2, qVar3, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(float r28, @p4.l v3.l<? super java.lang.Float, kotlin.r2> r29, @p4.m androidx.compose.ui.Modifier r30, boolean r31, @p4.m kotlin.ranges.f<java.lang.Float> r32, @androidx.annotation.IntRange(from = 0) int r33, @p4.m v3.a<kotlin.r2> r34, @p4.m androidx.compose.material3.SliderColors r35, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r36, @p4.m androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, v3.l, androidx.compose.ui.Modifier, boolean, kotlin.ranges.f, int, v3.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SliderImpl(Modifier modifier, final SliderState sliderState, boolean z4, MutableInteractionSource mutableInteractionSource, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar, v3.q<? super SliderState, ? super Composer, ? super Integer, r2> qVar2, Composer composer, int i5) {
        int i6;
        boolean z5;
        boolean z6;
        Composer composer2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1390990089);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i6 = i12 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(sliderState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changedInstance(qVar2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        int i13 = i6;
        if ((74899 & i13) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i13, -1, "androidx.compose.material3.SliderImpl (Slider.kt:672)");
            }
            boolean z7 = true;
            if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z5 = true;
            } else {
                z5 = false;
            }
            sliderState.setRtl$material3_release(z5);
            Modifier.Companion companion = Modifier.Companion;
            Modifier sliderTapModifier = sliderTapModifier(companion, sliderState, mutableInteractionSource, z4);
            Orientation orientation = Orientation.Horizontal;
            boolean isRtl$material3_release = sliderState.isRtl$material3_release();
            boolean isDragging$material3_release = sliderState.isDragging$material3_release();
            startRestartGroup.startReplaceableGroup(1114013383);
            int i14 = i13 & 112;
            if (i14 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier draggable$default = DraggableKt.draggable$default(companion, sliderState, orientation, z4, mutableInteractionSource, isDragging$material3_release, null, (v3.q) rememberedValue, isRtl$material3_release, 32, null);
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier then = FocusableKt.focusable(sliderSemantics(SizeKt.m598requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, sliderTokens.m3116getHandleWidthD9Ej5fM(), sliderTokens.m3115getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), sliderState, z4), z4, mutableInteractionSource).then(sliderTapModifier).then(draggable$default);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(1114014176);
            if (i14 != 32) {
                z7 = false;
            }
            Object rememberedValue2 = composer2.rememberedValue();
            if (z7 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.SliderKt$SliderImpl$2$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ int $thumbOffsetX;
                        final /* synthetic */ int $thumbOffsetY;
                        final /* synthetic */ Placeable $thumbPlaceable;
                        final /* synthetic */ int $trackOffsetX;
                        final /* synthetic */ int $trackOffsetY;
                        final /* synthetic */ Placeable $trackPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Placeable placeable, int i5, int i6, Placeable placeable2, int i7, int i8) {
                            super(1);
                            this.$trackPlaceable = placeable;
                            this.$trackOffsetX = i5;
                            this.$trackOffsetY = i6;
                            this.$thumbPlaceable = placeable2;
                            this.$thumbOffsetX = i7;
                            this.$thumbOffsetY = i8;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$trackPlaceable, this.$trackOffsetX, this.$trackOffsetY, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, this.$thumbPlaceable, this.$thumbOffsetX, this.$thumbOffsetY, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        boolean z8;
                        boolean z9;
                        int L0;
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            Measurable measurable = list.get(i15);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
                                int size2 = list.size();
                                for (int i16 = 0; i16 < size2; i16++) {
                                    Measurable measurable2 = list.get(i16);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        Placeable mo4998measureBRTryo02 = measurable2.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6017offsetNN6EwU$default(j5, -mo4998measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = mo4998measureBRTryo0.getWidth() + mo4998measureBRTryo02.getWidth();
                                        int max = Math.max(mo4998measureBRTryo02.getHeight(), mo4998measureBRTryo0.getHeight());
                                        SliderState.this.updateDimensions$material3_release(mo4998measureBRTryo0.getWidth(), width);
                                        int width2 = mo4998measureBRTryo0.getWidth() / 2;
                                        L0 = kotlin.math.d.L0(mo4998measureBRTryo02.getWidth() * SliderState.this.getCoercedValueAsFraction$material3_release());
                                        return MeasureScope.layout$default(measureScope, width, max, null, new AnonymousClass1(mo4998measureBRTryo02, width2, (max - mo4998measureBRTryo02.getHeight()) / 2, mo4998measureBRTryo0, L0, (max - mo4998measureBRTryo0.getHeight()) / 2), 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3264constructorimpl = Updater.m3264constructorimpl(composer2);
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion, SliderComponents.THUMB);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(layoutId);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer2);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i15 = (i13 >> 3) & 14;
            qVar.invoke(sliderState, composer2, Integer.valueOf(((i13 >> 9) & 112) | i15));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier layoutId2 = LayoutIdKt.layoutId(companion, SliderComponents.TRACK);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor3 = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(layoutId2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m3264constructorimpl3 = Updater.m3264constructorimpl(composer2);
            Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            qVar2.invoke(sliderState, composer2, Integer.valueOf(i15 | ((i13 >> 12) & 112)));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderImpl$3(modifier, sliderState, z4, mutableInteractionSource, qVar, qVar2, i5));
        }
    }

    @Stable
    public static final long SliderRange(float f5, float f6) {
        boolean z4 = true;
        if (!(Float.isNaN(f5) && Float.isNaN(f6)) && f5 > f6) {
            z4 = false;
        }
        if (z4) {
            return SliderRange.m2207constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
        }
        throw new IllegalArgumentException(("start(" + f5 + ") must be <= endInclusive(" + f6 + ')').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2199awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.d<? super kotlin.u0<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.k1$e r8 = (kotlin.jvm.internal.k1.e) r8
            kotlin.e1.n(r12)
            goto L54
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.e1.n(r12)
            kotlin.jvm.internal.k1$e r12 = new kotlin.jvm.internal.k1$e
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m1854awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L51
            return r0
        L51:
            r7 = r12
            r12 = r8
            r8 = r7
        L54:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L63
            float r8 = r8.element
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.e(r8)
            kotlin.u0 r8 = kotlin.q1.a(r12, r8)
            goto L64
        L63:
            r8 = 0
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m2199awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f5, float f6, float f7) {
        float H;
        float f8 = f6 - f5;
        H = kotlin.ranges.u.H((f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f7 - f5) / f8, 0.0f, 1.0f);
        return H;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m2200isSpecifiedIf1S1O4(long j5) {
        return j5 != SliderRange.Companion.m2216getUnspecifiedFYbKRX4();
    }

    @Stable
    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2201isSpecifiedIf1S1O4$annotations(long j5) {
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z4) {
        kotlin.ranges.f e5;
        e5 = kotlin.ranges.t.e(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$rangeSliderEndThumbSemantics$1(z4, e5, rangeSliderState), 1, null), rangeSliderState.getActiveRangeEnd(), e5, rangeSliderState.getEndSteps$material3_release());
    }

    @Stable
    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z4) {
        if (z4) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, (v3.p<? super PointerInputScope, ? super kotlin.coroutines.d<? super r2>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null));
        }
        return modifier;
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, RangeSliderState rangeSliderState, boolean z4) {
        kotlin.ranges.f e5;
        e5 = kotlin.ranges.t.e(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$rangeSliderStartThumbSemantics$1(z4, e5, rangeSliderState), 1, null), rangeSliderState.getActiveRangeStart(), e5, rangeSliderState.getStartSteps$material3_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f5, float f6, float f7, float f8, float f9) {
        return MathHelpersKt.lerp(f8, f9, calcFraction(f5, f6, f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-ziovWd0, reason: not valid java name */
    public static final long m2202scaleziovWd0(float f5, float f6, long j5, float f7, float f8) {
        return SliderRange(scale(f5, f6, SliderRange.m2211getStartimpl(j5), f7, f8), scale(f5, f6, SliderRange.m2210getEndInclusiveimpl(j5), f7, f8));
    }

    private static final Modifier sliderSemantics(Modifier modifier, SliderState sliderState, boolean z4) {
        kotlin.ranges.f e5;
        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z4, sliderState), 1, null);
        float value = sliderState.getValue();
        e5 = kotlin.ranges.t.e(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(semantics$default, value, e5, sliderState.getSteps());
    }

    @Stable
    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z4) {
        return z4 ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new SliderKt$sliderTapModifier$1(sliderState, null)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f5, float[] fArr, float f6, float f7) {
        boolean z4;
        int te;
        Float valueOf;
        if (fArr.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            valueOf = null;
        } else {
            float f8 = fArr[0];
            te = kotlin.collections.p.te(fArr);
            if (te == 0) {
                valueOf = Float.valueOf(f8);
            } else {
                float abs = Math.abs(MathHelpersKt.lerp(f6, f7, f8) - f5);
                s0 it = new kotlin.ranges.l(1, te).iterator();
                while (it.hasNext()) {
                    float f9 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f6, f7, f9) - f5);
                    if (Float.compare(abs, abs2) > 0) {
                        f8 = f9;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f8);
            }
        }
        if (valueOf != null) {
            return MathHelpersKt.lerp(f6, f7, valueOf.floatValue());
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i5) {
        if (i5 == 0) {
            return new float[0];
        }
        int i6 = i5 + 2;
        float[] fArr = new float[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            fArr[i7] = i7 / (i5 + 1);
        }
        return fArr;
    }

    @Stable
    public static final long SliderRange(@p4.l kotlin.ranges.f<Float> fVar) {
        float floatValue = fVar.getStart().floatValue();
        float floatValue2 = fVar.getEndInclusive().floatValue();
        boolean z4 = true;
        if (!(Float.isNaN(floatValue) && Float.isNaN(floatValue2)) && floatValue > floatValue2) {
            z4 = false;
        }
        if (z4) {
            return SliderRange.m2207constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
        }
        throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + floatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + floatValue2 + ')').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(float r23, @p4.l v3.l<? super java.lang.Float, kotlin.r2> r24, @p4.m androidx.compose.ui.Modifier r25, boolean r26, @p4.m v3.a<kotlin.r2> r27, @p4.m androidx.compose.material3.SliderColors r28, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r29, @androidx.annotation.IntRange(from = 0) int r30, @p4.m v3.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m v3.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r32, @p4.m kotlin.ranges.f<java.lang.Float> r33, @p4.m androidx.compose.runtime.Composer r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, v3.l, androidx.compose.ui.Modifier, boolean, v3.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, int, v3.q, v3.q, kotlin.ranges.f, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@p4.l kotlin.ranges.f<java.lang.Float> r28, @p4.l v3.l<? super kotlin.ranges.f<java.lang.Float>, kotlin.r2> r29, @p4.m androidx.compose.ui.Modifier r30, boolean r31, @p4.m kotlin.ranges.f<java.lang.Float> r32, @p4.m v3.a<kotlin.r2> r33, @p4.m androidx.compose.material3.SliderColors r34, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r35, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r36, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r37, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r38, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r39, @androidx.annotation.IntRange(from = 0) int r40, @p4.m androidx.compose.runtime.Composer r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.f, v3.l, androidx.compose.ui.Modifier, boolean, kotlin.ranges.f, v3.a, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, v3.q, v3.q, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0083  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(@p4.l androidx.compose.material3.SliderState r18, @p4.m androidx.compose.ui.Modifier r19, boolean r20, @p4.m androidx.compose.material3.SliderColors r21, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r22, @p4.m v3.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r23, @p4.m v3.q<? super androidx.compose.material3.SliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r24, @p4.m androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0166  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@p4.l androidx.compose.material3.RangeSliderState r23, @p4.m androidx.compose.ui.Modifier r24, boolean r25, @p4.m androidx.compose.material3.SliderColors r26, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r27, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r28, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r29, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r30, @p4.m v3.q<? super androidx.compose.material3.RangeSliderState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r31, @p4.m androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, v3.q, v3.q, v3.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
