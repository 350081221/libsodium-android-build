package com.umeng.cconfig.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {
    public static synchronized JSONArray a(c cVar, Context context) {
        synchronized (e.class) {
            JSONArray jSONArray = null;
            if (cVar != null && context != null) {
                try {
                    a aVar = new a();
                    String uMId = UMUtils.getUMId(context);
                    if (TextUtils.isEmpty(uMId)) {
                        return null;
                    }
                    aVar.f12911i = uMId;
                    String appkey = UMUtils.getAppkey(context);
                    if (TextUtils.isEmpty(appkey)) {
                        return null;
                    }
                    aVar.f12910h = appkey;
                    aVar.f12914l = Long.valueOf(System.currentTimeMillis());
                    aVar.f12912j = Integer.valueOf(Integer.parseInt(cVar.f12945c));
                    aVar.f12913k = Integer.valueOf(Integer.parseInt(cVar.f12946d));
                    aVar.f12915m = cVar.f12943a;
                    aVar.f12916n = cVar.f12944b;
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        try {
                            jSONObject.put(a.f12903a, aVar.f12910h);
                            jSONObject.put(a.f12907e, aVar.f12914l);
                            jSONObject.put(a.f12905c, aVar.f12912j);
                            jSONObject.put(a.f12906d, aVar.f12913k);
                            jSONObject.put(a.f12904b, aVar.f12911i);
                            jSONObject.put(a.f12908f, aVar.f12915m);
                            jSONObject.put(a.f12909g, aVar.f12916n);
                            jSONArray2.put(0, jSONObject);
                            List<JSONObject> b5 = b(context);
                            if (b5.size() > 0) {
                                for (int i5 = 1; i5 <= b5.size(); i5++) {
                                    jSONArray2.put(i5, b5.get(i5 - 1));
                                }
                            }
                            try {
                                SharedPreferences a5 = com.umeng.cconfig.a.c.a(context);
                                if (a5 != null) {
                                    SharedPreferences.Editor edit = a5.edit();
                                    edit.putString("abtest_sp_last_request_data", "");
                                    edit.commit();
                                }
                            } catch (Exception unused) {
                            }
                            return jSONArray2;
                        } catch (Exception unused2) {
                            ULog.i("jessie", "[getUpdateAbEventLogParam] error i");
                            jSONArray = jSONArray2;
                        }
                    } catch (Exception unused3) {
                        jSONArray = jSONArray2;
                        ULog.i("jessie", "[getUpdateAbEventLogParam] error ii");
                        return jSONArray;
                    }
                } catch (Exception unused4) {
                }
            }
            return jSONArray;
        }
    }

    public static synchronized JSONObject a(Context context) {
        JSONObject jSONObject;
        synchronized (e.class) {
            JSONObject jSONObject2 = null;
            try {
                b bVar = new b();
                String uMId = UMUtils.getUMId(context);
                if (TextUtils.isEmpty(uMId)) {
                    return null;
                }
                bVar.f12930n = uMId;
                String appkey = UMUtils.getAppkey(context);
                if (TextUtils.isEmpty(appkey)) {
                    return null;
                }
                bVar.f12931o = appkey;
                bVar.f12932p = UMUtils.getAppVersionName(context);
                bVar.f12933q = "9.3.3";
                bVar.f12934r = UMUtils.getChannel(context);
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                bVar.f12935s = sb.toString();
                bVar.f12936t = Build.BRAND;
                bVar.f12937u = Build.MODEL;
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                bVar.f12938v = localeInfo[1];
                bVar.f12941y = localeInfo[0];
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                bVar.f12940x = Integer.valueOf(resolutionArray[1]);
                bVar.f12939w = Integer.valueOf(resolutionArray[0]);
                String str = "";
                if (context != null) {
                    str = UMEnvelopeBuild.imprintProperty(context, "install_datetime", "");
                }
                bVar.f12942z = str;
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException unused) {
                }
                try {
                    jSONObject.put(b.f12917a, bVar.f12930n);
                    jSONObject.put(b.f12919c, bVar.f12932p);
                    jSONObject.put(b.f12918b, bVar.f12931o);
                    jSONObject.put(b.f12920d, bVar.f12933q);
                    jSONObject.put(b.f12921e, bVar.f12934r);
                    jSONObject.put(b.f12922f, bVar.f12935s);
                    jSONObject.put(b.f12923g, bVar.f12936t);
                    jSONObject.put(b.f12924h, bVar.f12937u);
                    jSONObject.put(b.f12927k, bVar.f12940x);
                    jSONObject.put(b.f12926j, bVar.f12939w);
                    jSONObject.put(b.f12928l, bVar.f12941y);
                    jSONObject.put(b.f12925i, bVar.f12938v);
                    jSONObject.put(b.f12929m, bVar.f12942z);
                    return jSONObject;
                } catch (JSONException unused2) {
                    jSONObject2 = jSONObject;
                    ULog.i("jessie", "[getCloudConfigParam] error i");
                    return jSONObject2;
                } catch (Exception unused3) {
                    jSONObject2 = jSONObject;
                    ULog.i("jessie", "[getCloudConfigParam] error ii");
                    return jSONObject2;
                }
            } catch (Exception unused4) {
            }
        }
    }

    private static List<JSONObject> b(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            SharedPreferences a5 = com.umeng.cconfig.a.c.a(context);
            if (a5 != null) {
                String string = a5.getString("abtest_sp_last_request_data", "");
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        int length = jSONArray.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            String string2 = jSONArray.getString(i5);
                            if (!TextUtils.isEmpty(string2)) {
                                arrayList.add(new JSONObject(string2));
                            }
                        }
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
