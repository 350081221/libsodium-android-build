package com.orhanobut.logger;

import android.os.Environment;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.orhanobut.logger.e;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class c implements f {

    /* renamed from: e, reason: collision with root package name */
    private static final String f9338e = System.getProperty("line.separator");

    /* renamed from: f, reason: collision with root package name */
    private static final String f9339f = " <br> ";

    /* renamed from: g, reason: collision with root package name */
    private static final String f9340g = ",";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Date f9341a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final SimpleDateFormat f9342b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final h f9343c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f9344d;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        private static final int f9345e = 512000;

        /* renamed from: a, reason: collision with root package name */
        Date f9346a;

        /* renamed from: b, reason: collision with root package name */
        SimpleDateFormat f9347b;

        /* renamed from: c, reason: collision with root package name */
        h f9348c;

        /* renamed from: d, reason: collision with root package name */
        String f9349d;

        @NonNull
        public c a() {
            if (this.f9346a == null) {
                this.f9346a = new Date();
            }
            if (this.f9347b == null) {
                this.f9347b = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS", Locale.UK);
            }
            if (this.f9348c == null) {
                String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "logger";
                HandlerThread handlerThread = new HandlerThread("AndroidFileLogger." + str);
                handlerThread.start();
                this.f9348c = new e(new e.a(handlerThread.getLooper(), str, f9345e));
            }
            return new c(this);
        }

        @NonNull
        public b b(@Nullable Date date) {
            this.f9346a = date;
            return this;
        }

        @NonNull
        public b c(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f9347b = simpleDateFormat;
            return this;
        }

        @NonNull
        public b d(@Nullable h hVar) {
            this.f9348c = hVar;
            return this;
        }

        @NonNull
        public b e(@Nullable String str) {
            this.f9349d = str;
            return this;
        }

        private b() {
            this.f9349d = "PRETTY_LOGGER";
        }
    }

    @Nullable
    private String b(@Nullable String str) {
        if (!o.d(str) && !o.b(this.f9344d, str)) {
            return this.f9344d + "-" + str;
        }
        return this.f9344d;
    }

    @NonNull
    public static b c() {
        return new b();
    }

    @Override // com.orhanobut.logger.f
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        o.a(str2);
        String b5 = b(str);
        this.f9341a.setTime(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(this.f9341a.getTime()));
        sb.append(f9340g);
        sb.append(this.f9342b.format(this.f9341a));
        sb.append(f9340g);
        sb.append(o.e(i5));
        sb.append(f9340g);
        sb.append(b5);
        String str3 = f9338e;
        if (str2.contains(str3)) {
            str2 = str2.replaceAll(str3, f9339f);
        }
        sb.append(f9340g);
        sb.append(str2);
        sb.append(str3);
        this.f9343c.a(i5, b5, sb.toString());
    }

    private c(@NonNull b bVar) {
        o.a(bVar);
        this.f9341a = bVar.f9346a;
        this.f9342b = bVar.f9347b;
        this.f9343c = bVar.f9348c;
        this.f9344d = bVar.f9349d;
    }
}
