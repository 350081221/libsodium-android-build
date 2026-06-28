package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKeyInput$process$2 extends n0 implements l<TextFieldPreparedSelection, r2> {
    final /* synthetic */ KeyCommand $command;
    final /* synthetic */ k1.a $consumed;
    final /* synthetic */ TextFieldKeyInput this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<TextFieldPreparedSelection, r2> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            textFieldPreparedSelection.moveCursorLeft();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<TextFieldPreparedSelection, r2> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            textFieldPreparedSelection.moveCursorRight();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            return new DeleteSurroundingTextCommand(TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()) - textFieldPreparedSelection.getPrecedingCharacterIndex(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        AnonymousClass4() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            int nextCharacterIndex = textFieldPreparedSelection.getNextCharacterIndex();
            if (nextCharacterIndex != -1) {
                return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        AnonymousClass5() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            Integer previousWordOffset = textFieldPreparedSelection.getPreviousWordOffset();
            if (previousWordOffset == null) {
                return null;
            }
            return new DeleteSurroundingTextCommand(TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        AnonymousClass6() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            Integer nextWordOffset = textFieldPreparedSelection.getNextWordOffset();
            if (nextWordOffset != null) {
                return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()));
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        AnonymousClass7() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            Integer lineStartByOffset = textFieldPreparedSelection.getLineStartByOffset();
            if (lineStartByOffset == null) {
                return null;
            }
            return new DeleteSurroundingTextCommand(TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends n0 implements l<TextFieldPreparedSelection, EditCommand> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        AnonymousClass8() {
            super(1);
        }

        @Override // v3.l
        @m
        public final EditCommand invoke(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
            Integer lineEndByOffset = textFieldPreparedSelection.getLineEndByOffset();
            if (lineEndByOffset != null) {
                return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m5540getEndimpl(textFieldPreparedSelection.m976getSelectiond9O1mEE()));
            }
            return null;
        }
    }

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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInput$process$2(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, k1.a aVar) {
        super(1);
        this.$command = keyCommand;
        this.this$0 = textFieldKeyInput;
        this.$consumed = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        invoke2(textFieldPreparedSelection);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l TextFieldPreparedSelection textFieldPreparedSelection) {
        int i5;
        TextFieldValue undo;
        l lVar;
        TextFieldValue redo;
        l lVar2;
        switch (WhenMappings.$EnumSwitchMapping$0[this.$command.ordinal()]) {
            case 1:
                this.this$0.getSelectionManager().copy$foundation_release(false);
                return;
            case 2:
                this.this$0.getSelectionManager().paste$foundation_release();
                return;
            case 3:
                this.this$0.getSelectionManager().cut$foundation_release();
                return;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(AnonymousClass1.INSTANCE);
                return;
            case 5:
                textFieldPreparedSelection.collapseRightOr(AnonymousClass2.INSTANCE);
                return;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                return;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                return;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                return;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                return;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                return;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                return;
            case 12:
                textFieldPreparedSelection.moveCursorUpByPage();
                return;
            case 13:
                textFieldPreparedSelection.moveCursorDownByPage();
                return;
            case 14:
                textFieldPreparedSelection.moveCursorToLineStart();
                return;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                return;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                return;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                return;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                return;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                return;
            case 20:
                List<EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass3.INSTANCE);
                if (deleteIfSelectedOr != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr);
                    return;
                }
                return;
            case 21:
                List<EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass4.INSTANCE);
                if (deleteIfSelectedOr2 != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr2);
                    return;
                }
                return;
            case 22:
                List<EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass5.INSTANCE);
                if (deleteIfSelectedOr3 != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr3);
                    return;
                }
                return;
            case 23:
                List<EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass6.INSTANCE);
                if (deleteIfSelectedOr4 != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr4);
                    return;
                }
                return;
            case 24:
                List<EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass7.INSTANCE);
                if (deleteIfSelectedOr5 != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr5);
                    return;
                }
                return;
            case 25:
                List<EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(AnonymousClass8.INSTANCE);
                if (deleteIfSelectedOr6 != null) {
                    this.this$0.apply((List<? extends EditCommand>) deleteIfSelectedOr6);
                    return;
                }
                return;
            case 26:
                if (!this.this$0.getSingleLine()) {
                    this.this$0.apply(new CommitTextCommand("\n", 1));
                    return;
                }
                l<ImeAction, r2> onImeActionPerformed = this.this$0.getState().getOnImeActionPerformed();
                i5 = this.this$0.imeAction;
                onImeActionPerformed.invoke(ImeAction.m5706boximpl(i5));
                return;
            case 27:
                if (!this.this$0.getSingleLine()) {
                    this.this$0.apply(new CommitTextCommand("\t", 1));
                    return;
                } else {
                    this.$consumed.element = false;
                    return;
                }
            case 28:
                textFieldPreparedSelection.selectAll();
                return;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                return;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                return;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                return;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                return;
            case 33:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                return;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                return;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                return;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                return;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                return;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                return;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                return;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                return;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                return;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                return;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                return;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                return;
            case 45:
                textFieldPreparedSelection.deselect();
                return;
            case 46:
                UndoManager undoManager = this.this$0.getUndoManager();
                if (undoManager != null) {
                    undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                }
                UndoManager undoManager2 = this.this$0.getUndoManager();
                if (undoManager2 == null || (undo = undoManager2.undo()) == null) {
                    return;
                }
                lVar = this.this$0.onValueChange;
                lVar.invoke(undo);
                return;
            case 47:
                UndoManager undoManager3 = this.this$0.getUndoManager();
                if (undoManager3 == null || (redo = undoManager3.redo()) == null) {
                    return;
                }
                lVar2 = this.this$0.onValueChange;
                lVar2.invoke(redo);
                return;
            case 48:
                KeyEventHelpers_androidKt.showCharacterPalette();
                return;
            default:
                return;
        }
    }
}
