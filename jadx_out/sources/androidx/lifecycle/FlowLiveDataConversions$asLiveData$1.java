package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/lifecycle/LiveDataScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class FlowLiveDataConversions$asLiveData$1<T> extends o implements p<LiveDataScope<T>, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super FlowLiveDataConversions$asLiveData$1> dVar) {
        super(2, dVar);
        this.$this_asLiveData = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l LiveDataScope<T> liveDataScope, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
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
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            kotlinx.coroutines.flow.i<T> iVar = this.$this_asLiveData;
            kotlinx.coroutines.flow.j<? super T> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // kotlinx.coroutines.flow.j
                @m
                public final Object emit(T t5, @l kotlin.coroutines.d<? super r2> dVar) {
                    Object l6;
                    Object emit = liveDataScope.emit(t5, dVar);
                    l6 = kotlin.coroutines.intrinsics.d.l();
                    return emit == l6 ? emit : r2.f19517a;
                }
            };
            this.label = 1;
            if (iVar.collect(jVar, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
