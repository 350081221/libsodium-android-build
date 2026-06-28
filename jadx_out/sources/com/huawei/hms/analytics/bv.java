package com.huawei.hms.analytics;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.framework.config.RomAttributeCollector;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bv implements RomAttributeCollector {
    int A;
    int B;

    /* renamed from: a, reason: collision with root package name */
    String f8164a;
    String abc;

    /* renamed from: b, reason: collision with root package name */
    String f8165b;
    String bcd;

    /* renamed from: c, reason: collision with root package name */
    int f8166c;
    String cde;

    /* renamed from: d, reason: collision with root package name */
    int f8167d;
    String def;

    /* renamed from: e, reason: collision with root package name */
    String f8168e;
    String efg;

    /* renamed from: f, reason: collision with root package name */
    boolean f8169f;
    String fgh;

    /* renamed from: g, reason: collision with root package name */
    Boolean f8170g;
    String ghi;

    /* renamed from: h, reason: collision with root package name */
    String f8171h;
    String hij;

    /* renamed from: i, reason: collision with root package name */
    String f8172i;
    String ijk;
    String ikl;

    /* renamed from: j, reason: collision with root package name */
    String f8173j;

    /* renamed from: k, reason: collision with root package name */
    long f8174k;
    String klm;

    /* renamed from: l, reason: collision with root package name */
    long f8175l;
    String lmn;

    /* renamed from: m, reason: collision with root package name */
    long f8176m;

    /* renamed from: n, reason: collision with root package name */
    long f8177n;

    /* renamed from: o, reason: collision with root package name */
    int f8178o;

    /* renamed from: p, reason: collision with root package name */
    String f8179p;

    /* renamed from: q, reason: collision with root package name */
    boolean f8180q;

    /* renamed from: r, reason: collision with root package name */
    String f8181r;

    /* renamed from: s, reason: collision with root package name */
    String f8182s;

    /* renamed from: t, reason: collision with root package name */
    String f8183t;

    /* renamed from: u, reason: collision with root package name */
    Integer f8184u;

    /* renamed from: v, reason: collision with root package name */
    Integer f8185v;

    /* renamed from: w, reason: collision with root package name */
    Boolean f8186w;

    /* renamed from: x, reason: collision with root package name */
    Boolean f8187x;

    /* renamed from: y, reason: collision with root package name */
    String f8188y;

    /* renamed from: z, reason: collision with root package name */
    int f8189z;

    @Override // com.huawei.hms.analytics.framework.config.RomAttributeCollector
    public final JSONObject doCollector() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_is_testdevice", this.A);
            jSONObject.put("_new_user_flag", this.f8189z);
            jSONObject.put("_signed", this.B);
            jSONObject.put("_rom_ver", this.lmn);
            jSONObject.put("_emui_ver", this.klm);
            jSONObject.put("_user_agent", this.f8182s);
            jSONObject.put("_model", this.ikl);
            jSONObject.put("_package_name", this.ijk);
            jSONObject.put("_app_ver", this.hij);
            jSONObject.put("_lib_ver", this.ghi);
            jSONObject.put("_lib_name", this.def);
            jSONObject.put("_lib_type", this.cde);
            jSONObject.put("_channel", this.efg);
            jSONObject.put("_restriction_enabled", this.f8169f);
            jSONObject.put("_restriction_shared", this.f8170g);
            jSONObject.put("_terminal_name", this.fgh);
            jSONObject.put("_sys_language", this.f8164a);
            jSONObject.put("_manufacturer", this.f8165b);
            jSONObject.put("_os", this.bcd);
            jSONObject.put("_os_ver", this.abc);
            jSONObject.put("_screen_height", this.f8166c);
            jSONObject.put("_screen_width", this.f8167d);
            jSONObject.put("_device_category", this.f8168e);
            jSONObject.put("_ab_info", this.f8171h);
            jSONObject.put("_oaid_tracking_flag", this.f8172i);
            jSONObject.put("_network_type", this.f8173j);
            jSONObject.put("_total_storage", this.f8174k);
            jSONObject.put("_free_storage", this.f8175l);
            jSONObject.put("_free_memory", this.f8177n);
            jSONObject.put("_total_memory", this.f8176m);
            jSONObject.put("_battery_level", this.f8178o);
            jSONObject.put("_battery_state", this.f8179p);
            jSONObject.put("_allow_push", this.f8180q);
            jSONObject.put("_first_open_time", this.f8181r);
            jSONObject.put("_font_family", "");
            jSONObject.put("_font_size", this.f8183t);
            jSONObject.put("_font_weight", "");
            jSONObject.put("_font_style", "");
            jSONObject.put("_screen_brightness", this.f8184u);
            jSONObject.put("_ringer_mode", this.f8185v);
            jSONObject.put("_dark_mode", this.f8186w);
            jSONObject.put("_auto_rotate", this.f8187x);
            jSONObject.put("_campaign_info", this.f8188y);
        } catch (JSONException unused) {
            HiLog.w("OpennessRomGathering", "doCollector JSONException");
        }
        return jSONObject;
    }
}
