package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class ErrorResultImpl<R extends Result> extends PendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    private R f8764a = null;

    /* renamed from: b, reason: collision with root package name */
    private int f8765b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f8766a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ErrorResultImpl f8767b;

        a(ResultCallback resultCallback, ErrorResultImpl errorResultImpl) {
            this.f8766a = resultCallback;
            this.f8767b = errorResultImpl;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultCallback resultCallback = this.f8766a;
            ErrorResultImpl errorResultImpl = ErrorResultImpl.this;
            resultCallback.onResult(errorResultImpl.a(errorResultImpl.f8765b, this.f8767b));
        }
    }

    public ErrorResultImpl(int i5) {
        this.f8765b = i5;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return await(0L, null);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    protected void postRunnable(Looper looper, ResultCallback<R> resultCallback, ErrorResultImpl errorResultImpl) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        new Handler(looper).post(new a(resultCallback, errorResultImpl));
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j5, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return a(this.f8765b, this);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R a(int i5, ErrorResultImpl errorResultImpl) {
        Type genericSuperclass = errorResultImpl.getClass().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        try {
            R r5 = (R) GenericTypeReflector.getType(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance();
            this.f8764a = r5;
            r5.setStatus(new Status(i5));
        } catch (IllegalAccessException unused) {
            HMSLog.e("ErrorResultImpl", "IllegalAccessException");
        } catch (InstantiationException unused2) {
            HMSLog.e("ErrorResultImpl", "InstantiationException");
        }
        return this.f8764a;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j5, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, ResultCallback<R> resultCallback) {
        postRunnable(looper, resultCallback, this);
    }
}
