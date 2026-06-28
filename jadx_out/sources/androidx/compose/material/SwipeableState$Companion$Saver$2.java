package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/material/SwipeableState;", "T", "", "it", "invoke", "(Ljava/lang/Object;)Landroidx/compose/material/SwipeableState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeableState$Companion$Saver$2<T> extends n0 implements l<T, SwipeableState<T>> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<T, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState$Companion$Saver$2(AnimationSpec<Float> animationSpec, l<? super T, Boolean> lVar) {
        super(1);
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((SwipeableState$Companion$Saver$2<T>) obj);
    }

    @Override // v3.l
    @m
    public final SwipeableState<T> invoke(@p4.l T t5) {
        return new SwipeableState<>(t5, this.$animationSpec, this.$confirmStateChange);
    }
}
