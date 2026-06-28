package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d5) {
            this.hct = hct;
            this.score = d5;
        }
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i5) {
        return score(map, i5, BLUE_500, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i5, int i6) {
        return score(map, i5, i6, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i5, int i6, boolean z4) {
        boolean z5;
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d5 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct fromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(fromInt);
            int floor = (int) Math.floor(fromInt.getHue());
            int intValue = entry.getValue().intValue();
            iArr[floor] = iArr[floor] + intValue;
            d5 += intValue;
        }
        double[] dArr = new double[360];
        for (int i7 = 0; i7 < 360; i7++) {
            double d6 = iArr[i7] / d5;
            for (int i8 = i7 - 14; i8 < i7 + 16; i8++) {
                int sanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i8);
                dArr[sanitizeDegreesInt] = dArr[sanitizeDegreesInt] + d6;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d7 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z4 || (hct.getChroma() >= CUTOFF_CHROMA && d7 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, (d7 * 100.0d * WEIGHT_PROPORTION) + ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i9 = 90; i9 >= 15; i9--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z5 = false;
                        break;
                    }
                    if (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) < i9) {
                        z5 = true;
                        break;
                    }
                }
                if (!z5) {
                    arrayList3.add(hct2);
                }
                if (arrayList3.size() >= i5) {
                    break;
                }
            }
            if (arrayList3.size() >= i5) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i6));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }
}
