package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.b1;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u0000`\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001ax\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001ap\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00190\u00182\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\f\u0010!\u001a\u00020\u0001*\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParagraphKt {
    public static final int DefaultMaxLines = Integer.MAX_VALUE;

    @l
    @k(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @b1(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public static final Paragraph Paragraph(@l String str, @l TextStyle textStyle, @l List<AnnotatedString.Range<SpanStyle>> list, @l List<AnnotatedString.Range<Placeholder>> list2, int i5, boolean z4, float f5, @l Density density, @l Font.ResourceLoader resourceLoader) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.ActualParagraph(str, textStyle, list, list2, i5, z4, f5, density, resourceLoader);
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, List list, List list2, int i5, boolean z4, float f5, Density density, Font.ResourceLoader resourceLoader, int i6, Object obj) {
        List list3;
        List list4;
        List E;
        List E2;
        if ((i6 & 4) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i6 & 8) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        return Paragraph(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, (i6 & 16) != 0 ? Integer.MAX_VALUE : i5, (i6 & 32) != 0 ? false : z4, f5, density, resourceLoader);
    }

    @l
    /* renamed from: Paragraph-UdtVg6A, reason: not valid java name */
    public static final Paragraph m5436ParagraphUdtVg6A(@l String str, @l TextStyle textStyle, long j5, @l Density density, @l FontFamily.Resolver resolver, @l List<AnnotatedString.Range<SpanStyle>> list, @l List<AnnotatedString.Range<Placeholder>> list2, int i5, boolean z4) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m5795ActualParagraphO3s9Psw(str, textStyle, list, list2, i5, z4, j5, density, resolver);
    }

    /* renamed from: Paragraph-UdtVg6A$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m5437ParagraphUdtVg6A$default(String str, TextStyle textStyle, long j5, Density density, FontFamily.Resolver resolver, List list, List list2, int i5, boolean z4, int i6, Object obj) {
        List list3;
        List list4;
        int i7;
        boolean z5;
        List E;
        List E2;
        if ((i6 & 32) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i6 & 64) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        if ((i6 & 128) != 0) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = i5;
        }
        if ((i6 & 256) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        return m5436ParagraphUdtVg6A(str, textStyle, j5, density, resolver, list3, list4, i7, z5);
    }

    @l
    /* renamed from: Paragraph-_EkL_-Y, reason: not valid java name */
    public static final Paragraph m5438Paragraph_EkL_Y(@l ParagraphIntrinsics paragraphIntrinsics, long j5, int i5, boolean z4) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m5794ActualParagraphhBUhpc(paragraphIntrinsics, i5, z4, j5);
    }

    /* renamed from: Paragraph-_EkL_-Y$default, reason: not valid java name */
    public static /* synthetic */ Paragraph m5439Paragraph_EkL_Y$default(ParagraphIntrinsics paragraphIntrinsics, long j5, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 8) != 0) {
            z4 = false;
        }
        return m5438Paragraph_EkL_Y(paragraphIntrinsics, j5, i5, z4);
    }

    public static final int ceilToInt(float f5) {
        return (int) Math.ceil(f5);
    }

    @l
    @k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @b1(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(@l String str, @l TextStyle textStyle, float f5, @l Density density, @l FontFamily.Resolver resolver, @l List<AnnotatedString.Range<SpanStyle>> list, @l List<AnnotatedString.Range<Placeholder>> list2, int i5, boolean z4) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m5795ActualParagraphO3s9Psw(str, textStyle, list, list2, i5, z4, ConstraintsKt.Constraints$default(0, ceilToInt(f5), 0, 0, 13, null), density, resolver);
    }

    @l
    @k(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @b1(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public static final Paragraph Paragraph(@l ParagraphIntrinsics paragraphIntrinsics, int i5, boolean z4, float f5) {
        return androidx.compose.ui.text.platform.AndroidParagraph_androidKt.m5794ActualParagraphhBUhpc(paragraphIntrinsics, i5, z4, ConstraintsKt.Constraints$default(0, ceilToInt(f5), 0, 0, 13, null));
    }

    public static /* synthetic */ Paragraph Paragraph$default(String str, TextStyle textStyle, float f5, Density density, FontFamily.Resolver resolver, List list, List list2, int i5, boolean z4, int i6, Object obj) {
        List list3;
        List list4;
        List E;
        List E2;
        if ((i6 & 32) != 0) {
            E2 = w.E();
            list3 = E2;
        } else {
            list3 = list;
        }
        if ((i6 & 64) != 0) {
            E = w.E();
            list4 = E;
        } else {
            list4 = list2;
        }
        return Paragraph(str, textStyle, f5, density, resolver, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list4, (i6 & 128) != 0 ? Integer.MAX_VALUE : i5, (i6 & 256) != 0 ? false : z4);
    }

    public static /* synthetic */ Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics, int i5, boolean z4, float f5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return Paragraph(paragraphIntrinsics, i5, z4, f5);
    }
}
