package com.huawei.agconnect.credential.obs;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BaseRequest;
import com.huawei.agconnect.https.annotation.Field;
import com.huawei.agconnect.https.annotation.Url;

/* loaded from: classes3.dex */
public class ag extends BaseRequest {

    @Url
    private static final String REQUEST_URL = "http://localhost/agc/apigw/router";

    @Field("appId")
    private String appId;

    @Field("appVersion")
    private String appVersion;

    @Field("clientId")
    private String clientId;

    @Field(TTDownloadField.TT_PACKAGE_NAME)
    private String packageName;

    @Field("productId")
    private String productId;

    @Field("serviceName")
    String serviceName;

    public ag(AGConnectInstance aGConnectInstance) {
        super(aGConnectInstance);
        this.productId = getHeaderProductId();
        this.appId = getHeaderAppId();
        this.appVersion = getAppVersion();
        this.packageName = getPackageName();
        this.clientId = getHeaderClientId();
        this.serviceName = "agconnect-credential";
    }

    public void a(String str) {
        if (str != null) {
            this.serviceName = str;
        }
    }
}
