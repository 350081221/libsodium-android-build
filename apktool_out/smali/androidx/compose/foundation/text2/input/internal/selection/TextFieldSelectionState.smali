.class public final Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008)\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010B\u001a\u00020\u000e\u0012\u0006\u0010C\u001a\u00020\u000e\u0012\u0006\u0010Z\u001a\u00020\u000e\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J0\u0010\t\u001a\u00020\u0003*\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0014\u0010\u000b\u001a\u00020\u0003*\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u0005J\"\u0010\u000c\u001a\u00020\u0003*\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0008\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001d\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\"\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0008\u0010#\u001a\u00020\u0003H\u0002J\u0008\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0015H\u0002J\u0008\u0010\'\u001a\u00020\u0003H\u0002JG\u00103\u001a\u0002002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0008\u0008\u0002\u0010/\u001a\u00020\u000eH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00081\u00102J<\u00109\u001a\u0002002\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2\u0008\u00106\u001a\u0004\u0018\u0001002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u00087\u00108J6\u0010D\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eJ\u0014\u0010E\u001a\u00020\u0003*\u00020\u0002H\u0086@\u00a2\u0006\u0004\u0008E\u0010\u0005J0\u0010F\u001a\u00020\u0003*\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006H\u0086@\u00a2\u0006\u0004\u0008F\u0010\nJ\u001c\u0010G\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008G\u0010\u0011J\u0010\u0010H\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008H\u0010\u0013J\u000e\u0010K\u001a\u00020\u00032\u0006\u0010J\u001a\u00020IJ\u0006\u0010L\u001a\u00020\u0003J\u0006\u0010M\u001a\u00020\u0003J\u0010\u0010O\u001a\u00020\u00032\u0008\u0008\u0002\u0010N\u001a\u00020\u000eJ\u0006\u0010P\u001a\u00020\u0003J\u0006\u0010Q\u001a\u00020\u0003R\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010XR\u0016\u0010B\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010YR\u0016\u0010C\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010YR\"\u0010Z\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Z\u0010Y\u001a\u0004\u0008Z\u0010[\"\u0004\u0008\\\u0010]R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010^R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010_R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010`R+\u0010d\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010[\"\u0004\u0008e\u0010]R1\u0010k\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u00198B@BX\u0082\u008e\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0004\u0008f\u0010c\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR1\u0010o\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u00198B@BX\u0082\u008e\u0002\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0004\u0008l\u0010c\u001a\u0004\u0008m\u0010h\"\u0004\u0008n\u0010jR/\u0010u\u001a\u0004\u0018\u00010\u001d2\u0008\u0010a\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008p\u0010c\u001a\u0004\u0008q\u0010r\"\u0004\u0008s\u0010tR+\u0010y\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u000e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008v\u0010c\u001a\u0004\u0008w\u0010[\"\u0004\u0008x\u0010]R+\u0010J\u001a\u00020I2\u0006\u0010a\u001a\u00020I8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008z\u0010c\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R \u0010\u0088\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\u008b\u0001\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0006\u0008\u0089\u0001\u0010\u0085\u0001\u001a\u0005\u0008\u008a\u0001\u0010[R \u0010\u008f\u0001\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u008c\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001R \u0010\u0092\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0090\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u0087\u0001R \u0010\u0095\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0093\u0001\u0010\u0085\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0087\u0001R\u001c\u0010\u0097\u0001\u001a\u00020\u00198BX\u0082\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0007\u001a\u0005\u0008\u0096\u0001\u0010hR\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u009c\u0001\u0010[R\u0019\u0010\u009f\u0001\u001a\u00020\u00198F\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0007\u001a\u0005\u0008\u009e\u0001\u0010h\u0082\u0002\u000b\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u00a2\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;",
        "",
        "Landroidx/compose/ui/input/pointer/PointerInputScope;",
        "Lkotlin/r2;",
        "detectTouchMode",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "Lkotlin/Function0;",
        "requestFocus",
        "showKeyboard",
        "detectTextFieldTapGestures",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "detectCursorHandleDragGestures",
        "detectTextFieldLongPressAndAfterDrag",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "",
        "isStartHandle",
        "detectSelectionHandleDragGestures",
        "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;",
        "observeTextChanges",
        "(Lkotlin/coroutines/d;)Ljava/lang/Object;",
        "observeTextToolbarVisibility",
        "Landroidx/compose/ui/geometry/Rect;",
        "getContentRect",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;",
        "getSelectionHandleState",
        "Landroidx/compose/ui/geometry/Offset;",
        "getHandlePosition-tuRUvjQ",
        "(Z)J",
        "getHandlePosition",
        "Landroidx/compose/foundation/text/Handle;",
        "handle",
        "position",
        "updateHandleDragging-Uv8p0NA",
        "(Landroidx/compose/foundation/text/Handle;J)V",
        "updateHandleDragging",
        "markStartContentVisibleOffset",
        "clearHandleDragging",
        "contentRect",
        "showTextToolbar",
        "hideTextToolbar",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "textFieldCharSequence",
        "",
        "startOffset",
        "endOffset",
        "Landroidx/compose/foundation/text/selection/SelectionAdjustment;",
        "adjustment",
        "allowPreviousSelectionCollapsed",
        "Landroidx/compose/ui/text/TextRange;",
        "updateSelection-QNhciaU",
        "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J",
        "updateSelection",
        "rawStartOffset",
        "rawEndOffset",
        "previousSelection",
        "getTextFieldSelection-qeG_v_k",
        "(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J",
        "getTextFieldSelection",
        "Landroidx/compose/ui/hapticfeedback/HapticFeedback;",
        "hapticFeedBack",
        "Landroidx/compose/ui/platform/ClipboardManager;",
        "clipboardManager",
        "Landroidx/compose/ui/platform/TextToolbar;",
        "textToolbar",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "enabled",
        "readOnly",
        "update",
        "cursorHandleGestures",
        "textFieldGestures",
        "selectionHandleGestures",
        "observeChanges",
        "Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;",
        "textToolbarState",
        "updateTextToolbarState",
        "dispose",
        "cut",
        "cancelSelection",
        "copy",
        "paste",
        "deselect",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "textFieldState",
        "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;",
        "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
        "textLayoutState",
        "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;",
        "Landroidx/compose/ui/unit/Density;",
        "Z",
        "isFocused",
        "()Z",
        "setFocused",
        "(Z)V",
        "Landroidx/compose/ui/hapticfeedback/HapticFeedback;",
        "Landroidx/compose/ui/platform/TextToolbar;",
        "Landroidx/compose/ui/platform/ClipboardManager;",
        "<set-?>",
        "isInTouchMode$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "isInTouchMode",
        "setInTouchMode",
        "startContentVisibleOffset$delegate",
        "getStartContentVisibleOffset-F1C5BW0",
        "()J",
        "setStartContentVisibleOffset-k-4lQ0M",
        "(J)V",
        "startContentVisibleOffset",
        "rawHandleDragPosition$delegate",
        "getRawHandleDragPosition-F1C5BW0",
        "setRawHandleDragPosition-k-4lQ0M",
        "rawHandleDragPosition",
        "draggingHandle$delegate",
        "getDraggingHandle",
        "()Landroidx/compose/foundation/text/Handle;",
        "setDraggingHandle",
        "(Landroidx/compose/foundation/text/Handle;)V",
        "draggingHandle",
        "showCursorHandle$delegate",
        "getShowCursorHandle",
        "setShowCursorHandle",
        "showCursorHandle",
        "textToolbarState$delegate",
        "getTextToolbarState",
        "()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;",
        "setTextToolbarState",
        "(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V",
        "Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "previousSelectionLayout",
        "Landroidx/compose/foundation/text/selection/SelectionLayout;",
        "previousRawDragOffset",
        "I",
        "cursorHandle$delegate",
        "Landroidx/compose/runtime/State;",
        "getCursorHandle",
        "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;",
        "cursorHandle",
        "cursorHandleInBounds$delegate",
        "getCursorHandleInBounds",
        "cursorHandleInBounds",
        "cursorRect$delegate",
        "getCursorRect",
        "()Landroidx/compose/ui/geometry/Rect;",
        "cursorRect",
        "startSelectionHandle$delegate",
        "getStartSelectionHandle",
        "startSelectionHandle",
        "endSelectionHandle$delegate",
        "getEndSelectionHandle",
        "endSelectionHandle",
        "getCurrentContentVisibleOffset-F1C5BW0",
        "currentContentVisibleOffset",
        "Landroidx/compose/ui/layout/LayoutCoordinates;",
        "getTextLayoutCoordinates",
        "()Landroidx/compose/ui/layout/LayoutCoordinates;",
        "textLayoutCoordinates",
        "getEditable",
        "editable",
        "getHandleDragPosition-F1C5BW0",
        "handleDragPosition",
        "<init>",
        "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V",
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
        "SMAP\nTextFieldSelectionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1235:1\n81#2:1236\n107#2,2:1237\n81#2:1239\n107#2,2:1240\n81#2:1242\n107#2,2:1243\n81#2:1245\n107#2,2:1246\n81#2:1248\n107#2,2:1249\n81#2:1251\n107#2,2:1252\n81#2:1255\n81#2:1256\n81#2:1257\n81#2:1258\n81#2:1259\n1#3:1254\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionState.kt\nandroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState\n*L\n99#1:1236\n99#1:1237,2\n110#1:1239\n110#1:1240,2\n132#1:1242\n132#1:1243,2\n164#1:1245\n164#1:1246,2\n169#1:1248\n169#1:1249,2\n175#1:1251\n175#1:1252,2\n206#1:1255\n239#1:1256\n254#1:1257\n285#1:1258\n289#1:1259\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final cursorHandle$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final cursorHandleInBounds$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final cursorRect$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private density:Landroidx/compose/ui/unit/Density;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final draggingHandle$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private enabled:Z

