package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Add missing generic type declarations: [R] */
@f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", i = {0}, l = {71, 73}, m = "invokeSuspend", n = {"recomposer"}, s = {"L$0"})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RecomposerKt$withRunningRecomposer$2<R> extends o implements p<s0, d<? super R>, Object> {
    final /* synthetic */ q<s0, Recomposer, d<? super R>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Recomposer recomposer, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$recomposer = recomposer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.$recomposer, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecomposerKt$withRunningRecomposer$2(q<? super s0, ? super Recomposer, ? super d<? super R>, ? extends Object> qVar, d<? super RecomposerKt$withRunningRecomposer$2> dVar) {
        super(2, dVar);
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, dVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super R> dVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        Recomposer recomposer;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    Object obj2 = this.L$0;
                    e1.n(obj);
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recomposer = (Recomposer) this.L$0;
            e1.n(obj);
        } else {
            e1.n(obj);
            s0 s0Var = (s0) this.L$0;
            recomposer = new Recomposer(s0Var.getCoroutineContext());
            k.f(s0Var, null, null, new AnonymousClass1(recomposer, null), 3, null);
            q<s0, Recomposer, d<? super R>, Object> qVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = qVar.invoke(s0Var, recomposer, this);
            if (obj == l5) {
                return l5;
            }
        }
        recomposer.close();
        this.L$0 = obj;
        this.label = 2;
        if (recomposer.join(this) == l5) {
            return l5;
        }
        return obj;
    }
}
