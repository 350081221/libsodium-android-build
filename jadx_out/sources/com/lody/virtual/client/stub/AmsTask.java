package com.lody.virtual.client.stub;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.IAccountManagerResponse;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.lody.virtual.client.env.VirtualRuntime;
import com.lody.virtual.helper.utils.VLog;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class AmsTask extends FutureTask<Bundle> implements AccountManagerFuture<Bundle> {
    final Activity mActivity;
    final AccountManagerCallback<Bundle> mCallback;
    final Handler mHandler;
    protected final IAccountManagerResponse mResponse;

    /* loaded from: classes3.dex */
    private class Response extends IAccountManagerResponse.Stub {
        private Response() {
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onError(int i5, String str) {
            if (i5 != 4 && i5 != 100 && i5 != 101) {
                AmsTask amsTask = AmsTask.this;
                amsTask.setException(amsTask.convertErrorToException(i5, str));
            } else {
                AmsTask.this.cancel(true);
            }
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onResult(Bundle bundle) {
            Activity activity;
            Intent intent = (Intent) bundle.getParcelable(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (intent != null && (activity = AmsTask.this.mActivity) != null) {
                activity.startActivity(intent);
            } else {
                if (bundle.getBoolean("retry")) {
                    try {
                        AmsTask.this.doWork();
                        return;
                    } catch (RemoteException e5) {
                        throw new RuntimeException(e5);
                    }
                }
                AmsTask.this.set(bundle);
            }
        }
    }

    public AmsTask(Activity activity, Handler handler, AccountManagerCallback<Bundle> accountManagerCallback) {
        super(new Callable<Bundle>() { // from class: com.lody.virtual.client.stub.AmsTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Bundle call() throws Exception {
                throw new IllegalStateException("this should never be called");
            }
        });
        this.mHandler = handler;
        this.mCallback = accountManagerCallback;
        this.mActivity = activity;
        this.mResponse = new Response();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Exception convertErrorToException(int i5, String str) {
        if (i5 == 3) {
            return new IOException(str);
        }
        if (i5 == 6) {
            return new UnsupportedOperationException(str);
        }
        if (i5 == 5) {
            return new AuthenticatorException(str);
        }
        if (i5 == 7) {
            return new IllegalArgumentException(str);
        }
        return new AuthenticatorException(str);
    }

    private Bundle internalGetResult(Long l5, TimeUnit timeUnit) throws OperationCanceledException, IOException, AuthenticatorException {
        try {
            try {
                try {
                    if (l5 == null) {
                        return get();
                    }
                    return get(l5.longValue(), timeUnit);
                } catch (InterruptedException | TimeoutException unused) {
                    cancel(true);
                    throw new OperationCanceledException();
                }
            } catch (CancellationException unused2) {
                throw new OperationCanceledException();
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof IOException)) {
                    if (!(cause instanceof UnsupportedOperationException)) {
                        if (!(cause instanceof AuthenticatorException)) {
                            if (!(cause instanceof RuntimeException)) {
                                if (cause instanceof Error) {
                                    throw ((Error) cause);
                                }
                                throw new IllegalStateException(cause);
                            }
                            throw ((RuntimeException) cause);
                        }
                        throw ((AuthenticatorException) cause);
                    }
                    throw new AuthenticatorException(cause);
                }
                throw ((IOException) cause);
            }
        } finally {
            cancel(true);
        }
    }

    private void postToHandler(Handler handler, final AccountManagerCallback<Bundle> accountManagerCallback, final AccountManagerFuture<Bundle> accountManagerFuture) {
        if (handler == null) {
            handler = VirtualRuntime.getUIHandler();
        }
        handler.post(new Runnable() { // from class: com.lody.virtual.client.stub.AmsTask.2
            @Override // java.lang.Runnable
            public void run() {
                accountManagerCallback.run(accountManagerFuture);
            }
        });
    }

    public abstract void doWork() throws RemoteException;

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        AccountManagerCallback<Bundle> accountManagerCallback = this.mCallback;
        if (accountManagerCallback != null) {
            postToHandler(this.mHandler, accountManagerCallback, this);
        }
    }

    public final AccountManagerFuture<Bundle> start() {
        try {
            doWork();
        } catch (RemoteException e5) {
            setException(e5);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.FutureTask
    public void set(Bundle bundle) {
        if (bundle == null) {
            VLog.e("AccountManager", "the bundle must not be null\n%s", new Exception());
        }
        super.set((AmsTask) bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.accounts.AccountManagerFuture
    public Bundle getResult() throws OperationCanceledException, IOException, AuthenticatorException {
        return internalGetResult(null, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.accounts.AccountManagerFuture
    public Bundle getResult(long j5, TimeUnit timeUnit) throws OperationCanceledException, IOException, AuthenticatorException {
        return internalGetResult(Long.valueOf(j5), timeUnit);
    }
}
