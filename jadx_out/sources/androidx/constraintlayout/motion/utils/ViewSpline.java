package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import external.org.apache.commons.lang3.c;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ViewSpline extends SplineSet {
    private static final String TAG = "ViewSpline";

    /* loaded from: classes2.dex */
    static class AlphaSet extends ViewSpline {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setAlpha(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomSet extends ViewSpline {
        String mAttributeName;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i5, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, numberOfInterpolatedValues);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i6);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i6);
                dArr[i6] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = r6[i7];
                        i7++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }

        public void setPoint(int i5, ConstraintAttribute constraintAttribute) {
            this.mConstraintAttributeList.append(i5, constraintAttribute);
        }
    }

    /* loaded from: classes2.dex */
    static class ElevationSet extends ViewSpline {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setElevation(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotate extends ViewSpline {
        public void setPathRotate(View view, float f5, double d5, double d6) {
            view.setRotation(get(f5) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
        }
    }

    /* loaded from: classes2.dex */
    static class PivotXset extends ViewSpline {
        PivotXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setPivotX(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class PivotYset extends ViewSpline {
        PivotYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setPivotY(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class ProgressSet extends ViewSpline {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f5));
                return;
            }
            if (this.mNoMethod) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.mNoMethod = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(f5)));
                } catch (IllegalAccessException e5) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e5);
                } catch (InvocationTargetException e6) {
                    Log.e(ViewSpline.TAG, "unable to setProgress", e6);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RotationSet extends ViewSpline {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setRotation(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class RotationXset extends ViewSpline {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setRotationX(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class RotationYset extends ViewSpline {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setRotationY(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class ScaleXset extends ViewSpline {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setScaleX(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class ScaleYset extends ViewSpline {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setScaleY(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class TranslationXset extends ViewSpline {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setTranslationX(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class TranslationYset extends ViewSpline {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setTranslationY(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    static class TranslationZset extends ViewSpline {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        public void setProperty(View view, float f5) {
            view.setTranslationZ(get(f5));
        }
    }

    public static ViewSpline makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewSpline makeSpline(String str) {
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals(Key.WAVE_VARIES_BY)) {
                    c5 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(Key.PIVOT_X)) {
                    c5 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(Key.PIVOT_Y)) {
                    c5 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c5 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c5 = c.f15956c;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c5 = 15;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return new RotationXset();
            case 1:
                return new RotationYset();
            case 2:
                return new TranslationXset();
            case 3:
                return new TranslationYset();
            case 4:
                return new TranslationZset();
            case 5:
                return new ProgressSet();
            case 6:
                return new ScaleXset();
            case 7:
                return new ScaleYset();
            case '\b':
                return new AlphaSet();
            case '\t':
                return new PivotXset();
            case '\n':
                return new PivotYset();
            case 11:
                return new RotationSet();
            case '\f':
                return new ElevationSet();
            case '\r':
                return new PathRotate();
            case 14:
                return new AlphaSet();
            case 15:
                return new AlphaSet();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f5);
}
