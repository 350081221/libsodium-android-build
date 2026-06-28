package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"completed"}, s = {"L$0"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ p<i<BackEventCompat>, d<? super r2>, Object> $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/activity/BackEventCompat;", "", "it", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements q<j<? super BackEventCompat>, Throwable, d<? super r2>, Object> {
        final /* synthetic */ k1.a $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k1.a aVar, d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$completed = aVar;
        }

        @Override // v3.q
        @m
        public final Object invoke(@l j<? super BackEventCompat> jVar, @m Throwable th, @m d<? super r2> dVar) {
            return new AnonymousClass1(this.$completed, dVar).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$completed.element = true;
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnBackInstance$job$1(p<? super i<BackEventCompat>, ? super d<? super r2>, ? extends Object> pVar, OnBackInstance onBackInstance, d<? super OnBackInstance$job$1> dVar) {
        super(2, dVar);
        this.$onBack = pVar;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((OnBackInstance$job$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        k1.a aVar;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                aVar = (k1.a) this.L$0;
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            k1.a aVar2 = new k1.a();
            p<i<BackEventCompat>, d<? super r2>, Object> pVar = this.$onBack;
            i<BackEventCompat> e12 = k.e1(k.X(this.this$0.getChannel()), new AnonymousClass1(aVar2, null));
            this.L$0 = aVar2;
            this.label = 1;
            if (pVar.invoke(e12, this) == l5) {
                return l5;
            }
            aVar = aVar2;
        }
        if (aVar.element) {
            return r2.f19517a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }
}
