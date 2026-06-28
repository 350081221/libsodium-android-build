package androidx.window.core;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H&J\u0011\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¨\u0006\u0012"}, d2 = {"Landroidx/window/core/SpecificationComputer;", "", "T", "", CrashHianalyticsData.MESSAGE, "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "require", "compute", "()Ljava/lang/Object;", b.f22420d, "createMessage", "<init>", "()V", "Companion", "VerificationMode", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {

    @l
    public static final Companion Companion = new Companion(null);

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0001*\u0002H\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/core/SpecificationComputer$Companion;", "", "()V", "startSpecification", "Landroidx/window/core/SpecificationComputer;", "T", TTDownloadField.TT_TAG, "", "verificationMode", "Landroidx/window/core/SpecificationComputer$VerificationMode;", "logger", "Landroidx/window/core/Logger;", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/SpecificationComputer$VerificationMode;Landroidx/window/core/Logger;)Landroidx/window/core/SpecificationComputer;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i5, Object obj2) {
            if ((i5 & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i5 & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        @l
        public final <T> SpecificationComputer<T> startSpecification(@l T t5, @l String tag, @l VerificationMode verificationMode, @l Logger logger) {
            l0.p(t5, "<this>");
            l0.p(tag, "tag");
            l0.p(verificationMode, "verificationMode");
            l0.p(logger, "logger");
            return new ValidSpecification(t5, tag, verificationMode, logger);
        }
    }

    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/core/SpecificationComputer$VerificationMode;", "", "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    @m
    public abstract T compute();

    /* JADX INFO: Access modifiers changed from: protected */
    @l
    public final String createMessage(@l Object value, @l String message) {
        l0.p(value, "value");
        l0.p(message, "message");
        return message + " value: " + value;
    }

    @l
    public abstract SpecificationComputer<T> require(@l String str, @l v3.l<? super T, Boolean> lVar);
}
