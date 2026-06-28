package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text2.input.internal.TextLayoutStateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.comparisons.g;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;
import v3.p;
import v3.r;
import v3.t;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b$\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\f\u001a\u00020\u0002*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\tH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u000e*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0002J\"\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010$\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0002J\u0019\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u00101\u001a\u00020\u0012H\u0000¢\u0006\u0004\b/\u00100J;\u00109\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020&06052\u0006\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010<\u001a\u00020\u0019H\u0000¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020\u0019H\u0000¢\u0006\u0004\b=\u0010;J\u0011\u0010B\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010E\u001a\u00020\u0002H\u0000¢\u0006\u0004\bC\u0010DJ\u0006\u0010F\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020\u0019J4\u0010M\u001a\u00020\u00192\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010J\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ2\u0010M\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020\u0019H\u0001¢\u0006\u0004\bP\u0010;J\u0018\u0010T\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00190X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZRF\u0010]\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00020\t2\u0014\u0010\\\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010d\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010k\u001a\u0004\u0018\u00010j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR$\u0010r\u001a\u0004\u0018\u00010q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R0\u0010\u0084\u0001\u001a\u00020\u00192\u0006\u0010\u007f\u001a\u00020\u00198F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\b\u0080\u0001\u0010Z\u001a\u0005\b\u0081\u0001\u0010;\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001f\u0010J\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bJ\u0010\u0085\u0001R5\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u00100\"\u0006\b\u008a\u0001\u0010\u008b\u0001R6\u0010\u0090\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\n8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u008c\u0001\u0010Z\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010SR6\u0010\u0094\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\n8@@BX\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u0091\u0001\u0010Z\u001a\u0006\b\u0092\u0001\u0010\u008e\u0001\"\u0005\b\u0093\u0001\u0010SR;\u0010\u009a\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u007f\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u0095\u0001\u0010Z\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R;\u0010\u009e\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u007f\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b\u009b\u0001\u0010Z\u001a\u0006\b\u009c\u0001\u0010\u0097\u0001\"\u0006\b\u009d\u0001\u0010\u0099\u0001R7\u0010¥\u0001\u001a\u0005\u0018\u00010\u009f\u00012\t\u0010\u007f\u001a\u0005\u0018\u00010\u009f\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b \u0001\u0010Z\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R;\u0010©\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u007f\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\b¦\u0001\u0010Z\u001a\u0006\b§\u0001\u0010\u0097\u0001\"\u0006\b¨\u0001\u0010\u0099\u0001R2\u0010ª\u0001\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b°\u0001\u0010D\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R1\u0010±\u0001\u001a\u00020\u00192\u0007\u0010\u0086\u0001\u001a\u00020\u00198\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0005\b³\u0001\u0010;\"\u0006\b´\u0001\u0010\u0083\u0001R\u0016\u0010¶\u0001\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010;R.\u0010»\u0001\u001a\u0004\u0018\u00010&2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010&8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R)\u0010¼\u0001\u001a\u00020\u00192\u0007\u0010\u0086\u0001\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b¼\u0001\u0010;\"\u0006\b½\u0001\u0010\u0083\u0001R\u0014\u0010À\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Ã\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionManager;", "", "Lkotlin/r2;", "updateHandleOffsets", "toolbarCopy", "updateSelectionToolbar", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onTap", "detectNonConsumingTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "block", "onClearSelectionRequested", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", TypedValues.CycleType.S_WAVE_OFFSET, "convertToContainerCoordinates-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "convertToContainerCoordinates", "position", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "startSelection-9KIMszo", "(JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "startSelection", "previousHandlePosition", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getSelectionLayout-Wko1d7g", "(JJZ)Landroidx/compose/foundation/text/selection/SelectionLayout;", "getSelectionLayout", "selectionLayout", "Landroidx/compose/foundation/text/selection/Selection;", "newSelection", "selectionChanged", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "anchor", "Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable$foundation_release", "(Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;)Landroidx/compose/foundation/text/selection/Selectable;", "getAnchorSelectable", "requireContainerCoordinates$foundation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "requireContainerCoordinates", "", "selectableId", "previousSelection", "Lkotlin/u0;", "", "selectAll$foundation_release", "(JLandroidx/compose/foundation/text/selection/Selection;)Lkotlin/u0;", "selectAll", "isTriviallyCollapsedSelection$foundation_release", "()Z", "isTriviallyCollapsedSelection", "isNonEmptySelection$foundation_release", "isNonEmptySelection", "Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getSelectedText", "copy$foundation_release", "()V", "copy", "onRelease", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "newPosition", "previousPosition", "updateSelection-qNKwrvQ$foundation_release", "(Landroidx/compose/ui/geometry/Offset;JZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "updateSelection", "updateSelection-jyLRC_s$foundation_release", "(JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Z", "shouldPerformHaptics$foundation_release", "shouldPerformHaptics", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/runtime/MutableState;", "_selection", "Landroidx/compose/runtime/MutableState;", "_isInTouchMode", "newOnSelectionChange", "onSelectionChange", "Lv3/l;", "getOnSelectionChange", "()Lv3/l;", "setOnSelectionChange", "(Lv3/l;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "<set-?>", "hasFocus$delegate", "getHasFocus", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/geometry/Offset;", t0.b.f22420d, "containerLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerLayoutCoordinates", "setContainerLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "dragBeginPosition$delegate", "getDragBeginPosition-F1C5BW0$foundation_release", "()J", "setDragBeginPosition-k-4lQ0M", "dragBeginPosition", "dragTotalDistance$delegate", "getDragTotalDistance-F1C5BW0$foundation_release", "setDragTotalDistance-k-4lQ0M", "dragTotalDistance", "startHandlePosition$delegate", "getStartHandlePosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setStartHandlePosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "startHandlePosition", "endHandlePosition$delegate", "getEndHandlePosition-_m7T9-E", "setEndHandlePosition-_kEHs6E", "endHandlePosition", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "getPreviousSelectionLayout$foundation_release", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "setPreviousSelectionLayout$foundation_release", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)V", "getPreviousSelectionLayout$foundation_release$annotations", "showToolbar", "Z", "getShowToolbar$foundation_release", "setShowToolbar$foundation_release", "getShouldShowMagnifier", "shouldShowMagnifier", "getSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "setSelection", "(Landroidx/compose/foundation/text/selection/Selection;)V", "selection", "isInTouchMode", "setInTouchMode", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,991:1\n81#2:992\n107#2,2:993\n81#2:995\n107#2,2:996\n81#2:998\n107#2,2:999\n81#2:1001\n107#2,2:1002\n81#2:1004\n107#2,2:1005\n81#2:1007\n107#2,2:1008\n81#2:1010\n107#2,2:1011\n1#3:1013\n1#3:1049\n256#4,3:1014\n33#4,4:1017\n259#4,2:1021\n38#4:1023\n261#4:1024\n101#4,2:1025\n33#4,6:1027\n103#4:1033\n33#4,6:1035\n416#4,3:1041\n33#4,4:1044\n419#4:1048\n420#4:1050\n38#4:1051\n421#4:1052\n69#4,6:1053\n33#4,6:1059\n101#4,2:1065\n33#4,6:1067\n103#4:1073\n1099#5:1034\n*S KotlinDebug\n*F\n+ 1 SelectionManager.kt\nandroidx/compose/foundation/text/selection/SelectionManager\n*L\n138#1:992\n138#1:993,2\n188#1:995\n188#1:996,2\n195#1:998\n195#1:999,2\n204#1:1001\n204#1:1002,2\n213#1:1004\n213#1:1005,2\n220#1:1007\n220#1:1008,2\n227#1:1010\n227#1:1011,2\n537#1:1049\n412#1:1014,3\n412#1:1017,4\n412#1:1021,2\n412#1:1023\n412#1:1024\n457#1:1025,2\n457#1:1027,6\n457#1:1033\n470#1:1035,6\n537#1:1041,3\n537#1:1044,4\n537#1:1048\n537#1:1050\n537#1:1051\n537#1:1052\n787#1:1053,6\n804#1:1059,6\n821#1:1065,2\n821#1:1067,6\n821#1:1073\n469#1:1034\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;

    @l
    private final MutableState<Boolean> _isInTouchMode;

    @l
    private final MutableState<Selection> _selection;

    @m
    private ClipboardManager clipboardManager;

    @m
    private LayoutCoordinates containerLayoutCoordinates;

    @l
    private final MutableState currentDragPosition$delegate;

    @l
    private final MutableState dragBeginPosition$delegate;

    @l
    private final MutableState dragTotalDistance$delegate;

    @l
    private final MutableState draggingHandle$delegate;

    @l
    private final MutableState endHandlePosition$delegate;

    @l
    private FocusRequester focusRequester;

    @m
    private HapticFeedback hapticFeedBack;

    @l
    private final MutableState hasFocus$delegate;

    @l
    private v3.l<? super Selection, r2> onSelectionChange;

    @m
    private Offset previousPosition;

    @m
    private SelectionLayout previousSelectionLayout;

    @l
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;

    @l
    private final MutableState startHandlePosition$delegate;

    @m
    private TextToolbar textToolbar;

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends n0 implements v3.l<Long, r2> {
        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j5))) {
                SelectionManager.this.updateHandleOffsets();
                SelectionManager.this.updateSelectionToolbar();
            }
        }
    }

    @i0(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isInTouchMode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "rawPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "selectionMode", "Lkotlin/r2;", "invoke-Rg1IO4c", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends n0 implements r<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, r2> {
        AnonymousClass2() {
            super(4);
        }

        @Override // v3.r
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, SelectionAdjustment selectionAdjustment) {
            m1026invokeRg1IO4c(bool.booleanValue(), layoutCoordinates, offset.m3503unboximpl(), selectionAdjustment);
            return r2.f19517a;
        }

        /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
        public final void m1026invokeRg1IO4c(boolean z4, @l LayoutCoordinates layoutCoordinates, long j5, @l SelectionAdjustment selectionAdjustment) {
            long mo5005getSizeYbymL2g = layoutCoordinates.mo5005getSizeYbymL2g();
            Rect rect = new Rect(0.0f, 0.0f, IntSize.m6214getWidthimpl(mo5005getSizeYbymL2g), IntSize.m6213getHeightimpl(mo5005getSizeYbymL2g));
            if (!SelectionManagerKt.m1031containsInclusiveUv8p0NA(rect, j5)) {
                j5 = TextLayoutStateKt.m1136coerceIn3MmeM6k(j5, rect);
            }
            long m1010convertToContainerCoordinatesR5De75A = SelectionManager.this.m1010convertToContainerCoordinatesR5De75A(layoutCoordinates, j5);
            if (OffsetKt.m3512isSpecifiedk4lQ0M(m1010convertToContainerCoordinatesR5De75A)) {
                SelectionManager.this.setInTouchMode(z4);
                SelectionManager.this.m1017startSelection9KIMszo(m1010convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                SelectionManager.this.getFocusRequester().requestFocus();
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isInTouchMode", "", "selectableId", "Lkotlin/r2;", "invoke", "(ZJ)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends n0 implements p<Boolean, Long, r2> {
        AnonymousClass3() {
            super(2);
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Boolean bool, Long l5) {
            invoke(bool.booleanValue(), l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(boolean z4, long j5) {
            SelectionManager selectionManager = SelectionManager.this;
            u0<Selection, Map<Long, Selection>> selectAll$foundation_release = selectionManager.selectAll$foundation_release(j5, selectionManager.getSelection());
            Selection component1 = selectAll$foundation_release.component1();
            Map<Long, Selection> component2 = selectAll$foundation_release.component2();
            if (!l0.g(component1, SelectionManager.this.getSelection())) {
                SelectionManager.this.selectionRegistrar.setSubselections(component2);
                SelectionManager.this.getOnSelectionChange().invoke(component1);
            }
            SelectionManager.this.setInTouchMode(z4);
            SelectionManager.this.getFocusRequester().requestFocus();
            SelectionManager.this.setShowToolbar$foundation_release(false);
        }
    }

    @i0(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "isInTouchMode", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "newPosition", "Landroidx/compose/ui/geometry/Offset;", "previousPosition", "isStartHandle", "selectionMode", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "invoke-pGV3PM0", "(ZLandroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends n0 implements t<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> {
        AnonymousClass4() {
            super(6);
        }

        @Override // v3.t
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, LayoutCoordinates layoutCoordinates, Offset offset, Offset offset2, Boolean bool2, SelectionAdjustment selectionAdjustment) {
            return m1027invokepGV3PM0(bool.booleanValue(), layoutCoordinates, offset.m3503unboximpl(), offset2.m3503unboximpl(), bool2.booleanValue(), selectionAdjustment);
        }

        @l
        /* renamed from: invoke-pGV3PM0, reason: not valid java name */
        public final Boolean m1027invokepGV3PM0(boolean z4, @l LayoutCoordinates layoutCoordinates, long j5, long j6, boolean z5, @l SelectionAdjustment selectionAdjustment) {
            long m1010convertToContainerCoordinatesR5De75A = SelectionManager.this.m1010convertToContainerCoordinatesR5De75A(layoutCoordinates, j5);
            long m1010convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m1010convertToContainerCoordinatesR5De75A(layoutCoordinates, j6);
            SelectionManager.this.setInTouchMode(z4);
            return Boolean.valueOf(SelectionManager.this.m1025updateSelectionqNKwrvQ$foundation_release(Offset.m3482boximpl(m1010convertToContainerCoordinatesR5De75A), m1010convertToContainerCoordinatesR5De75A2, z5, selectionAdjustment));
        }
    }

    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends n0 implements v3.a<r2> {
        AnonymousClass5() {
            super(0);
        }

        @Override // v3.a
        public /* bridge */ /* synthetic */ r2 invoke() {
            invoke2();
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SelectionManager.this.setShowToolbar$foundation_release(true);
            SelectionManager.this.setDraggingHandle(null);
            SelectionManager.this.m1012setCurrentDragPosition_kEHs6E(null);
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableKey", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends n0 implements v3.l<Long, r2> {
        AnonymousClass6() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
            if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j5))) {
                SelectionManager.this.onRelease();
                SelectionManager.this.setSelection(null);
            }
        }
    }

    @i0(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectableId", "Lkotlin/r2;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$7, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass7 extends n0 implements v3.l<Long, r2> {
        AnonymousClass7() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Long l5) {
            invoke(l5.longValue());
            return r2.f19517a;
        }

        public final void invoke(long j5) {
            Selection.AnchorInfo end;
            Selection.AnchorInfo start;
            Selection selection = SelectionManager.this.getSelection();
            if ((selection == null || (start = selection.getStart()) == null || j5 != start.getSelectableId()) ? false : true) {
                SelectionManager.this.m1016setStartHandlePosition_kEHs6E(null);
            }
            Selection selection2 = SelectionManager.this.getSelection();
            if ((selection2 == null || (end = selection2.getEnd()) == null || j5 != end.getSelectableId()) ? false : true) {
                SelectionManager.this.m1015setEndHandlePosition_kEHs6E(null);
            }
            if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(Long.valueOf(j5))) {
                SelectionManager.this.updateSelectionToolbar();
            }
        }
    }

    public SelectionManager(@l SelectionRegistrarImpl selectionRegistrarImpl) {
        MutableState<Selection> mutableStateOf$default;
        MutableState<Boolean> mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        this.selectionRegistrar = selectionRegistrarImpl;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this._selection = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this._isInTouchMode = mutableStateOf$default2;
        this.onSelectionChange = new SelectionManager$onSelectionChange$1(this);
        this.focusRequester = new FocusRequester();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default3;
        Offset.Companion companion = Offset.Companion;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(companion.m3509getZeroF1C5BW0()), null, 2, null);
        this.dragBeginPosition$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(companion.m3509getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.startHandlePosition$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default8;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default9;
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new AnonymousClass1());
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new AnonymousClass2());
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new AnonymousClass3());
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new AnonymousClass4());
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new AnonymousClass5());
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new AnonymousClass6());
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m1010convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j5) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        if (layoutCoordinates2 != null && layoutCoordinates2.isAttached()) {
            return requireContainerCoordinates$foundation_release().mo5006localPositionOfR5De75A(layoutCoordinates, j5);
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectNonConsumingTap(PointerInputScope pointerInputScope, v3.l<? super Offset, r2> lVar, kotlin.coroutines.d<? super r2> dVar) {
        Object l5;
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new SelectionManager$detectNonConsumingTap$2(lVar, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitEachGesture == l5 ? awaitEachGesture : r2.f19517a;
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        List firstAndLast;
        Rect rect;
        u0 u0Var;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(sort.size());
        int size = sort.size();
        for (int i5 = 0; i5 < size; i5++) {
            Selectable selectable = sort.get(i5);
            Selection selection = this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId()));
            if (selection != null) {
                u0Var = q1.a(selectable, selection);
            } else {
                u0Var = null;
            }
            if (u0Var != null) {
                arrayList.add(u0Var);
            }
        }
        firstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (firstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(firstAndLast, layoutCoordinates);
        rect = SelectionManagerKt.invertedInfiniteRect;
        if (l0.g(selectedRegionRect, rect)) {
            return null;
        }
        Rect intersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (intersect.getWidth() < 0.0f || intersect.getHeight() < 0.0f) {
            return null;
        }
        return Rect.copy$default(intersect.m3530translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates)), 0.0f, 0.0f, 0.0f, intersect.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m1011getSelectionLayoutWko1d7g(long j5, long j6, boolean z4) {
        Selection selection;
        LayoutCoordinates requireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = sort.size();
        for (int i5 = 0; i5 < size; i5++) {
            linkedHashMap.put(Long.valueOf(sort.get(i5).getSelectableId()), Integer.valueOf(i5));
        }
        Comparator comparator = new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t6) {
                int l5;
                l5 = g.l((Comparable) linkedHashMap.get(Long.valueOf(((Number) t5).longValue())), (Comparable) linkedHashMap.get(Long.valueOf(((Number) t6).longValue())));
                return l5;
            }
        };
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(j6)) {
            selection = null;
        } else {
            selection = getSelection();
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j5, j6, requireContainerCoordinates$foundation_release, z4, selection, comparator, null);
        int size2 = sort.size();
        for (int i6 = 0; i6 < size2; i6++) {
            sort.get(i6).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return (getDraggingHandle() == null || !isInTouchMode() || isTriviallyCollapsedSelection$foundation_release()) ? false : true;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, v3.a<r2> aVar) {
        return getHasFocus() ? SuspendingPointerInputFilterKt.pointerInput(modifier, r2.f19517a, new SelectionManager$onClearSelectionRequested$1(this, aVar, null)) : modifier;
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1012setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m1013setDragBeginPositionk4lQ0M(long j5) {
        this.dragBeginPosition$delegate.setValue(Offset.m3482boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m1014setDragTotalDistancek4lQ0M(long j5) {
        this.dragTotalDistance$delegate.setValue(Offset.m3482boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1015setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m1016setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m1017startSelection9KIMszo(long j5, boolean z4, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m1024updateSelectionjyLRC_s$foundation_release(j5, Offset.Companion.m3508getUnspecifiedF1C5BW0(), z4, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r5 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateHandleOffsets() {
        /*
            r13 = this;
            androidx.compose.foundation.text.selection.Selection r0 = r13.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r1 = r13.containerLayoutCoordinates
            r2 = 0
            if (r0 == 0) goto L14
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r0.getStart()
            if (r3 == 0) goto L14
            androidx.compose.foundation.text.selection.Selectable r3 = r13.getAnchorSelectable$foundation_release(r3)
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 == 0) goto L22
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r0.getEnd()
            if (r4 == 0) goto L22
            androidx.compose.foundation.text.selection.Selectable r4 = r13.getAnchorSelectable$foundation_release(r4)
            goto L23
        L22:
            r4 = r2
        L23:
            if (r3 == 0) goto L2a
            androidx.compose.ui.layout.LayoutCoordinates r5 = r3.getLayoutCoordinates()
            goto L2b
        L2a:
            r5 = r2
        L2b:
            if (r4 == 0) goto L32
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L33
        L32:
            r6 = r2
        L33:
            if (r0 == 0) goto Laa
            if (r1 == 0) goto Laa
            boolean r7 = r1.isAttached()
            if (r7 == 0) goto Laa
            if (r5 != 0) goto L43
            if (r6 != 0) goto L43
            goto Laa
        L43:
            androidx.compose.ui.geometry.Rect r7 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r1)
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L77
            long r10 = r3.mo980getHandlePositiondBAh8RU(r0, r9)
            boolean r3 = androidx.compose.ui.geometry.OffsetKt.m3514isUnspecifiedk4lQ0M(r10)
            if (r3 == 0) goto L56
            goto L77
        L56:
            long r10 = r1.mo5006localPositionOfR5De75A(r5, r10)
            androidx.compose.ui.geometry.Offset r3 = androidx.compose.ui.geometry.Offset.m3482boximpl(r10)
            long r10 = r3.m3503unboximpl()
            androidx.compose.foundation.text.Handle r5 = r13.getDraggingHandle()
            androidx.compose.foundation.text.Handle r12 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r5 == r12) goto L73
            boolean r5 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1031containsInclusiveUv8p0NA(r7, r10)
            if (r5 == 0) goto L71
            goto L73
        L71:
            r5 = r8
            goto L74
        L73:
            r5 = r9
        L74:
            if (r5 == 0) goto L77
            goto L78
        L77:
            r3 = r2
        L78:
            r13.m1016setStartHandlePosition_kEHs6E(r3)
            if (r6 == 0) goto La6
            long r3 = r4.mo980getHandlePositiondBAh8RU(r0, r8)
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m3514isUnspecifiedk4lQ0M(r3)
            if (r0 == 0) goto L88
            goto La6
        L88:
            long r0 = r1.mo5006localPositionOfR5De75A(r6, r3)
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m3482boximpl(r0)
            long r3 = r0.m3503unboximpl()
            androidx.compose.foundation.text.Handle r1 = r13.getDraggingHandle()
            androidx.compose.foundation.text.Handle r5 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r1 == r5) goto La2
            boolean r1 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1031containsInclusiveUv8p0NA(r7, r3)
            if (r1 == 0) goto La3
        La2:
            r8 = r9
        La3:
            if (r8 == 0) goto La6
            r2 = r0
        La6:
            r13.m1015setEndHandlePosition_kEHs6E(r2)
            return
        Laa:
            r13.m1016setStartHandlePosition_kEHs6E(r2)
            r13.m1015setEndHandlePosition_kEHs6E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (!getHasFocus() || (textToolbar = this.textToolbar) == null) {
            return;
        }
        if (this.showToolbar && isInTouchMode() && isNonEmptySelection$foundation_release()) {
            Rect contentRect = getContentRect();
            if (contentRect == null) {
                return;
            }
            TextToolbar.showMenu$default(textToolbar, contentRect, new SelectionManager$updateSelectionToolbar$1(this), null, null, null, 28, null);
            return;
        }
        if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
            textToolbar.hide();
        }
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1018contextMenuOpenAdjustmentk4lQ0M(long j5) {
        boolean z4;
        Selection selection = getSelection();
        if (selection != null) {
            z4 = TextRange.m5539getCollapsedimpl(selection.m986toTextRanged9O1mEE());
        } else {
            z4 = true;
        }
        if (z4) {
            m1017startSelection9KIMszo(j5, true, SelectionAdjustment.Companion.getWord());
        }
    }

    public final void copy$foundation_release() {
        ClipboardManager clipboardManager;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (!(selectedText$foundation_release.length() > 0)) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (clipboardManager = this.clipboardManager) == null) {
                return;
            }
            clipboardManager.setText(selectedText$foundation_release);
        }
    }

    @m
    public final Selectable getAnchorSelectable$foundation_release(@l Selection.AnchorInfo anchorInfo) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(anchorInfo.getSelectableId()));
    }

    @m
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @m
    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1019getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1020getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m3503unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m1021getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m3503unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1022getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    @l
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    @m
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @l
    public final Modifier getModifier() {
        Modifier modifier = Modifier.Companion;
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifier, new SelectionManager$modifier$1(this)), new SelectionManager$modifier$2(this)), this.focusRequester), new SelectionManager$modifier$3(this)), false, null, 3, null), new SelectionManager$modifier$4(this)), new SelectionManager$modifier$5(this));
        if (getShouldShowMagnifier()) {
            modifier = SelectionManager_androidKt.selectionMagnifier(modifier, this);
        }
        return onKeyEvent.then(modifier);
    }

    @l
    public final v3.l<Selection, r2> getOnSelectionChange() {
        return this.onSelectionChange;
    }

    @m
    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.previousSelectionLayout;
    }

    @m
    public final AnnotatedString getSelectedText$foundation_release() {
        AnnotatedString subSequence;
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i5 = 0; i5 < size; i5++) {
            Selectable selectable = sort.get(i5);
            Selection selection = this.selectionRegistrar.getSubselections().get(Long.valueOf(selectable.getSelectableId()));
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                if (selection.getHandlesCrossed()) {
                    subSequence = text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset());
                } else {
                    subSequence = text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset());
                }
                builder.append(subSequence);
            }
        }
        return builder.toAnnotatedString();
    }

    @m
    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.showToolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m1023getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    @m
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @l
    public final TextDragObserver handleDragObserver(final boolean z4) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager$handleDragObserver$1
            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m1012setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo895onDownk4lQ0M(long j5) {
                Offset m1022getEndHandlePosition_m7T9E;
                Selection.AnchorInfo end;
                LayoutCoordinates layoutCoordinates;
                Handle handle;
                if (z4) {
                    m1022getEndHandlePosition_m7T9E = this.m1023getStartHandlePosition_m7T9E();
                } else {
                    m1022getEndHandlePosition_m7T9E = this.m1022getEndHandlePosition_m7T9E();
                }
                if (m1022getEndHandlePosition_m7T9E != null) {
                    m1022getEndHandlePosition_m7T9E.m3503unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    if (z4) {
                        end = selection.getStart();
                    } else {
                        end = selection.getEnd();
                    }
                    Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(end);
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long mo980getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo980getHandlePositiondBAh8RU(selection, z4);
                    if (OffsetKt.m3514isUnspecifiedk4lQ0M(mo980getHandlePositiondBAh8RU)) {
                        return;
                    }
                    long m994getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(mo980getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m1012setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo5006localPositionOfR5De75A(layoutCoordinates, m994getAdjustedCoordinatesk4lQ0M)));
                    SelectionManager selectionManager2 = this;
                    if (z4) {
                        handle = Handle.SelectionStart;
                    } else {
                        handle = Handle.SelectionEnd;
                    }
                    selectionManager2.setDraggingHandle(handle);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo896onDragk4lQ0M(long j5) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m1014setDragTotalDistancek4lQ0M(Offset.m3498plusMKHz9U(selectionManager.m1021getDragTotalDistanceF1C5BW0$foundation_release(), j5));
                long m3498plusMKHz9U = Offset.m3498plusMKHz9U(this.m1020getDragBeginPositionF1C5BW0$foundation_release(), this.m1021getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m1025updateSelectionqNKwrvQ$foundation_release(Offset.m3482boximpl(m3498plusMKHz9U), this.m1020getDragBeginPositionF1C5BW0$foundation_release(), z4, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    this.m1013setDragBeginPositionk4lQ0M(m3498plusMKHz9U);
                    this.m1014setDragTotalDistancek4lQ0M(Offset.Companion.m3509getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo897onStartk4lQ0M(long j5) {
                Selection.AnchorInfo end;
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                l0.m(selection);
                if (z4) {
                    end = selection.getStart();
                } else {
                    end = selection.getEnd();
                }
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get(Long.valueOf(end.getSelectableId()));
                if (selectable != null) {
                    Selectable selectable2 = selectable;
                    LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long mo980getHandlePositiondBAh8RU = selectable2.mo980getHandlePositiondBAh8RU(selection, z4);
                        if (OffsetKt.m3514isUnspecifiedk4lQ0M(mo980getHandlePositiondBAh8RU)) {
                            return;
                        }
                        long m994getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(mo980getHandlePositiondBAh8RU);
                        SelectionManager selectionManager = this;
                        selectionManager.m1013setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo5006localPositionOfR5De75A(layoutCoordinates, m994getAdjustedCoordinatesk4lQ0M));
                        this.m1014setDragTotalDistancek4lQ0M(Offset.Companion.m3509getZeroF1C5BW0());
                        return;
                    }
                    throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
                }
                throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        boolean z4;
        Selection selection = getSelection();
        if (selection == null || l0.g(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        for (int i5 = 0; i5 < size; i5++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(Long.valueOf(sort.get(i5).getSelectableId()));
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return l0.g(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        Map<Long, Selection> z4;
        HapticFeedback hapticFeedback;
        SelectionRegistrarImpl selectionRegistrarImpl = this.selectionRegistrar;
        z4 = a1.z();
        selectionRegistrarImpl.setSubselections(z4);
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (isInTouchMode() && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
            }
        }
    }

    @l
    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.isAttached()) {
                return layoutCoordinates;
            }
            throw new IllegalArgumentException("unattached coordinates".toString());
        }
        throw new IllegalArgumentException("null coordinates".toString());
    }

    @l
    public final u0<Selection, Map<Long, Selection>> selectAll$foundation_release(long j5, @m Selection selection) {
        HapticFeedback hapticFeedback;
        Selection selection2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Selectable> sort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = sort.size();
        Selection selection3 = null;
        for (int i5 = 0; i5 < size; i5++) {
            Selectable selectable = sort.get(i5);
            if (selectable.getSelectableId() == j5) {
                selection2 = selectable.getSelectAllSelection();
            } else {
                selection2 = null;
            }
            if (selection2 != null) {
                linkedHashMap.put(Long.valueOf(selectable.getSelectableId()), selection2);
            }
            selection3 = SelectionManagerKt.merge(selection3, selection2);
        }
        if (isInTouchMode() && !l0.g(selection3, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
        }
        return new u0<>(selection3, linkedHashMap);
    }

    public final void setClipboardManager(@m ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setContainerLayoutCoordinates(@m LayoutCoordinates layoutCoordinates) {
        Offset offset;
        this.containerLayoutCoordinates = layoutCoordinates;
        if (getHasFocus() && getSelection() != null) {
            if (layoutCoordinates != null) {
                offset = Offset.m3482boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates));
            } else {
                offset = null;
            }
            if (!l0.g(this.previousPosition, offset)) {
                this.previousPosition = offset;
                updateHandleOffsets();
                updateSelectionToolbar();
            }
        }
    }

    public final void setFocusRequester(@l FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@m HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z4) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setInTouchMode(boolean z4) {
        if (this._isInTouchMode.getValue().booleanValue() != z4) {
            this._isInTouchMode.setValue(Boolean.valueOf(z4));
            updateSelectionToolbar();
        }
    }

    public final void setOnSelectionChange(@l v3.l<? super Selection, r2> lVar) {
        this.onSelectionChange = new SelectionManager$onSelectionChange$2(this, lVar);
    }

    public final void setPreviousSelectionLayout$foundation_release(@m SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(@m Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z4) {
        this.showToolbar = z4;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(@m TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    @VisibleForTesting
    public final boolean shouldPerformHaptics$foundation_release() {
        boolean z4;
        boolean z5;
        if (!isInTouchMode()) {
            return false;
        }
        List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
        int size = selectables$foundation_release.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (selectables$foundation_release.get(i5).getText().length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z4 = true;
                    break;
                }
                i5++;
            } else {
                z4 = false;
                break;
            }
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m1024updateSelectionjyLRC_s$foundation_release(long j5, long j6, boolean z4, @l SelectionAdjustment selectionAdjustment) {
        Handle handle;
        if (z4) {
            handle = Handle.SelectionStart;
        } else {
            handle = Handle.SelectionEnd;
        }
        setDraggingHandle(handle);
        m1012setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(j5));
        SelectionLayout m1011getSelectionLayoutWko1d7g = m1011getSelectionLayoutWko1d7g(j5, j6, z4);
        if (!m1011getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection adjust = selectionAdjustment.adjust(m1011getSelectionLayoutWko1d7g);
        if (!l0.g(adjust, getSelection())) {
            selectionChanged(m1011getSelectionLayoutWko1d7g, adjust);
        }
        this.previousSelectionLayout = m1011getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m1025updateSelectionqNKwrvQ$foundation_release(@m Offset offset, long j5, boolean z4, @l SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m1024updateSelectionjyLRC_s$foundation_release(offset.m3503unboximpl(), j5, z4, selectionAdjustment);
    }
}
