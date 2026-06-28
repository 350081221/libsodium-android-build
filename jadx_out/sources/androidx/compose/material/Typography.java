package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextStyle;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012Bo\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/compose/material/Typography;", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "h1", "Landroidx/compose/ui/text/TextStyle;", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBody1", "()Landroidx/compose/ui/text/TextStyle;", "getBody2", "getButton", "getCaption", "getH1", "getH2", "getH3", "getH4", "getH5", "getH6", "getOverline", "getSubtitle1", "getSubtitle2", "copy", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;

    @l
    private final TextStyle body1;

    @l
    private final TextStyle body2;

    @l
    private final TextStyle button;

    @l
    private final TextStyle caption;

    /* renamed from: h1, reason: collision with root package name */
    @l
    private final TextStyle f256h1;

    /* renamed from: h2, reason: collision with root package name */
    @l
    private final TextStyle f257h2;

    /* renamed from: h3, reason: collision with root package name */
    @l
    private final TextStyle f258h3;

    /* renamed from: h4, reason: collision with root package name */
    @l
    private final TextStyle f259h4;

    @l
    private final TextStyle h5;

    @l
    private final TextStyle h6;

    @l
    private final TextStyle overline;

    @l
    private final TextStyle subtitle1;

    @l
    private final TextStyle subtitle2;

    public Typography(@l TextStyle textStyle, @l TextStyle textStyle2, @l TextStyle textStyle3, @l TextStyle textStyle4, @l TextStyle textStyle5, @l TextStyle textStyle6, @l TextStyle textStyle7, @l TextStyle textStyle8, @l TextStyle textStyle9, @l TextStyle textStyle10, @l TextStyle textStyle11, @l TextStyle textStyle12, @l TextStyle textStyle13) {
        this.f256h1 = textStyle;
        this.f257h2 = textStyle2;
        this.f258h3 = textStyle3;
        this.f259h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i5, Object obj) {
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        if ((i5 & 1) != 0) {
            textStyle14 = typography.f256h1;
        } else {
            textStyle14 = textStyle;
        }
        if ((i5 & 2) != 0) {
            textStyle15 = typography.f257h2;
        } else {
            textStyle15 = textStyle2;
        }
        if ((i5 & 4) != 0) {
            textStyle16 = typography.f258h3;
        } else {
            textStyle16 = textStyle3;
        }
        if ((i5 & 8) != 0) {
            textStyle17 = typography.f259h4;
        } else {
            textStyle17 = textStyle4;
        }
        if ((i5 & 16) != 0) {
            textStyle18 = typography.h5;
        } else {
            textStyle18 = textStyle5;
        }
        if ((i5 & 32) != 0) {
            textStyle19 = typography.h6;
        } else {
            textStyle19 = textStyle6;
        }
        if ((i5 & 64) != 0) {
            textStyle20 = typography.subtitle1;
        } else {
            textStyle20 = textStyle7;
        }
        if ((i5 & 128) != 0) {
            textStyle21 = typography.subtitle2;
        } else {
            textStyle21 = textStyle8;
        }
        if ((i5 & 256) != 0) {
            textStyle22 = typography.body1;
        } else {
            textStyle22 = textStyle9;
        }
        if ((i5 & 512) != 0) {
            textStyle23 = typography.body2;
        } else {
            textStyle23 = textStyle10;
        }
        if ((i5 & 1024) != 0) {
            textStyle24 = typography.button;
        } else {
            textStyle24 = textStyle11;
        }
        if ((i5 & 2048) != 0) {
            textStyle25 = typography.caption;
        } else {
            textStyle25 = textStyle12;
        }
        if ((i5 & 4096) != 0) {
            textStyle26 = typography.overline;
        } else {
            textStyle26 = textStyle13;
        }
        return typography.copy(textStyle14, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26);
    }

    @l
    public final Typography copy(@l TextStyle textStyle, @l TextStyle textStyle2, @l TextStyle textStyle3, @l TextStyle textStyle4, @l TextStyle textStyle5, @l TextStyle textStyle6, @l TextStyle textStyle7, @l TextStyle textStyle8, @l TextStyle textStyle9, @l TextStyle textStyle10, @l TextStyle textStyle11, @l TextStyle textStyle12, @l TextStyle textStyle13) {
        return new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) obj;
        if (l0.g(this.f256h1, typography.f256h1) && l0.g(this.f257h2, typography.f257h2) && l0.g(this.f258h3, typography.f258h3) && l0.g(this.f259h4, typography.f259h4) && l0.g(this.h5, typography.h5) && l0.g(this.h6, typography.h6) && l0.g(this.subtitle1, typography.subtitle1) && l0.g(this.subtitle2, typography.subtitle2) && l0.g(this.body1, typography.body1) && l0.g(this.body2, typography.body2) && l0.g(this.button, typography.button) && l0.g(this.caption, typography.caption) && l0.g(this.overline, typography.overline)) {
            return true;
        }
        return false;
    }

    @l
    public final TextStyle getBody1() {
        return this.body1;
    }

    @l
    public final TextStyle getBody2() {
        return this.body2;
    }

    @l
    public final TextStyle getButton() {
        return this.button;
    }

    @l
    public final TextStyle getCaption() {
        return this.caption;
    }

    @l
    public final TextStyle getH1() {
        return this.f256h1;
    }

    @l
    public final TextStyle getH2() {
        return this.f257h2;
    }

    @l
    public final TextStyle getH3() {
        return this.f258h3;
    }

    @l
    public final TextStyle getH4() {
        return this.f259h4;
    }

    @l
    public final TextStyle getH5() {
        return this.h5;
    }

    @l
    public final TextStyle getH6() {
        return this.h6;
    }

    @l
    public final TextStyle getOverline() {
        return this.overline;
    }

    @l
    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    @l
    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f256h1.hashCode() * 31) + this.f257h2.hashCode()) * 31) + this.f258h3.hashCode()) * 31) + this.f259h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    @l
    public String toString() {
        return "Typography(h1=" + this.f256h1 + ", h2=" + this.f257h2 + ", h3=" + this.f258h3 + ", h4=" + this.f259h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Typography(androidx.compose.ui.text.font.FontFamily r49, androidx.compose.ui.text.TextStyle r50, androidx.compose.ui.text.TextStyle r51, androidx.compose.ui.text.TextStyle r52, androidx.compose.ui.text.TextStyle r53, androidx.compose.ui.text.TextStyle r54, androidx.compose.ui.text.TextStyle r55, androidx.compose.ui.text.TextStyle r56, androidx.compose.ui.text.TextStyle r57, androidx.compose.ui.text.TextStyle r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.ui.text.TextStyle r60, androidx.compose.ui.text.TextStyle r61, androidx.compose.ui.text.TextStyle r62, int r63, kotlin.jvm.internal.w r64) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Typography(@p4.l androidx.compose.ui.text.font.FontFamily r1, @p4.l androidx.compose.ui.text.TextStyle r2, @p4.l androidx.compose.ui.text.TextStyle r3, @p4.l androidx.compose.ui.text.TextStyle r4, @p4.l androidx.compose.ui.text.TextStyle r5, @p4.l androidx.compose.ui.text.TextStyle r6, @p4.l androidx.compose.ui.text.TextStyle r7, @p4.l androidx.compose.ui.text.TextStyle r8, @p4.l androidx.compose.ui.text.TextStyle r9, @p4.l androidx.compose.ui.text.TextStyle r10, @p4.l androidx.compose.ui.text.TextStyle r11, @p4.l androidx.compose.ui.text.TextStyle r12, @p4.l androidx.compose.ui.text.TextStyle r13, @p4.l androidx.compose.ui.text.TextStyle r14) {
        /*
            r0 = this;
            androidx.compose.ui.text.TextStyle r2 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r2, r1)
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r3, r1)
            androidx.compose.ui.text.TextStyle r4 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r4, r1)
            androidx.compose.ui.text.TextStyle r5 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r5, r1)
            androidx.compose.ui.text.TextStyle r6 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r6, r1)
            androidx.compose.ui.text.TextStyle r7 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r7, r1)
            androidx.compose.ui.text.TextStyle r8 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r8, r1)
            androidx.compose.ui.text.TextStyle r9 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r9, r1)
            androidx.compose.ui.text.TextStyle r10 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r10, r1)
            androidx.compose.ui.text.TextStyle r11 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r11, r1)
            androidx.compose.ui.text.TextStyle r12 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r12, r1)
            androidx.compose.ui.text.TextStyle r13 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r13, r1)
            androidx.compose.ui.text.TextStyle r14 = androidx.compose.material.TypographyKt.access$withDefaultFontFamily(r14, r1)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.Typography.<init>(androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.TextStyle):void");
    }
}
