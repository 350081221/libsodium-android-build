package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\t"}, d2 = {"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes3.dex */
public class f0 {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19245a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19245a = iArr;
        }
    }

    @p4.l
    public static final <T> d0<T> a(@p4.m Object obj, @p4.l v3.a<? extends T> initializer) {
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        return new n1(initializer, obj);
    }

    @p4.l
    public static <T> d0<T> b(@p4.l h0 mode, @p4.l v3.a<? extends T> initializer) {
        kotlin.jvm.internal.l0.p(mode, "mode");
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        int i5 = a.f19245a[mode.ordinal()];
        int i6 = 2;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return new s2(initializer);
                }
                throw new j0();
            }
            return new f1(initializer);
        }
        kotlin.jvm.internal.w wVar = null;
        return new n1(initializer, wVar, i6, wVar);
    }

    @p4.l
    public static <T> d0<T> c(@p4.l v3.a<? extends T> initializer) {
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        kotlin.jvm.internal.w wVar = null;
        return new n1(initializer, wVar, 2, wVar);
    }
}
