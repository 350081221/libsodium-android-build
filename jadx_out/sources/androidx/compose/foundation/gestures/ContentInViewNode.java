package androidx.compose.foundation.gestures;

import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001NB'\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00107\u001a\u000200\u0012\u0006\u00102\u001a\u00020\u0012\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\bL\u0010MJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0015\u001a\u00020\u0012*\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001b*\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u001b*\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001fH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016J \u0010$\u001a\u00020\u00062\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#H\u0096@¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020&H\u0016J\u001a\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J&\u00105\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00122\u0006\u00104\u001a\u000203R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00106R\u0016\u00107\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00109R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00109R*\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00109R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/geometry/Rect;", "getFocusedChildBounds", "Lkotlin/r2;", "launchAnimation", "", "calculateScrollDelta", "findBringIntoViewRequest", "childBounds", "Landroidx/compose/ui/unit/IntSize;", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "computeDestination", "size", "", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "isMaxVisible", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "relocationOffset", "other", "", "compareTo-TemP2vQ", "(JJ)I", "compareTo", "Landroidx/compose/ui/geometry/Size;", "compareTo-iLBOSCw", "localRect", "calculateRectForParent", "Lkotlin/Function0;", "bringChildIntoView", "(Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newBounds", "onFocusBoundsChanged", "coordinates", "onPlaced", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "reverseDirection", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "update", "Landroidx/compose/foundation/gestures/Orientation;", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "Z", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "focusedChild", "focusedChildBoundsFromPreviousRemeasure", "Landroidx/compose/ui/geometry/Rect;", "trackingFocusedChild", "<set-?>", "viewportSize", "J", "getViewportSize-YbymL2g$foundation_release", "()J", "isAnimationRunning", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "animationState", "Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,429:1\n314#2,11:430\n1#3:441\n106#4,2:442\n108#4:455\n492#5,11:444\n*S KotlinDebug\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode\n*L\n122#1:430,11\n323#1:442,2\n323#1:455\n323#1:444,11\n*E\n"})
/* loaded from: classes.dex */
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode {
    public static final int $stable = 8;

    @l
    private final UpdatableAnimationState animationState;

    @l
    private BringIntoViewSpec bringIntoViewSpec;

    @m
    private LayoutCoordinates coordinates;

    @m
    private LayoutCoordinates focusedChild;

    @m
    private Rect focusedChildBoundsFromPreviousRemeasure;
    private boolean isAnimationRunning;

    @l
    private Orientation orientation;
    private boolean reverseDirection;

    @l
    private ScrollableState scrollState;
    private boolean trackingFocusedChild;

    @l
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
    private long viewportSize = IntSize.Companion.m6219getZeroYbymL2g();

    @StabilityInferred(parameters = 0)
    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "", "toString", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "currentBounds", "Lv3/a;", "getCurrentBounds", "()Lv3/a;", "Lkotlinx/coroutines/p;", "Lkotlin/r2;", "continuation", "Lkotlinx/coroutines/p;", "getContinuation", "()Lkotlinx/coroutines/p;", "<init>", "(Lv3/a;Lkotlinx/coroutines/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nContentInViewNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewNode.kt\nandroidx/compose/foundation/gestures/ContentInViewNode$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Request {
        public static final int $stable = 8;

        @l
        private final p<r2> continuation;

        @l
        private final a<Rect> currentBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(@l a<Rect> aVar, @l p<? super r2> pVar) {
            this.currentBounds = aVar;
            this.continuation = pVar;
        }

        @l
        public final p<r2> getContinuation() {
            return this.continuation;
        }

        @l
        public final a<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
        
            if (r0 == null) goto L10;
         */
        @p4.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                kotlinx.coroutines.p<kotlin.r2> r0 = r4.continuation
                kotlin.coroutines.g r0 = r0.getContext()
                kotlinx.coroutines.r0$a r1 = kotlinx.coroutines.r0.f20457b
                kotlin.coroutines.g$b r0 = r0.get(r1)
                kotlinx.coroutines.r0 r0 = (kotlinx.coroutines.r0) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.F0()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = kotlin.text.c.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.l0.o(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L51
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L53
            L51:
                java.lang.String r0 = "("
            L53:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                v3.a<androidx.compose.ui.geometry.Rect> r0 = r4.currentBounds
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                kotlinx.coroutines.p<kotlin.r2> r0 = r4.continuation
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ContentInViewNode.Request.toString():java.lang.String");
        }
    }

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContentInViewNode(@l Orientation orientation, @l ScrollableState scrollableState, boolean z4, @l BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z4;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.animationState = new UpdatableAnimationState(this.bringIntoViewSpec.getScrollAnimationSpec());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateScrollDelta() {
        if (IntSize.m6212equalsimpl0(this.viewportSize, IntSize.Companion.m6219getZeroYbymL2g())) {
            return 0.0f;
        }
        Rect findBringIntoViewRequest = findBringIntoViewRequest();
        if (findBringIntoViewRequest == null) {
            if (this.trackingFocusedChild) {
                findBringIntoViewRequest = getFocusedChildBounds();
            } else {
                findBringIntoViewRequest = null;
            }
            if (findBringIntoViewRequest == null) {
                return 0.0f;
            }
        }
        long m6224toSizeozmzZPI = IntSizeKt.m6224toSizeozmzZPI(this.viewportSize);
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getLeft(), findBringIntoViewRequest.getRight() - findBringIntoViewRequest.getLeft(), Size.m3562getWidthimpl(m6224toSizeozmzZPI));
            }
            throw new j0();
        }
        return this.bringIntoViewSpec.calculateScrollDistance(findBringIntoViewRequest.getTop(), findBringIntoViewRequest.getBottom() - findBringIntoViewRequest.getTop(), Size.m3559getHeightimpl(m6224toSizeozmzZPI));
    }

    /* renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m311compareToTemP2vQ(long j5, long j6) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return l0.t(IntSize.m6214getWidthimpl(j5), IntSize.m6214getWidthimpl(j6));
            }
            throw new j0();
        }
        return l0.t(IntSize.m6213getHeightimpl(j5), IntSize.m6213getHeightimpl(j6));
    }

    /* renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m312compareToiLBOSCw(long j5, long j6) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return Float.compare(Size.m3562getWidthimpl(j5), Size.m3562getWidthimpl(j6));
            }
            throw new j0();
        }
        return Float.compare(Size.m3559getHeightimpl(j5), Size.m3559getHeightimpl(j6));
    }

    /* renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m313computeDestinationO0kMr_c(Rect rect, long j5) {
        return rect.m3530translatek4lQ0M(Offset.m3502unaryMinusF1C5BW0(m316relocationOffsetBMxPBkI(rect, j5)));
    }

    private final Rect findBringIntoViewRequest() {
        MutableVector mutableVector = this.bringIntoViewRequests.requests;
        int size = mutableVector.getSize();
        Rect rect = null;
        if (size > 0) {
            int i5 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                Rect invoke = ((Request) content[i5]).getCurrentBounds().invoke();
                if (invoke != null) {
                    if (m312compareToiLBOSCw(invoke.m3526getSizeNHjbRc(), IntSizeKt.m6224toSizeozmzZPI(this.viewportSize)) <= 0) {
                        rect = invoke;
                    } else {
                        if (rect == null) {
                            return invoke;
                        }
                        return rect;
                    }
                }
                i5--;
            } while (i5 >= 0);
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getFocusedChildBounds() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.coordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.focusedChild) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    /* renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m314isMaxVisibleO0kMr_c(Rect rect, long j5) {
        long m316relocationOffsetBMxPBkI = m316relocationOffsetBMxPBkI(rect, j5);
        if (Math.abs(Offset.m3493getXimpl(m316relocationOffsetBMxPBkI)) <= 0.5f && Math.abs(Offset.m3494getYimpl(m316relocationOffsetBMxPBkI)) <= 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ boolean m315isMaxVisibleO0kMr_c$default(ContentInViewNode contentInViewNode, Rect rect, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = contentInViewNode.viewportSize;
        }
        return contentInViewNode.m314isMaxVisibleO0kMr_c(rect, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAnimation() {
        if (!this.isAnimationRunning) {
            k.f(getCoroutineScope(), null, u0.UNDISPATCHED, new ContentInViewNode$launchAnimation$2(this, null), 1, null);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
    }

    /* renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m316relocationOffsetBMxPBkI(Rect rect, long j5) {
        long m6224toSizeozmzZPI = IntSizeKt.m6224toSizeozmzZPI(j5);
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return OffsetKt.Offset(this.bringIntoViewSpec.calculateScrollDistance(rect.getLeft(), rect.getRight() - rect.getLeft(), Size.m3562getWidthimpl(m6224toSizeozmzZPI)), 0.0f);
            }
            throw new j0();
        }
        return OffsetKt.Offset(0.0f, this.bringIntoViewSpec.calculateScrollDistance(rect.getTop(), rect.getBottom() - rect.getTop(), Size.m3559getHeightimpl(m6224toSizeozmzZPI)));
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @m
    public Object bringChildIntoView(@l a<Rect> aVar, @l d<? super r2> dVar) {
        d e5;
        Object l5;
        Object l6;
        Rect invoke = aVar.invoke();
        boolean z4 = false;
        if (invoke != null && !m315isMaxVisibleO0kMr_c$default(this, invoke, 0L, 1, null)) {
            z4 = true;
        }
        if (!z4) {
            return r2.f19517a;
        }
        e5 = c.e(dVar);
        q qVar = new q(e5, 1);
        qVar.B();
        if (this.bringIntoViewRequests.enqueue(new Request(aVar, qVar)) && !this.isAnimationRunning) {
            launchAnimation();
        }
        Object E = qVar.E();
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (E == l5) {
            h.c(dVar);
        }
        l6 = kotlin.coroutines.intrinsics.d.l();
        if (E == l6) {
            return E;
        }
        return r2.f19517a;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @l
    public Rect calculateRectForParent(@l Rect rect) {
        if (!IntSize.m6212equalsimpl0(this.viewportSize, IntSize.Companion.m6219getZeroYbymL2g())) {
            return m313computeDestinationO0kMr_c(rect, this.viewportSize);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    /* renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m317getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    public final void onFocusBoundsChanged(@m LayoutCoordinates layoutCoordinates) {
        this.focusedChild = layoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@l LayoutCoordinates layoutCoordinates) {
        this.coordinates = layoutCoordinates;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo294onRemeasuredozmzZPI(long j5) {
        Rect focusedChildBounds;
        long j6 = this.viewportSize;
        this.viewportSize = j5;
        if (m311compareToTemP2vQ(j5, j6) < 0 && (focusedChildBounds = getFocusedChildBounds()) != null) {
            Rect rect = this.focusedChildBoundsFromPreviousRemeasure;
            if (rect == null) {
                rect = focusedChildBounds;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && m314isMaxVisibleO0kMr_c(rect, j6) && !m314isMaxVisibleO0kMr_c(focusedChildBounds, j5)) {
                this.trackingFocusedChild = true;
                launchAnimation();
            }
            this.focusedChildBoundsFromPreviousRemeasure = focusedChildBounds;
        }
    }

    public final void update(@l Orientation orientation, @l ScrollableState scrollableState, boolean z4, @l BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollState = scrollableState;
        this.reverseDirection = z4;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
