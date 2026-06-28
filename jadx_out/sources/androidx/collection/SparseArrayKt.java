package androidx.collection;

import java.util.Iterator;
import kotlin.collections.s0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n\u001a0\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a0\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b\u001a/\u0010\u0013\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aT\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\u0018\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0015H\u0086\bø\u0001\u0000\u001a\u0016\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\"\"\u0010 \u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"T", "Landroidx/collection/SparseArrayCompat;", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", b.f22420d, "Lkotlin/r2;", "set", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "plus", "defaultValue", "getOrDefault", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroidx/collection/SparseArrayCompat;ILv3/a;)Ljava/lang/Object;", "isNotEmpty", "remove", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Z", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "action", "forEach", "Lkotlin/collections/s0;", "keyIterator", "", "valueIterator", "getSize", "(Landroidx/collection/SparseArrayCompat;)I", "size", "collection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SparseArrayKt {
    public static final <T> boolean contains(@l SparseArrayCompat<T> sparseArrayCompat, int i5) {
        l0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.containsKey(i5);
    }

    public static final <T> void forEach(@l SparseArrayCompat<T> sparseArrayCompat, @l p<? super Integer, ? super T, r2> action) {
        l0.p(sparseArrayCompat, "<this>");
        l0.p(action, "action");
        int size = sparseArrayCompat.size();
        for (int i5 = 0; i5 < size; i5++) {
            action.invoke(Integer.valueOf(sparseArrayCompat.keyAt(i5)), sparseArrayCompat.valueAt(i5));
        }
    }

    public static final <T> T getOrDefault(@l SparseArrayCompat<T> sparseArrayCompat, int i5, T t5) {
        l0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.get(i5, t5);
    }

    public static final <T> T getOrElse(@l SparseArrayCompat<T> sparseArrayCompat, int i5, @l v3.a<? extends T> defaultValue) {
        l0.p(sparseArrayCompat, "<this>");
        l0.p(defaultValue, "defaultValue");
        T t5 = sparseArrayCompat.get(i5);
        if (t5 == null) {
            return defaultValue.invoke();
        }
        return t5;
    }

    public static final <T> int getSize(@l SparseArrayCompat<T> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size();
    }

    public static final <T> boolean isNotEmpty(@l SparseArrayCompat<T> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        return !sparseArrayCompat.isEmpty();
    }

    @l
    public static final <T> s0 keyIterator(@l final SparseArrayCompat<T> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        return new s0() { // from class: androidx.collection.SparseArrayKt$keyIterator$1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseArrayCompat.size();
            }

            @Override // kotlin.collections.s0
            public int nextInt() {
                SparseArrayCompat<T> sparseArrayCompat2 = sparseArrayCompat;
                int i5 = this.index;
                this.index = i5 + 1;
                return sparseArrayCompat2.keyAt(i5);
            }

            public final void setIndex(int i5) {
                this.index = i5;
            }
        };
    }

    @l
    public static final <T> SparseArrayCompat<T> plus(@l SparseArrayCompat<T> sparseArrayCompat, @l SparseArrayCompat<T> other) {
        l0.p(sparseArrayCompat, "<this>");
        l0.p(other, "other");
        SparseArrayCompat<T> sparseArrayCompat2 = new SparseArrayCompat<>(sparseArrayCompat.size() + other.size());
        sparseArrayCompat2.putAll(sparseArrayCompat);
        sparseArrayCompat2.putAll(other);
        return sparseArrayCompat2;
    }

    @k(level = m.HIDDEN, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(SparseArrayCompat sparseArrayCompat, int i5, Object obj) {
        l0.p(sparseArrayCompat, "<this>");
        return sparseArrayCompat.remove(i5, obj);
    }

    public static final <T> void set(@l SparseArrayCompat<T> sparseArrayCompat, int i5, T t5) {
        l0.p(sparseArrayCompat, "<this>");
        sparseArrayCompat.put(i5, t5);
    }

    @l
    public static final <T> Iterator<T> valueIterator(@l SparseArrayCompat<T> sparseArrayCompat) {
        l0.p(sparseArrayCompat, "<this>");
        return new SparseArrayKt$valueIterator$1(sparseArrayCompat);
    }
}
