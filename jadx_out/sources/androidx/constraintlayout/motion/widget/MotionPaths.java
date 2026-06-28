package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mAnimateCircleAngleTo;
    int mAnimateRelativeTo;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mRelativeAngle;
    MotionController mRelativeToController;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x, reason: collision with root package name */
    float f349x;

    /* renamed from: y, reason: collision with root package name */
    float f350y;
    int mDrawPath = 0;
    float mPathRotate = Float.NaN;
    float mProgress = Float.NaN;

    public MotionPaths() {
        int i5 = Key.UNSET;
        this.mPathMotionArc = i5;
        this.mAnimateRelativeTo = i5;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
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

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = constraint.propertySet.mProgress;
        this.mRelativeAngle = constraint.layout.circleAngle;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute != null && constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    public void configureRelativeTo(MotionController motionController) {
        motionController.getPos(this.mProgress);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z4) {
        boolean diff = diff(this.f349x, motionPaths.f349x);
        boolean diff2 = diff(this.f350y, motionPaths.f350y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z5 = diff | diff2 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f349x, this.f350y, this.width, this.height, this.mPathRotate};
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
        float f5 = this.f349x;
        float f6 = this.f350y;
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d5, fArr2, new float[2]);
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
        float f5 = this.f349x;
        float f6 = this.f350y;
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr2 = new float[2];
            motionController.getCenter(d5, fArr2, new float[2]);
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
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        int i6 = 0;
        if (constraintAttribute == null) {
            return 0;
        }
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i5] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r2[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute == null) {
            return 0;
        }
        return constraintAttribute.numberOfInterpolatedValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f349x;
        float f6 = this.f350y;
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float centerX = motionController.getCenterX();
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
        return this.attributes.containsKey(str);
    }

    void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = keyPosition.mFramePosition / 100.0f;
        this.time = f9;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f5 = f9;
        } else {
            f5 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f6 = f9;
        } else {
            f6 = keyPosition.mPercentHeight;
        }
        float f10 = motionPaths2.width;
        float f11 = motionPaths.width;
        float f12 = motionPaths2.height;
        float f13 = motionPaths.height;
        this.position = this.time;
        float f14 = motionPaths.f349x;
        float f15 = motionPaths.f350y;
        float f16 = (motionPaths2.f349x + (f10 / 2.0f)) - ((f11 / 2.0f) + f14);
        float f17 = (motionPaths2.f350y + (f12 / 2.0f)) - (f15 + (f13 / 2.0f));
        float f18 = ((f10 - f11) * f5) / 2.0f;
        this.f349x = (int) ((f14 + (f16 * f9)) - f18);
        float f19 = ((f12 - f13) * f6) / 2.0f;
        this.f350y = (int) ((f15 + (f17 * f9)) - f19);
        this.width = (int) (f11 + r9);
        this.height = (int) (f13 + r12);
        if (Float.isNaN(keyPosition.mPercentX)) {
            f7 = f9;
        } else {
            f7 = keyPosition.mPercentX;
        }
        float f20 = 0.0f;
        if (Float.isNaN(keyPosition.mAltPercentY)) {
            f8 = 0.0f;
        } else {
            f8 = keyPosition.mAltPercentY;
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f9 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f20 = keyPosition.mAltPercentX;
        }
        this.mMode = 0;
        this.f349x = (int) (((motionPaths.f349x + (f7 * f16)) + (f20 * f17)) - f18);
        this.f350y = (int) (((motionPaths.f350y + (f16 * f8)) + (f17 * f9)) - f19);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float f8 = keyPosition.mFramePosition / 100.0f;
        this.time = f8;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f5 = f8;
        } else {
            f5 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f6 = f8;
        } else {
            f6 = keyPosition.mPercentHeight;
        }
        float f9 = motionPaths2.width - motionPaths.width;
        float f10 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f8 = keyPosition.mPercentX;
        }
        float f11 = motionPaths.f349x;
        float f12 = motionPaths.width;
        float f13 = motionPaths.f350y;
        float f14 = motionPaths.height;
        float f15 = (motionPaths2.f349x + (motionPaths2.width / 2.0f)) - ((f12 / 2.0f) + f11);
        float f16 = (motionPaths2.f350y + (motionPaths2.height / 2.0f)) - ((f14 / 2.0f) + f13);
        float f17 = f15 * f8;
        float f18 = (f9 * f5) / 2.0f;
        this.f349x = (int) ((f11 + f17) - f18);
        float f19 = f8 * f16;
        float f20 = (f10 * f6) / 2.0f;
        this.f350y = (int) ((f13 + f19) - f20);
        this.width = (int) (f12 + r7);
        this.height = (int) (f14 + r8);
        if (Float.isNaN(keyPosition.mPercentY)) {
            f7 = 0.0f;
        } else {
            f7 = keyPosition.mPercentY;
        }
        this.mMode = 1;
        float f21 = (int) ((motionPaths.f349x + f17) - f18);
        float f22 = (int) ((motionPaths.f350y + f19) - f20);
        this.f349x = f21 + ((-f16) * f7);
        this.f350y = f22 + (f15 * f7);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPolar(int i5, int i6, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7;
        float min;
        float f8;
        float f9;
        float f10 = keyPosition.mFramePosition / 100.0f;
        this.time = f10;
        this.mDrawPath = keyPosition.mDrawPath;
        this.mMode = keyPosition.mPositionType;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f5 = f10;
        } else {
            f5 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f6 = f10;
        } else {
            f6 = keyPosition.mPercentHeight;
        }
        float f11 = motionPaths2.width;
        float f12 = motionPaths.width;
        float f13 = motionPaths2.height;
        float f14 = motionPaths.height;
        this.position = this.time;
        this.width = (int) (f12 + ((f11 - f12) * f5));
        this.height = (int) (f14 + ((f13 - f14) * f6));
        int i7 = keyPosition.mPositionType;
        if (i7 != 1) {
            if (i7 != 2) {
                if (Float.isNaN(keyPosition.mPercentX)) {
                    f9 = f10;
                } else {
                    f9 = keyPosition.mPercentX;
                }
                float f15 = motionPaths2.f349x;
                float f16 = motionPaths.f349x;
                this.f349x = (f9 * (f15 - f16)) + f16;
                if (!Float.isNaN(keyPosition.mPercentY)) {
                    f10 = keyPosition.mPercentY;
                }
                float f17 = motionPaths2.f350y;
                float f18 = motionPaths.f350y;
                this.f350y = (f10 * (f17 - f18)) + f18;
            } else {
                if (Float.isNaN(keyPosition.mPercentX)) {
                    float f19 = motionPaths2.f349x;
                    float f20 = motionPaths.f349x;
                    min = ((f19 - f20) * f10) + f20;
                } else {
                    min = Math.min(f6, f5) * keyPosition.mPercentX;
                }
                this.f349x = min;
                if (Float.isNaN(keyPosition.mPercentY)) {
                    float f21 = motionPaths2.f350y;
                    float f22 = motionPaths.f350y;
                    f8 = (f10 * (f21 - f22)) + f22;
                } else {
                    f8 = keyPosition.mPercentY;
                }
                this.f350y = f8;
            }
        } else {
            if (Float.isNaN(keyPosition.mPercentX)) {
                f7 = f10;
            } else {
                f7 = keyPosition.mPercentX;
            }
            float f23 = motionPaths2.f349x;
            float f24 = motionPaths.f349x;
            this.f349x = (f7 * (f23 - f24)) + f24;
            if (!Float.isNaN(keyPosition.mPercentY)) {
                f10 = keyPosition.mPercentY;
            }
            float f25 = motionPaths2.f350y;
            float f26 = motionPaths.f350y;
            this.f350y = (f10 * (f25 - f26)) + f26;
        }
        this.mAnimateRelativeTo = motionPaths.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initScreen(int i5, int i6, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5;
        float f6;
        float f7 = keyPosition.mFramePosition / 100.0f;
        this.time = f7;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f5 = f7;
        } else {
            f5 = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f6 = f7;
        } else {
            f6 = keyPosition.mPercentHeight;
        }
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f349x;
        float f13 = motionPaths.f350y;
        float f14 = motionPaths2.f349x + (f8 / 2.0f);
        float f15 = motionPaths2.f350y + (f10 / 2.0f);
        float f16 = (f8 - f9) * f5;
        this.f349x = (int) ((f12 + ((f14 - ((f9 / 2.0f) + f12)) * f7)) - (f16 / 2.0f));
        float f17 = (f10 - f11) * f6;
        this.f350y = (int) ((f13 + ((f15 - (f13 + (f11 / 2.0f))) * f7)) - (f17 / 2.0f));
        this.width = (int) (f9 + f16);
        this.height = (int) (f11 + f17);
        this.mMode = 2;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f349x = (int) (keyPosition.mPercentX * ((int) (i5 - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f350y = (int) (keyPosition.mPercentY * ((int) (i6 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f349x = f5;
        this.f350y = f6;
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
    /* JADX WARN: Multi-variable type inference failed */
    public void setView(float f5, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z4) {
        float f6;
        boolean z5;
        boolean z6;
        float f7;
        float f8 = this.f349x;
        float f9 = this.f350y;
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motionController.getCenter(f5, fArr, fArr2);
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
                z5 = false;
                dArr2[0] = sin2;
                z6 = true;
                dArr2[1] = cos2;
            } else {
                z5 = false;
                z6 = true;
            }
            if (!Float.isNaN(f19)) {
                view.setRotation((float) (f19 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f8 = sin;
            f9 = cos;
        } else {
            f6 = f11;
            z5 = false;
            z6 = true;
            if (!Float.isNaN(f19)) {
                view.setRotation((float) (0.0f + f19 + Math.toDegrees(Math.atan2(f14 + (f16 / 2.0f), f13 + (f15 / 2.0f)))));
            }
        }
        if (view instanceof FloatLayout) {
            ((FloatLayout) view).layout(f8, f9, f10 + f8, f9 + f6);
            return;
        }
        float f24 = f8 + 0.5f;
        int i9 = (int) f24;
        float f25 = f9 + 0.5f;
        int i10 = (int) f25;
        int i11 = (int) (f24 + f10);
        int i12 = (int) (f25 + f6);
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 != view.getMeasuredWidth() || i14 != view.getMeasuredHeight()) {
            z5 = z6;
        }
        if (z5 || z4) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        }
        view.layout(i9, i10, i11, i12);
    }

    public void setupRelative(MotionController motionController, MotionPaths motionPaths) {
        double d5 = ((this.f349x + (this.width / 2.0f)) - motionPaths.f349x) - (motionPaths.width / 2.0f);
        double d6 = ((this.f350y + (this.height / 2.0f)) - motionPaths.f350y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motionController;
        this.f349x = (float) Math.hypot(d6, d5);
        if (Float.isNaN(this.mRelativeAngle)) {
            this.f350y = (float) (Math.atan2(d6, d5) + 1.5707963267948966d);
        } else {
            this.f350y = (float) Math.toRadians(this.mRelativeAngle);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i5, int i6, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        int i7 = Key.UNSET;
        this.mPathMotionArc = i7;
        this.mAnimateRelativeTo = i7;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != Key.UNSET) {
            initPolar(i5, i6, keyPosition, motionPaths, motionPaths2);
            return;
        }
        int i8 = keyPosition.mPositionType;
        if (i8 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i8 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i5, i6, keyPosition, motionPaths, motionPaths2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f5;
        float f6 = this.f349x;
        float f7 = this.f350y;
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
        MotionController motionController = this.mRelativeToController;
        if (motionController != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motionController.getCenter(d5, fArr3, fArr4);
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
