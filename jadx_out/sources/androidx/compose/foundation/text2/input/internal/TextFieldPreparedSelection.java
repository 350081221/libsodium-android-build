package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 V2\u00020\u0001:\u0001VB'\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010>\u001a\u00020\u0013\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J,\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0082\bJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0000H\u0002J\b\u0010\u000f\u001a\u00020\u0000H\u0002J\b\u0010\u0010\u001a\u00020\u0000H\u0002J\b\u0010\u0011\u001a\u00020\u0000H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\u0017\u0010\u0015\u001a\u00020\u0002*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0082\u0010J\u0017\u0010\u0016\u001a\u00020\u0002*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0082\u0010J\u0016\u0010\u0017\u001a\u00020\u0002*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0002J\u0016\u0010\u0018\u001a\u00020\u0002*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0002H\u0002J\u0014\u0010\u001a\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0019\u0010\u001e\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0086\bJ\u0006\u0010\u001f\u001a\u00020\u0000J\u0006\u0010 \u001a\u00020\u0000J\u0006\u0010!\u001a\u00020\u0000J\u0006\u0010\"\u001a\u00020\u0000J\u0006\u0010#\u001a\u00020\u0000J\u0006\u0010$\u001a\u00020\u0000J\u001f\u0010&\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u001f\u0010'\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tJ\u0006\u0010(\u001a\u00020\u0002J\u0006\u0010)\u001a\u00020\u0002J\u0006\u0010*\u001a\u00020\u0000J\u0006\u0010+\u001a\u00020\u0000J\u0006\u0010,\u001a\u00020\u0000J\u0006\u0010-\u001a\u00020\u0000J\u0006\u0010.\u001a\u00020\u0002J\u0006\u0010/\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0002J\u0006\u00105\u001a\u00020\u0000J\u0006\u00106\u001a\u00020\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR(\u0010K\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection;", "", "", "pagesAmount", "jumpByPagesOffset", "", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlin/u;", "block", "applyIfNotEmpty", TypedValues.CycleType.S_WAVE_OFFSET, "setCursor", "moveCursorPrev", "moveCursorNext", "moveCursorNextByWord", "moveCursorPrevByWord", "isLtr", "Landroidx/compose/ui/text/TextLayoutResult;", "currentOffset", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "charOffset", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextRange;", "deleteIfSelectedOr", "moveCursorUpByPage", "moveCursorDownByPage", "selectAll", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "state", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "", "visibleTextLayoutHeight", "F", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "textPreparedSelectionState", "Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "selection", "J", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "", "text", "Ljava/lang/String;", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;FLandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelectionState;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n159#1,7:444\n159#1,7:451\n155#1,11:458\n155#1,11:469\n155#1,11:480\n155#1,11:491\n155#1,11:502\n155#1,11:513\n155#1,11:524\n155#1,11:535\n155#1,11:546\n155#1,11:557\n155#1,11:568\n155#1,11:579\n155#1,11:590\n155#1,11:601\n155#1,11:612\n155#1,11:623\n159#1,7:634\n159#1,7:641\n155#1,11:648\n155#1,11:659\n155#1,11:670\n155#1,11:681\n159#1,7:692\n495#2,4:433\n500#2:442\n129#3,5:437\n1#4:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection\n*L\n114#1:444,7\n121#1:451,7\n175#1:458,11\n179#1:469,11\n183#1:480,11\n191#1:491,11\n202#1:502,11\n217#1:513,11\n240#1:524,11\n245#1:535,11\n250#1:546,11\n254#1:557,11\n258#1:568,11\n266#1:579,11\n276#1:590,11\n282#1:601,11\n286#1:612,11\n294#1:623,11\n302#1:634,7\n306#1:641,7\n312#1:648,11\n318#1:659,11\n322#1:670,11\n330#1:681,11\n339#1:692,7\n87#1:433,4\n87#1:442\n87#1:437,5\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;

    @l
    private final TextFieldCharSequence initialValue;
    private long selection;

    @l
    private final TransformedTextFieldState state;

    @l
    private final String text;

    @l
    private final TextLayoutResult textLayoutResult;

    @l
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldPreparedSelection$Companion;", "", "()V", "NoCharacterFound", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public TextFieldPreparedSelection(@l TransformedTextFieldState transformedTextFieldState, @l TextLayoutResult textLayoutResult, float f5, @l TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.visibleTextLayoutHeight = f5;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                TextFieldCharSequence text = transformedTextFieldState.getText();
                createNonObservableSnapshot.dispose();
                this.initialValue = text;
                this.selection = text.mo1076getSelectionInCharsd9O1mEE();
                this.text = text.toString();
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } catch (Throwable th) {
            createNonObservableSnapshot.dispose();
            throw th;
        }
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean z4, v3.l<? super TextFieldPreparedSelection, r2> lVar) {
        boolean z5;
        if (z4) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            lVar.invoke(this);
        }
        return this;
    }

    static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z4, v3.l lVar, int i5, Object obj) {
        boolean z5 = true;
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        if (z4) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() <= 0) {
            z5 = false;
        }
        if (z5) {
            lVar.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final int charOffset(int i5) {
        int B;
        B = u.B(i5, this.text.length() - 1);
        return B;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i5), true);
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = TextRange.m5542getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i5);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i5));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = TextRange.m5543getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i5);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        while (i5 < this.initialValue.length()) {
            long m5519getWordBoundaryjx7JFs = textLayoutResult.m5519getWordBoundaryjx7JFs(charOffset(i5));
            if (TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs) <= i5) {
                i5++;
            } else {
                return TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs);
            }
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = TextRange.m5540getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i5);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        while (i5 > 0) {
            long m5519getWordBoundaryjx7JFs = textLayoutResult.m5519getWordBoundaryjx7JFs(charOffset(i5));
            if (TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs) >= i5) {
                i5--;
            } else {
                return TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs);
            }
        }
        return 0;
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = TextRange.m5540getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i5);
    }

    private final boolean isLtr() {
        if (this.textLayoutResult.getParagraphDirection(TextRange.m5540getEndimpl(this.selection)) == ResolvedTextDirection.Ltr) {
            return true;
        }
        return false;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i5) {
        int m5540getEndimpl = TextRange.m5540getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(m5540getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(m5540getEndimpl) + i5;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m5517getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX, lineBottom));
    }

    private final int jumpByPagesOffset(int i5) {
        Rect translate = this.textLayoutResult.getCursorRect(TextRange.m5540getEndimpl(this.initialValue.mo1076getSelectionInCharsd9O1mEE())).translate(0.0f, this.visibleTextLayoutHeight * i5);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(translate.getTop()));
        if (Math.abs(translate.getTop() - lineBottom) > Math.abs(translate.getBottom() - lineBottom)) {
            return this.textLayoutResult.m5517getOffsetForPositionk4lQ0M(translate.m3528getTopLeftF1C5BW0());
        }
        return this.textLayoutResult.m5517getOffsetForPositionk4lQ0M(translate.m3521getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection moveCursorNext() {
        boolean z4;
        int nextCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNextByWord() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrev() {
        boolean z4;
        int precedingCharacterIndex;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrevByWord() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    private final void setCursor(int i5) {
        this.selection = TextRangeKt.TextRange(i5, i5);
    }

    @l
    public final TextFieldPreparedSelection collapseLeftOr(@l v3.l<? super TextFieldPreparedSelection, r2> lVar) {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (TextRange.m5539getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m5543getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m5542getMaximpl(this.selection));
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection collapseRightOr(@l v3.l<? super TextFieldPreparedSelection, r2> lVar) {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (TextRange.m5539getCollapsedimpl(this.selection)) {
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m5542getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m5543getMinimpl(this.selection));
            }
        }
        return this;
    }

    public final void deleteIfSelectedOr(@l v3.a<TextRange> aVar) {
        if (!TextRange.m5539getCollapsedimpl(m1127getSelectiond9O1mEE())) {
            TransformedTextFieldState.m1141replaceTextSbBc2M$default(this.state, "", m1127getSelectiond9O1mEE(), null, 4, null);
            return;
        }
        TextRange invoke = aVar.invoke();
        if (invoke != null) {
            TransformedTextFieldState.m1141replaceTextSbBc2M$default(this.state, "", invoke.m5549unboximpl(), null, 4, null);
        }
    }

    @l
    public final TextFieldPreparedSelection deselect() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(TextRange.m5540getEndimpl(this.selection));
        }
        return this;
    }

    @l
    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final int getLineEndByOffset() {
        return getLineEndByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getLineStartByOffset() {
        return getLineStartByOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m5540getEndimpl(this.selection));
    }

    public final int getNextWordOffset() {
        return getNextWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m5540getEndimpl(this.selection));
    }

    public final int getPreviousWordOffset() {
        return getPrevWordOffsetForLayout$default(this, this.textLayoutResult, 0, 1, null);
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1127getSelectiond9O1mEE() {
        return this.selection;
    }

    @l
    public final TextFieldPreparedSelection moveCursorDownByLine() {
        boolean z4;
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, 1));
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        boolean z4;
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorLeft() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m5542getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m5542getMaximpl(this.selection) && findParagraphEnd != this.text.length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int findParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m5543getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m5543getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(this.text, findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorRight() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorRightByWord() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToEnd() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(this.text.length());
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToHome() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(0);
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorToLineStart() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorUpByLine() {
        boolean z4;
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(jumpByLinesOffset(this.textLayoutResult, -1));
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        boolean z4;
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection selectAll() {
        boolean z4;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    @l
    public final TextFieldPreparedSelection selectMovement() {
        boolean z4;
        if (this.text.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.selection = TextRangeKt.TextRange(TextRange.m5545getStartimpl(this.initialValue.mo1076getSelectionInCharsd9O1mEE()), TextRange.m5540getEndimpl(this.selection));
        }
        return this;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1128setSelection5zctL8(long j5) {
        this.selection = j5;
    }
}
