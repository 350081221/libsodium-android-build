.class public final Landroidx/compose/foundation/lazy/grid/LazyGridState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/ScrollableState;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00b6\u00012\u00020\u0001:\u0002\u00b6\u0001B\u001e\u0012\t\u0008\u0002\u0010\u00a5\u0001\u001a\u00020\n\u0012\t\u0008\u0002\u0010\u00a7\u0001\u001a\u00020\n\u00a2\u0006\u0005\u0008\u00b5\u0001\u0010\u0010J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0004H\u0002J$\u0010\r\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JA\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\'\u0010\u0019\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014\u00a2\u0006\u0002\u0008\u0018H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ$\u0010!\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008!\u0010\u000eJ!\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0000\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010.\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008,\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\"028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001a\u00106\u001a\u0002058\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R$\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R+\u0010E\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\"\u0010G\u001a\u00020F8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR\"\u0010M\u001a\u00020$8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR\u0014\u0010S\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR$\u0010U\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010BR\"\u0010X\u001a\u00020$8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010N\u001a\u0004\u0008Y\u0010P\"\u0004\u0008Z\u0010RR\u0016\u0010[\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010VR\u001a\u0010^\u001a\u0008\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0016\u0010`\u001a\u00020$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008`\u0010NR$\u0010b\u001a\u0004\u0018\u00010a8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR\u001a\u0010i\u001a\u00020h8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010lR\u001a\u0010n\u001a\u00020m8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010qR\u0085\u0001\u0010~\u001a/\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008s\u0012\u0008\u0008t\u0012\u0004\u0008\u0008(u\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020x0w0v0r23\u0010:\u001a/\u0012\u0013\u0012\u00110\n\u00a2\u0006\u000c\u0008s\u0012\u0008\u0008t\u0012\u0004\u0008\u0008(u\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020x0w0v0r8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008y\u00104\u001a\u0004\u0008z\u0010{\"\u0004\u0008|\u0010}R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R \u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001R%\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000f\n\u0005\u0008\u0092\u0001\u00104\u001a\u0006\u0008\u0093\u0001\u0010\u0094\u0001R/\u0010\u0098\u0001\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@RX\u0096\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u0095\u0001\u00104\u001a\u0005\u0008\u0096\u0001\u0010P\"\u0005\u0008\u0097\u0001\u0010RR/\u0010\u009c\u0001\u001a\u00020$2\u0006\u0010:\u001a\u00020$8V@RX\u0096\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u0099\u0001\u00104\u001a\u0005\u0008\u009a\u0001\u0010P\"\u0005\u0008\u009b\u0001\u0010RR \u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u0016\u0010\u00a3\u0001\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a2\u0001\u0010BR\u0013\u0010\u00a5\u0001\u001a\u00020\n8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0001\u0010BR\u0013\u0010\u00a7\u0001\u001a\u00020\n8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a6\u0001\u0010BR\u0013\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0008\u001a\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R\u0015\u0010\u00ad\u0001\u001a\u00030\u00aa\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R!\u0010\u00b3\u0001\u001a\u00030\u00ae\u00018@X\u0080\u0084\u0002\u00a2\u0006\u0010\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001*\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u0016\u0010\u00b4\u0001\u001a\u00020$8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b4\u0001\u0010P\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00b7\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "",
        "delta",
        "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
        "layoutInfo",
        "Lkotlin/r2;",
        "notifyPrefetch",
        "info",
        "cancelPrefetchIfVisibleItemsChanged",
        "",
        "index",
        "scrollOffset",
        "scrollToItem",
        "(IILkotlin/coroutines/d;)Ljava/lang/Object;",
        "snapToItemIndexInternal$foundation_release",
        "(II)V",
        "snapToItemIndexInternal",
        "Landroidx/compose/foundation/MutatePriority;",
        "scrollPriority",
        "Lkotlin/Function2;",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "block",
        "scroll",
        "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "dispatchRawDelta",
        "distance",
        "onScroll$foundation_release",
        "(F)F",
        "onScroll",
        "animateScrollToItem",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "result",
        "",
        "visibleItemsStayedTheSame",
        "applyMeasureResult$foundation_release",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V",
        "applyMeasureResult",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
        "itemProvider",
        "firstItemIndex",
        "updateScrollPositionIfTheFirstItemWasMoved$foundation_release",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I",
        "updateScrollPositionIfTheFirstItemWasMoved",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;",
        "scrollPosition",
        "Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;",
        "Landroidx/compose/runtime/MutableState;",
        "layoutInfoState",
        "Landroidx/compose/runtime/MutableState;",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "internalInteractionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "getInternalInteractionSource$foundation_release",
        "()Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "<set-?>",
        "scrollToBeConsumed",
        "F",
        "getScrollToBeConsumed$foundation_release",
        "()F",
        "slotsPerLine$delegate",
        "Landroidx/compose/runtime/MutableIntState;",
        "getSlotsPerLine$foundation_release",
        "()I",
        "setSlotsPerLine$foundation_release",
        "(I)V",
        "slotsPerLine",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity$foundation_release",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity$foundation_release",
        "(Landroidx/compose/ui/unit/Density;)V",
        "isVertical",
        "Z",
        "isVertical$foundation_release",
        "()Z",
        "setVertical$foundation_release",
        "(Z)V",
        "scrollableState",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "numMeasurePasses",
        "I",
        "getNumMeasurePasses$foundation_release",
        "prefetchingEnabled",
        "getPrefetchingEnabled$foundation_release",
        "setPrefetchingEnabled$foundation_release",
        "lineToPrefetch",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "currentLinePrefetchHandles",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "wasScrollingForward",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "remeasurement",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "getRemeasurement$foundation_release",
        "()Landroidx/compose/ui/layout/Remeasurement;",
        "setRemeasurement$foundation_release",
        "(Landroidx/compose/ui/layout/Remeasurement;)V",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "remeasurementModifier",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "getRemeasurementModifier$foundation_release",
        "()Landroidx/compose/ui/layout/RemeasurementModifier;",
        "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "awaitLayoutModifier",
        "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "getAwaitLayoutModifier$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "Lkotlin/Function1;",
        "Lkotlin/v0;",
        "name",
        "line",
        "",
        "Lkotlin/u0;",
        "Landroidx/compose/ui/unit/Constraints;",
        "prefetchInfoRetriever$delegate",
        "getPrefetchInfoRetriever$foundation_release",
        "()Lv3/l;",
        "setPrefetchInfoRetriever$foundation_release",
        "(Lv3/l;)V",
        "prefetchInfoRetriever",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;",
        "getPlacementAnimator$foundation_release",
        "()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "beyondBoundsInfo",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "getBeyondBoundsInfo$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;",
        "animateScrollScope",
        "Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "pinnedItems",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "getPinnedItems$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "placementScopeInvalidator",
        "getPlacementScopeInvalidator-zYiylxw$foundation_release",
        "()Landroidx/compose/runtime/MutableState;",
        "canScrollForward$delegate",
        "getCanScrollForward",
        "setCanScrollForward",
        "canScrollForward",
        "canScrollBackward$delegate",
        "getCanScrollBackward",
        "setCanScrollBackward",
        "canScrollBackward",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "prefetchState",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "getPrefetchState$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "getNumOfItemsToTeleport",
        "numOfItemsToTeleport",
        "getFirstVisibleItemIndex",
        "firstVisibleItemIndex",
        "getFirstVisibleItemScrollOffset",
        "firstVisibleItemScrollOffset",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "getInteractionSource",
        "()Landroidx/compose/foundation/interaction/InteractionSource;",
        "interactionSource",
        "Lkotlin/ranges/l;",
        "getNearestRange$foundation_release",
        "()Lkotlin/ranges/l;",
        "getNearestRange$foundation_release$delegate",
        "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;",
        "nearestRange",
        "isScrollInProgress",
        "<init>",
        "Companion",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,508:1\n1208#2:509\n1187#2,2:510\n75#3:512\n108#3,2:513\n81#4:515\n107#4,2:516\n81#4:518\n81#4:519\n107#4,2:520\n81#4:522\n107#4,2:523\n460#5,11:525\n460#5,11:542\n33#6,6:536\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n201#1:509\n201#1:510,2\n161#1:512\n161#1:513,2\n234#1:515\n234#1:516,2\n247#1:518\n299#1:519\n299#1:520,2\n301#1:522\n301#1:523,2\n385#1:525,11\n412#1:542,11\n390#1:536,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Saver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridState;",
            "*>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final animateScrollScope:Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final canScrollForward$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private isVertical:Z

