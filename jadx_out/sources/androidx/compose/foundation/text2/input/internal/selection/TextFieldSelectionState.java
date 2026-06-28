package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text2.input.internal.TextLayoutState;
import androidx.compose.foundation.text2.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text2.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010B\u001a\u00020\u000e\u0012\u0006\u0010C\u001a\u00020\u000e\u0012\u0006\u0010Z\u001a\u00020\u000e¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0082@¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\t\u001a\u00020\u0003*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u0002H\u0082@¢\u0006\u0004\b\u000b\u0010\u0005J\"\u0010\f\u001a\u00020\u0003*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0014\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002ø\u0001\u0001¢\u0006\u0004\b \u0010!J\b\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0015H\u0002J\b\u0010'\u001a\u00020\u0003H\u0002JG\u00103\u001a\u0002002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J<\u00109\u001a\u0002002\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\b\u00106\u001a\u0004\u0018\u0001002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0001¢\u0006\u0004\b7\u00108J6\u0010D\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eJ\u0014\u0010E\u001a\u00020\u0003*\u00020\u0002H\u0086@¢\u0006\u0004\bE\u0010\u0005J0\u0010F\u001a\u00020\u0003*\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086@¢\u0006\u0004\bF\u0010\nJ\u001c\u0010G\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bG\u0010\u0011J\u0010\u0010H\u001a\u00020\u0003H\u0086@¢\u0006\u0004\bH\u0010\u0013J\u000e\u0010K\u001a\u00020\u00032\u0006\u0010J\u001a\u00020IJ\u0006\u0010L\u001a\u00020\u0003J\u0006\u0010M\u001a\u00020\u0003J\u0010\u0010O\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u000eJ\u0006\u0010P\u001a\u00020\u0003J\u0006\u0010Q\u001a\u00020\u0003R\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010XR\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010YR\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010YR\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010^R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010_R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010`R+\u0010d\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u000e8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010[\"\u0004\be\u0010]R1\u0010k\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u00198B@BX\u0082\u008e\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\bf\u0010c\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR1\u0010o\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u00198B@BX\u0082\u008e\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\bl\u0010c\u001a\u0004\bm\u0010h\"\u0004\bn\u0010jR/\u0010u\u001a\u0004\u0018\u00010\u001d2\b\u0010a\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010c\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR+\u0010y\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010c\u001a\u0004\bw\u0010[\"\u0004\bx\u0010]R+\u0010J\u001a\u00020I2\u0006\u0010a\u001a\u00020I8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010c\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0088\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\u008b\u0001\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0085\u0001\u001a\u0005\b\u008a\u0001\u0010[R \u0010\u008f\u0001\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0085\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R \u0010\u0092\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0085\u0001\u001a\u0006\b\u0091\u0001\u0010\u0087\u0001R \u0010\u0095\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0085\u0001\u001a\u0006\b\u0094\u0001\u0010\u0087\u0001R\u001c\u0010\u0097\u0001\u001a\u00020\u00198BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010hR\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010[R\u0019\u0010\u009f\u0001\u001a\u00020\u00198Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010h\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/r2;", "detectTouchMode", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function0;", "requestFocus", "showKeyboard", "detectTextFieldTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "detectCursorHandleDragGestures", "detectTextFieldLongPressAndAfterDrag", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "isStartHandle", "detectSelectionHandleDragGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "observeTextChanges", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "observeTextToolbarVisibility", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "getSelectionHandleState", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-tuRUvjQ", "(Z)J", "getHandlePosition", "Landroidx/compose/foundation/text/Handle;", "handle", "position", "updateHandleDragging-Uv8p0NA", "(Landroidx/compose/foundation/text/Handle;J)V", "updateHandleDragging", "markStartContentVisibleOffset", "clearHandleDragging", "contentRect", "showTextToolbar", "hideTextToolbar", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "textFieldCharSequence", "", "startOffset", "endOffset", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "allowPreviousSelectionCollapsed", "Landroidx/compose/ui/text/TextRange;", "updateSelection-QNhciaU", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateSelection", "rawStartOffset", "rawEndOffset", "previousSelection", "getTextFieldSelection-qeG_v_k", "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J", "getTextFieldSelection", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/unit/Density;", "density", "enabled", "readOnly", "update", "cursorHandleGestures", "textFieldGestures", "selectionHandleGestures", "observeChanges", "Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "textToolbarState", "updateTextToolbarState", "dispose", "cut", "cancelSelection", "copy", "paste", "deselect", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Landroidx/compose/ui/unit/Density;", "Z", "isFocused", "()Z", "setFocused", "(Z)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroidx/compose/ui/platform/ClipboardManager;", "<set-?>", "isInTouchMode$delegate", "Landroidx/compose/runtime/MutableState;", "isInTouchMode", "setInTouchMode", "startContentVisibleOffset$delegate", "getStartContentVisibleOffset-F1C5BW0", "()J", "setStartContentVisibleOffset-k-4lQ0M", "(J)V", "startContentVisibleOffset", "rawHandleDragPosition$delegate", "getRawHandleDragPosition-F1C5BW0", "setRawHandleDragPosition-k-4lQ0M", "rawHandleDragPosition", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "textToolbarState$delegate", "getTextToolbarState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;", "setTextToolbarState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousRawDragOffset", "I", "cursorHandle$delegate", "Landroidx/compose/runtime/State;", "getCursorHandle", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;", "cursorHandle", "cursorHandleInBounds$delegate", "getCursorHandleInBounds", "cursorHandleInBounds", "cursorRect$delegate", "getCursorRect", "()Landroidx/compose/ui/geometry/Rect;", "cursorRect", "startSelectionHandle$delegate", "getStartSelectionHandle", "startSelectionHandle", "endSelectionHandle$delegate", "getEndSelectionHandle", "endSelectionHandle", "getCurrentContentVisibleOffset-F1C5BW0", "currentContentVisibleOffset", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getTextLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "textLayoutCoordinates", "getEditable", "editable", "getHandleDragPosition-F1C5BW0", "handleDragPosition", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n81#2:1236\n107#2,2:1237\n81#2:1239\n107#2,2:1240\n81#2:1242\n107#2,2:1243\n81#2:1245\n107#2,2:1246\n81#2:1248\n107#2,2:1249\n81#2:1251\n107#2,2:1252\n81#2:1255\n81#2:1256\n81#2:1257\n81#2:1258\n81#2:1259\n1#3:1254\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n*L\n99#1:1236\n99#1:1237,2\n110#1:1239\n110#1:1240,2\n132#1:1242\n132#1:1243,2\n164#1:1245\n164#1:1246,2\n169#1:1248\n169#1:1249,2\n175#1:1251\n175#1:1252,2\n206#1:1255\n239#1:1256\n254#1:1257\n285#1:1258\n289#1:1259\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;

    @m
    private ClipboardManager clipboardManager;

    @l
    private final State cursorHandle$delegate;

    @l
    private final State cursorHandleInBounds$delegate;

    @l
    private final State cursorRect$delegate;

    @l
    private Density density;

    @l
    private final MutableState draggingHandle$delegate;
    private boolean enabled;

    @l
    private final State endSelectionHandle$delegate;

    @m
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;

    @l
    private final MutableState isInTouchMode$delegate;
    private int previousRawDragOffset;

    @m
    private SelectionLayout previousSelectionLayout;

    @l
    private final MutableState rawHandleDragPosition$delegate;
    private boolean readOnly;

    @l
    private final MutableState showCursorHandle$delegate;

    @l
    private final MutableState startContentVisibleOffset$delegate;

    @l
    private final State startSelectionHandle$delegate;

    @l
    private final TransformedTextFieldState textFieldState;

    @l
    private final TextLayoutState textLayoutState;

    @m
    private TextToolbar textToolbar;

    @l
    private final MutableState textToolbarState$delegate;

    public TextFieldSelectionState(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l Density density, boolean z4, boolean z5, boolean z6) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.enabled = z4;
        this.readOnly = z5;
        this.isFocused = z6;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isInTouchMode$delegate = mutableStateOf$default;
        Offset.Companion companion = Offset.Companion;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(companion.m3508getUnspecifiedF1C5BW0()), null, 2, null);
        this.startContentVisibleOffset$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3482boximpl(companion.m3508getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.textToolbarState$delegate = mutableStateOf$default6;
        this.previousRawDragOffset = -1;
        this.cursorHandle$delegate = SnapshotStateKt.derivedStateOf(new TextFieldSelectionState$cursorHandle$2(this));
        this.cursorHandleInBounds$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TextFieldSelectionState$cursorHandleInBounds$2(this));
        this.cursorRect$delegate = SnapshotStateKt.derivedStateOf(new TextFieldSelectionState$cursorRect$2(this));
        this.startSelectionHandle$delegate = SnapshotStateKt.derivedStateOf(new TextFieldSelectionState$startSelectionHandle$2(this));
        this.endSelectionHandle$delegate = SnapshotStateKt.derivedStateOf(new TextFieldSelectionState$endSelectionHandle$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.Companion;
        m1174setRawHandleDragPositionk4lQ0M(companion.m3508getUnspecifiedF1C5BW0());
        m1175setStartContentVisibleOffsetk4lQ0M(companion.m3508getUnspecifiedF1C5BW0());
    }

    public static /* synthetic */ void copy$default(TextFieldSelectionState textFieldSelectionState, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        textFieldSelectionState.copy(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r10, kotlin.coroutines.d<? super kotlin.r2> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r9, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 != r2) goto L38
            java.lang.Object r10 = r6.L$2
            kotlin.jvm.internal.k1$g r10 = (kotlin.jvm.internal.k1.g) r10
            java.lang.Object r0 = r6.L$1
            kotlin.jvm.internal.k1$g r0 = (kotlin.jvm.internal.k1.g) r0
            java.lang.Object r1 = r6.L$0
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r1 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) r1
            kotlin.e1.n(r11)     // Catch: java.lang.Throwable -> L36
            goto L86
        L36:
            r11 = move-exception
            goto L91
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            kotlin.e1.n(r11)
            kotlin.jvm.internal.k1$g r11 = new kotlin.jvm.internal.k1$g
            r11.<init>()
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r3 = r1.m3508getUnspecifiedF1C5BW0()
            r11.element = r3
            kotlin.jvm.internal.k1$g r7 = new kotlin.jvm.internal.k1$g
            r7.<init>()
            long r3 = r1.m3508getUnspecifiedF1C5BW0()
            r7.element = r3
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r3 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r11, r9, r7)     // Catch: java.lang.Throwable -> L8c
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r4 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L8c
            r4.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8c
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r5 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L8c
            r5.<init>(r11, r7, r9)     // Catch: java.lang.Throwable -> L8c
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r8 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L8c
            r8.<init>(r7, r9, r11)     // Catch: java.lang.Throwable -> L8c
            r6.L$0 = r9     // Catch: java.lang.Throwable -> L8c
            r6.L$1 = r11     // Catch: java.lang.Throwable -> L8c
            r6.L$2 = r7     // Catch: java.lang.Throwable -> L8c
            r6.label = r2     // Catch: java.lang.Throwable -> L8c
            r1 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            java.lang.Object r10 = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r0) goto L83
            return r0
        L83:
            r1 = r9
            r0 = r11
            r10 = r7
        L86:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            kotlin.r2 r10 = kotlin.r2.f19517a
            return r10
        L8c:
            r10 = move-exception
            r1 = r9
            r0 = r11
            r11 = r10
            r10 = r7
        L91:
            detectCursorHandleDragGestures$onDragStop(r0, r10, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectCursorHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectCursorHandleDragGestures$onDragStop(k1.g gVar, k1.g gVar2, TextFieldSelectionState textFieldSelectionState) {
        if (OffsetKt.m3512isSpecifiedk4lQ0M(gVar.element)) {
            Offset.Companion companion = Offset.Companion;
            gVar.element = companion.m3508getUnspecifiedF1C5BW0();
            gVar2.element = companion.m3508getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope r19, boolean r20, kotlin.coroutines.d<? super kotlin.r2> r21) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.detectSelectionHandleDragGestures(androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectSelectionHandleDragGestures$onDragStop$2(k1.g gVar, TextFieldSelectionState textFieldSelectionState, k1.g gVar2) {
        if (OffsetKt.m3512isSpecifiedk4lQ0M(gVar.element)) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.Companion;
            gVar.element = companion.m3508getUnspecifiedF1C5BW0();
            gVar2.element = companion.m3509getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.text.Handle, T] */
    public final Object detectTextFieldLongPressAndAfterDrag(PointerInputScope pointerInputScope, a<r2> aVar, d<? super r2> dVar) {
        Object l5;
        k1.f fVar = new k1.f();
        fVar.element = -1;
        k1.g gVar = new k1.g();
        Offset.Companion companion = Offset.Companion;
        gVar.element = companion.m3508getUnspecifiedF1C5BW0();
        k1.g gVar2 = new k1.g();
        gVar2.element = companion.m3509getZeroF1C5BW0();
        k1.h hVar = new k1.h();
        hVar.element = Handle.SelectionEnd;
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2(aVar, this, hVar, gVar, gVar2, fVar), new TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$3(gVar, this, fVar, gVar2), new TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4(gVar, this, fVar, gVar2), new TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5(this, gVar2, gVar, fVar, hVar), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (detectDragGesturesAfterLongPress == l5) {
            return detectDragGesturesAfterLongPress;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void detectTextFieldLongPressAndAfterDrag$onDragStop$1(k1.g gVar, TextFieldSelectionState textFieldSelectionState, k1.f fVar, k1.g gVar2) {
        if (OffsetKt.m3512isSpecifiedk4lQ0M(gVar.element)) {
            textFieldSelectionState.clearHandleDragging();
            fVar.element = -1;
            Offset.Companion companion = Offset.Companion;
            gVar.element = companion.m3508getUnspecifiedF1C5BW0();
            gVar2.element = companion.m3509getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, final a<r2> aVar, final a<r2> aVar2, d<? super r2> dVar) {
        Object l5;
        Object detectTapAndDoubleTap = TapAndDoubleTapGestureKt.detectTapAndDoubleTap(pointerInputScope, new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2

            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$2$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends n0 implements a<String> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // v3.a
                @l
                public final String invoke() {
                    return "onTapTextField";
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo1152onEventk4lQ0M(long j5) {
                boolean editable;
                TransformedTextFieldState transformedTextFieldState;
                boolean z4;
                TextLayoutState textLayoutState;
                TransformedTextFieldState transformedTextFieldState2;
                TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
                aVar.invoke();
                editable = this.getEditable();
                if (editable && this.isFocused()) {
                    aVar2.invoke();
                    transformedTextFieldState = this.textFieldState;
                    if (transformedTextFieldState.getText().length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.setShowCursorHandle(true);
                    }
                    this.updateTextToolbarState(TextToolbarState.None);
                    textLayoutState = this.textLayoutState;
                    int m1130getOffsetForPosition3MmeM6k$default = TextLayoutState.m1130getOffsetForPosition3MmeM6k$default(textLayoutState, j5, false, 2, null);
                    if (m1130getOffsetForPosition3MmeM6k$default >= 0) {
                        transformedTextFieldState2 = this.textFieldState;
                        transformedTextFieldState2.placeCursorBeforeCharAt(m1130getOffsetForPosition3MmeM6k$default);
                    }
                }
            }
        }, new TapOnPosition() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3

            @i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1, reason: invalid class name */
            /* loaded from: classes.dex */
            static final class AnonymousClass1 extends n0 implements a<String> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                AnonymousClass1() {
                    super(0);
                }

                @Override // v3.a
                @l
                public final String invoke() {
                    return "onDoubleTapTextField";
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.selection.TapOnPosition
            /* renamed from: onEvent-k-4lQ0M */
            public final void mo1152onEventk4lQ0M(long j5) {
                TextLayoutState textLayoutState;
                TransformedTextFieldState transformedTextFieldState;
                TransformedTextFieldState transformedTextFieldState2;
                TextFieldSelectionStateKt.logDebug(AnonymousClass1.INSTANCE);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                textLayoutState = TextFieldSelectionState.this.textLayoutState;
                int m1130getOffsetForPosition3MmeM6k$default = TextLayoutState.m1130getOffsetForPosition3MmeM6k$default(textLayoutState, j5, false, 2, null);
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                transformedTextFieldState = textFieldSelectionState.textFieldState;
                long m1178updateSelectionQNhciaU$default = TextFieldSelectionState.m1178updateSelectionQNhciaU$default(textFieldSelectionState, TextFieldCharSequenceKt.m1078TextFieldCharSequence3r_uNRQ$default(transformedTextFieldState.getText(), TextRange.Companion.m5550getZerod9O1mEE(), null, 4, null), m1130getOffsetForPosition3MmeM6k$default, m1130getOffsetForPosition3MmeM6k$default, false, SelectionAdjustment.Companion.getWord(), false, 32, null);
                transformedTextFieldState2 = TextFieldSelectionState.this.textFieldState;
                transformedTextFieldState2.m1146selectCharsIn5zctL8(m1178updateSelectionQNhciaU$default);
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return detectTapAndDoubleTap == l5 ? detectTapAndDoubleTap : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectTouchMode(PointerInputScope pointerInputScope, d<? super r2> dVar) {
        Object l5;
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TextFieldSelectionState$detectTouchMode$2(this, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return awaitPointerEventScope == l5 ? awaitPointerEventScope : r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        long m3509getZeroF1C5BW0;
        long m3509getZeroF1C5BW02;
        float f5;
        float f6;
        Rect cursorRect;
        float f7;
        Rect cursorRect2;
        long m3509getZeroF1C5BW03;
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m5539getCollapsedimpl(text.mo1076getSelectionInCharsd9O1mEE())) {
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates != null) {
                m3509getZeroF1C5BW03 = textLayoutCoordinates.mo5007localToRootMKHz9U(getCursorRect().m3528getTopLeftF1C5BW0());
            } else {
                m3509getZeroF1C5BW03 = Offset.Companion.m3509getZeroF1C5BW0();
            }
            return RectKt.m3533Recttz77jQw(m3509getZeroF1C5BW03, getCursorRect().m3526getSizeNHjbRc());
        }
        LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
        if (textLayoutCoordinates2 != null) {
            m3509getZeroF1C5BW0 = textLayoutCoordinates2.mo5007localToRootMKHz9U(m1170getHandlePositiontuRUvjQ(true));
        } else {
            m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        LayoutCoordinates textLayoutCoordinates3 = getTextLayoutCoordinates();
        if (textLayoutCoordinates3 != null) {
            m3509getZeroF1C5BW02 = textLayoutCoordinates3.mo5007localToRootMKHz9U(m1170getHandlePositiontuRUvjQ(false));
        } else {
            m3509getZeroF1C5BW02 = Offset.Companion.m3509getZeroF1C5BW0();
        }
        LayoutCoordinates textLayoutCoordinates4 = getTextLayoutCoordinates();
        float f8 = 0.0f;
        if (textLayoutCoordinates4 != null) {
            TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
            if (layoutResult != null && (cursorRect2 = layoutResult.getCursorRect(TextRange.m5545getStartimpl(text.mo1076getSelectionInCharsd9O1mEE()))) != null) {
                f7 = cursorRect2.getTop();
            } else {
                f7 = 0.0f;
            }
            f5 = Offset.m3494getYimpl(textLayoutCoordinates4.mo5007localToRootMKHz9U(OffsetKt.Offset(0.0f, f7)));
        } else {
            f5 = 0.0f;
        }
        LayoutCoordinates textLayoutCoordinates5 = getTextLayoutCoordinates();
        if (textLayoutCoordinates5 != null) {
            TextLayoutResult layoutResult2 = this.textLayoutState.getLayoutResult();
            if (layoutResult2 != null && (cursorRect = layoutResult2.getCursorRect(TextRange.m5540getEndimpl(text.mo1076getSelectionInCharsd9O1mEE()))) != null) {
                f6 = cursorRect.getTop();
            } else {
                f6 = 0.0f;
            }
            f8 = Offset.m3494getYimpl(textLayoutCoordinates5.mo5007localToRootMKHz9U(OffsetKt.Offset(0.0f, f6)));
        }
        return new Rect(Math.min(Offset.m3493getXimpl(m3509getZeroF1C5BW0), Offset.m3493getXimpl(m3509getZeroF1C5BW02)), Math.min(f5, f8), Math.max(Offset.m3493getXimpl(m3509getZeroF1C5BW0), Offset.m3493getXimpl(m3509getZeroF1C5BW02)), Math.max(Offset.m3494getYimpl(m3509getZeroF1C5BW0), Offset.m3494getYimpl(m3509getZeroF1C5BW02)));
    }

    /* renamed from: getCurrentContentVisibleOffset-F1C5BW0, reason: not valid java name */
    private final long m1169getCurrentContentVisibleOffsetF1C5BW0() {
        Rect visibleBounds;
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        if (textLayoutCoordinates != null && (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) != null) {
            return visibleBounds.m3528getTopLeftF1C5BW0();
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getCursorHandleInBounds() {
        return ((Boolean) this.cursorHandleInBounds$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m1170getHandlePositiontuRUvjQ(boolean z4) {
        int m5540getEndimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        long mo1076getSelectionInCharsd9O1mEE = this.textFieldState.getText().mo1076getSelectionInCharsd9O1mEE();
        if (z4) {
            m5540getEndimpl = TextRange.m5545getStartimpl(mo1076getSelectionInCharsd9O1mEE);
        } else {
            m5540getEndimpl = TextRange.m5540getEndimpl(mo1076getSelectionInCharsd9O1mEE);
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, m5540getEndimpl, z4, TextRange.m5544getReversedimpl(mo1076getSelectionInCharsd9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1171getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m3503unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState getSelectionHandleState(boolean r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L5
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionStart
            goto L7
        L5:
            androidx.compose.foundation.text.Handle r0 = androidx.compose.foundation.text.Handle.SelectionEnd
        L7:
            androidx.compose.foundation.text2.input.internal.TextLayoutState r1 = r13.textLayoutState
            androidx.compose.ui.text.TextLayoutResult r1 = r1.getLayoutResult()
            if (r1 != 0) goto L16
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState$Companion r14 = androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r14 = r14.getHidden()
            return r14
        L16:
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r2 = r13.textFieldState
            androidx.compose.foundation.text2.input.TextFieldCharSequence r2 = r2.getText()
            long r2 = r2.mo1076getSelectionInCharsd9O1mEE()
            boolean r4 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r2)
            if (r4 == 0) goto L2d
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState$Companion r14 = androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r14 = r14.getHidden()
            return r14
        L2d:
            long r4 = r13.m1170getHandlePositiontuRUvjQ(r14)
            androidx.compose.foundation.text.Handle r6 = r13.getDraggingHandle()
            r7 = 1
            r8 = 0
            if (r6 == r0) goto L50
            androidx.compose.ui.layout.LayoutCoordinates r0 = r13.getTextLayoutCoordinates()
            if (r0 == 0) goto L4a
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)
            if (r0 == 0) goto L4a
            boolean r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.m1031containsInclusiveUv8p0NA(r0, r4)
            goto L4b
        L4a:
            r0 = r8
        L4b:
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = r8
            goto L51
        L50:
            r0 = r7
        L51:
            if (r0 != 0) goto L5a
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState$Companion r14 = androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState.Companion
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r14 = r14.getHidden()
            return r14
        L5a:
            if (r14 == 0) goto L61
            int r14 = androidx.compose.ui.text.TextRange.m5545getStartimpl(r2)
            goto L6a
        L61:
            int r14 = androidx.compose.ui.text.TextRange.m5540getEndimpl(r2)
            int r14 = r14 - r7
            int r14 = java.lang.Math.max(r14, r8)
        L6a:
            androidx.compose.ui.text.style.ResolvedTextDirection r10 = r1.getBidiRunDirection(r14)
            boolean r11 = androidx.compose.ui.text.TextRange.m5544getReversedimpl(r2)
            androidx.compose.ui.layout.LayoutCoordinates r14 = r13.getTextLayoutCoordinates()
            if (r14 == 0) goto L82
            androidx.compose.ui.geometry.Rect r14 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r14)
            if (r14 == 0) goto L82
            long r4 = androidx.compose.foundation.text2.input.internal.TextLayoutStateKt.m1136coerceIn3MmeM6k(r4, r14)
        L82:
            r8 = r4
            androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState r14 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState
            r7 = 1
            r12 = 0
            r6 = r14
            r6.<init>(r7, r8, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.getSelectionHandleState(boolean):androidx.compose.foundation.text2.input.internal.selection.TextFieldHandleState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartContentVisibleOffset-F1C5BW0, reason: not valid java name */
    private final long m1172getStartContentVisibleOffsetF1C5BW0() {
        return ((Offset) this.startContentVisibleOffset$delegate.getValue()).m3503unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1173getTextFieldSelectionqeG_v_k(int i5, int i6, TextRange textRange, boolean z4, SelectionAdjustment selectionAdjustment) {
        long m5550getZerod9O1mEE;
        boolean z5;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m5550getZerod9O1mEE();
        }
        if (textRange == null && l0.g(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i5, i6);
        }
        int i7 = this.previousRawDragOffset;
        if (textRange != null) {
            m5550getZerod9O1mEE = textRange.m5549unboximpl();
        } else {
            m5550getZerod9O1mEE = TextRange.Companion.m5550getZerod9O1mEE();
        }
        long j5 = m5550getZerod9O1mEE;
        if (textRange == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        SelectionLayout m997getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m997getTextFieldSelectionLayoutRcvTLA(layoutResult, i5, i6, i7, j5, z5, z4);
        if (textRange != null && !m997getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m5549unboximpl();
        }
        long m986toTextRanged9O1mEE = selectionAdjustment.adjust(m997getTextFieldSelectionLayoutRcvTLA).m986toTextRanged9O1mEE();
        this.previousSelectionLayout = m997getTextFieldSelectionLayoutRcvTLA;
        if (!z4) {
            i5 = i6;
        }
        this.previousRawDragOffset = i5;
        return m986toTextRanged9O1mEE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        TextToolbarStatus textToolbarStatus;
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if (textToolbar2 != null) {
            textToolbarStatus = textToolbar2.getStatus();
        } else {
            textToolbarStatus = null;
        }
        if (textToolbarStatus == TextToolbarStatus.Shown && (textToolbar = this.textToolbar) != null) {
            textToolbar.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        long m3508getUnspecifiedF1C5BW0;
        Rect visibleBounds;
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        if (textLayoutCoordinates != null && (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) != null) {
            m3508getUnspecifiedF1C5BW0 = visibleBounds.m3528getTopLeftF1C5BW0();
        } else {
            m3508getUnspecifiedF1C5BW0 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        m1175setStartContentVisibleOffsetk4lQ0M(m3508getUnspecifiedF1C5BW0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(d<? super r2> dVar) {
        Object l5;
        Object collect = k.j0(k.h0(SnapshotStateKt.snapshotFlow(new TextFieldSelectionState$observeTextChanges$2(this)), TextFieldSelectionState$observeTextChanges$3.INSTANCE), 1).collect(new j() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar2) {
                return emit((TextFieldCharSequence) obj, (d<? super r2>) dVar2);
            }

            @m
            public final Object emit(@l TextFieldCharSequence textFieldCharSequence, @l d<? super r2> dVar2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return r2.f19517a;
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(d<? super r2> dVar) {
        Object l5;
        Object collect = SnapshotStateKt.snapshotFlow(new TextFieldSelectionState$observeTextToolbarVisibility$2(this)).collect(new j() { // from class: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$3
            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar2) {
                return emit((Rect) obj, (d<? super r2>) dVar2);
            }

            @m
            public final Object emit(@l Rect rect, @l d<? super r2> dVar2) {
                if (l0.g(rect, Rect.Companion.getZero())) {
                    TextFieldSelectionState.this.hideTextToolbar();
                } else {
                    TextFieldSelectionState.this.showTextToolbar(rect);
                }
                return r2.f19517a;
            }
        }, dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        if (collect == l5) {
            return collect;
        }
        return r2.f19517a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInTouchMode(boolean z4) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z4));
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1174setRawHandleDragPositionk4lQ0M(long j5) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m3482boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setShowCursorHandle(boolean z4) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z4));
    }

    /* renamed from: setStartContentVisibleOffset-k-4lQ0M, reason: not valid java name */
    private final void m1175setStartContentVisibleOffsetk4lQ0M(long j5) {
        this.startContentVisibleOffset$delegate.setValue(Offset.m3482boximpl(j5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showTextToolbar(androidx.compose.ui.geometry.Rect r11) {
        /*
            r10 = this;
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r0 = r10.textFieldState
            androidx.compose.foundation.text2.input.TextFieldCharSequence r0 = r0.getText()
            long r0 = r0.mo1076getSelectionInCharsd9O1mEE()
            boolean r2 = r10.getEditable()
            r3 = 0
            if (r2 == 0) goto L27
            androidx.compose.ui.platform.ClipboardManager r2 = r10.clipboardManager
            r4 = 0
            if (r2 == 0) goto L1e
            boolean r2 = r2.hasText()
            r5 = 1
            if (r2 != r5) goto L1e
            r4 = r5
        L1e:
            if (r4 == 0) goto L27
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$paste$1 r2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$paste$1
            r2.<init>(r10)
            r7 = r2
            goto L28
        L27:
            r7 = r3
        L28:
            boolean r2 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r0)
            if (r2 != 0) goto L35
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$copy$1 r2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$copy$1
            r2.<init>(r10)
            r6 = r2
            goto L36
        L35:
            r6 = r3
        L36:
            boolean r2 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r0)
            if (r2 != 0) goto L49
            boolean r2 = r10.getEditable()
            if (r2 == 0) goto L49
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$cut$1 r2 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$cut$1
            r2.<init>(r10)
            r8 = r2
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r0 = androidx.compose.ui.text.TextRange.m5541getLengthimpl(r0)
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState r1 = r10.textFieldState
            androidx.compose.foundation.text2.input.TextFieldCharSequence r1 = r1.getText()
            int r1 = r1.length()
            if (r0 == r1) goto L5f
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$selectAll$1 r3 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$showTextToolbar$selectAll$1
            r3.<init>(r10)
        L5f:
            r9 = r3
            androidx.compose.ui.platform.TextToolbar r4 = r10.textToolbar
            if (r4 == 0) goto L68
            r5 = r11
            r4.showMenu(r5, r6, r7, r8, r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.showTextToolbar(androidx.compose.ui.geometry.Rect):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1176updateHandleDraggingUv8p0NA(Handle handle, long j5) {
        setDraggingHandle(handle);
        m1174setRawHandleDragPositionk4lQ0M(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-QNhciaU, reason: not valid java name */
    public final long m1177updateSelectionQNhciaU(TextFieldCharSequence textFieldCharSequence, int i5, int i6, boolean z4, SelectionAdjustment selectionAdjustment, boolean z5) {
        boolean z6;
        TextRange m5533boximpl = TextRange.m5533boximpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE());
        long m5549unboximpl = m5533boximpl.m5549unboximpl();
        boolean z7 = false;
        if (!z5 && TextRange.m5539getCollapsedimpl(m5549unboximpl)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6) {
            m5533boximpl = null;
        }
        long m1173getTextFieldSelectionqeG_v_k = m1173getTextFieldSelectionqeG_v_k(i5, i6, m5533boximpl, z4, selectionAdjustment);
        if (TextRange.m5538equalsimpl0(m1173getTextFieldSelectionqeG_v_k, textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE())) {
            return m1173getTextFieldSelectionqeG_v_k;
        }
        if (TextRange.m5544getReversedimpl(m1173getTextFieldSelectionqeG_v_k) != TextRange.m5544getReversedimpl(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE()) && TextRange.m5538equalsimpl0(TextRangeKt.TextRange(TextRange.m5540getEndimpl(m1173getTextFieldSelectionqeG_v_k), TextRange.m5545getStartimpl(m1173getTextFieldSelectionqeG_v_k)), textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE())) {
            z7 = true;
        }
        if (isInTouchMode() && !z7) {
            HapticFeedback hapticFeedback = this.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
            }
        }
        return m1173getTextFieldSelectionqeG_v_k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: updateSelection-QNhciaU$default, reason: not valid java name */
    public static /* synthetic */ long m1178updateSelectionQNhciaU$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i5, int i6, boolean z4, SelectionAdjustment selectionAdjustment, boolean z5, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            z5 = false;
        }
        return textFieldSelectionState.m1177updateSelectionQNhciaU(textFieldCharSequence, i5, i6, z4, selectionAdjustment, z5);
    }

    public final void copy(boolean z4) {
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m5539getCollapsedimpl(text.mo1076getSelectionInCharsd9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        if (!z4) {
            return;
        }
        this.textFieldState.collapseSelectionToMax();
    }

    @m
    public final Object cursorHandleGestures(@l PointerInputScope pointerInputScope, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public final void cut() {
        TextFieldCharSequence text = this.textFieldState.getText();
        if (TextRange.m5539getCollapsedimpl(text.mo1076getSelectionInCharsd9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(text).toString(), null, null, 6, null));
        }
        this.textFieldState.deleteSelectedText();
    }

    public final void deselect() {
        if (!TextRange.m5539getCollapsedimpl(this.textFieldState.getText().mo1076getSelectionInCharsd9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final void dispose() {
        hideTextToolbar();
        this.textToolbar = null;
        this.clipboardManager = null;
        this.hapticFeedBack = null;
    }

    @l
    public final TextFieldHandleState getCursorHandle() {
        return (TextFieldHandleState) this.cursorHandle$delegate.getValue();
    }

    @l
    public final Rect getCursorRect() {
        return (Rect) this.cursorRect$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    @l
    public final TextFieldHandleState getEndSelectionHandle() {
        return (TextFieldHandleState) this.endSelectionHandle$delegate.getValue();
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1179getHandleDragPositionF1C5BW0() {
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(m1171getRawHandleDragPositionF1C5BW0())) {
            return Offset.Companion.m3508getUnspecifiedF1C5BW0();
        }
        if (OffsetKt.m3514isUnspecifiedk4lQ0M(m1172getStartContentVisibleOffsetF1C5BW0())) {
            return TextLayoutStateKt.m1137fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1171getRawHandleDragPositionF1C5BW0());
        }
        return Offset.m3497minusMKHz9U(Offset.m3498plusMKHz9U(m1171getRawHandleDragPositionF1C5BW0(), m1169getCurrentContentVisibleOffsetF1C5BW0()), m1172getStartContentVisibleOffsetF1C5BW0());
    }

    @l
    public final TextFieldHandleState getStartSelectionHandle() {
        return (TextFieldHandleState) this.startSelectionHandle$delegate.getValue();
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeChanges(@p4.l kotlin.coroutines.d<? super kotlin.r2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1 r0 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState r0 = (androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState) r0
            kotlin.e1.n(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r6 = move-exception
            goto L60
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.e1.n(r6)
            androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2 r6 = new androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState$observeChanges$2     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L5e
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = kotlinx.coroutines.t0.g(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r6 = r0.getTextToolbarState()
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None
            if (r6 == r1) goto L5b
            r0.hideTextToolbar()
        L5b:
            kotlin.r2 r6 = kotlin.r2.f19517a
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.setShowCursorHandle(r3)
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r1 = r0.getTextToolbarState()
            androidx.compose.foundation.text2.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text2.input.internal.selection.TextToolbarState.None
            if (r1 == r2) goto L6e
            r0.hideTextToolbar()
        L6e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState.observeChanges(kotlin.coroutines.d):java.lang.Object");
    }

    public final void paste() {
        AnnotatedString text;
        String text2;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && (text = clipboardManager.getText()) != null && (text2 = text.getText()) != null) {
            TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, text2, false, TextFieldEditUndoBehavior.NeverMerge, 2, null);
        }
    }

    @m
    public final Object selectionHandleGestures(@l PointerInputScope pointerInputScope, boolean z4, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z4, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public final void setDraggingHandle(@m Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final void setFocused(boolean z4) {
        this.isFocused = z4;
    }

    @m
    public final Object textFieldGestures(@l PointerInputScope pointerInputScope, @l a<r2> aVar, @l a<r2> aVar2, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new TextFieldSelectionState$textFieldGestures$2(this, pointerInputScope, aVar, aVar2, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public final void update(@l HapticFeedback hapticFeedback, @l ClipboardManager clipboardManager, @l TextToolbar textToolbar, @l Density density, boolean z4, boolean z5) {
        if (!z4) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboardManager = clipboardManager;
        this.textToolbar = textToolbar;
        this.density = density;
        this.enabled = z4;
        this.readOnly = z5;
    }

    public final void updateTextToolbarState(@l TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }
}
