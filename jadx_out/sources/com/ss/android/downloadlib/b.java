package com.ss.android.downloadlib;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.download.DownloadStatusChangeListener;
import com.ss.android.download.api.model.b;
import com.ss.android.downloadad.api.download.AdDownloadController;
import com.ss.android.downloadad.api.download.AdDownloadEventConfig;
import com.ss.android.downloadad.api.download.AdDownloadModel;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.e.b;
import com.ss.android.downloadlib.g.m;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements com.ss.android.downloadad.api.b {

    /* renamed from: a, reason: collision with root package name */
    private static String f9943a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f9944b;

    /* renamed from: c, reason: collision with root package name */
    private i f9945c = i.a(k.a());

    private b() {
    }

    public static DownloadEventConfig c() {
        return new AdDownloadEventConfig.Builder().setClickButtonTag("landing_h5_download_ad_button").setClickItemTag("landing_h5_download_ad_button").setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setClickOpenLabel("click_open_detail").setStorageDenyLabel("storage_deny_detail").setDownloadScene(1).setIsEnableClickEvent(false).setIsEnableNoChargeClickEvent(true).setIsEnableV3Event(false).build();
    }

    public Dialog b(Context context, String str, boolean z4, final DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i5, boolean z5, IDownloadButtonClickListener iDownloadButtonClickListener) {
        if (a(downloadModel.getId())) {
            if (z5) {
                a(downloadModel.getId(), downloadEventConfig, downloadController);
            } else {
                b(downloadModel.getId());
            }
            return null;
        }
        if (context == null || TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            return null;
        }
        this.f9945c.a(context, i5, downloadStatusChangeListener, downloadModel);
        final DownloadEventConfig downloadEventConfig2 = (DownloadEventConfig) m.a(downloadEventConfig, c());
        final DownloadController downloadController2 = (DownloadController) m.a(downloadController, b());
        downloadEventConfig2.setDownloadScene(1);
        if ((downloadController2.enableShowComplianceDialog() && com.ss.android.downloadlib.addownload.compliance.b.a().a(downloadModel)) ? true : (k.j().optInt("disable_lp_dialog", 0) == 1) | z4) {
            this.f9945c.a(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2, iDownloadButtonClickListener);
            return null;
        }
        com.ss.android.downloadlib.g.k.a(f9943a, "tryStartDownload show dialog appName:" + downloadModel.getDownloadUrl(), null);
        Dialog b5 = k.d().b(new b.a(context).a(downloadModel.getName()).b("确认要下载此应用吗？").c("确认").d("取消").a(new b.InterfaceC0178b() { // from class: com.ss.android.downloadlib.b.2
            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void a(DialogInterface dialogInterface) {
                b.this.f9945c.a(downloadModel.getDownloadUrl(), downloadModel.getId(), 2, downloadEventConfig2, downloadController2);
                com.ss.android.downloadlib.d.a.a().a("landing_download_dialog_confirm", downloadModel, downloadEventConfig2, downloadController2);
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void b(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.d.a.a().a("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
                dialogInterface.dismiss();
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void c(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.d.a.a().a("landing_download_dialog_cancel", downloadModel, downloadEventConfig2, downloadController2);
            }
        }).a(0).a());
        com.ss.android.downloadlib.d.a.a().a("landing_download_dialog_show", downloadModel, downloadEventConfig2, downloadController2);
        return b5;
    }

    public static b a() {
        if (f9944b == null) {
            synchronized (b.class) {
                if (f9944b == null) {
                    f9944b = new b();
                }
            }
        }
        return f9944b;
    }

    @Override // com.ss.android.downloadad.api.b
    public Dialog a(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i5) {
        return a(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i5, false);
    }

    @Override // com.ss.android.downloadad.api.b
    public Dialog a(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i5, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return a(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i5, false, iDownloadButtonClickListener);
    }

    public Dialog a(Context context, String str, boolean z4, @NonNull DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, DownloadStatusChangeListener downloadStatusChangeListener, int i5, boolean z5) {
        return a(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i5, z5, null);
    }

    public Dialog a(final Context context, final String str, final boolean z4, @NonNull final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final DownloadStatusChangeListener downloadStatusChangeListener, final int i5, final boolean z5, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return (Dialog) com.ss.android.downloadlib.e.b.a(new b.a<Dialog>() { // from class: com.ss.android.downloadlib.b.1
            @Override // com.ss.android.downloadlib.e.b.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Dialog b() {
                return b.this.b(context, str, z4, downloadModel, downloadEventConfig, downloadController, downloadStatusChangeListener, i5, z5, iDownloadButtonClickListener);
            }
        });
    }

    @Override // com.ss.android.downloadad.api.b
    public boolean a(Context context, long j5, String str, DownloadStatusChangeListener downloadStatusChangeListener, int i5) {
        com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(j5);
        if (d5 != null) {
            this.f9945c.a(context, i5, downloadStatusChangeListener, d5.ai());
            return true;
        }
        DownloadModel a5 = com.ss.android.downloadlib.addownload.b.f.a().a(j5);
        if (a5 == null) {
            return false;
        }
        this.f9945c.a(context, i5, downloadStatusChangeListener, a5);
        return true;
    }

    @Override // com.ss.android.downloadad.api.b
    public boolean a(long j5, int i5) {
        DownloadModel a5 = com.ss.android.downloadlib.addownload.b.f.a().a(j5);
        if (a5 == null) {
            return false;
        }
        this.f9945c.a(a5.getDownloadUrl(), i5);
        return true;
    }

    public void a(long j5, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        DownloadModel a5 = com.ss.android.downloadlib.addownload.b.f.a().a(j5);
        com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(j5);
        if (a5 == null && d5 != null) {
            a5 = d5.ai();
        }
        if (a5 == null) {
            return;
        }
        if (downloadEventConfig != null && downloadController != null && !(downloadEventConfig instanceof com.ss.android.download.api.download.c) && !(downloadController instanceof com.ss.android.download.api.download.b)) {
            downloadEventConfig.setDownloadScene(1);
            this.f9945c.a(a5.getDownloadUrl(), j5, 2, downloadEventConfig, downloadController);
        } else {
            b(j5);
        }
    }

    public void b(long j5) {
        DownloadModel a5 = com.ss.android.downloadlib.addownload.b.f.a().a(j5);
        com.ss.android.downloadad.api.a.b d5 = com.ss.android.downloadlib.addownload.b.f.a().d(j5);
        if (a5 == null && d5 != null) {
            a5 = d5.ai();
        }
        if (a5 == null) {
            return;
        }
        DownloadEventConfig b5 = com.ss.android.downloadlib.addownload.b.f.a().b(j5);
        DownloadController c5 = com.ss.android.downloadlib.addownload.b.f.a().c(j5);
        if (b5 instanceof com.ss.android.download.api.download.c) {
            b5 = null;
        }
        if (c5 instanceof com.ss.android.download.api.download.b) {
            c5 = null;
        }
        if (d5 == null) {
            if (b5 == null) {
                b5 = c();
            }
            if (c5 == null) {
                c5 = b();
            }
        } else {
            if (b5 == null) {
                b5 = new AdDownloadEventConfig.Builder().setClickButtonTag(d5.j()).setRefer(d5.i()).setIsEnableV3Event(d5.m()).setIsEnableClickEvent(false).setClickStartLabel("click_start_detail").setClickPauseLabel("click_pause_detail").setClickContinueLabel("click_continue_detail").setClickInstallLabel("click_install_detail").setStorageDenyLabel("storage_deny_detail").build();
            }
            if (c5 == null) {
                c5 = d5.ak();
            }
        }
        DownloadEventConfig downloadEventConfig = b5;
        downloadEventConfig.setDownloadScene(1);
        this.f9945c.a(a5.getDownloadUrl(), j5, 2, downloadEventConfig, c5);
    }

    @Override // com.ss.android.downloadad.api.b
    public boolean a(long j5) {
        return (com.ss.android.downloadlib.addownload.b.f.a().a(j5) == null && com.ss.android.downloadlib.addownload.b.f.a().d(j5) == null) ? false : true;
    }

    @Override // com.ss.android.downloadad.api.b
    public boolean a(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return a(context, uri, downloadModel, downloadEventConfig, downloadController, null);
    }

    @Override // com.ss.android.downloadad.api.b
    public boolean a(final Context context, final Uri uri, final DownloadModel downloadModel, final DownloadEventConfig downloadEventConfig, final DownloadController downloadController, final IDownloadButtonClickListener iDownloadButtonClickListener) {
        return ((Boolean) com.ss.android.downloadlib.e.b.a(new b.a<Boolean>() { // from class: com.ss.android.downloadlib.b.3
            @Override // com.ss.android.downloadlib.e.b.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b() {
                return Boolean.valueOf(b.this.b(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener));
            }
        })).booleanValue();
    }

    public static DownloadController a(boolean z4) {
        AdDownloadController.Builder shouldUseNewWebView = new AdDownloadController.Builder().setLinkMode(0).setIsEnableBackDialog(true).setIsEnableMultipleDownload(false).setShouldUseNewWebView(false);
        if (z4) {
            shouldUseNewWebView.setDownloadMode(2);
        } else {
            shouldUseNewWebView.setDownloadMode(0);
        }
        return shouldUseNewWebView.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        DownloadController downloadController2 = downloadController;
        if (!com.ss.android.download.api.c.a.a(uri) || k.j().optInt("disable_market") == 1) {
            return false;
        }
        Context a5 = context == null ? k.a() : context;
        String b5 = com.ss.android.download.api.c.a.b(uri);
        if (downloadModel == null) {
            return com.ss.android.downloadlib.g.i.a(a5, b5).a() == 5;
        }
        if (!TextUtils.isEmpty(b5) && (downloadModel instanceof AdDownloadModel)) {
            ((AdDownloadModel) downloadModel).setPackageName(b5);
        }
        if (downloadController2 != null) {
            downloadController2.setDownloadMode(2);
        } else if ((downloadModel instanceof AdDownloadModel) && TextUtils.isEmpty(downloadModel.getDownloadUrl())) {
            ((AdDownloadModel) downloadModel).setDownloadUrl(uri.toString());
            downloadController2 = a(true);
        } else if (downloadModel.getDownloadUrl().startsWith("market")) {
            downloadController2 = a(true);
        } else {
            downloadController2 = b();
        }
        com.ss.android.downloadlib.addownload.b.e eVar = new com.ss.android.downloadlib.addownload.b.e(downloadModel.getId(), downloadModel, (DownloadEventConfig) m.a(downloadEventConfig, c()), downloadController2);
        com.ss.android.downloadlib.addownload.b.f.a().a(eVar.f9659b);
        com.ss.android.downloadlib.addownload.b.f.a().a(eVar.f9658a, eVar.f9660c);
        com.ss.android.downloadlib.addownload.b.f.a().a(eVar.f9658a, eVar.f9661d);
        if (m.a(downloadModel) && com.ss.android.socialbase.downloader.g.a.c().b("app_link_opt") == 1 && com.ss.android.downloadlib.b.a.a(eVar)) {
            return true;
        }
        JSONObject jSONObject = new JSONObject();
        m.a(jSONObject, "market_url", uri.toString());
        m.a(jSONObject, "download_scene", (Object) 1);
        com.ss.android.downloadlib.d.a.a().b("market_click_open", jSONObject, eVar);
        com.ss.android.downloadlib.addownload.b.g a6 = com.ss.android.downloadlib.g.i.a(a5, eVar, b5);
        String a7 = m.a(a6.c(), "open_market");
        if (a6.a() == 5) {
            com.ss.android.downloadlib.b.a.a(a7, jSONObject, eVar, true);
            return true;
        }
        if (a6.a() != 6) {
            return true;
        }
        m.a(jSONObject, "error_code", Integer.valueOf(a6.b()));
        com.ss.android.downloadlib.d.a.a().b("market_open_failed", jSONObject, eVar);
        if (com.ss.android.downloadlib.addownload.i.a(downloadModel, iDownloadButtonClickListener)) {
            iDownloadButtonClickListener.handleMarketFailedComplianceDialog();
        }
        return false;
    }

    public static DownloadController b() {
        return a(false);
    }
}
