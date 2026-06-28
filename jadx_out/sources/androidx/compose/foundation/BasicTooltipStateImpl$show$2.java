package androidx.compose.foundation;

import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.v3;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2", f = "BasicTooltip.kt", i = {}, l = {156, 158}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BasicTooltipStateImpl$show$2 extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.l<kotlin.coroutines.d<? super r2>, Object> $cancellableShow;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipStateImpl$show$2$1", f = "BasicTooltip.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.BasicTooltipStateImpl$show$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.l<kotlin.coroutines.d<? super r2>, Object> $cancellableShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(v3.l<? super kotlin.coroutines.d<? super r2>, ? extends Object> lVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$cancellableShow = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$cancellableShow, dVar);
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

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
                v3.l<kotlin.coroutines.d<? super r2>, Object> lVar = this.$cancellableShow;
                this.label = 1;
                if (lVar.invoke(this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTooltipStateImpl$show$2(BasicTooltipStateImpl basicTooltipStateImpl, v3.l<? super kotlin.coroutines.d<? super r2>, ? extends Object> lVar, kotlin.coroutines.d<? super BasicTooltipStateImpl$show$2> dVar) {
        super(1, dVar);
        this.this$0 = basicTooltipStateImpl;
        this.$cancellableShow = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new BasicTooltipStateImpl$show$2(this.this$0, this.$cancellableShow, dVar);
    }

    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((BasicTooltipStateImpl$show$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                if (this.this$0.isPersistent()) {
                    v3.l<kotlin.coroutines.d<? super r2>, Object> lVar = this.$cancellableShow;
                    this.label = 1;
                    if (lVar.invoke(this) == l5) {
                        return l5;
                    }
                } else {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cancellableShow, null);
                    this.label = 2;
                    if (v3.c(1500L, anonymousClass1, this) == l5) {
                        return l5;
                    }
                }
            }
            this.this$0.setVisible(false);
            return r2.f19517a;
        } catch (Throwable th) {
            this.this$0.setVisible(false);
            throw th;
        }
    }
}
