package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u001a#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aÅ\u0001\u0010\u001c\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2>\b\u0002\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f¢\u0006\u0002\b\u00162>\b\u0002\u0010\u001a\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/r2;", "onDelta", "Landroidx/compose/foundation/gestures/Draggable2DState;", "Draggable2DState", "rememberDraggable2DState", "(Lv3/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/Draggable2DState;", "Landroidx/compose/ui/Modifier;", "state", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Lkotlin/v0;", "name", "startedPosition", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "velocity", "onDragStopped", "reverseDirection", "draggable2D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Draggable2DState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLv3/q;Lv3/q;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "NoOpDrag2DScope", "Landroidx/compose/foundation/gestures/Drag2DScope;", "getNoOpDrag2DScope$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDraggable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,362:1\n25#2:363\n1116#3,6:364\n*S KotlinDebug\n*F\n+ 1 Draggable2D.kt\nandroidx/compose/foundation/gestures/Draggable2DKt\n*L\n121#1:363\n121#1:364,6\n*E\n"})
/* loaded from: classes.dex */
public final class Draggable2DKt {

    @l
    private static final Drag2DScope NoOpDrag2DScope = new Drag2DScope() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpDrag2DScope$1
        @Override // androidx.compose.foundation.gestures.Drag2DScope
        /* renamed from: dragBy-k-4lQ0M */
        public void mo319dragByk4lQ0M(long j5) {
        }
    };

    @l
    @ExperimentalFoundationApi
    public static final Draggable2DState Draggable2DState(@l v3.l<? super Offset, r2> lVar) {
        return new DefaultDraggable2DState(lVar);
    }

    @l
    @ExperimentalFoundationApi
    public static final Modifier draggable2D(@l Modifier modifier, @l Draggable2DState draggable2DState, boolean z4, @m MutableInteractionSource mutableInteractionSource, boolean z5, @l q<? super s0, ? super Offset, ? super d<? super r2>, ? extends Object> qVar, @l q<? super s0, ? super Velocity, ? super d<? super r2>, ? extends Object> qVar2, boolean z6) {
        return modifier.then(new Draggable2DElement(draggable2DState, Draggable2DKt$draggable2D$3.INSTANCE, z4, mutableInteractionSource, new Draggable2DKt$draggable2D$4(z5), qVar, qVar2, z6));
    }

    public static /* synthetic */ Modifier draggable2D$default(Modifier modifier, Draggable2DState draggable2DState, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, q qVar, q qVar2, boolean z6, int i5, Object obj) {
        boolean z7;
        MutableInteractionSource mutableInteractionSource2;
        boolean z8;
        q qVar3;
        q qVar4;
        if ((i5 & 2) != 0) {
            z7 = true;
        } else {
            z7 = z4;
        }
        if ((i5 & 4) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        boolean z9 = false;
        if ((i5 & 8) != 0) {
            z8 = false;
        } else {
            z8 = z5;
        }
        if ((i5 & 16) != 0) {
            qVar3 = new Draggable2DKt$draggable2D$1(null);
        } else {
            qVar3 = qVar;
        }
        if ((i5 & 32) != 0) {
            qVar4 = new Draggable2DKt$draggable2D$2(null);
        } else {
            qVar4 = qVar2;
        }
        if ((i5 & 64) == 0) {
            z9 = z6;
        }
        return draggable2D(modifier, draggable2DState, z7, mutableInteractionSource2, z8, qVar3, qVar4, z9);
    }

    private static /* synthetic */ void getNoOpDrag2DScope$annotations() {
    }

    @l
    @Composable
    @ExperimentalFoundationApi
    public static final Draggable2DState rememberDraggable2DState(@l v3.l<? super Offset, r2> lVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1150277615);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i5, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:118)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i5 & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = Draggable2DState(new Draggable2DKt$rememberDraggable2DState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Draggable2DState draggable2DState = (Draggable2DState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggable2DState;
    }
}
