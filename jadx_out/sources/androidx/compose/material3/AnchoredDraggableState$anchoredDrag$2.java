package androidx.compose.material3;

import kotlin.e1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {530}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"T", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends kotlin.coroutines.jvm.internal.o implements v3.l<kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ v3.q<AnchoredDragScope, DraggableAnchors<T>, kotlin.coroutines.d<? super r2>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/material3/DraggableAnchors;", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.n0 implements v3.a<DraggableAnchors<T>> {
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
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
    @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/material3/DraggableAnchors;", "latestAnchors", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.o implements v3.p<DraggableAnchors<T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.q<AnchoredDragScope, DraggableAnchors<T>, kotlin.coroutines.d<? super r2>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(v3.q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, AnchoredDraggableState<T> anchoredDraggableState, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l DraggableAnchors<T> draggableAnchors, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((AnonymousClass2) create(draggableAnchors, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
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
                v3.q<AnchoredDragScope, DraggableAnchors<T>, kotlin.coroutines.d<? super r2>, Object> qVar = this.$block;
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
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, v3.q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super kotlin.coroutines.d<? super r2>, ? extends Object> qVar, kotlin.coroutines.d<? super AnchoredDraggableState$anchoredDrag$2> dVar) {
        super(1, dVar);
        this.this$0 = anchoredDraggableState;
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.l kotlin.coroutines.d<?> dVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, dVar);
    }

    @Override // v3.l
    @p4.m
    public final Object invoke(@p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
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
