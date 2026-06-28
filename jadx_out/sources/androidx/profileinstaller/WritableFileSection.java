package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i5, @NonNull byte[] bArr, boolean z4) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i5;
        this.mContents = bArr;
        this.mNeedsCompression = z4;
    }
}
