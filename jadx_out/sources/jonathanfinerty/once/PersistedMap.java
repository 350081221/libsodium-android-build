package jonathanfinerty.once;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
class PersistedMap {

    /* renamed from: c, reason: collision with root package name */
    private static final String f18985c = ",";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f18986a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<Long>> f18987b = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersistedMap(Context context, String str) {
        List<Long> d5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("PersistedMap".concat(str), 0);
        this.f18986a = sharedPreferences;
        for (String str2 : sharedPreferences.getAll().keySet()) {
            try {
                d5 = g(this.f18986a.getString(str2, null));
            } catch (ClassCastException unused) {
                d5 = d(str2);
            }
            this.f18987b.put(str2, d5);
        }
    }

    private String c(List<Long> list) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Long l5 : list) {
            sb.append(str);
            sb.append(l5);
            str = f18985c;
        }
        return sb.toString();
    }

    private List<Long> d(String str) {
        long j5 = this.f18986a.getLong(str, -1L);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Long.valueOf(j5));
        this.f18986a.edit().putString(str, c(arrayList)).apply();
        return arrayList;
    }

    private List<Long> g(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(f18985c);
            ArrayList arrayList = new ArrayList(split.length);
            for (String str2 : split) {
                arrayList.add(Long.valueOf(Long.parseLong(str2)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f18987b.clear();
        SharedPreferences.Editor edit = this.f18986a.edit();
        edit.clear();
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public List<Long> b(String str) {
        List<Long> list = this.f18987b.get(str);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(String str, long j5) {
        List<Long> list = this.f18987b.get(str);
        if (list == null) {
            list = new ArrayList<>(1);
        }
        list.add(Long.valueOf(j5));
        this.f18987b.put(str, list);
        SharedPreferences.Editor edit = this.f18986a.edit();
        edit.putString(str, c(list));
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str) {
        this.f18987b.remove(str);
        SharedPreferences.Editor edit = this.f18986a.edit();
        edit.remove(str);
        edit.apply();
    }
}
