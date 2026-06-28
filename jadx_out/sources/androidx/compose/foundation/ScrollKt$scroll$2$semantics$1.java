package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.s0;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1 extends n0 implements v3.l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ s0 $coroutineScope;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "x", "", "y", "invoke", "(FF)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.p<Float, Float, Boolean> {
        final /* synthetic */ s0 $coroutineScope;
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ ScrollState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {293, 295}, m = "invokeSuspend", n = {}, s = {})
        @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00071 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ ScrollState $state;
            final /* synthetic */ float $x;
            final /* synthetic */ float $y;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00071(boolean z4, ScrollState scrollState, float f5, float f6, kotlin.coroutines.d<? super C00071> dVar) {
                super(2, dVar);
                this.$isVertical = z4;
                this.$state = scrollState;
                this.$y = f5;
                this.$x = f6;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.l
            public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
                return new C00071(this.$isVertical, this.$state, this.$y, this.$x, dVar);
            }

            @Override // v3.p
            @p4.m
            public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
                return ((C00071) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @p4.m
            public final Object invokeSuspend(@p4.l Object obj) {
                Object l5;
                l5 = kotlin.coroutines.intrinsics.d.l();
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1.n(obj);
                } else {
                    e1.n(obj);
                    if (this.$isVertical) {
                        ScrollState scrollState = this.$state;
                        l0.n(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                        float f5 = this.$y;
                        this.label = 1;
                        if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f5, null, this, 2, null) == l5) {
                            return l5;
                        }
                    } else {
                        ScrollState scrollState2 = this.$state;
                        l0.n(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                        float f6 = this.$x;
                        this.label = 2;
                        if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f6, null, this, 2, null) == l5) {
                            return l5;
                        }
                    }
                }
                return r2.f19517a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(s0 s0Var, boolean z4, ScrollState scrollState) {
            super(2);
            this.$coroutineScope = s0Var;
            this.$isVertical = z4;
            this.$state = scrollState;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f5, Float f6) {
            return invoke(f5.floatValue(), f6.floatValue());
        }

        @p4.l
        public final Boolean invoke(float f5, float f6) {
            kotlinx.coroutines.k.f(this.$coroutineScope, null, null, new C00071(this.$isVertical, this.$state, f6, f5, null), 3, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1(boolean z4, boolean z5, boolean z6, ScrollState scrollState, s0 s0Var) {
        super(1);
        this.$reverseScrolling = z4;
        this.$isVertical = z5;
        this.$isScrollable = z6;
        this.$state = scrollState;
        this.$coroutineScope = s0Var;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.$state), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.$state), this.$reverseScrolling);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
        if (this.$isScrollable) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$coroutineScope, this.$isVertical, this.$state), 1, null);
        }
    }
}
