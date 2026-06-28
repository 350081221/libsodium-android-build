package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "capacity", "", "(I)V", "lruCache", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/compose/ui/text/TextLayoutResult;", "get", DatabaseFileArchive.COLUMN_KEY, "Landroidx/compose/ui/text/TextLayoutInput;", "put", b.f22420d, "remove", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;

    @l
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public TextLayoutCache(int i5) {
        this.lruCache = new LruCache<>(i5);
    }

    @m
    public final TextLayoutResult get(@l TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult = this.lruCache.get(new CacheTextLayoutInput(textLayoutInput));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    @m
    public final TextLayoutResult put(@l TextLayoutInput textLayoutInput, @l TextLayoutResult textLayoutResult) {
        return this.lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
    }

    @m
    public final TextLayoutResult remove(@l TextLayoutInput textLayoutInput) {
        return this.lruCache.remove(new CacheTextLayoutInput(textLayoutInput));
    }

    public /* synthetic */ TextLayoutCache(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? TextMeasurerKt.DefaultCacheSize : i5);
    }
}
