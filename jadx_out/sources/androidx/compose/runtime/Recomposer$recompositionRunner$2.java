package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1003}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1572\n33#3,6:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$recompositionRunner$2\n*L\n999#1:1565\n1008#1:1572\n1001#1:1566,6\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ q<s0, MonotonicFrameClock, d<? super r2>, Object> $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ q<s0, MonotonicFrameClock, d<? super r2>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(q<? super s0, ? super MonotonicFrameClock, ? super d<? super r2>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                s0 s0Var = (s0) this.L$0;
                q<s0, MonotonicFrameClock, d<? super r2>, Object> qVar = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (qVar.invoke(s0Var, monotonicFrameClock, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, q<? super s0, ? super MonotonicFrameClock, ? super d<? super r2>, ? extends Object> qVar, MonotonicFrameClock monotonicFrameClock, d<? super Recomposer$recompositionRunner$2> dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$block = qVar;
        this.$parentFrameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, dVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((Recomposer$recompositionRunner$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
