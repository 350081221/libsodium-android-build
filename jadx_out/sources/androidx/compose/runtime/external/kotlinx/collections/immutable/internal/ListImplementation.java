package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import u3.m;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\u00022\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00162\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "", "index", "size", "Lkotlin/r2;", "checkElementIndex$runtime_release", "(II)V", "checkElementIndex", "checkPositionIndex$runtime_release", "checkPositionIndex", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "(III)V", "checkRangeIndexes", "", "c", "orderedHashCode$runtime_release", "(Ljava/util/Collection;)I", "orderedHashCode", "other", "", "orderedEquals$runtime_release", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "orderedEquals", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ListImplementation {
    public static final int $stable = 0;

    @l
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    @m
    public static final void checkElementIndex$runtime_release(int i5, int i6) {
        if (i5 < 0 || i5 >= i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
    }

    @m
    public static final void checkPositionIndex$runtime_release(int i5, int i6) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
        }
    }

    @m
    public static final void checkRangeIndexes$runtime_release(int i5, int i6, int i7) {
        if (i5 >= 0 && i6 <= i7) {
            if (i5 <= i6) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i5 + " > toIndex: " + i6);
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i5 + ", toIndex: " + i6 + ", size: " + i7);
    }

    @m
    public static final boolean orderedEquals$runtime_release(@l Collection<?> collection, @l Collection<?> collection2) {
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator<?> it = collection2.iterator();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!l0.g(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @m
    public static final int orderedHashCode$runtime_release(@l Collection<?> collection) {
        int i5;
        int i6 = 1;
        for (Object obj : collection) {
            int i7 = i6 * 31;
            if (obj != null) {
                i5 = obj.hashCode();
            } else {
                i5 = 0;
            }
            i6 = i7 + i5;
        }
        return i6;
    }
}
