package kotlin.jvm.internal;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@kotlin.i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010N\u001a\u000201H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u001a\u0010\"\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001e\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u000bR\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010B8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", com.umeng.analytics.pro.d.U, "", TTDownloadField.TT_HASHCODE, "", "isInstance", t0.b.f22420d, "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* loaded from: classes4.dex */
public final class u implements kotlin.reflect.d<Object>, t {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f19458b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private static final Map<Class<? extends kotlin.v<?>>, Integer> f19459c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private static final HashMap<String, String> f19460d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private static final HashMap<String, String> f19461e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private static final HashMap<String, String> f19462f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private static final Map<String, String> f19463g;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Class<?> f19464a;

    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", t0.b.f22420d, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @p4.m
        public final String a(@p4.l Class<?> jClass) {
            String str;
            l0.p(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (jClass.isArray()) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) u.f19462f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "kotlin.Array";
                }
                return str2;
            }
            String str3 = (String) u.f19462f.get(jClass.getName());
            if (str3 == null) {
                return jClass.getCanonicalName();
            }
            return str3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        
            if (r2 == null) goto L13;
         */
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(@p4.l java.lang.Class<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.l0.p(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb6
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                kotlin.jvm.internal.l0.o(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = kotlin.text.v.n5(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb6
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                kotlin.jvm.internal.l0.o(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = kotlin.text.v.n5(r0, r8, r1, r3, r1)
                goto Lb6
            L64:
                kotlin.jvm.internal.l0.o(r0, r5)
                java.lang.String r1 = kotlin.text.v.m5(r0, r4, r1, r3, r1)
                goto Lb6
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La1
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9e
                java.util.Map r0 = kotlin.jvm.internal.u.A()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = r0.toString()
                r1 = r8
            L9e:
                if (r1 != 0) goto Lb6
                goto L40
            La1:
                java.util.Map r0 = kotlin.jvm.internal.u.A()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb6
                java.lang.String r1 = r8.getSimpleName()
            Lb6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.u.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(@p4.m Object obj, @p4.l Class<?> jClass) {
            l0.p(jClass, "jClass");
            Map map = u.f19459c;
            l0.n(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return u1.B(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = u3.a.g(u3.a.i(jClass));
            }
            return jClass.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List L;
        int Y;
        Map<Class<? extends kotlin.v<?>>, Integer> B0;
        int j5;
        String q5;
        String q52;
        int i5 = 0;
        L = kotlin.collections.w.L(v3.a.class, v3.l.class, v3.p.class, v3.q.class, v3.r.class, v3.s.class, v3.t.class, v3.u.class, v3.v.class, v3.w.class, v3.b.class, v3.c.class, v3.d.class, v3.e.class, v3.f.class, v3.g.class, v3.h.class, v3.i.class, v3.j.class, v3.k.class, v3.m.class, v3.n.class, v3.o.class);
        List list = L;
        Y = kotlin.collections.x.Y(list, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (Object obj : list) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.w.W();
            }
            arrayList.add(kotlin.q1.a((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        B0 = kotlin.collections.a1.B0(arrayList);
        f19459c = B0;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put(MethodReflectParams.CHAR, "kotlin.Char");
        hashMap.put(MethodReflectParams.BYTE, "kotlin.Byte");
        hashMap.put(MethodReflectParams.SHORT, "kotlin.Short");
        hashMap.put(MethodReflectParams.INT, "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(MethodReflectParams.LONG, "kotlin.Long");
        hashMap.put(MethodReflectParams.DOUBLE, "kotlin.Double");
        f19460d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f19461e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l0.o(values, "primitiveFqNames.values");
        for (String kotlinName : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l0.o(kotlinName, "kotlinName");
            q52 = kotlin.text.f0.q5(kotlinName, external.org.apache.commons.lang3.d.f15957a, null, 2, null);
            sb.append(q52);
            sb.append("CompanionObject");
            kotlin.u0 a5 = kotlin.q1.a(sb.toString(), kotlinName + ".Companion");
            hashMap3.put(a5.getFirst(), a5.getSecond());
        }
        for (Map.Entry<Class<? extends kotlin.v<?>>, Integer> entry : f19459c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f19462f = hashMap3;
        j5 = kotlin.collections.z0.j(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            q5 = kotlin.text.f0.q5((String) entry2.getValue(), external.org.apache.commons.lang3.d.f15957a, null, 2, null);
            linkedHashMap.put(key, q5);
        }
        f19463g = linkedHashMap;
    }

    public u(@p4.l Class<?> jClass) {
        l0.p(jClass, "jClass");
        this.f19464a = jClass;
    }

    private final Void B() {
        throw new u3.q();
    }

    @kotlin.g1(version = "1.3")
    public static /* synthetic */ void C() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void D() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void E() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void F() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void G() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void H() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void I() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void J() {
    }

    @kotlin.g1(version = "1.4")
    public static /* synthetic */ void K() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void L() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @kotlin.g1(version = "1.1")
    public static /* synthetic */ void N() {
    }

    @kotlin.g1(version = "1.5")
    public static /* synthetic */ void O() {
    }

    @Override // kotlin.reflect.d, kotlin.reflect.h
    @p4.l
    public Collection<kotlin.reflect.c<?>> a() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @p4.l
    public Collection<kotlin.reflect.d<?>> b() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @p4.l
    public Collection<kotlin.reflect.i<Object>> c() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean equals(@p4.m Object obj) {
        return (obj instanceof u) && l0.g(u3.a.g(this), u3.a.g((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.d
    @p4.l
    public List<kotlin.reflect.d<? extends Object>> f() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean g() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.b
    @p4.l
    public List<Annotation> getAnnotations() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @p4.l
    public List<kotlin.reflect.t> getTypeParameters() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @p4.m
    public kotlin.reflect.w getVisibility() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return u3.a.g(this).hashCode();
    }

    @Override // kotlin.reflect.d
    @p4.m
    public Object i() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean k() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean l() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @kotlin.g1(version = "1.1")
    public boolean o(@p4.m Object obj) {
        return f19458b.c(obj, p());
    }

    @Override // kotlin.jvm.internal.t
    @p4.l
    public Class<?> p() {
        return this.f19464a;
    }

    @Override // kotlin.reflect.d
    @p4.m
    public String q() {
        return f19458b.a(p());
    }

    @Override // kotlin.reflect.d
    public boolean r() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean s() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    @p4.m
    public String t() {
        return f19458b.b(p());
    }

    @p4.l
    public String toString() {
        return p().toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    @p4.l
    public List<kotlin.reflect.s> u() {
        B();
        throw new kotlin.y();
    }

    @Override // kotlin.reflect.d
    public boolean x() {
        B();
        throw new kotlin.y();
    }
}
