package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlinx.coroutines.k;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BM\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bM\u0010NJ\b\u0010\u0007\u001a\u00020\u0006H\u0002JL\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010 R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Lkotlin/r2;", "updateDefaultFlingBehavior", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "update", "onAttach", "onObservedReadsChanged", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "applyFocusProperties", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/OverscrollEffect;", "Z", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getNestedScrollDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "getDefaultFlingBehavior", "()Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "getNestedScrollConnection", "()Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "contentInViewNode", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "getContentInViewNode", "()Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "scrollableContainer", "Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "getScrollableContainer", "()Landroidx/compose/foundation/gestures/ModifierLocalScrollableContainerProvider;", "Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "scrollableGesturesNode", "Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "getScrollableGesturesNode", "()Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableNode extends DelegatingNode implements ObserverModifierNode, CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, KeyInputModifierNode {

    @l
    private final ContentInViewNode contentInViewNode;

    @l
    private final DefaultFlingBehavior defaultFlingBehavior;
    private boolean enabled;

    @m
    private FlingBehavior flingBehavior;

    @m
    private MutableInteractionSource interactionSource;

    @l
    private final ScrollableNestedScrollConnection nestedScrollConnection;

    @l
    private final NestedScrollDispatcher nestedScrollDispatcher;

    @l
    private Orientation orientation;

    @m
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;

    @l
    private final ModifierLocalScrollableContainerProvider scrollableContainer;

    @l
    private final ScrollableGesturesNode scrollableGesturesNode;

    @l
    private final ScrollingLogic scrollingLogic;

    @l
    private ScrollableState state;

    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<LayoutCoordinates, r2> {
        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m LayoutCoordinates layoutCoordinates) {
            ScrollableNode.this.getContentInViewNode().onFocusBoundsChanged(layoutCoordinates);
        }
    }

    public ScrollableNode(@l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, boolean z5, @m FlingBehavior flingBehavior, @m MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        ScrollableKt$UnityDensity$1 scrollableKt$UnityDensity$1;
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z4;
        this.reverseDirection = z5;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        scrollableKt$UnityDensity$1 = ScrollableKt.UnityDensity;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.splineBasedDecay(scrollableKt$UnityDensity$1), null, 2, null);
        this.defaultFlingBehavior = defaultFlingBehavior;
        ScrollableState scrollableState2 = this.state;
        Orientation orientation2 = this.orientation;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        boolean z6 = this.reverseDirection;
        FlingBehavior flingBehavior2 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState2, orientation2, overscrollEffect2, z6, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, nestedScrollDispatcher);
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.enabled);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) delegate(new ContentInViewNode(this.orientation, this.state, this.reverseDirection, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        this.scrollableContainer = (ModifierLocalScrollableContainerProvider) delegate(new ModifierLocalScrollableContainerProvider(this.enabled));
        delegate(NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(FocusTargetModifierNodeKt.FocusTargetModifierNode());
        delegate(new BringIntoViewResponderNode(contentInViewNode));
        delegate(new FocusedBoundsObserverNode(new AnonymousClass1()));
        this.scrollableGesturesNode = (ScrollableGesturesNode) delegate(new ScrollableGesturesNode(scrollingLogic, this.orientation, this.enabled, nestedScrollDispatcher, this.interactionSource));
    }

    private final void updateDefaultFlingBehavior() {
        this.defaultFlingBehavior.setFlingDecay(SplineBasedDecayKt.splineBasedDecay((Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalDensity())));
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@l FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
    }

    @l
    public final ContentInViewNode getContentInViewNode() {
        return this.contentInViewNode;
    }

    @l
    public final DefaultFlingBehavior getDefaultFlingBehavior() {
        return this.defaultFlingBehavior;
    }

    @l
    public final ScrollableNestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    @l
    public final NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @l
    public final ModifierLocalScrollableContainerProvider getScrollableContainer() {
        return this.scrollableContainer;
    }

    @l
    public final ScrollableGesturesNode getScrollableGesturesNode() {
        return this.scrollableGesturesNode;
    }

    @l
    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDefaultFlingBehavior();
        ObserverModifierNodeKt.observeReads(this, new ScrollableNode$onAttach$1(this));
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo169onKeyEventZmokQxo(@l KeyEvent keyEvent) {
        float f5;
        long Offset;
        float f6;
        if (this.enabled) {
            long m4736getKeyZmokQxo = KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent);
            Key.Companion companion = Key.Companion;
            if ((Key.m4428equalsimpl0(m4736getKeyZmokQxo, companion.m4616getPageDownEK5gGoQ()) || Key.m4428equalsimpl0(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent), companion.m4617getPageUpEK5gGoQ())) && KeyEventType.m4729equalsimpl0(KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4733getKeyDownCS__XNY()) && !KeyEvent_androidKt.m4740isCtrlPressedZmokQxo(keyEvent)) {
                ScrollingLogic scrollingLogic = this.scrollingLogic;
                if (this.orientation == Orientation.Vertical) {
                    int m6213getHeightimpl = IntSize.m6213getHeightimpl(this.contentInViewNode.m317getViewportSizeYbymL2g$foundation_release());
                    if (Key.m4428equalsimpl0(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent), companion.m4617getPageUpEK5gGoQ())) {
                        f6 = m6213getHeightimpl;
                    } else {
                        f6 = -m6213getHeightimpl;
                    }
                    Offset = OffsetKt.Offset(0.0f, f6);
                } else {
                    int m6214getWidthimpl = IntSize.m6214getWidthimpl(this.contentInViewNode.m317getViewportSizeYbymL2g$foundation_release());
                    if (Key.m4428equalsimpl0(KeyEvent_androidKt.m4736getKeyZmokQxo(keyEvent), companion.m4617getPageUpEK5gGoQ())) {
                        f5 = m6214getWidthimpl;
                    } else {
                        f5 = -m6214getWidthimpl;
                    }
                    Offset = OffsetKt.Offset(f5, 0.0f);
                }
                k.f(getCoroutineScope(), null, null, new ScrollableNode$onKeyEvent$1$1(scrollingLogic, Offset, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateDefaultFlingBehavior();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo171onPreKeyEventZmokQxo(@l KeyEvent keyEvent) {
        return false;
    }

    public final void update(@l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, boolean z5, @m FlingBehavior flingBehavior, @m MutableInteractionSource mutableInteractionSource, @l BringIntoViewSpec bringIntoViewSpec) {
        FlingBehavior flingBehavior2;
        if (this.enabled != z4) {
            this.nestedScrollConnection.setEnabled(z4);
            this.scrollableContainer.setEnabled(z4);
        }
        if (flingBehavior == null) {
            flingBehavior2 = this.defaultFlingBehavior;
        } else {
            flingBehavior2 = flingBehavior;
        }
        this.scrollingLogic.update(scrollableState, orientation, overscrollEffect, z5, flingBehavior2, this.nestedScrollDispatcher);
        this.scrollableGesturesNode.update(orientation, z4, mutableInteractionSource);
        this.contentInViewNode.update(orientation, scrollableState, z5, bringIntoViewSpec);
        this.state = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.enabled = z4;
        this.reverseDirection = z5;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
    }
}
