package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyFloatList", "Landroidx/collection/FloatList;", "emptyFloatList", "floatListOf", "element1", "", "element2", "element3", "elements", "", "mutableFloatListOf", "Landroidx/collection/MutableFloatList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
/* loaded from: classes.dex */
public final class FloatListKt {

    @l
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    @l
    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    @l
    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    @l
    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    @l
    public static final FloatList floatListOf(float f5) {
        return mutableFloatListOf(f5);
    }

    @l
    public static final MutableFloatList mutableFloatListOf(float f5) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f5);
        return mutableFloatList;
    }

    @l
    public static final FloatList floatListOf(float f5, float f6) {
        return mutableFloatListOf(f5, f6);
    }

    @l
    public static final FloatList floatListOf(float f5, float f6, float f7) {
        return mutableFloatListOf(f5, f6, f7);
    }

    @l
    public static final MutableFloatList mutableFloatListOf(float f5, float f6) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f5);
        mutableFloatList.add(f6);
        return mutableFloatList;
    }

    @l
    public static final FloatList floatListOf(@l float... elements) {
        l0.p(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }

    @l
    public static final MutableFloatList mutableFloatListOf(float f5, float f6, float f7) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f5);
        mutableFloatList.add(f6);
        mutableFloatList.add(f7);
        return mutableFloatList;
    }

    @l
    public static final MutableFloatList mutableFloatListOf(@l float... elements) {
        l0.p(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }
}
