package com.ss.android.socialbase.appdownloader;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.provider.FontsContractCompat;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity;
import com.ss.android.socialbase.downloader.a.a;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.h.h;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10193a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static c f10194b;

    /* renamed from: c, reason: collision with root package name */
    private static a f10195c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a implements a.InterfaceC0196a {

        /* renamed from: a, reason: collision with root package name */
        private final e f10196a;

        /* renamed from: b, reason: collision with root package name */
        private final int f10197b;

        /* renamed from: c, reason: collision with root package name */
        private JSONObject f10198c;

        public a(Context context, Intent intent, int i5, JSONObject jSONObject, InterfaceC0193b interfaceC0193b) {
            this.f10198c = jSONObject;
            int optInt = jSONObject.optInt("query_interval", 1000);
            this.f10197b = optInt;
            this.f10196a = new e(context, intent, i5, interfaceC0193b, optInt);
        }

        @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
        public void b() {
            if (!this.f10196a.f10212i) {
                Message obtain = Message.obtain();
                obtain.what = 2;
                this.f10196a.f10209f.sendMessage(obtain);
            }
            com.ss.android.socialbase.downloader.a.a.a().b(this);
            a unused = b.f10195c = null;
        }

        @Override // com.ss.android.socialbase.downloader.a.a.InterfaceC0196a
        public void c() {
            int optInt = this.f10198c.optInt("time_out_second", 20);
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f10196a.f10209f.sendMessage(obtain);
            if (optInt > 0 && optInt < 60) {
                Message obtain2 = Message.obtain();
                obtain2.what = 2;
                this.f10196a.f10209f.sendMessageDelayed(obtain2, optInt * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ss.android.socialbase.appdownloader.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0193b {
        boolean a(@NonNull Context context);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(DownloadInfo downloadInfo, com.ss.android.socialbase.appdownloader.a aVar);
    }

    /* loaded from: classes3.dex */
    private static class d implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f10200a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC0193b f10201b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f10202c;

        /* renamed from: d, reason: collision with root package name */
        private final long f10203d;

        public d(Handler handler, Context context, InterfaceC0193b interfaceC0193b, long j5) {
            this.f10200a = context;
            this.f10201b = interfaceC0193b;
            this.f10202c = handler;
            this.f10203d = j5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            InterfaceC0193b interfaceC0193b;
            boolean z4;
            try {
                interfaceC0193b = this.f10201b;
            } catch (Throwable unused) {
            }
            if (interfaceC0193b != null) {
                long j5 = this.f10203d;
                if (j5 > 0 && j5 <= 10000) {
                    Context context = this.f10200a;
                    if (context != null) {
                        z4 = interfaceC0193b.a(context);
                    } else {
                        z4 = false;
                    }
                    Message obtain = Message.obtain();
                    if (z4) {
                        obtain.what = 2;
                        this.f10202c.sendMessage(obtain);
                    } else {
                        obtain.what = 1;
                        this.f10202c.sendMessageDelayed(obtain, this.f10203d);
                    }
                    return Boolean.FALSE;
                }
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes3.dex */
    private static class e implements h.a {

        /* renamed from: a, reason: collision with root package name */
        public static int f10204a;

        /* renamed from: b, reason: collision with root package name */
        private static int f10205b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f10206c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f10207d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC0193b f10208e;

        /* renamed from: f, reason: collision with root package name */
        private final Handler f10209f;

        /* renamed from: g, reason: collision with root package name */
        private final long f10210g;

        /* renamed from: h, reason: collision with root package name */
        private Future<Boolean> f10211h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f10212i = false;

        public e(Context context, Intent intent, int i5, InterfaceC0193b interfaceC0193b, long j5) {
            this.f10206c = context;
            this.f10207d = intent;
            f10205b = i5;
            this.f10208e = interfaceC0193b;
            this.f10209f = new com.ss.android.socialbase.downloader.h.h(Looper.getMainLooper(), this);
            this.f10210g = j5;
        }

        @Override // com.ss.android.socialbase.downloader.h.h.a
        public void a(Message message) {
            if (message != null) {
                int i5 = message.what;
                if (i5 == 1) {
                    long j5 = this.f10210g;
                    if (j5 <= 0 || j5 > 10000) {
                        return;
                    }
                    f10204a = 1;
                    this.f10211h = com.ss.android.socialbase.downloader.downloader.c.l().submit(new d(this.f10209f, this.f10206c, this.f10208e, this.f10210g));
                    return;
                }
                if (i5 == 2) {
                    f10204a = 2;
                    this.f10209f.removeMessages(2);
                    this.f10209f.removeMessages(1);
                    Future<Boolean> future = this.f10211h;
                    if (future != null) {
                        future.cancel(true);
                    }
                    if (!this.f10212i && (Build.VERSION.SDK_INT < 29 || com.ss.android.socialbase.downloader.a.a.a().b())) {
                        Intent intent = this.f10207d;
                        if (intent != null) {
                            b.b(this.f10206c, intent);
                        } else {
                            DownloadInfo downloadInfo = Downloader.getInstance(this.f10206c).getDownloadInfo(f10205b);
                            if (downloadInfo != null && downloadInfo.isDownloadOverStatus()) {
                                com.ss.android.socialbase.appdownloader.c.b(this.f10206c, f10205b, false);
                            }
                        }
                        this.f10212i = true;
                    }
                    b.b(f10205b, this.f10207d == null, b.a(this.f10206c));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context) {
        if (context == null) {
            return true;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps", 1) > 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 26)
    public static boolean e(Context context) {
        boolean canRequestPackageInstalls;
        if (context == null) {
            return true;
        }
        try {
            canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
            return canRequestPackageInstalls;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static boolean b(Context context, @NonNull DownloadInfo downloadInfo, JSONObject jSONObject, @NonNull com.ss.android.socialbase.appdownloader.a aVar) {
        if (context != null && jSONObject != null) {
            String savePath = downloadInfo.getSavePath();
            if (TextUtils.isEmpty(savePath)) {
                return false;
            }
            aVar.f10185d = "custom";
            com.ss.android.socialbase.appdownloader.a.a a5 = com.ss.android.socialbase.appdownloader.a.d.a(context, "custom", jSONObject, downloadInfo);
            if (a5 != null && a5.a()) {
                Intent b5 = a5.b();
                if (b5 == null) {
                    return false;
                }
                if (a(new File(savePath), downloadInfo, jSONObject)) {
                    if (b(context, b5)) {
                        aVar.f10183b = 0;
                        return true;
                    }
                    aVar.f10183b = 1;
                } else {
                    aVar.f10183b = 6;
                }
                return false;
            }
            aVar.f10183b = 3;
        }
        return false;
    }

    public static void c(int i5, JSONObject jSONObject) {
        int i6 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i6 = 2;
        }
        try {
            jSONObject2.put("scene", i6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().b(i5, "guide_auth_open_setting", jSONObject2);
    }

    private static void d(int i5, JSONObject jSONObject) {
        int i6 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i6 = 2;
        }
        try {
            jSONObject2.put("scene", i6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().b(i5, "guide_auth_dialog_show", jSONObject2);
    }

    public static boolean a(Context context, DownloadInfo downloadInfo, Intent intent, boolean z4) {
        JSONArray e5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).e("ah_plans");
        if (e5 == null) {
            return false;
        }
        int length = e5.length();
        for (int i5 = 0; i5 < length; i5++) {
            JSONObject optJSONObject = e5.optJSONObject(i5);
            if (com.ss.android.socialbase.appdownloader.f.a.a(optJSONObject) && a(context, downloadInfo, intent, optJSONObject, z4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0086. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(android.content.Context r11, com.ss.android.socialbase.downloader.model.DownloadInfo r12, android.content.Intent r13, org.json.JSONObject r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.b.a(android.content.Context, com.ss.android.socialbase.downloader.model.DownloadInfo, android.content.Intent, org.json.JSONObject, boolean):boolean");
    }

    public static com.ss.android.socialbase.appdownloader.a b(JSONObject jSONObject, com.ss.android.socialbase.downloader.g.a aVar) {
        com.ss.android.socialbase.appdownloader.a aVar2 = new com.ss.android.socialbase.appdownloader.a();
        if (jSONObject == null) {
            return aVar2;
        }
        aVar2.f10182a = jSONObject.optString("type");
        aVar2.f10186e = "vbi";
        if (com.ss.android.socialbase.appdownloader.a.d.a(com.ss.android.socialbase.downloader.downloader.c.O(), "vbi", jSONObject, aVar)) {
            aVar2.f10183b = 0;
        } else {
            a(aVar2, 3);
        }
        return aVar2;
    }

    public static void b(int i5, JSONObject jSONObject) {
        int i6 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i6 = 2;
        }
        try {
            jSONObject2.put("scene", i6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().b(i5, "guide_auth_dialog_cancel", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i5, boolean z4, boolean z5) {
        JSONObject jSONObject = new JSONObject();
        int i6 = 1;
        try {
            jSONObject.put("scene", z4 ? 1 : 2);
            if (!z5) {
                i6 = 2;
            }
            jSONObject.put(FontsContractCompat.Columns.RESULT_CODE, i6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().b(i5, "guide_auth_result", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, Intent intent) {
        return a(context, intent, true);
    }

    private static boolean a(Context context, @NonNull DownloadInfo downloadInfo, JSONObject jSONObject, @NonNull com.ss.android.socialbase.appdownloader.a aVar, com.ss.android.socialbase.downloader.g.a aVar2) {
        boolean z4;
        String optString = jSONObject.optString("type");
        aVar.f10182a = optString;
        Intent b5 = com.ss.android.socialbase.appdownloader.a.d.a(context, "vbi", jSONObject, downloadInfo).b();
        StringBuilder sb = new StringBuilder();
        try {
            z4 = b(context, b5);
        } catch (Throwable th) {
            sb.append(optString);
            sb.append(" startActivity failed : ");
            sb.append(a(th));
            a(aVar, 1);
            z4 = false;
        }
        if (!z4) {
            aVar.f10184c = sb.toString();
        } else {
            aVar.f10183b = 0;
        }
        return true;
    }

    private static boolean a(Context context, DownloadInfo downloadInfo, JSONObject jSONObject, com.ss.android.socialbase.appdownloader.a aVar) {
        String str;
        boolean z4;
        if (context != null && jSONObject != null) {
            String optString = jSONObject.optString("device_plans");
            aVar.f10186e = optString;
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split(",");
                String savePath = downloadInfo.getSavePath();
                if (TextUtils.isEmpty(savePath)) {
                    return false;
                }
                File file = new File(savePath);
                StringBuilder sb = new StringBuilder();
                int length = split.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        str = null;
                        z4 = false;
                        break;
                    }
                    str = split[i5];
                    com.ss.android.socialbase.appdownloader.a.a a5 = com.ss.android.socialbase.appdownloader.a.d.a(context, str, jSONObject, downloadInfo);
                    if (a5 != null) {
                        Intent b5 = a5.b();
                        if (b5 != null) {
                            if (a(file, downloadInfo, jSONObject)) {
                                z4 = true;
                                try {
                                    a(context, b5, false);
                                    break;
                                } catch (Throwable th) {
                                    sb.append(str);
                                    sb.append(" startActivity failed : ");
                                    sb.append(a(th));
                                    a(aVar, 1);
                                }
                            } else {
                                a(aVar, 6);
                                sb.append(str);
                                sb.append(" createDescFile failed! ");
                            }
                        } else {
                            a(aVar, 3);
                            sb.append(str);
                            sb.append(" resolveActivity failed! ");
                        }
                    }
                    sb.append("  ");
                    i5++;
                }
                if (!z4) {
                    aVar.f10184c = sb.toString();
                } else {
                    aVar.f10185d = str;
                    aVar.f10183b = 0;
                }
                return z4;
            }
        }
        return false;
    }

    public static int a(@NonNull com.ss.android.socialbase.downloader.g.a aVar) {
        if (!(aVar.d("download_dir") != null ? !TextUtils.isEmpty(r0.optString("dir_name")) : false)) {
            return 5;
        }
        if (!com.ss.android.socialbase.downloader.g.a.c().a("get_download_info_by_list")) {
            return 4;
        }
        JSONArray e5 = aVar.e("ah_plans");
        int i5 = -1;
        if (e5 != null) {
            int length = e5.length();
            for (int i6 = 0; i6 < length; i6++) {
                JSONObject optJSONObject = e5.optJSONObject(i6);
                if (com.ss.android.socialbase.appdownloader.f.a.a(optJSONObject)) {
                    String optString = optJSONObject.optString("type");
                    if (!"plan_a".equals(optString) && !"plan_b".equals(optString) && !"plan_e".equals(optString) && !"plan_f".equals(optString)) {
                        if ("plan_d".equalsIgnoreCase(optString) || "plan_h".equalsIgnoreCase(optString) || ("plan_g".equalsIgnoreCase(optString) && (i5 = b(optJSONObject, aVar).f10183b) == 0)) {
                            return 0;
                        }
                    } else {
                        i5 = a(optJSONObject, aVar).f10183b;
                        if (i5 == 0) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i5;
    }

    @NonNull
    public static com.ss.android.socialbase.appdownloader.a a(JSONObject jSONObject, com.ss.android.socialbase.downloader.g.a aVar) {
        com.ss.android.socialbase.appdownloader.a aVar2 = new com.ss.android.socialbase.appdownloader.a();
        if (jSONObject == null) {
            return aVar2;
        }
        String optString = jSONObject.optString("type");
        aVar2.f10182a = optString;
        if ("plan_b".equals(optString)) {
            aVar2.f10186e = "custom";
            if (com.ss.android.socialbase.appdownloader.a.d.a(com.ss.android.socialbase.downloader.downloader.c.O(), "custom", jSONObject, aVar)) {
                aVar2.f10183b = 0;
                return aVar2;
            }
            a(aVar2, 3);
        } else {
            String optString2 = jSONObject.optString("device_plans");
            aVar2.f10186e = optString2;
            if (!TextUtils.isEmpty(optString2)) {
                for (String str : optString2.split(",")) {
                    if (com.ss.android.socialbase.appdownloader.a.d.a(com.ss.android.socialbase.downloader.downloader.c.O(), str, jSONObject, aVar)) {
                        aVar2.f10183b = 0;
                        return aVar2;
                    }
                    a(aVar2, 3);
                }
            }
        }
        return aVar2;
    }

    public static com.ss.android.socialbase.appdownloader.a a(JSONObject jSONObject, String str, Context context, com.ss.android.socialbase.downloader.g.a aVar) {
        com.ss.android.socialbase.appdownloader.a aVar2 = new com.ss.android.socialbase.appdownloader.a();
        if (jSONObject != null && com.ss.android.socialbase.appdownloader.f.e.c()) {
            aVar2.f10182a = jSONObject.optString("type");
            if (aVar.a("bi", 0) == 1) {
                aVar2.f10183b = 0;
                return aVar2;
            }
            if (a(context)) {
                aVar2.f10183b = 2;
            } else if (com.ss.android.socialbase.appdownloader.f.a.a(str) != null) {
                aVar2.f10183b = 0;
            } else {
                aVar2.f10183b = 9;
            }
        }
        return aVar2;
    }

    private static void a(com.ss.android.socialbase.appdownloader.a aVar, int i5) {
        int i6 = aVar.f10183b;
        if (i6 != -1) {
            aVar.f10183b = (i6 * 10) + i5;
        } else {
            aVar.f10183b = i5;
        }
    }

    private static boolean a(File file, DownloadInfo downloadInfo, @NonNull JSONObject jSONObject) {
        if (file == null) {
            return false;
        }
        String path = file.getPath();
        JSONObject d5 = com.ss.android.socialbase.downloader.g.a.a(downloadInfo.getId()).d("download_dir");
        File file2 = null;
        String optString = d5 != null ? d5.optString("ins_desc") : null;
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString)) {
            file2 = new File(path + File.separator + optString);
        }
        if (file2 == null) {
            return true;
        }
        try {
            if (!file2.createNewFile()) {
                return true;
            }
            file2.deleteOnExit();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean a(Context context, @Nullable Intent intent, JSONObject jSONObject, int i5, @Nullable com.ss.android.socialbase.appdownloader.a aVar) {
        if (context != null && jSONObject != null) {
            long optLong = jSONObject.optLong("jump_interval", 0L);
            if (optLong <= 0) {
                return false;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("sp_ah_config", 0);
            if ((System.currentTimeMillis() - sharedPreferences.getLong("last_jump_unknown_source_time", 0L)) / OpenStreetMapTileProviderConstants.ONE_MINUTE >= optLong && !a(context)) {
                sharedPreferences.edit().putLong("last_jump_unknown_source_time", System.currentTimeMillis()).apply();
                if (jSONObject.optInt("show_unknown_source_dialog", 0) == 1) {
                    Intent intent2 = new Intent(context, (Class<?>) JumpUnknownSourceActivity.class);
                    intent2.addFlags(268435456);
                    intent2.putExtra(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, intent);
                    intent2.putExtra("config", jSONObject.toString());
                    intent2.putExtra("id", i5);
                    try {
                        if (a(context, intent2, false)) {
                            d(i5, jSONObject);
                        }
                        return true;
                    } catch (Throwable th) {
                        if (aVar != null) {
                            aVar.f10183b = 1;
                            aVar.f10184c = "tryShowUnknownSourceDialog" + a(th);
                        }
                        return false;
                    }
                }
                if (a(context, intent, i5, jSONObject)) {
                    c(i5, jSONObject);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, @Nullable Intent intent, int i5, JSONObject jSONObject) {
        try {
            if (com.ss.android.socialbase.appdownloader.f.e.c() && Build.VERSION.SDK_INT < 26 && !d(context)) {
                com.ss.android.socialbase.appdownloader.a.f fVar = new com.ss.android.socialbase.appdownloader.a.f(context);
                if (fVar.a()) {
                    a(context, intent, i5, jSONObject, new InterfaceC0193b() { // from class: com.ss.android.socialbase.appdownloader.b.1
                        @Override // com.ss.android.socialbase.appdownloader.b.InterfaceC0193b
                        public boolean a(@NonNull Context context2) {
                            return b.d(context2);
                        }
                    });
                    return b(context, fVar.b());
                }
            } else if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26 && !e(context)) {
                com.ss.android.socialbase.appdownloader.a.b bVar = new com.ss.android.socialbase.appdownloader.a.b(context);
                if (bVar.a()) {
                    a(context, intent, i5, jSONObject, new InterfaceC0193b() { // from class: com.ss.android.socialbase.appdownloader.b.2
                        @Override // com.ss.android.socialbase.appdownloader.b.InterfaceC0193b
                        public boolean a(@NonNull Context context2) {
                            return b.e(context2);
                        }
                    });
                    return b(context, bVar.b());
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return true;
        }
        if (com.ss.android.socialbase.appdownloader.f.e.c() && Build.VERSION.SDK_INT < 26) {
            return d(context);
        }
        if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
            return e(context);
        }
        return true;
    }

    public static boolean a() {
        return e.f10204a == 1;
    }

    public static void a(int i5, JSONObject jSONObject) {
        int i6 = 1;
        boolean z4 = jSONObject.optInt("show_unknown_source_on_startup") == 1;
        JSONObject jSONObject2 = new JSONObject();
        if (!z4) {
            i6 = 2;
        }
        try {
            jSONObject2.put("scene", i6);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.ss.android.socialbase.downloader.downloader.c.Q().b(i5, "guide_auth_dialog_confirm", jSONObject2);
    }

    private static void a(Context context, Intent intent, int i5, JSONObject jSONObject, InterfaceC0193b interfaceC0193b) {
        if (f10195c != null) {
            com.ss.android.socialbase.downloader.a.a.a().b(f10195c);
            f10195c = null;
        }
        f10195c = new a(context, intent, i5, jSONObject, interfaceC0193b);
        com.ss.android.socialbase.downloader.a.a.a().a(f10195c);
    }

    public static boolean a(Context context, Intent intent, boolean z4) {
        if (context == null || intent == null) {
            return false;
        }
        if (z4) {
            try {
                intent.putExtra("start_only_for_android", true);
                context.startActivity(intent);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        intent.putExtra("start_only_for_android", true);
        context.startActivity(intent);
        return true;
    }

    public static String a(Throwable th) {
        String th2 = th.toString();
        return th2.length() > 800 ? th2.substring(0, 500) : th2;
    }

    public static void a(c cVar) {
        f10194b = cVar;
    }
}
