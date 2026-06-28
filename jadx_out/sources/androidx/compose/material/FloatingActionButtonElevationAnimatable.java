package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0006\u001a\u00020\u0003*\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014R\u001c\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001c\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001c\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "Landroidx/compose/foundation/interaction/Interaction;", "Landroidx/compose/ui/unit/Dp;", "calculateTarget-u2uoSUM", "(Landroidx/compose/foundation/interaction/Interaction;)F", "calculateTarget", "Lkotlin/r2;", "snapElevation", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "updateElevation-lDy3nrA", "(FFFFLkotlin/coroutines/d;)Ljava/lang/Object;", "updateElevation", TypedValues.TransitionType.S_TO, "animateElevation", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "F", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "animatable", "Landroidx/compose/animation/core/Animatable;", "lastTargetInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "targetInteraction", "<init>", "(FFFFLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {

    @l
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;

    @m
    private Interaction lastTargetInteraction;
    private float pressedElevation;

    @m
    private Interaction targetInteraction;

    private FloatingActionButtonElevationAnimatable(float f5, float f6, float f7, float f8) {
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.hoveredElevation = f7;
        this.focusedElevation = f8;
        this.animatable = new Animatable<>(Dp.m6042boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f5, float f6, float f7, float f8, w wVar) {
        this(f5, f6, f7, f8);
    }

    /* renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m1359calculateTargetu2uoSUM(Interaction interaction) {
        if (interaction instanceof PressInteraction.Press) {
            return this.pressedElevation;
        }
        if (interaction instanceof HoverInteraction.Enter) {
            return this.hoveredElevation;
        }
        if (interaction instanceof FocusInteraction.Focus) {
            return this.focusedElevation;
        }
        return this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapElevation(kotlin.coroutines.d<? super kotlin.r2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.e1.n(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.e1.n(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.targetInteraction
            float r5 = r4.m1359calculateTargetu2uoSUM(r5)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable
            java.lang.Object r2 = r2.getTargetValue()
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2
            float r2 = r2.m6058unboximpl()
            boolean r2 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r2, r5)
            if (r2 != 0) goto L70
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r4.animatable     // Catch: java.lang.Throwable -> L69
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m6042boximpl(r5)     // Catch: java.lang.Throwable -> L69
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L69
            r0.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.snapTo(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            androidx.compose.foundation.interaction.Interaction r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            androidx.compose.foundation.interaction.Interaction r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L70:
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.snapElevation(kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateElevation(@p4.m androidx.compose.foundation.interaction.Interaction r6, @p4.l kotlin.coroutines.d<? super kotlin.r2> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.FloatingActionButtonElevationAnimatable r0 = (androidx.compose.material.FloatingActionButtonElevationAnimatable) r0
            kotlin.e1.n(r7)     // Catch: java.lang.Throwable -> L31
            goto L68
        L31:
            r7 = move-exception
            goto L6f
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e1.n(r7)
            float r7 = r5.m1359calculateTargetu2uoSUM(r6)
            r5.targetInteraction = r6
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.getTargetValue()     // Catch: java.lang.Throwable -> L6d
            androidx.compose.ui.unit.Dp r2 = (androidx.compose.ui.unit.Dp) r2     // Catch: java.lang.Throwable -> L6d
            float r2 = r2.m6058unboximpl()     // Catch: java.lang.Throwable -> L6d
            boolean r2 = androidx.compose.ui.unit.Dp.m6049equalsimpl0(r2, r7)     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L67
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r2 = r5.animatable     // Catch: java.lang.Throwable -> L6d
            androidx.compose.foundation.interaction.Interaction r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L6d
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L6d
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L6d
            r0.label = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = androidx.compose.material.ElevationKt.m1337animateElevationrAjV9yQ(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L6d
            if (r7 != r1) goto L67
            return r1
        L67:
            r0 = r5
        L68:
            r0.lastTargetInteraction = r6
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L6d:
            r7 = move-exception
            r0 = r5
        L6f:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonElevationAnimatable.animateElevation(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public final State<Dp> asState() {
        return this.animatable.asState();
    }

    @m
    /* renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m1360updateElevationlDy3nrA(float f5, float f6, float f7, float f8, @l d<? super r2> dVar) {
        Object l5;
        this.defaultElevation = f5;
        this.pressedElevation = f6;
        this.hoveredElevation = f7;
        this.focusedElevation = f8;
        Object snapElevation = snapElevation(dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (snapElevation == l5) {
            return snapElevation;
        }
        return r2.f19517a;
    }
}
