package com.tendcloud.tenddata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class az {

    /* renamed from: a, reason: collision with root package name */
    private static int f11454a = 2;

    /* renamed from: b, reason: collision with root package name */
    private static int f11455b = 6;

    /* renamed from: c, reason: collision with root package name */
    private static int f11456c = 6;

    /* renamed from: d, reason: collision with root package name */
    private static int f11457d = -40;

    /* renamed from: e, reason: collision with root package name */
    private static int f11458e = 4;

    /* renamed from: f, reason: collision with root package name */
    private b f11459f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {
        static final int DEFAULT_MAX_BSS_ENTRIES = 50;
        static final int DEFAULT_MAX_FINGERPRINTS = 10;
        static final int DEFAULT_MIN_FINGERPRINTS = 3;
        static final int DEFAULT_RSSI_THRESHOLD = -85;
        private int maxFingerprints = 10;
        private int minFingerprints = 3;
        private int maxBssEntries = 50;
        private int rssiThreshold = -85;

        b() {
        }

        int getMaxBssEntries() {
            return this.maxBssEntries;
        }

        int getMaxFingerprints() {
            return this.maxFingerprints;
        }

        int getMinFingerprints() {
            return this.minFingerprints;
        }

        int getRssiThreshold() {
            return this.rssiThreshold;
        }

        void setMaxBssEntries(int i5) {
            this.maxBssEntries = i5;
        }

        void setMaxFingerprints(int i5) {
            this.maxFingerprints = i5;
        }

        void setMinFingerprints(int i5) {
            this.minFingerprints = i5;
        }

        void setRssiThreshold(int i5) {
            this.rssiThreshold = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c {
        private List<a> bsslist;
        private Map<String, a> bssmap;
        private long poiId;
        private int timestamp;

        c() {
        }

        c cloneFingerprint() {
            c cVar = new c();
            cVar.setTimestamp(this.timestamp);
            cVar.setPoiId(this.poiId);
            LinkedList linkedList = new LinkedList();
            Iterator<a> it = this.bsslist.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().cloneBssEntry());
            }
            cVar.setBsslist(linkedList);
            return cVar;
        }

        List<a> getBsslist() {
            return this.bsslist;
        }

        Map<String, a> getBssmap(boolean z4) {
            if (this.bssmap == null || z4) {
                this.bssmap = new HashMap();
                for (a aVar : this.bsslist) {
                    this.bssmap.put(aVar.getBssid(), aVar);
                }
            }
            return this.bssmap;
        }

        long getPoiId() {
            return this.poiId;
        }

        int getTimestamp() {
            return this.timestamp;
        }

        void setBsslist(List<a> list) {
            this.bsslist = list;
        }

        void setPoiId(long j5) {
            this.poiId = j5;
        }

        void setTimestamp(int i5) {
            this.timestamp = i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d {
        c fp1;
        c fp2;
        double score;

        d(c cVar, c cVar2, double d5) {
            this.fp1 = cVar;
            this.fp2 = cVar2;
            this.score = d5;
        }
    }

    /* loaded from: classes3.dex */
    class e {
        Object key;
        Object value;

        e(Object obj, Object obj2) {
            this.key = obj;
            this.value = obj2;
        }
    }

    az() {
        this(new b());
    }

    double a(c cVar, c cVar2) {
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        HashSet hashSet = new HashSet();
        int i5 = 0;
        int i6 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            i6 += value.getRssi();
            if (aVar == null) {
                hashSet.add(value);
            } else {
                i5++;
                double b5 = b(value.getRssi(), aVar.getRssi());
                d5 += b5;
                d6 += b5 * a(value.getRssi(), aVar.getRssi());
            }
        }
        if (i5 == 0) {
            return 0.0d;
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            i6 += entry2.getValue().getRssi();
            if (!bssmap.containsKey(entry2.getKey())) {
                hashSet.add(entry2.getValue());
            }
        }
        int max = Math.max(this.f11459f.getRssiThreshold(), (int) ((i6 / ((cVar.getBsslist().size() + cVar2.getBsslist().size()) - 0)) + 1.2d));
        Iterator it = hashSet.iterator();
        double d7 = 0.0d;
        while (it.hasNext()) {
            if (((a) it.next()).getRssi() > max) {
                d7 += 1.0d;
            }
        }
        return (d6 / d5) * (1.0d - Math.pow(d7 / ((i5 * 2) + d7), f11458e));
    }

    c b(c cVar, c cVar2) {
        Map<String, a> bssmap = cVar.getBssmap(false);
        Map<String, a> bssmap2 = cVar2.getBssmap(false);
        TreeMap treeMap = new TreeMap();
        c cVar3 = new c();
        cVar3.setPoiId(cVar2.getPoiId());
        cVar3.setTimestamp(cVar2.getTimestamp());
        LinkedList linkedList = new LinkedList();
        cVar3.setBsslist(linkedList);
        for (Map.Entry<String, a> entry : bssmap.entrySet()) {
            a value = entry.getValue();
            a aVar = bssmap2.get(entry.getKey());
            if (aVar == null) {
                double d5 = -value.getRssi();
                while (treeMap.containsKey(Double.valueOf(d5))) {
                    d5 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d5), value);
            } else {
                linkedList.add(new a(aVar.getSsid(), aVar.getBssid(), (byte) ((aVar.getRssi() + value.getRssi()) / 2), aVar.getBand(), aVar.getChannel()));
            }
        }
        for (Map.Entry<String, a> entry2 : bssmap2.entrySet()) {
            if (!bssmap.containsKey(entry2.getKey())) {
                double d6 = -entry2.getValue().getRssi();
                while (treeMap.containsKey(Double.valueOf(d6))) {
                    d6 += 1.0E-4d;
                }
                treeMap.put(Double.valueOf(d6), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            byte b5 = (byte) (-((Double) entry3.getKey()).doubleValue());
            if (linkedList.size() >= this.f11459f.getMaxBssEntries() || b5 < this.f11459f.getRssiThreshold()) {
                break;
            }
            linkedList.add(entry3.getValue());
        }
        return cVar3;
    }

    az(b bVar) {
        this.f11459f = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a {
        private byte band;
        private String bssid;
        private byte channel;
        private byte rssi;
        private String ssid;

        a() {
            this.ssid = "";
            this.bssid = a1.c.f92a;
            this.rssi = (byte) -127;
            this.band = (byte) 1;
            this.channel = (byte) 1;
        }

        a cloneBssEntry() {
            return new a(this.ssid, this.bssid, this.rssi, this.band, this.channel);
        }

        byte getBand() {
            return this.band;
        }

        String getBssid() {
            return this.bssid;
        }

        byte getChannel() {
            return this.channel;
        }

        byte getRssi() {
            return this.rssi;
        }

        String getSsid() {
            return this.ssid;
        }

        void setBand(byte b5) {
            this.band = b5;
        }

        void setBssid(String str) {
            this.bssid = str;
        }

        void setChannel(byte b5) {
            this.channel = b5;
        }

        void setRssi(byte b5) {
            this.rssi = b5;
        }

        void setSsid(String str) {
            this.ssid = str;
        }

        a(String str, String str2, byte b5, byte b6, byte b7) {
            this.ssid = str;
            this.bssid = str2;
            this.rssi = b5;
            this.band = b6;
            this.channel = b7;
        }
    }

    double a(c cVar, List<c> list) {
        Iterator<c> it = list.iterator();
        double d5 = 0.0d;
        while (it.hasNext()) {
            d5 = Math.max(a(it.next(), cVar), d5);
        }
        return d5;
    }

    double a(List<c> list, List<c> list2) {
        double d5 = 0.0d;
        if (list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        LinkedList linkedList = new LinkedList();
        b(list, list2, linkedList);
        int i5 = 0;
        for (d dVar : linkedList) {
            if (dVar.fp1 != null && dVar.fp2 != null) {
                d5 += dVar.score;
                i5++;
            }
        }
        return d5 / i5;
    }

    double a(List<c> list, List<c> list2, List<c> list3) {
        c cVar;
        double d5 = 0.0d;
        if (!list.isEmpty() && !list2.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            b(list, list2, linkedList);
            int i5 = 0;
            for (d dVar : linkedList) {
                c cVar2 = dVar.fp1;
                if (cVar2 != null && (cVar = dVar.fp2) != null) {
                    d5 += dVar.score;
                    i5++;
                    list3.add(b(cVar2, cVar));
                } else if (list3.size() < this.f11459f.getMinFingerprints()) {
                    c cVar3 = dVar.fp1;
                    list3.add(cVar3 == null ? dVar.fp2.cloneFingerprint() : cVar3.cloneFingerprint());
                }
            }
            return d5 / i5;
        }
        list3.addAll(list);
        list3.addAll(list2);
        return 0.0d;
    }

    void b(List<c> list, List<c> list2, List<d> list3) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (c cVar : list) {
            for (c cVar2 : list2) {
                hashSet2.add(cVar2);
                arrayList.add(new d(cVar, cVar2, a(cVar, cVar2)));
            }
            hashSet.add(cVar);
        }
        Collections.sort(arrayList, new Comparator<d>() { // from class: com.tendcloud.tenddata.az.1
            @Override // java.util.Comparator
            public int compare(d dVar, d dVar2) {
                if (Double.doubleToLongBits(dVar.score) == Double.doubleToLongBits(dVar2.score)) {
                    return 0;
                }
                return Double.doubleToLongBits(dVar.score) < Double.doubleToLongBits(dVar2.score) ? 1 : -1;
            }
        });
        list3.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (hashSet.contains(dVar.fp1) && hashSet2.contains(dVar.fp2)) {
                hashSet.remove(dVar.fp1);
                hashSet2.remove(dVar.fp2);
                list3.add(dVar);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            list3.add(new d((c) it2.next(), null, 0.0d));
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            list3.add(new d(null, (c) it3.next(), 0.0d));
        }
    }

    double a(int i5, int i6) {
        if (i5 >= 0 || i6 >= 0) {
            return 0.0d;
        }
        double d5 = (i6 + i5) / 2;
        double abs = Math.abs(i5 - d5);
        int i7 = f11454a;
        return Math.pow(((abs > ((double) i7) ? abs - i7 : 0.0d) + d5) / d5, f11455b);
    }

    double b(int i5, int i6) {
        if (i5 >= 0 || i6 >= 0) {
            return 0.0d;
        }
        double max = Math.max(i5, i6);
        if (max >= f11457d) {
            return 1.0d;
        }
        return Math.pow((max + 128.0d) / (r0 + 128), f11456c);
    }
}
