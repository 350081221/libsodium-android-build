package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.NotificationCompat;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010$\u001a\u00020\u0011\u0012\b\b\u0002\u0010(\u001a\u00020\u0011\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u0010:\u001a\u000209\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u00042\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010+\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\u00020A8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/r2;", "apply", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand-ZmokQxo", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/text/input/CommitTextCommand;", "typedCommand", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/u;", "block", "commandExecutionContext", "", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", UMModuleRegister.PROCESS, "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "getState", "()Landroidx/compose/foundation/text/TextFieldState;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "Landroidx/compose/ui/text/input/TextFieldValue;", b.f22420d, "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "editable", "Z", "getEditable", "()Z", "singleLine", "getSingleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "onValueChange", "Lv3/l;", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "I", "<init>", "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lv3/l;ILkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;

    @l
    private final DeadKeyCombiner keyCombiner;

    @l
    private final KeyMapping keyMapping;

    @l
    private final OffsetMapping offsetMapping;

    @l
    private final v3.l<TextFieldValue, r2> onValueChange;

    @l
    private final TextPreparedSelectionState preparedSelectionState;

    @l
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;

    @l
    private final TextFieldState state;

    @m
    private final UndoManager undoManager;

    @l
    private final TextFieldValue value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "it", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.l<TextFieldValue, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l TextFieldValue textFieldValue) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z4, boolean z5, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, v3.l<? super TextFieldValue, r2> lVar, int i5) {
        this.state = textFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z4;
        this.singleLine = z5;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = lVar;
        this.imeAction = i5;
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z4, boolean z5, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, v3.l lVar, int i5, w wVar) {
        this(textFieldState, textFieldSelectionManager, textFieldValue, z4, z5, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, lVar, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(List<? extends EditCommand> list) {
        List<? extends EditCommand> V5;
        EditProcessor processor = this.state.getProcessor();
        V5 = e0.V5(list);
        V5.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(V5));
    }

    private final void commandExecutionContext(v3.l<? super TextFieldPreparedSelection, r2> lVar) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        lVar.invoke(textFieldPreparedSelection);
        if (!TextRange.m5538equalsimpl0(textFieldPreparedSelection.m976getSelectiond9O1mEE(), this.value.m5783getSelectiond9O1mEE()) || !l0.g(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            this.onValueChange.invoke(textFieldPreparedSelection.getValue());
        }
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m908typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer m849consumeZmokQxo;
        if (!TextFieldKeyInput_androidKt.m913isTypedEventZmokQxo(keyEvent) || (m849consumeZmokQxo = this.keyCombiner.m849consumeZmokQxo(keyEvent)) == null) {
            return null;
        }
        return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m849consumeZmokQxo.intValue()).toString(), 1);
    }

    public final boolean getEditable() {
        return this.editable;
    }

    @l
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    @l
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    @l
    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @l
    public final TextFieldState getState() {
        return this.state;
    }

    @m
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    @l
    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m909processZmokQxo(@l KeyEvent keyEvent) {
        KeyCommand mo851mapZmokQxo;
        CommitTextCommand m908typedCommandZmokQxo = m908typedCommandZmokQxo(keyEvent);
        if (m908typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(m908typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m4729equalsimpl0(KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4733getKeyDownCS__XNY()) || (mo851mapZmokQxo = this.keyMapping.mo851mapZmokQxo(keyEvent)) == null || (mo851mapZmokQxo.getEditsText() && !this.editable)) {
            return false;
        }
        k1.a aVar = new k1.a();
        aVar.element = true;
        commandExecutionContext(new TextFieldKeyInput$process$2(mo851mapZmokQxo, this, aVar));
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return aVar.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void apply(EditCommand editCommand) {
        List<? extends EditCommand> k5;
        k5 = v.k(editCommand);
        apply(k5);
    }

    public /* synthetic */ TextFieldKeyInput(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z4, boolean z5, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, v3.l lVar, int i5, int i6, w wVar) {
        this(textFieldState, textFieldSelectionManager, (i6 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (w) null) : textFieldValue, (i6 & 8) != 0 ? true : z4, (i6 & 16) != 0 ? false : z5, textPreparedSelectionState, (i6 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i6 & 128) != 0 ? null : undoManager, deadKeyCombiner, (i6 & 512) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i6 & 1024) != 0 ? AnonymousClass1.INSTANCE : lVar, i5, null);
    }
}
