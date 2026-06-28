package com.bytedance.sdk.openadsdk.live;

import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface ILiveAdCustomConfig {
    String convertToEnterFromMerge(int i5);

    String convertToEnterMethod(int i5, boolean z4);

    Object invoke(int i5, Bundle bundle);

    void onEventV3(String str, JSONObject jSONObject);

    int openLR(String str);
}
