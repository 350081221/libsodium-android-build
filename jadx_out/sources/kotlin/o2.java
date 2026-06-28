package kotlin;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00020\u0001\"\u00020\u0006H\u0087\bø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"UShortArray", "Lkotlin/UShortArray;", "size", "", "init", "Lkotlin/Function1;", "Lkotlin/UShort;", "(ILkotlin/jvm/functions/Function1;)[S", "ushortArrayOf", "elements", "ushortArrayOf-rL5Bavg", "([S)[S", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o2 {
    @g1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final short[] a(int i5, v3.l<? super Integer, m2> init) {
        kotlin.jvm.internal.l0.p(init, "init");
        short[] sArr = new short[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            sArr[i6] = init.invoke(Integer.valueOf(i6)).j0();
        }
        return n2.g(sArr);
    }

    @g1(version = "1.3")
    @t
    @kotlin.internal.f
    private static final short[] b(short... elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return elements;
    }
}
