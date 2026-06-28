package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000¦\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010*\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010+\u001a\u0082\u0002\u00107\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108\u001a\u0014\u0010:\u001a\u00020\u001d*\u00020\u001d2\u0006\u00109\u001a\u00020\u001dH\u0002\u001aj\u0010G\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001ar\u0010R\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010Q\u001a\u009a\u0001\u0010b\u001a\u00020\u0003*\u00020S2\u0006\u0010T\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001d2\b\u0010W\u001a\u0004\u0018\u00010V2\b\u0010X\u001a\u0004\u0018\u00010V2\b\u0010Y\u001a\u0004\u0018\u00010V2\b\u0010Z\u001a\u0004\u0018\u00010V2\u0006\u0010[\u001a\u00020V2\b\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010]\u001a\u0004\u0018\u00010V2\u0006\u0010^\u001a\u00020V2\b\u0010_\u001a\u0004\u0018\u00010V2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010D\u001a\u00020/2\u0006\u0010a\u001a\u00020`2\u0006\u00106\u001a\u000205H\u0002\u001a&\u0010f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010c\u001a\u0002012\u0006\u00106\u001a\u000205H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010e\"\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i\"\u001a\u0010j\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010i\u001a\u0004\bk\u0010l\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006m"}, d2 = {"", t0.b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZFLv3/l;Lv3/p;Lv3/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", TypedValues.TransitionType.S_FROM, "substractConstraintSafely", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1156:1\n74#2:1157\n74#2:1166\n74#2:1175\n74#2:1182\n74#2:1195\n1116#3,6:1158\n1116#3,6:1167\n1116#3,6:1176\n1116#3,6:1183\n1116#3,6:1189\n658#4:1164\n646#4:1165\n658#4:1173\n646#4:1174\n78#5,11:1196\n78#5,11:1229\n91#5:1261\n78#5,11:1268\n91#5:1300\n78#5,11:1314\n91#5:1346\n78#5,11:1354\n91#5:1386\n78#5,11:1396\n91#5:1428\n78#5,11:1436\n91#5:1468\n78#5,11:1476\n91#5:1508\n91#5:1513\n456#6,8:1207\n464#6,3:1221\n456#6,8:1240\n464#6,3:1254\n467#6,3:1258\n456#6,8:1279\n464#6,3:1293\n467#6,3:1297\n456#6,8:1325\n464#6,3:1339\n467#6,3:1343\n456#6,8:1365\n464#6,3:1379\n467#6,3:1383\n456#6,8:1407\n464#6,3:1421\n467#6,3:1425\n456#6,8:1447\n464#6,3:1461\n467#6,3:1465\n456#6,8:1487\n464#6,3:1501\n467#6,3:1505\n467#6,3:1510\n3737#7,6:1215\n3737#7,6:1248\n3737#7,6:1287\n3737#7,6:1333\n3737#7,6:1373\n3737#7,6:1415\n3737#7,6:1455\n3737#7,6:1495\n69#8,5:1224\n74#8:1257\n78#8:1262\n69#8,5:1263\n74#8:1296\n78#8:1301\n68#8,6:1308\n74#8:1342\n78#8:1347\n68#8,6:1348\n74#8:1382\n78#8:1387\n68#8,6:1390\n74#8:1424\n78#8:1429\n68#8,6:1430\n74#8:1464\n78#8:1469\n68#8,6:1470\n74#8:1504\n78#8:1509\n58#9:1302\n58#9:1305\n51#9:1514\n154#10:1303\n211#10:1304\n154#10:1306\n211#10:1307\n154#10:1388\n154#10:1389\n154#10:1515\n154#10:1516\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n148#1:1157\n308#1:1166\n403#1:1175\n456#1:1182\n531#1:1195\n163#1:1158,6\n323#1:1167,6\n416#1:1176,6\n469#1:1183,6\n523#1:1189,6\n168#1:1164\n168#1:1165\n328#1:1173\n328#1:1174\n532#1:1196,11\n538#1:1229,11\n538#1:1261\n546#1:1268,11\n546#1:1300\n569#1:1314,11\n569#1:1346\n580#1:1354,11\n580#1:1386\n605#1:1396,11\n605#1:1428\n615#1:1436,11\n615#1:1468\n624#1:1476,11\n624#1:1508\n532#1:1513\n532#1:1207,8\n532#1:1221,3\n538#1:1240,8\n538#1:1254,3\n538#1:1258,3\n546#1:1279,8\n546#1:1293,3\n546#1:1297,3\n569#1:1325,8\n569#1:1339,3\n569#1:1343,3\n580#1:1365,8\n580#1:1379,3\n580#1:1383,3\n605#1:1407,8\n605#1:1421,3\n605#1:1425,3\n615#1:1447,8\n615#1:1461,3\n615#1:1465,3\n624#1:1487,8\n624#1:1501,3\n624#1:1505,3\n532#1:1510,3\n532#1:1215,6\n538#1:1248,6\n546#1:1287,6\n569#1:1333,6\n580#1:1373,6\n605#1:1415,6\n615#1:1455,6\n624#1:1495,6\n538#1:1224,5\n538#1:1257\n538#1:1262\n546#1:1263,5\n546#1:1296\n546#1:1301\n569#1:1308,6\n569#1:1342\n569#1:1347\n580#1:1348,6\n580#1:1382\n580#1:1387\n605#1:1390,6\n605#1:1424\n605#1:1429\n615#1:1430,6\n615#1:1464\n615#1:1469\n624#1:1470,6\n624#1:1504\n624#1:1509\n558#1:1302\n563#1:1305\n969#1:1514\n558#1:1303\n558#1:1304\n563#1:1306\n563#1:1307\n595#1:1388\n596#1:1389\n1147#1:1515\n1155#1:1516\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m6044constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m6044constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:108:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@p4.l java.lang.String r82, @p4.l v3.l<? super java.lang.String, kotlin.r2> r83, @p4.m androidx.compose.ui.Modifier r84, boolean r85, boolean r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r88, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r89, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r90, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r91, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r92, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r93, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r94, boolean r95, @p4.m androidx.compose.ui.text.input.VisualTransformation r96, @p4.m androidx.compose.foundation.text.KeyboardOptions r97, @p4.m androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r102, @p4.m androidx.compose.ui.graphics.Shape r103, @p4.m androidx.compose.material3.TextFieldColors r104, @p4.m androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@p4.l Modifier modifier, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m v3.q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar2, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar3, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar4, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar5, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar6, boolean z4, float f5, @p4.l v3.l<? super Size, r2> lVar, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar7, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar8, @p4.l PaddingValues paddingValues, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        PaddingValues paddingValues2;
        int i9;
        float t5;
        float t6;
        Composer startRestartGroup = composer.startRestartGroup(1408290209);
        if ((i5 & 6) == 0) {
            i7 = i5 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= startRestartGroup.changedInstance(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= startRestartGroup.changed(z4) ? 67108864 : 33554432;
        }
        if ((805306368 & i5) == 0) {
            i7 |= startRestartGroup.changed(f5) ? 536870912 : 268435456;
        }
        int i10 = i7;
        if ((i6 & 6) == 0) {
            i8 = i6 | (startRestartGroup.changedInstance(lVar) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar7) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar8) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i8 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i11 = i8;
        if ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i10, i11, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:521)");
            }
            startRestartGroup.startReplaceableGroup(-2058767641);
            boolean z5 = ((234881024 & i10) == 67108864) | ((i11 & 14) == 4) | ((1879048192 & i10) == 536870912) | ((i11 & 7168) == 2048);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(lVar, z4, f5, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            v3.a<ComposeUiNode> constructor = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
            Updater.m3271setimpl(m3264constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i12 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar7.invoke(startRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            startRestartGroup.startReplaceableGroup(1116455313);
            if (pVar3 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor2 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
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
                Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar3.invoke(startRestartGroup, Integer.valueOf((i10 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116455598);
            if (pVar4 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor3 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
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
                Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar4.invoke(startRestartGroup, Integer.valueOf((i10 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (pVar3 != null) {
                i9 = 0;
                t6 = kotlin.ranges.u.t(Dp.m6044constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(0));
                calculateStartPadding = Dp.m6044constructorimpl(t6);
            } else {
                i9 = 0;
            }
            if (pVar4 != null) {
                t5 = kotlin.ranges.u.t(Dp.m6044constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(i9));
                calculateEndPadding = Dp.m6044constructorimpl(t5);
            }
            startRestartGroup.startReplaceableGroup(1116456488);
            if (pVar5 != null) {
                Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor4 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
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
                Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                pVar5.invoke(startRestartGroup, Integer.valueOf((i10 >> 18) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116456887);
            if (pVar6 != null) {
                Modifier m557paddingqDBjuR0$default2 = PaddingKt.m557paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor5 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl5 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl5.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                pVar6.invoke(startRestartGroup, Integer.valueOf((i10 >> 21) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (pVar5 != null) {
                calculateStartPadding = Dp.m6044constructorimpl(0);
            }
            float f6 = calculateStartPadding;
            if (pVar6 != null) {
                calculateEndPadding = Dp.m6044constructorimpl(0);
            }
            Modifier m557paddingqDBjuR0$default3 = PaddingKt.m557paddingqDBjuR0$default(wrapContentHeight$default, f6, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1116457597);
            if (qVar != null) {
                qVar.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m557paddingqDBjuR0$default3), startRestartGroup, Integer.valueOf((i10 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m557paddingqDBjuR0$default3);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor6 = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor6);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3264constructorimpl6 = Updater.m3264constructorimpl(startRestartGroup);
            Updater.m3271setimpl(m3264constructorimpl6, rememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl6, currentCompositionLocalMap6, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash6 = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl6.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m3264constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m3264constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            modifierMaterializerOf6.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i10 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116458015);
            if (pVar2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(companion2, DpKt.m6087lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f5), 0.0f, 2, null), null, false, 3, null), "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor7 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor7);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl7 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl7, rememberBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl7, currentCompositionLocalMap7, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash7 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl7.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m3264constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m3264constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                modifierMaterializerOf7.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                pVar2.invoke(startRestartGroup, Integer.valueOf((i10 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-2058764244);
            if (pVar8 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2418supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor8 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3264constructorimpl8 = Updater.m3264constructorimpl(startRestartGroup);
                Updater.m3271setimpl(m3264constructorimpl8, rememberBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m3271setimpl(m3264constructorimpl8, currentCompositionLocalMap8, companion.getSetResolvedCompositionLocals());
                v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash8 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl8.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m3264constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m3264constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                modifierMaterializerOf8.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                pVar8.invoke(startRestartGroup, Integer.valueOf((i11 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
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
            endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, pVar, qVar, pVar2, pVar3, pVar4, pVar5, pVar6, z4, f5, lVar, pVar7, pVar8, paddingValues, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m2062calculateHeightmKXJcVc(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f5, long j5, float f6, PaddingValues paddingValues) {
        int T;
        int L0;
        T = kotlin.comparisons.h.T(i9, i11, i7, i8, MathHelpersKt.lerp(i10, 0, f5));
        float mo506calculateTopPaddingD9Ej5fM = paddingValues.mo506calculateTopPaddingD9Ej5fM() * f6;
        float lerp = MathHelpersKt.lerp(mo506calculateTopPaddingD9Ej5fM, Math.max(mo506calculateTopPaddingD9Ej5fM, i10 / 2.0f), f5) + T + (paddingValues.mo503calculateBottomPaddingD9Ej5fM() * f6);
        int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        L0 = kotlin.math.d.L0(lerp);
        return Math.max(m6001getMinHeightimpl, Math.max(i5, Math.max(i6, L0)) + i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m2063calculateWidthDHJA7U0(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f5, long j5, float f6, PaddingValues paddingValues) {
        int L0;
        int i12 = i7 + i8;
        int max = i5 + Math.max(i9 + i12, Math.max(i11 + i12, MathHelpersKt.lerp(i10, 0, f5))) + i6;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        L0 = kotlin.math.d.L0((i10 + (Dp.m6044constructorimpl(paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection)) * f6)) * f5);
        return Math.max(max, Math.max(L0, Constraints.m6002getMinWidthimpl(j5)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @p4.l
    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m2064outlineCutout12SF9DM(@p4.l Modifier modifier, long j5, @p4.l PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new OutlinedTextFieldKt$outlineCutout$1(j5, paddingValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f5, boolean z4, float f6, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int L0;
        int L02;
        int i7;
        float widthOrZero;
        int L03;
        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m6182getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i5 - TextFieldImplKt.heightOrZero(placeable9);
        L0 = kotlin.math.d.L0(paddingValues.mo506calculateTopPaddingD9Ej5fM() * f6);
        L02 = kotlin.math.d.L0(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f6);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f6;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i6 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            if (z4) {
                i7 = Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), heightOrZero);
            } else {
                i7 = L0;
            }
            int lerp = MathHelpersKt.lerp(i7, -(placeable6.getHeight() / 2), f5);
            if (placeable == null) {
                widthOrZero = 0.0f;
            } else {
                widthOrZero = (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f5);
            }
            L03 = kotlin.math.d.L0(widthOrZero);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, L03 + L02, lerp, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z4, heightOrZero, L0, placeable6, placeable3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i6 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z4, heightOrZero, L0, placeable6, placeable4), 0.0f, 4, null);
        }
        int widthOrZero2 = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero2, place$calculateVerticalPosition(z4, heightOrZero, L0, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, widthOrZero2, place$calculateVerticalPosition(z4, heightOrZero, L0, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z4, int i5, int i6, Placeable placeable, Placeable placeable2) {
        if (z4) {
            i6 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i5);
        }
        return Math.max(i6, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i5, int i6) {
        return i5 == Integer.MAX_VALUE ? i5 : i5 - i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cb  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r82, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r83, @p4.m androidx.compose.ui.Modifier r84, boolean r85, boolean r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r88, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r89, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r90, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r91, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r92, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r93, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r94, boolean r95, @p4.m androidx.compose.ui.text.input.VisualTransformation r96, @p4.m androidx.compose.foundation.text.KeyboardOptions r97, @p4.m androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r102, @p4.m androidx.compose.ui.graphics.Shape r103, @p4.m androidx.compose.material3.TextFieldColors r104, @p4.m androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0289  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(java.lang.String r53, v3.l r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.ui.text.TextStyle r58, v3.p r59, v3.p r60, v3.p r61, v3.p r62, v3.p r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.text.KeyboardOptions r66, androidx.compose.foundation.text.KeyboardActions r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.MutableInteractionSource r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material3.TextFieldColors r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0289  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue r53, v3.l r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.ui.text.TextStyle r58, v3.p r59, v3.p r60, v3.p r61, v3.p r62, v3.p r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.text.KeyboardOptions r66, androidx.compose.foundation.text.KeyboardActions r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.MutableInteractionSource r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material3.TextFieldColors r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
