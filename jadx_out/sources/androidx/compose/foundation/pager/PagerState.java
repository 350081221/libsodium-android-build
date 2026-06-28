package androidx.compose.foundation.pager;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;
import v3.p;

@Stable
@i0(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\t\b\u0002\u0010Ð\u0001\u001a\u00020\u0002¢\u0006\u0005\bØ\u0001\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001a\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0002J\u0012\u0010\u001c\u001a\u00020\u0005*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000bJ\u001f\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00022\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0086@¢\u0006\u0004\b#\u0010$JA\u0010,\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2'\u0010+\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050(\u0012\u0006\u0012\u0004\u0018\u00010)0'¢\u0006\u0002\b*H\u0096@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u00102\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\u000eH\u0000¢\u0006\u0004\b0\u00101J\u000e\u00103\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bJ!\u00109\u001a\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u00020\u000bH\u0000¢\u0006\u0004\b7\u00108R1\u0010B\u001a\u00020:2\u0006\u0010;\u001a\u00020:8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010I\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR+\u0010N\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010=\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010W\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010[\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR\u001e\u0010]\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010XR\u0016\u0010^\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010_R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010c\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u0010X\u001a\u0004\bd\u0010ZR\"\u0010e\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010O\"\u0004\bh\u0010QR\u0016\u0010i\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010XR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010fR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020\b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010=R\"\u0010q\u001a\u00020p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R-\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010Z\"\u0005\b\u007f\u0010\u0080\u0001R0\u0010\u0085\u0001\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010}\u001a\u0005\b\u0083\u0001\u0010Z\"\u0006\b\u0084\u0001\u0010\u0080\u0001R\u001f\u0010\u0089\u0001\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010ZR\u001e\u0010\u001b\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0005\b\u008b\u0001\u0010ZR \u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R7\u0010¡\u0001\u001a\u0005\u0018\u00010\u009b\u00012\t\u0010;\u001a\u0005\u0018\u00010\u009b\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u009c\u0001\u0010=\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R \u0010£\u0001\u001a\u00030¢\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R.\u0010¨\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0005\bª\u0001\u0010?\"\u0005\b«\u0001\u0010AR \u0010\u00ad\u0001\u001a\u00030¬\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R%\u0010²\u0001\u001a\u00030±\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\b²\u0001\u0010=\u001a\u0006\b³\u0001\u0010´\u0001R/\u0010¸\u0001\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bµ\u0001\u0010=\u001a\u0005\b¶\u0001\u0010O\"\u0005\b·\u0001\u0010QR/\u0010¼\u0001\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b¹\u0001\u0010=\u001a\u0005\bº\u0001\u0010O\"\u0005\b»\u0001\u0010QR\u0016\u0010¾\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010ZR\u0014\u0010Á\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010Ã\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010ZR\u0016\u0010Å\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010ZR\u0016\u0010Ç\u0001\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010ZR\u0016\u0010É\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010FR\u0015\u0010Í\u0001\u001a\u00030Ê\u00018F¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0012\u00106\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010ZR\u0013\u0010Ð\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010FR!\u0010Ö\u0001\u001a\u00030Ñ\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÒ\u0001\u0010Ó\u0001*\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010×\u0001\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ù\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "delta", "performScroll", "Lkotlin/r2;", "awaitScrollDependencies", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "tryRunPrefetch", "", "coerceInPageRange", "scrollDelta", "", "isGestureActionMatchesScroll", "isNotGestureAction", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "info", "notifyPrefetch", "cancelPrefetchIfVisibleItemsChanged", "page", "pageOffsetFraction", "scrollToPage", "(IFLkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollScope;", "updateCurrentPage", "targetPage", "updateTargetPage", "offsetFraction", "snapToItem$foundation_release", "(IF)V", "snapToItem", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispatchRawDelta", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V", "applyMeasureResult", "getOffsetFractionForPage", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "currentPage", "matchScrollPositionWithKey$foundation_release", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "matchScrollPositionWithKey", "Landroidx/compose/ui/geometry/Offset;", "<set-?>", "upDownDifference$delegate", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation_release", "()J", "setUpDownDifference-k-4lQ0M$foundation_release", "(J)V", "upDownDifference", "snapRemainingScrollOffset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getSnapRemainingScrollOffset$foundation_release", "()F", "setSnapRemainingScrollOffset$foundation_release", "(F)V", "snapRemainingScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "animatedScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "isScrollingForward$delegate", "isScrollingForward", "()Z", "setScrollingForward", "(Z)V", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/pager/PagerScrollPosition;", "firstVisiblePage", "I", "getFirstVisiblePage$foundation_release", "()I", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation_release", "maxScrollOffset", "accumulator", "F", "previousPassDelta", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "prefetchingEnabled", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "wasPrefetchingForward", "Landroidx/compose/runtime/MutableState;", "pagerLayoutInfoState", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "(I)V", "programmaticScrollTargetPage", "settledPageState$delegate", "getSettledPageState", "setSettledPageState", "settledPageState", "settledPage$delegate", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "targetPage$delegate", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement$delegate", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/unit/Constraints;", "premeasureConstraints", "J", "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "placementScopeInvalidator", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "canScrollForward$delegate", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getPageCount", "pageCount", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation_release", "pageSpacing", "getPageSize$foundation_release", "pageSize", "getPageSizeWithSpacing$foundation_release", "pageSizeWithSpacing", "getPositionThresholdFraction$foundation_release", "positionThresholdFraction", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "getCurrentPageOffsetFraction", "currentPageOffsetFraction", "Lkotlin/ranges/l;", "getNearestRange$foundation_release", "()Lkotlin/ranges/l;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalFoundationApi
@r1({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 5 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,787:1\n81#2:788\n107#2,2:789\n81#2:794\n107#2,2:795\n81#2:815\n81#2:816\n81#2:817\n107#2,2:818\n81#2:820\n81#2:821\n107#2,2:822\n81#2:824\n107#2,2:825\n76#3:791\n109#3,2:792\n772#4,4:797\n772#4,4:801\n772#4,4:805\n772#4,4:827\n772#4,4:832\n75#5:809\n108#5,2:810\n75#5:812\n108#5,2:813\n1#6:831\n495#7,4:836\n500#7:845\n495#7,4:846\n500#7:855\n129#8,5:840\n129#8,5:850\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n154#1:788\n154#1:789,2\n159#1:794\n159#1:795,2\n329#1:815\n346#1:816\n400#1:817\n400#1:818,2\n422#1:820\n586#1:821\n586#1:822,2\n588#1:824\n588#1:825,2\n155#1:791\n155#1:792,2\n192#1:797,4\n212#1:801,4\n220#1:805,4\n598#1:827,4\n613#1:832,4\n317#1:809\n317#1:810,2\n319#1:812\n319#1:813,2\n617#1:836,4\n617#1:845\n715#1:846,4\n715#1:855\n617#1:840,5\n715#1:850,5\n*E\n"})
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private float accumulator;

    @l
    private final LazyLayoutAnimateScrollScope animatedScrollScope;

    @l
    private final AwaitFirstLayoutModifier awaitLayoutModifier;

    @l
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;

    @l
    private final MutableState canScrollBackward$delegate;

    @l
    private final MutableState canScrollForward$delegate;

    @m
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;

    @l
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private int indexToPrefetch;

    @l
    private final MutableInteractionSource internalInteractionSource;

    @l
    private final MutableState isScrollingForward$delegate;
    private int maxScrollOffset;
    private int numMeasurePasses;

    @l
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;

    @l
    private final LazyLayoutPinnedItemList pinnedPages;

    @l
    private final MutableState<r2> placementScopeInvalidator;

    @l
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    @l
    private final MutableIntState programmaticScrollTargetPage$delegate;

    @l
    private final MutableState remeasurement$delegate;

    @l
    private final RemeasurementModifier remeasurementModifier;

    @l
    private final PagerScrollPosition scrollPosition;

    @l
    private final ScrollableState scrollableState;

    @l
    private final State settledPage$delegate;

    @l
    private final MutableIntState settledPageState$delegate;

    @l
    private final MutableFloatState snapRemainingScrollOffset$delegate;

    @l
    private final State targetPage$delegate;

    @l
    private final MutableState upDownDifference$delegate;
    private boolean wasPrefetchingForward;

    public PagerState() {
        this(0, 0.0f, 3, null);
    }

    public PagerState(int i5, float f5) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        double d5 = f5;
        boolean z4 = false;
        if (-0.5d <= d5 && d5 <= 0.5d) {
            z4 = true;
        }
        if (z4) {
            mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(Offset.Companion.m3509getZeroF1C5BW0()), null, 2, null);
            this.upDownDifference$delegate = mutableStateOf$default;
            this.snapRemainingScrollOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            this.animatedScrollScope = PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
            Boolean bool = Boolean.FALSE;
            mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.isScrollingForward$delegate = mutableStateOf$default2;
            PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i5, f5, this);
            this.scrollPosition = pagerScrollPosition;
            this.firstVisiblePage = i5;
            this.maxScrollOffset = Integer.MAX_VALUE;
            this.scrollableState = ScrollableStateKt.ScrollableState(new PagerState$scrollableState$1(this));
            this.prefetchingEnabled = true;
            this.indexToPrefetch = -1;
            this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
            this.density = PagerStateKt.access$getUnitDensity$p();
            this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
            this.programmaticScrollTargetPage$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
            this.settledPageState$delegate = SnapshotIntStateKt.mutableIntStateOf(i5);
            this.settledPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$settledPage$2(this));
            this.targetPage$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new PagerState$targetPage$2(this));
            this.prefetchState = new LazyLayoutPrefetchState();
            this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
            this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
            mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            this.remeasurement$delegate = mutableStateOf$default3;
            this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
                @Override // androidx.compose.ui.layout.RemeasurementModifier
                public void onRemeasurementAvailable(@l Remeasurement remeasurement) {
                    PagerState.this.setRemeasurement(remeasurement);
                }
            };
            this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            this.pinnedPages = new LazyLayoutPinnedItemList();
            pagerScrollPosition.getNearestRangeState();
            this.placementScopeInvalidator = ObservableScopeInvalidator.m724constructorimpl$default(null, 1, null);
            mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.canScrollForward$delegate = mutableStateOf$default4;
            mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
            this.canScrollBackward$delegate = mutableStateOf$default5;
            return;
        }
        throw new IllegalArgumentException(("initialPageOffsetFraction " + f5 + " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i5, float f5, AnimationSpec animationSpec, d dVar, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
            return pagerState.animateScrollToPage(i5, f5, animationSpec, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        pagerState.applyMeasureResult$foundation_release(pagerMeasureResult, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(d<? super r2> dVar) {
        Object l5;
        Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return waitForFirstLayout == l5 ? waitForFirstLayout : r2.f19517a;
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo pagerLayoutInfo) {
        Object y22;
        int index;
        Object m32;
        if (this.indexToPrefetch != -1 && (!pagerLayoutInfo.getVisiblePagesInfo().isEmpty())) {
            if (this.wasPrefetchingForward) {
                m32 = e0.m3(pagerLayoutInfo.getVisiblePagesInfo());
                index = ((PageInfo) m32).getIndex() + pagerLayoutInfo.getBeyondBoundsPageCount() + 1;
            } else {
                y22 = e0.y2(pagerLayoutInfo.getVisiblePagesInfo());
                index = (((PageInfo) y22).getIndex() - pagerLayoutInfo.getBeyondBoundsPageCount()) - 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i5) {
        int I;
        if (getPageCount() <= 0) {
            return 0;
        }
        I = u.I(i5, 0, getPageCount() - 1);
        return I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSettledPageState() {
        return this.settledPageState$delegate.getIntValue();
    }

    private final boolean isGestureActionMatchesScroll(float f5) {
        boolean z4;
        if (getLayoutInfo().getOrientation() != Orientation.Vertical ? Math.signum(f5) == Math.signum(-Offset.m3493getXimpl(m791getUpDownDifferenceF1C5BW0$foundation_release())) : Math.signum(f5) == Math.signum(-Offset.m3494getYimpl(m791getUpDownDifferenceF1C5BW0$foundation_release()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || isNotGestureAction()) {
            return true;
        }
        return false;
    }

    private final boolean isNotGestureAction() {
        return ((int) Offset.m3493getXimpl(m791getUpDownDifferenceF1C5BW0$foundation_release())) == 0 && ((int) Offset.m3494getYimpl(m791getUpDownDifferenceF1C5BW0$foundation_release())) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isScrollingForward() {
        return ((Boolean) this.isScrollingForward$delegate.getValue()).booleanValue();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 2) != 0) {
                Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
                try {
                    Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                    try {
                        int currentPage = pagerState.scrollPosition.getCurrentPage();
                        createNonObservableSnapshot.dispose();
                        i5 = currentPage;
                    } finally {
                        createNonObservableSnapshot.restoreCurrent(makeCurrent);
                    }
                } catch (Throwable th) {
                    createNonObservableSnapshot.dispose();
                    throw th;
                }
            }
            return pagerState.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
    }

    private final void notifyPrefetch(float f5, PagerLayoutInfo pagerLayoutInfo) {
        boolean z4;
        Object y22;
        int index;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        Object m32;
        if (!this.prefetchingEnabled) {
            return;
        }
        boolean z5 = true;
        if (!pagerLayoutInfo.getVisiblePagesInfo().isEmpty()) {
            if (f5 > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                m32 = e0.m3(pagerLayoutInfo.getVisiblePagesInfo());
                index = ((PageInfo) m32).getIndex() + pagerLayoutInfo.getBeyondBoundsPageCount() + 1;
            } else {
                y22 = e0.y2(pagerLayoutInfo.getVisiblePagesInfo());
                index = (((PageInfo) y22).getIndex() - pagerLayoutInfo.getBeyondBoundsPageCount()) - 1;
            }
            if (index != this.indexToPrefetch) {
                if (index < 0 || index >= getPageCount()) {
                    z5 = false;
                }
                if (z5) {
                    if (this.wasPrefetchingForward != z4 && (prefetchHandle = this.currentPrefetchHandle) != null) {
                        prefetchHandle.cancel();
                    }
                    this.wasPrefetchingForward = z4;
                    this.indexToPrefetch = index;
                    this.currentPrefetchHandle = this.prefetchState.m718schedulePrefetch0kLqBqw(index, this.premeasureConstraints);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float f5) {
        float H;
        boolean z4;
        boolean z5;
        int L0;
        float currentScrollOffset = this.scrollPosition.currentScrollOffset();
        float f6 = currentScrollOffset + f5 + this.accumulator;
        H = u.H(f6, 0.0f, this.maxScrollOffset);
        boolean z6 = false;
        if (f6 == H) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z7 = !z4;
        float f7 = H - currentScrollOffset;
        this.previousPassDelta = f7;
        if (Math.abs(f7) == 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            if (f7 > 0.0f) {
                z6 = true;
            }
            setScrollingForward(z6);
        }
        L0 = kotlin.math.d.L0(f7);
        PagerMeasureResult value = this.pagerLayoutInfoState.getValue();
        if (value.tryToApplyScrollWithoutRemeasure(-L0)) {
            applyMeasureResult$foundation_release(value, true);
            ObservableScopeInvalidator.m728invalidateScopeimpl(this.placementScopeInvalidator);
        } else {
            this.scrollPosition.applyScrollDelta(L0);
            Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
            if (remeasurement$foundation_release != null) {
                remeasurement$foundation_release.forceRemeasure();
            }
        }
        this.accumulator = f7 - L0;
        if (z7) {
            return f7;
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object scroll$suspendImpl(androidx.compose.foundation.pager.PagerState r5, androidx.compose.foundation.MutatePriority r6, v3.p<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.d<? super kotlin.r2>, ? extends java.lang.Object> r7, kotlin.coroutines.d<? super kotlin.r2> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.e1.n(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            v3.p r7 = (v3.p) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.foundation.pager.PagerState) r5
            kotlin.e1.n(r8)
            goto L5c
        L4a:
            kotlin.e1.n(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.awaitScrollDependencies(r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            boolean r8 = r5.isScrollInProgress()
            if (r8 != 0) goto L69
            int r8 = r5.getCurrentPage()
            r5.setSettledPageState(r8)
        L69:
            androidx.compose.foundation.gestures.ScrollableState r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.scroll(r6, r7, r0)
            if (r6 != r1) goto L7b
            return r1
        L7b:
            r6 = -1
            r5.setProgrammaticScrollTargetPage(r6)
            kotlin.r2 r5 = kotlin.r2.f19517a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.scroll$suspendImpl(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i5, float f5, d dVar, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i6 & 2) != 0) {
            f5 = 0.0f;
        }
        return pagerState.scrollToPage(i5, f5, dVar);
    }

    private final void setCanScrollBackward(boolean z4) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setCanScrollForward(boolean z4) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setProgrammaticScrollTargetPage(int i5) {
        this.programmaticScrollTargetPage$delegate.setIntValue(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement$delegate.setValue(remeasurement);
    }

    private final void setScrollingForward(boolean z4) {
        this.isScrollingForward$delegate.setValue(Boolean.valueOf(z4));
    }

    private final void setSettledPageState(int i5) {
        this.settledPageState$delegate.setIntValue(i5);
    }

    private final void tryRunPrefetch(PagerMeasureResult pagerMeasureResult) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && isGestureActionMatchesScroll(this.previousPassDelta)) {
                    notifyPrefetch(this.previousPassDelta, pagerMeasureResult);
                }
                r2 r2Var = r2.f19517a;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i5, float f5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i6 & 2) != 0) {
            f5 = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i5, f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateScrollToPage(int r20, float r21, @p4.l androidx.compose.animation.core.AnimationSpec<java.lang.Float> r22, @p4.l kotlin.coroutines.d<? super kotlin.r2> r23) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.animateScrollToPage(int, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.d):java.lang.Object");
    }

    public final void applyMeasureResult$foundation_release(@l PagerMeasureResult pagerMeasureResult, boolean z4) {
        if (z4) {
            this.scrollPosition.updateCurrentPageOffsetFraction(pagerMeasureResult.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.updateFromMeasureResult(pagerMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(pagerMeasureResult);
        }
        this.pagerLayoutInfoState.setValue(pagerMeasureResult);
        setCanScrollForward(pagerMeasureResult.getCanScrollForward());
        setCanScrollBackward(pagerMeasureResult.getCanScrollBackward());
        this.numMeasurePasses++;
        MeasuredPage firstVisiblePage = pagerMeasureResult.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = pagerMeasureResult.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(pagerMeasureResult);
        this.maxScrollOffset = PagerStateKt.access$calculateNewMaxScrollOffset(pagerMeasureResult, getPageCount());
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
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    @l
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.firstVisiblePageOffset;
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
    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    @l
    public final kotlin.ranges.l getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final float getOffsetFractionForPage(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 <= getPageCount()) {
            z4 = true;
        }
        if (z4) {
            return (getCurrentPage() - i5) + getCurrentPageOffsetFraction();
        }
        throw new IllegalArgumentException(("page " + i5 + " is not within the range 0 to " + getPageCount()).toString());
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        return getPageSize$foundation_release() + getPageSpacing$foundation_release();
    }

    public final int getPageSpacing$foundation_release() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    @l
    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.pinnedPages;
    }

    @l
    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<r2> m789getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.density.mo304toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation_release() / 2.0f) / getPageSize$foundation_release();
    }

    @l
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation_release, reason: not valid java name */
    public final long m790getPremeasureConstraintsmsEJaDk$foundation_release() {
        return this.premeasureConstraints;
    }

    @m
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement) this.remeasurement$delegate.getValue();
    }

    @l
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    @l
    public final PagerScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage$delegate.getValue()).intValue();
    }

    public final float getSnapRemainingScrollOffset$foundation_release() {
        return this.snapRemainingScrollOffset$delegate.getFloatValue();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage$delegate.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m791getUpDownDifferenceF1C5BW0$foundation_release() {
        return ((Offset) this.upDownDifference$delegate.getValue()).m3503unboximpl();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(@l PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i5) {
        return this.scrollPosition.matchPageWithKey(pagerLazyLayoutItemProvider, i5);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @m
    public Object scroll(@l MutatePriority mutatePriority, @l p<? super ScrollScope, ? super d<? super r2>, ? extends Object> pVar, @l d<? super r2> dVar) {
        return scroll$suspendImpl(this, mutatePriority, pVar, dVar);
    }

    @m
    public final Object scrollToPage(int i5, float f5, @l d<? super r2> dVar) {
        Object l5;
        Object scroll$default = ScrollableState.scroll$default(this, null, new PagerState$scrollToPage$2(this, f5, i5, null), dVar, 1, null);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return scroll$default == l5 ? scroll$default : r2.f19517a;
    }

    public final void setDensity$foundation_release(@l Density density) {
        this.density = density;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z4) {
        this.prefetchingEnabled = z4;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation_release, reason: not valid java name */
    public final void m792setPremeasureConstraintsBRTryo0$foundation_release(long j5) {
        this.premeasureConstraints = j5;
    }

    public final void setSnapRemainingScrollOffset$foundation_release(float f5) {
        this.snapRemainingScrollOffset$delegate.setFloatValue(f5);
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation_release, reason: not valid java name */
    public final void m793setUpDownDifferencek4lQ0M$foundation_release(long j5) {
        this.upDownDifference$delegate.setValue(Offset.m3482boximpl(j5));
    }

    public final void snapToItem$foundation_release(int i5, float f5) {
        this.scrollPosition.requestPosition(i5, f5);
        Remeasurement remeasurement$foundation_release = getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }

    public final void updateCurrentPage(@l ScrollScope scrollScope, int i5, float f5) {
        this.animatedScrollScope.snapToItem(scrollScope, i5, (int) (f5 * getPageSizeWithSpacing$foundation_release()));
    }

    public final void updateTargetPage(@l ScrollScope scrollScope, int i5) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i5));
    }

    public /* synthetic */ PagerState(int i5, float f5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5, (i6 & 2) != 0 ? 0.0f : f5);
    }
}
