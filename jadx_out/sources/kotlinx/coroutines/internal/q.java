package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.bi;
import kotlin.d1;
import kotlin.jvm.internal.r1;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", bi.ay, "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f20381a;

    static {
        Object m6444constructorimpl;
        try {
            d1.a aVar = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            d1.a aVar2 = kotlin.d1.Companion;
            m6444constructorimpl = kotlin.d1.m6444constructorimpl(kotlin.e1.a(th));
        }
        f20381a = kotlin.d1.m6451isSuccessimpl(m6444constructorimpl);
    }

    public static final boolean a() {
        return f20381a;
    }
}
