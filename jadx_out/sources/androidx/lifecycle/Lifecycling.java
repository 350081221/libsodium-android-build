package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import p4.l;
import u3.m;

@i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;

    @l
    public static final Lifecycling INSTANCE = new Lifecycling();

    @l
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    @l
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            GeneratedAdapter newInstance = constructor.newInstance(obj);
            l0.o(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> cls) {
        String fullPackage;
        boolean z4;
        boolean z5;
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            if (r02 != null) {
                fullPackage = r02.getName();
            } else {
                fullPackage = "";
            }
            l0.o(fullPackage, "fullPackage");
            if (fullPackage.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                l0.o(name, "name");
                name = name.substring(fullPackage.length() + 1);
                l0.o(name, "this as java.lang.String).substring(startIndex)");
            }
            l0.o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(name);
            if (fullPackage.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                adapterName = fullPackage + external.org.apache.commons.lang3.d.f15957a + adapterName;
            }
            Class<?> cls2 = Class.forName(adapterName);
            l0.n(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(e5);
        }
    }

    @l
    @m
    public static final String getAdapterName(@l String className) {
        String i22;
        l0.p(className, "className");
        StringBuilder sb = new StringBuilder();
        i22 = e0.i2(className, ".", "_", false, 4, null);
        sb.append(i22);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    private final int getObserverConstructorType(Class<?> cls) {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int resolveObserverCallbackType = resolveObserverCallbackType(cls);
        map.put(cls, Integer.valueOf(resolveObserverCallbackType));
        return resolveObserverCallbackType;
    }

    private final boolean isLifecycleParent(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    @l
    @m
    public static final LifecycleEventObserver lifecycleEventObserver(@l Object object) {
        l0.p(object, "object");
        boolean z4 = object instanceof LifecycleEventObserver;
        boolean z5 = object instanceof DefaultLifecycleObserver;
        if (z4 && z5) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (z5) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z4) {
            return (LifecycleEventObserver) object;
        }
        Class<?> cls = object.getClass();
        Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(cls);
            l0.m(list);
            List<Constructor<? extends GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
            }
            int size = list2.size();
            GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
            for (int i5 = 0; i5 < size; i5++) {
                generatedAdapterArr[i5] = INSTANCE.createGeneratedAdapter(list2.get(i5), object);
            }
            return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    private final int resolveObserverCallbackType(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends GeneratedAdapter>> k5;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends GeneratedAdapter> generatedConstructor = generatedConstructor(cls);
        if (generatedConstructor != null) {
            Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> map = classToAdapters;
            k5 = v.k(generatedConstructor);
            map.put(cls, k5);
            return 2;
        }
        if (ClassesInfoCache.sInstance.hasLifecycleMethods(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (isLifecycleParent(superclass)) {
            l0.o(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
            l0.m(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        l0.o(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (isLifecycleParent(intrface)) {
                l0.o(intrface, "intrface");
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(intrface);
                l0.m(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(cls, arrayList);
        return 2;
    }
}
