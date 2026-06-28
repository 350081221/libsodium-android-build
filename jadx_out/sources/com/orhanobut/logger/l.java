package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class l implements f {

    /* renamed from: f, reason: collision with root package name */
    private static final int f9365f = 4000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f9366g = 5;

    /* renamed from: h, reason: collision with root package name */
    private static final char f9367h = 9484;

    /* renamed from: i, reason: collision with root package name */
    private static final char f9368i = 9492;

    /* renamed from: j, reason: collision with root package name */
    private static final char f9369j = 9500;

    /* renamed from: k, reason: collision with root package name */
    private static final char f9370k = 9474;

    /* renamed from: l, reason: collision with root package name */
    private static final String f9371l = "────────────────────────────────────────────────────────";

    /* renamed from: m, reason: collision with root package name */
    private static final String f9372m = "┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: n, reason: collision with root package name */
    private static final String f9373n = "┌────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: o, reason: collision with root package name */
    private static final String f9374o = "└────────────────────────────────────────────────────────────────────────────────────────────────────────────────";

    /* renamed from: p, reason: collision with root package name */
    private static final String f9375p = "├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄";

    /* renamed from: a, reason: collision with root package name */
    private final int f9376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9377b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9378c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final h f9379d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f9380e;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f9381a;

        /* renamed from: b, reason: collision with root package name */
        int f9382b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9383c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        h f9384d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        String f9385e;

        @NonNull
        public l a() {
            if (this.f9384d == null) {
                this.f9384d = new i();
            }
            return new l(this);
        }

        @NonNull
        public b b(@Nullable h hVar) {
            this.f9384d = hVar;
            return this;
        }

        @NonNull
        public b c(int i5) {
            this.f9381a = i5;
            return this;
        }

        @NonNull
        public b d(int i5) {
            this.f9382b = i5;
            return this;
        }

        @NonNull
        public b e(boolean z4) {
            this.f9383c = z4;
            return this;
        }

        @NonNull
        public b f(@Nullable String str) {
            this.f9385e = str;
            return this;
        }

        private b() {
            this.f9381a = 2;
            this.f9382b = 0;
            this.f9383c = true;
            this.f9385e = "PRETTY_LOGGER";
        }
    }

    @Nullable
    private String b(@Nullable String str) {
        if (!o.d(str) && !o.b(this.f9380e, str)) {
            return this.f9380e + "-" + str;
        }
        return this.f9380e;
    }

    private String c(@NonNull String str) {
        o.a(str);
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private int d(@NonNull StackTraceElement[] stackTraceElementArr) {
        o.a(stackTraceElementArr);
        for (int i5 = 5; i5 < stackTraceElementArr.length; i5++) {
            String className = stackTraceElementArr[i5].getClassName();
            if (!className.equals(k.class.getName()) && !className.equals(j.class.getName())) {
                return i5 - 1;
            }
        }
        return -1;
    }

    private void e(int i5, @Nullable String str) {
        f(i5, str, f9374o);
    }

    private void f(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        this.f9379d.a(i5, str, str2);
    }

    private void g(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        for (String str3 : str2.split(System.getProperty("line.separator"))) {
            f(i5, str, "│ " + str3);
        }
    }

    private void h(int i5, @Nullable String str) {
        f(i5, str, f9375p);
    }

    private void i(int i5, @Nullable String str, int i6) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (this.f9378c) {
            f(i5, str, "│ Thread: " + Thread.currentThread().getName());
            h(i5, str);
        }
        int d5 = d(stackTrace) + this.f9377b;
        if (i6 + d5 > stackTrace.length) {
            i6 = (stackTrace.length - d5) - 1;
        }
        String str2 = "";
        while (i6 > 0) {
            int i7 = i6 + d5;
            if (i7 < stackTrace.length) {
                str2 = str2 + "   ";
                f(i5, str, f9370k + ' ' + str2 + c(stackTrace[i7].getClassName()) + "." + stackTrace[i7].getMethodName() + "  (" + stackTrace[i7].getFileName() + ":" + stackTrace[i7].getLineNumber() + ")");
            }
            i6--;
        }
    }

    private void j(int i5, @Nullable String str) {
        f(i5, str, f9373n);
    }

    @NonNull
    public static b k() {
        return new b();
    }

    @Override // com.orhanobut.logger.f
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        String b5 = b(str);
        j(i5, b5);
        i(i5, b5, this.f9376a);
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            if (this.f9376a > 0) {
                h(i5, b5);
            }
            g(i5, b5, str2);
            e(i5, b5);
            return;
        }
        if (this.f9376a > 0) {
            h(i5, b5);
        }
        for (int i6 = 0; i6 < length; i6 += 4000) {
            g(i5, b5, new String(bytes, i6, Math.min(length - i6, 4000)));
        }
        e(i5, b5);
    }

    private l(@NonNull b bVar) {
        o.a(bVar);
        this.f9376a = bVar.f9381a;
        this.f9377b = bVar.f9382b;
        this.f9378c = bVar.f9383c;
        this.f9379d = bVar.f9384d;
        this.f9380e = bVar.f9385e;
    }
}
