package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0080\b\u001a\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00072\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\u001a\u0006\u0010\u0010\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyIntArray", "", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "emptyIntSet", "Landroidx/collection/IntSet;", "hash", "", "k", "intSetOf", "element1", "element2", "element3", "elements", "mutableIntSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
/* loaded from: classes.dex */
public final class IntSetKt {

    @l
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    @l
    private static final int[] EmptyIntArray = new int[0];

    @l
    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    @l
    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final int hash(int i5) {
        int hashCode = Integer.hashCode(i5) * ScatterMapKt.MurmurHashC1;
        return hashCode ^ (hashCode << 16);
    }

    @l
    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    @l
    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    @l
    public static final IntSet intSetOf(int i5) {
        return mutableIntSetOf(i5);
    }

    @l
    public static final MutableIntSet mutableIntSetOf(int i5) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i5);
        return mutableIntSet;
    }

    @l
    public static final IntSet intSetOf(int i5, int i6) {
        return mutableIntSetOf(i5, i6);
    }

    @l
    public static final IntSet intSetOf(int i5, int i6, int i7) {
        return mutableIntSetOf(i5, i6, i7);
    }

    @l
    public static final MutableIntSet mutableIntSetOf(int i5, int i6) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i5);
        mutableIntSet.plusAssign(i6);
        return mutableIntSet;
    }

    @l
    public static final IntSet intSetOf(@l int... elements) {
        l0.p(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }

    @l
    public static final MutableIntSet mutableIntSetOf(int i5, int i6, int i7) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i5);
        mutableIntSet.plusAssign(i6);
        mutableIntSet.plusAssign(i7);
        return mutableIntSet;
    }

    @l
    public static final MutableIntSet mutableIntSetOf(@l int... elements) {
        l0.p(elements, "elements");
        MutableIntSet mutableIntSet = new MutableIntSet(elements.length);
        mutableIntSet.plusAssign(elements);
        return mutableIntSet;
    }
}
