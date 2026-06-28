package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/CanvasUtils;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lkotlin/r2;", "enableZ", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "Ljava/lang/reflect/Method;", "inorderBarrierMethod", "orderMethodsFetched", "Z", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,102:1\n26#2:103\n26#2:104\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:103\n59#1:104\n*E\n"})
/* loaded from: classes.dex */
public final class CanvasUtils {

    @p4.l
    public static final CanvasUtils INSTANCE = new CanvasUtils();

    @p4.m
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;

    @p4.m
    private static Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(@p4.l android.graphics.Canvas canvas, boolean z4) {
        Method method;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas, z4);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i5 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (z4) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    kotlin.jvm.internal.l0.m(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z4 && (method = inorderBarrierMethod) != null) {
            kotlin.jvm.internal.l0.m(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
