package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = Collections.unmodifiableList(list);
        this.endStateSteps = Collections.unmodifiableList(list2);
        float f5 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f5;
        float f6 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f6;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f5, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f6, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f5, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f5, fArr);
        if (stateStepsRange[0] >= 0.5f) {
            return list.get((int) stateStepsRange[2]);
        }
        return list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f5) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f5 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i5 = 0; i5 < keylineState.getKeylines().size(); i5++) {
            if (!keylineState.getKeylines().get(i5).isAnchor) {
                return i5;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f5) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f5 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f5, float f6, float f7) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f5, f6), getStateStepsEnd(carousel, keylineState, f5, f7));
    }

    private static float[] getStateStepInterpolationPoints(float f5, List<KeylineState> list, boolean z4) {
        float f6;
        float f7;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i5 = 1; i5 < size; i5++) {
            int i6 = i5 - 1;
            KeylineState keylineState = list.get(i6);
            KeylineState keylineState2 = list.get(i5);
            if (z4) {
                f6 = keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
            } else {
                f6 = keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc;
            }
            float f8 = f6 / f5;
            if (i5 == size - 1) {
                f7 = 1.0f;
            } else {
                f7 = fArr[i6] + f8;
            }
            fArr[i5] = f7;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f5, float f6) {
        int containerHeight;
        int i5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f7 = containerHeight;
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && findLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = findLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f8 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f8 - keylineState.getLastFocalKeyline().cutoff, f7));
                return arrayList;
            }
            float f9 = 0.0f;
            int i6 = 0;
            while (i6 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i7 = findLastNonAnchorKeylineIndex - i6;
                float f10 = f9 + keylineState.getKeylines().get(i7).cutoff;
                int i8 = i7 + 1;
                if (i8 < keylineState.getKeylines().size()) {
                    i5 = findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i8).mask) + 1;
                } else {
                    i5 = 0;
                }
                int i9 = i6;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findLastNonAnchorKeylineIndex, i5, f8 - f10, keylineState.getFirstFocalKeylineIndex() + i6 + 1, keylineState.getLastFocalKeylineIndex() + i6 + 1, f7);
                if (i9 == lastFocalKeylineIndex - 1 && f6 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f6, f7, false, f5);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i6 = i9 + 1;
                f9 = f10;
            }
            return arrayList;
        }
        if (f6 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f6, f7, false, f5));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f5, float[] fArr) {
        int size = list.size();
        float f6 = fArr[0];
        int i5 = 1;
        while (i5 < size) {
            float f7 = fArr[i5];
            if (f5 <= f7) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f6, f7, f5), i5 - 1, i5};
            }
            i5++;
            f6 = f7;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f5, float f6) {
        int containerHeight;
        int i5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        } else {
            containerHeight = carousel.getContainerHeight();
        }
        float f7 = containerHeight;
        int i6 = 1;
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && findFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - findFirstNonAnchorKeylineIndex;
            float f8 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f8 + keylineState.getFirstFocalKeyline().cutoff, f7));
                return arrayList;
            }
            int i7 = 0;
            float f9 = 0.0f;
            while (i7 < firstFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - i6);
                int i8 = findFirstNonAnchorKeylineIndex + i7;
                int size = keylineState.getKeylines().size() - i6;
                float f10 = f9 + keylineState.getKeylines().get(i8).cutoff;
                int i9 = i8 - i6;
                if (i9 >= 0) {
                    i5 = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i9).mask) - i6;
                } else {
                    i5 = size;
                }
                int i10 = i7;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findFirstNonAnchorKeylineIndex, i5, f8 + f10, (keylineState.getFirstFocalKeylineIndex() - i7) - 1, (keylineState.getLastFocalKeylineIndex() - i7) - 1, f7);
                if (i10 == firstFocalKeylineIndex - 1 && f6 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f6, f7, true, f5);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i7 = i10 + 1;
                f9 = f10;
                i6 = 1;
            }
            return arrayList;
        }
        if (f6 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f6, f7, true, f5));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        if (keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        if (keylineState.getLastFocalKeyline().locOffset + (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) <= containerHeight && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline()) {
            return true;
        }
        return false;
    }

    private static KeylineState lerp(List<KeylineState> list, float f5, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f5, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i5, int i6, float f5, int i7, int i8, float f6) {
        boolean z4;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i6, (KeylineState.Keyline) arrayList.remove(i5));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f6);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i9);
            float f7 = keyline.maskedItemSize;
            float f8 = f5 + (f7 / 2.0f);
            if (i9 >= i7 && i9 <= i8) {
                z4 = true;
            } else {
                z4 = false;
            }
            builder.addKeyline(f8, keyline.mask, f7, z4, keyline.isAnchor, keyline.cutoff);
            f5 += keyline.maskedItemSize;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylineStateForPadding(KeylineState keylineState, float f5, float f6, boolean z4, float f7) {
        float f8;
        boolean z5;
        float f9;
        float f10;
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), f6);
        float numberOfNonAnchorKeylines = f5 / keylineState.getNumberOfNonAnchorKeylines();
        if (z4) {
            f8 = f5;
        } else {
            f8 = 0.0f;
        }
        float f11 = f8;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i5);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                if (i5 >= keylineState.getFirstFocalKeylineIndex() && i5 <= keylineState.getLastFocalKeylineIndex()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                float f12 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f12, keylineState.getItemSize(), f7);
                float f13 = (f12 / 2.0f) + f11;
                float f14 = f13 - keyline.locOffset;
                float f15 = keyline.cutoff;
                if (z4) {
                    f9 = f14;
                } else {
                    f9 = 0.0f;
                }
                if (z4) {
                    f10 = 0.0f;
                } else {
                    f10 = f14;
                }
                builder.addKeyline(f13, childMaskPercentage, f12, z5, false, f15, f9, f10);
                f11 += f12;
            }
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f5, float f6) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f5, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), f6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i5, int i6, int i7, boolean z4) {
        int i8;
        int i9;
        int i10;
        float itemSize = this.defaultState.getItemSize();
        HashMap hashMap = new HashMap();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = -1;
            if (i11 >= i5) {
                break;
            }
            if (z4) {
                i10 = (i5 - i11) - 1;
            } else {
                i10 = i11;
            }
            float f5 = i10 * itemSize;
            if (!z4) {
                i13 = 1;
            }
            if (f5 * i13 > i7 - this.endShiftRange || i11 >= i5 - this.endStateSteps.size()) {
                Integer valueOf = Integer.valueOf(i10);
                List<KeylineState> list = this.endStateSteps;
                hashMap.put(valueOf, list.get(MathUtils.clamp(i12, 0, list.size() - 1)));
                i12++;
            }
            i11++;
        }
        int i14 = 0;
        for (int i15 = i5 - 1; i15 >= 0; i15--) {
            if (z4) {
                i8 = (i5 - i15) - 1;
            } else {
                i8 = i15;
            }
            float f6 = i8 * itemSize;
            if (z4) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            if (f6 * i9 < i6 + this.startShiftRange || i15 < this.startStateSteps.size()) {
                Integer valueOf2 = Integer.valueOf(i8);
                List<KeylineState> list2 = this.startStateSteps;
                hashMap.put(valueOf2, list2.get(MathUtils.clamp(i14, 0, list2.size() - 1)));
                i14++;
            }
        }
        return hashMap;
    }

    public KeylineState getShiftedState(float f5, float f6, float f7) {
        return getShiftedState(f5, f6, f7, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeylineState getShiftedState(float f5, float f6, float f7, boolean z4) {
        float lerp;
        List<KeylineState> list;
        float[] fArr;
        float f8 = this.startShiftRange + f6;
        float f9 = f7 - this.endShiftRange;
        float f10 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f11 = getEndState().getLastFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f10) {
            f8 += f10;
        }
        if (this.endShiftRange == f11) {
            f9 -= f11;
        }
        if (f5 < f8) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f6, f8, f5);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else if (f5 > f9) {
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f9, f7, f5);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        } else {
            return this.defaultState;
        }
        if (z4) {
            return closestStateStepFromInterpolation(list, lerp, fArr);
        }
        return lerp(list, lerp, fArr);
    }
}
