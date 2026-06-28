package com.jakewharton.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    static final String f9105o = "journal";

    /* renamed from: p, reason: collision with root package name */
    static final String f9106p = "journal.tmp";

    /* renamed from: q, reason: collision with root package name */
    static final String f9107q = "journal.bkp";

    /* renamed from: r, reason: collision with root package name */
    static final String f9108r = "libcore.io.DiskLruCache";

    /* renamed from: s, reason: collision with root package name */
    static final String f9109s = "1";

    /* renamed from: t, reason: collision with root package name */
    static final long f9110t = -1;

    /* renamed from: v, reason: collision with root package name */
    private static final String f9112v = "CLEAN";

    /* renamed from: w, reason: collision with root package name */
    private static final String f9113w = "DIRTY";

    /* renamed from: x, reason: collision with root package name */
    private static final String f9114x = "REMOVE";

    /* renamed from: y, reason: collision with root package name */
    private static final String f9115y = "READ";

    /* renamed from: a, reason: collision with root package name */
    private final File f9117a;

    /* renamed from: b, reason: collision with root package name */
    private final File f9118b;

    /* renamed from: c, reason: collision with root package name */
    private final File f9119c;

    /* renamed from: d, reason: collision with root package name */
    private final File f9120d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9121e;

    /* renamed from: f, reason: collision with root package name */
    private long f9122f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9123g;

    /* renamed from: i, reason: collision with root package name */
    private Writer f9125i;

    /* renamed from: k, reason: collision with root package name */
    private int f9127k;

    /* renamed from: u, reason: collision with root package name */
    static final Pattern f9111u = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: z, reason: collision with root package name */
    private static final OutputStream f9116z = new b();

    /* renamed from: h, reason: collision with root package name */
    private long f9124h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f9126j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f9128l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f9129m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    private final Callable<Void> f9130n = new CallableC0168a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.jakewharton.disklrucache.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class CallableC0168a implements Callable<Void> {
        CallableC0168a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.f9125i == null) {
                    return null;
                }
                a.this.H0();
                if (a.this.i0()) {
                    a.this.C0();
                    a.this.f9127k = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i5) throws IOException {
        }
    }

    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f9132a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f9133b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9134c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9135d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.jakewharton.disklrucache.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0169a extends FilterOutputStream {
            /* synthetic */ C0169a(c cVar, OutputStream outputStream, CallableC0168a callableC0168a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f9134c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f9134c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i5) {
                try {
                    ((FilterOutputStream) this).out.write(i5);
                } catch (IOException unused) {
                    c.this.f9134c = true;
                }
            }

            private C0169a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i5, int i6) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i5, i6);
                } catch (IOException unused) {
                    c.this.f9134c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0168a callableC0168a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.H(this, false);
        }

        public void b() {
            if (!this.f9135d) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void f() throws IOException {
            if (this.f9134c) {
                a.this.H(this, false);
                a.this.D0(this.f9132a.f9138a);
            } else {
                a.this.H(this, true);
            }
            this.f9135d = true;
        }

        public String g(int i5) throws IOException {
            InputStream h5 = h(i5);
            if (h5 != null) {
                return a.f0(h5);
            }
            return null;
        }

        public InputStream h(int i5) throws IOException {
            synchronized (a.this) {
                if (this.f9132a.f9141d == this) {
                    if (!this.f9132a.f9140c) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.f9132a.j(i5));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public OutputStream i(int i5) throws IOException {
            FileOutputStream fileOutputStream;
            C0169a c0169a;
            synchronized (a.this) {
                if (this.f9132a.f9141d == this) {
                    if (!this.f9132a.f9140c) {
                        this.f9133b[i5] = true;
                    }
                    File k5 = this.f9132a.k(i5);
                    try {
                        fileOutputStream = new FileOutputStream(k5);
                    } catch (FileNotFoundException unused) {
                        a.this.f9117a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(k5);
                        } catch (FileNotFoundException unused2) {
                            return a.f9116z;
                        }
                    }
                    c0169a = new C0169a(this, fileOutputStream, null);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c0169a;
        }

        public void j(int i5, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(i(i5), com.jakewharton.disklrucache.c.f9158b);
                try {
                    outputStreamWriter2.write(str);
                    com.jakewharton.disklrucache.c.a(outputStreamWriter2);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    com.jakewharton.disklrucache.c.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private c(d dVar) {
            this.f9132a = dVar;
            this.f9133b = dVar.f9140c ? null : new boolean[a.this.f9123g];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f9138a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f9139b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9140c;

        /* renamed from: d, reason: collision with root package name */
        private c f9141d;

        /* renamed from: e, reason: collision with root package name */
        private long f9142e;

        /* synthetic */ d(a aVar, String str, CallableC0168a callableC0168a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == a.this.f9123g) {
                for (int i5 = 0; i5 < strArr.length; i5++) {
                    try {
                        this.f9139b[i5] = Long.parseLong(strArr[i5]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i5) {
            return new File(a.this.f9117a, this.f9138a + "." + i5);
        }

        public File k(int i5) {
            return new File(a.this.f9117a, this.f9138a + "." + i5 + ".tmp");
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j5 : this.f9139b) {
                sb.append(' ');
                sb.append(j5);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f9138a = str;
            this.f9139b = new long[a.this.f9123g];
        }
    }

    /* loaded from: classes3.dex */
    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        private final String f9144a;

        /* renamed from: b, reason: collision with root package name */
        private final long f9145b;

        /* renamed from: c, reason: collision with root package name */
        private final InputStream[] f9146c;

        /* renamed from: d, reason: collision with root package name */
        private final long[] f9147d;

        /* synthetic */ e(a aVar, String str, long j5, InputStream[] inputStreamArr, long[] jArr, CallableC0168a callableC0168a) {
            this(str, j5, inputStreamArr, jArr);
        }

        public c a() throws IOException {
            return a.this.O(this.f9144a, this.f9145b);
        }

        public InputStream b(int i5) {
            return this.f9146c[i5];
        }

        public long c(int i5) {
            return this.f9147d[i5];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f9146c) {
                com.jakewharton.disklrucache.c.a(inputStream);
            }
        }

        public String getString(int i5) throws IOException {
            return a.f0(b(i5));
        }

        private e(String str, long j5, InputStream[] inputStreamArr, long[] jArr) {
            this.f9144a = str;
            this.f9145b = j5;
            this.f9146c = inputStreamArr;
            this.f9147d = jArr;
        }
    }

    private a(File file, int i5, int i6, long j5) {
        this.f9117a = file;
        this.f9121e = i5;
        this.f9118b = new File(file, f9105o);
        this.f9119c = new File(file, f9106p);
        this.f9120d = new File(file, f9107q);
        this.f9123g = i6;
        this.f9122f = j5;
    }

    private void A() {
        if (this.f9125i != null) {
        } else {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void A0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i5 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i5);
            if (indexOf2 == -1) {
                substring = str.substring(i5);
                if (indexOf == 6 && str.startsWith(f9114x)) {
                    this.f9126j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i5, indexOf2);
            }
            d dVar = this.f9126j.get(substring);
            CallableC0168a callableC0168a = null;
            if (dVar == null) {
                dVar = new d(this, substring, callableC0168a);
                this.f9126j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(f9112v)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f9140c = true;
                dVar.f9141d = null;
                dVar.n(split);
                return;
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith(f9113w)) {
                dVar.f9141d = new c(this, dVar, callableC0168a);
                return;
            }
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith(f9115y)) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C0() throws IOException {
        Writer writer = this.f9125i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9119c), com.jakewharton.disklrucache.c.f9157a));
        try {
            bufferedWriter.write(f9108r);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f9121e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f9123g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f9126j.values()) {
                if (dVar.f9141d != null) {
                    bufferedWriter.write("DIRTY " + dVar.f9138a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f9138a + dVar.l() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f9118b.exists()) {
                E0(this.f9118b, this.f9120d, true);
            }
            E0(this.f9119c, this.f9118b, false);
            this.f9120d.delete();
            this.f9125i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9118b, true), com.jakewharton.disklrucache.c.f9157a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    private static void E0(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            J(file2);
        }
        if (file.renameTo(file2)) {
        } else {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void H(c cVar, boolean z4) throws IOException {
        d dVar = cVar.f9132a;
        if (dVar.f9141d == cVar) {
            if (z4 && !dVar.f9140c) {
                for (int i5 = 0; i5 < this.f9123g; i5++) {
                    if (cVar.f9133b[i5]) {
                        if (!dVar.k(i5).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                    }
                }
            }
            for (int i6 = 0; i6 < this.f9123g; i6++) {
                File k5 = dVar.k(i6);
                if (z4) {
                    if (k5.exists()) {
                        File j5 = dVar.j(i6);
                        k5.renameTo(j5);
                        long j6 = dVar.f9139b[i6];
                        long length = j5.length();
                        dVar.f9139b[i6] = length;
                        this.f9124h = (this.f9124h - j6) + length;
                    }
                } else {
                    J(k5);
                }
            }
            this.f9127k++;
            dVar.f9141d = null;
            if (dVar.f9140c | z4) {
                dVar.f9140c = true;
                this.f9125i.write("CLEAN " + dVar.f9138a + dVar.l() + '\n');
                if (z4) {
                    long j7 = this.f9128l;
                    this.f9128l = 1 + j7;
                    dVar.f9142e = j7;
                }
            } else {
                this.f9126j.remove(dVar.f9138a);
                this.f9125i.write("REMOVE " + dVar.f9138a + '\n');
            }
            this.f9125i.flush();
            if (this.f9124h > this.f9122f || i0()) {
                this.f9129m.submit(this.f9130n);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() throws IOException {
        while (this.f9124h > this.f9122f) {
            D0(this.f9126j.entrySet().iterator().next().getKey());
        }
    }

    private void I0(String str) {
        if (f9111u.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    private static void J(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c O(String str, long j5) throws IOException {
        A();
        I0(str);
        d dVar = this.f9126j.get(str);
        CallableC0168a callableC0168a = null;
        if (j5 != -1 && (dVar == null || dVar.f9142e != j5)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0168a);
            this.f9126j.put(str, dVar);
        } else if (dVar.f9141d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0168a);
        dVar.f9141d = cVar;
        this.f9125i.write("DIRTY " + str + '\n');
        this.f9125i.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f0(InputStream inputStream) throws IOException {
        return com.jakewharton.disklrucache.c.c(new InputStreamReader(inputStream, com.jakewharton.disklrucache.c.f9158b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i0() {
        int i5 = this.f9127k;
        return i5 >= 2000 && i5 >= this.f9126j.size();
    }

    public static a p0(File file, int i5, int i6, long j5) throws IOException {
        if (j5 > 0) {
            if (i6 > 0) {
                File file2 = new File(file, f9107q);
                if (file2.exists()) {
                    File file3 = new File(file, f9105o);
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        E0(file2, file3, false);
                    }
                }
                a aVar = new a(file, i5, i6, j5);
                if (aVar.f9118b.exists()) {
                    try {
                        aVar.t0();
                        aVar.r0();
                        aVar.f9125i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f9118b, true), com.jakewharton.disklrucache.c.f9157a));
                        return aVar;
                    } catch (IOException e5) {
                        System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                        aVar.I();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i5, i6, j5);
                aVar2.C0();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void r0() throws IOException {
        J(this.f9119c);
        Iterator<d> it = this.f9126j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i5 = 0;
            if (next.f9141d == null) {
                while (i5 < this.f9123g) {
                    this.f9124h += next.f9139b[i5];
                    i5++;
                }
            } else {
                next.f9141d = null;
                while (i5 < this.f9123g) {
                    J(next.j(i5));
                    J(next.k(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    private void t0() throws IOException {
        com.jakewharton.disklrucache.b bVar = new com.jakewharton.disklrucache.b(new FileInputStream(this.f9118b), com.jakewharton.disklrucache.c.f9157a);
        try {
            String c5 = bVar.c();
            String c6 = bVar.c();
            String c7 = bVar.c();
            String c8 = bVar.c();
            String c9 = bVar.c();
            if (f9108r.equals(c5) && "1".equals(c6) && Integer.toString(this.f9121e).equals(c7) && Integer.toString(this.f9123g).equals(c8) && "".equals(c9)) {
                int i5 = 0;
                while (true) {
                    try {
                        A0(bVar.c());
                        i5++;
                    } catch (EOFException unused) {
                        this.f9127k = i5 - this.f9126j.size();
                        com.jakewharton.disklrucache.c.a(bVar);
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + c5 + ", " + c6 + ", " + c8 + ", " + c9 + "]");
            }
        } catch (Throwable th) {
            com.jakewharton.disklrucache.c.a(bVar);
            throw th;
        }
    }

    public synchronized boolean D0(String str) throws IOException {
        A();
        I0(str);
        d dVar = this.f9126j.get(str);
        if (dVar != null && dVar.f9141d == null) {
            for (int i5 = 0; i5 < this.f9123g; i5++) {
                File j5 = dVar.j(i5);
                if (j5.exists() && !j5.delete()) {
                    throw new IOException("failed to delete " + j5);
                }
                this.f9124h -= dVar.f9139b[i5];
                dVar.f9139b[i5] = 0;
            }
            this.f9127k++;
            this.f9125i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f9126j.remove(str);
            if (i0()) {
                this.f9129m.submit(this.f9130n);
            }
            return true;
        }
        return false;
    }

    public synchronized void F0(long j5) {
        this.f9122f = j5;
        this.f9129m.submit(this.f9130n);
    }

    public synchronized long G0() {
        return this.f9124h;
    }

    public void I() throws IOException {
        close();
        com.jakewharton.disklrucache.c.b(this.f9117a);
    }

    public c M(String str) throws IOException {
        return O(str, -1L);
    }

    public synchronized e P(String str) throws IOException {
        InputStream inputStream;
        A();
        I0(str);
        d dVar = this.f9126j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f9140c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f9123g];
        for (int i5 = 0; i5 < this.f9123g; i5++) {
            try {
                inputStreamArr[i5] = new FileInputStream(dVar.j(i5));
            } catch (FileNotFoundException unused) {
                for (int i6 = 0; i6 < this.f9123g && (inputStream = inputStreamArr[i6]) != null; i6++) {
                    com.jakewharton.disklrucache.c.a(inputStream);
                }
                return null;
            }
        }
        this.f9127k++;
        this.f9125i.append((CharSequence) ("READ " + str + '\n'));
        if (i0()) {
            this.f9129m.submit(this.f9130n);
        }
        return new e(this, str, dVar.f9142e, inputStreamArr, dVar.f9139b, null);
    }

    public File a0() {
        return this.f9117a;
    }

    public synchronized long b0() {
        return this.f9122f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f9125i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f9126j.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f9141d != null) {
                dVar.f9141d.a();
            }
        }
        H0();
        this.f9125i.close();
        this.f9125i = null;
    }

    public synchronized void flush() throws IOException {
        A();
        H0();
        this.f9125i.flush();
    }

    public synchronized boolean isClosed() {
        boolean z4;
        if (this.f9125i == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        return z4;
    }
}
