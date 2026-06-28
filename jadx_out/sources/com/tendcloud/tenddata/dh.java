package com.tendcloud.tenddata;

import android.net.Proxy;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class dh extends cy {

    /* renamed from: a, reason: collision with root package name */
    private ba f11687a;

    /* renamed from: c, reason: collision with root package name */
    private String f11688c;

    /* renamed from: com.tendcloud.tenddata.dh$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType;

        static {
            int[] iArr = new int[di.values().length];
            $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType = iArr;
            try {
                iArr[di.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType[di.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType[di.BLUETOOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public dh(di diVar) {
        this.f11688c = UUID.randomUUID().toString();
        int i5 = AnonymousClass1.$SwitchMap$com$talkingdata$sdk$saf$datamodel$network$TDNetworkType[diVar.ordinal()];
        if (i5 != 1) {
            try {
                if (i5 != 2) {
                    if (i5 == 3) {
                        a("type", di.BLUETOOTH.a());
                        return;
                    }
                }
                a("type", di.CELLULAR.a());
                a("available", Boolean.valueOf(o.e(ab.f11351g)));
                a("connected", Boolean.valueOf(o.j(ab.f11351g)));
                a("ip", o.a("cell_ip"));
                a("ipv6", o.a("cell_ipv6"));
                if (o.b(ab.f11351g)) {
                    a("current", o.a(ab.f11351g, false));
                }
                if (o.b()) {
                    a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
                }
                a("scannable", o.v(ab.f11351g));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        a("type", di.WIFI.a());
        a("available", Boolean.valueOf(o.d(ab.f11351g)));
        if (o.i(ab.f11351g)) {
            a("connected", Boolean.TRUE);
            a("current", o.y(ab.f11351g));
            JSONArray z4 = o.z(ab.f11351g);
            ba a5 = a(z4);
            if (this.f11687a == null) {
                a("scannable", z4);
                this.f11687a = a5;
            } else if (new bb().a(this.f11687a, a5) > 0.8d) {
                a("scannable", (Object) null);
            } else {
                a("scannable", z4);
                this.f11687a = a5;
                this.f11688c = UUID.randomUUID().toString();
            }
            a("configured", o.x(ab.f11351g));
            a("ip", o.a("ip"));
            a("ipv6", o.a("ipv6"));
        } else {
            a("connected", Boolean.FALSE);
        }
        if (o.b()) {
            a("proxy", Proxy.getDefaultHost() + ":" + Proxy.getDefaultPort());
        }
        a("scannableFingerId", this.f11688c);
    }

    private static ba a(JSONArray jSONArray) {
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i5);
                    arrayList.add(new ax(jSONObject.getString("name"), jSONObject.getString("id"), (byte) jSONObject.getInt("level"), (byte) 0, (byte) 0));
                } catch (Throwable th) {
                    h.eForInternal(th);
                }
            }
            ba baVar = new ba();
            baVar.setBsslist(arrayList);
            return baVar;
        }
        return null;
    }
}
