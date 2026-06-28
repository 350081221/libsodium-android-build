package androidx.core.util;

import android.util.SparseArray;
import java.util.Iterator;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a!\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b\u001a(\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a-\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aQ\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u001aH\u0086\b\u001a\u0016\u0010 \u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"T", "Landroid/util/SparseArray;", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", t0.b.f22420d, "Lkotlin/r2;", "set", "(Landroid/util/SparseArray;ILjava/lang/Object;)V", "other", "plus", "containsKey", "containsValue", "(Landroid/util/SparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/SparseArray;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/SparseArray;ILv3/a;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "remove", "(Landroid/util/SparseArray;ILjava/lang/Object;)Z", "putAll", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/s0;", "keyIterator", "", "valueIterator", "getSize", "(Landroid/util/SparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n1#1,94:1\n76#1,4:95\n*S KotlinDebug\n*F\n+ 1 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n*L\n72#1:95,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@l SparseArray<T> sparseArray, int i5) {
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean containsKey(@l SparseArray<T> sparseArray, int i5) {
        return sparseArray.indexOfKey(i5) >= 0;
    }

    public static final <T> boolean containsValue(@l SparseArray<T> sparseArray, T t5) {
        return sparseArray.indexOfValue(t5) >= 0;
    }

    public static final <T> void forEach(@l SparseArray<T> sparseArray, @l p<? super Integer, ? super T, r2> pVar) {
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            pVar.invoke(Integer.valueOf(sparseArray.keyAt(i5)), sparseArray.valueAt(i5));
        }
    }

    public static final <T> T getOrDefault(@l SparseArray<T> sparseArray, int i5, T t5) {
        T t6 = sparseArray.get(i5);
        return t6 == null ? t5 : t6;
    }

    public static final <T> T getOrElse(@l SparseArray<T> sparseArray, int i5, @l v3.a<? extends T> aVar) {
        T t5 = sparseArray.get(i5);
        return t5 == null ? aVar.invoke() : t5;
    }

    public static final <T> int getSize(@l SparseArray<T> sparseArray) {
        return sparseArray.size();
    }

    public static final <T> boolean isEmpty(@l SparseArray<T> sparseArray) {
        return sparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@l SparseArray<T> sparseArray) {
        return sparseArray.size() != 0;
    }

    @l
    public static final <T> s0 keyIterator(@l final SparseArray<T> sparseArray) {
        return new s0() { // from class: androidx.core.util.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArray.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseArray<T> sparseArray2 = sparseArray;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseArray2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final <T> SparseArray<T> plus(@l SparseArray<T> sparseArray, @l SparseArray<T> sparseArray2) {
        SparseArray<T> sparseArray3 = new SparseArray<>(sparseArray.size() + sparseArray2.size());
        putAll(sparseArray3, sparseArray);
        putAll(sparseArray3, sparseArray2);
        return sparseArray3;
    }

    public static final <T> void putAll(@l SparseArray<T> sparseArray, @l SparseArray<T> sparseArray2) {
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseArray.put(sparseArray2.keyAt(i5), sparseArray2.valueAt(i5));
        }
    }

    public static final <T> boolean remove(@l SparseArray<T> sparseArray, int i5, T t5) {
        int indexOfKey = sparseArray.indexOfKey(i5);
        if (indexOfKey >= 0 && l0.g(t5, sparseArray.valueAt(indexOfKey))) {
            sparseArray.removeAt(indexOfKey);
            return true;
        }
        return false;
    }

    public static final <T> void set(@l SparseArray<T> sparseArray, int i5, T t5) {
        sparseArray.put(i5, t5);
    }

    @l
    public static final <T> Iterator<T> valueIterator(@l SparseArray<T> sparseArray) {
        return new SparseArrayKt$valueIterator$1(sparseArray);
    }
}
