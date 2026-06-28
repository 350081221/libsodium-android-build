package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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

@i0(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010%\u001a\u0093\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010'\u001a\u0089\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020&2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010(\u001a\u009c\u0001\u00100\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010*\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101\u001aB\u0010;\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001a2\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001aZ\u0010E\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\u0006\u0010B\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001at\u0010Q\u001a\u00020\u0003*\u00020F2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010I2\b\u0010L\u001a\u0004\u0018\u00010I2\b\u0010M\u001a\u0004\u0018\u00010I2\b\u0010N\u001a\u0004\u0018\u00010I2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020,2\u0006\u0010B\u001a\u00020,H\u0002\u001aZ\u0010S\u001a\u00020\u0003*\u00020F2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010I2\b\u0010M\u001a\u0004\u0018\u00010I2\b\u0010N\u001a\u0004\u0018\u00010I2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010B\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002\u001a\u0014\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010U\u001a\u00020TH\u0000\"\u001a\u0010X\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u001a\u0010\\\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\"\u001a\u0010^\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006`"}, d2 = {"", b.f22420d, "Lkotlin/Function1;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material/TextFieldColors;", "colors", "TextField", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lv3/l;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;Lv3/q;Lv3/p;Lv3/p;ZFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "calculateWidth", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "calculateHeight-O3s9Psw", "(IZIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "height", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "placeWithLabel", "textPlaceable", "placeWithoutLabel", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "Landroidx/compose/ui/unit/Dp;", "FirstBaselineOffset", "F", "getFirstBaselineOffset", "()F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,940:1\n74#2:941\n74#2:951\n74#2:959\n74#2:969\n74#2:987\n25#3:942\n25#3:952\n25#3:960\n25#3:970\n67#3,3:977\n66#3:980\n456#3,8:999\n464#3,3:1013\n456#3,8:1032\n464#3,3:1046\n467#3,3:1050\n456#3,8:1071\n464#3,3:1085\n467#3,3:1089\n456#3,8:1117\n464#3,3:1131\n467#3,3:1135\n456#3,8:1157\n464#3,3:1171\n467#3,3:1175\n467#3,3:1180\n1116#4,6:943\n1116#4,6:953\n1116#4,6:961\n1116#4,6:971\n1116#4,6:981\n658#5:949\n646#5:950\n658#5:967\n646#5:968\n79#6,11:988\n79#6,11:1021\n92#6:1053\n79#6,11:1060\n92#6:1092\n79#6,11:1106\n92#6:1138\n79#6,11:1146\n92#6:1178\n92#6:1183\n3737#7,6:1007\n3737#7,6:1040\n3737#7,6:1079\n3737#7,6:1125\n3737#7,6:1165\n69#8,5:1016\n74#8:1049\n78#8:1054\n69#8,5:1055\n74#8:1088\n78#8:1093\n68#8,6:1100\n74#8:1134\n78#8:1139\n68#8,6:1140\n74#8:1174\n78#8:1179\n58#9:1094\n58#9:1097\n154#10:1095\n211#10:1096\n154#10:1098\n211#10:1099\n154#10:1184\n154#10:1185\n154#10:1186\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n167#1:941\n244#1:951\n357#1:959\n433#1:969\n491#1:987\n179#1:942\n255#1:952\n369#1:960\n444#1:970\n488#1:977,3\n488#1:980\n492#1:999,8\n492#1:1013,3\n496#1:1032,8\n496#1:1046,3\n496#1:1050,3\n504#1:1071,8\n504#1:1085,3\n504#1:1089,3\n532#1:1117,8\n532#1:1131,3\n532#1:1135,3\n534#1:1157,8\n534#1:1171,3\n534#1:1175,3\n492#1:1180,3\n179#1:943,6\n255#1:953,6\n369#1:961,6\n444#1:971,6\n488#1:981,6\n185#1:949\n185#1:950\n374#1:967\n374#1:968\n492#1:988,11\n496#1:1021,11\n496#1:1053\n504#1:1060,11\n504#1:1092\n532#1:1106,11\n532#1:1138\n534#1:1146,11\n534#1:1178\n492#1:1183\n492#1:1007,6\n496#1:1040,6\n504#1:1079,6\n532#1:1125,6\n534#1:1165,6\n496#1:1016,5\n496#1:1049\n496#1:1054\n504#1:1055,5\n504#1:1088\n504#1:1093\n532#1:1100,6\n532#1:1134\n532#1:1139\n534#1:1140,6\n534#1:1174\n534#1:1179\n516#1:1094\n523#1:1097\n517#1:1095\n516#1:1096\n523#1:1098\n523#1:1099\n932#1:1184\n935#1:1185\n939#1:1186\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m6044constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m6044constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m6044constructorimpl(2);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
    
        if (r0.changed(r116) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
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
    /* JADX WARN: Removed duplicated region for block: B:99:0x062d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(@p4.l java.lang.String r103, @p4.l v3.l<? super java.lang.String, kotlin.r2> r104, @p4.m androidx.compose.ui.Modifier r105, boolean r106, boolean r107, @p4.m androidx.compose.ui.text.TextStyle r108, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r109, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r110, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r111, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r112, boolean r113, @p4.m androidx.compose.ui.text.input.VisualTransformation r114, @p4.m androidx.compose.foundation.text.KeyboardOptions r115, @p4.m androidx.compose.foundation.text.KeyboardActions r116, boolean r117, int r118, int r119, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r120, @p4.m androidx.compose.ui.graphics.Shape r121, @p4.m androidx.compose.material.TextFieldColors r122, @p4.m androidx.compose.runtime.Composer r123, int r124, int r125, int r126) {
        /*
            Method dump skipped, instructions count: 1609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@l Modifier modifier, @l p<? super Composer, ? super Integer, r2> pVar, @m p<? super Composer, ? super Integer, r2> pVar2, @m q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, @m p<? super Composer, ? super Integer, r2> pVar3, @m p<? super Composer, ? super Integer, r2> pVar4, boolean z4, float f5, @l PaddingValues paddingValues, @m Composer composer, int i5) {
        int i6;
        int i7;
        float t5;
        float t6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i5 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i6 = i16 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 112) == 0) {
            if (startRestartGroup.changedInstance(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i6 |= i15;
        }
        if ((i5 & 896) == 0) {
            if (startRestartGroup.changedInstance(pVar2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i6 |= i14;
        }
        if ((i5 & 7168) == 0) {
            if (startRestartGroup.changedInstance(qVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i6 |= i13;
        }
        if ((57344 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar3)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i6 |= i12;
        }
        if ((458752 & i5) == 0) {
            if (startRestartGroup.changedInstance(pVar4)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i6 |= i11;
        }
        if ((3670016 & i5) == 0) {
            if (startRestartGroup.changed(z4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i6 |= i10;
        }
        if ((29360128 & i5) == 0) {
            if (startRestartGroup.changed(f5)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i6 |= i9;
        }
        if ((234881024 & i5) == 0) {
            if (startRestartGroup.changed(paddingValues)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i6 |= i8;
        }
        if ((191739611 & i6) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i6, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:486)");
            }
            Boolean valueOf = Boolean.valueOf(z4);
            Float valueOf2 = Float.valueOf(f5);
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(paddingValues);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z4, f5, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i17 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
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
            p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m3264constructorimpl.getInserting() || !l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i17 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(254819939);
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
                pVar3.invoke(startRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254820224);
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
                pVar4.invoke(startRestartGroup, Integer.valueOf((i6 >> 15) & 14));
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
                i7 = 0;
                t6 = u.t(Dp.m6044constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(0));
                calculateStartPadding = Dp.m6044constructorimpl(t6);
            } else {
                i7 = 0;
            }
            float f6 = calculateStartPadding;
            if (pVar4 != null) {
                t5 = u.t(Dp.m6044constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6044constructorimpl(i7));
                calculateEndPadding = Dp.m6044constructorimpl(t5);
            }
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(companion2, f6, 0.0f, calculateEndPadding, 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(254821235);
            if (qVar != null) {
                qVar.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m557paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i6 >> 6) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(254821364);
            if (pVar2 != null) {
                Modifier then3 = LayoutIdKt.layoutId(companion2, "Label").then(m557paddingqDBjuR0$default);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
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
                pVar2.invoke(startRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then4 = LayoutIdKt.layoutId(companion2, "TextField").then(m557paddingqDBjuR0$default);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            a<ComposeUiNode> constructor5 = companion.getConstructor();
            q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(then4);
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
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i6 >> 3) & 14));
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
            endRestartGroup.updateScope(new TextFieldKt$TextFieldLayout$2(modifier, pVar, pVar2, qVar, pVar3, pVar4, z4, f5, paddingValues, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1510calculateHeightO3s9Psw(int i5, boolean z4, int i6, int i7, int i8, int i9, long j5, float f5, PaddingValues paddingValues) {
        float f6;
        int L0;
        float f7 = TextFieldTopPadding * f5;
        float mo506calculateTopPaddingD9Ej5fM = paddingValues.mo506calculateTopPaddingD9Ej5fM() * f5;
        float mo503calculateBottomPaddingD9Ej5fM = paddingValues.mo503calculateBottomPaddingD9Ej5fM() * f5;
        int max = Math.max(i5, i9);
        if (z4) {
            f6 = i6 + f7 + max + mo503calculateBottomPaddingD9Ej5fM;
        } else {
            f6 = mo506calculateTopPaddingD9Ej5fM + max + mo503calculateBottomPaddingD9Ej5fM;
        }
        L0 = d.L0(f6);
        return Math.max(L0, Math.max(Math.max(i7, i8), Constraints.m6001getMinHeightimpl(j5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1511calculateWidthVsPV1Ek(int i5, int i6, int i7, int i8, int i9, long j5) {
        return Math.max(i5 + Math.max(i7, Math.max(i8, i9)) + i6, Constraints.m6002getMinWidthimpl(j5));
    }

    @l
    public static final Modifier drawIndicatorLine(@l Modifier modifier, @l BorderStroke borderStroke) {
        return DrawModifierKt.drawWithContent(modifier, new TextFieldKt$drawIndicatorLine$1(borderStroke.m227getWidthD9Ej5fM(), borderStroke));
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z4, int i7, int i8, float f5, float f6) {
        int L0;
        int L02;
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i6), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i5 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i6), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z4) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i6);
            } else {
                L0 = d.L0(TextFieldImplKt.getTextFieldPadding() * f6);
            }
            L02 = d.L0((L0 - i7) * f5);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), L0 - L02, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i8, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i8, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i5, int i6, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z4, float f5, PaddingValues paddingValues) {
        int L0;
        int i7;
        L0 = d.L0(paddingValues.mo506calculateTopPaddingD9Ej5fM() * f5);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i5 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i6), 0.0f, 4, null);
        }
        if (z4) {
            i7 = Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i6);
        } else {
            i7 = L0;
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), i7, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z4) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i6);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), L0, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:
    
        if (r0.changed(r86) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0465  */
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
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03eb  */
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
    /* JADX WARN: Removed duplicated region for block: B:91:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0296  */
    @androidx.compose.runtime.Composable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TextField(java.lang.String r73, v3.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, v3.p r79, v3.p r80, v3.p r81, v3.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01af, code lost:
    
        if (r0.changed(r116) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
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
    /* JADX WARN: Removed duplicated region for block: B:99:0x0608  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(@p4.l androidx.compose.ui.text.input.TextFieldValue r103, @p4.l v3.l<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.r2> r104, @p4.m androidx.compose.ui.Modifier r105, boolean r106, boolean r107, @p4.m androidx.compose.ui.text.TextStyle r108, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r109, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r110, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r111, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r112, boolean r113, @p4.m androidx.compose.ui.text.input.VisualTransformation r114, @p4.m androidx.compose.foundation.text.KeyboardOptions r115, @p4.m androidx.compose.foundation.text.KeyboardActions r116, boolean r117, int r118, int r119, @p4.m androidx.compose.foundation.interaction.MutableInteractionSource r120, @p4.m androidx.compose.ui.graphics.Shape r121, @p4.m androidx.compose.material.TextFieldColors r122, @p4.m androidx.compose.runtime.Composer r123, int r124, int r125, int r126) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final /* synthetic */ void TextField(androidx.compose.ui.text.input.TextFieldValue r73, v3.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, v3.p r79, v3.p r80, v3.p r81, v3.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, v3.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, v3.p, v3.p, v3.p, v3.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
