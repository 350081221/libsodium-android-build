package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import t0.b;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016J\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/window/core/ValidSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "", CrashHianalyticsData.MESSAGE, "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "require", "compute", "()Ljava/lang/Object;", b.f22420d, "Ljava/lang/Object;", "getValue", TTDownloadField.TT_TAG, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "getVerificationMode", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "Landroidx/window/core/Logger;", "logger", "Landroidx/window/core/Logger;", "getLogger", "()Landroidx/window/core/Logger;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/Logger;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
final class ValidSpecification<T> extends SpecificationComputer<T> {

    @l
    private final Logger logger;

    @l
    private final String tag;

    @l
    private final T value;

    @l
    private final SpecificationComputer.VerificationMode verificationMode;

    public ValidSpecification(@l T value, @l String tag, @l SpecificationComputer.VerificationMode verificationMode, @l Logger logger) {
        l0.p(value, "value");
        l0.p(tag, "tag");
        l0.p(verificationMode, "verificationMode");
        l0.p(logger, "logger");
        this.value = value;
        this.tag = tag;
        this.verificationMode = verificationMode;
        this.logger = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @l
    public T compute() {
        return this.value;
    }

    @l
    public final Logger getLogger() {
        return this.logger;
    }

    @l
    public final String getTag() {
        return this.tag;
    }

    @l
    public final T getValue() {
        return this.value;
    }

    @l
    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    @l
    public SpecificationComputer<T> require(@l String message, @l v3.l<? super T, Boolean> condition) {
        l0.p(message, "message");
        l0.p(condition, "condition");
        if (condition.invoke(this.value).booleanValue()) {
            return this;
        }
        return new FailedSpecification(this.value, this.tag, message, this.logger, this.verificationMode);
    }
}
