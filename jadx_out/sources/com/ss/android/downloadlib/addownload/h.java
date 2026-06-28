package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Environment;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.t;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.DownloadShortInfo;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.g.j;
import com.ss.android.downloadlib.g.n;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h implements n.a {

    /* renamed from: a, reason: collision with root package name */
    public com.ss.android.downloadlib.addownload.b.e f9898a;

    /* renamed from: b, reason: collision with root package name */
    private long f9899b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9900c = false;

    /* renamed from: d, reason: collision with root package name */
    private e f9901d;

    /* renamed from: e, reason: collision with root package name */
    private b f9902e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends com.ss.android.socialbase.downloader.depend.a {

        /* renamed from: a, reason: collision with root package name */
        private com.ss.android.downloadlib.g.n f9908a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(com.ss.android.downloadlib.g.n nVar) {
            this.f9908a = nVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.a, com.ss.android.socialbase.downloader.depend.s
        public void a(DownloadInfo downloadInfo) {
            a(downloadInfo, 11);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onCanceled(DownloadInfo downloadInfo) {
            a(downloadInfo, -4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            a(downloadInfo, -1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPause(DownloadInfo downloadInfo) {
            a(downloadInfo, -2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onPrepare(DownloadInfo downloadInfo) {
            a(downloadInfo, 1);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onProgress(DownloadInfo downloadInfo) {
            a(downloadInfo, 4);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onStart(DownloadInfo downloadInfo) {
            a(downloadInfo, 2);
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public void onSuccessed(DownloadInfo downloadInfo) {
            a(downloadInfo, -3);
        }

        private void a(DownloadInfo downloadInfo, int i5) {
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = downloadInfo;
            obtain.arg1 = i5;
            this.f9908a.sendMessage(obtain);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(DownloadInfo downloadInfo);
    }

    public h(e eVar) {
        this.f9901d = eVar;
    }

    private boolean c() {
        return d() && e();
    }

    private boolean d() {
        DownloadModel downloadModel = this.f9898a.f9659b;
        return (downloadModel == null || TextUtils.isEmpty(downloadModel.getPackageName()) || TextUtils.isEmpty(this.f9898a.f9659b.getDownloadUrl())) ? false : true;
    }

    private boolean e() {
        return this.f9898a.f9661d.isAddToDownloadManage();
    }

    private boolean f() {
        return com.ss.android.downloadlib.g.m.a(this.f9898a.f9659b) && i.a(this.f9898a.f9661d.getLinkMode());
    }

    @Override // com.ss.android.downloadlib.g.n.a
    public void a(Message message) {
    }

    public void b(@Nullable DownloadInfo downloadInfo) {
        b bVar = this.f9902e;
        if (bVar != null) {
            bVar.a(downloadInfo);
            this.f9902e = null;
        }
    }

    private boolean e(DownloadInfo downloadInfo) {
        return !com.ss.android.downloadlib.g.m.a(this.f9898a.f9659b) && f(downloadInfo);
    }

    private boolean f(DownloadInfo downloadInfo) {
        return downloadInfo != null && downloadInfo.getStatus() == -3 && com.ss.android.socialbase.downloader.i.f.d(downloadInfo.getSavePath(), downloadInfo.getName());
    }

    public void a(long j5) {
        this.f9899b = j5;
        com.ss.android.downloadlib.addownload.b.e e5 = com.ss.android.downloadlib.addownload.b.f.a().e(j5);
        this.f9898a = e5;
        if (e5.x()) {
            com.ss.android.downloadlib.e.c.a().a("setAdId ModelBox notValid");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(DownloadInfo downloadInfo) {
        if (!i.a(this.f9898a.f9659b) || this.f9900c) {
            return;
        }
        com.ss.android.downloadlib.d.a.a().a("file_status", (downloadInfo == null || !com.ss.android.downloadlib.g.m.b(downloadInfo.getTargetFilePath())) ? 2 : 1, this.f9898a);
        this.f9900c = true;
    }

    private void b(final t tVar) {
        String str;
        if (com.ss.android.downloadlib.g.j.b("android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (tVar != null) {
                tVar.a();
                return;
            }
            return;
        }
        if (com.ss.android.downloadlib.g.m.a()) {
            str = "android.permission.READ_MEDIA_IMAGES";
            if (com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_IMAGES") || com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_AUDIO") || com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_VIDEO")) {
                if (tVar != null) {
                    tVar.a();
                    return;
                }
                return;
            }
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        com.ss.android.downloadlib.g.j.a(new String[]{str}, new j.a() { // from class: com.ss.android.downloadlib.addownload.h.2
            @Override // com.ss.android.downloadlib.g.j.a
            public void a() {
                t tVar2 = tVar;
                if (tVar2 != null) {
                    tVar2.a();
                }
            }

            @Override // com.ss.android.downloadlib.g.j.a
            public void a(String str2) {
                t tVar2 = tVar;
                if (tVar2 != null) {
                    tVar2.a(str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(DownloadInfo downloadInfo) {
        return f() || e(downloadInfo);
    }

    public void a(DownloadInfo downloadInfo) {
        this.f9900c = false;
        b(downloadInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Context context, int i5, boolean z4) {
        if (com.ss.android.downloadlib.g.m.a(this.f9898a.f9659b)) {
            com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(this.f9898a.f9658a);
            if (d5 != null) {
                com.ss.android.socialbase.downloader.notification.b.a().f(d5.s());
            }
            return com.ss.android.downloadlib.b.a.a(this.f9898a);
        }
        if (a(i5) && !TextUtils.isEmpty(this.f9898a.f9659b.getPackageName()) && k.j().optInt("disable_market") != 1) {
            if (com.ss.android.downloadlib.b.a.a(this.f9898a, i5)) {
                return true;
            }
            return this.f9901d.i() && this.f9901d.d(true);
        }
        if (!z4 || this.f9898a.f9661d.getDownloadMode() != 4 || this.f9901d.e()) {
            return false;
        }
        this.f9901d.c(true);
        return true;
    }

    @Nullable
    public String b() {
        File externalFilesDir = k.a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null) {
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        if (externalFilesDir.exists()) {
            return externalFilesDir.getAbsolutePath();
        }
        return null;
    }

    @NonNull
    public static List<com.ss.android.download.api.download.a> b(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Object obj : map.values()) {
                if (obj instanceof com.ss.android.download.api.download.a) {
                    arrayList.add((com.ss.android.download.api.download.a) obj);
                } else {
                    if (obj instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) obj;
                        if (softReference.get() instanceof com.ss.android.download.api.download.a) {
                            arrayList.add((com.ss.android.download.api.download.a) softReference.get());
                        }
                    }
                    if (obj instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference.get() instanceof com.ss.android.download.api.download.a) {
                            arrayList.add((com.ss.android.download.api.download.a) weakReference.get());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean a(int i5) {
        if (this.f9898a.f9661d.getDownloadMode() == 2 && i5 == 2) {
            return true;
        }
        return this.f9898a.f9661d.getDownloadMode() == 2 && i5 == 1 && k.j().optInt("disable_lp_if_market", 0) == 1;
    }

    public boolean a(int i5, DownloadModel downloadModel) {
        return com.ss.android.socialbase.appdownloader.f.e.c() && a(i5) && !com.ss.android.downloadlib.g.m.a(downloadModel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(boolean z4) {
        return !z4 && this.f9898a.f9661d.getDownloadMode() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull final t tVar) {
        if (!TextUtils.isEmpty(this.f9898a.f9659b.getFilePath())) {
            String filePath = this.f9898a.f9659b.getFilePath();
            if (filePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                tVar.a();
                return;
            } else {
                try {
                    if (filePath.startsWith(k.a().getExternalCacheDir().getParent())) {
                        tVar.a();
                        return;
                    }
                } catch (Exception unused) {
                }
            }
        }
        b(new t() { // from class: com.ss.android.downloadlib.addownload.h.1
            @Override // com.ss.android.download.api.config.t
            public void a() {
                tVar.a();
            }

            @Override // com.ss.android.download.api.config.t
            public void a(String str) {
                k.d().a(1, k.a(), h.this.f9898a.f9659b, "您已禁止使用存储权限，请授权后再下载", null, 1);
                com.ss.android.downloadlib.d.a.a().b(h.this.f9899b, 1);
                tVar.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Message message, DownloadShortInfo downloadShortInfo, Map<Integer, Object> map) {
        b bVar;
        if (message == null || message.what != 3) {
            return;
        }
        DownloadInfo downloadInfo = (DownloadInfo) message.obj;
        int i5 = message.arg1;
        if (i5 != 1 && i5 != 6 && i5 == 2) {
            if (downloadInfo.getIsFirstDownload()) {
                com.ss.android.downloadlib.g a5 = com.ss.android.downloadlib.g.a();
                com.ss.android.downloadlib.addownload.b.e eVar = this.f9898a;
                a5.a(eVar.f9659b, eVar.f9661d, eVar.f9660c);
                downloadInfo.setFirstDownload(false);
            }
            com.ss.android.downloadlib.d.a.a().a(downloadInfo);
        }
        downloadShortInfo.updateFromNewDownloadInfo(downloadInfo);
        j.a(downloadShortInfo);
        int a6 = com.ss.android.socialbase.appdownloader.c.a(downloadInfo.getStatus());
        long totalBytes = downloadInfo.getTotalBytes();
        int curBytes = totalBytes > 0 ? (int) ((downloadInfo.getCurBytes() * 100) / totalBytes) : 0;
        if ((totalBytes > 0 || com.ss.android.socialbase.downloader.g.a.c().a("fix_click_start")) && (bVar = this.f9902e) != null) {
            bVar.a(downloadInfo);
            this.f9902e = null;
        }
        for (DownloadStatusChangeListener downloadStatusChangeListener : a(map)) {
            if (a6 != 1) {
                if (a6 == 2) {
                    downloadStatusChangeListener.onDownloadPaused(downloadShortInfo, j.a(downloadInfo.getId(), curBytes));
                } else if (a6 == 3) {
                    if (downloadInfo.getStatus() == -4) {
                        downloadStatusChangeListener.onIdle();
                    } else if (downloadInfo.getStatus() == -1) {
                        downloadStatusChangeListener.onDownloadFailed(downloadShortInfo);
                    } else if (downloadInfo.getStatus() == -3) {
                        if (com.ss.android.downloadlib.g.m.a(this.f9898a.f9659b)) {
                            downloadStatusChangeListener.onInstalled(downloadShortInfo);
                        } else {
                            downloadStatusChangeListener.onDownloadFinished(downloadShortInfo);
                        }
                    }
                }
            } else if (downloadInfo.getStatus() != 11) {
                downloadStatusChangeListener.onDownloadActive(downloadShortInfo, j.a(downloadInfo.getId(), curBytes));
            } else {
                Iterator<com.ss.android.download.api.download.a> it = b(map).iterator();
                while (it.hasNext()) {
                    it.next().a(downloadInfo);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.f9902e == null) {
            this.f9902e = new b() { // from class: com.ss.android.downloadlib.addownload.h.3
                @Override // com.ss.android.downloadlib.addownload.h.b
                public void a(DownloadInfo downloadInfo) {
                    com.ss.android.downloadlib.d.a.a().a(h.this.f9899b, 2, downloadInfo);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(Context context, IDownloadListener iDownloadListener) {
        com.ss.android.downloadlib.addownload.c.a aVar;
        com.ss.android.socialbase.downloader.model.c a5;
        if (context == null) {
            return 0;
        }
        Map<String, String> headers = this.f9898a.f9659b.getHeaders();
        ArrayList arrayList = new ArrayList();
        if (k.j().optInt("enable_send_click_id_in_apk", 1) == 1 && !TextUtils.isEmpty(this.f9898a.f9659b.getLogExtra()) && (a5 = a(this.f9898a.f9659b.getLogExtra())) != null) {
            arrayList.add(a5);
        }
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (entry != null) {
                    arrayList.add(new com.ss.android.socialbase.downloader.model.c(entry.getKey(), entry.getValue()));
                }
            }
        }
        String a6 = com.ss.android.downloadlib.g.d.a(String.valueOf(this.f9898a.f9659b.getId()), this.f9898a.f9659b.getNotificationJumpUrl(), this.f9898a.f9659b.isShowToast(), String.valueOf(this.f9898a.f9659b.getModelType()));
        com.ss.android.socialbase.downloader.g.a b5 = com.ss.android.downloadlib.g.e.b(this.f9898a.f9659b);
        JSONObject a7 = com.ss.android.downloadlib.g.e.a(this.f9898a.f9659b);
        if (!this.f9898a.f9661d.enableAH()) {
            a7 = com.ss.android.downloadlib.g.m.a(a7);
            com.ss.android.downloadlib.g.m.a(a7, "ah_plans", new JSONArray());
        }
        int executorGroup = this.f9898a.f9659b.getExecutorGroup();
        if (this.f9898a.f9659b.isAd() || i.b(this.f9898a.f9659b)) {
            executorGroup = 4;
        }
        String a8 = a(b5);
        DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(com.ss.android.socialbase.downloader.downloader.c.a(this.f9898a.f9659b.getDownloadUrl(), a8));
        if (downloadInfo != null && 3 == this.f9898a.f9659b.getModelType()) {
            downloadInfo.setFirstDownload(true);
        }
        com.ss.android.socialbase.appdownloader.f o5 = new com.ss.android.socialbase.appdownloader.f(context, this.f9898a.f9659b.getDownloadUrl()).b(this.f9898a.f9659b.getBackupUrls()).a(this.f9898a.f9659b.getName()).e(a6).a(arrayList).a(this.f9898a.f9659b.isShowNotification()).c(this.f9898a.f9659b.isNeedWifi()).b(this.f9898a.f9659b.getFileName()).c(a8).k(this.f9898a.f9659b.getAppIcon()).h(this.f9898a.f9659b.getMd5()).j(this.f9898a.f9659b.getSdkMonitorScene()).a(this.f9898a.f9659b.getExpectFileLength()).a(iDownloadListener).l(this.f9898a.f9659b.needIndependentProcess() || b5.a("need_independent_process", 0) == 1).a(this.f9898a.f9659b.getDownloadFileUriProvider()).b(this.f9898a.f9659b.autoInstallWithoutNotification()).g(this.f9898a.f9659b.getPackageName()).d(1000).e(100).a(a7).i(true).j(true).b(b5.a("retry_count", 5)).c(b5.a("backup_url_retry_count", 0)).j(true).m(b5.a("need_head_connection", 0) == 1).d(b5.a("need_https_to_http_retry", 0) == 1).h(b5.a("need_chunk_downgrade_retry", 1) == 1).g(b5.a("need_retry_delay", 0) == 1).i(b5.c("retry_delay_time_array")).k(b5.a("need_reuse_runnable", 0) == 1).f(executorGroup).p(this.f9898a.f9659b.isAutoInstall()).o(this.f9898a.f9659b.distinctDir());
        if (!TextUtils.isEmpty(this.f9898a.f9659b.getMimeType())) {
            o5.f(this.f9898a.f9659b.getMimeType());
        } else {
            o5.f("application/vnd.android.package-archive");
        }
        if (b5.a("notification_opt_2", 0) == 1) {
            o5.a(false);
            o5.b(true);
        }
        if (b5.a("clear_space_use_disk_handler", 0) == 1) {
            aVar = new com.ss.android.downloadlib.addownload.c.a();
            o5.a(aVar);
        } else {
            aVar = null;
        }
        DownloadModel downloadModel = this.f9898a.f9659b;
        if ((downloadModel instanceof AdDownloadModel) && !TextUtils.isEmpty(((AdDownloadModel) downloadModel).getTaskKey())) {
            o5.d(((AdDownloadModel) this.f9898a.f9659b).getTaskKey());
        }
        int a9 = i.a(this.f9898a, c(), o5);
        if (aVar != null) {
            aVar.a(a9);
        }
        return a9;
    }

    private String a(com.ss.android.socialbase.downloader.g.a aVar) {
        boolean z4;
        String str;
        if (!TextUtils.isEmpty(this.f9898a.f9659b.getFilePath())) {
            return this.f9898a.f9659b.getFilePath();
        }
        DownloadInfo a5 = com.ss.android.socialbase.appdownloader.d.j().a(k.a(), this.f9898a.f9659b.getDownloadUrl());
        if (!com.ss.android.downloadlib.g.m.a()) {
            z4 = com.ss.android.downloadlib.g.j.b("android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            z4 = com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_IMAGES") || com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_AUDIO") || com.ss.android.downloadlib.g.j.b("android.permission.READ_MEDIA_VIDEO");
        }
        String b5 = b();
        if (a5 != null && !TextUtils.isEmpty(a5.getSavePath())) {
            String savePath = a5.getSavePath();
            if (z4 || savePath.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                return savePath;
            }
            try {
                if (!TextUtils.isEmpty(b5)) {
                    if (savePath.startsWith(b5)) {
                        return savePath;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).cancel(a5.getId());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("ttdownloader_code", Integer.valueOf(z4 ? 1 : 2));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        com.ss.android.downloadlib.d.a.a().a("label_external_permission", jSONObject, this.f9898a);
        try {
            str = com.ss.android.socialbase.appdownloader.c.b();
        } catch (Exception unused) {
            str = null;
        }
        int a6 = com.ss.android.downloadlib.g.e.a(aVar);
        if (a6 != 0) {
            if (a6 != 4 && (z4 || a6 != 2)) {
                if ((a6 == 3 || (!z4 && a6 == 1)) && !TextUtils.isEmpty(b5)) {
                    return b5;
                }
            } else {
                File filesDir = k.a().getFilesDir();
                if (!filesDir.exists()) {
                    filesDir.mkdirs();
                }
                if (filesDir.exists()) {
                    return filesDir.getAbsolutePath();
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DownloadInfo downloadInfo, boolean z4) {
        if (this.f9898a.f9659b == null || downloadInfo == null || downloadInfo.getId() == 0) {
            return;
        }
        int status = downloadInfo.getStatus();
        if (status != -1 && status != -4) {
            if (i.a(this.f9898a.f9659b)) {
                com.ss.android.downloadlib.d.a.a().a(this.f9899b, 2);
            } else if (z4 && com.ss.android.downloadlib.d.c.a().c() && (status == -2 || status == -3)) {
                com.ss.android.downloadlib.d.a.a().a(this.f9899b, 2);
            }
        } else {
            com.ss.android.downloadlib.d.a.a().a(this.f9899b, 2);
        }
        switch (status) {
            case -4:
            case -1:
                a();
                com.ss.android.downloadlib.addownload.b.f a5 = com.ss.android.downloadlib.addownload.b.f.a();
                com.ss.android.downloadlib.addownload.b.e eVar = this.f9898a;
                a5.a(new com.ss.android.downloadad.api.a.b(eVar.f9659b, eVar.f9660c, eVar.f9661d, downloadInfo.getId()));
                return;
            case -3:
                if (com.ss.android.downloadlib.g.m.a(this.f9898a.f9659b)) {
                    com.ss.android.downloadlib.e.c.a().b("SUCCESSED isInstalledApp");
                    return;
                }
                com.ss.android.downloadlib.d.a.a().a(this.f9899b, 5, downloadInfo);
                if (z4 && com.ss.android.downloadlib.d.c.a().b() && !com.ss.android.downloadlib.d.c.a().b(this.f9899b, this.f9898a.f9659b.getLogExtra())) {
                    com.ss.android.downloadlib.d.a.a().a(this.f9899b, 2);
                    return;
                }
                return;
            case -2:
                com.ss.android.downloadlib.d.a.a().a(this.f9899b, 4, downloadInfo);
                if (z4 && com.ss.android.downloadlib.d.c.a().b() && !com.ss.android.downloadlib.d.c.a().b(this.f9899b, this.f9898a.f9659b.getLogExtra())) {
                    com.ss.android.downloadlib.d.a.a().a(this.f9899b, 2);
                    return;
                }
                return;
            case 0:
            case 6:
            default:
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
                com.ss.android.downloadlib.d.a.a().a(this.f9899b, 3, downloadInfo);
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.ss.android.socialbase.downloader.model.DownloadInfo r6, com.ss.android.download.api.model.DownloadShortInfo r7, java.util.List<com.ss.android.download.api.download.DownloadStatusChangeListener> r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            if (r6 == 0) goto L9f
            if (r7 != 0) goto Ld
            goto L9f
        Ld:
            r0 = 0
            long r1 = r6.getTotalBytes()     // Catch: java.lang.Exception -> L26
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L2a
            long r1 = r6.getCurBytes()     // Catch: java.lang.Exception -> L26
            r3 = 100
            long r1 = r1 * r3
            long r3 = r6.getTotalBytes()     // Catch: java.lang.Exception -> L26
            long r1 = r1 / r3
            int r1 = (int) r1
            goto L2b
        L26:
            r1 = move-exception
            r1.printStackTrace()
        L2a:
            r1 = r0
        L2b:
            if (r1 >= 0) goto L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            r7.updateFromNewDownloadInfo(r6)
            com.ss.android.downloadlib.addownload.j.a(r7)
            java.util.Iterator r8 = r8.iterator()
        L39:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r8.next()
            com.ss.android.download.api.download.DownloadStatusChangeListener r1 = (com.ss.android.download.api.download.DownloadStatusChangeListener) r1
            int r2 = r6.getStatus()
            switch(r2) {
                case -4: goto L89;
                case -3: goto L7f;
                case -2: goto L73;
                case -1: goto L6f;
                case 0: goto L89;
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L63;
                case 5: goto L63;
                case 6: goto L4c;
                case 7: goto L63;
                case 8: goto L63;
                case 9: goto L4c;
                case 10: goto L4c;
                case 11: goto L4d;
                default: goto L4c;
            }
        L4c:
            goto L39
        L4d:
            boolean r2 = r1 instanceof com.ss.android.download.api.download.a
            if (r2 == 0) goto L57
            com.ss.android.download.api.download.a r1 = (com.ss.android.download.api.download.a) r1
            r1.a(r6)
            goto L39
        L57:
            int r2 = r6.getId()
            int r2 = com.ss.android.downloadlib.addownload.j.a(r2, r0)
            r1.onDownloadActive(r7, r2)
            goto L39
        L63:
            int r2 = r6.getId()
            int r2 = com.ss.android.downloadlib.addownload.j.a(r2, r0)
            r1.onDownloadActive(r7, r2)
            goto L39
        L6f:
            r1.onDownloadFailed(r7)
            goto L39
        L73:
            int r2 = r6.getId()
            int r2 = com.ss.android.downloadlib.addownload.j.a(r2, r0)
            r1.onDownloadPaused(r7, r2)
            goto L39
        L7f:
            if (r9 == 0) goto L85
            r1.onInstalled(r7)
            goto L39
        L85:
            r1.onDownloadFinished(r7)
            goto L39
        L89:
            com.ss.android.downloadlib.addownload.b.e r2 = r5.f9898a
            com.ss.android.download.api.download.DownloadModel r2 = r2.f9659b
            boolean r2 = com.ss.android.downloadlib.g.m.a(r2)
            if (r2 == 0) goto L9a
            r2 = -3
            r7.status = r2
            r1.onInstalled(r7)
            goto L39
        L9a:
            r1.onIdle()
            goto L39
        L9e:
            return
        L9f:
            java.util.Iterator r6 = r8.iterator()
        La3:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r6.next()
            com.ss.android.download.api.download.DownloadStatusChangeListener r7 = (com.ss.android.download.api.download.DownloadStatusChangeListener) r7
            r7.onIdle()
            goto La3
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.h.a(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.download.api.model.DownloadShortInfo, java.util.List, boolean):void");
    }

    @NonNull
    public static List<DownloadStatusChangeListener> a(Map<Integer, Object> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Object obj : map.values()) {
                if (obj instanceof DownloadStatusChangeListener) {
                    arrayList.add((DownloadStatusChangeListener) obj);
                } else {
                    if (obj instanceof SoftReference) {
                        SoftReference softReference = (SoftReference) obj;
                        if (softReference.get() instanceof DownloadStatusChangeListener) {
                            arrayList.add((DownloadStatusChangeListener) softReference.get());
                        }
                    }
                    if (obj instanceof WeakReference) {
                        WeakReference weakReference = (WeakReference) obj;
                        if (weakReference.get() instanceof DownloadStatusChangeListener) {
                            arrayList.add((DownloadStatusChangeListener) weakReference.get());
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private com.ss.android.socialbase.downloader.model.c a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return new com.ss.android.socialbase.downloader.model.c("clickid", new JSONObject(str).optString("clickid"));
        } catch (JSONException e5) {
            k.u().a(e5, "parseLogExtra Error");
            return null;
        }
    }
}
