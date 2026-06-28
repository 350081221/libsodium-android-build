package com.lody.virtual.client.hiddenapibypass;

import com.lody.virtual.client.hiddenapibypass.Helper;
import com.umeng.analytics.pro.bi;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class HiddenApiBypass {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "HiddenApiBypass";
    private static final long artOffset;
    private static final long bias;
    private static final long infoOffset;
    private static final long memberOffset;
    private static final long methodsOffset;
    private static final Set<String> signaturePrefixes = new HashSet();
    private static final long size;
    private static final Unsafe unsafe;

    static {
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        MethodHandle unreflect2;
        try {
            Unsafe unsafe2 = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            unsafe = unsafe2;
            long objectFieldOffset = unsafe2.objectFieldOffset(Helper.MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            artOffset = objectFieldOffset;
            infoOffset = unsafe2.objectFieldOffset(Helper.MethodHandleImpl.class.getDeclaredField("info"));
            long objectFieldOffset2 = unsafe2.objectFieldOffset(Helper.Class.class.getDeclaredField("methods"));
            methodsOffset = objectFieldOffset2;
            memberOffset = unsafe2.objectFieldOffset(Helper.HandleInfo.class.getDeclaredField("member"));
            lookup = MethodHandles.lookup();
            unreflect = lookup.unreflect(Helper.NeverCall.class.getDeclaredMethod(bi.ay, new Class[0]));
            lookup2 = MethodHandles.lookup();
            unreflect2 = lookup2.unreflect(Helper.NeverCall.class.getDeclaredMethod("b", new Class[0]));
            long j5 = unsafe2.getLong(unreflect, objectFieldOffset);
            long j6 = unsafe2.getLong(unreflect2, objectFieldOffset);
            long j7 = unsafe2.getLong(Helper.NeverCall.class, objectFieldOffset2);
            long j8 = j6 - j5;
            size = j8;
            bias = (j5 - j7) - j8;
        } catch (ReflectiveOperationException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set<String> set = signaturePrefixes;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[set.size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        signaturePrefixes.clear();
        return setHiddenApiExemptions(new String[0]);
    }

    public static List<Executable> getDeclaredMethods(Class<?> cls) {
        MethodHandles.Lookup lookup;
        MethodHandle unreflect;
        MethodHandles.Lookup lookup2;
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                lookup = MethodHandles.lookup();
                unreflect = lookup.unreflect(Helper.NeverCall.class.getDeclaredMethod(bi.ay, new Class[0]));
                Unsafe unsafe2 = unsafe;
                long j5 = unsafe2.getLong(cls, methodsOffset);
                int i5 = unsafe2.getInt(j5);
                for (int i6 = 0; i6 < i5; i6++) {
                    long j6 = (i6 * size) + j5 + bias;
                    Unsafe unsafe3 = unsafe;
                    unsafe3.putLong(unreflect, artOffset, j6);
                    unsafe3.putObject(unreflect, infoOffset, null);
                    try {
                        lookup2 = MethodHandles.lookup();
                        lookup2.revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe4 = unsafe;
                    arrayList.add((Executable) unsafe4.getObject((MethodHandleInfo) unsafe4.getObject(unreflect, infoOffset), memberOffset));
                }
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setHiddenApiExemptions$0(Executable executable) {
        String name;
        name = executable.getName();
        return name.equals("getRuntime");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setHiddenApiExemptions$1(Executable executable) {
        String name;
        name = executable.getName();
        return name.equals("setHiddenApiExemptions");
    }

    public static boolean setHiddenApiExemptions(String... strArr) {
        List<Executable> declaredMethods = getDeclaredMethods(VMRuntime.class);
        Optional<Executable> findFirst = declaredMethods.stream().filter(new Predicate() { // from class: com.lody.virtual.client.hiddenapibypass.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$setHiddenApiExemptions$0;
                lambda$setHiddenApiExemptions$0 = HiddenApiBypass.lambda$setHiddenApiExemptions$0((Executable) obj);
                return lambda$setHiddenApiExemptions$0;
            }
        }).findFirst();
        Optional<Executable> findFirst2 = declaredMethods.stream().filter(new Predicate() { // from class: com.lody.virtual.client.hiddenapibypass.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$setHiddenApiExemptions$1;
                lambda$setHiddenApiExemptions$1 = HiddenApiBypass.lambda$setHiddenApiExemptions$1((Executable) obj);
                return lambda$setHiddenApiExemptions$1;
            }
        }).findFirst();
        if (findFirst.isPresent() && findFirst2.isPresent()) {
            findFirst.get().setAccessible(true);
            try {
                Object invoke = ((Method) findFirst.get()).invoke(null, new Object[0]);
                findFirst2.get().setAccessible(true);
                ((Method) findFirst2.get()).invoke(invoke, strArr);
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }
}
