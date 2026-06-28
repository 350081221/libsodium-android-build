package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\r\u001a\u00028\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016J\u0011\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/window/core/FailedSpecification;", "", "T", "Landroidx/window/core/SpecificationComputer;", "", CrashHianalyticsData.MESSAGE, "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "require", "compute", "()Ljava/lang/Object;", b.f22420d, "Ljava/lang/Object;", "getValue", TTDownloadField.TT_TAG, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "getMessage", "Landroidx/window/core/Logger;", "logger", "Landroidx/window/core/Logger;", "getLogger", "()Landroidx/window/core/Logger;", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "getVerificationMode", "()Landroidx/window/core/SpecificationComputer$VerificationMode;", "Landroidx/window/core/WindowStrictModeException;", "exception", "Landroidx/window/core/WindowStrictModeException;", "getException", "()Landroidx/window/core/WindowStrictModeException;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Landroidx/window/core/Logger;Landroidx/window/core/SpecificationComputer$VerificationMode;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {

    @l
    private final WindowStrictModeException exception;

    @l
    private final Logger logger;

    @l
    private final String message;

    @l
    private final String tag;

    @l
    private final T value;

    @l
    private final SpecificationComputer.VerificationMode verificationMode;

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(@l T value, @l String tag, @l String message, @l Logger logger, @l SpecificationComputer.VerificationMode verificationMode) {
        List l9;
        l0.p(value, "value");
        l0.p(tag, "tag");
        l0.p(message, "message");
        l0.p(logger, "logger");
        l0.p(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        l0.o(stackTrace, "stackTrace");
        l9 = p.l9(stackTrace, 2);
        Object[] array = l9.toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.exception = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // androidx.window.core.SpecificationComputer
    @m
    public T compute() {
        int i5 = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new j0();
                }
                return null;
            }
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        throw this.exception;
    }

    @l
    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @l
    public final Logger getLogger() {
        return this.logger;
    }

    @l
    public final String getMessage() {
        return this.message;
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
        return this;
    }
}
