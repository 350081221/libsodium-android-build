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

/* loaded from: classes3.dex */
public class e implements br<e, EnumC0252e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<EnumC0252e, cd> f13442d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f13443e = 7501688097813630241L;

    /* renamed from: f, reason: collision with root package name */
    private static final cv f13444f = new cv("ImprintValue");

    /* renamed from: g, reason: collision with root package name */
    private static final cl f13445g = new cl(t0.b.f22420d, (byte) 11, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final cl f13446h = new cl("ts", (byte) 10, 2);

    /* renamed from: i, reason: collision with root package name */
    private static final cl f13447i = new cl("guid", (byte) 11, 3);

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f13448j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f13449k = 0;

    /* renamed from: a, reason: collision with root package name */
    public String f13450a;

    /* renamed from: b, reason: collision with root package name */
    public long f13451b;

    /* renamed from: c, reason: collision with root package name */
    public String f13452c;

    /* renamed from: l, reason: collision with root package name */
    private byte f13453l;

    /* renamed from: m, reason: collision with root package name */
    private EnumC0252e[] f13454m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, e eVar) throws bx {
            cqVar.j();
            while (true) {
                cl l5 = cqVar.l();
                byte b5 = l5.f12438b;
                if (b5 == 0) {
                    cqVar.k();
                    eVar.k();
                    return;
                }
                short s5 = l5.f12439c;
                if (s5 != 1) {
                    if (s5 != 2) {
                        if (s5 != 3) {
                            ct.a(cqVar, b5);
                        } else if (b5 == 11) {
                            eVar.f13452c = cqVar.z();
                            eVar.c(true);
                        } else {
                            ct.a(cqVar, b5);
                        }
                    } else if (b5 == 10) {
                        eVar.f13451b = cqVar.x();
                        eVar.b(true);
                    } else {
                        ct.a(cqVar, b5);
                    }
                } else if (b5 == 11) {
                    eVar.f13450a = cqVar.z();
                    eVar.a(true);
                } else {
                    ct.a(cqVar, b5);
                }
                cqVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, e eVar) throws bx {
            eVar.k();
            cqVar.a(e.f13444f);
            if (eVar.f13450a != null && eVar.d()) {
                cqVar.a(e.f13445g);
                cqVar.a(eVar.f13450a);
                cqVar.c();
            }
            if (eVar.g()) {
                cqVar.a(e.f13446h);
                cqVar.a(eVar.f13451b);
                cqVar.c();
            }
            if (eVar.f13452c != null && eVar.j()) {
                cqVar.a(e.f13447i);
                cqVar.a(eVar.f13452c);
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
    public static class c extends db<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, e eVar) throws bx {
            cw cwVar = (cw) cqVar;
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            if (eVar.g()) {
                bitSet.set(1);
            }
            if (eVar.j()) {
                bitSet.set(2);
            }
            cwVar.a(bitSet, 3);
            if (eVar.d()) {
                cwVar.a(eVar.f13450a);
            }
            if (eVar.g()) {
                cwVar.a(eVar.f13451b);
            }
            if (eVar.j()) {
                cwVar.a(eVar.f13452c);
            }
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, e eVar) throws bx {
            cw cwVar = (cw) cqVar;
            BitSet b5 = cwVar.b(3);
            if (b5.get(0)) {
                eVar.f13450a = cwVar.z();
                eVar.a(true);
            }
            if (b5.get(1)) {
                eVar.f13451b = cwVar.x();
                eVar.b(true);
            }
            if (b5.get(2)) {
                eVar.f13452c = cwVar.z();
                eVar.c(true);
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
        f13448j = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0252e.class);
        enumMap.put((EnumMap) EnumC0252e.VALUE, (EnumC0252e) new cd(t0.b.f22420d, (byte) 2, new ce((byte) 11)));
        enumMap.put((EnumMap) EnumC0252e.TS, (EnumC0252e) new cd("ts", (byte) 2, new ce((byte) 10)));
        enumMap.put((EnumMap) EnumC0252e.GUID, (EnumC0252e) new cd("guid", (byte) 2, new ce((byte) 11)));
        Map<EnumC0252e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f13442d = unmodifiableMap;
        cd.a(e.class, unmodifiableMap);
    }

    public e() {
        this.f13453l = (byte) 0;
        this.f13454m = new EnumC0252e[]{EnumC0252e.VALUE, EnumC0252e.TS, EnumC0252e.GUID};
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    public String b() {
        return this.f13450a;
    }

    public void c() {
        this.f13450a = null;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f13450a = null;
        b(false);
        this.f13451b = 0L;
        this.f13452c = null;
    }

    public boolean d() {
        return this.f13450a != null;
    }

    public long e() {
        return this.f13451b;
    }

    public void f() {
        this.f13453l = bo.b(this.f13453l, 0);
    }

    public boolean g() {
        return bo.a(this.f13453l, 0);
    }

    public String h() {
        return this.f13452c;
    }

    public void i() {
        this.f13452c = null;
    }

    public boolean j() {
        return this.f13452c != null;
    }

    public void k() throws bx {
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f13448j.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        boolean z4;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            String str = this.f13450a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f13451b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.f13452c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f13448j.get(cqVar.D()).b().a(cqVar, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0252e implements by {
        VALUE(1, t0.b.f22420d),
        TS(2, "ts"),
        GUID(3, "guid");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, EnumC0252e> f13458d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private final short f13460e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13461f;

        static {
            Iterator it = EnumSet.allOf(EnumC0252e.class).iterator();
            while (it.hasNext()) {
                EnumC0252e enumC0252e = (EnumC0252e) it.next();
                f13458d.put(enumC0252e.b(), enumC0252e);
            }
        }

        EnumC0252e(short s5, String str) {
            this.f13460e = s5;
            this.f13461f = str;
        }

        public static EnumC0252e a(int i5) {
            if (i5 == 1) {
                return VALUE;
            }
            if (i5 == 2) {
                return TS;
            }
            if (i5 != 3) {
                return null;
            }
            return GUID;
        }

        public static EnumC0252e b(int i5) {
            EnumC0252e a5 = a(i5);
            if (a5 != null) {
                return a5;
            }
            throw new IllegalArgumentException("Field " + i5 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.by
        public String b() {
            return this.f13461f;
        }

        public static EnumC0252e a(String str) {
            return f13458d.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f13460e;
        }
    }

    public e a(String str) {
        this.f13450a = str;
        return this;
    }

    public void b(boolean z4) {
        this.f13453l = bo.a(this.f13453l, 0, z4);
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f13452c = null;
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f13450a = null;
    }

    public e b(String str) {
        this.f13452c = str;
        return this;
    }

    public e(long j5, String str) {
        this();
        this.f13451b = j5;
        b(true);
        this.f13452c = str;
    }

    public e a(long j5) {
        this.f13451b = j5;
        b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC0252e fieldForId(int i5) {
        return EnumC0252e.a(i5);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ck(new dc(objectOutputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public e(e eVar) {
        this.f13453l = (byte) 0;
        this.f13454m = new EnumC0252e[]{EnumC0252e.VALUE, EnumC0252e.TS, EnumC0252e.GUID};
        this.f13453l = eVar.f13453l;
        if (eVar.d()) {
            this.f13450a = eVar.f13450a;
        }
        this.f13451b = eVar.f13451b;
        if (eVar.j()) {
            this.f13452c = eVar.f13452c;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f13453l = (byte) 0;
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
