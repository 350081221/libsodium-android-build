package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B1\b\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b8\u00109J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H¤@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u001f\u0010\u0018\u001a\u00020\u0006*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0084@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0006H\u0004R\"\u0010\u001b\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0001\u0002:;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<"}, d2 = {"Landroidx/compose/foundation/AbstractClickablePointerInputNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "pointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/d;)Ljava/lang/Object;", "handlePressInteraction", "resetPointerInputHandler", "", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Lkotlin/Function0;", "onClick", "Lv3/a;", "getOnClick", "()Lv3/a;", "setOnClick", "(Lv3/a;)V", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "interactionData", "Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "getInteractionData", "()Landroidx/compose/foundation/AbstractClickableNode$InteractionData;", "delayPressInteraction", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "<init>", "(ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Landroidx/compose/foundation/AbstractClickableNode$InteractionData;)V", "Landroidx/compose/foundation/ClickablePointerInputNode;", "Landroidx/compose/foundation/CombinedClickablePointerInputNode;", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
abstract class AbstractClickablePointerInputNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode, PointerInputModifierNode {

    @p4.l
    private final v3.a<Boolean> delayPressInteraction;
    private boolean enabled;

    @p4.l
    private final AbstractClickableNode.InteractionData interactionData;

    @p4.m
    private MutableInteractionSource interactionSource;

    @p4.l
    private v3.a<r2> onClick;

    @p4.l
    private final SuspendingPointerInputModifierNode pointerInputNode;

    private AbstractClickablePointerInputNode(boolean z4, MutableInteractionSource mutableInteractionSource, v3.a<r2> aVar, AbstractClickableNode.InteractionData interactionData) {
        this.enabled = z4;
        this.interactionSource = mutableInteractionSource;
        this.onClick = aVar;
        this.interactionData = interactionData;
        this.delayPressInteraction = new AbstractClickablePointerInputNode$delayPressInteraction$1(this);
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickablePointerInputNode$pointerInputNode$1(this, null)));
    }

    public /* synthetic */ AbstractClickablePointerInputNode(boolean z4, MutableInteractionSource mutableInteractionSource, v3.a aVar, AbstractClickableNode.InteractionData interactionData, w wVar) {
        this(z4, mutableInteractionSource, aVar, interactionData);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final AbstractClickableNode.InteractionData getInteractionData() {
        return this.interactionData;
    }

    @p4.m
    protected final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final v3.a<r2> getOnClick() {
        return this.onClick;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m175handlePressInteractiond4ec7I(@p4.l PressGestureScope pressGestureScope, long j5, @p4.l kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            Object m231access$handlePressInteractionEPk0efs = ClickableKt.m231access$handlePressInteractionEPk0efs(pressGestureScope, j5, mutableInteractionSource, this.interactionData, this.delayPressInteraction, dVar);
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (m231access$handlePressInteractionEPk0efs == l5) {
                return m231access$handlePressInteractionEPk0efs;
            }
        }
        return r2.f19517a;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@p4.l PointerEvent pointerEvent, @p4.l PointerEventPass pointerEventPass, long j5) {
        this.pointerInputNode.mo170onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.m
    public abstract Object pointerInput(@p4.l PointerInputScope pointerInputScope, @p4.l kotlin.coroutines.d<? super r2> dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void resetPointerInputHandler() {
        this.pointerInputNode.resetPointerInputHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setInteractionSource(@p4.m MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnClick(@p4.l v3.a<r2> aVar) {
        this.onClick = aVar;
    }
}
