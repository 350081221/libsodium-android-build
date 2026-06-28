package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "locale", "Ljava/util/Locale;", "text", "", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordEnd", "", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WordBoundary {
    public static final int $stable = 8;

    @l
    private final WordIterator wordIterator;

    public WordBoundary(@l Locale locale, @l CharSequence charSequence) {
        this.wordIterator = new WordIterator(charSequence, 0, charSequence.length(), locale);
    }

    public final int getWordEnd(int i5) {
        int nextWordEndOnTwoWordBoundary;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i5))) {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getPunctuationEnd(i5);
        } else {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getNextWordEndOnTwoWordBoundary(i5);
        }
        if (nextWordEndOnTwoWordBoundary != -1) {
            return nextWordEndOnTwoWordBoundary;
        }
        return i5;
    }

    public final int getWordStart(int i5) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i5))) {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPunctuationBeginning(i5);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i5);
        }
        if (prevWordBeginningOnTwoWordsBoundary != -1) {
            return prevWordBeginningOnTwoWordsBoundary;
        }
        return i5;
    }
}
