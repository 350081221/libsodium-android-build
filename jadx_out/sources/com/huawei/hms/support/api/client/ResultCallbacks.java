package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = "ResultCallbacks";

    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r5);

    @Override // com.huawei.hms.support.api.client.ResultCallback
    public final void onResult(R r5) {
        try {
            Status status = r5.getStatus();
            if (status.isSuccess()) {
                onSuccess(r5);
            } else {
                onFailure(status);
                if (r5 instanceof Releasable) {
                    ((Releasable) r5).release();
                }
            }
        } catch (Exception e5) {
            HMSLog.w(TAG, "Failed to release " + r5 + ", reason: " + e5);
        }
    }
}
