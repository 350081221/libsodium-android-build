package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a¢\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010%\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010(\u001a\u00020&*\u00020&2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0002H\u0000\u001a\u0012\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000\u001a\u0012\u0010-\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010/\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010/\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010/\"\u0014\u00105\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00106\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010/\"\u0014\u00107\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010/\"\u001a\u00109\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0014\u0010=\u001a\u00020+8\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010>\"\u0014\u0010?\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010>\"\u0014\u0010@\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010>\"\u001a\u0010B\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010E\"\u001a\u0010H\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010E\"\u001a\u0010J\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bK\u0010E\"\u001a\u0010L\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bM\u0010E\"\u001a\u0010N\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010E\"\u001a\u0010P\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010E\"\u001a\u0010R\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u001a\u0010Z\u001a\u0004\u0018\u00010W*\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"Landroidx/compose/material3/TextFieldType;", "type", "", t0.b.f22420d, "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material3/TextFieldColors;", "colors", "container", "CommonDecorationBox", "(Landroidx/compose/material3/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "content", "Decoration-KTwxG1Y", "(JLandroidx/compose/ui/text/TextStyle;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "PrefixId", "SuffixId", "SupportingId", "ContainerId", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "AnimationDuration", "I", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "SupportingTopPadding", "getSupportingTopPadding", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "MinTextLineHeight", "getMinTextLineHeight", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n1116#2,6:434\n658#3:440\n646#3:441\n658#3:442\n646#3:443\n154#4:444\n154#4:445\n154#4:446\n154#4:447\n154#4:448\n154#4:449\n154#4:450\n154#4:451\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n81#1:434,6\n106#1:440\n106#1:441\n109#1:442\n109#1:443\n424#1:444\n425#1:445\n426#1:446\n427#1:447\n428#1:448\n429#1:449\n430#1:450\n432#1:451\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @p4.l
    public static final String ContainerId = "Container";

    @p4.l
    private static final Modifier IconDefaultSizeModifier;

    @p4.l
    public static final String LabelId = "Label";

    @p4.l
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @p4.l
    public static final String PlaceholderId = "Hint";

    @p4.l
    public static final String PrefixId = "Prefix";

    @p4.l
    public static final String SuffixId = "Suffix";

    @p4.l
    public static final String SupportingId = "Supporting";

    @p4.l
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;

    @p4.l
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = Dp.m6044constructorimpl(12);
    private static final float SupportingTopPadding = Dp.m6044constructorimpl(4);
    private static final float PrefixSuffixTextPadding = Dp.m6044constructorimpl(2);
    private static final float MinTextLineHeight = Dp.m6044constructorimpl(24);

    static {
        float f5 = 16;
        TextFieldPadding = Dp.m6044constructorimpl(f5);
        MinFocusedLabelLineHeight = Dp.m6044constructorimpl(f5);
        MinSupportingTextLineHeight = Dp.m6044constructorimpl(f5);
        float f6 = 48;
        IconDefaultSizeModifier = SizeKt.m586defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m6044constructorimpl(f6), Dp.m6044constructorimpl(f6));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(@p4.l androidx.compose.material3.TextFieldType r42, @p4.l java.lang.String r43, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, @p4.l androidx.compose.ui.text.input.VisualTransformation r45, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r46, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r47, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r48, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r49, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r50, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, boolean r53, boolean r54, boolean r55, @p4.l androidx.compose.foundation.interaction.InteractionSource r56, @p4.l androidx.compose.foundation.layout.PaddingValues r57, @p4.l androidx.compose.material3.TextFieldColors r58, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r59, @p4.m androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt.CommonDecorationBox(androidx.compose.material3.TextFieldType, java.lang.String, v3.p, androidx.compose.ui.text.input.VisualTransformation, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, v3.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: Decoration-KTwxG1Y, reason: not valid java name */
    public static final void m2442DecorationKTwxG1Y(long j5, @p4.m TextStyle textStyle, @p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1520066345);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            if (startRestartGroup.changed(j5)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i8 | i5;
        } else {
            i7 = i5;
        }
        int i11 = i6 & 2;
        if (i11 != 0) {
            i7 |= 48;
        } else if ((i5 & 48) == 0) {
            if (startRestartGroup.changed(textStyle)) {
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
                textStyle = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520066345, i7, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:271)");
            }
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 1449369305, true, new TextFieldImplKt$Decoration$contentWithColor$1(j5, pVar));
            if (textStyle != null) {
                startRestartGroup.startReplaceableGroup(1830467586);
                ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j5, textStyle, pVar, startRestartGroup, (i7 & 14) | (i7 & 112) | (i7 & 896));
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(1830467667);
                composableLambda.invoke(startRestartGroup, 6);
                startRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        TextStyle textStyle2 = textStyle;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldImplKt$Decoration$1(j5, textStyle2, pVar, i5, i6));
        }
    }

    @p4.l
    public static final Modifier defaultErrorSemantics(@p4.l Modifier modifier, boolean z4, @p4.l String str) {
        return z4 ? SemanticsModifierKt.semantics$default(modifier, false, new TextFieldImplKt$defaultErrorSemantics$1(str), 1, null) : modifier;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @p4.l
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @p4.m
    public static final Object getLayoutId(@p4.l IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@p4.m Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@p4.m Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
