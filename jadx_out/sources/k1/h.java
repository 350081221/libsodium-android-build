package k1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, j1.d> f19061a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static Map<Integer, List<j1.e>> f19062b = new HashMap();

    public static List<j1.d> a() {
        if (f19061a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = f19061a.keySet().iterator();
        while (it.hasNext()) {
            j1.d dVar = f19061a.get(it.next());
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static void b(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("pangle_com.byted.pangle_tt_sdk_test_tool_data_" + a.h(), 0);
        String string = sharedPreferences.getString("adn_init_conf", "");
        if (TextUtils.isEmpty(string)) {
            sharedPreferences = context.getApplicationContext().getSharedPreferences("tt_sdk_test_tool_data_" + a.h(), 0);
            string = sharedPreferences.getString("adn_init_conf", "");
        }
        if (TextUtils.isEmpty(string)) {
            sharedPreferences = context.getApplicationContext().getSharedPreferences("pangle_com.byted.pangle_tt_sdk_test_tool_data_" + a.h(), 0);
        }
        try {
            String string2 = sharedPreferences.getString("adn_init_conf", "");
            if (!TextUtils.isEmpty(string2)) {
                if (!string2.startsWith("[") && !string2.startsWith("{")) {
                    string2 = c.a(string2, d.a());
                }
                g(new JSONObject(string2));
            }
            String string3 = sharedPreferences.getString("rit_conf", "");
            if (!TextUtils.isEmpty(string3)) {
                if (!string3.startsWith("[") && !string3.startsWith("{")) {
                    string3 = c.a(string3, d.a());
                }
                f(new JSONArray(string3));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void c(j1.d dVar) {
        int i5;
        String str;
        if (dVar != null && !TextUtils.isEmpty(dVar.c())) {
            String c5 = dVar.c();
            c5.hashCode();
            char c6 = 65535;
            switch (c5.hashCode()) {
                case -1128782217:
                    if (c5.equals(MediationConstant.ADN_KLEVIN)) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -995541405:
                    if (c5.equals(MediationConstant.ADN_PANGLE)) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -902468465:
                    if (c5.equals(MediationConstant.ADN_SIGMOB)) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 3432:
                    if (c5.equals(MediationConstant.ADN_KS)) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 102199:
                    if (c5.equals(MediationConstant.ADN_GDT)) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 92668925:
                    if (c5.equals(MediationConstant.ADN_ADMOB)) {
                        c6 = 5;
                        break;
                    }
                    break;
                case 93498907:
                    if (c5.equals(MediationConstant.ADN_BAIDU)) {
                        c6 = 6;
                        break;
                    }
                    break;
                case 111433589:
                    if (c5.equals(MediationConstant.ADN_UNITY)) {
                        c6 = 7;
                        break;
                    }
                    break;
                case 1126045977:
                    if (c5.equals(MediationConstant.ADN_MINTEGRAL)) {
                        c6 = '\b';
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    i5 = R.mipmap.f5908m;
                    str = "游可赢";
                    break;
                case 1:
                    i5 = R.mipmap.f5911p;
                    str = "穿山甲";
                    break;
                case 2:
                    i5 = R.mipmap.f5912q;
                    str = "Sigmob";
                    break;
                case 3:
                    i5 = R.mipmap.f5909n;
                    str = "快手";
                    break;
                case 4:
                    i5 = R.mipmap.f5907l;
                    str = "优量汇";
                    break;
                case 5:
                    i5 = R.mipmap.f5904i;
                    str = "Admob";
                    break;
                case 6:
                    i5 = R.mipmap.f5905j;
                    str = "百度";
                    break;
                case 7:
                    i5 = R.mipmap.f5913r;
                    str = "Unity";
                    break;
                case '\b':
                    i5 = R.mipmap.f5910o;
                    str = "Mintegral";
                    break;
                default:
                    str = dVar.c();
                    i5 = R.mipmap.f5906k;
                    break;
            }
            dVar.b(str);
            dVar.a(i5);
        }
    }

    private static void d(j1.f fVar) {
        int i5;
        String str;
        if (fVar != null && !TextUtils.isEmpty(fVar.h())) {
            String h5 = fVar.h();
            h5.hashCode();
            char c5 = 65535;
            switch (h5.hashCode()) {
                case -1128782217:
                    if (h5.equals(MediationConstant.ADN_KLEVIN)) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -995541405:
                    if (h5.equals(MediationConstant.ADN_PANGLE)) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -902468465:
                    if (h5.equals(MediationConstant.ADN_SIGMOB)) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 3432:
                    if (h5.equals(MediationConstant.ADN_KS)) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 102199:
                    if (h5.equals(MediationConstant.ADN_GDT)) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 92668925:
                    if (h5.equals(MediationConstant.ADN_ADMOB)) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 93498907:
                    if (h5.equals(MediationConstant.ADN_BAIDU)) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 111433589:
                    if (h5.equals(MediationConstant.ADN_UNITY)) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 1126045977:
                    if (h5.equals(MediationConstant.ADN_MINTEGRAL)) {
                        c5 = '\b';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    i5 = R.mipmap.f5908m;
                    str = "游可赢";
                    break;
                case 1:
                    i5 = R.mipmap.f5911p;
                    str = "穿山甲";
                    break;
                case 2:
                    i5 = R.mipmap.f5912q;
                    str = "Sigmob";
                    break;
                case 3:
                    i5 = R.mipmap.f5909n;
                    str = "快手";
                    break;
                case 4:
                    i5 = R.mipmap.f5907l;
                    str = "优量汇";
                    break;
                case 5:
                    i5 = R.mipmap.f5904i;
                    str = "Admob";
                    break;
                case 6:
                    i5 = R.mipmap.f5905j;
                    str = "百度";
                    break;
                case 7:
                    i5 = R.mipmap.f5913r;
                    str = "Unity";
                    break;
                case '\b':
                    i5 = R.mipmap.f5910o;
                    str = "Mintegral";
                    break;
                default:
                    str = fVar.h();
                    i5 = R.mipmap.f5906k;
                    break;
            }
            fVar.c(i5);
            fVar.a(str);
        }
    }

    public static void e(String str, int i5) {
        Map<Integer, List<j1.e>> map = f19062b;
        if (map != null && map.size() != 0 && i5 != 0) {
            Iterator<Integer> it = f19062b.keySet().iterator();
            while (it.hasNext()) {
                List<j1.e> list = f19062b.get(it.next());
                if (list != null && list.size() > 0) {
                    for (j1.e eVar : list) {
                        if (eVar != null && eVar.d() != null) {
                            for (j1.f fVar : eVar.d()) {
                                if (str.equals(fVar.i())) {
                                    fVar.a(i5);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void f(JSONArray jSONArray) throws JSONException {
        j1.e eVar;
        if (jSONArray != null) {
            f19062b.clear();
            int length = jSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                if (jSONObject != null) {
                    eVar = new j1.e();
                    eVar.a(jSONObject.optString("rit_id"));
                    eVar.b(jSONObject.optInt("rit_type"));
                    if (eVar.c() != 2) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("adn_rit_conf");
                        ArrayList<j1.f> arrayList = new ArrayList<>();
                        if (optJSONArray != null) {
                            for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                                j1.f fVar = new j1.f();
                                fVar.c(jSONObject2.optString(MediationConstant.EXTRA_ADN_NAME));
                                fVar.d(jSONObject2.optInt("load_sort"));
                                fVar.e(jSONObject2.optInt("show_sort"));
                                fVar.d(jSONObject2.optString("adn_slot_id"));
                                fVar.f(jSONObject2.optInt("req_bidding_type"));
                                fVar.b(jSONObject2.optInt("origin_type"));
                                fVar.g(eVar.c());
                                fVar.b(eVar.b());
                                d(fVar);
                                arrayList.add(fVar);
                            }
                        }
                        Collections.sort(arrayList);
                        eVar.a(arrayList);
                    }
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    int c5 = eVar.c();
                    List<j1.e> list = f19062b.get(Integer.valueOf(c5));
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(eVar);
                    f19062b.put(Integer.valueOf(c5), list);
                }
            }
        }
    }

    private static void g(JSONObject jSONObject) {
        if (jSONObject != null) {
            f19061a.clear();
            Iterator<String> keys = jSONObject.keys();
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject != null) {
                        j1.d dVar = new j1.d(optJSONObject.optString("app_id"), optJSONObject.optString(k0.b.f19027h));
                        dVar.a(next);
                        c(dVar);
                        f19061a.put(next, dVar);
                    }
                }
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String h(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                return null;
            }
            return telephonyManager.getDeviceId();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<j1.c> i() {
        Map<Integer, List<j1.e>> map = f19062b;
        if (map != null && map.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Integer num : f19062b.keySet()) {
                j1.c cVar = new j1.c();
                cVar.b(num.intValue());
                cVar.c(com.bytedance.mtesttools.a.b.a(num.intValue()) + "广告");
                cVar.d(f19062b.get(num));
                arrayList.add(cVar);
            }
            return arrayList;
        }
        return null;
    }
}
