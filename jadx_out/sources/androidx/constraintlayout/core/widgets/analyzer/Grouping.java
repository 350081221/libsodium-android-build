package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Grouping {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_GROUPING = false;

    public static WidgetGroup findDependents(ConstraintWidget constraintWidget, int i5, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int i6;
        int findGroupInDependents;
        if (i5 == 0) {
            i6 = constraintWidget.horizontalGroup;
        } else {
            i6 = constraintWidget.verticalGroup;
        }
        int i7 = 0;
        if (i6 != -1 && (widgetGroup == null || i6 != widgetGroup.id)) {
            int i8 = 0;
            while (true) {
                if (i8 >= arrayList.size()) {
                    break;
                }
                WidgetGroup widgetGroup2 = arrayList.get(i8);
                if (widgetGroup2.getId() == i6) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i5, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i8++;
                }
            }
        } else if (i6 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof HelperWidget) && (findGroupInDependents = ((HelperWidget) constraintWidget).findGroupInDependents(i5)) != -1) {
                int i9 = 0;
                while (true) {
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    WidgetGroup widgetGroup3 = arrayList.get(i9);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i9++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i5);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof Guideline) {
                Guideline guideline = (Guideline) constraintWidget;
                ConstraintAnchor anchor = guideline.getAnchor();
                if (guideline.getOrientation() == 0) {
                    i7 = 1;
                }
                anchor.findDependents(i7, arrayList, widgetGroup);
            }
            if (i5 == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i5, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i5, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i5, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i5, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i5, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i5, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    private static WidgetGroup findGroup(ArrayList<WidgetGroup> arrayList, int i5) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            WidgetGroup widgetGroup = arrayList.get(i6);
            if (i5 == widgetGroup.id) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r16, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer r17) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.Grouping.simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer):boolean");
    }

    public static boolean validInGroup(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z4;
        boolean z5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && dimensionBehaviour3 != (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == dimensionBehaviour6)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour4 != (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == dimensionBehaviour5)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 && !z5) {
            return false;
        }
        return true;
    }
}
