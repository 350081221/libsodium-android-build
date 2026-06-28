.class public abstract Landroidx/compose/foundation/pager/PagerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/ScrollableState;


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\'\u0018\u00002\u00020\u0001B\u001d\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u000b\u0012\t\u0008\u0002\u0010\u00d0\u0001\u001a\u00020\u0002\u00a2\u0006\u0005\u0008\u00d8\u0001\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u000c\u0010\u000c\u001a\u00020\u000b*\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0008\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0002J\u0012\u0010\u001c\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ2\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00022\u000e\u0008\u0002\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00020!H\u0086@\u00a2\u0006\u0004\u0008#\u0010$JA\u0010,\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\'\u0010+\u001a#\u0008\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050(\u0012\u0006\u0012\u0004\u0018\u00010)0\'\u00a2\u0006\u0002\u0008*H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u00102\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010/\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u00080\u00101J\u000e\u00103\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bJ!\u00109\u001a\u00020\u000b2\u0006\u00105\u001a\u0002042\u0008\u0008\u0002\u00106\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u00087\u00108R1\u0010B\u001a\u00020:2\u0006\u0010;\u001a\u00020:8@@@X\u0080\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?\"\u0004\u0008@\u0010AR+\u0010I\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00028@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR+\u0010N\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010=\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR$\u0010W\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR$\u0010[\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008[\u0010X\u001a\u0004\u0008\\\u0010ZR\u001e\u0010]\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0002@BX\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010XR\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008`\u0010_R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR$\u0010c\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008c\u0010X\u001a\u0004\u0008d\u0010ZR\"\u0010e\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010O\"\u0004\u0008h\u0010QR\u0016\u0010i\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008i\u0010XR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u0016\u0010m\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010fR\u001c\u0010o\u001a\u0008\u0012\u0004\u0012\u00020\u00080n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010=R\"\u0010q\u001a\u00020p8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR\u001a\u0010x\u001a\u00020w8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008x\u0010y\u001a\u0004\u0008z\u0010{R-\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0013\n\u0004\u0008|\u0010}\u001a\u0004\u0008~\u0010Z\"\u0005\u0008\u007f\u0010\u0080\u0001R0\u0010\u0085\u0001\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0016\n\u0005\u0008\u0082\u0001\u0010}\u001a\u0005\u0008\u0083\u0001\u0010Z\"\u0006\u0008\u0084\u0001\u0010\u0080\u0001R\u001f\u0010\u0089\u0001\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0005\u0008\u0088\u0001\u0010ZR\u001e\u0010\u001b\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u008a\u0001\u0010\u0087\u0001\u001a\u0005\u0008\u008b\u0001\u0010ZR \u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001R \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R7\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\u0010;\u001a\u0005\u0018\u00010\u009b\u00018@@BX\u0080\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u009c\u0001\u0010=\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001\"\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R \u0010\u00a3\u0001\u001a\u00030\u00a2\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001\u001a\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001R.\u0010\u00a8\u0001\u001a\u00030\u00a7\u00018\u0000@\u0000X\u0080\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0016\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001\u001a\u0005\u0008\u00aa\u0001\u0010?\"\u0005\u0008\u00ab\u0001\u0010AR \u0010\u00ad\u0001\u001a\u00030\u00ac\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R%\u0010\u00b2\u0001\u001a\u00030\u00b1\u00018\u0000X\u0080\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000f\n\u0005\u0008\u00b2\u0001\u0010=\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R/\u0010\u00b8\u0001\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u00b5\u0001\u0010=\u001a\u0005\u0008\u00b6\u0001\u0010O\"\u0005\u0008\u00b7\u0001\u0010QR/\u0010\u00bc\u0001\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\u0008\u00b9\u0001\u0010=\u001a\u0005\u0008\u00ba\u0001\u0010O\"\u0005\u0008\u00bb\u0001\u0010QR\u0016\u0010\u00be\u0001\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00bd\u0001\u0010ZR\u0014\u0010\u00c1\u0001\u001a\u00020\u00118F\u00a2\u0006\u0008\u001a\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u0016\u0010\u00c3\u0001\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c2\u0001\u0010ZR\u0016\u0010\u00c5\u0001\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c4\u0001\u0010ZR\u0016\u0010\u00c7\u0001\u001a\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c6\u0001\u0010ZR\u0016\u0010\u00c9\u0001\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c8\u0001\u0010FR\u0015\u0010\u00cd\u0001\u001a\u00030\u00ca\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001R\u0012\u00106\u001a\u00020\u000b8F\u00a2\u0006\u0007\u001a\u0005\u0008\u00ce\u0001\u0010ZR\u0013\u0010\u00d0\u0001\u001a\u00020\u00028F\u00a2\u0006\u0007\u001a\u0005\u0008\u00cf\u0001\u0010FR!\u0010\u00d6\u0001\u001a\u00030\u00d1\u00018@X\u0080\u0084\u0002\u00a2\u0006\u0010\u001a\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001*\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001R\u0016\u0010\u00d7\u0001\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00d7\u0001\u0010O\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u00d9\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/pager/PagerState;",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "",
        "delta",
        "performScroll",
        "Lkotlin/r2;",
        "awaitScrollDependencies",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/foundation/pager/PagerMeasureResult;",
        "result",
        "tryRunPrefetch",
        "",
        "coerceInPageRange",
        "scrollDelta",
        "",
        "isGestureActionMatchesScroll",
        "isNotGestureAction",
        "Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "info",
        "notifyPrefetch",
        "cancelPrefetchIfVisibleItemsChanged",
        "page",
        "pageOffsetFraction",
        "scrollToPage",
        "(IFLkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/foundation/gestures/ScrollScope;",
        "updateCurrentPage",
        "targetPage",
        "updateTargetPage",
        "offsetFraction",
        "snapToItem$foundation_release",
        "(IF)V",
        "snapToItem",
        "Landroidx/compose/animation/core/AnimationSpec;",
        "animationSpec",
        "animateScrollToPage",
        "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Landroidx/compose/foundation/MutatePriority;",
        "scrollPriority",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/d;",
        "",
        "Lkotlin/u;",
        "block",
        "scroll",
        "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "dispatchRawDelta",
        "visibleItemsStayedTheSame",
        "applyMeasureResult$foundation_release",
        "(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V",
        "applyMeasureResult",
        "getOffsetFractionForPage",
        "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;",
        "itemProvider",
        "currentPage",
        "matchScrollPositionWithKey$foundation_release",
        "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I",
        "matchScrollPositionWithKey",
        "Landroidx/compose/ui/geometry/Offset;",
        "<set-?>",
        "upDownDifference$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "getUpDownDifference-F1C5BW0$foundation_release",
        "()J",
        "setUpDownDifference-k-4lQ0M$foundation_release",
        "(J)V",
        "upDownDifference",
        "snapRemainingScrollOffset$delegate",
        "Landroidx/compose/runtime/MutableFloatState;",
        "getSnapRemainingScrollOffset$foundation_release",
        "()F",
        "setSnapRemainingScrollOffset$foundation_release",
        "(F)V",
        "snapRemainingScrollOffset",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
        "animatedScrollScope",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;",
        "isScrollingForward$delegate",
        "isScrollingForward",
        "()Z",
        "setScrollingForward",
        "(Z)V",
        "Landroidx/compose/foundation/pager/PagerScrollPosition;",
        "scrollPosition",
        "Landroidx/compose/foundation/pager/PagerScrollPosition;",
        "getScrollPosition$foundation_release",
        "()Landroidx/compose/foundation/pager/PagerScrollPosition;",
        "firstVisiblePage",
        "I",
        "getFirstVisiblePage$foundation_release",
        "()I",
        "firstVisiblePageOffset",
        "getFirstVisiblePageOffset$foundation_release",
        "maxScrollOffset",
        "accumulator",
        "F",
        "previousPassDelta",
        "scrollableState",
        "Landroidx/compose/foundation/gestures/ScrollableState;",
        "numMeasurePasses",
        "getNumMeasurePasses$foundation_release",
        "prefetchingEnabled",
        "Z",
        "getPrefetchingEnabled$foundation_release",
        "setPrefetchingEnabled$foundation_release",
        "indexToPrefetch",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "currentPrefetchHandle",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;",
        "wasPrefetchingForward",
        "Landroidx/compose/runtime/MutableState;",
        "pagerLayoutInfoState",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "getDensity$foundation_release",
        "()Landroidx/compose/ui/unit/Density;",
        "setDensity$foundation_release",
        "(Landroidx/compose/ui/unit/Density;)V",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "internalInteractionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "getInternalInteractionSource$foundation_release",
        "()Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "programmaticScrollTargetPage$delegate",
        "Landroidx/compose/runtime/MutableIntState;",
        "getProgrammaticScrollTargetPage",
        "setProgrammaticScrollTargetPage",
        "(I)V",
        "programmaticScrollTargetPage",
        "settledPageState$delegate",
        "getSettledPageState",
        "setSettledPageState",
        "settledPageState",
        "settledPage$delegate",
        "Landroidx/compose/runtime/State;",
        "getSettledPage",
        "settledPage",
        "targetPage$delegate",
        "getTargetPage",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "prefetchState",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "getPrefetchState$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "beyondBoundsInfo",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "getBeyondBoundsInfo$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;",
        "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "awaitLayoutModifier",
        "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "getAwaitLayoutModifier$foundation_release",
        "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;",
        "Landroidx/compose/ui/layout/Remeasurement;",
        "remeasurement$delegate",
        "getRemeasurement$foundation_release",
        "()Landroidx/compose/ui/layout/Remeasurement;",
        "setRemeasurement",
        "(Landroidx/compose/ui/layout/Remeasurement;)V",
        "remeasurement",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "remeasurementModifier",
        "Landroidx/compose/ui/layout/RemeasurementModifier;",
        "getRemeasurementModifier$foundation_release",
        "()Landroidx/compose/ui/layout/RemeasurementModifier;",
        "Landroidx/compose/ui/unit/Constraints;",
        "premeasureConstraints",
        "J",
        "getPremeasureConstraints-msEJaDk$foundation_release",
        "setPremeasureConstraints-BRTryo0$foundation_release",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "pinnedPages",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "getPinnedPages$foundation_release",
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
        "getPageCount",
        "pageCount",
        "getLayoutInfo",
        "()Landroidx/compose/foundation/pager/PagerLayoutInfo;",
        "layoutInfo",
        "getPageSpacing$foundation_release",
        "pageSpacing",
        "getPageSize$foundation_release",
        "pageSize",
        "getPageSizeWithSpacing$foundation_release",
        "pageSizeWithSpacing",
        "getPositionThresholdFraction$foundation_release",
        "positionThresholdFraction",
        "Landroidx/compose/foundation/interaction/InteractionSource;",
        "getInteractionSource",
        "()Landroidx/compose/foundation/interaction/InteractionSource;",
        "interactionSource",
        "getCurrentPage",
        "getCurrentPageOffsetFraction",
        "currentPageOffsetFraction",
        "Lkotlin/ranges/l;",
        "getNearestRange$foundation_release",
        "()Lkotlin/ranges/l;",
        "getNearestRange$foundation_release$delegate",
        "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;",
        "nearestRange",
        "isScrollInProgress",
        "<init>",
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
        "SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,787:1\n81#2:788\n107#2,2:789\n81#2:794\n107#2,2:795\n81#2:815\n81#2:816\n81#2:817\n107#2,2:818\n81#2:820\n81#2:821\n107#2,2:822\n81#2:824\n107#2,2:825\n76#3:791\n109#3,2:792\n772#4,4:797\n772#4,4:801\n772#4,4:805\n772#4,4:827\n772#4,4:832\n75#5:809\n108#5,2:810\n75#5:812\n108#5,2:813\n1#6:831\n495#7,4:836\n500#7:845\n495#7,4:846\n500#7:855\n129#8,5:840\n129#8,5:850\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n154#1:788\n154#1:789,2\n159#1:794\n159#1:795,2\n329#1:815\n346#1:816\n400#1:817\n400#1:818,2\n422#1:820\n586#1:821\n586#1:822,2\n588#1:824\n588#1:825,2\n155#1:791\n155#1:792,2\n192#1:797,4\n212#1:801,4\n220#1:805,4\n598#1:827,4\n613#1:832,4\n317#1:809\n317#1:810,2\n319#1:812\n319#1:813,2\n617#1:836,4\n617#1:845\n715#1:846,4\n715#1:855\n617#1:840,5\n715#1:850,5\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private accumulator:F