.field private final endSelectionHandle$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private isFocused:Z

.field private final isInTouchMode$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private previousRawDragOffset:I

.field private previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final rawHandleDragPosition$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private readOnly:Z

.field private final showCursorHandle$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final startContentVisibleOffset$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final startSelectionHandle$delegate:Landroidx/compose/runtime/State;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private textToolbar:Landroidx/compose/ui/platform/TextToolbar;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final textToolbarState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/ui/unit/Density;ZZZ)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/internal/TextLayoutState;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->density:Landroidx/compose/ui/unit/Density;

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->enabled:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->readOnly:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isFocused:Z

    .line 15
    .line 16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/4 p3, 0x2

    .line 20
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isInTouchMode$delegate:Landroidx/compose/runtime/MutableState;

    .line 25
    .line 26
    sget-object p1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 29
    .line 30
    .line 31
    move-result-wide p4

    .line 32
    invoke-static {p4, p5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    invoke-static {p4, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->startContentVisibleOffset$delegate:Landroidx/compose/runtime/MutableState;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 43
    .line 44
    .line 45
    move-result-wide p4

    .line 46
    invoke-static {p4, p5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->rawHandleDragPosition$delegate:Landroidx/compose/runtime/MutableState;

    .line 55
    .line 56
    invoke-static {p2, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

    .line 61
    .line 62
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->showCursorHandle$delegate:Landroidx/compose/runtime/MutableState;

    .line 69
    .line 70
    sget-object p1, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 71
    .line 72
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbarState$delegate:Landroidx/compose/runtime/MutableState;

    .line 77
    .line 78
    const/4 p1, -0x1

    .line 79
    iput p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    .line 80
    .line 81
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandle$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorHandle$delegate:Landroidx/compose/runtime/State;

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2;

    .line 97
    .line 98
    invoke-direct {p2, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleInBounds$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p2}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lv3/a;)Landroidx/compose/runtime/State;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorHandleInBounds$delegate:Landroidx/compose/runtime/State;

    .line 106
    .line 107
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorRect$2;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorRect$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorRect$delegate:Landroidx/compose/runtime/State;

    .line 117
    .line 118
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$startSelectionHandle$2;

    .line 119
    .line 120
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$startSelectionHandle$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->startSelectionHandle$delegate:Landroidx/compose/runtime/State;

    .line 128
    .line 129
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$endSelectionHandle$2;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$endSelectionHandle$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lv3/a;)Landroidx/compose/runtime/State;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->endSelectionHandle$delegate:Landroidx/compose/runtime/State;

    .line 139
    .line 140
    return-void
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
.end method

.method public static final synthetic access$clearHandleDragging(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clearHandleDragging()V

    return-void
.end method

.method public static final synthetic access$detectCursorHandleDragGestures(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectCursorHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$detectCursorHandleDragGestures$onDragStop(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectCursorHandleDragGestures$onDragStop(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    return-void
.end method

.method public static final synthetic access$detectSelectionHandleDragGestures(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    return-void
.end method

.method public static final synthetic access$detectTextFieldLongPressAndAfterDrag(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTextFieldLongPressAndAfterDrag(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$detectTextFieldLongPressAndAfterDrag$onDragStop$1(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$g;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTextFieldLongPressAndAfterDrag$onDragStop$1(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$g;)V

    return-void
.end method

.method public static final synthetic access$detectTextFieldTapGestures(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTextFieldTapGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$detectTouchMode(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectTouchMode(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContentRect(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/ui/geometry/Rect;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getContentRect()Landroidx/compose/ui/geometry/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCursorHandleInBounds(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorHandleInBounds()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getDensity$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/ui/unit/Density;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->density:Landroidx/compose/ui/unit/Density;

    return-object p0
.end method

.method public static final synthetic access$getEditable(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getEditable()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getHandlePosition-tuRUvjQ(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)J
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandlePosition-tuRUvjQ(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$getHapticFeedBack$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/ui/hapticfeedback/HapticFeedback;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    return-object p0
.end method

.method public static final synthetic access$getSelectionHandleState(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getSelectionHandleState(Z)Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Z
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getShowCursorHandle()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getTextFieldState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    return-object p0
.end method

.method public static final synthetic access$getTextLayoutCoordinates(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTextLayoutState$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/TextLayoutState;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    return-object p0
.end method

.method public static final synthetic access$getTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextToolbarState()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$hideTextToolbar(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hideTextToolbar()V

    return-void
.end method

.method public static final synthetic access$markStartContentVisibleOffset(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->markStartContentVisibleOffset()V

    return-void
.end method

.method public static final synthetic access$observeTextChanges(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->observeTextChanges(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observeTextToolbarVisibility(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->observeTextToolbarVisibility(Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setInTouchMode(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setInTouchMode(Z)V

    return-void
.end method

.method public static final synthetic access$setPreviousRawDragOffset$p(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;I)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    return-void
.end method

.method public static final synthetic access$setShowCursorHandle(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setShowCursorHandle(Z)V

    return-void
.end method

.method public static final synthetic access$setTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    return-void
.end method

.method public static final synthetic access$showTextToolbar(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->showTextToolbar(Landroidx/compose/ui/geometry/Rect;)V

    return-void
.end method

.method public static final synthetic access$updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text/Handle;J)V

    return-void
.end method

.method public static final synthetic access$updateSelection-QNhciaU(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateSelection-QNhciaU(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J

    move-result-wide p0

    return-wide p0
.end method

.method private final clearHandleDragging()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V

    .line 3
    .line 4
    .line 5
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-direct {p0, v1, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setRawHandleDragPosition-k-4lQ0M(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setStartContentVisibleOffset-k-4lQ0M(J)V

    .line 19
    .line 20
    .line 21
    return-void
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
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->copy(Z)V

    return-void
.end method

.method private final detectCursorHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    move-object v6, v0

    .line 26
    iget-object p2, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v1, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->label:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlin/jvm/internal/k1$g;

    .line 42
    .line 43
    iget-object v0, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/k1$g;

    .line 46
    .line 47
    iget-object v1, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p2

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    invoke-static {p2}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Lkotlin/jvm/internal/k1$g;

    .line 69
    .line 70
    invoke-direct {p2}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    iput-wide v3, p2, Lkotlin/jvm/internal/k1$g;->element:J

    .line 80
    .line 81
    new-instance v7, Lkotlin/jvm/internal/k1$g;

    .line 82
    .line 83
    invoke-direct {v7}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    iput-wide v3, v7, Lkotlin/jvm/internal/k1$g;->element:J

    .line 91
    .line 92
    :try_start_1
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;

    .line 93
    .line 94
    invoke-direct {v3, p2, p0, v7}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$2;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 95
    .line 96
    .line 97
    new-instance v4, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$3;

    .line 98
    .line 99
    invoke-direct {v4, p2, v7, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$3;-><init>(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 100
    .line 101
    .line 102
    new-instance v5, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$4;

    .line 103
    .line 104
    invoke-direct {v5, p2, v7, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$4;-><init>(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 105
    .line 106
    .line 107
    new-instance v8, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$5;

    .line 108
    .line 109
    invoke-direct {v8, v7, p0, p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$5;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 110
    .line 111
    .line 112
    iput-object p0, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$0:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object p2, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$1:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v7, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->L$2:Ljava/lang/Object;

    .line 117
    .line 118
    iput v2, v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectCursorHandleDragGestures$1;->label:I

    .line 119
    .line 120
    move-object v1, p1

    .line 121
    move-object v2, v3

    .line 122
    move-object v3, v4

    .line 123
    move-object v4, v5

    .line 124
    move-object v5, v8

    .line 125
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    if-ne p1, v0, :cond_3

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_3
    move-object v1, p0

    .line 133
    move-object v0, p2

    .line 134
    move-object p1, v7

    .line 135
    :goto_1
    invoke-static {v0, p1, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectCursorHandleDragGestures$onDragStop(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 139
    .line 140
    return-object p1

    .line 141
    :catchall_1
    move-exception p1

    .line 142
    move-object v1, p0

    .line 143
    move-object v0, p2

    .line 144
    move-object p2, p1

    .line 145
    move-object p1, v7

    .line 146
    :goto_2
    invoke-static {v0, p1, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectCursorHandleDragGestures$onDragStop(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 147
    .line 148
    .line 149
    throw p2
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

.method private static final detectCursorHandleDragGestures$onDragStop(Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iput-wide v1, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p1, Lkotlin/jvm/internal/k1$g;->element:J

    .line 22
    .line 23
    invoke-direct {p2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clearHandleDragging()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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

.method private final detectSelectionHandleDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Z",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;

    .line 11
    .line 12
    iget v2, v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->label:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;

    .line 25
    .line 26
    invoke-direct {v1, v7, v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    move-object v13, v1

    .line 30
    iget-object v0, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->result:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v14

    .line 36
    iget v1, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->label:I

    .line 37
    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    if-ne v1, v8, :cond_1

    .line 42
    .line 43
    iget-object v1, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$3:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroidx/compose/foundation/text/Handle;

    .line 46
    .line 47
    iget-object v2, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$2:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lkotlin/jvm/internal/k1$g;

    .line 50
    .line 51
    iget-object v3, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$1:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Lkotlin/jvm/internal/k1$g;

    .line 54
    .line 55
    iget-object v4, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v4, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 58
    .line 59
    :try_start_0
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 68
    .line 69
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0

    .line 75
    :cond_2
    invoke-static {v0}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    new-instance v15, Lkotlin/jvm/internal/k1$g;

    .line 79
    .line 80
    invoke-direct {v15}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 84
    .line 85
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    iput-wide v1, v15, Lkotlin/jvm/internal/k1$g;->element:J

    .line 90
    .line 91
    new-instance v12, Lkotlin/jvm/internal/k1$g;

    .line 92
    .line 93
    invoke-direct {v12}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    iput-wide v0, v12, Lkotlin/jvm/internal/k1$g;->element:J

    .line 101
    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    .line 108
    .line 109
    :goto_1
    move-object v11, v0

    .line 110
    :try_start_1
    new-instance v9, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$2;

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    if-eqz p2, :cond_4

    .line 114
    .line 115
    move v4, v8

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move v4, v0

    .line 118
    :goto_2
    move-object v1, v9

    .line 119
    move-object v2, v15

    .line 120
    move-object/from16 v3, p0

    .line 121
    .line 122
    move-object v5, v11

    .line 123
    move-object v6, v12

    .line 124
    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$2;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZLandroidx/compose/foundation/text/Handle;Lkotlin/jvm/internal/k1$g;)V

    .line 125
    .line 126
    .line 127
    new-instance v10, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;

    .line 128
    .line 129
    invoke-direct {v10, v15, v7, v12}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$3;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 130
    .line 131
    .line 132
    new-instance v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$4;

    .line 133
    .line 134
    invoke-direct {v6, v15, v7, v12}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$4;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 135
    .line 136
    .line 137
    new-instance v16, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;

    .line 138
    .line 139
    if-eqz p2, :cond_5

    .line 140
    .line 141
    move v0, v8

    .line 142
    :cond_5
    move-object/from16 v1, v16

    .line 143
    .line 144
    move-object v2, v12

    .line 145
    move-object/from16 v3, p0

    .line 146
    .line 147
    move-object v4, v11

    .line 148
    move-object v5, v15

    .line 149
    move-object/from16 v17, v6

    .line 150
    .line 151
    move v6, v0

    .line 152
    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$5;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;Lkotlin/jvm/internal/k1$g;Z)V

    .line 153
    .line 154
    .line 155
    iput-object v7, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$0:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v15, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$1:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v12, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$2:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v11, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->L$3:Ljava/lang/Object;

    .line 162
    .line 163
    iput v8, v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$1;->label:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 164
    .line 165
    move-object/from16 v8, p1

    .line 166
    .line 167
    move-object v1, v11

    .line 168
    move-object/from16 v11, v17

    .line 169
    .line 170
    move-object v2, v12

    .line 171
    move-object/from16 v12, v16

    .line 172
    .line 173
    :try_start_2
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 177
    if-ne v0, v14, :cond_6

    .line 178
    .line 179
    return-object v14

    .line 180
    :cond_6
    move-object v4, v7

    .line 181
    move-object v3, v15

    .line 182
    :goto_3
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$6;

    .line 183
    .line 184
    invoke-direct {v0, v4, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$6;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-ne v0, v1, :cond_7

    .line 195
    .line 196
    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 200
    .line 201
    return-object v0

    .line 202
    :catchall_1
    move-exception v0

    .line 203
    goto :goto_4

    .line 204
    :catchall_2
    move-exception v0

    .line 205
    move-object v1, v11

    .line 206
    move-object v2, v12

    .line 207
    :goto_4
    move-object v4, v7

    .line 208
    move-object v3, v15

    .line 209
    :goto_5
    new-instance v5, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$6;

    .line 210
    .line 211
    invoke-direct {v5, v4, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectSelectionHandleDragGestures$6;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/Handle;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v5}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionStateKt;->access$logDebug(Lv3/a;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    if-ne v5, v1, :cond_8

    .line 222
    .line 223
    invoke-static {v3, v4, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V

    .line 224
    .line 225
    .line 226
    :cond_8
    throw v0
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
.end method

.method private static final detectSelectionHandleDragGestures$onDragStop$2(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clearHandleDragging()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iput-wide v1, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p2, Lkotlin/jvm/internal/k1$g;->element:J

    .line 25
    .line 26
    const/4 p0, -0x1

    .line 27
    iput p0, p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    .line 28
    .line 29
    :cond_0
    return-void
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

.method private final detectTextFieldLongPressAndAfterDrag(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object v7, p0

    .line 2
    new-instance v8, Lkotlin/jvm/internal/k1$f;

    .line 3
    .line 4
    invoke-direct {v8}, Lkotlin/jvm/internal/k1$f;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, v8, Lkotlin/jvm/internal/k1$f;->element:I

    .line 9
    .line 10
    new-instance v9, Lkotlin/jvm/internal/k1$g;

    .line 11
    .line 12
    invoke-direct {v9}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, v9, Lkotlin/jvm/internal/k1$g;->element:J

    .line 22
    .line 23
    new-instance v10, Lkotlin/jvm/internal/k1$g;

    .line 24
    .line 25
    invoke-direct {v10}, Lkotlin/jvm/internal/k1$g;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iput-wide v0, v10, Lkotlin/jvm/internal/k1$g;->element:J

    .line 33
    .line 34
    new-instance v11, Lkotlin/jvm/internal/k1$h;

    .line 35
    .line 36
    invoke-direct {v11}, Lkotlin/jvm/internal/k1$h;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    .line 40
    .line 41
    iput-object v0, v11, Lkotlin/jvm/internal/k1$h;->element:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v12, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;

    .line 44
    .line 45
    move-object v0, v12

    .line 46
    move-object/from16 v1, p2

    .line 47
    .line 48
    move-object v2, p0

    .line 49
    move-object v3, v11

    .line 50
    move-object v4, v9

    .line 51
    move-object v5, v10

    .line 52
    move-object v6, v8

    .line 53
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$2;-><init>(Lv3/a;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$h;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$f;)V

    .line 54
    .line 55
    .line 56
    new-instance v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$3;

    .line 57
    .line 58
    invoke-direct {v6, v9, p0, v8, v10}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$3;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$g;)V

    .line 59
    .line 60
    .line 61
    new-instance v13, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4;

    .line 62
    .line 63
    invoke-direct {v13, v9, p0, v8, v10}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$4;-><init>(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$g;)V

    .line 64
    .line 65
    .line 66
    new-instance v14, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;

    .line 67
    .line 68
    move-object v0, v14

    .line 69
    move-object v1, p0

    .line 70
    move-object v2, v10

    .line 71
    move-object v3, v9

    .line 72
    move-object v4, v8

    .line 73
    move-object v5, v11

    .line 74
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldLongPressAndAfterDrag$5;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$g;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$h;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    move-object v2, v12

    .line 80
    move-object v3, v6

    .line 81
    move-object v4, v13

    .line 82
    move-object v5, v14

    .line 83
    move-object/from16 v6, p3

    .line 84
    .line 85
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGesturesAfterLongPress(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/l;Lv3/a;Lv3/a;Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne v0, v1, :cond_0

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_0
    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    .line 97
    .line 98
    return-object v0
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

.method private static final detectTextFieldLongPressAndAfterDrag$onDragStop$1(Lkotlin/jvm/internal/k1$g;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/jvm/internal/k1$f;Lkotlin/jvm/internal/k1$g;)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isSpecified-k-4lQ0M(J)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clearHandleDragging()V

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    iput v0, p2, Lkotlin/jvm/internal/k1$f;->element:I

    .line 14
    .line 15
    sget-object p2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 16
    .line 17
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    iput-wide v1, p0, Lkotlin/jvm/internal/k1$g;->element:J

    .line 22
    .line 23
    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iput-wide v1, p3, Lkotlin/jvm/internal/k1$g;->element:J

    .line 28
    .line 29
    iput v0, p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    .line 30
    .line 31
    :cond_0
    return-void
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
.end method

.method private final detectTextFieldTapGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;

    invoke-direct {v0, p2, p0, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$2;-><init>(Lv3/a;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lv3/a;)V

    new-instance p2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;

    invoke-direct {p2, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTextFieldTapGestures$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    invoke-static {p1, v0, p2, p4}, Landroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt;->detectTapAndDoubleTap(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method private final detectTouchMode(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$detectTouchMode$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    invoke-interface {p1, v0, p2}, Landroidx/compose/ui/input/pointer/PointerInputScope;->awaitPointerEventScope(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method private final getContentRect()Landroidx/compose/ui/geometry/Rect;
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorRect()Landroidx/compose/ui/geometry/Rect;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-interface {v0, v1, v2}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCursorRect()Landroidx/compose/ui/geometry/Rect;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Rect;->getSize-NH-jbRc()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/RectKt;->Rect-tz77jQw(JJ)Landroidx/compose/ui/geometry/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {p0, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandlePosition-tuRUvjQ(Z)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    invoke-interface {v1, v2, v3}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    sget-object v1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 72
    .line 73
    invoke-virtual {v1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    :goto_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-direct {p0, v4}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandlePosition-tuRUvjQ(Z)J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    invoke-interface {v3, v4, v5}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    goto :goto_2

    .line 93
    :cond_3
    sget-object v3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 94
    .line 95
    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    :goto_2
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const/4 v6, 0x0

    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    iget-object v7, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 107
    .line 108
    invoke-virtual {v7}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    if-eqz v7, :cond_4

    .line 113
    .line 114
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    invoke-static {v8, v9}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-eqz v7, :cond_4

    .line 127
    .line 128
    invoke-virtual {v7}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    goto :goto_3

    .line 133
    :cond_4
    move v7, v6

    .line 134
    :goto_3
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    invoke-interface {v5, v7, v8}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v7

    .line 142
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    goto :goto_4

    .line 147
    :cond_5
    move v5, v6

    .line 148
    :goto_4
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    if-eqz v7, :cond_7

    .line 153
    .line 154
    iget-object v8, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 155
    .line 156
    invoke-virtual {v8}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    if-eqz v8, :cond_6

    .line 161
    .line 162
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 163
    .line 164
    .line 165
    move-result-wide v9

    .line 166
    invoke-static {v9, v10}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {v8, v0}, Landroidx/compose/ui/text/TextLayoutResult;->getCursorRect(I)Landroidx/compose/ui/geometry/Rect;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTop()F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    goto :goto_5

    .line 181
    :cond_6
    move v0, v6

    .line 182
    :goto_5
    invoke-static {v6, v0}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    .line 183
    .line 184
    .line 185
    move-result-wide v8

    .line 186
    invoke-interface {v7, v8, v9}, Landroidx/compose/ui/layout/LayoutCoordinates;->localToRoot-MK-Hz9U(J)J

    .line 187
    .line 188
    .line 189
    move-result-wide v6

    .line 190
    invoke-static {v6, v7}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    :cond_7
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getX-impl(J)F

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->getY-impl(J)F

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    new-instance v2, Landroidx/compose/ui/geometry/Rect;

    .line 235
    .line 236
    invoke-direct {v2, v0, v5, v7, v1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 237
    .line 238
    .line 239
    return-object v2
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
.end method

.method private final getCurrentContentVisibleOffset-F1C5BW0()J
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    :goto_0
    return-wide v0
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

.method private final getCursorHandleInBounds()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorHandleInBounds$delegate:Landroidx/compose/runtime/State;

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

.method private final getEditable()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->enabled:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->readOnly:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final getHandlePosition-tuRUvjQ(Z)J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :goto_0
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v0, v3, p1, v1}, Landroidx/compose/foundation/text/selection/TextSelectionDelegateKt;->getSelectionHandleCoordinates(Landroidx/compose/ui/text/TextLayoutResult;IZZ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0
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
.end method

.method private final getRawHandleDragPosition-F1C5BW0()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->rawHandleDragPosition$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final getSelectionHandleState(Z)Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 13

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionStart:Landroidx/compose/foundation/text/Handle;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Landroidx/compose/foundation/text/Handle;->SelectionEnd:Landroidx/compose/foundation/text/Handle;

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->Companion:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;->getHidden()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    sget-object p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->Companion:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;->getHidden()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getHandlePosition-tuRUvjQ(Z)J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getDraggingHandle()Landroidx/compose/foundation/text/Handle;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const/4 v7, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-eq v6, v0, :cond_5

    .line 57
    .line 58
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-static {v0}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-static {v0, v4, v5}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->containsInclusive-Uv8p0NA(Landroidx/compose/ui/geometry/Rect;J)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v0, v8

    .line 76
    :goto_1
    if-eqz v0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move v0, v8

    .line 80
    goto :goto_3

    .line 81
    :cond_5
    :goto_2
    move v0, v7

    .line 82
    :goto_3
    if-nez v0, :cond_6

    .line 83
    .line 84
    sget-object p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;->Companion:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState$Companion;->getHidden()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_6
    if-eqz p1, :cond_7

    .line 92
    .line 93
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    goto :goto_4

    .line 98
    :cond_7
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    sub-int/2addr p1, v7

    .line 103
    invoke-static {p1, v8}, Ljava/lang/Math;->max(II)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    :goto_4
    invoke-virtual {v1, p1}, Landroidx/compose/ui/text/TextLayoutResult;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-static {v2, v3}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_8

    .line 120
    .line 121
    invoke-static {p1}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    invoke-static {v4, v5, p1}, Landroidx/compose/foundation/text2/input/internal/TextLayoutStateKt;->coerceIn-3MmeM6k(JLandroidx/compose/ui/geometry/Rect;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    :cond_8
    move-wide v8, v4

    .line 132
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

    .line 133
    .line 134
    const/4 v7, 0x1

    .line 135
    const/4 v12, 0x0

    .line 136
    move-object v6, p1

    .line 137
    invoke-direct/range {v6 .. v12}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;-><init>(ZJLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLkotlin/jvm/internal/w;)V

    .line 138
    .line 139
    .line 140
    return-object p1
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

.method private final getShowCursorHandle()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->showCursorHandle$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final getStartContentVisibleOffset-F1C5BW0()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->startContentVisibleOffset$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final getTextFieldSelection-qeG_v_k(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getLayoutResult()Landroidx/compose/ui/text/TextLayoutResult;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1

    .line 16
    :cond_0
    if-nez p3, :cond_1

    .line 17
    .line 18
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->Companion:Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;->getCharacter()Landroidx/compose/foundation/text/selection/SelectionAdjustment;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l0;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    return-wide p1

    .line 35
    :cond_1
    iget v4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    .line 36
    .line 37
    if-eqz p3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p3}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object v0, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    :goto_0
    move-wide v5, v2

    .line 51
    if-nez p3, :cond_3

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const/4 v0, 0x0

    .line 56
    :goto_1
    move v7, v0

    .line 57
    move v2, p1

    .line 58
    move v3, p2

    .line 59
    move v8, p4

    .line 60
    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/text/selection/SelectionLayoutKt;->getTextFieldSelectionLayout-RcvT-LA(Landroidx/compose/ui/text/TextLayoutResult;IIIJZZ)Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz p3, :cond_4

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 67
    .line 68
    invoke-interface {v0, v1}, Landroidx/compose/foundation/text/selection/SelectionLayout;->shouldRecomputeSelection(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p3}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 75
    .line 76
    .line 77
    move-result-wide p1

    .line 78
    return-wide p1

    .line 79
    :cond_4
    invoke-interface {p5, v0}, Landroidx/compose/foundation/text/selection/SelectionAdjustment;->adjust(Landroidx/compose/foundation/text/selection/SelectionLayout;)Landroidx/compose/foundation/text/selection/Selection;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    invoke-virtual {p3}, Landroidx/compose/foundation/text/selection/Selection;->toTextRange-d9O1mEE()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousSelectionLayout:Landroidx/compose/foundation/text/selection/SelectionLayout;

    .line 88
    .line 89
    if-eqz p4, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    move p1, p2

    .line 93
    :goto_2
    iput p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->previousRawDragOffset:I

    .line 94
    .line 95
    return-wide v1
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

.method private final getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TextLayoutState;->getTextLayoutNodeCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method private final getTextToolbarState()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbarState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

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

.method private final hideTextToolbar()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->getStatus()Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    sget-object v1, Landroidx/compose/ui/platform/TextToolbarStatus;->Shown:Landroidx/compose/ui/platform/TextToolbarStatus;

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Landroidx/compose/ui/platform/TextToolbar;->hide()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
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
.end method

.method private final markStartContentVisibleOffset()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextLayoutCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/compose/foundation/text/selection/SelectionManagerKt;->visibleBounds(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Rect;->getTopLeft-F1C5BW0()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    :goto_0
    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setStartContentVisibleOffset-k-4lQ0M(J)V

    .line 25
    .line 26
    .line 27
    return-void
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

.method private final observeTextChanges(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
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

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lv3/a;)Lkotlinx/coroutines/flow/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$3;->INSTANCE:Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$3;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/k;->h0(Lkotlinx/coroutines/flow/i;Lv3/p;)Lkotlinx/coroutines/flow/i;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/k;->j0(Lkotlinx/coroutines/flow/i;I)Lkotlinx/coroutines/flow/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextChanges$4;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/i;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-ne p1, v0, :cond_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 38
    .line 39
    return-object p1
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
.end method

.method private final observeTextToolbarVisibility(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
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

    .line 1
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lv3/a;)Lkotlinx/coroutines/flow/i;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$3;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeTextToolbarVisibility$3;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/i;->collect(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 27
    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method private final setInTouchMode(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isInTouchMode$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setRawHandleDragPosition-k-4lQ0M(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->rawHandleDragPosition$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setShowCursorHandle(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->showCursorHandle$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setStartContentVisibleOffset-k-4lQ0M(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->startContentVisibleOffset$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final setTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbarState$delegate:Landroidx/compose/runtime/MutableState;

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

.method private final showTextToolbar(Landroidx/compose/ui/geometry/Rect;)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getEditable()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v2}, Landroidx/compose/ui/platform/ClipboardManager;->hasText()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v5, 0x1

    .line 28
    if-ne v2, v5, :cond_0

    .line 29
    .line 30
    move v4, v5

    .line 31
    :cond_0
    if-eqz v4, :cond_1

    .line 32
    .line 33
    new-instance v2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$paste$1;

    .line 34
    .line 35
    invoke-direct {v2, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$paste$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 36
    .line 37
    .line 38
    move-object v7, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v7, v3

    .line 41
    :goto_0
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    new-instance v2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$copy$1;

    .line 48
    .line 49
    invoke-direct {v2, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$copy$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 50
    .line 51
    .line 52
    move-object v6, v2

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v6, v3

    .line 55
    :goto_1
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getEditable()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    new-instance v2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$cut$1;

    .line 68
    .line 69
    invoke-direct {v2, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$cut$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 70
    .line 71
    .line 72
    move-object v8, v2

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v8, v3

    .line 75
    :goto_2
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getLength-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eq v0, v1, :cond_4

    .line 90
    .line 91
    new-instance v3, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$selectAll$1;

    .line 92
    .line 93
    invoke-direct {v3, p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$showTextToolbar$selectAll$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    move-object v9, v3

    .line 97
    iget-object v4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 98
    .line 99
    if-eqz v4, :cond_5

    .line 100
    .line 101
    move-object v5, p1

    .line 102
    invoke-interface/range {v4 .. v9}, Landroidx/compose/ui/platform/TextToolbar;->showMenu(Landroidx/compose/ui/geometry/Rect;Lv3/a;Lv3/a;Lv3/a;Lv3/a;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void
    .line 106
.end method

.method private final updateHandleDragging-Uv8p0NA(Landroidx/compose/foundation/text/Handle;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setRawHandleDragPosition-k-4lQ0M(J)V

    .line 5
    .line 6
    .line 7
    return-void
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

.method private final updateSelection-QNhciaU(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J
    .locals 11

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->box-impl(J)Landroidx/compose/ui/text/TextRange;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextRange;->unbox-impl()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-nez p6, :cond_1

    .line 16
    .line 17
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v1, v4

    .line 27
    :goto_1
    if-eqz v1, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_2
    move-object v8, v0

    .line 32
    move-object v5, p0

    .line 33
    move v6, p2

    .line 34
    move v7, p3

    .line 35
    move v9, p4

    .line 36
    move-object/from16 v10, p5

    .line 37
    .line 38
    invoke-direct/range {v5 .. v10}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextFieldSelection-qeG_v_k(IILandroidx/compose/ui/text/TextRange;ZLandroidx/compose/foundation/text/selection/SelectionAdjustment;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-static {v0, v1, v5, v6}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    return-wide v0

    .line 53
    :cond_3
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    invoke-static {v5, v6}, Landroidx/compose/ui/text/TextRange;->getReversed-impl(J)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eq v2, v5, :cond_4

    .line 66
    .line 67
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getEnd-impl(J)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getStart-impl(J)I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-static {v2, v5}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    invoke-interface {p1}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-static {v5, v6, v7, v8}, Landroidx/compose/ui/text/TextRange;->equals-impl0(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    move v3, v4

    .line 90
    :cond_4
    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isInTouchMode()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_5

    .line 95
    .line 96
    if-nez v3, :cond_5

    .line 97
    .line 98
    move-object v2, p0

    .line 99
    iget-object v3, v2, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 100
    .line 101
    if-eqz v3, :cond_6

    .line 102
    .line 103
    sget-object v4, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;->Companion:Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;

    .line 104
    .line 105
    invoke-virtual {v4}, Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;->getTextHandleMove-5zf0vsI()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-interface {v3, v4}, Landroidx/compose/ui/hapticfeedback/HapticFeedback;->performHapticFeedback-CdsT49E(I)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    move-object v2, p0

    .line 114
    :cond_6
    :goto_3
    return-wide v0
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
.end method

.method static synthetic updateSelection-QNhciaU$default(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;ZILjava/lang/Object;)J
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateSelection-QNhciaU(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;IIZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final copy(Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->getSelectedText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x6

    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v2, v8

    .line 37
    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v8}, Landroidx/compose/ui/platform/ClipboardManager;->setText(Landroidx/compose/ui/text/AnnotatedString;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-nez p1, :cond_2

    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->collapseSelectionToMax()V

    .line 49
    .line 50
    .line 51
    return-void
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

.method public final cursorHandleGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleGestures$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$cursorHandleGestures$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/d;)V

    invoke-static {v0, p2}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final cut()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v8, Landroidx/compose/ui/text/AnnotatedString;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequenceKt;->getSelectedText(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x6

    .line 35
    const/4 v7, 0x0

    .line 36
    move-object v2, v8

    .line 37
    invoke-direct/range {v2 .. v7}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/w;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v8}, Landroidx/compose/ui/platform/ClipboardManager;->setText(Landroidx/compose/ui/text/AnnotatedString;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->deleteSelectedText()V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public final deselect()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/foundation/text2/input/TextFieldCharSequence;->getSelectionInChars-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->collapseSelectionToEnd()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    invoke-direct {p0, v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setShowCursorHandle(Z)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    .line 29
    .line 30
    .line 31
    return-void
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

.method public final dispose()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hideTextToolbar()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 8
    .line 9
    iput-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
.end method

.method public final getCursorHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorHandle$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

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

.method public final getCursorRect()Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->cursorRect$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/geometry/Rect;

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

.method public final getDraggingHandle()Landroidx/compose/foundation/text/Handle;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text/Handle;

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

.method public final getEndSelectionHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->endSelectionHandle$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

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

.method public final getHandleDragPosition-F1C5BW0()J
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getRawHandleDragPosition-F1C5BW0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isUnspecified-k-4lQ0M(J)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Offset$Companion;->getUnspecified-F1C5BW0()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getStartContentVisibleOffset-F1C5BW0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->isUnspecified-k-4lQ0M(J)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textLayoutState:Landroidx/compose/foundation/text2/input/internal/TextLayoutState;

    .line 29
    .line 30
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getRawHandleDragPosition-F1C5BW0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/text2/input/internal/TextLayoutStateKt;->fromDecorationToTextLayout-Uv8p0NA(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getRawHandleDragPosition-F1C5BW0()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getCurrentContentVisibleOffset-F1C5BW0()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getStartContentVisibleOffset-F1C5BW0()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    :goto_0
    return-wide v0
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

.method public final getStartSelectionHandle()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->startSelectionHandle$delegate:Landroidx/compose/runtime/State;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldHandleState;

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

.method public final isFocused()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isFocused:Z

    return v0
.end method

.method public final isInTouchMode()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isInTouchMode$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final observeChanges(Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
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

    .annotation build Lp4/m;
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p1}, Lkotlin/e1;->n(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    new-instance p1, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$2;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {p1, p0, v2}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/d;)V

    .line 64
    .line 65
    .line 66
    iput-object p0, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v4, v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$observeChanges$1;->label:I

    .line 69
    .line 70
    invoke-static {p1, v0}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v0, p0

    .line 78
    :goto_1
    invoke-direct {v0, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setShowCursorHandle(Z)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextToolbarState()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object v1, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 86
    .line 87
    if-eq p1, v1, :cond_4

    .line 88
    .line 89
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hideTextToolbar()V

    .line 90
    .line 91
    .line 92
    :cond_4
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    .line 93
    .line 94
    return-object p1

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    move-object v0, p0

    .line 97
    :goto_2
    invoke-direct {v0, v3}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setShowCursorHandle(Z)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->getTextToolbarState()Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    sget-object v2, Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;->None:Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;

    .line 105
    .line 106
    if-eq v1, v2, :cond_5

    .line 107
    .line 108
    invoke-direct {v0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hideTextToolbar()V

    .line 109
    .line 110
    .line 111
    :cond_5
    throw p1
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

.method public final paste()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/platform/ClipboardManager;->getText()Landroidx/compose/ui/text/AnnotatedString;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textFieldState:Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    sget-object v4, Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;->NeverMerge:Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;->replaceSelectedText$default(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-void
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

.method public final selectionHandleGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 2
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
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
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Z",
            "Lkotlin/coroutines/d<",
            "-",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lp4/m;
    .end annotation

    new-instance v0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$selectionHandleGestures$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;ZLkotlin/coroutines/d;)V

    invoke-static {v0, p3}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final setDraggingHandle(Landroidx/compose/foundation/text/Handle;)V
    .locals 1
    .param p1    # Landroidx/compose/foundation/text/Handle;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->draggingHandle$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final setFocused(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->isFocused:Z

    return-void
.end method

.method public final textFieldGestures(Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)Ljava/lang/Object;
    .locals 7
    .param p1    # Landroidx/compose/ui/input/pointer/PointerInputScope;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/d;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;",
            "Lv3/a<",
            "Lkotlin/r2;",
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

    new-instance v6, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$textFieldGestures$2;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState$textFieldGestures$2;-><init>(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/input/pointer/PointerInputScope;Lv3/a;Lv3/a;Lkotlin/coroutines/d;)V

    invoke-static {v6, p4}, Lkotlinx/coroutines/t0;->g(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/b;->l()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final update(Landroidx/compose/ui/hapticfeedback/HapticFeedback;Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/ui/platform/TextToolbar;Landroidx/compose/ui/unit/Density;ZZ)V
    .locals 0
    .param p1    # Landroidx/compose/ui/hapticfeedback/HapticFeedback;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/platform/ClipboardManager;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/ui/platform/TextToolbar;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/unit/Density;
        .annotation build Lp4/l;
        .end annotation
    .end param

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hideTextToolbar()V

    .line 4
    .line 5
    .line 6
    :cond_0
    iput-object p1, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->hapticFeedBack:Landroidx/compose/ui/hapticfeedback/HapticFeedback;

    .line 7
    .line 8
    iput-object p2, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->clipboardManager:Landroidx/compose/ui/platform/ClipboardManager;

    .line 9
    .line 10
    iput-object p3, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->textToolbar:Landroidx/compose/ui/platform/TextToolbar;

    .line 11
    .line 12
    iput-object p4, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->density:Landroidx/compose/ui/unit/Density;

    .line 13
    .line 14
    iput-boolean p5, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->enabled:Z

    .line 15
    .line 16
    iput-boolean p6, p0, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->readOnly:Z

    .line 17
    .line 18
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
.end method

.method public final updateTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V
    .locals 0
    .param p1    # Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;->setTextToolbarState(Landroidx/compose/foundation/text2/input/internal/selection/TextToolbarState;)V

    return-void
.end method
