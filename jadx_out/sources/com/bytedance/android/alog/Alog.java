package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import androidx.profileinstaller.ProfileVerifier;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class Alog {

    /* renamed from: a, reason: collision with root package name */
    private static final int f3113a = d.SAFE.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f3114b = g.RAW.a();

    /* renamed from: c, reason: collision with root package name */
    private static final int f3115c = e.DEFAULT.a();

    /* renamed from: d, reason: collision with root package name */
    private static final int f3116d = c.ZSTD.a();

    /* renamed from: e, reason: collision with root package name */
    private static final int f3117e = f.TEA_16.a();

    /* renamed from: f, reason: collision with root package name */
    private static final int f3118f = a.EC_SECP256K1.a();

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayList<String> f3119g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private static boolean f3120h = false;

    /* renamed from: i, reason: collision with root package name */
    private Context f3121i;

    /* renamed from: j, reason: collision with root package name */
    private int f3122j;

    /* renamed from: k, reason: collision with root package name */
    private String f3123k;

    /* renamed from: l, reason: collision with root package name */
    private String f3124l;

    /* renamed from: m, reason: collision with root package name */
    private int f3125m;

    /* renamed from: n, reason: collision with root package name */
    private int f3126n;

    /* renamed from: o, reason: collision with root package name */
    private String f3127o = null;

    /* renamed from: p, reason: collision with root package name */
    private String f3128p;

    /* renamed from: q, reason: collision with root package name */
    private long f3129q;

    /* loaded from: classes2.dex */
    public enum a {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);


        /* renamed from: d, reason: collision with root package name */
        private final int f3134d;

        a(int i5) {
            this.f3134d = i5;
        }

        int a() {
            return this.f3134d;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private Context f3135a;

        /* renamed from: b, reason: collision with root package name */
        private int f3136b = 0;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3137c = false;

        /* renamed from: d, reason: collision with root package name */
        private String f3138d = null;

        /* renamed from: e, reason: collision with root package name */
        private String f3139e = null;

        /* renamed from: f, reason: collision with root package name */
        private int f3140f = 2097152;

        /* renamed from: g, reason: collision with root package name */
        private int f3141g = 20971520;

        /* renamed from: h, reason: collision with root package name */
        private int f3142h = 7;

        /* renamed from: i, reason: collision with root package name */
        private String f3143i = null;

        /* renamed from: j, reason: collision with root package name */
        private int f3144j = 65536;

        /* renamed from: k, reason: collision with root package name */
        private int f3145k = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;

        /* renamed from: l, reason: collision with root package name */
        private String f3146l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f3147m = Alog.f3113a;

        /* renamed from: n, reason: collision with root package name */
        private int f3148n = Alog.f3114b;

        /* renamed from: o, reason: collision with root package name */
        private int f3149o = Alog.f3115c;

        /* renamed from: p, reason: collision with root package name */
        private int f3150p = Alog.f3116d;

        /* renamed from: q, reason: collision with root package name */
        private int f3151q = Alog.f3117e;

        /* renamed from: r, reason: collision with root package name */
        private int f3152r = Alog.f3118f;

        /* renamed from: s, reason: collision with root package name */
        private String f3153s = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

        public b(Context context) {
            Context applicationContext = context.getApplicationContext();
            this.f3135a = applicationContext != null ? applicationContext : context;
        }

        public b a(int i5) {
            this.f3136b = i5;
            return this;
        }

        public b b(String str) {
            this.f3139e = str;
            return this;
        }

        public b c(int i5) {
            this.f3141g = i5;
            return this;
        }

        public b d(int i5) {
            this.f3142h = i5;
            return this;
        }

        public b e(int i5) {
            this.f3144j = i5;
            return this;
        }

        public b f(int i5) {
            this.f3145k = i5;
            return this;
        }

        public b a(boolean z4) {
            this.f3137c = z4;
            return this;
        }

        public b b(int i5) {
            this.f3140f = i5;
            return this;
        }

        public b c(String str) {
            this.f3143i = str;
            return this;
        }

        public b d(String str) {
            this.f3153s = str;
            return this;
        }

        public b a(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str = str.replace("-", "");
                }
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f3138d = str;
                }
            }
            return this;
        }

        public b a(d dVar) {
            this.f3147m = dVar.a();
            return this;
        }

        public b a(g gVar) {
            this.f3148n = gVar.a();
            return this;
        }

        public b a(e eVar) {
            this.f3149o = eVar.a();
            return this;
        }

        public b a(c cVar) {
            this.f3150p = cVar.a();
            return this;
        }

        public b a(f fVar) {
            this.f3151q = fVar.a();
            return this;
        }

        public b a(a aVar) {
            this.f3152r = aVar.a();
            return this;
        }

        public Alog a() {
            if (this.f3138d == null) {
                this.f3138d = "default";
            }
            synchronized (Alog.f3119g) {
                Iterator it = Alog.f3119g.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(this.f3138d)) {
                        return null;
                    }
                }
                Alog.f3119g.add(this.f3138d);
                if (this.f3139e == null) {
                    File externalFilesDir = this.f3135a.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        this.f3139e = externalFilesDir.getPath() + "/alog";
                    } else {
                        this.f3139e = this.f3135a.getFilesDir() + "/alog";
                    }
                }
                if (this.f3143i == null) {
                    this.f3143i = this.f3135a.getFilesDir() + "/alog";
                }
                if (this.f3146l == null) {
                    this.f3146l = com.bytedance.android.alog.c.a(this.f3135a);
                }
                int i5 = (this.f3144j / 4096) * 4096;
                this.f3144j = i5;
                int i6 = (this.f3145k / 4096) * 4096;
                this.f3145k = i6;
                if (i5 < 4096) {
                    this.f3144j = 4096;
                }
                int i7 = this.f3144j;
                if (i6 < i7 * 2) {
                    this.f3145k = i7 * 2;
                }
                return new Alog(this.f3135a, this.f3136b, this.f3137c, this.f3138d, this.f3139e, this.f3140f, this.f3141g, this.f3142h, this.f3143i, this.f3144j, this.f3145k, this.f3146l, this.f3147m, this.f3148n, this.f3149o, this.f3150p, this.f3151q, this.f3152r, this.f3153s);
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        NONE(0),
        ZLIB(1),
        ZSTD(2);


        /* renamed from: d, reason: collision with root package name */
        private final int f3158d;

        c(int i5) {
            this.f3158d = i5;
        }

        int a() {
            return this.f3158d;
        }
    }

    /* loaded from: classes2.dex */
    public enum d {
        SPEED(0),
        SAFE(1);


        /* renamed from: c, reason: collision with root package name */
        private final int f3162c;

        d(int i5) {
            this.f3162c = i5;
        }

        int a() {
            return this.f3162c;
        }
    }

    /* loaded from: classes2.dex */
    public enum e {
        DEFAULT(0),
        LEGACY(1);


        /* renamed from: c, reason: collision with root package name */
        private final int f3166c;

        e(int i5) {
            this.f3166c = i5;
        }

        int a() {
            return this.f3166c;
        }
    }

    /* loaded from: classes2.dex */
    public enum f {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);


        /* renamed from: e, reason: collision with root package name */
        private final int f3172e;

        f(int i5) {
            this.f3172e = i5;
        }

        int a() {
            return this.f3172e;
        }
    }

    /* loaded from: classes2.dex */
    public enum g {
        RAW(0),
        ISO_8601(1);


        /* renamed from: c, reason: collision with root package name */
        private final int f3176c;

        g(int i5) {
            this.f3176c = i5;
        }

        int a() {
            return this.f3176c;
        }
    }

    public Alog(Context context, int i5, boolean z4, String str, String str2, int i6, int i7, int i8, String str3, int i9, int i10, String str4, int i11, int i12, int i13, int i14, int i15, int i16, String str5) {
        this.f3121i = context;
        this.f3122j = i5;
        this.f3123k = str2;
        this.f3124l = str3;
        this.f3125m = i9;
        this.f3126n = i10 / i9;
        this.f3128p = str;
        this.f3129q = nativeCreate(i5, z4, str, str2, i6, i7, i8, str3, i9, i10, str4, i11, i12, i13, i14, i15, i16, str5);
    }

    public static synchronized void a(com.bytedance.android.alog.a aVar) {
        synchronized (Alog.class) {
            if (f3120h) {
                return;
            }
            if (aVar == null) {
                System.loadLibrary("alog");
            } else {
                aVar.a("alog");
            }
            f3120h = true;
        }
    }

    private static native void nativeAsyncFlush(long j5);

    private static native long nativeCreate(int i5, boolean z4, String str, String str2, int i6, int i7, int i8, String str3, int i9, int i10, String str4, int i11, int i12, int i13, int i14, int i15, int i16, String str5);

    private static native void nativeDestroy(long j5);

    private static native long nativeGetLegacyFlushFuncAddr();

    private static native long nativeGetLegacyGetLogFileDirFuncAddr();

    private static native long nativeGetLegacyWriteFuncAddr();

    private static native long nativeGetNativeWriteFuncAddr();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeSetDefaultInstance(long j5);

    private static native void nativeSetLevel(long j5, int i5);

    private static native void nativeSetSyslog(long j5, boolean z4);

    private static native void nativeSyncFlush(long j5);

    private static native void nativeTimedSyncFlush(long j5, int i5);

    private static native void nativeWrite(long j5, int i5, String str, String str2);

    private static native void nativeWriteAsyncMsg(long j5, int i5, String str, String str2, long j6, long j7);

    public void b() {
        long j5 = this.f3129q;
        if (j5 != 0) {
            nativeAsyncFlush(j5);
        }
    }

    public long c() {
        if (this.f3129q != 0) {
            return nativeGetLegacyWriteFuncAddr();
        }
        return 0L;
    }

    public void d(String str, String str2) {
        a(3, str, str2);
    }

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            a();
        }
    }

    public void c(String str, String str2) {
        a(2, str, str2);
    }

    public long d() {
        return this.f3129q;
    }

    public void e(String str, String str2) {
        a(4, str, str2);
    }

    public void b(String str, String str2) {
        a(1, str, str2);
    }

    public void a() {
        synchronized (this) {
            long j5 = this.f3129q;
            if (j5 != 0) {
                this.f3121i = null;
                this.f3122j = 6;
                nativeDestroy(j5);
                this.f3129q = 0L;
            }
        }
    }

    public void a(int i5, String str, String str2) {
        long j5 = this.f3129q;
        if (j5 == 0 || i5 < this.f3122j || str == null || str2 == null) {
            return;
        }
        nativeWrite(j5, i5, str, str2);
    }

    public void a(int i5, String str, String str2, long j5, long j6) {
        long j7 = this.f3129q;
        if (j7 == 0 || i5 < this.f3122j || str == null || str2 == null) {
            return;
        }
        nativeWriteAsyncMsg(j7, i5, str, str2, j5, j6);
    }

    public void a(String str, String str2) {
        a(0, str, str2);
    }
}
