package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", d.X, "Landroid/content/Context;", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    public static final int $stable = 8;

    @l
    private final Object cacheKey = new Object();

    @l
    private final Context context;

    @l
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(@l Font.ResourceLoader resourceLoader, @l Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object awaitLoad(@l Font font, @l kotlin.coroutines.d<Object> dVar) {
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, dVar);
        }
        return this.loader.load(font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @l
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @l
    public final Font.ResourceLoader getLoader$ui_text_release() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object loadBlocking(@l Font font) {
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
        }
        return this.loader.load(font);
    }
}
