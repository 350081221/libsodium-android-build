package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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

@kotlin.i0(d1 = {"\u0000 \u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010*\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010+\u001aî\u0001\u00105\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106\u001a\u0014\u00108\u001a\u00020\u001d*\u00020\u001d2\u0006\u00107\u001a\u00020\u001dH\u0002\u001aR\u0010D\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010A\u001a\u00020@H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001ar\u0010P\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010A\u001a\u00020@2\u0006\u0010M\u001a\u00020/2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u009a\u0001\u0010`\u001a\u00020\u0003*\u00020Q2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\b\u0010Y\u001a\u0004\u0018\u00010T2\b\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010[\u001a\u0004\u0018\u00010T2\u0006\u0010\\\u001a\u00020T2\b\u0010]\u001a\u0004\u0018\u00010T2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/2\u0006\u0010M\u001a\u00020/H\u0002\u001a\u0080\u0001\u0010b\u001a\u00020\u0003*\u00020Q2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020T2\b\u0010W\u001a\u0004\u0018\u00010T2\b\u0010X\u001a\u0004\u0018\u00010T2\b\u0010Y\u001a\u0004\u0018\u00010T2\b\u0010Z\u001a\u0004\u0018\u00010T2\b\u0010[\u001a\u0004\u0018\u00010T2\u0006\u0010\\\u001a\u00020T2\b\u0010]\u001a\u0004\u0018\u00010T2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010M\u001a\u00020/2\u0006\u00104\u001a\u000203H\u0002\u001a\u0014\u0010e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010d\u001a\u00020cH\u0000\"\u001a\u0010g\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"", t0.b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "TextField", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZFLv3/p;Lv3/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", TypedValues.TransitionType.S_FROM, "substractConstraintSafely", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "calculateWidth", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithLabel", "textPlaceable", "placeWithoutLabel", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "Landroidx/compose/ui/unit/Dp;", "TextFieldWithLabelVerticalPadding", "F", "getTextFieldWithLabelVerticalPadding", "()F", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1164:1\n74#2:1165\n74#2:1174\n74#2:1183\n74#2:1190\n74#2:1203\n1116#3,6:1166\n1116#3,6:1175\n1116#3,6:1184\n1116#3,6:1191\n1116#3,6:1197\n658#4:1172\n646#4:1173\n658#4:1181\n646#4:1182\n78#5,11:1204\n78#5,11:1237\n91#5:1269\n78#5,11:1276\n91#5:1308\n78#5,11:1322\n91#5:1354\n78#5,11:1362\n91#5:1394\n78#5,11:1402\n91#5:1434\n78#5,11:1444\n91#5:1476\n78#5,11:1484\n91#5:1516\n91#5:1521\n456#6,8:1215\n464#6,3:1229\n456#6,8:1248\n464#6,3:1262\n467#6,3:1266\n456#6,8:1287\n464#6,3:1301\n467#6,3:1305\n456#6,8:1333\n464#6,3:1347\n467#6,3:1351\n456#6,8:1373\n464#6,3:1387\n467#6,3:1391\n456#6,8:1413\n464#6,3:1427\n467#6,3:1431\n456#6,8:1455\n464#6,3:1469\n467#6,3:1473\n456#6,8:1495\n464#6,3:1509\n467#6,3:1513\n467#6,3:1518\n3737#7,6:1223\n3737#7,6:1256\n3737#7,6:1295\n3737#7,6:1341\n3737#7,6:1381\n3737#7,6:1421\n3737#7,6:1463\n3737#7,6:1503\n69#8,5:1232\n74#8:1265\n78#8:1270\n69#8,5:1271\n74#8:1304\n78#8:1309\n68#8,6:1316\n74#8:1350\n78#8:1355\n68#8,6:1356\n74#8:1390\n78#8:1395\n68#8,6:1396\n74#8:1430\n78#8:1435\n68#8,6:1438\n74#8:1472\n78#8:1477\n68#8,6:1478\n74#8:1512\n78#8:1517\n58#9:1310\n58#9:1313\n51#9:1522\n92#9:1523\n154#10:1311\n211#10:1312\n154#10:1314\n211#10:1315\n154#10:1436\n154#10:1437\n154#10:1524\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n175#1:1165\n321#1:1174\n401#1:1183\n454#1:1190\n521#1:1203\n190#1:1166,6\n336#1:1175,6\n414#1:1184,6\n467#1:1191,6\n518#1:1197,6\n195#1:1172\n195#1:1173\n341#1:1181\n341#1:1182\n522#1:1204,11\n531#1:1237,11\n531#1:1269\n541#1:1276,11\n541#1:1308\n566#1:1322,11\n566#1:1354\n577#1:1362,11\n577#1:1394\n589#1:1402,11\n589#1:1434\n611#1:1444,11\n611#1:1476\n622#1:1484,11\n622#1:1516\n522#1:1521\n522#1:1215,8\n522#1:1229,3\n531#1:1248,8\n531#1:1262,3\n531#1:1266,3\n541#1:1287,8\n541#1:1301,3\n541#1:1305,3\n566#1:1333,8\n566#1:1347,3\n566#1:1351,3\n577#1:1373,8\n577#1:1387,3\n577#1:1391,3\n589#1:1413,8\n589#1:1427,3\n589#1:1431,3\n611#1:1455,8\n611#1:1469,3\n611#1:1473,3\n622#1:1495,8\n622#1:1509,3\n622#1:1513,3\n522#1:1518,3\n522#1:1223,6\n531#1:1256,6\n541#1:1295,6\n566#1:1341,6\n577#1:1381,6\n589#1:1421,6\n611#1:1463,6\n622#1:1503,6\n531#1:1232,5\n531#1:1265\n531#1:1270\n541#1:1271,5\n541#1:1304\n541#1:1309\n566#1:1316,6\n566#1:1350\n566#1:1355\n577#1:1356,6\n577#1:1390\n577#1:1395\n589#1:1396,6\n589#1:1430\n589#1:1435\n611#1:1438,6\n611#1:1472\n611#1:1477\n622#1:1478,6\n622#1:1512\n622#1:1517\n555#1:1310\n560#1:1313\n978#1:1522\n982#1:1523\n555#1:1311\n555#1:1312\n560#1:1314\n560#1:1315\n602#1:1436\n603#1:1437\n1163#1:1524\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m6044constructorimpl(8);

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
    public static final void TextField(@p4.l java.lang.String r82, @p4.l v3.l<? super java.lang.String, kotlin.r2> r83, @p4.m androidx.compose.ui.Modifier r84, boolean r85, boolean r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r88, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r89, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r90, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r91, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r92, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r93, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r94, boolean r95, @p4.m androidx.compose.ui.text.input.VisualTransformation r96, @p4.m androidx.compose.foundation.text.KeyboardOptions r97, @p4.m androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r102, @p4.m androidx.compose.ui.graphics.Shape r103, @p4.m androidx.compose.material3.TextFieldColors r104, @p4.m androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@p4.l Modifier modifier, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar2, @p4.m v3.q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar3, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar4, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar5, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar6, boolean z4, float f5, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar7, @p4.m v3.p<? super Composer, ? super Integer, r2> pVar8, @p4.l PaddingValues paddingValues, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        float f6;
        float t5;
        float t6;
        Composer startRestartGroup = composer.startRestartGroup(-1830307184);
        if ((i5 & 6) == 0) {
            i7 = i5 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
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
            i8 = i6 | (startRestartGroup.changedInstance(pVar7) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= startRestartGroup.changedInstance(pVar8) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i8 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        int i11 = i8;
        if ((i10 & 306783379) == 306783378 && (i11 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i10, i11, "androidx.compose.material3.TextFieldLayout (TextField.kt:516)");
            }
            startRestartGroup.startReplaceableGroup(243139239);
            boolean z5 = ((1879048192 & i10) == 536870912) | ((234881024 & i10) == 67108864) | ((i11 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z4, f5, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
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
            Updater.m3271setimpl(m3264constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i12 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar7.invoke(startRestartGroup, Integer.valueOf(i11 & 14));
            startRestartGroup.startReplaceableGroup(-95271705);
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
            startRestartGroup.startReplaceableGroup(-95271370);
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
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
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
            startRestartGroup.startReplaceableGroup(-95270430);
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
            startRestartGroup.startReplaceableGroup(-95270031);
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
            startRestartGroup.startReplaceableGroup(-95269633);
            if (pVar2 != null) {
                Modifier m557paddingqDBjuR0$default3 = PaddingKt.m557paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, "Label"), DpKt.m6087lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f5), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                v3.a<ComposeUiNode> constructor6 = companion.getConstructor();
                v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default3);
                f6 = calculateStartPadding;
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
                pVar2.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f6 = calculateStartPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m590heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            float m6044constructorimpl = pVar5 == null ? f6 : Dp.m6044constructorimpl(0);
            if (pVar6 != null) {
                calculateEndPadding = Dp.m6044constructorimpl(0);
            }
            Modifier m557paddingqDBjuR0$default4 = PaddingKt.m557paddingqDBjuR0$default(wrapContentHeight$default, m6044constructorimpl, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(-95268909);
            if (qVar != null) {
                qVar.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m557paddingqDBjuR0$default4), startRestartGroup, Integer.valueOf((i10 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m557paddingqDBjuR0$default4);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor7 = companion.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(then3);
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
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i10 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(243142996);
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
                pVar8.invoke(startRestartGroup, Integer.valueOf((i11 >> 3) & 14));
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
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z4, f5, pVar7, pVar8, paddingValues, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m2448calculateHeightmKXJcVc(int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f5, long j5, float f6, PaddingValues paddingValues) {
        boolean z4;
        int T;
        int L0;
        if (i6 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float m6044constructorimpl = Dp.m6044constructorimpl(paddingValues.mo506calculateTopPaddingD9Ej5fM() + paddingValues.mo503calculateBottomPaddingD9Ej5fM()) * f6;
        if (z4) {
            m6044constructorimpl = MathHelpersKt.lerp(Dp.m6044constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f6, m6044constructorimpl, f5);
        }
        T = kotlin.comparisons.h.T(i5, i11, i9, i10, MathHelpersKt.lerp(i6, 0, f5));
        int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        L0 = kotlin.math.d.L0(m6044constructorimpl + MathHelpersKt.lerp(0, i6, f5) + T);
        return Math.max(m6001getMinHeightimpl, Math.max(i7, Math.max(i8, L0)) + i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2449calculateWidthyeHjK3Y(int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j5) {
        int i12 = i7 + i8;
        return Math.max(i5 + Math.max(i9 + i12, Math.max(i11 + i12, i10)) + i6, Constraints.m6002getMinWidthimpl(j5));
    }

    @p4.l
    public static final Modifier drawIndicatorLine(@p4.l Modifier modifier, @p4.l BorderStroke borderStroke) {
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(borderStroke.m227getWidthD9Ej5fM(), borderStroke));
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z4, int i7, int i8, float f5, float f6) {
        int L0;
        int L02;
        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m6182getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i6 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i5 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z4) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero);
            } else {
                L0 = kotlin.math.d.L0(TextFieldImplKt.getTextFieldPadding() * f6);
            }
            L02 = kotlin.math.d.L0((L0 - i7) * f5);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), L0 - L02, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i8, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i5 - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i8, 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, i8, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, i8, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z4, float f5, PaddingValues paddingValues) {
        int L0;
        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m6182getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i6 - TextFieldImplKt.heightOrZero(placeable8);
        L0 = kotlin.math.d.L0(paddingValues.mo506calculateTopPaddingD9Ej5fM() * f5);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i5 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z4, heightOrZero, L0, placeable5), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i5 - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z4, heightOrZero, L0, placeable6), 0.0f, 4, null);
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z4, heightOrZero, L0, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(z4, heightOrZero, L0, placeable2), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z4, int i5, int i6, Placeable placeable) {
        return z4 ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i5) : i6;
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
    public static final void TextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r82, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r83, @p4.m androidx.compose.ui.Modifier r84, boolean r85, boolean r86, @p4.m androidx.compose.ui.text.TextStyle r87, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r88, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r89, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r90, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r91, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r92, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r93, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r94, boolean r95, @p4.m androidx.compose.ui.text.input.VisualTransformation r96, @p4.m androidx.compose.foundation.text.KeyboardOptions r97, @p4.m androidx.compose.foundation.text.KeyboardActions r98, boolean r99, int r100, int r101, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r102, @p4.m androidx.compose.ui.graphics.Shape r103, @p4.m androidx.compose.material3.TextFieldColors r104, @p4.m androidx.compose.runtime.Composer r105, int r106, int r107, int r108, int r109) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
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
    public static final /* synthetic */ void TextField(java.lang.String r53, v3.l r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.ui.text.TextStyle r58, v3.p r59, v3.p r60, v3.p r61, v3.p r62, v3.p r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.text.KeyboardOptions r66, androidx.compose.foundation.text.KeyboardActions r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.MutableInteractionSource r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material3.TextFieldColors r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
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
    public static final /* synthetic */ void TextField(androidx.compose.ui.text.input.TextFieldValue r53, v3.l r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.ui.text.TextStyle r58, v3.p r59, v3.p r60, v3.p r61, v3.p r62, v3.p r63, boolean r64, androidx.compose.ui.text.input.VisualTransformation r65, androidx.compose.foundation.text.KeyboardOptions r66, androidx.compose.foundation.text.KeyboardActions r67, boolean r68, int r69, int r70, androidx.compose.foundation.interaction.MutableInteractionSource r71, androidx.compose.ui.graphics.Shape r72, androidx.compose.material3.TextFieldColors r73, androidx.compose.runtime.Composer r74, int r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
