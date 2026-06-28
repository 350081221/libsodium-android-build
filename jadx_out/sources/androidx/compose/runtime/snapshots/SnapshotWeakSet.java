package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.WeakReference;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.o;
import kotlin.i0;
import p4.l;
import p4.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000fH\u0086\bJ\u000f\u0010\u0015\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R0\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$0#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "", "T", t0.b.f22420d, "", "hash", "find", "(Ljava/lang/Object;I)I", "midIndex", "valueHash", "findExactIndex", "(ILjava/lang/Object;I)I", "", "add", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "block", "Lkotlin/r2;", "removeIf", "isValid$runtime_release", "()Z", "isValid", "size", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "(I)V", "", "hashes", "[I", "getHashes$runtime_release", "()[I", "setHashes$runtime_release", "([I)V", "", "Landroidx/compose/runtime/WeakReference;", "values", "[Landroidx/compose/runtime/WeakReference;", "getValues$runtime_release", "()[Landroidx/compose/runtime/WeakReference;", "setValues$runtime_release", "([Landroidx/compose/runtime/WeakReference;)V", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SnapshotWeakSet<T> {
    public static final int $stable = 8;
    private int size;

    @l
    private int[] hashes = new int[16];

    @l
    private WeakReference<T>[] values = new WeakReference[16];

    private final int find(T t5, int i5) {
        T t6;
        int i6 = this.size - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = this.hashes[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else if (i9 > i5) {
                i6 = i8 - 1;
            } else {
                WeakReference<T> weakReference = this.values[i8];
                if (weakReference != null) {
                    t6 = weakReference.get();
                } else {
                    t6 = null;
                }
                if (t5 == t6) {
                    return i8;
                }
                return findExactIndex(i8, t5, i5);
            }
        }
        return -(i7 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findExactIndex(int r4, T r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = 0
            r2 = -1
            if (r2 >= r0) goto L1d
            int[] r2 = r3.hashes
            r2 = r2[r0]
            if (r2 == r6) goto Ld
            goto L1d
        Ld:
            androidx.compose.runtime.WeakReference<T>[] r2 = r3.values
            r2 = r2[r0]
            if (r2 == 0) goto L17
            java.lang.Object r1 = r2.get()
        L17:
            if (r1 != r5) goto L1a
            return r0
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3f
            int[] r2 = r3.hashes
            r2 = r2[r4]
            if (r2 == r6) goto L2d
        L29:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L2d:
            androidx.compose.runtime.WeakReference<T>[] r2 = r3.values
            r2 = r2[r4]
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            goto L39
        L38:
            r2 = r1
        L39:
            if (r2 != r5) goto L3c
            return r4
        L3c:
            int r4 = r4 + 1
            goto L21
        L3f:
            int r4 = r3.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotWeakSet.findExactIndex(int, java.lang.Object, int):int");
    }

    public final boolean add(@l T t5) {
        int i5;
        int i6 = this.size;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(t5);
        if (i6 > 0) {
            i5 = find(t5, identityHashCode);
            if (i5 >= 0) {
                return false;
            }
        } else {
            i5 = -1;
        }
        int i7 = -(i5 + 1);
        WeakReference<T>[] weakReferenceArr = this.values;
        int length = weakReferenceArr.length;
        if (i6 == length) {
            int i8 = length * 2;
            WeakReference<T>[] weakReferenceArr2 = new WeakReference[i8];
            int[] iArr = new int[i8];
            int i9 = i7 + 1;
            o.B0(weakReferenceArr, weakReferenceArr2, i9, i7, i6);
            o.K0(this.values, weakReferenceArr2, 0, 0, i7, 6, null);
            o.z0(this.hashes, iArr, i9, i7, i6);
            o.I0(this.hashes, iArr, 0, 0, i7, 6, null);
            this.values = weakReferenceArr2;
            this.hashes = iArr;
        } else {
            int i10 = i7 + 1;
            o.B0(weakReferenceArr, weakReferenceArr, i10, i7, i6);
            int[] iArr2 = this.hashes;
            o.z0(iArr2, iArr2, i10, i7, i6);
        }
        this.values[i7] = new WeakReference<>(t5);
        this.hashes[i7] = identityHashCode;
        this.size++;
        return true;
    }

    @l
    public final int[] getHashes$runtime_release() {
        return this.hashes;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    @l
    public final WeakReference<T>[] getValues$runtime_release() {
        return this.values;
    }

    @p
    public final boolean isValid$runtime_release() {
        WeakReference<T> weakReference;
        int i5 = this.size;
        WeakReference<T>[] weakReferenceArr = this.values;
        int[] iArr = this.hashes;
        int length = weakReferenceArr.length;
        if (i5 > length) {
            return false;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        while (i7 < i5) {
            int i8 = iArr[i7];
            if (i8 < i6 || (weakReference = weakReferenceArr[i7]) == null) {
                return false;
            }
            T t5 = weakReference.get();
            if (t5 != null && i8 != ActualJvm_jvmKt.identityHashCode(t5)) {
                return false;
            }
            i7++;
            i6 = i8;
        }
        while (i5 < length) {
            if (iArr[i5] != 0 || weakReferenceArr[i5] != null) {
                return false;
            }
            i5++;
        }
        return true;
    }

    public final void removeIf(@l v3.l<? super T, Boolean> lVar) {
        int size$runtime_release = getSize$runtime_release();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            T t5 = null;
            if (i5 >= size$runtime_release) {
                break;
            }
            WeakReference<T> weakReference = getValues$runtime_release()[i5];
            if (weakReference != null) {
                t5 = weakReference.get();
            }
            if (t5 != null && !lVar.invoke(t5).booleanValue()) {
                if (i6 != i5) {
                    getValues$runtime_release()[i6] = weakReference;
                    getHashes$runtime_release()[i6] = getHashes$runtime_release()[i5];
                }
                i6++;
            }
            i5++;
        }
        for (int i7 = i6; i7 < size$runtime_release; i7++) {
            getValues$runtime_release()[i7] = null;
            getHashes$runtime_release()[i7] = 0;
        }
        if (i6 != size$runtime_release) {
            setSize$runtime_release(i6);
        }
    }

    public final void setHashes$runtime_release(@l int[] iArr) {
        this.hashes = iArr;
    }

    public final void setSize$runtime_release(int i5) {
        this.size = i5;
    }

    public final void setValues$runtime_release(@l WeakReference<T>[] weakReferenceArr) {
        this.values = weakReferenceArr;
    }
}
