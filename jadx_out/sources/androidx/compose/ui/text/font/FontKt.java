package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import kotlin.m;
import p4.l;

@i0(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontKt {
    @l
    @ExperimentalTextApi
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m5632FontF3nL8kk(int i5, @l FontWeight fontWeight, int i6, int i7, @l FontVariation.Settings settings) {
        return new ResourceFont(i5, fontWeight, i6, settings, i7, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m5633FontF3nL8kk$default(int i5, FontWeight fontWeight, int i6, int i7, FontVariation.Settings settings, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i8 & 4) != 0) {
            i6 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i8 & 8) != 0) {
            i7 = FontLoadingStrategy.Companion.m5646getBlockingPKNRLFQ();
        }
        if ((i8 & 16) != 0) {
            settings = FontVariation.INSTANCE.m5676Settings6EWAqTQ(fontWeight, i6, new FontVariation.Setting[0]);
        }
        return m5632FontF3nL8kk(i5, fontWeight, i6, i7, settings);
    }

    @Stable
    @k(level = m.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @b1(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m5634FontRetOiIg(int i5, FontWeight fontWeight, int i6) {
        return new ResourceFont(i5, fontWeight, i6, null, FontLoadingStrategy.Companion.m5646getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m5635FontRetOiIg$default(int i5, FontWeight fontWeight, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i7 & 4) != 0) {
            i6 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        return m5634FontRetOiIg(i5, fontWeight, i6);
    }

    @Stable
    @l
    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m5636FontYpTlLL0(int i5, @l FontWeight fontWeight, int i6, int i7) {
        return new ResourceFont(i5, fontWeight, i6, new FontVariation.Settings(new FontVariation.Setting[0]), i7, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m5637FontYpTlLL0$default(int i5, FontWeight fontWeight, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i8 & 4) != 0) {
            i6 = FontStyle.Companion.m5661getNormal_LCdwA();
        }
        if ((i8 & 8) != 0) {
            i7 = FontLoadingStrategy.Companion.m5646getBlockingPKNRLFQ();
        }
        return m5636FontYpTlLL0(i5, fontWeight, i6, i7);
    }

    @Stable
    @l
    public static final FontFamily toFontFamily(@l Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
