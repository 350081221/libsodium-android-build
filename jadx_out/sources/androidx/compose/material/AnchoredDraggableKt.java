package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000`\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001\u001aR\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001\u001a(\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0015\u001a\u00028\u0000H\u0081@¢\u0006\u0004\b\u0016\u0010\u0017\u001a2\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0015\u001a\u00028\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0081@¢\u0006\u0004\b\u001a\u0010\u001b\u001aH\u0010\"\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001fH\u0082@¢\u0006\u0004\b\"\u0010#\u001a\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0001H\u0002¨\u0006&"}, d2 = {"", "T", "Lkotlin/Function1;", "Landroidx/compose/material/DraggableAnchorsConfig;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Landroidx/compose/material/DraggableAnchors;", "DraggableAnchors", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "anchoredDraggable", "targetValue", "snapTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "velocity", "animateTo", "(Landroidx/compose/material/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/d;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "restartable", "(Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/material/MapDraggableAnchors;", "emptyDraggableAnchors", "material_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {
    @l
    @ExperimentalMaterialApi
    public static final <T> DraggableAnchors<T> DraggableAnchors(@l v3.l<? super DraggableAnchorsConfig<T>, r2> lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material_release());
    }

    public static final /* synthetic */ MapDraggableAnchors access$emptyDraggableAnchors() {
        return emptyDraggableAnchors();
    }

    @l
    @ExperimentalMaterialApi
    public static final <T> Modifier anchoredDraggable(@l Modifier modifier, @l AnchoredDraggableState<T> anchoredDraggableState, @l Orientation orientation, boolean z4, boolean z5, @m MutableInteractionSource mutableInteractionSource, boolean z6) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material_release(), orientation, z4, mutableInteractionSource, z6, null, new AnchoredDraggableKt$anchoredDraggable$1(anchoredDraggableState, null), z5, 32, null);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z4, boolean z5, MutableInteractionSource mutableInteractionSource, boolean z6, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        boolean z7 = z4;
        if ((i5 & 8) != 0) {
            z5 = false;
        }
        boolean z8 = z5;
        if ((i5 & 16) != 0) {
            mutableInteractionSource = null;
        }
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((i5 & 32) != 0) {
            z6 = anchoredDraggableState.isAnimationRunning();
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z7, z8, mutableInteractionSource2, z6);
    }

    @ExperimentalMaterialApi
    @m
    public static final <T> Object animateTo(@l AnchoredDraggableState<T> anchoredDraggableState, T t5, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t5, null, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f5, null), dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return anchoredDrag$default == l5 ? anchoredDrag$default : r2.f19517a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f5, d dVar, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            f5 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f5, dVar);
    }

    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        Map z4;
        z4 = a1.z();
        return new MapDraggableAnchors<>(z4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(v3.a<? extends I> r4, v3.p<? super I, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r5, kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e1.n(r6)
            androidx.compose.material.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.t0.g(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            kotlin.r2 r4 = kotlin.r2.f19517a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableKt.restartable(v3.a, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @ExperimentalMaterialApi
    @m
    public static final <T> Object snapTo(@l AnchoredDraggableState<T> anchoredDraggableState, T t5, @l d<? super r2> dVar) {
        Object l5;
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t5, null, new AnchoredDraggableKt$snapTo$2(null), dVar, 2, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return anchoredDrag$default == l5 ? anchoredDrag$default : r2.f19517a;
    }
}
