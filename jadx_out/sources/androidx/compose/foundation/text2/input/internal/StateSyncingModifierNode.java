package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000bJ\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/text/input/TextFieldValue;", t0.b.f22420d, "Lkotlin/r2;", "updateState", "", "fireOnValueChanged", "observeTextState", "Lkotlin/Function1;", "onValueChanged", "update", "onAttach", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "onObservedReadsChanged", "Landroidx/compose/foundation/text2/input/TextFieldState;", "state", "Landroidx/compose/foundation/text2/input/TextFieldState;", "Lv3/l;", "writeSelectionFromTextFieldValue", "Z", "isFocused", "lastValueWhileFocused", "Landroidx/compose/ui/text/input/TextFieldValue;", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "<init>", "(Landroidx/compose/foundation/text2/input/TextFieldState;Lv3/l;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nStateSyncingModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,171:1\n1#2:172\n123#3,4:173\n*S KotlinDebug\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n*L\n142#1:173,4\n*E\n"})
/* loaded from: classes.dex */
final class StateSyncingModifierNode extends Modifier.Node implements ObserverModifierNode, FocusEventModifierNode {
    private boolean isFocused;

    @m
    private TextFieldValue lastValueWhileFocused;

    @l
    private v3.l<? super TextFieldValue, r2> onValueChanged;

    @l
    private final TextFieldState state;
    private final boolean writeSelectionFromTextFieldValue;

    public StateSyncingModifierNode(@l TextFieldState textFieldState, @l v3.l<? super TextFieldValue, r2> lVar, boolean z4) {
        this.state = textFieldState;
        this.onValueChanged = lVar;
        this.writeSelectionFromTextFieldValue = z4;
    }

    private final void observeTextState(boolean z4) {
        TextFieldCharSequence textFieldCharSequence;
        TextFieldCharSequence textFieldCharSequence2;
        k1.h hVar = new k1.h();
        ObserverModifierNodeKt.observeReads(this, new StateSyncingModifierNode$observeTextState$1(hVar, this));
        if (z4) {
            T t5 = hVar.element;
            TextFieldCharSequence textFieldCharSequence3 = null;
            if (t5 == 0) {
                l0.S("text");
                textFieldCharSequence = null;
            } else {
                textFieldCharSequence = (TextFieldCharSequence) t5;
            }
            String obj = textFieldCharSequence.toString();
            T t6 = hVar.element;
            if (t6 == 0) {
                l0.S("text");
                textFieldCharSequence2 = null;
            } else {
                textFieldCharSequence2 = (TextFieldCharSequence) t6;
            }
            long mo1076getSelectionInCharsd9O1mEE = textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE();
            T t7 = hVar.element;
            if (t7 == 0) {
                l0.S("text");
            } else {
                textFieldCharSequence3 = (TextFieldCharSequence) t7;
            }
            this.onValueChanged.invoke(new TextFieldValue(obj, mo1076getSelectionInCharsd9O1mEE, textFieldCharSequence3.mo1075getCompositionInCharsMzsxiRA(), (w) null));
        }
    }

    static /* synthetic */ void observeTextState$default(StateSyncingModifierNode stateSyncingModifierNode, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        stateSyncingModifierNode.observeTextState(z4);
    }

    private final void updateState(TextFieldValue textFieldValue) {
        TextFieldState textFieldState = this.state;
        TextFieldBuffer startEdit = textFieldState.startEdit(textFieldState.getText());
        startEdit.setTextIfChanged$foundation_release(textFieldValue.getText());
        if (this.writeSelectionFromTextFieldValue) {
            startEdit.m1072selectCharsIn5zctL8(textFieldValue.m5783getSelectiond9O1mEE());
        }
        textFieldState.commitEdit(startEdit);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        observeTextState(false);
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@l FocusState focusState) {
        if (this.isFocused && !focusState.isFocused()) {
            TextFieldValue textFieldValue = this.lastValueWhileFocused;
            if (textFieldValue != null) {
                updateState(textFieldValue);
            }
            this.lastValueWhileFocused = null;
        }
        this.isFocused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        observeTextState$default(this, false, 1, null);
    }

    public final void update(@l TextFieldValue textFieldValue, @l v3.l<? super TextFieldValue, r2> lVar) {
        this.onValueChanged = lVar;
        if (!this.isFocused) {
            updateState(textFieldValue);
        } else {
            this.lastValueWhileFocused = textFieldValue;
        }
    }
}
