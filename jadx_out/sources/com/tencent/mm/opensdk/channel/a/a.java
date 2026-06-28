package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import com.umeng.analytics.pro.cx;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0225a {

        /* renamed from: a, reason: collision with root package name */
        public String f11242a;

        /* renamed from: b, reason: collision with root package name */
        public String f11243b;

        /* renamed from: c, reason: collision with root package name */
        public String f11244c;

        /* renamed from: d, reason: collision with root package name */
        public long f11245d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f11246e;
    }

    public static int a(Bundle bundle, String str, int i5) {
        if (bundle == null) {
            return i5;
        }
        try {
            return bundle.getInt(str, i5);
        } catch (Exception e5) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e5.getMessage());
            return i5;
        }
    }

    public static Object a(int i5, String str) {
        try {
            switch (i5) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e5) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e5.getMessage());
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e5) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e5.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, C0225a c0225a) {
        String str;
        String str2;
        if (context == null || c0225a == null) {
            str = "send fail, invalid argument";
        } else {
            if (!b.b(c0225a.f11243b)) {
                if (b.b(c0225a.f11242a)) {
                    str2 = null;
                } else {
                    str2 = c0225a.f11242a + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(c0225a.f11243b);
                Bundle bundle = c0225a.f11246e;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c0225a.f11244c);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c0225a.f11245d);
                intent.putExtra(ConstantsAPI.CHECK_SUM, a(c0225a.f11244c, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str2);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02a1: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:187:0x02a1 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r8, int r9) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.channel.a.a.a(java.lang.String, int):byte[]");
    }

    public static byte[] a(String str, int i5, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i5);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i6 = 0;
            for (byte b5 : digest) {
                int i7 = i6 + 1;
                cArr2[i6] = cArr[(b5 >>> 4) & 15];
                i6 = i7 + 1;
                cArr2[i7] = cArr[b5 & cx.f12477m];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}
