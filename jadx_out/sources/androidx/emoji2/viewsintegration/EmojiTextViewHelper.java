package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;

/* loaded from: classes2.dex */
public final class EmojiTextViewHelper {
    private final HelperInternal mHelper;

    /* loaded from: classes2.dex */
    static class HelperInternal {
        HelperInternal() {
        }

        @NonNull
        InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean isEnabled() {
            return false;
        }

        void setAllCaps(boolean z4) {
        }

        void setEnabled(boolean z4) {
        }

        void updateTransformationMethod() {
        }

        @Nullable
        TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes2.dex */
    private static class HelperInternal19 extends HelperInternal {
        private final EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled = true;
        private final TextView mTextView;

        HelperInternal19(TextView textView) {
            this.mTextView = textView;
            this.mEmojiInputFilter = new EmojiInputFilter(textView);
        }

        @NonNull
        private InputFilter[] addEmojiInputFilterIfMissing(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.mEmojiInputFilter) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.mEmojiInputFilter;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> getEmojiInputFilterPositionArray(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof EmojiInputFilter) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        private InputFilter[] removeEmojiInputFilterIfPresent(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (emojiInputFilterPositionArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }

        @Nullable
        private TransformationMethod unwrapForDisabled(@Nullable TransformationMethod transformationMethod) {
            if (transformationMethod instanceof EmojiTransformationMethod) {
                return ((EmojiTransformationMethod) transformationMethod).getOriginalTransformationMethod();
            }
            return transformationMethod;
        }

        private void updateFilters() {
            this.mTextView.setFilters(getFilters(this.mTextView.getFilters()));
        }

        @NonNull
        private TransformationMethod wrapForEnabled(@Nullable TransformationMethod transformationMethod) {
            if (transformationMethod instanceof EmojiTransformationMethod) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new EmojiTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            if (!this.mEnabled) {
                return removeEmojiInputFilterIfPresent(inputFilterArr);
            }
            return addEmojiInputFilterIfMissing(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mEnabled;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean z4) {
            if (z4) {
                updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean z4) {
            this.mEnabled = z4;
            updateTransformationMethod();
            updateFilters();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        void setEnabledUnsafe(boolean z4) {
            this.mEnabled = z4;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
            this.mTextView.setTransformationMethod(wrapTransformationMethod(this.mTextView.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            if (this.mEnabled) {
                return wrapForEnabled(transformationMethod);
            }
            return unwrapForDisabled(transformationMethod);
        }
    }

    @RequiresApi(19)
    /* loaded from: classes2.dex */
    private static class SkippingHelper19 extends HelperInternal {
        private final HelperInternal19 mHelperDelegate;

        SkippingHelper19(TextView textView) {
            this.mHelperDelegate = new HelperInternal19(textView);
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            return !EmojiCompat.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @NonNull
        InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return inputFilterArr;
            }
            return this.mHelperDelegate.getFilters(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mHelperDelegate.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean z4) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.setAllCaps(z4);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean z4) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.setEnabledUnsafe(z4);
            } else {
                this.mHelperDelegate.setEnabled(z4);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.updateTransformationMethod();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        @Nullable
        TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return transformationMethod;
            }
            return this.mHelperDelegate.wrapTransformationMethod(transformationMethod);
        }
    }

    public EmojiTextViewHelper(@NonNull TextView textView) {
        this(textView, true);
    }

    @NonNull
    public InputFilter[] getFilters(@NonNull InputFilter[] inputFilterArr) {
        return this.mHelper.getFilters(inputFilterArr);
    }

    public boolean isEnabled() {
        return this.mHelper.isEnabled();
    }

    public void setAllCaps(boolean z4) {
        this.mHelper.setAllCaps(z4);
    }

    public void setEnabled(boolean z4) {
        this.mHelper.setEnabled(z4);
    }

    public void updateTransformationMethod() {
        this.mHelper.updateTransformationMethod();
    }

    @Nullable
    public TransformationMethod wrapTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        return this.mHelper.wrapTransformationMethod(transformationMethod);
    }

    public EmojiTextViewHelper(@NonNull TextView textView, boolean z4) {
        Preconditions.checkNotNull(textView, "textView cannot be null");
        if (!z4) {
            this.mHelper = new SkippingHelper19(textView);
        } else {
            this.mHelper = new HelperInternal19(textView);
        }
    }
}
