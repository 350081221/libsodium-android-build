package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aá\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aT\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010)\u001a\u00020'*\u00020'2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0002H\u0000\u001a\u0012\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0000\u001a\u0012\u0010.\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0000\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00100\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00100\"\u0014\u00103\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00100\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u00100\"\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0014\u0010:\u001a\u00020,8\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010<\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010;\"\u0014\u0010=\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010;\"\u001a\u0010?\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u001a\u0010C\u001a\u00020>8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010B\"\u001a\u0010E\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u001a\u0010M\u001a\u0004\u0018\u00010J*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006N"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", b.f22420d, "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", TTDownloadField.TT_LABEL, "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material/TextFieldColors;", "colors", OutlinedTextFieldKt.BorderId, "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lv3/p;Landroidx/compose/ui/text/input/VisualTransformation;Lv3/p;Lv3/p;Lv3/p;Lv3/p;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lv3/p;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "defaultErrorSemantics", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "Landroidx/compose/ui/unit/Constraints;", "ZeroConstraints", "J", "getZeroConstraints", "()J", "AnimationDuration", "I", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "Landroidx/compose/ui/unit/Dp;", "TextFieldPadding", "F", "getTextFieldPadding", "()F", "HorizontalIconPadding", "getHorizontalIconPadding", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,369:1\n50#2:370\n49#2:371\n1116#3,6:372\n658#4:378\n646#4:379\n658#4:380\n646#4:381\n154#5:382\n154#5:383\n154#5:384\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n80#1:370\n80#1:371\n80#1:372,6\n111#1:378\n111#1:379\n114#1:380\n114#1:381\n365#1:382\n366#1:383\n368#1:384\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @l
    private static final Modifier IconDefaultSizeModifier;

    @l
    public static final String LabelId = "Label";

    @l
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;

    @l
    public static final String PlaceholderId = "Hint";

    @l
    public static final String TextFieldId = "TextField";

    @l
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float TextFieldPadding = Dp.m6044constructorimpl(16);
    private static final float HorizontalIconPadding = Dp.m6044constructorimpl(12);

    static {
        float f5 = 48;
        IconDefaultSizeModifier = SizeKt.m586defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m6044constructorimpl(f5), Dp.m6044constructorimpl(f5));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0313  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CommonDecorationBox(@p4.l androidx.compose.material.TextFieldType r38, @p4.l java.lang.String r39, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r40, @p4.l androidx.compose.ui.text.input.VisualTransformation r41, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r42, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r43, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r44, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r45, boolean r46, boolean r47, boolean r48, @p4.l androidx.compose.foundation.interaction.InteractionSource r49, @p4.l androidx.compose.foundation.layout.PaddingValues r50, @p4.l androidx.compose.material.TextFieldColors r51, @p4.m v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r52, @p4.m androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.CommonDecorationBox(androidx.compose.material.TextFieldType, java.lang.String, v3.p, androidx.compose.ui.text.input.VisualTransformation, v3.p, v3.p, v3.p, v3.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material.TextFieldColors, v3.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0046  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = 0)
    /* renamed from: Decoration-euL9pac, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1504DecorationeuL9pac(long r13, @p4.m androidx.compose.ui.text.TextStyle r15, @p4.m java.lang.Float r16, @p4.l v3.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.r2> r17, @p4.m androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m1504DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, v3.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @l
    public static final Modifier defaultErrorSemantics(@l Modifier modifier, boolean z4, @l String str) {
        return z4 ? SemanticsModifierKt.semantics$default(modifier, false, new TextFieldImplKt$defaultErrorSemantics$1(str), 1, null) : modifier;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    @l
    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    @m
    public static final Object getLayoutId(@l IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(@m Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@m Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
