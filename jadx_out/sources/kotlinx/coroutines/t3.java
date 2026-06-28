package kotlinx.coroutines;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.concurrent.CancellationException;

@kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/t3;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/l0;", "createCopy", "Lkotlinx/coroutines/l2;", "coroutine", "Lkotlinx/coroutines/l2;", "", CrashHianalyticsData.MESSAGE, "<init>", "(Ljava/lang/String;Lkotlinx/coroutines/l2;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
/* loaded from: classes4.dex */
public final class t3 extends CancellationException implements l0<t3> {

    @p4.m
    @u3.e
    public final transient l2 coroutine;

    public t3(@p4.l String str, @p4.m l2 l2Var) {
        super(str);
        this.coroutine = l2Var;
    }

    @Override // kotlinx.coroutines.l0
    @p4.l
    public t3 createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        t3 t3Var = new t3(message, this.coroutine);
        t3Var.initCause(this);
        return t3Var;
    }

    public t3(@p4.l String str) {
        this(str, null);
    }
}
