package com.airbnb.lottie;

import android.util.Log;
import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1308a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set<b> f1309b = new ArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, com.airbnb.lottie.utils.j> f1310c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator<Pair<String, Float>> f1311d = new a();

    /* loaded from: classes2.dex */
    class a implements Comparator<Pair<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float floatValue = pair.second.floatValue();
            float floatValue2 = pair2.second.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(float f5);
    }

    public void a(b bVar) {
        this.f1309b.add(bVar);
    }

    public void b() {
        this.f1310c.clear();
    }

    public List<Pair<String, Float>> c() {
        if (!this.f1308a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f1310c.size());
        for (Map.Entry<String, com.airbnb.lottie.utils.j> entry : this.f1310c.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), Float.valueOf(entry.getValue().b())));
        }
        Collections.sort(arrayList, this.f1311d);
        return arrayList;
    }

    public void d() {
        if (!this.f1308a) {
            return;
        }
        List<Pair<String, Float>> c5 = c();
        Log.d(f.f1282b, "Render times:");
        for (int i5 = 0; i5 < c5.size(); i5++) {
            Pair<String, Float> pair = c5.get(i5);
            Log.d(f.f1282b, String.format("\t\t%30s:%.2f", pair.first, pair.second));
        }
    }

    public void e(String str, float f5) {
        if (!this.f1308a) {
            return;
        }
        com.airbnb.lottie.utils.j jVar = this.f1310c.get(str);
        if (jVar == null) {
            jVar = new com.airbnb.lottie.utils.j();
            this.f1310c.put(str, jVar);
        }
        jVar.a(f5);
        if (str.equals("__container")) {
            Iterator<b> it = this.f1309b.iterator();
            while (it.hasNext()) {
                it.next().a(f5);
            }
        }
    }

    public void f(b bVar) {
        this.f1309b.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(boolean z4) {
        this.f1308a = z4;
    }
}
