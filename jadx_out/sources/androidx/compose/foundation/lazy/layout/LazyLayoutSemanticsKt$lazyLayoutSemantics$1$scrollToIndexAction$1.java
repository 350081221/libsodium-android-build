package androidx.compose.foundation.lazy.layout;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.m;
import v3.a;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "index", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 extends n0 implements l<Integer, Boolean> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ a<LazyLayoutItemProvider> $itemProviderLambda;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyLayoutSemanticState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutSemanticState lazyLayoutSemanticState, int i5, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$state = lazyLayoutSemanticState;
            this.$index = i5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            return new AnonymousClass2(this.$state, this.$index, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
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
                LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                int i6 = this.$index;
                this.label = 1;
                if (lazyLayoutSemanticState.scrollToItem(i6, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1(a<? extends LazyLayoutItemProvider> aVar, s0 s0Var, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(1);
        this.$itemProviderLambda = aVar;
        this.$coroutineScope = s0Var;
        this.$state = lazyLayoutSemanticState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }

    @p4.l
    public final Boolean invoke(int i5) {
        LazyLayoutItemProvider invoke = this.$itemProviderLambda.invoke();
        if (i5 >= 0 && i5 < invoke.getItemCount()) {
            k.f(this.$coroutineScope, null, null, new AnonymousClass2(this.$state, i5, null), 3, null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(("Can't scroll to index " + i5 + ", it is out of bounds [0, " + invoke.getItemCount() + ')').toString());
    }
}
