package com.ss.android.downloadlib.addownload.b;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.ss.android.downloadlib.addownload.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class i {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static i f9678a = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences c() {
        return k.a().getSharedPreferences("sp_ad_download_event", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> b() {
        ConcurrentHashMap<Long, com.ss.android.downloadad.api.a.b> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String, ?> all = c().getAll();
        if (all == null) {
            return concurrentHashMap;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    long longValue = Long.valueOf(entry.getKey()).longValue();
                    com.ss.android.downloadad.api.a.b b5 = com.ss.android.downloadad.api.a.b.b(new JSONObject(String.valueOf(entry.getValue())));
                    if (longValue > 0 && b5 != null) {
                        concurrentHashMap.put(Long.valueOf(longValue), b5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        return concurrentHashMap;
    }

    private i() {
    }

    public static i a() {
        return a.f9678a;
    }

    public void a(com.ss.android.downloadad.api.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        a((Collection<com.ss.android.downloadad.api.a.b>) arrayList);
    }

    public synchronized void a(final Collection<com.ss.android.downloadad.api.a.b> collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.addownload.b.i.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SharedPreferences.Editor edit = i.this.c().edit();
                        for (com.ss.android.downloadad.api.a.b bVar : collection) {
                            if (bVar != null && bVar.b() != 0) {
                                edit.putString(String.valueOf(bVar.b()), bVar.ah().toString());
                            }
                        }
                        edit.apply();
                    }
                }, true);
            }
        }
    }

    public void a(final List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.ss.android.downloadlib.d.a().a(new Runnable() { // from class: com.ss.android.downloadlib.addownload.b.i.2
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences.Editor edit = i.this.c().edit();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    edit.remove((String) it.next());
                }
                edit.apply();
            }
        }, true);
    }
}
