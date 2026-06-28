package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class h implements AesDecrypt {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7780a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7781b;

    /* renamed from: c, reason: collision with root package name */
    private IDecrypt f7782c;

    public h(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", "init");
        this.f7780a = context;
        this.f7781b = str;
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public String decrypt(String str, String str2) {
        if (this.f7782c == null) {
            this.f7782c = decryptComponent();
        }
        if (this.f7782c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f7782c = new g(this.f7780a, this.f7781b).decryptComponent();
        }
        return this.f7782c.decrypt(l.a(this.f7780a, this.f7781b, "agc_plugin_", str), str2);
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public IDecrypt decryptComponent() {
        String a5 = l.a(this.f7780a, this.f7781b, "agc_plugin_", "crypto_component");
        if (a5 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Hex.decodeHexString(a5), "utf-8"));
            return new f(new d(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e5) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e5.getMessage());
            return null;
        }
    }
}
