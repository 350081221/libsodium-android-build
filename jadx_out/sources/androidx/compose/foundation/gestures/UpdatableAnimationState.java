package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¢\u0006\u0004\b!\u0010\"JL\u0010\u000b\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Lkotlin/Function1;", "", "Lkotlin/v0;", "name", "valueDelta", "Lkotlin/r2;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lv3/l;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "lastFrameTime", "J", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "", "isRunning", "Z", b.f22420d, "F", "getValue", "()F", "setValue", "(F)V", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nUpdatableAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdatableAnimationState.kt\nandroidx/compose/foundation/gestures/UpdatableAnimationState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;

    @l
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;

    @l
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f5) {
            return Math.abs(f5) < 0.01f;
        }
    }

    public UpdatableAnimationState(@l AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(a0.f19382a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r9 == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a2 -> B:24:0x00a5). Please report as a decompilation issue!!! */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToZero(@p4.l v3.l<? super java.lang.Float, kotlin.r2> r13, @p4.l v3.a<kotlin.r2> r14, @p4.l kotlin.coroutines.d<? super kotlin.r2> r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(v3.l, v3.a, kotlin.coroutines.d):java.lang.Object");
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f5) {
        this.value = f5;
    }
}
