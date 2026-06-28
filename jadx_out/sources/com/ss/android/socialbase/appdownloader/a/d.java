package com.ss.android.socialbase.appdownloader.a;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    public static a a(Context context, String str, JSONObject jSONObject, DownloadInfo downloadInfo) {
        if (downloadInfo == null || context == null || jSONObject == null) {
            return null;
        }
        String savePath = downloadInfo.getSavePath();
        if (TextUtils.isEmpty(savePath) || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(savePath);
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo);
        if (str.equals(com.alipay.sdk.m.x.c.f3016c)) {
            return new j(context, a5, downloadInfo.getTargetFilePath());
        }
        if (str.equals(com.alipay.sdk.m.x.c.f3017d)) {
            return new k(context, a5, file.getAbsolutePath());
        }
        if (str.equals("v3")) {
            return new l(context, a5, file.getAbsolutePath());
        }
        if (str.equals("o1")) {
            return new g(context, a5, file.getAbsolutePath());
        }
        if (str.equals("o2")) {
            return new h(context, a5, file.getAbsolutePath());
        }
        if (str.equals("o3")) {
            String dBJsonString = downloadInfo.getDBJsonString("file_content_uri");
            if (TextUtils.isEmpty(dBJsonString)) {
                return null;
            }
            return new i(context, a5, file.getAbsolutePath(), dBJsonString, downloadInfo.getName());
        }
        if (str.equals("custom")) {
            return new c(context, a5, file.getAbsolutePath(), jSONObject);
        }
        if (!str.equals("vbi")) {
            return null;
        }
        return new m(context, a5, com.ss.android.socialbase.appdownloader.c.a(downloadInfo.getId(), Downloader.getInstance(context).getDownloadFileUriProvider(downloadInfo.getId()), context, com.ss.android.socialbase.appdownloader.d.j().d(), new File(downloadInfo.getSavePath() + File.separator + downloadInfo.getName())).toString());
    }

    public static boolean a(Context context, String str, JSONObject jSONObject, com.ss.android.socialbase.downloader.g.a aVar) {
        a mVar;
        if (context == null || str == null) {
            return false;
        }
        String b5 = com.ss.android.socialbase.appdownloader.c.b();
        if (TextUtils.isEmpty(b5) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.ss.android.socialbase.appdownloader.f.e.d() && str.equals(com.alipay.sdk.m.x.c.f3016c)) {
            mVar = new j(context, aVar, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.d() && str.equals(com.alipay.sdk.m.x.c.f3017d)) {
            mVar = new k(context, aVar, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.d() && str.equals("v3")) {
            mVar = new l(context, aVar, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.e() && str.equals("o1")) {
            mVar = new g(context, aVar, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.e() && str.equals("o2")) {
            mVar = new h(context, aVar, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.e() && str.equals("o3")) {
            mVar = new i(context, aVar, b5, b5, b5);
        } else if (com.ss.android.socialbase.appdownloader.f.e.d() && str.equals("custom")) {
            mVar = new c(context, aVar, b5, jSONObject);
        } else {
            mVar = (com.ss.android.socialbase.appdownloader.f.e.d() && str.equals("vbi")) ? new m(context, aVar, b5) : null;
        }
        return mVar != null && mVar.a();
    }
}
