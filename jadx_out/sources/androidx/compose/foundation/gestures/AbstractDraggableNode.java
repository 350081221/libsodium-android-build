package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B¿\u0001\u0012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(\u0012\u0006\u00101\u001a\u00020*\u0012\b\u00108\u001a\u0004\u0018\u000107\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020*0>\u0012<\u0010J\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110F¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130E¢\u0006\u0002\b\u0014\u0012<\u0010R\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110P¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130E¢\u0006\u0002\b\u0014\u0012\u0006\u0010U\u001a\u00020*¢\u0006\u0004\bn\u0010oJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\u00020\u00042'\u0010\u0015\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001a\u001a\u00020\u0004*\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0004H\u0016J*\u0010%\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\b\u0010&\u001a\u00020\u0004H\u0016J\u0006\u0010'\u001a\u00020\u0004R.\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010?\u001a\b\u0012\u0004\u0012\u00020*0>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRX\u0010J\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110F¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130E¢\u0006\u0002\b\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010ORX\u0010R\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0013\u0012\u00110P¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130E¢\u0006\u0002\b\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010K\u001a\u0004\bS\u0010M\"\u0004\bT\u0010OR\"\u0010U\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u00102\u001a\u0004\bV\u00104\"\u0004\bW\u00106R \u0010X\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010,R\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020*0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010@R\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u00102R\u0017\u0010_\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006p"}, d2 = {"Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Lkotlin/r2;", "startListeningForEvents", "Lkotlinx/coroutines/s0;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", NotificationCompat.CATEGORY_EVENT, "processDragStart", "(Lkotlinx/coroutines/s0;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "processDragStop", "(Lkotlinx/coroutines/s0;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/d;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/s0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "drag", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "dragDelta", "draggingBy", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onDetach", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "disposeInteractionSource", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "canDrag", "Lv3/l;", "getCanDrag", "()Lv3/l;", "setCanDrag", "(Lv3/l;)V", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Lkotlin/Function0;", "startDragImmediately", "Lv3/a;", "getStartDragImmediately", "()Lv3/a;", "setStartDragImmediately", "(Lv3/a;)V", "Lkotlin/Function3;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "onDragStarted", "Lv3/q;", "getOnDragStarted", "()Lv3/q;", "setOnDragStarted", "(Lv3/q;)V", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "getOnDragStopped", "setOnDragStopped", "reverseDirection", "getReverseDirection", "setReverseDirection", "_canDrag", "_startDragImmediately", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "isListeningForEvents", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getPointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "Lkotlinx/coroutines/channels/l;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "<init>", "(Lv3/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lv3/a;Lv3/q;Lv3/q;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class AbstractDraggableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @l
    private v3.l<? super PointerInputChange, Boolean> canDrag;

    @m
    private DragInteraction.Start dragInteraction;
    private boolean enabled;

    @m
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;

    @l
    private q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> onDragStarted;

    @l
    private q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> onDragStopped;
    private boolean reverseDirection;

    @l
    private a<Boolean> startDragImmediately;

    @l
    private final v3.l<PointerInputChange, Boolean> _canDrag = new AbstractDraggableNode$_canDrag$1(this);

    @l
    private final a<Boolean> _startDragImmediately = new AbstractDraggableNode$_startDragImmediately$1(this);

    @l
    private final VelocityTracker velocityTracker = new VelocityTracker();

    @l
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractDraggableNode$pointerInputNode$1(this, null)));

    @l
    private final kotlinx.coroutines.channels.l<DragEvent> channel = o.d(Integer.MAX_VALUE, null, null, 6, null);

    public AbstractDraggableNode(@l v3.l<? super PointerInputChange, Boolean> lVar, boolean z4, @m MutableInteractionSource mutableInteractionSource, @l a<Boolean> aVar, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z5) {
        this.canDrag = lVar;
        this.enabled = z4;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = aVar;
        this.onDragStarted = qVar;
        this.onDragStopped = qVar2;
        this.reverseDirection = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragCancel(kotlinx.coroutines.s0 r9, kotlin.coroutines.d<? super kotlin.r2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.e1.n(r10)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            java.lang.Object r9 = r0.L$1
            kotlinx.coroutines.s0 r9 = (kotlinx.coroutines.s0) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            kotlin.e1.n(r10)
            goto L5f
        L41:
            kotlin.e1.n(r10)
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = r8.dragInteraction
            if (r10 == 0) goto L62
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L5e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r10)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r2.emit(r6, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            r2 = r8
        L5f:
            r2.dragInteraction = r5
            goto L63
        L62:
            r2 = r8
        L63:
            v3.q<? super kotlinx.coroutines.s0, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r10 = r2.onDragStopped
            androidx.compose.ui.unit.Velocity$Companion r2 = androidx.compose.ui.unit.Velocity.Companion
            long r6 = r2.m6290getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m6270boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r10.invoke(r9, r2, r0)
            if (r9 != r1) goto L7c
            return r1
        L7c:
            kotlin.r2 r9 = kotlin.r2.f19517a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragCancel(kotlinx.coroutines.s0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStart(kotlinx.coroutines.s0 r9, androidx.compose.foundation.gestures.DragEvent.DragStarted r10, kotlin.coroutines.d<? super kotlin.r2> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5f
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.e1.n(r11)
            goto Lbd
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.L$3
            androidx.compose.foundation.interaction.DragInteraction$Start r9 = (androidx.compose.foundation.interaction.DragInteraction.Start) r9
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r10 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r10
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.s0 r2 = (kotlinx.coroutines.s0) r2
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r4 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r4
            kotlin.e1.n(r11)
            goto L9c
        L4c:
            java.lang.Object r9 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) r9
            java.lang.Object r10 = r0.L$1
            kotlinx.coroutines.s0 r10 = (kotlinx.coroutines.s0) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            kotlin.e1.n(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L5f:
            kotlin.e1.n(r11)
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = r8.dragInteraction
            if (r11 == 0) goto L7e
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r8.interactionSource
            if (r2 == 0) goto L7e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r2.emit(r6, r0)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r2 = r8
        L7f:
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r11.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r2.interactionSource
            if (r5 == 0) goto L9f
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r4 = r5.emit(r11, r0)
            if (r4 != r1) goto L99
            return r1
        L99:
            r4 = r2
            r2 = r9
            r9 = r11
        L9c:
            r11 = r9
            r9 = r2
            r2 = r4
        L9f:
            r2.dragInteraction = r11
            v3.q<? super kotlinx.coroutines.s0, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r11 = r2.onDragStarted
            long r4 = r10.m322getStartPointF1C5BW0()
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m3482boximpl(r4)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto Lbd
            return r1
        Lbd:
            kotlin.r2 r9 = kotlin.r2.f19517a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragStart(kotlinx.coroutines.s0, androidx.compose.foundation.gestures.DragEvent$DragStarted, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processDragStop(kotlinx.coroutines.s0 r10, androidx.compose.foundation.gestures.DragEvent.DragStopped r11, kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 r0 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.e1.n(r12)
            goto L85
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.L$2
            androidx.compose.foundation.gestures.DragEvent$DragStopped r10 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) r10
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            kotlin.e1.n(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L68
        L48:
            kotlin.e1.n(r12)
            androidx.compose.foundation.interaction.DragInteraction$Start r12 = r9.dragInteraction
            if (r12 == 0) goto L6b
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r9.interactionSource
            if (r2 == 0) goto L67
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r12)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r2.emit(r6, r0)
            if (r12 != r1) goto L67
            return r1
        L67:
            r2 = r9
        L68:
            r2.dragInteraction = r5
            goto L6c
        L6b:
            r2 = r9
        L6c:
            v3.q<? super kotlinx.coroutines.s0, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r12 = r2.onDragStopped
            long r6 = r11.m323getVelocity9UxMQ8M()
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m6270boximpl(r6)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r10 = r12.invoke(r10, r11, r0)
            if (r10 != r1) goto L85
            return r1
        L85:
            kotlin.r2 r10 = kotlin.r2.f19517a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.processDragStop(kotlinx.coroutines.s0, androidx.compose.foundation.gestures.DragEvent$DragStopped, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        k.f(getCoroutineScope(), null, null, new AbstractDraggableNode$startListeningForEvents$1(this, null), 3, null);
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }

    @m
    public abstract Object drag(@l p<? super AbstractDragScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar);

    @m
    public abstract Object draggingBy(@l AbstractDragScope abstractDragScope, @l DragEvent.DragDelta dragDelta, @l d<? super r2> dVar);

    @l
    public final v3.l<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m
    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @l
    public final q<s0, Offset, d<? super r2>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    @l
    public final q<s0, Velocity, d<? super r2>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    @l
    public abstract PointerDirectionConfig getPointerDirectionConfig();

    @l
    public final SuspendingPointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @l
    public final a<Boolean> getStartDragImmediately() {
        return this.startDragImmediately;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        this.pointerInputNode.mo170onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j5);
    }

    public final void setCanDrag(@l v3.l<? super PointerInputChange, Boolean> lVar) {
        this.canDrag = lVar;
    }

    public final void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    public final void setInteractionSource(@m MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setOnDragStarted(@l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar) {
        this.onDragStarted = qVar;
    }

    public final void setOnDragStopped(@l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar) {
        this.onDragStopped = qVar;
    }

    public final void setReverseDirection(boolean z4) {
        this.reverseDirection = z4;
    }

    public final void setStartDragImmediately(@l a<Boolean> aVar) {
        this.startDragImmediately = aVar;
    }
}
