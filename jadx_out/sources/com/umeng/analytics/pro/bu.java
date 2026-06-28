package com.umeng.analytics.pro;

import com.umeng.analytics.pro.ck;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class bu {

    /* renamed from: a, reason: collision with root package name */
    private final cq f12362a;

    /* renamed from: b, reason: collision with root package name */
    private final dd f12363b;

    public bu() {
        this(new ck.a());
    }

    private cl j(byte[] bArr, by byVar, by... byVarArr) throws bx {
        this.f12363b.a(bArr);
        int length = byVarArr.length + 1;
        by[] byVarArr2 = new by[length];
        int i5 = 0;
        byVarArr2[0] = byVar;
        int i6 = 0;
        while (i6 < byVarArr.length) {
            int i7 = i6 + 1;
            byVarArr2[i7] = byVarArr[i6];
            i6 = i7;
        }
        this.f12362a.j();
        cl clVar = null;
        while (i5 < length) {
            clVar = this.f12362a.l();
            if (clVar.f12438b == 0 || clVar.f12439c > byVarArr2[i5].a()) {
                return null;
            }
            if (clVar.f12439c != byVarArr2[i5].a()) {
                ct.a(this.f12362a, clVar.f12438b);
                this.f12362a.m();
            } else {
                i5++;
                if (i5 < length) {
                    this.f12362a.j();
                }
            }
        }
        return clVar;
    }

    public void a(br brVar, byte[] bArr) throws bx {
        try {
            this.f12363b.a(bArr);
            brVar.read(this.f12362a);
        } finally {
            this.f12363b.e();
            this.f12362a.B();
        }
    }

    public Byte b(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Byte) a((byte) 3, bArr, byVar, byVarArr);
    }

    public Double c(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Double) a((byte) 4, bArr, byVar, byVarArr);
    }

    public Short d(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Short) a((byte) 6, bArr, byVar, byVarArr);
    }

    public Integer e(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Integer) a((byte) 8, bArr, byVar, byVarArr);
    }

    public Long f(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Long) a((byte) 10, bArr, byVar, byVarArr);
    }

    public String g(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (String) a((byte) 11, bArr, byVar, byVarArr);
    }

    public ByteBuffer h(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (ByteBuffer) a((byte) 100, bArr, byVar, byVarArr);
    }

    public Short i(byte[] bArr, by byVar, by... byVarArr) throws bx {
        try {
            try {
                if (j(bArr, byVar, byVarArr) != null) {
                    this.f12362a.j();
                    return Short.valueOf(this.f12362a.l().f12439c);
                }
                this.f12363b.e();
                this.f12362a.B();
                return null;
            } catch (Exception e5) {
                throw new bx(e5);
            }
        } finally {
            this.f12363b.e();
            this.f12362a.B();
        }
    }

    public bu(cs csVar) {
        dd ddVar = new dd();
        this.f12363b = ddVar;
        this.f12362a = csVar.a(ddVar);
    }

    public void a(br brVar, String str, String str2) throws bx {
        try {
            try {
                a(brVar, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new bx("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f12362a.B();
        }
    }

    public void a(br brVar, byte[] bArr, by byVar, by... byVarArr) throws bx {
        try {
            try {
                if (j(bArr, byVar, byVarArr) != null) {
                    brVar.read(this.f12362a);
                }
            } catch (Exception e5) {
                throw new bx(e5);
            }
        } finally {
            this.f12363b.e();
            this.f12362a.B();
        }
    }

    public Boolean a(byte[] bArr, by byVar, by... byVarArr) throws bx {
        return (Boolean) a((byte) 2, bArr, byVar, byVarArr);
    }

    private Object a(byte b5, byte[] bArr, by byVar, by... byVarArr) throws bx {
        try {
            try {
                cl j5 = j(bArr, byVar, byVarArr);
                if (j5 != null) {
                    if (b5 != 2) {
                        if (b5 != 3) {
                            if (b5 != 4) {
                                if (b5 != 6) {
                                    if (b5 != 8) {
                                        if (b5 != 100) {
                                            if (b5 != 10) {
                                                if (b5 == 11 && j5.f12438b == 11) {
                                                    return this.f12362a.z();
                                                }
                                            } else if (j5.f12438b == 10) {
                                                return Long.valueOf(this.f12362a.x());
                                            }
                                        } else if (j5.f12438b == 11) {
                                            return this.f12362a.A();
                                        }
                                    } else if (j5.f12438b == 8) {
                                        return Integer.valueOf(this.f12362a.w());
                                    }
                                } else if (j5.f12438b == 6) {
                                    return Short.valueOf(this.f12362a.v());
                                }
                            } else if (j5.f12438b == 4) {
                                return Double.valueOf(this.f12362a.y());
                            }
                        } else if (j5.f12438b == 3) {
                            return Byte.valueOf(this.f12362a.u());
                        }
                    } else if (j5.f12438b == 2) {
                        return Boolean.valueOf(this.f12362a.t());
                    }
                }
                this.f12363b.e();
                this.f12362a.B();
                return null;
            } catch (Exception e5) {
                throw new bx(e5);
            }
        } finally {
            this.f12363b.e();
            this.f12362a.B();
        }
    }

    public void a(br brVar, String str) throws bx {
        a(brVar, str.getBytes());
    }
}
