package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.agconnect.apms.collect.model.event.interaction.ForeAndBackgroundEvent;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u00102\u001a\u00020\u000b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\b[\u0010\\J\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R(\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b2\u0010\u0006\u001a\u0004\b3\u0010\b\"\u0004\b4\u0010\nR*\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010J\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bJ\u0010\u0006\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010\nR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/ui/platform/MutableSpanStyle;", "", "Landroidx/compose/ui/text/SpanStyle;", "toSpanStyle", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "J", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "getFontSize-XSAIIZE", "setFontSize--R2X_6o", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "setFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "setFontStyle-mLjRB2g", "(Landroidx/compose/ui/text/font/FontStyle;)V", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "setFontSynthesis-tDdu0R4", "(Landroidx/compose/ui/text/font/FontSynthesis;)V", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "setFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;)V", "", "fontFeatureSettings", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "setFontFeatureSettings", "(Ljava/lang/String;)V", "letterSpacing", "getLetterSpacing-XSAIIZE", "setLetterSpacing--R2X_6o", "Landroidx/compose/ui/text/style/BaselineShift;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-_isdbwI", "(Landroidx/compose/ui/text/style/BaselineShift;)V", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "setTextGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "setLocaleList", "(Landroidx/compose/ui/text/intl/LocaleList;)V", ForeAndBackgroundEvent.BACKGROUND, "getBackground-0d7_KjU", "setBackground-8_81llA", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "<init>", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MutableSpanStyle {
    private long background;

    @p4.m
    private BaselineShift baselineShift;
    private long color;

    @p4.m
    private FontFamily fontFamily;

    @p4.m
    private String fontFeatureSettings;
    private long fontSize;

    @p4.m
    private FontStyle fontStyle;

    @p4.m
    private FontSynthesis fontSynthesis;

    @p4.m
    private FontWeight fontWeight;
    private long letterSpacing;

    @p4.m
    private LocaleList localeList;

    @p4.m
    private Shadow shadow;

    @p4.m
    private TextDecoration textDecoration;

    @p4.m
    private TextGeometricTransform textGeometricTransform;

    private MutableSpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow) {
        this.color = j5;
        this.fontSize = j6;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j7;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j8;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
    }

    public /* synthetic */ MutableSpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, kotlin.jvm.internal.w wVar) {
        this(j5, j6, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j7, baselineShift, textGeometricTransform, localeList, j8, textDecoration, shadow);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m5326getBackground0d7_KjU() {
        return this.background;
    }

    @p4.m
    /* renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m5327getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5328getColor0d7_KjU() {
        return this.color;
    }

    @p4.m
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @p4.m
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m5329getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @p4.m
    /* renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m5330getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @p4.m
    /* renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m5331getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @p4.m
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m5332getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    @p4.m
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @p4.m
    public final Shadow getShadow() {
        return this.shadow;
    }

    @p4.m
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @p4.m
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    /* renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m5333setBackground8_81llA(long j5) {
        this.background = j5;
    }

    /* renamed from: setBaselineShift-_isdbwI, reason: not valid java name */
    public final void m5334setBaselineShift_isdbwI(@p4.m BaselineShift baselineShift) {
        this.baselineShift = baselineShift;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m5335setColor8_81llA(long j5) {
        this.color = j5;
    }

    public final void setFontFamily(@p4.m FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    public final void setFontFeatureSettings(@p4.m String str) {
        this.fontFeatureSettings = str;
    }

    /* renamed from: setFontSize--R2X_6o, reason: not valid java name */
    public final void m5336setFontSizeR2X_6o(long j5) {
        this.fontSize = j5;
    }

    /* renamed from: setFontStyle-mLjRB2g, reason: not valid java name */
    public final void m5337setFontStylemLjRB2g(@p4.m FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    /* renamed from: setFontSynthesis-tDdu0R4, reason: not valid java name */
    public final void m5338setFontSynthesistDdu0R4(@p4.m FontSynthesis fontSynthesis) {
        this.fontSynthesis = fontSynthesis;
    }

    public final void setFontWeight(@p4.m FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    /* renamed from: setLetterSpacing--R2X_6o, reason: not valid java name */
    public final void m5339setLetterSpacingR2X_6o(long j5) {
        this.letterSpacing = j5;
    }

    public final void setLocaleList(@p4.m LocaleList localeList) {
        this.localeList = localeList;
    }

    public final void setShadow(@p4.m Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(@p4.m TextDecoration textDecoration) {
        this.textDecoration = textDecoration;
    }

    public final void setTextGeometricTransform(@p4.m TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    @p4.l
    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (kotlin.jvm.internal.w) null);
    }

    public /* synthetic */ MutableSpanStyle(long j5, long j6, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j7, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j8, TextDecoration textDecoration, Shadow shadow, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j5, (i5 & 2) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j6, (i5 & 4) != 0 ? null : fontWeight, (i5 & 8) != 0 ? null : fontStyle, (i5 & 16) != 0 ? null : fontSynthesis, (i5 & 32) != 0 ? null : fontFamily, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? TextUnit.Companion.m6246getUnspecifiedXSAIIZE() : j7, (i5 & 256) != 0 ? null : baselineShift, (i5 & 512) != 0 ? null : textGeometricTransform, (i5 & 1024) != 0 ? null : localeList, (i5 & 2048) != 0 ? Color.Companion.m3770getUnspecified0d7_KjU() : j8, (i5 & 4096) != 0 ? null : textDecoration, (i5 & 8192) != 0 ? null : shadow, null);
    }
}
