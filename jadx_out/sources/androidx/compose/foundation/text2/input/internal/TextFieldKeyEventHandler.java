package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.TextFieldState;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.core.app.NotificationCompat;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J2\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0082\bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJP\u0010\"\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler;", "", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "Lkotlin/r2;", "Lkotlin/u;", "block", "preparedSelectionContext", "", "getVisibleTextLayoutHeight", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;)Ljava/lang/Float;", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "editable", "singleLine", "Lkotlin/Function0;", "onSubmit", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;ZZLv3/a;)Z", "onKeyEvent", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "deadKeyCombiner", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,256:1\n229#1,9:284\n238#1,5:384\n197#2,6:257\n206#2:283\n197#2,6:330\n206#2:356\n197#2,6:357\n206#2:383\n186#3,20:263\n186#3,20:336\n186#3,20:363\n104#4,4:293\n109#4:299\n104#4,4:300\n109#4:305\n104#4,4:306\n109#4:311\n104#4,4:312\n109#4:317\n104#4,4:318\n109#4:323\n104#4,4:324\n109#4:329\n1#5:297\n1#5:298\n1#5:304\n1#5:310\n1#5:316\n1#5:322\n1#5:328\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldKeyEventHandler\n*L\n105#1:284,9\n105#1:384,5\n88#1:257,6\n88#1:283\n170#1:330,6\n170#1:356\n181#1:357,6\n181#1:383\n88#1:263,20\n170#1:336,20\n181#1:363,20\n127#1:293,4\n127#1:299\n137#1:300,4\n137#1:305\n145#1:306,4\n145#1:311\n151#1:312,4\n151#1:317\n157#1:318,4\n157#1:323\n163#1:324,4\n163#1:329\n127#1:298\n137#1:304\n145#1:310\n151#1:316\n157#1:322\n163#1:328\n*E\n"})
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;

    @l
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();

    @l
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();

    @l
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Float getVisibleTextLayoutHeight(androidx.compose.foundation.text2.input.internal.TextLayoutState r5) {
        /*
            r4 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.getTextLayoutNodeCoordinates()
            r1 = 0
            if (r0 == 0) goto L37
            boolean r2 = r0.isAttached()
            if (r2 == 0) goto Le
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L37
            androidx.compose.ui.layout.LayoutCoordinates r5 = r5.getDecoratorNodeCoordinates()
            if (r5 == 0) goto L28
            boolean r2 = r5.isAttached()
            if (r2 == 0) goto L1e
            goto L1f
        L1e:
            r5 = r1
        L1f:
            if (r5 == 0) goto L28
            r2 = 0
            r3 = 2
            androidx.compose.ui.geometry.Rect r5 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r5, r0, r2, r3, r1)
            goto L29
        L28:
            r5 = r1
        L29:
            if (r5 == 0) goto L37
            long r0 = r5.m3526getSizeNHjbRc()
            float r5 = androidx.compose.ui.geometry.Size.m3559getHeightimpl(r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.TextFieldKeyEventHandler.getVisibleTextLayoutHeight(androidx.compose.foundation.text2.input.internal.TextLayoutState):java.lang.Float");
    }

    private final void preparedSelectionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, v3.l<? super TextFieldPreparedSelection, r2> lVar) {
        Float visibleTextLayoutHeight;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult != null && (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) != null) {
            TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
            lVar.invoke(textFieldPreparedSelection);
            if (!TextRange.m5538equalsimpl0(textFieldPreparedSelection.m1127getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().mo1076getSelectionInCharsd9O1mEE())) {
                transformedTextFieldState.m1146selectCharsIn5zctL8(textFieldPreparedSelection.m1127getSelectiond9O1mEE());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public boolean m1120onKeyEvent6ptp14s(@l KeyEvent keyEvent, @l TransformedTextFieldState transformedTextFieldState, @l TextLayoutState textLayoutState, @l TextFieldSelectionState textFieldSelectionState, boolean z4, boolean z5, @l v3.a<r2> aVar) {
        Float visibleTextLayoutHeight;
        TextRange m5533boximpl;
        Integer m849consumeZmokQxo;
        if (!KeyEventType.m4729equalsimpl0(KeyEvent_androidKt.m4737getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4733getKeyDownCS__XNY())) {
            return false;
        }
        if (TextFieldKeyInput_androidKt.m913isTypedEventZmokQxo(keyEvent) && (m849consumeZmokQxo = this.deadKeyCombiner.m849consumeZmokQxo(keyEvent)) != null) {
            String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), m849consumeZmokQxo.intValue()).toString();
            if (!z4) {
                return false;
            }
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            TextFieldCharSequence text = textFieldState.getText();
            textFieldState.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
            EditingBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
            mainBuffer$foundation_release.commitComposition();
            EditCommandKt.commitText(mainBuffer$foundation_release, sb, 1);
            if (textFieldState.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text.mo1076getSelectionInCharsd9O1mEE(), textFieldState.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text.mo1075getCompositionInCharsMzsxiRA(), textFieldState.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
                textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
            }
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand mo851mapZmokQxo = this.keyMapping.mo851mapZmokQxo(keyEvent);
        if (mo851mapZmokQxo == null || (mo851mapZmokQxo.getEditsText() && !z4)) {
            return false;
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null || (visibleTextLayoutHeight = getVisibleTextLayoutHeight(textLayoutState)) == null) {
            return true;
        }
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(transformedTextFieldState, layoutResult, visibleTextLayoutHeight.floatValue(), this.preparedSelectionState);
        switch (WhenMappings.$EnumSwitchMapping$0[mo851mapZmokQxo.ordinal()]) {
            case 1:
                textFieldSelectionState.copy(false);
                r4 = true;
                break;
            case 2:
                textFieldSelectionState.paste();
                r4 = true;
                break;
            case 3:
                textFieldSelectionState.cut();
                r4 = true;
                break;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(TextFieldKeyEventHandler$onKeyEvent$2$1.INSTANCE);
                r4 = true;
                break;
            case 5:
                textFieldPreparedSelection.collapseRightOr(TextFieldKeyEventHandler$onKeyEvent$2$2.INSTANCE);
                r4 = true;
                break;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                r4 = true;
                break;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                r4 = true;
                break;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                r4 = true;
                break;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                r4 = true;
                break;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                r4 = true;
                break;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                r4 = true;
                break;
            case 12:
                textFieldPreparedSelection.moveCursorUpByPage();
                r4 = true;
                break;
            case 13:
                textFieldPreparedSelection.moveCursorDownByPage();
                r4 = true;
                break;
            case 14:
                textFieldPreparedSelection.moveCursorToLineStart();
                r4 = true;
                break;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                r4 = true;
                break;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                r4 = true;
                break;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                r4 = true;
                break;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                r4 = true;
                break;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                r4 = true;
                break;
            case 20:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    Integer valueOf = Integer.valueOf(textFieldPreparedSelection.getPrecedingCharacterIndex());
                    if (!(valueOf.intValue() != -1)) {
                        valueOf = null;
                    }
                    m5533boximpl = valueOf != null ? TextRange.m5533boximpl(TextRangeKt.TextRange(valueOf.intValue(), TextRange.m5540getEndimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE()))) : null;
                    if (m5533boximpl != null) {
                        TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", m5533boximpl.m5549unboximpl(), null, 4, null);
                    }
                }
                r4 = true;
                break;
            case 21:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    Integer valueOf2 = Integer.valueOf(textFieldPreparedSelection.getNextCharacterIndex());
                    if (!(valueOf2.intValue() != -1)) {
                        valueOf2 = null;
                    }
                    m5533boximpl = valueOf2 != null ? TextRange.m5533boximpl(TextRangeKt.TextRange(TextRange.m5545getStartimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE()), valueOf2.intValue())) : null;
                    if (m5533boximpl != null) {
                        TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", m5533boximpl.m5549unboximpl(), null, 4, null);
                    }
                }
                r4 = true;
                break;
            case 22:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getPreviousWordOffset(), TextRange.m5540getEndimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())), null, 4, null);
                }
                r4 = true;
                break;
            case 23:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m5545getStartimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE()), textFieldPreparedSelection.getNextWordOffset()), null, 4, null);
                }
                r4 = true;
                break;
            case 24:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(textFieldPreparedSelection.getLineStartByOffset(), TextRange.m5540getEndimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())), null, 4, null);
                }
                r4 = true;
                break;
            case 25:
                if (!TextRange.m5539getCollapsedimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE())) {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", textFieldPreparedSelection.m1127getSelectiond9O1mEE(), null, 4, null);
                } else {
                    TransformedTextFieldState.m1141replaceTextSbBc2M$default(textFieldPreparedSelection.state, "", TextRangeKt.TextRange(TextRange.m5545getStartimpl(textFieldPreparedSelection.m1127getSelectiond9O1mEE()), textFieldPreparedSelection.getLineEndByOffset()), null, 4, null);
                }
                r4 = true;
                break;
            case 26:
                if (!z5) {
                    TextFieldState textFieldState2 = transformedTextFieldState.textFieldState;
                    InputTransformation inputTransformation2 = transformedTextFieldState.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.MergeIfPossible;
                    TextFieldCharSequence text2 = textFieldState2.getText();
                    textFieldState2.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                    EditingBuffer mainBuffer$foundation_release2 = textFieldState2.getMainBuffer$foundation_release();
                    mainBuffer$foundation_release2.commitComposition();
                    EditCommandKt.commitText(mainBuffer$foundation_release2, "\n", 1);
                    if (textFieldState2.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text2.mo1076getSelectionInCharsd9O1mEE(), textFieldState2.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text2.mo1075getCompositionInCharsMzsxiRA(), textFieldState2.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
                        textFieldState2.commitEditAsUser(text2, inputTransformation2, true, textFieldEditUndoBehavior2);
                    }
                } else {
                    aVar.invoke();
                }
                r4 = true;
                break;
            case 27:
                if (!z5) {
                    TextFieldState textFieldState3 = transformedTextFieldState.textFieldState;
                    InputTransformation inputTransformation3 = transformedTextFieldState.inputTransformation;
                    TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = TextFieldEditUndoBehavior.MergeIfPossible;
                    TextFieldCharSequence text3 = textFieldState3.getText();
                    textFieldState3.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                    EditingBuffer mainBuffer$foundation_release3 = textFieldState3.getMainBuffer$foundation_release();
                    mainBuffer$foundation_release3.commitComposition();
                    EditCommandKt.commitText(mainBuffer$foundation_release3, "\t", 1);
                    if (textFieldState3.getMainBuffer$foundation_release().getChangeTracker().getChangeCount() != 0 || !TextRange.m5538equalsimpl0(text3.mo1076getSelectionInCharsd9O1mEE(), textFieldState3.getMainBuffer$foundation_release().m1095getSelectiond9O1mEE()) || !l0.g(text3.mo1075getCompositionInCharsMzsxiRA(), textFieldState3.getMainBuffer$foundation_release().m1094getCompositionMzsxiRA())) {
                        textFieldState3.commitEditAsUser(text3, inputTransformation3, true, textFieldEditUndoBehavior3);
                    }
                    r4 = true;
                    break;
                }
                break;
            case 28:
                textFieldPreparedSelection.selectAll();
                r4 = true;
                break;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                r4 = true;
                break;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                r4 = true;
                break;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                r4 = true;
                break;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                r4 = true;
                break;
            case 33:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                r4 = true;
                break;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                r4 = true;
                break;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                r4 = true;
                break;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                r4 = true;
                break;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                r4 = true;
                break;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                r4 = true;
                break;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                r4 = true;
                break;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                r4 = true;
                break;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                r4 = true;
                break;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                r4 = true;
                break;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                r4 = true;
                break;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                r4 = true;
                break;
            case 45:
                textFieldPreparedSelection.deselect();
                r4 = true;
                break;
            case 46:
                transformedTextFieldState.undo();
                r4 = true;
                break;
            case 47:
                transformedTextFieldState.redo();
                r4 = true;
                break;
            case 48:
                KeyEventHelpers_androidKt.showCharacterPalette();
                r4 = true;
                break;
            default:
                r4 = true;
                break;
        }
        if (!TextRange.m5538equalsimpl0(textFieldPreparedSelection.m1127getSelectiond9O1mEE(), textFieldPreparedSelection.getInitialValue().mo1076getSelectionInCharsd9O1mEE())) {
            transformedTextFieldState.m1146selectCharsIn5zctL8(textFieldPreparedSelection.m1127getSelectiond9O1mEE());
        }
        return r4;
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1092onPreKeyEventMyFupTE(@l KeyEvent keyEvent, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l FocusManager focusManager, @l SoftwareKeyboardController softwareKeyboardController) {
        if (!TextRange.m5539getCollapsedimpl(transformedTextFieldState.getText().mo1076getSelectionInCharsd9O1mEE()) && KeyEventHelpers_androidKt.m850cancelsTextSelectionZmokQxo(keyEvent)) {
            textFieldSelectionState.deselect();
            return true;
        }
        return false;
    }
}
