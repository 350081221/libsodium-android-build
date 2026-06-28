package androidx.compose.foundation.lazy;

import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:\u0002·\u0001B\u001e\u0012\t\b\u0002\u0010¤\u0001\u001a\u00020\u000b\u0012\t\b\u0002\u0010¦\u0001\u001a\u00020\u000b¢\u0006\u0005\b¶\u0001\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\"\u0010\u000fJ)\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%H\u0000¢\u0006\u0004\b(\u0010)J\u001f\u00100\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b.\u0010/R$\u00102\u001a\u00020%2\u0006\u00101\u001a\u00020%8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010#2\b\u00101\u001a\u0004\u0018\u00010#8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020#0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR$\u0010H\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010U\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\"\u0010Y\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u00103\u001a\u0004\bZ\u00105\"\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010VR\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u00103R(\u0010c\u001a\u0004\u0018\u00010b2\b\u00101\u001a\u0004\u0018\u00010b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010h\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010m\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR*\u0010|\u001a\u00020{8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R/\u0010\u008a\u0001\u001a\u00020%2\u0006\u00101\u001a\u00020%8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010B\u001a\u0005\b\u0088\u0001\u00105\"\u0005\b\u0089\u0001\u0010\\R/\u0010\u008e\u0001\u001a\u00020%2\u0006\u00101\u001a\u00020%8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010B\u001a\u0005\b\u008c\u0001\u00105\"\u0005\b\u008d\u0001\u0010\\R%\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0090\u0001\u0010B\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010¡\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030 \u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0013\u0010¤\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010XR\u0013\u0010¦\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010XR\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0015\u0010¬\u0001\u001a\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R!\u0010²\u0001\u001a\u00030\u00ad\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001*\u0006\b°\u0001\u0010±\u0001R\u0016\u0010³\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u00105R\u0016\u0010µ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¸\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "delta", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Lkotlin/r2;", "notifyPrefetch", "info", "cancelPrefetchIfVisibleItemsChanged", "updateScrollDeltaForPostLookahead", "", "index", "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "(II)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispatchRawDelta", "distance", "onScroll$foundation_release", "(F)F", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;ZZ)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "hasLookaheadPassOccurred", "Z", "getHasLookaheadPassOccurred$foundation_release", "()Z", "postLookaheadLayoutInfo", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "getPostLookaheadLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/LazyListAnimateScrollScope;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "I", "getNumMeasurePasses$foundation_release", "()I", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints", "J", "getPremeasureConstraints-msEJaDk$foundation_release", "()J", "setPremeasureConstraints-BRTryo0$foundation_release", "(J)V", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Lkotlinx/coroutines/s0;", "coroutineScope", "Lkotlinx/coroutines/s0;", "getCoroutineScope$foundation_release", "()Lkotlinx/coroutines/s0;", "setCoroutineScope$foundation_release", "(Lkotlinx/coroutines/s0;)V", "Landroidx/compose/animation/core/AnimationState;", "Landroidx/compose/animation/core/AnimationVector1D;", "_scrollDeltaBetweenPasses", "Landroidx/compose/animation/core/AnimationState;", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/l;", "getNearestRange$foundation_release", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "getScrollDeltaBetweenPasses$foundation_release", "scrollDeltaBetweenPasses", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,567:1\n81#2:568\n81#2:569\n107#2,2:570\n81#2:572\n107#2,2:573\n1#3:575\n495#4,4:576\n500#4:585\n129#5,5:580\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n254#1:568\n304#1:569\n304#1:570,2\n306#1:572\n306#1:573,2\n489#1:576,4\n489#1:585\n489#1:580,5\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(LazyListState$Companion$Saver$1.INSTANCE, LazyListState$Companion$Saver$2.INSTANCE);

    @l
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;

    @l
    private final LazyListAnimateScrollScope animateScrollScope;

    @l
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @l
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @l
    private final MutableState canScrollBackward$delegate;

    @l
    private final MutableState canScrollForward$delegate;

    @m
    private s0 coroutineScope;

    @m
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @l
    private Density density;
    private boolean hasLookaheadPassOccurred;
    private int indexToPrefetch;

    @l
    private final MutableInteractionSource internalInteractionSource;

    @l
    private final LazyListItemAnimator itemAnimator;

    @l
    private final MutableState<LazyListMeasureResult> layoutInfoState;
    private int numMeasurePasses;

    @l
    private final LazyLayoutPinnedItemList pinnedItems;

    @l
    private final MutableState<r2> placementScopeInvalidator;

    @m
    private LazyListMeasureResult postLookaheadLayoutInfo;

    @l
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;

    @m
    private Remeasurement remeasurement;

    @l
    private final RemeasurementModifier remeasurementModifier;

    @l
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @l
    private final ScrollableState scrollableState;
    private boolean wasScrollingForward;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LazyListState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.<init>():void");
    }

    public LazyListState(int i5, int i6) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        AnimationState<Float, AnimationVector1D> AnimationState;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i5, i6);
        this.scrollPosition = lazyListScrollPosition;
        this.animateScrollScope = new LazyListAnimateScrollScope(this);
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyListStateKt.access$getEmptyLazyListMeasureResult$p(), SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyListState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@l Remeasurement remeasurement) {
                LazyListState.this.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyListItemAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default2;
        this.placementScopeInvalidator = ObservableScopeInvalidator.m724constructorimpl$default(null, 1, null);
        this.prefetchState = new LazyLayoutPrefetchState();
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(a0.f19382a);
        Float valueOf = Float.valueOf(0.0f);
        AnimationState = AnimationStateKt.AnimationState(vectorConverter, valueOf, valueOf, (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
        this._scrollDeltaBetweenPasses = AnimationState;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyListState.animateScrollToItem(i5, i6, dVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z4, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResult, z4, z5);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyListLayoutInfo lazyListLayoutInfo) {
        Object y22;
        int index;
        Object m32;
        if (this.indexToPrefetch != -1 && (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.wasScrollingForward) {
                m32 = e0.m3(lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) m32).getIndex() + 1;
            } else {
                y22 = e0.y2(lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) y22).getIndex() - 1;
            }
            if (this.indexToPrefetch != index) {
                this.indexToPrefetch = -1;
                LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
                if (prefetchHandle != null) {
                    prefetchHandle.cancel();
                }
                this.currentPrefetchHandle = null;
            }
        }
    }

    private final void notifyPrefetch(float f5, LazyListLayoutInfo lazyListLayoutInfo) {
        boolean z4;
        Object y22;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        Object m32;
        if (!this.prefetchingEnabled) {
            return;
        }
        boolean z5 = true;
        if (!lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            if (f5 < 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m32 = e0.m3(lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) m32).getIndex() + 1;
            } else {
                y22 = e0.y2(lazyListLayoutInfo.getVisibleItemsInfo());
                index = ((LazyListItemInfo) y22).getIndex() - 1;
            }
            if (index != this.indexToPrefetch) {
                if (index < 0 || index >= lazyListLayoutInfo.getTotalItemsCount()) {
                    z5 = false;
                }
                if (z5) {
                    if (this.wasScrollingForward != z4 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                        prefetchHandle.cancel();
                    }
                    this.wasScrollingForward = z4;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = this.prefetchState.m718schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
                }
            }
        }
    }

    static /* synthetic */ void notifyPrefetch$default(LazyListState lazyListState, float f5, LazyListLayoutInfo lazyListLayoutInfo, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lazyListLayoutInfo = lazyListState.getLayoutInfo();
        }
        lazyListState.notifyPrefetch(f5, lazyListLayoutInfo);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyListState.scrollToItem(i5, i6, dVar);
    }

    private void setCanScrollBackward(boolean z4) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z4));
    }

    private void setCanScrollForward(boolean z4) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void updateScrollDeltaForPostLookahead(float f5) {
        if (f5 <= this.density.mo304toPx0680j_4(LazyListStateKt.access$getDeltaThresholdForScrollAnimation$p())) {
            return;
        }
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                float floatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
                if (this._scrollDeltaBetweenPasses.isRunning()) {
                    this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, floatValue - f5, 0.0f, 0L, 0L, false, 30, (Object) null);
                    s0 s0Var = this.coroutineScope;
                    if (s0Var != null) {
                        k.f(s0Var, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, null), 3, null);
                    }
                } else {
                    this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(a0.f19382a), Float.valueOf(-f5), null, 0L, 0L, false, 60, null);
                    s0 s0Var2 = this.coroutineScope;
                    if (s0Var2 != null) {
                        k.f(s0Var2, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, null), 3, null);
                    }
                }
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    @m
    public final Object animateScrollToItem(@IntRange(from = 0) int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i5, i6, 100, this.density, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (animateScrollToItem == l5) {
            return animateScrollToItem;
        }
        return r2.f19517a;
    }

    public final void applyMeasureResult$foundation_release(@l LazyListMeasureResult lazyListMeasureResult, boolean z4, boolean z5) {
        if (!z4 && this.hasLookaheadPassOccurred) {
            this.postLookaheadLayoutInfo = lazyListMeasureResult;
            return;
        }
        if (z4) {
            this.hasLookaheadPassOccurred = true;
        }
        if (z5) {
            this.scrollPosition.updateScrollOffset(lazyListMeasureResult.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyListMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyListMeasureResult);
        }
        setCanScrollBackward(lazyListMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyListMeasureResult.getCanScrollForward());
        this.scrollToBeConsumed -= lazyListMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z4) {
            updateScrollDeltaForPostLookahead(lazyListMeasureResult.getScrollBackAmount());
        }
        this.numMeasurePasses++;
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

    @m
    public final s0 getCoroutineScope$foundation_release() {
        return this.coroutineScope;
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

    public final boolean getHasLookaheadPassOccurred$foundation_release() {
        return this.hasLookaheadPassOccurred;
    }

    @l
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @l
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @l
    public final LazyListItemAnimator getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    @l
    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    @l
    public final kotlin.ranges.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    @l
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    @l
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<r2> m667getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    @m
    public final LazyListMeasureResult getPostLookaheadLayoutInfo$foundation_release() {
        return this.postLookaheadLayoutInfo;
    }

    @l
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m668getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    @m
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    @l
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f5) {
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
                LazyListMeasureResult value = this.layoutInfoState.getValue();
                float f7 = this.scrollToBeConsumed;
                L0 = kotlin.math.d.L0(f7);
                LazyListMeasureResult lazyListMeasureResult = this.postLookaheadLayoutInfo;
                boolean tryToApplyScrollWithoutRemeasure = value.tryToApplyScrollWithoutRemeasure(L0, !this.hasLookaheadPassOccurred);
                if (tryToApplyScrollWithoutRemeasure && lazyListMeasureResult != null) {
                    tryToApplyScrollWithoutRemeasure = lazyListMeasureResult.tryToApplyScrollWithoutRemeasure(L0, true);
                }
                if (tryToApplyScrollWithoutRemeasure) {
                    applyMeasureResult$foundation_release(value, this.hasLookaheadPassOccurred, true);
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
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
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public final Object scrollToItem(@IntRange(from = 0) int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyListState$scrollToItem$2(this, i5, i6, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll$default == l5 ? scroll$default : r2.f19517a;
    }

    public final void setCoroutineScope$foundation_release(@m s0 s0Var) {
        this.coroutineScope = s0Var;
    }

    public final void setDensity$foundation_release(@l Density density) {
        this.density = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m669setPremeasureConstraintsBRTryo0$foundation_release(long j5) {
        this.premeasureConstraints = j5;
    }

    public final void snapToItemIndexInternal$foundation_release(int i5, int i6) {
        this.scrollPosition.requestPosition(i5, i6);
        this.itemAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@l LazyListItemProvider lazyListItemProvider, int i5) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider, i5);
    }

    public /* synthetic */ LazyListState(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }
}
