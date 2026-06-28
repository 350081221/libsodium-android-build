package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private static final String TAG = "PendingResultImpl";
    private WeakReference<ApiClient> api;
    private CountDownLatch countLatch;
    protected DatagramTransport transport = null;
    private R result = null;
    private String url = null;
    private String transId = null;
    private boolean isNeedReport = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements DatagramTransport.a {
        a() {
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i5, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.setResult(i5, iMessageEntity);
            PendingResultImpl.this.countLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements DatagramTransport.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f8770a;

        b(AtomicBoolean atomicBoolean) {
            this.f8770a = atomicBoolean;
        }

        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i5, IMessageEntity iMessageEntity) {
            if (!this.f8770a.get()) {
                PendingResultImpl.this.setResult(i5, iMessageEntity);
            }
            PendingResultImpl.this.countLatch.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements DatagramTransport.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f8772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResultCallback f8773b;

        c(d dVar, ResultCallback resultCallback) {
            this.f8772a = dVar;
            this.f8773b = resultCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.huawei.hms.support.api.transport.DatagramTransport.a
        public void a(int i5, IMessageEntity iMessageEntity) {
            PendingResultImpl.this.setResult(i5, iMessageEntity);
            this.f8772a.a(this.f8773b, PendingResultImpl.this.result);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class d<R extends Result> extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void a(ResultCallback<? super R> resultCallback, R r5) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r5)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected void b(ResultCallback<? super R> resultCallback, R r5) {
            resultCallback.onResult(r5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                b((ResultCallback) pair.first, (Result) pair.second);
            }
        }
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        init(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    private void biReportEvent(int i5, int i6) {
        SubAppInfo subAppInfo;
        HMSLog.i(TAG, "biReportEvent ====== ");
        ApiClient apiClient = this.api.get();
        if (apiClient != null && this.url != null && !HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HashMap hashMap = new HashMap();
            hashMap.put("package", apiClient.getPackageName());
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "6.5.0.300");
            if (i6 == 1) {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.REQUEST);
            } else {
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, HiAnalyticsConstant.Direction.RESPONSE);
                hashMap.put("result", String.valueOf(i5));
                R r5 = this.result;
                if (r5 != null && r5.getStatus() != null) {
                    hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(this.result.getStatus().getStatusCode()));
                }
            }
            hashMap.put("version", "0");
            String appId = Util.getAppId(apiClient.getContext());
            if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
                appId = subAppInfo.getSubAppID();
            }
            hashMap.put("appid", appId);
            if (TextUtils.isEmpty(this.transId)) {
                String id = TransactionIdCreater.getId(appId, this.url);
                this.transId = id;
                hashMap.put("transId", id);
            } else {
                hashMap.put("transId", this.transId);
                this.transId = null;
            }
            String[] split = this.url.split("\\.");
            if (split.length >= 2) {
                hashMap.put("service", split[0]);
                hashMap.put("apiName", split[1]);
            }
            hashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
            hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
            HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), HiAnalyticsConstant.HMS_SDK_BASE_CALL_AIDL, hashMap);
        }
    }

    private void init(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i5) {
        HMSLog.i(TAG, "init uri:" + str);
        this.url = str;
        if (apiClient == null) {
            HMSLog.e(TAG, "client is null");
            return;
        }
        this.api = new WeakReference<>(apiClient);
        this.countLatch = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i5));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            HMSLog.e(TAG, "gen transport error:" + e5.getMessage());
            throw new IllegalStateException("Instancing transport exception, " + e5.getMessage(), e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setResult(int i5, IMessageEntity iMessageEntity) {
        Status status;
        Status status2;
        HMSLog.i(TAG, "setResult:" + i5);
        if (iMessageEntity instanceof AbstractMessageEntity) {
            status = ((AbstractMessageEntity) iMessageEntity).getCommonStatus();
        } else {
            status = null;
        }
        if (i5 == 0) {
            this.result = onComplete(iMessageEntity);
        } else {
            this.result = onError(i5);
        }
        if (this.isNeedReport) {
            biReportEvent(i5, 2);
        }
        R r5 = this.result;
        if (r5 != null && (status2 = r5.getStatus()) != null && status != null) {
            int statusCode = status2.getStatusCode();
            String statusMessage = status2.getStatusMessage();
            int statusCode2 = status.getStatusCode();
            String statusMessage2 = status.getStatusMessage();
            if (statusCode != statusCode2) {
                HMSLog.e(TAG, "rstStatus code (" + statusCode + ") is not equal commonStatus code (" + statusCode2 + ")");
                HMSLog.e(TAG, "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
                return;
            }
            if (TextUtils.isEmpty(statusMessage) && !TextUtils.isEmpty(statusMessage2)) {
                HMSLog.i(TAG, "rstStatus msg (" + statusMessage + ") is not equal commonStatus msg (" + statusMessage2 + ")");
                this.result.setStatus(new Status(statusCode, statusMessage2, status2.getResolution()));
            }
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        HMSLog.i(TAG, "await");
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread();
        }
        HMSLog.e(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        HMSLog.i(TAG, "awaitOnAnyThread");
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.send(apiClient, new a());
        try {
            this.countLatch.await();
        } catch (InterruptedException unused) {
            HMSLog.e(TAG, "await in anythread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    protected boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    protected Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null && (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) != null) {
            return (Class) type;
        }
        return null;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t5);

    protected R onError(int i5) {
        Type type;
        Class<?> cls;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        } else {
            type = null;
        }
        if (type != null) {
            cls = GenericTypeReflector.getType(type);
        } else {
            cls = null;
        }
        if (cls != null) {
            try {
                R r5 = (R) cls.newInstance();
                this.result = r5;
                r5.setStatus(new Status(i5));
            } catch (Exception e5) {
                HMSLog.e(TAG, "on Error:" + e5.getMessage());
                return null;
            }
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.isNeedReport = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        HMSLog.i(TAG, "setResultCallback");
        if (looper == null) {
            looper = Looper.myLooper();
        }
        d dVar = new d(looper);
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(TAG, "client is invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            dVar.a(resultCallback, this.result);
        } else {
            if (this.isNeedReport) {
                biReportEvent(0, 1);
            }
            this.transport.post(apiClient, new c(dVar, resultCallback));
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j5, TimeUnit timeUnit) {
        HMSLog.i(TAG, "await timeout:" + j5 + " unit:" + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread(j5, timeUnit);
        }
        HMSLog.i(TAG, "await in main thread");
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        init(apiClient, str, iMessageEntity, cls, 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i5) {
        init(apiClient, str, iMessageEntity, getResponseType(), i5);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j5, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j5, TimeUnit timeUnit) {
        HMSLog.i(TAG, "awaitOnAnyThread timeout:" + j5 + " unit:" + timeUnit.toString());
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(TAG, "api is null");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(TAG, "client invalid");
            setResult(CommonCode.ErrorCode.CLIENT_API_INVALID, null);
            return this.result;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new b(atomicBoolean));
        try {
            if (!this.countLatch.await(j5, timeUnit)) {
                atomicBoolean.set(true);
                setResult(CommonCode.ErrorCode.EXECUTE_TIMEOUT, null);
            }
        } catch (InterruptedException unused) {
            HMSLog.e(TAG, "awaitOnAnyThread InterruptedException");
            setResult(CommonCode.ErrorCode.INTERNAL_ERROR, null);
        }
        return this.result;
    }
}
