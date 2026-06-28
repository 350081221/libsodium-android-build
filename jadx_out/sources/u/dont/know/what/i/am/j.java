package u.dont.know.what.i.am;

import android.annotation.SuppressLint;
import android.util.Log;
import com.swift.sandhook.SandHook;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import u.dont.know.what.i.am.g;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final String f22514b = "SandXposed";

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static int f22515c = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f22518f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f22519g = 2;

    /* renamed from: i, reason: collision with root package name */
    static long f22521i;

    /* renamed from: a, reason: collision with root package name */
    public static final ClassLoader f22513a = j.class.getClassLoader();

    /* renamed from: d, reason: collision with root package name */
    static boolean f22516d = true;

    /* renamed from: e, reason: collision with root package name */
    private static int f22517e = 2;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22520h = false;

    /* renamed from: j, reason: collision with root package name */
    private static final Object[] f22522j = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Map<Member, c<g>> f22523k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static final c<p> f22524l = new c<>();

    /* renamed from: m, reason: collision with root package name */
    static final c<n> f22525m = new c<>();

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c<g> f22526a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?>[] f22527b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f22528c;

        private b(c<g> cVar, Class<?>[] clsArr, Class<?> cls) {
            this.f22526a = cVar;
            this.f22527b = clsArr;
            this.f22528c = cls;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<E> {

        /* renamed from: a, reason: collision with root package name */
        private volatile transient Object[] f22529a = j.f22522j;

        private int c(Object obj) {
            for (int i5 = 0; i5 < this.f22529a.length; i5++) {
                if (obj.equals(this.f22529a[i5])) {
                    return i5;
                }
            }
            return -1;
        }

        public synchronized boolean a(E e5) {
            if (c(e5) >= 0) {
                return false;
            }
            Object[] objArr = new Object[this.f22529a.length + 1];
            System.arraycopy(this.f22529a, 0, objArr, 0, this.f22529a.length);
            objArr[this.f22529a.length] = e5;
            Arrays.sort(objArr);
            this.f22529a = objArr;
            return true;
        }

        public Object[] b() {
            return this.f22529a;
        }

        public synchronized boolean d(E e5) {
            int c5 = c(e5);
            if (c5 == -1) {
                return false;
            }
            Object[] objArr = new Object[this.f22529a.length - 1];
            System.arraycopy(this.f22529a, 0, objArr, 0, c5);
            System.arraycopy(this.f22529a, c5 + 1, objArr, c5, (this.f22529a.length - c5) - 1);
            this.f22529a = objArr;
            return true;
        }
    }

    private j() {
    }

    @SuppressLint({"SetWorldReadable"})
    private static File b(String str, Class<?> cls, Class<?> cls2) throws IOException {
        return null;
    }

    public static int c() {
        return 90;
    }

    public static Set<g.b> d(Class<?> cls, g gVar) {
        HashSet hashSet = new HashSet();
        for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
            hashSet.add(h(constructor, gVar));
        }
        return hashSet;
    }

    public static Set<g.b> e(Class<?> cls, String str, g gVar) {
        HashSet hashSet = new HashSet();
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                hashSet.add(h(method, gVar));
            }
        }
        return hashSet;
    }

    public static void f(n nVar) {
    }

    public static void g(p pVar) {
        c<p> cVar = f22524l;
        synchronized (cVar) {
            cVar.a(pVar);
        }
    }

    public static g.b h(Member member, g gVar) {
        c<g> cVar;
        int i5;
        boolean z4;
        Class<?>[] parameterTypes;
        Class<?> cls;
        if (!(member instanceof Method) && !(member instanceof Constructor)) {
            throw new IllegalArgumentException("Only methods and constructors can be hooked: " + member.toString());
        }
        if (!member.getDeclaringClass().isInterface()) {
            if (!Modifier.isAbstract(member.getModifiers())) {
                if (gVar != null) {
                    Map<Member, c<g>> map = f22523k;
                    synchronized (map) {
                        cVar = map.get(member);
                        i5 = 0;
                        if (cVar == null) {
                            cVar = new c<>();
                            map.put(member, cVar);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    cVar.a(gVar);
                    if (z4) {
                        Class<?> declaringClass = member.getDeclaringClass();
                        if (f22517e == 2) {
                            cls = null;
                            parameterTypes = null;
                        } else if (member instanceof Method) {
                            i5 = k.V(member, "slot");
                            Method method = (Method) member;
                            parameterTypes = method.getParameterTypes();
                            cls = method.getReturnType();
                        } else {
                            i5 = k.V(member, "slot");
                            parameterTypes = ((Constructor) member).getParameterTypes();
                            cls = null;
                        }
                        i(member, declaringClass, i5, new b(cVar, parameterTypes, cls));
                    }
                    return new g.b(member);
                }
                throw new IllegalArgumentException("callback should not be null!");
            }
            throw new IllegalArgumentException("Cannot hook abstract methods: " + member.toString());
        }
        throw new IllegalArgumentException("Cannot hook interfaces: " + member.toString());
    }

    private static synchronized void i(Member member, Class<?> cls, int i5, Object obj) {
        synchronized (j.class) {
            com.swift.sandhook.xcompat.h.hookMethod(member, (b) obj);
        }
    }

    private static void j() throws IOException {
    }

    public static Object k(Member member, Object obj, Object[] objArr) throws NullPointerException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            return SandHook.callOriginMethod(member, obj, objArr);
        } catch (IllegalAccessException e5) {
            throw e5;
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (NullPointerException e7) {
            throw e7;
        } catch (InvocationTargetException e8) {
            throw e8;
        } catch (Throwable th) {
            throw new InvocationTargetException(th);
        }
    }

    public static synchronized void l(String str) {
        synchronized (j.class) {
            if (com.swift.sandhook.xcompat.n.DEBUG) {
                Log.i(f22514b, str);
            }
        }
    }

    public static synchronized void m(Throwable th) {
        synchronized (j.class) {
            if (com.swift.sandhook.xcompat.n.DEBUG) {
                Log.e(f22514b, Log.getStackTraceString(th));
            }
        }
    }

    public static void n(String[] strArr) {
    }

    @Deprecated
    public static void o(Member member, g gVar) {
        Map<Member, c<g>> map = f22523k;
        synchronized (map) {
            c<g> cVar = map.get(member);
            if (cVar == null) {
                return;
            }
            cVar.d(gVar);
        }
    }
}
