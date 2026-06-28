package androidx.compose.runtime.collection;

import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a \u0010\u0007\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0086\b\u001a@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0006\u0010\f\u001a\u00020\u00012\u0014\b\b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\rH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u0001H\u0086\b\u001a2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\b\u0018\u00012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"", "", "index", "Lkotlin/r2;", "checkIndex", "fromIndex", "toIndex", "checkSubIndex", "T", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "size", "Lkotlin/Function1;", "init", "mutableVectorOf", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i5) {
        l0.y(0, "T?");
        return new MutableVector<>(new Object[i5], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 16;
        }
        l0.y(0, "T?");
        return new MutableVector(new Object[i5], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i5) {
        int size = list.size();
        if (i5 >= 0 && i5 < size) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " is out of bounds. The list has " + size + " elements.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i5, int i6) {
        int size = list.size();
        if (i5 <= i6) {
            if (i5 >= 0) {
                if (i6 <= size) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is more than than the list size (" + size + ')');
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i5 + ") is less than 0.");
        }
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i5, l<? super Integer, ? extends T> lVar) {
        l0.y(0, "T");
        Object[] objArr = new Object[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = lVar.invoke(Integer.valueOf(i6));
        }
        return new MutableVector<>(objArr, i5);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        l0.y(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
