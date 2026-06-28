package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.random.f;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class d extends kotlin.internal.jdk7.a {

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f19259a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m
        @e
        public static final Integer f19260b;

        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        static {
            /*
                kotlin.internal.jdk8.d$a r0 = new kotlin.internal.jdk8.d$a
                r0.<init>()
                kotlin.internal.jdk8.d.a.f19259a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L2e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L2a
                r2 = 1
                goto L2b
            L2a:
                r2 = 0
            L2b:
                if (r2 == 0) goto L2e
                r0 = r1
            L2e:
                kotlin.internal.jdk8.d.a.f19260b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.jdk8.d.a.<clinit>():void");
        }

        private a() {
        }
    }

    private final boolean e(int i5) {
        Integer num = a.f19260b;
        return num == null || num.intValue() >= i5;
    }

    @Override // kotlin.internal.l
    @l
    public f b() {
        return e(34) ? new a4.a() : super.b();
    }

    @Override // kotlin.internal.l
    @m
    public kotlin.text.m c(@l MatchResult matchResult, @l String name) {
        Matcher matcher;
        int start;
        int end;
        String group;
        l0.p(matchResult, "matchResult");
        l0.p(name, "name");
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            start = matcher.start(name);
            end = matcher.end(name);
            kotlin.ranges.l lVar = new kotlin.ranges.l(start, end - 1);
            if (lVar.getStart().intValue() < 0) {
                return null;
            }
            group = matcher.group(name);
            l0.o(group, "matcher.group(name)");
            return new kotlin.text.m(group, lVar);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
