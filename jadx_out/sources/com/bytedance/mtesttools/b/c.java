package com.bytedance.mtesttools.b;

import android.os.Bundle;
import android.util.Log;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationAdEcpmInfo;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4053a = "c";

    public static void a(String str, a aVar) {
        String str2 = f4053a;
        Log.e(str2, String.format("-------------------------- %1$s --------------------------", "tools error info start"));
        Log.e(str2, String.format("回调方法名称 methodName =  %1$s", str));
        if (aVar != null) {
            Log.e(str2, String.format("error_code = %1$s error_message = %2$s", Integer.valueOf(aVar.f4051c), aVar.f4052d));
        }
        Log.e(str2, String.format("-------------------------- %1$s --------------------------", "tools error info end"));
    }

    public static void b(String str, String str2, MediationAdEcpmInfo mediationAdEcpmInfo, Bundle bundle) {
        String str3;
        String str4 = f4053a;
        Log.e(str4, String.format("-------------------------- %1$s --------------------------", "tools show info start"));
        Log.e(str4, String.format("回调方法名称 methodName =  %1$s", str));
        if (mediationAdEcpmInfo != null) {
            Log.e(str4, String.format("展示广告信息 ：广告位id = %1$s 代码位id = %2$s adnName = %3$s ecpm = %4$s ", str2, mediationAdEcpmInfo.getSlotId(), mediationAdEcpmInfo.getSdkName(), mediationAdEcpmInfo.getEcpm()));
        }
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("customData");
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(bundle.getBoolean("rewardVeridy"));
            objArr[1] = Double.valueOf(bundle.getDouble("rewardAmount"));
            objArr[2] = bundle.getString("rewardName");
            if (bundle2 != null) {
                str3 = bundle2.toString();
            } else {
                str3 = "";
            }
            objArr[3] = str3;
            Log.e(str4, String.format("激励回调信息 ：rewardVerify() = %1$s getAmount() = %2$s getRewardName() = %3$s \ngetCustomData(): \n%4$s ", objArr));
        }
        Log.e(str4, String.format("-------------------------- %1$s --------------------------", "tools show info end"));
    }
}
