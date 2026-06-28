package retrofit2;

import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;

@Instrumented
/* loaded from: classes4.dex */
public final class Response<T> {

    @Nullable
    private final T body;

    @Nullable
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    private Response(okhttp3.Response response, @Nullable T t5, @Nullable ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t5;
        this.errorBody = responseBody;
    }

    public static <T> Response<T> error(int i5, ResponseBody responseBody) {
        Objects.requireNonNull(responseBody, "body == null");
        if (i5 >= 400) {
            Response.Builder protocol = OkHttp3Instrumentation.body(new Response.Builder(), new OkHttpCall.NoContentResponseBody(responseBody.contentType(), responseBody.contentLength())).code(i5).message("Response.error()").protocol(Protocol.HTTP_1_1);
            Request.Builder url = new Request.Builder().url("http://localhost/");
            return error(responseBody, protocol.request(!(url instanceof Request.Builder) ? url.build() : OkHttp3Instrumentation.build(url)).build());
        }
        throw new IllegalArgumentException("code < 400: " + i5);
    }

    public static <T> Response<T> success(@Nullable T t5) {
        Response.Builder protocol = new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1);
        Request.Builder url = new Request.Builder().url("http://localhost/");
        return success(t5, protocol.request(!(url instanceof Request.Builder) ? url.build() : OkHttp3Instrumentation.build(url)).build());
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.code();
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.errorBody;
    }

    public Headers headers() {
        return this.rawResponse.headers();
    }

    public boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public String message() {
        return this.rawResponse.message();
    }

    public okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(int i5, @Nullable T t5) {
        if (i5 >= 200 && i5 < 300) {
            Response.Builder protocol = new Response.Builder().code(i5).message("Response.success()").protocol(Protocol.HTTP_1_1);
            Request.Builder url = new Request.Builder().url("http://localhost/");
            return success(t5, protocol.request(!(url instanceof Request.Builder) ? url.build() : OkHttp3Instrumentation.build(url)).build());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i5);
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (!response.isSuccessful()) {
            return new Response<>(response, null, responseBody);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> Response<T> success(@Nullable T t5, Headers headers) {
        Objects.requireNonNull(headers, "headers == null");
        Response.Builder headers2 = new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers);
        Request.Builder url = new Request.Builder().url("http://localhost/");
        return success(t5, headers2.request(!(url instanceof Request.Builder) ? url.build() : OkHttp3Instrumentation.build(url)).build());
    }

    public static <T> Response<T> success(@Nullable T t5, okhttp3.Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new Response<>(response, t5, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }
}
