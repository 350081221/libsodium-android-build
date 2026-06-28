package com.huawei.agconnect.core.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceDiscovery;
import com.huawei.agconnect.core.ServiceRegistrar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7810a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a implements Serializable, Comparator<Map.Entry<String, Integer>> {
        private a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f7810a = context;
    }

    private <T extends ServiceRegistrar> T a(String str) {
        StringBuilder sb;
        String sb2;
        try {
            Class<?> cls = Class.forName(str);
            if (ServiceRegistrar.class.isAssignableFrom(cls)) {
                return (T) Class.forName(str).newInstance();
            }
            Log.e("AGC_Registrar", cls + " must extends from ServiceRegistrar.");
            return null;
        } catch (ClassNotFoundException e5) {
            sb2 = "Can not found service class, " + e5.getMessage();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (IllegalAccessException e6) {
            e = e6;
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        } catch (InstantiationException e7) {
            e = e7;
            sb = new StringBuilder();
            sb.append("instantiate service class exception ");
            sb.append(e.getLocalizedMessage());
            sb2 = sb.toString();
            Log.e("AGC_Registrar", sb2);
            return null;
        }
    }

    private List<String> b() {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        Bundle c5 = c();
        if (c5 == null) {
            return arrayList;
        }
        HashMap hashMap = new HashMap(10);
        for (String str : c5.keySet()) {
            if ("com.huawei.agconnect.core.ServiceRegistrar".equals(c5.getString(str))) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0], Integer.valueOf(split[1]));
                    } catch (NumberFormatException e5) {
                        sb = new StringBuilder();
                        sb.append("registrar configuration format error:");
                        str = e5.getMessage();
                    }
                } else if (split.length == 1) {
                    hashMap.put(split[0], 1000);
                } else {
                    sb = new StringBuilder();
                    sb.append("registrar configuration error, ");
                    sb.append(str);
                    Log.e("AGC_Registrar", sb.toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList2, new a());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    private Bundle c() {
        ServiceInfo serviceInfo;
        PackageManager packageManager = this.f7810a.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            serviceInfo = packageManager.getServiceInfo(new ComponentName(this.f7810a, (Class<?>) ServiceDiscovery.class), 128);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("AGC_Registrar", "get ServiceDiscovery exception." + e5.getLocalizedMessage());
        }
        if (serviceInfo != null) {
            return serviceInfo.metaData;
        }
        Log.e("AGC_Registrar", "Can not found ServiceDiscovery service.");
        return null;
    }

    public List<Service> a() {
        Log.i("AGC_Registrar", "getServices");
        List<String> b5 = b();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = b5.iterator();
        while (it.hasNext()) {
            ServiceRegistrar a5 = a(it.next());
            if (a5 != null) {
                a5.initialize(this.f7810a);
                List<Service> services = a5.getServices(this.f7810a);
                if (services != null) {
                    arrayList.addAll(services);
                }
            }
        }
        Log.i("AGC_Registrar", "services:" + arrayList.size());
        return arrayList;
    }
}
