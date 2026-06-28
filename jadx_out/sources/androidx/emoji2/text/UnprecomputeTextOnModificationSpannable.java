package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class UnprecomputeTextOnModificationSpannable implements Spannable {

    @NonNull
    private Spannable mDelegate;
    private boolean mSafeToWrite = false;

    @RequiresApi(24)
    /* loaded from: classes2.dex */
    private static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
        }

        static IntStream chars(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream codePoints(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class PrecomputedTextDetector {
        PrecomputedTextDetector() {
        }

        boolean isPrecomputedText(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(28)
    /* loaded from: classes2.dex */
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        boolean isPrecomputedText(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnprecomputeTextOnModificationSpannable(@NonNull Spannable spannable) {
        this.mDelegate = spannable;
    }

    private void ensureSafeWrites() {
        Spannable spannable = this.mDelegate;
        if (!this.mSafeToWrite && precomputedTextDetector().isPrecomputedText(spannable)) {
            this.mDelegate = new SpannableString(spannable);
        }
        this.mSafeToWrite = true;
    }

    static PrecomputedTextDetector precomputedTextDetector() {
        if (Build.VERSION.SDK_INT < 28) {
            return new PrecomputedTextDetector();
        }
        return new PrecomputedTextDetector_28();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i5) {
        return this.mDelegate.charAt(i5);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public IntStream chars() {
        return CharSequenceHelper_API24.chars(this.mDelegate);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public IntStream codePoints() {
        return CharSequenceHelper_API24.codePoints(this.mDelegate);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.mDelegate.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.mDelegate.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.mDelegate.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i5, int i6, Class<T> cls) {
        return (T[]) this.mDelegate.getSpans(i5, i6, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Spannable getUnwrappedSpannable() {
        return this.mDelegate;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mDelegate.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i5, int i6, Class cls) {
        return this.mDelegate.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        ensureSafeWrites();
        this.mDelegate.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i5, int i6, int i7) {
        ensureSafeWrites();
        this.mDelegate.setSpan(obj, i5, i6, i7);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i5, int i6) {
        return this.mDelegate.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.mDelegate.toString();
    }

    UnprecomputeTextOnModificationSpannable(@NonNull Spanned spanned) {
        this.mDelegate = new SpannableString(spanned);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UnprecomputeTextOnModificationSpannable(@NonNull CharSequence charSequence) {
        this.mDelegate = new SpannableString(charSequence);
    }
}
