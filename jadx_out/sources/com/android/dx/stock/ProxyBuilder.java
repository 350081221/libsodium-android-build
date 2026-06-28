package com.android.dx.stock;

import a1.i;
import com.android.dx.Code;
import com.android.dx.Comparison;
import com.android.dx.DexMaker;
import com.android.dx.Label;
import com.android.dx.Local;
import com.android.dx.MethodId;
import com.android.dx.TypeId;
import external.org.apache.commons.lang3.d;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ProxyBuilder<T> {
    private static final String FIELD_NAME_HANDLER = "$__handler";
    private static final String FIELD_NAME_METHODS = "$__methodArray";
    private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_BOXED;
    private static final Map<Class<?>, MethodId<?, ?>> PRIMITIVE_TO_UNBOX_METHOD;
    private static final Map<TypeId<?>, MethodId<?, ?>> PRIMITIVE_TYPE_TO_UNBOX_METHOD;
    public static final int VERSION = 1;
    private static final Map<ProxiedClass<?>, Class<?>> generatedProxyClasses = Collections.synchronizedMap(new HashMap());
    private final Class<T> baseClass;
    private File dexCache;
    private InvocationHandler handler;
    private boolean markTrusted;
    private Method[] methods;
    private boolean sharedClassLoader;
    private ClassLoader parentClassLoader = ProxyBuilder.class.getClassLoader();
    private Class<?>[] constructorArgTypes = new Class[0];
    private Object[] constructorArgValues = new Object[0];
    private List<Class<?>> interfaces = new ArrayList();

    /* loaded from: classes2.dex */
    public static class MethodSetEntry {
        public final String name;
        public final Method originalMethod;
        public final Class<?>[] paramTypes;
        public final Class<?> returnType;

        public MethodSetEntry(Method method) {
            this.originalMethod = method;
            this.name = method.getName();
            this.paramTypes = method.getParameterTypes();
            this.returnType = method.getReturnType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MethodSetEntry)) {
                return false;
            }
            MethodSetEntry methodSetEntry = (MethodSetEntry) obj;
            if (!this.name.equals(methodSetEntry.name) || !this.returnType.equals(methodSetEntry.returnType) || !Arrays.equals(this.paramTypes, methodSetEntry.paramTypes)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = 527 + this.name.hashCode() + 17;
            int hashCode2 = hashCode + (hashCode * 31) + this.returnType.hashCode();
            return hashCode2 + (hashCode2 * 31) + Arrays.hashCode(this.paramTypes);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class ProxiedClass<U> {
        final Class<U> clazz;
        final List<Class<?>> interfaces;
        final ClassLoader requestedClassloader;
        final boolean sharedClassLoader;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProxiedClass proxiedClass = (ProxiedClass) obj;
            if (this.clazz == proxiedClass.clazz && this.interfaces.equals(proxiedClass.interfaces) && this.requestedClassloader == proxiedClass.requestedClassloader && this.sharedClassLoader == proxiedClass.sharedClassLoader) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.clazz.hashCode() + this.interfaces.hashCode() + this.requestedClassloader.hashCode() + (this.sharedClassLoader ? 1 : 0);
        }

        private ProxiedClass(Class<U> cls, List<Class<?>> list, ClassLoader classLoader, boolean z4) {
            this.clazz = cls;
            this.interfaces = new ArrayList(list);
            this.requestedClassloader = classLoader;
            this.sharedClassLoader = z4;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        PRIMITIVE_TO_BOXED = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Character.TYPE, Character.class);
        PRIMITIVE_TYPE_TO_UNBOX_METHOD = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            TypeId<?> typeId = TypeId.get((Class) entry.getKey());
            TypeId typeId2 = TypeId.get((Class) entry.getValue());
            PRIMITIVE_TYPE_TO_UNBOX_METHOD.put(typeId, typeId2.getMethod(typeId2, "valueOf", typeId));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Boolean.TYPE, TypeId.get(Boolean.class).getMethod(TypeId.BOOLEAN, "booleanValue", new TypeId[0]));
        hashMap2.put(Integer.TYPE, TypeId.get(Integer.class).getMethod(TypeId.INT, "intValue", new TypeId[0]));
        hashMap2.put(Byte.TYPE, TypeId.get(Byte.class).getMethod(TypeId.BYTE, "byteValue", new TypeId[0]));
        hashMap2.put(Long.TYPE, TypeId.get(Long.class).getMethod(TypeId.LONG, "longValue", new TypeId[0]));
        hashMap2.put(Short.TYPE, TypeId.get(Short.class).getMethod(TypeId.SHORT, "shortValue", new TypeId[0]));
        hashMap2.put(Float.TYPE, TypeId.get(Float.class).getMethod(TypeId.FLOAT, "floatValue", new TypeId[0]));
        hashMap2.put(Double.TYPE, TypeId.get(Double.class).getMethod(TypeId.DOUBLE, "doubleValue", new TypeId[0]));
        hashMap2.put(Character.TYPE, TypeId.get(Character.class).getMethod(TypeId.CHAR, "charValue", new TypeId[0]));
        PRIMITIVE_TO_UNBOX_METHOD = hashMap2;
    }

    private ProxyBuilder(Class<T> cls) {
        this.baseClass = cls;
    }

    private static Local<?> boxIfRequired(Code code, Local<?> local, Local<Object> local2) {
        MethodId<?, ?> methodId = PRIMITIVE_TYPE_TO_UNBOX_METHOD.get(local.getType());
        if (methodId == null) {
            return local;
        }
        code.invokeStatic(methodId, local2, local);
        return local2;
    }

    public static Object callSuper(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return obj.getClass().getMethod(superMethodName(method), method.getParameterTypes()).invoke(obj, objArr);
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static void check(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    private static TypeId<?>[] classArrayToTypeArray(Class<?>[] clsArr) {
        TypeId<?>[] typeIdArr = new TypeId[clsArr.length];
        for (int i5 = 0; i5 < clsArr.length; i5++) {
            typeIdArr[i5] = TypeId.get(clsArr[i5]);
        }
        return typeIdArr;
    }

    public static <T> ProxyBuilder<T> forClass(Class<T> cls) {
        return new ProxyBuilder<>(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T, G extends T> void generateCodeForAllMethods(DexMaker dexMaker, TypeId<G> typeId, Method[] methodArr, TypeId<T> typeId2) {
        Local local;
        Object obj;
        Class<?>[] clsArr;
        Local newLocal;
        Local newLocal2;
        Local local2;
        Local[] localArr;
        TypeId<T> typeId3;
        MethodId methodId;
        DexMaker dexMaker2 = dexMaker;
        TypeId<G> typeId4 = typeId;
        Method[] methodArr2 = methodArr;
        TypeId<V> typeId5 = TypeId.get(InvocationHandler.class);
        TypeId<V> typeId6 = TypeId.get(Method[].class);
        Object field = typeId4.getField(typeId5, FIELD_NAME_HANDLER);
        Object field2 = typeId4.getField(typeId6, FIELD_NAME_METHODS);
        TypeId typeId7 = TypeId.get(Method.class);
        TypeId typeId8 = TypeId.get(Object[].class);
        TypeId<Object> typeId9 = TypeId.OBJECT;
        MethodId method = typeId5.getMethod(typeId9, "invoke", typeId9, typeId7, typeId8);
        int i5 = 0;
        Object obj2 = typeId5;
        Object obj3 = typeId6;
        while (i5 < methodArr2.length) {
            Method method2 = methodArr2[i5];
            String name = method2.getName();
            Class<?>[] parameterTypes = method2.getParameterTypes();
            int length = parameterTypes.length;
            TypeId<?>[] typeIdArr = new TypeId[length];
            for (int i6 = 0; i6 < length; i6++) {
                typeIdArr[i6] = TypeId.get(parameterTypes[i6]);
            }
            Class<?> returnType = method2.getReturnType();
            MethodId methodId2 = method;
            TypeId<R> typeId10 = TypeId.get(returnType);
            Object obj4 = field;
            MethodId<?, ?> method3 = typeId4.getMethod(typeId10, name, typeIdArr);
            TypeId<T> typeId11 = TypeId.get(AbstractMethodError.class);
            Object obj5 = field2;
            Code declare = dexMaker2.declare(method3, 1);
            Local local3 = declare.getThis(typeId4);
            Local newLocal3 = declare.newLocal(obj2);
            TypeId<Object> typeId12 = TypeId.OBJECT;
            Local newLocal4 = declare.newLocal(typeId12);
            TypeId<Integer> typeId13 = TypeId.INT;
            Local newLocal5 = declare.newLocal(typeId13);
            Local newLocal6 = declare.newLocal(typeId8);
            TypeId typeId14 = typeId8;
            Local newLocal7 = declare.newLocal(typeId13);
            Local newLocal8 = declare.newLocal(typeId12);
            Local newLocal9 = declare.newLocal(typeId10);
            Local newLocal10 = declare.newLocal(obj3);
            Object obj6 = obj3;
            Local newLocal11 = declare.newLocal(typeId7);
            Local newLocal12 = declare.newLocal(typeId13);
            TypeId typeId15 = typeId7;
            Class<?> cls = PRIMITIVE_TO_BOXED.get(returnType);
            if (cls != null) {
                local = declare.newLocal(TypeId.get(cls));
            } else {
                local = null;
            }
            Local newLocal13 = declare.newLocal(obj2);
            Object obj7 = obj2;
            if ((method2.getModifiers() & 1024) == 0) {
                Local[] localArr2 = new Local[parameterTypes.length];
                Local newLocal14 = declare.newLocal(typeId10);
                MethodId method4 = typeId2.getMethod(typeId10, name, typeIdArr);
                obj = typeId10;
                local2 = newLocal14;
                newLocal = null;
                typeId3 = typeId11;
                methodId = method4;
                localArr = localArr2;
                clsArr = parameterTypes;
                newLocal2 = null;
            } else {
                obj = typeId10;
                clsArr = parameterTypes;
                newLocal = declare.newLocal(TypeId.STRING);
                newLocal2 = declare.newLocal(typeId11);
                local2 = null;
                localArr = null;
                typeId3 = typeId11;
                methodId = null;
            }
            declare.loadConstant(newLocal12, Integer.valueOf(i5));
            declare.sget(obj5, newLocal10);
            declare.aget(newLocal11, newLocal10, newLocal12);
            declare.loadConstant(newLocal7, Integer.valueOf(length));
            declare.newArray(newLocal6, newLocal7);
            declare.iget(obj4, newLocal3, local3);
            declare.loadConstant(newLocal13, null);
            Label label = new Label();
            declare.compare(Comparison.EQ, label, newLocal13, newLocal3);
            int i7 = length;
            int i8 = 0;
            while (i8 < i7) {
                declare.loadConstant(newLocal5, Integer.valueOf(i8));
                declare.aput(newLocal6, newLocal5, boxIfRequired(declare, declare.getParameter(i8, typeIdArr[i8]), newLocal8));
                i8++;
                i7 = i7;
                i5 = i5;
                newLocal2 = newLocal2;
            }
            int i9 = i5;
            Local local4 = newLocal2;
            declare.invokeInterface(methodId2, newLocal4, newLocal3, local3, newLocal11, newLocal6);
            generateCodeForReturnStatement(declare, returnType, newLocal4, newLocal9, local);
            declare.mark(label);
            if ((method2.getModifiers() & 1024) == 0) {
                for (int i10 = 0; i10 < localArr.length; i10++) {
                    localArr[i10] = declare.getParameter(i10, typeIdArr[i10]);
                }
                if (Void.TYPE.equals(returnType)) {
                    declare.invokeSuper(methodId, null, local3, localArr);
                    declare.returnVoid();
                } else {
                    invokeSuper(methodId, declare, local3, localArr, local2);
                    declare.returnValue(local2);
                }
            } else {
                throwAbstractMethodError(declare, method2, newLocal, local4);
            }
            typeId4 = typeId;
            TypeId<R> typeId16 = obj;
            Code declare2 = dexMaker.declare(typeId4.getMethod(typeId16, superMethodName(method2), typeIdArr), 1);
            if ((method2.getModifiers() & 1024) == 0) {
                Local<T> local5 = declare2.getThis(typeId4);
                int length2 = clsArr.length;
                Local<?>[] localArr3 = new Local[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    localArr3[i11] = declare2.getParameter(i11, typeIdArr[i11]);
                }
                if (Void.TYPE.equals(returnType)) {
                    declare2.invokeSuper(methodId, null, local5, localArr3);
                    declare2.returnVoid();
                } else {
                    Local<T> newLocal15 = declare2.newLocal(typeId16);
                    invokeSuper(methodId, declare2, local5, localArr3, newLocal15);
                    declare2.returnValue(newLocal15);
                }
            } else {
                throwAbstractMethodError(declare2, method2, declare2.newLocal(TypeId.STRING), declare2.newLocal(typeId3));
            }
            methodArr2 = methodArr;
            method = methodId2;
            field = obj4;
            field2 = obj5;
            typeId8 = typeId14;
            obj3 = obj6;
            obj2 = obj7;
            i5 = i9 + 1;
            dexMaker2 = dexMaker;
            typeId7 = typeId15;
        }
    }

    private static void generateCodeForReturnStatement(Code code, Class cls, Local local, Local local2, Local local3) {
        if (PRIMITIVE_TO_UNBOX_METHOD.containsKey(cls)) {
            code.cast(local3, local);
            code.invokeVirtual(getUnboxMethodForPrimitive(cls), local2, local3, new Local[0]);
            code.returnValue(local2);
        } else if (Void.TYPE.equals(cls)) {
            code.returnVoid();
        } else {
            code.cast(local2, local);
            code.returnValue(local2);
        }
    }

    private static <T, G extends T> void generateConstructorsAndFields(DexMaker dexMaker, TypeId<G> typeId, TypeId<T> typeId2, Class<T> cls) {
        TypeId<V> typeId3 = TypeId.get(InvocationHandler.class);
        TypeId<V> typeId4 = TypeId.get(Method[].class);
        dexMaker.declare(typeId.getField(typeId3, FIELD_NAME_HANDLER), 2, null);
        dexMaker.declare(typeId.getField(typeId4, FIELD_NAME_METHODS), 10, null);
        for (Constructor constructor : getConstructorsToOverwrite(cls)) {
            if (constructor.getModifiers() != 16) {
                TypeId<?>[] classArrayToTypeArray = classArrayToTypeArray(constructor.getParameterTypes());
                Code declare = dexMaker.declare(typeId.getConstructor(classArrayToTypeArray), 1);
                Local<T> local = declare.getThis(typeId);
                int length = classArrayToTypeArray.length;
                Local<?>[] localArr = new Local[length];
                for (int i5 = 0; i5 < length; i5++) {
                    localArr[i5] = declare.getParameter(i5, classArrayToTypeArray[i5]);
                }
                declare.invokeDirect(typeId2.getConstructor(classArrayToTypeArray), null, local, localArr);
                declare.returnVoid();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> Constructor<T>[] getConstructorsToOverwrite(Class<T> cls) {
        return (Constructor<T>[]) cls.getDeclaredConstructors();
    }

    private TypeId<?>[] getInterfacesAsTypeIds() {
        TypeId<?>[] typeIdArr = new TypeId[this.interfaces.size()];
        Iterator<Class<?>> it = this.interfaces.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            typeIdArr[i5] = TypeId.get(it.next());
            i5++;
        }
        return typeIdArr;
    }

    public static InvocationHandler getInvocationHandler(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(FIELD_NAME_HANDLER);
            declaredField.setAccessible(true);
            return (InvocationHandler) declaredField.get(obj);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (NoSuchFieldException e6) {
            throw new IllegalArgumentException("Not a valid proxy instance", e6);
        }
    }

    private static <T> String getMethodNameForProxyOf(Class<T> cls, List<Class<?>> list) {
        return cls.getName().replace(".", "/") + "_" + Integer.toHexString(list.hashCode()) + "_Proxy";
    }

    private void getMethodsToProxy(Set<MethodSetEntry> set, Set<MethodSetEntry> set2, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 16) != 0) {
                MethodSetEntry methodSetEntry = new MethodSetEntry(method);
                set2.add(methodSetEntry);
                set.remove(methodSetEntry);
            } else if ((method.getModifiers() & 8) == 0 && ((Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers()) || (this.sharedClassLoader && !Modifier.isPrivate(method.getModifiers()))) && (!method.getName().equals("finalize") || method.getParameterTypes().length != 0))) {
                MethodSetEntry methodSetEntry2 = new MethodSetEntry(method);
                if (!set2.contains(methodSetEntry2)) {
                    set.add(methodSetEntry2);
                }
            }
        }
        if (cls.isInterface()) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                getMethodsToProxy(set, set2, cls2);
            }
        }
    }

    private Method[] getMethodsToProxyRecursive() {
        int i5;
        Set<MethodSetEntry> hashSet = new HashSet<>();
        Set<MethodSetEntry> hashSet2 = new HashSet<>();
        for (Class<T> cls = this.baseClass; cls != null; cls = cls.getSuperclass()) {
            getMethodsToProxy(hashSet, hashSet2, cls);
        }
        Class<T> cls2 = this.baseClass;
        while (true) {
            i5 = 0;
            if (cls2 == null) {
                break;
            }
            Class<?>[] interfaces = cls2.getInterfaces();
            int length = interfaces.length;
            while (i5 < length) {
                getMethodsToProxy(hashSet, hashSet2, interfaces[i5]);
                i5++;
            }
            cls2 = cls2.getSuperclass();
        }
        Iterator<Class<?>> it = this.interfaces.iterator();
        while (it.hasNext()) {
            getMethodsToProxy(hashSet, hashSet2, it.next());
        }
        Method[] methodArr = new Method[hashSet.size()];
        Iterator<MethodSetEntry> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            methodArr[i5] = it2.next().originalMethod;
            i5++;
        }
        return methodArr;
    }

    private static MethodId<?, ?> getUnboxMethodForPrimitive(Class<?> cls) {
        return PRIMITIVE_TO_UNBOX_METHOD.get(cls);
    }

    private static void invokeSuper(MethodId methodId, Code code, Local local, Local[] localArr, Local local2) {
        code.invokeSuper(methodId, local2, local, localArr);
    }

    public static boolean isProxyClass(Class<?> cls) {
        try {
            cls.getDeclaredField(FIELD_NAME_HANDLER);
            return true;
        } catch (NoSuchFieldException unused) {
            return false;
        }
    }

    private static RuntimeException launderCause(InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (!(cause instanceof Error)) {
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new UndeclaredThrowableException(cause);
        }
        throw ((Error) cause);
    }

    private Class<? extends T> loadClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        return (Class<? extends T>) classLoader.loadClass(str);
    }

    public static void setInvocationHandler(Object obj, InvocationHandler invocationHandler) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(FIELD_NAME_HANDLER);
            declaredField.setAccessible(true);
            declaredField.set(obj, invocationHandler);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (NoSuchFieldException e6) {
            throw new IllegalArgumentException("Not a valid proxy instance", e6);
        }
    }

    private static void setMethodsStaticField(Class<?> cls, Method[] methodArr) {
        try {
            Field declaredField = cls.getDeclaredField(FIELD_NAME_METHODS);
            declaredField.setAccessible(true);
            declaredField.set(null, methodArr);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (NoSuchFieldException e6) {
            throw new AssertionError(e6);
        }
    }

    private static String superMethodName(Method method) {
        return "super$" + method.getName() + "$" + method.getReturnType().getName().replace(d.f15957a, '_').replace('[', '_').replace(';', '_');
    }

    private static void throwAbstractMethodError(Code code, Method method, Local<String> local, Local<AbstractMethodError> local2) {
        MethodId<T, Void> constructor = TypeId.get(AbstractMethodError.class).getConstructor(TypeId.STRING);
        code.loadConstant(local, "'" + method + "' cannot be called");
        code.newInstance(local2, constructor, local);
        code.throwValue(local2);
    }

    public T build() throws IOException {
        boolean z4;
        boolean z5 = true;
        if (this.handler != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        check(z4, "handler == null");
        if (this.constructorArgTypes.length != this.constructorArgValues.length) {
            z5 = false;
        }
        check(z5, "constructorArgValues.length != constructorArgTypes.length");
        try {
            try {
                T newInstance = buildProxyClass().getConstructor(this.constructorArgTypes).newInstance(this.constructorArgValues);
                setInvocationHandler(newInstance, this.handler);
                return newInstance;
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InstantiationException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                throw launderCause(e7);
            }
        } catch (NoSuchMethodException unused) {
            throw new IllegalArgumentException("No constructor for " + this.baseClass.getName() + " with parameter types " + Arrays.toString(this.constructorArgTypes));
        }
    }

    public Class<? extends T> buildProxyClass() throws IOException {
        ClassLoader classLoader;
        ClassLoader generateAndLoad;
        if (this.sharedClassLoader) {
            classLoader = this.baseClass.getClassLoader();
        } else {
            classLoader = this.parentClassLoader;
        }
        ProxiedClass<?> proxiedClass = new ProxiedClass<>(this.baseClass, this.interfaces, classLoader, this.sharedClassLoader);
        Map<ProxiedClass<?>, Class<?>> map = generatedProxyClasses;
        Class<? extends T> cls = (Class) map.get(proxiedClass);
        if (cls != null) {
            return cls;
        }
        DexMaker dexMaker = new DexMaker();
        String methodNameForProxyOf = getMethodNameForProxyOf(this.baseClass, this.interfaces);
        TypeId<?> typeId = TypeId.get("L" + methodNameForProxyOf + i.f136b);
        TypeId<?> typeId2 = TypeId.get(this.baseClass);
        generateConstructorsAndFields(dexMaker, typeId, typeId2, this.baseClass);
        Method[] methodArr = this.methods;
        if (methodArr == null) {
            methodArr = getMethodsToProxyRecursive();
        }
        Arrays.sort(methodArr, new Comparator<Method>() { // from class: com.android.dx.stock.ProxyBuilder.1
            @Override // java.util.Comparator
            public int compare(Method method, Method method2) {
                return (method.getDeclaringClass() + method.getName() + Arrays.toString(method.getParameterTypes()) + method.getReturnType()).compareTo(method2.getDeclaringClass() + method2.getName() + Arrays.toString(method2.getParameterTypes()) + method2.getReturnType());
            }
        });
        generateCodeForAllMethods(dexMaker, typeId, methodArr, typeId2);
        dexMaker.declare(typeId, methodNameForProxyOf + ".generated", 1, typeId2, getInterfacesAsTypeIds());
        if (this.sharedClassLoader) {
            dexMaker.setSharedClassLoader(classLoader);
        }
        if (this.markTrusted) {
            dexMaker.markAsTrusted();
        }
        if (this.sharedClassLoader) {
            generateAndLoad = dexMaker.generateAndLoad(null, this.dexCache);
        } else {
            generateAndLoad = dexMaker.generateAndLoad(this.parentClassLoader, this.dexCache);
        }
        try {
            Class<? extends T> loadClass = loadClass(generateAndLoad, methodNameForProxyOf);
            setMethodsStaticField(loadClass, methodArr);
            map.put(proxiedClass, loadClass);
            return loadClass;
        } catch (ClassNotFoundException e5) {
            throw new AssertionError(e5);
        } catch (IllegalAccessError e6) {
            throw new UnsupportedOperationException("cannot proxy inaccessible class " + this.baseClass, e6);
        }
    }

    public ProxyBuilder<T> constructorArgTypes(Class<?>... clsArr) {
        this.constructorArgTypes = clsArr;
        return this;
    }

    public ProxyBuilder<T> constructorArgValues(Object... objArr) {
        this.constructorArgValues = objArr;
        return this;
    }

    public ProxyBuilder<T> dexCache(File file) {
        File file2 = new File(file, "v" + Integer.toString(1));
        this.dexCache = file2;
        file2.mkdir();
        return this;
    }

    public ProxyBuilder<T> handler(InvocationHandler invocationHandler) {
        this.handler = invocationHandler;
        return this;
    }

    public ProxyBuilder<T> implementing(Class<?>... clsArr) {
        List<Class<?>> list = this.interfaces;
        for (Class<?> cls : clsArr) {
            if (cls.isInterface()) {
                if (!list.contains(cls)) {
                    list.add(cls);
                }
            } else {
                throw new IllegalArgumentException("Not an interface: " + cls.getName());
            }
        }
        return this;
    }

    public ProxyBuilder<T> markTrusted() {
        this.markTrusted = true;
        return this;
    }

    public ProxyBuilder<T> onlyMethods(Method[] methodArr) {
        this.methods = methodArr;
        return this;
    }

    public ProxyBuilder<T> parentClassLoader(ClassLoader classLoader) {
        this.parentClassLoader = classLoader;
        return this;
    }

    public ProxyBuilder<T> withSharedClassLoader() {
        this.sharedClassLoader = true;
        return this;
    }
}
