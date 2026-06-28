package com.lody.virtual.client.env;

/* loaded from: classes3.dex */
class GPSStateline {
    private double mAzimuth;
    private double mCarrierFrequencyHz;
    private double mElevation;
    private boolean mHasAlmanac;
    private boolean mHasEphemeris;
    private int mPnr;
    private double mSnr;
    private boolean mUseInFix;

    public GPSStateline(int i5, double d5, double d6, double d7, boolean z4, boolean z5, boolean z6, double d8) {
        this.mAzimuth = d7;
        this.mElevation = d6;
        this.mHasAlmanac = z5;
        this.mHasEphemeris = z6;
        this.mCarrierFrequencyHz = d8;
        this.mPnr = i5;
        this.mSnr = d5;
        this.mUseInFix = z4;
    }

    public double getAzimuth() {
        return this.mAzimuth;
    }

    public double getCarrierFrequencyHz() {
        return this.mCarrierFrequencyHz;
    }

    public double getElevation() {
        return this.mElevation;
    }

    public int getPnr() {
        return this.mPnr;
    }

    public double getSnr() {
        return this.mSnr;
    }

    public boolean hasCarrierFrequencyHz() {
        return this.mCarrierFrequencyHz > 0.0d;
    }

    public boolean isHasAlmanac() {
        return this.mHasAlmanac;
    }

    public boolean isHasEphemeris() {
        return this.mHasEphemeris;
    }

    public boolean isUseInFix() {
        return this.mUseInFix;
    }

    public void setAzimuth(double d5) {
        this.mAzimuth = d5;
    }

    public void setElevation(double d5) {
        this.mElevation = d5;
    }

    public void setHasAlmanac(boolean z4) {
        this.mHasAlmanac = z4;
    }

    public void setHasEphemeris(boolean z4) {
        this.mHasEphemeris = z4;
    }

    public void setPnr(int i5) {
        this.mPnr = i5;
    }

    public void setSnr(double d5) {
        this.mSnr = d5;
    }

    public void setUseInFix(boolean z4) {
        this.mUseInFix = z4;
    }
}
