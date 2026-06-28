package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Arrays;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002J\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006J\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001H\u0086\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001J\u001b\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bR\u0012\u0010\u0010\u001a\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "", "element", "", "add", "", "index", "Lkotlin/r2;", "", "elements", "addAll", "plusAssign", "clear", "minCapacity", "trim", "capacity", "ensureCapacity", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "retainAll", "set", "sort", "sortDescending", "getCapacity", "()I", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13607#3,2:972\n1675#3,6:983\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongList(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 16 : i5);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = mutableLongList._size;
        }
        mutableLongList.trim(i5);
    }

    public final boolean add(long j5) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i5 = this._size;
        jArr[i5] = j5;
        this._size = i5 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l long[] elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(this._size + elements.length);
            long[] jArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                o.A0(jArr, jArr, elements.length + i5, i5, i6);
            }
            o.J0(elements, jArr, i5, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i5) {
        long[] jArr = this.content;
        if (jArr.length < i5) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i5, (jArr.length * 3) / 2));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j5) {
        remove(j5);
    }

    public final void plusAssign(@l LongList elements) {
        l0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j5) {
        int indexOf = indexOf(j5);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@l long[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        for (long j5 : elements) {
            remove(j5);
        }
        return i5 != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            long[] jArr = this.content;
            long j5 = jArr[i5];
            int i6 = this._size;
            if (i5 != i6 - 1) {
                o.A0(jArr, jArr, i5, i5 + 1, i6);
            }
            this._size--;
            return j5;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + (this._size - 1));
    }

    public final void removeRange(@IntRange(from = 0) int i5, @IntRange(from = 0) int i6) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0 && i5 <= this._size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 < 0 || i6 > this._size) {
                z5 = false;
            }
            if (z5) {
                if (i6 >= i5) {
                    if (i6 != i5) {
                        int i7 = this._size;
                        if (i6 < i7) {
                            long[] jArr = this.content;
                            o.A0(jArr, jArr, i5, i6, i7);
                        }
                        this._size -= i6 - i5;
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Start (" + i5 + ") is more than end (" + i6 + ')');
            }
        }
        throw new IndexOutOfBoundsException("Start (" + i5 + ") and end (" + i6 + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(@l long[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        long[] jArr = this.content;
        int i6 = i5 - 1;
        while (true) {
            int i7 = -1;
            if (-1 >= i6) {
                break;
            }
            long j5 = jArr[i6];
            int length = elements.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (elements[i8] == j5) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            if (i7 < 0) {
                removeAt(i6);
            }
            i6--;
        }
        return i5 != this._size;
    }

    public final long set(@IntRange(from = 0) int i5, long j5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            long[] jArr = this.content;
            long j6 = jArr[i5];
            jArr[i5] = j5;
            return j6;
        }
        throw new IndexOutOfBoundsException("set index " + i5 + " must be between 0 .. " + (this._size - 1));
    }

    public final void sort() {
        o.R3(this.content, 0, this._size);
    }

    public final void sortDescending() {
        p.Bu(this.content, 0, this._size);
    }

    public final void trim(int i5) {
        int max = Math.max(i5, this._size);
        long[] jArr = this.content;
        if (jArr.length > max) {
            long[] copyOf = Arrays.copyOf(jArr, max);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public MutableLongList(int i5) {
        super(i5, null);
    }

    public final void minusAssign(@l long[] elements) {
        l0.p(elements, "elements");
        for (long j5 : elements) {
            remove(j5);
        }
    }

    public final void plusAssign(@l long[] elements) {
        l0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(long j5) {
        add(j5);
    }

    public final void add(@IntRange(from = 0) int i5, long j5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= this._size) {
            z4 = true;
        }
        if (z4) {
            ensureCapacity(this._size + 1);
            long[] jArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                o.A0(jArr, jArr, i5 + 1, i5, i6);
            }
            jArr[i5] = j5;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final void minusAssign(@l LongList elements) {
        l0.p(elements, "elements");
        long[] jArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            remove(jArr[i6]);
        }
    }

    public final boolean removeAll(@l LongList elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        int i6 = elements._size - 1;
        if (i6 >= 0) {
            int i7 = 0;
            while (true) {
                remove(elements.get(i7));
                if (i7 == i6) {
                    break;
                }
                i7++;
            }
        }
        return i5 != this._size;
    }

    public final boolean retainAll(@l LongList elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        long[] jArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!elements.contains(jArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l LongList elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            long[] jArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                o.A0(jArr, jArr, elements._size + i5, i5, i6);
            }
            o.A0(elements.content, jArr, i5, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final boolean addAll(@l LongList elements) {
        l0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@l long[] elements) {
        l0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
