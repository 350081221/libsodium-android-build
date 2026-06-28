package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlinx/coroutines/l2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$2 extends o implements p<s0, d<? super l2>, Object> {
    final /* synthetic */ a<Rect> $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ a<Rect> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ a<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C00201 extends h0 implements a<Rect> {
            final /* synthetic */ a<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00201(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar) {
                super(0, l0.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // v3.a
            @m
            public final Rect invoke() {
                Rect bringChildIntoView$localRect;
                bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return bringChildIntoView$localRect;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, dVar);
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
                BringIntoViewResponder responder = this.this$0.getResponder();
                C00201 c00201 = new C00201(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (responder.bringChildIntoView(c00201, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ a<Rect> $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, a<Rect> aVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<r2> create(@m Object obj, @l d<?> dVar) {
            return new AnonymousClass2(this.this$0, this.$parentRect, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
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
                BringIntoViewParent parent = this.this$0.getParent();
                LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return r2.f19517a;
                }
                a<Rect> aVar = this.$parentRect;
                this.label = 1;
                if (parent.bringChildIntoView(layoutCoordinates, aVar, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar, a<Rect> aVar2, d<? super BringIntoViewResponderNode$bringChildIntoView$2> dVar) {
        super(2, dVar);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = aVar;
        this.$parentRect = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        BringIntoViewResponderNode$bringChildIntoView$2 bringIntoViewResponderNode$bringChildIntoView$2 = new BringIntoViewResponderNode$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, dVar);
        bringIntoViewResponderNode$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringChildIntoView$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super l2> dVar) {
        return ((BringIntoViewResponderNode$bringChildIntoView$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        l2 f5;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            s0 s0Var = (s0) this.L$0;
            k.f(s0Var, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            f5 = k.f(s0Var, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, null);
            return f5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
