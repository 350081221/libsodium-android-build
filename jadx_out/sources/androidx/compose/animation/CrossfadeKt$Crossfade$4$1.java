package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$4$1<T> extends n0 implements l<T, Boolean> {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$4$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @p4.l
    public final Boolean invoke(T t5) {
        return Boolean.valueOf(!l0.g(t5, this.$this_Crossfade.getTargetState()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((CrossfadeKt$Crossfade$4$1<T>) obj);
    }
}
