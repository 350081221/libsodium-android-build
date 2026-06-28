package okhttp3.internal.http;

import android.net.http.Headers;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import m0.a;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", Headers.CONN_DIRECTIVE, "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", a.Z, "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRealInterceptorChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealInterceptorChain.kt\nokhttp3/internal/http/RealInterceptorChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
/* loaded from: classes4.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    @l
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;

    @m
    private final Exchange exchange;
    private final int index;

    @l
    private final List<Interceptor> interceptors;
    private final int readTimeoutMillis;

    @l
    private final Request request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(@l RealCall call, @l List<? extends Interceptor> interceptors, int i5, @m Exchange exchange, @l Request request, int i6, int i7, int i8) {
        l0.p(call, "call");
        l0.p(interceptors, "interceptors");
        l0.p(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i5;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i6;
        this.readTimeoutMillis = i7;
        this.writeTimeoutMillis = i8;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i5, Exchange exchange, Request request, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = realInterceptorChain.index;
        }
        if ((i9 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        Exchange exchange2 = exchange;
        if ((i9 & 4) != 0) {
            request = realInterceptorChain.request;
        }
        Request request2 = request;
        if ((i9 & 8) != 0) {
            i6 = realInterceptorChain.connectTimeoutMillis;
        }
        int i10 = i6;
        if ((i9 & 16) != 0) {
            i7 = realInterceptorChain.readTimeoutMillis;
        }
        int i11 = i7;
        if ((i9 & 32) != 0) {
            i8 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i5, exchange2, request2, i10, i11, i8);
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Call call() {
        return this.call;
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @m
    public Connection connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection$okhttp();
        }
        return null;
    }

    @l
    public final RealInterceptorChain copy$okhttp(int i5, @m Exchange exchange, @l Request request, int i6, int i7, int i8) {
        l0.p(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, i5, exchange, request, i6, i7, i8);
    }

    @l
    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @m
    public final Exchange getExchange$okhttp() {
        return this.exchange;
    }

    public final int getReadTimeoutMillis$okhttp() {
        return this.readTimeoutMillis;
    }

    @l
    public final Request getRequest$okhttp() {
        return this.request;
    }

    public final int getWriteTimeoutMillis$okhttp() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Response proceed(@l Request request) throws IOException {
        boolean z4;
        boolean z5;
        boolean z6;
        l0.p(request, "request");
        boolean z7 = false;
        if (this.index < this.interceptors.size()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.calls++;
            Exchange exchange = this.exchange;
            if (exchange != null) {
                if (exchange.getFinder$okhttp().sameHostAndPort(request.url())) {
                    if (this.calls == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
                }
            }
            RealInterceptorChain copy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
            Interceptor interceptor = this.interceptors.get(this.index);
            Response intercept = interceptor.intercept(copy$okhttp$default);
            if (intercept != null) {
                if (this.exchange != null) {
                    if (this.index + 1 < this.interceptors.size() && copy$okhttp$default.calls != 1) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z5) {
                        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
                    }
                }
                if (intercept.body() != null) {
                    z7 = true;
                }
                if (z7) {
                    return intercept;
                }
                throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Request request() {
        return this.request;
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Interceptor.Chain withConnectTimeout(int i5, @l TimeUnit unit) {
        boolean z4;
        l0.p(unit, "unit");
        if (this.exchange == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", i5, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Interceptor.Chain withReadTimeout(int i5, @l TimeUnit unit) {
        boolean z4;
        l0.p(unit, "unit");
        if (this.exchange == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", i5, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public Interceptor.Chain withWriteTimeout(int i5, @l TimeUnit unit) {
        boolean z4;
        l0.p(unit, "unit");
        if (this.exchange == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", i5, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
