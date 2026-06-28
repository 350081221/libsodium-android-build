package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.i0;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00104\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u0003*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u0013*\u00020\u0012H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001J\u0017\u0010\u001e\u001a\u00020\u0012*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010!\u001a\u00020\b*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\b*\u00020\u000eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001a\u0010!\u001a\u00020\b*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\u0010\u0010'\u001a\u00020$H\u0086@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020$H\u0096@¢\u0006\u0004\b)\u0010(J\u0010\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScopeImpl;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "Lkotlin/r2;", "cancel", "release", "reset", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitRelease", "", "tryAwaitRelease", "isReleased", "Z", "isCanceled", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "getDensity", "()F", "density", "getFontScale", "fontScale", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;

    @l
    private final a mutex = c.a(false);

    public PressGestureScopeImpl(@l Density density) {
        this.$$delegate_0 = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitRelease(@p4.l kotlin.coroutines.d<? super kotlin.r2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.e1.n(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(kotlin.coroutines.d):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        a.C0615a.d(this.mutex, null, 1, null);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        a.C0615a.d(this.mutex, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reset(@p4.l kotlin.coroutines.d<? super kotlin.r2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.e1.n(r5)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e1.n(r5)
            kotlinx.coroutines.sync.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = kotlinx.coroutines.sync.a.C0615a.b(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo297roundToPxR2X_6o(long j5) {
        return this.$$delegate_0.mo297roundToPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo298roundToPx0680j_4(float f5) {
        return this.$$delegate_0.mo298roundToPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo299toDpGaN1DYA(long j5) {
        return this.$$delegate_0.mo299toDpGaN1DYA(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo300toDpu2uoSUM(float f5) {
        return this.$$delegate_0.mo300toDpu2uoSUM(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo301toDpu2uoSUM(int i5) {
        return this.$$delegate_0.mo301toDpu2uoSUM(i5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo302toDpSizekrfVVM(long j5) {
        return this.$$delegate_0.mo302toDpSizekrfVVM(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo303toPxR2X_6o(long j5) {
        return this.$$delegate_0.mo303toPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo304toPx0680j_4(float f5) {
        return this.$$delegate_0.mo304toPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect toRect(@l DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo305toSizeXkaWNTQ(long j5) {
        return this.$$delegate_0.mo305toSizeXkaWNTQ(j5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo306toSp0xMU5do(float f5) {
        return this.$$delegate_0.mo306toSp0xMU5do(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo307toSpkPz2Gy4(float f5) {
        return this.$$delegate_0.mo307toSpkPz2Gy4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo308toSpkPz2Gy4(int i5) {
        return this.$$delegate_0.mo308toSpkPz2Gy4(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.PressGestureScope
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object tryAwaitRelease(@p4.l kotlin.coroutines.d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            kotlin.e1.n(r6)
            goto L4f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.e1.n(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L55
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L55
            kotlinx.coroutines.sync.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.sync.a.C0615a.b(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r0 = r5
        L4f:
            kotlinx.coroutines.sync.a r6 = r0.mutex
            kotlinx.coroutines.sync.a.C0615a.d(r6, r3, r4, r3)
            goto L56
        L55:
            r0 = r5
        L56:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(kotlin.coroutines.d):java.lang.Object");
    }
}
