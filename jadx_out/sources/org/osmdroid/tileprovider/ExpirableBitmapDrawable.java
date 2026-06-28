package org.osmdroid.tileprovider;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class ExpirableBitmapDrawable extends BitmapDrawable {
    public static final int EXPIRED = -2;
    public static final int NOT_FOUND = -4;
    public static final int SCALED = -3;
    public static final int UP_TO_DATE = -1;
    private static final int defaultStatus = -1;
    private static final int[] settableStatuses = {-2, -3, -4};
    private int[] mState;

    public ExpirableBitmapDrawable(Bitmap bitmap) {
        super(bitmap);
        this.mState = new int[0];
    }

    @Deprecated
    public static boolean isDrawableExpired(Drawable drawable) {
        return getState(drawable) == -2;
    }

    @Deprecated
    public static void setDrawableExpired(Drawable drawable) {
        setState(drawable, -2);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.mState;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mState.length > 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        this.mState = iArr;
        return true;
    }

    public static int getState(Drawable drawable) {
        for (int i5 : drawable.getState()) {
            for (int i6 : settableStatuses) {
                if (i5 == i6) {
                    return i5;
                }
            }
        }
        return -1;
    }

    public static void setState(Drawable drawable, int i5) {
        drawable.setState(new int[]{i5});
    }
}
