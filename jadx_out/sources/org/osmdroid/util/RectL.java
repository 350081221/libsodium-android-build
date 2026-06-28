package org.osmdroid.util;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public class RectL {
    public long bottom;
    public long left;
    public long right;
    public long top;

    public RectL() {
    }

    public static RectL getBounds(RectL rectL, long j5, long j6, double d5, RectL rectL2) {
        RectL rectL3 = rectL2 != null ? rectL2 : new RectL();
        if (d5 == 0.0d) {
            rectL3.top = rectL.top;
            rectL3.left = rectL.left;
            rectL3.bottom = rectL.bottom;
            rectL3.right = rectL.right;
            return rectL3;
        }
        double d6 = (3.141592653589793d * d5) / 180.0d;
        double cos = Math.cos(d6);
        double sin = Math.sin(d6);
        long j7 = rectL.left;
        long j8 = rectL.top;
        long rotatedX = getRotatedX(j7, j8, j5, j6, cos, sin);
        long rotatedY = getRotatedY(j7, j8, j5, j6, cos, sin);
        rectL3.bottom = rotatedY;
        rectL3.top = rotatedY;
        rectL3.right = rotatedX;
        rectL3.left = rotatedX;
        long j9 = rectL.right;
        long j10 = rectL.top;
        long rotatedX2 = getRotatedX(j9, j10, j5, j6, cos, sin);
        long rotatedY2 = getRotatedY(j9, j10, j5, j6, cos, sin);
        if (rectL3.top > rotatedY2) {
            rectL3.top = rotatedY2;
        }
        if (rectL3.bottom < rotatedY2) {
            rectL3.bottom = rotatedY2;
        }
        if (rectL3.left > rotatedX2) {
            rectL3.left = rotatedX2;
        }
        if (rectL3.right < rotatedX2) {
            rectL3.right = rotatedX2;
        }
        long j11 = rectL.right;
        long j12 = rectL.bottom;
        long rotatedX3 = getRotatedX(j11, j12, j5, j6, cos, sin);
        long rotatedY3 = getRotatedY(j11, j12, j5, j6, cos, sin);
        if (rectL3.top > rotatedY3) {
            rectL3.top = rotatedY3;
        }
        if (rectL3.bottom < rotatedY3) {
            rectL3.bottom = rotatedY3;
        }
        if (rectL3.left > rotatedX3) {
            rectL3.left = rotatedX3;
        }
        if (rectL3.right < rotatedX3) {
            rectL3.right = rotatedX3;
        }
        long j13 = rectL.left;
        long j14 = rectL.bottom;
        long rotatedX4 = getRotatedX(j13, j14, j5, j6, cos, sin);
        long rotatedY4 = getRotatedY(j13, j14, j5, j6, cos, sin);
        if (rectL3.top > rotatedY4) {
            rectL3.top = rotatedY4;
        }
        if (rectL3.bottom < rotatedY4) {
            rectL3.bottom = rotatedY4;
        }
        if (rectL3.left > rotatedX4) {
            rectL3.left = rotatedX4;
        }
        if (rectL3.right < rotatedX4) {
            rectL3.right = rotatedX4;
        }
        return rectL3;
    }

    public static long getRotatedX(long j5, long j6, double d5, long j7, long j8) {
        if (d5 == 0.0d) {
            return j5;
        }
        double d6 = (3.141592653589793d * d5) / 180.0d;
        return getRotatedX(j5, j6, j7, j8, Math.cos(d6), Math.sin(d6));
    }

    public static long getRotatedY(long j5, long j6, double d5, long j7, long j8) {
        if (d5 == 0.0d) {
            return j6;
        }
        double d6 = (3.141592653589793d * d5) / 180.0d;
        return getRotatedY(j5, j6, j7, j8, Math.cos(d6), Math.sin(d6));
    }

    public static boolean intersects(RectL rectL, RectL rectL2) {
        return rectL.left < rectL2.right && rectL2.left < rectL.right && rectL.top < rectL2.bottom && rectL2.top < rectL.bottom;
    }

    public long centerX() {
        return (this.left + this.right) / 2;
    }

    public long centerY() {
        return (this.top + this.bottom) / 2;
    }

    public boolean contains(long j5, long j6) {
        long j7 = this.left;
        long j8 = this.right;
        if (j7 < j8) {
            long j9 = this.top;
            long j10 = this.bottom;
            if (j9 < j10 && j5 >= j7 && j5 < j8 && j6 >= j9 && j6 < j10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RectL rectL = (RectL) obj;
        if (this.left == rectL.left && this.top == rectL.top && this.right == rectL.right && this.bottom == rectL.bottom) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (((((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom) % 2147483647L);
    }

    public final long height() {
        return this.bottom - this.top;
    }

    public void inset(long j5, long j6) {
        this.left += j5;
        this.top += j6;
        this.right -= j5;
        this.bottom -= j6;
    }

    public void offset(long j5, long j6) {
        this.left += j5;
        this.top += j6;
        this.right += j5;
        this.bottom += j6;
    }

    public void set(long j5, long j6, long j7, long j8) {
        this.left = j5;
        this.top = j6;
        this.right = j7;
        this.bottom = j8;
    }

    public String toString() {
        return "RectL(" + this.left + ", " + this.top + " - " + this.right + ", " + this.bottom + ")";
    }

    public void union(long j5, long j6) {
        if (j5 < this.left) {
            this.left = j5;
        } else if (j5 > this.right) {
            this.right = j5;
        }
        if (j6 < this.top) {
            this.top = j6;
        } else if (j6 > this.bottom) {
            this.bottom = j6;
        }
    }

    public final long width() {
        return this.right - this.left;
    }

    public RectL(long j5, long j6, long j7, long j8) {
        set(j5, j6, j7, j8);
    }

    public static long getRotatedX(long j5, long j6, long j7, long j8, double d5, double d6) {
        return j7 + Math.round(((j5 - j7) * d5) - ((j6 - j8) * d6));
    }

    public static long getRotatedY(long j5, long j6, long j7, long j8, double d5, double d6) {
        return j8 + Math.round(((j5 - j7) * d6) + ((j6 - j8) * d5));
    }

    public RectL(RectL rectL) {
        set(rectL);
    }

    public void set(RectL rectL) {
        this.left = rectL.left;
        this.top = rectL.top;
        this.right = rectL.right;
        this.bottom = rectL.bottom;
    }

    public void union(long j5, long j6, long j7, long j8) {
        long j9 = j8;
        if (j5 >= j7 || j6 >= j9) {
            return;
        }
        long j10 = this.left;
        long j11 = this.right;
        if (j10 < j11) {
            long j12 = this.top;
            long j13 = this.bottom;
            if (j12 < j13) {
                if (j10 > j5) {
                    this.left = j5;
                }
                if (j12 > j6) {
                    this.top = j6;
                }
                if (j11 < j7) {
                    this.right = j7;
                }
                if (j13 < j8) {
                    this.bottom = j8;
                    return;
                }
                return;
            }
            j9 = j8;
        }
        this.left = j5;
        this.top = j6;
        this.right = j7;
        this.bottom = j9;
    }

    public void union(RectL rectL) {
        union(rectL.left, rectL.top, rectL.right, rectL.bottom);
    }

    public static Rect getBounds(Rect rect, int i5, int i6, double d5, Rect rect2) {
        Rect rect3 = rect2 != null ? rect2 : new Rect();
        if (d5 == 0.0d) {
            rect3.top = rect.top;
            rect3.left = rect.left;
            rect3.bottom = rect.bottom;
            rect3.right = rect.right;
            return rect3;
        }
        double d6 = (3.141592653589793d * d5) / 180.0d;
        double cos = Math.cos(d6);
        double sin = Math.sin(d6);
        long j5 = rect.left;
        long j6 = rect.top;
        long j7 = i5;
        long j8 = i6;
        int rotatedX = (int) getRotatedX(j5, j6, j7, j8, cos, sin);
        int rotatedY = (int) getRotatedY(j5, j6, j7, j8, cos, sin);
        rect3.bottom = rotatedY;
        rect3.top = rotatedY;
        rect3.right = rotatedX;
        rect3.left = rotatedX;
        long j9 = rect.right;
        long j10 = rect.top;
        int rotatedX2 = (int) getRotatedX(j9, j10, j7, j8, cos, sin);
        int rotatedY2 = (int) getRotatedY(j9, j10, j7, j8, cos, sin);
        if (rect3.top > rotatedY2) {
            rect3.top = rotatedY2;
        }
        if (rect3.bottom < rotatedY2) {
            rect3.bottom = rotatedY2;
        }
        if (rect3.left > rotatedX2) {
            rect3.left = rotatedX2;
        }
        if (rect3.right < rotatedX2) {
            rect3.right = rotatedX2;
        }
        long j11 = rect.right;
        long j12 = rect.bottom;
        int rotatedX3 = (int) getRotatedX(j11, j12, j7, j8, cos, sin);
        int rotatedY3 = (int) getRotatedY(j11, j12, j7, j8, cos, sin);
        if (rect3.top > rotatedY3) {
            rect3.top = rotatedY3;
        }
        if (rect3.bottom < rotatedY3) {
            rect3.bottom = rotatedY3;
        }
        if (rect3.left > rotatedX3) {
            rect3.left = rotatedX3;
        }
        if (rect3.right < rotatedX3) {
            rect3.right = rotatedX3;
        }
        long j13 = rect.left;
        long j14 = rect.bottom;
        int rotatedX4 = (int) getRotatedX(j13, j14, j7, j8, cos, sin);
        int rotatedY4 = (int) getRotatedY(j13, j14, j7, j8, cos, sin);
        if (rect3.top > rotatedY4) {
            rect3.top = rotatedY4;
        }
        if (rect3.bottom < rotatedY4) {
            rect3.bottom = rotatedY4;
        }
        if (rect3.left > rotatedX4) {
            rect3.left = rotatedX4;
        }
        if (rect3.right < rotatedX4) {
            rect3.right = rotatedX4;
        }
        return rect3;
    }
}
