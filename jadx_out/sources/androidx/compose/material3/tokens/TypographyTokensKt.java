package androidx.compose.material3.tokens;

import androidx.compose.material3.DefaultPlatformTextStyle_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"DefaultLineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyTokensKt {

    @l
    private static final LineHeightStyle DefaultLineHeightStyle;

    @l
    private static final TextStyle DefaultTextStyle;

    static {
        TextStyle m5571copyp1EtxEg;
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.Companion.m5913getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m5928getNoneEVpEnUU(), null);
        DefaultLineHeightStyle = lineHeightStyle;
        m5571copyp1EtxEg = r0.m5571copyp1EtxEg((r48 & 1) != 0 ? r0.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r0.spanStyle.m5505getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r0.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r0.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r0.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r0.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r0.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r0.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r0.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r0.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r0.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r0.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r0.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r0.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r0.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r0.paragraphStyle.m5460getTextAligne0LSkKk() : 0, (r48 & 65536) != 0 ? r0.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r0.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r0.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r0.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (r48 & 1048576) != 0 ? r0.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (r48 & 2097152) != 0 ? r0.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r0.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TextStyle.Companion.getDefault().paragraphStyle.getTextMotion() : null);
        DefaultTextStyle = m5571copyp1EtxEg;
    }

    @l
    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    @l
    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }
}
