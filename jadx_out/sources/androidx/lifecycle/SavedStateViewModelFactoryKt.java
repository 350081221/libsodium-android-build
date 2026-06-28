package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", "signature", "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class SavedStateViewModelFactoryKt {

    @l
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;

    @l
    private static final List<Class<?>> VIEWMODEL_SIGNATURE;

    static {
        List<Class<?>> L;
        List<Class<?>> k5;
        L = w.L(Application.class, SavedStateHandle.class);
        ANDROID_VIEWMODEL_SIGNATURE = L;
        k5 = v.k(SavedStateHandle.class);
        VIEWMODEL_SIGNATURE = k5;
    }

    public static final /* synthetic */ List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
        return ANDROID_VIEWMODEL_SIGNATURE;
    }

    public static final /* synthetic */ List access$getVIEWMODEL_SIGNATURE$p() {
        return VIEWMODEL_SIGNATURE;
    }

    @m
    public static final <T> Constructor<T> findMatchingConstructor(@l Class<T> modelClass, @l List<? extends Class<?>> signature) {
        List Jy;
        l0.p(modelClass, "modelClass");
        l0.p(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        l0.o(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            l0.o(parameterTypes, "constructor.parameterTypes");
            Jy = p.Jy(parameterTypes);
            if (l0.g(signature, Jy)) {
                l0.n(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == Jy.size() && Jy.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(@l Class<T> modelClass, @l Constructor<T> constructor, @l Object... params) {
        l0.p(modelClass, "modelClass");
        l0.p(constructor, "constructor");
        l0.p(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + modelClass, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e7.getCause());
        }
    }
}
