package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;
import v3.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {696}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Landroidx/compose/material/AnchoredDragScope;", "Landroidx/compose/material/DraggableAnchors;", "anchors", "latestTarget", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2<T> extends o implements r<AnchoredDragScope, DraggableAnchors<T>, T, d<? super r2>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", b.f22420d, "velocity", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$animateTo$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Float, Float, r2> {
        final /* synthetic */ AnchoredDragScope $$this$anchoredDrag;
        final /* synthetic */ k1.e $prev;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDragScope anchoredDragScope, k1.e eVar) {
            super(2);
            this.$$this$anchoredDrag = anchoredDragScope;
            this.$prev = eVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Float f5, Float f6) {
            invoke(f5.floatValue(), f6.floatValue());
            return r2.f19517a;
        }

        public final void invoke(float f5, float f6) {
            this.$$this$anchoredDrag.dragTo(f5, f6);
            this.$prev.element = f5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState<T> anchoredDraggableState, float f5, d<? super AnchoredDraggableKt$animateTo$2> dVar) {
        super(4, dVar);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f5;
    }

    @m
    public final Object invoke(@l AnchoredDragScope anchoredDragScope, @l DraggableAnchors<T> draggableAnchors, T t5, @m d<? super r2> dVar) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, dVar);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateTo$2.L$2 = t5;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.r
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, d<? super r2> dVar) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        float offset;
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
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float positionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                k1.e eVar = new k1.e();
                if (Float.isNaN(this.$this_animateTo.getOffset())) {
                    offset = 0.0f;
                } else {
                    offset = this.$this_animateTo.getOffset();
                }
                float f5 = offset;
                eVar.element = f5;
                float f6 = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDragScope, eVar);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.animate(f5, positionOf, f6, animationSpec, anonymousClass1, this) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
