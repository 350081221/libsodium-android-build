package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000 f*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001fB1\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020E\u0012\b\u0010J\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bd\u0010eJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\b\u0010\t\u001a\u00020\bH\u0002J\u0017\u0010\r\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0082\u0010J\u0017\u0010\u000e\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0082\u0010J\u0016\u0010\u000f\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0014\u0010\u0012\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J=\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0001\u0010\u0018*\u00028\u00012\b\b\u0002\u0010\u0019\u001a\u00020\b2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0084\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0004J\u0018\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0004J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\u0004J\r\u0010%\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0004J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010\u0004J&\u0010)\u001a\u00028\u00002\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b)\u0010*J&\u0010+\u001a\u00028\u00002\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001c¢\u0006\u0004\b+\u0010*J\u0006\u0010,\u001a\u00020\u000bJ\u0006\u0010-\u001a\u00020\u000bJ\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0004J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0004J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0004J\r\u00101\u001a\u00028\u0000¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b4\u00103J\r\u00105\u001a\u00028\u0000¢\u0006\u0004\b5\u0010\u0004J\r\u00106\u001a\u00028\u0000¢\u0006\u0004\b6\u0010\u0004J\r\u00107\u001a\u00028\u0000¢\u0006\u0004\b7\u0010\u0004J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b9\u00103J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b;\u00103J\r\u0010<\u001a\u00028\u0000¢\u0006\u0004\b<\u0010\u0004J\r\u0010=\u001a\u00028\u0000¢\u0006\u0004\b=\u0010\u0004J\r\u0010>\u001a\u00028\u0000¢\u0006\u0004\b>\u0010\u0004J\r\u0010?\u001a\u00028\u0000¢\u0006\u0004\b?\u0010\u0004R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010F\u001a\u00020E8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010J\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR(\u0010X\u001a\u00020E8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bX\u0010G\u001a\u0004\bY\u0010I\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010_R\u0014\u0010c\u001a\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "moveCursorPrev", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "moveCursorNext", "moveCursorNextByWord", "moveCursorPrevByWord", "", "isLtr", "Landroidx/compose/ui/text/TextLayoutResult;", "", "currentOffset", "getNextWordOffsetForLayout", "getPrevWordOffset", "getLineStartByOffsetForLayout", "getLineEndByOffsetForLayout", "linesAmount", "jumpByLinesOffset", "transformedEndOffset", "transformedMinOffset", "transformedMaxOffset", TypedValues.CycleType.S_WAVE_OFFSET, "charOffset", "U", "resetCachedX", "Lkotlin/Function1;", "Lkotlin/r2;", "Lkotlin/u;", "block", "apply", "(Ljava/lang/Object;ZLv3/l;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "setCursor", "start", "end", "setSelection", "selectAll", "deselect", "moveCursorLeft", "moveCursorRight", "or", "collapseLeftOr", "(Lv3/l;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "getPrecedingCharacterIndex", "getNextCharacterIndex", "moveCursorToHome", "moveCursorToEnd", "moveCursorLeftByWord", "moveCursorRightByWord", "getNextWordOffset", "()Ljava/lang/Integer;", "getPreviousWordOffset", "moveCursorPrevByParagraph", "moveCursorNextByParagraph", "moveCursorUpByLine", "moveCursorDownByLine", "getLineStartByOffset", "moveCursorToLineStart", "getLineEndByOffset", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "selectMovement", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "getOriginalText", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "J", "getOriginalSelection-d9O1mEE", "()J", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "annotatedString", "getAnnotatedString", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "getText$foundation_release", "()Ljava/lang/String;", "text", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/w;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n73#1,8:438\n73#1,8:446\n73#1,8:454\n73#1,8:462\n73#1,8:470\n73#1,8:478\n73#1,8:486\n73#1,8:494\n73#1,8:502\n73#1,8:510\n73#1,8:518\n73#1,8:526\n73#1,6:534\n80#1:541\n73#1,8:542\n73#1,8:550\n73#1,8:558\n74#1,7:566\n74#1,7:573\n73#1,8:580\n73#1,8:588\n73#1,8:596\n73#1,8:604\n74#1,7:612\n1#2:540\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n91#1:438,8\n95#1:446,8\n99#1:454,8\n107#1:462,8\n118#1:470,8\n134#1:478,8\n158#1:486,8\n163#1:494,8\n168#1:502,8\n172#1:510,8\n176#1:518,8\n184#1:526,8\n194#1:534,6\n194#1:541\n200#1:542,8\n204#1:550,8\n212#1:558,8\n220#1:566,7\n224#1:573,7\n230#1:580,8\n236#1:588,8\n240#1:596,8\n248#1:604,8\n257#1:612,7\n*E\n"})
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    public static final int NoCharacterFound = -1;

    @l
    private AnnotatedString annotatedString;

    @m
    private final TextLayoutResult layoutResult;

    @l
    private final OffsetMapping offsetMapping;
    private final long originalSelection;

    @l
    private final AnnotatedString originalText;
    private long selection;

    @l
    private final TextPreparedSelectionState state;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection$Companion;", "", "()V", "NoCharacterFound", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j5, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j5;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = j5;
        this.annotatedString = annotatedString;
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j5, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, w wVar) {
        this(annotatedString, j5, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z4, v3.l lVar, int i5, Object obj2) {
        if (obj2 == null) {
            boolean z5 = true;
            if ((i5 & 1) != 0) {
                z4 = true;
            }
            if (z4) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() <= 0) {
                z5 = false;
            }
            if (z5) {
                lVar.invoke(obj);
            }
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
            return (BaseTextPreparedSelection) obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    private final int charOffset(int i5) {
        int B;
        B = u.B(i5, getText$foundation_release().length() - 1);
        return B;
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i5), true));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i5 = baseTextPreparedSelection.transformedMaxOffset();
            }
            return baseTextPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i5)));
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i5 = baseTextPreparedSelection.transformedMinOffset();
            }
            return baseTextPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i5) {
        while (i5 < this.originalText.length()) {
            long m5519getWordBoundaryjx7JFs = textLayoutResult.m5519getWordBoundaryjx7JFs(charOffset(i5));
            if (TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs) <= i5) {
                i5++;
            } else {
                return this.offsetMapping.transformedToOriginal(TextRange.m5540getEndimpl(m5519getWordBoundaryjx7JFs));
            }
        }
        return this.originalText.length();
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i5 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i5) {
        while (i5 > 0) {
            long m5519getWordBoundaryjx7JFs = textLayoutResult.m5519getWordBoundaryjx7JFs(charOffset(i5));
            if (TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs) >= i5) {
                i5--;
            } else {
                return this.offsetMapping.transformedToOriginal(TextRange.m5545getStartimpl(m5519getWordBoundaryjx7JFs));
            }
        }
        return 0;
    }

    static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i5, int i6, Object obj) {
        if (obj == null) {
            if ((i6 & 1) != 0) {
                i5 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean isLtr() {
        ResolvedTextDirection resolvedTextDirection;
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            resolvedTextDirection = textLayoutResult.getParagraphDirection(transformedEndOffset());
        } else {
            resolvedTextDirection = null;
        }
        if (resolvedTextDirection != ResolvedTextDirection.Rtl) {
            return true;
        }
        return false;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i5) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i5;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        l0.m(cachedX);
        float floatValue = cachedX.floatValue();
        if ((isLtr() && floatValue >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && floatValue <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.m5517getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
    }

    private final T moveCursorNext() {
        boolean z4;
        int nextCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (nextCharacterIndex = getNextCharacterIndex()) != -1) {
            setCursor(nextCharacterIndex);
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorNextByWord() {
        boolean z4;
        Integer nextWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (nextWordOffset = getNextWordOffset()) != null) {
            setCursor(nextWordOffset.intValue());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrev() {
        boolean z4;
        int precedingCharacterIndex;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (precedingCharacterIndex = getPrecedingCharacterIndex()) != -1) {
            setCursor(precedingCharacterIndex);
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T moveCursorPrevByWord() {
        boolean z4;
        Integer previousWordOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (previousWordOffset = getPreviousWordOffset()) != null) {
            setCursor(previousWordOffset.intValue());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m5540getEndimpl(this.selection));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m5542getMaximpl(this.selection));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m5543getMinimpl(this.selection));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    protected final <U> T apply(U u4, boolean z4, @l v3.l<? super U, r2> lVar) {
        boolean z5;
        if (z4) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            lVar.invoke(u4);
        }
        l0.n(u4, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u4;
    }

    @l
    public final T collapseLeftOr(@l v3.l<? super T, r2> lVar) {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (TextRange.m5539getCollapsedimpl(this.selection)) {
                l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m5543getMinimpl(this.selection));
            } else {
                setCursor(TextRange.m5542getMaximpl(this.selection));
            }
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T collapseRightOr(@l v3.l<? super T, r2> lVar) {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (TextRange.m5539getCollapsedimpl(this.selection)) {
                l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.invoke(this);
            } else if (isLtr()) {
                setCursor(TextRange.m5542getMaximpl(this.selection));
            } else {
                setCursor(TextRange.m5543getMinimpl(this.selection));
            }
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T deselect() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(TextRange.m5540getEndimpl(this.selection));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @m
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @m
    public final Integer getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @m
    public final Integer getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.annotatedString.getText(), TextRange.m5540getEndimpl(this.selection));
    }

    @m
    public final Integer getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    @l
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m975getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    @l
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.annotatedString.getText(), TextRange.m5540getEndimpl(this.selection));
    }

    @m
    public final Integer getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(getPrevWordOffset$default(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m976getSelectiond9O1mEE() {
        return this.selection;
    }

    @l
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @l
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @l
    public final T moveCursorDownByLine() {
        boolean z4;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorLeft() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorLeftByWord() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorNextByParagraph() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m5542getMaximpl(this.selection));
            if (findParagraphEnd == TextRange.m5542getMaximpl(this.selection) && findParagraphEnd != getText$foundation_release().length()) {
                findParagraphEnd = StringHelpersKt.findParagraphEnd(getText$foundation_release(), findParagraphEnd + 1);
            }
            setCursor(findParagraphEnd);
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorPrevByParagraph() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            int findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m5543getMinimpl(this.selection));
            if (findParagraphStart == TextRange.m5543getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = StringHelpersKt.findParagraphStart(getText$foundation_release(), findParagraphStart - 1);
            }
            setCursor(findParagraphStart);
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorRight() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorRightByWord() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToEnd() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(getText$foundation_release().length());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToHome() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setCursor(0);
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToLineEnd() {
        boolean z4;
        Integer lineEndByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (lineEndByOffset = getLineEndByOffset()) != null) {
            setCursor(lineEndByOffset.intValue());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToLineLeftSide() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToLineRightSide() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
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
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorToLineStart() {
        boolean z4;
        Integer lineStartByOffset;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (lineStartByOffset = getLineStartByOffset()) != null) {
            setCursor(lineStartByOffset.intValue());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T moveCursorUpByLine() {
        boolean z4;
        TextLayoutResult textLayoutResult;
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && (textLayoutResult = this.layoutResult) != null) {
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T selectAll() {
        boolean z4;
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            setSelection(0, getText$foundation_release().length());
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @l
    public final T selectMovement() {
        boolean z4;
        if (getText$foundation_release().length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.selection = TextRangeKt.TextRange(TextRange.m5545getStartimpl(this.originalSelection), TextRange.m5540getEndimpl(this.selection));
        }
        l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void setAnnotatedString(@l AnnotatedString annotatedString) {
        this.annotatedString = annotatedString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCursor(int i5) {
        setSelection(i5, i5);
    }

    protected final void setSelection(int i5, int i6) {
        this.selection = TextRangeKt.TextRange(i5, i6);
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m977setSelection5zctL8(long j5) {
        this.selection = j5;
    }
}
