package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class HuaweiApiClient implements AidlApiClient {

    /* loaded from: classes3.dex */
    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i5);
    }

    /* loaded from: classes3.dex */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener);

    public void connect(int i5) {
        throw new UnsupportedOperationException();
    }

    public abstract void connect(Activity activity);

    public abstract void connectForeground();

    public abstract void disableLifeCycleManagement(Activity activity);

    public abstract PendingResult<Status> discardAndReconnect();

    public abstract void disconnect();

    public abstract Map<Api<?>, Api.ApiOptions> getApiMap();

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public abstract List<PermissionInfo> getPermissionInfos();

    public abstract List<Scope> getScopes();

    public abstract Activity getTopActivity();

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean hasConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean hasConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract ConnectionResult holdUpConnect();

    public abstract ConnectionResult holdUpConnect(long j5, TimeUnit timeUnit);

    @Override // com.huawei.hms.support.api.client.ApiClient
    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void reconnect();

    public abstract void removeConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void removeConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean setSubAppInfo(SubAppInfo subAppInfo);

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final Context f8288a;

        /* renamed from: b, reason: collision with root package name */
        private final List<Scope> f8289b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<PermissionInfo> f8290c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private final Map<Api<?>, Api.ApiOptions> f8291d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private OnConnectionFailedListener f8292e;

        /* renamed from: f, reason: collision with root package name */
        private ConnectionCallbacks f8293f;

        /* renamed from: g, reason: collision with root package name */
        private int f8294g;

        /* renamed from: h, reason: collision with root package name */
        private Activity f8295h;

        public Builder(Context context) throws NullPointerException {
            Checker.checkNonNull(context, "context must not be null.");
            Context applicationContext = context.getApplicationContext();
            this.f8288a = applicationContext;
            this.f8294g = -1;
            ResourceLoaderUtil.setmContext(applicationContext);
            a(context);
        }

        private void a(Context context) {
            HMSBIInitializer.getInstance(context).initBI();
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.f8291d.put(api, null);
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(api.getApiName())) {
                HiAnalyticsUtil.getInstance().onEvent(this.f8288a.getApplicationContext(), HiAnalyticsConstant.KeyAndValue.GAME_INIT_KEY, HiAnalyticsConstant.REPORT_VAL_SEPARATOR + System.currentTimeMillis());
            }
            return this;
        }

        public Builder addApiWithScope(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(scopeArr, "Scopes must not be null");
            this.f8291d.put(api, null);
            this.f8289b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Checker.checkNonNull(connectionCallbacks, "listener must not be null.");
            this.f8293f = connectionCallbacks;
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Checker.checkNonNull(onConnectionFailedListener, "listener must not be null.");
            this.f8292e = onConnectionFailedListener;
            return this;
        }

        public Builder addScope(Scope scope) {
            Checker.checkNonNull(scope, "scope must not be null.");
            this.f8289b.add(scope);
            return this;
        }

        public Builder allowLifeCycleManagement(Activity activity, int i5, OnConnectionFailedListener onConnectionFailedListener) {
            if (i5 >= 0) {
                this.f8294g = i5;
                this.f8295h = (Activity) Preconditions.checkNotNull(activity, "activity must not be Null.");
                return this;
            }
            throw new IllegalArgumentException("allowLifeCycleManagement id should be positive");
        }

        public Builder applyDefaultAccount() {
            return this;
        }

        public HuaweiApiClient build() {
            addApi(new Api<>("Core.API"));
            HuaweiApiClientImpl huaweiApiClientImpl = new HuaweiApiClientImpl(this.f8288a);
            huaweiApiClientImpl.setScopes(this.f8289b);
            huaweiApiClientImpl.setPermissionInfos(this.f8290c);
            huaweiApiClientImpl.setApiMap(this.f8291d);
            huaweiApiClientImpl.setConnectionCallbacks(this.f8293f);
            huaweiApiClientImpl.setConnectionFailedListener(this.f8292e);
            huaweiApiClientImpl.setAutoLifecycleClientId(this.f8294g);
            if (this.f8294g >= 0) {
                a(huaweiApiClientImpl);
            }
            return huaweiApiClientImpl;
        }

        public Builder setAccountName(String str) {
            return this;
        }

        public Builder setHandler(Handler handler) {
            return this;
        }

        public Builder setPopupsGravity(int i5) {
            return this;
        }

        public Builder setViewForPopups(View view) {
            return this;
        }

        private void a(HuaweiApiClient huaweiApiClient) {
            AutoLifecycleFragment.getInstance(this.f8295h).startAutoMange(this.f8294g, huaweiApiClient);
        }

        public Builder allowLifeCycleManagement(Activity activity, OnConnectionFailedListener onConnectionFailedListener) {
            return allowLifeCycleManagement(activity, 0, onConnectionFailedListener);
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApiWithScope(Api<O> api, O o5, Scope... scopeArr) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(o5, "Null options are not permitted for this Api");
            Checker.checkNonNull(scopeArr, "Scopes must not be null");
            this.f8291d.put(api, o5);
            if (api.getOptions() != null) {
                this.f8289b.addAll(api.getOptions().getScopeList(o5));
                this.f8290c.addAll(api.getOptions().getPermissionInfoList(o5));
            }
            this.f8289b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o5) {
            Checker.checkNonNull(api, "Api must not be null");
            Checker.checkNonNull(o5, "Null options are not permitted for this Api");
            this.f8291d.put(api, o5);
            if (api.getOptions() != null) {
                this.f8289b.addAll(api.getOptions().getScopeList(o5));
                this.f8290c.addAll(api.getOptions().getPermissionInfoList(o5));
            }
            return this;
        }
    }
}
