package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ViewGroupUtils {
    private static Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(29)
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static int getChildDrawingOrder(ViewGroup viewGroup, int i5) {
            int childDrawingOrder;
            childDrawingOrder = viewGroup.getChildDrawingOrder(i5);
            return childDrawingOrder;
        }

        @DoNotInline
        static void suppressLayout(ViewGroup viewGroup, boolean z4) {
            viewGroup.suppressLayout(z4);
        }
    }

    private ViewGroupUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getChildDrawingOrder(@NonNull ViewGroup viewGroup, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getChildDrawingOrder(viewGroup, i5);
        }
        if (!sGetChildDrawingOrderMethodFetched) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                sGetChildDrawingOrderMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetChildDrawingOrderMethodFetched = true;
        }
        Method method = sGetChildDrawingOrderMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i5))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i5;
    }

    @SuppressLint({"NewApi"})
    private static void hiddenSuppressLayout(@NonNull ViewGroup viewGroup, boolean z4) {
        if (sTryHiddenSuppressLayout) {
            try {
                Api29Impl.suppressLayout(viewGroup, z4);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void suppressLayout(@NonNull ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.suppressLayout(viewGroup, z4);
        } else {
            hiddenSuppressLayout(viewGroup, z4);
        }
    }
}
