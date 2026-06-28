package com.swift.sandhook.xcompat;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.swift.sandhook.SandHook;
import com.swift.sandhook.SandHookMethodResolver;
import com.swift.sandhook.utils.ParamWrapper;
import com.swift.sandhook.wrapper.StubMethodsFactory;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicInteger;
import u.dont.know.what.i.am.g;
import u.dont.know.what.i.am.j;

/* loaded from: classes3.dex */
public class e {
    public static int ALL_STUB = 0;
    public static final int MAX_64_ARGS = 7;
    public static int MAX_STUB_ARGS;
    public static j.b[] additionalHookInfos;
    public static AtomicInteger[] curUseStubIndexes;
    public static boolean hasStubBackup;
    public static d[] hookMethodEntities;
    public static volatile boolean is64Bit = SandHook.is64Bit();
    public static Member[] originMethods;
    public static int[] stubSizes;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {
        int args;
        Method backup;
        Method hook;
        int index;

        public a(int i5, int i6, Method method, Method method2) {
            this.args = i5;
            this.index = i6;
            this.hook = method;
            this.backup = method2;
        }
    }

    static {
        Class cls;
        boolean z4;
        if (is64Bit) {
            cls = g.class;
        } else {
            cls = f.class;
        }
        stubSizes = (int[]) u.dont.know.what.i.am.k.p0(cls, "stubSizes");
        Boolean bool = (Boolean) u.dont.know.what.i.am.k.p0(cls, "hasStubBackup");
        if (bool != null && bool.booleanValue() && !com.swift.sandhook.xcompat.a.useNewCallBackup) {
            z4 = true;
        } else {
            z4 = false;
        }
        hasStubBackup = z4;
        int[] iArr = stubSizes;
        if (iArr != null && iArr.length > 0) {
            int length = iArr.length - 1;
            MAX_STUB_ARGS = length;
            curUseStubIndexes = new AtomicInteger[length + 1];
            for (int i5 = 0; i5 < MAX_STUB_ARGS + 1; i5++) {
                curUseStubIndexes[i5] = new AtomicInteger(0);
                ALL_STUB += stubSizes[i5];
            }
            int i6 = ALL_STUB;
            originMethods = new Member[i6];
            hookMethodEntities = new d[i6];
            additionalHookInfos = new j.b[i6];
        }
    }

    public static final long callOrigin(d dVar, Member member, Object obj, Object[] objArr) throws Throwable {
        return dVar.getResultAddress(SandHook.callOriginMethod(member, dVar.backup, obj, objArr));
    }

    public static String getBackupMethodName(int i5) {
        return "stub_backup_" + i5;
    }

    public static String getCallOriginClassName(int i5, int i6) {
        return "call_origin_" + i5 + "_" + i6;
    }

    public static Method getCallOriginMethod(int i5, int i6) {
        Class cls;
        if (is64Bit) {
            cls = g.class;
        } else {
            cls = f.class;
        }
        try {
            return Class.forName((cls.getName() + "$") + getCallOriginClassName(i5, i6), true, cls.getClassLoader()).getDeclaredMethod(NotificationCompat.CATEGORY_CALL, long[].class);
        } catch (Throwable th) {
            Log.e("HookStubManager", "load call origin class error!", th);
            return null;
        }
    }

    public static Class[] getFindMethodParTypes(boolean z4, int i5) {
        if (i5 == 0) {
            return null;
        }
        Class[] clsArr = new Class[i5];
        int i6 = 0;
        if (z4) {
            while (i6 < i5) {
                clsArr[i6] = Long.TYPE;
                i6++;
            }
        } else {
            while (i6 < i5) {
                clsArr[i6] = Integer.TYPE;
                i6++;
            }
        }
        return clsArr;
    }

