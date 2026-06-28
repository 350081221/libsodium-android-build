package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ViewUtils {
    static final Property<View, Rect> CLIP_BOUNDS;
    private static final ViewUtilsApi19 IMPL;
    private static final String TAG = "ViewUtils";
    static final Property<View, Float> TRANSITION_ALPHA;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            IMPL = new ViewUtilsApi29();
        } else {
            IMPL = new ViewUtilsApi23();
        }
        TRANSITION_ALPHA = new Property<View, Float>(Float.class, "translationAlpha") { // from class: androidx.transition.ViewUtils.1
            @Override // android.util.Property
            public Float get(View view) {
                return Float.valueOf(ViewUtils.getTransitionAlpha(view));
            }

            @Override // android.util.Property
            public void set(View view, Float f5) {
                ViewUtils.setTransitionAlpha(view, f5.floatValue());
            }
        };
        CLIP_BOUNDS = new Property<View, Rect>(Rect.class, "clipBounds") { // from class: androidx.transition.ViewUtils.2
            @Override // android.util.Property
            public Rect get(View view) {
                return view.getClipBounds();
            }

            @Override // android.util.Property
            public void set(View view, Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    private ViewUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void clearNonTransitionAlpha(@NonNull View view) {
        IMPL.clearNonTransitionAlpha(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getTransitionAlpha(@NonNull View view) {
        return IMPL.getTransitionAlpha(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void saveNonTransitionAlpha(@NonNull View view) {
        IMPL.saveNonTransitionAlpha(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        IMPL.setAnimationMatrix(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLeftTopRightBottom(@NonNull View view, int i5, int i6, int i7, int i8) {
        IMPL.setLeftTopRightBottom(view, i5, i6, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setTransitionAlpha(@NonNull View view, float f5) {
        IMPL.setTransitionAlpha(view, f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setTransitionVisibility(@NonNull View view, int i5) {
        IMPL.setTransitionVisibility(view, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToGlobal(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        IMPL.transformMatrixToLocal(view, matrix);
    }
}
