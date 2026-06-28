package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlin.y;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.u0;
import p4.m;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2", f = "AndroidTextInputSession.android.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends o implements p<s0, d<?>, Object> {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ l<ImeAction, r2> $onImeAction;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1", f = "AndroidTextInputSession.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements p<s0, d<? super r2>, Object> {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TransformedTextFieldState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$state = transformedTextFieldState;
            this.$composeImm = composeInputMethodManager;
            this.$imeOptions = imeOptions;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2) {
            boolean z4;
            int i5;
            if (TextRange.m5538equalsimpl0(textFieldCharSequence.mo1076getSelectionInCharsd9O1mEE(), textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE()) && l0.g(textFieldCharSequence.mo1075getCompositionInCharsMzsxiRA(), textFieldCharSequence2.mo1075getCompositionInCharsMzsxiRA())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                int m5543getMinimpl = TextRange.m5543getMinimpl(textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE());
                int m5542getMaximpl = TextRange.m5542getMaximpl(textFieldCharSequence2.mo1076getSelectionInCharsd9O1mEE());
                TextRange mo1075getCompositionInCharsMzsxiRA = textFieldCharSequence2.mo1075getCompositionInCharsMzsxiRA();
                int i6 = -1;
                if (mo1075getCompositionInCharsMzsxiRA != null) {
                    i5 = TextRange.m5543getMinimpl(mo1075getCompositionInCharsMzsxiRA.m5549unboximpl());
                } else {
                    i5 = -1;
                }
                TextRange mo1075getCompositionInCharsMzsxiRA2 = textFieldCharSequence2.mo1075getCompositionInCharsMzsxiRA();
                if (mo1075getCompositionInCharsMzsxiRA2 != null) {
                    i6 = TextRange.m5542getMaximpl(mo1075getCompositionInCharsMzsxiRA2.m5549unboximpl());
                }
                composeInputMethodManager.updateSelection(m5543getMinimpl, m5542getMaximpl, i5, i6);
            }
            if (!textFieldCharSequence.contentEquals(textFieldCharSequence2) && !KeyboardType.m5756equalsimpl0(imeOptions.m5735getKeyboardTypePjHm6EE(), KeyboardType.Companion.m5774getPasswordPjHm6EE())) {
                composeInputMethodManager.restartInput();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
            return new AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, dVar);
        }

        @Override // v3.p
        @m
        public final Object invoke(@p4.l s0 s0Var, @m d<? super r2> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                TransformedTextFieldState transformedTextFieldState = this.$state;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final ImeOptions imeOptions = this.$imeOptions;
                TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text2.input.internal.b
                    @Override // androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener
                    public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2) {
                        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.AnonymousClass1.invokeSuspend$lambda$0(ComposeInputMethodManager.this, imeOptions, textFieldCharSequence, textFieldCharSequence2);
                    }
                };
                this.label = 1;
                if (transformedTextFieldState.collectImeNotifications(notifyImeListener, this) == l5) {
                    return l5;
                }
            }
            throw new y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, ImeOptions imeOptions, l<? super ImeAction, r2> lVar, d<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2> dVar) {
        super(2, dVar);
        this.$this_platformSpecificTextInputSession = platformTextInputSession;
        this.$state = transformedTextFieldState;
        this.$composeImm = composeInputMethodManager;
        this.$imeOptions = imeOptions;
        this.$onImeAction = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$0(final TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, final ComposeInputMethodManager composeInputMethodManager, final l lVar, EditorInfo editorInfo) {
        AndroidTextInputSession_androidKt.logDebug$default(null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$1(transformedTextFieldState), 1, null);
        TextInputSession textInputSession = new TextInputSession() { // from class: androidx.compose.foundation.text2.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2$2$textInputSession$1
            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            @p4.l
            public TextFieldCharSequence getText() {
                return TransformedTextFieldState.this.getText();
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
            public void mo1093onImeActionKlQnJC8(int i5) {
                l<ImeAction, r2> lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(ImeAction.m5706boximpl(i5));
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            public void requestEdit(@p4.l l<? super EditingBuffer, r2> lVar2) {
                TransformedTextFieldState transformedTextFieldState2 = TransformedTextFieldState.this;
                TextFieldState textFieldState = transformedTextFieldState2.textFieldState;
                InputTransformation inputTransformation = transformedTextFieldState2.inputTransformation;
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
                TextFieldCharSequence text = textFieldState.getText();
                textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                lVar2.invoke(textFieldState.getMainBuffer$foundation_release());
                if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
                    textFieldState.commitEditAsUser(text, inputTransformation, false, textFieldEditUndoBehavior);
                }
            }

            @Override // androidx.compose.foundation.text2.input.internal.TextInputSession
            public void sendKeyEvent(@p4.l KeyEvent keyEvent) {
                composeInputMethodManager.sendKeyEvent(keyEvent);
            }
        };
        AndroidTextInputSession_androidKt.update(editorInfo, transformedTextFieldState.getText(), imeOptions);
        return new StatelessInputConnection(textInputSession);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final d<r2> create(@m Object obj, @p4.l d<?> dVar) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(this.$this_platformSpecificTextInputSession, this.$state, this.$composeImm, this.$imeOptions, this.$onImeAction, dVar);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$2.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@p4.l s0 s0Var, @m d<?> dVar) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e1.n(obj);
        } else {
            e1.n(obj);
            k.f((s0) this.L$0, null, u0.UNDISPATCHED, new AnonymousClass1(this.$state, this.$composeImm, this.$imeOptions, null), 1, null);
            PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
            final TransformedTextFieldState transformedTextFieldState = this.$state;
            final ImeOptions imeOptions = this.$imeOptions;
            final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
            final l<ImeAction, r2> lVar = this.$onImeAction;
            PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text2.input.internal.a
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final InputConnection createInputConnection(EditorInfo editorInfo) {
                    InputConnection invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.invokeSuspend$lambda$0(TransformedTextFieldState.this, imeOptions, composeInputMethodManager, lVar, editorInfo);
                    return invokeSuspend$lambda$0;
                }
            };
            this.label = 1;
            if (platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this) == l5) {
                return l5;
            }
        }
        throw new y();
    }
}
