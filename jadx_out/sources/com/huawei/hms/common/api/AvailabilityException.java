package com.huawei.hms.common.api;

import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.log.HMSLog;
import com.lody.virtual.server.content.SyncStorageEngine;

/* loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private String TAG = "AvailabilityException";
    private String message = null;

    private ConnectionResult generateConnectionResult(int i5) {
        HMSLog.i(this.TAG, "The availability check result is: " + i5);
        setMessage(i5);
        return new ConnectionResult(i5);
    }

    private void setMessage(int i5) {
        if (i5 != 21) {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            this.message = "INTERNAL_ERROR";
                            return;
                        } else {
                            this.message = "SERVICE_DISABLED";
                            return;
                        }
                    }
                    this.message = "SERVICE_VERSION_UPDATE_REQUIRED";
                    return;
                }
                this.message = "SERVICE_MISSING";
                return;
            }
            this.message = SyncStorageEngine.MESG_SUCCESS;
            return;
        }
        this.message = "ANDROID_VERSION_UNSUPPORT";
    }

    public ConnectionResult getConnectionResult(HuaweiApiCallable huaweiApiCallable) {
        if (huaweiApiCallable != null && huaweiApiCallable.getHuaweiApi() != null) {
            return generateConnectionResult(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApiCallable.getHuaweiApi().getContext(), 30000000));
        }
        HMSLog.e(this.TAG, "The huaweiApi is null.");
        return generateConnectionResult(8);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ConnectionResult getConnectionResult(HuaweiApi<? extends Api.ApiOptions> huaweiApi) {
        if (huaweiApi == null) {
            HMSLog.e(this.TAG, "The huaweiApi is null.");
            return generateConnectionResult(8);
        }
        return generateConnectionResult(HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(huaweiApi.getContext(), 30000000));
    }
}
