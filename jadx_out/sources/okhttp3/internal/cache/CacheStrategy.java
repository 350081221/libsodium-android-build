package okhttp3.internal.cache;

import android.net.http.Headers;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.e0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001b\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "networkRequest", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;)V", "getCacheResponse", "()Lokhttp3/Response;", "getNetworkRequest", "()Lokhttp3/Request;", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheStrategy {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private final Response cacheResponse;

    @m
    private final Request networkRequest;

    @i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final boolean isCacheable(@l Response response, @l Request request) {
            l0.p(response, "response");
            l0.p(request, "request");
            int code = response.code();
            if (code != 200 && code != 410 && code != 414 && code != 501 && code != 203 && code != 204) {
                if (code != 307) {
                    if (code != 308 && code != 404 && code != 405) {
                        switch (code) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (Response.header$default(response, OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER, null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate()) {
                    return false;
                }
            }
            if (response.cacheControl().noStore() || request.cacheControl().noStore()) {
                return false;
            }
            return true;
        }
    }

    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "nowMillis", "", "request", "Lokhttp3/Request;", "cacheResponse", "Lokhttp3/Response;", "(JLokhttp3/Request;Lokhttp3/Response;)V", "ageSeconds", "", Headers.ETAG, "", "expires", "Ljava/util/Date;", "lastModified", "lastModifiedString", "receivedResponseMillis", "getRequest$okhttp", "()Lokhttp3/Request;", "sentRequestMillis", "servedDate", "servedDateString", "cacheResponseAge", "compute", "Lokhttp3/internal/cache/CacheStrategy;", "computeCandidate", "computeFreshnessLifetime", "hasConditions", "", "isFreshnessLifetimeHeuristic", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Instrumented
    /* loaded from: classes4.dex */
    public static final class Factory {
        private int ageSeconds;

        @m
        private final Response cacheResponse;

        @m
        private String etag;

        @m
        private Date expires;

        @m
        private Date lastModified;

        @m
        private String lastModifiedString;
        private final long nowMillis;
        private long receivedResponseMillis;

        @l
        private final Request request;
        private long sentRequestMillis;

        @m
        private Date servedDate;

        @m
        private String servedDateString;

        public Factory(long j5, @l Request request, @m Response response) {
            boolean K1;
            boolean K12;
            boolean K13;
            boolean K14;
            boolean K15;
            l0.p(request, "request");
            this.nowMillis = j5;
            this.request = request;
            this.cacheResponse = response;
            this.ageSeconds = -1;
            if (response != null) {
                this.sentRequestMillis = response.sentRequestAtMillis();
                this.receivedResponseMillis = response.receivedResponseAtMillis();
                okhttp3.Headers headers = response.headers();
                int size = headers.size();
                for (int i5 = 0; i5 < size; i5++) {
                    String name = headers.name(i5);
                    String value = headers.value(i5);
                    K1 = e0.K1(name, HTTP.DATE_HEADER, true);
                    if (K1) {
                        this.servedDate = DatesKt.toHttpDateOrNull(value);
                        this.servedDateString = value;
                    } else {
                        K12 = e0.K1(name, OpenStreetMapTileProviderConstants.HTTP_EXPIRES_HEADER, true);
                        if (K12) {
                            this.expires = DatesKt.toHttpDateOrNull(value);
                        } else {
                            K13 = e0.K1(name, "Last-Modified", true);
                            if (K13) {
                                this.lastModified = DatesKt.toHttpDateOrNull(value);
                                this.lastModifiedString = value;
                            } else {
                                K14 = e0.K1(name, "ETag", true);
                                if (K14) {
                                    this.etag = value;
                                } else {
                                    K15 = e0.K1(name, "Age", true);
                                    if (K15) {
                                        this.ageSeconds = Util.toNonNegativeInt(value, -1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        private final long cacheResponseAge() {
            Date date = this.servedDate;
            long j5 = 0;
            if (date != null) {
                j5 = Math.max(0L, this.receivedResponseMillis - date.getTime());
            }
            int i5 = this.ageSeconds;
            if (i5 != -1) {
                j5 = Math.max(j5, TimeUnit.SECONDS.toMillis(i5));
            }
            long j6 = this.receivedResponseMillis;
            return j5 + (j6 - this.sentRequestMillis) + (this.nowMillis - j6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final CacheStrategy computeCandidate() {
            long j5;
            String str;
            Request build;
            Response.Builder newBuilder;
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.request, null);
            }
            if (this.request.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.request, null);
            }
            if (!CacheStrategy.Companion.isCacheable(this.cacheResponse, this.request)) {
                return new CacheStrategy(this.request, null);
            }
            CacheControl cacheControl = this.request.cacheControl();
            if (!cacheControl.noCache() && !hasConditions(this.request)) {
                CacheControl cacheControl2 = this.cacheResponse.cacheControl();
                long cacheResponseAge = cacheResponseAge();
                long computeFreshnessLifetime = computeFreshnessLifetime();
                if (cacheControl.maxAgeSeconds() != -1) {
                    computeFreshnessLifetime = Math.min(computeFreshnessLifetime, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
                }
                long j6 = 0;
                if (cacheControl.minFreshSeconds() != -1) {
                    j5 = TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds());
                } else {
                    j5 = 0;
                }
                if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                    j6 = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
                }
                if (!cacheControl2.noCache()) {
                    long j7 = j5 + cacheResponseAge;
                    if (j7 < j6 + computeFreshnessLifetime) {
                        Response response = this.cacheResponse;
                        if (!(response instanceof Response.Builder)) {
                            newBuilder = response.newBuilder();
                        } else {
                            newBuilder = OkHttp3Instrumentation.newBuilder((Response.Builder) response);
                        }
                        if (j7 >= computeFreshnessLifetime) {
                            newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (cacheResponseAge > 86400000 && isFreshnessLifetimeHeuristic()) {
                            newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new CacheStrategy(null, newBuilder.build());
                    }
                }
                String str2 = this.etag;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.lastModified != null) {
                        str2 = this.lastModifiedString;
                    } else if (this.servedDate != null) {
                        str2 = this.servedDateString;
                    } else {
                        return new CacheStrategy(this.request, null);
                    }
                    str = "If-Modified-Since";
                }
                Headers.Builder newBuilder2 = this.request.headers().newBuilder();
                l0.m(str2);
                newBuilder2.addLenient$okhttp(str, str2);
                Request.Builder headers = this.request.newBuilder().headers(newBuilder2.build());
                if (!(headers instanceof Request.Builder)) {
                    build = headers.build();
                } else {
                    build = OkHttp3Instrumentation.build(headers);
                }
                return new CacheStrategy(build, this.cacheResponse);
            }
            return new CacheStrategy(this.request, null);
        }

        private final long computeFreshnessLifetime() {
            long j5;
            long j6;
            Response response = this.cacheResponse;
            l0.m(response);
            if (response.cacheControl().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.expires;
            if (date != null) {
                Date date2 = this.servedDate;
                if (date2 != null) {
                    j6 = date2.getTime();
                } else {
                    j6 = this.receivedResponseMillis;
                }
                long time = date.getTime() - j6;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            }
            if (this.lastModified == null || this.cacheResponse.request().url().query() != null) {
                return 0L;
            }
            Date date3 = this.servedDate;
            if (date3 != null) {
                j5 = date3.getTime();
            } else {
                j5 = this.sentRequestMillis;
            }
            Date date4 = this.lastModified;
            l0.m(date4);
            long time2 = j5 - date4.getTime();
            if (time2 <= 0) {
                return 0L;
            }
            return time2 / 10;
        }

        private final boolean hasConditions(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        private final boolean isFreshnessLifetimeHeuristic() {
            Response response = this.cacheResponse;
            l0.m(response);
            return response.cacheControl().maxAgeSeconds() == -1 && this.expires == null;
        }

        @l
        public final CacheStrategy compute() {
            CacheStrategy computeCandidate = computeCandidate();
            if (computeCandidate.getNetworkRequest() != null && this.request.cacheControl().onlyIfCached()) {
                return new CacheStrategy(null, null);
            }
            return computeCandidate;
        }

        @l
        public final Request getRequest$okhttp() {
            return this.request;
        }
    }

    public CacheStrategy(@m Request request, @m Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    @m
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @m
    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
