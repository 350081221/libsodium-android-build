package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Selection;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import kotlinx.coroutines.s0;

@kotlin.i0(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001c\u001a'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010 \u001a?\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0003¢\u0006\u0004\b'\u0010(\u001aS\u00102\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0-¢\u0006\u0002\b/¢\u0006\u0002\b0H\u0003¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b4\u00105\u001a:\u0010;\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a'\u0010<\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010>\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u001a/\u0010?\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0003¢\u0006\u0004\b?\u0010@\u001a]\u0010I\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000e2!\u0010F\u001a\u001d\u0012\u0013\u0012\u00110A¢\u0006\f\bD\u0012\b\bE\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\b0-H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001ab\u0010Q\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020A2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\b0-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\b\b\u0002\u0010L\u001a\u00020K2\b\b\u0002\u0010N\u001a\u00020M2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a7\u0010V\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020R2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\b0+¢\u0006\u0002\b/H\u0003ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a*\u0010[\u001a\u00020X2\u0006\u00108\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a$\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\0_2\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0002\u001a(\u0010e\u001a\u00020\\2\u0006\u0010a\u001a\u00020\\2\u0006\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000eH\u0002\u001a\u0018\u0010h\u001a\u00020\\2\u0006\u0010f\u001a\u00020\\2\u0006\u0010g\u001a\u00020\\H\u0002\u001a\u0014\u0010i\u001a\u00020\u0002*\u00020\u00022\u0006\u0010i\u001a\u00020\u0011H\u0003\"\u0014\u0010j\u001a\u00020\\8\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010k\"\u0014\u0010m\u001a\u00020l8\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010n\"\u0014\u0010o\u001a\u00020\\8\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010k\"\u0014\u0010p\u001a\u00020\\8\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010k\"\u0014\u0010q\u001a\u00020\\8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010k\"\u0014\u0010r\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010k\"\u0014\u0010s\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010k\"\u0014\u0010t\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010k\"\u0014\u0010u\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010k\"\u0014\u0010v\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010k\"\u0014\u0010w\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010k\"\u0014\u0010x\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010k\"\u0014\u0010y\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010k\"\u0014\u0010z\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010k\"\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}\"\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010}\"\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010}\"\u0016\u0010\u0080\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010k\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0086\u0001²\u0006\r\u0010\u0081\u0001\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000f\u0010\u0082\u0001\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0083\u0001\u001a\u00020A8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0085\u0001\u001a\u00030\u0084\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "Lkotlin/r2;", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "autoSwitchToMinute", "VerticalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", "TimeInputImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", "HorizontalClockDisplay", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalClockDisplay", "ClockDisplayNumbers", "HorizontalPeriodToggle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalPeriodToggle", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "PeriodToggleImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/u;", "content", "ToggleItem", "(ZLandroidx/compose/ui/graphics/Shape;Lv3/a;Landroidx/compose/material3/TimePickerColors;Lv3/q;Landroidx/compose/runtime/Composer;I)V", "DisplaySeparator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", t0.b.f22420d, "Landroidx/compose/material3/Selection;", "selection", "TimeSelector-uXwN82Y", "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "TimeSelector", "ClockFace", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "drawSelector", "ClockText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "Lkotlin/v0;", "name", "onNewValue", "timeInputOnChange-gIWD5Rc", "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILv3/l;)V", "timeInputOnChange", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "TimePickerTextField-lxUZ_iY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "TimePickerTextField", "Landroidx/compose/ui/unit/Dp;", "radius", "CircularLayout-uFdPcIQ", "(Landroidx/compose/ui/Modifier;FLv3/p;Landroidx/compose/runtime/Composer;II)V", "CircularLayout", "number", "", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "", "current", "new", "Lkotlin/u0;", "valuesForAnimation", "x1", "y1", "x2", "y2", "dist", "y", "x", "atan", "visible", "FullCircle", "F", "", "QuarterCircle", "D", "RadiansPerMinute", "RadiansPerHour", "SeparatorZIndex", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "ClockFaceBottomMargin", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "MinimumInteractiveSize", "", "Minutes", "Ljava/util/List;", "Hours", "ExtraHours", "PeriodToggleMargin", "touchExplorationServicesEnabled", "hourValue", "minuteValue", "Landroidx/compose/ui/geometry/Offset;", "center", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 14 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 15 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 16 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 17 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n1116#2,6:1844\n1116#2,6:1930\n1116#2,6:1936\n1116#2,6:2184\n1116#2,6:2190\n1116#2,6:2197\n1116#2,6:2231\n1116#2,6:2237\n1116#2,6:2247\n1116#2,3:2301\n1119#2,3:2307\n1116#2,6:2311\n1116#2,6:2317\n1116#2,6:2325\n1116#2,3:2336\n1119#2,3:2342\n1116#2,6:2346\n1116#2,6:2352\n1116#2,6:2392\n1116#2,6:2403\n1116#2,6:2409\n1116#2,6:2487\n1116#2,6:2506\n1116#2,6:2512\n74#3,6:1850\n80#3:1884\n84#3:1889\n73#3,7:2022\n80#3:2057\n84#3:2102\n74#3,6:2415\n80#3:2449\n84#3:2505\n78#4,11:1856\n91#4:1888\n78#4,11:1896\n91#4:1928\n78#4,11:1948\n78#4,11:1983\n91#4:2015\n91#4:2020\n78#4,11:2029\n78#4,11:2064\n91#4:2096\n91#4:2101\n78#4,11:2110\n78#4,11:2145\n91#4:2177\n91#4:2182\n78#4,11:2203\n91#4:2246\n78#4,11:2260\n91#4:2292\n78#4,11:2363\n91#4:2401\n78#4,11:2421\n78#4,11:2458\n91#4:2497\n91#4:2504\n78#4,11:2518\n91#4:2549\n456#5,8:1867\n464#5,3:1881\n467#5,3:1885\n456#5,8:1907\n464#5,3:1921\n467#5,3:1925\n456#5,8:1959\n464#5,3:1973\n456#5,8:1994\n464#5,3:2008\n467#5,3:2012\n467#5,3:2017\n456#5,8:2040\n464#5,3:2054\n456#5,8:2075\n464#5,3:2089\n467#5,3:2093\n467#5,3:2098\n456#5,8:2121\n464#5,3:2135\n456#5,8:2156\n464#5,3:2170\n467#5,3:2174\n467#5,3:2179\n456#5,8:2214\n464#5,3:2228\n467#5,3:2243\n456#5,8:2271\n464#5,3:2285\n467#5,3:2289\n25#5:2300\n25#5:2335\n456#5,8:2374\n464#5,3:2388\n467#5,3:2398\n456#5,8:2432\n464#5,3:2446\n456#5,8:2469\n464#5,3:2483\n467#5,3:2494\n467#5,3:2501\n456#5,8:2529\n464#5,6:2543\n3737#6,6:1875\n3737#6,6:1915\n3737#6,6:1967\n3737#6,6:2002\n3737#6,6:2048\n3737#6,6:2083\n3737#6,6:2129\n3737#6,6:2164\n3737#6,6:2222\n3737#6,6:2279\n3737#6,6:2382\n3737#6,6:2440\n3737#6,6:2477\n3737#6,6:2537\n87#7,6:1890\n93#7:1924\n97#7:1929\n87#7,6:1942\n93#7:1976\n97#7:2021\n86#7,7:2103\n93#7:2138\n97#7:2183\n68#8,6:1977\n74#8:2011\n78#8:2016\n68#8,6:2058\n74#8:2092\n78#8:2097\n68#8,6:2139\n74#8:2173\n78#8:2178\n69#8,5:2255\n74#8:2288\n78#8:2293\n69#8,5:2358\n74#8:2391\n78#8:2402\n68#8,6:2452\n74#8:2486\n78#8:2498\n141#9:2196\n145#9:2294\n143#9:2295\n159#9:2450\n157#9:2451\n153#9:2499\n155#9:2500\n149#9:2550\n151#9:2551\n147#9:2552\n154#10:2253\n154#10:2564\n154#10:2565\n154#10:2566\n154#10:2567\n154#10:2568\n154#10:2569\n154#10:2570\n154#10:2571\n154#10:2572\n154#10:2584\n74#11:2254\n74#11:2323\n74#11:2493\n487#12,4:2296\n491#12,2:2304\n495#12:2310\n487#12,4:2331\n491#12,2:2339\n495#12:2345\n487#13:2306\n487#13:2341\n1#14:2324\n135#15:2553\n81#16:2554\n81#16:2555\n107#16,2:2556\n81#16:2558\n107#16,2:2559\n81#16:2561\n107#16,2:2562\n151#17,3:2573\n33#17,4:2576\n154#17,2:2580\n38#17:2582\n156#17:2583\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n559#1:1844,6\n819#1:1930,6\n822#1:1936,6\n1004#1:2184,6\n1049#1:2190,6\n1106#1:2197,6\n1117#1:2231,6\n1131#1:2237,6\n1153#1:2247,6\n1207#1:2301,3\n1207#1:2307,3\n1210#1:2311,6\n1214#1:2317,6\n1471#1:2325,6\n1472#1:2336,3\n1472#1:2342,3\n1492#1:2346,6\n1494#1:2352,6\n1503#1:2392,6\n1575#1:2403,6\n1576#1:2409,6\n1609#1:2487,6\n1667#1:2506,6\n1683#1:2512,6\n785#1:1850,6\n785#1:1884\n785#1:1889\n923#1:2022,7\n923#1:2057\n923#1:2102\n1583#1:2415,6\n1583#1:2449\n1583#1:2505\n785#1:1856,11\n785#1:1888\n803#1:1896,11\n803#1:1928\n826#1:1948,11\n907#1:1983,11\n907#1:2015\n826#1:2020\n923#1:2029,11\n926#1:2064,11\n926#1:2096\n923#1:2101\n942#1:2110,11\n945#1:2145,11\n945#1:2177\n942#1:2182\n1104#1:2203,11\n1104#1:2246\n1175#1:2260,11\n1175#1:2292\n1487#1:2363,11\n1487#1:2401\n1583#1:2421,11\n1602#1:2458,11\n1602#1:2497\n1583#1:2504\n1681#1:2518,11\n1681#1:2549\n785#1:1867,8\n785#1:1881,3\n785#1:1885,3\n803#1:1907,8\n803#1:1921,3\n803#1:1925,3\n826#1:1959,8\n826#1:1973,3\n907#1:1994,8\n907#1:2008,3\n907#1:2012,3\n826#1:2017,3\n923#1:2040,8\n923#1:2054,3\n926#1:2075,8\n926#1:2089,3\n926#1:2093,3\n923#1:2098,3\n942#1:2121,8\n942#1:2135,3\n945#1:2156,8\n945#1:2170,3\n945#1:2174,3\n942#1:2179,3\n1104#1:2214,8\n1104#1:2228,3\n1104#1:2243,3\n1175#1:2271,8\n1175#1:2285,3\n1175#1:2289,3\n1207#1:2300\n1472#1:2335\n1487#1:2374,8\n1487#1:2388,3\n1487#1:2398,3\n1583#1:2432,8\n1583#1:2446,3\n1602#1:2469,8\n1602#1:2483,3\n1602#1:2494,3\n1583#1:2501,3\n1681#1:2529,8\n1681#1:2543,6\n785#1:1875,6\n803#1:1915,6\n826#1:1967,6\n907#1:2002,6\n923#1:2048,6\n926#1:2083,6\n942#1:2129,6\n945#1:2164,6\n1104#1:2222,6\n1175#1:2279,6\n1487#1:2382,6\n1583#1:2440,6\n1602#1:2477,6\n1681#1:2537,6\n803#1:1890,6\n803#1:1924\n803#1:1929\n826#1:1942,6\n826#1:1976\n826#1:2021\n942#1:2103,7\n942#1:2138\n942#1:2183\n907#1:1977,6\n907#1:2011\n907#1:2016\n926#1:2058,6\n926#1:2092\n926#1:2097\n945#1:2139,6\n945#1:2173\n945#1:2178\n1175#1:2255,5\n1175#1:2288\n1175#1:2293\n1487#1:2358,5\n1487#1:2391\n1487#1:2402\n1602#1:2452,6\n1602#1:2486\n1602#1:2498\n1103#1:2196\n1199#1:2294\n1201#1:2295\n1596#1:2450\n1598#1:2451\n1655#1:2499\n1657#1:2500\n1727#1:2550\n1729#1:2551\n1731#1:2552\n1154#1:2253\n1787#1:2564\n1788#1:2565\n1789#1:2566\n1790#1:2567\n1791#1:2568\n1793#1:2569\n1794#1:2570\n1795#1:2571\n1796#1:2572\n1800#1:2584\n1167#1:2254\n1470#1:2323\n1615#1:2493\n1207#1:2296,4\n1207#1:2304,2\n1207#1:2310\n1472#1:2331,4\n1472#1:2339,2\n1472#1:2345\n1207#1:2306\n1472#1:2341\n1810#1:2553\n209#1:2554\n819#1:2555\n819#1:2556,2\n822#1:2558\n822#1:2559,2\n1471#1:2561\n1471#1:2562,2\n1799#1:2573,3\n1799#1:2576,4\n1799#1:2580,2\n1799#1:2582\n1799#1:2583\n*E\n"})
/* loaded from: classes.dex */
public final class TimePickerKt {
    private static final float ClockFaceBottomMargin;
    private static final float DisplaySeparatorWidth;

    @p4.l
    private static final List<Integer> ExtraHours;
    private static final float FullCircle = 6.2831855f;

    @p4.l
    private static final List<Integer> Hours;

    @p4.l
    private static final List<Integer> Minutes;
    private static final float PeriodToggleMargin;
    private static final double QuarterCircle = 1.5707963267948966d;
    private static final float RadiansPerHour = 0.5235988f;
    private static final float RadiansPerMinute = 0.10471976f;
    private static final float SeparatorZIndex = 2.0f;
    private static final float TimeInputBottomPadding;
    private static final float OuterCircleSizeRadius = Dp.m6044constructorimpl(101);
    private static final float InnerCircleRadius = Dp.m6044constructorimpl(69);
    private static final float ClockDisplayBottomMargin = Dp.m6044constructorimpl(36);
    private static final float SupportLabelTop = Dp.m6044constructorimpl(7);
    private static final float MaxDistance = Dp.m6044constructorimpl(74);
    private static final float MinimumInteractiveSize = Dp.m6044constructorimpl(48);

    static {
        List<Integer> L;
        List<Integer> L2;
        float f5 = 24;
        ClockFaceBottomMargin = Dp.m6044constructorimpl(f5);
        DisplaySeparatorWidth = Dp.m6044constructorimpl(f5);
        TimeInputBottomPadding = Dp.m6044constructorimpl(f5);
        L = kotlin.collections.w.L(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        Minutes = L;
        L2 = kotlin.collections.w.L(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Hours = L2;
        ArrayList arrayList = new ArrayList(L2.size());
        int size = L2.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(Integer.valueOf((L2.get(i5).intValue() % 12) + 12));
        }
        ExtraHours = arrayList;
        PeriodToggleMargin = Dp.m6044constructorimpl(12);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: CircularLayout-uFdPcIQ */
    public static final void m2478CircularLayoutuFdPcIQ(Modifier modifier, final float f5, v3.p<? super Composer, ? super Integer, r2> pVar, Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        int i11 = i6 & 1;
        if (i11 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i7 |= i9;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i7 |= i10;
        }
        if ((i7 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i7, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1679)");
            }
            startRestartGroup.startReplaceableGroup(1651957759);
            if ((i7 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    @r1({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1843:1\n69#2,6:1844\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$CircularLayout$1$1$1\n*L\n1701#1:1844,6\n*E\n"})
                    /* renamed from: androidx.compose.material3.TimePickerKt$CircularLayout$1$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ long $constraints;
                        final /* synthetic */ Placeable $innerCirclePlaceable;
                        final /* synthetic */ List<Placeable> $placeables;
                        final /* synthetic */ float $radiusPx;
                        final /* synthetic */ Placeable $selectorPlaceable;
                        final /* synthetic */ float $theta;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Placeable placeable, List<? extends Placeable> list, Placeable placeable2, long j5, float f5, float f6) {
                            super(1);
                            this.$selectorPlaceable = placeable;
                            this.$placeables = list;
                            this.$innerCirclePlaceable = placeable2;
                            this.$constraints = j5;
                            this.$radiusPx = f5;
                            this.$theta = f6;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            int K0;
                            int K02;
                            Placeable placeable = this.$selectorPlaceable;
                            if (placeable != null) {
                                Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
                            }
                            List<Placeable> list = this.$placeables;
                            long j5 = this.$constraints;
                            float f5 = this.$radiusPx;
                            float f6 = this.$theta;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Placeable placeable2 = list.get(i5);
                                int m6000getMaxWidthimpl = (Constraints.m6000getMaxWidthimpl(j5) / 2) - (placeable2.getWidth() / 2);
                                int m5999getMaxHeightimpl = (Constraints.m5999getMaxHeightimpl(j5) / 2) - (placeable2.getHeight() / 2);
                                double d5 = f5;
                                double d6 = (i5 * f6) - 1.5707963267948966d;
                                List<Placeable> list2 = list;
                                double cos = (Math.cos(d6) * d5) + m6000getMaxWidthimpl;
                                double sin = (d5 * Math.sin(d6)) + m5999getMaxHeightimpl;
                                K0 = kotlin.math.d.K0(cos);
                                K02 = kotlin.math.d.K0(sin);
                                Placeable.PlacementScope.place$default(placementScope, placeable2, K0, K02, 0.0f, 4, null);
                                i5++;
                                list = list2;
                                j5 = j5;
                            }
                            Placeable placeable3 = this.$innerCirclePlaceable;
                            if (placeable3 != null) {
                                Placeable.PlacementScope.place$default(placementScope, placeable3, (Constraints.m6002getMinWidthimpl(this.$constraints) - this.$innerCirclePlaceable.getWidth()) / 2, (Constraints.m6001getMinHeightimpl(this.$constraints) - this.$innerCirclePlaceable.getHeight()) / 2, 0.0f, 4, null);
                            }
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        Measurable measurable;
                        Measurable measurable2;
                        Placeable placeable;
                        Placeable placeable2;
                        boolean z5;
                        boolean z6;
                        float mo304toPx0680j_4 = measureScope.mo304toPx0680j_4(f5);
                        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i12 = 0;
                        while (true) {
                            boolean z7 = true;
                            if (i12 >= size) {
                                break;
                            }
                            Measurable measurable3 = list.get(i12);
                            Measurable measurable4 = measurable3;
                            if (LayoutIdKt.getLayoutId(measurable4) == LayoutId.Selector || LayoutIdKt.getLayoutId(measurable4) == LayoutId.InnerCircle) {
                                z7 = false;
                            }
                            if (z7) {
                                arrayList.add(measurable3);
                            }
                            i12++;
                        }
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size2 = arrayList.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            arrayList2.add(((Measurable) arrayList.get(i13)).mo4998measureBRTryo0(m5991copyZbe2FdA$default));
                        }
                        int size3 = list.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size3) {
                                measurable = list.get(i14);
                                if (LayoutIdKt.getLayoutId(measurable) == LayoutId.Selector) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    break;
                                }
                                i14++;
                            } else {
                                measurable = null;
                                break;
                            }
                        }
                        Measurable measurable5 = measurable;
                        int size4 = list.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size4) {
                                measurable2 = list.get(i15);
                                if (LayoutIdKt.getLayoutId(measurable2) == LayoutId.InnerCircle) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    break;
                                }
                                i15++;
                            } else {
                                measurable2 = null;
                                break;
                            }
                        }
                        Measurable measurable6 = measurable2;
                        float size5 = 6.2831855f / arrayList2.size();
                        if (measurable5 != null) {
                            placeable = measurable5.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                        } else {
                            placeable = null;
                        }
                        if (measurable6 != null) {
                            placeable2 = measurable6.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
                        } else {
                            placeable2 = null;
                        }
                        return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, new AnonymousClass1(placeable, arrayList2, placeable2, j5, mo304toPx0680j_4, size5), 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            int i12 = ((i7 >> 6) & 14) | ((i7 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i13 = ((i12 << 9) & 7168) | 6;
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
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$CircularLayout$2(modifier2, f5, pVar, i5, i6));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockDisplayNumbers(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i6, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:962)");
            }
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont())), ComposableLambdaKt.composableLambda(startRestartGroup, -477913269, true, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, timePickerColors)), startRestartGroup, ProvidedValue.$stable | 0 | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockDisplayNumbers$2(timePickerState, timePickerColors, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(@p4.l TimePickerState timePickerState, @p4.l TimePickerColors timePickerColors, boolean z4, @p4.m Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1525091100);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(z4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i6, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1339)");
            }
            CrossfadeKt.Crossfade(timePickerState.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m602size3ABfNKs(BackgroundKt.m200backgroundbw27NRU(Modifier.Companion, timePickerColors.m2458getClockDialColor0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m3161getClockDialContainerSizeD9Ej5fM()), false, TimePickerKt$ClockFace$1.INSTANCE, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1628166511, true, new TimePickerKt$ClockFace$2(timePickerState, z4, timePickerColors)), startRestartGroup, 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockFace$3(timePickerState, timePickerColors, z4, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockText(Modifier modifier, TimePickerState timePickerState, int i5, boolean z4, Composer composer, int i6) {
        int i7;
        boolean g5;
        boolean z5;
        boolean z6;
        Composer composer2;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1420123631);
        if ((i6 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i7 = i11 | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i7 |= i10;
        }
        if ((i6 & 384) == 0) {
            if (startRestartGroup.changed(i5)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i7 |= i9;
        }
        if ((i6 & 3072) == 0) {
            if (startRestartGroup.changed(z4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i7 |= i8;
        }
        int i12 = i7;
        if ((i12 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420123631, i12, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1467)");
            }
            TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getClockDialLabelTextFont());
            float mo304toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo304toPx0680j_4(MaxDistance);
            startRestartGroup.startReplaceableGroup(-1652988653);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(Offset.Companion.m3509getZeroF1C5BW0()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            String m2486numberContentDescriptionYKJpE6Y = m2486numberContentDescriptionYKJpE6Y(timePickerState.m2500getSelectionJiIwxys$material3_release(), timePickerState.is24hour(), i5, startRestartGroup, i12 & 896);
            String localString$default = ActualJvm_jvmKt.toLocalString$default(i5, 0, 0, false, 7, null);
            if (Selection.m2172equalsimpl0(timePickerState.m2500getSelectionJiIwxys$material3_release(), Selection.Companion.m2177getMinuteJiIwxys())) {
                g5 = kotlin.jvm.internal.l0.g(ActualJvm_jvmKt.toLocalString$default(timePickerState.getMinute(), 0, 0, false, 7, null), localString$default);
            } else {
                g5 = kotlin.jvm.internal.l0.g(ActualJvm_jvmKt.toLocalString$default(timePickerState.getHour(), 0, 0, false, 7, null), localString$default);
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m602size3ABfNKs = SizeKt.m602size3ABfNKs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), MinimumInteractiveSize);
            startRestartGroup.startReplaceableGroup(-1652987978);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$ClockText$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier focusable$default = FocusableKt.focusable$default(OnGloballyPositionedModifierKt.onGloballyPositioned(m602size3ABfNKs, (v3.l) rememberedValue3), false, null, 3, null);
            startRestartGroup.startReplaceableGroup(-1652987865);
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            if ((i12 & 112) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean changed = changedInstance | z5 | startRestartGroup.changed(mo304toPx0680j_4);
            if ((i12 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean changed2 = changed | z6 | startRestartGroup.changed(g5);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new TimePickerKt$ClockText$2$1(g5, coroutineScope, timePickerState, mo304toPx0680j_4, z4, mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(focusable$default, true, (v3.l) rememberedValue4);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(859631475);
            boolean changed3 = startRestartGroup.changed(m2486numberContentDescriptionYKJpE6Y);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new TimePickerKt$ClockText$3$1$1(m2486numberContentDescriptionYKJpE6Y);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion3, (v3.l) rememberedValue5);
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(localString$default, clearAndSetSemantics, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, fromToken, composer2, 0, 0, 65532);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockText$4(modifier, timePickerState, i5, z4, i6));
        }
    }

    public static final long ClockText$lambda$28(MutableState<Offset> mutableState) {
        return mutableState.getValue().m3503unboximpl();
    }

    public static final void ClockText$lambda$29(MutableState<Offset> mutableState, long j5) {
        mutableState.setValue(Offset.m3482boximpl(j5));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DisplaySeparator(Modifier modifier, Composer composer, int i5) {
        int i6;
        TextStyle m5571copyp1EtxEg;
        Composer composer2;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i5;
        } else {
            i6 = i5;
        }
        if ((i6 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i6, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1165)");
            }
            m5571copyp1EtxEg = r16.m5571copyp1EtxEg((r48 & 1) != 0 ? r16.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r16.spanStyle.m5505getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r16.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r16.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r16.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r16.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r16.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r16.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r16.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r16.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r16.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r16.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r16.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r16.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r16.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r16.paragraphStyle.m5460getTextAligne0LSkKk() : TextAlign.Companion.m5936getCentere0LSkKk(), (r48 & 65536) != 0 ? r16.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r16.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r16.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r16.platformStyle : null, (r48 & 1048576) != 0 ? r16.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.Companion.m5913getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m5925getBothEVpEnUU(), null), (r48 & 2097152) != 0 ? r16.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r16.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).paragraphStyle.getTextMotion() : null);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, TimePickerKt$DisplaySeparator$1.INSTANCE);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(clearAndSetSemantics);
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
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m2452Text4IGK_g(":", (Modifier) null, ColorSchemeKt.getValue(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, m5571copyp1EtxEg, composer2, 6, 0, 65530);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$DisplaySeparator$3(modifier, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i6, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:921)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i6 & 14) | (i6 & 112));
            startRestartGroup.startReplaceableGroup(-552392411);
            if (!timePickerState.is24hour()) {
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, 0.0f, PeriodToggleMargin, 0.0f, 0.0f, 13, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i9 = i6 << 3;
                HorizontalPeriodToggle(SizeKt.m604sizeVpY3zN4(companion, timePickerTokens.m3167getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m3166getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i9 & 896) | (i9 & 112) | 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new TimePickerKt$HorizontalClockDisplay$2(timePickerState, timePickerColors, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void HorizontalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i6, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1002)");
            }
            startRestartGroup.startReplaceableGroup(759555873);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ List<Placeable> $items;
                        final /* synthetic */ Placeable $spacerPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(List<? extends Placeable> list, Placeable placeable) {
                            super(1);
                            this.$items = list;
                            this.$spacerPlaceable = placeable;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.place$default(placementScope, this.$items.get(0), 0, 0, 0.0f, 4, null);
                            Placeable.PlacementScope.place$default(placementScope, this.$items.get(1), this.$items.get(0).getWidth(), 0, 0.0f, 4, null);
                            Placeable.PlacementScope.place$default(placementScope, this.$spacerPlaceable, this.$items.get(0).getWidth() - (this.$spacerPlaceable.getWidth() / 2), 0, 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Measurable measurable = list.get(i10);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, measureScope.mo298roundToPx0680j_4(TimePickerTokens.INSTANCE.m3168getPeriodSelectorOutlineWidthD9Ej5fM()), 0, 0, 12, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    Measurable measurable2 = list.get(i11);
                                    if (!kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    arrayList2.add(((Measurable) arrayList.get(i12)).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, Constraints.m6000getMaxWidthimpl(j5) / 2, 0, 0, 12, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new AnonymousClass1(arrayList2, mo4998measureBRTryo0), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i6 & 14) | 3072 | (i6 & 112) | (i6 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$HorizontalPeriodToggle$1(modifier, timePickerState, timePickerColors, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HorizontalTimePicker(@p4.l androidx.compose.material3.TimePickerState r18, @p4.m androidx.compose.ui.Modifier r19, @p4.m androidx.compose.material3.TimePickerColors r20, boolean r21, @p4.m androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PeriodToggleImpl(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
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
            if (startRestartGroup.changed(timePickerState)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i6 |= i10;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(measurePolicy)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changed(shape)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i6 |= i8;
        }
        if ((196608 & i5) == 0) {
            if (startRestartGroup.changed(shape2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i6 |= i7;
        }
        if ((74899 & i6) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i6, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1095)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke m228BorderStrokecXLIe8U = BorderStrokeKt.m228BorderStrokecXLIe8U(timePickerTokens.m3168getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m2462getPeriodSelectorBorderColor0d7_KjU());
            Shape value = ShapesKt.getValue(timePickerTokens.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            Strings.Companion companion = Strings.Companion;
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(Strings.m2225constructorimpl(R.string.m3c_time_picker_period_toggle_description), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-2008454294);
            boolean changed = startRestartGroup.changed(m2294getStringNWtq28);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$PeriodToggleImpl$1$1(m2294getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (v3.l) rememberedValue, 1, null)), m228BorderStrokecXLIe8U, cornerBasedShape);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion2.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(border);
            int i13 = ((((i6 >> 3) & 896) << 9) & 7168) | 6;
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
            Updater.m3271setimpl(m3264constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            boolean z6 = !timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1654477599);
            int i14 = i6 & 112;
            if (i14 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$PeriodToggleImpl$2$1$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i15 = (i6 << 3) & 7168;
            ToggleItem(z6, shape, (v3.a) rememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m1770getLambda1$material3_release(), startRestartGroup, ((i6 >> 9) & 112) | 24576 | i15);
            SpacerKt.Spacer(BackgroundKt.m201backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), SeparatorZIndex), 0.0f, 1, null), timePickerColors.m2462getPeriodSelectorBorderColor0d7_KjU(), null, 2, null), startRestartGroup, 0);
            boolean isAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1654478145);
            if (i14 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$PeriodToggleImpl$2$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            ToggleItem(isAfternoonToggle$material3_release, shape2, (v3.a) rememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m1771getLambda2$material3_release(), startRestartGroup, ((i6 >> 12) & 112) | 24576 | i15);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$PeriodToggleImpl$3(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i5));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if ((r12 & 4) != 0) goto L116;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TimeInput(@p4.l androidx.compose.material3.TimePickerState r7, @p4.m androidx.compose.ui.Modifier r8, @p4.m androidx.compose.material3.TimePickerColors r9, @p4.m androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            r0 = -760850373(0xffffffffd2a6583b, float:-3.57222416E11)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            if (r1 == 0) goto Le
            r1 = r11 | 6
            goto L1e
        Le:
            r1 = r11 & 6
            if (r1 != 0) goto L1d
            boolean r1 = r10.changed(r7)
            if (r1 == 0) goto L1a
            r1 = 4
            goto L1b
        L1a:
            r1 = 2
        L1b:
            r1 = r1 | r11
            goto L1e
        L1d:
            r1 = r11
        L1e:
            r2 = r12 & 2
            if (r2 == 0) goto L25
            r1 = r1 | 48
            goto L35
        L25:
            r3 = r11 & 48
            if (r3 != 0) goto L35
            boolean r3 = r10.changed(r8)
            if (r3 == 0) goto L32
            r3 = 32
            goto L34
        L32:
            r3 = 16
        L34:
            r1 = r1 | r3
        L35:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L49
            r3 = r12 & 4
            if (r3 != 0) goto L46
            boolean r3 = r10.changed(r9)
            if (r3 == 0) goto L46
            r3 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r3 = 128(0x80, float:1.794E-43)
        L48:
            r1 = r1 | r3
        L49:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L5c
            boolean r3 = r10.getSkipping()
            if (r3 != 0) goto L56
            goto L5c
        L56:
            r10.skipToGroupEnd()
        L59:
            r3 = r8
            r4 = r9
            goto Laa
        L5c:
            r10.startDefaults()
            r3 = r11 & 1
            r4 = 6
            if (r3 == 0) goto L73
            boolean r3 = r10.getDefaultsInvalid()
            if (r3 == 0) goto L6b
            goto L73
        L6b:
            r10.skipToGroupEnd()
            r2 = r12 & 4
            if (r2 == 0) goto L83
            goto L81
        L73:
            if (r2 == 0) goto L77
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.Companion
        L77:
            r2 = r12 & 4
            if (r2 == 0) goto L83
            androidx.compose.material3.TimePickerDefaults r9 = androidx.compose.material3.TimePickerDefaults.INSTANCE
            androidx.compose.material3.TimePickerColors r9 = r9.colors(r10, r4)
        L81:
            r1 = r1 & (-897(0xfffffffffffffc7f, float:NaN))
        L83:
            r10.endDefaults()
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L92
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.TimeInput (TimePicker.kt:248)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L92:
            int r0 = r1 >> 3
            r2 = r0 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            int r1 = r1 << r4
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            TimeInputImpl(r8, r9, r7, r10, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L59
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L59
        Laa:
            androidx.compose.runtime.ScopeUpdateScope r8 = r10.endRestartGroup()
            if (r8 == 0) goto Lbc
            androidx.compose.material3.TimePickerKt$TimeInput$1 r9 = new androidx.compose.material3.TimePickerKt$TimeInput$1
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.updateScope(r9)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TimeInputImpl(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i5) {
        int i6;
        boolean z4;
        boolean z5;
        Composer composer2;
        TextStyle m5571copyp1EtxEg;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        int i10 = i6;
        if ((i10 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i10, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:817)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.Companion;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            startRestartGroup.startReplaceableGroup(565122579);
            int i11 = i10 & 896;
            if (i11 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$TimeInputImpl$hourValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (v3.a) rememberedValue, startRestartGroup, 0, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            startRestartGroup.startReplaceableGroup(565122759);
            if (i11 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeInputImpl$minuteValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (v3.a) rememberedValue2, startRestartGroup, 0, 4);
            composer2 = startRestartGroup;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, TimeInputBottomPadding, 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical top = companion2.getTop();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composer2, 6);
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            m5571copyp1EtxEg = r19.m5571copyp1EtxEg((r48 & 1) != 0 ? r19.spanStyle.m5504getColor0d7_KjU() : timePickerColors.m2475timeSelectorContentColorvNxB06k$material3_release(true), (r48 & 2) != 0 ? r19.spanStyle.m5505getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r19.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r19.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r19.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r19.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r19.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r19.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r19.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r19.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r19.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r19.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r19.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r19.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r19.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r19.paragraphStyle.m5460getTextAligne0LSkKk() : TextAlign.Companion.m5936getCentere0LSkKk(), (r48 & 65536) != 0 ? r19.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r19.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r19.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r19.platformStyle : null, (r48 & 1048576) != 0 ? r19.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r19.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r19.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TypographyKt.fromToken(typography, timeInputTokens.getTimeFieldLabelTextFont()).paragraphStyle.getTextMotion() : null);
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(m5571copyp1EtxEg), ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new TimePickerKt$TimeInputImpl$1$1(rememberSaveable, timePickerState, timePickerColors, rememberSaveable2)), composer2, ProvidedValue.$stable | 0 | 48);
            composer2.startReplaceableGroup(565126032);
            if (!timePickerState.is24hour()) {
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(companion4, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
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
                Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                VerticalPeriodToggle(SizeKt.m604sizeVpY3zN4(companion4, timeInputTokens.m3156getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m3155getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i10 >> 3) & 112) | 6 | ((i10 << 3) & 896));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$TimeInputImpl$2(modifier, timePickerColors, timePickerState, i5));
        }
    }

    public static final TextFieldValue TimeInputImpl$lambda$5(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final TextFieldValue TimeInputImpl$lambda$8(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if ((r14 & 8) != 0) goto L150;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: TimePicker-mT9BvqQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2479TimePickermT9BvqQ(@p4.l androidx.compose.material3.TimePickerState r8, @p4.m androidx.compose.ui.Modifier r9, @p4.m androidx.compose.material3.TimePickerColors r10, int r11, @p4.m androidx.compose.runtime.Composer r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2479TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05da  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: TimePickerTextField-lxUZ_iY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2480TimePickerTextFieldlxUZ_iY(androidx.compose.ui.Modifier r118, androidx.compose.ui.text.input.TextFieldValue r119, v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r120, androidx.compose.material3.TimePickerState r121, int r122, androidx.compose.foundation.text.KeyboardOptions r123, androidx.compose.foundation.text.KeyboardActions r124, androidx.compose.material3.TimePickerColors r125, androidx.compose.runtime.Composer r126, int r127, int r128) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m2480TimePickerTextFieldlxUZ_iY(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean TimePicker_mT9BvqQ$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TimeSelector-uXwN82Y */
    public static final void m2481TimeSelectoruXwN82Y(Modifier modifier, int i5, TimePickerState timePickerState, int i6, TimePickerColors timePickerColors, Composer composer, int i7) {
        int i8;
        int m2225constructorimpl;
        boolean z4;
        boolean z5;
        Composer composer2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(21099367);
        if ((i7 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i8 = i13 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (startRestartGroup.changed(i5)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i8 |= i12;
        }
        if ((i7 & 384) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i8 |= i11;
        }
        if ((i7 & 3072) == 0) {
            if (startRestartGroup.changed(i6)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i8 |= i10;
        }
        if ((i7 & 24576) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i8 |= i9;
        }
        if ((i8 & 9363) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i8, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1194)");
            }
            boolean m2172equalsimpl0 = Selection.m2172equalsimpl0(timePickerState.m2500getSelectionJiIwxys$material3_release(), i6);
            if (Selection.m2172equalsimpl0(i6, Selection.Companion.m2176getHourJiIwxys())) {
                Strings.Companion companion = Strings.Companion;
                m2225constructorimpl = Strings.m2225constructorimpl(R.string.m3c_time_picker_hour_selection);
            } else {
                Strings.Companion companion2 = Strings.Companion;
                m2225constructorimpl = Strings.m2225constructorimpl(R.string.m3c_time_picker_minute_selection);
            }
            String m2294getStringNWtq28 = Strings_androidKt.m2294getStringNWtq28(m2225constructorimpl, startRestartGroup, 0);
            long m2474timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2474timeSelectorContainerColorvNxB06k$material3_release(m2172equalsimpl0);
            long m2475timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m2475timeSelectorContentColorvNxB06k$material3_release(m2172equalsimpl0);
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.i.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-633372797);
            boolean changed = startRestartGroup.changed(m2294getStringNWtq28);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeSelector$1$1(m2294getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics = SemanticsModifierKt.semantics(modifier, true, (v3.l) rememberedValue2);
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-633372653);
            if ((i8 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i8 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean changedInstance = z4 | z5 | startRestartGroup.changedInstance(coroutineScope);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new TimePickerKt$TimeSelector$2$1(i6, timePickerState, coroutineScope);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m2305Surfaced85dljk(m2172equalsimpl0, (v3.a<r2>) rememberedValue3, semantics, false, value, m2474timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (v3.p<? super Composer, ? super Integer, r2>) ComposableLambdaKt.composableLambda(startRestartGroup, -1338709103, true, new TimePickerKt$TimeSelector$3(i6, timePickerState, i5, m2475timeSelectorContentColorvNxB06k$material3_release)), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$TimeSelector$4(modifier, i5, timePickerState, i6, timePickerColors, i7));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ToggleItem(boolean z4, Shape shape, v3.a<r2> aVar, TimePickerColors timePickerColors, v3.q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, Composer composer, int i5) {
        int i6;
        float f5;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(z4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i6 = i11 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(shape)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i6 |= i10;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changedInstance(aVar)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 3072) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i6 |= i8;
        }
        if ((i5 & 24576) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i6 |= i7;
        }
        if ((i6 & 9363) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i6, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1144)");
            }
            long m2473periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m2473periodSelectorContentColorvNxB06k$material3_release(z4);
            long m2472periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m2472periodSelectorContainerColorvNxB06k$material3_release(z4);
            Modifier.Companion companion = Modifier.Companion;
            if (z4) {
                f5 = 0.0f;
            } else {
                f5 = 1.0f;
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(companion, f5), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(526522672);
            if ((i6 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$ToggleItem$1$1(z4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(aVar, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (v3.l) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m1605textButtonColorsro_MJ88(m2472periodSelectorContainerColorvNxB06k$material3_release, m2473periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m546PaddingValues0680j_4(Dp.m6044constructorimpl(0)), null, qVar, startRestartGroup, ((i6 >> 6) & 14) | 12582912 | ((i6 << 6) & 7168) | ((i6 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ToggleItem$2(z4, shape, aVar, timePickerColors, qVar, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalClockDisplay(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i6 = i8 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i6 |= i7;
        }
        if ((i6 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i6, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:940)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
            Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ClockDisplayNumbers(timePickerState, timePickerColors, startRestartGroup, (i6 & 14) | (i6 & 112));
            startRestartGroup.startReplaceableGroup(952914149);
            if (!timePickerState.is24hour()) {
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion, PeriodToggleMargin, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i9 = i6 << 3;
                VerticalPeriodToggle(SizeKt.m604sizeVpY3zN4(companion, timePickerTokens.m3170getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m3169getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i9 & 896) | (i9 & 112) | 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
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
            endRestartGroup.updateScope(new TimePickerKt$VerticalClockDisplay$2(timePickerState, timePickerColors, i5));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void VerticalPeriodToggle(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i6 = i9 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        if ((i5 & 384) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
        }
        if ((i6 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i6, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1047)");
            }
            startRestartGroup.startReplaceableGroup(-2030104119);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1

                    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1$1, reason: invalid class name */
                    /* loaded from: classes.dex */
                    static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
                        final /* synthetic */ List<Placeable> $items;
                        final /* synthetic */ Placeable $spacerPlaceable;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(List<? extends Placeable> list, Placeable placeable) {
                            super(1);
                            this.$items = list;
                            this.$spacerPlaceable = placeable;
                        }

                        @Override // v3.l
                        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return r2.f19517a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope.place$default(placementScope, this.$items.get(0), 0, 0, 0.0f, 4, null);
                            Placeable.PlacementScope.place$default(placementScope, this.$items.get(1), 0, this.$items.get(0).getHeight(), 0.0f, 4, null);
                            Placeable.PlacementScope.place$default(placementScope, this.$spacerPlaceable, 0, this.$items.get(0).getHeight() - (this.$spacerPlaceable.getHeight() / 2), 0.0f, 4, null);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    @p4.l
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Measurable measurable = list.get(i10);
                            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                                Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, measureScope.mo298roundToPx0680j_4(TimePickerTokens.INSTANCE.m3168getPeriodSelectorOutlineWidthD9Ej5fM()), 3, null));
                                ArrayList arrayList = new ArrayList(list.size());
                                int size2 = list.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    Measurable measurable2 = list.get(i11);
                                    if (!kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "Spacer")) {
                                        arrayList.add(measurable2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(arrayList.size());
                                int size3 = arrayList.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    arrayList2.add(((Measurable) arrayList.get(i12)).mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, Constraints.m5999getMaxHeightimpl(j5) / 2, 3, null)));
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new AnonymousClass1(arrayList2, mo4998measureBRTryo0), 4, null);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Shape value = ShapesKt.getValue(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            kotlin.jvm.internal.l0.n(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
            PeriodToggleImpl(modifier, timePickerState, timePickerColors, measurePolicy, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i6 & 14) | 3072 | (i6 & 112) | (i6 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$VerticalPeriodToggle$1(modifier, timePickerState, timePickerColors, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void VerticalTimePicker(@p4.l androidx.compose.material3.TimePickerState r16, @p4.m androidx.compose.ui.Modifier r17, @p4.m androidx.compose.material3.TimePickerColors r18, boolean r19, @p4.m androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float atan(float f5, float f6) {
        float atan2 = ((float) Math.atan2(f5, f6)) - 1.5707964f;
        return atan2 < 0.0f ? atan2 + FullCircle : atan2;
    }

    public static final float dist(float f5, float f6, int i5, int i6) {
        return (float) Math.hypot(i5 - f5, i6 - f6);
    }

    public static final Modifier drawSelector(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new TimePickerKt$drawSelector$1(timePickerState, timePickerColors));
    }

    @p4.l
    @Composable
    @ReadOnlyComposable
    /* renamed from: numberContentDescription-YKJpE6Y */
    public static final String m2486numberContentDescriptionYKJpE6Y(int i5, boolean z4, int i6, @p4.m Composer composer, int i7) {
        int m2225constructorimpl;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i7, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1724)");
        }
        if (Selection.m2172equalsimpl0(i5, Selection.Companion.m2177getMinuteJiIwxys())) {
            Strings.Companion companion = Strings.Companion;
            m2225constructorimpl = Strings.m2225constructorimpl(R.string.m3c_time_picker_minute_suffix);
        } else if (z4) {
            Strings.Companion companion2 = Strings.Companion;
            m2225constructorimpl = Strings.m2225constructorimpl(R.string.m3c_time_picker_hour_24h_suffix);
        } else {
            Strings.Companion companion3 = Strings.Companion;
            m2225constructorimpl = Strings.m2225constructorimpl(R.string.m3c_time_picker_hour_suffix);
        }
        String m2295getStringiSCLEhQ = Strings_androidKt.m2295getStringiSCLEhQ(m2225constructorimpl, new Object[]{Integer.valueOf(i6)}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2295getStringiSCLEhQ;
    }

    @p4.l
    @Composable
    @ExperimentalMaterial3Api
    public static final TimePickerState rememberTimePickerState(int i5, int i6, boolean z4, @p4.m Composer composer, int i7, int i8) {
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        composer.startReplaceableGroup(1237715277);
        boolean z8 = false;
        if ((i8 & 1) != 0) {
            i9 = 0;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i10 = 0;
        } else {
            i10 = i6;
        }
        if ((i8 & 4) != 0) {
            z5 = TimeFormat_androidKt.is24HourFormat(composer, 0);
        } else {
            z5 = z4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i7, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:556)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.Companion.Saver();
        composer.startReplaceableGroup(1737740702);
        if ((((i7 & 14) ^ 6) > 4 && composer.changed(i9)) || (i7 & 6) == 4) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((((i7 & 112) ^ 48) > 32 && composer.changed(i10)) || (i7 & 48) == 32) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z9 = z6 | z7;
        if ((((i7 & 896) ^ 384) > 256 && composer.changed(z5)) || (i7 & 384) == 256) {
            z8 = true;
        }
        boolean z10 = z9 | z8;
        Object rememberedValue = composer.rememberedValue();
        if (z10 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TimePickerKt$rememberTimePickerState$1$1(i9, i10, z5);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m3351rememberSaveable(objArr, (Saver) Saver, (String) null, (v3.a) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* renamed from: timeInputOnChange-gIWD5Rc */
    public static final void m2487timeInputOnChangegIWD5Rc(int i5, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i6, v3.l<? super TextFieldValue, r2> lVar) {
        boolean z4;
        int parseInt;
        if (kotlin.jvm.internal.l0.g(textFieldValue.getText(), textFieldValue2.getText())) {
            lVar.invoke(textFieldValue);
            return;
        }
        if (textFieldValue.getText().length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (Selection.m2172equalsimpl0(i5, Selection.Companion.m2176getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            lVar.invoke(TextFieldValue.m5779copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
            return;
        }
        try {
            if (textFieldValue.getText().length() == 3 && TextRange.m5545getStartimpl(textFieldValue.m5783getSelectiond9O1mEE()) == 1) {
                parseInt = kotlin.text.e.F(textFieldValue.getText().charAt(0));
            } else {
                parseInt = Integer.parseInt(textFieldValue.getText());
            }
            if (parseInt <= i6) {
                Selection.Companion companion = Selection.Companion;
                if (Selection.m2172equalsimpl0(i5, companion.m2176getHourJiIwxys())) {
                    timePickerState.setHour$material3_release(parseInt);
                    if (parseInt > 1 && !timePickerState.is24hour()) {
                        timePickerState.m2503setSelectioniHAOin8$material3_release(companion.m2177getMinuteJiIwxys());
                    }
                } else {
                    timePickerState.setMinute$material3_release(parseInt);
                }
                if (textFieldValue.getText().length() > 2) {
                    textFieldValue = TextFieldValue.m5779copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                }
                lVar.invoke(textFieldValue);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final u0<Float, Float> valuesForAnimation(float f5, float f6) {
        if (Math.abs(f5 - f6) <= 3.141592653589793d) {
            return new u0<>(Float.valueOf(f5), Float.valueOf(f6));
        }
        double d5 = f5;
        if (d5 > 3.141592653589793d && f6 < 3.141592653589793d) {
            f6 += FullCircle;
        } else if (d5 < 3.141592653589793d && f6 > 3.141592653589793d) {
            f5 += FullCircle;
        }
        return new u0<>(Float.valueOf(f5), Float.valueOf(f6));
    }

    @Stable
    private static final Modifier visible(Modifier modifier, boolean z4) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z4);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new VisibleModifier(z4, noInspectorInfo));
    }
}
