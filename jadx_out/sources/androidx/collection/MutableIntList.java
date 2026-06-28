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

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0001J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\nJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001J\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0086\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001J\u001b\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0007R\u0012\u0010\u000f\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "", "element", "", "add", "index", "Lkotlin/r2;", "", "elements", "addAll", "plusAssign", "clear", "minCapacity", "trim", "capacity", "ensureCapacity", "minusAssign", "remove", "removeAll", "removeAt", "start", "end", "removeRange", "retainAll", "set", "sort", "sortDescending", "getCapacity", "()I", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntList(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 16 : i5);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = mutableIntList._size;
        }
        mutableIntList.trim(i5);
    }

    public final boolean add(int i5) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i6 = this._size;
        iArr[i6] = i5;
        this._size = i6 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l int[] elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(this._size + elements.length);
            int[] iArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                o.z0(iArr, iArr, elements.length + i5, i5, i6);
            }
            o.I0(elements, iArr, i5, 0, 0, 12, null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i5) {
        int[] iArr = this.content;
        if (iArr.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i5, (iArr.length * 3) / 2));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i5) {
        remove(i5);
    }

    public final void plusAssign(@l IntList elements) {
        l0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i5) {
        int indexOf = indexOf(i5);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@l int[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        for (int i6 : elements) {
            remove(i6);
        }
        return i5 != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            int[] iArr = this.content;
            int i6 = iArr[i5];
            int i7 = this._size;
            if (i5 != i7 - 1) {
                o.z0(iArr, iArr, i5, i5 + 1, i7);
            }
            this._size--;
            return i6;
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
                            int[] iArr = this.content;
                            o.z0(iArr, iArr, i5, i6, i7);
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

    public final boolean retainAll(@l int[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        int[] iArr = this.content;
        int i6 = i5 - 1;
        while (true) {
            int i7 = -1;
            if (-1 >= i6) {
                break;
            }
            int i8 = iArr[i6];
            int length = elements.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (elements[i9] == i8) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
            if (i7 < 0) {
                removeAt(i6);
            }
            i6--;
        }
        return i5 != this._size;
    }

    public final int set(@IntRange(from = 0) int i5, int i6) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this._size) {
            z4 = true;
        }
        if (z4) {
            int[] iArr = this.content;
            int i7 = iArr[i5];
            iArr[i5] = i6;
            return i7;
        }
        throw new IndexOutOfBoundsException("set index " + i5 + " must be between 0 .. " + (this._size - 1));
    }

    public final void sort() {
        o.P3(this.content, 0, this._size);
    }

    public final void sortDescending() {
        p.zu(this.content, 0, this._size);
    }

    public final void trim(int i5) {
        int max = Math.max(i5, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public MutableIntList(int i5) {
        super(i5, null);
    }

    public final void minusAssign(@l int[] elements) {
        l0.p(elements, "elements");
        for (int i5 : elements) {
            remove(i5);
        }
    }

    public final void plusAssign(@l int[] elements) {
        l0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(int i5) {
        add(i5);
    }

    public final void add(@IntRange(from = 0) int i5, int i6) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= this._size) {
            z4 = true;
        }
        if (z4) {
            ensureCapacity(this._size + 1);
            int[] iArr = this.content;
            int i7 = this._size;
            if (i5 != i7) {
                o.z0(iArr, iArr, i5 + 1, i5, i7);
            }
            iArr[i5] = i6;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final void minusAssign(@l IntList elements) {
        l0.p(elements, "elements");
        int[] iArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            remove(iArr[i6]);
        }
    }

    public final boolean removeAll(@l IntList elements) {
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

    public final boolean retainAll(@l IntList elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        int[] iArr = this.content;
        for (int i6 = i5 - 1; -1 < i6; i6--) {
            if (!elements.contains(iArr[i6])) {
                removeAt(i6);
            }
        }
        return i5 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i5, @l IntList elements) {
        l0.p(elements, "elements");
        if (i5 >= 0 && i5 <= this._size) {
            if (elements.isEmpty()) {
                return false;
            }
            ensureCapacity(this._size + elements._size);
            int[] iArr = this.content;
            int i6 = this._size;
            if (i5 != i6) {
                o.z0(iArr, iArr, elements._size + i5, i5, i6);
            }
            o.z0(elements.content, iArr, i5, 0, elements._size);
            this._size += elements._size;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " must be in 0.." + this._size);
    }

    public final boolean addAll(@l IntList elements) {
        l0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@l int[] elements) {
        l0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
