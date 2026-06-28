package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bl\u0010mJP\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u001aJÂ\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b2\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010(\u001a\u00020\u001b2\b\b\u0002\u0010)\u001a\u00020\u001b2\b\b\u0002\u0010*\u001a\u00020\u001b2\b\b\u0002\u0010+\u001a\u00020\u001b2\b\b\u0002\u0010,\u001a\u00020\u001b2\b\b\u0002\u0010-\u001a\u00020\u001b2\b\b\u0002\u0010.\u001a\u00020\u001b2\b\b\u0002\u0010/\u001a\u00020\u001b2\b\b\u0002\u00100\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020\u001b2\b\b\u0002\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020\u001b2\b\b\u0002\u00104\u001a\u00020\u001b2\b\b\u0002\u00105\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u00020\u001b2\b\b\u0002\u00108\u001a\u00020\u001b2\b\b\u0002\u00109\u001a\u00020\u001b2\b\b\u0002\u0010:\u001a\u00020\u001b2\b\b\u0002\u0010;\u001a\u00020\u001b2\b\b\u0002\u0010<\u001a\u00020\u001b2\b\b\u0002\u0010=\u001a\u00020\u001b2\b\b\u0002\u0010>\u001a\u00020\u001b2\b\b\u0002\u0010?\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\u001b2\b\b\u0002\u0010A\u001a\u00020\u001b2\b\b\u0002\u0010B\u001a\u00020\u001b2\b\b\u0002\u0010C\u001a\u00020\u001b2\b\b\u0002\u0010D\u001a\u00020\u001b2\b\b\u0002\u0010E\u001a\u00020\u001b2\b\b\u0002\u0010F\u001a\u00020\u001b2\b\b\u0002\u0010G\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u009e\u0002\u0010Z\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020J2\u0011\u0010N\u001a\r\u0012\u0004\u0012\u00020\u000e0L¢\u0006\u0002\bM2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020P2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010R\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010T\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010U\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010V\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010W\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010L¢\u0006\u0002\bM2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00162\u0013\b\u0002\u0010Y\u001a\r\u0012\u0004\u0012\u00020\u000e0L¢\u0006\u0002\bMH\u0007¢\u0006\u0004\bZ\u0010[R\u001d\u0010\\\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010`\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010_R\u001d\u0010b\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_R\u001d\u0010d\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010]\u001a\u0004\be\u0010_R\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0018\u0010k\u001a\u00020\u0007*\u00020h8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "Lkotlin/r2;", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "start", "top", "end", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", t0.b.f22420d, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "container", "DecorationBox", "(Ljava/lang/String;Lv3/p;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "MinHeight", "F", "getMinHeight-D9Ej5fM", "()F", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getFocusedBorderThickness-D9Ej5fM", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "defaultOutlinedTextFieldColors", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2400:1\n74#2:2401\n154#3:2402\n154#3:2403\n154#3:2404\n154#3:2405\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1655#1:2401\n1416#1:2402\n1422#1:2403\n1427#1:2404\n1432#1:2405\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;

    @p4.l
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m6044constructorimpl(56);
    private static final float MinWidth = Dp.m6044constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6044constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6044constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2052contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f5, float f6, float f7, float f8, int i5, Object obj) {
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
        return outlinedTextFieldDefaults.m2055contentPaddinga9UjIt4(f5, f6, f7, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        if ((r29 & 64) != 0) goto L115;
     */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2053ContainerBoxnbWgWpA(boolean r20, boolean r21, @p4.l androidx.compose.foundation.interaction.InteractionSource r22, @p4.l androidx.compose.material3.TextFieldColors r23, @p4.m androidx.compose.ui.graphics.Shape r24, float r25, float r26, @p4.m androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m2053ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(@p4.l java.lang.String r43, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, boolean r45, boolean r46, @p4.l androidx.compose.ui.text.input.VisualTransformation r47, @p4.l androidx.compose.foundation.interaction.InteractionSource r48, boolean r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r53, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r54, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r55, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r56, @p4.m androidx.compose.material3.TextFieldColors r57, @p4.m androidx.compose.foundation.layout.PaddingValues r58, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r59, @p4.m androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, v3.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @p4.l
    @Composable
    public final TextFieldColors colors(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-471651810);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1492)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColors;
    }

    @p4.l
    @Composable
    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2054colors0hiis_0(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, @p4.m TextSelectionColors textSelectionColors, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, @p4.m Composer composer, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(1767617725);
        long m3770getUnspecified0d7_KjU = (i10 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5;
        long m3770getUnspecified0d7_KjU2 = (i10 & 2) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j6;
        long m3770getUnspecified0d7_KjU3 = (i10 & 4) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j7;
        long m3770getUnspecified0d7_KjU4 = (i10 & 8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8;
        long m3770getUnspecified0d7_KjU5 = (i10 & 16) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j9;
        long m3770getUnspecified0d7_KjU6 = (i10 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j10;
        long m3770getUnspecified0d7_KjU7 = (i10 & 64) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j11;
        long m3770getUnspecified0d7_KjU8 = (i10 & 128) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j12;
        long m3770getUnspecified0d7_KjU9 = (i10 & 256) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j13;
        long m3770getUnspecified0d7_KjU10 = (i10 & 512) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j14;
        TextSelectionColors textSelectionColors2 = (i10 & 1024) != 0 ? null : textSelectionColors;
        long m3770getUnspecified0d7_KjU11 = (i10 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j15;
        long m3770getUnspecified0d7_KjU12 = (i10 & 4096) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j16;
        long m3770getUnspecified0d7_KjU13 = (i10 & 8192) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j17;
        long m3770getUnspecified0d7_KjU14 = (i10 & 16384) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j18;
        long m3770getUnspecified0d7_KjU15 = (32768 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j19;
        long m3770getUnspecified0d7_KjU16 = (65536 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j20;
        long m3770getUnspecified0d7_KjU17 = (131072 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j21;
        long m3770getUnspecified0d7_KjU18 = (262144 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j22;
        long m3770getUnspecified0d7_KjU19 = (524288 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j23;
        long m3770getUnspecified0d7_KjU20 = (1048576 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j24;
        long m3770getUnspecified0d7_KjU21 = (2097152 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j25;
        long m3770getUnspecified0d7_KjU22 = (4194304 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j26;
        long m3770getUnspecified0d7_KjU23 = (8388608 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j27;
        long m3770getUnspecified0d7_KjU24 = (16777216 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j28;
        long m3770getUnspecified0d7_KjU25 = (33554432 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j29;
        long m3770getUnspecified0d7_KjU26 = (67108864 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j30;
        long m3770getUnspecified0d7_KjU27 = (134217728 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j31;
        long m3770getUnspecified0d7_KjU28 = (268435456 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j32;
        long m3770getUnspecified0d7_KjU29 = (536870912 & i10) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j33;
        long m3770getUnspecified0d7_KjU30 = (i10 & 1073741824) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j34;
        long m3770getUnspecified0d7_KjU31 = (i11 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j35;
        long m3770getUnspecified0d7_KjU32 = (i11 & 2) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j36;
        long m3770getUnspecified0d7_KjU33 = (i11 & 4) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j37;
        long m3770getUnspecified0d7_KjU34 = (i11 & 8) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j38;
        long m3770getUnspecified0d7_KjU35 = (i11 & 16) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j39;
        long m3770getUnspecified0d7_KjU36 = (i11 & 32) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j40;
        long m3770getUnspecified0d7_KjU37 = (i11 & 64) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j41;
        long m3770getUnspecified0d7_KjU38 = (i11 & 128) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j42;
        long m3770getUnspecified0d7_KjU39 = (i11 & 256) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j43;
        long m3770getUnspecified0d7_KjU40 = (i11 & 512) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j44;
        long m3770getUnspecified0d7_KjU41 = (i11 & 1024) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j45;
        long m3770getUnspecified0d7_KjU42 = (i11 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j46;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i5, i6, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1593)");
        }
        TextFieldColors m2369copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i9 >> 6) & 112).m2369copyejIjP34(m3770getUnspecified0d7_KjU, m3770getUnspecified0d7_KjU2, m3770getUnspecified0d7_KjU3, m3770getUnspecified0d7_KjU4, m3770getUnspecified0d7_KjU5, m3770getUnspecified0d7_KjU6, m3770getUnspecified0d7_KjU7, m3770getUnspecified0d7_KjU8, m3770getUnspecified0d7_KjU9, m3770getUnspecified0d7_KjU10, textSelectionColors2, m3770getUnspecified0d7_KjU11, m3770getUnspecified0d7_KjU12, m3770getUnspecified0d7_KjU13, m3770getUnspecified0d7_KjU14, m3770getUnspecified0d7_KjU15, m3770getUnspecified0d7_KjU16, m3770getUnspecified0d7_KjU17, m3770getUnspecified0d7_KjU18, m3770getUnspecified0d7_KjU19, m3770getUnspecified0d7_KjU20, m3770getUnspecified0d7_KjU21, m3770getUnspecified0d7_KjU22, m3770getUnspecified0d7_KjU23, m3770getUnspecified0d7_KjU24, m3770getUnspecified0d7_KjU25, m3770getUnspecified0d7_KjU26, m3770getUnspecified0d7_KjU27, m3770getUnspecified0d7_KjU28, m3770getUnspecified0d7_KjU29, m3770getUnspecified0d7_KjU30, m3770getUnspecified0d7_KjU31, m3770getUnspecified0d7_KjU32, m3770getUnspecified0d7_KjU33, m3770getUnspecified0d7_KjU34, m3770getUnspecified0d7_KjU35, m3770getUnspecified0d7_KjU36, m3770getUnspecified0d7_KjU37, m3770getUnspecified0d7_KjU38, m3770getUnspecified0d7_KjU39, m3770getUnspecified0d7_KjU40, m3770getUnspecified0d7_KjU41, m3770getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m2369copyejIjP34;
    }

    @p4.l
    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2055contentPaddinga9UjIt4(float f5, float f6, float f7, float f8) {
        return PaddingKt.m549PaddingValuesa9UjIt4(f5, f6, f7, f8);
    }

    @p4.l
    @u3.h(name = "getDefaultOutlinedTextFieldColors")
    @Composable
    public final TextFieldColors getDefaultOutlinedTextFieldColors(@p4.l ColorScheme colorScheme, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-292363577);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1641)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached$material3_release = colorScheme.getDefaultOutlinedTextFieldColorsCached$material3_release();
        if (defaultOutlinedTextFieldColorsCached$material3_release == null) {
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.INSTANCE;
            long fromToken = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputColor());
            long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorInputColor());
            Color.Companion companion = Color.Companion;
            defaultOutlinedTextFieldColorsCached$material3_release = new TextFieldColors(fromToken, fromToken2, m3733copywmQWz5c$default, fromToken3, companion.m3769getTransparent0d7_KjU(), companion.m3769getTransparent0d7_KjU(), companion.m3769getTransparent0d7_KjU(), companion.m3769getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getOutlineColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLeadingIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getTrailingIconColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLabelColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getSupportingColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.getValue(outlinedTextFieldTokens.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), Color.m3733copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached$material3_release);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColorsCached$material3_release;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2056getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2057getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2058getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @p4.l
    @u3.h(name = "getShape")
    @Composable
    public final Shape getShape(@p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-1066756961);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i5, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1409)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2059getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
