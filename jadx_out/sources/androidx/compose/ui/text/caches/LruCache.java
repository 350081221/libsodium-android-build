package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import o0.a;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.h;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b9\u0010:J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\rJ1\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\rJ\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\bJ\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u0006J\u0006\u0010\u001f\u001a\u00020\u0006J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 J\b\u0010#\u001a\u00020\"H\u0016J$\u0010)\u001a\u00028\u0002\"\u0004\b\u0002\u0010$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00020%H\u0080\b¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00103\u001a\u0012\u0012\u0004\u0012\u00028\u000001j\b\u0012\u0004\u0012\u00028\u0000`28\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00107R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00107R\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00107¨\u0006;"}, d2 = {"Landroidx/compose/ui/text/caches/LruCache;", "K", "V", "", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "maxSize", "Lkotlin/r2;", "resize", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "evictAll", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "", "toString", "R", "Lkotlin/Function0;", "block", "synchronizedValue$ui_text_release", "(Lv3/a;)Ljava/lang/Object;", "synchronizedValue", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "monitor", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "keySet", "Ljava/util/LinkedHashSet;", "<set-?>", "size", "I", "()I", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n348#1:352\n348#1:361\n348#1:363\n348#1:365\n348#1:367\n348#1:369\n348#1:371\n26#2:353\n26#2:355\n26#2:356\n26#2:357\n26#2:358\n26#2:359\n26#2:360\n26#2:362\n26#2:364\n26#2:366\n26#2:368\n26#2:370\n26#2:372\n26#2:373\n26#2:374\n26#2:375\n1#3:354\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n40#1:352\n295#1:361\n301#1:363\n307#1:365\n312#1:367\n317#1:369\n322#1:371\n40#1:353\n71#1:355\n86#1:356\n104#1:357\n142#1:358\n176#1:359\n218#1:360\n295#1:362\n301#1:364\n307#1:366\n312#1:368\n317#1:370\n322#1:372\n329#1:373\n339#1:374\n348#1:375\n*E\n"})
/* loaded from: classes.dex */
public class LruCache<K, V> {
    public static final int $stable = 8;
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @l
    private final LinkedHashSet<K> keySet;

    @l
    private final HashMap<K, V> map;
    private int maxSize;
    private int missCount;

    @l
    private final SynchronizedObject monitor = Synchronization_jvmKt.createSynchronizedObject();
    private int putCount;
    private int size;

    public LruCache(int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.maxSize = i5;
            this.map = new HashMap<>(0, 0.75f);
            this.keySet = new LinkedHashSet<>();
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
        throw new IllegalStateException(("Negative size: " + k5 + a.f20835h + v4).toString());
    }

    @m
    protected V create(K k5) {
        return null;
    }

    public final int createCount() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.createCount;
        }
        return i5;
    }

    protected void entryRemoved(boolean z4, K k5, V v4, @m V v5) {
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.evictionCount;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final V get(K k5) {
        synchronized (this.monitor) {
            V v4 = this.map.get(k5);
            if (v4 != null) {
                this.keySet.remove(k5);
                this.keySet.add(k5);
                this.hitCount++;
                return v4;
            }
            this.missCount++;
            V create = create(k5);
            if (create == null) {
                return null;
            }
            synchronized (this.monitor) {
                this.createCount++;
                Object put = this.map.put(k5, create);
                this.keySet.remove(k5);
                this.keySet.add(k5);
                if (put != 0) {
                    this.map.put(k5, put);
                    v4 = put;
                } else {
                    this.size = size() + safeSizeOf(k5, create);
                }
                r2 r2Var = r2.f19517a;
            }
            if (v4 != null) {
                entryRemoved(false, k5, create, v4);
                return v4;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.hitCount;
        }
        return i5;
    }

    public final int maxSize() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.maxSize;
        }
        return i5;
    }

    public final int missCount() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.missCount;
        }
        return i5;
    }

    @m
    public final V put(K k5, V v4) {
        V put;
        if (k5 != null && v4 != null) {
            synchronized (this.monitor) {
                this.putCount++;
                this.size = size() + safeSizeOf(k5, v4);
                put = this.map.put(k5, v4);
                if (put != null) {
                    this.size = size() - safeSizeOf(k5, put);
                }
                if (this.keySet.contains(k5)) {
                    this.keySet.remove(k5);
                }
                this.keySet.add(k5);
            }
            if (put != null) {
                entryRemoved(false, k5, put, v4);
            }
            trimToSize(this.maxSize);
            return put;
        }
        throw null;
    }

    public final int putCount() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.putCount;
        }
        return i5;
    }

    @m
    public final V remove(K k5) {
        V remove;
        k5.getClass();
        synchronized (this.monitor) {
            remove = this.map.remove(k5);
            this.keySet.remove(k5);
            if (remove != null) {
                this.size = size() - safeSizeOf(k5, remove);
            }
            r2 r2Var = r2.f19517a;
        }
        if (remove != null) {
            entryRemoved(false, k5, remove, null);
        }
        return remove;
    }

    public void resize(int i5) {
        boolean z4;
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            synchronized (this.monitor) {
                this.maxSize = i5;
                r2 r2Var = r2.f19517a;
            }
            trimToSize(i5);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    @h(name = "size")
    public final int size() {
        int i5;
        synchronized (this.monitor) {
            i5 = this.size;
        }
        return i5;
    }

    protected int sizeOf(K k5, V v4) {
        return 1;
    }

    @l
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.monitor) {
            linkedHashMap = new LinkedHashMap();
            Iterator<K> it = this.keySet.iterator();
            while (it.hasNext()) {
                K next = it.next();
                V v4 = this.map.get(next);
                l0.m(v4);
                linkedHashMap.put(next, v4);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(@l v3.a<? extends R> aVar) {
        R invoke;
        synchronized (this.monitor) {
            try {
                invoke = aVar.invoke();
                kotlin.jvm.internal.i0.d(1);
            } catch (Throwable th) {
                kotlin.jvm.internal.i0.d(1);
                kotlin.jvm.internal.i0.c(1);
                throw th;
            }
        }
        kotlin.jvm.internal.i0.c(1);
        return invoke;
    }

    @l
    public String toString() {
        int i5;
        String str;
        synchronized (this.monitor) {
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r8) {
        /*
            r7 = this;
        L0:
            androidx.compose.ui.text.platform.SynchronizedObject r0 = r7.monitor
            monitor-enter(r0)
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.keySet     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.size()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.map     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = kotlin.collections.u.w2(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.map     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.map     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = kotlin.jvm.internal.u1.k(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.keySet     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = kotlin.jvm.internal.u1.a(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.l0.m(r1)     // Catch: java.lang.Throwable -> L91
            kotlin.jvm.internal.l0.m(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.safeSizeOf(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.size = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.evictionCount     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.evictionCount = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            kotlin.r2 r5 = kotlin.r2.f19517a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            kotlin.jvm.internal.l0.m(r1)
            kotlin.jvm.internal.l0.m(r4)
            r7.entryRemoved(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.caches.LruCache.trimToSize(int):void");
    }
}
