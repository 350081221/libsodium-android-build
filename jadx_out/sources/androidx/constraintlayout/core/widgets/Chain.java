package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i5) {
        int i6;
        ChainHead[] chainHeadArr;
        int i7;
        if (i5 == 0) {
            i6 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i7 = 0;
        } else {
            i6 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i7 = 2;
        }
        for (int i8 = 0; i8 < i6; i8++) {
            ChainHead chainHead = chainHeadArr[i8];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i5, i7, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0044, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0042, code lost:
    
        if (r7 == 2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8  */
    /* JADX WARN: Type inference failed for: r1v40, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.core.LinearSystem r38, int r39, int r40, androidx.constraintlayout.core.widgets.ChainHead r41) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
