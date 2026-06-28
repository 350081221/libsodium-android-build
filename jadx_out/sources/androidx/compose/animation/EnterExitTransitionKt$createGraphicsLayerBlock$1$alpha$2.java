package androidx.compose.animation;

import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2 extends n0 implements l<EnterExitState, Float> {
    final /* synthetic */ EnterTransition $enter;
    final /* synthetic */ ExitTransition $exit;

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
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    @Override // v3.l
    @p4.l
    public final Float invoke(@p4.l EnterExitState enterExitState) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        float f5 = 1.0f;
        if (i5 != 1) {
            if (i5 == 2) {
                Fade fade = this.$enter.getData$animation_release().getFade();
                if (fade != null) {
                    f5 = fade.getAlpha();
                }
            } else {
                if (i5 != 3) {
                    throw new j0();
                }
                Fade fade2 = this.$exit.getData$animation_release().getFade();
                if (fade2 != null) {
                    f5 = fade2.getAlpha();
                }
            }
        }
        return Float.valueOf(f5);
    }
}
