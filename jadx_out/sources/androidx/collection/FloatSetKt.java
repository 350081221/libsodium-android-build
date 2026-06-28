package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\b\u001a\u00020\u00072\n\u0010\r\u001a\u00020\u0001\"\u00020\n\u001a\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0080\b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\r\u001a\u00020\u0001\"\u00020\n\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatArray", "", "getEmptyFloatArray", "()[F", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;", "emptyFloatSet", "Landroidx/collection/FloatSet;", "floatSetOf", "element1", "", "element2", "element3", "elements", "hash", "", "k", "mutableFloatSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,837:1\n1#2:838\n*E\n"})
/* loaded from: classes.dex */
public final class FloatSetKt {

    @l
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);

    @l
    private static final float[] EmptyFloatArray = new float[0];

    @l
    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    @l
    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    @l
    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f5) {
        int hashCode = Float.hashCode(f5) * ScatterMapKt.MurmurHashC1;
        return hashCode ^ (hashCode << 16);
    }

    @l
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @l
    public static final FloatSet floatSetOf(float f5) {
        return mutableFloatSetOf(f5);
    }

    @l
    public static final MutableFloatSet mutableFloatSetOf(float f5) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f5);
        return mutableFloatSet;
    }

    @l
    public static final FloatSet floatSetOf(float f5, float f6) {
        return mutableFloatSetOf(f5, f6);
    }

    @l
    public static final FloatSet floatSetOf(float f5, float f6, float f7) {
        return mutableFloatSetOf(f5, f6, f7);
    }

    @l
    public static final MutableFloatSet mutableFloatSetOf(float f5, float f6) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f5);
        mutableFloatSet.plusAssign(f6);
        return mutableFloatSet;
    }

    @l
    public static final FloatSet floatSetOf(@l float... elements) {
        l0.p(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    @l
    public static final MutableFloatSet mutableFloatSetOf(float f5, float f6, float f7) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f5);
        mutableFloatSet.plusAssign(f6);
        mutableFloatSet.plusAssign(f7);
        return mutableFloatSet;
    }

    @l
    public static final MutableFloatSet mutableFloatSetOf(@l float... elements) {
        l0.p(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}
