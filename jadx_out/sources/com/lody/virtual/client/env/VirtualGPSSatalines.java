package com.lody.virtual.client.env;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class VirtualGPSSatalines {
    private static final int BEIDOU_SVID_OFFSET = 200;
    private static final int CONSTELLATION_BEIDOU = 5;
    private static final int CONSTELLATION_GALILEO = 6;
    private static final int CONSTELLATION_GLONASS = 3;
    private static final int CONSTELLATION_GPS = 1;
    private static final int CONSTELLATION_QZSS = 4;
    private static final int CONSTELLATION_SBAS = 2;
    private static final int CONSTELLATION_TYPE_MASK = 15;
    private static final int CONSTELLATION_TYPE_SHIFT_WIDTH = 3;
    private static final int CONSTELLATION_UNKNOWN = 0;
    private static final int GLONASS_SVID_OFFSET = 64;
    private static final int GNSS_SV_FLAGS_HAS_ALMANAC_DATA = 2;
    private static final int GNSS_SV_FLAGS_HAS_EPHEMERIS_DATA = 1;
    private static final int GNSS_SV_FLAGS_NONE = 0;
    private static final int GNSS_SV_FLAGS_USED_IN_FIX = 4;
    private static VirtualGPSSatalines INSTANCE = new VirtualGPSSatalines();
    private static final int SBAS_SVID_OFFSET = -87;
    private static final int SVID_SHIFT_WIDTH = 7;
    private float[] carrierFreqs;
    private int mAlmanacMask;
    private float[] mAzimuths;
    private float[] mElevations;
    private int mEphemerisMask;
    private float[] mSnrs;
    private int mUsedInFixMask;
    private int[] pnrs;
    private int[] prnWithFlags;
    private int svCount;

    private VirtualGPSSatalines() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GPSStateline(5, 1.0d, 5.0d, 112.0d, false, true, true, 0.0d));
        arrayList.add(new GPSStateline(13, 13.5d, 23.0d, 53.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(14, 19.1d, 6.0d, 247.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(15, 31.0d, 58.0d, 45.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(18, 0.0d, 52.0d, 309.0d, false, true, true, 0.0d));
        arrayList.add(new GPSStateline(20, 30.1d, 54.0d, 105.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(21, 33.2d, 56.0d, 251.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(22, 0.0d, 14.0d, 299.0d, false, true, true, 0.0d));
        arrayList.add(new GPSStateline(24, 25.9d, 57.0d, 157.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(27, 18.0d, 3.0d, 309.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(28, 18.2d, 3.0d, 42.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(41, 28.8d, 0.0d, 0.0d, false, false, false, 0.0d));
        arrayList.add(new GPSStateline(50, 29.2d, 0.0d, 0.0d, false, true, true, 0.0d));
        arrayList.add(new GPSStateline(67, 14.4d, 2.0d, 92.0d, false, false, false, 0.0d));
        arrayList.add(new GPSStateline(68, 21.2d, 45.0d, 60.0d, false, false, false, 0.0d));
        arrayList.add(new GPSStateline(69, 17.5d, 50.0d, 330.0d, false, true, true, 0.0d));
        arrayList.add(new GPSStateline(70, 22.4d, 7.0d, 291.0d, false, false, false, 0.0d));
        arrayList.add(new GPSStateline(77, 23.8d, 10.0d, 23.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(78, 18.0d, 47.0d, 70.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(79, 22.8d, 41.0d, 142.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(83, 0.2d, 9.0d, 212.0d, false, false, false, 0.0d));
        arrayList.add(new GPSStateline(84, 16.7d, 30.0d, 264.0d, true, true, true, 0.0d));
        arrayList.add(new GPSStateline(85, 12.1d, 20.0d, 317.0d, true, true, true, 0.0d));
        this.svCount = arrayList.size();
        this.pnrs = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.pnrs[i5] = ((GPSStateline) arrayList.get(i5)).getPnr();
        }
        this.mSnrs = new float[arrayList.size()];
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            this.mSnrs[i6] = (float) ((GPSStateline) arrayList.get(i6)).getSnr();
        }
        this.mElevations = new float[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.mElevations[i7] = (float) ((GPSStateline) arrayList.get(i7)).getElevation();
        }
        this.mAzimuths = new float[arrayList.size()];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            this.mAzimuths[i8] = (float) ((GPSStateline) arrayList.get(i8)).getAzimuth();
        }
        this.carrierFreqs = new float[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.carrierFreqs[i9] = (float) ((GPSStateline) arrayList.get(i9)).getCarrierFrequencyHz();
        }
        this.prnWithFlags = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.prnWithFlags[i10] = (((GPSStateline) arrayList.get(i10)).getPnr() << 71) | 24;
        }
        this.mEphemerisMask = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((GPSStateline) arrayList.get(i11)).isHasEphemeris()) {
                this.mEphemerisMask |= 1 << (((GPSStateline) arrayList.get(i11)).getPnr() - 1);
                int[] iArr = this.prnWithFlags;
                iArr[i11] = 1 | iArr[i11];
            }
        }
        this.mAlmanacMask = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (((GPSStateline) arrayList.get(i12)).isHasAlmanac()) {
                this.mAlmanacMask |= 1 << (((GPSStateline) arrayList.get(i12)).getPnr() - 1);
                int[] iArr2 = this.prnWithFlags;
                iArr2[i12] = iArr2[i12] | 2;
            }
        }
        this.mUsedInFixMask = 0;
        for (int i13 = 0; arrayList.size() > i13; i13++) {
            if (((GPSStateline) arrayList.get(i13)).isUseInFix()) {
                this.mUsedInFixMask |= 1 << (((GPSStateline) arrayList.get(i13)).getPnr() - 1);
                int[] iArr3 = this.prnWithFlags;
                iArr3[i13] = iArr3[i13] | 4;
            }
        }
    }

    public static VirtualGPSSatalines get() {
        return INSTANCE;
    }

    public int getAlmanacMask() {
        return this.mAlmanacMask;
    }

    public float[] getAzimuths() {
        return this.mAzimuths;
    }

    public float[] getCarrierFreqs() {
        return this.carrierFreqs;
    }

    public float[] getElevations() {
        return this.mElevations;
    }

    public int getEphemerisMask() {
        return this.mEphemerisMask;
    }

    public int[] getPrnWithFlags() {
        return this.prnWithFlags;
    }

    public int[] getPrns() {
        return this.pnrs;
    }

    public float[] getSnrs() {
        return this.mSnrs;
    }

    public int getSvCount() {
        return this.svCount;
    }

    public int getUsedInFixMask() {
        return this.mUsedInFixMask;
    }
}
