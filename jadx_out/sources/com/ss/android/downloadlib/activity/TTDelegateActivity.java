package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.ss.android.download.api.config.l;
import com.ss.android.download.api.config.t;
import com.ss.android.download.api.model.b;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.a.e;
import com.ss.android.downloadlib.addownload.b.f;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.addownload.n;
import com.ss.android.downloadlib.g.h;
import com.ss.android.downloadlib.g.j;
import com.ss.android.downloadlib.g.m;
import com.ss.android.downloadlib.guide.install.a;
import com.ss.android.downloadlib.i;
import com.ss.android.socialbase.appdownloader.c;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.umeng.analytics.pro.bi;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes3.dex */
public class TTDelegateActivity extends Activity implements ActivityCompat.OnRequestPermissionsResultCallback {

    /* renamed from: d, reason: collision with root package name */
    private static a f9571d;

    /* renamed from: a, reason: collision with root package name */
    protected Intent f9572a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9573b;

    /* renamed from: c, reason: collision with root package name */
    private b f9574c;

    public static void a(String str, String[] strArr) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 1);
        intent.putExtra("permission_id_key", str);
        intent.putExtra("permission_content_key", strArr);
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    public static void b(String str, com.ss.android.downloadad.api.a.a aVar) {
        Intent c5 = c(aVar);
        c5.addFlags(268435456);
        c5.putExtra("type", 11);
        c5.putExtra(bi.f12269o, str);
        if (k.a() != null) {
            k.a().startActivity(c5);
        }
    }

    private static Intent c(@NonNull com.ss.android.downloadad.api.a.a aVar) {
        return new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        b();
        this.f9572a = getIntent();
        k.b(this);
        a();
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f9572a = intent;
        k.b(this);
        a();
    }

    @Override // android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i5, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i5, strArr, iArr);
        k.f().a(this, i5, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.app.Activity
    protected void onStop() {
        b bVar;
        DownloadInfo b5;
        super.onStop();
        if (this.f9573b && (bVar = this.f9574c) != null) {
            if (!TextUtils.isEmpty(bVar.af())) {
                b5 = i.a(k.a()).a(this.f9574c.af(), null, true);
            } else {
                b5 = i.a(k.a()).b(this.f9574c.a());
            }
            if (b5 != null && b5.getCurBytes() >= b5.getTotalBytes() && !isFinishing()) {
                finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.activity.TTDelegateActivity.c():void");
    }

    public static void b(String str, long j5, String str2) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 14);
        intent.putExtra(bi.f12269o, str);
        intent.putExtra("model_id", j5);
        intent.putExtra("market_app_id", str2);
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    public static void a(String str, com.ss.android.downloadad.api.a.a aVar) {
        Intent c5 = c(aVar);
        c5.addFlags(268435456);
        c5.putExtra("type", 2);
        c5.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL, str);
        if (k.a() != null) {
            k.a().startActivity(c5);
        }
    }

    public static void a(com.ss.android.downloadad.api.a.a aVar) {
        Intent c5 = c(aVar);
        c5.addFlags(268435456);
        c5.putExtra("type", 4);
        c5.putExtra("model_id", aVar.b());
        if (k.a() != null) {
            k.a().startActivity(c5);
        }
    }

    public static void b(@NonNull com.ss.android.downloadad.api.a.a aVar) {
        a(aVar, 5, "", "", "", "");
    }

    public static void b(@NonNull com.ss.android.downloadad.api.a.a aVar, String str, String str2, String str3) {
        a(aVar, 7, str, str2, str3, "");
    }

    public static void b(@NonNull com.ss.android.downloadad.api.a.a aVar, String str, String str2, String str3, String str4) {
        a(aVar, 20, str, str2, str3, str4);
    }

    private void b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    public static void a(com.ss.android.downloadad.api.a.a aVar, a aVar2) {
        Intent c5 = c(aVar);
        c5.addFlags(268435456);
        c5.putExtra("type", 9);
        f9571d = aVar2;
        if (k.a() != null) {
            k.a().startActivity(c5);
        }
    }

    private void b(final String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            t tVar = new t() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.1

                /* renamed from: c, reason: collision with root package name */
                private WeakReference<Activity> f9577c;

                {
                    this.f9577c = new WeakReference<>(TTDelegateActivity.this);
                }

                @Override // com.ss.android.download.api.config.t
                public void a() {
                    j.a(str);
                    c.a(this.f9577c.get());
                }

                @Override // com.ss.android.download.api.config.t
                public void a(String str2) {
                    j.a(str, str2);
                    c.a(this.f9577c.get());
                }
            };
            try {
                k.f().a(this, strArr, tVar);
                return;
            } catch (Exception e5) {
                k.u().a(e5, "requestPermission");
                tVar.a();
                return;
            }
        }
        c.a((Activity) this);
    }

    public static void a(long j5) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 10);
        intent.putExtra("app_info_id", j5);
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    private void b(String str) {
        Intent g5 = m.g(this, str);
        if (g5 == null) {
            return;
        }
        try {
            try {
                g5.addFlags(268435456);
                g5.putExtra("start_only_for_android", true);
                startActivity(g5);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            c.a((Activity) this);
        }
    }

    public static void a(String str, long j5, String str2, @NonNull JSONObject jSONObject) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 12);
        intent.putExtra(bi.f12269o, str);
        intent.putExtra("model_id", j5);
        intent.putExtra("param", str2);
        intent.putExtra("ext_json", jSONObject.toString());
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    private void b(long j5) {
        final b d5 = f.a().d(j5);
        if (d5 == null) {
            com.ss.android.downloadlib.e.c.a().a("showOpenAppDialogInner nativeModel null");
            c.a((Activity) this);
            return;
        }
        l d6 = k.d();
        b.a a5 = new b.a(this).a("已安装完成");
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(d5.N()) ? "刚刚下载的应用" : d5.N();
        d6.b(a5.b(String.format("%1$s已安装完成，是否立即打开？", objArr)).c("打开").d("取消").a(false).a(m.d(this, d5.e())).a(new b.InterfaceC0178b() { // from class: com.ss.android.downloadlib.activity.TTDelegateActivity.2
            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void a(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.b.a.b(d5);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                c.a((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void b(DialogInterface dialogInterface) {
                com.ss.android.downloadlib.d.a.a().b("market_openapp_cancel", d5);
                TTDelegateActivity tTDelegateActivity = TTDelegateActivity.this;
                if (tTDelegateActivity != null && !tTDelegateActivity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                c.a((Activity) TTDelegateActivity.this);
            }

            @Override // com.ss.android.download.api.model.b.InterfaceC0178b
            public void c(DialogInterface dialogInterface) {
                c.a((Activity) TTDelegateActivity.this);
            }
        }).a(2).a());
        com.ss.android.downloadlib.d.a.a().b("market_openapp_window_show", d5);
    }

    public static void a(String str, long j5, String str2) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 13);
        intent.putExtra(bi.f12269o, str);
        intent.putExtra("model_id", j5);
        intent.putExtra("need_comment", str2);
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    public static void a(String str, long j5) {
        Intent intent = new Intent(k.a(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 15);
        intent.putExtra(bi.f12269o, str);
        intent.putExtra("model_id", j5);
        if (k.a() != null) {
            k.a().startActivity(intent);
        }
    }

    private void c(long j5) {
        new com.ss.android.downloadlib.addownload.compliance.a(this, j5).show();
    }

    public static void a(Context context, String str, long j5) {
        Intent intent = new Intent(context, (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 16);
        intent.putExtra(bi.f12269o, str);
        intent.putExtra("model_id", j5);
        if (context != null) {
            context.startActivity(intent);
        }
    }

    public static void a(@NonNull com.ss.android.downloadad.api.a.a aVar, String str) {
        a(aVar, 19, "", "", "", str);
    }

    public static void a(@NonNull com.ss.android.downloadad.api.a.a aVar, String str, String str2, String str3) {
        a(aVar, 8, str, str2, str3, "");
    }

    public static void a(@NonNull com.ss.android.downloadad.api.a.a aVar, String str, String str2, String str3, String str4) {
        a(aVar, 21, str, str2, str3, str4);
    }

    private static void a(@NonNull com.ss.android.downloadad.api.a.a aVar, int i5, String str, String str2, String str3, String str4) {
        Intent c5 = c(aVar);
        c5.addFlags(268435456);
        c5.putExtra("type", i5);
        if (!TextUtils.isEmpty(str2)) {
            c5.putExtra("positive_button_text", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            c5.putExtra("negative_button_text", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            c5.putExtra("delete_button_text", str4);
        }
        if (!TextUtils.isEmpty(str)) {
            c5.putExtra("message_text", str);
        }
        c5.putExtra("model_id", aVar.b());
        if (k.a() != null) {
            k.a().startActivity(c5);
        }
    }

    protected void a() {
        Intent intent = this.f9572a;
        if (intent == null) {
            return;
        }
        switch (intent.getIntExtra("type", 0)) {
            case 1:
                b(this.f9572a.getStringExtra("permission_id_key"), this.f9572a.getStringArrayExtra("permission_content_key"));
                break;
            case 2:
                a(this.f9572a.getStringExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL));
                break;
            case 3:
            case 6:
            case 17:
            case 18:
            default:
                c.a((Activity) this);
                break;
            case 4:
                b(this.f9572a.getLongExtra("model_id", 0L));
                break;
            case 5:
                a(this.f9572a.getLongExtra("model_id", 0L), "");
                break;
            case 7:
            case 8:
            case 20:
            case 21:
                c();
                break;
            case 9:
                a aVar = f9571d;
                if (aVar != null) {
                    aVar.a();
                }
                c.a((Activity) this);
                break;
            case 10:
                c(this.f9572a.getLongExtra("app_info_id", 0L));
                break;
            case 11:
                b(this.f9572a.getStringExtra(bi.f12269o));
                break;
            case 12:
                h.a(this, this.f9572a.getStringExtra(bi.f12269o), this.f9572a.getLongExtra("model_id", 0L), this.f9572a.getStringExtra("param"), this.f9572a.getStringExtra("ext_json"));
                c.a((Activity) this);
                break;
            case 13:
                h.a(this, this.f9572a.getStringExtra(bi.f12269o), this.f9572a.getLongExtra("model_id", 0L), this.f9572a.getStringExtra("need_comment"));
                c.a((Activity) this);
                break;
            case 14:
                h.b(this, this.f9572a.getStringExtra(bi.f12269o), this.f9572a.getLongExtra("model_id", 0L), this.f9572a.getStringExtra("market_app_id"));
                c.a((Activity) this);
                break;
            case 15:
                h.a(this, this.f9572a.getStringExtra(bi.f12269o), this.f9572a.getLongExtra("model_id", 0L));
                c.a((Activity) this);
                break;
            case 16:
                h.b(this, this.f9572a.getStringExtra(bi.f12269o), this.f9572a.getLongExtra("model_id", 0L));
                c.a((Activity) this);
                break;
            case 19:
                a(this.f9572a.getLongExtra("model_id", 0L), this.f9572a.getStringExtra("delete_button_text"));
                break;
        }
        this.f9572a = null;
    }

    private void a(long j5, String str) {
        if (n.a() == null) {
            return;
        }
        com.ss.android.downloadad.api.a.b d5 = f.a().d(j5);
        if (d5 != null) {
            DownloadInfo downloadInfo = Downloader.getInstance(k.a()).getDownloadInfo(d5.s());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("time_after_click", Long.valueOf(System.currentTimeMillis() - d5.T()));
                jSONObject.putOpt("click_download_size", Long.valueOf(d5.U()));
                if (downloadInfo != null) {
                    jSONObject.putOpt("download_length", Long.valueOf(downloadInfo.getCurBytes()));
                    jSONObject.putOpt("download_percent", Long.valueOf(downloadInfo.getCurBytes() / downloadInfo.getTotalBytes()));
                    jSONObject.putOpt("download_apk_size", Long.valueOf(downloadInfo.getTotalBytes()));
                    jSONObject.putOpt("download_current_bytes", Integer.valueOf((int) (downloadInfo.getCurBytes() / 1048576)));
                    jSONObject.putOpt("download_total_bytes", Integer.valueOf((int) (downloadInfo.getTotalBytes() / 1048576)));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.downloadlib.d.a.a().a("cancel_pause_reserve_wifi_dialog_show", jSONObject, d5);
            } else {
                com.ss.android.downloadlib.d.a.a().b("pause_reserve_wifi_dialog_show", jSONObject, d5);
            }
        }
        e.a a5 = new e.a(this).a(false).a(n.a());
        if (!TextUtils.isEmpty(str)) {
            a5.d(str).a(n.b());
        }
        a5.a().show();
        this.f9573b = true;
        this.f9574c = d5;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                Uri parse = Uri.parse(str);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                intent.putExtra(AdBaseConstants.MARKET_OPEN_INTENT_OPEN_URL, str);
                intent.addFlags(268435456);
                if (com.ss.android.socialbase.downloader.g.a.c().a("fix_app_link_flag")) {
                    intent.addFlags(67108864);
                }
                intent.putExtra("start_only_for_android", true);
                startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            c.a((Activity) this);
        }
    }
}
