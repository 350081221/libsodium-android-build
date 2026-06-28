package com.huawei.hms.analytics;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.type.HAEventType;
import com.huawei.hms.analytics.type.HAParamType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class dc {
    private static final String[] lmn = {"$HA_LOGIN", HAEventType.SIGNIN, "$HA_LOGOUT", HAEventType.SIGNOUT};

    public static boolean klm(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            return System.currentTimeMillis() > Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public static long lmn(String str, long j5) {
        StringBuilder sb;
        String str2;
        long j6 = 5000;
        if (j5 < 5000) {
            sb = new StringBuilder();
            sb.append(str);
            str2 = " below minimum size.";
        } else {
            j6 = 18000000;
            if (j5 <= 18000000) {
                return j5;
            }
            sb = new StringBuilder();
            sb.append(str);
            str2 = " exceeds the maximum size.";
        }
        sb.append(str2);
        HiLog.w("CheckToolsKit", sb.toString());
        return j6;
    }

    private static List<ax> lmn(Map<String, String> map, Map<String, String> map2) {
        String str;
        boolean z4 = map instanceof LinkedHashMap;
        long j5 = 0;
        ArrayList arrayList = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            boolean z5 = false;
            if (TextUtils.isEmpty(key) || TextUtils.isEmpty(value)) {
                HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE001, "tags param is null");
            } else {
                if (key.length() > 64) {
                    str = "Length of log tag key exceeds the limit. Max Length is 64.";
                } else if (value.length() > 256) {
                    str = "Length of log tag value exceeds the limit. Max Length is 256.";
                } else {
                    z5 = lmn("logTag", key, am.ikl);
                }
                HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE002, str);
            }
            if (z5) {
                if (z4) {
                    map2.put(key, value);
                    j5++;
                    if (j5 >= 50) {
                        break;
                    }
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(new ax(key, value));
                }
            }
        }
        return arrayList;
    }

    public static Map<String, String> lmn(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map == null || map.size() == 0) {
            HiLog.w("CheckToolsKit", "custom log tags is empty");
            return linkedHashMap;
        }
        List<ax> lmn2 = lmn(map, linkedHashMap);
        if (lmn2 != null && lmn2.size() > 0) {
            lmn(lmn2, linkedHashMap);
        }
        return linkedHashMap;
    }

    private static void lmn(List<ax> list, Map<String, String> map) {
        Collections.sort(list, new df());
        int i5 = 0;
        for (ax axVar : list) {
            map.put(axVar.lmn, (String) axVar.klm);
            i5++;
            if (i5 >= 50) {
                return;
            }
        }
    }

    public static boolean lmn(long j5, long j6) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j5);
        calendar2.setTimeInMillis(j6);
        return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
    }

    public static boolean lmn(Object obj) {
        return (obj instanceof Number) || (obj instanceof String) || (obj instanceof Character) || (obj instanceof Boolean);
    }

    public static boolean lmn(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "checkProperty: key is empty";
        } else {
            if (str.length() <= 256 && !str.startsWith("ha_")) {
                return true;
            }
            str2 = "checkProperty: key check failed";
        }
        HiLog.w("CheckToolsKit", str2);
        return false;
    }

    public static boolean lmn(String str, int i5) {
        if (TextUtils.isEmpty(str)) {
            HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE001, " param is null");
            return false;
        }
        if (str.length() <= i5) {
            return true;
        }
        HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE002, " Length of param exceeds the limit. Max Length is ".concat(String.valueOf(i5)));
        return false;
    }

    public static boolean lmn(String str, Bundle bundle) {
        if (bundle == null || bundle.isEmpty() || TextUtils.isEmpty(str) || !Arrays.asList(lmn).contains(str)) {
            return false;
        }
        String string = bundle.getString("$HA_METHOD");
        String string2 = bundle.getString(HAParamType.CHANNEL);
        if (!"Account Kit".equals(string) && !"Account Kit".equals(string2)) {
            return false;
        }
        HiLog.w("CheckToolsKit", "params value Account Kit is illegal");
        return true;
    }

    public static boolean lmn(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            HiLog.w("CheckToolsKit", "checkProperty: key is empty");
            return false;
        }
        if (str2 != null && TextUtils.isEmpty(str2)) {
            HiLog.w("CheckToolsKit", "checkProperty: value is empty");
            return false;
        }
        if (str.length() > 256 || str.startsWith("ha_")) {
            HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE002, "Length of userProperty key exceeds the limit. Max Length is 256.");
            return false;
        }
        if (str2 == null || str2.length() <= 256) {
            return lmn("userProfileParams", str, am.ikl);
        }
        HiLog.w("CheckToolsKit", HiLog.ErrorCode.PE002, "Length of userProperty value exceeds the limit. Max Length is 256.");
        return false;
    }

    public static boolean lmn(String str, String str2, Pattern pattern) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str2)) {
            str3 = str + " is null";
            str4 = HiLog.ErrorCode.PE001;
        } else {
            if (pattern.matcher(str2).matches()) {
                return true;
            }
            str3 = str + " is invalid.";
            str4 = HiLog.ErrorCode.PE006;
        }
        HiLog.w("CheckToolsKit", str4, str3);
        return false;
    }

    public static boolean lmn(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
