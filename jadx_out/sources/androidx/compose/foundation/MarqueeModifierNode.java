package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.l2;

@i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b[\u0010\\J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u0007\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J@\u0010\u0017\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010#\u001a\u00020 *\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001c\u0010'\u001a\u00020\u000b*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u001c\u0010(\u001a\u00020\u000b*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\u001c\u0010*\u001a\u00020\u000b*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000bH\u0016J\u001c\u0010+\u001a\u00020\u000b*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010)\u001a\u00020\u000bH\u0016J\f\u0010-\u001a\u00020\u0005*\u00020,H\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010.R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010/R+\u00107\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010;\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R+\u0010C\u001a\u00020<2\u0006\u00100\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR+\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010>\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR1\u0010\u000e\u001a\u00020\r2\u0006\u00100\u001a\u00020\r8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010>\u001a\u0004\bM\u00104\"\u0004\bN\u00106R \u0010R\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020Q0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010W\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00104R\u0014\u0010Z\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006]"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Lkotlin/r2;", "restartAnimation", "runAnimation", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "onAttach", "onDetach", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "update-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)V", "update", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "I", "F", "<set-?>", "contentWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "getContentWidth", "()I", "setContentWidth", "(I)V", "contentWidth", "containerWidth$delegate", "getContainerWidth", "setContainerWidth", "containerWidth", "", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Lkotlinx/coroutines/l2;", "animationJob", "Lkotlinx/coroutines/l2;", "spacing$delegate", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "animationMode$delegate", "getAnimationMode-ZbEOnfQ", "setAnimationMode-97h66l8", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/animation/core/Animatable;", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "getSpacingPx", "spacingPx", "getDirection", "()F", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "<init>", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,515:1\n75#2:516\n108#2,2:517\n75#2:519\n108#2,2:520\n81#3:522\n107#3,2:523\n81#3:525\n107#3,2:526\n81#3:528\n107#3,2:529\n81#3:531\n215#4,8:532\n262#4,8:540\n116#4,9:548\n270#4,3:557\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifierNode\n*L\n210#1:516\n210#1:517,2\n211#1:519\n211#1:520,2\n212#1:522\n212#1:523,2\n214#1:525\n214#1:526,2\n215#1:528\n215#1:529,2\n223#1:531\n322#1:532,8\n322#1:540,8\n332#1:548,9\n322#1:557,3\n*E\n"})
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {

    @p4.m
    private l2 animationJob;

    @p4.l
    private final MutableState animationMode$delegate;

    @p4.l
    private final MutableIntState containerWidth$delegate;

    @p4.l
    private final MutableIntState contentWidth$delegate;
    private int delayMillis;

    @p4.l
    private final MutableState hasFocus$delegate;
    private int initialDelayMillis;
    private int iterations;

    @p4.l
    private final Animatable<Float, AnimationVector1D> offset;

    @p4.l
    private final MutableState spacing$delegate;

    @p4.l
    private final State spacingPx$delegate;
    private float velocity;

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MarqueeModifierNode(int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        this.iterations = i5;
        this.delayMillis = i7;
        this.initialDelayMillis = i8;
        this.velocity = f5;
        this.contentWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.spacing$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m272boximpl(i6), null, 2, null);
        this.animationMode$delegate = mutableStateOf$default3;
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new MarqueeModifierNode$spacingPx$2(marqueeSpacing, this));
    }

    public /* synthetic */ MarqueeModifierNode(int i5, int i6, int i7, int i8, MarqueeSpacing marqueeSpacing, float f5, w wVar) {
        this(i5, i6, i7, i8, marqueeSpacing, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float signum = Math.signum(this.velocity);
        int i5 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            if (i5 == 2) {
                i6 = -1;
            } else {
                throw new j0();
            }
        }
        return signum * i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    private final void restartAnimation() {
        l2 f5;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        if (isAttached()) {
            f5 = kotlinx.coroutines.k.f(getCoroutineScope(), null, null, new MarqueeModifierNode$restartAnimation$1(l2Var, this, null), 3, null);
            this.animationJob = f5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        if (this.iterations <= 0) {
            return r2.f19517a;
        }
        Object h5 = kotlinx.coroutines.i.h(FixedMotionDurationScale.INSTANCE, new MarqueeModifierNode$runAnimation$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (h5 == l5) {
            return h5;
        }
        return r2.f19517a;
    }

    private final void setContainerWidth(int i5) {
        this.containerWidth$delegate.setIntValue(i5);
    }

    private final void setContentWidth(int i5) {
        this.contentWidth$delegate.setIntValue(i5);
    }

    private final void setHasFocus(boolean z4) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z4));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@p4.l ContentDrawScope contentDrawScope) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int spacingPx;
        float floatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z8 = true;
        if (getDirection() == 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 ? this.offset.getValue().floatValue() < getContainerWidth() : this.offset.getValue().floatValue() < getContentWidth()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getDirection() == 1.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 ? this.offset.getValue().floatValue() > getSpacingPx() : this.offset.getValue().floatValue() > (getContentWidth() + getSpacingPx()) - getContainerWidth()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getDirection() != 1.0f) {
            z8 = false;
        }
        if (z8) {
            spacingPx = getContentWidth() + getSpacingPx();
        } else {
            spacingPx = (-getContentWidth()) - getSpacingPx();
        }
        float f5 = spacingPx;
        float m3559getHeightimpl = Size.m3559getHeightimpl(contentDrawScope.mo4277getSizeNHjbRc());
        int m3723getIntersectrtfAjoo = ClipOp.Companion.m3723getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4205clipRectN_I0leg(floatValue, 0.0f, floatValue + getContainerWidth(), m3559getHeightimpl, m3723getIntersectrtfAjoo);
        if (z5) {
            contentDrawScope.drawContent();
        }
        if (z7) {
            contentDrawScope.getDrawContext().getTransform().translate(f5, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f5, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m287getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m278unboximpl();
    }

    @p4.l
    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return intrinsicMeasurable.maxIntrinsicWidth(i5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo4998measureBRTryo0.getWidth()));
        setContentWidth(mo4998measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), mo4998measureBRTryo0.getHeight(), null, new MarqueeModifierNode$measure$1(mo4998measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l IntrinsicMeasurable intrinsicMeasurable, int i5) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.animationJob = null;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@p4.l FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m288setAnimationMode97h66l8(int i5) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m272boximpl(i5));
    }

    public final void setSpacing(@p4.l MarqueeSpacing marqueeSpacing) {
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m289updatelWfNwf4(int i5, int i6, int i7, int i8, @p4.l MarqueeSpacing marqueeSpacing, float f5) {
        setSpacing(marqueeSpacing);
        m288setAnimationMode97h66l8(i6);
        if (this.iterations != i5 || this.delayMillis != i7 || this.initialDelayMillis != i8 || !Dp.m6049equalsimpl0(this.velocity, f5)) {
            this.iterations = i5;
            this.delayMillis = i7;
            this.initialDelayMillis = i8;
            this.velocity = f5;
            restartAnimation();
        }
    }
}
