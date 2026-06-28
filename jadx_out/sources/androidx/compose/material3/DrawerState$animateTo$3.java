package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.e1;
import kotlin.jvm.internal.k1;
import kotlin.r2;
import v3.r;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@"}, d2 = {"Landroidx/compose/material3/AnchoredDragScope;", "Landroidx/compose/material3/DraggableAnchors;", "Landroidx/compose/material3/DrawerValue;", "anchors", "latestTarget", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DrawerState$animateTo$3 extends kotlin.coroutines.jvm.internal.o implements r<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ DrawerState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", t0.b.f22420d, "velocity", "Lkotlin/r2;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.p<Float, Float, r2> {
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
    public DrawerState$animateTo$3(DrawerState drawerState, float f5, AnimationSpec<Float> animationSpec, kotlin.coroutines.d<? super DrawerState$animateTo$3> dVar) {
        super(4, dVar);
        this.this$0 = drawerState;
        this.$velocity = f5;
        this.$animationSpec = animationSpec;
    }

    @Override // v3.r
    @p4.m
    public final Object invoke(@p4.l AnchoredDragScope anchoredDragScope, @p4.l DraggableAnchors<DrawerValue> draggableAnchors, @p4.l DrawerValue drawerValue, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(this.this$0, this.$velocity, this.$animationSpec, dVar);
        drawerState$animateTo$3.L$0 = anchoredDragScope;
        drawerState$animateTo$3.L$1 = draggableAnchors;
        drawerState$animateTo$3.L$2 = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        float currentOffset;
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
            float positionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
            if (!Float.isNaN(positionOf)) {
                k1.e eVar = new k1.e();
                if (Float.isNaN(this.this$0.getCurrentOffset())) {
                    currentOffset = 0.0f;
                } else {
                    currentOffset = this.this$0.getCurrentOffset();
                }
                float f5 = currentOffset;
                eVar.element = f5;
                float f6 = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$animationSpec;
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
