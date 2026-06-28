package org.osmdroid.views.overlay;

/* loaded from: classes4.dex */
public class OverlayLayoutParams {
    public static final int BOTTOM = 16;
    public static final int CENTER_HORIZONTAL = 4;
    public static final int CENTER_VERTICAL = 32;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int TOP = 8;

    public static int getMaskedValue(int i5, int i6, int[] iArr) {
        for (int i7 : iArr) {
            if ((i5 & i7) == i7) {
                return i7;
            }
        }
        return i6;
    }
}
