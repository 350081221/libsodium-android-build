package com.bytedance.pangle.res.a;

import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f4535f = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4536a;

    /* renamed from: b, reason: collision with root package name */
    private final h f4537b;

    /* renamed from: c, reason: collision with root package name */
    private final g f4538c;

    /* renamed from: d, reason: collision with root package name */
    private final e f4539d;

    /* renamed from: e, reason: collision with root package name */
    private C0123a f4540e;

    /* renamed from: com.bytedance.pangle.res.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0123a {

        /* renamed from: a, reason: collision with root package name */
        public final short f4541a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4542b;

        /* renamed from: c, reason: collision with root package name */
        public final int f4543c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4544d;

        /* renamed from: e, reason: collision with root package name */
        public final int f4545e;

        private C0123a(short s5, int i5, int i6, int i7) {
            this.f4541a = s5;
            this.f4542b = i5;
            this.f4543c = i6;
            this.f4544d = i7;
            this.f4545e = i7 + i6;
        }

        public static C0123a a(g gVar, e eVar) {
            int a5 = eVar.a();
            try {
                return new C0123a(gVar.readShort(), gVar.readShort(), gVar.readInt(), a5);
            } catch (EOFException unused) {
                return new C0123a((short) -1, 0, 0, eVar.a());
            }
        }
    }

    public a(byte[] bArr, h hVar) {
        e eVar = new e(new ByteArrayInputStream(bArr));
        this.f4539d = eVar;
        this.f4538c = new g(new i(eVar));
        this.f4536a = bArr;
        this.f4537b = hVar;
    }

    private String a(int i5) {
        int i6;
        short s5;
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            i6 = i5 - 1;
            if (i5 == 0 || this.f4538c.readByte() == 0) {
                break;
            }
            sb.append((char) s5);
            i5 = i6;
        }
        this.f4538c.skipBytes(i6);
        return sb.toString();
    }

    private void b() {
        b(515);
        int readInt = this.f4538c.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f4538c.readInt();
            this.f4538c.skipBytes(256);
        }
        while (j().f4541a == 513) {
            c();
        }
    }

    private void c() {
        d();
        short s5 = j().f4541a;
        while (s5 == 514) {
            d();
            s5 = j().f4541a;
        }
        while (s5 == 513) {
            e();
            if (this.f4539d.a() < this.f4540e.f4545e) {
                f4535f.warning("Unknown data detected. Skipping: " + (this.f4540e.f4545e - this.f4539d.a()) + " byte(s)");
                e eVar = this.f4539d;
                eVar.skip((long) (this.f4540e.f4545e - eVar.a()));
            }
            s5 = j().f4541a;
        }
    }

    private void d() {
        b(514);
        this.f4538c.readUnsignedByte();
        this.f4538c.skipBytes(3);
        this.f4538c.skipBytes(this.f4538c.readInt() * 4);
    }

    private void e() {
        b(InputDeviceCompat.SOURCE_DPAD);
        this.f4538c.readUnsignedByte();
        this.f4538c.readByte();
        this.f4538c.skipBytes(2);
        int readInt = this.f4538c.readInt();
        int readInt2 = this.f4538c.readInt();
        i();
        int i5 = (this.f4540e.f4544d + readInt2) - (readInt * 4);
        if (i5 != this.f4539d.a()) {
            f4535f.warning("Invalid data detected. Skipping: " + (i5 - this.f4539d.a()) + " byte(s)");
            this.f4538c.skipBytes(i5 - this.f4539d.a());
        }
        int[] a5 = this.f4538c.a(readInt);
        HashSet hashSet = new HashSet();
        for (int i6 : a5) {
            if (i6 != -1 && !hashSet.contains(Integer.valueOf(i6))) {
                f();
                hashSet.add(Integer.valueOf(i6));
            }
        }
    }

    private void f() {
        if (this.f4538c.readShort() >= 0) {
            short readShort = this.f4538c.readShort();
            this.f4538c.readInt();
            if ((readShort & 1) == 0) {
                h();
                return;
            } else {
                g();
                return;
            }
        }
        throw new RuntimeException("Entry size is under 0 bytes.");
    }

    private void g() {
        int a5 = k.a(this.f4538c);
        k.a(this.f4536a, this.f4538c.readInt(), a5, this.f4537b);
        int readInt = this.f4538c.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            int a6 = k.a(this.f4538c);
            k.a(this.f4536a, this.f4538c.readInt(), a6, this.f4537b);
            h();
        }
    }

    private void h() {
        this.f4538c.a();
        this.f4538c.b();
        byte readByte = this.f4538c.readByte();
        int a5 = k.a(this.f4538c);
        int readInt = this.f4538c.readInt();
        if (readByte == 1) {
            k.a(this.f4536a, readInt, a5, this.f4537b);
        }
        if (readByte == 2) {
            k.a(this.f4536a, readInt, a5, this.f4537b);
        }
    }

    private void i() {
        int readInt = this.f4538c.readInt();
        int i5 = 28;
        if (readInt >= 28) {
            this.f4538c.readShort();
            this.f4538c.readShort();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readUnsignedShort();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.readByte();
            this.f4538c.skipBytes(1);
            this.f4538c.readShort();
            this.f4538c.readShort();
            this.f4538c.readShort();
            this.f4538c.skipBytes(2);
            if (readInt >= 32) {
                this.f4538c.readByte();
                this.f4538c.readByte();
                this.f4538c.readShort();
                i5 = 32;
            }
            if (readInt >= 36) {
                this.f4538c.readShort();
                this.f4538c.readShort();
                i5 = 36;
            }
            if (readInt >= 48) {
                a(4).toCharArray();
                a(8).toCharArray();
                i5 = 48;
            }
            if (readInt >= 52) {
                this.f4538c.readByte();
                this.f4538c.readByte();
                this.f4538c.skipBytes(2);
                i5 = 52;
            }
            if (readInt >= 56) {
                this.f4538c.skipBytes(4);
                i5 = 56;
            }
            int i6 = readInt - 56;
            if (i6 > 0) {
                byte[] bArr = new byte[i6];
                i5 += i6;
                this.f4538c.readFully(bArr);
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (bigInteger.equals(BigInteger.ZERO)) {
                    f4535f.fine(String.format("Config flags size > %d, but exceeding bytes are all zero, so it should be ok.", 56));
                } else {
                    f4535f.warning(String.format("Config flags size > %d. Size = %d. Exceeding bytes: 0x%X.", 56, Integer.valueOf(readInt), bigInteger));
                }
            }
            int i7 = readInt - i5;
            if (i7 > 0) {
                this.f4538c.skipBytes(i7);
                return;
            }
            return;
        }
        throw new RuntimeException("Config size < 28");
    }

    private C0123a j() {
        C0123a a5 = C0123a.a(this.f4538c, this.f4539d);
        this.f4540e = a5;
        return a5;
    }

    public final void a() {
        j();
        b(2);
        int readInt = this.f4538c.readInt();
        l.a(this.f4538c);
        j();
        for (int i5 = 0; i5 < readInt; i5++) {
            b(512);
            this.f4538c.readInt();
            this.f4538c.skipBytes(256);
            this.f4538c.skipBytes(4);
            this.f4538c.skipBytes(4);
            this.f4538c.skipBytes(4);
            this.f4538c.skipBytes(4);
            if (this.f4540e.f4542b == 288 && this.f4538c.readInt() > 0) {
                throw new RuntimeException("don't support");
            }
            l.a(this.f4538c);
            l.a(this.f4538c);
            j();
            boolean z4 = true;
            while (z4) {
                short s5 = this.f4540e.f4541a;
                if (s5 == 514) {
                    c();
                } else if (s5 != 515) {
                    z4 = false;
                } else {
                    b();
                }
            }
        }
    }

    private void b(int i5) {
        if (this.f4540e.f4541a != i5) {
            throw new RuntimeException(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", Integer.valueOf(i5), Short.valueOf(this.f4540e.f4541a)));
        }
    }
}
