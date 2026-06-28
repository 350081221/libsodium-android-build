package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import external.org.apache.commons.lang3.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class ViewOscillator extends KeyCycleOscillator {
    private static final String TAG = "ViewOscillator";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class AlphaSet extends ViewOscillator {
        AlphaSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setAlpha(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class CustomSet extends ViewOscillator {
        protected ConstraintAttribute mCustom;
        float[] value = new float[1];

        CustomSet() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void setCustom(Object obj) {
            this.mCustom = (ConstraintAttribute) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            this.value[0] = get(f5);
            CustomSupport.setInterpolatedValue(this.mCustom, view, this.value);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ElevationSet extends ViewOscillator {
        ElevationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setElevation(get(f5));
        }
    }

    /* loaded from: classes2.dex */
    public static class PathRotateSet extends ViewOscillator {
        public void setPathRotate(View view, float f5, double d5, double d6) {
            view.setRotation(get(f5) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ProgressSet extends ViewOscillator {
        boolean mNoMethod = false;

        ProgressSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
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
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e5);
                } catch (InvocationTargetException e6) {
                    Log.e(ViewOscillator.TAG, "unable to setProgress", e6);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationSet extends ViewOscillator {
        RotationSet() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotation(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationXset extends ViewOscillator {
        RotationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotationX(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RotationYset extends ViewOscillator {
        RotationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setRotationY(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ScaleXset extends ViewOscillator {
        ScaleXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setScaleX(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ScaleYset extends ViewOscillator {
        ScaleYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setScaleY(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationXset extends ViewOscillator {
        TranslationXset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationX(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationYset extends ViewOscillator {
        TranslationYset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationY(get(f5));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TranslationZset extends ViewOscillator {
        TranslationZset() {
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(View view, float f5) {
            view.setTranslationZ(get(f5));
        }
    }

    public static ViewOscillator makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new CustomSet();
        }
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
            case -40300674:
                if (str.equals(Key.ROTATION)) {
                    c5 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c5 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c5 = c.f15956c;
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
                return new RotationSet();
            case '\n':
                return new ElevationSet();
            case 11:
                return new PathRotateSet();
            case '\f':
                return new AlphaSet();
            case '\r':
                return new AlphaSet();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float f5);
}
