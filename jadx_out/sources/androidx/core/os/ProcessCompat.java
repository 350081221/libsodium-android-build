package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class ProcessCompat {

    /* loaded from: classes2.dex */
    static class Api19Impl {
        private static Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final Object sResolvedLock = new Object();

        private Api19Impl() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean isApplicationUid(int i5) {
            try {
                synchronized (sResolvedLock) {
                    if (!sResolved) {
                        sResolved = true;
                        sMethodUserHandleIsAppMethod = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                }
                Method method = sMethodUserHandleIsAppMethod;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i5));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return true;
        }
    }

    @RequiresApi(24)
    /* loaded from: classes2.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean isApplicationUid(int i5) {
            return Process.isApplicationUid(i5);
        }
    }

    private ProcessCompat() {
    }

    public static boolean isApplicationUid(int i5) {
        return Api24Impl.isApplicationUid(i5);
    }
}
