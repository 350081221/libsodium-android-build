package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 Ã\u00012\u00020\u0001:\u0002Ã\u0001B\u001d\b\u0002\u0012\u0007\u0010¼\u0001\u001a\u00020\u0011\u0012\u0007\u0010½\u0001\u001a\u00020\u0011¢\u0006\u0006\b¾\u0001\u0010¿\u0001B!\b\u0016\u0012\t\b\u0002\u0010À\u0001\u001a\u00020\u000b\u0012\t\b\u0002\u0010Á\u0001\u001a\u00020\u000b¢\u0006\u0006\b¾\u0001\u0010Â\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002JA\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b!\u0010 J#\u0010$\u001a\u00020\b*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0011H\u0000¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J!\u00102\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020,088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R+\u0010F\u001a\u00020.2\u0006\u0010@\u001a\u00020.8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010J\u001a\u00020.2\u0006\u0010@\u001a\u00020.8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR(\u0010O\u001a\u0004\u0018\u00010N2\b\u0010@\u001a\u0004\u0018\u00010N8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010Y\u001a\u00020X8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010^\u001a\u00020]8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\"\u0010b\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010C\"\u0004\be\u0010ER\u001a\u0010g\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010m\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010c\u001a\u0004\bx\u0010C\"\u0004\by\u0010ER%\u0010{\u001a\u0004\u0018\u00010z8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010rR%\u0010\u008b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R \u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R \u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R%\u0010¤\u0001\u001a\u00030£\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b¤\u0001\u0010:\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010¨\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010tR\u0013\u0010ª\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010tR\u0013\u0010¬\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010tR\u0014\u0010¯\u0001\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0015\u0010\u0010\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010tR\u0015\u0010´\u0001\u001a\u00030±\u00018F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R!\u0010º\u0001\u001a\u00030µ\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001*\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010»\u0001\u001a\u00020.8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ä\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "distance", "onScroll", "delta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "info", "Lkotlin/r2;", "notifyPrefetch", "", "", "prefetchHandlesUsed", "clearLeftoverPrefetchHandles", "cancelPrefetchIfVisibleItemsChanged", "itemIndex", "laneCount", "", "fillNearestIndices", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "index", "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "animateScrollToItem", "snapToItemInternal$foundation_release", "(Landroidx/compose/foundation/gestures/ScrollScope;II)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "updateScrollPositionIfTheFirstItemWasMoved", "dispatchRawDelta", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "<set-?>", "canScrollForward$delegate", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "measurePassCount", "I", "getMeasurePassCount$foundation_release", "()I", "setMeasurePassCount$foundation_release", "(I)V", "isVertical", "isVertical$foundation_release", "setVertical$foundation_release", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "setSlots$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "setSpanProvider$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V", "prefetchBaseIndex", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentItemPrefetchHandles", "Ljava/util/Map;", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "getNumOfItemsToTeleport", "numOfItemsToTeleport", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLaneCount$foundation_release", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/l;", "getNearestRange$foundation_release", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "<init>", "([I[I)V", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n81#2:525\n107#2,2:526\n81#2:528\n107#2,2:529\n81#2:531\n1855#3,2:532\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n138#1:525\n138#1:526,2\n140#1:528\n140#1:529,2\n211#1:531\n436#1:532,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyStaggeredGridState implements ScrollableState {

    @l
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;

    @l
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @l
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @l
    private final MutableState canScrollBackward$delegate;

    @l
    private final MutableState canScrollForward$delegate;

    @l
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;

    @l
    private Density density;
    private boolean isVertical;

    @l
    private final LazyStaggeredGridLaneInfo laneInfo;

    @l
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;

    @l
    private final MutableInteractionSource mutableInteractionSource;

    @l
    private final LazyLayoutPinnedItemList pinnedItems;

    @l
    private final LazyStaggeredGridItemPlacementAnimator placementAnimator;

    @l
    private final MutableState<r2> placementScopeInvalidator;
    private int prefetchBaseIndex;

    @l
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    @m
    private Remeasurement remeasurement;

    @l
    private final RemeasurementModifier remeasurementModifier;

    @l
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @l
    private final ScrollableState scrollableState;

    @m
    private LazyStaggeredGridSlots slots;

    @m
    private LazyStaggeredGridSpanProvider spanProvider;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(LazyStaggeredGridState$Companion$Saver$1.INSTANCE, LazyStaggeredGridState$Companion$Saver$2.INSTANCE);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }
    }

    private LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default2;
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@l Remeasurement remeasurement) {
                LazyStaggeredGridState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState();
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyStaggeredGridState$scrollableState$1(this));
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.placementAnimator = new LazyStaggeredGridItemPlacementAnimator();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m724constructorimpl$default(null, 1, null);
    }

    public /* synthetic */ LazyStaggeredGridState(int[] iArr, int[] iArr2, w wVar) {
        this(iArr, iArr2);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i5, i6, dVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z4);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        Object y22;
        Object m32;
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1) {
            boolean z4 = true;
            if (!visibleItemsInfo.isEmpty()) {
                y22 = e0.y2(visibleItemsInfo);
                int index = ((LazyStaggeredGridItemInfo) y22).getIndex();
                m32 = e0.m3(visibleItemsInfo);
                int index2 = ((LazyStaggeredGridItemInfo) m32).getIndex();
                int i5 = this.prefetchBaseIndex;
                if (index > i5 || i5 > index2) {
                    z4 = false;
                }
                if (!z4) {
                    this.prefetchBaseIndex = -1;
                    Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                    while (it.hasNext()) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                    }
                    this.currentItemPrefetchHandles.clear();
                }
            }
        }
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i5, int i6) {
        boolean z4;
        int[] iArr = new int[i6];
        LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
        int i7 = 0;
        if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(i5)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            o.T1(iArr, i5, 0, 0, 6, null);
            return iArr;
        }
        this.laneInfo.ensureValidIndex(i5 + i6);
        int lane = this.laneInfo.getLane(i5);
        if (lane != -2 && lane != -1) {
            if (lane >= 0) {
                i7 = 1;
            }
            if (i7 != 0) {
                i7 = Math.min(lane, i6);
            } else {
                throw new IllegalArgumentException(("Expected positive lane number, got " + lane + " instead.").toString());
            }
        }
        int i8 = i7;
        int i9 = i8 - 1;
        int i10 = i5;
        while (true) {
            if (-1 >= i9) {
                break;
            }
            i10 = this.laneInfo.findPreviousItemIndex(i10, i9);
            iArr[i9] = i10;
            if (i10 == -1) {
                o.T1(iArr, -1, 0, i9, 2, null);
                break;
            }
            i9--;
        }
        iArr[i8] = i5;
        for (int i11 = i8 + 1; i11 < i6; i11++) {
            i5 = this.laneInfo.findNextItemIndex(i5, i11);
            iArr[i11] = i5;
        }
        return iArr;
    }

    private final int getNumOfItemsToTeleport() {
        return getLaneCount$foundation_release() * 100;
    }

    private final void notifyPrefetch(float f5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        boolean z4;
        Object y22;
        int index;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        int i7;
        long m6009fixedHeightOenEA2s;
        Object m32;
        if (this.prefetchingEnabled && (!lazyStaggeredGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (f5 < 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m32 = e0.m3(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo());
                index = ((LazyStaggeredGridItemInfo) m32).getIndex();
            } else {
                y22 = e0.y2(lazyStaggeredGridLayoutInfo.getVisibleItemsInfo());
                index = ((LazyStaggeredGridItemInfo) y22).getIndex();
            }
            if (index == this.prefetchBaseIndex) {
                return;
            }
            this.prefetchBaseIndex = index;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int laneCount$foundation_release = getLaneCount$foundation_release();
            for (int i8 = 0; i8 < laneCount$foundation_release; i8++) {
                if (z4) {
                    index = this.laneInfo.findNextItemIndex(index, i8);
                } else {
                    index = this.laneInfo.findPreviousItemIndex(index, i8);
                }
                if (index >= 0 && index < lazyStaggeredGridLayoutInfo.getTotalItemsCount()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 || linkedHashSet.contains(Integer.valueOf(index))) {
                    break;
                }
                linkedHashSet.add(Integer.valueOf(index));
                if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                    LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider = this.spanProvider;
                    if (lazyStaggeredGridSpanProvider != null && lazyStaggeredGridSpanProvider.isFullSpan(index)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        i5 = 0;
                    } else {
                        i5 = i8;
                    }
                    if (z6) {
                        i6 = getLaneCount$foundation_release();
                    } else {
                        i6 = 1;
                    }
                    LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
                    if (lazyStaggeredGridSlots == null) {
                        i7 = 0;
                    } else if (i6 == 1) {
                        i7 = lazyStaggeredGridSlots.getSizes()[i5];
                    } else {
                        int i9 = lazyStaggeredGridSlots.getPositions()[i5];
                        int i10 = (i5 + i6) - 1;
                        i7 = (lazyStaggeredGridSlots.getPositions()[i10] + lazyStaggeredGridSlots.getSizes()[i10]) - i9;
                    }
                    if (this.isVertical) {
                        m6009fixedHeightOenEA2s = Constraints.Companion.m6010fixedWidthOenEA2s(i7);
                    } else {
                        m6009fixedHeightOenEA2s = Constraints.Companion.m6009fixedHeightOenEA2s(i7);
                    }
                    this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m718schedulePrefetch0kLqBqw(index, m6009fixedHeightOenEA2s));
                }
            }
            clearLeftoverPrefetchHandles(linkedHashSet);
        }
    }

    static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f5, LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lazyStaggeredGridLayoutInfo = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f5, lazyStaggeredGridLayoutInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f5) {
        boolean z4;
        int L0;
        if ((f5 < 0.0f && !getCanScrollForward()) || (f5 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            float f6 = this.scrollToBeConsumed + f5;
            this.scrollToBeConsumed = f6;
            if (Math.abs(f6) > 0.5f) {
                LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
                float f7 = this.scrollToBeConsumed;
                L0 = kotlin.math.d.L0(f7);
                if (value.tryToApplyScrollWithoutRemeasure(L0)) {
                    applyMeasureResult$foundation_release(value, true);
                    ObservableScopeInvalidator.m728invalidateScopeimpl(this.placementScopeInvalidator);
                    notifyPrefetch(f7 - this.scrollToBeConsumed, value);
                } else {
                    Remeasurement remeasurement = this.remeasurement;
                    if (remeasurement != null) {
                        remeasurement.forceRemeasure();
                    }
                    notifyPrefetch$default(this, f7 - this.scrollToBeConsumed, null, 2, null);
                }
            }
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                return f5;
            }
            float f8 = f5 - this.scrollToBeConsumed;
            this.scrollToBeConsumed = 0.0f;
            return f8;
        }
        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i5, i6, dVar);
    }

    private void setCanScrollBackward(boolean z4) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z4));
    }

    private void setCanScrollForward(boolean z4) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z4));
    }

    @m
    public final Object animateScrollToItem(int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i5, i6, getNumOfItemsToTeleport(), this.density, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateScrollToItem == l5 ? animateScrollToItem : r2.f19517a;
    }

    public final void applyMeasureResult$foundation_release(@l LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z4) {
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        if (z4) {
            this.scrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        this.measurePassCount++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f5) {
        return this.scrollableState.dispatchRawDelta(f5);
    }

    @l
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    @l
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @l
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    @l
    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final int getLaneCount$foundation_release() {
        int[] sizes;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.slots;
        if (lazyStaggeredGridSlots == null || (sizes = lazyStaggeredGridSlots.getSizes()) == null) {
            return 0;
        }
        return sizes.length;
    }

    @l
    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    @l
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    @l
    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    @l
    public final kotlin.ranges.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    @l
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    @l
    public final LazyStaggeredGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    @l
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<r2> m761getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    @l
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    @m
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    @l
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    @l
    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    @m
    public final LazyStaggeredGridSlots getSlots$foundation_release() {
        return this.slots;
    }

    @m
    public final LazyStaggeredGridSpanProvider getSpanProvider$foundation_release() {
        return this.spanProvider;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.isVertical;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object scroll(@p4.l androidx.compose.foundation.MutatePriority r6, @p4.l v3.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e1.n(r8)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            v3.p r7 = (v3.p) r7
            java.lang.Object r6 = r0.L$1
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r2
            kotlin.e1.n(r8)
            goto L5a
        L45:
            kotlin.e1.n(r8)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.awaitLayoutModifier
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.waitForFirstLayout(r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.scrollableState
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public final Object scrollToItem(int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyStaggeredGridState$scrollToItem$2(this, i5, i6, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll$default == l5 ? scroll$default : r2.f19517a;
    }

    public final void setDensity$foundation_release(@l Density density) {
        this.density = density;
    }

    public final void setMeasurePassCount$foundation_release(int i5) {
        this.measurePassCount = i5;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    public final void setSlots$foundation_release(@m LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.slots = lazyStaggeredGridSlots;
    }

    public final void setSpanProvider$foundation_release(@m LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider) {
        this.spanProvider = lazyStaggeredGridSpanProvider;
    }

    public final void setVertical$foundation_release(boolean z4) {
        this.isVertical = z4;
    }

    public final void snapToItemInternal$foundation_release(@l ScrollScope scrollScope, int i5, int i6) {
        int m6172getXimpl;
        LazyStaggeredGridItemInfo findVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(getLayoutInfo(), i5);
        if (findVisibleItem != null) {
            boolean z4 = this.isVertical;
            long mo743getOffsetnOccac = findVisibleItem.mo743getOffsetnOccac();
            if (z4) {
                m6172getXimpl = IntOffset.m6173getYimpl(mo743getOffsetnOccac);
            } else {
                m6172getXimpl = IntOffset.m6172getXimpl(mo743getOffsetnOccac);
            }
            scrollScope.scrollBy(m6172getXimpl + i6);
            return;
        }
        this.scrollPosition.requestPosition(i5, i6);
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    @l
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@l LazyLayoutItemProvider lazyLayoutItemProvider, @l int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    public /* synthetic */ LazyStaggeredGridState(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }

    public LazyStaggeredGridState(int i5, int i6) {
        this(new int[]{i5}, new int[]{i6});
    }
}
