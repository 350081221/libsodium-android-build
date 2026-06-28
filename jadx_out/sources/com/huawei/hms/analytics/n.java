package com.huawei.hms.analytics;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* loaded from: classes3.dex */
public final class n extends AbstractClientBuilder<q, Api.ApiOptions.NoOptions> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public final /* synthetic */ q buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new q(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
