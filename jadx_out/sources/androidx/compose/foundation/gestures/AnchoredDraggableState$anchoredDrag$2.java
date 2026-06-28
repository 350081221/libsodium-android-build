package androidx.compose.foundation.gestures;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.a;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {521}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends o implements l<d<? super r2>, Object> {
    final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, d<? super r2>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> extends n0 implements a<DraggableAnchors<T>> {
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
            super(0);
            this.this$0 = anchoredDraggableState;
        }

        @Override // v3.a
        @p4.l
        public final DraggableAnchors<T> invoke() {
            return this.this$0.getAnchors();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "latestAnchors", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> extends o implements p<DraggableAnchors<T>, d<? super r2>, Object> {
        final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, d<? super r2>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super d<? super r2>, ? extends Object> qVar, AnchoredDraggableState<T> anchoredDraggableState, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l DraggableAnchors<T> draggableAnchors, @m d<? super r2> dVar) {
            return ((AnonymousClass2) create(draggableAnchors, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            AnchoredDragScope anchoredDragScope;
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
                DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                q<AnchoredDragScope, DraggableAnchors<T>, d<? super r2>, Object> qVar = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (qVar.invoke(anchoredDragScope, draggableAnchors, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super d<? super r2>, ? extends Object> qVar, d<? super AnchoredDraggableState$anchoredDrag$2> dVar) {
        super(1, dVar);
        this.this$0 = anchoredDraggableState;
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@p4.l d<?> dVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, dVar);
    }

    @Override // v3.l
    @m
    public final Object invoke(@m d<? super r2> dVar) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Object restartable;
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            restartable = AnchoredDraggableKt.restartable(anonymousClass1, anonymousClass2, this);
            if (restartable == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
