.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/ScrollableState;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00fe\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u00c3\u00012\u00020\u0001:\u0002\u00c3\u0001B\u001d\u0008\u0002\u0012\u0007\u0010\u00bc\u0001\u001a\u00020\u0011\u0012\u0007\u0010\u00bd\u0001\u001a\u00020\u0011\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00bf\u0001B!\u0008\u0016\u0012\t\u0008\u0002\u0010\u00c0\u0001\u001a\u00020\u000b\u0012\t\u0008\u0002\u0010\u00c1\u0001\u001a\u00020\u000b\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00c2\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\r\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002JA\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\'\u0010\u001a\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015\u00a2\u0006\u0002\u0008\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u001f\u0010 J\"\u0010!\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008!\u0010 J#\u0010$\u001a\u00020\u0008*\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J!\u00102\u001a\u00020\u00082\u0006\u0010-\u001a\u00020,2\u0008\u0008\u0002\u0010/\u001a\u00020.H\u0000\u00a2\u0006\u0004\u00080\u00101R\u001a\u00104\u001a\u0002038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020,088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001a\u0010<\u001a\u00020;8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R+\u0010F\u001a\u00020.2\u0006\u0010@\u001a\u00020.8V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008A\u0010:\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER+\u0010J\u001a\u00020.2\u0006\u0010@\u001a\u00020.8V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008G\u0010:\u001a\u0004\u0008H\u0010C\"\u0004\u0008I\u0010ER\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR(\u0010O\u001a\u0004\u0018\u00010N2\u0008\u0010@\u001a\u0004\u0018\u00010N8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010RR\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008T\u0010U\u001a\u0004\u0008V\u0010WR\u001a\u0010Y\u001a\u00020X8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\R\u001a\u0010^\u001a\u00020]8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010aR\"\u0010b\u001a\u00020.8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010C\"\u0004\u0008e\u0010ER\u001a\u0010g\u001a\u00020f8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010jR\u0014\u0010k\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR$\u0010m\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u00028\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008m\u0010n\u001a\u0004\u0008o\u0010pR\"\u0010q\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR\"\u0010w\u001a\u00020.8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008w\u0010c\u001a\u0004\u0008x\u0010C\"\u0004\u0008y\u0010ER%\u0010{\u001a\u0004\u0018\u00010z8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0013\n\u0004\u0008{\u0010|\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001\"\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u0010rR%\u0010\u008b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R*\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\"\u0006\u0008\u0092\u0001\u0010\u0093\u0001R \u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001R \u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001R \u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R%\u0010\u00a4\u0001\u001a\u00030\u00a3\u00018\u0000X\u0080\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000f\n\u0005\u0008\u00a4\u0001\u0010:\u001a\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R\u0016\u0010\u00a8\u0001\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a7\u0001\u0010tR\u0013\u0010\u00aa\u0001\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00a9\u0001\u0010tR\u0013\u0010\u00ac\u0001\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00ab\u0001\u0010tR\u0014\u0010\u00af\u0001\u001a\u00020\u00068F\u00a2\u0006\u0008\u001a\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001R\u0015\u0010\u0010\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00b0\u0001\u0010tR\u0015\u0010\u00b4\u0001\u001a\u00030\u00b1\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001R!\u0010\u00ba\u0001\u001a\u00030\u00b5\u00018@X\u0080\u0084\u0002\u00a2\u0006\u0010\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001*\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\u0016\u0010\u00bb\u0001\u001a\u00020.8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00bb\u0001\u0010C\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00c4\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "",
        "distance",
        "onScroll",
        "delta",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;",
        "info",
        "Lkotlin/r2;",
        "notifyPrefetch",
        "",
        "",
        "prefetchHandlesUsed",
        "clearLeftoverPrefetchHandles",
        "cancelPrefetchIfVisibleItemsChanged",
        "itemIndex",
        "laneCount",
        "",
        "fillNearestIndices",
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
        "index",
        "scrollOffset",
        "scrollToItem",
        "(IILkotlin/coroutines/d;)Ljava/lang/Object;",
        "animateScrollToItem",
        "snapToItemInternal$foundation_release",
        "(Landroidx/compose/foundation/gestures/ScrollScope;II)V",
        "snapToItemInternal",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;",
        "itemProvider",
        "firstItemIndex",
        "updateScrollPositionIfTheFirstItemWasMoved$foundation_release",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I",
        "updateScrollPositionIfTheFirstItemWasMoved",
        "dispatchRawDelta",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "result",
        "",
        "visibleItemsStayedTheSame",
        "applyMeasureResult$foundation_release",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V",
        "applyMeasureResult",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;",
        "scrollPosition",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;",
        "getScrollPosition$foundation_release",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;",
        "Landroidx/compose/runtime/MutableState;",
        "layoutInfoState",
        "Landroidx/compose/runtime/MutableState;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;",
        "laneInfo",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;",
        "getLaneInfo$foundation_release",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;",
        "<set-?>",
        "canScrollForward$delegate",
        "getCanScrollForward",
        "()Z",
        "setCanScrollForward",
        "(Z)V",
        "canScrollForward",
        "canScrollBackward$delegate",
        "getCanScrollBackward",
        "setCanScrollBackward",
        "canScrollBackward",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;",
        "animateScrollScope",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "remeasurement",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "getRemeasurement$foundation_release",
        "()Landroidx/compose/ui/layout/Remeasurement;",
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
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "beyondBoundsInfo",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "getBeyondBoundsInfo$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "prefetchingEnabled",
        "Z",
        "getPrefetchingEnabled$foundation_release",
        "setPrefetchingEnabled$foundation_release",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "prefetchState",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "getPrefetchState$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "scrollableState",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "scrollToBeConsumed",
        "F",
        "getScrollToBeConsumed$foundation_release",
        "()F",
        "measurePassCount",
        "I",
        "getMeasurePassCount$foundation_release",
        "()I",
        "setMeasurePassCount$foundation_release",
        "(I)V",
        "isVertical",
        "isVertical$foundation_release",
        "setVertical$foundation_release",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
        "slots",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
        "getSlots$foundation_release",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
        "setSlots$foundation_release",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;",
        "spanProvider",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;",
        "getSpanProvider$foundation_release",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;",
        "setSpanProvider$foundation_release",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V",
        "prefetchBaseIndex",
        "",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "currentItemPrefetchHandles",
        "Ljava/util/Map;",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity$foundation_release",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity$foundation_release",
        "(Landroidx/compose/ui/unit/Density;)V",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "mutableInteractionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "getMutableInteractionSource$foundation_release",
        "()Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "pinnedItems",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "getPinnedItems$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;",
        "getPlacementAnimator$foundation_release",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "placementScopeInvalidator",
        "getPlacementScopeInvalidator-zYiylxw$foundation_release",
        "()Landroidx/compose/runtime/MutableState;",
        "getNumOfItemsToTeleport",
        "numOfItemsToTeleport",
        "getFirstVisibleItemIndex",
        "firstVisibleItemIndex",
        "getFirstVisibleItemScrollOffset",
        "firstVisibleItemScrollOffset",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;",
        "layoutInfo",
        "getLaneCount$foundation_release",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "getInteractionSource",
        "()Landroidx/compose/foundation/interaction/InteractionSource;",
        "interactionSource",
        "Lkotlin/ranges/l;",
        "getNearestRange$foundation_release",
        "()Lkotlin/ranges/l;",
        "getNearestRange$foundation_release$delegate",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;",
        "nearestRange",
        "isScrollInProgress",
        "initialFirstVisibleItems",
        "initialFirstVisibleOffsets",
        "<init>",
        "([I[I)V",
        "initialFirstVisibleItemIndex",
        "initialFirstVisibleItemOffset",
        "(II)V",
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
        "SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,524:1\n81#2:525\n107#2,2:526\n81#2:528\n107#2,2:529\n81#2:531\n1855#3,2:532\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n138#1:525\n138#1:526,2\n140#1:528\n140#1:529,2\n211#1:531\n436#1:532,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private static final Saver:Landroidx/compose/runtime/saveable/Saver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/saveable/Saver<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field


