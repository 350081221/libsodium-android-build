package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class TileStates {
    private boolean mDone;
    private int mExpired;
    private int mNotFound;
    private Collection<Runnable> mRunAfters = new LinkedHashSet();
    private int mScaled;
    private int mTotal;
    private int mUpToDate;

    public void finaliseLoop() {
        this.mDone = true;
        for (Runnable runnable : this.mRunAfters) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public int getExpired() {
        return this.mExpired;
    }

    public int getNotFound() {
        return this.mNotFound;
    }

    public Collection<Runnable> getRunAfters() {
        return this.mRunAfters;
    }

    public int getScaled() {
        return this.mScaled;
    }

    public int getTotal() {
        return this.mTotal;
    }

    public int getUpToDate() {
        return this.mUpToDate;
    }

    public void handleTile(Drawable drawable) {
        this.mTotal++;
        if (drawable == null) {
            this.mNotFound++;
            return;
        }
        int state = ExpirableBitmapDrawable.getState(drawable);
        if (state != -4) {
            if (state != -3) {
                if (state != -2) {
                    if (state == -1) {
                        this.mUpToDate++;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown state: " + state);
                }
                this.mExpired++;
                return;
            }
            this.mScaled++;
            return;
        }
        this.mNotFound++;
    }

    public void initialiseLoop() {
        this.mDone = false;
        this.mTotal = 0;
        this.mUpToDate = 0;
        this.mExpired = 0;
        this.mScaled = 0;
        this.mNotFound = 0;
    }

    public boolean isDone() {
        return this.mDone;
    }

    public String toString() {
        if (this.mDone) {
            return "TileStates: " + this.mTotal + " = " + this.mUpToDate + "(U) + " + this.mExpired + "(E) + " + this.mScaled + "(S) + " + this.mNotFound + "(N)";
        }
        return "TileStates";
    }
}
