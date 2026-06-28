package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyTokens;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.text.TextStyle;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;

@kotlin.i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\u009c\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006+"}, d2 = {"Landroidx/compose/material3/Typography;", "", "displayLarge", "Landroidx/compose/ui/text/TextStyle;", "displayMedium", "displaySmall", "headlineLarge", "headlineMedium", "headlineSmall", "titleLarge", "titleMedium", "titleSmall", "bodyLarge", "bodyMedium", "bodySmall", "labelLarge", "labelMedium", "labelSmall", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBodyLarge", "()Landroidx/compose/ui/text/TextStyle;", "getBodyMedium", "getBodySmall", "getDisplayLarge", "getDisplayMedium", "getDisplaySmall", "getHeadlineLarge", "getHeadlineMedium", "getHeadlineSmall", "getLabelLarge", "getLabelMedium", "getLabelSmall", "getTitleLarge", "getTitleMedium", "getTitleSmall", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;

    @p4.l
    private final TextStyle bodyLarge;

    @p4.l
    private final TextStyle bodyMedium;

    @p4.l
    private final TextStyle bodySmall;

    @p4.l
    private final TextStyle displayLarge;

    @p4.l
    private final TextStyle displayMedium;

    @p4.l
    private final TextStyle displaySmall;

    @p4.l
    private final TextStyle headlineLarge;

    @p4.l
    private final TextStyle headlineMedium;

    @p4.l
    private final TextStyle headlineSmall;

    @p4.l
    private final TextStyle labelLarge;

    @p4.l
    private final TextStyle labelMedium;

    @p4.l
    private final TextStyle labelSmall;

    @p4.l
    private final TextStyle titleLarge;

    @p4.l
    private final TextStyle titleMedium;

    @p4.l
    private final TextStyle titleSmall;

    public Typography() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LayoutKt.LargeDimension, null);
    }

    public Typography(@p4.l TextStyle textStyle, @p4.l TextStyle textStyle2, @p4.l TextStyle textStyle3, @p4.l TextStyle textStyle4, @p4.l TextStyle textStyle5, @p4.l TextStyle textStyle6, @p4.l TextStyle textStyle7, @p4.l TextStyle textStyle8, @p4.l TextStyle textStyle9, @p4.l TextStyle textStyle10, @p4.l TextStyle textStyle11, @p4.l TextStyle textStyle12, @p4.l TextStyle textStyle13, @p4.l TextStyle textStyle14, @p4.l TextStyle textStyle15) {
        this.displayLarge = textStyle;
        this.displayMedium = textStyle2;
        this.displaySmall = textStyle3;
        this.headlineLarge = textStyle4;
        this.headlineMedium = textStyle5;
        this.headlineSmall = textStyle6;
        this.titleLarge = textStyle7;
        this.titleMedium = textStyle8;
        this.titleSmall = textStyle9;
        this.bodyLarge = textStyle10;
        this.bodyMedium = textStyle11;
        this.bodySmall = textStyle12;
        this.labelLarge = textStyle13;
        this.labelMedium = textStyle14;
        this.labelSmall = textStyle15;
    }

    @p4.l
    public final Typography copy(@p4.l TextStyle textStyle, @p4.l TextStyle textStyle2, @p4.l TextStyle textStyle3, @p4.l TextStyle textStyle4, @p4.l TextStyle textStyle5, @p4.l TextStyle textStyle6, @p4.l TextStyle textStyle7, @p4.l TextStyle textStyle8, @p4.l TextStyle textStyle9, @p4.l TextStyle textStyle10, @p4.l TextStyle textStyle11, @p4.l TextStyle textStyle12, @p4.l TextStyle textStyle13, @p4.l TextStyle textStyle14, @p4.l TextStyle textStyle15) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, textStyle15);
    }

    public boolean equals(@p4.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (kotlin.jvm.internal.l0.g(this.displayLarge, typography.displayLarge) && kotlin.jvm.internal.l0.g(this.displayMedium, typography.displayMedium) && kotlin.jvm.internal.l0.g(this.displaySmall, typography.displaySmall) && kotlin.jvm.internal.l0.g(this.headlineLarge, typography.headlineLarge) && kotlin.jvm.internal.l0.g(this.headlineMedium, typography.headlineMedium) && kotlin.jvm.internal.l0.g(this.headlineSmall, typography.headlineSmall) && kotlin.jvm.internal.l0.g(this.titleLarge, typography.titleLarge) && kotlin.jvm.internal.l0.g(this.titleMedium, typography.titleMedium) && kotlin.jvm.internal.l0.g(this.titleSmall, typography.titleSmall) && kotlin.jvm.internal.l0.g(this.bodyLarge, typography.bodyLarge) && kotlin.jvm.internal.l0.g(this.bodyMedium, typography.bodyMedium) && kotlin.jvm.internal.l0.g(this.bodySmall, typography.bodySmall) && kotlin.jvm.internal.l0.g(this.labelLarge, typography.labelLarge) && kotlin.jvm.internal.l0.g(this.labelMedium, typography.labelMedium) && kotlin.jvm.internal.l0.g(this.labelSmall, typography.labelSmall)) {
            return true;
        }
        return false;
    }

    @p4.l
    public final TextStyle getBodyLarge() {
        return this.bodyLarge;
    }

    @p4.l
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    @p4.l
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    @p4.l
    public final TextStyle getDisplayLarge() {
        return this.displayLarge;
    }

    @p4.l
    public final TextStyle getDisplayMedium() {
        return this.displayMedium;
    }

    @p4.l
    public final TextStyle getDisplaySmall() {
        return this.displaySmall;
    }

    @p4.l
    public final TextStyle getHeadlineLarge() {
        return this.headlineLarge;
    }

    @p4.l
    public final TextStyle getHeadlineMedium() {
        return this.headlineMedium;
    }

    @p4.l
    public final TextStyle getHeadlineSmall() {
        return this.headlineSmall;
    }

    @p4.l
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    @p4.l
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    @p4.l
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    @p4.l
    public final TextStyle getTitleLarge() {
        return this.titleLarge;
    }

    @p4.l
    public final TextStyle getTitleMedium() {
        return this.titleMedium;
    }

    @p4.l
    public final TextStyle getTitleSmall() {
        return this.titleSmall;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.displayLarge.hashCode() * 31) + this.displayMedium.hashCode()) * 31) + this.displaySmall.hashCode()) * 31) + this.headlineLarge.hashCode()) * 31) + this.headlineMedium.hashCode()) * 31) + this.headlineSmall.hashCode()) * 31) + this.titleLarge.hashCode()) * 31) + this.titleMedium.hashCode()) * 31) + this.titleSmall.hashCode()) * 31) + this.bodyLarge.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    @p4.l
    public String toString() {
        return "Typography(displayLarge=" + this.displayLarge + ", displayMedium=" + this.displayMedium + ",displaySmall=" + this.displaySmall + ", headlineLarge=" + this.headlineLarge + ", headlineMedium=" + this.headlineMedium + ", headlineSmall=" + this.headlineSmall + ", titleLarge=" + this.titleLarge + ", titleMedium=" + this.titleMedium + ", titleSmall=" + this.titleSmall + ", bodyLarge=" + this.bodyLarge + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLarge=" + this.labelLarge + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ')';
    }

    public /* synthetic */ Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, TextStyle textStyle14, TextStyle textStyle15, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? TypographyTokens.INSTANCE.getDisplayLarge() : textStyle, (i5 & 2) != 0 ? TypographyTokens.INSTANCE.getDisplayMedium() : textStyle2, (i5 & 4) != 0 ? TypographyTokens.INSTANCE.getDisplaySmall() : textStyle3, (i5 & 8) != 0 ? TypographyTokens.INSTANCE.getHeadlineLarge() : textStyle4, (i5 & 16) != 0 ? TypographyTokens.INSTANCE.getHeadlineMedium() : textStyle5, (i5 & 32) != 0 ? TypographyTokens.INSTANCE.getHeadlineSmall() : textStyle6, (i5 & 64) != 0 ? TypographyTokens.INSTANCE.getTitleLarge() : textStyle7, (i5 & 128) != 0 ? TypographyTokens.INSTANCE.getTitleMedium() : textStyle8, (i5 & 256) != 0 ? TypographyTokens.INSTANCE.getTitleSmall() : textStyle9, (i5 & 512) != 0 ? TypographyTokens.INSTANCE.getBodyLarge() : textStyle10, (i5 & 1024) != 0 ? TypographyTokens.INSTANCE.getBodyMedium() : textStyle11, (i5 & 2048) != 0 ? TypographyTokens.INSTANCE.getBodySmall() : textStyle12, (i5 & 4096) != 0 ? TypographyTokens.INSTANCE.getLabelLarge() : textStyle13, (i5 & 8192) != 0 ? TypographyTokens.INSTANCE.getLabelMedium() : textStyle14, (i5 & 16384) != 0 ? TypographyTokens.INSTANCE.getLabelSmall() : textStyle15);
    }
}
