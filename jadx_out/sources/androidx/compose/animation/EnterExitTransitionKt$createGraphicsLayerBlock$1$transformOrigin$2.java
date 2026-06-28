package androidx.compose.animation;

import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/TransformOrigin;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-LIALnN8", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2 extends n0 implements l<EnterExitState, TransformOrigin> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;
    final /* synthetic */ TransformOrigin $transformOriginWhenVisible;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            try {
                iArr[EnterExitState.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnterExitState.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnterExitState.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$transformOrigin$2(TransformOrigin transformOrigin, EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$transformOriginWhenVisible = transformOrigin;
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
        return TransformOrigin.m4110boximpl(m70invokeLIALnN8(enterExitState));
    }

    /* renamed from: invoke-LIALnN8, reason: not valid java name */
    public final long m70invokeLIALnN8(@p4.l EnterExitState enterExitState) {
        TransformOrigin transformOrigin;
        int i5 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i5 != 1) {
            transformOrigin = null;
            if (i5 != 2) {
                if (i5 == 3) {
                    Scale scale = this.$exit.getData$animation_release().getScale();
                    if (scale != null || (scale = this.$enter.getData$animation_release().getScale()) != null) {
                        transformOrigin = TransformOrigin.m4110boximpl(scale.m93getTransformOriginSzJe1aQ());
                    }
                } else {
                    throw new j0();
                }
            } else {
                Scale scale2 = this.$enter.getData$animation_release().getScale();
                if (scale2 != null || (scale2 = this.$exit.getData$animation_release().getScale()) != null) {
                    transformOrigin = TransformOrigin.m4110boximpl(scale2.m93getTransformOriginSzJe1aQ());
                }
            }
        } else {
            transformOrigin = this.$transformOriginWhenVisible;
        }
        if (transformOrigin != null) {
            return transformOrigin.m4122unboximpl();
        }
        return TransformOrigin.Companion.m4123getCenterSzJe1aQ();
    }
}
