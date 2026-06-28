package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0017\u0010\u0018B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u001aJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/collection/IntMap;", "E", "", "", DatabaseFileArchive.COLUMN_KEY, "", "contains", "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", b.f22420d, "Lkotlin/r2;", "set", "(ILjava/lang/Object;)V", "remove", "clear", "Landroid/util/SparseArray;", "sparseArray", "Landroid/util/SparseArray;", "getSize", "()I", "size", "<init>", "(Landroid/util/SparseArray;)V", "initialCapacity", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntMap<E> {
    public static final int $stable = 8;

    @l
    private final SparseArray<E> sparseArray;

    private IntMap(SparseArray<E> sparseArray) {
        this.sparseArray = sparseArray;
    }

    public final void clear() {
        this.sparseArray.clear();
    }

    public final boolean contains(int i5) {
        return this.sparseArray.indexOfKey(i5) >= 0;
    }

    @m
    public final E get(int i5) {
        return this.sparseArray.get(i5);
    }

    public final int getSize() {
        return this.sparseArray.size();
    }

    public final void remove(int i5) {
        this.sparseArray.remove(i5);
    }

    public final void set(int i5, E e5) {
        this.sparseArray.put(i5, e5);
    }

    public final E get(int i5, E e5) {
        return this.sparseArray.get(i5, e5);
    }

    public IntMap(int i5) {
        this(new SparseArray(i5));
    }

    public /* synthetic */ IntMap(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 10 : i5);
    }
}
