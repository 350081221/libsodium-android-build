package com.airbnb.lottie;

/* loaded from: classes2.dex */
public enum j1 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1317a;

        static {
            int[] iArr = new int[j1.values().length];
            f1317a = iArr;
            try {
                iArr[j1.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1317a[j1.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1317a[j1.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i5, boolean z4, int i6) {
        int i7 = a.f1317a[ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return (z4 && i5 < 28) || i6 > 4 || i5 <= 25;
        }
        return true;
    }
}
