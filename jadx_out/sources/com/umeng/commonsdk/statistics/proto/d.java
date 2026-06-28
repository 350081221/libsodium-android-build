package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.br;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.cg;
import com.umeng.analytics.pro.ci;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cl;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class d implements br<d, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, cd> f13423d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f13424e = 2846460275012375038L;

    /* renamed from: f, reason: collision with root package name */
    private static final cv f13425f = new cv("Imprint");

    /* renamed from: g, reason: collision with root package name */
    private static final cl f13426g = new cl("property", cx.f12475k, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final cl f13427h = new cl("version", (byte) 8, 2);

    /* renamed from: i, reason: collision with root package name */
    private static final cl f13428i = new cl("checksum", (byte) 11, 3);

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f13429j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f13430k = 0;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, com.umeng.commonsdk.statistics.proto.e> f13431a;

    /* renamed from: b, reason: collision with root package name */
    public int f13432b;

    /* renamed from: c, reason: collision with root package name */
    public String f13433c;

    /* renamed from: l, reason: collision with root package name */
    private byte f13434l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<d> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, d dVar) throws bx {
            cqVar.j();
            while (true) {
                cl l5 = cqVar.l();
                byte b5 = l5.f12438b;
                if (b5 == 0) {
                    break;
                }
                short s5 = l5.f12439c;
                if (s5 != 1) {
                    if (s5 != 2) {
                        if (s5 != 3) {
                            ct.a(cqVar, b5);
                        } else if (b5 == 11) {
                            dVar.f13433c = cqVar.z();
                            dVar.c(true);
                        } else {
                            ct.a(cqVar, b5);
                        }
                    } else if (b5 == 8) {
                        dVar.f13432b = cqVar.w();
                        dVar.b(true);
                    } else {
                        ct.a(cqVar, b5);
                    }
                } else if (b5 == 13) {
                    cn n5 = cqVar.n();
                    dVar.f13431a = new HashMap(n5.f12444c * 2);
                    for (int i5 = 0; i5 < n5.f12444c; i5++) {
                        String z4 = cqVar.z();
                        com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                        eVar.read(cqVar);
                        dVar.f13431a.put(z4, eVar);
                    }
                    cqVar.o();
                    dVar.a(true);
                } else {
                    ct.a(cqVar, b5);
                }
                cqVar.m();
            }
            cqVar.k();
            if (dVar.h()) {
                dVar.l();
                return;
            }
            throw new cr("Required field 'version' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, d dVar) throws bx {
            dVar.l();
            cqVar.a(d.f13425f);
            if (dVar.f13431a != null) {
                cqVar.a(d.f13426g);
                cqVar.a(new cn((byte) 11, (byte) 12, dVar.f13431a.size()));
                for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f13431a.entrySet()) {
                    cqVar.a(entry.getKey());
                    entry.getValue().write(cqVar);
                }
                cqVar.e();
                cqVar.c();
            }
            cqVar.a(d.f13427h);
            cqVar.a(dVar.f13432b);
            cqVar.c();
            if (dVar.f13433c != null) {
                cqVar.a(d.f13428i);
                cqVar.a(dVar.f13433c);
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
    /* loaded from: classes3.dex */
    public static class c extends db<d> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, d dVar) throws bx {
            cw cwVar = (cw) cqVar;
            cwVar.a(dVar.f13431a.size());
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f13431a.entrySet()) {
                cwVar.a(entry.getKey());
                entry.getValue().write(cwVar);
            }
            cwVar.a(dVar.f13432b);
            cwVar.a(dVar.f13433c);
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, d dVar) throws bx {
            cw cwVar = (cw) cqVar;
            cn cnVar = new cn((byte) 11, (byte) 12, cwVar.w());
            dVar.f13431a = new HashMap(cnVar.f12444c * 2);
            for (int i5 = 0; i5 < cnVar.f12444c; i5++) {
                String z4 = cwVar.z();
                com.umeng.commonsdk.statistics.proto.e eVar = new com.umeng.commonsdk.statistics.proto.e();
                eVar.read(cwVar);
                dVar.f13431a.put(z4, eVar);
            }
            dVar.a(true);
            dVar.f13432b = cwVar.w();
            dVar.b(true);
            dVar.f13433c = cwVar.z();
            dVar.c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0251d implements cz {
        private C0251d() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13429j = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new C0251d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.PROPERTY, (e) new cd("property", (byte) 1, new cg(cx.f12475k, new ce((byte) 11), new ci((byte) 12, com.umeng.commonsdk.statistics.proto.e.class))));
        enumMap.put((EnumMap) e.VERSION, (e) new cd("version", (byte) 1, new ce((byte) 8)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cd("checksum", (byte) 1, new ce((byte) 11)));
        Map<e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f13423d = unmodifiableMap;
        cd.a(d.class, unmodifiableMap);
    }

    public d() {
        this.f13434l = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d deepCopy() {
        return new d(this);
    }

    public int b() {
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f13431a;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public Map<String, com.umeng.commonsdk.statistics.proto.e> c() {
        return this.f13431a;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f13431a = null;
        b(false);
        this.f13432b = 0;
        this.f13433c = null;
    }

    public void d() {
        this.f13431a = null;
    }

    public boolean e() {
        return this.f13431a != null;
    }

    public int f() {
        return this.f13432b;
    }

    public void g() {
        this.f13434l = bo.b(this.f13434l, 0);
    }

    public boolean h() {
        return bo.a(this.f13434l, 0);
    }

    public String i() {
        return this.f13433c;
    }

    public void j() {
        this.f13433c = null;
    }

    public boolean k() {
        return this.f13433c != null;
    }

    public void l() throws bx {
        if (this.f13431a != null) {
            if (this.f13433c != null) {
                return;
            }
            throw new cr("Required field 'checksum' was not present! Struct: " + toString());
        }
        throw new cr("Required field 'property' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f13429j.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        Map<String, com.umeng.commonsdk.statistics.proto.e> map = this.f13431a;
        if (map == null) {
            sb.append("null");
        } else {
            sb.append(map);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f13432b);
        sb.append(", ");
        sb.append("checksum:");
        String str = this.f13433c;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f13429j.get(cqVar.D()).b().a(cqVar, this);
    }

    /* loaded from: classes3.dex */
    public enum e implements by {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f13438d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private final short f13440e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13441f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f13438d.put(eVar.b(), eVar);
            }
        }

        e(short s5, String str) {
            this.f13440e = s5;
            this.f13441f = str;
        }

        public static e a(int i5) {
            if (i5 == 1) {
                return PROPERTY;
            }
            if (i5 == 2) {
                return VERSION;
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
            return this.f13441f;
        }

        public static e a(String str) {
            return f13438d.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f13440e;
        }
    }

    public void a(String str, com.umeng.commonsdk.statistics.proto.e eVar) {
        if (this.f13431a == null) {
            this.f13431a = new HashMap();
        }
        this.f13431a.put(str, eVar);
    }

    public void b(boolean z4) {
        this.f13434l = bo.a(this.f13434l, 0, z4);
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f13433c = null;
    }

    public d(Map<String, com.umeng.commonsdk.statistics.proto.e> map, int i5, String str) {
        this();
        this.f13431a = map;
        this.f13432b = i5;
        b(true);
        this.f13433c = str;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i5) {
        return e.a(i5);
    }

    public d a(Map<String, com.umeng.commonsdk.statistics.proto.e> map) {
        this.f13431a = map;
        return this;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f13431a = null;
    }

    public d a(int i5) {
        this.f13432b = i5;
        b(true);
        return this;
    }

    public d(d dVar) {
        this.f13434l = (byte) 0;
        this.f13434l = dVar.f13434l;
        if (dVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, com.umeng.commonsdk.statistics.proto.e> entry : dVar.f13431a.entrySet()) {
                hashMap.put(entry.getKey(), new com.umeng.commonsdk.statistics.proto.e(entry.getValue()));
            }
            this.f13431a = hashMap;
        }
        this.f13432b = dVar.f13432b;
        if (dVar.k()) {
            this.f13433c = dVar.f13433c;
        }
    }

    public d a(String str) {
        this.f13433c = str;
        return this;
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
            this.f13434l = (byte) 0;
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
