package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

/* loaded from: classes2.dex */
public final class EmojiEditTextHelper {
    private int mEmojiReplaceStrategy;
    private final HelperInternal mHelper;
    private int mMaxEmojiCount;

    /* loaded from: classes2.dex */
    static class HelperInternal {
        HelperInternal() {
        }

        @Nullable
        KeyListener getKeyListener(@Nullable KeyListener keyListener) {
            return keyListener;
        }

        boolean isEnabled() {
            return false;
        }

        InputConnection onCreateInputConnection(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }

        void setEmojiReplaceStrategy(int i5) {
        }

        void setEnabled(boolean z4) {
        }

        void setMaxEmojiCount(int i5) {
        }
    }

    @RequiresApi(19)
    /* loaded from: classes2.dex */
    private static class HelperInternal19 extends HelperInternal {
        private final EditText mEditText;
        private final EmojiTextWatcher mTextWatcher;

        HelperInternal19(@NonNull EditText editText, boolean z4) {
            this.mEditText = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z4);
            this.mTextWatcher = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            editText.setEditableFactory(EmojiEditableFactory.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        KeyListener getKeyListener(@Nullable KeyListener keyListener) {
            if (keyListener instanceof EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new EmojiKeyListener(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        boolean isEnabled() {
            return this.mTextWatcher.isEnabled();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        InputConnection onCreateInputConnection(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            if (inputConnection instanceof EmojiInputConnection) {
                return inputConnection;
            }
            return new EmojiInputConnection(this.mEditText, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setEmojiReplaceStrategy(int i5) {
            this.mTextWatcher.setEmojiReplaceStrategy(i5);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setEnabled(boolean z4) {
            this.mTextWatcher.setEnabled(z4);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setMaxEmojiCount(int i5) {
            this.mTextWatcher.setMaxEmojiCount(i5);
        }
    }

    public EmojiEditTextHelper(@NonNull EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    @Nullable
    public KeyListener getKeyListener(@Nullable KeyListener keyListener) {
        return this.mHelper.getKeyListener(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    public boolean isEnabled() {
        return this.mHelper.isEnabled();
    }

    @Nullable
    public InputConnection onCreateInputConnection(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.mHelper.onCreateInputConnection(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEmojiReplaceStrategy(int i5) {
        this.mEmojiReplaceStrategy = i5;
        this.mHelper.setEmojiReplaceStrategy(i5);
    }

    public void setEnabled(boolean z4) {
        this.mHelper.setEnabled(z4);
    }

    public void setMaxEmojiCount(@IntRange(from = 0) int i5) {
        Preconditions.checkArgumentNonnegative(i5, "maxEmojiCount should be greater than 0");
        this.mMaxEmojiCount = i5;
        this.mHelper.setMaxEmojiCount(i5);
    }

    public EmojiEditTextHelper(@NonNull EditText editText, boolean z4) {
        this.mMaxEmojiCount = Integer.MAX_VALUE;
        this.mEmojiReplaceStrategy = 0;
        Preconditions.checkNotNull(editText, "editText cannot be null");
        this.mHelper = new HelperInternal19(editText, z4);
    }
}
