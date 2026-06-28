package w2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.efs.sdk.base.Constants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.a0;
import org.apache.http.protocol.HTTP;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/yuanqi/master/network/interceptor/ResponseBodyInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "response", "url", "", "body", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22625a = 0;

    @l
    public abstract Response a(@l Response response, @l String str, @l String str2);

    @Override // okhttp3.Interceptor
    @l
    public Response intercept(@l Interceptor.Chain chain) {
        boolean K1;
        Charset UTF_8;
        l0.p(chain, "chain");
        Request request = chain.request();
        String httpUrl = request.url().toString();
        Response proceed = chain.proceed(request);
        ResponseBody body = proceed.body();
        if (body != null) {
            long contentLength = body.contentLength();
            BufferedSource source = body.source();
            source.request(Long.MAX_VALUE);
            okio.l g5 = source.g();
            K1 = e0.K1(Constants.CP_GZIP, proceed.headers().get(HTTP.CONTENT_ENCODING), true);
            if (K1) {
                a0 a0Var = new a0(g5.clone());
                try {
                    g5 = new okio.l();
                    g5.G(a0Var);
                    kotlin.io.c.a(a0Var, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(a0Var, th);
                        throw th2;
                    }
                }
            }
            MediaType contentType = body.contentType();
            if (contentType == null || (UTF_8 = contentType.charset(StandardCharsets.UTF_8)) == null) {
                UTF_8 = StandardCharsets.UTF_8;
                l0.o(UTF_8, "UTF_8");
            }
            if (contentLength != 0) {
                return a(proceed, httpUrl, g5.clone().j0(UTF_8));
            }
            return proceed;
        }
        return proceed;
    }
}
