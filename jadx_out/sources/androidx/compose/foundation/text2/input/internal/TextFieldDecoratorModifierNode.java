package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Í\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\nBQ\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b{\u0010|J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002JP\u0010!\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0019J\f\u0010#\u001a\u00020\u000b*\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0016J*\u00104\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00105\u001a\u00020\u000bH\u0016J\u001a\u0010:\u001a\u00020\u00192\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00192\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b;\u00109J\b\u0010=\u001a\u00020\u000bH\u0016R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010R\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010R\u001a\u0004\b^\u0010T\"\u0004\b_\u0010VR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010c\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010RR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR \u0010s\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\u000b0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010x\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010TR\u0014\u0010z\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006}"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/r2;", "startInputSession", "disposeInputSession", "startOrDisposeInputSessionOnWindowFocusChange", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "requireKeyboardController", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/InputTransformation;", "filter", "", "enabled", "readOnly", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "updateNode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "onAttach", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onPreKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onPreKeyEvent", "onKeyEvent-ZmokQxo", "onKeyEvent", "onObservedReadsChanged", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "getTextFieldState", "()Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;)V", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "getTextLayoutState", "()Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)V", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;)V", "Landroidx/compose/foundation/text2/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text2/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text2/input/InputTransformation;)V", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "getReadOnly", "setReadOnly", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "getSingleLine", "setSingleLine", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "<set-?>", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "isElementFocused", "Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "androidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1", "keyboardActionScope", "Landroidx/compose/foundation/text2/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Lv3/l;", "Lkotlinx/coroutines/l2;", "inputSessionJob", "Lkotlinx/coroutines/l2;", "isFocused", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text2/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public static final int $stable = 8;
    private boolean enabled;

    @m
    private InputTransformation filter;

    @m
    private l2 inputSessionJob;
    private boolean isElementFocused;

    @l
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;

    @l
    private KeyboardActions keyboardActions;

    @l
    private KeyboardOptions keyboardOptions;

    @l
    private final v3.l<ImeAction, r2> onImeActionPerformed;

    @l
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private boolean readOnly;
    private boolean singleLine;

    @l
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;

    @l
    private TextFieldSelectionState textFieldSelectionState;

    @l
    private TransformedTextFieldState textFieldState;

    @l
    private TextLayoutState textLayoutState;

    @m
    private WindowInfo windowInfo;

    public TextFieldDecoratorModifierNode(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l TextFieldSelectionState textFieldSelectionState, @m InputTransformation inputTransformation, boolean z4, boolean z5, @l KeyboardOptions keyboardOptions, @l KeyboardActions keyboardActions, boolean z6) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z4;
        this.readOnly = z5;
        this.keyboardActions = keyboardActions;
        this.singleLine = z6;
        InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.onImeActionPerformed = new TextFieldDecoratorModifierNode$onImeActionPerformed$1(this);
    }

    private final void disposeInputSession() {
        l2 l2Var = this.inputSessionJob;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        this.inputSessionJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        if (!this.isElementFocused) {
            return false;
        }
        WindowInfo windowInfo = this.windowInfo;
        return windowInfo != null && windowInfo.isWindowFocused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    private final void startInputSession() {
        l2 f5;
        f5 = k.f(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, null), 3, null);
        this.inputSessionJob = f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOrDisposeInputSessionOnWindowFocusChange() {
        WindowInfo windowInfo = this.windowInfo;
        if (windowInfo == null) {
            return;
        }
        boolean z4 = false;
        if (windowInfo != null && windowInfo.isWindowFocused()) {
            z4 = true;
        }
        if (z4 && this.isElementFocused) {
            startInputSession();
        } else {
            disposeInputSession();
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence untransformedText = this.textFieldState.getUntransformedText();
        long mo1076getSelectionInCharsd9O1mEE = untransformedText.mo1076getSelectionInCharsd9O1mEE();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(untransformedText.toString(), null, null, 6, null));
        SemanticsPropertiesKt.m5390setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, mo1076getSelectionInCharsd9O1mEE);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$1(this), 1, null);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$2(this), 1, null);
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$3(this), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$4(this), 1, null);
        SemanticsPropertiesKt.m5386onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.keyboardOptions.m859getImeActioneUduSuo(), null, new TextFieldDecoratorModifierNode$applySemantics$5(this), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$6(this), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$7(this), 1, null);
        if (!TextRange.m5539getCollapsedimpl(mo1076getSelectionInCharsd9O1mEE)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$8(this), 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$9(this), 1, null);
            }
        }
        if (this.enabled && !this.readOnly) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new TextFieldDecoratorModifierNode$applySemantics$10(this), 1, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @m
    public final InputTransformation getFilter() {
        return this.filter;
    }

    @l
    public final KeyboardActions getKeyboardActions() {
        return this.keyboardActions;
    }

    @l
    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @l
    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    @l
    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    @l
    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@l FocusState focusState) {
        if (this.isElementFocused == focusState.isFocused()) {
            return;
        }
        this.isElementFocused = focusState.isFocused();
        this.textFieldSelectionState.setFocused(isFocused());
        if (focusState.isFocused()) {
            if (this.enabled && !this.readOnly) {
                startInputSession();
                return;
            }
            return;
        }
        disposeInputSession();
        this.textFieldState.collapseSelectionToMax();
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo169onKeyEventZmokQxo(@l KeyEvent keyEvent) {
        boolean z4;
        TextFieldKeyEventHandler textFieldKeyEventHandler = this.textFieldKeyEventHandler;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextLayoutState textLayoutState = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        if (this.enabled && !this.readOnly) {
            z4 = true;
        } else {
            z4 = false;
        }
        return textFieldKeyEventHandler.m1120onKeyEvent6ptp14s(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, z4, this.singleLine, new TextFieldDecoratorModifierNode$onKeyEvent$1(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new TextFieldDecoratorModifierNode$onObservedReadsChanged$1(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo170onPointerEventH0pRuoY(@l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        this.pointerInputNode.mo170onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j5);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo171onPreKeyEventZmokQxo(@l KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1092onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    public final void setEnabled(boolean z4) {
        this.enabled = z4;
    }

    public final void setFilter(@m InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setKeyboardActions(@l KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final void setReadOnly(boolean z4) {
        this.readOnly = z4;
    }

    public final void setSingleLine(boolean z4) {
        this.singleLine = z4;
    }

    public final void setTextFieldSelectionState(@l TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(@l TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(@l TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l TextFieldSelectionState textFieldSelectionState, @m InputTransformation inputTransformation, boolean z4, boolean z5, @l KeyboardOptions keyboardOptions, @l KeyboardActions keyboardActions, boolean z6) {
        boolean z7;
        KeyboardOptions keyboardOptions2;
        boolean z8 = this.enabled;
        boolean z9 = true;
        if (z8 && !this.readOnly) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z4 || z5) {
            z9 = false;
        }
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions3 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        InputTransformation inputTransformation2 = this.filter;
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z4;
        this.readOnly = z5;
        if (inputTransformation != null) {
            keyboardOptions2 = inputTransformation.getKeyboardOptions();
        } else {
            keyboardOptions2 = null;
        }
        this.keyboardOptions = TextFieldDecoratorModifierKt.withDefaultsFrom(keyboardOptions, keyboardOptions2);
        this.keyboardActions = keyboardActions;
        this.singleLine = z6;
        if (z9 != z7 || !l0.g(transformedTextFieldState, transformedTextFieldState2) || !l0.g(keyboardOptions, keyboardOptions3) || !l0.g(inputTransformation, inputTransformation2)) {
            if (z9 && isFocused()) {
                startInputSession();
            } else if (!z9) {
                disposeInputSession();
            }
        }
        if (z8 != z4) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!l0.g(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
        }
    }
}
