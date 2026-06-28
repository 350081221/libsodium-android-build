package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(19)
    /* loaded from: classes2.dex */
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(CharSequence charSequence, int i5, int i6) {
            int length = charSequence.length();
            if (i5 < 0 || length < i5 || i6 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i6 != 0) {
                    i5--;
                    if (i5 < 0) {
                        if (z4) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i5);
                    if (z4) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i6--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i6--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z4 = true;
                    }
                }
                return i5;
            }
        }

        static int findIndexForward(CharSequence charSequence, int i5, int i6) {
            int length = charSequence.length();
            if (i5 < 0 || length < i5 || i6 < 0) {
                return -1;
            }
            while (true) {
                boolean z4 = false;
                while (i6 != 0) {
                    if (i5 >= length) {
                        if (z4) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i5);
                    if (z4) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i6--;
                        i5++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i6--;
                        i5++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i5++;
                        z4 = true;
                    }
                }
                return i5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i5, int i6, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            Spannable spannableString;
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.spannable = new UnprecomputeTextOnModificationSpannable(spannableString);
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i5, i6, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i5, int i6, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        EmojiProcessLookupCallback(int i5) {
            this.mOffset = i5;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i5, int i6, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i7 = this.mOffset;
            if (i5 <= i7 && i7 < i6) {
                this.start = i5;
                this.end = i6;
                return false;
            }
            if (i6 > i7) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i5, int i6, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i5, i6), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(MetadataRepo.Node node, boolean z4, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z4;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i5) {
            return i5 == 65039;
        }

        private static boolean isTextStyle(int i5) {
            return i5 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int check(int i5) {
            MetadataRepo.Node node = this.mCurrentNode.get(i5);
            int i6 = 2;
            if (this.mState != 2) {
                if (node == null) {
                    i6 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i5)) {
                i6 = reset();
            } else if (!isEmojiStyle(i5)) {
                if (this.mCurrentNode.getData() != null) {
                    i6 = 3;
                    if (this.mCurrentDepth == 1) {
                        if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                            this.mFlushNode = this.mCurrentNode;
                            reset();
                        } else {
                            i6 = reset();
                        }
                    } else {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    }
                } else {
                    i6 = reset();
                }
            }
            this.mLastCodepoint = i5;
            return i6;
        }

        TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        boolean isInFlushableState() {
            if (this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z4, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z4;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z4) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, boolean z4) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i5 >= 0 && i6 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z4) {
                max = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i5, 0));
                min = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i6, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i5, 0);
                min = Math.min(selectionEnd + i6, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(max, min, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean handleOnKeyDown(@NonNull Editable editable, int i5, @NonNull KeyEvent keyEvent) {
        boolean delete;
        if (i5 != 67) {
            if (i5 != 112) {
                delete = false;
            } else {
                delete = delete(editable, keyEvent, true);
            }
        } else {
            delete = delete(editable, keyEvent, false);
        }
        if (!delete) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean hasGlyph(CharSequence charSequence, int i5, int i6, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i5, i6, typefaceEmojiRasterizer.getSdkAdded()));
        }
        if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
            return true;
        }
        return false;
    }

    private static boolean hasInvalidSelection(int i5, int i6) {
        return i5 == -1 || i6 == -1 || i5 != i6;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i5) {
        if (i5 >= 0 && i5 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i5, i5 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanEnd(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i5 - 16), Math.min(charSequence.length(), i5 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i5))).end;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i5) {
        if (i5 >= 0 && i5 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i5, i5 + 1, EmojiSpan.class);
                if (emojiSpanArr.length > 0) {
                    return spanned.getSpanStart(emojiSpanArr[0]);
                }
            }
            return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i5 - 16), Math.min(charSequence.length(), i5 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i5))).start;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        ((androidx.emoji2.text.SpannableBuilder) r11).endBatchEdit();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:50:0x000e, B:53:0x0013, B:55:0x0017, B:57:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:24:0x0063, B:30:0x0071, B:31:0x007d, B:33:0x0091, B:6:0x002c), top: B:49:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:50:0x000e, B:53:0x0013, B:55:0x0017, B:57:0x0024, B:9:0x0037, B:11:0x003f, B:13:0x0042, B:15:0x0046, B:17:0x0052, B:19:0x0055, B:24:0x0063, B:30:0x0071, B:31:0x007d, B:33:0x0091, B:6:0x002c), top: B:49:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r11, @androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.IntRange(from = 0) int r13, @androidx.annotation.IntRange(from = 0) int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r11
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r1 = androidx.emoji2.text.EmojiSpan.class
            if (r0 != 0) goto L2c
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L13
            goto L2c
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L2a
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> Laf
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> Laf
            if (r2 > r13) goto L2a
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Laf
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Laf
            goto L34
        L2a:
            r2 = 0
            goto L34
        L2c:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> Laf
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Laf
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Laf
        L34:
            r3 = 0
            if (r2 == 0) goto L60
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.EmojiSpan[] r4 = (androidx.emoji2.text.EmojiSpan[]) r4     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Throwable -> Laf
            if (r5 <= 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Throwable -> Laf
            r6 = r3
        L44:
            if (r6 >= r5) goto L60
            r7 = r4[r6]     // Catch: java.lang.Throwable -> Laf
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> Laf
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> Laf
            if (r8 == r13) goto L55
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> Laf
        L55:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> Laf
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> Laf
            int r6 = r6 + 1
            goto L44
        L60:
            r4 = r13
            if (r12 == r4) goto La6
            int r13 = r11.length()     // Catch: java.lang.Throwable -> Laf
            if (r12 < r13) goto L6a
            goto La6
        L6a:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L7d
            if (r2 == 0) goto L7d
            int r13 = r2.length()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.EmojiSpan[] r13 = (androidx.emoji2.text.EmojiSpan[]) r13     // Catch: java.lang.Throwable -> Laf
            int r13 = r13.length     // Catch: java.lang.Throwable -> Laf
            int r14 = r14 - r13
        L7d:
            r5 = r14
            androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback r7 = new androidx.emoji2.text.EmojiProcessor$EmojiProcessAddSpanCallback     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.EmojiCompat$SpanFactory r13 = r10.mSpanFactory     // Catch: java.lang.Throwable -> Laf
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> Laf
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.process(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r12 = (androidx.emoji2.text.UnprecomputeTextOnModificationSpannable) r12     // Catch: java.lang.Throwable -> Laf
            if (r12 == 0) goto L9d
            android.text.Spannable r12 = r12.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L9c
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L9c:
            return r12
        L9d:
            if (r0 == 0) goto La5
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.endBatchEdit()
        La5:
            return r11
        La6:
            if (r0 == 0) goto Lae
            r12 = r11
            androidx.emoji2.text.SpannableBuilder r12 = (androidx.emoji2.text.SpannableBuilder) r12
            r12.endBatchEdit()
        Lae:
            return r11
        Laf:
            r12 = move-exception
            if (r0 == 0) goto Lb7
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        Lb7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.process(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEmojiMatch(@NonNull CharSequence charSequence, int i5) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int codePointAt = Character.codePointAt(charSequence, i6);
            int check = processorSm.check(codePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check == 1) {
                i6 += Character.charCount(codePointAt);
                i8 = 0;
            } else if (check == 2) {
                i6 += Character.charCount(codePointAt);
            } else if (check == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i5) {
                    i7++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i5) {
                i8++;
            }
        }
        if (i7 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i5) {
            return i8 == 0 ? 0 : 2;
        }
        return 1;
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, @IntRange(from = 0) int i7, boolean z4, EmojiProcessCallback<T> emojiProcessCallback) {
        int i8;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int i9 = 0;
        boolean z5 = true;
        int codePointAt = Character.codePointAt(charSequence, i5);
        loop0: while (true) {
            i8 = i5;
            while (i5 < i6 && i9 < i7 && z5) {
                int check = processorSm.check(codePointAt);
                if (check == 1) {
                    i8 += Character.charCount(Character.codePointAt(charSequence, i8));
                    if (i8 < i6) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                    i5 = i8;
                } else if (check == 2) {
                    i5 += Character.charCount(codePointAt);
                    if (i5 < i6) {
                        codePointAt = Character.codePointAt(charSequence, i5);
                    }
                } else if (check == 3) {
                    if (z4 || !hasGlyph(charSequence, i8, i5, processorSm.getFlushMetadata())) {
                        i9++;
                        z5 = emojiProcessCallback.handleEmoji(charSequence, i8, i5, processorSm.getFlushMetadata());
                    }
                }
            }
        }
        if (processorSm.isInFlushableState() && i9 < i7 && z5 && (z4 || !hasGlyph(charSequence, i8, i5, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i8, i5, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
