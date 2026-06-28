package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1", f = "Scrollable.kt", i = {}, l = {684}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MouseWheelScrollNode$1$1$2$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ long $scrollAmount;
    final /* synthetic */ ScrollingLogic $this_with;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$1$1$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<ScrollScope, d<? super r2>, Object> {
        final /* synthetic */ long $scrollAmount;
        final /* synthetic */ ScrollingLogic $this_with;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollingLogic scrollingLogic, long j5, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_with = scrollingLogic;
            this.$scrollAmount = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.$scrollAmount, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // v3.p
        @m
        public final Object invoke(@l ScrollScope scrollScope, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(scrollScope, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.d.l();
            if (this.label == 0) {
                e1.n(obj);
                this.$this_with.m393dispatchScroll3eAAhYA((ScrollScope) this.L$0, this.$scrollAmount, NestedScrollSource.Companion.m4769getWheelWNlRxjI());
                return r2.f19517a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollNode$1$1$2$1$1(ScrollingLogic scrollingLogic, long j5, d<? super MouseWheelScrollNode$1$1$2$1$1> dVar) {
        super(2, dVar);
        this.$this_with = scrollingLogic;
        this.$scrollAmount = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new MouseWheelScrollNode$1$1$2$1$1(this.$this_with, this.$scrollAmount, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((MouseWheelScrollNode$1$1$2$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
            ScrollableState scrollableState = this.$this_with.getScrollableState();
            MutatePriority mutatePriority = MutatePriority.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, this.$scrollAmount, null);
            this.label = 1;
            if (scrollableState.scroll(mutatePriority, anonymousClass1, this) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
