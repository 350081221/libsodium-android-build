package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bh\u0010iJJ\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J:\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ:\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001eJä\u0001\u0010<\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;Jä\u0001\u0010B\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010=\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020$2\b\b\u0002\u0010?\u001a\u00020$2\b\b\u0002\u0010@\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010;JÄ\u0001\u0010P\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001cH\u0007¢\u0006\u0004\bP\u0010QJÙ\u0001\u0010S\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001c2\u0013\b\u0002\u0010R\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bFH\u0007¢\u0006\u0004\bS\u0010TR\u001d\u0010U\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001d\u0010Y\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR\u0014\u0010\\\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010VR\u001d\u0010]\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR\u001d\u0010_\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR\u0014\u0010a\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010VR\u0014\u0010b\u001a\u00020[8\u0006X\u0086T¢\u0006\u0006\n\u0004\bb\u0010VR\u0011\u0010e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bf\u0010d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "Lkotlin/r2;", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", "start", "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", b.f22420d, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", OutlinedTextFieldKt.BorderId, "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "", "IconOpacity", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,906:1\n135#2:907\n74#3:908\n74#3:909\n154#4:910\n154#4:911\n154#4:912\n154#4:913\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n291#1:907\n396#1:908\n454#1:909\n214#1:910\n220#1:911\n249#1:912\n255#1:913\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @l
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6044constructorimpl(56);
    private static final float MinWidth = Dp.m6044constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6044constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6044constructorimpl(2);

    private TextFieldDefaults() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1487indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6, int i5, Object obj) {
        float f7;
        float f8;
        if ((i5 & 16) != 0) {
            f7 = FocusedBorderThickness;
        } else {
            f7 = f5;
        }
        if ((i5 & 32) != 0) {
            f8 = UnfocusedBorderThickness;
        } else {
            f8 = f6;
        }
        return textFieldDefaults.m1496indicatorLinegv0btCI(modifier, z4, z5, interactionSource, textFieldColors, f7, f8);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1488outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1498outlinedTextFieldPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1489textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m1500textFieldWithLabelPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1490textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 2) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 4) != 0) {
            f7 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i5 & 8) != 0) {
            f8 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m1501textFieldWithoutLabelPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1491BorderBoxnbWgWpA(boolean r19, boolean r20, @p4.l androidx.compose.foundation.interaction.InteractionSource r21, @p4.l androidx.compose.material.TextFieldColors r22, @p4.m androidx.compose.ui.graphics.Shape r23, float r24, float r25, @p4.m androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.m1491BorderBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OutlinedTextFieldDecorationBox(@p4.l java.lang.String r68, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r69, boolean r70, boolean r71, @p4.l androidx.compose.ui.text.input.VisualTransformation r72, @p4.l androidx.compose.foundation.interaction.InteractionSource r73, boolean r74, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r75, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r76, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r77, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r78, @p4.m androidx.compose.material.TextFieldColors r79, @p4.m androidx.compose.foundation.layout.PaddingValues r80, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r81, @p4.m androidx.compose.runtime.Composer r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0225  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TextFieldDecorationBox(@p4.l java.lang.String r70, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r71, boolean r72, boolean r73, @p4.l androidx.compose.ui.text.input.VisualTransformation r74, @p4.l androidx.compose.foundation.interaction.InteractionSource r75, boolean r76, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r77, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r78, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r79, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r80, @p4.m androidx.compose.material.TextFieldColors r81, @p4.m androidx.compose.foundation.layout.PaddingValues r82, @p4.m androidx.compose.runtime.Composer r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, androidx.compose.material.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1492getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1493getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1494getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @h(name = "getOutlinedTextFieldShape")
    @l
    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(@m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i5, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @h(name = "getTextFieldShape")
    @l
    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(@m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i5, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:233)");
        }
        CornerBasedShape copy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1495getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @l
    @ExperimentalMaterialApi
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m1496indicatorLinegv0btCI(@l Modifier modifier, boolean z4, boolean z5, @l InteractionSource interactionSource, @l TextFieldColors textFieldColors, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1(z4, z5, interactionSource, textFieldColors, f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TextFieldDefaults$indicatorLine$2(z4, z5, interactionSource, textFieldColors, f5, f6));
    }

    @l
    @Composable
    /* renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1497outlinedTextFieldColorsdx8h9Zs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, @m Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(1762667317);
        long m3733copywmQWz5c$default = (i8 & 1) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3733copywmQWz5c$default2 = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3769getTransparent0d7_KjU = (i8 & 4) != 0 ? Color.Companion.m3769getTransparent0d7_KjU() : j7;
        long m1275getPrimary0d7_KjU = (i8 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU() : j8;
        long m1269getError0d7_KjU = (i8 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j9;
        long m3733copywmQWz5c$default3 = (i8 & 32) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3733copywmQWz5c$default4 = (i8 & 64) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m3733copywmQWz5c$default5 = (i8 & 128) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m1269getError0d7_KjU2 = (i8 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j13;
        long m3733copywmQWz5c$default6 = (i8 & 512) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3733copywmQWz5c$default7 = (i8 & 1024) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j26 = (i8 & 2048) != 0 ? m3733copywmQWz5c$default6 : j16;
        long m3733copywmQWz5c$default8 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3733copywmQWz5c$default9 = (i8 & 8192) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1269getError0d7_KjU3 = (i8 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j19;
        long m3733copywmQWz5c$default10 = (32768 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m3733copywmQWz5c$default11 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3733copywmQWz5c$default12 = (131072 & i8) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m1269getError0d7_KjU4 = (262144 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j23;
        long m3733copywmQWz5c$default13 = (524288 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m3733copywmQWz5c$default14 = (i8 & 1048576) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i5, i6, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m3733copywmQWz5c$default, m3733copywmQWz5c$default2, m1275getPrimary0d7_KjU, m1269getError0d7_KjU, m3733copywmQWz5c$default3, m3733copywmQWz5c$default4, m1269getError0d7_KjU2, m3733copywmQWz5c$default5, m3733copywmQWz5c$default6, m3733copywmQWz5c$default7, j26, m3733copywmQWz5c$default8, m3733copywmQWz5c$default9, m1269getError0d7_KjU3, m3769getTransparent0d7_KjU, m3733copywmQWz5c$default10, m3733copywmQWz5c$default11, m3733copywmQWz5c$default12, m1269getError0d7_KjU4, m3733copywmQWz5c$default13, m3733copywmQWz5c$default14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @l
    @ExperimentalMaterialApi
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1498outlinedTextFieldPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }

    @l
    @Composable
    /* renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m1499textFieldColorsdx8h9Zs(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, @m Composer composer, int i5, int i6, int i7, int i8) {
        composer.startReplaceableGroup(231892599);
        long m3733copywmQWz5c$default = (i8 & 1) != 0 ? Color.m3733copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m3744unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long m3733copywmQWz5c$default2 = (i8 & 2) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m3733copywmQWz5c$default3 = (i8 & 4) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long m1275getPrimary0d7_KjU = (i8 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU() : j8;
        long m1269getError0d7_KjU = (i8 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j9;
        long m3733copywmQWz5c$default4 = (i8 & 32) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m3733copywmQWz5c$default5 = (i8 & 64) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long m3733copywmQWz5c$default6 = (i8 & 128) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m1269getError0d7_KjU2 = (i8 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j13;
        long m3733copywmQWz5c$default7 = (i8 & 512) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m3733copywmQWz5c$default8 = (i8 & 1024) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long j26 = (i8 & 2048) != 0 ? m3733copywmQWz5c$default7 : j16;
        long m3733copywmQWz5c$default9 = (i8 & 4096) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m3733copywmQWz5c$default10 = (i8 & 8192) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long m1269getError0d7_KjU3 = (i8 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j19;
        long m3733copywmQWz5c$default11 = (32768 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1275getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m3733copywmQWz5c$default12 = (65536 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m3733copywmQWz5c$default13 = (131072 & i8) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m1269getError0d7_KjU4 = (262144 & i8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1269getError0d7_KjU() : j23;
        long m3733copywmQWz5c$default14 = (524288 & i8) != 0 ? Color.m3733copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1274getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m3733copywmQWz5c$default15 = (i8 & 1048576) != 0 ? Color.m3733copywmQWz5c$default(m3733copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i5, i6, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        DefaultTextFieldColors defaultTextFieldColors = new DefaultTextFieldColors(m3733copywmQWz5c$default, m3733copywmQWz5c$default2, m1275getPrimary0d7_KjU, m1269getError0d7_KjU, m3733copywmQWz5c$default4, m3733copywmQWz5c$default5, m1269getError0d7_KjU2, m3733copywmQWz5c$default6, m3733copywmQWz5c$default7, m3733copywmQWz5c$default8, j26, m3733copywmQWz5c$default9, m3733copywmQWz5c$default10, m1269getError0d7_KjU3, m3733copywmQWz5c$default3, m3733copywmQWz5c$default11, m3733copywmQWz5c$default12, m3733copywmQWz5c$default13, m1269getError0d7_KjU4, m3733copywmQWz5c$default14, m3733copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldColors;
    }

    @l
    @ExperimentalMaterialApi
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1500textFieldWithLabelPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f7, f6, f8);
    }

    @l
    @ExperimentalMaterialApi
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1501textFieldWithoutLabelPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }
}
