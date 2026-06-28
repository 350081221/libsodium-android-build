package kotlinx.coroutines.flow.internal;

import com.android.dx.io.Opcodes;
import com.umeng.analytics.pro.bi;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.internal.z0;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/flow/internal/b0;", "T", "Lkotlinx/coroutines/flow/j;", t0.b.f22420d, "Lkotlin/r2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", bi.ay, "Lkotlin/coroutines/g;", "emitContext", "", "b", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "c", "Lv3/p;", "emitRef", "downstream", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class b0<T> implements kotlinx.coroutines.flow.j<T> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final kotlin.coroutines.g f20106a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Object f20107b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final v3.p<T, kotlin.coroutines.d<? super r2>, Object> f20108c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {Opcodes.REM_INT_LIT16}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.o implements v3.p<T, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlinx.coroutines.flow.j<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$downstream = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$downstream, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, kotlin.coroutines.d<? super r2> dVar) {
            return invoke2((a) obj, dVar);
        }

        @p4.m
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(t5, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                Object obj2 = this.L$0;
                kotlinx.coroutines.flow.j<T> jVar = this.$downstream;
                this.label = 1;
                if (jVar.emit(obj2, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    public b0(@p4.l kotlinx.coroutines.flow.j<? super T> jVar, @p4.l kotlin.coroutines.g gVar) {
        this.f20106a = gVar;
        this.f20107b = z0.b(gVar);
        this.f20108c = new a(jVar, null);
    }

    @Override // kotlinx.coroutines.flow.j
    @p4.m
    public Object emit(T t5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object c5 = f.c(this.f20106a, t5, this.f20107b, this.f20108c, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return c5 == l5 ? c5 : r2.f19517a;
    }
}
