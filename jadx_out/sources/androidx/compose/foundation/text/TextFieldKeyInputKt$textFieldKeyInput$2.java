package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.umeng.commonsdk.framework.UMModuleRegister;
import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,263:1\n25#2:264\n25#2:271\n1116#3,6:265\n1116#3,6:272\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInputKt$textFieldKeyInput$2\n*L\n246#1:264\n247#1:271\n246#1:265,6\n247#1:272,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKeyInputKt$textFieldKeyInput$2 extends n0 implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $editable;
    final /* synthetic */ int $imeAction;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ l<TextFieldValue, r2> $onValueChange;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ UndoManager $undoManager;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInputKt$textFieldKeyInput$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends h0 implements l<KeyEvent, Boolean> {
        AnonymousClass1(Object obj) {
            super(1, obj, TextFieldKeyInput.class, UMModuleRegister.PROCESS, "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
            return m912invokeZmokQxo(keyEvent.m4725unboximpl());
        }

        @p4.l
        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m912invokeZmokQxo(@p4.l android.view.KeyEvent keyEvent) {
            return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m909processZmokQxo(keyEvent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldKeyInputKt$textFieldKeyInput$2(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z4, boolean z5, OffsetMapping offsetMapping, UndoManager undoManager, l<? super TextFieldValue, r2> lVar, int i5) {
        super(3);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
        this.$value = textFieldValue;
        this.$editable = z4;
        this.$singleLine = z5;
        this.$offsetMapping = offsetMapping;
        this.$undoManager = undoManager;
        this.$onValueChange = lVar;
        this.$imeAction = i5;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @m Composer composer, int i5) {
        composer.startReplaceableGroup(2057323757);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2057323757, i5, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TextPreparedSelectionState();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DeadKeyCombiner();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new AnonymousClass1(new TextFieldKeyInput(this.$state, this.$manager, this.$value, this.$editable, this.$singleLine, textPreparedSelectionState, this.$offsetMapping, this.$undoManager, (DeadKeyCombiner) rememberedValue2, null, this.$onValueChange, this.$imeAction, 512, null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return onKeyEvent;
    }
}
