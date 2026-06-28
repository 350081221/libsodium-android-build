package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlinx.coroutines.n3;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/f1;", "", "Lkotlinx/coroutines/n3;", "element", t0.b.f22420d, "Lkotlin/r2;", bi.ay, "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "b", "Lkotlin/coroutines/g;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/n3;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/g;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    @u3.e
    public final kotlin.coroutines.g f20351a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Object[] f20352b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final n3<Object>[] f20353c;

    /* renamed from: d, reason: collision with root package name */
    private int f20354d;

    public f1(@p4.l kotlin.coroutines.g gVar, int i5) {
        this.f20351a = gVar;
        this.f20352b = new Object[i5];
        this.f20353c = new n3[i5];
    }

    public final void a(@p4.l n3<?> n3Var, @p4.m Object obj) {
        Object[] objArr = this.f20352b;
        int i5 = this.f20354d;
        objArr[i5] = obj;
        n3<Object>[] n3VarArr = this.f20353c;
        this.f20354d = i5 + 1;
        kotlin.jvm.internal.l0.n(n3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        n3VarArr[i5] = n3Var;
    }

    public final void b(@p4.l kotlin.coroutines.g gVar) {
        int length = this.f20353c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            n3<Object> n3Var = this.f20353c[length];
            kotlin.jvm.internal.l0.m(n3Var);
            n3Var.restoreThreadContext(gVar, this.f20352b[length]);
            if (i5 >= 0) {
                length = i5;
            } else {
                return;
            }
        }
    }
}
