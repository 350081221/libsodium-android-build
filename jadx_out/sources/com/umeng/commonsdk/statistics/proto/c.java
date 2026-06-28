package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.br;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cf;
import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.cm;
import com.umeng.analytics.pro.cn;
import com.umeng.analytics.pro.cq;
import com.umeng.analytics.pro.cr;
import com.umeng.analytics.pro.ct;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cx;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.db;
import com.umeng.analytics.pro.dc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c implements br<c, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, cd> f13405d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f13406e = -5764118265293965743L;

    /* renamed from: f, reason: collision with root package name */
    private static final cv f13407f = new cv("IdTracking");

    /* renamed from: g, reason: collision with root package name */
    private static final cl f13408g = new cl("snapshots", cx.f12475k, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final cl f13409h = new cl("journals", cx.f12477m, 2);

    /* renamed from: i, reason: collision with root package name */
    private static final cl f13410i = new cl("checksum", (byte) 11, 3);

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f13411j;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.b> f13412a;

    /* renamed from: b, reason: collision with root package name */
    public List<com.umeng.commonsdk.statistics.proto.a> f13413b;

    /* renamed from: c, reason: collision with root package name */
    public String f13414c;

    /* renamed from: k, reason: collision with root package name */
    private e[] f13415k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<c> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, c cVar) throws bx {
            cqVar.j();
            while (true) {
                cl l5 = cqVar.l();
                byte b5 = l5.f12438b;
                if (b5 == 0) {
                    cqVar.k();
                    cVar.n();
                    return;
                }
                short s5 = l5.f12439c;
                int i5 = 0;
                if (s5 != 1) {
                    if (s5 != 2) {
                        if (s5 != 3) {
                            ct.a(cqVar, b5);
                        } else if (b5 == 11) {
                            cVar.f13414c = cqVar.z();
                            cVar.c(true);
                        } else {
                            ct.a(cqVar, b5);
                        }
                    } else if (b5 == 15) {
                        cm p5 = cqVar.p();
                        cVar.f13413b = new ArrayList(p5.f12441b);
                        while (i5 < p5.f12441b) {
                            com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                            aVar.read(cqVar);
                            cVar.f13413b.add(aVar);
                            i5++;
                        }
                        cqVar.q();
                        cVar.b(true);
                    } else {
                        ct.a(cqVar, b5);
                    }
                } else if (b5 == 13) {
                    cn n5 = cqVar.n();
                    cVar.f13412a = new HashMap(n5.f12444c * 2);
                    while (i5 < n5.f12444c) {
                        String z4 = cqVar.z();
                        com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                        bVar.read(cqVar);
                        cVar.f13412a.put(z4, bVar);
                        i5++;
                    }
                    cqVar.o();
                    cVar.a(true);
                } else {
                    ct.a(cqVar, b5);
                }
                cqVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, c cVar) throws bx {
            cVar.n();
            cqVar.a(c.f13407f);
            if (cVar.f13412a != null) {
                cqVar.a(c.f13408g);
                cqVar.a(new cn((byte) 11, (byte) 12, cVar.f13412a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f13412a.entrySet()) {
                    cqVar.a(entry.getKey());
                    entry.getValue().write(cqVar);
                }
                cqVar.e();
                cqVar.c();
            }
            if (cVar.f13413b != null && cVar.j()) {
                cqVar.a(c.f13409h);
                cqVar.a(new cm((byte) 12, cVar.f13413b.size()));
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f13413b.iterator();
                while (it.hasNext()) {
                    it.next().write(cqVar);
                }
                cqVar.f();
                cqVar.c();
            }
            if (cVar.f13414c != null && cVar.m()) {
                cqVar.a(c.f13410i);
                cqVar.a(cVar.f13414c);
                cqVar.c();
            }
            cqVar.d();
            cqVar.b();
        }
    }

    /* loaded from: classes3.dex */
    private static class b implements cz {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0250c extends db<c> {
        private C0250c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, c cVar) throws bx {
            cw cwVar = (cw) cqVar;
            cwVar.a(cVar.f13412a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f13412a.entrySet()) {
                cwVar.a(entry.getKey());
                entry.getValue().write(cwVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            cwVar.a(bitSet, 2);
            if (cVar.j()) {
                cwVar.a(cVar.f13413b.size());
                Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f13413b.iterator();
                while (it.hasNext()) {
                    it.next().write(cwVar);
                }
            }
            if (cVar.m()) {
                cwVar.a(cVar.f13414c);
            }
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, c cVar) throws bx {
            cw cwVar = (cw) cqVar;
            cn cnVar = new cn((byte) 11, (byte) 12, cwVar.w());
            cVar.f13412a = new HashMap(cnVar.f12444c * 2);
            for (int i5 = 0; i5 < cnVar.f12444c; i5++) {
                String z4 = cwVar.z();
                com.umeng.commonsdk.statistics.proto.b bVar = new com.umeng.commonsdk.statistics.proto.b();
                bVar.read(cwVar);
                cVar.f13412a.put(z4, bVar);
            }
            cVar.a(true);
            BitSet b5 = cwVar.b(2);
            if (b5.get(0)) {
                cm cmVar = new cm((byte) 12, cwVar.w());
                cVar.f13413b = new ArrayList(cmVar.f12441b);
                for (int i6 = 0; i6 < cmVar.f12441b; i6++) {
                    com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
                    aVar.read(cwVar);
                    cVar.f13413b.add(aVar);
                }
                cVar.b(true);
            }
            if (b5.get(1)) {
                cVar.f13414c = cwVar.z();
                cVar.c(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class d implements cz {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0250c b() {
            return new C0250c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13411j = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.SNAPSHOTS, (e) new cd("snapshots", (byte) 1, new cg(cx.f12475k, new ce((byte) 11), new ci((byte) 12, com.umeng.commonsdk.statistics.proto.b.class))));
        enumMap.put((EnumMap) e.JOURNALS, (e) new cd("journals", (byte) 2, new cf(cx.f12477m, new ci((byte) 12, com.umeng.commonsdk.statistics.proto.a.class))));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cd("checksum", (byte) 2, new ce((byte) 11)));
        Map<e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f13405d = unmodifiableMap;
        cd.a(c.class, unmodifiableMap);
    }

    public c() {
        this.f13415k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c deepCopy() {
        return new c(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f13412a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.b> c() {
        return this.f13412a;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f13412a = null;
        this.f13413b = null;
        this.f13414c = null;
    }

    public void d() {
        this.f13412a = null;
    }

    public boolean e() {
        return this.f13412a != null;
    }

    public int f() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f13413b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Iterator<com.umeng.commonsdk.statistics.proto.a> g() {
        List<com.umeng.commonsdk.statistics.proto.a> list = this.f13413b;
        if (list == null) {
            return null;
        }
        return list.iterator();
    }

    public List<com.umeng.commonsdk.statistics.proto.a> h() {
        return this.f13413b;
    }

    public void i() {
        this.f13413b = null;
    }

    public boolean j() {
        return this.f13413b != null;
    }

    public String k() {
        return this.f13414c;
    }

    public void l() {
        this.f13414c = null;
    }

    public boolean m() {
        return this.f13414c != null;
    }

    public void n() throws bx {
        if (this.f13412a != null) {
            return;
        }
        throw new cr("Required field 'snapshots' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f13411j.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        Map<String, com.umeng.commonsdk.statistics.proto.b> map = this.f13412a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            List<com.umeng.commonsdk.statistics.proto.a> list = this.f13413b;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            String str = this.f13414c;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f13411j.get(cqVar.D()).b().a(cqVar, this);
    }

    /* loaded from: classes3.dex */
    public enum e implements by {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f13419d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private final short f13421e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13422f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f13419d.put(eVar.b(), eVar);
            }
        }

        e(short s5, String str) {
            this.f13421e = s5;
            this.f13422f = str;
        }

        public static e a(int i5) {
            if (i5 == 1) {
                return SNAPSHOTS;
            }
            if (i5 == 2) {
                return JOURNALS;
            }
            if (i5 != 3) {
                return null;
            }
            return CHECKSUM;
        }

        public static e b(int i5) {
            e a5 = a(i5);
            if (a5 != null) {
                return a5;
            }
            throw new IllegalArgumentException("Field " + i5 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.by
        public String b() {
            return this.f13422f;
        }

        public static e a(String str) {
            return f13419d.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f13421e;
        }
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.b bVar) {
        if (this.f13412a == null) {
            this.f13412a = new HashMap();
        }
        this.f13412a.put(str, bVar);
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f13413b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f13414c = null;
    }

    public c(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this();
        this.f13412a = map;
    }

    public c(c cVar) {
        this.f13415k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.b> entry : cVar.f13412a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.b(entry.getValue()));
            }
            this.f13412a = hashMap;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.umeng.commonsdk.statistics.proto.a> it = cVar.f13413b.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.umeng.commonsdk.statistics.proto.a(it.next()));
            }
            this.f13413b = arrayList;
        }
        if (cVar.m()) {
            this.f13414c = cVar.f13414c;
        }
    }

    public c a(Map<String, com.umeng.commonsdk.statistics.proto.b> map) {
        this.f13412a = map;
        return this;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f13412a = null;
    }

    public void a(com.umeng.commonsdk.statistics.proto.a aVar) {
        if (this.f13413b == null) {
            this.f13413b = new ArrayList();
        }
        this.f13413b.add(aVar);
    }

    public c a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f13413b = list;
        return this;
    }

    public c a(String str) {
        this.f13414c = str;
        return this;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i5) {
        return e.a(i5);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ck(new dc(objectOutputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
