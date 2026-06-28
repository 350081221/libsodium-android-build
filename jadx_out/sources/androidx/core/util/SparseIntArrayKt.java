package androidx.core.util;

import android.util.SparseIntArray;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import v3.p;

@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0086\b\u001a#\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0086\b\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aE\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001b\u001a\u00020\u0019*\u00020\u0000\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroid/util/SparseIntArray;", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", t0.b.f22420d, "Lkotlin/r2;", "set", "other", "plus", "containsKey", "containsValue", "defaultValue", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "isEmpty", "isNotEmpty", "remove", "putAll", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/s0;", "keyIterator", "valueIterator", "getSize", "(Landroid/util/SparseIntArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseIntArrayKt {
    public static final boolean contains(@l SparseIntArray sparseIntArray, int i5) {
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsKey(@l SparseIntArray sparseIntArray, int i5) {
        return sparseIntArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsValue(@l SparseIntArray sparseIntArray, int i5) {
        return sparseIntArray.indexOfValue(i5) >= 0;
    }

    public static final void forEach(@l SparseIntArray sparseIntArray, @l p<? super Integer, ? super Integer, r2> pVar) {
        int size = sparseIntArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(sparseIntArray.keyAt(i5)), Integer.valueOf(sparseIntArray.valueAt(i5)));
        }
    }

    public static final int getOrDefault(@l SparseIntArray sparseIntArray, int i5, int i6) {
        return sparseIntArray.get(i5, i6);
    }

    public static final int getOrElse(@l SparseIntArray sparseIntArray, int i5, @l v3.a<Integer> aVar) {
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : aVar.invoke().intValue();
    }

    public static final int getSize(@l SparseIntArray sparseIntArray) {
        return sparseIntArray.size();
    }

    public static final boolean isEmpty(@l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() == 0;
    }

    public static final boolean isNotEmpty(@l SparseIntArray sparseIntArray) {
        return sparseIntArray.size() != 0;
    }

    @l
    public static final s0 keyIterator(@l final SparseIntArray sparseIntArray) {
        return new s0() { // from class: androidx.core.util.SparseIntArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseIntArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final SparseIntArray plus(@l SparseIntArray sparseIntArray, @l SparseIntArray sparseIntArray2) {
        SparseIntArray sparseIntArray3 = new SparseIntArray(sparseIntArray.size() + sparseIntArray2.size());
        putAll(sparseIntArray3, sparseIntArray);
        putAll(sparseIntArray3, sparseIntArray2);
        return sparseIntArray3;
    }

    public static final void putAll(@l SparseIntArray sparseIntArray, @l SparseIntArray sparseIntArray2) {
        int size = sparseIntArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseIntArray.put(sparseIntArray2.keyAt(i5), sparseIntArray2.valueAt(i5));
        }
    }

    public static final boolean remove(@l SparseIntArray sparseIntArray, int i5, int i6) {
        int indexOfKey = sparseIntArray.indexOfKey(i5);
        if (indexOfKey >= 0 && i6 == sparseIntArray.valueAt(indexOfKey)) {
            sparseIntArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final void set(@l SparseIntArray sparseIntArray, int i5, int i6) {
        sparseIntArray.put(i5, i6);
    }

    @l
    public static final s0 valueIterator(@l final SparseIntArray sparseIntArray) {
        return new s0() { // from class: androidx.core.util.SparseIntArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseIntArray.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseIntArray sparseIntArray2 = sparseIntArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseIntArray2.valueAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }
}
