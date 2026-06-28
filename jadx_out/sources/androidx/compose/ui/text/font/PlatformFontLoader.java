package androidx.compose.ui.text.font;

import kotlin.coroutines.d;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontLoader;", "", "Landroidx/compose/ui/text/font/Font;", "font", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface PlatformFontLoader {
    @m
    Object awaitLoad(@l Font font, @l d<Object> dVar);

    @m
    Object getCacheKey();

    @m
    Object loadBlocking(@l Font font);
}
