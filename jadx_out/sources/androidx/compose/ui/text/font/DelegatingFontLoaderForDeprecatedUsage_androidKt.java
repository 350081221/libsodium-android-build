package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import com.umeng.analytics.pro.d;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontResourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", d.X, "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @l
    @k(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @b1(expression = "createFontFamilyResolver()", imports = {}))
    public static final FontFamily.Resolver createFontFamilyResolver(@l Font.ResourceLoader resourceLoader, @l Context context) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @l
    @k(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @b1(expression = "createFontFamilyResolver()", imports = {}))
    public static final FontFamily.Resolver createFontFamilyResolver(@l Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
