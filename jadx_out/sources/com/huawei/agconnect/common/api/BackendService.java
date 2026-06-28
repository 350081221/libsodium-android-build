package com.huawei.agconnect.common.api;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.RequestThrottle;
import com.huawei.agconnect.credential.obs.p;
import com.huawei.agconnect.https.Adapter;
import com.huawei.hmf.tasks.Task;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class BackendService {

    /* loaded from: classes3.dex */
    public enum AccessTokenType {
        MUST,
        EXPECT
    }

    /* loaded from: classes3.dex */
    public static class Options {
        private final boolean accessToken;
        private boolean accessTokenRefreshed;
        private final AccessTokenType accessTokenType;
        private final boolean apiKey;
        private final AGConnectInstance app;
        private final boolean clientToken;
        private boolean clientTokenRefreshed;
        private final Adapter.Factory factory;
        private final RequestThrottle.Throttle throttle;
        private final TimeUnit timeUnit;
        private final long timeout;

        /* loaded from: classes3.dex */
        public static class Builder {
            private boolean accessToken;
            private AccessTokenType accessTokenType;
            private boolean apiKey;
            private AGConnectInstance app;
            private boolean clientToken;
            private Adapter.Factory factory;
            private RequestThrottle.Throttle throttle;
            private TimeUnit timeUnit;
            private long timeout;

            public Builder() {
                this.accessTokenType = AccessTokenType.MUST;
            }

            public Builder(Options options) {
                this.accessTokenType = AccessTokenType.MUST;
                this.apiKey = options.apiKey;
                this.clientToken = options.clientToken;
                this.accessToken = options.accessToken;
                this.throttle = options.throttle;
                this.accessTokenType = options.accessTokenType;
                this.factory = options.factory;
                this.timeout = options.timeout;
                this.timeUnit = options.timeUnit;
                this.app = options.app;
            }

            public Builder accessToken(boolean z4) {
                this.accessToken = z4;
                return this;
            }

            public Builder accessTokenType(AccessTokenType accessTokenType) {
                this.accessTokenType = accessTokenType;
                return this;
            }

            public Builder apiKey(boolean z4) {
                this.apiKey = z4;
                return this;
            }

            public Builder app(AGConnectInstance aGConnectInstance) {
                this.app = aGConnectInstance;
                return this;
            }

            public Options build() {
                return new Options(this.apiKey, this.clientToken, this.accessToken, this.throttle, this.accessTokenType, this.factory, this.timeout, this.timeUnit, this.app);
            }

            public Builder clientToken(boolean z4) {
                this.clientToken = z4;
                return this;
            }

            public Builder factory(Adapter.Factory factory) {
                this.factory = factory;
                return this;
            }

            public Builder throttle(RequestThrottle.Throttle throttle) {
                this.throttle = throttle;
                return this;
            }

            public Builder timeUnit(TimeUnit timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public Builder timeout(long j5) {
                this.timeout = j5;
                return this;
            }
        }

        private Options(boolean z4, boolean z5, boolean z6, RequestThrottle.Throttle throttle, AccessTokenType accessTokenType, Adapter.Factory factory, long j5, TimeUnit timeUnit, AGConnectInstance aGConnectInstance) {
            this.apiKey = z4;
            this.clientToken = z5;
            this.accessToken = z6;
            this.throttle = throttle;
            this.accessTokenType = accessTokenType;
            this.factory = factory;
            this.timeout = j5;
            this.timeUnit = timeUnit;
            this.app = aGConnectInstance;
        }

        public AccessTokenType getAccessTokenType() {
            return this.accessTokenType;
        }

        public AGConnectInstance getApp() {
            return this.app;
        }

        public Adapter.Factory getFactory() {
            return this.factory;
        }

        public RequestThrottle.Throttle getThrottle() {
            return this.throttle;
        }

        public TimeUnit getTimeUnit() {
            return this.timeUnit;
        }

        public long getTimeout() {
            return this.timeout;
        }

        public boolean isAccessToken() {
            return this.accessToken;
        }

        public boolean isAccessTokenRefreshed() {
            return this.accessTokenRefreshed;
        }

        public boolean isApiKey() {
            return this.apiKey;
        }

        public boolean isClientToken() {
            return this.clientToken;
        }

        public boolean isClientTokenRefreshed() {
            return this.clientTokenRefreshed;
        }

        public Builder newBuilder() {
            return new Builder(this);
        }

        public void setAccessTokenRefreshed(boolean z4) {
            this.accessTokenRefreshed = z4;
        }

        public void setClientTokenRefreshed(boolean z4) {
            this.clientTokenRefreshed = z4;
        }
    }

    public static <Rsp> Task<Rsp> sendRequest(BaseRequest baseRequest, int i5, Class<Rsp> cls, Options options) {
        return p.b(baseRequest, i5, cls, options);
    }
}
