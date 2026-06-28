package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\rJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\bJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0006\u0010 \u001a\u00020\u0006J\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\b\u0010$\u001a\u00020#H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%¨\u0006."}, d2 = {"Landroidx/collection/LruCache;", "", "K", "V", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "maxSize", "Lkotlin/r2;", "resize", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "size", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "", "toString", "I", "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;", "Landroidx/collection/internal/Lock;", "lock", "Landroidx/collection/internal/Lock;", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n23#3,3:357\n23#3,3:361\n23#3,3:365\n23#3,3:369\n23#3,3:373\n23#3,3:377\n23#3,3:381\n23#3,3:385\n23#3,3:389\n23#3,3:393\n23#3,3:397\n23#3,3:401\n23#3,3:405\n23#3,3:409\n23#3,3:415\n26#4:360\n26#4:364\n26#4:368\n26#4:372\n26#4:376\n26#4:380\n26#4:384\n26#4:388\n26#4:392\n26#4:396\n26#4:400\n26#4:404\n26#4:408\n26#4:412\n26#4:418\n1855#5,2:413\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n65#1:357,3\n78#1:361,3\n95#1:365,3\n122#1:369,3\n151#1:373,3\n180#1:377,3\n255#1:381,3\n262#1:385,3\n268#1:389,3\n274#1:393,3\n279#1:397,3\n284#1:401,3\n289#1:405,3\n299#1:409,3\n308#1:415,3\n65#1:360\n78#1:364\n95#1:368\n122#1:372\n151#1:376\n180#1:380\n255#1:384\n262#1:388\n268#1:392\n274#1:396\n279#1:400\n284#1:404\n289#1:408\n299#1:412\n308#1:418\n300#1:413,2\n*E\n"})
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @l
    private final Lock lock;

    @l
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@IntRange(from = 1, to = Long.MAX_VALUE) int i5) {
        boolean z4;
        this.maxSize = i5;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.map = new LruHashMap<>(0, 0.75f);
            this.lock = new Lock();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final int safeSizeOf(K k5, V v4) {
        boolean z4;
        int sizeOf = sizeOf(k5, v4);
        if (sizeOf >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k5 + o0.a.f20835h + v4).toString());
    }

    @m
    protected V create(@l K key) {
        l0.p(key, "key");
        return null;
    }

    public final int createCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.createCount;
        }
        return i5;
    }

    protected void entryRemoved(boolean z4, @l K key, @l V oldValue, @m V v4) {
        l0.p(key, "key");
        l0.p(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.evictionCount;
        }
        return i5;
    }

    @m
    public final V get(@l K key) {
        V v4;
        l0.p(key, "key");
        synchronized (this.lock) {
            V v5 = this.map.get(key);
            if (v5 != null) {
                this.hitCount++;
                return v5;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                this.createCount++;
                v4 = (V) this.map.put(key, create);
                if (v4 != null) {
                    this.map.put(key, v4);
                } else {
                    this.size += safeSizeOf(key, create);
                    r2 r2Var = r2.f19517a;
                }
            }
            if (v4 != null) {
                entryRemoved(false, key, create, v4);
                return v4;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.hitCount;
        }
        return i5;
    }

    public final int maxSize() {
        int i5;
        synchronized (this.lock) {
            i5 = this.maxSize;
        }
        return i5;
    }

    public final int missCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.missCount;
        }
        return i5;
    }

    @m
    public final V put(@l K key, @l V value) {
        V put;
        l0.p(key, "key");
        l0.p(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            put = this.map.put(key, value);
            if (put != null) {
                this.size -= safeSizeOf(key, put);
            }
            r2 r2Var = r2.f19517a;
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i5;
        synchronized (this.lock) {
            i5 = this.putCount;
        }
        return i5;
    }

    @m
    public final V remove(@l K key) {
        V remove;
        l0.p(key, "key");
        synchronized (this.lock) {
            remove = this.map.remove(key);
            if (remove != null) {
                this.size -= safeSizeOf(key, remove);
            }
            r2 r2Var = r2.f19517a;
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(@IntRange(from = 1, to = Long.MAX_VALUE) int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            synchronized (this.lock) {
                this.maxSize = i5;
                r2 r2Var = r2.f19517a;
            }
            trimToSize(i5);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final int size() {
        int i5;
        synchronized (this.lock) {
            i5 = this.size;
        }
        return i5;
    }

    protected int sizeOf(@l K key, @l V value) {
        l0.p(key, "key");
        l0.p(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            r2 r2Var = r2.f19517a;
        }
        return linkedHashMap;
    }

    @l
    public String toString() {
        int i5;
        String str;
        synchronized (this.lock) {
            int i6 = this.hitCount;
            int i7 = this.missCount + i6;
            if (i7 != 0) {
                i5 = (i6 * 100) / i7;
            } else {
                i5 = 0;
            }
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i5 + "%]";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            androidx.collection.internal.Lock r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L67
            r2 = 1
            if (r1 < 0) goto L16
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L67
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L14
            int r1 = r6.size     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L16
        L14:
            r1 = r2
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L5b
            int r1 = r6.size     // Catch: java.lang.Throwable -> L67
            if (r1 <= r7) goto L59
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L67
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L26
            goto L59
        L26:
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L67
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L67
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = kotlin.collections.u.B2(r1)     // Catch: java.lang.Throwable -> L67
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L38
            monitor-exit(r0)
            return
        L38:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L67
            androidx.collection.internal.LruHashMap<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L67
            r4.remove(r3)     // Catch: java.lang.Throwable -> L67
            int r4 = r6.size     // Catch: java.lang.Throwable -> L67
            int r5 = r6.safeSizeOf(r3, r1)     // Catch: java.lang.Throwable -> L67
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L67
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L67
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L67
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L0
        L59:
            monitor-exit(r0)
            return
        L5b:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L67
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L67
            throw r1     // Catch: java.lang.Throwable -> L67
        L67:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
