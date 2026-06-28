package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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

@f(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ScrollableGesturesNode$onDragStopped$1 extends o implements q<s0, Velocity, d<? super r2>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ ScrollableGesturesNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1", f = "Scrollable.kt", i = {}, l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ long $velocity;
        int label;
        final /* synthetic */ ScrollableGesturesNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollableGesturesNode scrollableGesturesNode, long j5, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = scrollableGesturesNode;
            this.$velocity = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$velocity, dVar);
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
                ScrollingLogic scrollLogic = this.this$0.getScrollLogic();
                long j5 = this.$velocity;
                this.label = 1;
                if (scrollLogic.m395onDragStoppedsFctU(j5, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableGesturesNode$onDragStopped$1(ScrollableGesturesNode scrollableGesturesNode, d<? super ScrollableGesturesNode$onDragStopped$1> dVar) {
        super(3, dVar);
        this.this$0 = scrollableGesturesNode;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Velocity velocity, d<? super r2> dVar) {
        return m388invokeLuvzFrg(s0Var, velocity.m6288unboximpl(), dVar);
    }

    @m
    /* renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m388invokeLuvzFrg(@l s0 s0Var, long j5, @m d<? super r2> dVar) {
        ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new ScrollableGesturesNode$onDragStopped$1(this.this$0, dVar);
        scrollableGesturesNode$onDragStopped$1.J$0 = j5;
        return scrollableGesturesNode$onDragStopped$1.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            k.f(this.this$0.getNestedScrollDispatcher().getCoroutineScope(), null, null, new AnonymousClass1(this.this$0, this.J$0, null), 3, null);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
