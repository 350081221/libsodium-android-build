package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.d1;
import kotlin.jvm.internal.r1;
import kotlin.q1;

@kotlin.i0(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002\u001a\u0018\u0010\u000e\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u001b\u0010\u0010\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0082\u0010\"\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u0018"}, d2 = {"", "E", "exception", socket.g.f22386a, "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "b", "block", "f", "", "defaultValue", "e", "accumulator", "c", bi.ay, "I", "throwableFields", "Lkotlinx/coroutines/internal/j;", "Lkotlinx/coroutines/internal/j;", "ctorCache", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,116:1\n1#2:117\n11335#3:118\n11670#3,3:119\n12904#3,3:136\n1963#4,14:122\n*S KotlinDebug\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt\n*L\n45#1:118\n45#1:119,3\n82#1:136,3\n63#1:122,14\n*E\n"})
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f20376a = e(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private static final j f20377b;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Throwable> {
        final /* synthetic */ Constructor<?> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Constructor<?> constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Override // v3.l
        @p4.l
        public final Throwable invoke(@p4.l Throwable th) {
            Object newInstance = this.$constructor.newInstance(th.getMessage(), th);
            kotlin.jvm.internal.l0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Throwable> {
        final /* synthetic */ Constructor<?> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Constructor<?> constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Override // v3.l
        @p4.l
        public final Throwable invoke(@p4.l Throwable th) {
            Object newInstance = this.$constructor.newInstance(th.getMessage());
            kotlin.jvm.internal.l0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Throwable> {
        final /* synthetic */ Constructor<?> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Constructor<?> constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Override // v3.l
        @p4.l
        public final Throwable invoke(@p4.l Throwable th) {
            Object newInstance = this.$constructor.newInstance(th);
            kotlin.jvm.internal.l0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "E", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/ExceptionsConstructorKt$createConstructor$1$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Throwable> {
        final /* synthetic */ Constructor<?> $constructor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Constructor<?> constructor) {
            super(1);
            this.$constructor = constructor;
        }

        @Override // v3.l
        @p4.l
        public final Throwable invoke(@p4.l Throwable th) {
            Object newInstance = this.$constructor.newInstance(new Object[0]);
            kotlin.jvm.internal.l0.n(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.n0 implements v3.l {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // v3.l
        @p4.m
        public final Void invoke(@p4.l Throwable th) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.n0 implements v3.l<Throwable, Throwable> {
        final /* synthetic */ v3.l<Throwable, Throwable> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(v3.l<? super Throwable, ? extends Throwable> lVar) {
            super(1);
            this.$block = lVar;
        }

        @Override // v3.l
        @p4.m
        public final Throwable invoke(@p4.l Throwable th) {
            Object m6444constructorimpl;
            v3.l<Throwable, Throwable> lVar = this.$block;
            try {
                d1.a aVar = kotlin.d1.Companion;
                Throwable invoke = lVar.invoke(th);
                if (!kotlin.jvm.internal.l0.g(th.getMessage(), invoke.getMessage()) && !kotlin.jvm.internal.l0.g(invoke.getMessage(), th.toString())) {
                    invoke = null;
                }
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(invoke);
            } catch (Throwable th2) {
                d1.a aVar2 = kotlin.d1.Companion;
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th2));
            }
            return (Throwable) (kotlin.d1.m6450isFailureimpl(m6444constructorimpl) ? null : m6444constructorimpl);
        }
    }

    static {
        j jVar;
        try {
            if (q.a()) {
                jVar = h1.f20360a;
            } else {
                jVar = kotlinx.coroutines.internal.c.f20337a;
            }
        } catch (Throwable unused) {
            jVar = h1.f20360a;
        }
        f20377b = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E extends Throwable> v3.l<Throwable, Throwable> b(Class<E> cls) {
        Object obj;
        v3.l<Throwable, Throwable> lVar;
        kotlin.u0 a5;
        e eVar = e.INSTANCE;
        if (f20376a != e(cls, 0)) {
            return eVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i5];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    if (length2 != 2) {
                        a5 = q1.a(null, -1);
                    } else if (kotlin.jvm.internal.l0.g(parameterTypes[0], String.class) && kotlin.jvm.internal.l0.g(parameterTypes[1], Throwable.class)) {
                        a5 = q1.a(f(new a(constructor)), 3);
                    } else {
                        a5 = q1.a(null, -1);
                    }
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    if (kotlin.jvm.internal.l0.g(cls2, String.class)) {
                        a5 = q1.a(f(new b(constructor)), 2);
                    } else if (kotlin.jvm.internal.l0.g(cls2, Throwable.class)) {
                        a5 = q1.a(f(new c(constructor)), 1);
                    } else {
                        a5 = q1.a(null, -1);
                    }
                }
            } else {
                a5 = q1.a(f(new d(constructor)), 0);
            }
            arrayList.add(a5);
            i5++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((kotlin.u0) obj).getSecond()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((kotlin.u0) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.u0 u0Var = (kotlin.u0) obj;
        if (u0Var != null && (lVar = (v3.l) u0Var.getFirst()) != null) {
            return lVar;
        }
        return eVar;
    }

    private static final int c(Class<?> cls, int i5) {
        do {
            int length = cls.getDeclaredFields().length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (!Modifier.isStatic(r0[i7].getModifiers())) {
                    i6++;
                }
            }
            i5 += i6;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i5;
    }

    static /* synthetic */ int d(Class cls, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return c(cls, i5);
    }

    private static final int e(Class<?> cls, int i5) {
        Object m6444constructorimpl;
        u3.a.i(cls);
        try {
            d1.a aVar = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(Integer.valueOf(d(cls, 0, 1, null)));
        } catch (Throwable th) {
            d1.a aVar2 = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
        }
        Integer valueOf = Integer.valueOf(i5);
        if (kotlin.d1.m6450isFailureimpl(m6444constructorimpl)) {
            m6444constructorimpl = valueOf;
        }
        return ((Number) m6444constructorimpl).intValue();
    }

    private static final v3.l<Throwable, Throwable> f(v3.l<? super Throwable, ? extends Throwable> lVar) {
        return new f(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.m
    public static final <E extends Throwable> E g(@p4.l E e5) {
        Object m6444constructorimpl;
        if (e5 instanceof kotlinx.coroutines.l0) {
            try {
                d1.a aVar = kotlin.d1.Companion;
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(((kotlinx.coroutines.l0) e5).createCopy());
            } catch (Throwable th) {
                d1.a aVar2 = kotlin.d1.Companion;
                m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
            }
            if (kotlin.d1.m6450isFailureimpl(m6444constructorimpl)) {
                m6444constructorimpl = null;
            }
            return (E) m6444constructorimpl;
        }
        return (E) f20377b.a(e5.getClass()).invoke(e5);
    }
}
