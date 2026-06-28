package com.huawei.agconnect.https;

import com.huawei.hmf.tasks.Task;

/* loaded from: classes3.dex */
public interface Service {

    /* loaded from: classes3.dex */
    public static class Factory {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static Service get(HttpsKit httpsKit) {
            return new d(httpsKit.client(), httpsKit.executor());
        }
    }

    Task<HttpsResult> execute(Method method);
}
