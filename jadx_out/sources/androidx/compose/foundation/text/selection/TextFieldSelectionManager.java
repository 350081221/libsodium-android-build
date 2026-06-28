package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002JB\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\"\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010$\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\"\u0010#J\u0019\u0010(\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010+\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010*J\u001e\u0010/\u001a\u00020\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\nH\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u0010'J\u000f\u00104\u001a\u00020\u0004H\u0000¢\u0006\u0004\b3\u0010*J\u000f\u00106\u001a\u00020\u0004H\u0000¢\u0006\u0004\b5\u0010*J\u000f\u00108\u001a\u00020\u0004H\u0000¢\u0006\u0004\b7\u0010*J\u001d\u0010;\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001d\u0010@\u001a\u00020\n2\u0006\u0010=\u001a\u00020<H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\u0004H\u0000¢\u0006\u0004\bA\u0010*J\u000f\u0010D\u001a\u00020\u0004H\u0000¢\u0006\u0004\bC\u0010*J\u0018\u0010G\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u000f\u0010J\u001a\u00020\u0002H\u0000¢\u0006\u0004\bH\u0010IR\u0019\u0010L\u001a\u0004\u0018\u00010K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010Q\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR.\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010_\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR+\u0010\t\u001a\u00020\b2\u0006\u0010e\u001a\u00020\b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010m\u001a\u00020l8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR$\u0010t\u001a\u0004\u0018\u00010s8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010{\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R,\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R/\u0010\u0092\u0001\u001a\u00020\u00022\u0006\u0010e\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010g\u001a\u0005\b\u0090\u0001\u0010I\"\u0005\b\u0091\u0001\u0010'R\u001f\u0010\u0093\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0094\u0001R7\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u0099\u00012\t\u0010e\u001a\u0005\u0018\u00010\u0099\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\b\u009a\u0001\u0010g\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R:\u0010¤\u0001\u001a\u0004\u0018\u00010\n2\b\u0010e\u001a\u0004\u0018\u00010\n8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b \u0001\u0010g\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b£\u0001\u0010.R\u001a\u0010¥\u0001\u001a\u00030\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0019\u0010§\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001e\u0010¬\u0001\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010#R \u0010°\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R \u0010·\u0001\u001a\u0004\u0018\u00010\u00188@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b¶\u0001\u0010*\u001a\u0006\b´\u0001\u0010µ\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006º\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "", "show", "Lkotlin/r2;", "updateFloatingToolbar", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "isTouchBasedSelection", "Landroidx/compose/ui/text/TextRange;", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateSelection", "Landroidx/compose/foundation/text/HandleState;", "handleState", "setHandleState", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "selection", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "handleDragObserver", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver", "showFloatingToolbar", "enterSelectionMode$foundation_release", "(Z)V", "enterSelectionMode", "exitSelectionMode$foundation_release", "()V", "exitSelectionMode", "position", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "cancelSelection", "copy$foundation_release", "copy", "paste$foundation_release", "paste", "cut$foundation_release", "cut", "selectAll$foundation_release", "selectAll", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "Landroidx/compose/ui/unit/Density;", "density", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "showSelectionToolbar$foundation_release", "showSelectionToolbar", "hideSelectionToolbar$foundation_release", "hideSelectionToolbar", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "isTextChanged$foundation_release", "()Z", "isTextChanged", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "Lkotlin/Function1;", "onValueChange", "Lv3/l;", "getOnValueChange$foundation_release", "()Lv3/l;", "setOnValueChange$foundation_release", "(Lv3/l;)V", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/TextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/TextFieldState;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "editable$delegate", "getEditable", "setEditable", "editable", "dragBeginPosition", "J", "", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "currentDragPosition$delegate", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "previousRawDragOffset", "I", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release$annotations", "transformedText", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1049:1\n81#2:1050\n107#2,2:1051\n81#2:1053\n107#2,2:1054\n81#2:1056\n107#2,2:1057\n81#2:1059\n107#2,2:1060\n1#3:1062\n154#4:1063\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1050\n87#1:1051,2\n125#1:1053\n125#1:1054,2\n155#1:1056\n155#1:1057,2\n161#1:1059\n161#1:1060,2\n825#1:1063\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;

    @m
    private ClipboardManager clipboardManager;

    @l
    private final MutableState currentDragPosition$delegate;

    @m
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    @l
    private final MutableState draggingHandle$delegate;

    @l
    private final MutableState editable$delegate;

    @m
    private FocusRequester focusRequester;

    @m
    private HapticFeedback hapticFeedBack;

    @l
    private final MouseSelectionObserver mouseSelectionObserver;

    @l
    private OffsetMapping offsetMapping;

    @l
    private TextFieldValue oldValue;

    @l
    private v3.l<? super TextFieldValue, r2> onValueChange;
    private int previousRawDragOffset;

    @m
    private SelectionLayout previousSelectionLayout;

    @m
    private TextFieldState state;

    @m
    private TextToolbar textToolbar;

    @l
    private final TextDragObserver touchSelectionObserver;

    @m
    private final UndoManager undoManager;

    @l
    private final MutableState value$delegate;

    @l
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TextFieldSelectionManager(@m UndoManager undoManager) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = TextFieldSelectionManager$onValueChange$1.INSTANCE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (w) null), null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.visualTransformation = VisualTransformation.Companion.getNone();
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.editable$delegate = mutableStateOf$default2;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m3509getZeroF1C5BW0();
        this.dragTotalDistance = companion.m3509getZeroF1C5BW0();
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = mutableStateOf$default4;
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (w) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo895onDownk4lQ0M(long j5) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo896onDragk4lQ0M(long j5) {
                boolean z4;
                long j6;
                TextLayoutResultProxy layoutResult;
                long j7;
                long j8;
                Integer num;
                Integer num2;
                long j9;
                int m929getOffsetForPosition3MmeM6k;
                Integer num3;
                long m1048updateSelection8UEBfa8;
                long j10;
                SelectionAdjustment characterWithWordAccelerate;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j6 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3498plusMKHz9U(j6, j5);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j7 = textFieldSelectionManager2.dragBeginPosition;
                    j8 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(Offset.m3498plusMKHz9U(j7, j8)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        Offset m1051getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                        l0.m(m1051getCurrentDragPosition_m7T9E);
                        if (!layoutResult.m930isPositionOnTextk4lQ0M(m1051getCurrentDragPosition_m7T9E.m3503unboximpl())) {
                            OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            j10 = textFieldSelectionManager2.dragBeginPosition;
                            int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(layoutResult, j10, false, 2, null));
                            OffsetMapping offsetMapping$foundation_release2 = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            Offset m1051getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                            l0.m(m1051getCurrentDragPosition_m7T9E2);
                            if (transformedToOriginal == offsetMapping$foundation_release2.transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(layoutResult, m1051getCurrentDragPosition_m7T9E2.m3503unboximpl(), false, 2, null))) {
                                characterWithWordAccelerate = SelectionAdjustment.Companion.getNone();
                            } else {
                                characterWithWordAccelerate = SelectionAdjustment.Companion.getCharacterWithWordAccelerate();
                            }
                            SelectionAdjustment selectionAdjustment = characterWithWordAccelerate;
                            TextFieldValue value$foundation_release = textFieldSelectionManager2.getValue$foundation_release();
                            Offset m1051getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                            l0.m(m1051getCurrentDragPosition_m7T9E3);
                            m1048updateSelection8UEBfa8 = textFieldSelectionManager2.m1048updateSelection8UEBfa8(value$foundation_release, m1051getCurrentDragPosition_m7T9E3.m3503unboximpl(), false, false, selectionAdjustment, true);
                            TextRange.m5533boximpl(m1048updateSelection8UEBfa8);
                        }
                    }
                    num2 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num2 != null) {
                        m929getOffsetForPosition3MmeM6k = num2.intValue();
                    } else {
                        j9 = textFieldSelectionManager2.dragBeginPosition;
                        m929getOffsetForPosition3MmeM6k = layoutResult.m929getOffsetForPosition3MmeM6k(j9, false);
                    }
                    Offset m1051getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                    l0.m(m1051getCurrentDragPosition_m7T9E4);
                    int m929getOffsetForPosition3MmeM6k2 = layoutResult.m929getOffsetForPosition3MmeM6k(m1051getCurrentDragPosition_m7T9E4.m3503unboximpl(), false);
                    num3 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num3 == null && m929getOffsetForPosition3MmeM6k == m929getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation_release2 = textFieldSelectionManager2.getValue$foundation_release();
                    Offset m1051getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                    l0.m(m1051getCurrentDragPosition_m7T9E5);
                    m1048updateSelection8UEBfa8 = textFieldSelectionManager2.m1048updateSelection8UEBfa8(value$foundation_release2, m1051getCurrentDragPosition_m7T9E5.m3503unboximpl(), false, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                    TextRange.m5533boximpl(m1048updateSelection8UEBfa8);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo897onStartk4lQ0M(long j5) {
                boolean z4;
                long m1048updateSelection8UEBfa8;
                long j6;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m1045createTextFieldValueFDrldGo;
                TextLayoutResultProxy layoutResult2;
                if (TextFieldSelectionManager.this.getDraggingHandle() != null) {
                    return;
                }
                TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                boolean z5 = true;
                if (state$foundation_release != null && (layoutResult2 = state$foundation_release.getLayoutResult()) != null && layoutResult2.m930isPositionOnTextk4lQ0M(j5)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(layoutResult, j5, false, 2, null));
                        m1045createTextFieldValueFDrldGo = textFieldSelectionManager.m1045createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                        textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                        textFieldSelectionManager.setHandleState(HandleState.Cursor);
                        HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
                        }
                        textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1045createTextFieldValueFDrldGo);
                    }
                } else {
                    if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() != 0) {
                        z5 = false;
                    }
                    if (z5) {
                        return;
                    }
                    TextFieldSelectionManager.this.enterSelectionMode$foundation_release(false);
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    m1048updateSelection8UEBfa8 = textFieldSelectionManager2.m1048updateSelection8UEBfa8(TextFieldValue.m5778copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.Companion.m5550getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j5, true, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                    TextFieldSelectionManager.this.dragBeginOffsetInText = Integer.valueOf(TextRange.m5545getStartimpl(m1048updateSelection8UEBfa8));
                }
                TextFieldSelectionManager.this.dragBeginPosition = j5;
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                j6 = textFieldSelectionManager3.dragBeginPosition;
                textFieldSelectionManager3.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(j6));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3509getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo968onDrag3MmeM6k(long j5, @l SelectionAdjustment selectionAdjustment) {
                boolean z4;
                TextFieldState state$foundation_release;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m1048updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j5, false, false, selectionAdjustment, false);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo969onExtendk4lQ0M(long j5) {
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && state$foundation_release.getLayoutResult() != null) {
                    TextFieldSelectionManager.this.previousRawDragOffset = -1;
                    TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                    textFieldSelectionManager.m1048updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j5, false, false, SelectionAdjustment.Companion.getNone(), false);
                    return true;
                }
                return false;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo970onExtendDragk4lQ0M(long j5) {
                boolean z4;
                TextFieldState state$foundation_release;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.m1048updateSelection8UEBfa8(textFieldSelectionManager.getValue$foundation_release(), j5, false, false, SelectionAdjustment.Companion.getNone(), false);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo971onStart3MmeM6k(long j5, @l SelectionAdjustment selectionAdjustment) {
                boolean z4;
                TextFieldState state$foundation_release;
                long j6;
                if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                TextFieldSelectionManager.this.dragBeginPosition = j5;
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager.getValue$foundation_release();
                j6 = TextFieldSelectionManager.this.dragBeginPosition;
                textFieldSelectionManager.m1048updateSelection8UEBfa8(value$foundation_release, j6, true, false, selectionAdjustment, false);
                return true;
            }
        };
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        textFieldSelectionManager.copy$foundation_release(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1045createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j5) {
        return new TextFieldValue(annotatedString, j5, (TextRange) null, 4, (w) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1046deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1050deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z4);
    }

    private final Rect getContentRect() {
        long m3509getZeroF1C5BW0;
        long m3509getZeroF1C5BW02;
        float f5;
        LayoutCoordinates layoutCoordinates;
        float f6;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        float f7;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (!(!textFieldState.isLayoutResultStale())) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5545getStartimpl(getValue$foundation_release().m5783getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m5540getEndimpl(getValue$foundation_release().m5783getSelectiond9O1mEE()));
                TextFieldState textFieldState2 = this.state;
                if (textFieldState2 != null && (layoutCoordinates4 = textFieldState2.getLayoutCoordinates()) != null) {
                    m3509getZeroF1C5BW0 = layoutCoordinates4.mo5007localToRootMKHz9U(m1053getHandlePositiontuRUvjQ$foundation_release(true));
                } else {
                    m3509getZeroF1C5BW0 = Offset.Companion.m3509getZeroF1C5BW0();
                }
                TextFieldState textFieldState3 = this.state;
                if (textFieldState3 != null && (layoutCoordinates3 = textFieldState3.getLayoutCoordinates()) != null) {
                    m3509getZeroF1C5BW02 = layoutCoordinates3.mo5007localToRootMKHz9U(m1053getHandlePositiontuRUvjQ$foundation_release(false));
                } else {
                    m3509getZeroF1C5BW02 = Offset.Companion.m3509getZeroF1C5BW0();
                }
                TextFieldState textFieldState4 = this.state;
                float f8 = 0.0f;
                if (textFieldState4 != null && (layoutCoordinates2 = textFieldState4.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
                    if (layoutResult != null && (value2 = layoutResult.getValue()) != null && (cursorRect2 = value2.getCursorRect(originalToTransformed)) != null) {
                        f7 = cursorRect2.getTop();
                    } else {
                        f7 = 0.0f;
                    }
                    f5 = Offset.m3494getYimpl(layoutCoordinates2.mo5007localToRootMKHz9U(OffsetKt.Offset(0.0f, f7)));
                } else {
                    f5 = 0.0f;
                }
                TextFieldState textFieldState5 = this.state;
                if (textFieldState5 != null && (layoutCoordinates = textFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = textFieldState.getLayoutResult();
                    if (layoutResult2 != null && (value = layoutResult2.getValue()) != null && (cursorRect = value.getCursorRect(originalToTransformed2)) != null) {
                        f6 = cursorRect.getTop();
                    } else {
                        f6 = 0.0f;
                    }
                    f8 = Offset.m3494getYimpl(layoutCoordinates.mo5007localToRootMKHz9U(OffsetKt.Offset(0.0f, f6)));
                }
                return new Rect(Math.min(Offset.m3493getXimpl(m3509getZeroF1C5BW0), Offset.m3493getXimpl(m3509getZeroF1C5BW02)), Math.min(f5, f8), Math.max(Offset.m3493getXimpl(m3509getZeroF1C5BW0), Offset.m3493getXimpl(m3509getZeroF1C5BW02)), Math.max(Offset.m3494getYimpl(m3509getZeroF1C5BW0), Offset.m3494getYimpl(m3509getZeroF1C5BW02)) + (Dp.m6044constructorimpl(25) * textFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    public static /* synthetic */ void getTransformedText$foundation_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1047setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            if (textFieldState.getHandleState() == handleState) {
                textFieldState = null;
            }
            if (textFieldState != null) {
                textFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z4) {
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textFieldState.setShowFloatingToolbar(z4);
        }
        if (z4) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1048updateSelection8UEBfa8(TextFieldValue textFieldValue, long j5, boolean z4, boolean z5, SelectionAdjustment selectionAdjustment, boolean z6) {
        TextLayoutResultProxy layoutResult;
        int i5;
        int i6;
        boolean z7;
        boolean z8;
        HandleState handleState;
        boolean z9;
        HapticFeedback hapticFeedback;
        int i7;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m5545getStartimpl(textFieldValue.m5783getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m5540getEndimpl(textFieldValue.m5783getSelectiond9O1mEE())));
            int m929getOffsetForPosition3MmeM6k = layoutResult.m929getOffsetForPosition3MmeM6k(j5, false);
            if (!z5 && !z4) {
                i5 = TextRange.m5545getStartimpl(TextRange);
            } else {
                i5 = m929getOffsetForPosition3MmeM6k;
            }
            if (z5 && !z4) {
                i6 = TextRange.m5540getEndimpl(TextRange);
            } else {
                i6 = m929getOffsetForPosition3MmeM6k;
            }
            SelectionLayout selectionLayout = this.previousSelectionLayout;
            int i8 = -1;
            if (!z4 && selectionLayout != null && (i7 = this.previousRawDragOffset) != -1) {
                i8 = i7;
            }
            SelectionLayout m997getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m997getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), i5, i6, i8, TextRange, z4, z5);
            if (!m997getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
                return textFieldValue.m5783getSelectiond9O1mEE();
            }
            this.previousSelectionLayout = m997getTextFieldSelectionLayoutRcvTLA;
            this.previousRawDragOffset = m929getOffsetForPosition3MmeM6k;
            Selection adjust = selectionAdjustment.adjust(m997getTextFieldSelectionLayoutRcvTLA);
            long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
            if (TextRange.m5538equalsimpl0(TextRange2, textFieldValue.m5783getSelectiond9O1mEE())) {
                return textFieldValue.m5783getSelectiond9O1mEE();
            }
            if (TextRange.m5544getReversedimpl(TextRange2) != TextRange.m5544getReversedimpl(textFieldValue.m5783getSelectiond9O1mEE()) && TextRange.m5538equalsimpl0(TextRangeKt.TextRange(TextRange.m5540getEndimpl(TextRange2), TextRange.m5545getStartimpl(TextRange2)), textFieldValue.m5783getSelectiond9O1mEE())) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (TextRange.m5539getCollapsedimpl(TextRange2) && TextRange.m5539getCollapsedimpl(textFieldValue.m5783getSelectiond9O1mEE())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z6) {
                if (textFieldValue.getText().length() > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && !z7 && !z8 && (hapticFeedback = this.hapticFeedBack) != null) {
                    hapticFeedback.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
                }
            }
            TextFieldValue m1045createTextFieldValueFDrldGo = m1045createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2);
            this.onValueChange.invoke(m1045createTextFieldValueFDrldGo);
            if (TextRange.m5539getCollapsedimpl(m1045createTextFieldValueFDrldGo.m5783getSelectiond9O1mEE())) {
                handleState = HandleState.Cursor;
            } else {
                handleState = HandleState.Selection;
            }
            setHandleState(handleState);
            TextFieldState textFieldState2 = this.state;
            if (textFieldState2 != null) {
                textFieldState2.setInTouchMode(z6);
            }
            TextFieldState textFieldState3 = this.state;
            if (textFieldState3 != null) {
                textFieldState3.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
            }
            TextFieldState textFieldState4 = this.state;
            if (textFieldState4 != null) {
                textFieldState4.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
            }
            return TextRange2;
        }
        return TextRange.Companion.m5550getZerod9O1mEE();
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1049contextMenuOpenAdjustmentk4lQ0M(long j5) {
        TextLayoutResultProxy layoutResult;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
            if (!TextRange.m5536containsimpl(getValue$foundation_release().m5783getSelectiond9O1mEE(), TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(layoutResult, j5, false, 2, null))) {
                this.previousRawDragOffset = -1;
                m1048updateSelection8UEBfa8(getValue$foundation_release(), j5, true, false, SelectionAdjustment.Companion.getWord(), false);
            }
        }
    }

    public final void copy$foundation_release(boolean z4) {
        if (TextRange.m5539getCollapsedimpl(getValue$foundation_release().m5783getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (!z4) {
            return;
        }
        int m5542getMaximpl = TextRange.m5542getMaximpl(getValue$foundation_release().m5783getSelectiond9O1mEE());
        this.onValueChange.invoke(m1045createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(m5542getMaximpl, m5542getMaximpl)));
        setHandleState(HandleState.None);
    }

    @l
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo895onDownk4lQ0M(long j5) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo896onDragk4lQ0M(long j5) {
                long j6;
                TextLayoutResultProxy layoutResult;
                long j7;
                long j8;
                TextFieldValue m1045createTextFieldValueFDrldGo;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j6 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3498plusMKHz9U(j6, j5);
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j7 = textFieldSelectionManager2.dragBeginPosition;
                    j8 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(Offset.m3498plusMKHz9U(j7, j8)));
                    OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                    Offset m1051getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1051getCurrentDragPosition_m7T9E();
                    l0.m(m1051getCurrentDragPosition_m7T9E);
                    int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(layoutResult, m1051getCurrentDragPosition_m7T9E.m3503unboximpl(), false, 2, null));
                    long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                    if (TextRange.m5538equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m5783getSelectiond9O1mEE())) {
                        return;
                    }
                    TextFieldState state$foundation_release2 = textFieldSelectionManager2.getState$foundation_release();
                    boolean z4 = false;
                    if (state$foundation_release2 != null && !state$foundation_release2.isInTouchMode()) {
                        z4 = true;
                    }
                    if (!z4 && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                        hapticFeedBack.mo4399performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4408getTextHandleMove5zf0vsI());
                    }
                    v3.l<TextFieldValue, r2> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                    m1045createTextFieldValueFDrldGo = textFieldSelectionManager2.m1045createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                    onValueChange$foundation_release.invoke(m1045createTextFieldValueFDrldGo);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo897onStartk4lQ0M(long j5) {
                TextLayoutResultProxy layoutResult;
                long m994getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1053getHandlePositiontuRUvjQ$foundation_release(true));
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    long m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m994getAdjustedCoordinatesk4lQ0M);
                    TextFieldSelectionManager.this.dragBeginPosition = m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                    TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3509getZeroF1C5BW0();
                    TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                    TextFieldSelectionManager.this.updateFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m5539getCollapsedimpl(getValue$foundation_release().m5783getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int m5543getMinimpl = TextRange.m5543getMinimpl(getValue$foundation_release().m5783getSelectiond9O1mEE());
        this.onValueChange.invoke(m1045createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m5543getMinimpl, m5543getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1050deselect_kEHs6E$foundation_release(@m Offset offset) {
        HandleState handleState;
        boolean z4;
        TextLayoutResultProxy textLayoutResultProxy;
        int m5542getMaximpl;
        if (!TextRange.m5539getCollapsedimpl(getValue$foundation_release().m5783getSelectiond9O1mEE())) {
            TextFieldState textFieldState = this.state;
            if (textFieldState != null) {
                textLayoutResultProxy = textFieldState.getLayoutResult();
            } else {
                textLayoutResultProxy = null;
            }
            TextLayoutResultProxy textLayoutResultProxy2 = textLayoutResultProxy;
            if (offset != null && textLayoutResultProxy2 != null) {
                m5542getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m928getOffsetForPosition3MmeM6k$default(textLayoutResultProxy2, offset.m3503unboximpl(), false, 2, null));
            } else {
                m5542getMaximpl = TextRange.m5542getMaximpl(getValue$foundation_release().m5783getSelectiond9O1mEE());
            }
            this.onValueChange.invoke(TextFieldValue.m5778copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(m5542getMaximpl), (TextRange) null, 5, (Object) null));
        }
        if (offset != null) {
            if (getValue$foundation_release().getText().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                handleState = HandleState.Cursor;
                setHandleState(handleState);
                updateFloatingToolbar(false);
            }
        }
        handleState = HandleState.None;
        setHandleState(handleState);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean z4) {
        FocusRequester focusRequester;
        TextFieldState textFieldState = this.state;
        boolean z5 = false;
        if (textFieldState != null && !textFieldState.getHasFocus()) {
            z5 = true;
        }
        if (z5 && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(z4);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    @m
    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1051getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1052getCursorPositiontuRUvjQ$foundation_release(@l Density density) {
        TextLayoutResultProxy textLayoutResultProxy;
        int I;
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5545getStartimpl(getValue$foundation_release().m5783getSelectiond9O1mEE()));
        TextFieldState textFieldState = this.state;
        if (textFieldState != null) {
            textLayoutResultProxy = textFieldState.getLayoutResult();
        } else {
            textLayoutResultProxy = null;
        }
        l0.m(textLayoutResultProxy);
        TextLayoutResult value = textLayoutResultProxy.getValue();
        I = u.I(originalToTransformed, 0, value.getLayoutInput().getText().length());
        Rect cursorRect = value.getCursorRect(I);
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo304toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    @m
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1053getHandlePositiontuRUvjQ$foundation_release(boolean z4) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int m5540getEndimpl;
        TextFieldState textFieldState = this.state;
        if (textFieldState != null && (layoutResult = textFieldState.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
            AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
            if (transformedText$foundation_release == null) {
                return Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            if (!l0.g(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
                return Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            long m5783getSelectiond9O1mEE = getValue$foundation_release().m5783getSelectiond9O1mEE();
            if (z4) {
                m5540getEndimpl = TextRange.m5545getStartimpl(m5783getSelectiond9O1mEE);
            } else {
                m5540getEndimpl = TextRange.m5540getEndimpl(m5783getSelectiond9O1mEE);
            }
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(m5540getEndimpl), z4, TextRange.m5544getReversedimpl(getValue$foundation_release().m5783getSelectiond9O1mEE()));
        }
        return Offset.Companion.m3508getUnspecifiedF1C5BW0();
    }

    @m
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @l
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    @l
    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    @l
    public final v3.l<TextFieldValue, r2> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    @m
    public final TextFieldState getState$foundation_release() {
        return this.state;
    }

    @m
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @l
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    @m
    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        TextFieldState textFieldState = this.state;
        if (textFieldState == null || (textDelegate = textFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    @m
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    @l
    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    @l
    public final TextDragObserver handleDragObserver$foundation_release(final boolean z4) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo895onDownk4lQ0M(long j5) {
                Handle handle;
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                if (z4) {
                    handle = Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                textFieldSelectionManager.setDraggingHandle(handle);
                long m994getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1053getHandlePositiontuRUvjQ$foundation_release(z4));
                TextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    long m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m994getAdjustedCoordinatesk4lQ0M);
                    TextFieldSelectionManager.this.dragBeginPosition = m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                    TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(m932translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m3509getZeroF1C5BW0();
                    TextFieldSelectionManager.this.previousRawDragOffset = -1;
                    TextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release2 != null) {
                        state$foundation_release2.setInTouchMode(true);
                    }
                    TextFieldSelectionManager.this.updateFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo896onDragk4lQ0M(long j5) {
                long j6;
                long j7;
                long j8;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j6 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m3498plusMKHz9U(j6, j5);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j7 = textFieldSelectionManager2.dragBeginPosition;
                j8 = TextFieldSelectionManager.this.dragTotalDistance;
                textFieldSelectionManager2.m1047setCurrentDragPosition_kEHs6E(Offset.m3482boximpl(Offset.m3498plusMKHz9U(j7, j8)));
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset m1051getCurrentDragPosition_m7T9E = TextFieldSelectionManager.this.m1051getCurrentDragPosition_m7T9E();
                l0.m(m1051getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1048updateSelection8UEBfa8(value$foundation_release, m1051getCurrentDragPosition_m7T9E.m3503unboximpl(), false, z4, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo897onStartk4lQ0M(long j5) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1047setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
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

    public final boolean isTextChanged$foundation_release() {
        return !l0.g(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && (text = clipboardManager.getText()) != null) {
            AnnotatedString plus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int m5543getMinimpl = TextRange.m5543getMinimpl(getValue$foundation_release().m5783getSelectiond9O1mEE()) + text.length();
            this.onValueChange.invoke(m1045createTextFieldValueFDrldGo(plus, TextRangeKt.TextRange(m5543getMinimpl, m5543getMinimpl)));
            setHandleState(HandleState.None);
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m1045createTextFieldValueFDrldGo = m1045createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1045createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m5778copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1045createTextFieldValueFDrldGo.m5783getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    public final void setClipboardManager$foundation_release(@m ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final void setEditable(boolean z4) {
        this.editable$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setFocusRequester(@m FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@m HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@l OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@l v3.l<? super TextFieldValue, r2> lVar) {
        this.onValueChange = lVar;
    }

    public final void setState$foundation_release(@m TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final void setTextToolbar(@m TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@l TextFieldValue textFieldValue) {
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@l VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showSelectionToolbar$foundation_release() {
        /*
            r11 = this;
            androidx.compose.foundation.text.TextFieldState r0 = r11.state
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.isInTouchMode()
            if (r0 != 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            return
        L12:
            androidx.compose.ui.text.input.VisualTransformation r0 = r11.visualTransformation
            boolean r0 = r0 instanceof androidx.compose.ui.text.input.PasswordVisualTransformation
            androidx.compose.ui.text.input.TextFieldValue r3 = r11.getValue$foundation_release()
            long r3 = r3.m5783getSelectiond9O1mEE()
            boolean r3 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r3)
            r4 = 0
            if (r3 != 0) goto L2e
            if (r0 != 0) goto L2e
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1 r3 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
            r3.<init>(r11)
            r7 = r3
            goto L2f
        L2e:
            r7 = r4
        L2f:
            androidx.compose.ui.text.input.TextFieldValue r3 = r11.getValue$foundation_release()
            long r5 = r3.m5783getSelectiond9O1mEE()
            boolean r3 = androidx.compose.ui.text.TextRange.m5539getCollapsedimpl(r5)
            if (r3 != 0) goto L4c
            boolean r3 = r11.getEditable()
            if (r3 == 0) goto L4c
            if (r0 != 0) goto L4c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
            r0.<init>(r11)
            r9 = r0
            goto L4d
        L4c:
            r9 = r4
        L4d:
            boolean r0 = r11.getEditable()
            if (r0 == 0) goto L68
            androidx.compose.ui.platform.ClipboardManager r0 = r11.clipboardManager
            if (r0 == 0) goto L5e
            boolean r0 = r0.hasText()
            if (r0 != r1) goto L5e
            goto L5f
        L5e:
            r1 = r2
        L5f:
            if (r1 == 0) goto L68
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1 r0 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
            r0.<init>(r11)
            r8 = r0
            goto L69
        L68:
            r8 = r4
        L69:
            androidx.compose.ui.text.input.TextFieldValue r0 = r11.getValue$foundation_release()
            long r0 = r0.m5783getSelectiond9O1mEE()
            int r0 = androidx.compose.ui.text.TextRange.m5541getLengthimpl(r0)
            androidx.compose.ui.text.input.TextFieldValue r1 = r11.getValue$foundation_release()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            if (r0 == r1) goto L88
            androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1 r4 = new androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
            r4.<init>(r11)
        L88:
            r10 = r4
            androidx.compose.ui.platform.TextToolbar r5 = r11.textToolbar
            if (r5 == 0) goto L94
            androidx.compose.ui.geometry.Rect r6 = r11.getContentRect()
            r5.showMenu(r6, r7, r8, r9, r10)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.showSelectionToolbar$foundation_release():void");
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : undoManager);
    }
}
