package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J3\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J.\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/p;", "", "Ljava/lang/Class;", "Lkotlinx/coroutines/internal/d0;", "baseClass", "", "serviceClass", bi.ay, "S", "service", "Ljava/lang/ClassLoader;", "loader", "", "c", "name", "b", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "f", "R", "Ljava/util/jar/JarFile;", "Lkotlin/Function1;", "block", bi.aJ, "(Ljava/util/jar/JarFile;Lv3/l;)Ljava/lang/Object;", "Ljava/io/BufferedReader;", "r", socket.g.f22386a, "d", "()Ljava/util/List;", "e", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "Ljava/lang/String;", "PREFIX", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final p f20378a = new p();

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final String f20379b = "META-INF/services/";

    private p() {
    }

    private final d0 a(Class<d0> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        List<S> S5;
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            S5 = kotlin.collections.e0.S5(ServiceLoader.load(cls, classLoader));
            return S5;
        }
    }

    private final List<String> f(URL url) {
        boolean s22;
        BufferedReader bufferedReader;
        String n5;
        String u5;
        String n52;
        String url2 = url.toString();
        s22 = kotlin.text.e0.s2(url2, "jar", false, 2, null);
        if (s22) {
            n5 = kotlin.text.f0.n5(url2, "jar:file:", null, 2, null);
            u5 = kotlin.text.f0.u5(n5, '!', null, 2, null);
            n52 = kotlin.text.f0.n5(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(u5, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(n52)), "UTF-8"));
                try {
                    List<String> g5 = f20378a.g(bufferedReader);
                    kotlin.io.c.a(bufferedReader, null);
                    jarFile.close();
                    return g5;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.p.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> g6 = f20378a.g(bufferedReader);
                kotlin.io.c.a(bufferedReader, null);
                return g6;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private final List<String> g(BufferedReader bufferedReader) {
        List<String> S5;
        String v5;
        CharSequence C5;
        boolean z4;
        boolean z5;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                S5 = kotlin.collections.e0.S5(linkedHashSet);
                return S5;
            }
            v5 = kotlin.text.f0.v5(readLine, "#", null, 2, null);
            C5 = kotlin.text.f0.C5(v5);
            String obj = C5.toString();
            boolean z6 = false;
            int i5 = 0;
            while (true) {
                if (i5 < obj.length()) {
                    char charAt = obj.charAt(i5);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        z4 = false;
                        break;
                    }
                    i5++;
                } else {
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                if (obj.length() > 0) {
                    z6 = true;
                }
                if (z6) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    private final <R> R h(JarFile jarFile, v3.l<? super JarFile, ? extends R> lVar) {
        try {
            R invoke = lVar.invoke(jarFile);
            kotlin.jvm.internal.i0.d(1);
            jarFile.close();
            kotlin.jvm.internal.i0.c(1);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                kotlin.jvm.internal.i0.d(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.i0.c(1);
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.p.a(th, th3);
                    throw th;
                }
            }
        }
    }

    @p4.l
    public final List<d0> d() {
        d0 d0Var;
        if (!q.a()) {
            return c(d0.class, d0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            d0 d0Var2 = null;
            try {
                d0Var = (d0) d0.class.cast(Class.forName("kotlinx.coroutines.android.a", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                d0Var = null;
            }
            if (d0Var != null) {
                arrayList.add(d0Var);
            }
            try {
                d0Var2 = (d0) d0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, d0.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (d0Var2 != null) {
                arrayList.add(d0Var2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return c(d0.class, d0.class.getClassLoader());
        }
    }

    @p4.l
    public final <S> List<S> e(@p4.l Class<S> cls, @p4.l ClassLoader classLoader) {
        Set X5;
        int Y;
        ArrayList list = Collections.list(classLoader.getResources(f20379b + cls.getName()));
        kotlin.jvm.internal.l0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.b0.n0(arrayList, f20378a.f((URL) it.next()));
        }
        X5 = kotlin.collections.e0.X5(arrayList);
        if (!X5.isEmpty()) {
            Set set = X5;
            Y = kotlin.collections.x.Y(set, 10);
            ArrayList arrayList2 = new ArrayList(Y);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add(f20378a.b((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
