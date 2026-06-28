package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.navigation.compose.ComposeNavigator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.a;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0003opqB\u0017\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010J\u001a\u00020H¢\u0006\u0004\bm\u0010nJ4\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002JD\u0010\u0016\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\f\u0010\u001e\u001a\u00020\u0007*\u00020\u0002H\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J!\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u000e\b\u0004\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bJ\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\"\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00182\b\b\u0002\u0010(\u001a\u00020\u0018H\u0002J\u0017\u0010+\u001a\u00020\u00072\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\bJ2\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0002¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J0\u0010\n\u001a\b\u0012\u0004\u0012\u00020-0,2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010/J\u000e\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0018J\u0006\u00105\u001a\u00020\u0007J%\u0010;\u001a\u00020:2\u001d\u0010*\u001a\u0019\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020!06¢\u0006\u0002\b9J*\u0010=\u001a\u00020<2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b=\u0010>J\u0006\u0010?\u001a\u00020\u0007R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR*\u0010J\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010QR0\u0010U\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0Sj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR4\u0010W\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020Sj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0002`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR\u0018\u0010Y\u001a\u00060XR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u00060[R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R4\u0010^\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00020Sj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0002`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010VR\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020<0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010QR\u0016\u0010i\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010QR\u0014\u0010k\u001a\u00020j8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006r"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "slotId", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "subcompose", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lv3/p;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "nodeState", "Landroidx/compose/runtime/ReusableComposition;", "existing", "container", "", "reuseContent", "Landroidx/compose/runtime/CompositionContext;", "parent", ComposeNavigator.NAME, "subcomposeInto", "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lv3/p;)Landroidx/compose/runtime/ReusableComposition;", "", "index", "getSlotIdAtIndex", "deactivate", "markActiveNodesAsReused", "disposeCurrentNodes", "resetLayoutState", "takeNodeFromReusables", "disposeUnusedSlotsInPostLookahead", "Landroidx/compose/ui/layout/MeasureResult;", "result", "placeChildrenBlock", "createMeasureResult", "createNodeAt", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "block", "ignoreRemeasureRequests", "", "Landroidx/compose/ui/layout/Measurable;", "postLookaheadSubcompose", "(Ljava/lang/Object;Lv3/p;)Ljava/util/List;", "onReuse", "onDeactivate", "onRelease", "startIndex", "disposeOrReuseStartingFromIndex", "makeSureStateIsConsistent", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Lkotlin/u;", "Landroidx/compose/ui/layout/MeasurePolicy;", "createMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren", "root", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", b.f22420d, "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "setSlotReusePolicy", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "currentIndex", "I", "currentPostLookaheadIndex", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeToNodeState", "Ljava/util/HashMap;", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$PostLookaheadMeasureScopeImpl;", "postLookaheadMeasureScope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$PostLookaheadMeasureScopeImpl;", "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "postLookaheadPrecomposeSlotHandleMap", "Ljava/util/Map;", "Landroidx/compose/runtime/collection/MutableVector;", "postLookaheadComposedSlotIds", "Landroidx/compose/runtime/collection/MutableVector;", "reusableCount", "precomposedCount", "", "NoIntrinsicsMessage", "Ljava/lang/String;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "NodeState", "PostLookaheadMeasureScopeImpl", "Scope", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 6 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,987:1\n847#1:1012\n847#1:1026\n847#1:1058\n847#1:1063\n1208#2:988\n1187#2,2:989\n361#3,7:991\n361#3,7:998\n361#3,7:1049\n495#4,4:1005\n500#4:1018\n495#4,4:1019\n500#4:1032\n495#4,4:1033\n500#4:1042\n129#5,3:1009\n133#5:1017\n129#5,3:1023\n133#5:1031\n129#5,5:1037\n1072#6,4:1013\n1072#6,4:1027\n1072#6,2:1043\n1074#6,2:1047\n1072#6,4:1059\n1072#6,4:1064\n1072#6,4:1068\n1855#7,2:1045\n215#8,2:1056\n33#9,6:1072\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n470#1:1012\n540#1:1026\n835#1:1058\n841#1:1063\n384#1:988\n384#1:989,2\n421#1:991,7\n457#1:998,7\n763#1:1049,7\n469#1:1005,4\n469#1:1018\n527#1:1019,4\n527#1:1032\n567#1:1033,4\n567#1:1042\n469#1:1009,3\n469#1:1017\n527#1:1023,3\n527#1:1031\n567#1:1037,5\n470#1:1013,4\n540#1:1027,4\n591#1:1043,2\n591#1:1047,2\n835#1:1059,4\n841#1:1064,4\n847#1:1068,4\n592#1:1045,2\n824#1:1056,2\n947#1:1072,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {
    public static final int $stable = 8;

    @m
    private CompositionContext compositionContext;
    private int currentIndex;
    private int currentPostLookaheadIndex;
    private int precomposedCount;
    private int reusableCount;

    @l
    private final LayoutNode root;

    @l
    private SubcomposeSlotReusePolicy slotReusePolicy;

    @l
    private final HashMap<LayoutNode, NodeState> nodeToNodeState = new HashMap<>();

    @l
    private final HashMap<Object, LayoutNode> slotIdToNode = new HashMap<>();

    @l
    private final Scope scope = new Scope();

    @l
    private final PostLookaheadMeasureScopeImpl postLookaheadMeasureScope = new PostLookaheadMeasureScopeImpl();

    @l
    private final HashMap<Object, LayoutNode> precomposeMap = new HashMap<>();

    @l
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);

    @l
    private final Map<Object, SubcomposeLayoutState.PrecomposedSlotHandle> postLookaheadPrecomposeSlotHandleMap = new LinkedHashMap();

    @l
    private final MutableVector<Object> postLookaheadComposedSlotIds = new MutableVector<>(new Object[16], 0);

    @l
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bE\u0010FJH\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0096\u0001J\u0017\u0010\u0013\u001a\u00020\u0003*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u0003*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u0010*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u0010*\u00020\u001aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0019\u001a\u00020\u0010*\u00020\u0003H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u001f*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001a*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\u001a*\u00020\u0014H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0018J\r\u0010(\u001a\u00020'*\u00020&H\u0097\u0001J\u0017\u0010*\u001a\u00020\u001e*\u00020\u001fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010!J\u0017\u0010-\u001a\u00020\u0014*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u0014*\u00020\u001aH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010,J\u001a\u0010-\u001a\u00020\u0014*\u00020\u0003H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J2\u00107\u001a\b\u0012\u0004\u0012\u000206052\b\u00101\u001a\u0004\u0018\u0001002\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020\u000b02¢\u0006\u0002\b3H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020>8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$PostLookaheadMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lv3/p;)Ljava/util/List;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class PostLookaheadMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public PostLookaheadMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @l
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @l
        public MeasureResult layout(int i5, int i6, @l Map<AlignmentLine, Integer> map, @l v3.l<? super Placeable.PlacementScope, r2> lVar) {
            return this.$$delegate_0.layout(i5, i6, map, lVar);
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

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @l
        public List<Measurable> subcompose(@m Object obj, @l p<? super Composer, ? super Integer, r2> pVar) {
            List<Measurable> list;
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.get(obj);
            if (layoutNode != null) {
                list = layoutNode.getChildMeasurables$ui_release();
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            return LayoutNodeSubcompositionsState.this.postLookaheadSubcompose(obj, pVar);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012¢\u0006\u0002\b\u0014H\u0016R\"\u0010\u0019\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u0014\u0010*\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "", "slotId", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose", "(Ljava/lang/Object;Lv3/p;)Ljava/util/List;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "", "density", "F", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "", "isLookingAhead", "()Z", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,987:1\n120#2,5:988\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n880#1:988,5\n*E\n"})
    /* loaded from: classes.dex */
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;

        @l
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        public Scope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @l
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            if (LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadLayingOut && LayoutNodeSubcompositionsState.this.root.getLayoutState$ui_release() != LayoutNode.LayoutState.LookaheadMeasuring) {
                return false;
            }
            return true;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @l
        public MeasureResult layout(final int i5, final int i6, @l final Map<AlignmentLine, Integer> map, @l final v3.l<? super Placeable.PlacementScope, r2> lVar) {
            boolean z4;
            if ((i5 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & i6) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @l
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return map;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return i6;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return i5;
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        LookaheadDelegate lookaheadDelegate;
                        if (this.isLookingAhead() && (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getLookaheadDelegate()) != null) {
                            lVar.invoke(lookaheadDelegate.getPlacementScope());
                        } else {
                            lVar.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui_release().getPlacementScope());
                        }
                    }
                };
            }
            throw new IllegalStateException(("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
        }

        public void setDensity(float f5) {
            this.density = f5;
        }

        public void setFontScale(float f5) {
            this.fontScale = f5;
        }

        public void setLayoutDirection(@l LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @l
        public List<Measurable> subcompose(@m Object obj, @l p<? super Composer, ? super Integer, r2> pVar) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, pVar);
        }
    }

    public LayoutNodeSubcompositionsState(@l LayoutNode layoutNode, @l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final a<r2> aVar) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasureResult$1
            @Override // androidx.compose.ui.layout.MeasureResult
            @l
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                aVar.invoke();
            }
        };
    }

    private final LayoutNode createNodeAt(int i5) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
        this.root.insertAt$ui_release(i5, layoutNode);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
        return layoutNode;
    }

    private final void disposeCurrentNodes() {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        Iterator<T> it = this.nodeToNodeState.values().iterator();
        while (it.hasNext()) {
            ReusableComposition composition = ((NodeState) it.next()).getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.root.removeAll$ui_release();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.clear();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInPostLookahead() {
        b0.D0(this.postLookaheadPrecomposeSlotHandleMap.entrySet(), new LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(this));
    }

    private final Object getSlotIdAtIndex(int i5) {
        NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i5));
        l0.m(nodeState);
        return nodeState.getSlotId();
    }

    private final void ignoreRemeasureRequests(a<r2> aVar) {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        aVar.invoke();
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
    }

    private final void markActiveNodesAsReused(boolean z4) {
        MutableState<Boolean> mutableStateOf$default;
        this.precomposedCount = 0;
        this.precomposeMap.clear();
        int size = this.root.getFoldedChildren$ui_release().size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                for (int i5 = 0; i5 < size; i5++) {
                    try {
                        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i5);
                        NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        if (nodeState != null && nodeState.getActive()) {
                            resetLayoutState(layoutNode);
                            if (z4) {
                                ReusableComposition composition = nodeState.getComposition();
                                if (composition != null) {
                                    composition.deactivate();
                                }
                                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                nodeState.setActiveState(mutableStateOf$default);
                            } else {
                                nodeState.setActive(false);
                            }
                            nodeState.setSlotId(SubcomposeLayoutKt.access$getReusedSlotId$p());
                        }
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                r2 r2Var = r2.f19517a;
                createNonObservableSnapshot.dispose();
                this.slotIdToNode.clear();
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i5, int i6, int i7) {
        LayoutNode layoutNode = this.root;
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, true);
        this.root.move$ui_release(i5, i6, i7);
        LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode, false);
    }

    static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i7 = 1;
        }
        layoutNodeSubcompositionsState.move(i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> postLookaheadSubcompose(Object obj, p<? super Composer, ? super Integer, r2> pVar) {
        boolean z4;
        List<Measurable> E;
        if (this.postLookaheadComposedSlotIds.getSize() >= this.currentPostLookaheadIndex) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int size = this.postLookaheadComposedSlotIds.getSize();
            int i5 = this.currentPostLookaheadIndex;
            if (size == i5) {
                this.postLookaheadComposedSlotIds.add(obj);
            } else {
                this.postLookaheadComposedSlotIds.set(i5, obj);
            }
            this.currentPostLookaheadIndex++;
            if (!this.precomposeMap.containsKey(obj)) {
                this.postLookaheadPrecomposeSlotHandleMap.put(obj, precompose(obj, pVar));
                if (this.root.getLayoutState$ui_release() == LayoutNode.LayoutState.LayingOut) {
                    this.root.requestLookaheadRelayout$ui_release(true);
                } else {
                    LayoutNode.requestLookaheadRemeasure$ui_release$default(this.root, true, false, 2, null);
                }
            }
            LayoutNode layoutNode = this.precomposeMap.get(obj);
            if (layoutNode != null) {
                List<LayoutNodeLayoutDelegate.MeasurePassDelegate> childDelegates$ui_release = layoutNode.getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
                int size2 = childDelegates$ui_release.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    childDelegates$ui_release.get(i6).markDetachedFromParentLookaheadPass$ui_release();
                }
                return childDelegates$ui_release;
            }
            E = w.E();
            return E;
        }
        throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString());
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate$ui_release = layoutNode.getMeasurePassDelegate$ui_release();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = layoutNode.getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(usageByParent);
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private final ReusableComposition subcomposeInto(ReusableComposition reusableComposition, LayoutNode layoutNode, boolean z4, CompositionContext compositionContext, p<? super Composer, ? super Integer, r2> pVar) {
        if (reusableComposition == null || reusableComposition.isDisposed()) {
            reusableComposition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        if (!z4) {
            reusableComposition.setContent(pVar);
        } else {
            reusableComposition.setContentWithReuse(pVar);
        }
        return reusableComposition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i5;
        MutableState<Boolean> mutableStateOf$default;
        if (this.reusableCount == 0) {
            return null;
        }
        int size = this.root.getFoldedChildren$ui_release().size() - this.precomposedCount;
        int i6 = size - this.reusableCount;
        int i7 = size - 1;
        int i8 = i7;
        while (true) {
            if (i8 >= i6) {
                if (l0.g(getSlotIdAtIndex(i8), obj)) {
                    i5 = i8;
                    break;
                }
                i8--;
            } else {
                i5 = -1;
                break;
            }
        }
        if (i5 == -1) {
            while (i7 >= i6) {
                NodeState nodeState = this.nodeToNodeState.get(this.root.getFoldedChildren$ui_release().get(i7));
                l0.m(nodeState);
                NodeState nodeState2 = nodeState;
                if (nodeState2.getSlotId() != SubcomposeLayoutKt.access$getReusedSlotId$p() && !this.slotReusePolicy.areCompatible(obj, nodeState2.getSlotId())) {
                    i7--;
                } else {
                    nodeState2.setSlotId(obj);
                    i8 = i7;
                    i5 = i8;
                    break;
                }
            }
            i8 = i7;
        }
        if (i5 == -1) {
            return null;
        }
        if (i8 != i6) {
            move(i8, i6, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(i6);
        NodeState nodeState3 = this.nodeToNodeState.get(layoutNode);
        l0.m(nodeState3);
        NodeState nodeState4 = nodeState3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        nodeState4.setActiveState(mutableStateOf$default);
        nodeState4.setForceReuse(true);
        nodeState4.setForceRecompose(true);
        return layoutNode;
    }

    @l
    public final MeasurePolicy createMeasurePolicy(@l final p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> pVar) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @l
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
                final int i5;
                LayoutNodeSubcompositionsState.PostLookaheadMeasureScopeImpl postLookaheadMeasureScopeImpl;
                final int i6;
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (!measureScope.isLookingAhead() && LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui_release() != null) {
                    LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex = 0;
                    p<SubcomposeMeasureScope, Constraints, MeasureResult> pVar2 = pVar;
                    postLookaheadMeasureScopeImpl = LayoutNodeSubcompositionsState.this.postLookaheadMeasureScope;
                    final MeasureResult invoke = pVar2.invoke(postLookaheadMeasureScopeImpl, Constraints.m5988boximpl(j5));
                    i6 = LayoutNodeSubcompositionsState.this.currentPostLookaheadIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                        @Override // androidx.compose.ui.layout.MeasureResult
                        @l
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return invoke.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return invoke.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return invoke.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentPostLookaheadIndex = i6;
                            invoke.placeChildren();
                            layoutNodeSubcompositionsState.disposeUnusedSlotsInPostLookahead();
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentIndex = 0;
                final MeasureResult invoke2 = pVar.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m5988boximpl(j5));
                i5 = LayoutNodeSubcompositionsState.this.currentIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @l
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return invoke2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return invoke2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return invoke2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        int i7;
                        layoutNodeSubcompositionsState2.currentIndex = i5;
                        invoke2.placeChildren();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                        i7 = layoutNodeSubcompositionsState3.currentIndex;
                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(i7);
                    }
                };
            }
        };
    }

    public final void disposeOrReuseStartingFromIndex(int i5) {
        boolean z4 = false;
        this.reusableCount = 0;
        int size = (this.root.getFoldedChildren$ui_release().size() - this.precomposedCount) - 1;
        if (i5 <= size) {
            this.reusableSlotIdsSet.clear();
            if (i5 <= size) {
                int i6 = i5;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(i6));
                    if (i6 == size) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                boolean z5 = false;
                while (size >= i5) {
                    try {
                        LayoutNode layoutNode = this.root.getFoldedChildren$ui_release().get(size);
                        NodeState nodeState = this.nodeToNodeState.get(layoutNode);
                        l0.m(nodeState);
                        NodeState nodeState2 = nodeState;
                        Object slotId = nodeState2.getSlotId();
                        if (this.reusableSlotIdsSet.contains(slotId)) {
                            this.reusableCount++;
                            if (nodeState2.getActive()) {
                                resetLayoutState(layoutNode);
                                nodeState2.setActive(false);
                                z5 = true;
                            }
                        } else {
                            LayoutNode layoutNode2 = this.root;
                            LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
                            this.nodeToNodeState.remove(layoutNode);
                            ReusableComposition composition = nodeState2.getComposition();
                            if (composition != null) {
                                composition.dispose();
                            }
                            this.root.removeAt$ui_release(size, 1);
                            LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                        }
                        this.slotIdToNode.remove(slotId);
                        size--;
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                }
                r2 r2Var = r2.f19517a;
                createNonObservableSnapshot.dispose();
                z4 = z5;
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        if (z4) {
            Snapshot.Companion.sendApplyNotifications();
        }
        makeSureStateIsConsistent();
    }

    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui_release().size()) {
            Iterator<Map.Entry<LayoutNode, NodeState>> it = this.nodeToNodeState.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().setForceRecompose(true);
            }
            if (!this.root.getMeasurePending$ui_release()) {
                LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
            }
        }
    }

    @m
    public final CompositionContext getCompositionContext() {
        return this.compositionContext;
    }

    @l
    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    public final void makeSureStateIsConsistent() {
        boolean z4;
        boolean z5;
        int size = this.root.getFoldedChildren$ui_release().size();
        boolean z6 = true;
        if (this.nodeToNodeState.size() == size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if ((size - this.reusableCount) - this.precomposedCount >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (this.precomposeMap.size() != this.precomposedCount) {
                    z6 = false;
                }
                if (z6) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    @l
    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(@m final Object obj, @l p<? super Composer, ? super Integer, r2> pVar) {
        if (!this.root.isAttached()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void dispose() {
                }
            };
        }
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            this.postLookaheadPrecomposeSlotHandleMap.remove(obj);
            HashMap<Object, LayoutNode> hashMap = this.precomposeMap;
            LayoutNode layoutNode = hashMap.get(obj);
            if (layoutNode == null) {
                layoutNode = takeNodeFromReusables(obj);
                if (layoutNode != null) {
                    move(this.root.getFoldedChildren$ui_release().indexOf(layoutNode), this.root.getFoldedChildren$ui_release().size(), 1);
                    this.precomposedCount++;
                } else {
                    layoutNode = createNodeAt(this.root.getFoldedChildren$ui_release().size());
                    this.precomposedCount++;
                }
                hashMap.put(obj, layoutNode);
            }
            subcompose(layoutNode, obj, pVar);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                HashMap hashMap2;
                int i5;
                boolean z4;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10;
                LayoutNodeSubcompositionsState.this.makeSureStateIsConsistent();
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.remove(obj);
                if (layoutNode2 != null) {
                    i5 = LayoutNodeSubcompositionsState.this.precomposedCount;
                    boolean z5 = false;
                    if (i5 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        int indexOf = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                        int size = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                        i6 = LayoutNodeSubcompositionsState.this.precomposedCount;
                        if (indexOf >= size - i6) {
                            z5 = true;
                        }
                        if (z5) {
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                            i7 = layoutNodeSubcompositionsState.reusableCount;
                            layoutNodeSubcompositionsState.reusableCount = i7 + 1;
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                            i8 = layoutNodeSubcompositionsState2.precomposedCount;
                            layoutNodeSubcompositionsState2.precomposedCount = i8 - 1;
                            int size2 = LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui_release().size();
                            i9 = LayoutNodeSubcompositionsState.this.precomposedCount;
                            int i11 = size2 - i9;
                            i10 = LayoutNodeSubcompositionsState.this.reusableCount;
                            int i12 = i11 - i10;
                            LayoutNodeSubcompositionsState.this.move(indexOf, i12, 1);
                            LayoutNodeSubcompositionsState.this.disposeOrReuseStartingFromIndex(i12);
                            return;
                        }
                        throw new IllegalStateException("Item is not in pre-composed item range".toString());
                    }
                    throw new IllegalStateException("No pre-composed items to dispose".toString());
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                HashMap hashMap2;
                List<LayoutNode> children$ui_release;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 == null || (children$ui_release = layoutNode2.getChildren$ui_release()) == null) {
                    return 0;
                }
                return children$ui_release.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo5014premeasure0kLqBqw(int i5, long j5) {
                HashMap hashMap2;
                hashMap2 = LayoutNodeSubcompositionsState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) hashMap2.get(obj);
                if (layoutNode2 != null && layoutNode2.isAttached()) {
                    int size = layoutNode2.getChildren$ui_release().size();
                    if (i5 >= 0 && i5 < size) {
                        if (!layoutNode2.isPlaced()) {
                            LayoutNode layoutNode3 = LayoutNodeSubcompositionsState.this.root;
                            layoutNode3.ignoreRemeasureRequests = true;
                            LayoutNodeKt.requireOwner(layoutNode2).mo5260measureAndLayout0kLqBqw(layoutNode2.getChildren$ui_release().get(i5), j5);
                            layoutNode3.ignoreRemeasureRequests = false;
                            return;
                        }
                        throw new IllegalArgumentException("Pre-measure called on node that is not placed".toString());
                    }
                    throw new IndexOutOfBoundsException("Index (" + i5 + ") is out of bound of [0, " + size + ')');
                }
            }
        };
    }

    public final void setCompositionContext(@m CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final void setSlotReusePolicy(@l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui_release$default(this.root, false, false, 3, null);
        }
    }

    @l
    public final List<Measurable> subcompose(@m Object obj, @l p<? super Composer, ? super Integer, r2> pVar) {
        Object T2;
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = this.root.getLayoutState$ui_release();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui_release == layoutState || layoutState$ui_release == LayoutNode.LayoutState.LayingOut || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || layoutState$ui_release == LayoutNode.LayoutState.LookaheadLayingOut) {
            HashMap<Object, LayoutNode> hashMap = this.slotIdToNode;
            LayoutNode layoutNode = hashMap.get(obj);
            if (layoutNode == null) {
                layoutNode = this.precomposeMap.remove(obj);
                if (layoutNode != null) {
                    int i5 = this.precomposedCount;
                    if (i5 > 0) {
                        this.precomposedCount = i5 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    layoutNode = takeNodeFromReusables(obj);
                    if (layoutNode == null) {
                        layoutNode = createNodeAt(this.currentIndex);
                    }
                }
                hashMap.put(obj, layoutNode);
            }
            LayoutNode layoutNode2 = layoutNode;
            T2 = e0.T2(this.root.getFoldedChildren$ui_release(), this.currentIndex);
            if (T2 != layoutNode2) {
                int indexOf = this.root.getFoldedChildren$ui_release().indexOf(layoutNode2);
                int i6 = this.currentIndex;
                if (!(indexOf >= i6)) {
                    throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
                }
                if (i6 != indexOf) {
                    move$default(this, indexOf, i6, 0, 4, null);
                }
            }
            this.currentIndex++;
            subcompose(layoutNode2, obj, pVar);
            if (layoutState$ui_release != layoutState && layoutState$ui_release != LayoutNode.LayoutState.LayingOut) {
                return layoutNode2.getChildLookaheadMeasurables$ui_release();
            }
            return layoutNode2.getChildMeasurables$ui_release();
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010.R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R-\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001e¨\u0006/"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "Ljava/lang/Object;", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Lv3/p;", "getContent", "()Lv3/p;", "setContent", "(Lv3/p;)V", "Landroidx/compose/runtime/ReusableComposition;", "composition", "Landroidx/compose/runtime/ReusableComposition;", "getComposition", "()Landroidx/compose/runtime/ReusableComposition;", "setComposition", "(Landroidx/compose/runtime/ReusableComposition;)V", "", "forceRecompose", "Z", "getForceRecompose", "()Z", "setForceRecompose", "(Z)V", "forceReuse", "getForceReuse", "setForceReuse", "Landroidx/compose/runtime/MutableState;", "activeState", "Landroidx/compose/runtime/MutableState;", "getActiveState", "()Landroidx/compose/runtime/MutableState;", "setActiveState", "(Landroidx/compose/runtime/MutableState;)V", b.f22420d, "getActive", "setActive", "active", "<init>", "(Ljava/lang/Object;Lv3/p;Landroidx/compose/runtime/ReusableComposition;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class NodeState {

        @l
        private MutableState<Boolean> activeState;

        @m
        private ReusableComposition composition;

        @l
        private p<? super Composer, ? super Integer, r2> content;
        private boolean forceRecompose;
        private boolean forceReuse;

        @m
        private Object slotId;

        public NodeState(@m Object obj, @l p<? super Composer, ? super Integer, r2> pVar, @m ReusableComposition reusableComposition) {
            MutableState<Boolean> mutableStateOf$default;
            this.slotId = obj;
            this.content = pVar;
            this.composition = reusableComposition;
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.activeState = mutableStateOf$default;
        }

        public final boolean getActive() {
            return this.activeState.getValue().booleanValue();
        }

        @l
        public final MutableState<Boolean> getActiveState() {
            return this.activeState;
        }

        @m
        public final ReusableComposition getComposition() {
            return this.composition;
        }

        @l
        public final p<Composer, Integer, r2> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        @m
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActive(boolean z4) {
            this.activeState.setValue(Boolean.valueOf(z4));
        }

        public final void setActiveState(@l MutableState<Boolean> mutableState) {
            this.activeState = mutableState;
        }

        public final void setComposition(@m ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public final void setContent(@l p<? super Composer, ? super Integer, r2> pVar) {
            this.content = pVar;
        }

        public final void setForceRecompose(boolean z4) {
            this.forceRecompose = z4;
        }

        public final void setForceReuse(boolean z4) {
            this.forceReuse = z4;
        }

        public final void setSlotId(@m Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ NodeState(Object obj, p pVar, ReusableComposition reusableComposition, int i5, kotlin.jvm.internal.w wVar) {
            this(obj, pVar, (i5 & 4) != 0 ? null : reusableComposition);
        }
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, p<? super Composer, ? super Integer, r2> pVar) {
        HashMap<LayoutNode, NodeState> hashMap = this.nodeToNodeState;
        NodeState nodeState = hashMap.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m4988getLambda1$ui_release(), null, 4, null);
            hashMap.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        ReusableComposition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition != null ? composition.getHasInvalidations() : true;
        if (nodeState2.getContent() != pVar || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(pVar);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    private final void subcompose(LayoutNode layoutNode, NodeState nodeState) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                LayoutNode layoutNode2 = this.root;
                LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, true);
                p<Composer, Integer, r2> content = nodeState.getContent();
                ReusableComposition composition = nodeState.getComposition();
                CompositionContext compositionContext = this.compositionContext;
                if (compositionContext != null) {
                    nodeState.setComposition(subcomposeInto(composition, layoutNode, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.composableLambdaInstance(-1750409193, true, new LayoutNodeSubcompositionsState$subcompose$3$1$1(nodeState, content))));
                    nodeState.setForceReuse(false);
                    LayoutNode.access$setIgnoreRemeasureRequests$p(layoutNode2, false);
                    r2 r2Var = r2.f19517a;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }
}