# instance fields
.field private final animateScrollScope:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;
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

.field private final currentItemPrefetchHandles:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
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

.field private isVertical:Z

.field private final laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final layoutInfoState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private measurePassCount:I

.field private final mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final placementAnimator:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;
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

.field private prefetchBaseIndex:I

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

.field private final scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private scrollToBeConsumed:F

.field private final scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private spanProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;
    .annotation build Lp4/m;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;-><init>(Lkotlin/jvm/internal/w;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Companion:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->$stable:I

    .line 12
    .line 13
    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$1;

    .line 14
    .line 15
    sget-object v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$2;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion$Saver$2;

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroidx/compose/runtime/saveable/ListSaverKt;->listSaver(Lv3/p;Lv3/l;)Landroidx/compose/runtime/saveable/Saver;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    .line 22
    .line 23
    return-void
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
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    new-array p1, v0, [I

    aput p2, p1, v2

    .line 27
    invoke-direct {p0, v1, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;-><init>([I[I)V

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

    .line 26
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;-><init>(II)V

    return-void
.end method

.method private constructor <init>([I[I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 3
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollPosition$1;-><init>(Ljava/lang/Object;)V

    .line 4
    invoke-direct {v0, p1, p2, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;-><init>([I[ILv3/p;)V

    iput-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 5
    invoke-static {}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt;->getEmptyLazyStaggeredGridLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object p1

    .line 6
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object p2

    .line 7
    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 8
    new-instance p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 10
    invoke-static {p1, p2, v1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    .line 11
    new-instance p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->animateScrollScope:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;

    .line 12
    new-instance p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$remeasurementModifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$remeasurementModifier$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    .line 13
    new-instance p1, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 14
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 16
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;-><init>()V

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 17
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollableState$1;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollableState$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V

    invoke-static {v1}, Landroidx/compose/foundation/gestures/ScrollableStateKt;->ScrollableState(Lv3/l;)Landroidx/compose/foundation/gestures/ScrollableState;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    const/4 v1, -0x1

    .line 18
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 19
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    invoke-static {v1, v1}, Landroidx/compose/ui/unit/DensityKt;->Density(FF)Landroidx/compose/ui/unit/Density;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->density:Landroidx/compose/ui/unit/Density;

    .line 21
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 22
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;-><init>()V

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 23
    new-instance v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;-><init>()V

    iput-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementAnimator:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;

    .line 24
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 25
    invoke-static {p2, p1, p2}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->constructor-impl$default(Landroidx/compose/runtime/MutableState;ILkotlin/jvm/internal/w;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method public synthetic constructor <init>([I[ILkotlin/jvm/internal/w;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;-><init>([I[I)V

    return-void
.end method

.method public static final synthetic access$fillNearestIndices(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;II)[I
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->fillNearestIndices(II)[I

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSaver$cp()Landroidx/compose/runtime/saveable/Saver;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->Saver:Landroidx/compose/runtime/saveable/Saver;

    return-object v0
.end method

.method public static final synthetic access$onScroll(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;F)F
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->onScroll(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$setRemeasurement$p(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    return-void
.end method

.method public static synthetic animateScrollToItem$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->animateScrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V

    return-void
.end method

.method private final cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x1

    .line 18
    xor-int/2addr v0, v2

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {p1}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 36
    .line 37
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-gt v0, v3, :cond_0

    .line 45
    .line 46
    if-gt v3, p1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v2, v4

    .line 50
    :goto_0
    if-nez v2, :cond_2

    .line 51
    .line 52
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 53
    .line 54
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Iterable;

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 77
    .line 78
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
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
.end method

.method private final clearLeftoverPrefetchHandles(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 38
    .line 39
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void
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
.end method

.method private final fillNearestIndices(II)[I
    .locals 10

    .line 1
    new-array v6, p2, [I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->spanProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v7, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ne v0, v7, :cond_0

    .line 14
    .line 15
    move v0, v7

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x6

    .line 23
    const/4 v5, 0x0

    .line 24
    move-object v0, v6

    .line 25
    move v1, p1

    .line 26
    invoke-static/range {v0 .. v5}, Lkotlin/collections/l;->T1([IIIIILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object v6

    .line 30
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 31
    .line 32
    add-int v2, p1, p2

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->ensureValidIndex(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, -0x2

    .line 44
    const/4 v3, -0x1

    .line 45
    if-eq v0, v2, :cond_4

    .line 46
    .line 47
    if-eq v0, v3, :cond_4

    .line 48
    .line 49
    if-ltz v0, :cond_2

    .line 50
    .line 51
    move v1, v7

    .line 52
    :cond_2
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string p2, "Expected positive lane number, got "

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p2, " instead."

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p2

    .line 91
    :cond_4
    :goto_1
    move v8, v1

    .line 92
    add-int/lit8 v0, v8, -0x1

    .line 93
    .line 94
    move v4, v0

    .line 95
    move v0, p1

    .line 96
    :goto_2
    if-ge v3, v4, :cond_6

    .line 97
    .line 98
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 99
    .line 100
    invoke-virtual {v1, v0, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    aput v0, v6, v4

    .line 105
    .line 106
    if-ne v0, v3, :cond_5

    .line 107
    .line 108
    const/4 v1, -0x1

    .line 109
    const/4 v2, 0x0

    .line 110
    const/4 v5, 0x2

    .line 111
    const/4 v9, 0x0

    .line 112
    move-object v0, v6

    .line 113
    move v3, v4

    .line 114
    move v4, v5

    .line 115
    move-object v5, v9

    .line 116
    invoke-static/range {v0 .. v5}, Lkotlin/collections/l;->T1([IIIIILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    add-int/lit8 v4, v4, -0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    :goto_3
    aput p1, v6, v8

    .line 124
    .line 125
    add-int/2addr v8, v7

    .line 126
    :goto_4
    if-ge v8, p2, :cond_7

    .line 127
    .line 128
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 129
    .line 130
    invoke-virtual {v0, p1, v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findNextItemIndex(II)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    aput p1, v6, v8

    .line 135
    .line 136
    add-int/lit8 v8, v8, 0x1

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    return-object v6
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

.method private static getNearestRange$foundation_release$delegate(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    move-result-object p0

    return-object p0
.end method

.method private final getNumOfItemsToTeleport()I
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getLaneCount$foundation_release()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    return v0
.end method

.method private final notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    xor-int/2addr v0, v1

    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    cmpg-float p1, p1, v0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-gez p1, :cond_0

    .line 24
    .line 25
    move p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p1, v0

    .line 28
    :goto_0
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 39
    .line 40
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {v2}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 54
    .line 55
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getIndex()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_1
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 60
    .line 61
    if-ne v2, v3, :cond_2

    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    iput v2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchBaseIndex:I

    .line 65
    .line 66
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getLaneCount$foundation_release()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    move v5, v0

    .line 76
    :goto_2
    if-ge v5, v4, :cond_d

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    iget-object v6, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 81
    .line 82
    invoke-virtual {v6, v2, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findNextItemIndex(II)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    goto :goto_3

    .line 87
    :cond_3
    iget-object v6, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 88
    .line 89
    invoke-virtual {v6, v2, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :goto_3
    if-ltz v2, :cond_4

    .line 94
    .line 95
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;->getTotalItemsCount()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-ge v2, v6, :cond_4

    .line 100
    .line 101
    move v6, v1

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move v6, v0

    .line 104
    :goto_4
    if-eqz v6, :cond_d

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_5

    .line 115
    .line 116
    goto/16 :goto_b

    .line 117
    .line 118
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iget-object v7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 130
    .line 131
    invoke-interface {v7, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    if-eqz v6, :cond_6

    .line 136
    .line 137
    goto/16 :goto_a

    .line 138
    .line 139
    :cond_6
    iget-object v6, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->spanProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 140
    .line 141
    if-eqz v6, :cond_7

    .line 142
    .line 143
    invoke-virtual {v6, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-ne v6, v1, :cond_7

    .line 148
    .line 149
    move v6, v1

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    move v6, v0

    .line 152
    :goto_5
    if-eqz v6, :cond_8

    .line 153
    .line 154
    move v7, v0

    .line 155
    goto :goto_6

    .line 156
    :cond_8
    move v7, v5

    .line 157
    :goto_6
    if-eqz v6, :cond_9

    .line 158
    .line 159
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getLaneCount$foundation_release()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    goto :goto_7

    .line 164
    :cond_9
    move v6, v1

    .line 165
    :goto_7
    iget-object v8, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 166
    .line 167
    if-nez v8, :cond_a

    .line 168
    .line 169
    move v6, v0

    .line 170
    goto :goto_8

    .line 171
    :cond_a
    if-ne v6, v1, :cond_b

    .line 172
    .line 173
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    aget v6, v6, v7

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_b
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getPositions()[I

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    aget v9, v9, v7

    .line 185
    .line 186
    add-int/2addr v7, v6

    .line 187
    sub-int/2addr v7, v1

    .line 188
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getPositions()[I

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    aget v6, v6, v7

    .line 193
    .line 194
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    aget v7, v8, v7

    .line 199
    .line 200
    add-int/2addr v6, v7

    .line 201
    sub-int/2addr v6, v9

    .line 202
    :goto_8
    iget-boolean v7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->isVertical:Z

    .line 203
    .line 204
    if-eqz v7, :cond_c

    .line 205
    .line 206
    sget-object v7, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 207
    .line 208
    invoke-virtual {v7, v6}, Landroidx/compose/ui/unit/Constraints$Companion;->fixedWidth-OenEA2s(I)J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    goto :goto_9

    .line 213
    :cond_c
    sget-object v7, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 214
    .line 215
    invoke-virtual {v7, v6}, Landroidx/compose/ui/unit/Constraints$Companion;->fixedHeight-OenEA2s(I)J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    :goto_9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    iget-object v9, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->currentItemPrefetchHandles:Ljava/util/Map;

    .line 224
    .line 225
    iget-object v10, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 226
    .line 227
    invoke-virtual {v10, v2, v6, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-interface {v9, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto/16 :goto_2

    .line 237
    .line 238
    :cond_d
    :goto_b
    invoke-direct {p0, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->clearLeftoverPrefetchHandles(Ljava/util/Set;)V

    .line 239
    .line 240
    .line 241
    :cond_e
    return-void
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

.method static synthetic notifyPrefetch$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 6
    .line 7
    invoke-interface {p2}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    .line 12
    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V

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

.method private final onScroll(F)F
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
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getCanScrollForward()Z

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
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getCanScrollBackward()Z

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
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

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
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 42
    .line 43
    add-float/2addr v1, p1

    .line 44
    iput v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

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
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 55
    .line 56
    invoke-interface {v1}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 61
    .line 62
    iget v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 63
    .line 64
    invoke-static {v4}, Lkotlin/math/b;->L0(F)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v1, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->tryToApplyScrollWithoutRemeasure(I)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, v1, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 78
    .line 79
    invoke-static {v3}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->invalidateScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 80
    .line 81
    .line 82
    iget v3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 83
    .line 84
    sub-float/2addr v4, v3

    .line 85
    invoke-direct {p0, v4, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch(FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

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
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 97
    .line 98
    sub-float/2addr v4, v1

    .line 99
    const/4 v1, 0x2

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static {p0, v4, v3, v1, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->notifyPrefetch$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;FLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_6
    :goto_1
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

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
    iget v1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 116
    .line 117
    sub-float/2addr p1, v1

    .line 118
    iput v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

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
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

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

.method public static synthetic scrollToItem$default(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToItem(IILkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private setCanScrollBackward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

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
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->animateScrollScope:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope;

    invoke-direct {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getNumOfItemsToTeleport()I

    move-result v3

    iget-object v4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->density:Landroidx/compose/ui/unit/Density;

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

.method public final applyMeasureResult$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V
    .locals 2
    .param p1    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getConsumedScroll()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sub-float/2addr v0, v1

    .line 8
    iput v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getFirstVisibleItemScrollOffsets()[I

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateScrollOffset([I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateFromMeasureResult(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCanScrollBackward()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-direct {p0, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setCanScrollBackward(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;->getCanScrollForward()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->setCanScrollForward(Z)V

    .line 47
    .line 48
    .line 49
    iget p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    move-result p1

    return p1
.end method

.method public final getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    return-object v0
.end method

.method public final getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    return-object v0
.end method

.method public getCanScrollBackward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

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
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getFirstVisibleItemIndex()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getIndex()I

    move-result v0

    return v0
.end method

.method public final getFirstVisibleItemScrollOffset()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getScrollOffset()I

    move-result v0

    return v0
.end method

.method public final getInteractionSource()Landroidx/compose/foundation/interaction/InteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getLaneCount$foundation_release()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getLaneInfo$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    return-object v0
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->layoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    return-object v0
.end method

.method public final getMeasurePassCount$foundation_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    return v0
.end method

.method public final getMutableInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->mutableInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getNearestRange$foundation_release()Lkotlin/ranges/l;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

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

.method public final getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->pinnedItems:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    return-object v0
.end method

.method public final getPlacementAnimator$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementAnimator:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;

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

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    return-object v0
.end method

.method public final getPrefetchingEnabled$foundation_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    return v0
.end method

.method public final getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    return-object v0
.end method

.method public final getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    return-object v0
.end method

.method public final getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    return-object v0
.end method

.method public final getScrollToBeConsumed$foundation_release()F
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollToBeConsumed:F

    return v0
.end method

.method public final getSlots$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    return-object v0
.end method

.method public final getSpanProvider$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->spanProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    return-object v0
.end method

.method public isScrollInProgress()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    move-result v0

    return v0
.end method

.method public final isVertical$foundation_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->isVertical:Z

    return v0
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
    instance-of v0, p3, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

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
    iget-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 54
    .line 55
    move-object p2, p1

    .line 56
    check-cast p2, Lv3/p;

    .line 57
    .line 58
    iget-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Landroidx/compose/foundation/MutatePriority;

    .line 61
    .line 62
    iget-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

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
    iget-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 74
    .line 75
    iput-object p0, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object p1, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 80
    .line 81
    iput v4, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

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
    iget-object p3, v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scroll$1;->label:I

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

    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollToItem$2;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, p2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$scrollToItem$2;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;IILkotlin/coroutines/d;)V

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

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public final setMeasurePassCount$foundation_release(I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->measurePassCount:I

    return-void
.end method

.method public final setPrefetchingEnabled$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->prefetchingEnabled:Z

    return-void
.end method

.method public final setSlots$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->slots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    return-void
.end method

.method public final setSpanProvider$foundation_release(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;
        .annotation build Lp4/m;
        .end annotation
    .end param

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->spanProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    return-void
.end method

.method public final setVertical$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->isVertical:Z

    return-void
.end method

.method public final snapToItemInternal$foundation_release(Landroidx/compose/foundation/gestures/ScrollScope;II)V
    .locals 2
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResultKt;->findVisibleItem(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->isVertical:Z

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;->getOffset-nOcc-ac()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    :goto_0
    add-int/2addr p2, p3

    .line 29
    int-to-float p2, p2

    .line 30
    invoke-interface {p1, p2}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 35
    .line 36
    invoke-virtual {p1, p2, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->requestPosition(II)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->remeasurement:Landroidx/compose/ui/layout/Remeasurement;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    return-void
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
.end method

.method public final updateScrollPositionIfTheFirstItemWasMoved$foundation_release(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I
    .locals 1
    .param p1    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->scrollPosition:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->updateScrollPositionIfTheFirstItemWasMoved(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I

    move-result-object p1

    return-object p1
.end method
