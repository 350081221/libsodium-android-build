package androidx.core.util;

import android.util.SparseBooleanArray;
import kotlin.collections.r;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0086\b\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0086\b\u001a\r\u0010\u0010\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u0003*\u00020\u0000H\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000\u001aE\u0010\u0018\u001a\u00020\u0006*\u00020\u000026\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0014H\u0086\b\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0000\u001a\n\u0010\u001c\u001a\u00020\u001b*\u00020\u0000\"\u0016\u0010\u001f\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroid/util/SparseBooleanArray;", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", t0.b.f22420d, "Lkotlin/r2;", "set", "other", "plus", "containsKey", "containsValue", "defaultValue", "getOrDefault", "Lkotlin/Function0;", "getOrElse", "isEmpty", "isNotEmpty", "remove", "putAll", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/s0;", "keyIterator", "Lkotlin/collections/r;", "valueIterator", "getSize", "(Landroid/util/SparseBooleanArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseBooleanArrayKt {
    public static final boolean contains(@l SparseBooleanArray sparseBooleanArray, int i5) {
        return sparseBooleanArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsKey(@l SparseBooleanArray sparseBooleanArray, int i5) {
        return sparseBooleanArray.indexOfKey(i5) >= 0;
    }

    public static final boolean containsValue(@l SparseBooleanArray sparseBooleanArray, boolean z4) {
        return sparseBooleanArray.indexOfValue(z4) >= 0;
    }

    public static final void forEach(@l SparseBooleanArray sparseBooleanArray, @l p<? super Integer, ? super Boolean, r2> pVar) {
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(sparseBooleanArray.keyAt(i5)), Boolean.valueOf(sparseBooleanArray.valueAt(i5)));
        }
    }

    public static final boolean getOrDefault(@l SparseBooleanArray sparseBooleanArray, int i5, boolean z4) {
        return sparseBooleanArray.get(i5, z4);
    }

    public static final boolean getOrElse(@l SparseBooleanArray sparseBooleanArray, int i5, @l v3.a<Boolean> aVar) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i5);
        return indexOfKey >= 0 ? sparseBooleanArray.valueAt(indexOfKey) : aVar.invoke().booleanValue();
    }

    public static final int getSize(@l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size();
    }

    public static final boolean isEmpty(@l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() == 0;
    }

    public static final boolean isNotEmpty(@l SparseBooleanArray sparseBooleanArray) {
        return sparseBooleanArray.size() != 0;
    }

    @l
    public static final s0 keyIterator(@l final SparseBooleanArray sparseBooleanArray) {
        return new s0() { // from class: androidx.core.util.SparseBooleanArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseBooleanArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final SparseBooleanArray plus(@l SparseBooleanArray sparseBooleanArray, @l SparseBooleanArray sparseBooleanArray2) {
        SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray(sparseBooleanArray.size() + sparseBooleanArray2.size());
        putAll(sparseBooleanArray3, sparseBooleanArray);
        putAll(sparseBooleanArray3, sparseBooleanArray2);
        return sparseBooleanArray3;
    }

    public static final void putAll(@l SparseBooleanArray sparseBooleanArray, @l SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseBooleanArray.put(sparseBooleanArray2.keyAt(i5), sparseBooleanArray2.valueAt(i5));
        }
    }

    public static final boolean remove(@l SparseBooleanArray sparseBooleanArray, int i5, boolean z4) {
        int indexOfKey = sparseBooleanArray.indexOfKey(i5);
        if (indexOfKey >= 0 && z4 == sparseBooleanArray.valueAt(indexOfKey)) {
            sparseBooleanArray.delete(i5);
            return true;
        }
        return false;
    }

    public static final void set(@l SparseBooleanArray sparseBooleanArray, int i5, boolean z4) {
        sparseBooleanArray.put(i5, z4);
    }

    @l
    public static final r valueIterator(@l final SparseBooleanArray sparseBooleanArray) {
        return new r() { // from class: androidx.core.util.SparseBooleanArrayKt$valueIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseBooleanArray.size();
            }

            @Override // kotlin.collections.r
            public boolean nextBoolean() {
                SparseBooleanArray sparseBooleanArray2 = sparseBooleanArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseBooleanArray2.valueAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }
}
