package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.g1;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r1;
import okhttp3.HttpUrl;

@i0(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\"\u0010\n\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0003\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
/* loaded from: classes4.dex */
public final class b0 {

    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19588a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19588a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends h0 implements v3.l<Class<?>, Class<?>> {
        public static final b INSTANCE = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // v3.l
        public final Class<?> invoke(@p4.l Class<?> p02) {
            l0.p(p02, "p0");
            return p02.getComponentType();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.r
    public static final Type c(s sVar, boolean z4) {
        Class e5;
        Object h5;
        int i5;
        g n5 = sVar.n();
        if (n5 instanceof t) {
            return new a0((t) n5);
        }
        if (n5 instanceof d) {
            d dVar = (d) n5;
            if (z4) {
                e5 = u3.a.g(dVar);
            } else {
                e5 = u3.a.e(dVar);
            }
            List<u> arguments = sVar.getArguments();
            if (arguments.isEmpty()) {
                return e5;
            }
            if (e5.isArray()) {
                if (e5.getComponentType().isPrimitive()) {
                    return e5;
                }
                h5 = e0.h5(arguments);
                u uVar = (u) h5;
                if (uVar != null) {
                    v a5 = uVar.a();
                    s b5 = uVar.b();
                    if (a5 == null) {
                        i5 = -1;
                    } else {
                        i5 = a.f19588a[a5.ordinal()];
                    }
                    if (i5 != -1 && i5 != 1) {
                        if (i5 != 2 && i5 != 3) {
                            throw new j0();
                        }
                        l0.m(b5);
                        Type d5 = d(b5, false, 1, null);
                        if (!(d5 instanceof Class)) {
                            return new kotlin.reflect.a(d5);
                        }
                        return e5;
                    }
                    return e5;
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sVar);
            }
            return e(e5, arguments);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + sVar);
    }

    static /* synthetic */ Type d(s sVar, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return c(sVar, z4);
    }

    @kotlin.r
    private static final Type e(Class<?> cls, List<u> list) {
        int Y;
        int Y2;
        int Y3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<u> list2 = list;
            Y3 = kotlin.collections.x.Y(list2, 10);
            ArrayList arrayList = new ArrayList(Y3);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((u) it.next()));
            }
            return new x(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<u> list3 = list;
            Y2 = kotlin.collections.x.Y(list3, 10);
            ArrayList arrayList2 = new ArrayList(Y2);
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((u) it2.next()));
            }
            return new x(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type e5 = e(declaringClass, list.subList(length, list.size()));
        List<u> subList = list.subList(0, length);
        Y = kotlin.collections.x.Y(subList, 10);
        ArrayList arrayList3 = new ArrayList(Y);
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((u) it3.next()));
        }
        return new x(cls, e5, arrayList3);
    }

    @p4.l
    public static final Type f(@p4.l s sVar) {
        Type j5;
        l0.p(sVar, "<this>");
        if ((sVar instanceof m0) && (j5 = ((m0) sVar).j()) != null) {
            return j5;
        }
        return d(sVar, false, 1, null);
    }

    private static final Type g(u uVar) {
        v h5 = uVar.h();
        if (h5 == null) {
            return c0.f19589c.a();
        }
        s g5 = uVar.g();
        l0.m(g5);
        int i5 = a.f19588a[h5.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return new c0(c(g5, true), null);
                }
                throw new j0();
            }
            return c(g5, true);
        }
        return new c0(null, c(g5, true));
    }

    @kotlin.r
    @g1(version = "1.4")
    @kotlin.internal.h
    public static /* synthetic */ void h(s sVar) {
    }

    @kotlin.r
    private static /* synthetic */ void i(u uVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        kotlin.sequences.m l5;
        Object f12;
        int g02;
        String e22;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                l5 = kotlin.sequences.s.l(type, b.INSTANCE);
                StringBuilder sb = new StringBuilder();
                f12 = kotlin.sequences.u.f1(l5);
                sb.append(((Class) f12).getName());
                g02 = kotlin.sequences.u.g0(l5);
                e22 = kotlin.text.e0.e2(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, g02);
                sb.append(e22);
                name = sb.toString();
            } else {
                name = cls.getName();
            }
            l0.o(name, "{\n        if (type.isArr…   } else type.name\n    }");
            return name;
        }
        return type.toString();
    }
}
