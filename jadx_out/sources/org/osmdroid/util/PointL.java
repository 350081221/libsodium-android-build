package org.osmdroid.util;

/* loaded from: classes4.dex */
public class PointL {

    /* renamed from: x, reason: collision with root package name */
    public long f21839x;

    /* renamed from: y, reason: collision with root package name */
    public long f21840y;

    public PointL() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointL)) {
            return false;
        }
        PointL pointL = (PointL) obj;
        if (this.f21839x == pointL.f21839x && this.f21840y == pointL.f21840y) {
            return true;
        }
        return false;
    }

    public final void offset(long j5, long j6) {
        this.f21839x += j5;
        this.f21840y += j6;
    }

    public void set(PointL pointL) {
        this.f21839x = pointL.f21839x;
        this.f21840y = pointL.f21840y;
    }

    public String toString() {
        return "PointL(" + this.f21839x + ", " + this.f21840y + ")";
    }

    public PointL(long j5, long j6) {
        this.f21839x = j5;
        this.f21840y = j6;
    }

    public void set(long j5, long j6) {
        this.f21839x = j5;
        this.f21840y = j6;
    }

    public PointL(PointL pointL) {
        set(pointL);
    }
}
