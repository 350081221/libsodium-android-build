package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.alipay.sdk.m.x.d;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u001e\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u001e\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b_\u0010`J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\tH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J&\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0007R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR:\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R:\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R:\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!\u0018\u00010 R\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010GR*\u0010I\u001a\u00020\u00112\u0006\u0010H\u001a\u00020\u00118\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010G\"\u0004\bJ\u0010KR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR4\u0010W\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020T\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040U0S¢\u0006\u0002\bV8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR4\u0010[\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020T\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0U0S¢\u0006\u0002\bV8\u0006¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR\u0013\u0010^\u001a\u0004\u0018\u00010L8F¢\u0006\u0006\u001a\u0004\b]\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/EnterExitState;", "targetState", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "sizeByState-Uzc_VyU", "(Landroidx/compose/animation/EnterExitState;J)J", "sizeByState", "Lkotlin/r2;", "onAttach", "Landroidx/compose/ui/unit/IntOffset;", "targetOffsetByState-oFUgxo0", "targetOffsetByState", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "slideTargetValueByState-oFUgxo0", "slideTargetValueByState", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "(Landroidx/compose/animation/core/Transition;)V", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/animation/core/AnimationVector2D;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "offsetAnimation", "getOffsetAnimation", "setOffsetAnimation", "slideAnimation", "getSlideAnimation", "setSlideAnimation", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/EnterTransition;", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "Landroidx/compose/animation/ExitTransition;", d.f3034z, "Landroidx/compose/animation/ExitTransition;", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "graphicsLayerBlock", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "", "lookaheadConstraintsAvailable", "Z", "lookaheadSize", "J", b.f22420d, "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "Landroidx/compose/ui/Alignment;", "currentAlignment", "Landroidx/compose/ui/Alignment;", "getCurrentAlignment", "()Landroidx/compose/ui/Alignment;", "setCurrentAlignment", "(Landroidx/compose/ui/Alignment;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/u;", "sizeTransitionSpec", "Lv3/l;", "getSizeTransitionSpec", "()Lv3/l;", "slideSpec", "getSlideSpec", "getAlignment", "alignment", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1246:1\n79#2:1247\n86#2:1248\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1128#1:1247\n1170#1:1248\n*E\n"})
/* loaded from: classes.dex */
public final class EnterExitTransitionModifierNode extends LayoutModifierNodeWithPassThroughIntrinsics {

    @m
    private Alignment currentAlignment;

    @l
    private EnterTransition enter;

    @l
    private ExitTransition exit;

    @l
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;
    private boolean lookaheadConstraintsAvailable;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @l
    private Transition<EnterExitState> transition;
    private long lookaheadSize = AnimationModifierKt.getInvalidSize();
    private long lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

    @l
    private final v3.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> sizeTransitionSpec = new EnterExitTransitionModifierNode$sizeTransitionSpec$1(this);

    @l
    private final v3.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> slideSpec = new EnterExitTransitionModifierNode$slideSpec$1(this);

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

    public EnterExitTransitionModifierNode(@l Transition<EnterExitState> transition, @m Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    /* renamed from: setLookaheadConstraints-BRTryo0, reason: not valid java name */
    private final void m81setLookaheadConstraintsBRTryo0(long j5) {
        this.lookaheadConstraintsAvailable = true;
        this.lookaheadConstraints = j5;
    }

    @m
    public final Alignment getAlignment() {
        Alignment alignment;
        if (this.transition.getSegment().isTransitioningTo(EnterExitState.PreEnter, EnterExitState.Visible)) {
            ChangeSize changeSize = this.enter.getData$animation_release().getChangeSize();
            if (changeSize == null || (alignment = changeSize.getAlignment()) == null) {
                ChangeSize changeSize2 = this.exit.getData$animation_release().getChangeSize();
                if (changeSize2 == null) {
                    return null;
                }
                return changeSize2.getAlignment();
            }
        } else {
            ChangeSize changeSize3 = this.exit.getData$animation_release().getChangeSize();
            if (changeSize3 == null || (alignment = changeSize3.getAlignment()) == null) {
                ChangeSize changeSize4 = this.enter.getData$animation_release().getChangeSize();
                if (changeSize4 == null) {
                    return null;
                }
                return changeSize4.getAlignment();
            }
        }
        return alignment;
    }

    @m
    public final Alignment getCurrentAlignment() {
        return this.currentAlignment;
    }

    @l
    public final EnterTransition getEnter() {
        return this.enter;
    }

    @l
    public final ExitTransition getExit() {
        return this.exit;
    }

    @l
    public final GraphicsLayerBlockForEnterExit getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getOffsetAnimation() {
        return this.offsetAnimation;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
        return this.sizeAnimation;
    }

    @l
    public final v3.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> getSizeTransitionSpec() {
        return this.sizeTransitionSpec;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    @l
    public final v3.l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> getSlideSpec() {
        return this.slideSpec;
    }

    @l
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        long j6;
        long m6182getZeronOccac;
        long m6182getZeronOccac2;
        long m6182getZeronOccac3;
        State<IntOffset> animate;
        State<IntOffset> animate2;
        State<IntSize> state = null;
        if (this.transition.getCurrentState() == this.transition.getTargetState()) {
            this.currentAlignment = null;
        } else if (this.currentAlignment == null) {
            Alignment alignment = getAlignment();
            if (alignment == null) {
                alignment = Alignment.Companion.getTopStart();
            }
            this.currentAlignment = alignment;
        }
        if (measureScope.isLookingAhead()) {
            Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
            long IntSize = IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight());
            this.lookaheadSize = IntSize;
            m81setLookaheadConstraintsBRTryo0(j5);
            return MeasureScope.layout$default(measureScope, IntSize.m6214getWidthimpl(IntSize), IntSize.m6213getHeightimpl(IntSize), null, new EnterExitTransitionModifierNode$measure$1(mo4998measureBRTryo0), 4, null);
        }
        v3.l<GraphicsLayerScope, r2> init = this.graphicsLayerBlock.init();
        Placeable mo4998measureBRTryo02 = measurable.mo4998measureBRTryo0(j5);
        long IntSize2 = IntSizeKt.IntSize(mo4998measureBRTryo02.getWidth(), mo4998measureBRTryo02.getHeight());
        if (AnimationModifierKt.m60isValidozmzZPI(this.lookaheadSize)) {
            j6 = this.lookaheadSize;
        } else {
            j6 = IntSize2;
        }
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        if (deferredAnimation != null) {
            state = deferredAnimation.animate(this.sizeTransitionSpec, new EnterExitTransitionModifierNode$measure$animSize$1(this, j6));
        }
        if (state != null) {
            IntSize2 = state.getValue().m6218unboximpl();
        }
        long m6011constrain4WqzIAM = ConstraintsKt.m6011constrain4WqzIAM(j5, IntSize2);
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        if (deferredAnimation2 != null && (animate2 = deferredAnimation2.animate(EnterExitTransitionModifierNode$measure$offsetDelta$1.INSTANCE, new EnterExitTransitionModifierNode$measure$offsetDelta$2(this, j6))) != null) {
            m6182getZeronOccac = animate2.getValue().m6181unboximpl();
        } else {
            m6182getZeronOccac = IntOffset.Companion.m6182getZeronOccac();
        }
        long j7 = m6182getZeronOccac;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        if (deferredAnimation3 != null && (animate = deferredAnimation3.animate(this.slideSpec, new EnterExitTransitionModifierNode$measure$slideOffset$1(this, j6))) != null) {
            m6182getZeronOccac2 = animate.getValue().m6181unboximpl();
        } else {
            m6182getZeronOccac2 = IntOffset.Companion.m6182getZeronOccac();
        }
        Alignment alignment2 = this.currentAlignment;
        if (alignment2 != null) {
            m6182getZeronOccac3 = alignment2.mo3370alignKFBX0sM(j6, m6011constrain4WqzIAM, LayoutDirection.Ltr);
        } else {
            m6182getZeronOccac3 = IntOffset.Companion.m6182getZeronOccac();
        }
        return MeasureScope.layout$default(measureScope, IntSize.m6214getWidthimpl(m6011constrain4WqzIAM), IntSize.m6213getHeightimpl(m6011constrain4WqzIAM), null, new EnterExitTransitionModifierNode$measure$2(mo4998measureBRTryo02, IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6182getZeronOccac3) + IntOffset.m6172getXimpl(m6182getZeronOccac2), IntOffset.m6173getYimpl(m6182getZeronOccac3) + IntOffset.m6173getYimpl(m6182getZeronOccac2)), j7, init), 4, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.lookaheadConstraintsAvailable = false;
        this.lookaheadSize = AnimationModifierKt.getInvalidSize();
    }

    public final void setCurrentAlignment(@m Alignment alignment) {
        this.currentAlignment = alignment;
    }

    public final void setEnter(@l EnterTransition enterTransition) {
        this.enter = enterTransition;
    }

    public final void setExit(@l ExitTransition exitTransition) {
        this.exit = exitTransition;
    }

    public final void setGraphicsLayerBlock(@l GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public final void setOffsetAnimation(@m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.offsetAnimation = deferredAnimation;
    }

    public final void setSizeAnimation(@m Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation) {
        this.sizeAnimation = deferredAnimation;
    }

    public final void setSlideAnimation(@m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation) {
        this.slideAnimation = deferredAnimation;
    }

    public final void setTransition(@l Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    /* renamed from: sizeByState-Uzc_VyU, reason: not valid java name */
    public final long m83sizeByStateUzc_VyU(@l EnterExitState enterExitState, long j5) {
        v3.l<IntSize, IntSize> size;
        v3.l<IntSize, IntSize> size2;
        int i5 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    ChangeSize changeSize = this.exit.getData$animation_release().getChangeSize();
                    if (changeSize != null && (size2 = changeSize.getSize()) != null) {
                        return size2.invoke(IntSize.m6206boximpl(j5)).m6218unboximpl();
                    }
                    return j5;
                }
                throw new j0();
            }
            ChangeSize changeSize2 = this.enter.getData$animation_release().getChangeSize();
            if (changeSize2 != null && (size = changeSize2.getSize()) != null) {
                return size.invoke(IntSize.m6206boximpl(j5)).m6218unboximpl();
            }
            return j5;
        }
        return j5;
    }

    /* renamed from: slideTargetValueByState-oFUgxo0, reason: not valid java name */
    public final long m84slideTargetValueByStateoFUgxo0(@l EnterExitState enterExitState, long j5) {
        long m6182getZeronOccac;
        long m6182getZeronOccac2;
        v3.l<IntSize, IntOffset> slideOffset;
        v3.l<IntSize, IntOffset> slideOffset2;
        Slide slide = this.enter.getData$animation_release().getSlide();
        if (slide != null && (slideOffset2 = slide.getSlideOffset()) != null) {
            m6182getZeronOccac = slideOffset2.invoke(IntSize.m6206boximpl(j5)).m6181unboximpl();
        } else {
            m6182getZeronOccac = IntOffset.Companion.m6182getZeronOccac();
        }
        Slide slide2 = this.exit.getData$animation_release().getSlide();
        if (slide2 != null && (slideOffset = slide2.getSlideOffset()) != null) {
            m6182getZeronOccac2 = slideOffset.invoke(IntSize.m6206boximpl(j5)).m6181unboximpl();
        } else {
            m6182getZeronOccac2 = IntOffset.Companion.m6182getZeronOccac();
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return m6182getZeronOccac2;
                }
                throw new j0();
            }
            return m6182getZeronOccac;
        }
        return IntOffset.Companion.m6182getZeronOccac();
    }

    /* renamed from: targetOffsetByState-oFUgxo0, reason: not valid java name */
    public final long m85targetOffsetByStateoFUgxo0(@l EnterExitState enterExitState, long j5) {
        if (this.currentAlignment == null) {
            return IntOffset.Companion.m6182getZeronOccac();
        }
        if (getAlignment() == null) {
            return IntOffset.Companion.m6182getZeronOccac();
        }
        if (l0.g(this.currentAlignment, getAlignment())) {
            return IntOffset.Companion.m6182getZeronOccac();
        }
        int i5 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    ChangeSize changeSize = this.exit.getData$animation_release().getChangeSize();
                    if (changeSize != null) {
                        long m6218unboximpl = changeSize.getSize().invoke(IntSize.m6206boximpl(j5)).m6218unboximpl();
                        Alignment alignment = getAlignment();
                        l0.m(alignment);
                        LayoutDirection layoutDirection = LayoutDirection.Ltr;
                        long mo3370alignKFBX0sM = alignment.mo3370alignKFBX0sM(j5, m6218unboximpl, layoutDirection);
                        Alignment alignment2 = this.currentAlignment;
                        l0.m(alignment2);
                        long mo3370alignKFBX0sM2 = alignment2.mo3370alignKFBX0sM(j5, m6218unboximpl, layoutDirection);
                        return IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(mo3370alignKFBX0sM) - IntOffset.m6172getXimpl(mo3370alignKFBX0sM2), IntOffset.m6173getYimpl(mo3370alignKFBX0sM) - IntOffset.m6173getYimpl(mo3370alignKFBX0sM2));
                    }
                    return IntOffset.Companion.m6182getZeronOccac();
                }
                throw new j0();
            }
            return IntOffset.Companion.m6182getZeronOccac();
        }
        return IntOffset.Companion.m6182getZeronOccac();
    }
}