.field private final layoutInfoState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private lineToPrefetch:I

.field private numMeasurePasses:I

.field private final pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final placementAnimator:Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final placementScopeInvalidator:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final prefetchInfoRetriever$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private prefetchingEnabled:Z

.field private remeasurement:Landroidx/compose/ui/layout/Remeasurement;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private scrollToBeConsumed:F

.field private final scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final slotsPerLine$delegate:Landroidx/compose/runtime/MutableIntState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private wasScrollingForward:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->Companion:Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion$Saver$1;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion$Saver$1;

    .line 10
    .line 11
    sget-object v1, Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion$Saver$2;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion$Saver$2;

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/ListSaverKt;->listSaver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v2, v0, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;-><init>(IIILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;-><init>(II)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    .line 3
    invoke-static {}, Landroidx/compose/foundation/lazy/grid/LazyGridStateKt;->access$getEmptyLazyGridLayoutInfo$p()Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-result-object p1

    .line 4
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object p2

    .line 5
    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 6
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->slotsPerLine$delegate:Landroidx/compose/runtime/MutableIntState;

    const/high16 p2, 0x3f800000    # 1.0f

    .line 8
    invoke-static {p2, p2}, Landroidx/compose/ui/unit/DensityKt;->Density(FF)Landroidx/compose/ui/unit/Density;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->density:Landroidx/compose/ui/unit/Density;

    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    .line 10
    new-instance v1, Landroidx/compose/foundation/lazy/grid/LazyGridState$scrollableState$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState$scrollableState$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V

    invoke-static {v1}, Landroidx/compose/foundation/gestures/ScrollableStateKt;->ScrollableState(Lv3/l;)Landroidx/compose/foundation/gestures/ScrollableState;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 11
    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchingEnabled:Z

    const/4 v1, -0x1

    .line 12
    iput v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 13
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v2, 0x10

    new-array v2, v2, [Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    invoke-direct {v1, v2, p1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 14
    iput-object v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 15
    new-instance p1, Landroidx/compose/foundation/lazy/grid/LazyGridState$remeasurementModifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState$remeasurementModifier$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 16
    new-instance p1, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 17
    sget-object p1, Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridState$prefetchInfoRetriever$2;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchInfoRetriever$delegate:Landroidx/compose/runtime/MutableState;

    .line 18
    new-instance p1, Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementAnimator:Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;

    .line 19
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 20
    new-instance p1, Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->animateScrollScope:Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;

    .line 21
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 22
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 23
    invoke-static {v1, p2, v1}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->constructor-impl$default(Landroidx/compose/runtime/MutableState;ILkotlin/jvm/internal/w;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 24
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 25
    invoke-static {p1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 26
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/w;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move p2, v0

    .line 27
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;-><init>(II)V

    return-void
.end method

.method public static final synthetic access$getSaver$cp()Landroidx/compose/runtime/saveable/Saver;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    return-object v0
.end method

.method public static synthetic animateScrollToItem$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;IILkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->animateScrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V

    return-void
.end method

.method private final cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_5

    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->wasScrollingForward:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getRow()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getColumn()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 59
    .line 60
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getRow()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getColumn()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_1
    add-int/lit8 p1, p1, -0x1

    .line 74
    .line 75
    :goto_2
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 76
    .line 77
    if-eq v0, p1, :cond_5

    .line 78
    .line 79
    iput v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 80
    .line 81
    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-lez v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/4 v1, 0x0

    .line 94
    :cond_3
    aget-object v2, p1, v1

    .line 95
    .line 96
    check-cast v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 97
    .line 98
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    if-lt v1, v0, :cond_3

    .line 104
    .line 105
    :cond_4
    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
.end method

.method private static getNearestRange$foundation_release$delegate(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    move-result-object p0

    return-object p0
.end method

.method private final getNumOfItemsToTeleport()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getSlotsPerLine$foundation_release()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    return v0
.end method

.method private final notifyPrefetch(FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchingEnabled:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    xor-int/2addr v1, v2

    .line 20
    if-eqz v1, :cond_8

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    cmpg-float p1, p1, v1

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-gez p1, :cond_1

    .line 27
    .line 28
    move p1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move p1, v1

    .line 31
    :goto_0
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 42
    .line 43
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getRow()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getColumn()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_1
    add-int/2addr v3, v2

    .line 57
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v4}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 66
    .line 67
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    add-int/2addr v4, v2

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 82
    .line 83
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    .line 84
    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getRow()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-interface {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getColumn()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 97
    .line 98
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 107
    .line 108
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    sub-int/2addr v4, v2

    .line 113
    :goto_3
    iget v5, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 114
    .line 115
    if-eq v3, v5, :cond_8

    .line 116
    .line 117
    if-ltz v4, :cond_5

    .line 118
    .line 119
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getTotalItemsCount()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    if-ge v4, p2, :cond_5

    .line 124
    .line 125
    move p2, v2

    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move p2, v1

    .line 128
    :goto_4
    if-eqz p2, :cond_8

    .line 129
    .line 130
    iget-boolean p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->wasScrollingForward:Z

    .line 131
    .line 132
    if-eq p2, p1, :cond_7

    .line 133
    .line 134
    iget-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 135
    .line 136
    invoke-virtual {p2}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-lez v4, :cond_7

    .line 141
    .line 142
    invoke-virtual {p2}, Landroidx/compose/runtime/collection/MutableVector;->getContent()[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    move v5, v1

    .line 147
    :cond_6
    aget-object v6, p2, v5

    .line 148
    .line 149
    check-cast v6, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 150
    .line 151
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 152
    .line 153
    .line 154
    add-int/2addr v5, v2

    .line 155
    if-lt v5, v4, :cond_6

    .line 156
    .line 157
    :cond_7
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->wasScrollingForward:Z

    .line 158
    .line 159
    iput v3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->lineToPrefetch:I

    .line 160
    .line 161
    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getPrefetchInfoRetriever$foundation_release()Lv3/l;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-interface {p1, p2}, Lv3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    :goto_5
    if-ge v1, p2, :cond_8

    .line 185
    .line 186
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    check-cast v2, Lkotlin/u0;

    .line 191
    .line 192
    iget-object v3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->currentLinePrefetchHandles:Landroidx/compose/runtime/collection/MutableVector;

    .line 193
    .line 194
    invoke-virtual {v2}, Lkotlin/u0;->getFirst()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Ljava/lang/Number;

    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-virtual {v2}, Lkotlin/u0;->getSecond()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Landroidx/compose/ui/unit/Constraints;

    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    .line 211
    .line 212
    .line 213
    move-result-wide v5

    .line 214
    invoke-virtual {v0, v4, v5, v6}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v3, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_8
    return-void
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
.end method

.method static synthetic notifyPrefetch$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 6
    .line 7
    invoke-interface {p2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
.end method

.method public static synthetic scrollToItem$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;IILkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private setCanScrollBackward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private setCanScrollForward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method


# virtual methods
.method public final animateScrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->animateScrollScope:Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getNumOfItemsToTeleport()I

    move-result v3

    iget-object v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->density:Landroidx/compose/ui/unit/Density;

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt;->animateScrollToItem(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V
    .locals 2
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->getConsumedScroll()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sub-float/2addr v0, v1

    .line 8
    iput v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->getFirstVisibleLineScrollOffset()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p2, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->updateScrollOffset(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->updateFromMeasureResult(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->getCanScrollBackward()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-direct {p0, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->setCanScrollBackward(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->getCanScrollForward()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->setCanScrollForward(Z)V

    .line 47
    .line 48
    .line 49
    iget p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->numMeasurePasses:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    iput p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->numMeasurePasses:I

    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public dispatchRawDelta(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    move-result p1

    return p1
.end method

.method public final getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    return-object v0
.end method

.method public final getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    return-object v0
.end method

.method public getCanScrollBackward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public getCanScrollForward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getDensity$foundation_release()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getFirstVisibleItemIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->getIndex()I

    move-result v0

    return v0
.end method

.method public final getFirstVisibleItemScrollOffset()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->getScrollOffset()I

    move-result v0

    return v0
.end method

.method public final getInteractionSource()Landroidx/compose/foundation/interaction/InteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;

    return-object v0
.end method

.method public final getNearestRange$foundation_release()Lkotlin/ranges/l;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lkotlin/ranges/l;

    .line 12
    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getNumMeasurePasses$foundation_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->numMeasurePasses:I

    return v0
.end method

.method public final getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    return-object v0
.end method

.method public final getPlacementAnimator$foundation_release()Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementAnimator:Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;

    return-object v0
.end method

.method public final getPlacementScopeInvalidator-zYiylxw$foundation_release()Landroidx/compose/runtime/MutableState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/MutableState<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final getPrefetchInfoRetriever$foundation_release()Lv3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv3/l<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/Constraints;",
            ">;>;>;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchInfoRetriever$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv3/l;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    return-object v0
.end method

.method public final getPrefetchingEnabled$foundation_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchingEnabled:Z

    return v0
.end method

.method public final getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    return-object v0
.end method

.method public final getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    return-object v0
.end method

.method public final getScrollToBeConsumed$foundation_release()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    return v0
.end method

.method public final getSlotsPerLine$foundation_release()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->slotsPerLine$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public isScrollInProgress()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    move-result v0

    return v0
.end method

.method public final isVertical$foundation_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    return v0
.end method

.method public final onScroll$foundation_release(F)F
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getCanScrollForward()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    :cond_0
    cmpl-float v1, p1, v0

    .line 13
    .line 14
    if-lez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->getCanScrollBackward()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    :cond_1
    return v0

    .line 23
    :cond_2
    iget v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/high16 v2, 0x3f000000    # 0.5f

    .line 30
    .line 31
    cmpg-float v1, v1, v2

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-gtz v1, :cond_3

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-eqz v1, :cond_8

    .line 40
    .line 41
    iget v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 42
    .line 43
    add-float/2addr v1, p1

    .line 44
    iput v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    cmpl-float v1, v1, v2

    .line 51
    .line 52
    if-lez v1, :cond_6

    .line 53
    .line 54
    iget-object v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 55
    .line 56
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    .line 61
    .line 62
    iget v4, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 63
    .line 64
    invoke-static {v4}, Lkotlin/math/b;->L0(F)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v1, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;->tryToApplyScrollWithoutRemeasure(I)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, v1, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 78
    .line 79
    invoke-static {v3}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->invalidateScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 80
    .line 81
    .line 82
    iget v3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 83
    .line 84
    sub-float/2addr v4, v3

    .line 85
    invoke-direct {p0, v4, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 90
    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    invoke-interface {v1}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 94
    .line 95
    .line 96
    :cond_5
    iget v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 97
    .line 98
    sub-float/2addr v4, v1

    .line 99
    const/4 v1, 0x2

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {p0, v4, v3, v1, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridState;->notifyPrefetch$default(Landroidx/compose/foundation/lazy/grid/LazyGridState;FLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_1
    iget v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    cmpg-float v1, v1, v2

    .line 111
    .line 112
    if-gtz v1, :cond_7

    .line 113
    .line 114
    return p1

    .line 115
    :cond_7
    iget v1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 116
    .line 117
    sub-float/2addr p1, v1

    .line 118
    iput v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 119
    .line 120
    return p1

    .line 121
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    const-string v0, "entered drag with non-zero pending scroll: "

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    iget v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollToBeConsumed:F

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v0
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
.end method

.method public scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p1    # Landroidx/compose/foundation/MutatePriority;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/MutatePriority;",
            "Lv3/p<",
            "-",
            "Landroidx/compose/foundation/gestures/ScrollScope;",
            "-",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    iget-object p1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lv3/p;

    .line 57
    .line 58
    iget-object p1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Landroidx/compose/foundation/MutatePriority;

    .line 61
    .line 62
    iget-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 65
    .line 66
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p3, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 74
    .line 75
    iput-object p0, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    iput v4, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    .line 82
    .line 83
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;->waitForFirstLayout(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-ne p3, v1, :cond_4

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_4
    move-object v2, p0

    .line 91
    :goto_1
    iget-object p3, v2, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, Landroidx/compose/foundation/lazy/grid/LazyGridState$scroll$1;->label:I

    .line 101
    .line 102
    invoke-interface {p3, p1, p2, v0}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v1, :cond_5

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 110
    .line 111
    return-object p1
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public final scrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    const/4 v1, 0x0

    new-instance v2, Landroidx/compose/foundation/lazy/grid/LazyGridState$scrollToItem$2;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, p2, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridState$scrollToItem$2;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;IILkotlin/coroutines/d;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll$default(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final setDensity$foundation_release(Landroidx/compose/ui/unit/Density;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public final setPrefetchInfoRetriever$foundation_release(Lv3/l;)V
    .locals 1
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/util/List<",
            "Lkotlin/u0<",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/unit/Constraints;",
            ">;>;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchInfoRetriever$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final setPrefetchingEnabled$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->prefetchingEnabled:Z

    return-void
.end method

.method public final setRemeasurement$foundation_release(Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/layout/Remeasurement;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    return-void
.end method

.method public final setSlotsPerLine$foundation_release(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->slotsPerLine$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final setVertical$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->isVertical:Z

    return-void
.end method

.method public final snapToItemIndexInternal$foundation_release(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->requestPosition(II)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->placementAnimator:Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;->reset()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public final updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/lazy/grid/LazyGridState;->scrollPosition:Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;->updateScrollPositionIfTheFirstItemWasMoved(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I

    move-result p1

    return p1
.end method
