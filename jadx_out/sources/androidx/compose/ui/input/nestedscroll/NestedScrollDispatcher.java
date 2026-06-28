package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import kotlin.i0;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010*\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0016\u0010.\u001a\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchPreScroll-OzD1aCk", "(JI)J", "dispatchPreScroll", "consumed", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPostScroll", "Landroidx/compose/ui/unit/Velocity;", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "dispatchPreFling", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "dispatchPostFling", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "modifierLocalNode", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getModifierLocalNode$ui_release", "()Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "setModifierLocalNode$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)V", "Lkotlin/Function0;", "Lkotlinx/coroutines/s0;", "calculateNestedScrollScope", "Lv3/a;", "getCalculateNestedScrollScope$ui_release", "()Lv3/a;", "setCalculateNestedScrollScope$ui_release", "(Lv3/a;)V", "scope", "Lkotlinx/coroutines/s0;", "getScope$ui_release", "()Lkotlinx/coroutines/s0;", "setScope$ui_release", "(Lkotlinx/coroutines/s0;)V", "getCoroutineScope", "coroutineScope", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "parent", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;

    @l
    private a<? extends s0> calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);

    @m
    private ModifierLocalModifierNode modifierLocalNode;

    @m
    private s0 scope;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4754dispatchPostFlingRZ2iAVY(long r8, long r10, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.e1.n(r12)
            goto L46
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.e1.n(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.getParent$ui_release()
            if (r1 == 0) goto L4d
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo390onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L46
            return r0
        L46:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.ui.unit.Velocity) r12
            long r8 = r12.m6288unboximpl()
            goto L53
        L4d:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.ui.unit.Velocity.Companion
            long r8 = r8.m6290getZero9UxMQ8M()
        L53:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.ui.unit.Velocity.m6270boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m4754dispatchPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m4755dispatchPostScrollDzOQY0M(long j5, long j6, int i5) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo391onPostScrollDzOQY0M(j5, j6, i5) : Offset.Companion.m3509getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @p4.m
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4756dispatchPreFlingQWom1Mo(long r5, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e1.n(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.e1.n(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.getParent$ui_release()
            if (r7 == 0) goto L4a
            r0.label = r3
            java.lang.Object r7 = r7.mo632onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r5 = r7.m6288unboximpl()
            goto L50
        L4a:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r5.m6290getZero9UxMQ8M()
        L50:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m6270boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m4756dispatchPreFlingQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m4757dispatchPreScrollOzD1aCk(long j5, int i5) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo392onPreScrollOzD1aCk(j5, i5) : Offset.Companion.m3509getZeroF1C5BW0();
    }

    @l
    public final a<s0> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    @l
    public final s0 getCoroutineScope() {
        s0 invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @m
    public final ModifierLocalModifierNode getModifierLocalNode$ui_release() {
        return this.modifierLocalNode;
    }

    @m
    public final NestedScrollConnection getParent$ui_release() {
        ModifierLocalModifierNode modifierLocalModifierNode = this.modifierLocalNode;
        if (modifierLocalModifierNode != null) {
            return (NestedScrollNode) modifierLocalModifierNode.getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    @m
    public final s0 getScope$ui_release() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui_release(@l a<? extends s0> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void setModifierLocalNode$ui_release(@m ModifierLocalModifierNode modifierLocalModifierNode) {
        this.modifierLocalNode = modifierLocalModifierNode;
    }

    public final void setScope$ui_release(@m s0 s0Var) {
        this.scope = s0Var;
    }
}
