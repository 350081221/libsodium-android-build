package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFontTypefaceLoader;", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "Landroid/content/Context;", d.X, "Landroidx/compose/ui/text/font/AndroidFont;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "", "awaitLoad", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {

    @l
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @m
    public Object awaitLoad(@l Context context, @l AndroidFont androidFont, @l kotlin.coroutines.d<?> dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    @m
    public android.graphics.Typeface loadBlocking(@l Context context, @l AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont = androidFont instanceof AndroidPreloadedFont ? (AndroidPreloadedFont) androidFont : null;
        if (androidPreloadedFont != null) {
            return androidPreloadedFont.loadCached$ui_text_release(context);
        }
        return null;
    }
}
