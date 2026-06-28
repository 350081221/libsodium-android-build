package u2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yuanqi/master/addapp/update/model/VersionData;", "", "()V", CrashHianalyticsData.MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "status", "Lcom/yuanqi/master/addapp/update/model/HiringStageStatus;", "getStatus", "()Lcom/yuanqi/master/addapp/update/model/HiringStageStatus;", "setStatus", "(Lcom/yuanqi/master/addapp/update/model/HiringStageStatus;)V", TTDownloadField.TT_VERSION_NAME, "getVersionName", "setVersionName", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final int f22569d = 8;

    /* renamed from: a, reason: collision with root package name */
    @l
    private String f22570a = "";

    /* renamed from: b, reason: collision with root package name */
    @l
    private String f22571b = "";

    /* renamed from: c, reason: collision with root package name */
    @l
    private a f22572c = a.CURRENT;

    @l
    public final String a() {
        return this.f22571b;
    }

    @l
    public final a b() {
        return this.f22572c;
    }

    @l
    public final String c() {
        return this.f22570a;
    }

    public final void d(@l String str) {
        l0.p(str, "<set-?>");
        this.f22571b = str;
    }

    public final void e(@l a aVar) {
        l0.p(aVar, "<set-?>");
        this.f22572c = aVar;
    }

    public final void f(@l String str) {
        l0.p(str, "<set-?>");
        this.f22570a = str;
    }
}
