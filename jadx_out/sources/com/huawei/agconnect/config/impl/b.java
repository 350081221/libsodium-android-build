package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.ConfigReader;
import com.huawei.agconnect.core.Service;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b implements AGConnectOptions {

    /* renamed from: a, reason: collision with root package name */
    private final String f7746a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7747b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7748c;

    /* renamed from: d, reason: collision with root package name */
    private final AGCRoutePolicy f7749d;

    /* renamed from: e, reason: collision with root package name */
    private final ConfigReader f7750e;

    /* renamed from: f, reason: collision with root package name */
    private final e f7751f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, String> f7752g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Service> f7753h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f7754i = new HashMap();

    public b(Context context, String str, AGCRoutePolicy aGCRoutePolicy, InputStream inputStream, Map<String, String> map, List<Service> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f7747b = context;
        str = str == null ? context.getPackageName() : str;
        this.f7748c = str;
        if (inputStream != null) {
            this.f7750e = new i(inputStream, str);
            Utils.closeQuietly(inputStream);
        } else {
            this.f7750e = new m(context, str);
        }
        this.f7751f = new e(this.f7750e);
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy != aGCRoutePolicy2 && "1.0".equals(this.f7750e.getString("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f7749d = (aGCRoutePolicy == null || aGCRoutePolicy == aGCRoutePolicy2) ? Utils.getRoutePolicyFromJson(this.f7750e.getString("/region", null), this.f7750e.getString("/agcgw/url", null)) : aGCRoutePolicy;
        this.f7752g = Utils.fixKeyPathMap(map);
        this.f7753h = list;
        this.f7746a = str2 == null ? b() : str2;
    }

    private String a(String str) {
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (!processors.containsKey(str)) {
            return null;
        }
        if (this.f7754i.containsKey(str)) {
            return this.f7754i.get(str);
        }
        JsonProcessingFactory.JsonProcessor jsonProcessor = processors.get(str);
        if (jsonProcessor == null) {
            return null;
        }
        String processOption = jsonProcessor.processOption(this);
        this.f7754i.put(str, processOption);
        return processOption;
    }

    private String b() {
        return String.valueOf(("{packageName='" + this.f7748c + "', routePolicy=" + this.f7749d + ", reader=" + this.f7750e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f7752g).toString().hashCode() + '}').hashCode());
    }

    public List<Service> a() {
        return this.f7753h;
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
        return this.f7747b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return this.f7746a;
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
        return this.f7748c;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        AGCRoutePolicy aGCRoutePolicy = this.f7749d;
        return aGCRoutePolicy == null ? AGCRoutePolicy.UNKNOWN : aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String fixPath = Utils.fixPath(str);
        String str3 = this.f7752g.get(fixPath);
        if (str3 != null) {
            return str3;
        }
        String a5 = a(fixPath);
        if (a5 != null) {
            return a5;
        }
        String string = this.f7750e.getString(fixPath, str2);
        return e.a(string) ? this.f7751f.decrypt(string, str2) : string;
    }
}
