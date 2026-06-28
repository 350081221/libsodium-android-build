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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class b implements br<b, e>, Serializable, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<e, cd> f13385d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f13386e = -6496538196005191531L;

    /* renamed from: f, reason: collision with root package name */
    private static final cv f13387f = new cv("IdSnapshot");

    /* renamed from: g, reason: collision with root package name */
    private static final cl f13388g = new cl(HTTP.IDENTITY_CODING, (byte) 11, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final cl f13389h = new cl("ts", (byte) 10, 2);

    /* renamed from: i, reason: collision with root package name */
    private static final cl f13390i = new cl("version", (byte) 8, 3);

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f13391j;

    /* renamed from: k, reason: collision with root package name */
    private static final int f13392k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int f13393l = 1;

    /* renamed from: a, reason: collision with root package name */
    public String f13394a;

    /* renamed from: b, reason: collision with root package name */
    public long f13395b;

    /* renamed from: c, reason: collision with root package name */
    public int f13396c;

    /* renamed from: m, reason: collision with root package name */
    private byte f13397m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, b bVar) throws bx {
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
                        } else if (b5 == 8) {
                            bVar.f13396c = cqVar.w();
                            bVar.c(true);
                        } else {
                            ct.a(cqVar, b5);
                        }
                    } else if (b5 == 10) {
                        bVar.f13395b = cqVar.x();
                        bVar.b(true);
                    } else {
                        ct.a(cqVar, b5);
                    }
                } else if (b5 == 11) {
                    bVar.f13394a = cqVar.z();
                    bVar.a(true);
                } else {
                    ct.a(cqVar, b5);
                }
                cqVar.m();
            }
            cqVar.k();
            if (bVar.g()) {
                if (bVar.j()) {
                    bVar.k();
                    return;
                }
                throw new cr("Required field 'version' was not found in serialized data! Struct: " + toString());
            }
            throw new cr("Required field 'ts' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, b bVar) throws bx {
            bVar.k();
            cqVar.a(b.f13387f);
            if (bVar.f13394a != null) {
                cqVar.a(b.f13388g);
                cqVar.a(bVar.f13394a);
                cqVar.c();
            }
            cqVar.a(b.f13389h);
            cqVar.a(bVar.f13395b);
            cqVar.c();
            cqVar.a(b.f13390i);
            cqVar.a(bVar.f13396c);
            cqVar.c();
            cqVar.d();
            cqVar.b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0249b implements cz {
        private C0249b() {
        }

        @Override // com.umeng.analytics.pro.cz
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c extends db<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, b bVar) throws bx {
            cw cwVar = (cw) cqVar;
            cwVar.a(bVar.f13394a);
            cwVar.a(bVar.f13395b);
            cwVar.a(bVar.f13396c);
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, b bVar) throws bx {
            cw cwVar = (cw) cqVar;
            bVar.f13394a = cwVar.z();
            bVar.a(true);
            bVar.f13395b = cwVar.x();
            bVar.b(true);
            bVar.f13396c = cwVar.w();
            bVar.c(true);
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
        f13391j = hashMap;
        hashMap.put(da.class, new C0249b());
        hashMap.put(db.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.IDENTITY, (e) new cd(HTTP.IDENTITY_CODING, (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.TS, (e) new cd("ts", (byte) 1, new ce((byte) 10)));
        enumMap.put((EnumMap) e.VERSION, (e) new cd("version", (byte) 1, new ce((byte) 8)));
        Map<e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f13385d = unmodifiableMap;
        cd.a(b.class, unmodifiableMap);
    }

    public b() {
        this.f13397m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
    }

    public String b() {
        return this.f13394a;
    }

    public void c() {
        this.f13394a = null;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f13394a = null;
        b(false);
        this.f13395b = 0L;
        c(false);
        this.f13396c = 0;
    }

    public boolean d() {
        return this.f13394a != null;
    }

    public long e() {
        return this.f13395b;
    }

    public void f() {
        this.f13397m = bo.b(this.f13397m, 0);
    }

    public boolean g() {
        return bo.a(this.f13397m, 0);
    }

    public int h() {
        return this.f13396c;
    }

    public void i() {
        this.f13397m = bo.b(this.f13397m, 1);
    }

    public boolean j() {
        return bo.a(this.f13397m, 1);
    }

    public void k() throws bx {
        if (this.f13394a != null) {
            return;
        }
        throw new cr("Required field 'identity' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f13391j.get(cqVar.D()).b().b(cqVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.f13394a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f13395b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f13396c);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f13391j.get(cqVar.D()).b().a(cqVar, this);
    }

    /* loaded from: classes3.dex */
    public enum e implements by {
        IDENTITY(1, HTTP.IDENTITY_CODING),
        TS(2, "ts"),
        VERSION(3, "version");


        /* renamed from: d, reason: collision with root package name */
        private static final Map<String, e> f13401d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private final short f13403e;

        /* renamed from: f, reason: collision with root package name */
        private final String f13404f;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f13401d.put(eVar.b(), eVar);
            }
        }

        e(short s5, String str) {
            this.f13403e = s5;
            this.f13404f = str;
        }

        public static e a(int i5) {
            if (i5 == 1) {
                return IDENTITY;
            }
            if (i5 == 2) {
                return TS;
            }
            if (i5 != 3) {
                return null;
            }
            return VERSION;
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
            return this.f13404f;
        }

        public static e a(String str) {
            return f13401d.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f13403e;
        }
    }

    public b a(String str) {
        this.f13394a = str;
        return this;
    }

    public void b(boolean z4) {
        this.f13397m = bo.a(this.f13397m, 0, z4);
    }

    public void c(boolean z4) {
        this.f13397m = bo.a(this.f13397m, 1, z4);
    }

    public b(String str, long j5, int i5) {
        this();
        this.f13394a = str;
        this.f13395b = j5;
        b(true);
        this.f13396c = i5;
        c(true);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f13394a = null;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i5) {
        return e.a(i5);
    }

    public b a(long j5) {
        this.f13395b = j5;
        b(true);
        return this;
    }

    public b a(int i5) {
        this.f13396c = i5;
        c(true);
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ck(new dc(objectOutputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public b(b bVar) {
        this.f13397m = (byte) 0;
        this.f13397m = bVar.f13397m;
        if (bVar.d()) {
            this.f13394a = bVar.f13394a;
        }
        this.f13395b = bVar.f13395b;
        this.f13396c = bVar.f13396c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.f13397m = (byte) 0;
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
