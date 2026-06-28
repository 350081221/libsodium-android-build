package kotlinx.coroutines;

@kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/u0;", "", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "completion", "Lkotlin/r2;", "invoke", "(Lv3/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "Lkotlin/u;", "receiver", "(Lv3/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public enum u0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20650a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u0.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20650a = iArr;
        }
    }

    @g2
    public static /* synthetic */ void isLazy$annotations() {
    }

    @g2
    public final <T> void invoke(@p4.l v3.l<? super kotlin.coroutines.d<? super T>, ? extends Object> lVar, @p4.l kotlin.coroutines.d<? super T> dVar) {
        int i5 = a.f20650a[ordinal()];
        if (i5 == 1) {
            h4.a.d(lVar, dVar);
            return;
        }
        if (i5 == 2) {
            kotlin.coroutines.f.h(lVar, dVar);
        } else if (i5 == 3) {
            h4.b.a(lVar, dVar);
        } else if (i5 != 4) {
            throw new kotlin.j0();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @g2
    public final <R, T> void invoke(@p4.l v3.p<? super R, ? super kotlin.coroutines.d<? super T>, ? extends Object> pVar, R r5, @p4.l kotlin.coroutines.d<? super T> dVar) {
        int i5 = a.f20650a[ordinal()];
        if (i5 == 1) {
            h4.a.f(pVar, r5, dVar, null, 4, null);
            return;
        }
        if (i5 == 2) {
            kotlin.coroutines.f.i(pVar, r5, dVar);
        } else if (i5 == 3) {
            h4.b.b(pVar, r5, dVar);
        } else if (i5 != 4) {
            throw new kotlin.j0();
        }
    }
}
