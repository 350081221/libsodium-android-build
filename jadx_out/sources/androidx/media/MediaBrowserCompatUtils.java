package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
    }

    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle2 == null) {
            if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == -1 && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1) && bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1) == bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1)) {
            return true;
        }
        return false;
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        if (bundle == null) {
            i5 = -1;
        } else {
            i5 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        }
        if (bundle2 == null) {
            i6 = -1;
        } else {
            i6 = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
        }
        if (bundle == null) {
            i7 = -1;
        } else {
            i7 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        }
        if (bundle2 == null) {
            i8 = -1;
        } else {
            i8 = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
        }
        int i12 = Integer.MAX_VALUE;
        if (i5 != -1 && i7 != -1) {
            i10 = i5 * i7;
            i9 = (i7 + i10) - 1;
        } else {
            i9 = Integer.MAX_VALUE;
            i10 = 0;
        }
        if (i6 != -1 && i8 != -1) {
            i11 = i6 * i8;
            i12 = (i8 + i11) - 1;
        } else {
            i11 = 0;
        }
        if (i9 >= i11 && i12 >= i10) {
            return true;
        }
        return false;
    }
}
