package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* loaded from: classes2.dex */
public class ColorContrastOptions {

    @StyleRes
    private final int highContrastThemeOverlayResourceId;

    @StyleRes
    private final int mediumContrastThemeOverlayResourceId;

    /* loaded from: classes2.dex */
    public static class Builder {

        @StyleRes
        private int highContrastThemeOverlayResourceId;

        @StyleRes
        private int mediumContrastThemeOverlayResourceId;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        @o1.a
        public Builder setHighContrastThemeOverlay(@StyleRes int i5) {
            this.highContrastThemeOverlayResourceId = i5;
            return this;
        }

        @NonNull
        @o1.a
        public Builder setMediumContrastThemeOverlay(@StyleRes int i5) {
            this.mediumContrastThemeOverlayResourceId = i5;
            return this;
        }
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }
}
