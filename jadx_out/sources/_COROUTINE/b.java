package _COROUTINE;

import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\"\u001a\u0010\t\u001a\u00020\u00018\u0000X\u0080D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "", "name", "Ljava/lang/StackTraceElement;", "b", bi.ay, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "ARTIFICIAL_FRAME_PACKAGE_NAME", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCoroutineDebugging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineDebugging.kt\n_COROUTINE/CoroutineDebuggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final String f76a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f76a + external.org.apache.commons.lang3.d.f15957a + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    @l
    public static final String c() {
        return f76a;
    }
}
