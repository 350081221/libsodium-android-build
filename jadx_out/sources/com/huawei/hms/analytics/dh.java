package com.huawei.hms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class dh {
    public static String lmn(String str) {
        if (!str.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            return an.ikl.contains(str) ? str : "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("\\|")) {
            if (!TextUtils.isEmpty(str2) && an.ikl.contains(str2)) {
                sb.append(str2);
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static List<String> lmn(Context context) {
        String klm = dl.klm(context, "global_v2", "dis_pros", "");
        if (TextUtils.isEmpty(klm)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (klm.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            return Arrays.asList(klm.split("\\|"));
        }
        arrayList.add(klm);
        return arrayList;
    }

    public static void lmn(Context context, String str) {
        dl.lmn(context, "global_v2", "dis_pros", str);
    }
}
