package com.umeng.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.au;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f12959a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final String f12960b = "umeng+";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12961c = "ek__id";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12962d = "ek_key";

    /* renamed from: e, reason: collision with root package name */
    private static String f12963e = "";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12964f = au.b().b(au.f12206n);

    /* renamed from: g, reason: collision with root package name */
    private static String f12965g = "";

    /* renamed from: h, reason: collision with root package name */
    private static a f12966h;

    private a() {
    }

    public static a a() {
        if (f12966h == null) {
            synchronized (a.class) {
                if (f12966h == null) {
                    f12966h = new a();
                }
            }
        }
        return f12966h;
    }

    private String c(String str) {
        String str2 = "";
        try {
            String substring = str.substring(1, 9);
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < substring.length(); i5++) {
                char charAt = substring.charAt(i5);
                if (Character.isDigit(charAt)) {
                    if (Integer.parseInt(Character.toString(charAt)) == 0) {
                        sb.append(0);
                    } else {
                        sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                    }
                } else {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
            return str2 + new StringBuilder(str2).reverse().toString();
        } catch (Throwable unused) {
            return str2;
        }
    }

    public String b(String str) {
        String str2;
        String str3;
        try {
            if (!TextUtils.isEmpty(f12959a)) {
                return new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f12959a.getBytes()));
            }
            return str;
        } catch (Exception unused) {
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败!");
            String str4 = null;
            if (TextUtils.isEmpty(f12963e)) {
                return null;
            }
            UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试");
            try {
                str3 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f12963e.getBytes()));
            } catch (Exception unused2) {
            }
            try {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试成功。");
                return str3;
            } catch (Exception unused3) {
                str4 = str3;
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，换老秘钥重试失败。换子进程备份key重试。");
                try {
                    String str5 = new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f12965g.getBytes()));
                    try {
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试成功。");
                        return str5;
                    } catch (Throwable unused4) {
                        str2 = str5;
                        UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程事件数据解密失败，子进程备份key重试失败。");
                        return str2;
                    }
                } catch (Throwable unused5) {
                    str2 = str4;
                }
            }
        }
    }

    public void a(Context context) {
        try {
            if (TextUtils.isEmpty(f12959a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, f12961c);
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    f12963e = c(multiProcessSP);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> primaryKey: " + f12963e);
                }
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f12964f, 0);
                if (sharedPreferences != null) {
                    f12965g = sharedPreferences.getString(f12961c, null);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> 子进程备份秘钥：主进程key: " + f12965g);
                }
                f12959a = c(UMUtils.genId());
                UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>>> 正式秘钥：key: " + f12959a);
            }
        } catch (Throwable unused) {
        }
    }

    public String a(String str) {
        try {
            return TextUtils.isEmpty(f12959a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f12959a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
