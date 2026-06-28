package androidx.core.util;

import android.util.SparseLongArray;
import kotlin.collections.s0;
import kotlin.collections.t0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b\u001a\u001d\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0086\b\u001a#\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0012\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000\u001aE\u0010\u0019\u001a\u00020\u0007*\u00020\u000026\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0086\b\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0000\u001a\n\u0010\u001d\u001a\u00020\u001c*\u00020\u0000\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroid/util/SparseLongArray;", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", "", t0.b.f22420d, "Lkotlin/r2;", "set", "other", "plus", "containsKey", "containsValue", "defaultValue", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "isEmpty", "isNotEmpty", "remove", "putAll", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/s0;", "keyIterator", "Lkotlin/collections/t0;", "valueIterator", "getSize", "(Landroid/util/SparseLongArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(@l SparseLongArray sparseLongArray, int i5) {
        return sparseLongArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsKey(@l SparseLongArray sparseLongArray, int i5) {
        return sparseLongArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsValue(@l SparseLongArray sparseLongArray, long j5) {
        return sparseLongArray.indexOfValue(j5) >= 0;
    }

    public static final void forEach(@l SparseLongArray sparseLongArray, @l p<? super Integer, ? super Long, r2> pVar) {
        int size = sparseLongArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(sparseLongArray.keyAt(i5)), Long.valueOf(sparseLongArray.valueAt(i5)));
        }
    }

    public static final long getOrDefault(@l SparseLongArray sparseLongArray, int i5, long j5) {
        return sparseLongArray.get(i5, j5);
    }

    public static final long getOrElse(@l SparseLongArray sparseLongArray, int i5, @l v3.a<Long> aVar) {
        int indexOfKey = sparseLongArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseLongArray.valueAt(indexOfKey) : aVar.invoke().longValue();
    }

    public static final int getSize(@l SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(@l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(@l SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    @l
    public static final s0 keyIterator(@l final SparseLongArray sparseLongArray) {
        return new s0() { // from class: androidx.core.util.SparseLongArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseLongArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final SparseLongArray plus(@l SparseLongArray sparseLongArray, @l SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray.size() + sparseLongArray2.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(@l SparseLongArray sparseLongArray, @l SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i5), sparseLongArray2.valueAt(i5));
        }
    }

    public static final boolean remove(@l SparseLongArray sparseLongArray, int i5, long j5) {
        int indexOfKey = sparseLongArray.indexOfKey(i5);
        if (indexOfKey >= 0 && j5 == sparseLongArray.valueAt(indexOfKey)) {
            sparseLongArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(@l SparseLongArray sparseLongArray, int i5, long j5) {
        sparseLongArray.put(i5, j5);
    }

    @l
    public static final t0 valueIterator(@l final SparseLongArray sparseLongArray) {
        return new t0() { // from class: androidx.core.util.SparseLongArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // kotlin.collections.t0
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseLongArray2.valueAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }
}
