package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", com.umeng.analytics.pro.d.X, "Landroid/content/Context;", "(Landroid/content/Context;)V", "load", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.k(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.b1(expression = "PlatformFontLoader", imports = {}))
/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;

    @p4.l
    private final Context context;

    public AndroidFontResourceLoader(@p4.l Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @p4.l
    @kotlin.k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.b1(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public Typeface load(@p4.l Font font) {
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
            }
            Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
            kotlin.jvm.internal.l0.m(font2);
            return font2;
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }
}
