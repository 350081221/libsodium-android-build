package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.math.d;
import p4.l;

@i0(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u0018\u001a\u00020\u0010*\u00020\u0019H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"updateTextDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "current", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "updateTextDelegate-rm0N8CA", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;", "ceilToIntPx", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f5) {
        int L0;
        L0 = d.L0((float) Math.ceil(f5));
        return L0;
    }

    @l
    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m893updateTextDelegaterm0N8CA(@l TextDelegate textDelegate, @l AnnotatedString annotatedString, @l TextStyle textStyle, @l Density density, @l FontFamily.Resolver resolver, boolean z4, int i5, int i6, int i7, @l List<AnnotatedString.Range<Placeholder>> list) {
        if (l0.g(textDelegate.getText(), annotatedString) && l0.g(textDelegate.getStyle(), textStyle)) {
            if (textDelegate.getSoftWrap() == z4) {
                if (TextOverflow.m5978equalsimpl0(textDelegate.m891getOverflowgIe3tQ8(), i5)) {
                    if (textDelegate.getMaxLines() == i6) {
                        if (textDelegate.getMinLines() == i7 && l0.g(textDelegate.getDensity(), density)) {
                            if (l0.g(textDelegate.getPlaceholders(), list) && textDelegate.getFontFamilyResolver() == resolver) {
                                return textDelegate;
                            }
                            return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
                        }
                        return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
                    }
                    return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
                }
                return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
            }
            return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
        }
        return new TextDelegate(annotatedString, textStyle, i6, i7, z4, i5, density, resolver, list, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m894updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z4, int i5, int i6, int i7, List list, int i8, Object obj) {
        boolean z5;
        int i9;
        int i10;
        int i11;
        if ((i8 & 32) != 0) {
            z5 = true;
        } else {
            z5 = z4;
        }
        if ((i8 & 64) != 0) {
            i9 = TextOverflow.Companion.m5985getClipgIe3tQ8();
        } else {
            i9 = i5;
        }
        if ((i8 & 128) != 0) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = i6;
        }
        if ((i8 & 256) != 0) {
            i11 = 1;
        } else {
            i11 = i7;
        }
        return m893updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z5, i9, i10, i11, list);
    }
}
