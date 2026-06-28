package org.osmdroid.util;

import androidx.compose.animation.core.AnimationKt;

/* loaded from: classes4.dex */
public class Delay {
    private long mDuration;
    private final long[] mDurations;
    private int mIndex;
    private long mNextTime;

    public Delay(long j5) {
        this.mDurations = null;
        this.mDuration = j5;
        next();
    }

    private long now() {
        return System.nanoTime() / AnimationKt.MillisToNanos;
    }

    public long next() {
        long j5;
        long[] jArr = this.mDurations;
        if (jArr == null) {
            j5 = this.mDuration;
        } else {
            int i5 = this.mIndex;
            long j6 = jArr[i5];
            if (i5 < jArr.length - 1) {
                this.mIndex = i5 + 1;
            }
            j5 = j6;
        }
        this.mNextTime = now() + j5;
        return j5;
    }

    public boolean shouldWait() {
        return now() < this.mNextTime;
    }

    public Delay(long[] jArr) {
        if (jArr != null && jArr.length != 0) {
            this.mDurations = jArr;
            next();
            return;
        }
        throw new IllegalArgumentException();
    }
}
