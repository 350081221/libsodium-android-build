package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Motion implements TypedValues {
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    float mCurrentCenterX;
    float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    MotionWidget mView;
    Rect mTempRect = new Rect();
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f5, float[] fArr) {
        float f6 = 0.0f;
        float f7 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f8 = this.mStaggerScale;
            if (f8 != 1.0d) {
                float f9 = this.mStaggerOffset;
                if (f5 < f9) {
                    f5 = 0.0f;
                }
                if (f5 > f9 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f9) * f8, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        float f10 = Float.NaN;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f11 = next.time;
                if (f11 < f5) {
                    easing = easing2;
                    f6 = f11;
                } else if (Float.isNaN(f10)) {
                    f10 = next.time;
                }
            }
        }
        if (easing != null) {
            if (!Float.isNaN(f10)) {
                f7 = f10;
            }
            float f12 = f7 - f6;
            double d5 = (f5 - f6) / f12;
            f5 = (((float) easing.get(d5)) * f12) + f6;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d5);
            }
        }
        return f5;
    }

    private static DifferentialInterpolator getInterpolator(int i5, String str, int i6) {
        if (i5 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f5) {
                this.mX = f5;
                return (float) Easing.this.get(f5);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
    }

    private float getPreCycleDistance() {
        char c5;
        float f5;
        float[] fArr = new float[2];
        float f6 = 1.0f / 99;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f7 = 0.0f;
        int i5 = 0;
        while (i5 < 100) {
            float f8 = i5 * f6;
            double d7 = f8;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f9 = Float.NaN;
            float f10 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = next.time;
                    if (f11 < f8) {
                        easing = easing2;
                        f10 = f11;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d7 = (((float) easing.get((f8 - f10) / r17)) * (f9 - f10)) + f10;
            }
            this.mSpline[0].getPos(d7, this.mInterpolateData);
            float f12 = f7;
            int i6 = i5;
            this.mStartMotionPath.getCenter(d7, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i6 > 0) {
                c5 = 0;
                f5 = (float) (f12 + Math.hypot(d6 - fArr[1], d5 - fArr[0]));
            } else {
                c5 = 0;
                f5 = f12;
            }
            d5 = fArr[c5];
            i5 = i6 + 1;
            f7 = f5;
            d6 = fArr[1];
        }
        return f7;
    }

    private void insertKey(MotionPaths motionPaths) {
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        MotionPaths motionPaths2 = null;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            if (motionPaths.position == next.position) {
                motionPaths2 = next;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            Utils.loge(TAG, " KeyPath position \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    void buildBounds(float[] fArr, int i5) {
        float f5 = 1.0f / (i5 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            float f6 = i6 * f5;
            float f7 = this.mStaggerScale;
            float f8 = 0.0f;
            if (f7 != 1.0f) {
                float f9 = this.mStaggerOffset;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f9) * f7, 1.0f);
                }
            }
            double d5 = f6;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f10 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = next.time;
                    if (f11 < f6) {
                        easing = easing2;
                        f8 = f11;
                    } else if (Float.isNaN(f10)) {
                        f10 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d5 = (((float) easing.get((f6 - f8) / r12)) * (f10 - f8)) + f8;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i6 * 2);
        }
    }

    int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().mMode;
                i5++;
            }
        }
        int i6 = 0;
        for (double d5 : timePoints) {
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().mMode;
                i5++;
            }
        }
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                iArr2[i6] = (int) (it2.next().position * 100.0f);
                i6++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < timePoints.length; i8++) {
            this.mSpline[0].getPos(timePoints[i8], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i8], this.mInterpolateVariables, this.mInterpolateData, fArr, i7);
            i7 += 2;
        }
        return i7 / 2;
    }

    public void buildPath(float[] fArr, int i5) {
        SplineSet splineSet;
        SplineSet splineSet2;
        KeyCycleOscillator keyCycleOscillator;
        double d5;
        float f5 = 1.0f;
        float f6 = 1.0f / (i5 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator2 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            keyCycleOscillator2 = hashMap4.get("translationY");
        }
        KeyCycleOscillator keyCycleOscillator3 = keyCycleOscillator2;
        int i6 = 0;
        while (i6 < i5) {
            float f7 = i6 * f6;
            float f8 = this.mStaggerScale;
            float f9 = 0.0f;
            if (f8 != f5) {
                float f10 = this.mStaggerOffset;
                if (f7 < f10) {
                    f7 = 0.0f;
                }
                if (f7 > f10 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f10) * f8, f5);
                }
            }
            float f11 = f7;
            double d6 = f11;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f12 = Float.NaN;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d7 = d6;
                if (easing2 != null) {
                    float f13 = next.time;
                    if (f13 < f11) {
                        f9 = f13;
                        easing = easing2;
                    } else if (Float.isNaN(f12)) {
                        f12 = next.time;
                    }
                }
                d6 = d7;
            }
            double d8 = d6;
            if (easing != null) {
                if (Float.isNaN(f12)) {
                    f12 = 1.0f;
                }
                d5 = (((float) easing.get((f11 - f9) / r16)) * (f12 - f9)) + f9;
            } else {
                d5 = d8;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            int i7 = i6 * 2;
            int i8 = i6;
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i7);
            if (keyCycleOscillator != null) {
                fArr[i7] = fArr[i7] + keyCycleOscillator.get(f11);
            } else if (splineSet != null) {
                fArr[i7] = fArr[i7] + splineSet.get(f11);
            }
            if (keyCycleOscillator3 != null) {
                int i9 = i7 + 1;
                fArr[i9] = fArr[i9] + keyCycleOscillator3.get(f11);
            } else if (splineSet2 != null) {
                int i10 = i7 + 1;
                fArr[i10] = fArr[i10] + splineSet2.get(f11);
            }
            i6 = i8 + 1;
            f5 = 1.0f;
        }
    }

    public void buildRect(float f5, float[] fArr, int i5) {
        this.mSpline[0].getPos(getAdjustedPosition(f5, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
    }

    void buildRectangles(float[] fArr, int i5) {
        float f5 = 1.0f / (i5 - 1);
        for (int i6 = 0; i6 < i5; i6++) {
            this.mSpline[0].getPos(getAdjustedPosition(i6 * f5, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i6 * 8);
        }
    }

    void endTrigger(boolean z4) {
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    int getAttributeValues(String str, float[] fArr, int i5) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr[i6] = splineSet.get(i6 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d5, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d5, dArr);
        this.mSpline[0].getSlope(d5, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    void getDpDt(float f5, float f6, float f7, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i5 = 0;
        if (curveFitArr != null) {
            double d5 = adjustedPosition;
            curveFitArr[0].getSlope(d5, this.mInterpolateVelocity);
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            float f8 = this.mVelocity[0];
            while (true) {
                dArr = this.mInterpolateVelocity;
                if (i5 >= dArr.length) {
                    break;
                }
                dArr[i5] = dArr[i5] * f8;
                i5++;
            }
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr2 = this.mInterpolateData;
                if (dArr2.length > 0) {
                    curveFit.getPos(d5, dArr2);
                    this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                    this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
                    return;
                }
                return;
            }
            this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        float f9 = motionPaths.f335x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f10 = f9 - motionPaths2.f335x;
        float f11 = motionPaths.f336y - motionPaths2.f336y;
        float f12 = (motionPaths.width - motionPaths2.width) + f10;
        float f13 = (motionPaths.height - motionPaths2.height) + f11;
        fArr[0] = (f10 * (1.0f - f6)) + (f12 * f6);
        fArr[1] = (f11 * (1.0f - f7)) + (f13 * f7);
    }

    public int getDrawPath() {
        int i5 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i5 = Math.max(i5, it.next().mDrawPath);
        }
        return Math.max(i5, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f335x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f336y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i5) {
        return this.mMotionPaths.get(i5);
    }

    public int getKeyFrameInfo(int i5, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i8 = next.mType;
            if (i8 == i5 || i5 != -1) {
                iArr[i7] = 0;
                int i9 = i7 + 1;
                iArr[i9] = i8;
                int i10 = i9 + 1;
                int i11 = next.mFramePosition;
                iArr[i10] = i11;
                double d5 = i11 / 100.0f;
                this.mSpline[0].getPos(d5, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i12 = i10 + 1;
                iArr[i12] = Float.floatToIntBits(fArr[0]);
                int i13 = i12 + 1;
                iArr[i13] = Float.floatToIntBits(fArr[1]);
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    int i14 = i13 + 1;
                    iArr[i14] = motionKeyPosition.mPositionType;
                    int i15 = i14 + 1;
                    iArr[i15] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i13 = i15 + 1;
                    iArr[i13] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i16 = i13 + 1;
                iArr[i7] = i16 - i7;
                i6++;
                i7 = i16;
            }
        }
        return i6;
    }

    float getKeyFrameParameter(int i5, float f5, float f6) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f7 = motionPaths.f335x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f8 = motionPaths2.f335x;
        float f9 = f7 - f8;
        float f10 = motionPaths.f336y;
        float f11 = motionPaths2.f336y;
        float f12 = f10 - f11;
        float f13 = f8 + (motionPaths2.width / 2.0f);
        float f14 = f11 + (motionPaths2.height / 2.0f);
        float hypot = (float) Math.hypot(f9, f12);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f15 = f5 - f13;
        float f16 = f6 - f14;
        if (((float) Math.hypot(f15, f16)) == 0.0f) {
            return 0.0f;
        }
        float f17 = (f15 * f9) + (f16 * f12);
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 != 5) {
                                return 0.0f;
                            }
                            return f16 / f12;
                        }
                        return f15 / f12;
                    }
                    return f16 / f9;
                }
                return f15 / f9;
            }
            return (float) Math.sqrt((hypot * hypot) - (f17 * f17));
        }
        return f17 / hypot;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i7 = next.mFramePosition;
            iArr[i5] = (next.mType * 1000) + i7;
            double d5 = i7 / 100.0f;
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            i6 += 2;
            i5++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double[] getPos(double d5) {
        this.mSpline[0].getPos(d5, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d5, dArr);
            }
        }
        return this.mInterpolateData;
    }

    MotionKeyPosition getPositionKeyframe(int i5, int i6, float f5, float f6) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f335x;
        floatRect.left = f7;
        float f8 = motionPaths.f336y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f335x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f336y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey next = it.next();
            if (next instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                if (motionKeyPosition.intersects(i5, i6, floatRect, floatRect2, f5, f6)) {
                    return motionKeyPosition;
                }
            }
        }
        return null;
    }

    void getPostLayoutDvDp(float f5, int i5, int i6, float f6, float f7, float[] fArr) {
        SplineSet splineSet;
        SplineSet splineSet2;
        SplineSet splineSet3;
        SplineSet splineSet4;
        SplineSet splineSet5;
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        KeyCycleOscillator keyCycleOscillator3;
        KeyCycleOscillator keyCycleOscillator4;
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        KeyCycleOscillator keyCycleOscillator5 = null;
        if (hashMap == null) {
            splineSet = null;
        } else {
            splineSet = hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 == null) {
            splineSet2 = null;
        } else {
            splineSet2 = hashMap2.get("translationY");
        }
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        if (hashMap3 == null) {
            splineSet3 = null;
        } else {
            splineSet3 = hashMap3.get("rotationZ");
        }
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        if (hashMap4 == null) {
            splineSet4 = null;
        } else {
            splineSet4 = hashMap4.get("scaleX");
        }
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        if (hashMap5 == null) {
            splineSet5 = null;
        } else {
            splineSet5 = hashMap5.get("scaleY");
        }
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        if (hashMap6 == null) {
            keyCycleOscillator = null;
        } else {
            keyCycleOscillator = hashMap6.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        if (hashMap7 == null) {
            keyCycleOscillator2 = null;
        } else {
            keyCycleOscillator2 = hashMap7.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        if (hashMap8 == null) {
            keyCycleOscillator3 = null;
        } else {
            keyCycleOscillator3 = hashMap8.get("rotationZ");
        }
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        if (hashMap9 == null) {
            keyCycleOscillator4 = null;
        } else {
            keyCycleOscillator4 = hashMap9.get("scaleX");
        }
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        if (hashMap10 != null) {
            keyCycleOscillator5 = hashMap10.get("scaleY");
        }
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d5 = adjustedPosition;
                curveFit.getPos(d5, dArr);
                this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
            return;
        }
        int i7 = 0;
        if (this.mSpline != null) {
            double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
            this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
            this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
            float f8 = this.mVelocity[0];
            while (true) {
                double[] dArr2 = this.mInterpolateVelocity;
                if (i7 < dArr2.length) {
                    dArr2[i7] = dArr2[i7] * f8;
                    i7++;
                } else {
                    this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                    velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
                    return;
                }
            }
        } else {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f9 = motionPaths.f335x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f10 = f9 - motionPaths2.f335x;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f11 = motionPaths.f336y - motionPaths2.f336y;
            KeyCycleOscillator keyCycleOscillator7 = keyCycleOscillator4;
            float f12 = (motionPaths.width - motionPaths2.width) + f10;
            float f13 = (motionPaths.height - motionPaths2.height) + f11;
            fArr[0] = (f10 * (1.0f - f6)) + (f12 * f6);
            fArr[1] = (f11 * (1.0f - f7)) + (f13 * f7);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator7, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.f335x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f336y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f5, long j5, KeyCache keyCache) {
        double d5;
        float f6;
        float adjustedPosition = getAdjustedPosition(f5, null);
        int i5 = this.mQuantizeMotionSteps;
        if (i5 != -1) {
            float f7 = 1.0f / i5;
            float floor = ((float) Math.floor(adjustedPosition / f7)) * f7;
            float f8 = (adjustedPosition % f7) / f7;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f8 = (f8 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            if (differentialInterpolator != null) {
                f6 = differentialInterpolator.getInterpolation(f8);
            } else if (f8 > 0.5d) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            adjustedPosition = (f6 * f7) + floor;
        }
        float f9 = adjustedPosition;
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget, f9);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d6 = f9;
            curveFitArr[0].getPos(d6, this.mInterpolateData);
            this.mSpline[0].getSlope(d6, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                    this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                d5 = d6;
                this.mStartMotionPath.setView(f9, motionWidget, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            } else {
                d5 = d6;
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float top = (r1.getTop() + this.mTransformPivotView.getBottom()) / 2.0f;
                    float left = (this.mTransformPivotView.getLeft() + this.mTransformPivotView.getRight()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        motionWidget.setPivotX(left - motionWidget.getLeft());
                        motionWidget.setPivotY(top - motionWidget.getTop());
                    }
                }
            }
            int i6 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i6 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i6].getPos(d5, this.mValuesBuff);
                this.mStartMotionPath.customAttributes.get(this.mAttributeNames[i6 - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
                i6++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f9 <= 0.0f) {
                    motionWidget.setVisibility(motionConstrainedPoint.visibility);
                } else if (f9 >= 1.0f) {
                    motionWidget.setVisibility(this.mEndPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    motionWidget.setVisibility(4);
                }
            }
            if (this.mKeyTriggers != null) {
                int i7 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i7 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i7].conditionallyFire(f9, motionWidget);
                    i7++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f10 = motionPaths.f335x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float f11 = f10 + ((motionPaths2.f335x - f10) * f9);
            float f12 = motionPaths.f336y;
            float f13 = f12 + ((motionPaths2.f336y - f12) * f9);
            float f14 = motionPaths.width;
            float f15 = f14 + ((motionPaths2.width - f14) * f9);
            float f16 = motionPaths.height;
            float f17 = f11 + 0.5f;
            float f18 = f13 + 0.5f;
            motionWidget.layout((int) f17, (int) f18, (int) (f17 + f15), (int) (f18 + f16 + ((motionPaths2.height - f16) * f9)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 != null) {
            for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr2 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(motionWidget, f9, dArr2[0], dArr2[1]);
                } else {
                    keyCycleOscillator.setProperty(motionWidget, f9);
                }
            }
            return false;
        }
        return false;
    }

    String name() {
        return this.mView.getName();
    }

    void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f5, float f6, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f335x;
        floatRect.left = f7;
        float f8 = motionPaths.f336y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f335x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f336y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f5, f6, strArr, fArr);
    }

    void rotate(Rect rect, Rect rect2, int i5, int i6, int i7) {
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 == 4) {
                        int i8 = rect.left + rect.right;
                        rect2.left = i6 - (((rect.bottom + rect.top) + rect.width()) / 2);
                        rect2.top = (i8 - rect.height()) / 2;
                        rect2.right = rect2.left + rect.width();
                        rect2.bottom = rect2.top + rect.height();
                        return;
                    }
                    return;
                }
                int i9 = rect.left + rect.right;
                rect2.left = ((rect.height() / 2) + rect.top) - (i9 / 2);
                rect2.top = i7 - ((i9 + rect.height()) / 2);
                rect2.right = rect2.left + rect.width();
                rect2.bottom = rect2.top + rect.height();
                return;
            }
            int i10 = rect.left + rect.right;
            rect2.left = i6 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = (i10 - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        int i11 = rect.left + rect.right;
        rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.top = i7 - ((i11 + rect.height()) / 2);
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i5) {
        this.mStartMotionPath.mDrawPath = i5;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setPathMotionArc(int i5) {
        this.mPathMotionArc = i5;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i5, int i6, int i7) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i5 != 1) {
            if (i5 == 2) {
                int i8 = viewState.left + viewState.right;
                rect.left = i7 - (((viewState.top + viewState.bottom) + viewState.width()) / 2);
                rect.top = (i8 - viewState.height()) / 2;
                rect.right = rect.left + viewState.width();
                rect.bottom = rect.top + viewState.height();
            }
        } else {
            int i9 = viewState.left + viewState.right;
            rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
            rect.top = i6 - ((i9 + viewState.height()) / 2);
            rect.right = rect.left + viewState.width();
            rect.bottom = rect.top + viewState.height();
        }
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i5, viewState.rotation);
    }

    public void setTransformPivotTarget(int i5) {
        this.mTransformPivotTarget = i5;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, float f5) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, int i6) {
        if (i5 != 509) {
            return i5 == 704;
        }
        setPathMotionArc(i6);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, boolean z4) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    public void setup(int i5, int i6, float f5, long j5) {
        ArrayList arrayList;
        String[] strArr;
        boolean z4;
        MotionPaths[] motionPathsArr;
        int i7;
        CustomVariable customVariable;
        int i8;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        int i9;
        Integer num;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i10 = this.mPathMotionArc;
        if (i10 != -1) {
            this.mStartMotionPath.mPathMotionArc = i10;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<MotionKey> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                MotionKey next = it.next();
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    insertKey(new MotionPaths(i5, i6, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i11 = motionKeyPosition.mCurveFit;
                    if (i11 != -1) {
                        this.mCurveFitType = i11;
                    }
                } else if (next instanceof MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next2.split(",")[c5];
                    Iterator<MotionKey> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        MotionKey next3 = it3.next();
                        HashMap<String, CustomVariable> hashMap2 = next3.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(next3.mFramePosition, customVariable3);
                        }
                    }
                    makeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    makeSpline2 = SplineSet.makeSpline(next2, j5);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c5 = 1;
            }
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<MotionKey> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    MotionKey next4 = it4.next();
                    if (next4 instanceof MotionKeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                if (hashMap.containsKey(str2) && (num = hashMap.get(str2)) != null) {
                    i9 = num.intValue();
                } else {
                    i9 = 0;
                }
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(i9);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next5.split(",")[1];
                        Iterator<MotionKey> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            MotionKey next6 = it6.next();
                            HashMap<String, CustomVariable> hashMap3 = next6.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(next6.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next5, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next5, j5);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<MotionKey> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    MotionKey next7 = it7.next();
                    if (next7 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                if (hashMap.containsKey(str4)) {
                    i8 = hashMap.get(str4).intValue();
                } else {
                    i8 = 0;
                }
                this.mTimeCycleAttributesMap.get(str4).setup(i8);
            }
        }
        int i12 = 2;
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr2 = new MotionPaths[size];
        motionPathsArr2[0] = this.mStartMotionPath;
        motionPathsArr2[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i13 = 1;
        while (it8.hasNext()) {
            motionPathsArr2[i13] = it8.next();
            i13++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.customAttributes.keySet()) {
            if (this.mStartMotionPath.customAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i14 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i14 >= strArr.length) {
                break;
            }
            String str6 = strArr[i14];
            this.mAttributeInterpolatorCount[i14] = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                if (motionPathsArr2[i15].customAttributes.containsKey(str6) && (customVariable = motionPathsArr2[i15].customAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i14] = iArr[i14] + customVariable.numberOfInterpolatedValues();
                    break;
                }
                i15++;
            }
            i14++;
        }
        if (motionPathsArr2[0].mPathMotionArc != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i16 = 1; i16 < size; i16++) {
            motionPathsArr2[i16].different(motionPathsArr2[i16 - 1], zArr, this.mAttributeNames, z4);
        }
        int i17 = 0;
        for (int i18 = 1; i18 < length; i18++) {
            if (zArr[i18]) {
                i17++;
            }
        }
        this.mInterpolateVariables = new int[i17];
        int max = Math.max(2, i17);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i19 = 0;
        for (int i20 = 1; i20 < length; i20++) {
            if (zArr[i20]) {
                this.mInterpolateVariables[i19] = i20;
                i19++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i21 = 0; i21 < size; i21++) {
            motionPathsArr2[i21].fillStandard(dArr[i21], this.mInterpolateVariables);
            dArr2[i21] = motionPathsArr2[i21].time;
        }
        int i22 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i22 >= iArr2.length) {
                break;
            }
            if (iArr2[i22] < MotionPaths.names.length) {
                String str7 = MotionPaths.names[this.mInterpolateVariables[i22]] + " [";
                for (int i23 = 0; i23 < size; i23++) {
                    str7 = str7 + dArr[i23][i22];
                }
            }
            i22++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i24 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i24 >= strArr3.length) {
                break;
            }
            String str8 = strArr3[i24];
            int i25 = 0;
            int i26 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i25 < size) {
                if (motionPathsArr2[i25].hasCustomData(str8)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i12];
                        iArr3[1] = motionPathsArr2[i25].getCustomDataCount(str8);
                        i7 = 0;
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i7 = 0;
                    }
                    MotionPaths motionPaths = motionPathsArr2[i25];
                    motionPathsArr = motionPathsArr2;
                    dArr3[i26] = motionPaths.time;
                    motionPaths.getCustomData(str8, dArr4[i26], i7);
                    i26++;
                } else {
                    motionPathsArr = motionPathsArr2;
                }
                i25++;
                motionPathsArr2 = motionPathsArr;
                i12 = 2;
            }
            i24++;
            this.mSpline[i24] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i26), (double[][]) Arrays.copyOf(dArr4, i26));
            motionPathsArr2 = motionPathsArr2;
            i12 = 2;
        }
        MotionPaths[] motionPathsArr3 = motionPathsArr2;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr3[0].mPathMotionArc != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i27 = 0; i27 < size; i27++) {
                iArr4[i27] = motionPathsArr3[i27].mPathMotionArc;
                dArr5[i27] = r6.time;
                double[] dArr7 = dArr6[i27];
                dArr7[0] = r6.f335x;
                dArr7[1] = r6.f336y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            float f6 = Float.NaN;
            while (it9.hasNext()) {
                String next8 = it9.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next8);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f6)) {
                        f6 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next8);
                    this.mCycleMap.put(next8, makeWidgetCycle);
                }
            }
            Iterator<MotionKey> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                MotionKey next9 = it10.next();
                if (next9 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f6);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motion, motion.mEndMotionPath);
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f335x + " y: " + this.mStartMotionPath.f336y + " end: x: " + this.mEndMotionPath.f335x + " y: " + this.mEndMotionPath.f336y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, String str) {
        if (705 == i5) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        }
        return false;
    }
}
