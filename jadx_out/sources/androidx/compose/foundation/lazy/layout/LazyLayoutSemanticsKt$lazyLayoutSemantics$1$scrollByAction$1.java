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
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "x", "", "y", "invoke", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 extends n0 implements p<Float, Float, Boolean> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ float $delta;
        final /* synthetic */ LazyLayoutSemanticState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutSemanticState lazyLayoutSemanticState, float f5, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$state = lazyLayoutSemanticState;
            this.$delta = f5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.$state, this.$delta, dVar);
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
                LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                float f5 = this.$delta;
                this.label = 1;
                if (lazyLayoutSemanticState.animateScrollBy(f5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(boolean z4, s0 s0Var, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(2);
        this.$isVertical = z4;
        this.$coroutineScope = s0Var;
        this.$state = lazyLayoutSemanticState;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Boolean invoke(Float f5, Float f6) {
        return invoke(f5.floatValue(), f6.floatValue());
    }

    @l
    public final Boolean invoke(float f5, float f6) {
        if (this.$isVertical) {
            f5 = f6;
        }
        k.f(this.$coroutineScope, null, null, new AnonymousClass1(this.$state, f5, null), 3, null);
        return Boolean.TRUE;
    }
}
