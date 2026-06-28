package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.bi;
import kotlin.a1;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.u0;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0001R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/selects/s;", "R", "Lkotlinx/coroutines/selects/t;", "", "Q", "", "e", "Lkotlin/r2;", "P", "Lkotlinx/coroutines/q;", bi.aJ, "Lkotlinx/coroutines/q;", "cont", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@a1
/* loaded from: classes4.dex */
public final class s<R> extends t<R> {

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final kotlinx.coroutines.q<R> f20600h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        int label;
        final /* synthetic */ s<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s<R> sVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new a(this.this$0, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            try {
                if (i5 != 0) {
                    if (i5 == 1) {
                        e1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    e1.n(obj);
                    s<R> sVar = this.this$0;
                    this.label = 1;
                    obj = sVar.w(this);
                    if (obj == l5) {
                        return l5;
                    }
                }
                p.c(((s) this.this$0).f20600h, obj);
                return r2.f19517a;
            } catch (Throwable th) {
                p.d(((s) this.this$0).f20600h, th);
                return r2.f19517a;
            }
        }
    }

    public s(@p4.l kotlin.coroutines.d<? super R> dVar) {
        super(dVar.getContext());
        kotlin.coroutines.d e5;
        e5 = kotlin.coroutines.intrinsics.c.e(dVar);
        this.f20600h = new kotlinx.coroutines.q<>(e5, 1);
    }

    @a1
    public final void P(@p4.l Throwable th) {
        kotlinx.coroutines.q<R> qVar = this.f20600h;
        d1.a aVar = d1.Companion;
        qVar.resumeWith(d1.m6444constructorimpl(e1.a(th)));
    }

    @a1
    @p4.m
    public final Object Q() {
        if (this.f20600h.d()) {
            return this.f20600h.E();
        }
        kotlinx.coroutines.k.f(t0.a(getContext()), null, u0.UNDISPATCHED, new a(this, null), 1, null);
        return this.f20600h.E();
    }
}
