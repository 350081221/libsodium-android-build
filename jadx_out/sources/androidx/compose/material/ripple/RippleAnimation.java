package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.y;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u001c\u0010\r\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010,\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u00100\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "Lkotlin/r2;", "fadeIn", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "fadeOut", "animate", "finish", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "draw-4WTKRHQ", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/geometry/Offset;", "origin", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Dp;", "radius", "F", "", "bounded", "Z", "", "startRadius", "Ljava/lang/Float;", "targetRadius", "targetCenter", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "animatedRadiusPercent", "animatedCenterPercent", "Lkotlinx/coroutines/y;", "finishSignalDeferred", "Lkotlinx/coroutines/y;", "<set-?>", "finishedFadingIn$delegate", "Landroidx/compose/runtime/MutableState;", "getFinishedFadingIn", "()Z", "setFinishedFadingIn", "(Z)V", "finishedFadingIn", "finishRequested$delegate", "getFinishRequested", "setFinishRequested", "finishRequested", "<init>", "(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n137#3:201\n215#4,8:202\n262#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
/* loaded from: classes.dex */
public final class RippleAnimation {
    public static final int $stable = 8;

    @l
    private final Animatable<Float, AnimationVector1D> animatedAlpha;

    @l
    private final Animatable<Float, AnimationVector1D> animatedCenterPercent;

    @l
    private final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;

    @l
    private final MutableState finishRequested$delegate;

    @l
    private final y<r2> finishSignalDeferred;

    @l
    private final MutableState finishedFadingIn$delegate;

    @m
    private Offset origin;
    private final float radius;

    @m
    private Float startRadius;

    @m
    private Offset targetCenter;

    @m
    private Float targetRadius;

    private RippleAnimation(Offset offset, float f5, boolean z4) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.origin = offset;
        this.radius = f5;
        this.bounded = z4;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.finishSignalDeferred = a0.b(null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishedFadingIn$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.finishRequested$delegate = mutableStateOf$default2;
    }

    public /* synthetic */ RippleAnimation(Offset offset, float f5, boolean z4, w wVar) {
        this(offset, f5, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeIn(d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new RippleAnimation$fadeIn$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fadeOut(d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new RippleAnimation$fadeOut$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z4) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setFinishedFadingIn(boolean z4) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animate(@p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.e1.n(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.e1.n(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            kotlin.e1.n(r7)
            goto L56
        L47:
            kotlin.e1.n(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            r2.setFinishedFadingIn(r5)
            kotlinx.coroutines.y<kotlin.r2> r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ, reason: not valid java name */
    public final void m1535draw4WTKRHQ(@l DrawScope drawScope, long j5) {
        float floatValue;
        Float valueOf;
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m1537getRippleStartRadiusuvyYCjk(drawScope.mo4277getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (Float.isNaN(this.radius)) {
                valueOf = Float.valueOf(RippleAnimationKt.m1536getRippleEndRadiuscSwnlzA(drawScope, this.bounded, drawScope.mo4277getSizeNHjbRc()));
            } else {
                valueOf = Float.valueOf(drawScope.mo304toPx0680j_4(this.radius));
            }
            this.targetRadius = valueOf;
        }
        if (this.origin == null) {
            this.origin = Offset.m3482boximpl(drawScope.mo4276getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m3482boximpl(OffsetKt.Offset(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) / 2.0f, Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc()) / 2.0f));
        }
        if (getFinishRequested() && !getFinishedFadingIn()) {
            floatValue = 1.0f;
        } else {
            floatValue = this.animatedAlpha.getValue().floatValue();
        }
        Float f5 = this.startRadius;
        l0.m(f5);
        float floatValue2 = f5.floatValue();
        Float f6 = this.targetRadius;
        l0.m(f6);
        float lerp = MathHelpersKt.lerp(floatValue2, f6.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        l0.m(offset);
        float m3493getXimpl = Offset.m3493getXimpl(offset.m3503unboximpl());
        Offset offset2 = this.targetCenter;
        l0.m(offset2);
        float lerp2 = MathHelpersKt.lerp(m3493getXimpl, Offset.m3493getXimpl(offset2.m3503unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        l0.m(offset3);
        float m3494getYimpl = Offset.m3494getYimpl(offset3.m3503unboximpl());
        Offset offset4 = this.targetCenter;
        l0.m(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(m3494getYimpl, Offset.m3494getYimpl(offset4.m3503unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long m3733copywmQWz5c$default = Color.m3733copywmQWz5c$default(j5, Color.m3736getAlphaimpl(j5) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.bounded) {
            float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
            float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
            int m3723getIntersectrtfAjoo = ClipOp.Companion.m3723getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4205clipRectN_I0leg(0.0f, 0.0f, m3562getWidthimpl, m3559getHeightimpl, m3723getIntersectrtfAjoo);
            DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, m3733copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
            return;
        }
        DrawScope.m4259drawCircleVaOC9Bg$default(drawScope, m3733copywmQWz5c$default, lerp, Offset, 0.0f, null, null, 0, 120, null);
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.M(r2.f19517a);
    }
}
