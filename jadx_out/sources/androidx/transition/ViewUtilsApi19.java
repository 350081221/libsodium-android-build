package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ViewUtilsApi19 {
    private static final String TAG = "ViewUtilsApi19";
    private static final int VISIBILITY_MASK = 12;
    private static boolean sSetFrameFetched = false;
    private static Method sSetFrameMethod = null;
    private static boolean sTryHiddenTransitionAlpha = true;
    private static Field sViewFlagsField;
    private static boolean sViewFlagsFieldFetched;
    private float[] mMatrixValues;

    @RequiresApi(29)
    /* loaded from: classes2.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static float getTransitionAlpha(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        @DoNotInline
        static void setTransitionAlpha(View view, float f5) {
            view.setTransitionAlpha(f5);
        }
    }

    @SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    private void fetchSetFrame() {
        if (!sSetFrameFetched) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                sSetFrameMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e5) {
                Log.i(TAG, "Failed to retrieve setFrame method", e5);
            }
            sSetFrameFetched = true;
        }
    }

    public void clearNonTransitionAlpha(@NonNull View view) {
    }

    @SuppressLint({"NewApi"})
    public float getTransitionAlpha(@NonNull View view) {
        if (sTryHiddenTransitionAlpha) {
            try {
                return Api29Impl.getTransitionAlpha(view);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        return view.getAlpha();
    }

    public void saveNonTransitionAlpha(@NonNull View view) {
    }

    public void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        int i5;
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.mMatrixValues;
            if (fArr == null) {
                fArr = new float[9];
                this.mMatrixValues = fArr;
            }
            matrix.getValues(fArr);
            float f5 = fArr[3];
            float sqrt = (float) Math.sqrt(1.0f - (f5 * f5));
            if (fArr[0] < 0.0f) {
                i5 = -1;
            } else {
                i5 = 1;
            }
            float f6 = sqrt * i5;
            float degrees = (float) Math.toDegrees(Math.atan2(f5, f6));
            float f7 = fArr[0] / f6;
            float f8 = fArr[4] / f6;
            float f9 = fArr[2];
            float f10 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setRotation(degrees);
            view.setScaleX(f7);
            view.setScaleY(f8);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void setLeftTopRightBottom(@NonNull View view, int i5, int i6, int i7, int i8) {
        fetchSetFrame();
        Method method = sSetFrameMethod;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5.getCause());
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void setTransitionAlpha(@NonNull View view, float f5) {
        if (sTryHiddenTransitionAlpha) {
            try {
                Api29Impl.setTransitionAlpha(view, f5);
                return;
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        view.setAlpha(f5);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void setTransitionVisibility(@NonNull View view, int i5) {
        if (!sViewFlagsFieldFetched) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                sViewFlagsField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(TAG, "fetchViewFlagsField: ");
            }
            sViewFlagsFieldFetched = true;
        }
        Field field = sViewFlagsField;
        if (field != null) {
            try {
                sViewFlagsField.setInt(view, i5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToGlobal((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            transformMatrixToLocal((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
