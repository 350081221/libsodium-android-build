package io.github.aakira.napier;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.umeng.analytics.pro.bi;
import io.github.aakira.napier.e;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import org.apache.commons.logging.LogFactory;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J5\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H$¨\u0006\u0012"}, d2 = {"Lio/github/aakira/napier/a;", "", "Lio/github/aakira/napier/e$a;", LogFactory.PRIORITY_KEY, "", TTDownloadField.TT_TAG, "", bi.ay, "", "throwable", CrashHianalyticsData.MESSAGE, "Lkotlin/r2;", "b", "d", "(Lio/github/aakira/napier/e$a;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "c", "<init>", "()V", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public abstract class a {
    public boolean a(@l e.a priority, @m String str) {
        l0.p(priority, "priority");
        return true;
    }

    public final void b(@l e.a priority, @m String str, @m Throwable th, @m String str2) {
        l0.p(priority, "priority");
        if (a(priority, str)) {
            c(priority, str, th, str2);
        }
    }

    protected abstract void c(@l e.a aVar, @m String str, @m Throwable th, @m String str2);

    public final void d(@l e.a priority, @m String str, @m Throwable th, @m String str2) {
        l0.p(priority, "priority");
        c(priority, str, th, str2);
    }
}
