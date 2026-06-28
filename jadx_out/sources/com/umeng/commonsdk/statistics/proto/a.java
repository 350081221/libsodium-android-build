package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.br;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import com.umeng.analytics.pro.ck;
import com.umeng.analytics.pro.cl;
import com.umeng.analytics.pro.cq;
import com.umeng.analytics.pro.cr;
import com.umeng.analytics.pro.ct;
import com.umeng.analytics.pro.cv;
import com.umeng.analytics.pro.cw;
import com.umeng.analytics.pro.cy;
import com.umeng.analytics.pro.cz;
import com.umeng.analytics.pro.da;
import com.umeng.analytics.pro.db;
import com.umeng.analytics.pro.dc;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes3.dex */
public class a implements br<a, e>, Serializable, Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final Map<e, cd> f13362e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f13363f = 9132678615281394583L;

    /* renamed from: g, reason: collision with root package name */
    private static final cv f13364g = new cv("IdJournal");

    /* renamed from: h, reason: collision with root package name */
    private static final cl f13365h = new cl(ClientCookie.DOMAIN_ATTR, (byte) 11, 1);

    /* renamed from: i, reason: collision with root package name */
    private static final cl f13366i = new cl("old_id", (byte) 11, 2);

    /* renamed from: j, reason: collision with root package name */
    private static final cl f13367j = new cl("new_id", (byte) 11, 3);

    /* renamed from: k, reason: collision with root package name */
    private static final cl f13368k = new cl("ts", (byte) 10, 4);

    /* renamed from: l, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f13369l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f13370m = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f13371a;

    /* renamed from: b, reason: collision with root package name */
    public String f13372b;

    /* renamed from: c, reason: collision with root package name */
    public String f13373c;

    /* renamed from: d, reason: collision with root package name */
    public long f13374d;

    /* renamed from: n, reason: collision with root package name */
    private byte f13375n;

    /* renamed from: o, reason: collision with root package name */
    private e[] f13376o;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0248a extends da<a> {
        private C0248a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, a aVar) throws bx {
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
                            if (s5 != 4) {
                                ct.a(cqVar, b5);
                            } else if (b5 == 10) {
                                aVar.f13374d = cqVar.x();
                                aVar.d(true);
                            } else {
                                ct.a(cqVar, b5);
                            }
                        } else if (b5 == 11) {
                            aVar.f13373c = cqVar.z();
                            aVar.c(true);
                        } else {
                            ct.a(cqVar, b5);
                        }
                    } else if (b5 == 11) {
                        aVar.f13372b = cqVar.z();
                        aVar.b(true);
                    } else {
                        ct.a(cqVar, b5);
                    }
                } else if (b5 == 11) {
                    aVar.f13371a = cqVar.z();
                    aVar.a(true);
                } else {
                    ct.a(cqVar, b5);
                }
                cqVar.m();
            }
            cqVar.k();
            if (aVar.m()) {
                aVar.n();
                return;
            }
            throw new cr("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, a aVar) throws bx {
            aVar.n();
            cqVar.a(a.f13364g);
            if (aVar.f13371a != null) {
                cqVar.a(a.f13365h);
                cqVar.a(aVar.f13371a);
                cqVar.c();
            }
            if (aVar.f13372b != null && aVar.g()) {
                cqVar.a(a.f13366i);
                cqVar.a(aVar.f13372b);
                cqVar.c();
            }
            if (aVar.f13373c != null) {
                cqVar.a(a.f13367j);
                cqVar.a(aVar.f13373c);
                cqVar.c();
            }
            cqVar.a(a.f13368k);
            cqVar.a(aVar.f13374d);
            cqVar.c();
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
        public C0248a b() {
            return new C0248a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends db<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, a aVar) throws bx {
            cw cwVar = (cw) cqVar;
            cwVar.a(aVar.f13371a);
            cwVar.a(aVar.f13373c);
            cwVar.a(aVar.f13374d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            cwVar.a(bitSet, 1);
            if (aVar.g()) {
                cwVar.a(aVar.f13372b);
            }
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, a aVar) throws bx {
            cw cwVar = (cw) cqVar;
            aVar.f13371a = cwVar.z();
            aVar.a(true);
            aVar.f13373c = cwVar.z();
            aVar.c(true);
            aVar.f13374d = cwVar.x();
            aVar.d(true);
            if (cwVar.b(1).get(0)) {
                aVar.f13372b = cwVar.z();
                aVar.b(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class d implements cz {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13369l = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.DOMAIN, (e) new cd(ClientCookie.DOMAIN_ATTR, (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.OLD_ID, (e) new cd("old_id", (byte) 2, new ce((byte) 11)));
        enumMap.put((EnumMap) e.NEW_ID, (e) new cd("new_id", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new cd("ts", (byte) 1, new ce((byte) 10)));
        Map<e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f13362e = unmodifiableMap;
        cd.a(a.class, unmodifiableMap);
    }

    public a() {
        this.f13375n = (byte) 0;
        this.f13376o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a deepCopy() {
        return new a(this);
    }

    public String b() {
        return this.f13371a;
    }

    public void c() {
        this.f13371a = null;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f13371a = null;
        this.f13372b = null;
        this.f13373c = null;
        d(false);
        this.f13374d = 0L;
    }

    public boolean d() {
        return this.f13371a != null;
    }

    public String e() {
        return this.f13372b;
    }

    public void f() {
        this.f13372b = null;
    }

    public boolean g() {
        return this.f13372b != null;
    }

    public String h() {
        return this.f13373c;
    }

    public void i() {
        this.f13373c = null;
    }

    public boolean j() {
        return this.f13373c != null;
    }

    public long k() {
        return this.f13374d;
    }

    public void l() {
        this.f13375n = bo.b(this.f13375n, 0);
    }

    public boolean m() {
        return bo.a(this.f13375n, 0);
    }

    public void n() throws bx {
        if (this.f13371a != null) {
            if (this.f13373c != null) {
                return;
            }
            throw new cr("Required field 'new_id' was not present! Struct: " + toString());
        }
        throw new cr("Required field 'domain' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f13369l.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.f13371a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.f13372b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.f13373c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f13374d);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f13369l.get(cqVar.D()).b().a(cqVar, this);
    }

    /* loaded from: classes3.dex */
    public enum e implements by {
        DOMAIN(1, ClientCookie.DOMAIN_ATTR),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");


        /* renamed from: e, reason: collision with root package name */
        private static final Map<String, e> f13381e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        private final short f13383f;

        /* renamed from: g, reason: collision with root package name */
        private final String f13384g;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f13381e.put(eVar.b(), eVar);
            }
        }

        e(short s5, String str) {
            this.f13383f = s5;
            this.f13384g = str;
        }

        public static e a(int i5) {
            if (i5 == 1) {
                return DOMAIN;
            }
            if (i5 == 2) {
                return OLD_ID;
            }
            if (i5 == 3) {
                return NEW_ID;
            }
            if (i5 != 4) {
                return null;
            }
            return TS;
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
            return this.f13384g;
        }

        public static e a(String str) {
            return f13381e.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f13383f;
        }
    }

    public a a(String str) {
        this.f13371a = str;
        return this;
    }

    public a b(String str) {
        this.f13372b = str;
        return this;
    }

    public a c(String str) {
        this.f13373c = str;
        return this;
    }

    public void d(boolean z4) {
        this.f13375n = bo.a(this.f13375n, 0, z4);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f13371a = null;
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f13372b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f13373c = null;
    }

    public a(String str, String str2, long j5) {
        this();
        this.f13371a = str;
        this.f13373c = str2;
        this.f13374d = j5;
        d(true);
    }

    public a a(long j5) {
        this.f13374d = j5;
        d(true);
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

    public a(a aVar) {
        this.f13375n = (byte) 0;
        this.f13376o = new e[]{e.OLD_ID};
        this.f13375n = aVar.f13375n;
        if (aVar.d()) {
            this.f13371a = aVar.f13371a;
        }
        if (aVar.g()) {
            this.f13372b = aVar.f13372b;
        }
        if (aVar.j()) {
            this.f13373c = aVar.f13373c;
        }
        this.f13374d = aVar.f13374d;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f13375n = (byte) 0;
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
