package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.w;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.f;
import kotlin.ranges.t;
import kotlin.ranges.u;
import kotlinx.coroutines.s0;
import p4.l;
import t0.b;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0015\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aM\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001am\u0010#\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0003¢\u0006\u0004\b#\u0010$\u001aF\u0010+\u001a\u00020\u0003*\u00020%2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aU\u0010.\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0003¢\u0006\u0004\b.\u0010/\u001a.\u00103\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0002\u001a5\u0010=\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0000\u0018\u000109*\u0002042\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0082@ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a0\u0010D\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002\u001a<\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0002\u001a \u0010I\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0002\u001aU\u0010N\u001a\u00020\u00032\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00000L2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bN\u0010O\u001a\\\u0010P\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002\u001aj\u0010X\u001a\u00020\u0005*\u00020\u00052\u0006\u0010R\u001a\u00020Q2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u00072\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00000T2\u0018\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020T2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00000L2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a0\u0010[\u001a\u00020\u00032\u0006\u0010R\u001a\u00020Q2\u0006\u00100\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b[\u0010\\\u001a\u0098\u0001\u0010a\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00000T2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000T2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010S\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010V\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020T2\u001e\u0010`\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030_0TH\u0002\"\u001a\u0010b\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0014\u0010f\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010c\"\u0014\u0010g\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010c\"\u0014\u0010h\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010c\"\u001a\u0010i\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010c\u001a\u0004\bj\u0010e\"\u0014\u0010k\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010c\"\u0014\u0010l\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010c\"\u0014\u0010m\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n\"\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00000o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/f;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/f;Lv3/l;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/f;ILv3/a;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", "width", "SliderImpl", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "RangeSliderImpl", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Dp;", TypedValues.CycleType.S_WAVE_OFFSET, "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "SliderThumb", "thumbPx", "trackStrokeWidth", "Track", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "snapValueToTick", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/u0;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/d;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "a1", "b1", "x1", "a2", "b2", "scale", "x", bi.ay, "b", "pos", "calcFraction", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/MutableState;", "valueState", "CorrectValueSideEffect", "(Lv3/l;Lkotlin/ranges/f;Lkotlin/ranges/f;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "pressOffset", "sliderTapModifier", TypedValues.AttributesType.S_TARGET, "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/d;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "ThumbRadius", "F", "getThumbRadius", "()F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1195:1\n25#2:1196\n36#2:1204\n25#2:1212\n25#2:1219\n36#2:1226\n456#2,8:1251\n464#2,3:1265\n467#2,3:1272\n456#2,8:1294\n464#2,3:1308\n467#2,3:1328\n456#2,8:1350\n464#2,3:1364\n25#2:1368\n467#2,3:1382\n1116#3,6:1197\n1116#3,6:1205\n1116#3,6:1213\n1116#3,6:1220\n1116#3,6:1227\n1116#3,6:1316\n1116#3,6:1322\n1116#3,6:1369\n1116#3,6:1375\n1116#3,6:1400\n1#4:1203\n92#5:1211\n92#5:1233\n92#5:1270\n88#5:1271\n92#5:1313\n88#5:1314\n88#5:1315\n68#6,6:1234\n74#6:1268\n78#6:1276\n68#6,6:1277\n74#6:1311\n78#6:1332\n68#6,6:1333\n74#6:1367\n78#6:1386\n79#7,11:1240\n92#7:1275\n79#7,11:1283\n92#7:1331\n79#7,11:1339\n92#7:1385\n3737#8,6:1259\n3737#8,6:1302\n3737#8,6:1358\n74#9:1269\n74#9:1312\n154#10:1381\n154#10:1407\n154#10:1408\n154#10:1409\n154#10:1410\n154#10:1411\n154#10:1412\n154#10:1413\n482#11,13:1387\n135#12:1406\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n158#1:1196\n163#1:1204\n305#1:1212\n306#1:1219\n310#1:1226\n592#1:1251,8\n592#1:1265,3\n592#1:1272,3\n636#1:1294,8\n636#1:1308,3\n636#1:1328,3\n696#1:1350,8\n696#1:1364,3\n700#1:1368\n696#1:1382,3\n158#1:1197,6\n163#1:1205,6\n305#1:1213,6\n306#1:1220,6\n310#1:1227,6\n664#1:1316,6\n675#1:1322,6\n700#1:1369,6\n701#1:1375,6\n844#1:1400,6\n169#1:1211\n317#1:1233\n602#1:1270\n603#1:1271\n646#1:1313\n647#1:1314\n648#1:1315\n592#1:1234,6\n592#1:1268\n592#1:1276\n636#1:1277,6\n636#1:1311\n636#1:1332\n696#1:1333,6\n696#1:1367\n696#1:1386\n592#1:1240,11\n592#1:1275\n636#1:1283,11\n636#1:1331\n696#1:1339,11\n696#1:1385\n592#1:1259,6\n636#1:1302,6\n696#1:1358,6\n596#1:1269\n640#1:1312\n727#1:1381\n1153#1:1407\n1154#1:1408\n1155#1:1409\n1156#1:1410\n1159#1:1411\n1160#1:1412\n1161#1:1413\n802#1:1387,13\n939#1:1406\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt {

    @l
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @l
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m6044constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m6044constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m6044constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m6044constructorimpl(6);
    private static final float TrackHeight = Dp.m6044constructorimpl(4);

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl(48);
        SliderHeight = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(144);
        SliderMinWidth = m6044constructorimpl2;
        DefaultSliderConstraints = SizeKt.m590heightInVpY3zN4$default(SizeKt.m609widthInVpY3zN4$default(Modifier.Companion, m6044constructorimpl2, 0.0f, 2, null), 0.0f, m6044constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CorrectValueSideEffect(v3.l<? super Float, Float> lVar, f<Float> fVar, f<Float> fVar2, MutableState<Float> mutableState, float f5, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i6 = i11 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(fVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(fVar2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(mutableState)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        if ((46811 & i6) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i6, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:842)");
            }
            startRestartGroup.startReplaceableGroup(17297626);
            boolean changed = startRestartGroup.changed(fVar) | startRestartGroup.changedInstance(lVar) | startRestartGroup.changed(f5) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(fVar2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$CorrectValueSideEffect$1$1(fVar, lVar, f5, mutableState, fVar2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((a) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$CorrectValueSideEffect$2(lVar, fVar, fVar2, mutableState, f5, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0159  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@p4.l kotlin.ranges.f<java.lang.Float> r40, @p4.l v3.l<? super kotlin.ranges.f<java.lang.Float>, kotlin.r2> r41, @p4.m androidx.compose.ui.Modifier r42, boolean r43, @p4.m kotlin.ranges.f<java.lang.Float> r44, @androidx.annotation.IntRange(from = 0) int r45, @p4.m v3.a<kotlin.r2> r46, @p4.m androidx.compose.material.SliderColors r47, @p4.m androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(kotlin.ranges.f, v3.l, androidx.compose.ui.Modifier, boolean, kotlin.ranges.f, int, v3.a, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(boolean z4, float f5, float f6, List<Float> list, SliderColors sliderColors, float f7, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i5, int i6) {
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i5, i6, "androidx.compose.material.RangeSliderImpl (Slider.kt:631)");
        }
        Strings.Companion companion = Strings.Companion;
        String m1452getString4foXLRw = Strings_androidKt.m1452getString4foXLRw(companion.m1451getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        String m1452getString4foXLRw2 = Strings_androidKt.m1452getString4foXLRw(companion.m1450getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion3.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo304toPx0680j_4 = density.mo304toPx0680j_4(TrackHeight);
        float f8 = ThumbRadius;
        float mo304toPx0680j_42 = density.mo304toPx0680j_4(f8);
        float mo300toDpu2uoSUM = density.mo300toDpu2uoSUM(f7);
        float m6044constructorimpl = Dp.m6044constructorimpl(f8 * 2);
        float m6044constructorimpl2 = Dp.m6044constructorimpl(mo300toDpu2uoSUM * f5);
        float m6044constructorimpl3 = Dp.m6044constructorimpl(mo300toDpu2uoSUM * f6);
        Modifier.Companion companion4 = Modifier.Companion;
        int i7 = i5 >> 9;
        int i8 = i5 << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z4, f5, f6, list, mo304toPx0680j_42, mo304toPx0680j_4, startRestartGroup, (i7 & 112) | 262144 | (i8 & 896) | (i8 & 7168) | (i8 & 57344));
        startRestartGroup.startReplaceableGroup(17291254);
        boolean changed = startRestartGroup.changed(m1452getString4foXLRw);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SliderKt$RangeSliderImpl$1$2$1(m1452getString4foXLRw);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i9 = i5 & 57344;
        int i10 = (i5 << 15) & 458752;
        m1430SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (v3.l) rememberedValue), true, mutableInteractionSource).then(modifier2), m6044constructorimpl2, mutableInteractionSource, sliderColors, z4, m6044constructorimpl, startRestartGroup, (i7 & 7168) | 1572870 | i9 | i10);
        startRestartGroup.startReplaceableGroup(17291632);
        boolean changed2 = startRestartGroup.changed(m1452getString4foXLRw2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SliderKt$RangeSliderImpl$1$3$1(m1452getString4foXLRw2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m1430SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (v3.l) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m6044constructorimpl3, mutableInteractionSource2, sliderColors, z4, m6044constructorimpl, startRestartGroup, ((i5 >> 12) & 7168) | 1572870 | i9 | i10);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$2(z4, f5, f6, list, sliderColors, f7, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i5, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(float r40, @p4.l v3.l<? super java.lang.Float, kotlin.r2> r41, @p4.m androidx.compose.ui.Modifier r42, boolean r43, @p4.m kotlin.ranges.f<java.lang.Float> r44, @androidx.annotation.IntRange(from = 0) int r45, @p4.m v3.a<kotlin.r2> r46, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r47, @p4.m androidx.compose.material.SliderColors r48, @p4.m androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, v3.l, androidx.compose.ui.Modifier, boolean, kotlin.ranges.f, int, v3.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(boolean z4, float f5, List<Float> list, SliderColors sliderColors, float f6, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i5, -1, "androidx.compose.material.SliderImpl (Slider.kt:590)");
        }
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(then);
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo304toPx0680j_4 = density.mo304toPx0680j_4(TrackHeight);
        float f7 = ThumbRadius;
        float mo304toPx0680j_42 = density.mo304toPx0680j_4(f7);
        float mo300toDpu2uoSUM = density.mo300toDpu2uoSUM(f6);
        float m6044constructorimpl = Dp.m6044constructorimpl(f7 * 2);
        float m6044constructorimpl2 = Dp.m6044constructorimpl(mo300toDpu2uoSUM * f5);
        Modifier.Companion companion2 = Modifier.Companion;
        int i6 = i5 >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z4, 0.0f, f5, list, mo304toPx0680j_42, mo304toPx0680j_4, startRestartGroup, (i6 & 112) | 265222 | ((i5 << 6) & 896) | ((i5 << 9) & 57344));
        m1430SliderThumbPcYyNuk(boxScopeInstance, companion2, m6044constructorimpl2, mutableInteractionSource, sliderColors, z4, m6044constructorimpl, startRestartGroup, (i6 & 7168) | 1572918 | ((i5 << 3) & 57344) | ((i5 << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderImpl$2(z4, f5, list, sliderColors, f6, mutableInteractionSource, modifier, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1430SliderThumbPcYyNuk(BoxScope boxScope, Modifier modifier, float f5, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z4, float f6, Composer composer, int i5) {
        int i6;
        float f7;
        float m6044constructorimpl;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i6 = i13 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i6 |= i12;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changed(f5)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i6 |= i11;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changed(sliderColors)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i6 |= i9;
        }
        if ((458752 & i5) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i6 |= i8;
        }
        if ((3670016 & i5) == 0) {
            if (startRestartGroup.changed(f6)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i6 |= i7;
        }
        int i14 = i6;
        if ((2995931 & i14) == 599186 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i14, -1, "androidx.compose.material.SliderThumb (Slider.kt:694)");
            }
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(Modifier.Companion, f5, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope.align(m557paddingqDBjuR0$default, companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(align);
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
            Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceableGroup(17292344);
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            int i15 = i14 >> 9;
            EffectsKt.LaunchedEffect(mutableInteractionSource, (p<? super s0, ? super d<? super r2>, ? extends Object>) rememberedValue2, startRestartGroup, (i15 & 14) | 64);
            if (!snapshotStateList.isEmpty()) {
                f7 = ThumbPressedElevation;
            } else {
                f7 = ThumbDefaultElevation;
            }
            float f8 = f7;
            Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m604sizeVpY3zN4(modifier, f6, f6), mutableInteractionSource, RippleKt.m1541rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
            if (z4) {
                m6044constructorimpl = f8;
            } else {
                m6044constructorimpl = Dp.m6044constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m200backgroundbw27NRU(ShadowKt.m3406shadows4CzXII$default(hoverable$default, m6044constructorimpl, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z4, startRestartGroup, ((i14 >> 15) & 14) | (i15 & 112)).getValue().m3744unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderThumb$2(boxScope, modifier, f5, mutableInteractionSource, sliderColors, z4, f6, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(Modifier modifier, SliderColors sliderColors, boolean z4, float f5, float f6, List<Float> list, float f7, float f8, Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i5, -1, "androidx.compose.material.Track (Slider.kt:742)");
        }
        int i6 = ((i5 >> 6) & 14) | 48 | ((i5 << 3) & 896);
        CanvasKt.Canvas(modifier, new SliderKt$Track$1(f7, sliderColors.trackColor(z4, false, startRestartGroup, i6), f8, f6, f5, sliderColors.trackColor(z4, true, startRestartGroup, i6), list, sliderColors.tickColor(z4, false, startRestartGroup, i6), sliderColors.tickColor(z4, true, startRestartGroup, i6)), startRestartGroup, i5 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$Track$2(modifier, sliderColors, z4, f5, f6, list, f7, f8, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f5, float f6, float f7, d<? super r2> dVar) {
        Object l5;
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f5, f6, f7, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return drag$default == l5 ? drag$default : r2.f19517a;
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
    public static final java.lang.Object m1433awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.d<? super kotlin.u0<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
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
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m1317awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1433awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f5, float f6, float f7) {
        float H;
        float f8 = f6 - f5;
        H = u.H((f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (f7 - f5) / f8, 0.0f, 1.0f);
        return H;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z4, boolean z5, float f5, f<Float> fVar, State<? extends v3.l<? super Boolean, r2>> state3, State<? extends p<? super Boolean, ? super Float, r2>> state4) {
        if (z4) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f5), Boolean.valueOf(z5), fVar}, (p<? super PointerInputScope, ? super d<? super r2>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z5, f5, state3, null));
        }
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f5, float f6, float f7, float f8, float f9) {
        return MathHelpersKt.lerp(f8, f9, calcFraction(f5, f6, f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f5, boolean z4, v3.l<? super Float, r2> lVar, a<r2> aVar, f<Float> fVar, int i5) {
        float H;
        H = u.H(f5, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z4, fVar, i5, H, lVar, aVar), 1, null), f5, fVar, i5);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f5, boolean z4, v3.l lVar, a aVar, f fVar, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            aVar = null;
        }
        a aVar2 = aVar;
        if ((i6 & 16) != 0) {
            fVar = t.e(0.0f, 1.0f);
        }
        f fVar2 = fVar;
        if ((i6 & 32) != 0) {
            i5 = 0;
        }
        return sliderSemantics(modifier, f5, z4, lVar, aVar2, fVar2, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, float f5, boolean z4, State<Float> state, State<? extends v3.l<? super Float, r2>> state2, MutableState<Float> mutableState, boolean z5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, f5, z4, state, state2, mutableState, z5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SliderKt$sliderTapModifier$2(z5, draggableState, mutableInteractionSource, f5, z4, mutableState, state, state2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f5, List<Float> list, float f6, float f7) {
        int G;
        Float f8;
        if (list.isEmpty()) {
            f8 = null;
        } else {
            Float f9 = list.get(0);
            float abs = Math.abs(MathHelpersKt.lerp(f6, f7, f9.floatValue()) - f5);
            G = w.G(list);
            int i5 = 1;
            if (1 <= G) {
                while (true) {
                    Float f10 = list.get(i5);
                    float abs2 = Math.abs(MathHelpersKt.lerp(f6, f7, f10.floatValue()) - f5);
                    if (Float.compare(abs, abs2) > 0) {
                        f9 = f10;
                        abs = abs2;
                    }
                    if (i5 == G) {
                        break;
                    }
                    i5++;
                }
            }
            f8 = f9;
        }
        Float f11 = f8;
        if (f11 != null) {
            return MathHelpersKt.lerp(f6, f7, f11.floatValue());
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Float> stepsToTickFractions(int i5) {
        List<Float> E;
        if (i5 == 0) {
            E = w.E();
            return E;
        }
        int i6 = i5 + 2;
        ArrayList arrayList = new ArrayList(i6);
        for (int i7 = 0; i7 < i6; i7++) {
            arrayList.add(Float.valueOf(i7 / (i5 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f<Float> scale(float f5, float f6, f<Float> fVar, float f7, float f8) {
        f<Float> e5;
        e5 = t.e(scale(f5, f6, fVar.getStart().floatValue(), f7, f8), scale(f5, f6, fVar.getEndInclusive().floatValue(), f7, f8));
        return e5;
    }
}
