package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@Stable
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "other", "then", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface Modifier {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "other", "then", "", "toString", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(@l v3.l<? super Element, Boolean> lVar) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(@l v3.l<? super Element, Boolean> lVar) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r5, @l p<? super R, ? super Element, ? extends R> pVar) {
            return r5;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r5, @l p<? super Element, ? super R, ? extends R> pVar) {
            return r5;
        }

        @Override // androidx.compose.ui.Modifier
        @l
        public Modifier then(@l Modifier modifier) {
            return modifier;
        }

        @l
        public String toString() {
            return "Modifier";
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @l
        @Deprecated
        public static Modifier then(@l Modifier modifier, @l Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016J\u001c\u0010\r\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "operation", "foldIn", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface Element extends Modifier {

        @i0(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@l Element element, @l v3.l<? super Element, Boolean> lVar) {
                return Element.super.all(lVar);
            }

            @Deprecated
            public static boolean any(@l Element element, @l v3.l<? super Element, Boolean> lVar) {
                return Element.super.any(lVar);
            }

            @Deprecated
            public static <R> R foldIn(@l Element element, R r5, @l p<? super R, ? super Element, ? extends R> pVar) {
                return (R) Element.super.foldIn(r5, pVar);
            }

            @Deprecated
            public static <R> R foldOut(@l Element element, R r5, @l p<? super Element, ? super R, ? extends R> pVar) {
                return (R) Element.super.foldOut(r5, pVar);
            }

            @l
            @Deprecated
            public static Modifier then(@l Element element, @l Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(@l v3.l<? super Element, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(@l v3.l<? super Element, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r5, @l p<? super R, ? super Element, ? extends R> pVar) {
            return pVar.invoke(r5, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r5, @l p<? super Element, ? super R, ? extends R> pVar) {
            return pVar.invoke(this, r5);
        }
    }

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001d\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0017\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cH\u0007J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b \u0010!R*\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010-\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R$\u00106\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010!R$\u00109\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'\"\u0004\b;\u0010!R$\u0010=\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER\"\u0010F\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u0016\u0010O\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010GR\u0016\u0010P\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010GR$\u0010Q\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bQ\u0010IR\u0011\u0010T\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010W\u001a\u00020\n8VX\u0096\u0004¢\u0006\f\u0012\u0004\bV\u0010\u000f\u001a\u0004\bU\u0010I\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Lkotlin/r2;", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/NodeKind;", "kind", "", "isKind-H91voCI$ui_release", "(I)Z", "isKind", "markAsAttached$ui_release", "()V", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "owner", "setAsDelegateTo$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "setAsDelegateTo", "<set-?>", "node", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "Lkotlinx/coroutines/s0;", "scope", "Lkotlinx/coroutines/s0;", "", "kindSet", "I", "getKindSet$ui_release", "()I", "setKindSet$ui_release", "(I)V", "aggregateChildKindSet", "getAggregateChildKindSet$ui_release", "setAggregateChildKindSet$ui_release", "parent", "getParent$ui_release", "setParent$ui_release", "child", "getChild$ui_release", "setChild$ui_release", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "ownerScope", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "insertedNodeAwaitingAttachForInvalidation", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "onAttachRunExpected", "onDetachRunExpected", "isAttached", "getCoroutineScope", "()Lkotlinx/coroutines/s0;", "coroutineScope", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    /* loaded from: classes.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;

        @m
        private Node child;

        @m
        private NodeCoordinator coordinator;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;

        @m
        private ObserverNodeOwnerScope ownerScope;

        @m
        private Node parent;

        @m
        private s0 scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;

        @l
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.aggregateChildKindSet;
        }

        @m
        public final Node getChild$ui_release() {
            return this.child;
        }

        @m
        public final NodeCoordinator getCoordinator$ui_release() {
            return this.coordinator;
        }

        @l
        public final s0 getCoroutineScope() {
            s0 s0Var = this.scope;
            if (s0Var == null) {
                s0 a5 = t0.a(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(p2.a((l2) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(l2.U))));
                this.scope = a5;
                return a5;
            }
            return s0Var;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui_release() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        @l
        public final Node getNode() {
            return this.node;
        }

        @m
        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.ownerScope;
        }

        @m
        public final Node getParent$ui_release() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m3371isKindH91voCI$ui_release(int i5) {
            return (i5 & getKindSet$ui_release()) != 0;
        }

        public void markAsAttached$ui_release() {
            boolean z4;
            if (!this.isAttached) {
                if (this.coordinator != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.isAttached = true;
                    this.onAttachRunExpected = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void markAsDetached$ui_release() {
            if (this.isAttached) {
                if (!this.onAttachRunExpected) {
                    if (!this.onDetachRunExpected) {
                        this.isAttached = false;
                        s0 s0Var = this.scope;
                        if (s0Var != null) {
                            t0.d(s0Var, new ModifierNodeDetachedCancellationException());
                            this.scope = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (this.isAttached) {
                onReset();
                return;
            }
            throw new IllegalStateException("reset() called on an unattached node".toString());
        }

        public void runAttachLifecycle$ui_release() {
            if (this.isAttached) {
                if (this.onAttachRunExpected) {
                    this.onAttachRunExpected = false;
                    onAttach();
                    this.onDetachRunExpected = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void runDetachLifecycle$ui_release() {
            boolean z4;
            if (this.isAttached) {
                if (this.coordinator != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (this.onDetachRunExpected) {
                        this.onDetachRunExpected = false;
                        onDetach();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public final void setAggregateChildKindSet$ui_release(int i5) {
            this.aggregateChildKindSet = i5;
        }

        public final void setAsDelegateTo$ui_release(@l Node node) {
            this.node = node;
        }

        public final void setChild$ui_release(@m Node node) {
            this.child = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z4) {
            this.insertedNodeAwaitingAttachForInvalidation = z4;
        }

        public final void setKindSet$ui_release(int i5) {
            this.kindSet = i5;
        }

        public final void setOwnerScope$ui_release(@m ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(@m Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z4) {
            this.updatedNodeAwaitingAttachForInvalidation = z4;
        }

        @ExperimentalComposeUiApi
        public final void sideEffect(@l a<r2> aVar) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(aVar);
        }

        public void updateCoordinator$ui_release(@m NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }
    }

    boolean all(@l v3.l<? super Element, Boolean> lVar);

    boolean any(@l v3.l<? super Element, Boolean> lVar);

    <R> R foldIn(R r5, @l p<? super R, ? super Element, ? extends R> pVar);

    <R> R foldOut(R r5, @l p<? super Element, ? super R, ? extends R> pVar);

    @l
    default Modifier then(@l Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }
}
