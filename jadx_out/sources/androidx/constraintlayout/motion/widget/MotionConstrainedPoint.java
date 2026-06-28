package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import external.org.apache.commons.lang3.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    private float height;
    private Easing mKeyFrameEasing;
    private float position;
    int visibility;
    private float width;

    /* renamed from: x, reason: collision with root package name */
    private float f347x;

    /* renamed from: y, reason: collision with root package name */
    private float f348y;
    private float alpha = 1.0f;
    int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    int mMode = 0;
    double[] mTempValue = new double[18];
    double[] mTempDelta = new double[18];

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

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    public void addValues(HashMap<String, ViewSpline> hashMap, int i5) {
        for (String str : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str);
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
                case -760884510:
                    if (str.equals(Key.PIVOT_X)) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(Key.PIVOT_Y)) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(Key.ROTATION)) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c5 = c.f15956c;
                        break;
                    }
                    break;
            }
            float f5 = 1.0f;
            float f6 = 0.0f;
            switch (c5) {
                case 0:
                    if (!Float.isNaN(this.rotationX)) {
                        f6 = this.rotationX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f6 = this.rotationY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 2:
                    if (!Float.isNaN(this.translationX)) {
                        f6 = this.translationX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationY)) {
                        f6 = this.translationY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationZ)) {
                        f6 = this.translationZ;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 5:
                    if (!Float.isNaN(this.mProgress)) {
                        f6 = this.mProgress;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 6:
                    if (!Float.isNaN(this.scaleX)) {
                        f5 = this.scaleX;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                case 7:
                    if (!Float.isNaN(this.scaleY)) {
                        f5 = this.scaleY;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotX)) {
                        f6 = this.mPivotX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\t':
                    if (!Float.isNaN(this.mPivotY)) {
                        f6 = this.mPivotY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\n':
                    if (!Float.isNaN(this.rotation)) {
                        f6 = this.rotation;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 11:
                    if (!Float.isNaN(this.elevation)) {
                        f6 = this.elevation;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f6 = this.mPathRotate;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\r':
                    if (!Float.isNaN(this.alpha)) {
                        f5 = this.alpha;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.attributes.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = this.attributes.get(str2);
                            if (viewSpline instanceof ViewSpline.CustomSet) {
                                ((ViewSpline.CustomSet) viewSpline).setPoint(i5, constraintAttribute);
                                break;
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i5 + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline " + str);
                        break;
                    }
            }
        }
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        this.elevation = view.getElevation();
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        this.translationZ = view.getTranslationZ();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
        int i5 = this.visibility;
        int i6 = motionConstrainedPoint.visibility;
        if (i5 != i6 && this.mVisibilityMode == 0 && (i5 == 0 || i6 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
    }

    void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f347x, this.f348y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i5 = 0;
        for (int i6 : iArr) {
            if (i6 < 18) {
                dArr[i5] = fArr[r4];
                i5++;
            }
        }
    }

    int getCustomData(String str, double[] dArr, int i5) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i5] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i6 = 0;
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r1[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    int getCustomDataCount(String str) {
        return this.attributes.get(str).numberOfInterpolatedValues();
    }

    boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    void setBounds(float f5, float f6, float f7, float f8) {
        this.f347x = f5;
        this.f348y = f6;
        this.width = f7;
        this.height = f8;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void setState(Rect rect, View view, int i5, float f5) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i5 == 1) {
            this.rotation = f5 - 90.0f;
        } else {
            if (i5 != 2) {
                return;
            }
            this.rotation = f5 + 90.0f;
        }
    }

    public void setState(Rect rect, ConstraintSet constraintSet, int i5, int i6) {
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(constraintSet.getParameters(i6));
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                }
            }
            float f5 = this.rotation + 90.0f;
            this.rotation = f5;
            if (f5 > 180.0f) {
                this.rotation = f5 - 360.0f;
                return;
            }
            return;
        }
        this.rotation -= 90.0f;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i5 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i5;
        int i6 = propertySet.visibility;
        this.visibility = i6;
        this.alpha = (i6 == 0 || i5 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.applyElevation = transform.applyElevation;
        this.elevation = transform.elevation;
        this.rotation = transform.rotation;
        this.rotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.scaleX = transform.scaleX;
        this.scaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.translationX = transform.translationX;
        this.translationY = transform.translationY;
        this.translationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f347x, motionConstrainedPoint.f347x);
        zArr[2] = zArr[2] | diff(this.f348y, motionConstrainedPoint.f348y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }
}
