package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import i0.b;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "getPrevWordBeginningOnTwoWordsBoundary", "getBeginning", "getNextWordEndOnTwoWordBoundary", "getEnd", "isPunctuationStartBoundary", "isPunctuationEndBoundary", "isAfterLetterOrDigit", "isOnLetterOrDigit", "Lkotlin/r2;", "checkOffsetIsValid", "nextBoundary", "prevBoundary", "getPunctuationBeginning", "getPunctuationEnd", "isAfterPunctuation", "isOnPunctuation", "", "charSequence", "Ljava/lang/CharSequence;", "start", "I", "end", "Ljava/text/BreakIterator;", "iterator", "Ljava/text/BreakIterator;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;

    @l
    private final CharSequence charSequence;
    private final int end;

    @l
    private final BreakIterator iterator;
    private final int start;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", b.f16159m, "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i5) {
            int type = Character.getType(i5);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(@l CharSequence charSequence, int i5, int i6, @m Locale locale) {
        boolean z4;
        this.charSequence = charSequence;
        if (i5 >= 0 && i5 <= charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 >= 0 && i6 <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                this.iterator = wordInstance;
                this.start = Math.max(0, i5 - 50);
                this.end = Math.min(charSequence.length(), i6 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i5, i6));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    private final void checkOffsetIsValid(int i5) {
        int i6 = this.start;
        boolean z4 = false;
        if (i5 <= this.end && i6 <= i5) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i5 + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
    }

    private final int getBeginning(int i5, boolean z4) {
        checkOffsetIsValid(i5);
        if (isOnLetterOrDigit(i5)) {
            if (!this.iterator.isBoundary(i5) || (isAfterLetterOrDigit(i5) && z4)) {
                return this.iterator.preceding(i5);
            }
            return i5;
        }
        if (isAfterLetterOrDigit(i5)) {
            return this.iterator.preceding(i5);
        }
        return -1;
    }

    private final int getEnd(int i5, boolean z4) {
        checkOffsetIsValid(i5);
        if (isAfterLetterOrDigit(i5)) {
            if (!this.iterator.isBoundary(i5) || (isOnLetterOrDigit(i5) && z4)) {
                return this.iterator.following(i5);
            }
            return i5;
        }
        if (isOnLetterOrDigit(i5)) {
            return this.iterator.following(i5);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigit(int i5) {
        boolean z4;
        int i6 = this.start + 1;
        if (i5 <= this.end && i6 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i5))) {
            return true;
        }
        return false;
    }

    private final boolean isOnLetterOrDigit(int i5) {
        boolean z4;
        int i6 = this.start;
        if (i5 < this.end && i6 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i5))) {
            return true;
        }
        return false;
    }

    private final boolean isPunctuationEndBoundary(int i5) {
        return !isOnPunctuation(i5) && isAfterPunctuation(i5);
    }

    private final boolean isPunctuationStartBoundary(int i5) {
        return isOnPunctuation(i5) && !isAfterPunctuation(i5);
    }

    public final int getNextWordEndOnTwoWordBoundary(int i5) {
        return getEnd(i5, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i5) {
        return getBeginning(i5, true);
    }

    public final int getPunctuationBeginning(int i5) {
        checkOffsetIsValid(i5);
        while (i5 != -1 && !isPunctuationStartBoundary(i5)) {
            i5 = prevBoundary(i5);
        }
        return i5;
    }

    public final int getPunctuationEnd(int i5) {
        checkOffsetIsValid(i5);
        while (i5 != -1 && !isPunctuationEndBoundary(i5)) {
            i5 = nextBoundary(i5);
        }
        return i5;
    }

    public final boolean isAfterPunctuation(int i5) {
        boolean z4 = true;
        int i6 = this.start + 1;
        if (i5 > this.end || i6 > i5) {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i5));
    }

    public final boolean isOnPunctuation(int i5) {
        boolean z4;
        int i6 = this.start;
        if (i5 < this.end && i6 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i5));
    }

    public final int nextBoundary(int i5) {
        checkOffsetIsValid(i5);
        return this.iterator.following(i5);
    }

    public final int prevBoundary(int i5) {
        checkOffsetIsValid(i5);
        return this.iterator.preceding(i5);
    }
}
