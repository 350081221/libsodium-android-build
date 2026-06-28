package com.yuanqi.group;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.f;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.lody.virtual.helper.compat.BuildCompat;
import com.orhanobut.logger.j;
import com.tencent.mmkv.MMKV;
import com.tencent.vasdolly.helper.ChannelReaderUtil;
import com.tendcloud.tenddata.TalkingDataSDK;
import com.umeng.commonsdk.UMConfigure;
import com.yuanqi.master.tools.w0;
import io.busniess.va.common.CommonApp;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yuanqi/group/App;", "Landroid/app/Application;", "()V", "TAG", "", "mmkv", "Lcom/tencent/mmkv/MMKV;", "prefs", "Landroid/content/SharedPreferences;", "attachBaseContext", "", "base", "Landroid/content/Context;", "initTalkingData", "initUm", "migrateData", "onCreate", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Instrumented
/* loaded from: classes3.dex */
public final class App extends Application {

    /* renamed from: f, reason: collision with root package name */
    @m
    private static App f13718f;

    /* renamed from: a, reason: collision with root package name */
    @l
    private final String f13721a = "App";

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences f13722b;

    /* renamed from: c, reason: collision with root package name */
    private MMKV f13723c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public static final a f13716d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f13717e = 8;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static f f13719g = new f();

    /* renamed from: h, reason: collision with root package name */
    @l
    private static CommonApp f13720h = new CommonApp();

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yuanqi/group/App$Companion;", "", "()V", "<set-?>", "Lcom/yuanqi/group/App;", "app", "getApp", "()Lcom/yuanqi/group/App;", "commonApp", "Lio/busniess/va/common/CommonApp;", "getCommonApp", "()Lio/busniess/va/common/CommonApp;", "setCommonApp", "(Lio/busniess/va/common/CommonApp;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @m
        public final App a() {
            return App.f13718f;
        }

        @l
        public final CommonApp b() {
            return App.f13720h;
        }

        @l
        public final f c() {
            return App.f13719g;
        }

        public final void d(@l CommonApp commonApp) {
            l0.p(commonApp, "<set-?>");
            App.f13720h = commonApp;
        }

        public final void e(@l f fVar) {
            l0.p(fVar, "<set-?>");
            App.f13719g = fVar;
        }
    }

    private final void f() {
        TalkingDataSDK.initSDK(this, "C078560B54B14267B3F8142046D0EB5D", ChannelReaderUtil.getChannel(getApplicationContext()), "");
    }

    private final void g() {
        UMConfigure.preInit(getApplicationContext(), com.yuanqi.master.config.c.f14550t, ChannelReaderUtil.getChannel(getApplicationContext()));
        j.a(new com.orhanobut.logger.a());
    }

    private final void h() {
        SharedPreferences sharedPreferences = this.f13722b;
        if (sharedPreferences == null) {
            l0.S("prefs");
            sharedPreferences = null;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        l0.o(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                MMKV mmkv = this.f13723c;
                if (mmkv == null) {
                    l0.S("mmkv");
                    mmkv = null;
                }
                mmkv.encode(key, (String) value);
            } else if (value instanceof Integer) {
                MMKV mmkv2 = this.f13723c;
                if (mmkv2 == null) {
                    l0.S("mmkv");
                    mmkv2 = null;
                }
                mmkv2.encode(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                MMKV mmkv3 = this.f13723c;
                if (mmkv3 == null) {
                    l0.S("mmkv");
                    mmkv3 = null;
                }
                mmkv3.encode(key, ((Number) value).longValue());
            } else if (value instanceof Float) {
                MMKV mmkv4 = this.f13723c;
                if (mmkv4 == null) {
                    l0.S("mmkv");
                    mmkv4 = null;
                }
                mmkv4.encode(key, ((Number) value).floatValue());
            } else if (value instanceof Boolean) {
                MMKV mmkv5 = this.f13723c;
                if (mmkv5 == null) {
                    l0.S("mmkv");
                    mmkv5 = null;
                }
                mmkv5.encode(key, ((Boolean) value).booleanValue());
            } else {
                System.out.println((Object) ("Unsupported type for key " + key));
            }
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(@l Context base) {
        String processName;
        AppInstrumentation.attachBaseContextBegin(base);
        l0.p(base, "base");
        super.attachBaseContext(base);
        if (BuildCompat.isPie()) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    processName = Application.getProcessName();
                    WebView.setDataDirectorySuffix(processName);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        f13720h.attachBaseContext(base);
        f13718f = this;
        AppInstrumentation.attachBaseContextEnd();
    }

    @Override // android.app.Application
    public void onCreate() {
        AppInstrumentation.applicationCreateBegin(getApplicationContext());
        super.onCreate();
        SharedPreferences sharedPreferences = getSharedPreferences("Config", 0);
        l0.o(sharedPreferences, "getSharedPreferences(...)");
        this.f13722b = sharedPreferences;
        g();
        f();
        MMKV.initialize(this);
        this.f13723c = w0.f15264a.e();
        SharedPreferences sharedPreferences2 = this.f13722b;
        SharedPreferences sharedPreferences3 = null;
        if (sharedPreferences2 == null) {
            l0.S("prefs");
            sharedPreferences2 = null;
        }
        if (!sharedPreferences2.getBoolean(com.yuanqi.master.config.c.f14551u, false)) {
            h();
            SharedPreferences sharedPreferences4 = this.f13722b;
            if (sharedPreferences4 == null) {
                l0.S("prefs");
            } else {
                sharedPreferences3 = sharedPreferences4;
            }
            sharedPreferences3.edit().putBoolean(com.yuanqi.master.config.c.f14551u, true).apply();
        }
        f13720h.onCreate(this);
        AppInstrumentation.applicationCreateEnd();
    }
}
