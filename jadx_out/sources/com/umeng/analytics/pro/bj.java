package com.umeng.analytics.pro;

import com.tendcloud.tenddata.cq;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class bj implements br<bj, e>, Serializable, Cloneable {
    private static final int A = 2;
    private static final int B = 3;

    /* renamed from: k, reason: collision with root package name */
    public static final Map<e, cd> f12281k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f12282l = 420342210744516016L;

    /* renamed from: m, reason: collision with root package name */
    private static final cv f12283m = new cv("UMEnvelope");

    /* renamed from: n, reason: collision with root package name */
    private static final cl f12284n = new cl("version", (byte) 11, 1);

    /* renamed from: o, reason: collision with root package name */
    private static final cl f12285o = new cl("address", (byte) 11, 2);

    /* renamed from: p, reason: collision with root package name */
    private static final cl f12286p = new cl("signature", (byte) 11, 3);

    /* renamed from: q, reason: collision with root package name */
    private static final cl f12287q = new cl("serial_num", (byte) 8, 4);

    /* renamed from: r, reason: collision with root package name */
    private static final cl f12288r = new cl("ts_secs", (byte) 8, 5);

    /* renamed from: s, reason: collision with root package name */
    private static final cl f12289s = new cl(cq.a.LENGTH, (byte) 8, 6);

    /* renamed from: t, reason: collision with root package name */
    private static final cl f12290t = new cl("entity", (byte) 11, 7);

    /* renamed from: u, reason: collision with root package name */
    private static final cl f12291u = new cl("guid", (byte) 11, 8);

    /* renamed from: v, reason: collision with root package name */
    private static final cl f12292v = new cl("checksum", (byte) 11, 9);

    /* renamed from: w, reason: collision with root package name */
    private static final cl f12293w = new cl("codex", (byte) 8, 10);

    /* renamed from: x, reason: collision with root package name */
    private static final Map<Class<? extends cy>, cz> f12294x;

    /* renamed from: y, reason: collision with root package name */
    private static final int f12295y = 0;

    /* renamed from: z, reason: collision with root package name */
    private static final int f12296z = 1;
    private byte C;
    private e[] D;

    /* renamed from: a, reason: collision with root package name */
    public String f12297a;

    /* renamed from: b, reason: collision with root package name */
    public String f12298b;

    /* renamed from: c, reason: collision with root package name */
    public String f12299c;

    /* renamed from: d, reason: collision with root package name */
    public int f12300d;

    /* renamed from: e, reason: collision with root package name */
    public int f12301e;

    /* renamed from: f, reason: collision with root package name */
    public int f12302f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f12303g;

    /* renamed from: h, reason: collision with root package name */
    public String f12304h;

    /* renamed from: i, reason: collision with root package name */
    public String f12305i;

    /* renamed from: j, reason: collision with root package name */
    public int f12306j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a extends da<bj> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(cq cqVar, bj bjVar) throws bx {
            cqVar.j();
            while (true) {
                cl l5 = cqVar.l();
                byte b5 = l5.f12438b;
                if (b5 == 0) {
                    cqVar.k();
                    if (bjVar.m()) {
                        if (bjVar.p()) {
                            if (bjVar.s()) {
                                bjVar.G();
                                return;
                            }
                            throw new cr("Required field 'length' was not found in serialized data! Struct: " + toString());
                        }
                        throw new cr("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    }
                    throw new cr("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                }
                switch (l5.f12439c) {
                    case 1:
                        if (b5 == 11) {
                            bjVar.f12297a = cqVar.z();
                            bjVar.a(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 2:
                        if (b5 == 11) {
                            bjVar.f12298b = cqVar.z();
                            bjVar.b(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 3:
                        if (b5 == 11) {
                            bjVar.f12299c = cqVar.z();
                            bjVar.c(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 4:
                        if (b5 == 8) {
                            bjVar.f12300d = cqVar.w();
                            bjVar.d(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 5:
                        if (b5 == 8) {
                            bjVar.f12301e = cqVar.w();
                            bjVar.e(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 6:
                        if (b5 == 8) {
                            bjVar.f12302f = cqVar.w();
                            bjVar.f(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 7:
                        if (b5 == 11) {
                            bjVar.f12303g = cqVar.A();
                            bjVar.g(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 8:
                        if (b5 == 11) {
                            bjVar.f12304h = cqVar.z();
                            bjVar.h(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 9:
                        if (b5 == 11) {
                            bjVar.f12305i = cqVar.z();
                            bjVar.i(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    case 10:
                        if (b5 == 8) {
                            bjVar.f12306j = cqVar.w();
                            bjVar.j(true);
                            break;
                        } else {
                            ct.a(cqVar, b5);
                            break;
                        }
                    default:
                        ct.a(cqVar, b5);
                        break;
                }
                cqVar.m();
            }
        }

        @Override // com.umeng.analytics.pro.cy
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cq cqVar, bj bjVar) throws bx {
            bjVar.G();
            cqVar.a(bj.f12283m);
            if (bjVar.f12297a != null) {
                cqVar.a(bj.f12284n);
                cqVar.a(bjVar.f12297a);
                cqVar.c();
            }
            if (bjVar.f12298b != null) {
                cqVar.a(bj.f12285o);
                cqVar.a(bjVar.f12298b);
                cqVar.c();
            }
            if (bjVar.f12299c != null) {
                cqVar.a(bj.f12286p);
                cqVar.a(bjVar.f12299c);
                cqVar.c();
            }
            cqVar.a(bj.f12287q);
            cqVar.a(bjVar.f12300d);
            cqVar.c();
            cqVar.a(bj.f12288r);
            cqVar.a(bjVar.f12301e);
            cqVar.c();
            cqVar.a(bj.f12289s);
            cqVar.a(bjVar.f12302f);
            cqVar.c();
            if (bjVar.f12303g != null) {
                cqVar.a(bj.f12290t);
                cqVar.a(bjVar.f12303g);
                cqVar.c();
            }
            if (bjVar.f12304h != null) {
                cqVar.a(bj.f12291u);
                cqVar.a(bjVar.f12304h);
                cqVar.c();
            }
            if (bjVar.f12305i != null) {
                cqVar.a(bj.f12292v);
                cqVar.a(bjVar.f12305i);
                cqVar.c();
            }
            if (bjVar.F()) {
                cqVar.a(bj.f12293w);
                cqVar.a(bjVar.f12306j);
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
    public static class c extends db<bj> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.cy
        public void a(cq cqVar, bj bjVar) throws bx {
            cw cwVar = (cw) cqVar;
            cwVar.a(bjVar.f12297a);
            cwVar.a(bjVar.f12298b);
            cwVar.a(bjVar.f12299c);
            cwVar.a(bjVar.f12300d);
            cwVar.a(bjVar.f12301e);
            cwVar.a(bjVar.f12302f);
            cwVar.a(bjVar.f12303g);
            cwVar.a(bjVar.f12304h);
            cwVar.a(bjVar.f12305i);
            BitSet bitSet = new BitSet();
            if (bjVar.F()) {
                bitSet.set(0);
            }
            cwVar.a(bitSet, 1);
            if (bjVar.F()) {
                cwVar.a(bjVar.f12306j);
            }
        }

        @Override // com.umeng.analytics.pro.cy
        public void b(cq cqVar, bj bjVar) throws bx {
            cw cwVar = (cw) cqVar;
            bjVar.f12297a = cwVar.z();
            bjVar.a(true);
            bjVar.f12298b = cwVar.z();
            bjVar.b(true);
            bjVar.f12299c = cwVar.z();
            bjVar.c(true);
            bjVar.f12300d = cwVar.w();
            bjVar.d(true);
            bjVar.f12301e = cwVar.w();
            bjVar.e(true);
            bjVar.f12302f = cwVar.w();
            bjVar.f(true);
            bjVar.f12303g = cwVar.A();
            bjVar.g(true);
            bjVar.f12304h = cwVar.z();
            bjVar.h(true);
            bjVar.f12305i = cwVar.z();
            bjVar.i(true);
            if (cwVar.b(1).get(0)) {
                bjVar.f12306j = cwVar.w();
                bjVar.j(true);
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
        f12294x = hashMap;
        hashMap.put(da.class, new b());
        hashMap.put(db.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put((EnumMap) e.VERSION, (e) new cd("version", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.ADDRESS, (e) new cd("address", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.SIGNATURE, (e) new cd("signature", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.SERIAL_NUM, (e) new cd("serial_num", (byte) 1, new ce((byte) 8)));
        enumMap.put((EnumMap) e.TS_SECS, (e) new cd("ts_secs", (byte) 1, new ce((byte) 8)));
        enumMap.put((EnumMap) e.LENGTH, (e) new cd(cq.a.LENGTH, (byte) 1, new ce((byte) 8)));
        enumMap.put((EnumMap) e.ENTITY, (e) new cd("entity", (byte) 1, new ce((byte) 11, true)));
        enumMap.put((EnumMap) e.GUID, (e) new cd("guid", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.CHECKSUM, (e) new cd("checksum", (byte) 1, new ce((byte) 11)));
        enumMap.put((EnumMap) e.CODEX, (e) new cd("codex", (byte) 2, new ce((byte) 8)));
        Map<e, cd> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f12281k = unmodifiableMap;
        cd.a(bj.class, unmodifiableMap);
    }

    public bj() {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
    }

    public String A() {
        return this.f12305i;
    }

    public void B() {
        this.f12305i = null;
    }

    public boolean C() {
        return this.f12305i != null;
    }

    public int D() {
        return this.f12306j;
    }

    public void E() {
        this.C = bo.b(this.C, 3);
    }

    public boolean F() {
        return bo.a(this.C, 3);
    }

    public void G() throws bx {
        if (this.f12297a != null) {
            if (this.f12298b != null) {
                if (this.f12299c != null) {
                    if (this.f12303g != null) {
                        if (this.f12304h != null) {
                            if (this.f12305i != null) {
                                return;
                            }
                            throw new cr("Required field 'checksum' was not present! Struct: " + toString());
                        }
                        throw new cr("Required field 'guid' was not present! Struct: " + toString());
                    }
                    throw new cr("Required field 'entity' was not present! Struct: " + toString());
                }
                throw new cr("Required field 'signature' was not present! Struct: " + toString());
            }
            throw new cr("Required field 'address' was not present! Struct: " + toString());
        }
        throw new cr("Required field 'version' was not present! Struct: " + toString());
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bj deepCopy() {
        return new bj(this);
    }

    public String b() {
        return this.f12297a;
    }

    public void c() {
        this.f12297a = null;
    }

    @Override // com.umeng.analytics.pro.br
    public void clear() {
        this.f12297a = null;
        this.f12298b = null;
        this.f12299c = null;
        d(false);
        this.f12300d = 0;
        e(false);
        this.f12301e = 0;
        f(false);
        this.f12302f = 0;
        this.f12303g = null;
        this.f12304h = null;
        this.f12305i = null;
        j(false);
        this.f12306j = 0;
    }

    public boolean d() {
        return this.f12297a != null;
    }

    public String e() {
        return this.f12298b;
    }

    public void f() {
        this.f12298b = null;
    }

    public boolean g() {
        return this.f12298b != null;
    }

    public String h() {
        return this.f12299c;
    }

    public void i() {
        this.f12299c = null;
    }

    public boolean j() {
        return this.f12299c != null;
    }

    public int k() {
        return this.f12300d;
    }

    public void l() {
        this.C = bo.b(this.C, 0);
    }

    public boolean m() {
        return bo.a(this.C, 0);
    }

    public int n() {
        return this.f12301e;
    }

    public void o() {
        this.C = bo.b(this.C, 1);
    }

    public boolean p() {
        return bo.a(this.C, 1);
    }

    public int q() {
        return this.f12302f;
    }

    public void r() {
        this.C = bo.b(this.C, 2);
    }

    @Override // com.umeng.analytics.pro.br
    public void read(cq cqVar) throws bx {
        f12294x.get(cqVar.D()).b().b(cqVar, this);
    }

    public boolean s() {
        return bo.a(this.C, 2);
    }

    public byte[] t() {
        a(bs.c(this.f12303g));
        ByteBuffer byteBuffer = this.f12303g;
        if (byteBuffer == null) {
            return null;
        }
        return byteBuffer.array();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        String str = this.f12297a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("address:");
        String str2 = this.f12298b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("signature:");
        String str3 = this.f12299c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f12300d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f12301e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f12302f);
        sb.append(", ");
        sb.append("entity:");
        ByteBuffer byteBuffer = this.f12303g;
        if (byteBuffer == null) {
            sb.append("null");
        } else {
            bs.a(byteBuffer, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        String str4 = this.f12304h;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        sb.append(", ");
        sb.append("checksum:");
        String str5 = this.f12305i;
        if (str5 == null) {
            sb.append("null");
        } else {
            sb.append(str5);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.f12306j);
        }
        sb.append(")");
        return sb.toString();
    }

    public ByteBuffer u() {
        return this.f12303g;
    }

    public void v() {
        this.f12303g = null;
    }

    public boolean w() {
        return this.f12303g != null;
    }

    @Override // com.umeng.analytics.pro.br
    public void write(cq cqVar) throws bx {
        f12294x.get(cqVar.D()).b().a(cqVar, this);
    }

    public String x() {
        return this.f12304h;
    }

    public void y() {
        this.f12304h = null;
    }

    public boolean z() {
        return this.f12304h != null;
    }

    /* loaded from: classes3.dex */
    public enum e implements by {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, cq.a.LENGTH),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");


        /* renamed from: k, reason: collision with root package name */
        private static final Map<String, e> f12317k = new HashMap();

        /* renamed from: l, reason: collision with root package name */
        private final short f12319l;

        /* renamed from: m, reason: collision with root package name */
        private final String f12320m;

        static {
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                f12317k.put(eVar.b(), eVar);
            }
        }

        e(short s5, String str) {
            this.f12319l = s5;
            this.f12320m = str;
        }

        public static e a(int i5) {
            switch (i5) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case 7:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
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
            return this.f12320m;
        }

        public static e a(String str) {
            return f12317k.get(str);
        }

        @Override // com.umeng.analytics.pro.by
        public short a() {
            return this.f12319l;
        }
    }

    public bj a(String str) {
        this.f12297a = str;
        return this;
    }

    public bj b(String str) {
        this.f12298b = str;
        return this;
    }

    public bj c(String str) {
        this.f12299c = str;
        return this;
    }

    public void d(boolean z4) {
        this.C = bo.a(this.C, 0, z4);
    }

    public void e(boolean z4) {
        this.C = bo.a(this.C, 1, z4);
    }

    public void f(boolean z4) {
        this.C = bo.a(this.C, 2, z4);
    }

    public void g(boolean z4) {
        if (z4) {
            return;
        }
        this.f12303g = null;
    }

    public void h(boolean z4) {
        if (z4) {
            return;
        }
        this.f12304h = null;
    }

    public void i(boolean z4) {
        if (z4) {
            return;
        }
        this.f12305i = null;
    }

    public void j(boolean z4) {
        this.C = bo.a(this.C, 3, z4);
    }

    public void a(boolean z4) {
        if (z4) {
            return;
        }
        this.f12297a = null;
    }

    public void b(boolean z4) {
        if (z4) {
            return;
        }
        this.f12298b = null;
    }

    public void c(boolean z4) {
        if (z4) {
            return;
        }
        this.f12299c = null;
    }

    public bj d(String str) {
        this.f12304h = str;
        return this;
    }

    public bj e(String str) {
        this.f12305i = str;
        return this;
    }

    public bj(String str, String str2, String str3, int i5, int i6, int i7, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f12297a = str;
        this.f12298b = str2;
        this.f12299c = str3;
        this.f12300d = i5;
        d(true);
        this.f12301e = i6;
        e(true);
        this.f12302f = i7;
        f(true);
        this.f12303g = byteBuffer;
        this.f12304h = str4;
        this.f12305i = str5;
    }

    public bj a(int i5) {
        this.f12300d = i5;
        d(true);
        return this;
    }

    public bj b(int i5) {
        this.f12301e = i5;
        e(true);
        return this;
    }

    public bj c(int i5) {
        this.f12302f = i5;
        f(true);
        return this;
    }

    public bj d(int i5) {
        this.f12306j = i5;
        j(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.br
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i5) {
        return e.a(i5);
    }

    public bj a(byte[] bArr) {
        a(bArr == null ? null : ByteBuffer.wrap(bArr));
        return this;
    }

    public bj a(ByteBuffer byteBuffer) {
        this.f12303g = byteBuffer;
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
            this.C = (byte) 0;
            read(new ck(new dc(objectInputStream)));
        } catch (bx e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public bj(bj bjVar) {
        this.C = (byte) 0;
        this.D = new e[]{e.CODEX};
        this.C = bjVar.C;
        if (bjVar.d()) {
            this.f12297a = bjVar.f12297a;
        }
        if (bjVar.g()) {
            this.f12298b = bjVar.f12298b;
        }
        if (bjVar.j()) {
            this.f12299c = bjVar.f12299c;
        }
        this.f12300d = bjVar.f12300d;
        this.f12301e = bjVar.f12301e;
        this.f12302f = bjVar.f12302f;
        if (bjVar.w()) {
            this.f12303g = bs.d(bjVar.f12303g);
        }
        if (bjVar.z()) {
            this.f12304h = bjVar.f12304h;
        }
        if (bjVar.C()) {
            this.f12305i = bjVar.f12305i;
        }
        this.f12306j = bjVar.f12306j;
    }
}
