package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.android.multidex.ClassPathElement;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.config.LazyInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c extends AGConnectServicesConfig {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7755a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7756b;

    /* renamed from: c, reason: collision with root package name */
    private LazyInputStream f7757c;

    /* renamed from: d, reason: collision with root package name */
    private volatile ConfigReader f7758d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f7759e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private AGCRoutePolicy f7760f = AGCRoutePolicy.UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f7761g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private volatile e f7762h;

    public c(Context context, String str) {
        this.f7755a = context;
        this.f7756b = str;
    }

    private static LazyInputStream a(Context context, final InputStream inputStream) {
        return new LazyInputStream(context) { // from class: com.huawei.agconnect.config.impl.c.1
            @Override // com.huawei.agconnect.config.LazyInputStream
            public InputStream get(Context context2) {
                return inputStream;
            }
        };
    }

    private static String a(String str) {
        int i5 = 0;
        if (str.length() > 0) {
            while (str.charAt(i5) == '/') {
                i5++;
            }
        }
        return ClassPathElement.SEPARATOR_CHAR + str.substring(i5);
    }

    private void a() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.f7758d == null) {
            synchronized (this.f7759e) {
                if (this.f7758d == null) {
                    LazyInputStream lazyInputStream = this.f7757c;
                    if (lazyInputStream != null) {
                        this.f7758d = new i(lazyInputStream.loadInputStream(), "UTF-8");
                        this.f7757c.close();
                        this.f7757c = null;
                    } else {
                        this.f7758d = new m(this.f7755a, this.f7756b);
                    }
                    this.f7762h = new e(this.f7758d);
                }
                b();
            }
        }
    }

    private String b(String str) {
        JsonProcessingFactory.JsonProcessor jsonProcessor;
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (processors.containsKey(str) && (jsonProcessor = processors.get(str)) != null) {
            return jsonProcessor.processOption(this);
        }
        return null;
    }

    private void b() {
        if (this.f7760f == AGCRoutePolicy.UNKNOWN) {
            if (this.f7758d != null) {
                this.f7760f = Utils.getRoutePolicyFromJson(this.f7758d.getString("/region", null), this.f7758d.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z4) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z4)));
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f7755a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return Utils.DEFAULT_NAME;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str, int i5) {
        try {
            return Integer.parseInt(getString(str, String.valueOf(i5)));
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f7756b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f7760f == null) {
            this.f7760f = AGCRoutePolicy.UNKNOWN;
        }
        AGCRoutePolicy aGCRoutePolicy = this.f7760f;
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy == aGCRoutePolicy2 && this.f7758d == null) {
            a();
        }
        AGCRoutePolicy aGCRoutePolicy3 = this.f7760f;
        return aGCRoutePolicy3 == null ? aGCRoutePolicy2 : aGCRoutePolicy3;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f7758d == null) {
            a();
        }
        String a5 = a(str);
        String str3 = this.f7761g.get(a5);
        if (str3 != null) {
            return str3;
        }
        String b5 = b(a5);
        if (b5 != null) {
            return b5;
        }
        String string = this.f7758d.getString(a5, str2);
        return e.a(string) ? this.f7762h.decrypt(string, str2) : string;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(LazyInputStream lazyInputStream) {
        this.f7757c = lazyInputStream;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(InputStream inputStream) {
        overlayWith(a(this.f7755a, inputStream));
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setParam(String str, String str2) {
        this.f7761g.put(Utils.fixPath(str), str2);
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
        this.f7760f = aGCRoutePolicy;
    }
}
