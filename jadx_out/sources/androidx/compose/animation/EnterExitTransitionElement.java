package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008d\u0001\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t\u0012\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\bD\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0005*\u00020\u0007H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J!\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J!\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J!\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\u009d\u0001\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t2 \b\u0002\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t2 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u0017HÆ\u0001J\t\u0010\"\u001a\u00020!HÖ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\u0013\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+R:\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R:\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R:\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fR\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u001e\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u001f\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/EnterExitTransitionModifierNode;", "create", "node", "Lkotlin/r2;", "update", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "component1", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "component2", "Landroidx/compose/ui/unit/IntOffset;", "component3", "component4", "Landroidx/compose/animation/EnterTransition;", "component5", "Landroidx/compose/animation/ExitTransition;", "component6", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "component7", "transition", "sizeAnimation", "offsetAnimation", "slideAnimation", "enter", d.f3034z, "graphicsLayerBlock", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "setSizeAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "getOffsetAnimation", "setOffsetAnimation", "getSlideAnimation", "setSlideAnimation", "Landroidx/compose/animation/EnterTransition;", "getEnter", "()Landroidx/compose/animation/EnterTransition;", "setEnter", "(Landroidx/compose/animation/EnterTransition;)V", "Landroidx/compose/animation/ExitTransition;", "getExit", "()Landroidx/compose/animation/ExitTransition;", "setExit", "(Landroidx/compose/animation/ExitTransition;)V", "Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "getGraphicsLayerBlock", "()Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;", "setGraphicsLayerBlock", "(Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/animation/GraphicsLayerBlockForEnterExit;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends ModifierNodeElement<EnterExitTransitionModifierNode> {

    @l
    private EnterTransition enter;

    @l
    private ExitTransition exit;

    @l
    private GraphicsLayerBlockForEnterExit graphicsLayerBlock;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> offsetAnimation;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;

    @m
    private Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> slideAnimation;

    @l
    private final Transition<EnterExitState> transition;

    public EnterExitTransitionElement(@l Transition<EnterExitState> transition, @m Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        this.transition = transition;
        this.sizeAnimation = deferredAnimation;
        this.offsetAnimation = deferredAnimation2;
        this.slideAnimation = deferredAnimation3;
        this.enter = enterTransition;
        this.exit = exitTransition;
        this.graphicsLayerBlock = graphicsLayerBlockForEnterExit;
    }

    public static /* synthetic */ EnterExitTransitionElement copy$default(EnterExitTransitionElement enterExitTransitionElement, Transition transition, Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition.DeferredAnimation deferredAnimation3, EnterTransition enterTransition, ExitTransition exitTransition, GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            transition = enterExitTransitionElement.transition;
        }
        if ((i5 & 2) != 0) {
            deferredAnimation = enterExitTransitionElement.sizeAnimation;
        }
        Transition.DeferredAnimation deferredAnimation4 = deferredAnimation;
        if ((i5 & 4) != 0) {
            deferredAnimation2 = enterExitTransitionElement.offsetAnimation;
        }
        Transition.DeferredAnimation deferredAnimation5 = deferredAnimation2;
        if ((i5 & 8) != 0) {
            deferredAnimation3 = enterExitTransitionElement.slideAnimation;
        }
        Transition.DeferredAnimation deferredAnimation6 = deferredAnimation3;
        if ((i5 & 16) != 0) {
            enterTransition = enterExitTransitionElement.enter;
        }
        EnterTransition enterTransition2 = enterTransition;
        if ((i5 & 32) != 0) {
            exitTransition = enterExitTransitionElement.exit;
        }
        ExitTransition exitTransition2 = exitTransition;
        if ((i5 & 64) != 0) {
            graphicsLayerBlockForEnterExit = enterExitTransitionElement.graphicsLayerBlock;
        }
        return enterExitTransitionElement.copy(transition, deferredAnimation4, deferredAnimation5, deferredAnimation6, enterTransition2, exitTransition2, graphicsLayerBlockForEnterExit);
    }

    @l
    public final Transition<EnterExitState> component1() {
        return this.transition;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> component2() {
        return this.sizeAnimation;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component3() {
        return this.offsetAnimation;
    }

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> component4() {
        return this.slideAnimation;
    }

    @l
    public final EnterTransition component5() {
        return this.enter;
    }

    @l
    public final ExitTransition component6() {
        return this.exit;
    }

    @l
    public final GraphicsLayerBlockForEnterExit component7() {
        return this.graphicsLayerBlock;
    }

    @l
    public final EnterExitTransitionElement copy(@l Transition<EnterExitState> transition, @m Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2, @m Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit) {
        return new EnterExitTransitionElement(transition, deferredAnimation, deferredAnimation2, deferredAnimation3, enterTransition, exitTransition, graphicsLayerBlockForEnterExit);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return l0.g(this.transition, enterExitTransitionElement.transition) && l0.g(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && l0.g(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && l0.g(this.slideAnimation, enterExitTransitionElement.slideAnimation) && l0.g(this.enter, enterExitTransitionElement.enter) && l0.g(this.exit, enterExitTransitionElement.exit) && l0.g(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
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

    @m
    public final Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> getSlideAnimation() {
        return this.slideAnimation;
    }

    @l
    public final Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = this.transition.hashCode() * 31;
        Transition<EnterExitState>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
        int hashCode2 = (hashCode + (deferredAnimation == null ? 0 : deferredAnimation.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation2 = this.offsetAnimation;
        int hashCode3 = (hashCode2 + (deferredAnimation2 == null ? 0 : deferredAnimation2.hashCode())) * 31;
        Transition<EnterExitState>.DeferredAnimation<IntOffset, AnimationVector2D> deferredAnimation3 = this.slideAnimation;
        return ((((((hashCode3 + (deferredAnimation3 != null ? deferredAnimation3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("enterExitTransition");
        inspectorInfo.getProperties().set("transition", this.transition);
        inspectorInfo.getProperties().set("sizeAnimation", this.sizeAnimation);
        inspectorInfo.getProperties().set("offsetAnimation", this.offsetAnimation);
        inspectorInfo.getProperties().set("slideAnimation", this.slideAnimation);
        inspectorInfo.getProperties().set("enter", this.enter);
        inspectorInfo.getProperties().set(d.f3034z, this.exit);
        inspectorInfo.getProperties().set("graphicsLayerBlock", this.graphicsLayerBlock);
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

    @l
    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @l
    public EnterExitTransitionModifierNode create() {
        return new EnterExitTransitionModifierNode(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@l EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.setTransition(this.transition);
        enterExitTransitionModifierNode.setSizeAnimation(this.sizeAnimation);
        enterExitTransitionModifierNode.setOffsetAnimation(this.offsetAnimation);
        enterExitTransitionModifierNode.setSlideAnimation(this.slideAnimation);
        enterExitTransitionModifierNode.setEnter(this.enter);
        enterExitTransitionModifierNode.setExit(this.exit);
        enterExitTransitionModifierNode.setGraphicsLayerBlock(this.graphicsLayerBlock);
    }
}
