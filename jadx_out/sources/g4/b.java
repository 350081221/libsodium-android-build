package g4;

import android.annotation.SuppressLint;
import com.umeng.analytics.pro.bi;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.debug.internal.g;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p4.l;
import p4.m;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lg4/b;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lkotlin/r2;", "d", "b", "", "Z", "enableCreationStackTraces", "<init>", "()V", bi.ay, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f16114a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f16115b;

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lg4/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", bi.ay, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class a implements ClassFileTransformer {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f16116a = new a();

        private a() {
        }

        @m
        public byte[] a(@m ClassLoader classLoader, @l String str, @m Class<?> cls, @l ProtectionDomain protectionDomain, @m byte[] bArr) {
            if (classLoader != null && l0.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                kotlinx.coroutines.debug.internal.a.f19953a.b(true);
                return kotlin.io.b.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object m6444constructorimpl;
        boolean u4;
        Boolean bool;
        Object obj = null;
        try {
            d1.a aVar = d1.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            m6444constructorimpl = d1.m6444constructorimpl(bool);
        } catch (Throwable th) {
            d1.a aVar2 = d1.Companion;
            m6444constructorimpl = d1.m6444constructorimpl(e1.a(th));
        }
        if (!d1.m6450isFailureimpl(m6444constructorimpl)) {
            obj = m6444constructorimpl;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            u4 = bool2.booleanValue();
        } else {
            u4 = g.f19994a.u();
        }
        f16115b = u4;
    }

    private b() {
    }

    private final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: g4.a
                public final void a(Signal signal) {
                    b.c(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Signal signal) {
        g gVar = g.f19994a;
        if (gVar.z()) {
            gVar.f(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @u3.m
    public static final void d(@m String str, @l Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.a.f19953a.b(true);
        instrumentation.addTransformer(a.f16116a);
        g gVar = g.f19994a;
        gVar.K(f16115b);
        gVar.x();
        f16114a.b();
    }
}
