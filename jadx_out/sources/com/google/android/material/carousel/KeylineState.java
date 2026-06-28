package com.google.android.material.carousel;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    /* loaded from: classes2.dex */
    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(float f5, float f6) {
            this.itemSize = f5;
            this.availableSpace = f6;
        }

        private static float calculateKeylineLocationForItemPosition(float f5, float f6, int i5, int i6) {
            return (f5 - (i5 * f6)) + (i6 * f6);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addAnchorKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7) {
            return addKeyline(f5, f6, f7, false, true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, boolean z4) {
            return addKeyline(f5, f6, f7, z4, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeylineRange(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, int i5) {
            return addKeylineRange(f5, f6, f7, i5, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < this.tmpKeylines.size(); i5++) {
                    Keyline keyline = this.tmpKeylines.get(i5);
                    arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i5), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
                }
                return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7) {
            return addKeyline(f5, f6, f7, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeylineRange(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, int i5, boolean z4) {
            if (i5 > 0 && f7 > 0.0f) {
                for (int i6 = 0; i6 < i5; i6++) {
                    addKeyline((i6 * f7) + f5, f6, f7, z4);
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, boolean z4, boolean z5, float f8, float f9, float f10) {
            if (f7 <= 0.0f) {
                return this;
            }
            if (z5) {
                if (!z4) {
                    int i5 = this.latestAnchorKeylineIndex;
                    if (i5 != -1 && i5 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f5, f6, f7, z5, f8, f9, f10);
            if (z4) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f7 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        @o1.a
        public Builder addKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, boolean z4, boolean z5, float f8) {
            return addKeyline(f5, f6, f7, z4, z5, f8, 0.0f, 0.0f);
        }

        @NonNull
        @o1.a
        Builder addKeyline(float f5, @FloatRange(from = 0.0d, to = 1.0d) float f6, float f7, boolean z4, boolean z5) {
            float f8;
            float f9 = f7 / 2.0f;
            float f10 = f5 - f9;
            float f11 = f9 + f5;
            float f12 = this.availableSpace;
            if (f11 > f12) {
                f8 = Math.abs(f11 - Math.max(f11 - f7, f12));
            } else {
                f8 = 0.0f;
                if (f10 < 0.0f) {
                    f8 = Math.abs(f10 - Math.min(f10 + f7, 0.0f));
                }
            }
            return addKeyline(f5, f6, f7, z4, z5, f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        Keyline(float f5, float f6, float f7, float f8) {
            this(f5, f6, f7, f8, false, 0.0f, 0.0f, 0.0f);
        }

        static Keyline lerp(Keyline keyline, Keyline keyline2, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f5), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f5), AnimationUtils.lerp(keyline.mask, keyline2.mask, f5), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f5));
        }

        Keyline(float f5, float f6, float f7, float f8, boolean z4, float f9, float f10, float f11) {
            this.loc = f5;
            this.locOffset = f6;
            this.mask = f7;
            this.maskedItemSize = f8;
            this.isAnchor = z4;
            this.cutoff = f9;
            this.leftOrTopPaddingShift = f10;
            this.rightOrBottomPaddingShift = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f5) {
        if (keylineState.getItemSize() == keylineState2.getItemSize()) {
            List<Keyline> keylines = keylineState.getKeylines();
            List<Keyline> keylines2 = keylineState2.getKeylines();
            if (keylines.size() == keylines2.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < keylineState.getKeylines().size(); i5++) {
                    arrayList.add(Keyline.lerp(keylines.get(i5), keylines2.get(i5), f5));
                }
                return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f5), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f5));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineState reverse(KeylineState keylineState, float f5) {
        boolean z4;
        Builder builder = new Builder(keylineState.getItemSize(), f5);
        float f6 = (f5 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            Keyline keyline = keylineState.getKeylines().get(size);
            float f7 = f6 + (keyline.maskedItemSize / 2.0f);
            if (size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex()) {
                z4 = true;
            } else {
                z4 = false;
            }
            builder.addKeyline(f7, keyline.mask, keyline.maskedItemSize, z4, keyline.isAnchor);
            f6 += keyline.maskedItemSize;
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Keyline getFirstNonAnchorKeyline() {
        for (int i5 = 0; i5 < this.keylines.size(); i5++) {
            Keyline keyline = this.keylines.get(i5);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getItemSize() {
        return this.itemSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyline getLastKeyline() {
        return this.keylines.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i5++;
            }
        }
        return this.keylines.size() - i5;
    }

    private KeylineState(float f5, List<Keyline> list, int i5, int i6) {
        this.itemSize = f5;
        this.keylines = Collections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i5;
        this.lastFocalKeylineIndex = i6;
    }
}
