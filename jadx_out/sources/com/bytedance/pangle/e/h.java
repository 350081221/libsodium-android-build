package com.bytedance.pangle.e;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final FileInputStream f4346a;

    /* renamed from: b, reason: collision with root package name */
    private a f4347b;

    /* renamed from: c, reason: collision with root package name */
    private b[] f4348c;

    /* renamed from: d, reason: collision with root package name */
    private c[] f4349d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, c> f4350e = new HashMap();

    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f4351a;

        /* renamed from: b, reason: collision with root package name */
        public final short f4352b;

        /* renamed from: c, reason: collision with root package name */
        public final short f4353c;

        /* renamed from: d, reason: collision with root package name */
        public final int f4354d;

        /* renamed from: e, reason: collision with root package name */
        public final long f4355e;

        /* renamed from: f, reason: collision with root package name */
        public final long f4356f;

        /* renamed from: g, reason: collision with root package name */
        public final long f4357g;

        /* renamed from: h, reason: collision with root package name */
        public final int f4358h;

        /* renamed from: i, reason: collision with root package name */
        public final short f4359i;

        /* renamed from: j, reason: collision with root package name */
        public final short f4360j;

        /* renamed from: k, reason: collision with root package name */
        public final short f4361k;

        /* renamed from: l, reason: collision with root package name */
        public final short f4362l;

        /* renamed from: m, reason: collision with root package name */
        public final short f4363m;

        /* renamed from: n, reason: collision with root package name */
        public final short f4364n;

        /* synthetic */ a(FileChannel fileChannel, byte b5) {
            this(fileChannel);
        }

        private a(FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.f4351a = bArr;
            fileChannel.position(0L);
            fileChannel.read(ByteBuffer.wrap(bArr));
            if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                h.a(bArr[4], 2, "bad elf class: " + ((int) bArr[4]));
                h.a(bArr[5], 2, "bad elf data encoding: " + ((int) bArr[5]));
                ByteBuffer allocate = ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
                allocate.order(bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN);
                h.b(fileChannel, allocate, "failed to read rest part of ehdr.");
                this.f4352b = allocate.getShort();
                this.f4353c = allocate.getShort();
                int i5 = allocate.getInt();
                this.f4354d = i5;
                h.a(i5, 1, "bad elf version: " + i5);
                byte b5 = bArr[4];
                if (b5 == 1) {
                    this.f4355e = allocate.getInt();
                    this.f4356f = allocate.getInt();
                    this.f4357g = allocate.getInt();
                } else if (b5 == 2) {
                    this.f4355e = allocate.getLong();
                    this.f4356f = allocate.getLong();
                    this.f4357g = allocate.getLong();
                } else {
                    throw new IOException("Unexpected elf class: " + ((int) bArr[4]));
                }
                this.f4358h = allocate.getInt();
                this.f4359i = allocate.getShort();
                this.f4360j = allocate.getShort();
                this.f4361k = allocate.getShort();
                this.f4362l = allocate.getShort();
                this.f4363m = allocate.getShort();
                this.f4364n = allocate.getShort();
                return;
            }
            throw new IOException(String.format("bad elf magic: %x %x %x %x.", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3])));
        }
    }

    /* loaded from: classes2.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4365a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4366b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4367c;

        /* renamed from: d, reason: collision with root package name */
        public final long f4368d;

        /* renamed from: e, reason: collision with root package name */
        public final long f4369e;

        /* renamed from: f, reason: collision with root package name */
        public final long f4370f;

        /* renamed from: g, reason: collision with root package name */
        public final long f4371g;

        /* renamed from: h, reason: collision with root package name */
        public final long f4372h;

        /* synthetic */ b(ByteBuffer byteBuffer, int i5, byte b5) {
            this(byteBuffer, i5);
        }

        private b(ByteBuffer byteBuffer, int i5) {
            if (i5 == 1) {
                this.f4365a = byteBuffer.getInt();
                this.f4367c = byteBuffer.getInt();
                this.f4368d = byteBuffer.getInt();
                this.f4369e = byteBuffer.getInt();
                this.f4370f = byteBuffer.getInt();
                this.f4371g = byteBuffer.getInt();
                this.f4366b = byteBuffer.getInt();
                this.f4372h = byteBuffer.getInt();
                return;
            }
            if (i5 == 2) {
                this.f4365a = byteBuffer.getInt();
                this.f4366b = byteBuffer.getInt();
                this.f4367c = byteBuffer.getLong();
                this.f4368d = byteBuffer.getLong();
                this.f4369e = byteBuffer.getLong();
                this.f4370f = byteBuffer.getLong();
                this.f4371g = byteBuffer.getLong();
                this.f4372h = byteBuffer.getLong();
                return;
            }
            throw new IOException("Unexpected elf class: ".concat(String.valueOf(i5)));
        }
    }

    /* loaded from: classes2.dex */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4373a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4374b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4375c;

        /* renamed from: d, reason: collision with root package name */
        public final long f4376d;

        /* renamed from: e, reason: collision with root package name */
        public final long f4377e;

        /* renamed from: f, reason: collision with root package name */
        public final long f4378f;

        /* renamed from: g, reason: collision with root package name */
        public final int f4379g;

        /* renamed from: h, reason: collision with root package name */
        public final int f4380h;

        /* renamed from: i, reason: collision with root package name */
        public final long f4381i;

        /* renamed from: j, reason: collision with root package name */
        public final long f4382j;

        /* renamed from: k, reason: collision with root package name */
        public String f4383k;

        /* synthetic */ c(ByteBuffer byteBuffer, int i5, byte b5) {
            this(byteBuffer, i5);
        }

        private c(ByteBuffer byteBuffer, int i5) {
            if (i5 == 1) {
                this.f4373a = byteBuffer.getInt();
                this.f4374b = byteBuffer.getInt();
                this.f4375c = byteBuffer.getInt();
                this.f4376d = byteBuffer.getInt();
                this.f4377e = byteBuffer.getInt();
                this.f4378f = byteBuffer.getInt();
                this.f4379g = byteBuffer.getInt();
                this.f4380h = byteBuffer.getInt();
                this.f4381i = byteBuffer.getInt();
                this.f4382j = byteBuffer.getInt();
            } else if (i5 == 2) {
                this.f4373a = byteBuffer.getInt();
                this.f4374b = byteBuffer.getInt();
                this.f4375c = byteBuffer.getLong();
                this.f4376d = byteBuffer.getLong();
                this.f4377e = byteBuffer.getLong();
                this.f4378f = byteBuffer.getLong();
                this.f4379g = byteBuffer.getInt();
                this.f4380h = byteBuffer.getInt();
                this.f4381i = byteBuffer.getLong();
                this.f4382j = byteBuffer.getLong();
            } else {
                throw new IOException("Unexpected elf class: ".concat(String.valueOf(i5)));
            }
            this.f4383k = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private h(File file) {
        ByteOrder byteOrder;
        c[] cVarArr;
        this.f4347b = null;
        this.f4348c = null;
        this.f4349d = null;
        FileInputStream fileInputStream = new FileInputStream(file);
        this.f4346a = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.f4347b = new a(channel, 0 == true ? 1 : 0);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        allocate.limit(this.f4347b.f4360j);
        if (this.f4347b.f4351a[5] == 1) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        allocate.order(byteOrder);
        channel.position(this.f4347b.f4356f);
        this.f4348c = new b[this.f4347b.f4361k];
        for (int i5 = 0; i5 < this.f4348c.length; i5++) {
            b(channel, allocate, "failed to read phdr.");
            this.f4348c[i5] = new b(allocate, this.f4347b.f4351a[4], objArr2 == true ? 1 : 0);
        }
        channel.position(this.f4347b.f4357g);
        allocate.limit(this.f4347b.f4362l);
        this.f4349d = new c[this.f4347b.f4363m];
        int i6 = 0;
        while (true) {
            cVarArr = this.f4349d;
            if (i6 >= cVarArr.length) {
                break;
            }
            b(channel, allocate, "failed to read shdr.");
            this.f4349d[i6] = new c(allocate, this.f4347b.f4351a[4], objArr == true ? 1 : 0);
            i6++;
        }
        short s5 = this.f4347b.f4364n;
        if (s5 > 0) {
            c cVar = cVarArr[s5];
            ByteBuffer allocate2 = ByteBuffer.allocate((int) cVar.f4378f);
            this.f4346a.getChannel().position(cVar.f4377e);
            b(this.f4346a.getChannel(), allocate2, "failed to read section: " + cVar.f4383k);
            for (c cVar2 : this.f4349d) {
                allocate2.position(cVar2.f4373a);
                String a5 = a(allocate2);
                cVar2.f4383k = a5;
                this.f4350e.put(a5, cVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(FileChannel fileChannel, ByteBuffer byteBuffer, String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read == byteBuffer.limit()) {
            byteBuffer.flip();
            return;
        }
        throw new IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4346a.close();
        this.f4350e.clear();
        this.f4348c = null;
        this.f4349d = null;
    }

    public static boolean a(File file) {
        try {
            com.bytedance.pangle.util.g.a(new h(file));
            return true;
        } catch (IOException unused) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            return false;
        } catch (Throwable th) {
            com.bytedance.pangle.util.g.a((Closeable) null);
            throw th;
        }
    }

    private static String a(ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new String(array, position, (byteBuffer.position() - position) - 1, Charset.forName(HTTP.ASCII));
    }

    static /* synthetic */ void a(int i5, int i6, String str) {
        if (i5 <= 0 || i5 > i6) {
            throw new IOException(str);
        }
    }
}
