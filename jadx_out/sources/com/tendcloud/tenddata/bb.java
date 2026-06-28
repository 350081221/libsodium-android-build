package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class bb {

    /* renamed from: a, reason: collision with root package name */
    private static int f11464a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static int f11465b = 6;

    /* renamed from: c, reason: collision with root package name */
    private static int f11466c = 6;

    /* renamed from: d, reason: collision with root package name */
    private static int f11467d = -40;

    /* renamed from: e, reason: collision with root package name */
    private static int f11468e = 4;

    /* renamed from: f, reason: collision with root package name */
    private ay f11469f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {
        public ba fp1;
        public ba fp2;
        public double score;

        public a(ba baVar, ba baVar2, double d5) {
            this.fp1 = baVar;
            this.fp2 = baVar2;
            this.score = d5;
        }
    }

    /* loaded from: classes3.dex */
    class b {
        public Object key;
        public Object value;

        public b(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    public bb() {
        this(new ay());
    }

    public double a(ba baVar, ba baVar2) {
        Map<String, ax> a5 = baVar.a(false);
        Map<String, ax> a6 = baVar2.a(false);
        HashSet hashSet = new HashSet();
        int i5 = 0;
        int i6 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        for (Map.Entry<String, ax> entry : a5.entrySet()) {
            ax value = entry.getValue();
            ax axVar = a6.get(entry.getKey());
            i6 += value.c();
            if (axVar == null) {
                hashSet.add(value);
            } else {
                i5++;
                double b5 = b(value.c(), axVar.c());
                d5 += b5;
                d6 += b5 * a(value.c(), axVar.c());
            }
        }
        if (i5 == 0) {
            return 0.0d;
        }
        for (Map.Entry<String, ax> entry2 : a6.entrySet()) {
            i6 += entry2.getValue().c();
            if (!a5.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int max = Math.max(this.f11469f.d(), (int) ((i6 / ((baVar.c().size() + baVar2.c().size()) - 0)) + 1.2d));
        Iterator it = hashSet.iterator();
        double d7 = 0.0d;
        while (it.hasNext()) {
            if (((ax) it.next()).c() > max) {
                d7 += 1.0d;
            }
        }
        return (d6 / d5) * (1.0d - Math.pow(d7 / ((i5 * 2) + d7), f11468e));
    }

    public ba b(ba baVar, ba baVar2) {
        Map<String, ax> a5 = baVar.a(false);
        Map<String, ax> a6 = baVar2.a(false);
        TreeMap treeMap = new TreeMap();
        ba baVar3 = new ba();
        baVar3.setPoiId(baVar2.b());
        baVar3.setTimestamp(baVar2.a());
        LinkedList linkedList = new LinkedList();
        baVar3.setBsslist(linkedList);
        for (Map.Entry<String, ax> entry : a5.entrySet()) {
            ax value = entry.getValue();
            ax axVar = a6.get(entry.getKey());
            if (axVar == null) {
                double d5 = -value.c();
                while (treeMap.containsKey(Double.valueOf(d5))) {
                    d5 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d5), value);
            } else {
                linkedList.add(new ax(axVar.a(), axVar.b(), (byte) ((axVar.c() + value.c()) / 2), axVar.d(), axVar.e()));
            }
        }
        for (Map.Entry<String, ax> entry2 : a6.entrySet()) {
            if (!a5.containsKey(entry2.getKey())) {
                double d6 = -entry2.getValue().c();
                while (treeMap.containsKey(Double.valueOf(d6))) {
                    d6 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d6), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b5 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f11469f.c() || b5 < this.f11469f.d()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return baVar3;
    }

    public bb(ay ayVar) {
        this.f11469f = ayVar;
    }

    public double a(ba baVar, List<ba> list) {
        Iterator<ba> it = list.iterator();
        double d5 = 0.0d;
        while (it.hasNext()) {
            d5 = Math.max(a(it.next(), baVar), d5);
        }
        return d5;
    }

    public double a(List<ba> list, List<ba> list2) {
        double d5 = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        b(list, list2, linkedList);
        int i5 = 0;
        for (a aVar : linkedList) {
            if (aVar.fp1 != null && aVar.fp2 != null) {
                d5 += aVar.score;
                i5++;
            }
        }
        return d5 / i5;
    }

    public double a(List<ba> list, List<ba> list2, List<ba> list3) {
        ba baVar;
        double d5 = 0.0d;
        if (!list.isEmpty() && !list2.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            b(list, list2, linkedList);
            int i5 = 0;
            for (a aVar : linkedList) {
                ba baVar2 = aVar.fp1;
                if (baVar2 != null && (baVar = aVar.fp2) != null) {
                    d5 += aVar.score;
                    i5++;
                    list3.add(b(baVar2, baVar));
                } else if (list3.size() < this.f11469f.b()) {
                    ba baVar3 = aVar.fp1;
                    list3.add(baVar3 == null ? aVar.fp2.d() : baVar3.d());
                }
            }
            return d5 / i5;
        }
        list3.addAll(list);
        list3.addAll(list2);
        return 0.0d;
    }

    public void b(List<ba> list, List<ba> list2, List<a> list3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (ba baVar : list) {
            for (ba baVar2 : list2) {
                hashSet2.add(baVar2);
                arrayList.add(new a(baVar, baVar2, a(baVar, baVar2)));
            }
            hashSet.add(baVar);
        }
        Collections.sort(arrayList, new Comparator<a>() { // from class: com.tendcloud.tenddata.bb.1
            @Override // java.util.Comparator
            public int compare(a aVar, a aVar2) {
                double d5 = aVar.score;
                double d6 = aVar2.score;
                if (d5 == d6) {
                    return 0;
                }
                return d5 < d6 ? 1 : -1;
            }
        });
        list3.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (hashSet.contains(aVar.fp1) && hashSet2.contains(aVar.fp2)) {
                hashSet.remove(aVar.fp1);
                hashSet2.remove(aVar.fp2);
                list3.add(aVar);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            list3.add(new a((ba) it2.next(), null, 0.0d));
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            list3.add(new a(null, (ba) it3.next(), 0.0d));
        }
    }

    public double a(int i5, int i6) {
        if (i5 >= 0 || i6 >= 0) {
            return 0.0d;
        }
        double d5 = (i6 + i5) / 2;
        double abs = Math.abs(i5 - d5);
        int i7 = f11464a;
        return Math.pow(((abs > ((double) i7) ? abs - i7 : 0.0d) + d5) / d5, f11465b);
    }

    public double b(int i5, int i6) {
        if (i5 >= 0 || i6 >= 0) {
            return 0.0d;
        }
        double max = Math.max(i5, i6);
        if (max >= f11467d) {
            return 1.0d;
        }
        return Math.pow((max + 128.0d) / (r0 + 128), f11466c);
    }
}
