package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material/SwipeableState;", "T", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableState$2<T> extends n0 implements a<SwipeableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<T, Boolean> $confirmStateChange;
    final /* synthetic */ T $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableKt$rememberSwipeableState$2(T t5, AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar) {
        super(0);
        this.$initialValue = t5;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = lVar;
    }

    @Override // v3.a
    @p4.l
    public final SwipeableState<T> invoke() {
        return new SwipeableState<>(this.$initialValue, this.$animationSpec, this.$confirmStateChange);
    }
}
