package org.osmdroid.tileprovider;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class ReusableBitmapDrawable extends ExpirableBitmapDrawable {
    private boolean mBitmapRecycled;
    private int mUsageRefCount;

    public ReusableBitmapDrawable(Bitmap bitmap) {
        super(bitmap);
        this.mBitmapRecycled = false;
        this.mUsageRefCount = 0;
    }

    public void beginUsingDrawable() {
        synchronized (this) {
            this.mUsageRefCount++;
        }
    }

    public void finishUsingDrawable() {
        synchronized (this) {
            int i5 = this.mUsageRefCount - 1;
            this.mUsageRefCount = i5;
            if (i5 < 0) {
                throw new IllegalStateException("Unbalanced endUsingDrawable() called.");
            }
        }
    }

    public boolean isBitmapValid() {
        boolean z4;
        synchronized (this) {
            if (!this.mBitmapRecycled) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        return z4;
    }

    public Bitmap tryRecycle() {
        synchronized (this) {
            if (this.mUsageRefCount == 0) {
                this.mBitmapRecycled = true;
                return getBitmap();
            }
            return null;
        }
    }
}
