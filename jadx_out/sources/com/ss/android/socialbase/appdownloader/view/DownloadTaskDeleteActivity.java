package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.ss.android.socialbase.appdownloader.c.c;
import com.ss.android.socialbase.appdownloader.c.k;
import com.ss.android.socialbase.appdownloader.c.l;
import com.ss.android.socialbase.appdownloader.d;
import com.ss.android.socialbase.appdownloader.i;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.i.f;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

@Instrumented
/* loaded from: classes3.dex */
public class DownloadTaskDeleteActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private k f10385a;

    /* renamed from: b, reason: collision with root package name */
    private Intent f10386b;

    private void b() {
        Intent intent;
        l lVar;
        if (this.f10385a == null && (intent = this.f10386b) != null) {
            try {
                final boolean z4 = false;
                final int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
                final DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(intExtra);
                if (downloadInfo == null) {
                    return;
                }
                String title = downloadInfo.getTitle();
                if (TextUtils.isEmpty(title)) {
                    Log.w("DeleteActivity", "Missing appName; skipping handle");
                    return;
                }
                String format = String.format(getString(i.a(this, "tt_appdownloader_notification_download_delete")), title);
                c a5 = d.j().a();
                if (a5 != null) {
                    lVar = a5.a(this);
                } else {
                    lVar = null;
                }
                if (lVar == null) {
                    lVar = new com.ss.android.socialbase.appdownloader.d.a(this);
                }
                int a6 = i.a(this, "tt_appdownloader_tip");
                int a7 = i.a(this, "tt_appdownloader_label_ok");
                int a8 = i.a(this, "tt_appdownloader_label_cancel");
                if (com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).a("cancel_with_net_opt", 0) == 1 && f.h() && downloadInfo.getCurBytes() != downloadInfo.getTotalBytes()) {
                    z4 = true;
                }
                if (z4) {
                    a7 = i.a(this, "tt_appdownloader_label_reserve_wifi");
                    a8 = i.a(this, "tt_appdownloader_label_cancel_directly");
                    format = getResources().getString(i.a(this, "tt_appdownloader_resume_in_wifi"));
                }
                lVar.a(a6).a(format).a(a7, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i5) {
                        if (!z4) {
                            DownloadTaskDeleteActivity.this.a(downloadInfo, intExtra);
                        } else {
                            downloadInfo.setOnlyWifi(true);
                            Downloader.getInstance(DownloadTaskDeleteActivity.this).pause(downloadInfo.getId());
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Downloader.getInstance(DownloadTaskDeleteActivity.this).resume(downloadInfo.getId());
                                }
                            }, 100L);
                        }
                        DownloadTaskDeleteActivity.this.finish();
                    }
                }).b(a8, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i5) {
                        if (z4) {
                            DownloadTaskDeleteActivity.this.a(downloadInfo, intExtra);
                        }
                        DownloadTaskDeleteActivity.this.finish();
                    }
                }).a(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity.1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public void onCancel(DialogInterface dialogInterface) {
                        DownloadTaskDeleteActivity.this.finish();
                    }
                });
                this.f10385a = lVar.a();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        a();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        this.f10386b = getIntent();
        b();
        k kVar = this.f10385a;
        if (kVar != null && !kVar.b()) {
            this.f10385a.a();
        } else if (this.f10385a == null) {
            finish();
        }
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    private void a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DownloadInfo downloadInfo, int i5) {
        com.ss.android.socialbase.appdownloader.c.d b5 = d.j().b();
        if (b5 != null) {
            b5.a(downloadInfo);
        }
        z downloadNotificationEventListener = Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).getDownloadNotificationEventListener(i5);
        if (downloadNotificationEventListener != null) {
            downloadNotificationEventListener.a(10, downloadInfo, "", "");
        }
        if (com.ss.android.socialbase.downloader.downloader.c.O() != null) {
            Downloader.getInstance(com.ss.android.socialbase.downloader.downloader.c.O()).cancel(i5);
        }
    }
}
