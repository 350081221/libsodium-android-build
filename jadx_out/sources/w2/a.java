package w2;

import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.yuanqi.group.App;
import com.yuanqi.master.mine.MineActivity;
import com.yuanqi.master.tools.v0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/network/interceptor/CustomInterceptor;", "Lokhttp3/Interceptor;", "type", "", "(I)V", "getType", "()I", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class a implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22622b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f22623a;

    public a(int i5) {
        this.f22623a = i5;
    }

    public final int a() {
        return this.f22623a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.Interceptor
    @l
    public Response intercept(@l Interceptor.Chain chain) {
        Request build;
        Response.Builder newBuilder;
        Response.Builder body;
        l0.p(chain, "chain");
        Request request = chain.request();
        Request.Builder newBuilder2 = request.newBuilder();
        v0 v0Var = v0.f15260a;
        App.a aVar = App.f13716d;
        App a5 = aVar.a();
        l0.m(a5);
        Request.Builder method = newBuilder2.header("version", String.valueOf(v0Var.e(a5))).method(request.method(), request.body());
        if (!(method instanceof Request.Builder)) {
            build = method.build();
        } else {
            build = OkHttp3Instrumentation.build(method);
        }
        Response proceed = chain.proceed(build);
        ResponseBody body2 = proceed.body();
        l0.m(body2);
        MediaType contentType = body2.contentType();
        ResponseBody body3 = proceed.body();
        l0.m(body3);
        String string = body3.string();
        if (proceed.isSuccessful() && this.f22623a == 0) {
            try {
                if (new JSONObject(string).getInt(PluginConstants.KEY_ERROR_CODE) == 503) {
                    com.yuanqi.master.mine.account.a.f14786a.m();
                    App a6 = aVar.a();
                    l0.m(a6);
                    Toast.makeText(a6.getApplicationContext(), "登录失效，请重新登录", 1).show();
                    MineActivity a7 = MineActivity.f14760b.a();
                    if (a7 != null) {
                        a7.finish();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        ResponseBody create = ResponseBody.Companion.create(string, contentType);
        if (!(proceed instanceof Response.Builder)) {
            newBuilder = proceed.newBuilder();
        } else {
            newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) proceed);
        }
        if (!(newBuilder instanceof Response.Builder)) {
            body = newBuilder.body(create);
        } else {
            body = OkHttp3Instrumentation.body(newBuilder, create);
        }
        return body.build();
    }
}
