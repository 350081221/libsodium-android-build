package retrofit2;

import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.l;
import okio.p1;
import okio.x;
import okio.y0;

/* JADX INFO: Access modifiers changed from: package-private */
@Instrumented
/* loaded from: classes4.dex */
public final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final Call.Factory callFactory;
    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable
    private Throwable creationFailure;

    @GuardedBy("this")
    private boolean executed;

    @GuardedBy("this")
    @Nullable
    private okhttp3.Call rawCall;
    private final RequestFactory requestFactory;
    private final Converter<ResponseBody, T> responseConverter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final BufferedSource delegateSource;

        @Nullable
        IOException thrownException;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = y0.e(new x(responseBody.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.x, okio.n1
                public long read(l lVar, long j5) throws IOException {
                    try {
                        return super.read(lVar, j5);
                    } catch (IOException e5) {
                        ExceptionCatchingResponseBody.this.thrownException = e5;
                        throw e5;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException == null) {
            } else {
                throw iOException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;

        @Nullable
        private final MediaType contentType;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NoContentResponseBody(@Nullable MediaType mediaType, long j5) {
            this.contentType = mediaType;
            this.contentLength = j5;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    private okhttp3.Call createRawCall() throws IOException {
        okhttp3.Call newCall;
        Call.Factory factory = this.callFactory;
        Request create = this.requestFactory.create(this.args);
        if (!(factory instanceof OkHttpClient)) {
            newCall = factory.newCall(create);
        } else {
            newCall = OkHttp3Instrumentation.newCall((OkHttpClient) factory, create);
        }
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    private okhttp3.Call getRawCall() throws IOException {
        okhttp3.Call call = this.rawCall;
        if (call != null) {
            return call;
        }
        Throwable th = this.creationFailure;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            okhttp3.Call createRawCall = createRawCall();
            this.rawCall = createRawCall;
            return createRawCall;
        } catch (IOException | Error | RuntimeException e5) {
            Utils.throwIfFatal(e5);
            this.creationFailure = e5;
            throw e5;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                call = this.rawCall;
                th = this.creationFailure;
                if (call == null && th == null) {
                    try {
                        okhttp3.Call createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        call = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.throwIfFatal(th);
                        this.creationFailure = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th3) {
                try {
                    callback.onFailure(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    th4.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(response));
                    } catch (Throwable th3) {
                        Utils.throwIfFatal(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.throwIfFatal(th4);
                    callFailure(th4);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call rawCall;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                rawCall = getRawCall();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(rawCall.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z4 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.rawCall;
            if (call == null || !call.isCanceled()) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    Response<T> parseResponse(okhttp3.Response response) throws IOException {
        Response.Builder newBuilder;
        Response.Builder body;
        ResponseBody body2 = response.body();
        if (!(response instanceof Response.Builder)) {
            newBuilder = response.newBuilder();
        } else {
            newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) response);
        }
        NoContentResponseBody noContentResponseBody = new NoContentResponseBody(body2.contentType(), body2.contentLength());
        if (!(newBuilder instanceof Response.Builder)) {
            body = newBuilder.body(noContentResponseBody);
        } else {
            body = OkHttp3Instrumentation.body(newBuilder, noContentResponseBody);
        }
        okhttp3.Response build = body.build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body2);
                try {
                    return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), build);
                } catch (RuntimeException e5) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e5;
                }
            }
            body2.close();
            return Response.success((Object) null, build);
        }
        try {
            return Response.error(Utils.buffer(body2), build);
        } finally {
            body2.close();
        }
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create request.", e5);
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized p1 timeout() {
        try {
        } catch (IOException e5) {
            throw new RuntimeException("Unable to create call.", e5);
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.requestFactory, this.args, this.callFactory, this.responseConverter);
    }
}
