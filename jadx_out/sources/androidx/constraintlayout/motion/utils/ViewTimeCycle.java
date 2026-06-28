package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AlphaSet extends ViewTimeCycle {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setAlpha(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes2.dex */
    public static class CustomSet extends ViewTimeCycle {
        String mAttributeName;
        float[] mCache;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i5, float f5, float f6, int i6, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            boolean z4;
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j6 = j5 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f8 = (float) ((this.last_cycle + ((j6 * 1.0E-9d) * f6)) % 1.0d);
            this.last_cycle = f8;
            this.last_time = j5;
            float calcWave = calcWave(f8);
            this.mContinue = false;
            int i5 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i5 >= fArr2.length) {
                    break;
                }
                boolean z5 = this.mContinue;
                float f9 = this.mTempValues[i5];
                if (f9 != 0.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.mContinue = z5 | z4;
                fArr2[i5] = (f9 * calcWave) + f7;
                i5++;
            }
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
            if (f6 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i6 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i6];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i6);
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i7);
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i7);
                float[] valueAt2 = this.mWaveProperties.valueAt(i7);
                dArr[i7] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i8 = 0;
                while (true) {
                    if (i8 < this.mTempValues.length) {
                        dArr2[i7][i8] = r8[i8];
                        i8++;
                    }
                }
                double[] dArr3 = dArr2[i7];
                dArr3[numberOfInterpolatedValues] = valueAt2[0];
                dArr3[numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }

        public void setPoint(int i5, ConstraintAttribute constraintAttribute, float f5, int i6, float f6) {
            this.mConstraintAttributeList.append(i5, constraintAttribute);
            this.mWaveProperties.append(i5, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ElevationSet extends ViewTimeCycle {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setElevation(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f5, long j5, double d5, double d6) {
            view.setRotation(get(f5, j5, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ProgressSet extends ViewTimeCycle {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f5, j5, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f5, j5, view, keyCache)));
                    } catch (IllegalAccessException e5) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e5);
                    } catch (InvocationTargetException e6) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e6);
                    }
                }
            }
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationSet extends ViewTimeCycle {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotation(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationXset extends ViewTimeCycle {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotationX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationYset extends ViewTimeCycle {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotationY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ScaleXset extends ViewTimeCycle {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setScaleX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ScaleYset extends ViewTimeCycle {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setScaleY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationXset extends ViewTimeCycle {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationYset extends ViewTimeCycle {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationZset extends ViewTimeCycle {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationZ(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00a0. Please report as an issue. */
    public static ViewTimeCycle makeSpline(String str, long j5) {
        ViewTimeCycle rotationXset;
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
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c5 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 11;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                rotationXset = new RotationXset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 1:
                rotationXset = new RotationYset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 2:
                rotationXset = new TranslationXset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 3:
                rotationXset = new TranslationYset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 4:
                rotationXset = new TranslationZset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 5:
                rotationXset = new ProgressSet();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 6:
                rotationXset = new ScaleXset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 7:
                rotationXset = new ScaleYset();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case '\b':
                rotationXset = new RotationSet();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case '\t':
                rotationXset = new ElevationSet();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case '\n':
                rotationXset = new PathRotate();
                rotationXset.setStartTime(j5);
                return rotationXset;
            case 11:
                rotationXset = new AlphaSet();
                rotationXset.setStartTime(j5);
                return rotationXset;
            default:
                return null;
        }
    }

    public float get(float f5, long j5, View view, KeyCache keyCache) {
        boolean z4;
        this.mCurveFit.getPos(f5, this.mCache);
        float[] fArr = this.mCache;
        float f6 = fArr[1];
        if (f6 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        float f7 = (float) ((this.last_cycle + (((j5 - this.last_time) * 1.0E-9d) * f6)) % 1.0d);
        this.last_cycle = f7;
        keyCache.setFloatValue(view, this.mType, 0, f7);
        this.last_time = j5;
        float f8 = this.mCache[0];
        float calcWave = (calcWave(this.last_cycle) * f8) + this.mCache[2];
        if (f8 == 0.0f && f6 == 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.mContinue = z4;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f5, long j5, KeyCache keyCache);
}
