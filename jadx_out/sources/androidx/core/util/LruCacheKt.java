package androidx.core.util;

import android.util.LruCache;
import kotlin.i0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import v3.p;
import v3.r;

@i0(d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aø\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0086\b¨\u0006\u0016"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lkotlin/v0;", "name", DatabaseFileArchive.COLUMN_KEY, t0.b.f22420d, "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lkotlin/r2;", "onEntryRemoved", "Landroid/util/LruCache;", "lruCache", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LruCacheKt {
    @l
    public static final <K, V> LruCache<K, V> lruCache(int i5, @l p<? super K, ? super V, Integer> pVar, @l v3.l<? super K, ? extends V> lVar, @l r<? super Boolean, ? super K, ? super V, ? super V, r2> rVar) {
        return new LruCacheKt$lruCache$4(i5, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i5, p pVar, v3.l lVar, r rVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i6 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        return new LruCacheKt$lruCache$4(i5, pVar, lVar, rVar);
    }
}
