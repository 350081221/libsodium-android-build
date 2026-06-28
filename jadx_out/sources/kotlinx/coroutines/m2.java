package kotlinx.coroutines;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import java.util.concurrent.CancellationException;

@kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/m2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/l0;", "", "fillInStackTrace", "createCopy", "", "toString", "", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "Lkotlinx/coroutines/l2;", ServiceManagerNative.JOB, "Lkotlinx/coroutines/l2;", CrashHianalyticsData.MESSAGE, "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/l2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,76:1\n26#2:77\n*S KotlinDebug\n*F\n+ 1 Exceptions.kt\nkotlinx/coroutines/JobCancellationException\n*L\n44#1:77\n*E\n"})
/* loaded from: classes4.dex */
public final class m2 extends CancellationException implements l0<m2> {

    @p4.l
    @u3.e
    public final transient l2 job;

    public m2(@p4.l String str, @p4.m Throwable th, @p4.l l2 l2Var) {
        super(str);
        this.job = l2Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.l0
    @p4.m
    public m2 createCopy() {
        return null;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj != this) {
            if (obj instanceof m2) {
                m2 m2Var = (m2) obj;
                if (!kotlin.jvm.internal.l0.g(m2Var.getMessage(), getMessage()) || !kotlin.jvm.internal.l0.g(m2Var.job, this.job) || !kotlin.jvm.internal.l0.g(m2Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @p4.l
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l0.m(message);
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @p4.l
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
