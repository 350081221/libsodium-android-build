package org.osmdroid.util.constants;

import org.osmdroid.library.R;

/* loaded from: classes4.dex */
public interface GeoConstants {

    @Deprecated
    public static final int EQUATORCIRCUMFENCE = 40075016;
    public static final double FEET_PER_METER = 3.2808399d;
    public static final double METERS_PER_NAUTICAL_MILE = 1852.0d;
    public static final double METERS_PER_STATUTE_MILE = 1609.344d;
    public static final int RADIUS_EARTH_METERS = 6378137;

    /* loaded from: classes4.dex */
    public enum UnitOfMeasure {
        meter(1.0d, R.string.A),
        kilometer(1000.0d, R.string.f21715z),
        statuteMile(1609.344d, R.string.B),
        nauticalMile(1852.0d, R.string.C),
        foot(0.304799999536704d, R.string.f21714y);

        private final double mConversionFactorToMeters;
        private final int mStringResId;

        UnitOfMeasure(double d5, int i5) {
            this.mConversionFactorToMeters = d5;
            this.mStringResId = i5;
        }

        public double getConversionFactorToMeters() {
            return this.mConversionFactorToMeters;
        }

        public int getStringResId() {
            return this.mStringResId;
        }
    }
}
