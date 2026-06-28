package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Add missing generic type declarations: [S] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "S", "it", "invoke-YEO4UFw", "(Ljava/lang/Object;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2<S> extends n0 implements l<S, IntSize> {
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.l
    public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
        return IntSize.m6206boximpl(m57invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m57invokeYEO4UFw(S s5) {
        State<IntSize> state = this.this$0.getTargetSizeMap$animation_release().get(s5);
        return state != null ? state.getValue().m6218unboximpl() : IntSize.Companion.m6219getZeroYbymL2g();
    }
}
