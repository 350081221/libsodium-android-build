package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.m;
import t0.b;
import v3.l;
import v3.p;
import v3.r;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@i0(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/collection/LruCacheKt$lruCache$4", "Landroidx/collection/LruCache;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lkotlin/r2;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCacheKt$lruCache$4\n*L\n1#1,355:1\n*E\n"})
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ l<K, V> $create;
    final /* synthetic */ r<Boolean, K, V, V, r2> $onEntryRemoved;
    final /* synthetic */ p<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i5, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, r2> rVar) {
        super(i5);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
    }

    @Override // androidx.collection.LruCache
    @m
    protected V create(@p4.l K key) {
        l0.p(key, "key");
        return this.$create.invoke(key);
    }

    @Override // androidx.collection.LruCache
    protected void entryRemoved(boolean z4, @p4.l K key, @p4.l V oldValue, @m V v4) {
        l0.p(key, "key");
        l0.p(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z4), key, oldValue, v4);
    }

    @Override // androidx.collection.LruCache
    protected int sizeOf(@p4.l K key, @p4.l V value) {
        l0.p(key, "key");
        l0.p(value, "value");
        return this.$sizeOf.invoke(key, value).intValue();
    }
}
