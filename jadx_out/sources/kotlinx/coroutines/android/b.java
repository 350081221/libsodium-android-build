package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.i0;
import kotlinx.coroutines.o0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/b;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/o0;", "Ljava/lang/reflect/Method;", "C0", "Lkotlin/coroutines/g;", com.umeng.analytics.pro.d.X, "", "exception", "Lkotlin/r2;", "handleException", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.a implements o0 {

    @m
    private volatile Object _preHandler;

    public b() {
        super(o0.T);
        this._preHandler = this;
    }

    private final Method C0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z4 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z4 = true;
                }
            }
            if (z4) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.o0
    public void handleException(@l kotlin.coroutines.g gVar, @l Throwable th) {
        boolean z4;
        Object obj;
        int i5 = Build.VERSION.SDK_INT;
        if (26 <= i5 && i5 < 28) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Method C0 = C0();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (C0 != null) {
                obj = C0.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
