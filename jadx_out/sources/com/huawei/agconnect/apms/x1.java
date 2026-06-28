package com.huawei.agconnect.apms;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.custom.CustomTrace;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.tendcloud.tenddata.aa;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class x1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static String abc(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append(aa.f11324a);
            sb.append(url.getHost());
            if (url.getPort() != -1) {
                sb.append(":");
                sb.append(url.getPort());
            }
            sb.append(url.getPath());
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean abc(int i5, int i6, int i7) {
        return i5 >= 0 && i5 < i6 && i6 <= i7;
    }

    public static String bcd() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName() + "->";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String cde(String str) {
        if (str == null) {
            return "measure name is null";
        }
        String trim = str.trim();
        if (trim.length() > 100) {
            return String.format(Locale.ENGLISH, "measure name exceeds %d characters.", 100);
        }
        if (trim.matches(CustomTrace.NAME_RULE)) {
            return null;
        }
        return "measure name contains special characters";
    }

    public static String def(String str) {
        if (str == null) {
            return "the customTrace name is null, cannot start custom trace. CustomTrace name is invalid.";
        }
        if (str.length() > 100) {
            return String.format(Locale.ENGLISH, "customTrace name exceeds %d characters, cannot start custom trace '%s'. CustomTrace name is invalid.", 100, str);
        }
        if (!str.matches(CustomTrace.NAME_RULE)) {
            return "customTrace name must not contain special characters.";
        }
        return null;
    }

    public static boolean bcd(String str) {
        return !TextUtils.isEmpty(str) && str.matches("[0-9]+");
    }

    public static boolean cde() {
        try {
            Class.forName("com.huawei.agconnect.remoteconfig.AGConnectConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            abc.warn("cannot found AGConnectConfig class");
            return false;
        }
    }

    public static String abc() {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i5 = 0;
        for (int i6 = 0; i6 < stackTrace.length; i6++) {
            StackTraceElement stackTraceElement = stackTrace[i6];
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                if (!(className.startsWith(HiAnalyticsManager.HTTP_HEADER) || (className.startsWith("dalvik.system.VMStack") && methodName.startsWith("getThreadStackTrace")) || (className.startsWith("java.lang.Thread") && methodName.startsWith("getStackTrace")))) {
                    sb.append(stackTraceElement.toString());
                    if (i6 <= stackTrace.length - 1) {
                        sb.append("\n");
                    }
                    i5++;
                    if (i5 >= uvw.bcd().def) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return sb.toString();
    }

    public static String abc(Map.Entry<String, String> entry) {
        String key = entry.getKey();
        String value = entry.getValue();
        if (key == null) {
            return "property key is null";
        }
        if (value == null) {
            return "property value is null";
        }
        String trim = key.trim();
        String trim2 = value.trim();
        if (trim.length() > 40) {
            return String.format(Locale.ENGLISH, "property key length exceeds %d characters", 40);
        }
        if (trim2.length() > 100) {
            return String.format(Locale.ENGLISH, "property value length exceeds %d characters", 100);
        }
        if (trim.matches(CustomTrace.NAME_RULE)) {
            return null;
        }
        return "property name contains special characters";
    }

    public static String abc(Map<String, String> map, String str) {
        if (map.containsKey(str) || map.size() < 5) {
            return null;
        }
        return String.format(Locale.ENGLISH, "exceeds max limit number of properties - %d", 5);
    }

    public static String abc(Context context) throws Exception {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            abc.error("getVersionName fail");
            return "";
        }
    }

    public static String abc(String str, StringBuffer stringBuffer, String str2, String str3, int i5) {
        String str4;
        str4 = "";
        if (str.startsWith(str2)) {
            str4 = stringBuffer.toString().length() != 0 ? stringBuffer.toString() : "";
            stringBuffer.setLength(0);
        } else if (!str.startsWith(str3) && stringBuffer.length() <= i5) {
            StringBuilder abc2 = abc.abc(str);
            abc2.append(System.lineSeparator());
            stringBuffer.append(abc2.toString());
        }
        return str4;
    }

    public static List<tuv> abc(List<String> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                String[] split = list.get(i6).split("##");
                if (split.length > 0 && (str = split[0]) != null && str.length() > 0 && !split[0].contains("not attached")) {
                    tuv tuvVar = new tuv();
                    int indexOf = split[0].indexOf("\"");
                    int lastIndexOf = split[0].lastIndexOf("\"");
                    int indexOf2 = split[0].indexOf("prio=");
                    int lastIndexOf2 = split[0].lastIndexOf("tid=");
                    int length = split[0].length();
                    if (indexOf >= 0 && lastIndexOf > 0) {
                        int i7 = indexOf + 1;
                        if (abc(i7, lastIndexOf, length)) {
                            tuvVar.abc = split[0].substring(i7, lastIndexOf);
                        }
                    }
                    if (indexOf2 >= 0 && lastIndexOf2 > 0) {
                        int i8 = indexOf2 + 5;
                        int i9 = lastIndexOf2 - 1;
                        if (abc(i8, i9, length)) {
                            String substring = split[0].substring(i8, i9);
                            if (bcd(substring)) {
                                tuvVar.cde = Integer.parseInt(substring);
                            }
                        }
                    }
                    if (lastIndexOf2 > 0 && lastIndexOf2 <= length) {
                        String[] split2 = split[0].substring(lastIndexOf2).split(" ");
                        if (split2.length > 1) {
                            tuvVar.def = split2[1];
                        }
                    }
                    tuvVar.bcd = list.get(i6);
                    tuvVar.asJsonArray();
                    if (tuvVar.asJsonArray().toString() != null) {
                        i5 = tuvVar.asJsonArray().toString().length() + i5;
                    }
                    if (i5 <= 92160) {
                        arrayList.add(tuvVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void abc(stu stuVar, String str) {
        try {
            if (str.startsWith("Max memory") && abc(str.indexOf("Max memory") + 11, str.length() - 2, str.length())) {
                String substring = str.substring(str.indexOf("Max memory") + 11, str.length() - 2);
                if (bcd(substring)) {
                    stuVar.abc = Long.parseLong(substring) * 1024 * 1024;
                }
            }
            if (str.startsWith("Total memory") && abc(str.indexOf("Total memory") + 13, str.length() - 2, str.length())) {
                String substring2 = str.substring(str.indexOf("Total memory") + 13, str.length() - 2);
                if (bcd(substring2)) {
                    stuVar.bcd = (Long.parseLong(substring2) * 1024) - 0;
                }
            }
            if (str.startsWith("Free memory") && !str.contains("until") && abc(str.indexOf("Free memory") + 12, str.length() - 2, str.length())) {
                String substring3 = str.substring(str.indexOf("Free memory") + 12, str.length() - 2);
                if (bcd(substring3)) {
                    stuVar.cde = Long.parseLong(substring3) * 1024;
                }
            }
            if (str.contains("MemAvailable")) {
                String[] split = str.split(":");
                if (split.length > 1) {
                    String[] split2 = split[1].trim().split(" ");
                    if (split2.length > 0 && bcd(split2[0])) {
                        long parseLong = Long.parseLong(split2[0]) * 1024;
                        stuVar.def = parseLong;
                        stuVar.ghi = parseLong <= 0;
                    }
                }
            }
            if (str.contains("MemTotal")) {
                String[] split3 = str.split(":");
                if (split3.length > 1) {
                    String[] split4 = split3[1].trim().split(" ");
                    if (split4.length > 0 && bcd(split4[0])) {
                        stuVar.efg = Long.parseLong(split4[0]) * 1024;
                    }
                }
            }
            if (str.contains("MemFree")) {
                String[] split5 = str.split(":");
                if (split5.length > 1) {
                    String[] split6 = split5[1].trim().split(" ");
                    if (split6.length <= 0 || !bcd(split6[0])) {
                        return;
                    }
                    stuVar.fgh = Long.parseLong(split6[0]) * 1024;
                }
            }
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("setAnrMemoryInfo error :"), abc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #3 {all -> 0x00b8, blocks: (B:98:0x00ab, B:32:0x00c1, B:35:0x00cb, B:38:0x00d5, B:41:0x00df, B:43:0x00e5, B:45:0x00ef), top: B:97:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5 A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #3 {all -> 0x00b8, blocks: (B:98:0x00ab, B:32:0x00c1, B:35:0x00cb, B:38:0x00d5, B:41:0x00df, B:43:0x00e5, B:45:0x00ef), top: B:97:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void abc(android.content.Context r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.x1.abc(android.content.Context, java.lang.String):void");
    }

    public static String abc(int i5, int i6, char c5) {
        String valueOf = String.valueOf(i5);
        if (valueOf.length() >= i6) {
            return valueOf.substring(0, i6);
        }
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < i6 - valueOf.length(); i7++) {
            sb.append(c5);
        }
        sb.append(valueOf);
        return sb.toString();
    }
}
