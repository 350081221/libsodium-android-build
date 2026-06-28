package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    HashMap<String, CustomVariable> customAttributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    float mRelativeAngle;
    Motion mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x, reason: collision with root package name */
    float f335x;

    /* renamed from: y, reason: collision with root package name */
    float f336y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f5, float f6) {
        if (!Float.isNaN(f5) && !Float.isNaN(f6)) {
            if (Math.abs(f5 - f6) > 1.0E-6f) {
                return true;
            }
            return false;
        }
        if (Float.isNaN(f5) != Float.isNaN(f6)) {
            return true;
        }
        return false;
    }

    private static final float xRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return (((f9 - f7) * f6) - ((f10 - f8) * f5)) + f7;
    }

    private static final float yRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return ((f9 - f7) * f5) + ((f10 - f8) * f6) + f8;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z4) {
        boolean diff = diff(this.f335x, motionPaths.f335x);
        boolean diff2 = diff(this.f336y, motionPaths.f336y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z5 = diff | diff2 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f335x, this.f336y, this.width, this.height, this.mPathRotate};
        int i5 = 0;
        for (int i6 : iArr) {
            if (i6 < 6) {
                dArr[i5] = fArr[r4];
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.width;
        float f6 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f7 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 != 3) {
                if (i7 == 4) {
                    f6 = f7;
                }
            } else {
                f5 = f7;
            }
        }
        fArr[i5] = f5;
        fArr[i5 + 1] = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f335x;
        float f6 = this.f336y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f5 = f9;
            } else if (i7 == 2) {
                f6 = f9;
            } else if (i7 == 3) {
                f7 = f9;
            } else if (i7 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            f5 = (float) ((d6 + (Math.sin(d8) * d7)) - (f7 / 2.0f));
            f6 = (float) ((f11 - (d7 * Math.cos(d8))) - (f8 / 2.0f));
        }
        fArr[i5] = f5 + (f7 / 2.0f) + 0.0f;
        fArr[i5 + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    void getCenterVelocity(double d5, int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f335x;
        float f6 = this.f336y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            f8 = f9;
                        }
                    } else {
                        f7 = f9;
                    }
                } else {
                    f6 = f9;
                }
            } else {
                f5 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            f5 = (float) ((d6 + (Math.sin(d8) * d7)) - (f7 / 2.0f));
            f6 = (float) ((f11 - (d7 * Math.cos(d8))) - (f8 / 2.0f));
        }
        fArr[i5] = f5 + (f7 / 2.0f) + 0.0f;
        fArr[i5 + 1] = f6 + (f8 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i5) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i6 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i5] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r2[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f335x;
        float f6 = this.f336y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
                            f8 = f9;
                        }
                    } else {
                        f7 = f9;
                    }
                } else {
                    f6 = f9;
                }
            } else {
                f5 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d5 = f5;
            double d6 = f6;
            float sin = (float) ((centerX + (Math.sin(d6) * d5)) - (f7 / 2.0f));
            f6 = (float) ((centerY - (d5 * Math.cos(d6))) - (f8 / 2.0f));
            f5 = sin;
        }
        float f10 = f7 + f5;
        float f11 = f8 + f6;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i8 = i5 + 1;
        fArr[i5] = f5 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f6 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f10 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f6 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f10 + 0.0f;
        int i13 = i12 + 1;
        fArr[i12] = f11 + 0.0f;
        fArr[i13] = f5 + 0.0f;
        fArr[i13 + 1] = f11 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f9;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f5 = f9;
        } else {
            f5 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f6 = f9;
        } else {
            f6 = motionKeyPosition.mPercentHeight;
        }
        float f10 = motionPaths2.width;
        float f11 = motionPaths.width;
        float f12 = motionPaths2.height;
        float f13 = motionPaths.height;
        this.position = this.time;
        float f14 = motionPaths.f335x;
        float f15 = motionPaths.f336y;
        float f16 = (motionPaths2.f335x + (f10 / 2.0f)) - ((f11 / 2.0f) + f14);
        float f17 = (motionPaths2.f336y + (f12 / 2.0f)) - (f15 + (f13 / 2.0f));
        float f18 = ((f10 - f11) * f5) / 2.0f;
        this.f335x = (int) ((f14 + (f16 * f9)) - f18);
        float f19 = ((f12 - f13) * f6) / 2.0f;
        this.f336y = (int) ((f15 + (f17 * f9)) - f19);
        this.width = (int) (f11 + r9);
        this.height = (int) (f13 + r12);
        if (Float.isNaN(motionKeyPosition.mPercentX)) {
            f7 = f9;
        } else {
            f7 = motionKeyPosition.mPercentX;
        }
        float f20 = 0.0f;
        if (Float.isNaN(motionKeyPosition.mAltPercentY)) {
            f8 = 0.0f;
        } else {
            f8 = motionKeyPosition.mAltPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f9 = motionKeyPosition.mPercentY;
        }
        if (!Float.isNaN(motionKeyPosition.mAltPercentX)) {
            f20 = motionKeyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.f335x = (int) (((motionPaths.f335x + (f7 * f16)) + (f20 * f17)) - f18);
        this.f336y = (int) (((motionPaths.f336y + (f16 * f8)) + (f17 * f9)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float f8 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f8;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f5 = f8;
        } else {
            f5 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f6 = f8;
        } else {
            f6 = motionKeyPosition.mPercentHeight;
        }
        float f9 = motionPaths2.width - motionPaths.width;
        float f10 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f8 = motionKeyPosition.mPercentX;
        }
        float f11 = motionPaths.f335x;
        float f12 = motionPaths.width;
        float f13 = motionPaths.f336y;
        float f14 = motionPaths.height;
        float f15 = (motionPaths2.f335x + (motionPaths2.width / 2.0f)) - ((f12 / 2.0f) + f11);
        float f16 = (motionPaths2.f336y + (motionPaths2.height / 2.0f)) - ((f14 / 2.0f) + f13);
        float f17 = f15 * f8;
        float f18 = (f9 * f5) / 2.0f;
        this.f335x = (int) ((f11 + f17) - f18);
        float f19 = f8 * f16;
        float f20 = (f10 * f6) / 2.0f;
        this.f336y = (int) ((f13 + f19) - f20);
        this.width = (int) (f12 + r7);
        this.height = (int) (f14 + r8);
        if (Float.isNaN(motionKeyPosition.mPercentY)) {
            f7 = 0.0f;
        } else {
            f7 = motionKeyPosition.mPercentY;
        }
        this.mMode = 1;
        float f21 = (int) ((motionPaths.f335x + f17) - f18);
        float f22 = (int) ((motionPaths.f336y + f19) - f20);
        this.f335x = f21 + ((-f16) * f7);
        this.f336y = f22 + (f15 * f7);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initPolar(int i5, int i6, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float min;
        float f8;
        float f9;
        float f10 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mMode = motionKeyPosition.mPositionType;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f5 = f10;
        } else {
            f5 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f6 = f10;
        } else {
            f6 = motionKeyPosition.mPercentHeight;
        }
        float f11 = motionPaths2.width;
        float f12 = motionPaths.width;
        float f13 = motionPaths2.height;
        float f14 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f12 + ((f11 - f12) * f5));
        this.height = (int) (f14 + ((f13 - f14) * f6));
        int i7 = motionKeyPosition.mPositionType;
        if (i7 != 1) {
            if (i7 != 2) {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    f9 = f10;
                } else {
                    f9 = motionKeyPosition.mPercentX;
                }
                float f15 = motionPaths2.f335x;
                float f16 = motionPaths.f335x;
                this.f335x = (f9 * (f15 - f16)) + f16;
                if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                    f10 = motionKeyPosition.mPercentY;
                }
                float f17 = motionPaths2.f336y;
                float f18 = motionPaths.f336y;
                this.f336y = (f10 * (f17 - f18)) + f18;
            } else {
                if (Float.isNaN(motionKeyPosition.mPercentX)) {
                    float f19 = motionPaths2.f335x;
                    float f20 = motionPaths.f335x;
                    min = ((f19 - f20) * f10) + f20;
                } else {
                    min = Math.min(f6, f5) * motionKeyPosition.mPercentX;
                }
                this.f335x = min;
                if (Float.isNaN(motionKeyPosition.mPercentY)) {
                    float f21 = motionPaths2.f336y;
                    float f22 = motionPaths.f336y;
                    f8 = (f10 * (f21 - f22)) + f22;
                } else {
                    f8 = motionKeyPosition.mPercentY;
                }
                this.f336y = f8;
            }
        } else {
            if (Float.isNaN(motionKeyPosition.mPercentX)) {
                f7 = f10;
            } else {
                f7 = motionKeyPosition.mPercentX;
            }
            float f23 = motionPaths2.f335x;
            float f24 = motionPaths.f335x;
            this.f335x = (f7 * (f23 - f24)) + f24;
            if (!Float.isNaN(motionKeyPosition.mPercentY)) {
                f10 = motionKeyPosition.mPercentY;
            }
            float f25 = motionPaths2.f336y;
            float f26 = motionPaths.f336y;
            this.f336y = (f10 * (f25 - f26)) + f26;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    void initScreen(int i5, int i6, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f7;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        if (Float.isNaN(motionKeyPosition.mPercentWidth)) {
            f5 = f7;
        } else {
            f5 = motionKeyPosition.mPercentWidth;
        }
        if (Float.isNaN(motionKeyPosition.mPercentHeight)) {
            f6 = f7;
        } else {
            f6 = motionKeyPosition.mPercentHeight;
        }
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f335x;
        float f13 = motionPaths.f336y;
        float f14 = motionPaths2.f335x + (f8 / 2.0f);
        float f15 = motionPaths2.f336y + (f10 / 2.0f);
        float f16 = (f8 - f9) * f5;
        this.f335x = (int) ((f12 + ((f14 - ((f9 / 2.0f) + f12)) * f7)) - (f16 / 2.0f));
        float f17 = (f10 - f11) * f6;
        this.f336y = (int) ((f13 + ((f15 - (f13 + (f11 / 2.0f))) * f7)) - (f17 / 2.0f));
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f17);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f335x = (int) (motionKeyPosition.mPercentX * ((int) (i5 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f336y = (int) (motionKeyPosition.mPercentY * ((int) (i6 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f335x = f5;
        this.f336y = f6;
        this.width = f7;
        this.height = f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float f5, float f6, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f11 = (float) dArr[i5];
            double d5 = dArr2[i5];
            int i6 = iArr[i5];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            f10 = f11;
                        }
                    } else {
                        f8 = f11;
                    }
                } else {
                    f9 = f11;
                }
            } else {
                f7 = f11;
            }
        }
        float f12 = f7 - ((0.0f * f8) / 2.0f);
        float f13 = f9 - ((0.0f * f10) / 2.0f);
        fArr[0] = (f12 * (1.0f - f5)) + (((f8 * 1.0f) + f12) * f5) + 0.0f;
        fArr[1] = (f13 * (1.0f - f6)) + (((f10 * 1.0f) + f13) * f6) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(float f5, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f6;
        float f7;
        float f8 = this.f335x;
        float f9 = this.f336y;
        float f10 = this.width;
        float f11 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i5 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i5];
            this.mTempDelta = new double[i5];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            double[] dArr4 = this.mTempValue;
            int i7 = iArr[i6];
            dArr4[i7] = dArr[i6];
            this.mTempDelta[i7] = dArr2[i6];
        }
        float f12 = Float.NaN;
        int i8 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i8 >= dArr5.length) {
                break;
            }
            double d5 = 0.0d;
            if (Double.isNaN(dArr5[i8]) && (dArr3 == null || dArr3[i8] == 0.0d)) {
                f7 = f12;
            } else {
                if (dArr3 != null) {
                    d5 = dArr3[i8];
                }
                if (!Double.isNaN(this.mTempValue[i8])) {
                    d5 = this.mTempValue[i8] + d5;
                }
                f7 = f12;
                float f17 = (float) d5;
                float f18 = (float) this.mTempDelta[i8];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                if (i8 == 5) {
                                    f12 = f17;
                                }
                            } else {
                                f12 = f7;
                                f16 = f18;
                                f11 = f17;
                            }
                        } else {
                            f12 = f7;
                            f15 = f18;
                            f10 = f17;
                        }
                    } else {
                        f12 = f7;
                        f14 = f18;
                        f9 = f17;
                    }
                } else {
                    f12 = f7;
                    f13 = f18;
                    f8 = f17;
                }
                i8++;
            }
            f12 = f7;
            i8++;
        }
        float f19 = f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f5, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d6 = f8;
            double d7 = f9;
            float sin = (float) ((f20 + (Math.sin(d7) * d6)) - (f10 / 2.0f));
            f6 = f11;
            float cos = (float) ((f21 - (Math.cos(d7) * d6)) - (f11 / 2.0f));
            double d8 = f13;
            double d9 = f14;
            float sin2 = (float) (f22 + (Math.sin(d7) * d8) + (Math.cos(d7) * d6 * d9));
            float cos2 = (float) ((f23 - (d8 * Math.cos(d7))) + (d6 * Math.sin(d7) * d9));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f19)) {
                motionWidget.setRotationZ((float) (f19 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f8 = sin;
            f9 = cos;
        } else {
            f6 = f11;
            if (!Float.isNaN(f19)) {
                motionWidget.setRotationZ((float) (0.0f + f19 + Math.toDegrees(Math.atan2(f14 + (f16 / 2.0f), f13 + (f15 / 2.0f)))));
            }
        }
        float f24 = f8 + 0.5f;
        float f25 = f9 + 0.5f;
        motionWidget.layout((int) f24, (int) f25, (int) (f24 + f10), (int) (f25 + f6));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d5 = ((this.f335x + (this.width / 2.0f)) - motionPaths.f335x) - (motionPaths.width / 2.0f);
        double d6 = ((this.f336y + (this.height / 2.0f)) - motionPaths.f336y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f335x = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f336y = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f336y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i5, int i6, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i5, i6, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i7 = motionKeyPosition.mPositionType;
        if (i7 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i7 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i5, i6, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f5;
        float f6 = this.f335x;
        float f7 = this.f336y;
        float f8 = this.width;
        float f9 = this.height;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f14 = (float) dArr[i5];
            float f15 = (float) dArr2[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f6 = f14;
                f10 = f15;
            } else if (i6 == 2) {
                f7 = f14;
                f12 = f15;
            } else if (i6 == 3) {
                f8 = f14;
                f11 = f15;
            } else if (i6 == 4) {
                f9 = f14;
                f13 = f15;
            }
        }
        float f16 = 2.0f;
        float f17 = (f11 / 2.0f) + f10;
        float f18 = (f13 / 2.0f) + f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d5, fArr3, fArr4);
            float f19 = fArr3[0];
            float f20 = fArr3[1];
            float f21 = fArr4[0];
            float f22 = fArr4[1];
            double d6 = f6;
            double d7 = f7;
            f5 = f8;
            float sin = (float) ((f19 + (Math.sin(d7) * d6)) - (f8 / 2.0f));
            float cos = (float) ((f20 - (d6 * Math.cos(d7))) - (f9 / 2.0f));
            double d8 = f10;
            double d9 = f12;
            float sin2 = (float) (f21 + (Math.sin(d7) * d8) + (Math.cos(d7) * d9));
            f18 = (float) ((f22 - (d8 * Math.cos(d7))) + (Math.sin(d7) * d9));
            f17 = sin2;
            f6 = sin;
            f7 = cos;
            f16 = 2.0f;
        } else {
            f5 = f8;
        }
        fArr[0] = f6 + (f5 / f16) + 0.0f;
        fArr[1] = f7 + (f9 / f16) + 0.0f;
        fArr2[0] = f17;
        fArr2[1] = f18;
    }
}
