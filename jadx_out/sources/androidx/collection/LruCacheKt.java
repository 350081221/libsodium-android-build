package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aû\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/v0;", "name", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/r2;", "onEntryRemoved", "Landroidx/collection/LruCache;", "lruCache", "collection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LruCacheKt {
    @l
    public static final <K, V> LruCache<K, V> lruCache(int i5, @l p<? super K, ? super V, Integer> sizeOf, @l v3.l<? super K, ? extends V> create, @l r<? super Boolean, ? super K, ? super V, ? super V, r2> onEntryRemoved) {
        l0.p(sizeOf, "sizeOf");
        l0.p(create, "create");
        l0.p(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i5, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i5, p sizeOf, v3.l create, r onEntryRemoved, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            sizeOf = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            create = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i6 & 8) != 0) {
            onEntryRemoved = LruCacheKt$lruCache$3.INSTANCE;
        }
        l0.p(sizeOf, "sizeOf");
        l0.p(create, "create");
        l0.p(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i5, sizeOf, create, onEntryRemoved);
    }
}
