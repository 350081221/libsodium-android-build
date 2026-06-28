package kotlin.internal;

import java.lang.reflect.Method;
import java.util.regex.MatchResult;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "getSuppressed", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes3.dex */
public class l {

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        public static final a f19261a = new a();

        /* renamed from: b, reason: collision with root package name */
        @p4.m
        @u3.e
        public static final Method f19262b;

        /* renamed from: c, reason: collision with root package name */
        @p4.m
        @u3.e
        public static final Method f19263c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            /*
                kotlin.internal.l$a r0 = new kotlin.internal.l$a
                r0.<init>()
                kotlin.internal.l.a.f19261a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.l0.o(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.l0.g(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.l0.o(r7, r8)
                java.lang.Object r7 = kotlin.collections.l.At(r7)
                boolean r7 = kotlin.jvm.internal.l0.g(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                kotlin.internal.l.a.f19262b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.l0.g(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                kotlin.internal.l.a.f19263c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.l.a.<clinit>():void");
        }

        private a() {
        }
    }

    public void a(@p4.l Throwable cause, @p4.l Throwable exception) {
        l0.p(cause, "cause");
        l0.p(exception, "exception");
        Method method = a.f19262b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @p4.l
    public kotlin.random.f b() {
        return new kotlin.random.b();
    }

    @p4.m
    public kotlin.text.m c(@p4.l MatchResult matchResult, @p4.l String name) {
        l0.p(matchResult, "matchResult");
        l0.p(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = kotlin.collections.o.t((java.lang.Throwable[]) r3);
     */
    @p4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.Throwable> d(@p4.l java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.reflect.Method r0 = kotlin.internal.l.a.f19263c
            if (r0 == 0) goto L1a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L1a
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = kotlin.collections.l.t(r3)
            if (r3 != 0) goto L1e
        L1a:
            java.util.List r3 = kotlin.collections.u.E()
        L1e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.l.d(java.lang.Throwable):java.util.List");
    }
}
