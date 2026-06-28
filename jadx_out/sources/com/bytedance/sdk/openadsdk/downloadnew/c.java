package com.bytedance.sdk.openadsdk.downloadnew;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTDownloadEventLogger;
import com.bytedance.sdk.openadsdk.downloadnew.b;
import com.bytedance.sdk.openadsdk.downloadnew.core.DialogBuilder;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadAdapter;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTDownloadVisitor;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadEventModel;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.download.api.config.IDownloadButtonClickListener;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.config.h;
import com.ss.android.download.api.config.j;
import com.ss.android.download.api.config.l;
import com.ss.android.download.api.config.q;
import com.ss.android.download.api.config.r;
import com.ss.android.download.api.config.t;
import com.ss.android.download.api.download.DownloadController;
import com.ss.android.download.api.download.DownloadEventConfig;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.a;
import com.ss.android.download.api.model.b;
import com.ss.android.downloadlib.addownload.a.a;
import com.ss.android.downloadlib.addownload.b.f;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.ad;
import com.ss.android.socialbase.downloader.downloader.DownloaderBuilder;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import com.ss.android.socialbase.downloader.network.i;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f4940a;

    /* renamed from: c, reason: collision with root package name */
    public static ITTDownloadVisitor f4942c;

    /* renamed from: f, reason: collision with root package name */
    private static Context f4945f;

    /* renamed from: g, reason: collision with root package name */
    private static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> f4946g;

    /* renamed from: h, reason: collision with root package name */
    private static final com.ss.android.download.api.download.a.a f4947h;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f4943d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f4944e = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4941b = true;

    /* loaded from: classes2.dex */
    public static class e implements IDownloadHttpService {
        @Override // com.ss.android.socialbase.downloader.network.IDownloadHttpService
        public i downloadWithConnection(int i5, String str, List<com.ss.android.socialbase.downloader.model.c> list) throws IOException {
            final b.a a5 = com.bytedance.sdk.openadsdk.downloadnew.b.a(str, list);
            if (a5 != null) {
                return new i() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.e.1
                    @Override // com.ss.android.socialbase.downloader.network.i
                    public InputStream a() {
                        return a5.f4936a;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public int b() {
                        return a5.f4938c;
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public void c() {
                    }

                    @Override // com.ss.android.socialbase.downloader.network.i
                    public void d() {
                        try {
                            a5.f4939d.disconnect();
                        } catch (Exception unused) {
                        }
                    }

                    @Override // com.ss.android.socialbase.downloader.network.g
                    public String a(String str2) {
                        Map<String, String> map = a5.f4937b;
                        if (map != null) {
                            return map.get(str2);
                        }
                        return null;
                    }
                };
            }
            return null;
        }
    }

    static {
        try {
            f4940a = i().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getPath();
        } catch (Throwable unused) {
        }
        f4947h = new com.ss.android.download.api.download.a.a() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.6
            @Override // com.ss.android.download.api.download.a.a
            public void a(DownloadModel downloadModel, DownloadController downloadController, DownloadEventConfig downloadEventConfig) {
                com.bytedance.sdk.openadsdk.api.c.b("TTDownloadVisitor", "completeListener: onDownloadStart");
            }

            @Override // com.ss.android.download.api.download.a.a
            public void b(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.c.b("TTDownloadVisitor", "completeListener: onInstalled");
                c.c(str);
            }

            @Override // com.ss.android.download.api.download.a.a
            public void a(DownloadInfo downloadInfo, String str) {
                com.bytedance.sdk.openadsdk.api.c.b("TTDownloadVisitor", "completeListener: onDownloadFinished");
            }

            @Override // com.ss.android.download.api.download.a.a
            public void a(DownloadInfo downloadInfo, BaseException baseException, String str) {
                com.bytedance.sdk.openadsdk.api.c.b("TTDownloadVisitor", "completeListener: onDownloadFailed");
            }

            @Override // com.ss.android.download.api.download.a.a
            public void a(DownloadInfo downloadInfo) {
                com.bytedance.sdk.openadsdk.api.c.b("TTDownloadVisitor", "completeListener: onCanceled");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        com.ss.android.downloadad.api.a.b a5;
        JSONObject g5;
        if (TextUtils.isEmpty(str) || (a5 = f.a().a(str)) == null || (g5 = a5.g()) == null || f() == null) {
            return;
        }
        f().checkAutoControl(g5, str);
    }

    static /* synthetic */ ITTDownloadVisitor d() {
        return f();
    }

    static /* synthetic */ JSONObject e() {
        return h();
    }

    private static ITTDownloadVisitor f() {
        ITTDownloadVisitor iTTDownloadVisitor = f4942c;
        if (iTTDownloadVisitor == null) {
            TTAdManager adManager = TTAdSdk.getAdManager();
            if (adManager == null) {
                return null;
            }
            return (ITTDownloadVisitor) adManager.getExtra(ITTDownloadVisitor.class, com.bytedance.sdk.openadsdk.downloadnew.a.a(1));
        }
        return iTTDownloadVisitor;
    }

    private static boolean g() {
        return false;
    }

    private static JSONObject h() {
        try {
            ITTDownloadVisitor f5 = f();
            if (f5 != null) {
                JSONObject downloadSettings = f5.getDownloadSettings();
                if (downloadSettings.optInt("enable_app_install_receiver", 1) == 0) {
                    downloadSettings.put("enable_app_install_receiver", 0);
                }
                return downloadSettings;
            }
        } catch (Exception unused) {
        }
        return new JSONObject();
    }

    private static Context i() {
        Context context = f4945f;
        return context == null ? TTAppContextHolder.getContext() : context;
    }

    /* loaded from: classes2.dex */
    public static class a implements g {
        private void c(com.ss.android.download.api.model.c cVar) {
            JSONObject jSONObject;
            boolean z4;
            if (cVar == null) {
                return;
            }
            Object l5 = cVar.l();
            if (l5 instanceof JSONObject) {
                jSONObject = (JSONObject) l5;
            } else {
                jSONObject = null;
            }
            TTDownloadEventModel label = TTDownloadEventModel.builder().setTag(cVar.b()).setExtJson(cVar.h()).setMaterialMeta(jSONObject).setLabel(cVar.c());
            if (!"download_notification".equals(cVar.b()) && !"landing_h5_download_ad_button".equals(cVar.b())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (c.d() != null) {
                c.d().executeLogUpload(label, z4);
            }
        }

        @Override // com.ss.android.download.api.config.g
        public void a(com.ss.android.download.api.model.c cVar) {
            com.bytedance.sdk.openadsdk.api.c.b("LibEventLogger", "onV3Event");
            a(cVar, true);
        }

        @Override // com.ss.android.download.api.config.g
        public void b(com.ss.android.download.api.model.c cVar) {
            com.bytedance.sdk.openadsdk.api.c.b("LibEventLogger", "onEvent called");
            a(cVar, false);
            c(cVar);
        }

        private void a(com.ss.android.download.api.model.c cVar, boolean z4) {
            TTDownloadEventLogger tTDownloadEventLogger;
            if (c.d() == null || (tTDownloadEventLogger = c.d().getTTDownloadEventLogger()) == null || cVar == null) {
                return;
            }
            if (tTDownloadEventLogger.shouldFilterOpenSdkLog() && c.d().isOpenSdkEvent(cVar.toString())) {
                return;
            }
            if (z4) {
                tTDownloadEventLogger.onV3Event(c.b(cVar));
            } else {
                tTDownloadEventLogger.onEvent(c.b(cVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.downloadnew.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0129c implements com.ss.android.download.api.config.i {
        @Override // com.ss.android.download.api.config.i
        public void a(Activity activity, int i5, String[] strArr, int[] iArr) {
        }

        @Override // com.ss.android.download.api.config.i
        public void a(Activity activity, String[] strArr, final t tVar) {
            if (c.d() != null) {
                c.d().requestPermission(activity, strArr, new ITTPermissionCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.c.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onDenied(String str) {
                        t tVar2 = tVar;
                        if (tVar2 != null) {
                            tVar2.a(str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTPermissionCallback
                    public void onGranted() {
                        t tVar2 = tVar;
                        if (tVar2 != null) {
                            tVar2.a();
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.i
        public boolean a(Context context, String str) {
            if (c.d() != null) {
                return c.d().hasPermission(context, str);
            }
            return false;
        }
    }

    public static void a(Context context) {
        if (context == null) {
            context = TTAppContextHolder.getContext();
        }
        if (context == null) {
            return;
        }
        if (!f4943d.get()) {
            try {
                com.ss.android.socialbase.appdownloader.d.j().a(true);
            } catch (Throwable unused) {
            }
            synchronized (c.class) {
                AtomicBoolean atomicBoolean = f4943d;
                if (!atomicBoolean.get()) {
                    f4945f = context.getApplicationContext();
                    if (f() != null) {
                        String initPath = f().initPath(f4941b);
                        if (!TextUtils.isEmpty(initPath)) {
                            f4940a = initPath;
                        }
                    }
                    atomicBoolean.set(b(f4945f));
                }
            }
        }
        if (f4943d.get()) {
            AtomicBoolean atomicBoolean2 = f4944e;
            if (atomicBoolean2.compareAndSet(false, true)) {
                TTDownloadEventLogger tTDownloadEventLogger = f() != null ? f().getTTDownloadEventLogger() : null;
                if (tTDownloadEventLogger == null) {
                    atomicBoolean2.set(false);
                } else {
                    tTDownloadEventLogger.onDownloadConfigReady();
                }
            }
        }
    }

    public static void b() {
        a().g();
        if (f() != null) {
            f().clearAllData(f4940a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements h {
        private b() {
        }

        @Override // com.ss.android.download.api.config.h
        public void a(String str, String str2, Map<String, Object> map, final r rVar) {
            str.hashCode();
            int i5 = 0;
            if (!str.equals(HttpGet.METHOD_NAME) && str.equals(HttpPost.METHOD_NAME)) {
                i5 = 1;
            }
            if (c.d() != null) {
                c.d().execute(i5, str2, map, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.b.1
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        r rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.a(th);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        r rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.a(str3);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.download.api.config.h
        public void a(String str, byte[] bArr, String str2, int i5, final r rVar) {
            if (c.d() != null) {
                c.d().postBody(str, bArr, str2, new ITTHttpCallback() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.b.2
                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onError(Throwable th) {
                        r rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.a(th);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.downloadnew.core.ITTHttpCallback
                    public void onResponse(String str3) {
                        r rVar2 = rVar;
                        if (rVar2 != null) {
                            rVar2.a(str3);
                        }
                    }
                });
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements l {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<Context> f4955a;

        public d(Context context) {
            this.f4955a = new WeakReference<>(context);
        }

        private DialogBuilder c(final com.ss.android.download.api.model.b bVar) {
            return DialogBuilder.builder().setTitle(bVar.f9442b).setMessage(bVar.f9443c).setNegativeBtnText(bVar.f9445e).setPositiveBtnText(bVar.f9444d).setIcon(bVar.f9447g).setDialogStatusChangedListener(new IDialogStatusChangedListener() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.d.1
                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onCancel(DialogInterface dialogInterface) {
                    b.InterfaceC0178b interfaceC0178b = bVar.f9448h;
                    if (interfaceC0178b != null) {
                        interfaceC0178b.c(dialogInterface);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onNegativeBtnClick(DialogInterface dialogInterface) {
                    b.InterfaceC0178b interfaceC0178b = bVar.f9448h;
                    if (interfaceC0178b != null) {
                        try {
                            interfaceC0178b.b(dialogInterface);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.downloadnew.core.IDialogStatusChangedListener
                public void onPositiveBtnClick(DialogInterface dialogInterface) {
                    b.InterfaceC0178b interfaceC0178b = bVar.f9448h;
                    if (interfaceC0178b != null) {
                        interfaceC0178b.a(dialogInterface);
                    }
                }
            });
        }

        @Override // com.ss.android.download.api.config.l
        public void a(int i5, Context context, DownloadModel downloadModel, String str, Drawable drawable, int i6) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                Toast.makeText(context, str, 0).show();
            } catch (Exception e5) {
                com.ss.android.socialbase.downloader.c.a.e("LibUIFactory", "showToastWithDuration e " + e5.getMessage());
            }
        }

        @Override // com.ss.android.download.api.config.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlertDialog b(com.ss.android.download.api.model.b bVar) {
            if (bVar != null && c.d() != null) {
                Context context = bVar.f9441a;
                if (context != null && (context instanceof Activity)) {
                    return c.d().showDialogBySelf((Activity) bVar.f9441a, bVar.f9450j == 1, c(bVar));
                }
                c.d().showDialogByDelegate(this.f4955a, bVar.f9450j == 1, c(bVar));
            }
            return null;
        }
    }

    private static boolean b(Context context) {
        com.ss.android.download.api.a a5;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = "";
        }
        if (g()) {
            try {
                a5 = com.ss.android.downloadlib.i.a(applicationContext).a("pangolin");
            } catch (Throwable unused) {
                a5 = com.ss.android.downloadlib.i.a(applicationContext).a();
            }
        } else {
            a5 = com.ss.android.downloadlib.i.a(applicationContext).a();
        }
        if (a5 == null) {
            return false;
        }
        a5.a(new C0129c()).a(new a()).a(new d(applicationContext)).a(new b()).a(new j() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.3
            @Override // com.ss.android.download.api.config.j
            public JSONObject a() {
                return c.e();
            }
        }).a(new com.ss.android.download.api.config.b() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.2
            @Override // com.ss.android.download.api.config.b
            public boolean a() {
                if (c.d() != null) {
                    return c.d().getAppIsBackground();
                }
                return false;
            }
        }).a(new a.C0177a().b("143").a("open_news").c(TTAdSdk.SDK_VERSION_NAME).d(String.valueOf(TTAdSdk.SDK_VERSION_CODE)).a()).a(new q() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.1
            @Override // com.ss.android.download.api.config.q
            public byte[] a(byte[] bArr, int i5) {
                return new byte[0];
            }
        }).a(packageName + ".TTFileProvider").a(a(applicationContext, h())).a();
        com.ss.android.downloadlib.g.a.a();
        com.ss.android.downloadlib.i.a(applicationContext).d().a(1);
        com.ss.android.downloadlib.i.a(applicationContext).a(f4947h);
        com.ss.android.socialbase.appdownloader.d.j().a(new ad() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.4
            @Override // com.ss.android.socialbase.downloader.depend.ad
            public boolean a(Intent intent) {
                return false;
            }
        });
        return true;
    }

    public static Map<Integer, ITTDownloadAdapter.OnEventLogHandler> c() {
        return f4946g;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f4940a = str;
    }

    public static com.ss.android.downloadlib.i a() {
        a(i());
        return com.ss.android.downloadlib.i.a(i());
    }

    public static boolean a(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController, IDownloadButtonClickListener iDownloadButtonClickListener) {
        return a().e().a(context, uri, downloadModel, downloadEventConfig, downloadController, iDownloadButtonClickListener);
    }

    public static boolean a(Context context, Uri uri, DownloadModel downloadModel, DownloadEventConfig downloadEventConfig, DownloadController downloadController) {
        return a().e().a(context, uri, downloadModel, downloadEventConfig, downloadController);
    }

    public static boolean a(Uri uri) {
        return com.ss.android.downloadlib.b.j.a(uri);
    }

    public static void a(int i5) {
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> map = f4946g;
        if (map != null) {
            map.remove(Integer.valueOf(i5));
        }
    }

    public static void a(int i5, ITTDownloadAdapter.OnEventLogHandler onEventLogHandler) {
        if (onEventLogHandler != null) {
            if (f4946g == null) {
                f4946g = Collections.synchronizedMap(new WeakHashMap());
            }
            f4946g.put(Integer.valueOf(i5), onEventLogHandler);
        }
    }

    public static boolean a(String str, String str2, JSONObject jSONObject, Object obj) {
        Map<Integer, ITTDownloadAdapter.OnEventLogHandler> c5;
        boolean z4 = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && jSONObject != null && (c5 = c()) != null) {
            for (Map.Entry<Integer, ITTDownloadAdapter.OnEventLogHandler> entry : c5.entrySet()) {
                int intValue = entry.getKey().intValue();
                ITTDownloadAdapter.OnEventLogHandler value = entry.getValue();
                if (value != null) {
                    boolean onEventLog = value.onEventLog(intValue, jSONObject.toString(), str, str2, obj);
                    if (!z4 && !onEventLog) {
                        z4 = true;
                    }
                }
            }
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject b(com.ss.android.download.api.model.c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", cVar.a());
            jSONObject.put(TTDownloadField.TT_TAG, cVar.b());
            jSONObject.put(TTDownloadField.TT_LABEL, cVar.c());
            jSONObject.put(TTDownloadField.TT_IS_AD, cVar.d());
            jSONObject.put("adId", cVar.e());
            jSONObject.put(TTDownloadField.TT_LOG_EXTRA, cVar.f());
            jSONObject.put("extValue", cVar.g());
            jSONObject.put("extJson", cVar.h());
            jSONObject.put(TTDownloadField.TT_PARAMS_JSON, cVar.i());
            jSONObject.put("eventSource", cVar.k());
            jSONObject.put(TTDownloadField.TT_EXTRA_OBJECT, cVar.l());
            jSONObject.put(TTDownloadField.TT_CLICK_TRACK_URL, cVar.j());
            jSONObject.put("isV3", cVar.m());
            jSONObject.put("V3EventName", cVar.n());
            jSONObject.put("V3EventParams", cVar.o());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    private static DownloaderBuilder a(Context context, JSONObject jSONObject) {
        return new DownloaderBuilder(context).downloadSetting(new aa() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.5
            @Override // com.ss.android.socialbase.downloader.depend.aa
            public JSONObject a() {
                return c.e();
            }
        }).downloadExpSwitch(jSONObject.optInt("download_exp_switch_temp", 1040187391)).httpService(new e());
    }

    public static boolean a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            List<DownloadInfo> b5 = com.ss.android.socialbase.appdownloader.d.j().b(context);
            if (!b5.isEmpty()) {
                for (DownloadInfo downloadInfo : b5) {
                    if (downloadInfo != null && str.equals(downloadInfo.getUrl())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(Activity activity, final ExitInstallListener exitInstallListener) {
        return com.ss.android.downloadlib.addownload.a.a.a().a(activity, false, new a.InterfaceC0183a() { // from class: com.bytedance.sdk.openadsdk.downloadnew.c.7
            @Override // com.ss.android.downloadlib.addownload.a.a.InterfaceC0183a
            public void a() {
                ExitInstallListener exitInstallListener2 = ExitInstallListener.this;
                if (exitInstallListener2 != null) {
                    exitInstallListener2.onExitInstall();
                }
            }
        });
    }
}
