package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.coroutines.d;
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

@f(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TransformableStateKt$animatePanBy$2 extends o implements p<TransformScope, d<? super r2>, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ k1.g $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/animation/core/AnimationVector2D;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<AnimationScope<Offset, AnimationVector2D>, r2> {
        final /* synthetic */ TransformScope $$this$transform;
        final /* synthetic */ k1.g $previous;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(k1.g gVar, TransformScope transformScope) {
            super(1);
            this.$previous = gVar;
            this.$$this$transform = transformScope;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
            invoke2(animationScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l AnimationScope<Offset, AnimationVector2D> animationScope) {
            TransformScope.m410transformByd4ec7I$default(this.$$this$transform, 0.0f, Offset.m3497minusMKHz9U(animationScope.getValue().m3503unboximpl(), this.$previous.element), 0.0f, 5, null);
            this.$previous.element = animationScope.getValue().m3503unboximpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(k1.g gVar, long j5, AnimationSpec<Offset> animationSpec, d<? super TransformableStateKt$animatePanBy$2> dVar) {
        super(2, dVar);
        this.$previous = gVar;
        this.$offset = j5;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, dVar);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l TransformScope transformScope, @m d<? super r2> dVar) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
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
            TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m3482boximpl(this.$previous.element), null, 0L, 0L, false, 60, null);
            Offset m3482boximpl = Offset.m3482boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previous, transformScope);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, m3482boximpl, animationSpec, false, anonymousClass1, this, 4, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
