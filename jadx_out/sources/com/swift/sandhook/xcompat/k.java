package com.swift.sandhook.xcompat;

import android.text.TextUtils;
import com.android.dx.BinaryOp;
import com.android.dx.Code;
import com.android.dx.Comparison;
import com.android.dx.DexMaker;
import com.android.dx.FieldId;
import com.android.dx.Label;
import com.android.dx.Local;
import com.android.dx.MethodId;
import com.android.dx.TypeId;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookConfig;
import com.swift.sandhook.SandHookMethodResolver;
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
import u.dont.know.what.i.am.g;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public class k implements j {
    private static final String CALLBACK_METHOD_NAME_AFTER = "callAfterHookedMethod";
    private static final String CALLBACK_METHOD_NAME_BEFORE = "callBeforeHookedMethod";
    private static final String CLASS_DESC_PREFIX = "L";
    private static final String CLASS_NAME_PREFIX = "SandHooker";
    private static final String FIELD_NAME_BACKUP_METHOD = "backupMethod";
    private static final String FIELD_NAME_HOOK_INFO = "additionalHookInfo";
    private static final String FIELD_NAME_METHOD = "method";
    public static final String METHOD_NAME_BACKUP = "backup";
    public static final String METHOD_NAME_CALL_BACKUP = "callBackup";
    public static final String METHOD_NAME_HOOK = "hook";
    public static final String METHOD_NAME_LOG = "printMethodHookIn";
    public static final String METHOD_NAME_SETUP = "setup";
    private static final String PARAMS_FIELD_NAME_ARGS = "args";
    private static final String PARAMS_FIELD_NAME_METHOD = "method";
    private static final String PARAMS_FIELD_NAME_THIS_OBJECT = "thisObject";
    private static final MethodId<u.dont.know.what.i.am.g, Void> callAfterCallbackMethodId;
    private static final MethodId<u.dont.know.what.i.am.g, Void> callBeforeCallbackMethodId;
    private static final TypeId<u.dont.know.what.i.am.g> callbackTypeId;
    private static final TypeId<j.c> callbacksTypeId;
    private static final MethodId<g.a, Object> getResultMethodId;
    private static final MethodId<g.a, Throwable> getThrowableMethodId;
    private static final MethodId<g.a, Boolean> hasThrowableMethodId;
    private static final TypeId<j.b> hookInfoTypeId;
    private static final MethodId<u.dont.know.what.i.am.j, Void> logThrowableMethodId;
    private static final TypeId<Member> memberTypeId;
    private static final TypeId<Method> methodTypeId;
    public static final TypeId<Object[]> objArrayTypeId = TypeId.get(Object[].class);
    private static final TypeId<g.a> paramTypeId;
    private static final FieldId<g.a, Boolean> returnEarlyFieldId;
    private static final MethodId<g.a, Void> setResultMethodId;
    private static final MethodId<g.a, Void> setThrowableMethodId;
    private static final TypeId<Throwable> throwableTypeId;
    private static final TypeId<u.dont.know.what.i.am.j> xposedBridgeTypeId;
    private Class<?>[] mActualParameterTypes;
    private ClassLoader mAppClassLoader;
    private Method mBackupMethod;
    private FieldId<?, Method> mBackupMethodFieldId;
    private MethodId<?, ?> mBackupMethodId;
    private Method mCallBackupMethod;
    private MethodId<?, ?> mCallBackupMethodId;
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
    private MethodId<?, ?> mPrintLogMethodId;
    private Class<?> mReturnType;
    private TypeId<?> mReturnTypeId;
    private MethodId<?, ?> mSandHookCallOriginMethodId;

    static {
        TypeId<Throwable> typeId = TypeId.get(Throwable.class);
        throwableTypeId = typeId;
        memberTypeId = TypeId.get(Member.class);
        methodTypeId = TypeId.get(Method.class);
        TypeId<u.dont.know.what.i.am.g> typeId2 = TypeId.get(u.dont.know.what.i.am.g.class);
        callbackTypeId = typeId2;
        hookInfoTypeId = TypeId.get(j.b.class);
        callbacksTypeId = TypeId.get(j.c.class);
        TypeId<g.a> typeId3 = TypeId.get(g.a.class);
        paramTypeId = typeId3;
        TypeId typeId4 = TypeId.VOID;
        TypeId<?> typeId5 = TypeId.OBJECT;
        setResultMethodId = typeId3.getMethod(typeId4, "setResult", typeId5);
        setThrowableMethodId = typeId3.getMethod(typeId4, "setThrowable", typeId);
        getResultMethodId = typeId3.getMethod(typeId5, "getResult", new TypeId[0]);
        getThrowableMethodId = typeId3.getMethod(typeId, "getThrowable", new TypeId[0]);
        TypeId typeId6 = TypeId.BOOLEAN;
        hasThrowableMethodId = typeId3.getMethod(typeId6, "hasThrowable", new TypeId[0]);
        callAfterCallbackMethodId = typeId2.getMethod(typeId4, CALLBACK_METHOD_NAME_AFTER, typeId3);
        callBeforeCallbackMethodId = typeId2.getMethod(typeId4, CALLBACK_METHOD_NAME_BEFORE, typeId3);
        returnEarlyFieldId = typeId3.getField(typeId6, "returnEarly");
        TypeId<u.dont.know.what.i.am.j> typeId7 = TypeId.get(u.dont.know.what.i.am.j.class);
        xposedBridgeTypeId = typeId7;
        logThrowableMethodId = typeId7.getMethod(typeId4, "log", typeId);
    }

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
        generateSetupMethod();
        if (a.retryWhenCallOriginError) {
            generateBackupAndCallOriginCheckMethod();
        } else {
            generateBackupMethod();
        }
        generateCallBackupMethod();
        generateHookMethod();
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

    private void generateBackupAndCallOriginCheckMethod() {
        int i5;
        this.mBackupMethodId = this.mHookerTypeId.getMethod(this.mReturnTypeId, "backup", this.mParameterTypeIds);
        TypeId typeId = TypeId.get(i.class);
        TypeId typeId2 = TypeId.get(Object.class);
        TypeId<Member> typeId3 = memberTypeId;
        TypeId<Method> typeId4 = methodTypeId;
        this.mSandHookCallOriginMethodId = typeId.getMethod(typeId2, "callOriginError", typeId3, typeId4, TypeId.get(Object.class), TypeId.get(Object[].class));
        MethodId method = TypeId.get(n.class).getMethod(TypeId.get(Void.TYPE), "printCallOriginError", typeId4);
        Code declare = this.mDexMaker.declare(this.mBackupMethodId, 9);
        Local<?> newLocal = declare.newLocal(typeId3);
        Local<?> newLocal2 = declare.newLocal(typeId4);
        TypeId<Object> typeId5 = TypeId.OBJECT;
        Local<?> newLocal3 = declare.newLocal(typeId5);
        Local<?> newLocal4 = declare.newLocal(objArrayTypeId);
        TypeId<Integer> typeId6 = TypeId.INT;
        Local<Integer> newLocal5 = declare.newLocal(typeId6);
        Local<Integer> newLocal6 = declare.newLocal(typeId6);
        Local<?> newLocal7 = declare.newLocal(typeId5);
        Label label = new Label();
        Local[] createParameterLocals = createParameterLocals(declare);
        Map<TypeId, Local> createResultLocals = o.createResultLocals(declare);
        declare.addCatchClause(throwableTypeId, label);
        declare.sget(this.mMethodFieldId, newLocal);
        declare.invokeStatic(method, null, newLocal);
        declare.loadConstant(newLocal4, null);
        declare.loadConstant(newLocal6, 0);
        declare.sget(this.mBackupMethodFieldId, newLocal2);
        int length = this.mParameterTypeIds.length;
        if (this.mIsStatic) {
            declare.loadConstant(newLocal3, null);
            i5 = 0;
        } else {
            declare.move(newLocal3, createParameterLocals[0]);
            i5 = 1;
        }
        declare.loadConstant(newLocal5, Integer.valueOf(length - i5));
        declare.newArray(newLocal4, newLocal5);
        for (int i6 = i5; i6 < length; i6++) {
            o.autoBoxIfNecessary(declare, newLocal7, createParameterLocals[i6]);
            declare.loadConstant(newLocal6, Integer.valueOf(i6 - i5));
            declare.aput(newLocal4, newLocal6, newLocal7);
        }
        TypeId<?> typeId7 = this.mReturnTypeId;
        TypeId<Void> typeId8 = TypeId.VOID;
        if (typeId7.equals(typeId8)) {
            declare.invokeStatic(this.mSandHookCallOriginMethodId, null, newLocal, newLocal2, newLocal3, newLocal4);
            declare.returnVoid();
        } else {
            declare.invokeStatic(this.mSandHookCallOriginMethodId, newLocal7, newLocal, newLocal2, newLocal3, newLocal4);
            Local local = createResultLocals.get(o.getObjTypeIdIfPrimitive(this.mReturnTypeId));
            declare.cast(local, newLocal7);
            Local local2 = createResultLocals.get(this.mReturnTypeId);
            o.autoUnboxIfNecessary(declare, local2, local, createResultLocals, true);
            declare.returnValue(local2);
        }
        declare.mark(label);
        if (this.mReturnTypeId.equals(typeId8)) {
            declare.returnVoid();
        } else {
            declare.returnValue(createResultLocals.get(this.mReturnTypeId));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generateBackupMethod() {
        MethodId method = this.mHookerTypeId.getMethod(this.mReturnTypeId, "backup", this.mParameterTypeIds);
        this.mBackupMethodId = method;
        Code declare = this.mDexMaker.declare(method, 9);
        TypeId<Member> typeId = memberTypeId;
        Local<?> newLocal = declare.newLocal(typeId);
        Map<TypeId, Local> createResultLocals = o.createResultLocals(declare);
        MethodId method2 = TypeId.get(n.class).getMethod(TypeId.get(Void.TYPE), "printCallOriginError", typeId);
        Label label = new Label();
        declare.addCatchClause(throwableTypeId, label);
        declare.sget(this.mMethodFieldId, newLocal);
        declare.invokeStatic(method2, null, newLocal);
        declare.mark(label);
        if (this.mReturnTypeId.equals(TypeId.VOID)) {
            declare.returnVoid();
        } else {
            declare.returnValue(createResultLocals.get(this.mReturnTypeId));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void generateCallBackupMethod() {
        MethodId method = this.mHookerTypeId.getMethod(this.mReturnTypeId, METHOD_NAME_CALL_BACKUP, this.mParameterTypeIds);
        this.mCallBackupMethodId = method;
        Code declare = this.mDexMaker.declare(method, 9);
        TypeId<Member> typeId = memberTypeId;
        Local<?> newLocal = declare.newLocal(typeId);
        TypeId<Method> typeId2 = methodTypeId;
        Local<?> newLocal2 = declare.newLocal(typeId2);
        Local[] createParameterLocals = createParameterLocals(declare);
        Map<TypeId, Local> createResultLocals = o.createResultLocals(declare);
        declare.sget(this.mMethodFieldId, newLocal);
        declare.sget(this.mBackupMethodFieldId, newLocal2);
        declare.invokeStatic(TypeId.get(SandHook.class).getMethod(TypeId.get(Void.TYPE), "ensureBackupMethod", typeId, typeId2), null, newLocal, newLocal2);
        if (this.mReturnTypeId.equals(TypeId.VOID)) {
            declare.invokeStatic(this.mBackupMethodId, null, createParameterLocals);
            declare.returnVoid();
        } else {
            Local local = createResultLocals.get(this.mReturnTypeId);
            declare.invokeStatic(this.mBackupMethodId, local, createParameterLocals);
            declare.returnValue(local);
        }
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
        Local local;
        boolean z4;
        int i5;
        Map<TypeId, Local> map;
        this.mHookMethodId = this.mHookerTypeId.getMethod(this.mReturnTypeId, "hook", this.mParameterTypeIds);
        this.mPrintLogMethodId = TypeId.get(n.class).getMethod(TypeId.get(Void.TYPE), METHOD_NAME_LOG, TypeId.get(Member.class));
        Code declare = this.mDexMaker.declare(this.mHookMethodId, 9);
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        Label label9 = new Label();
        Label label10 = new Label();
        Label label11 = new Label();
        Label label12 = new Label();
        Label label13 = new Label();
        TypeId<Boolean> typeId = TypeId.BOOLEAN;
        Local<?> newLocal = declare.newLocal(typeId);
        TypeId<j.b> typeId2 = hookInfoTypeId;
        Local newLocal2 = declare.newLocal(typeId2);
        TypeId typeId3 = callbacksTypeId;
        Local newLocal3 = declare.newLocal(typeId3);
        TypeId<Object[]> typeId4 = objArrayTypeId;
        Local<?> newLocal4 = declare.newLocal(typeId4);
        TypeId<Integer> typeId5 = TypeId.INT;
        Local<Integer> newLocal5 = declare.newLocal(typeId5);
        TypeId<Object> typeId6 = TypeId.OBJECT;
        Local<?> newLocal6 = declare.newLocal(typeId6);
        Local<?> newLocal7 = declare.newLocal(callbackTypeId);
        Local<?> newLocal8 = declare.newLocal(typeId6);
        Local newLocal9 = declare.newLocal(typeId5);
        Local<?> newLocal10 = declare.newLocal(typeId6);
        TypeId<Throwable> typeId7 = throwableTypeId;
        Local<?> newLocal11 = declare.newLocal(typeId7);
        Local<?> newLocal12 = declare.newLocal(paramTypeId);
        Local<?> newLocal13 = declare.newLocal(memberTypeId);
        Local newLocal14 = declare.newLocal(typeId6);
        Local<?> newLocal15 = declare.newLocal(typeId4);
        Local<?> newLocal16 = declare.newLocal(typeId);
        Local<Integer> newLocal17 = declare.newLocal(typeId5);
        Local<Integer> newLocal18 = declare.newLocal(typeId5);
        Local<Integer> newLocal19 = declare.newLocal(typeId5);
        Local<?> newLocal20 = declare.newLocal(typeId6);
        Local<?> newLocal21 = declare.newLocal(typeId7);
        Local<?> newLocal22 = declare.newLocal(typeId);
        Local[] createParameterLocals = createParameterLocals(declare);
        Map<TypeId, Local> createResultLocals = o.createResultLocals(declare);
        declare.loadConstant(newLocal15, null);
        declare.loadConstant(newLocal18, 0);
        declare.loadConstant(newLocal9, 1);
        declare.loadConstant(newLocal5, 0);
        declare.loadConstant(newLocal10, null);
        declare.sget(this.mMethodFieldId, newLocal13);
        declare.invokeStatic(this.mPrintLogMethodId, null, newLocal13);
        declare.sget(xposedBridgeTypeId.getField(typeId, "disableHooks"), newLocal);
        declare.compareZ(Comparison.NE, label, newLocal);
        declare.sget(this.mHookInfoFieldId, newLocal2);
        declare.iget(typeId2.getField(typeId3, "callbacks"), newLocal3, newLocal2);
        int i6 = 0;
        declare.invokeVirtual(typeId3.getMethod(typeId4, "getSnapshot", new TypeId[0]), newLocal4, newLocal3, new Local[0]);
        declare.arrayLength(newLocal5, newLocal4);
        declare.compareZ(Comparison.EQ, label, newLocal5);
        int length = this.mParameterTypeIds.length;
        if (this.mIsStatic) {
            local = newLocal14;
            declare.loadConstant(local, null);
        } else {
            local = newLocal14;
            declare.move(local, createParameterLocals[0]);
            i6 = 1;
        }
        declare.loadConstant(newLocal17, Integer.valueOf(length - i6));
        declare.newArray(newLocal15, newLocal17);
        int i7 = i6;
        while (i7 < length) {
            o.autoBoxIfNecessary(declare, newLocal8, createParameterLocals[i7]);
            declare.loadConstant(newLocal18, Integer.valueOf(i7 - i6));
            declare.aput(newLocal15, newLocal18, newLocal8);
            i7++;
            length = length;
        }
        TypeId<g.a> typeId8 = paramTypeId;
        declare.newInstance(newLocal12, typeId8.getConstructor(new TypeId[0]), new Local[0]);
        declare.iput(typeId8.getField(memberTypeId, "method"), newLocal12, newLocal13);
        declare.iput(typeId8.getField(TypeId.OBJECT, PARAMS_FIELD_NAME_THIS_OBJECT), newLocal12, local);
        declare.iput(typeId8.getField(objArrayTypeId, PARAMS_FIELD_NAME_ARGS), newLocal12, newLocal15);
        declare.loadConstant(newLocal19, 0);
        declare.mark(label6);
        TypeId<Throwable> typeId9 = throwableTypeId;
        declare.addCatchClause(typeId9, label3);
        declare.aget(newLocal6, newLocal4, newLocal19);
        declare.cast(newLocal7, newLocal6);
        declare.invokeVirtual(callBeforeCallbackMethodId, null, newLocal7, newLocal12);
        declare.jump(label4);
        declare.removeCatchClause(typeId9);
        declare.mark(label3);
        declare.moveException(newLocal11);
        declare.invokeStatic(logThrowableMethodId, null, newLocal11);
        declare.invokeVirtual(setResultMethodId, null, newLocal12, newLocal10);
        declare.loadConstant(newLocal16, Boolean.FALSE);
        FieldId<g.a, Boolean> fieldId = returnEarlyFieldId;
        declare.iput(fieldId, newLocal12, newLocal16);
        declare.jump(label2);
        declare.mark(label4);
        declare.iget(fieldId, newLocal16, newLocal12);
        declare.compareZ(Comparison.EQ, label2, newLocal16);
        BinaryOp binaryOp = BinaryOp.ADD;
        declare.op(binaryOp, newLocal19, newLocal19, newLocal9);
        declare.jump(label5);
        declare.mark(label2);
        declare.op(binaryOp, newLocal19, newLocal19, newLocal9);
        declare.compare(Comparison.LT, label6, newLocal19, newLocal5);
        declare.mark(label5);
        declare.iget(fieldId, newLocal16, newLocal12);
        declare.compareZ(Comparison.NE, label9, newLocal16);
        declare.addCatchClause(typeId9, label8);
        int i8 = !this.mIsStatic ? 1 : 0;
        for (int i9 = i8; i9 < createParameterLocals.length; i9++) {
            declare.loadConstant(newLocal18, Integer.valueOf(i9 - i8));
            declare.aget(newLocal8, newLocal15, newLocal18);
            o.autoUnboxIfNecessary(declare, createParameterLocals[i9], newLocal8, createResultLocals, true);
        }
        TypeId<?> typeId10 = this.mReturnTypeId;
        TypeId<Void> typeId11 = TypeId.VOID;
        if (typeId10.equals(typeId11)) {
            z4 = false;
            declare.invokeStatic(this.mBackupMethodId, null, createParameterLocals);
            i5 = 0;
            declare.invokeVirtual(setResultMethodId, null, newLocal12, newLocal10);
        } else {
            z4 = false;
            i5 = 0;
            Local local2 = createResultLocals.get(this.mReturnTypeId);
            declare.invokeStatic(this.mBackupMethodId, local2, createParameterLocals);
            o.autoBoxIfNecessary(declare, newLocal8, local2);
            declare.invokeVirtual(setResultMethodId, null, newLocal12, newLocal8);
        }
        declare.jump(label9);
        TypeId<Throwable> typeId12 = throwableTypeId;
        declare.removeCatchClause(typeId12);
        declare.mark(label8);
        declare.moveException(newLocal11);
        MethodId<g.a, Void> methodId = setThrowableMethodId;
        Local<?>[] localArr = new Local[1];
        localArr[i5] = newLocal11;
        declare.invokeVirtual(methodId, z4, newLocal12, localArr);
        declare.mark(label9);
        BinaryOp binaryOp2 = BinaryOp.SUBTRACT;
        declare.op(binaryOp2, newLocal19, newLocal19, newLocal9);
        declare.mark(label7);
        MethodId<g.a, Object> methodId2 = getResultMethodId;
        declare.invokeVirtual(methodId2, newLocal20, newLocal12, new Local[i5]);
        MethodId<g.a, Throwable> methodId3 = getThrowableMethodId;
        declare.invokeVirtual(methodId3, newLocal21, newLocal12, new Local[0]);
        declare.addCatchClause(typeId12, label10);
        declare.aget(newLocal6, newLocal4, newLocal19);
        declare.cast(newLocal7, newLocal6);
        declare.invokeVirtual(callAfterCallbackMethodId, null, newLocal7, newLocal12);
        declare.jump(label11);
        declare.removeCatchClause(typeId12);
        declare.mark(label10);
        declare.moveException(newLocal11);
        declare.invokeStatic(logThrowableMethodId, null, newLocal11);
        declare.compareZ(Comparison.EQ, label12, newLocal21);
        declare.invokeVirtual(methodId, null, newLocal12, newLocal21);
        declare.jump(label11);
        declare.mark(label12);
        declare.invokeVirtual(setResultMethodId, null, newLocal12, newLocal20);
        declare.mark(label11);
        declare.op(binaryOp2, newLocal19, newLocal19, newLocal9);
        declare.compareZ(Comparison.GE, label7, newLocal19);
        declare.invokeVirtual(hasThrowableMethodId, newLocal22, newLocal12, new Local[0]);
        declare.compareZ(Comparison.NE, label13, newLocal22);
        if (this.mReturnTypeId.equals(typeId11)) {
            declare.returnVoid();
            map = createResultLocals;
        } else {
            declare.invokeVirtual(methodId2, newLocal8, newLocal12, new Local[0]);
            map = createResultLocals;
            Local local3 = map.get(o.getObjTypeIdIfPrimitive(this.mReturnTypeId));
            declare.cast(local3, newLocal8);
            Local local4 = map.get(this.mReturnTypeId);
            o.autoUnboxIfNecessary(declare, local4, local3, map, true);
            declare.returnValue(local4);
        }
        declare.mark(label13);
        declare.invokeVirtual(methodId3, newLocal11, newLocal12, new Local[0]);
        declare.throwValue(newLocal11);
        declare.mark(label);
        if (this.mReturnTypeId.equals(typeId11)) {
            declare.invokeStatic(this.mBackupMethodId, null, createParameterLocals);
            declare.returnVoid();
        } else {
            Local local5 = map.get(this.mReturnTypeId);
            declare.invokeStatic(this.mBackupMethodId, local5, createParameterLocals);
            declare.returnValue(local5);
        }
    }

    private void generateSetupMethod() {
        TypeId<?> typeId = this.mHookerTypeId;
        TypeId typeId2 = TypeId.VOID;
        TypeId<Member> typeId3 = memberTypeId;
        TypeId<Method> typeId4 = methodTypeId;
        TypeId<j.b> typeId5 = hookInfoTypeId;
        Code declare = this.mDexMaker.declare(typeId.getMethod(typeId2, METHOD_NAME_SETUP, typeId3, typeId4, typeId5), 9);
        Local parameter = declare.getParameter(0, typeId3);
        Local parameter2 = declare.getParameter(1, typeId4);
        Local parameter3 = declare.getParameter(2, typeId5);
        declare.sput(this.mMethodFieldId, parameter);
        declare.sput(this.mBackupMethodFieldId, parameter2);
        declare.sput(this.mHookInfoFieldId, parameter3);
        declare.returnVoid();
    }

    private String getClassName(Member member) {
        return "SandHooker_" + o.MD5(member.toString());
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
        this.mBackupMethod = this.mHookClass.getMethod("backup", this.mActualParameterTypes);
        Method method = this.mHookClass.getMethod(METHOD_NAME_CALL_BACKUP, this.mActualParameterTypes);
        this.mCallBackupMethod = method;
        SandHook.resolveStaticMethod(method);
        SandHookMethodResolver.resolveMethod(this.mCallBackupMethod, this.mBackupMethod);
        SandHook.compileMethod(this.mCallBackupMethod);
        this.mHookClass.getMethod(METHOD_NAME_SETUP, Member.class, Method.class, j.b.class).invoke(null, this.mMember, this.mBackupMethod, this.mHookInfo);
        return new HookWrapper.HookEntity(this.mMember, this.mHookMethod, this.mBackupMethod);
    }

    @Override // com.swift.sandhook.xcompat.j
    public Method getBackupMethod() {
        return this.mBackupMethod;
    }

    @Override // com.swift.sandhook.xcompat.j
    public Method getCallBackupMethod() {
        return this.mCallBackupMethod;
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
