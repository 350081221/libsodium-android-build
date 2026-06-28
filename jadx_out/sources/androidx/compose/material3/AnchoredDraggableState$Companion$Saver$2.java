package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/material3/AnchoredDraggableState;", "T", "", "it", "invoke", "(Ljava/lang/Object;)Landroidx/compose/material3/AnchoredDraggableState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnchoredDraggableState$Companion$Saver$2<T> extends kotlin.jvm.internal.n0 implements v3.l<T, AnchoredDraggableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ v3.l<T, Boolean> $confirmValueChange;
    final /* synthetic */ v3.l<Float, Float> $positionalThreshold;
    final /* synthetic */ v3.a<Float> $velocityThreshold;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$Companion$Saver$2(v3.l<? super Float, Float> lVar, v3.a<Float> aVar, AnimationSpec<Float> animationSpec, v3.l<? super T, Boolean> lVar2) {
        super(1);
        this.$positionalThreshold = lVar;
        this.$velocityThreshold = aVar;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((AnchoredDraggableState$Companion$Saver$2<T>) obj);
    }

    @Override // v3.l
    @p4.m
    public final AnchoredDraggableState<T> invoke(@p4.l T t5) {
        return new AnchoredDraggableState<>(t5, this.$positionalThreshold, this.$velocityThreshold, this.$animationSpec, this.$confirmValueChange);
    }
}
