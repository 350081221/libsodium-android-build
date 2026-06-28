package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SwipeableState$animateInternalToOffset$2 extends o implements p<DragScope, d<? super r2>, Object> {
    final /* synthetic */ AnimationSpec<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/Animatable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.SwipeableState$animateInternalToOffset$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Animatable<Float, AnimationVector1D>, r2> {
        final /* synthetic */ DragScope $$this$drag;
        final /* synthetic */ k1.e $prevValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragScope dragScope, k1.e eVar) {
            super(1);
            this.$$this$drag = dragScope;
            this.$prevValue = eVar;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Animatable<Float, AnimationVector1D> animatable) {
            invoke2(animatable);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Animatable<Float, AnimationVector1D> animatable) {
            this.$$this$drag.dragBy(animatable.getValue().floatValue() - this.$prevValue.element);
            this.$prevValue.element = animatable.getValue().floatValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f5, AnimationSpec<Float> animationSpec, d<? super SwipeableState$animateInternalToOffset$2> dVar) {
        super(2, dVar);
        this.this$0 = swipeableState;
        this.$target = f5;
        this.$spec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, dVar);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l DragScope dragScope, @m d<? super r2> dVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        MutableState mutableState;
        MutableFloatState mutableFloatState;
        MutableState mutableState2;
        MutableState mutableState3;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                DragScope dragScope = (DragScope) this.L$0;
                k1.e eVar = new k1.e();
                mutableFloatState = ((SwipeableState) this.this$0).absoluteOffset;
                eVar.element = mutableFloatState.getFloatValue();
                mutableState2 = ((SwipeableState) this.this$0).animationTarget;
                mutableState2.setValue(b.e(this.$target));
                this.this$0.setAnimationRunning(true);
                Animatable Animatable$default = AnimatableKt.Animatable$default(eVar.element, 0.0f, 2, null);
                Float e5 = b.e(this.$target);
                AnimationSpec<Float> animationSpec = this.$spec;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dragScope, eVar);
                this.label = 1;
                if (Animatable.animateTo$default(Animatable$default, e5, animationSpec, null, anonymousClass1, this, 4, null) == l5) {
                    return l5;
                }
            }
            mutableState3 = ((SwipeableState) this.this$0).animationTarget;
            mutableState3.setValue(null);
            this.this$0.setAnimationRunning(false);
            return r2.f19517a;
        } catch (Throwable th) {
            mutableState = ((SwipeableState) this.this$0).animationTarget;
            mutableState.setValue(null);
            this.this$0.setAnimationRunning(false);
            throw th;
        }
    }
}