    public static d getHookMethodEntity(Member member, j.b bVar) {
        Class<?> cls;
        Class<?>[] parameterTypes;
        if (!support()) {
            return null;
        }
        boolean isStatic = Modifier.isStatic(member.getModifiers());
        if (member instanceof Method) {
            Method method = (Method) member;
            cls = method.getReturnType();
            parameterTypes = method.getParameterTypes();
        } else {
            if (!(member instanceof Constructor)) {
                return null;
            }
            cls = Void.TYPE;
            parameterTypes = ((Constructor) member).getParameterTypes();
        }
        if (!ParamWrapper.support(cls)) {
            return null;
        }
        int i5 = !isStatic ? 1 : 0;
        if (parameterTypes != null) {
            i5 += parameterTypes.length;
            if (i5 > MAX_STUB_ARGS) {
                return null;
            }
            if (is64Bit && i5 > 7) {
                return null;
            }
            for (Class<?> cls2 : parameterTypes) {
                if (!ParamWrapper.support(cls2)) {
                    return null;
                }
            }
        } else {
            parameterTypes = new Class[0];
        }
        synchronized (e.class) {
            a stubMethodPair = getStubMethodPair(is64Bit, i5);
            if (stubMethodPair == null) {
                return null;
            }
            d dVar = new d(member, stubMethodPair.hook, stubMethodPair.backup);
            dVar.retType = cls;
            dVar.parType = parameterTypes;
            if (hasStubBackup && !tryCompileAndResolveCallOriginMethod(dVar.backup, stubMethodPair.args, stubMethodPair.index)) {
                n.w("internal stub <" + dVar.hook.getName() + "> call origin compile failure, skip use internal stub");
                return null;
            }
            int methodId = getMethodId(stubMethodPair.args, stubMethodPair.index);
            originMethods[methodId] = member;
            hookMethodEntities[methodId] = dVar;
            additionalHookInfos[methodId] = bVar;
            return dVar;
        }
    }

    public static String getHookMethodName(int i5) {
        return "stub_hook_" + i5;
    }

