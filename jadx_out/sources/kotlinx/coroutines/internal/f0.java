package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.x2;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/d0;", "", "factories", "Lkotlinx/coroutines/x2;", "f", "", "d", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/g0;", bi.ay, "", "e", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatchersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private static final String f20349a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f20350b = true;

    private static final g0 a(Throwable th, String str) {
        if (f20350b) {
            return new g0(th, str);
        }
        if (th != null) {
            throw th;
        }
        e();
        throw new kotlin.y();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ g0 b(Throwable th, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            th = null;
        }
        if ((i5 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    private static /* synthetic */ void c() {
    }

    @g2
    public static final boolean d(@p4.l x2 x2Var) {
        return x2Var.C0() instanceof g0;
    }

    @p4.l
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @p4.l
    @g2
    public static final x2 f(@p4.l d0 d0Var, @p4.l List<? extends d0> list) {
        try {
            return d0Var.b(list);
        } catch (Throwable th) {
            return a(th, d0Var.a());
        }
    }
}
