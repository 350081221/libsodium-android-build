package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;

@Stable
@i0(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ¶\u00012\u00020\u0001:\u0002¶\u0001B\u001e\u0012\t\b\u0002\u0010¥\u0001\u001a\u00020\n\u0012\t\b\u0002\u0010§\u0001\u001a\u00020\n¢\u0006\u0005\bµ\u0001\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J$\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014¢\u0006\u0002\b\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b!\u0010\u000eJ!\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010.\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\"028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R+\u0010E\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010G\u001a\u00020F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010M\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010U\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010BR\"\u0010X\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010N\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010RR\u0016\u0010[\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010VR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010NR$\u0010b\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010i\u001a\u00020h8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0085\u0001\u0010~\u001a/\u0012\u0013\u0012\u00110\n¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020x0w0v0r23\u0010:\u001a/\u0012\u0013\u0012\u00110\n¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020x0w0v0r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\by\u00104\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R%\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b\u0092\u0001\u00104\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R/\u0010\u0098\u0001\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0095\u0001\u00104\u001a\u0005\b\u0096\u0001\u0010P\"\u0005\b\u0097\u0001\u0010RR/\u0010\u009c\u0001\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0015\n\u0005\b\u0099\u0001\u00104\u001a\u0005\b\u009a\u0001\u0010P\"\u0005\b\u009b\u0001\u0010RR \u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010£\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010BR\u0013\u0010¥\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010BR\u0013\u0010§\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010BR\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0015\u0010\u00ad\u0001\u001a\u00030ª\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010³\u0001\u001a\u00030®\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¯\u0001\u0010°\u0001*\u0006\b±\u0001\u0010²\u0001R\u0016\u0010´\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "delta", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "Lkotlin/r2;", "notifyPrefetch", "info", "cancelPrefetchIfVisibleItemsChanged", "", "index", "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/d;)Ljava/lang/Object;", "snapToItemIndexInternal$foundation_release", "(II)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispatchRawDelta", "distance", "onScroll$foundation_release", "(F)F", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "Landroidx/compose/runtime/MutableState;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<set-?>", "scrollToBeConsumed", "F", "getScrollToBeConsumed$foundation_release", "()F", "slotsPerLine$delegate", "Landroidx/compose/runtime/MutableIntState;", "getSlotsPerLine$foundation_release", "()I", "setSlotsPerLine$foundation_release", "(I)V", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "isVertical", "Z", "isVertical$foundation_release", "()Z", "setVertical$foundation_release", "(Z)V", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "I", "getNumMeasurePasses$foundation_release", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "lineToPrefetch", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentLinePrefetchHandles", "Landroidx/compose/runtime/collection/MutableVector;", "wasScrollingForward", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement$foundation_release", "(Landroidx/compose/ui/layout/Remeasurement;)V", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "line", "", "Lkotlin/u0;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever$delegate", "getPrefetchInfoRetriever$foundation_release", "()Lv3/l;", "setPrefetchInfoRetriever$foundation_release", "(Lv3/l;)V", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "animateScrollScope", "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getNumOfItemsToTeleport", "numOfItemsToTeleport", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/l;", "getNearestRange$foundation_release", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,508:1\n1208#2:509\n1187#2,2:510\n75#3:512\n108#3,2:513\n81#4:515\n107#4,2:516\n81#4:518\n81#4:519\n107#4,2:520\n81#4:522\n107#4,2:523\n460#5,11:525\n460#5,11:542\n33#6,6:536\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n201#1:509\n201#1:510,2\n161#1:512\n161#1:513,2\n234#1:515\n234#1:516,2\n247#1:518\n299#1:519\n299#1:520,2\n301#1:522\n301#1:523,2\n385#1:525,11\n412#1:542,11\n390#1:536,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final Saver<LazyGridState, ?> Saver = ListSaverKt.listSaver(LazyGridState$Companion$Saver$1.INSTANCE, LazyGridState$Companion$Saver$2.INSTANCE);

    @l
    private final LazyGridAnimateScrollScope animateScrollScope;

    @l
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @l
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @l
    private final MutableState canScrollBackward$delegate;

    @l
    private final MutableState canScrollForward$delegate;

    @l
    private final MutableVector<LazyLayoutPrefetchState.PrefetchHandle> currentLinePrefetchHandles;

    @l
    private Density density;

    @l
    private final MutableInteractionSource internalInteractionSource;
    private boolean isVertical;

    @l
    private final MutableState<LazyGridMeasureResult> layoutInfoState;
    private int lineToPrefetch;
    private int numMeasurePasses;

    @l
    private final LazyLayoutPinnedItemList pinnedItems;

    @l
    private final LazyGridItemPlacementAnimator placementAnimator;

    @l
    private final MutableState<r2> placementScopeInvalidator;

    @l
    private final MutableState prefetchInfoRetriever$delegate;

    @l
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;

    @m
    private Remeasurement remeasurement;

    @l
    private final RemeasurementModifier remeasurementModifier;

    @l
    private final LazyGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;

    @l
    private final ScrollableState scrollableState;

    @l
    private final MutableIntState slotsPerLine$delegate;
    private boolean wasScrollingForward;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Saver<LazyGridState, ?> getSaver() {
            return LazyGridState.Saver;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LazyGridState() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.<init>():void");
    }

    public LazyGridState(int i5, int i6) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        LazyGridScrollPosition lazyGridScrollPosition = new LazyGridScrollPosition(i5, i6);
        this.scrollPosition = lazyGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyGridStateKt.access$getEmptyLazyGridLayoutInfo$p(), SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.slotsPerLine$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.isVertical = true;
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyGridState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.lineToPrefetch = -1;
        this.currentLinePrefetchHandles = new MutableVector<>(new LazyLayoutPrefetchState.PrefetchHandle[16], 0);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@l Remeasurement remeasurement) {
                LazyGridState.this.setRemeasurement$foundation_release(remeasurement);
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LazyGridState$prefetchInfoRetriever$2.INSTANCE, null, 2, null);
        this.prefetchInfoRetriever$delegate = mutableStateOf$default;
        this.placementAnimator = new LazyGridItemPlacementAnimator();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.animateScrollScope = new LazyGridAnimateScrollScope(this);
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m724constructorimpl$default(null, 1, null);
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollForward$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.canScrollBackward$delegate = mutableStateOf$default3;
        this.prefetchState = new LazyLayoutPrefetchState();
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyGridState lazyGridState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyGridState.animateScrollToItem(i5, i6, dVar);
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyGridState lazyGridState, LazyGridMeasureResult lazyGridMeasureResult, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        lazyGridState.applyMeasureResult$foundation_release(lazyGridMeasureResult, z4);
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyGridLayoutInfo lazyGridLayoutInfo) {
        Object y22;
        int column;
        int i5;
        Object m32;
        int column2;
        if (this.lineToPrefetch != -1 && (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (this.wasScrollingForward) {
                m32 = e0.m3(lazyGridLayoutInfo.getVisibleItemsInfo());
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) m32;
                if (this.isVertical) {
                    column2 = lazyGridItemInfo.getRow();
                } else {
                    column2 = lazyGridItemInfo.getColumn();
                }
                i5 = column2 + 1;
            } else {
                y22 = e0.y2(lazyGridLayoutInfo.getVisibleItemsInfo());
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) y22;
                if (this.isVertical) {
                    column = lazyGridItemInfo2.getRow();
                } else {
                    column = lazyGridItemInfo2.getColumn();
                }
                i5 = column - 1;
            }
            if (this.lineToPrefetch != i5) {
                this.lineToPrefetch = -1;
                MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector = this.currentLinePrefetchHandles;
                int size = mutableVector.getSize();
                if (size > 0) {
                    LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                    int i6 = 0;
                    do {
                        content[i6].cancel();
                        i6++;
                    } while (i6 < size);
                }
                this.currentLinePrefetchHandles.clear();
            }
        }
    }

    private final int getNumOfItemsToTeleport() {
        return getSlotsPerLine$foundation_release() * 100;
    }

    private final void notifyPrefetch(float f5, LazyGridLayoutInfo lazyGridLayoutInfo) {
        boolean z4;
        Object y22;
        int column;
        int i5;
        Object y23;
        int index;
        boolean z5;
        MutableVector<LazyLayoutPrefetchState.PrefetchHandle> mutableVector;
        int size;
        Object m32;
        int column2;
        Object m33;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.prefetchState;
        if (this.prefetchingEnabled && (!lazyGridLayoutInfo.getVisibleItemsInfo().isEmpty())) {
            if (f5 < 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m32 = e0.m3(lazyGridLayoutInfo.getVisibleItemsInfo());
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) m32;
                if (this.isVertical) {
                    column2 = lazyGridItemInfo.getRow();
                } else {
                    column2 = lazyGridItemInfo.getColumn();
                }
                i5 = column2 + 1;
                m33 = e0.m3(lazyGridLayoutInfo.getVisibleItemsInfo());
                index = ((LazyGridItemInfo) m33).getIndex() + 1;
            } else {
                y22 = e0.y2(lazyGridLayoutInfo.getVisibleItemsInfo());
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) y22;
                if (this.isVertical) {
                    column = lazyGridItemInfo2.getRow();
                } else {
                    column = lazyGridItemInfo2.getColumn();
                }
                i5 = column - 1;
                y23 = e0.y2(lazyGridLayoutInfo.getVisibleItemsInfo());
                index = ((LazyGridItemInfo) y23).getIndex() - 1;
            }
            if (i5 != this.lineToPrefetch) {
                if (index >= 0 && index < lazyGridLayoutInfo.getTotalItemsCount()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (this.wasScrollingForward != z4 && (size = (mutableVector = this.currentLinePrefetchHandles).getSize()) > 0) {
                        LazyLayoutPrefetchState.PrefetchHandle[] content = mutableVector.getContent();
                        int i6 = 0;
                        do {
                            content[i6].cancel();
                            i6++;
                        } while (i6 < size);
                    }
                    this.wasScrollingForward = z4;
                    this.lineToPrefetch = i5;
                    this.currentLinePrefetchHandles.clear();
                    List<u0<Integer, Constraints>> invoke = getPrefetchInfoRetriever$foundation_release().invoke(Integer.valueOf(i5));
                    int size2 = invoke.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        u0<Integer, Constraints> u0Var = invoke.get(i7);
                        this.currentLinePrefetchHandles.add(lazyLayoutPrefetchState.m718schedulePrefetch0kLqBqw(u0Var.getFirst().intValue(), u0Var.getSecond().m6006unboximpl()));
                    }
                }
            }
        }
    }

    static /* synthetic */ void notifyPrefetch$default(LazyGridState lazyGridState, float f5, LazyGridLayoutInfo lazyGridLayoutInfo, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            lazyGridLayoutInfo = lazyGridState.layoutInfoState.getValue();
        }
        lazyGridState.notifyPrefetch(f5, lazyGridLayoutInfo);
    }

    public static /* synthetic */ Object scrollToItem$default(LazyGridState lazyGridState, int i5, int i6, d dVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return lazyGridState.scrollToItem(i5, i6, dVar);
    }

    private void setCanScrollBackward(boolean z4) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z4));
    }

    private void setCanScrollForward(boolean z4) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z4));
    }

    @m
    public final Object animateScrollToItem(@IntRange(from = 0) int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object animateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i5, i6, getNumOfItemsToTeleport(), this.density, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return animateScrollToItem == l5 ? animateScrollToItem : r2.f19517a;
    }

    public final void applyMeasureResult$foundation_release(@l LazyGridMeasureResult lazyGridMeasureResult, boolean z4) {
        this.scrollToBeConsumed -= lazyGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyGridMeasureResult);
        if (z4) {
            this.scrollPosition.updateScrollOffset(lazyGridMeasureResult.getFirstVisibleLineScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyGridMeasureResult);
        }
        setCanScrollBackward(lazyGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyGridMeasureResult.getCanScrollForward());
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
        return this.internalInteractionSource;
    }

    @l
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @l
    public final LazyGridLayoutInfo getLayoutInfo() {
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
    public final LazyGridItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return this.placementAnimator;
    }

    @l
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<r2> m698getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    @l
    public final v3.l<Integer, List<u0<Integer, Constraints>>> getPrefetchInfoRetriever$foundation_release() {
        return (v3.l) this.prefetchInfoRetriever$delegate.getValue();
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

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getSlotsPerLine$foundation_release() {
        return this.slotsPerLine$delegate.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final boolean isVertical$foundation_release() {
        return this.isVertical;
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
                LazyGridMeasureResult value = this.layoutInfoState.getValue();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
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
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = (androidx.compose.foundation.lazy.grid.LazyGridState) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.scroll(androidx.compose.foundation.MutatePriority, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public final Object scrollToItem(@IntRange(from = 0) int i5, int i6, @l d<? super r2> dVar) {
        Object l5;
        Object scroll$default = ScrollableState.scroll$default(this, null, new LazyGridState$scrollToItem$2(this, i5, i6, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll$default == l5 ? scroll$default : r2.f19517a;
    }

    public final void setDensity$foundation_release(@l Density density) {
        this.density = density;
    }

    public final void setPrefetchInfoRetriever$foundation_release(@l v3.l<? super Integer, ? extends List<u0<Integer, Constraints>>> lVar) {
        this.prefetchInfoRetriever$delegate.setValue(lVar);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    public final void setRemeasurement$foundation_release(@m Remeasurement remeasurement) {
        this.remeasurement = remeasurement;
    }

    public final void setSlotsPerLine$foundation_release(int i5) {
        this.slotsPerLine$delegate.setIntValue(i5);
    }

    public final void setVertical$foundation_release(boolean z4) {
        this.isVertical = z4;
    }

    public final void snapToItemIndexInternal$foundation_release(int i5, int i6) {
        this.scrollPosition.requestPosition(i5, i6);
        this.placementAnimator.reset();
        Remeasurement remeasurement = this.remeasurement;
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@l LazyGridItemProvider lazyGridItemProvider, int i5) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider, i5);
    }

    public /* synthetic */ LazyGridState(int i5, int i6, int i7, w wVar) {
        this((i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? 0 : i6);
    }
}
