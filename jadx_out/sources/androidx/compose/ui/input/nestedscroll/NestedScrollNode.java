package androidx.compose.ui.input.nestedscroll;

import android.net.http.Headers;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.q1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b9\u0010\"J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016J!\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b!\u0010\"R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0014\u00108\u001a\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "newDispatcher", "Lkotlin/r2;", "updateDispatcher", "updateDispatcherFields", "resetDispatcherFields", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "onAttach", "onDetach", Headers.CONN_DIRECTIVE, "dispatcher", "updateNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "updateNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "resolvedDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "getParentModifierLocal", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "parentModifierLocal", "getParentConnection", "parentConnection", "Lkotlinx/coroutines/s0;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/s0;", "nestedCoroutineScope", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements ModifierLocalModifierNode, NestedScrollConnection, DelegatableNode {
    public static final int $stable = 8;

    @l
    private NestedScrollConnection connection;

    @l
    private final ModifierLocalMap providedValues;

    @l
    private NestedScrollDispatcher resolvedDispatcher;

    public NestedScrollNode(@l NestedScrollConnection nestedScrollConnection, @m NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(q1.a(NestedScrollNodeKt.getModifierLocalNestedScroll(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 getNestedCoroutineScope() {
        s0 scope$ui_release;
        NestedScrollNode parentModifierLocal = getParentModifierLocal();
        if ((parentModifierLocal != null && (scope$ui_release = parentModifierLocal.getNestedCoroutineScope()) != null) || (scope$ui_release = this.resolvedDispatcher.getScope$ui_release()) != null) {
            return scope$ui_release;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return (NestedScrollConnection) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final NestedScrollNode getParentModifierLocal() {
        if (isAttached()) {
            return (NestedScrollNode) getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll());
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getModifierLocalNode$ui_release() == this) {
            this.resolvedDispatcher.setModifierLocalNode$ui_release(null);
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!l0.g(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setModifierLocalNode$ui_release(this);
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new NestedScrollNode$updateDispatcherFields$1(this));
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    @l
    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @l
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo390onPostFlingRZ2iAVY(long r16, long r18, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r2 == 0) goto L16
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
            goto L1b
        L16:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 == r4) goto L39
            if (r3 != r10) goto L31
            long r2 = r2.J$0
            kotlin.e1.n(r1)
            goto L8c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r7 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r7
            kotlin.e1.n(r1)
            r13 = r3
            r11 = r5
            goto L65
        L47:
            kotlin.e1.n(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r0.connection
            r2.L$0 = r0
            r11 = r16
            r2.J$0 = r11
            r13 = r18
            r2.J$1 = r13
            r2.label = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.mo390onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L64
            return r9
        L64:
            r7 = r0
        L65:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.m6288unboximpl()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r7.getParentConnection()
            if (r3 == 0) goto L94
            long r6 = androidx.compose.ui.unit.Velocity.m6283plusAH228Gc(r11, r4)
            long r11 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r13, r4)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r4
            r2.label = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.mo390onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L8b
            return r9
        L8b:
            r2 = r13
        L8c:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.ui.unit.Velocity) r1
            long r4 = r1.m6288unboximpl()
            r13 = r2
            goto L9b
        L94:
            r13 = r4
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r1.m6290getZero9UxMQ8M()
        L9b:
            long r1 = androidx.compose.ui.unit.Velocity.m6283plusAH228Gc(r13, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.m6270boximpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo390onPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        long m3509getZeroF1C5BW0;
        long mo391onPostScrollDzOQY0M = this.connection.mo391onPostScrollDzOQY0M(j5, j6, i5);
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            m3509getZeroF1C5BW0 = parentConnection.mo391onPostScrollDzOQY0M(Offset.m3498plusMKHz9U(j5, mo391onPostScrollDzOQY0M), Offset.m3497minusMKHz9U(j6, mo391onPostScrollDzOQY0M), i5);
        } else {
            m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        return Offset.m3498plusMKHz9U(mo391onPostScrollDzOQY0M, m3509getZeroF1C5BW0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo632onPreFlingQWom1Mo(long r9, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.J$0
            kotlin.e1.n(r11)
            goto L7c
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r2 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r2
            kotlin.e1.n(r11)
            goto L57
        L40:
            kotlin.e1.n(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r8.getParentConnection()
            if (r11 == 0) goto L5e
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.mo632onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L56
            return r1
        L56:
            r2 = r8
        L57:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r4 = r11.m6288unboximpl()
            goto L65
        L5e:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r11.m6290getZero9UxMQ8M()
            r2 = r8
        L65:
            r6 = r9
            r9 = r4
            r4 = r6
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.connection
            long r4 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.mo632onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.ui.unit.Velocity) r11
            long r0 = r11.m6288unboximpl()
            long r9 = androidx.compose.ui.unit.Velocity.m6283plusAH228Gc(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.ui.unit.Velocity.m6270boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo632onPreFlingQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        long m3509getZeroF1C5BW0;
        NestedScrollConnection parentConnection = getParentConnection();
        if (parentConnection != null) {
            m3509getZeroF1C5BW0 = parentConnection.mo392onPreScrollOzD1aCk(j5, i5);
        } else {
            m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        return Offset.m3498plusMKHz9U(m3509getZeroF1C5BW0, this.connection.mo392onPreScrollOzD1aCk(Offset.m3497minusMKHz9U(j5, m3509getZeroF1C5BW0), i5));
    }

    public final void setConnection(@l NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void updateNode$ui_release(@l NestedScrollConnection nestedScrollConnection, @m NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }
}
