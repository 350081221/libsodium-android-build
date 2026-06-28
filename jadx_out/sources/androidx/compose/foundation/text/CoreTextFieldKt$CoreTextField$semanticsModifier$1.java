package androidx.compose.foundation.text;

import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import kotlin.text.f0;
import v3.a;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$semanticsModifier$1 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ boolean $isPassword;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ TransformedText $transformedText;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Landroidx/compose/ui/text/TextLayoutResult;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<List<TextLayoutResult>, Boolean> {
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextFieldState textFieldState) {
            super(1);
            this.$state = textFieldState;
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l List<TextLayoutResult> list) {
            boolean z4;
            if (this.$state.getLayoutResult() != null) {
                TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
                l0.m(layoutResult);
                list.add(layoutResult.getValue());
                z4 = true;
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends n0 implements a<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            this.$manager.paste$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "invoke", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<AnnotatedString, Boolean> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z4, boolean z5, TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            super(1);
            this.$readOnly = z4;
            this.$enabled = z5;
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l AnnotatedString annotatedString) {
            r2 r2Var;
            List<? extends EditCommand> L;
            if (!this.$readOnly && this.$enabled) {
                TextInputSession inputSession = this.$state.getInputSession();
                if (inputSession != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion companion = TextFieldDelegate.Companion;
                    L = w.L(new DeleteAllCommand(), new CommitTextCommand(annotatedString, 1));
                    companion.onEditCommand$foundation_release(L, textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                    r2Var = r2.f19517a;
                } else {
                    r2Var = null;
                }
                if (r2Var == null) {
                    this.$state.getOnValueChange().invoke(new TextFieldValue(annotatedString.getText(), TextRangeKt.TextRange(annotatedString.getText().length()), (TextRange) null, 4, (kotlin.jvm.internal.w) null));
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "invoke", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements l<AnnotatedString, Boolean> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ SemanticsPropertyReceiver $this_semantics;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(boolean z4, boolean z5, TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver, TextFieldValue textFieldValue) {
            super(1);
            this.$readOnly = z4;
            this.$enabled = z5;
            this.$state = textFieldState;
            this.$this_semantics = semanticsPropertyReceiver;
            this.$value = textFieldValue;
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l AnnotatedString annotatedString) {
            r2 r2Var;
            CharSequence G4;
            List<? extends EditCommand> L;
            if (!this.$readOnly && this.$enabled) {
                TextInputSession inputSession = this.$state.getInputSession();
                if (inputSession != null) {
                    TextFieldState textFieldState = this.$state;
                    TextFieldDelegate.Companion companion = TextFieldDelegate.Companion;
                    L = w.L(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1));
                    companion.onEditCommand$foundation_release(L, textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
                    r2Var = r2.f19517a;
                } else {
                    r2Var = null;
                }
                if (r2Var == null) {
                    TextFieldValue textFieldValue = this.$value;
                    TextFieldState textFieldState2 = this.$state;
                    G4 = f0.G4(textFieldValue.getText(), TextRange.m5545getStartimpl(textFieldValue.m5783getSelectiond9O1mEE()), TextRange.m5540getEndimpl(textFieldValue.m5783getSelectiond9O1mEE()), annotatedString);
                    textFieldState2.getOnValueChange().invoke(new TextFieldValue(G4.toString(), TextRangeKt.TextRange(TextRange.m5545getStartimpl(textFieldValue.m5783getSelectiond9O1mEE()) + annotatedString.length()), (TextRange) null, 4, (kotlin.jvm.internal.w) null));
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "selectionStart", "", "selectionEnd", "relativeToOriginalText", "invoke", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends n0 implements q<Integer, Integer, Boolean, Boolean> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ OffsetMapping $offsetMapping;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ TextFieldValue $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(OffsetMapping offsetMapping, boolean z4, TextFieldValue textFieldValue, TextFieldSelectionManager textFieldSelectionManager, TextFieldState textFieldState) {
            super(3);
            this.$offsetMapping = offsetMapping;
            this.$enabled = z4;
            this.$value = textFieldValue;
            this.$manager = textFieldSelectionManager;
            this.$state = textFieldState;
        }

        @Override // v3.q
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
        }

        @p4.l
        public final Boolean invoke(int i5, int i6, boolean z4) {
            if (!z4) {
                i5 = this.$offsetMapping.transformedToOriginal(i5);
            }
            if (!z4) {
                i6 = this.$offsetMapping.transformedToOriginal(i6);
            }
            boolean z5 = false;
            if (this.$enabled && (i5 != TextRange.m5545getStartimpl(this.$value.m5783getSelectiond9O1mEE()) || i6 != TextRange.m5540getEndimpl(this.$value.m5783getSelectiond9O1mEE()))) {
                if (Math.min(i5, i6) >= 0 && Math.max(i5, i6) <= this.$value.getAnnotatedString().length()) {
                    if (!z4 && i5 != i6) {
                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.$manager, false, 1, null);
                    } else {
                        this.$manager.exitSelectionMode$foundation_release();
                    }
                    this.$state.getOnValueChange().invoke(new TextFieldValue(this.$value.getAnnotatedString(), TextRangeKt.TextRange(i5, i6), (TextRange) null, 4, (kotlin.jvm.internal.w) null));
                    z5 = true;
                } else {
                    this.$manager.exitSelectionMode$foundation_release();
                }
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends n0 implements a<Boolean> {
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(TextFieldState textFieldState, ImeOptions imeOptions) {
            super(0);
            this.$state = textFieldState;
            this.$imeOptions = imeOptions;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            this.$state.getOnImeActionPerformed().invoke(ImeAction.m5706boximpl(this.$imeOptions.m5734getImeActioneUduSuo()));
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends n0 implements a<Boolean> {
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ TextFieldState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(TextFieldState textFieldState, FocusRequester focusRequester, boolean z4) {
            super(0);
            this.$state = textFieldState;
            this.$focusRequester = focusRequester;
            this.$readOnly = z4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends n0 implements a<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.$manager, false, 1, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends n0 implements a<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass8(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            TextFieldSelectionManager.copy$foundation_release$default(this.$manager, false, 1, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends n0 implements a<Boolean> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(TextFieldSelectionManager textFieldSelectionManager) {
            super(0);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // v3.a
        @p4.l
        public final Boolean invoke() {
            this.$manager.cut$foundation_release();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$semanticsModifier$1(TransformedText transformedText, TextFieldValue textFieldValue, boolean z4, boolean z5, ImeOptions imeOptions, boolean z6, TextFieldState textFieldState, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, FocusRequester focusRequester) {
        super(1);
        this.$transformedText = transformedText;
        this.$value = textFieldValue;
        this.$enabled = z4;
        this.$isPassword = z5;
        this.$imeOptions = imeOptions;
        this.$readOnly = z6;
        this.$state = textFieldState;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
        this.$focusRequester = focusRequester;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.$transformedText.getText());
        SemanticsPropertiesKt.m5390setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.$value.m5783getSelectiond9O1mEE());
        if (!this.$enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.$isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new AnonymousClass1(this.$state), 1, null);
        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new AnonymousClass2(this.$readOnly, this.$enabled, this.$state, semanticsPropertyReceiver), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new AnonymousClass3(this.$readOnly, this.$enabled, this.$state, semanticsPropertyReceiver, this.$value), 1, null);
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new AnonymousClass4(this.$offsetMapping, this.$enabled, this.$value, this.$manager, this.$state), 1, null);
        SemanticsPropertiesKt.m5386onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.$imeOptions.m5734getImeActioneUduSuo(), null, new AnonymousClass5(this.$state, this.$imeOptions), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new AnonymousClass6(this.$state, this.$focusRequester, this.$readOnly), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new AnonymousClass7(this.$manager), 1, null);
        if (!TextRange.m5539getCollapsedimpl(this.$value.m5783getSelectiond9O1mEE()) && !this.$isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new AnonymousClass8(this.$manager), 1, null);
            if (this.$enabled && !this.$readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new AnonymousClass9(this.$manager), 1, null);
            }
        }
        if (!this.$enabled || this.$readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new AnonymousClass10(this.$manager), 1, null);
    }
}
