package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import kotlin.coroutines.d;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForDeprecatedUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements PlatformFontLoader {
    public static final int $stable = 8;

    @l
    private final Object cacheKey = new Object();

    @l
    private final Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(@l Font.ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @m
    public Object awaitLoad(@l Font font, @l d<Object> dVar) {
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
    @l
    public Object loadBlocking(@l Font font) {
        return this.loader.load(font);
    }
}
