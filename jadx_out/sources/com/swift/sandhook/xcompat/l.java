package com.swift.sandhook.xcompat;

import android.text.TextUtils;
import com.android.dx.Code;
import com.android.dx.DexMaker;
import com.android.dx.FieldId;
import com.android.dx.Local;
import com.android.dx.MethodId;
import com.android.dx.TypeId;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import com.swift.sandhook.wrapper.HookWrapper;
import dalvik.system.InMemoryDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.Map;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public class l implements j {
    private static final String CLASS_DESC_PREFIX = "L";
    private static final String CLASS_NAME_PREFIX = "SandHookerNew";
    private static final String FIELD_NAME_BACKUP_METHOD = "backupMethod";
    private static final String FIELD_NAME_HOOK_INFO = "additionalHookInfo";
    private static final String FIELD_NAME_METHOD = "method";
    public static final String METHOD_NAME_BACKUP = "backup";
    public static final String METHOD_NAME_HOOK = "hook";
    private Class<?>[] mActualParameterTypes;
    private ClassLoader mAppClassLoader;
    private Method mBackupMethod;
    private FieldId<?, Method> mBackupMethodFieldId;
    private MethodId<?, ?> mBackupMethodId;
    private String mDexDirPath;
    private DexMaker mDexMaker;
    private boolean mHasThrowable;
    private Class<?> mHookClass;
    private j.b mHookInfo;
    private FieldId<?, j.b> mHookInfoFieldId;
    private Method mHookMethod;
    private MethodId<?, ?> mHookMethodId;
    private TypeId<?> mHookerTypeId;
    private boolean mIsStatic;
    private Member mMember;
    private FieldId<?, Member> mMethodFieldId;
    private TypeId<?>[] mParameterTypeIds;
    private Class<?> mReturnType;
    private TypeId<?> mReturnTypeId;
    private MethodId<?, ?> mSandHookBridgeMethodId;
    public static final TypeId<Object[]> objArrayTypeId = TypeId.get(Object[].class);
    private static final TypeId<Member> memberTypeId = TypeId.get(Member.class);
    private static final TypeId<Method> methodTypeId = TypeId.get(Method.class);
    private static final TypeId<j.b> hookInfoTypeId = TypeId.get(j.b.class);

    private Local[] createParameterLocals(Code code) {
        Local[] localArr = new Local[this.mParameterTypeIds.length];
        int i5 = 0;
        while (true) {
            TypeId<?>[] typeIdArr = this.mParameterTypeIds;
            if (i5 < typeIdArr.length) {
                localArr[i5] = code.getParameter(i5, typeIdArr[i5]);
                i5++;
            } else {
                return localArr;
            }
        }
    }

    private HookWrapper.HookEntity doMake(String str, String str2) throws Exception {
        ClassLoader classLoader;
        TypeId<?> typeId = TypeId.get(CLASS_DESC_PREFIX + str + a1.i.f136b);
        this.mHookerTypeId = typeId;
        this.mDexMaker.declare(typeId, str + ".generated", 1, TypeId.OBJECT, new TypeId[0]);
        generateFields();
        generateHookMethod();
        generateBackupMethod();
        if (TextUtils.isEmpty(this.mDexDirPath)) {
            if (SandHookConfig.SDK_INT >= 26) {
                classLoader = new InMemoryDexClassLoader(ByteBuffer.wrap(this.mDexMaker.generate()), this.mAppClassLoader);
            } else {
                throw new IllegalArgumentException("dexDirPath should not be empty!!!");
            }
        } else {
            try {
                classLoader = this.mDexMaker.generateAndLoad(this.mAppClassLoader, new File(this.mDexDirPath), str2);
            } catch (IOException unused) {
                if (SandHookConfig.SDK_INT >= 26) {
                    classLoader = new InMemoryDexClassLoader(ByteBuffer.wrap(this.mDexMaker.generate()), this.mAppClassLoader);
                } else {
                    classLoader = null;
                }
            }
        }
        if (classLoader == null) {
            return null;
        }
        return loadHookerClass(classLoader, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generateBackupMethod() {
        MethodId method = this.mHookerTypeId.getMethod(TypeId.VOID, "backup", new TypeId[0]);
        this.mBackupMethodId = method;
        this.mDexMaker.declare(method, 9).returnVoid();
    }

    private void generateFields() {
        this.mHookInfoFieldId = this.mHookerTypeId.getField(hookInfoTypeId, FIELD_NAME_HOOK_INFO);
        this.mMethodFieldId = this.mHookerTypeId.getField(memberTypeId, "method");
        this.mBackupMethodFieldId = this.mHookerTypeId.getField(methodTypeId, FIELD_NAME_BACKUP_METHOD);
        this.mDexMaker.declare(this.mHookInfoFieldId, 8, null);
        this.mDexMaker.declare(this.mMethodFieldId, 8, null);
        this.mDexMaker.declare(this.mBackupMethodFieldId, 8, null);
    }

    private void generateHookMethod() {
        int i5;
        this.mHookMethodId = this.mHookerTypeId.getMethod(this.mReturnTypeId, "hook", this.mParameterTypeIds);
        TypeId typeId = TypeId.get(e.class);
        TypeId typeId2 = TypeId.get(Object.class);
        TypeId<Member> typeId3 = memberTypeId;
        TypeId<Method> typeId4 = methodTypeId;
        TypeId<j.b> typeId5 = hookInfoTypeId;
        this.mSandHookBridgeMethodId = typeId.getMethod(typeId2, "hookBridge", typeId3, typeId4, typeId5, TypeId.get(Object.class), TypeId.get(Object[].class));
        Code declare = this.mDexMaker.declare(this.mHookMethodId, 9);
        Local<?> newLocal = declare.newLocal(typeId3);
        Local<?> newLocal2 = declare.newLocal(typeId4);
        Local<?> newLocal3 = declare.newLocal(typeId5);
        TypeId<Object> typeId6 = TypeId.OBJECT;
        Local<?> newLocal4 = declare.newLocal(typeId6);
        Local<?> newLocal5 = declare.newLocal(objArrayTypeId);
        TypeId<Integer> typeId7 = TypeId.INT;
        Local<Integer> newLocal6 = declare.newLocal(typeId7);
        Local<Integer> newLocal7 = declare.newLocal(typeId7);
        Local<?> newLocal8 = declare.newLocal(typeId6);
        Local[] createParameterLocals = createParameterLocals(declare);
        Map<TypeId, Local> createResultLocals = o.createResultLocals(declare);
        declare.loadConstant(newLocal5, null);
        declare.loadConstant(newLocal7, 0);
        declare.sget(this.mMethodFieldId, newLocal);
        declare.sget(this.mBackupMethodFieldId, newLocal2);
        declare.sget(this.mHookInfoFieldId, newLocal3);
        int length = this.mParameterTypeIds.length;
        if (this.mIsStatic) {
            declare.loadConstant(newLocal4, null);
            i5 = 0;
        } else {
            declare.move(newLocal4, createParameterLocals[0]);
            i5 = 1;
        }
        declare.loadConstant(newLocal6, Integer.valueOf(length - i5));
        declare.newArray(newLocal5, newLocal6);
        for (int i6 = i5; i6 < length; i6++) {
            o.autoBoxIfNecessary(declare, newLocal8, createParameterLocals[i6]);
            declare.loadConstant(newLocal7, Integer.valueOf(i6 - i5));
            declare.aput(newLocal5, newLocal7, newLocal8);
        }
        if (this.mReturnTypeId.equals(TypeId.VOID)) {
            declare.invokeStatic(this.mSandHookBridgeMethodId, null, newLocal, newLocal2, newLocal3, newLocal4, newLocal5);
            declare.returnVoid();
            return;
        }
        declare.invokeStatic(this.mSandHookBridgeMethodId, newLocal8, newLocal, newLocal2, newLocal3, newLocal4, newLocal5);
        Local local = createResultLocals.get(o.getObjTypeIdIfPrimitive(this.mReturnTypeId));
        declare.cast(local, newLocal8);
        Local local2 = createResultLocals.get(this.mReturnTypeId);
        o.autoUnboxIfNecessary(declare, local2, local, createResultLocals, true);
        declare.returnValue(local2);
    }

    private String getClassName(Member member) {
        return "SandHookerNew_" + o.MD5(member.toString());
    }

    private static TypeId<?>[] getParameterTypeIds(Class<?>[] clsArr, boolean z4) {
        int i5;
        int length = clsArr.length;
        if (!z4) {
            length++;
        }
        TypeId<?>[] typeIdArr = new TypeId[length];
        if (!z4) {
            typeIdArr[0] = TypeId.OBJECT;
            i5 = 1;
        } else {
            i5 = 0;
        }
        for (int i6 = 0; i6 < clsArr.length; i6++) {
            typeIdArr[i6 + i5] = TypeId.get(clsArr[i6]);
        }
        return typeIdArr;
    }

    private static Class<?>[] getParameterTypes(Class<?>[] clsArr, boolean z4) {
        if (z4) {
            return clsArr;
        }
        Class<?>[] clsArr2 = new Class[clsArr.length + 1];
        clsArr2[0] = Object.class;
        System.arraycopy(clsArr, 0, clsArr2, 1, clsArr.length);
        return clsArr2;
    }

    private HookWrapper.HookEntity loadHookerClass(ClassLoader classLoader, String str) throws Exception {
        Class<?> loadClass = classLoader.loadClass(str);
        this.mHookClass = loadClass;
        this.mHookMethod = loadClass.getMethod("hook", this.mActualParameterTypes);
        this.mBackupMethod = this.mHookClass.getMethod("backup", new Class[0]);
        setup(this.mHookClass);
        return new HookWrapper.HookEntity(this.mMember, this.mHookMethod, this.mBackupMethod, false);
    }

    private void setup(Class cls) {
        u.dont.know.what.i.am.k.S0(cls, "method", this.mMember);
        u.dont.know.what.i.am.k.S0(cls, FIELD_NAME_BACKUP_METHOD, this.mBackupMethod);
        u.dont.know.what.i.am.k.S0(cls, FIELD_NAME_HOOK_INFO, this.mHookInfo);
    }

    @Override // com.swift.sandhook.xcompat.j
    public Method getBackupMethod() {
        return this.mBackupMethod;
    }

    @Override // com.swift.sandhook.xcompat.j
    public Method getCallBackupMethod() {
        return this.mBackupMethod;
    }

    public Class getHookClass() {
        return this.mHookClass;
    }

    @Override // com.swift.sandhook.xcompat.j
    public Method getHookMethod() {
        return this.mHookMethod;
    }

    @Override // com.swift.sandhook.xcompat.j
    public void start(Member member, j.b bVar, ClassLoader classLoader, String str) throws Exception {
        boolean z4 = true;
        if (member instanceof Method) {
            Method method = (Method) member;
            this.mIsStatic = Modifier.isStatic(method.getModifiers());
            Class<?> returnType = method.getReturnType();
            this.mReturnType = returnType;
            if (!returnType.equals(Void.class) && !this.mReturnType.equals(Void.TYPE) && !this.mReturnType.isPrimitive()) {
                this.mReturnType = Object.class;
                this.mReturnTypeId = TypeId.OBJECT;
            } else {
                this.mReturnTypeId = TypeId.get(this.mReturnType);
            }
            this.mParameterTypeIds = getParameterTypeIds(method.getParameterTypes(), this.mIsStatic);
            this.mActualParameterTypes = getParameterTypes(method.getParameterTypes(), this.mIsStatic);
            if (method.getExceptionTypes().length <= 0) {
                z4 = false;
            }
            this.mHasThrowable = z4;
        } else if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            this.mIsStatic = false;
            this.mReturnType = Void.TYPE;
            this.mReturnTypeId = TypeId.VOID;
            this.mParameterTypeIds = getParameterTypeIds(constructor.getParameterTypes(), this.mIsStatic);
            this.mActualParameterTypes = getParameterTypes(constructor.getParameterTypes(), this.mIsStatic);
            if (constructor.getExceptionTypes().length <= 0) {
                z4 = false;
            }
            this.mHasThrowable = z4;
        } else {
            if (!member.getDeclaringClass().isInterface()) {
                if (Modifier.isAbstract(member.getModifiers())) {
                    throw new IllegalArgumentException("Cannot hook abstract methods: " + member.toString());
                }
                throw new IllegalArgumentException("Only methods and constructors can be hooked: " + member.toString());
            }
            throw new IllegalArgumentException("Cannot hook interfaces: " + member.toString());
        }
        this.mMember = member;
        this.mHookInfo = bVar;
        this.mDexDirPath = str;
        if (classLoader != null && !classLoader.getClass().getName().equals("java.lang.BootClassLoader")) {
            this.mAppClassLoader = classLoader;
        } else {
            this.mAppClassLoader = getClass().getClassLoader();
        }
        this.mDexMaker = new DexMaker();
        String className = getClassName(this.mMember);
        String str2 = className + ".jar";
        HookWrapper.HookEntity hookEntity = null;
        try {
            ClassLoader loadClassDirect = this.mDexMaker.loadClassDirect(this.mAppClassLoader, new File(this.mDexDirPath), str2);
            if (loadClassDirect != null) {
                hookEntity = loadHookerClass(loadClassDirect, className);
            }
        } catch (Throwable unused) {
        }
        if (hookEntity == null) {
            hookEntity = doMake(className, str2);
        }
        SandHook.hook(hookEntity);
    }
}
