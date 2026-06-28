package com.tendcloud.tenddata;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.http.Headers;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private static Location f11825a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f11826b = false;

    public static List<Location> a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (!ab.T.isLocationEnabled()) {
            return arrayList;
        }
        if (ab.P) {
            return arrayList;
        }
        try {
            arrayList.add(f(context));
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    public static String b(Context context) {
        Object obj;
        Object obj2;
        Object obj3;
        try {
            List<Location> a5 = a(context);
            StringBuilder sb = new StringBuilder();
            for (Location location : a5) {
                if (location != null) {
                    sb.append(location.getLatitude());
                    sb.append(',');
                    sb.append(location.getLongitude());
                    sb.append(',');
                    Object obj4 = "";
                    if (!location.hasAltitude()) {
                        obj = "";
                    } else {
                        obj = Double.valueOf(location.getAltitude());
                    }
                    sb.append(obj);
                    sb.append(',');
                    sb.append(location.getTime());
                    sb.append(',');
                    if (!location.hasAccuracy()) {
                        obj2 = "";
                    } else {
                        obj2 = Float.valueOf(location.getAccuracy());
                    }
                    sb.append(obj2);
                    sb.append(',');
                    if (!location.hasBearing()) {
                        obj3 = "";
                    } else {
                        obj3 = Float.valueOf(location.getBearing());
                    }
                    sb.append(obj3);
                    sb.append(',');
                    if (location.hasSpeed()) {
                        obj4 = Float.valueOf(location.getSpeed());
                    }
                    sb.append(obj4);
                    sb.append(',');
                    sb.append(location.getProvider());
                    sb.append(':');
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONArray c(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (!ab.T.isLocationEnabled()) {
            return jSONArray;
        }
        if (ab.P) {
            return jSONArray;
        }
        try {
            Location f5 = f(context);
            if (f5 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.umeng.analytics.pro.d.C, f5.getLatitude());
                jSONObject.put(com.umeng.analytics.pro.d.D, f5.getLongitude());
                jSONObject.put("ts", f5.getTime());
                if (y.a(17)) {
                    jSONObject.put("elapsed", f5.getElapsedRealtimeNanos());
                }
                if (f5.hasAltitude()) {
                    jSONObject.put("altitude", f5.getAltitude());
                }
                if (f5.hasAccuracy()) {
                    jSONObject.put("hAccuracy", f5.getAccuracy());
                }
                if (f5.hasBearing()) {
                    jSONObject.put("bearing", f5.getBearing());
                }
                if (f5.hasSpeed()) {
                    jSONObject.put("speed", f5.getSpeed());
                }
                jSONObject.put("provider", f5.getProvider());
                jSONArray.put(jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public static JSONArray d(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray A = o.A(context);
            if (A.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "sim");
                jSONObject.put("extra", A);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", ServiceManagerNative.ACCOUNT);
            String str = ab.f11362r;
            if (str != null) {
                jSONObject2.put("accountId", str);
            }
            String l5 = i.l();
            if (!y.b(l5)) {
                h.dForInternal(l5);
                JSONObject jSONObject3 = new JSONObject(l5);
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("accountProp", jSONObject3);
                }
            }
            if (jSONObject2.length() > 1) {
                jSONArray.put(jSONObject2);
            }
            if (jSONArray.length() > 0) {
                return jSONArray;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long[][] e(Context context) {
        return new Long[3];
    }

    private static Location f(Context context) {
        boolean z4;
        boolean z5;
        Location location = null;
        if (!ab.T.isLocationEnabled()) {
            return null;
        }
        if (f11826b) {
            return f11825a;
        }
        if (!y.b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            f11826b = true;
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) ab.f11351g.getSystemService(Headers.LOCATION);
            if (locationManager != null) {
                z4 = locationManager.isProviderEnabled("gps");
                z5 = locationManager.isProviderEnabled("network");
            } else {
                z4 = false;
                z5 = false;
            }
            if (z4 || z5) {
                location = locationManager.getLastKnownLocation("passive");
            }
        } catch (Throwable unused) {
        }
        f11825a = location;
        f11826b = true;
        return location;
    }
}
