package org.osmdroid.util;

import android.graphics.Path;

/* loaded from: classes4.dex */
public class PathBuilder implements PointAccepter {
    private boolean mFirst;
    private final PointL mLatestPoint = new PointL();
    private final Path mPath;

    public PathBuilder(Path path) {
        this.mPath = path;
    }

    @Override // org.osmdroid.util.PointAccepter
    public void add(long j5, long j6) {
        if (this.mFirst) {
            this.mFirst = false;
            this.mPath.moveTo((float) j5, (float) j6);
            this.mLatestPoint.set(j5, j6);
        } else {
            PointL pointL = this.mLatestPoint;
            if (pointL.f21839x != j5 || pointL.f21840y != j6) {
                this.mPath.lineTo((float) j5, (float) j6);
                this.mLatestPoint.set(j5, j6);
            }
        }
    }

    @Override // org.osmdroid.util.PointAccepter
    public void end() {
    }

    @Override // org.osmdroid.util.PointAccepter
    public void init() {
        this.mFirst = true;
    }
}