.field private final animatedScrollScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;
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

.field private currentPrefetchHandle:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private firstVisiblePage:I

.field private firstVisiblePageOffset:I

.field private indexToPrefetch:I

.field private final internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final isScrollingForward$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private maxScrollOffset:I

.field private numMeasurePasses:I

.field private pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/foundation/pager/PagerMeasureResult;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final pinnedPages:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
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

.field private final prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private prefetchingEnabled:Z

.field private premeasureConstraints:J

.field private previousPassDelta:F

.field private final programmaticScrollTargetPage$delegate:Landroidx/compose/runtime/MutableIntState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final remeasurement$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final settledPage$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final settledPageState$delegate:Landroidx/compose/runtime/MutableIntState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final snapRemainingScrollOffset$delegate:Landroidx/compose/runtime/MutableFloatState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final targetPage$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final upDownDifference$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private wasPrefetchingForward:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Landroidx/compose/foundation/pager/PagerState;-><init>(IFILkotlin/jvm/internal/w;)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    float-to-double v0, p2

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    cmpg-double v2, v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gtz v2, :cond_0

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    cmpg-double v0, v0, v5

    if-gtz v0, :cond_0

    move v3, v4

    :cond_0
    if-eqz v3, :cond_1

    .line 2
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->upDownDifference$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->snapRemainingScrollOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 4
    invoke-static {p0}, Landroidx/compose/foundation/pager/PagerLazyAnimateScrollScopeKt;->PagerLazyAnimateScrollScope(Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->animatedScrollScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    iput-object v3, p0, Landroidx/compose/foundation/pager/PagerState;->isScrollingForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 6
    new-instance v3, Landroidx/compose/foundation/pager/PagerScrollPosition;

    invoke-direct {v3, p1, p2, p0}, Landroidx/compose/foundation/pager/PagerScrollPosition;-><init>(IFLandroidx/compose/foundation/pager/PagerState;)V

    iput-object v3, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 7
    iput p1, p0, Landroidx/compose/foundation/pager/PagerState;->firstVisiblePage:I

    const p2, 0x7fffffff

    .line 8
    iput p2, p0, Landroidx/compose/foundation/pager/PagerState;->maxScrollOffset:I

    .line 9
    new-instance p2, Landroidx/compose/foundation/pager/PagerState$scrollableState$1;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/pager/PagerState$scrollableState$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    invoke-static {p2}, Landroidx/compose/foundation/gestures/ScrollableStateKt;->ScrollableState(Lv3/l;)Landroidx/compose/foundation/gestures/ScrollableState;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 10
    iput-boolean v4, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchingEnabled:Z

    const/4 p2, -0x1

    .line 11
    iput p2, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 12
    invoke-static {}, Landroidx/compose/foundation/pager/PagerStateKt;->getEmptyLayoutInfo()Landroidx/compose/foundation/pager/PagerMeasureResult;

    move-result-object v5

    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->neverEqualPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 13
    invoke-static {}, Landroidx/compose/foundation/pager/PagerStateKt;->access$getUnitDensity$p()Landroidx/compose/foundation/pager/PagerStateKt$UnitDensity$1;

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/foundation/pager/PagerState;->density:Landroidx/compose/ui/unit/Density;

    .line 14
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v5

    iput-object v5, p0, Landroidx/compose/foundation/pager/PagerState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 15
    invoke-static {p2}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object p2

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->programmaticScrollTargetPage$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 16
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->settledPageState$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 17
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object p1

    new-instance p2, Landroidx/compose/foundation/pager/PagerState$settledPage$2;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/pager/PagerState$settledPage$2;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;)Landroidx/compose/runtime/State;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->settledPage$delegate:Landroidx/compose/runtime/State;

    .line 18
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    move-result-object p1

    new-instance p2, Landroidx/compose/foundation/pager/PagerState$targetPage$2;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/pager/PagerState$targetPage$2;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;)Landroidx/compose/runtime/State;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->targetPage$delegate:Landroidx/compose/runtime/State;

    .line 19
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 20
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    .line 21
    new-instance p1, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    .line 22
    invoke-static {v1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->remeasurement$delegate:Landroidx/compose/runtime/MutableState;

    .line 23
    new-instance p1, Landroidx/compose/foundation/pager/PagerState$remeasurementModifier$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/pager/PagerState$remeasurementModifier$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v10, 0x0

    .line 24
    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/compose/foundation/pager/PagerState;->premeasureConstraints:J

    .line 25
    new-instance p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    invoke-direct {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->pinnedPages:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 26
    invoke-virtual {v3}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    .line 27
    invoke-static {v1, v4, v1}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->constructor-impl$default(Landroidx/compose/runtime/MutableState;ILkotlin/jvm/internal/w;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 28
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 29
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

    return-void

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "initialPageOffsetFraction "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is not within the range -0.5 to 0.5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 31
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public synthetic constructor <init>(IFILkotlin/jvm/internal/w;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 32
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerState;-><init>(IF)V

    return-void
.end method

.method public static final synthetic access$awaitScrollDependencies(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->awaitScrollDependencies(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$coerceInPageRange(Landroidx/compose/foundation/pager/PagerState;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->coerceInPageRange(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getProgrammaticScrollTargetPage(Landroidx/compose/foundation/pager/PagerState;)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/pager/PagerState;->getProgrammaticScrollTargetPage()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getSettledPageState(Landroidx/compose/foundation/pager/PagerState;)I
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/pager/PagerState;->getSettledPageState()I

    move-result p0

    return p0
.end method

.method public static final synthetic access$isScrollingForward(Landroidx/compose/foundation/pager/PagerState;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/pager/PagerState;->isScrollingForward()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$performScroll(Landroidx/compose/foundation/pager/PagerState;F)F
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->performScroll(F)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$setRemeasurement(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->setRemeasurement(Landroidx/compose/ui/layout/Remeasurement;)V

    return-void
.end method

.method public static synthetic animateScrollToPage$default(Landroidx/compose/foundation/pager/PagerState;IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p6, :cond_2

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    move p2, v0

    .line 9
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 10
    .line 11
    if-eqz p5, :cond_1

    .line 12
    .line 13
    const/4 p3, 0x7

    .line 14
    const/4 p5, 0x0

    .line 15
    invoke-static {v0, v0, p5, p3, p5}, Landroidx/compose/animation/core/AnimationSpecKt;->spring$default(FFLjava/lang/Object;ILjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/pager/PagerState;->animateScrollToPage(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: animateScrollToPage"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
.end method

.method public static synthetic applyMeasureResult$foundation_release$default(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerMeasureResult;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: applyMeasureResult"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final awaitScrollDependencies(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;->waitForFirstLayout(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method private final cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

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
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerState;->wasPrefetchingForward:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroidx/compose/foundation/pager/PageInfo;

    .line 33
    .line 34
    invoke-interface {v0}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-interface {p1}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeyondBoundsPageCount()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/2addr v0, p1

    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-interface {p1}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroidx/compose/foundation/pager/PageInfo;

    .line 55
    .line 56
    invoke-interface {v0}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-interface {p1}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeyondBoundsPageCount()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    sub-int/2addr v0, p1

    .line 65
    add-int/lit8 v0, v0, -0x1

    .line 66
    .line 67
    :goto_0
    iget p1, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 68
    .line 69
    if-eq p1, v0, :cond_2

    .line 70
    .line 71
    iput v1, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 72
    .line 73
    iget-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->currentPrefetchHandle:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 74
    .line 75
    if-eqz p1, :cond_1

    .line 76
    .line 77
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 78
    .line 79
    .line 80
    :cond_1
    const/4 p1, 0x0

    .line 81
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->currentPrefetchHandle:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 82
    .line 83
    :cond_2
    return-void
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

.method private final coerceInPageRange(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    add-int/lit8 v0, v0, -0x1

    .line 13
    .line 14
    invoke-static {p1, v1, v0}, Lkotlin/ranges/s;->I(III)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :cond_0
    return v1
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

.method private static getNearestRange$foundation_release$delegate(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

    move-result-object p0

    return-object p0
.end method

.method private final getProgrammaticScrollTargetPage()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->programmaticScrollTargetPage$delegate:Landroidx/compose/runtime/MutableIntState;

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

.method private final getSettledPageState()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->settledPageState$delegate:Landroidx/compose/runtime/MutableIntState;

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

.method private final isGestureActionMatchesScroll(F)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getOrientation()Landroidx/compose/foundation/gestures/Orientation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    neg-float v0, v0

    .line 28
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    cmpg-float p1, p1, v0

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    neg-float v0, v0

    .line 50
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    cmpg-float p1, p1, v0

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    :goto_0
    move p1, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move p1, v3

    .line 61
    :goto_1
    if-nez p1, :cond_3

    .line 62
    .line 63
    invoke-direct {p0}, Landroidx/compose/foundation/pager/PagerState;->isNotGestureAction()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move v2, v3

    .line 71
    :cond_3
    :goto_2
    return v2
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

.method private final isNotGestureAction()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getUpDownDifference-F1C5BW0$foundation_release()J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    move-result v0

    float-to-int v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final isScrollingForward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->isScrollingForward$delegate:Landroidx/compose/runtime/MutableState;

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

.method public static synthetic matchScrollPositionWithKey$foundation_release$default(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IILjava/lang/Object;)I
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :try_start_0
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 14
    .line 15
    .line 16
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    :try_start_1
    iget-object p4, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 18
    .line 19
    invoke-virtual {p4}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getCurrentPage()I

    .line 20
    .line 21
    .line 22
    move-result p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    :try_start_2
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 27
    .line 28
    .line 29
    move p2, p4

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    :try_start_3
    invoke-virtual {p2, p3}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 33
    .line 34
    .line 35
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 36
    :catchall_1
    move-exception p0

    .line 37
    invoke-virtual {p2}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_0
    :goto_0
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/pager/PagerState;->matchScrollPositionWithKey$foundation_release(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 47
    .line 48
    const-string p1, "Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
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

.method private final notifyPrefetch(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchingEnabled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {p2}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

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
    const/4 v1, 0x1

    .line 17
    xor-int/2addr v0, v1

    .line 18
    if-eqz v0, :cond_5

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    cmpl-float p1, p1, v0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-lez p1, :cond_1

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p1, v0

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-interface {p2}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lkotlin/collections/u;->m3(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroidx/compose/foundation/pager/PageInfo;

    .line 40
    .line 41
    invoke-interface {v2}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-interface {p2}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeyondBoundsPageCount()I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    add-int/2addr v2, p2

    .line 50
    add-int/2addr v2, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-interface {p2}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getVisiblePagesInfo()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lkotlin/collections/u;->y2(Ljava/util/List;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Landroidx/compose/foundation/pager/PageInfo;

    .line 61
    .line 62
    invoke-interface {v2}, Landroidx/compose/foundation/pager/PageInfo;->getIndex()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-interface {p2}, Landroidx/compose/foundation/pager/PagerLayoutInfo;->getBeyondBoundsPageCount()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    sub-int/2addr v2, p2

    .line 71
    sub-int/2addr v2, v1

    .line 72
    :goto_1
    iget p2, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 73
    .line 74
    if-eq v2, p2, :cond_5

    .line 75
    .line 76
    if-ltz v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-ge v2, p2, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v1, v0

    .line 86
    :goto_2
    if-eqz v1, :cond_5

    .line 87
    .line 88
    iget-boolean p2, p0, Landroidx/compose/foundation/pager/PagerState;->wasPrefetchingForward:Z

    .line 89
    .line 90
    if-eq p2, p1, :cond_4

    .line 91
    .line 92
    iget-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->currentPrefetchHandle:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;->cancel()V

    .line 97
    .line 98
    .line 99
    :cond_4
    iput-boolean p1, p0, Landroidx/compose/foundation/pager/PagerState;->wasPrefetchingForward:Z

    .line 100
    .line 101
    iput v2, p0, Landroidx/compose/foundation/pager/PagerState;->indexToPrefetch:I

    .line 102
    .line 103
    iget-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    .line 104
    .line 105
    iget-wide v0, p0, Landroidx/compose/foundation/pager/PagerState;->premeasureConstraints:J

    .line 106
    .line 107
    invoke-virtual {p1, v2, v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;->schedulePrefetch-0kLqBqw(IJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->currentPrefetchHandle:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;

    .line 112
    .line 113
    :cond_5
    return-void
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

.method private final performScroll(F)F
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->currentScrollOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    add-float v1, v0, p1

    .line 9
    .line 10
    iget v2, p0, Landroidx/compose/foundation/pager/PagerState;->accumulator:F

    .line 11
    .line 12
    add-float/2addr v1, v2

    .line 13
    iget v2, p0, Landroidx/compose/foundation/pager/PagerState;->maxScrollOffset:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v1, v3, v2}, Lkotlin/ranges/s;->H(FFF)F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    cmpg-float v1, v1, v2

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    move v1, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v4

    .line 30
    :goto_0
    xor-int/2addr v1, v5

    .line 31
    sub-float/2addr v2, v0

    .line 32
    iput v2, p0, Landroidx/compose/foundation/pager/PagerState;->previousPassDelta:F

    .line 33
    .line 34
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    cmpg-float v0, v0, v3

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    move v0, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v0, v4

    .line 45
    :goto_1
    if-nez v0, :cond_3

    .line 46
    .line 47
    cmpl-float v0, v2, v3

    .line 48
    .line 49
    if-lez v0, :cond_2

    .line 50
    .line 51
    move v4, v5

    .line 52
    :cond_2
    invoke-direct {p0, v4}, Landroidx/compose/foundation/pager/PagerState;->setScrollingForward(Z)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-static {v2}, Lkotlin/math/b;->L0(F)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 60
    .line 61
    invoke-interface {v3}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Landroidx/compose/foundation/pager/PagerMeasureResult;

    .line 66
    .line 67
    neg-int v4, v0

    .line 68
    invoke-virtual {v3, v4}, Landroidx/compose/foundation/pager/PagerMeasureResult;->tryToApplyScrollWithoutRemeasure(I)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    invoke-virtual {p0, v3, v5}, Landroidx/compose/foundation/pager/PagerState;->applyMeasureResult$foundation_release(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    .line 78
    .line 79
    invoke-static {v3}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->invalidateScope-impl(Landroidx/compose/runtime/MutableState;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    iget-object v3, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->applyScrollDelta(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    invoke-interface {v3}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 95
    .line 96
    .line 97
    :cond_5
    :goto_2
    int-to-float v0, v0

    .line 98
    sub-float v0, v2, v0

    .line 99
    .line 100
    iput v0, p0, Landroidx/compose/foundation/pager/PagerState;->accumulator:F

    .line 101
    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    move p1, v2

    .line 105
    :cond_6
    return p1
    .line 106
.end method

.method static synthetic scroll$suspendImpl(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
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

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/pager/PagerState$scroll$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/compose/foundation/pager/PagerState$scroll$1;-><init>(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->label:I

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
    iget-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Landroidx/compose/foundation/pager/PagerState;

    .line 44
    .line 45
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$2:Ljava/lang/Object;

    .line 58
    .line 59
    move-object p2, p0

    .line 60
    check-cast p2, Lv3/p;

    .line 61
    .line 62
    iget-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    move-object p1, p0

    .line 65
    check-cast p1, Landroidx/compose/foundation/MutatePriority;

    .line 66
    .line 67
    iget-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Landroidx/compose/foundation/pager/PagerState;

    .line 70
    .line 71
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    invoke-static {p3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p1, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p2, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$2:Ljava/lang/Object;

    .line 83
    .line 84
    iput v4, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->label:I

    .line 85
    .line 86
    invoke-direct {p0, v0}, Landroidx/compose/foundation/pager/PagerState;->awaitScrollDependencies(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    if-ne p3, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->isScrollInProgress()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-nez p3, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-direct {p0, p3}, Landroidx/compose/foundation/pager/PagerState;->setSettledPageState(I)V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget-object p3, p0, Landroidx/compose/foundation/pager/PagerState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    .line 107
    .line 108
    iput-object p0, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    iput-object v2, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v2, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    iput v3, v0, Landroidx/compose/foundation/pager/PagerState$scroll$1;->label:I

    .line 116
    .line 117
    invoke-interface {p3, p1, p2, v0}, Landroidx/compose/foundation/gestures/ScrollableState;->scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v1, :cond_6

    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_6
    :goto_2
    const/4 p1, -0x1

    .line 125
    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->setProgrammaticScrollTargetPage(I)V

    .line 126
    .line 127
    .line 128
    sget-object p0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 129
    .line 130
    return-object p0
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
.end method

.method public static synthetic scrollToPage$default(Landroidx/compose/foundation/pager/PagerState;IFLkotlin/coroutines/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/pager/PagerState;->scrollToPage(IFLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: scrollToPage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final setCanScrollBackward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setCanScrollForward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setProgrammaticScrollTargetPage(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->programmaticScrollTargetPage$delegate:Landroidx/compose/runtime/MutableIntState;

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

.method private final setRemeasurement(Landroidx/compose/ui/layout/Remeasurement;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->remeasurement$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setScrollingForward(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->isScrollingForward$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setSettledPageState(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->settledPageState$delegate:Landroidx/compose/runtime/MutableIntState;

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

.method private final tryRunPrefetch(Landroidx/compose/foundation/pager/PagerMeasureResult;)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    iget v2, p0, Landroidx/compose/foundation/pager/PagerState;->previousPassDelta:F

    .line 12
    .line 13
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/high16 v3, 0x3f000000    # 0.5f

    .line 18
    .line 19
    cmpl-float v2, v2, v3

    .line 20
    .line 21
    if-lez v2, :cond_0

    .line 22
    .line 23
    iget-boolean v2, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchingEnabled:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget v2, p0, Landroidx/compose/foundation/pager/PagerState;->previousPassDelta:F

    .line 28
    .line 29
    invoke-direct {p0, v2}, Landroidx/compose/foundation/pager/PagerState;->isGestureActionMatchesScroll(F)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iget v2, p0, Landroidx/compose/foundation/pager/PagerState;->previousPassDelta:F

    .line 36
    .line 37
    invoke-direct {p0, v2, p1}, Landroidx/compose/foundation/pager/PagerState;->notifyPrefetch(FLandroidx/compose/foundation/pager/PagerLayoutInfo;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    :try_start_2
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_3
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 51
    .line 52
    .line 53
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 56
    .line 57
    .line 58
    throw p1
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

.method public static synthetic updateCurrentPage$default(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/ScrollScope;IFILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/pager/PagerState;->updateCurrentPage(Landroidx/compose/foundation/gestures/ScrollScope;IF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateCurrentPage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final animateScrollToPage(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 19
    .param p3    # Landroidx/compose/animation/core/AnimationSpec;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IF",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
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
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    instance-of v4, v3, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;

    .line 15
    .line 16
    iget v5, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->label:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->label:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;-><init>(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/d;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->result:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->label:I

    .line 40
    .line 41
    const/4 v7, 0x2

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x1

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    if-eq v6, v9, :cond_2

    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget v1, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->F$0:F

    .line 64
    .line 65
    iget v2, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->I$0:I

    .line 66
    .line 67
    iget-object v6, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, Landroidx/compose/animation/core/AnimationSpec;

    .line 70
    .line 71
    iget-object v10, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Landroidx/compose/foundation/pager/PagerState;

    .line 74
    .line 75
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v15, v6

    .line 79
    move-object v11, v10

    .line 80
    move/from16 v18, v2

    .line 81
    .line 82
    move v2, v1

    .line 83
    move/from16 v1, v18

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v3}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ne v1, v3, :cond_5

    .line 94
    .line 95
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPageOffsetFraction()F

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    cmpg-float v3, v3, v2

    .line 100
    .line 101
    if-nez v3, :cond_4

    .line 102
    .line 103
    move v3, v9

    .line 104
    goto :goto_1

    .line 105
    :cond_4
    move v3, v8

    .line 106
    :goto_1
    if-nez v3, :cond_6

    .line 107
    .line 108
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_7

    .line 113
    .line 114
    :cond_6
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_7
    iput-object v0, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    move-object/from16 v3, p3

    .line 120
    .line 121
    iput-object v3, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput v1, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->I$0:I

    .line 124
    .line 125
    iput v2, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->F$0:F

    .line 126
    .line 127
    iput v9, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->label:I

    .line 128
    .line 129
    invoke-direct {v0, v4}, Landroidx/compose/foundation/pager/PagerState;->awaitScrollDependencies(Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    if-ne v6, v5, :cond_8

    .line 134
    .line 135
    return-object v5

    .line 136
    :cond_8
    move-object v11, v0

    .line 137
    move-object v15, v3

    .line 138
    :goto_2
    float-to-double v12, v2

    .line 139
    const-wide/high16 v16, -0x4020000000000000L    # -0.5

    .line 140
    .line 141
    cmpg-double v3, v16, v12

    .line 142
    .line 143
    if-gtz v3, :cond_9

    .line 144
    .line 145
    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    .line 146
    .line 147
    cmpg-double v3, v12, v16

    .line 148
    .line 149
    if-gtz v3, :cond_9

    .line 150
    .line 151
    move v8, v9

    .line 152
    :cond_9
    if-eqz v8, :cond_b

    .line 153
    .line 154
    invoke-direct {v11, v1}, Landroidx/compose/foundation/pager/PagerState;->coerceInPageRange(I)I

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    invoke-virtual {v11}, Landroidx/compose/foundation/pager/PagerState;->getPageSizeWithSpacing$foundation_release()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    int-to-float v1, v1

    .line 163
    mul-float/2addr v2, v1

    .line 164
    invoke-static {v2}, Lkotlin/math/b;->L0(F)I

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    iget-object v1, v11, Landroidx/compose/foundation/pager/PagerState;->animatedScrollScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 169
    .line 170
    new-instance v2, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;

    .line 171
    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    move-object v10, v2

    .line 175
    move-object v13, v1

    .line 176
    invoke-direct/range {v10 .. v16}, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$3$1;-><init>(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)V

    .line 177
    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    iput-object v3, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$0:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v3, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->L$1:Ljava/lang/Object;

    .line 183
    .line 184
    iput v7, v4, Landroidx/compose/foundation/pager/PagerState$animateScrollToPage$1;->label:I

    .line 185
    .line 186
    invoke-interface {v1, v2, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->scroll(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-ne v1, v5, :cond_a

    .line 191
    .line 192
    return-object v5

    .line 193
    :cond_a
    :goto_3
    sget-object v1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 194
    .line 195
    return-object v1

    .line 196
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v3, "pageOffsetFraction "

    .line 202
    .line 203
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    const-string v2, " is not within the range -0.5 to 0.5"

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v2
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
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
.end method

.method public final applyMeasureResult$foundation_release(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/pager/PagerMeasureResult;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getCurrentPageOffsetFraction()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p2, v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->updateCurrentPageOffsetFraction(F)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Landroidx/compose/foundation/pager/PagerScrollPosition;->updateFromMeasureResult(Landroidx/compose/foundation/pager/PagerMeasureResult;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->cancelPrefetchIfVisibleItemsChanged(Landroidx/compose/foundation/pager/PagerLayoutInfo;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p2, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    .line 22
    .line 23
    invoke-interface {p2, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getCanScrollForward()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-direct {p0, p2}, Landroidx/compose/foundation/pager/PagerState;->setCanScrollForward(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getCanScrollBackward()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-direct {p0, p2}, Landroidx/compose/foundation/pager/PagerState;->setCanScrollBackward(Z)V

    .line 38
    .line 39
    .line 40
    iget p2, p0, Landroidx/compose/foundation/pager/PagerState;->numMeasurePasses:I

    .line 41
    .line 42
    add-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    iput p2, p0, Landroidx/compose/foundation/pager/PagerState;->numMeasurePasses:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getFirstVisiblePage()Landroidx/compose/foundation/pager/MeasuredPage;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p2}, Landroidx/compose/foundation/pager/MeasuredPage;->getIndex()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput p2, p0, Landroidx/compose/foundation/pager/PagerState;->firstVisiblePage:I

    .line 57
    .line 58
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getFirstVisiblePageScrollOffset()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    iput p2, p0, Landroidx/compose/foundation/pager/PagerState;->firstVisiblePageOffset:I

    .line 63
    .line 64
    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->tryRunPrefetch(Landroidx/compose/foundation/pager/PagerMeasureResult;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p1, p2}, Landroidx/compose/foundation/pager/PagerStateKt;->access$calculateNewMaxScrollOffset(Landroidx/compose/foundation/pager/PagerMeasureResult;I)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iput p1, p0, Landroidx/compose/foundation/pager/PagerState;->maxScrollOffset:I

    .line 76
    .line 77
    return-void
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

.method public dispatchRawDelta(F)F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0, p1}, Landroidx/compose/foundation/gestures/ScrollableState;->dispatchRawDelta(F)F

    move-result p1

    return p1
.end method

.method public final getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->awaitLayoutModifier:Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    return-object v0
.end method

.method public final getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->beyondBoundsInfo:Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    return-object v0
.end method

.method public final getCanScrollBackward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollBackward$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final getCanScrollForward()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->canScrollForward$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final getCurrentPage()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getCurrentPage()I

    move-result v0

    return v0
.end method

.method public final getCurrentPageOffsetFraction()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getCurrentPageOffsetFraction()F

    move-result v0

    return v0
.end method

.method public final getDensity$foundation_release()Landroidx/compose/ui/unit/Density;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->density:Landroidx/compose/ui/unit/Density;

    return-object v0
.end method

.method public final getFirstVisiblePage$foundation_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerState;->firstVisiblePage:I

    return v0
.end method

.method public final getFirstVisiblePageOffset$foundation_release()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/pager/PagerState;->firstVisiblePageOffset:I

    return v0
.end method

.method public final getInteractionSource()Landroidx/compose/foundation/interaction/InteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->internalInteractionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    return-object v0
.end method

.method public final getLayoutInfo()Landroidx/compose/foundation/pager/PagerLayoutInfo;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/pager/PagerLayoutInfo;

    return-object v0
.end method

.method public final getNearestRange$foundation_release()Lkotlin/ranges/l;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerScrollPosition;->getNearestRangeState()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;

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

    iget v0, p0, Landroidx/compose/foundation/pager/PagerState;->numMeasurePasses:I

    return v0
.end method

.method public final getOffsetFractionForPage(I)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-gt p1, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    :cond_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPage()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v0, p1

    .line 18
    int-to-float p1, v0

    .line 19
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getCurrentPageOffsetFraction()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-float/2addr p1, v0

    .line 24
    return p1

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "page "

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not within the range 0 to "

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageCount()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
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

.method public abstract getPageCount()I
.end method

.method public final getPageSize$foundation_release()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/pager/PagerMeasureResult;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getPageSize()I

    move-result v0

    return v0
.end method

.method public final getPageSizeWithSpacing$foundation_release()I
    .locals 2

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    move-result v0

    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageSpacing$foundation_release()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getPageSpacing$foundation_release()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->pagerLayoutInfoState:Landroidx/compose/runtime/MutableState;

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/pager/PagerMeasureResult;

    invoke-virtual {v0}, Landroidx/compose/foundation/pager/PagerMeasureResult;->getPageSpacing()I

    move-result v0

    return v0
.end method

.method public final getPinnedPages$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->pinnedPages:Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

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

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    return-object v0
.end method

.method public final getPositionThresholdFraction$foundation_release()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->density:Landroidx/compose/ui/unit/Density;

    .line 2
    .line 3
    invoke-static {}, Landroidx/compose/foundation/pager/PagerStateKt;->getDefaultPositionThreshold()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    int-to-float v1, v1

    .line 16
    const/high16 v2, 0x40000000    # 2.0f

    .line 17
    .line 18
    div-float/2addr v1, v2

    .line 19
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageSize$foundation_release()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    int-to-float v1, v1

    .line 28
    div-float/2addr v0, v1

    .line 29
    return v0
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

.method public final getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchState:Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    return-object v0
.end method

.method public final getPrefetchingEnabled$foundation_release()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchingEnabled:Z

    return v0
.end method

.method public final getPremeasureConstraints-msEJaDk$foundation_release()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/pager/PagerState;->premeasureConstraints:J

    return-wide v0
.end method

.method public final getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->remeasurement$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/layout/Remeasurement;

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

.method public final getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->remeasurementModifier:Landroidx/compose/ui/layout/RemeasurementModifier;

    return-object v0
.end method

.method public final getScrollPosition$foundation_release()Landroidx/compose/foundation/pager/PagerScrollPosition;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    return-object v0
.end method

.method public final getSettledPage()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->settledPage$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

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

.method public final getSnapRemainingScrollOffset$foundation_release()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->snapRemainingScrollOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

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

.method public final getTargetPage()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->targetPage$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

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

.method public final getUpDownDifference-F1C5BW0$foundation_release()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->upDownDifference$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/geometry/Offset;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public isScrollInProgress()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollableState:Landroidx/compose/foundation/gestures/ScrollableState;

    invoke-interface {v0}, Landroidx/compose/foundation/gestures/ScrollableState;->isScrollInProgress()Z

    move-result v0

    return v0
.end method

.method public final matchScrollPositionWithKey$foundation_release(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I
    .locals 1
    .param p1    # Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;
        .annotation build Lp4/l;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/pager/PagerScrollPosition;->matchPageWithKey(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I

    move-result p1

    return p1
.end method

.method public scroll(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/pager/PagerState;->scroll$suspendImpl(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final scrollToPage(IFLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 6
    .param p3    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IF",
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

    new-instance v2, Landroidx/compose/foundation/pager/PagerState$scrollToPage$2;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p2, p1, v0}, Landroidx/compose/foundation/pager/PagerState$scrollToPage$2;-><init>(Landroidx/compose/foundation/pager/PagerState;FILkotlin/coroutines/d;)V

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

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerState;->density:Landroidx/compose/ui/unit/Density;

    return-void
.end method

.method public final setPrefetchingEnabled$foundation_release(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/pager/PagerState;->prefetchingEnabled:Z

    return-void
.end method

.method public final setPremeasureConstraints-BRTryo0$foundation_release(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/pager/PagerState;->premeasureConstraints:J

    return-void
.end method

.method public final setSnapRemainingScrollOffset$foundation_release(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->snapRemainingScrollOffset$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

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

.method public final setUpDownDifference-k-4lQ0M$foundation_release(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->upDownDifference$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

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

.method public final snapToItem$foundation_release(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->scrollPosition:Landroidx/compose/foundation/pager/PagerScrollPosition;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/pager/PagerScrollPosition;->requestPosition(IF)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getRemeasurement$foundation_release()Landroidx/compose/ui/layout/Remeasurement;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/layout/Remeasurement;->forceRemeasure()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
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

.method public final updateCurrentPage(Landroidx/compose/foundation/gestures/ScrollScope;IF)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/pager/PagerState;->getPageSizeWithSpacing$foundation_release()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr p3, v0

    .line 7
    float-to-int p3, p3

    .line 8
    iget-object v0, p0, Landroidx/compose/foundation/pager/PagerState;->animatedScrollScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;->snapToItem(Landroidx/compose/foundation/gestures/ScrollScope;II)V

    .line 11
    .line 12
    .line 13
    return-void
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
.end method

.method public final updateTargetPage(Landroidx/compose/foundation/gestures/ScrollScope;I)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/gestures/ScrollScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p2}, Landroidx/compose/foundation/pager/PagerState;->coerceInPageRange(I)I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/pager/PagerState;->setProgrammaticScrollTargetPage(I)V

    return-void
.end method
