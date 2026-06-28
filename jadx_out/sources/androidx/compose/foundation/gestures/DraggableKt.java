package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aË\u0001\u0010\u001e\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192>\b\u0002\u0010\u001c\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011¢\u0006\u0002\b\u00192\b\b\u0002\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001f\u001aT\u0010)\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0013\u0018\u00010(*\u00020 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0#2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b)\u0010*\u001aY\u00103\u001a\u00020\f*\u00020 2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u001d\u001a\u00020\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aG\u00109\u001a\u00020\f*\u00020 2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0\u00002\u0006\u00105\u001a\u0002042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020=2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010;\"\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Lkotlin/Function1;", "", "Lkotlin/r2;", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "rememberDraggableState", "(Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/v0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lkotlin/Function0;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerDirectionConfig", "Lkotlin/u0;", "awaitDownAndSlop", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;Lv3/a;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/d;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lkotlinx/coroutines/channels/h0;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", "hasDragged", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/h0;ZLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitDrag", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lv3/l;JLv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onDragOrUp", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "Landroidx/compose/foundation/gestures/DragScope;", "NoOpDragScope", "Landroidx/compose/foundation/gestures/DragScope;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,680:1\n25#2:681\n1116#3,6:682\n659#4,10:688\n669#4,4:707\n673#4,38:718\n579#4,6:756\n613#4,4:762\n617#4,2:775\n619#4,8:784\n586#4,10:792\n116#5,2:698\n33#5,6:700\n118#5:706\n33#5,6:711\n118#5:717\n116#5,2:766\n33#5,6:768\n118#5:774\n33#5,6:777\n118#5:783\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n144#1:681\n144#1:682,6\n593#1:688,10\n593#1:707,4\n593#1:718,38\n640#1:756,6\n640#1:762,4\n640#1:775,2\n640#1:784,8\n640#1:792,10\n593#1:698,2\n593#1:700,6\n593#1:706\n593#1:711,6\n593#1:717\n640#1:766,2\n640#1:768,6\n640#1:774\n640#1:777,6\n640#1:783\n*E\n"})
/* loaded from: classes.dex */
public final class DraggableKt {

    @l
    private static final DragScope NoOpDragScope = new DragScope() { // from class: androidx.compose.foundation.gestures.DraggableKt$NoOpDragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float f5) {
        }
    };

    @l
    public static final DraggableState DraggableState(@l v3.l<? super Float, r2> lVar) {
        return new DefaultDraggableState(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0283 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01fe -> B:22:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0248 -> B:13:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0285 -> B:23:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r21, v3.a<java.lang.Boolean> r22, androidx.compose.ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.PointerDirectionConfig r24, kotlin.coroutines.d<? super kotlin.u0<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> r25) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope, v3.l, v3.a, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.PointerDirectionConfig, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: awaitDrag-Su4bsnU */
    public static final Object m357awaitDragSu4bsnU(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j5, VelocityTracker velocityTracker, h0<? super DragEvent> h0Var, boolean z4, v3.l<? super PointerInputChange, Boolean> lVar, d<? super Boolean> dVar) {
        long j6;
        h0Var.p(new DragEvent.DragStarted(Offset.m3497minusMKHz9U(pointerInputChange.m4872getPositionF1C5BW0(), OffsetKt.Offset(Offset.m3493getXimpl(j5) * Math.signum(Offset.m3493getXimpl(pointerInputChange.m4872getPositionF1C5BW0())), Offset.m3494getYimpl(j5) * Math.signum(Offset.m3494getYimpl(pointerInputChange.m4872getPositionF1C5BW0())))), null));
        if (z4) {
            j6 = Offset.m3500timestuRUvjQ(j5, -1.0f);
        } else {
            j6 = j5;
        }
        h0Var.p(new DragEvent.DragDelta(j6, null));
        return m358onDragOrUpAxegvzg(awaitPointerEventScope, lVar, pointerInputChange.m4870getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, h0Var, z4), dVar);
    }

    @l
    public static final Modifier draggable(@l Modifier modifier, @l DraggableState draggableState, @l Orientation orientation, boolean z4, @m MutableInteractionSource mutableInteractionSource, boolean z5, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Float, ? super d<? super r2>, ? extends Object> qVar2, boolean z6) {
        return modifier.then(new DraggableElement(draggableState, DraggableKt$draggable$3.INSTANCE, orientation, z4, mutableInteractionSource, new DraggableKt$draggable$4(z5), qVar, new DraggableKt$draggable$5(qVar2, orientation, null), z6));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, q qVar, q qVar2, boolean z6, int i5, Object obj) {
        boolean z7;
        MutableInteractionSource mutableInteractionSource2;
        boolean z8;
        q qVar3;
        q qVar4;
        boolean z9;
        if ((i5 & 4) != 0) {
            z7 = true;
        } else {
            z7 = z4;
        }
        if ((i5 & 8) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i5 & 16) != 0) {
            z8 = false;
        } else {
            z8 = z5;
        }
        if ((i5 & 32) != 0) {
            qVar3 = new DraggableKt$draggable$1(null);
        } else {
            qVar3 = qVar;
        }
        if ((i5 & 64) != 0) {
            qVar4 = new DraggableKt$draggable$2(null);
        } else {
            qVar4 = qVar2;
        }
        if ((i5 & 128) != 0) {
            z9 = false;
        } else {
            z9 = z6;
        }
        return draggable(modifier, draggableState, orientation, z7, mutableInteractionSource2, z8, qVar3, qVar4, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008a -> B:10:0x008f). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m358onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r19, long r20, v3.l<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.r2> r22, kotlin.coroutines.d<? super java.lang.Boolean> r23) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m358onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope, v3.l, long, v3.l, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    @Composable
    public static final DraggableState rememberDraggableState(@l v3.l<? super Float, r2> lVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i5, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i5 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    /* renamed from: toFloat-3MmeM6k */
    public static final float m359toFloat3MmeM6k(long j5, Orientation orientation) {
        return orientation == Orientation.Vertical ? Offset.m3494getYimpl(j5) : Offset.m3493getXimpl(j5);
    }

    /* renamed from: toFloat-sF-c-tU */
    public static final float m360toFloatsFctU(long j5, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m6280getYimpl(j5) : Velocity.m6279getXimpl(j5);
    }
}
