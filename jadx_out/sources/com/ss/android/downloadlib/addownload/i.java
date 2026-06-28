package com.ss.android.downloadlib.addownload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i {
    public static boolean a(int i5) {
        return i5 == 0 || i5 == 1;
    }

    public static boolean a(DownloadModel downloadModel) {
        return downloadModel.isAd() && (downloadModel instanceof AdDownloadModel) && downloadModel.getModelType() == 1;
    }

    public static boolean b(int i5) {
        return i5 == 2 || i5 == 1;
    }

    public static boolean b(DownloadModel downloadModel) {
        return downloadModel != null && downloadModel.getModelType() == 2;
    }

    public static String c(DownloadModel downloadModel) {
        try {
            if (!TextUtils.isEmpty(downloadModel.getLogExtra())) {
                return new JSONObject(downloadModel.getLogExtra()).optString("clickid");
            }
            return null;
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String d(DownloadModel downloadModel) {
        try {
            if (!TextUtils.isEmpty(downloadModel.getLogExtra())) {
                return new JSONObject(downloadModel.getLogExtra()).optString(AdBaseConstants.MARKET_OPEN_INTENT_EXTRA);
            }
            return null;
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean a(DownloadModel downloadModel, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return downloadModel.isAd() && iDownloadButtonClickListener != null;
    }

    public static int a(@NonNull com.ss.android.downloadlib.addownload.b.e eVar, boolean z4, com.ss.android.socialbase.appdownloader.f fVar) {
        int i5;
        if (fVar == null || TextUtils.isEmpty(fVar.c()) || fVar.b() == null) {
            return 0;
        }
        try {
            i5 = a(fVar, fVar.c());
        } catch (Throwable th) {
            k.u().a(th, "redirectSavePathIfPossible");
            i5 = 4;
        }
        fVar.a(i5);
        if (i5 == 0) {
            fVar.a(new com.ss.android.downloadlib.c.a());
        }
        if (!fVar.ac()) {
            fVar.a(new com.ss.android.downloadlib.c.b());
        }
        int a5 = com.ss.android.socialbase.appdownloader.d.j().a(fVar);
        com.ss.android.downloadad.api.a.b a6 = a(eVar, a5);
        com.ss.android.downloadlib.addownload.b.f.a().a(a6);
        a6.g(a5);
        a6.h(System.currentTimeMillis());
        a6.i(0L);
        com.ss.android.socialbase.downloader.g.a a7 = com.ss.android.socialbase.downloader.g.a.a(fVar.ag());
        if (!a(fVar, a7, a5) && eVar.f9659b.isShowToast()) {
            String startToast = eVar.f9659b.getStartToast();
            if (TextUtils.isEmpty(startToast)) {
                startToast = a7.c("download_start_toast_text");
            }
            if (TextUtils.isEmpty(startToast)) {
                startToast = z4 ? "已开始下载，可在\"我的\"里查看管理" : "已开始下载";
            }
            k.d().a(2, fVar.b(), eVar.f9659b, startToast, null, 0);
        }
        return a5;
    }

    private static com.ss.android.downloadad.api.a.b a(com.ss.android.downloadlib.addownload.b.e eVar, int i5) {
        com.ss.android.downloadad.api.a.b bVar = new com.ss.android.downloadad.api.a.b(eVar.f9659b, eVar.f9660c, eVar.f9661d, i5);
        boolean z4 = true;
        if (com.ss.android.socialbase.downloader.g.a.a(i5).a("download_event_opt", 1) > 1) {
            try {
                String packageName = eVar.f9659b.getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    if (k.a().getPackageManager().getPackageInfo(packageName, 0) == null) {
                        z4 = false;
                    }
                    bVar.h(z4);
                }
            } catch (Throwable unused) {
            }
        }
        return bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        switch(r10) {
            case 0: goto L58;
            case 1: goto L58;
            case 2: goto L57;
            case 3: goto L71;
            case 4: goto L58;
            case 5: goto L58;
            case 6: goto L54;
            case 7: goto L71;
            default: goto L80;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if (com.ss.android.socialbase.appdownloader.b.b(r6, r12).f10183b != 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a2, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00aa, code lost:
    
        if (com.ss.android.socialbase.appdownloader.b.a(r6, r12).f10183b != 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.ss.android.socialbase.appdownloader.f r11, @androidx.annotation.NonNull com.ss.android.socialbase.downloader.g.a r12, int r13) {
        /*
            java.lang.String r11 = "ah_plans"
            org.json.JSONArray r11 = r12.e(r11)
            r0 = 0
            if (r11 == 0) goto Lcd
            int r1 = r11.length()
            if (r1 != 0) goto L11
            goto Lcd
        L11:
            int r1 = r11.length()
            r2 = 0
            r3 = r0
            r4 = r2
        L18:
            r5 = 1
            if (r3 >= r1) goto Lb1
            org.json.JSONObject r6 = r11.optJSONObject(r3)
            if (r6 == 0) goto Lad
            java.lang.String r7 = "type"
            java.lang.String r7 = r6.optString(r7)
            java.lang.String r8 = "plan_c"
            if (r7 == r8) goto L33
            boolean r9 = com.ss.android.socialbase.appdownloader.f.a.a(r6)
            if (r9 != 0) goto L33
            goto Lad
        L33:
            r7.hashCode()
            int r9 = r7.hashCode()
            r10 = -1
            switch(r9) {
                case -985763637: goto L8b;
                case -985763636: goto L80;
                case -985763635: goto L77;
                case -985763634: goto L6c;
                case -985763633: goto L61;
                case -985763632: goto L56;
                case -985763631: goto L4b;
                case -985763630: goto L40;
                default: goto L3e;
            }
        L3e:
            goto L95
        L40:
            java.lang.String r8 = "plan_h"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L49
            goto L95
        L49:
            r10 = 7
            goto L95
        L4b:
            java.lang.String r8 = "plan_g"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L54
            goto L95
        L54:
            r10 = 6
            goto L95
        L56:
            java.lang.String r8 = "plan_f"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L5f
            goto L95
        L5f:
            r10 = 5
            goto L95
        L61:
            java.lang.String r8 = "plan_e"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L6a
            goto L95
        L6a:
            r10 = 4
            goto L95
        L6c:
            java.lang.String r8 = "plan_d"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L75
            goto L95
        L75:
            r10 = 3
            goto L95
        L77:
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7e
            goto L95
        L7e:
            r10 = 2
            goto L95
        L80:
            java.lang.String r8 = "plan_b"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L89
            goto L95
        L89:
            r10 = r5
            goto L95
        L8b:
            java.lang.String r8 = "plan_a"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L94
            goto L95
        L94:
            r10 = r0
        L95:
            switch(r10) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La2;
                case 3: goto Lb1;
                case 4: goto La4;
                case 5: goto La4;
                case 6: goto L99;
                case 7: goto Lb1;
                default: goto L98;
            }
        L98:
            goto Lad
        L99:
            com.ss.android.socialbase.appdownloader.a r6 = com.ss.android.socialbase.appdownloader.b.b(r6, r12)
            int r6 = r6.f10183b
            if (r6 != 0) goto Lad
            goto Lb1
        La2:
            r4 = r6
            goto Lad
        La4:
            com.ss.android.socialbase.appdownloader.a r6 = com.ss.android.socialbase.appdownloader.b.a(r6, r12)
            int r6 = r6.f10183b
            if (r6 != 0) goto Lad
            goto Lb1
        Lad:
            int r3 = r3 + 1
            goto L18
        Lb1:
            if (r4 == 0) goto Lcd
            java.lang.String r11 = "show_unknown_source_on_startup"
            int r11 = r4.optInt(r11)
            if (r11 != r5) goto Lbc
            goto Lbd
        Lbc:
            r5 = r0
        Lbd:
            if (r5 == 0) goto Lcd
            android.content.Context r11 = com.ss.android.socialbase.downloader.downloader.c.O()
            com.ss.android.socialbase.appdownloader.a r12 = new com.ss.android.socialbase.appdownloader.a
            r12.<init>()
            boolean r11 = com.ss.android.socialbase.appdownloader.b.a(r11, r2, r4, r13, r12)
            return r11
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.i.a(com.ss.android.socialbase.appdownloader.f, com.ss.android.socialbase.downloader.g.a, int):boolean");
    }

    public static String a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return null;
        }
        try {
            String extra = downloadInfo.getExtra();
            if (!TextUtils.isEmpty(extra)) {
                return new JSONObject(extra).optString("notification_jump_url", null);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return null;
    }

    private static int a(com.ss.android.socialbase.appdownloader.f fVar, String str) {
        com.ss.android.socialbase.downloader.g.a a5 = com.ss.android.socialbase.downloader.g.a.a(fVar.ag());
        JSONObject d5 = a5.d("download_dir");
        if (d5 == null || TextUtils.isEmpty(d5.optString("dir_name"))) {
            return -1;
        }
        String d6 = fVar.d();
        String N = fVar.N();
        if (TextUtils.isEmpty(N)) {
            N = com.ss.android.socialbase.appdownloader.c.a(str, d6, fVar.n(), true);
        }
        if (N.length() > 255) {
            N = N.substring(N.length() - 255);
        }
        if (TextUtils.isEmpty(d6)) {
            d6 = N;
        }
        String e5 = fVar.e();
        if (TextUtils.isEmpty(e5)) {
            e5 = com.ss.android.socialbase.appdownloader.c.b();
        }
        String str2 = e5 + File.separator + com.ss.android.socialbase.appdownloader.c.a(d6, a5);
        DownloadInfo a6 = com.ss.android.socialbase.appdownloader.d.j().a(fVar.b(), str);
        if (a6 != null && a6.isSavePathRedirected()) {
            fVar.c(a6.getSavePath());
            try {
                fVar.a(new JSONObject(a6.getDownloadSettingString()));
            } catch (Throwable unused) {
            }
            return 0;
        }
        if (a6 != null || !"application/vnd.android.package-archive".equalsIgnoreCase(com.ss.android.socialbase.appdownloader.d.j().a(N, fVar.n()))) {
            return a6 != null ? 8 : 9;
        }
        int a7 = com.ss.android.socialbase.appdownloader.b.a(a5);
        if (a7 == 0) {
            fVar.c(str2);
        }
        return a7;
    }
}
