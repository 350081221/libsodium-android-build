package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
final class LiveDataScopeImpl$emit$2 extends o implements p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ T $value;
    int label;
    final /* synthetic */ LiveDataScopeImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(LiveDataScopeImpl<T> liveDataScopeImpl, T t5, kotlin.coroutines.d<? super LiveDataScopeImpl$emit$2> dVar) {
        super(2, dVar);
        this.this$0 = liveDataScopeImpl;
        this.$value = t5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final kotlin.coroutines.d<r2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m kotlin.coroutines.d<? super r2> dVar) {
        return ((LiveDataScopeImpl$emit$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            CoroutineLiveData target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
            this.label = 1;
            if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == l5) {
                return l5;
            }
        }
        this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
        return r2.f19517a;
    }
}
