package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;
import v3.q;

@i0(d1 = {"\u0000¦\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010%\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010'\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010(\u001aÃ\u0001\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104\u001aZ\u0010?\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020,2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001aZ\u0010F\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020,2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010>\u001a|\u0010S\u001a\u00020\u0003*\u00020G2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u001a2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010L\u001a\u0004\u0018\u00010J2\u0006\u0010M\u001a\u00020J2\b\u0010N\u001a\u0004\u0018\u00010J2\b\u0010O\u001a\u0004\u0018\u00010J2\u0006\u0010P\u001a\u00020J2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010<\u001a\u00020,2\u0006\u0010R\u001a\u00020Q2\u0006\u00102\u001a\u000201H\u0002\u001a&\u0010W\u001a\u00020\u0005*\u00020\u00052\u0006\u0010T\u001a\u00020.2\u0006\u00102\u001a\u000201H\u0000ø\u0001\u0000¢\u0006\u0004\bU\u0010V\"\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\"\u001a\u0010[\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b[\u0010Z\u001a\u0004\b\\\u0010]\"\u0014\u0010^\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/q;Lv3/p;Lv3/p;Lv3/p;ZFLv3/l;Lv3/p;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "calculateWidth-O3s9Psw", "(IIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "calculateHeight-O3s9Psw", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "borderPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "BorderId", "Ljava/lang/String;", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,984:1\n74#2:985\n74#2:995\n74#2:1003\n74#2:1013\n74#2:1030\n25#3:986\n25#3:996\n25#3:1004\n25#3:1014\n83#3,3:1021\n456#3,8:1042\n464#3,3:1056\n456#3,8:1075\n464#3,3:1089\n467#3,3:1093\n456#3,8:1114\n464#3,3:1128\n467#3,3:1132\n456#3,8:1160\n464#3,3:1174\n467#3,3:1178\n456#3,8:1200\n464#3,3:1214\n467#3,3:1218\n467#3,3:1223\n1116#4,6:987\n1116#4,6:997\n1116#4,6:1005\n1116#4,6:1015\n1116#4,6:1024\n658#5:993\n646#5:994\n658#5:1011\n646#5:1012\n79#6,11:1031\n79#6,11:1064\n92#6:1096\n79#6,11:1103\n92#6:1135\n79#6,11:1149\n92#6:1181\n79#6,11:1189\n92#6:1221\n92#6:1226\n3737#7,6:1050\n3737#7,6:1083\n3737#7,6:1122\n3737#7,6:1168\n3737#7,6:1208\n69#8,5:1059\n74#8:1092\n78#8:1097\n69#8,5:1098\n74#8:1131\n78#8:1136\n68#8,6:1143\n74#8:1177\n78#8:1182\n68#8,6:1183\n74#8:1217\n78#8:1222\n58#9:1137\n58#9:1140\n51#9:1227\n154#10:1138\n211#10:1139\n154#10:1141\n211#10:1142\n154#10:1228\n154#10:1229\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n142#1:985\n233#1:995\n344#1:1003\n435#1:1013\n502#1:1030\n154#1:986\n244#1:996\n356#1:1004\n446#1:1014\n494#1:1021,3\n503#1:1042,8\n503#1:1056,3\n514#1:1075,8\n514#1:1089,3\n514#1:1093,3\n522#1:1114,8\n522#1:1128,3\n522#1:1132,3\n550#1:1160,8\n550#1:1174,3\n550#1:1178,3\n558#1:1200,8\n558#1:1214,3\n558#1:1218,3\n503#1:1223,3\n154#1:987,6\n244#1:997,6\n356#1:1005,6\n446#1:1015,6\n494#1:1024,6\n159#1:993\n159#1:994\n361#1:1011\n361#1:1012\n503#1:1031,11\n514#1:1064,11\n514#1:1096\n522#1:1103,11\n522#1:1135\n550#1:1149,11\n550#1:1181\n558#1:1189,11\n558#1:1221\n503#1:1226\n503#1:1050,6\n514#1:1083,6\n522#1:1122,6\n550#1:1168,6\n558#1:1208,6\n514#1:1059,5\n514#1:1092\n514#1:1097\n522#1:1098,5\n522#1:1131\n522#1:1136\n550#1:1143,6\n550#1:1177\n550#1:1182\n558#1:1183,6\n558#1:1217\n558#1:1222\n534#1:1137\n541#1:1140\n815#1:1227\n535#1:1138\n534#1:1139\n541#1:1141\n541#1:1142\n973#1:1228\n981#1:1229\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {

    @l
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m6044constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = Dp.m6044constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@p4.l java.lang.String r72, @p4.l v3.l<? super java.lang.String, kotlin.r2> r73, @p4.m androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @p4.m androidx.compose.ui.text.TextStyle r77, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r78, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r79, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r80, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r81, boolean r82, @p4.m androidx.compose.ui.text.input.VisualTransformation r83, @p4.m androidx.compose.foundation.text.KeyboardOptions r84, @p4.m androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, int r88, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r89, @p4.m androidx.compose.ui.graphics.Shape r90, @p4.m androidx.compose.material.TextFieldColors r91, @p4.m androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@l Modifier modifier, @l p<? super Composer, ? super Integer, r2> pVar, @m q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, @m p<? super Composer, ? super Integer, r2> pVar2, @m p<? super Composer, ? super Integer, r2> pVar3, @m p<? super Composer, ? super Integer, r2> pVar4, boolean z4, float f5, @l v3.l<? super Size, r2> lVar, @l p<? super Composer, ? super Integer, r2> pVar5, @l PaddingValues paddingValues, @m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        float t5;
        float t6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i7 = i5 | i20;
        } else {
            i7 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i7 |= i19;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i7 |= i18;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i7 |= i17;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i7 |= i16;
        }
        if ((458752 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i7 |= i15;
        }
        if ((3670016 & i5) == 0) {
            if (startRestartGroup.changed(z4)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i7 |= i14;
        }
        if ((29360128 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i7 |= i13;
        }
        if ((234881024 & i5) == 0) {
            if (startRestartGroup.changedInstance(lVar)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i7 |= i12;
        }
        if ((1879048192 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar5)) {
                i11 = 536870912;
            } else {
                i11 = 268435456;
            }
            i7 |= i11;
        }
        int i21 = i7;
        if ((i6 & 14) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i6 | i10;
        } else {
            i8 = i6;
        }
        if ((i21 & 1533916891) == 306783378 && (i8 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i21, i8, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] objArr = {lVar, Boolean.valueOf(z4), Float.valueOf(f5), paddingValues};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i22 = 0;
            boolean z5 = false;
            for (int i23 = 4; i22 < i23; i23 = 4) {
                z5 |= startRestartGroup.changed(objArr[i22]);
                i22++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(lVar, z4, f5, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i24 = ((((i21 << 3) & 112) << 9) & 7168) | 6;
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
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i24 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar5.invoke(startRestartGroup, Integer.valueOf((i21 >> 27) & 14));
            startRestartGroup.startReplaceableGroup(1169918334);
            if (pVar3 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor2 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(then);
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
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl2.getInserting() || !l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar3.invoke(startRestartGroup, Integer.valueOf((i21 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1169918619);
            if (pVar4 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor3 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(then2);
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
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl3.getInserting() || !l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar4.invoke(startRestartGroup, Integer.valueOf((i21 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (pVar3 != null) {
                i9 = 0;
                t6 = u.t(Dp.m6044constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(0));
                calculateStartPadding = Dp.m6044constructorimpl(t6);
            } else {
                i9 = 0;
            }
            float f6 = calculateStartPadding;
            if (pVar4 != null) {
                t5 = u.t(Dp.m6044constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(i9));
                calculateEndPadding = Dp.m6044constructorimpl(t5);
            }
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion2, f6, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1169919630);
            if (qVar != null) {
                qVar.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m557paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i21 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m557paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor4 = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(then3);
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
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i21 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-614207693);
            if (pVar2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(companion2, "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                a<ComposeUiNode> constructor5 = companion.getConstructor();
                q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(layoutId);
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
                p<ComposeUiNode, Integer, r2> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (m3264constructorimpl5.getInserting() || !l0.g(m3264constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3264constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3264constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                modifierMaterializerOf5.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                pVar2.invoke(startRestartGroup, Integer.valueOf((i21 >> 9) & 14));
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
            endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, pVar, qVar, pVar2, pVar3, pVar4, z4, f5, lVar, pVar5, paddingValues, i5, i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1394calculateHeightO3s9Psw(int i5, int i6, int i7, int i8, int i9, float f5, long j5, float f6, PaddingValues paddingValues) {
        int L0;
        int max = Math.max(i7, Math.max(i9, MathHelpersKt.lerp(i8, 0, f5)));
        float mo506calculateTopPaddingD9Ej5fM = paddingValues.mo506calculateTopPaddingD9Ej5fM() * f6;
        float lerp = MathHelpersKt.lerp(mo506calculateTopPaddingD9Ej5fM, Math.max(mo506calculateTopPaddingD9Ej5fM, i8 / 2.0f), f5) + max + (paddingValues.mo503calculateBottomPaddingD9Ej5fM() * f6);
        int m6001getMinHeightimpl = Constraints.m6001getMinHeightimpl(j5);
        L0 = d.L0(lerp);
        return Math.max(m6001getMinHeightimpl, Math.max(i5, Math.max(i6, L0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1395calculateWidthO3s9Psw(int i5, int i6, int i7, int i8, int i9, float f5, long j5, float f6, PaddingValues paddingValues) {
        int L0;
        int max = i5 + Math.max(i7, Math.max(MathHelpersKt.lerp(i8, 0, f5), i9)) + i6;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        L0 = d.L0((i8 + (Dp.m6044constructorimpl(paddingValues.mo504calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo505calculateRightPaddingu2uoSUM(layoutDirection)) * f6)) * f5);
        return Math.max(max, Math.max(L0, Constraints.m6002getMinWidthimpl(j5)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @l
    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1396outlineCutout12SF9DM(@l Modifier modifier, long j5, @l PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new OutlinedTextFieldKt$outlineCutout$1(j5, paddingValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f5, boolean z4, float f6, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int L0;
        int L02;
        int i7;
        int i8;
        float widthOrZero;
        int L03;
        L0 = d.L0(paddingValues.mo506calculateTopPaddingD9Ej5fM() * f6);
        L02 = d.L0(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f6);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f6;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i5), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i6 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i5), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            if (z4) {
                i8 = Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i5);
            } else {
                i8 = L0;
            }
            int lerp = MathHelpersKt.lerp(i8, -(placeable4.getHeight() / 2), f5);
            if (placeable == null) {
                widthOrZero = 0.0f;
            } else {
                widthOrZero = (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f5);
            }
            L03 = d.L0(widthOrZero);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, L03 + L02, lerp, 0.0f, 4, null);
        }
        if (z4) {
            i7 = Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i5);
        } else {
            i7 = L0;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(i7, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z4) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i5);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(L0, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m5049place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m6182getZeronOccac(), 0.0f, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029c  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(java.lang.String r74, v3.l r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, v3.p r80, v3.p r81, v3.p r82, v3.p r83, boolean r84, androidx.compose.ui.text.input.VisualTransformation r85, androidx.compose.foundation.text.KeyboardOptions r86, androidx.compose.foundation.text.KeyboardActions r87, boolean r88, int r89, androidx.compose.foundation.interaction.MutableInteractionSource r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.runtime.Composer r93, int r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
    
        if (r0.changed(r116) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0614  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r103, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r104, @p4.m androidx.compose.ui.Modifier r105, boolean r106, boolean r107, @p4.m androidx.compose.ui.text.TextStyle r108, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r109, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r110, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r111, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r112, boolean r113, @p4.m androidx.compose.ui.text.input.VisualTransformation r114, @p4.m androidx.compose.foundation.text.KeyboardOptions r115, @p4.m androidx.compose.foundation.text.KeyboardActions r116, boolean r117, int r118, int r119, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r120, @p4.m androidx.compose.ui.graphics.Shape r121, @p4.m androidx.compose.material.TextFieldColors r122, @p4.m androidx.compose.runtime.Composer r123, int r124, int r125, int r126) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:
    
        if (r0.changed(r86) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue r73, v3.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, v3.p r79, v3.p r80, v3.p r81, v3.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
