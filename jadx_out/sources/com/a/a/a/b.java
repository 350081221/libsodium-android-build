package com.a.a.a;

import a1.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f785a;

    /* renamed from: b, reason: collision with root package name */
    private int f786b;

    /* renamed from: c, reason: collision with root package name */
    private int f787c;

    /* renamed from: d, reason: collision with root package name */
    private int f788d;

    /* renamed from: e, reason: collision with root package name */
    private String f789e;

    /* renamed from: f, reason: collision with root package name */
    private String f790f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f791g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f792h;

    /* renamed from: i, reason: collision with root package name */
    private int f793i;

    /* renamed from: j, reason: collision with root package name */
    private String f794j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f795k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f796l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f797m;

    /* renamed from: com.a.a.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0083b {

        /* renamed from: a, reason: collision with root package name */
        private Context f798a;

        /* renamed from: e, reason: collision with root package name */
        private String f802e;

        /* renamed from: f, reason: collision with root package name */
        private String f803f;

        /* renamed from: b, reason: collision with root package name */
        private int f799b = 14;

        /* renamed from: c, reason: collision with root package name */
        private int f800c = 20971520;

        /* renamed from: d, reason: collision with root package name */
        private int f801d = 2097152;

        /* renamed from: g, reason: collision with root package name */
        private boolean f804g = true;

        /* renamed from: h, reason: collision with root package name */
        private boolean f805h = true;

        /* renamed from: i, reason: collision with root package name */
        private int f806i = 3;

        /* renamed from: j, reason: collision with root package name */
        private String f807j = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f";

        /* renamed from: k, reason: collision with root package name */
        private boolean f808k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f809l = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f810m = false;

        public C0083b(Context context) {
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                this.f798a = applicationContext != null ? applicationContext : context;
                return;
            }
            throw new RuntimeException("context must not be null");
        }

        public C0083b a(int i5) {
            this.f799b = i5;
            return this;
        }

        public C0083b b(String str) {
            this.f802e = str;
            return this;
        }

        public C0083b c(boolean z4) {
            this.f804g = z4;
            return this;
        }

        public b d() {
            String str;
            String str2;
            b bVar = new b();
            bVar.c(this.f798a);
            bVar.b(this.f799b);
            bVar.g(this.f800c);
            bVar.k(this.f801d);
            if (TextUtils.isEmpty(this.f802e)) {
                str = c.b(this.f798a);
            } else {
                str = this.f802e;
            }
            bVar.d(str);
            if (TextUtils.isEmpty(this.f803f)) {
                str2 = c.a(this.f798a).getAbsolutePath();
            } else {
                str2 = this.f803f;
            }
            bVar.h(str2);
            bVar.e(this.f804g);
            bVar.i(this.f805h);
            bVar.o(this.f806i);
            bVar.l(this.f807j);
            bVar.m(this.f808k);
            bVar.p(this.f809l);
            bVar.r(this.f810m);
            return bVar;
        }

        public C0083b e(int i5) {
            this.f800c = i5;
            return this;
        }

        public C0083b f(String str) {
            this.f803f = str;
            return this;
        }

        public C0083b g(boolean z4) {
            this.f805h = z4;
            return this;
        }

        public C0083b h(int i5) {
            this.f801d = i5;
            return this;
        }

        public C0083b i(boolean z4) {
            this.f809l = z4;
            return this;
        }

        public C0083b j(int i5) {
            this.f806i = i5;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public class c {
        public static File a(Context context) {
            File file = new File(context.getFilesDir(), "logs");
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }

        public static String b(Context context) {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir.getAbsolutePath(), "ALOG");
                if (!file.exists()) {
                    file.mkdir();
                }
                return file.getAbsolutePath();
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private static ConcurrentHashMap<a, e.b> f811a;

        /* loaded from: classes2.dex */
        public enum a {
            MSG,
            JSON,
            BUNDLE,
            INTENT,
            THROWABLE,
            BORDER,
            STACKTRACE,
            THREAD,
            STACKTRACE_STR
        }

        static {
            ConcurrentHashMap<a, e.b> concurrentHashMap = new ConcurrentHashMap<>();
            f811a = concurrentHashMap;
            concurrentHashMap.put(a.MSG, new g.a());
            f811a.put(a.JSON, new h.a());
            f811a.put(a.BUNDLE, new i.a());
            f811a.put(a.INTENT, new i.b());
            f811a.put(a.BORDER, new f.b());
            f811a.put(a.STACKTRACE, new k.a());
            f811a.put(a.THREAD, new l.a());
            f811a.put(a.THROWABLE, new j.a());
        }

        public static String a(a aVar, Intent intent) {
            return ((i.b) f811a.get(aVar)).a(intent);
        }

        public static String b(a aVar, Bundle bundle) {
            return ((i.a) f811a.get(aVar)).a(bundle);
        }

        public static String c(a aVar, String str) {
            e.b bVar = f811a.get(aVar);
            if (bVar != null) {
                if (aVar == a.BORDER) {
                    return bVar.a(new String[]{str});
                }
                return bVar.a(str);
            }
            return str;
        }

        public static String d(a aVar, Thread thread) {
            return f811a.get(aVar).a(thread);
        }

        public static String e(a aVar, Throwable th) {
            return f811a.get(aVar).a(th);
        }

        public static String f(a aVar, StackTraceElement[] stackTraceElementArr) {
            return f811a.get(aVar).a(stackTraceElementArr);
        }
    }

    /* loaded from: classes2.dex */
    public class e {
        public static String a(Intent intent) {
            if (intent == null) {
                return "null";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            d(intent, sb);
            sb.append(" }");
            return sb.toString();
        }

        private static String b(Uri uri) {
            try {
                Method declaredMethod = Uri.class.getDeclaredMethod("toSafeString", new Class[0]);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(uri, new Object[0]);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return uri.toString();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
                return uri.toString();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
                return uri.toString();
            }
        }

        public static String c(Bundle bundle) {
            if (bundle == null) {
                return "null";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle[{");
            e(bundle, sb);
            sb.append("}]");
            return sb.toString();
        }

        private static void d(Intent intent, StringBuilder sb) {
            boolean z4;
            String action = intent.getAction();
            boolean z5 = false;
            boolean z6 = true;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z4 = false;
            } else {
                z4 = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str : categories) {
                    if (!z6) {
                        sb.append(',');
                    }
                    sb.append(str);
                    z6 = false;
                }
                sb.append("]");
                z4 = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(b(data));
                z4 = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z4 = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z4 = false;
            }
            String str2 = intent.getPackage();
            if (str2 != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str2);
                z4 = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z4 = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z4 = false;
            }
            if (intent.getClipData() != null) {
                if (!z4) {
                    sb.append(' ');
                }
                sb.append("(has clip)");
            } else {
                z5 = z4;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z5) {
                    sb.append(' ');
                }
                sb.append("extras={");
                e(extras, sb);
                sb.append('}');
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                sb.append(" sel=");
                d(selector, sb);
                sb.append(i.f138d);
            }
        }

        private static void e(Bundle bundle, StringBuilder sb) {
            boolean z4 = true;
            for (String str : bundle.keySet()) {
                if (!z4) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(o0.a.f20835h);
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr.length < 102400) {
                        sb.append(Arrays.toString(bArr));
                    } else {
                        sb.append("byte[] in Bundle is too long, limit for 100K");
                    }
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(c((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z4 = false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f {

        /* loaded from: classes2.dex */
        private static class a extends StringWriter {

            /* renamed from: a, reason: collision with root package name */
            private int f822a = 0;

            /* renamed from: b, reason: collision with root package name */
            private boolean f823b = false;

            @Override // java.io.StringWriter, java.io.Writer
            public void write(String str, int i5, int i6) {
                if (this.f823b) {
                    return;
                }
                int i7 = this.f822a;
                if (i7 + i6 > 4000) {
                    this.f823b = true;
                } else {
                    this.f822a = i7 + i6;
                    super.write(str, i5, i6);
                }
            }
        }

        public static String a(Throwable th) {
            if (th == null) {
                return "";
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (th2 instanceof UnknownHostException) {
                    return "ALOG:UnknownHostException";
                }
            }
            a aVar = new a();
            PrintWriter printWriter = new PrintWriter(aVar);
            try {
                th.printStackTrace(printWriter);
            } catch (Throwable unused) {
            }
            printWriter.flush();
            return aVar.toString();
        }
    }

    public Context a() {
        return this.f785a;
    }

    public void b(int i5) {
        this.f786b = i5;
    }

    public void c(Context context) {
        this.f785a = context;
    }

    public void d(String str) {
        this.f789e = str;
    }

    public void e(boolean z4) {
        this.f791g = z4;
    }

    public int f() {
        return this.f786b;
    }

    public void g(int i5) {
        this.f787c = i5;
    }

    public void h(String str) {
        this.f790f = str;
    }

    public void i(boolean z4) {
        this.f792h = z4;
    }

    public int j() {
        return this.f787c;
    }

    public void k(int i5) {
        this.f788d = i5;
    }

    public void l(String str) {
        this.f794j = str;
    }

    public void m(boolean z4) {
        this.f795k = z4;
    }

    public int n() {
        return this.f788d;
    }

    public void o(int i5) {
        this.f793i = i5;
    }

    public void p(boolean z4) {
        this.f796l = z4;
    }

    public String q() {
        return this.f789e;
    }

    public void r(boolean z4) {
        this.f797m = z4;
    }

    public String s() {
        return this.f790f;
    }

    public boolean t() {
        return this.f791g;
    }

    public boolean u() {
        return this.f792h;
    }

    public int v() {
        return this.f793i;
    }

    public String w() {
        return this.f794j;
    }

    public boolean x() {
        return this.f795k;
    }

    public boolean y() {
        return this.f796l;
    }

    public boolean z() {
        return this.f797m;
    }

    private b() {
    }
}
