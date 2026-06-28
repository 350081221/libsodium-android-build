package com.ss.android.socialbase.downloader.d;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.huawei.hms.adapter.internal.CommonCode;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.q;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.g;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.i;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {
    public static void a(DownloadTask downloadTask, BaseException baseException, int i5) {
        if (downloadTask == null) {
            return;
        }
        try {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                return;
            }
            x monitorDepend = downloadTask.getMonitorDepend();
            boolean isMonitorStatus = DownloadStatus.isMonitorStatus(i5);
            if (!isMonitorStatus && !(isMonitorStatus = a(downloadInfo.getExtraMonitorStatus(), i5)) && monitorDepend != null && (monitorDepend instanceof com.ss.android.socialbase.downloader.depend.c)) {
                isMonitorStatus = a(((com.ss.android.socialbase.downloader.depend.c) monitorDepend).a(), i5);
            }
            if (isMonitorStatus) {
                try {
                    n depend = downloadTask.getDepend();
                    if (depend != null) {
                        depend.a(downloadInfo, baseException, i5);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                a(monitorDepend, downloadInfo, baseException, i5);
                a(com.ss.android.socialbase.downloader.downloader.c.g(), downloadInfo, baseException, i5);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static boolean a(int[] iArr, int i5) {
        if (iArr != null && iArr.length > 0) {
            for (int i6 : iArr) {
                if (i5 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(x xVar, DownloadInfo downloadInfo, BaseException baseException, int i5) {
        if (xVar == null) {
            return;
        }
        try {
            String b5 = xVar.b();
            if (TextUtils.isEmpty(b5)) {
                b5 = "default";
            }
            JSONObject a5 = a(b5, downloadInfo, baseException, i5);
            if (a5 == null) {
                a5 = new JSONObject();
            }
            xVar.a(a5);
        } catch (Throwable unused) {
        }
    }

    public static void a(b bVar, DownloadInfo downloadInfo, BaseException baseException, int i5) {
        if (bVar == null || !downloadInfo.isNeedSDKMonitor() || TextUtils.isEmpty(downloadInfo.getMonitorScene())) {
            return;
        }
        try {
            JSONObject a5 = a(downloadInfo.getMonitorScene(), downloadInfo, baseException, i5);
            if (a5 == null) {
                a5 = new JSONObject();
            }
            if (i5 == -1) {
                a5.put("status", baseException.getErrorCode());
                bVar.a("download_failed", a5, null, null);
            } else {
                a(i5, a5, downloadInfo);
                bVar.a("download_common", a5, null, null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(int i5, JSONObject jSONObject, DownloadInfo downloadInfo) throws JSONException {
        String str;
        if (i5 == -5) {
            str = "download_uncomplete";
        } else if (i5 == -4) {
            str = "download_cancel";
        } else if (i5 != -3) {
            str = i5 != -2 ? i5 != 0 ? i5 != 2 ? i5 != 6 ? "" : "download_first_start" : "download_start" : "download_create" : "download_pause";
        } else {
            double downloadSpeed = downloadInfo.getDownloadSpeed();
            if (downloadSpeed >= 0.0d) {
                jSONObject.put("download_speed", downloadSpeed);
            }
            str = "download_success";
        }
        jSONObject.put("status", str);
    }

    public static String a(String str) {
        try {
            return TextUtils.isDigitsOnly(str) ? String.valueOf(Long.valueOf(str).longValue() % 100) : "";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static JSONObject a(String str, DownloadInfo downloadInfo, BaseException baseException, int i5) {
        String str2;
        String str3;
        String str4;
        int i6;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                q k5 = com.ss.android.socialbase.downloader.downloader.c.k();
                if (k5 != null) {
                    str2 = k5.b();
                    str3 = a(str2);
                    str4 = k5.a();
                    i6 = k5.c();
                } else {
                    str2 = "";
                    str3 = str2;
                    str4 = str3;
                    i6 = 0;
                }
                String a5 = (baseException == null || !(baseException instanceof g)) ? "" : ((g) baseException).a();
                jSONObject2.put("event_page", str);
                jSONObject2.put("app_id", str4);
                jSONObject2.put("device_id", str2);
                jSONObject2.put("device_id_postfix", str3);
                jSONObject2.put(CommonCode.MapKey.UPDATE_VERSION, i6);
                jSONObject2.put("download_status", i5);
                if (downloadInfo != null) {
                    jSONObject2.put("setting_tag", com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).c("setting_tag"));
                    jSONObject2.put("download_id", downloadInfo.getId());
                    jSONObject2.put("name", downloadInfo.getName());
                    jSONObject2.put("url", downloadInfo.getUrl());
                    jSONObject2.put("save_path", downloadInfo.getSavePath());
                    jSONObject2.put("download_time", downloadInfo.getDownloadTime());
                    jSONObject2.put("cur_bytes", downloadInfo.getCurBytes());
                    jSONObject2.put("total_bytes", downloadInfo.getTotalBytes());
                    jSONObject2.put("network_quality", downloadInfo.getNetworkQuality());
                    int i7 = 1;
                    jSONObject2.put("only_wifi", downloadInfo.isOnlyWifi() ? 1 : 0);
                    jSONObject2.put("need_https_degrade", downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0);
                    jSONObject2.put("https_degrade_retry_used", downloadInfo.isHttpsToHttpRetryUsed() ? 1 : 0);
                    jSONObject2.put(TTDownloadField.TT_MD5, downloadInfo.getMd5() == null ? "" : downloadInfo.getMd5());
                    jSONObject2.put("chunk_count", downloadInfo.getChunkCount());
                    jSONObject2.put("is_force", downloadInfo.isForce() ? 1 : 0);
                    jSONObject2.put("retry_count", downloadInfo.getRetryCount());
                    jSONObject2.put("cur_retry_time", downloadInfo.getCurRetryTime());
                    jSONObject2.put("need_retry_delay", downloadInfo.isNeedRetryDelay() ? 1 : 0);
                    jSONObject2.put("need_reuse_first_connection", downloadInfo.isNeedReuseFirstConnection() ? 1 : 0);
                    jSONObject2.put("default_http_service_backup", downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0);
                    jSONObject2.put("retry_delay_status", downloadInfo.getRetryDelayStatus().ordinal());
                    jSONObject2.put("backup_url_used", downloadInfo.isBackUpUrlUsed() ? 1 : 0);
                    jSONObject2.put("download_byte_error_retry_status", downloadInfo.getByteInvalidRetryStatus().ordinal());
                    jSONObject2.put("forbidden_handler_status", downloadInfo.getAsyncHandleStatus().ordinal());
                    jSONObject2.put("need_independent_process", downloadInfo.isNeedIndependentProcess() ? 1 : 0);
                    jSONObject2.put("head_connection_error_msg", downloadInfo.getHeadConnectionException() != null ? downloadInfo.getHeadConnectionException() : "");
                    jSONObject2.put("extra", downloadInfo.getExtra() != null ? downloadInfo.getExtra() : "");
                    if (!downloadInfo.isAddListenerToSameTask()) {
                        i7 = 0;
                    }
                    jSONObject2.put("add_listener_to_same_task", i7);
                    jSONObject2.put("backup_url_count", downloadInfo.getBackUpUrls() != null ? downloadInfo.getBackUpUrls().size() : 0);
                    jSONObject2.put("cur_backup_url_index", downloadInfo.getBackUpUrls() != null ? downloadInfo.getCurBackUpUrlIndex() : -1);
                    jSONObject2.put("forbidden_urls", downloadInfo.getForbiddenBackupUrls() != null ? downloadInfo.getForbiddenBackupUrls().toString() : "");
                    jSONObject2.put("task_id", TextUtils.isEmpty(downloadInfo.getTaskId()) ? "" : downloadInfo.getTaskId());
                    try {
                        String url = downloadInfo.getUrl();
                        if (TextUtils.isEmpty(url)) {
                            str5 = "";
                            str6 = str5;
                            str7 = str6;
                        } else {
                            Uri parse = Uri.parse(url);
                            str6 = parse.getHost();
                            str7 = parse.getPath();
                            str5 = parse.getLastPathSegment();
                            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str5)) {
                                try {
                                    str7 = str7.substring(0, str7.length() - str5.length());
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                        jSONObject2.put("url_host", str6);
                        jSONObject2.put("url_path", str7);
                        jSONObject2.put("url_last_path_segment", str5);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                jSONObject2.put("error_code", baseException != null ? baseException.getErrorCode() : 0);
                jSONObject2.put("error_msg", baseException != null ? baseException.getErrorMessage() : "");
                jSONObject2.put("request_log", a5);
                return jSONObject2;
            } catch (JSONException e5) {
                e = e5;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e6) {
            e = e6;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:12|(4:68|69|70|(16:72|73|15|(2:49|(1:(2:57|(1:59)(2:60|61)))(1:54))|18|19|(2:23|24)|27|28|29|(1:31)|32|33|(1:45)|36|(2:40|42)(1:39)))|14|15|(0)|49|(1:51)|(0)|18|19|(3:21|23|24)|27|28|29|(0)|32|33|(0)|43|45|36|(0)|40|42) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9 A[Catch: JSONException -> 0x0114, all -> 0x013a, TryCatch #0 {JSONException -> 0x0114, blocks: (B:29:0x00ad, B:31:0x00e9, B:32:0x00fa), top: B:28:0x00ad, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0058 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #3 {all -> 0x013a, blocks: (B:70:0x002f, B:72:0x0033, B:19:0x007f, B:21:0x0095, B:27:0x00a8, B:29:0x00ad, B:31:0x00e9, B:32:0x00fa, B:40:0x012e, B:43:0x0120, B:45:0x0126, B:48:0x0115, B:49:0x0047, B:51:0x004d, B:57:0x0058, B:61:0x0065, B:65:0x006b, B:67:0x0077, B:77:0x002c, B:69:0x0025), top: B:12:0x0023, inners: #0, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@androidx.annotation.Nullable com.ss.android.socialbase.downloader.network.g r14, java.lang.String r15, java.lang.String r16, long r17, java.lang.String r19, int r20, java.io.IOException r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.a.a(com.ss.android.socialbase.downloader.network.g, java.lang.String, java.lang.String, long, java.lang.String, int, java.io.IOException, com.ss.android.socialbase.downloader.model.DownloadInfo):void");
    }

    public static void a(com.ss.android.socialbase.downloader.g.a aVar, DownloadInfo downloadInfo, String str, i iVar, boolean z4, boolean z5, BaseException baseException, long j5, long j6, boolean z6, long j7, long j8, long j9, JSONObject jSONObject) {
        a("download_io", aVar.b("monitor_download_io"), aVar, downloadInfo, str, null, null, iVar, z4, z5, baseException, j5, j6, z6, j7, j8, j9, null);
    }

    public static void a(com.ss.android.socialbase.downloader.g.a aVar, DownloadInfo downloadInfo, String str, String str2, String str3, boolean z4, i iVar, BaseException baseException, long j5, long j6) {
        a("segment_io", aVar.b("monitor_segment_io"), aVar, downloadInfo, str, str2, str3, iVar, z4, false, baseException, j5, j6, false, -1L, -1L, -1L, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x0063, B:19:0x006e, B:22:0x0075, B:24:0x0081, B:25:0x008b, B:29:0x0098, B:31:0x009c, B:32:0x00a2, B:34:0x00a6, B:36:0x00ba, B:38:0x0107, B:39:0x0118, B:41:0x012a, B:43:0x0133, B:44:0x014e, B:53:0x0181, B:56:0x016d, B:58:0x0173, B:66:0x004b, B:69:0x005c, B:70:0x0058), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x0063, B:19:0x006e, B:22:0x0075, B:24:0x0081, B:25:0x008b, B:29:0x0098, B:31:0x009c, B:32:0x00a2, B:34:0x00a6, B:36:0x00ba, B:38:0x0107, B:39:0x0118, B:41:0x012a, B:43:0x0133, B:44:0x014e, B:53:0x0181, B:56:0x016d, B:58:0x0173, B:66:0x004b, B:69:0x005c, B:70:0x0058), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x0063, B:19:0x006e, B:22:0x0075, B:24:0x0081, B:25:0x008b, B:29:0x0098, B:31:0x009c, B:32:0x00a2, B:34:0x00a6, B:36:0x00ba, B:38:0x0107, B:39:0x0118, B:41:0x012a, B:43:0x0133, B:44:0x014e, B:53:0x0181, B:56:0x016d, B:58:0x0173, B:66:0x004b, B:69:0x005c, B:70:0x0058), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x0063, B:19:0x006e, B:22:0x0075, B:24:0x0081, B:25:0x008b, B:29:0x0098, B:31:0x009c, B:32:0x00a2, B:34:0x00a6, B:36:0x00ba, B:38:0x0107, B:39:0x0118, B:41:0x012a, B:43:0x0133, B:44:0x014e, B:53:0x0181, B:56:0x016d, B:58:0x0173, B:66:0x004b, B:69:0x005c, B:70:0x0058), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:6:0x0016, B:8:0x002d, B:17:0x0063, B:19:0x006e, B:22:0x0075, B:24:0x0081, B:25:0x008b, B:29:0x0098, B:31:0x009c, B:32:0x00a2, B:34:0x00a6, B:36:0x00ba, B:38:0x0107, B:39:0x0118, B:41:0x012a, B:43:0x0133, B:44:0x014e, B:53:0x0181, B:56:0x016d, B:58:0x0173, B:66:0x004b, B:69:0x005c, B:70:0x0058), top: B:5:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r19, int r20, com.ss.android.socialbase.downloader.g.a r21, com.ss.android.socialbase.downloader.model.DownloadInfo r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, com.ss.android.socialbase.downloader.network.i r26, boolean r27, boolean r28, com.ss.android.socialbase.downloader.exception.BaseException r29, long r30, long r32, boolean r34, long r35, long r37, long r39, org.json.JSONObject r41) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.a.a(java.lang.String, int, com.ss.android.socialbase.downloader.g.a, com.ss.android.socialbase.downloader.model.DownloadInfo, java.lang.String, java.lang.String, java.lang.String, com.ss.android.socialbase.downloader.network.i, boolean, boolean, com.ss.android.socialbase.downloader.exception.BaseException, long, long, boolean, long, long, long, org.json.JSONObject):void");
    }

    public static void a(DownloadInfo downloadInfo, List<com.ss.android.socialbase.downloader.f.i> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("segments", com.ss.android.socialbase.downloader.f.i.a(list));
            jSONObject.put("cur_bytes", downloadInfo.getCurBytes());
            jSONObject.put("total_bytes", downloadInfo.getTotalBytes());
            c Q = com.ss.android.socialbase.downloader.downloader.c.Q();
            if (Q != null) {
                Q.a(downloadInfo.getId(), "segments_error", jSONObject);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
