package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.CodecLookup;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.IAIDLCallback;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.MessageCodec;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8298b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8299c;

    /* renamed from: d, reason: collision with root package name */
    private String f8300d;

    /* renamed from: e, reason: collision with root package name */
    private String f8301e;

    /* renamed from: f, reason: collision with root package name */
    private volatile IAIDLInvoke f8302f;

    /* renamed from: g, reason: collision with root package name */
    private String f8303g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f8304h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f8305i;

    /* renamed from: l, reason: collision with root package name */
    private List<Scope> f8308l;

    /* renamed from: m, reason: collision with root package name */
    private List<PermissionInfo> f8309m;

    /* renamed from: n, reason: collision with root package name */
    private Map<Api<?>, Api.ApiOptions> f8310n;

    /* renamed from: o, reason: collision with root package name */
    private SubAppInfo f8311o;

    /* renamed from: s, reason: collision with root package name */
    private final ReentrantLock f8315s;

    /* renamed from: t, reason: collision with root package name */
    private final Condition f8316t;

    /* renamed from: u, reason: collision with root package name */
    private ConnectionResult f8317u;

    /* renamed from: v, reason: collision with root package name */
    private HuaweiApiClient.ConnectionCallbacks f8318v;

    /* renamed from: w, reason: collision with root package name */
    private HuaweiApiClient.OnConnectionFailedListener f8319w;

    /* renamed from: x, reason: collision with root package name */
    private Handler f8320x;

    /* renamed from: y, reason: collision with root package name */
    private Handler f8321y;

    /* renamed from: z, reason: collision with root package name */
    private static final Object f8296z = new Object();
    private static final Object A = new Object();

    /* renamed from: a, reason: collision with root package name */
    private int f8297a = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8306j = false;

    /* renamed from: k, reason: collision with root package name */
    private AtomicInteger f8307k = new AtomicInteger(1);

    /* renamed from: p, reason: collision with root package name */
    private long f8312p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f8313q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final Object f8314r = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message != null && message.what == 2) {
                HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service time out");
                if (HuaweiApiClientImpl.this.f8307k.get() == 5) {
                    HuaweiApiClientImpl.this.c(1);
                    HuaweiApiClientImpl.this.b();
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message != null && message.what == 3) {
                HMSLog.e("HuaweiApiClientImpl", "In connect, process time out");
                if (HuaweiApiClientImpl.this.f8307k.get() == 2) {
                    HuaweiApiClientImpl.this.c(1);
                    HuaweiApiClientImpl.this.b();
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    class c extends IAIDLCallback.Stub {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f8324a;

        c(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
            this.f8324a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.IAIDLCallback
        public void call(DataBuffer dataBuffer) {
            if (dataBuffer != null) {
                MessageCodec find = CodecLookup.find(dataBuffer.getProtocol());
                ResponseHeader responseHeader = new ResponseHeader();
                find.decode(dataBuffer.header, responseHeader);
                BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), dataBuffer.getBody());
                HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
                this.f8324a.onResult(bundleResult);
                return;
            }
            HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
            this.f8324a.onResult(new BundleResult(-1, null));
        }
    }

    /* loaded from: classes3.dex */
    static class d extends PendingResultImpl<Status, IMessageEntity> {
        public d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e implements ResultCallback<ResolveResult<ConnectResp>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f8326a;

            a(ResolveResult resolveResult) {
                this.f8326a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.a((ResolveResult<ConnectResp>) this.f8326a);
            }
        }

        private e() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        /* synthetic */ e(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f implements ResultCallback<ResolveResult<DisconnectResp>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f8329a;

            a(ResolveResult resolveResult) {
                this.f8329a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.b((ResolveResult<DisconnectResp>) this.f8329a);
            }
        }

        private f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        /* synthetic */ f(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult != null && resolveResult.getStatus().isSuccess() && (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) != null && value.getStatusCode() == 0) {
                HMSLog.i("HuaweiApiClientImpl", "get notice has intent.");
                Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f8304h.get(), HuaweiApiClientImpl.this.getTopActivity());
                if (validActivity != null) {
                    HuaweiApiClientImpl.this.f8306j = true;
                    validActivity.startActivity(noticeIntent);
                } else {
                    HMSLog.e("HuaweiApiClientImpl", "showNotice no valid activity!");
                }
            }
        }

        /* synthetic */ g(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f8315s = reentrantLock;
        this.f8316t = reentrantLock.newCondition();
        this.f8320x = null;
        this.f8321y = null;
        this.f8298b = context;
        String appId = Util.getAppId(context);
        this.f8299c = appId;
        this.f8300d = appId;
        this.f8301e = Util.getCpId(context);
    }

    private DisconnectInfo d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f8310n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f8308l, arrayList);
    }

    private int e() {
        int hmsVersion = Util.getHmsVersion(this.f8298b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int f5 = f();
        if (g()) {
            if (f5 < 20503000) {
                return 20503000;
            }
            return f5;
        }
        if (f5 < 20600000) {
            return 20600000;
        }
        return f5;
    }

    private int f() {
        Integer num;
        int intValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i5 = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (intValue = num.intValue()) > i5) {
                i5 = intValue;
            }
        }
        return i5;
    }

    private boolean g() {
        Map<Api<?>, Api.ApiOptions> map = this.f8310n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private void h() {
        Handler handler = this.f8320x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f8320x = new Handler(Looper.getMainLooper(), new a());
        }
        this.f8320x.sendEmptyMessageDelayed(2, 5000L);
    }

    private void i() {
        synchronized (A) {
            Handler handler = this.f8321y;
            if (handler != null) {
                handler.removeMessages(3);
            } else {
                this.f8321y = new Handler(Looper.getMainLooper(), new b());
            }
            HMSLog.d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f8321y.sendEmptyMessageDelayed(3, a1.b.f90a));
        }
    }

    private void j() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, c()).setResultCallback(new e(this, null));
    }

    private void k() {
        ConnectService.disconnect(this, d()).setResultCallback(new f(this, null));
    }

    private void l() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, c()).setResultCallback(new e(this, null));
    }

    private void m() {
        if (this.f8306j) {
            HMSLog.i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f8298b) == 0) {
            ConnectService.getNotice(this, 0, "6.5.0.300").setResultCallback(new g(this, null));
        }
    }

    private void n() {
        Util.unBindServiceCatchException(this.f8298b, this);
        this.f8302f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i5, ResultCallback<BundleResult> resultCallback) {
        HMSLog.i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback != null && str != null && bundle != null) {
            if (!innerIsConnected()) {
                HMSLog.e("HuaweiApiClientImpl", "client is unConnect.");
                return CommonCode.ErrorCode.CLIENT_API_INVALID;
            }
            DataBuffer dataBuffer = new DataBuffer(str, i5);
            MessageCodec find = CodecLookup.find(dataBuffer.getProtocol());
            dataBuffer.addBody(bundle);
            RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 60500300, getSessionId());
            requestHeader.setApiNameList(getApiNameList());
            dataBuffer.header = find.encode(requestHeader, new Bundle());
            try {
                getService().asyncCall(dataBuffer, new c(this, resultCallback));
                return 0;
            } catch (RemoteException e5) {
                HMSLog.e("HuaweiApiClientImpl", "remote exception:" + e5.getMessage());
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
        }
        HMSLog.e("HuaweiApiClientImpl", "arguments is invalid.");
        return CommonCode.ErrorCode.ARGUMENTS_INVALID;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (checkUpdatelistener == null) {
            HMSLog.e("HuaweiApiClientImpl", "listener is null!");
        } else {
            checkUpdatelistener.onResult(-1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60500300 ======");
        int i5 = this.f8307k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter connect, Connection Status: " + i5);
        if (i5 == 3 || i5 == 5 || i5 == 2 || i5 == 4) {
            return;
        }
        if (activity != null) {
            this.f8304h = new WeakReference<>(activity);
            this.f8305i = new WeakReference<>(activity);
        }
        this.f8300d = TextUtils.isEmpty(this.f8299c) ? Util.getAppId(this.f8298b) : this.f8299c;
        int e5 = e();
        HMSLog.i("HuaweiApiClientImpl", "connect minVersion:" + e5);
        HuaweiApiAvailability.setServicesVersionCode(e5);
        int isHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f8298b, e5);
        HMSLog.i("HuaweiApiClientImpl", "In connect, isHuaweiMobileServicesAvailable result: " + isHuaweiMobileServicesAvailable);
        this.f8313q = HMSPackageManager.getInstance(this.f8298b).getHmsMultiServiceVersion();
        if (isHuaweiMobileServicesAvailable == 0) {
            c(5);
            if (this.f8302f == null) {
                a();
                return;
            }
            c(2);
            j();
            i();
            return;
        }
        if (this.f8319w != null) {
            b(isHuaweiMobileServicesAvailable);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        String str;
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60500300 ======");
        int i5 = this.f8307k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter forceConnect, Connection Status: " + i5);
        if (i5 != 3 && i5 != 5 && i5 != 2 && i5 != 4) {
            if (TextUtils.isEmpty(this.f8299c)) {
                str = Util.getAppId(this.f8298b);
            } else {
                str = this.f8299c;
            }
            this.f8300d = str;
            l();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f8297a >= 0) {
            AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f8297a);
            return;
        }
        throw new IllegalStateException("disableLifeCycleManagement failed");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new d(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i5 = this.f8307k.get();
        HMSLog.i("HuaweiApiClientImpl", "Enter disconnect, Connection Status: " + i5);
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 == 5) {
                    a(2);
                    c(4);
                    return;
                }
                return;
            }
            c(4);
            k();
            return;
        }
        c(4);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f8310n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f8310n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f8300d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f8317u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f8317u;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f8298b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f8301e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f8298b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f8309m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f8308l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public IAIDLInvoke getService() {
        return this.f8302f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f8303g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f8311o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f8305i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f8314r) {
            if (this.f8319w == onConnectionFailedListener) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f8314r) {
            if (this.f8318v == connectionCallbacks) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f8315s.lock();
            try {
                connect((Activity) null);
                while (isConnecting()) {
                    this.f8316t.await();
                }
                if (isConnected()) {
                    this.f8317u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f8317u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f8315s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f8307k.get() == 3 || this.f8307k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f8313q == 0) {
            this.f8313q = HMSPackageManager.getInstance(this.f8298b).getHmsMultiServiceVersion();
        }
        if (this.f8313q < 20504000) {
            long currentTimeMillis = System.currentTimeMillis() - this.f8312p;
            if (currentTimeMillis > 0 && currentTimeMillis < 300000) {
                return innerIsConnected();
            }
            if (innerIsConnected()) {
                Status status = ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS).getStatus();
                if (status.isSuccess()) {
                    this.f8312p = System.currentTimeMillis();
                    return true;
                }
                int statusCode = status.getStatusCode();
                HMSLog.i("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
                if (statusCode != 907135004) {
                    n();
                    c(1);
                    this.f8312p = System.currentTimeMillis();
                    return false;
                }
                return false;
            }
            return false;
        }
        return innerIsConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i5 = this.f8307k.get();
        return i5 == 2 || i5 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "onPause");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.i("HuaweiApiClientImpl", "onResume");
            this.f8305i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PendingIntent pendingIntent;
        HMSLog.i("HuaweiApiClientImpl", "HuaweiApiClientImpl Enter onServiceConnected.");
        a(2);
        this.f8302f = IAIDLInvoke.Stub.asInterface(iBinder);
        if (this.f8302f == null) {
            HMSLog.e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
            n();
            c(1);
            if (this.f8319w != null) {
                WeakReference<Activity> weakReference = this.f8304h;
                if (weakReference != null && weakReference.get() != null) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f8304h.get(), 10);
                } else {
                    pendingIntent = null;
                }
                ConnectionResult connectionResult = new ConnectionResult(10, pendingIntent);
                this.f8319w.onConnectionFailed(connectionResult);
                this.f8317u = connectionResult;
                return;
            }
            return;
        }
        if (this.f8307k.get() == 5) {
            c(2);
            j();
            i();
        } else if (this.f8307k.get() != 3) {
            n();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f8302f = null;
        c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f8318v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f8314r) {
            if (this.f8319w != onConnectionFailedListener) {
                HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
            } else {
                this.f8319w = null;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f8314r) {
            if (this.f8318v != connectionCallbacks) {
                HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
            } else {
                this.f8318v = null;
            }
        }
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f8310n = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAutoLifecycleClientId(int i5) {
        this.f8297a = i5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f8318v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f8319w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z4) {
        this.f8306j = z4;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f8309m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f8308l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        String str;
        HMSLog.i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (TextUtils.isEmpty(this.f8299c)) {
            str = Util.getAppId(this.f8298b);
        } else {
            str = this.f8299c;
        }
        if (subAppID.equals(str)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f8311o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i5) {
        this.f8307k.set(i5);
        if (i5 == 1 || i5 == 3 || i5 == 2) {
            this.f8315s.lock();
            try {
                this.f8316t.signalAll();
            } finally {
                this.f8315s.unlock();
            }
        }
    }

    private void b(int i5) {
        PendingIntent pendingIntent;
        WeakReference<Activity> weakReference = this.f8304h;
        if (weakReference == null || weakReference.get() == null) {
            pendingIntent = null;
        } else {
            pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f8304h.get(), i5);
            HMSLog.i("HuaweiApiClientImpl", "connect 2.0 fail: " + i5);
        }
        ConnectionResult connectionResult = new ConnectionResult(i5, pendingIntent);
        this.f8319w.onConnectionFailed(connectionResult);
        this.f8317u = connectionResult;
    }

    private void a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f8298b).getServiceAction());
        HMSPackageManager.getInstance(this.f8298b).refreshForMultiService();
        intent.setPackage(HMSPackageManager.getInstance(this.f8298b).getHMSPackageNameForMultiService());
        synchronized (f8296z) {
            if (this.f8298b.bindService(intent, this, 1)) {
                h();
                return;
            }
            c(1);
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
            b();
        }
    }

    private ConnectInfo c() {
        String packageSignature = new PackageManagerHelper(this.f8298b).getPackageSignature(this.f8298b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f8311o;
        return new ConnectInfo(getApiNameList(), this.f8308l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        n();
        if (this.f8319w != null) {
            int i5 = UIUtil.isBackground(this.f8298b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f8304h;
            ConnectionResult connectionResult = new ConnectionResult(i5, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f8304h.get(), i5));
            this.f8319w.onConnectionFailed(connectionResult);
            this.f8317u = connectionResult;
        }
    }

    private void c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        c(3);
        this.f8317u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f8318v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f8304h != null) {
            m();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f8304h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        n();
        c(1);
    }

    private void a(int i5) {
        if (i5 == 2) {
            synchronized (f8296z) {
                Handler handler = this.f8320x;
                if (handler != null) {
                    handler.removeMessages(i5);
                    this.f8320x = null;
                }
            }
        }
        if (i5 == 3) {
            synchronized (A) {
                Handler handler2 = this.f8321y;
                if (handler2 != null) {
                    handler2.removeMessages(i5);
                    this.f8321y = null;
                }
            }
        }
        synchronized (f8296z) {
            Handler handler3 = this.f8320x;
            if (handler3 != null) {
                handler3.removeMessages(2);
                this.f8320x = null;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j5, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f8315s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j5);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f8316t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f8317u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f8317u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f8315s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i5) {
        connect((Activity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f8302f != null && this.f8307k.get() == 2) {
            a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f8303g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f8311o;
            PendingIntent pendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f8300d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                n();
                c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f8318v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            n();
            c(1);
            if (this.f8319w != null) {
                WeakReference<Activity> weakReference = this.f8304h;
                if (weakReference != null && weakReference.get() != null) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f8304h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, pendingIntent);
                this.f8319w.onConnectionFailed(connectionResult);
                this.f8317u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }
}
