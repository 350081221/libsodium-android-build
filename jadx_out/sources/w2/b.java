package w2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Response;
import org.json.JSONObject;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/yuanqi/master/network/interceptor/HandleErrorInterceptor;", "Lcom/yuanqi/master/network/interceptor/ResponseBodyInterceptor;", "()V", "intercept", "Lokhttp3/Response;", "response", "url", "", "body", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22624b = 0;

    @Override // w2.c
    @l
    public Response a(@l Response response, @l String url, @l String body) {
        JSONObject jSONObject;
        l0.p(response, "response");
        l0.p(url, "url");
        l0.p(body, "body");
        try {
            jSONObject = new JSONObject(body);
        } catch (Exception e5) {
            e5.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.optInt(PluginConstants.KEY_ERROR_CODE, -1) != 200 && jSONObject.has(CrashHianalyticsData.MESSAGE)) {
            throw new IOException(jSONObject.getString(CrashHianalyticsData.MESSAGE));
        }
        return response;
    }
}
