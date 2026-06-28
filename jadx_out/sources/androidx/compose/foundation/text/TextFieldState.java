package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001Jl\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010>\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R1\u0010E\u001a\u00020?2\u0006\u00107\u001a\u00020?8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b@\u00109\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00109R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010W\u001a\u00020Q2\u0006\u00107\u001a\u00020Q8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u00109\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR+\u0010[\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bX\u00109\u001a\u0004\bY\u0010;\"\u0004\bZ\u0010=R+\u0010_\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u00109\u001a\u0004\b]\u0010;\"\u0004\b^\u0010=R+\u0010c\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b`\u00109\u001a\u0004\ba\u0010;\"\u0004\bb\u0010=R+\u0010g\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bd\u00109\u001a\u0004\be\u0010;\"\u0004\bf\u0010=R$\u0010h\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bh\u0010;R+\u0010k\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u00109\u001a\u0004\bk\u0010;\"\u0004\bl\u0010=R\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010q\u001a\u0004\br\u0010sR#\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\bu\u0010q\u001a\u0004\bv\u0010sR\u0017\u0010x\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010F2\b\u0010|\u001a\u0004\u0018\u00010F8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R-\u0010\u0086\u0001\u001a\u0004\u0018\u00010J2\b\u0010|\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, d2 = {"Landroidx/compose/foundation/text/TextFieldState;", "", "Landroidx/compose/ui/text/AnnotatedString;", "untransformedText", "visualText", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/r2;", "onValueChange", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "update-fnh65Uc", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lv3/l;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/ui/focus/FocusManager;J)V", "update", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/input/EditProcessor;", "processor", "Landroidx/compose/ui/text/input/EditProcessor;", "getProcessor", "()Landroidx/compose/ui/text/input/EditProcessor;", "Landroidx/compose/ui/text/input/TextInputSession;", "inputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "getInputSession", "()Landroidx/compose/ui/text/input/TextInputSession;", "setInputSession", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "<set-?>", "hasFocus$delegate", "Landroidx/compose/runtime/MutableState;", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/Dp;", "minHeightForSingleLineField$delegate", "getMinHeightForSingleLineField-D9Ej5fM", "()F", "setMinHeightForSingleLineField-0680j_4", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/LayoutCoordinates;", "_layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResultState", "Landroidx/compose/ui/text/AnnotatedString;", "getUntransformedText", "()Landroidx/compose/ui/text/AnnotatedString;", "setUntransformedText", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/foundation/text/HandleState;", "handleState$delegate", "getHandleState", "()Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "handleState", "showFloatingToolbar$delegate", "getShowFloatingToolbar", "setShowFloatingToolbar", "showFloatingToolbar", "showSelectionHandleStart$delegate", "getShowSelectionHandleStart", "setShowSelectionHandleStart", "showSelectionHandleStart", "showSelectionHandleEnd$delegate", "getShowSelectionHandleEnd", "setShowSelectionHandleEnd", "showSelectionHandleEnd", "showCursorHandle$delegate", "getShowCursorHandle", "setShowCursorHandle", "showCursorHandle", "isLayoutResultStale", "Z", "isInTouchMode$delegate", "isInTouchMode", "setInTouchMode", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "keyboardActionRunner", "Landroidx/compose/foundation/text/KeyboardActionRunner;", "onValueChangeOriginal", "Lv3/l;", "getOnValueChange", "()Lv3/l;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "getOnImeActionPerformed", "Landroidx/compose/ui/graphics/Paint;", "selectionPaint", "Landroidx/compose/ui/graphics/Paint;", "getSelectionPaint", "()Landroidx/compose/ui/graphics/Paint;", b.f22420d, "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates", "getLayoutResult", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "setLayoutResult", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;)V", "layoutResult", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n154#2:1196\n81#3:1197\n107#3,2:1198\n81#3:1200\n107#3,2:1201\n81#3:1204\n107#3,2:1205\n81#3:1207\n107#3,2:1208\n81#3:1210\n107#3,2:1211\n81#3:1213\n107#3,2:1214\n81#3:1216\n107#3,2:1217\n81#3:1219\n107#3,2:1220\n1#4:1203\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n829#1:1196\n824#1:1197\n824#1:1198,2\n829#1:1200\n829#1:1201,2\n889#1:1204\n889#1:1205,2\n899#1:1207\n899#1:1208,2\n905#1:1210\n905#1:1211,2\n911#1:1213\n911#1:1214,2\n917#1:1216\n917#1:1217,2\n929#1:1219\n929#1:1220,2\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 8;

    @m
    private LayoutCoordinates _layoutCoordinates;

    @l
    private final MutableState handleState$delegate;

    @l
    private final MutableState hasFocus$delegate;

    @m
    private TextInputSession inputSession;

    @l
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;

    @l
    private final KeyboardActionRunner keyboardActionRunner;

    @m
    private final SoftwareKeyboardController keyboardController;

    @l
    private final MutableState<TextLayoutResultProxy> layoutResultState;

    @l
    private final MutableState minHeightForSingleLineField$delegate;

    @l
    private final v3.l<ImeAction, r2> onImeActionPerformed;

    @l
    private final v3.l<TextFieldValue, r2> onValueChange;

    @l
    private v3.l<? super TextFieldValue, r2> onValueChangeOriginal;

    @l
    private final EditProcessor processor = new EditProcessor();

    @l
    private final RecomposeScope recomposeScope;

    @l
    private final Paint selectionPaint;

    @l
    private final MutableState showCursorHandle$delegate;

    @l
    private final MutableState showFloatingToolbar$delegate;

    @l
    private final MutableState showSelectionHandleEnd$delegate;

    @l
    private final MutableState showSelectionHandleStart$delegate;

    @l
    private TextDelegate textDelegate;

    @m
    private AnnotatedString untransformedText;

    public TextFieldState(@l TextDelegate textDelegate, @l RecomposeScope recomposeScope, @m SoftwareKeyboardController softwareKeyboardController) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        MutableState<TextLayoutResultProxy> mutableStateOf$default3;
        MutableState mutableStateOf$default4;
        MutableState mutableStateOf$default5;
        MutableState mutableStateOf$default6;
        MutableState mutableStateOf$default7;
        MutableState mutableStateOf$default8;
        MutableState mutableStateOf$default9;
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.hasFocus$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6042boximpl(Dp.m6044constructorimpl(0)), null, 2, null);
        this.minHeightForSingleLineField$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.layoutResultState = mutableStateOf$default3;
        mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.handleState$delegate = mutableStateOf$default4;
        mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showFloatingToolbar$delegate = mutableStateOf$default5;
        mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = mutableStateOf$default6;
        mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = mutableStateOf$default7;
        mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = mutableStateOf$default8;
        this.isLayoutResultStale = true;
        mutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.isInTouchMode$delegate = mutableStateOf$default9;
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.onValueChangeOriginal = TextFieldState$onValueChangeOriginal$1.INSTANCE;
        this.onValueChange = new TextFieldState$onValueChange$1(this);
        this.onImeActionPerformed = new TextFieldState$onImeActionPerformed$1(this);
        this.selectionPaint = AndroidPaint_androidKt.Paint();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    @m
    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    @m
    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    @m
    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    @m
    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m922getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m6058unboximpl();
    }

    @l
    public final v3.l<ImeAction, r2> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    @l
    public final v3.l<TextFieldValue, r2> getOnValueChange() {
        return this.onValueChange;
    }

    @l
    public final EditProcessor getProcessor() {
        return this.processor;
    }

    @l
    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    @l
    public final Paint getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    @l
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    @m
    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setHandleState(@l HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z4) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setInTouchMode(boolean z4) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setInputSession(@m TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setLayoutCoordinates(@m LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(@m TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m923setMinHeightForSingleLineField0680j_4(float f5) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m6042boximpl(f5));
    }

    public final void setShowCursorHandle(boolean z4) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setShowFloatingToolbar(boolean z4) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setShowSelectionHandleEnd(boolean z4) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setShowSelectionHandleStart(boolean z4) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z4));
    }

    public final void setTextDelegate(@l TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(@m AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m924updatefnh65Uc(@l AnnotatedString annotatedString, @l AnnotatedString annotatedString2, @l TextStyle textStyle, boolean z4, @l Density density, @l FontFamily.Resolver resolver, @l v3.l<? super TextFieldValue, r2> lVar, @l KeyboardActions keyboardActions, @l FocusManager focusManager, long j5) {
        List E;
        this.onValueChangeOriginal = lVar;
        this.selectionPaint.mo3613setColor8_81llA(j5);
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate textDelegate = this.textDelegate;
        E = w.E();
        TextDelegate m894updateTextDelegaterm0N8CA$default = TextDelegateKt.m894updateTextDelegaterm0N8CA$default(textDelegate, annotatedString2, textStyle, density, resolver, z4, 0, 0, 0, E, 448, null);
        if (this.textDelegate != m894updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m894updateTextDelegaterm0N8CA$default;
    }
}
