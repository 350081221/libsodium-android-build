package jonathanfinerty.once;

/* loaded from: classes3.dex */
public class Amount {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(int i5, int i6) {
        return i5 == i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(int i5, int i6) {
        return i6 < i5;
    }

    public static CountChecker exactly(final int i5) {
        return new CountChecker() { // from class: jonathanfinerty.once.b
            @Override // jonathanfinerty.once.CountChecker
            public final boolean check(int i6) {
                boolean d5;
                d5 = Amount.d(i5, i6);
                return d5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f(int i5, int i6) {
        return i6 > i5;
    }

    public static CountChecker lessThan(final int i5) {
        return new CountChecker() { // from class: jonathanfinerty.once.a
            @Override // jonathanfinerty.once.CountChecker
            public final boolean check(int i6) {
                boolean e5;
                e5 = Amount.e(i5, i6);
                return e5;
            }
        };
    }

    public static CountChecker moreThan(final int i5) {
        return new CountChecker() { // from class: jonathanfinerty.once.c
            @Override // jonathanfinerty.once.CountChecker
            public final boolean check(int i6) {
                boolean f5;
                f5 = Amount.f(i5, i6);
                return f5;
            }
        };
    }
}
