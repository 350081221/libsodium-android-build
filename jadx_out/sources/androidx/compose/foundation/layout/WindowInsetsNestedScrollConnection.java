package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\bR\u0010SJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\"\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010$\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0016J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005H\u0016J\u0012\u0010.\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0016R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006T"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/WindowInsetsAnimationControlListener;", "Lkotlin/r2;", "requestAnimationController", "Landroid/view/WindowInsetsAnimationController;", "getAnimationController", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "available", "", "scrollAmount", "scroll-8S9VItk", "(JF)J", "scroll", "Landroidx/compose/ui/unit/Velocity;", "flingAmount", "", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/d;)Ljava/lang/Object;", "fling", "inset", "adjustInsets", "animationEnded", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "controller", "", "types", "onReady", "dispose", "onFinished", "onCancelled", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getWindowInsets", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/foundation/layout/SideCalculator;", "sideCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "getSideCalculator", "()Landroidx/compose/foundation/layout/SideCalculator;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "animationController", "Landroid/view/WindowInsetsAnimationController;", "isControllerRequested", "Z", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "partialConsumption", "F", "Lkotlinx/coroutines/l2;", "animationJob", "Lkotlinx/coroutines/l2;", "Lkotlinx/coroutines/p;", "continuation", "Lkotlinx/coroutines/p;", "<init>", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;Landroid/view/View;Landroidx/compose/foundation/layout/SideCalculator;Landroidx/compose/ui/unit/Density;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(30)
@r1({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,725:1\n314#2,11:726\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n213#1:726,11\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    @m
    private WindowInsetsAnimationController animationController;

    @m
    private l2 animationJob;

    @l
    private final CancellationSignal cancellationSignal = new CancellationSignal();

    @m
    private p<? super WindowInsetsAnimationController> continuation;

    @l
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;

    @l
    private final SideCalculator sideCalculator;

    @l
    private final View view;

    @l
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(@l AndroidWindowInsets androidWindowInsets, @l View view, @l SideCalculator sideCalculator, @l Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f5) {
        Insets currentInsets;
        int L0;
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            SideCalculator sideCalculator = this.sideCalculator;
            L0 = kotlin.math.d.L0(f5);
            windowInsetsAnimationController.setInsetsAndAlpha(sideCalculator.adjustInsets(currentInsets, L0), 1.0f, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0 == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void animationEnded() {
        /*
            r4 = this;
            android.view.WindowInsetsAnimationController r0 = r4.animationController
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = androidx.compose.foundation.layout.g.a(r0)
            r2 = 1
            if (r0 != r2) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L1d
            android.view.WindowInsetsAnimationController r0 = r4.animationController
            if (r0 == 0) goto L1d
            androidx.compose.foundation.layout.AndroidWindowInsets r2 = r4.windowInsets
            boolean r2 = r2.isVisible()
            androidx.compose.foundation.layout.e.a(r0, r2)
        L1d:
            r0 = 0
            r4.animationController = r0
            kotlinx.coroutines.p<? super android.view.WindowInsetsAnimationController> r2 = r4.continuation
            if (r2 == 0) goto L29
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1 r3 = androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE
            r2.C(r0, r3)
        L29:
            r4.continuation = r0
            kotlinx.coroutines.l2 r2 = r4.animationJob
            if (r2 == 0) goto L37
            androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException r3 = new androidx.compose.foundation.layout.WindowInsetsAnimationCancelledException
            r3.<init>()
            r2.cancel(r3)
        L37:
            r4.animationJob = r0
            r0 = 0
            r4.partialConsumption = r0
            r4.isControllerRequested = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m630flinghuYlsQE(long r27, float r29, boolean r30, kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r31) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m630flinghuYlsQE(long, float, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(kotlin.coroutines.d<? super WindowInsetsAnimationController> dVar) {
        kotlin.coroutines.d e5;
        Object l5;
        Object obj = this.animationController;
        if (obj == null) {
            e5 = kotlin.coroutines.intrinsics.c.e(dVar);
            q qVar = new q(e5, 1);
            qVar.B();
            this.continuation = qVar;
            requestAnimationController();
            obj = qVar.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (obj == l5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (!this.isControllerRequested) {
            this.isControllerRequested = true;
            windowInsetsController = this.view.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1L, null, this.cancellationSignal, this);
            }
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m631scroll8S9VItk(long j5, float f5) {
        boolean z4;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        int i5;
        int L0;
        int I;
        int L02;
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2Var.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        boolean z5 = true;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            boolean isVisible = this.windowInsets.isVisible();
            if (f5 <= 0.0f) {
                z5 = false;
            }
            if (isVisible != z5 || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo583consumedOffsetsMKHz9U(j5);
                }
                SideCalculator sideCalculator = this.sideCalculator;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.sideCalculator;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (f5 > 0.0f) {
                    i5 = valueOf2;
                } else {
                    i5 = valueOf;
                }
                if (valueOf3 == i5) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m3509getZeroF1C5BW0();
                }
                float f6 = valueOf3 + f5 + this.partialConsumption;
                L0 = kotlin.math.d.L0(f6);
                I = u.I(L0, valueOf, valueOf2);
                L02 = kotlin.math.d.L0(f6);
                this.partialConsumption = f6 - L02;
                if (I != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, I), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo583consumedOffsetsMKHz9U(j5);
            }
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.C(null, WindowInsetsNestedScrollConnection$dispose$1.INSTANCE);
        }
        l2 l2Var = this.animationJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!l0.g(currentInsets, hiddenStateInsets));
        }
    }

    @l
    public final Density getDensity() {
        return this.density;
    }

    @l
    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    @l
    public final View getView() {
        return this.view;
    }

    @l
    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(@m WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(@l WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo390onPostFlingRZ2iAVY(long j5, long j6, @l kotlin.coroutines.d<? super Velocity> dVar) {
        return m630flinghuYlsQE(j6, this.sideCalculator.showMotion(Velocity.m6279getXimpl(j6), Velocity.m6280getYimpl(j6)), true, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        return m631scroll8S9VItk(j6, this.sideCalculator.showMotion(Offset.m3493getXimpl(j6), Offset.m3494getYimpl(j6)));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo632onPreFlingQWom1Mo(long j5, @l kotlin.coroutines.d<? super Velocity> dVar) {
        return m630flinghuYlsQE(j5, this.sideCalculator.hideMotion(Velocity.m6279getXimpl(j5), Velocity.m6280getYimpl(j5)), false, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        return m631scroll8S9VItk(j5, this.sideCalculator.hideMotion(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5)));
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(@l WindowInsetsAnimationController windowInsetsAnimationController, int i5) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        p<? super WindowInsetsAnimationController> pVar = this.continuation;
        if (pVar != null) {
            pVar.C(windowInsetsAnimationController, WindowInsetsNestedScrollConnection$onReady$1.INSTANCE);
        }
        this.continuation = null;
    }
}
