package u.dont.know.what.i.am;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class i implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22505a = "XSharedPreferences";

    /* renamed from: b, reason: collision with root package name */
    private final File f22506b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22507c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f22508d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22509e;

    /* renamed from: f, reason: collision with root package name */
    private long f22510f;

    /* renamed from: g, reason: collision with root package name */
    private long f22511g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (i.this) {
                i.this.e();
            }
        }
    }

    public i(File file) {
        this.f22509e = false;
        this.f22506b = file;
        this.f22507c = file.getAbsolutePath();
        h();
    }

    private void b() {
        while (!this.f22509e) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            java.lang.String r0 = "getSharedPreferences"
            java.lang.String r1 = "XSharedPreferences"
            boolean r2 = r10.f22509e
            if (r2 == 0) goto L9
            return
        L9:
            r2 = 0
            u.dont.know.what.i.am.r r3 = u.dont.know.what.i.am.f.a()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 java.io.FileNotFoundException -> L57 org.xmlpull.v1.XmlPullParserException -> L67
            java.lang.String r4 = r10.f22507c     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 java.io.FileNotFoundException -> L57 org.xmlpull.v1.XmlPullParserException -> L67
            long r5 = r10.f22511g     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 java.io.FileNotFoundException -> L57 org.xmlpull.v1.XmlPullParserException -> L67
            long r7 = r10.f22510f     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 java.io.FileNotFoundException -> L57 org.xmlpull.v1.XmlPullParserException -> L67
            u.dont.know.what.i.am.t r3 = r3.d(r4, r5, r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46 java.io.FileNotFoundException -> L57 org.xmlpull.v1.XmlPullParserException -> L67
            java.io.InputStream r4 = r3.f22557b     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.io.FileNotFoundException -> L3c org.xmlpull.v1.XmlPullParserException -> L3f
            if (r4 == 0) goto L26
            java.util.HashMap r2 = com.android.internal.util.XmlUtils.readMapXml(r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.io.FileNotFoundException -> L3c org.xmlpull.v1.XmlPullParserException -> L3f
            java.io.InputStream r4 = r3.f22557b     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.io.FileNotFoundException -> L3c org.xmlpull.v1.XmlPullParserException -> L3f
            r4.close()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.io.FileNotFoundException -> L3c org.xmlpull.v1.XmlPullParserException -> L3f
            goto L28
        L26:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f22508d     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L37 java.io.FileNotFoundException -> L3c org.xmlpull.v1.XmlPullParserException -> L3f
        L28:
            java.io.InputStream r0 = r3.f22557b
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.lang.RuntimeException -> L31 java.lang.Exception -> L7b
            goto L7b
        L31:
            r0 = move-exception
            throw r0
        L33:
            r0 = move-exception
            r2 = r3
            goto L96
        L37:
            r4 = move-exception
            r9 = r3
            r3 = r2
            r2 = r9
            goto L48
        L3c:
            r0 = r2
            r2 = r3
            goto L58
        L3f:
            r4 = move-exception
            r9 = r3
            r3 = r2
            r2 = r9
            goto L69
        L44:
            r0 = move-exception
            goto L96
        L46:
            r4 = move-exception
            r3 = r2
        L48:
            android.util.Log.w(r1, r0, r4)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L78
            java.io.InputStream r0 = r2.f22557b
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.lang.RuntimeException -> L55 java.lang.Exception -> L78
            goto L78
        L55:
            r0 = move-exception
            throw r0
        L57:
            r0 = r2
        L58:
            if (r2 == 0) goto L64
            java.io.InputStream r1 = r2.f22557b
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.lang.RuntimeException -> L62 java.lang.Exception -> L64
            goto L64
        L62:
            r0 = move-exception
            throw r0
        L64:
            r3 = r2
            r2 = r0
            goto L7b
        L67:
            r4 = move-exception
            r3 = r2
        L69:
            android.util.Log.w(r1, r0, r4)     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L78
            java.io.InputStream r0 = r2.f22557b
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.lang.RuntimeException -> L76 java.lang.Exception -> L78
            goto L78
        L76:
            r0 = move-exception
            throw r0
        L78:
            r9 = r3
            r3 = r2
            r2 = r9
        L7b:
            r0 = 1
            r10.f22509e = r0
            if (r2 == 0) goto L8b
            r10.f22508d = r2
            long r0 = r3.f22559d
            r10.f22510f = r0
            long r0 = r3.f22558c
            r10.f22511g = r0
            goto L92
        L8b:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10.f22508d = r0
        L92:
            r10.notifyAll()
            return
        L96:
            if (r2 == 0) goto La2
            java.io.InputStream r1 = r2.f22557b
            if (r1 == 0) goto La2
            r1.close()     // Catch: java.lang.RuntimeException -> La0 java.lang.Exception -> La2
            goto La2
        La0:
            r0 = move-exception
            throw r0
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u.dont.know.what.i.am.i.e():void");
    }

    private void h() {
        synchronized (this) {
            this.f22509e = false;
        }
        new a("XSharedPreferences-load").start();
    }

    public File c() {
        return this.f22506b;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        boolean containsKey;
        synchronized (this) {
            b();
            containsKey = this.f22508d.containsKey(str);
        }
        return containsKey;
    }

    public synchronized boolean d() {
        boolean z4;
        z4 = true;
        try {
            t l5 = f.a().l(this.f22507c);
            if (this.f22510f == l5.f22559d) {
                if (this.f22511g == l5.f22558c) {
                    z4 = false;
                }
            }
        } catch (FileNotFoundException unused) {
            return true;
        } catch (IOException e5) {
            Log.w(f22505a, "hasFileChanged", e5);
            return true;
        }
        return z4;
    }

    @Override // android.content.SharedPreferences
    @Deprecated
    public SharedPreferences.Editor edit() {
        throw new UnsupportedOperationException("read-only implementation");
    }

    @SuppressLint({"SetWorldReadable"})
    public boolean f() {
        if (!f.a().h() || !this.f22506b.exists()) {
            return false;
        }
        return this.f22506b.setReadable(true, false);
    }

    public synchronized void g() {
        if (d()) {
            h();
        }
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap;
        synchronized (this) {
            b();
            hashMap = new HashMap(this.f22508d);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z4) {
        synchronized (this) {
            b();
            Boolean bool = (Boolean) this.f22508d.get(str);
            if (bool != null) {
                z4 = bool.booleanValue();
            }
        }
        return z4;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f5) {
        synchronized (this) {
            b();
            Float f6 = (Float) this.f22508d.get(str);
            if (f6 != null) {
                f5 = f6.floatValue();
            }
        }
        return f5;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i5) {
        synchronized (this) {
            b();
            Integer num = (Integer) this.f22508d.get(str);
            if (num != null) {
                i5 = num.intValue();
            }
        }
        return i5;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j5) {
        synchronized (this) {
            b();
            Long l5 = (Long) this.f22508d.get(str);
            if (l5 != null) {
                j5 = l5.longValue();
            }
        }
        return j5;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        synchronized (this) {
            b();
            String str3 = (String) this.f22508d.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        synchronized (this) {
            b();
            Set<String> set2 = (Set) this.f22508d.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    @Deprecated
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("listeners are not supported in this implementation");
    }

    @Override // android.content.SharedPreferences
    @Deprecated
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("listeners are not supported in this implementation");
    }

    public i(String str) {
        this(str, str + "_preferences");
    }

    public i(String str, String str2) {
        this.f22509e = false;
        File file = new File(Environment.getDataDirectory(), "data/" + str + "/shared_prefs/" + str2 + ".xml");
        this.f22506b = file;
        this.f22507c = file.getAbsolutePath();
        h();
    }
}