    public static int getMatchStubArgsCount(int i5) {
        while (i5 <= MAX_STUB_ARGS) {
            if (curUseStubIndexes[i5].get() < stubSizes[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static int getMethodId(int i5, int i6) {
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += stubSizes[i7];
        }
        return i6;
    }

    private static synchronized a getStubMethodPair(boolean z4, int i5) {
        Method stubMethod;
        Method stubMethod2;
        synchronized (e.class) {
            int matchStubArgsCount = getMatchStubArgsCount(i5);
            if (matchStubArgsCount < 0) {
                return null;
            }
            int andIncrement = curUseStubIndexes[matchStubArgsCount].getAndIncrement();
            Class[] findMethodParTypes = getFindMethodParTypes(z4, matchStubArgsCount);
            try {
                if (z4) {
                    Method declaredMethod = g.class.getDeclaredMethod(getHookMethodName(andIncrement), findMethodParTypes);
                    if (hasStubBackup) {
                        stubMethod2 = g.class.getDeclaredMethod(getBackupMethodName(andIncrement), findMethodParTypes);
                    } else {
                        stubMethod2 = StubMethodsFactory.getStubMethod();
                    }
                    if (declaredMethod != null && stubMethod2 != null) {
                        return new a(matchStubArgsCount, andIncrement, declaredMethod, stubMethod2);
                    }
                    return null;
                }
                Method declaredMethod2 = f.class.getDeclaredMethod(getHookMethodName(andIncrement), findMethodParTypes);
                if (hasStubBackup) {
                    stubMethod = f.class.getDeclaredMethod(getBackupMethodName(andIncrement), findMethodParTypes);
                } else {
                    stubMethod = StubMethodsFactory.getStubMethod();
                }
                if (declaredMethod2 != null && stubMethod != null) {
                    return new a(matchStubArgsCount, andIncrement, declaredMethod2, stubMethod);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    private static boolean hasArgs(long... jArr) {
        return jArr != null && jArr.length > 0;
    }

    public static long hookBridge(int i5, c cVar, long... jArr) throws Throwable {
        Object obj;
        Object[] objArr;
        Member member = originMethods[i5];
        d dVar = hookMethodEntities[i5];
        if (hasArgs(jArr)) {
            obj = dVar.getThis(jArr[0]);
            objArr = dVar.getArgs(jArr);
        } else {
            obj = null;
            objArr = null;
        }
        if (u.dont.know.what.i.am.j.f22520h) {
            if (hasStubBackup) {
                return cVar.call(jArr);
            }
            return callOrigin(dVar, member, obj, objArr);
        }
        n.printMethodHookIn(member);
        Object[] b5 = additionalHookInfos[i5].f22526a.b();
        if (b5 != null && b5.length != 0) {
            g.a aVar = new g.a();
            aVar.f22496c = member;
            aVar.f22497d = obj;
            aVar.f22498e = objArr;
            int i6 = 0;
            while (true) {
                try {
                    ((u.dont.know.what.i.am.g) b5[i6]).callBeforeHookedMethod(aVar);
                    if (aVar.f22501h) {
                        i6++;
                        break;
                    }
                } catch (Throwable unused) {
                    aVar.h(null);
                    aVar.f22501h = false;
                }
                i6++;
                if (i6 >= b5.length) {
                    break;
                }
            }
            if (!aVar.f22501h) {
                try {
                    if (hasStubBackup) {
                        aVar.h(dVar.getResult(cVar.call(dVar.getArgsAddress(jArr, aVar.f22498e))));
                    } else {
                        aVar.h(SandHook.callOriginMethod(member, dVar.backup, obj, aVar.f22498e));
                    }
                } catch (Throwable th) {
                    u.dont.know.what.i.am.j.m(th);
                    aVar.i(th);
                }
            }
            int i7 = i6 - 1;
            do {
                Object d5 = aVar.d();
                Throwable f5 = aVar.f();
                try {
                    ((u.dont.know.what.i.am.g) b5[i7]).callAfterHookedMethod(aVar);
                } catch (Throwable th2) {
                    u.dont.know.what.i.am.j.m(th2);
                    if (f5 == null) {
                        aVar.h(d5);
                    } else {
                        aVar.i(f5);
                    }
                }
                i7--;
            } while (i7 >= 0);
            if (!aVar.g()) {
                return dVar.getResultAddress(aVar.d());
            }
            throw aVar.f();
        }
        if (hasStubBackup) {
            return cVar.call(jArr);
        }
        return callOrigin(dVar, member, obj, objArr);
    }

    public static boolean support() {
        return MAX_STUB_ARGS > 0 && SandHook.canGetObject() && SandHook.canGetObjectAddress();
    }

    public static boolean tryCompileAndResolveCallOriginMethod(Method method, int i5, int i6) {
        Method callOriginMethod = getCallOriginMethod(i5, i6);
        if (callOriginMethod != null) {
            SandHookMethodResolver.resolveMethod(callOriginMethod, method);
            return SandHook.compileMethod(callOriginMethod);
        }
        return false;
    }

    public static Object hookBridge(Member member, Method method, j.b bVar, Object obj, Object... objArr) throws Throwable {
        if (u.dont.know.what.i.am.j.f22520h) {
            return SandHook.callOriginMethod(member, method, obj, objArr);
        }
        n.printMethodHookIn(member);
        Object[] b5 = bVar.f22526a.b();
        if (b5 != null && b5.length != 0) {
            g.a aVar = new g.a();
            aVar.f22496c = member;
            aVar.f22497d = obj;
            aVar.f22498e = objArr;
            int i5 = 0;
            while (true) {
                try {
                    ((u.dont.know.what.i.am.g) b5[i5]).callBeforeHookedMethod(aVar);
                    if (aVar.f22501h) {
                        i5++;
                        break;
                    }
                } catch (Throwable unused) {
                    aVar.h(null);
                    aVar.f22501h = false;
                }
                i5++;
                if (i5 >= b5.length) {
                    break;
                }
            }
            if (!aVar.f22501h) {
                try {
                    aVar.h(SandHook.callOriginMethod(member, method, obj, aVar.f22498e));
                } catch (Throwable th) {
                    u.dont.know.what.i.am.j.m(th);
                    aVar.i(th);
                }
            }
            int i6 = i5 - 1;
            do {
                Object d5 = aVar.d();
                Throwable f5 = aVar.f();
                try {
                    ((u.dont.know.what.i.am.g) b5[i6]).callAfterHookedMethod(aVar);
                } catch (Throwable th2) {
                    u.dont.know.what.i.am.j.m(th2);
                    if (f5 == null) {
                        aVar.h(d5);
                    } else {
                        aVar.i(f5);
                    }
                }
                i6--;
            } while (i6 >= 0);
            if (!aVar.g()) {
                return aVar.d();
            }
            throw aVar.f();
        }
        return SandHook.callOriginMethod(member, method, obj, objArr);
    }
}
