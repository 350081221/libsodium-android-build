package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.j0;
import kotlin.k;
import kotlin.m;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0018\u00010\u0004H\u0007\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b\u001a\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", d.X, "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", "Lkotlin/u0;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "styles", "Landroidx/compose/ui/text/font/Typeface;", "Typeface", "Landroid/graphics/Typeface;", "typeface", "FontFamily", "ui-text_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidTypeface_androidKt {
    @l
    public static final FontFamily FontFamily(@l android.graphics.Typeface typeface) {
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    @l
    @k(level = m.WARNING, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @b1(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final Typeface Typeface(@l Context context, @l FontFamily fontFamily, @p4.m List<u0<FontWeight, FontStyle>> list) {
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, null, 8, null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new j0();
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    @l
    public static final Typeface Typeface(@l android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }
}
