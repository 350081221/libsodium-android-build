package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.d1;
import com.airbnb.lottie.k;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final g f1582a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final f f1583b;

    public h(@Nullable g gVar, @NonNull f fVar) {
        this.f1582a = gVar;
        this.f1583b = fVar;
    }

    @Nullable
    @WorkerThread
    private k a(Context context, @NonNull String str, @Nullable String str2) {
        g gVar;
        Pair<c, InputStream> b5;
        d1<k> B;
        if (str2 == null || (gVar = this.f1582a) == null || (b5 = gVar.b(str)) == null) {
            return null;
        }
        c cVar = (c) b5.first;
        InputStream inputStream = (InputStream) b5.second;
        if (cVar == c.ZIP) {
            B = d0.W(context, new ZipInputStream(inputStream), str2);
        } else {
            B = d0.B(inputStream, str2);
        }
        if (B.b() != null) {
            return B.b();
        }
        return null;
    }

    @NonNull
    @WorkerThread
    private d1<k> b(Context context, @NonNull String str, @Nullable String str2) {
        boolean z4;
        com.airbnb.lottie.utils.f.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a5 = this.f1583b.a(str);
                if (a5.isSuccessful()) {
                    d1<k> d5 = d(context, str, a5.E(), a5.B(), str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (d5.b() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sb.append(z4);
                    com.airbnb.lottie.utils.f.a(sb.toString());
                    try {
                        a5.close();
                    } catch (IOException e5) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e5);
                    }
                    return d5;
                }
                d1<k> d1Var = new d1<>(new IllegalArgumentException(a5.e()));
                try {
                    a5.close();
                } catch (IOException e6) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e6);
                }
                return d1Var;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e7) {
                        com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e7);
                    }
                }
                throw th;
            }
        } catch (Exception e8) {
            d1<k> d1Var2 = new d1<>(e8);
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e9) {
                    com.airbnb.lottie.utils.f.f("LottieFetchResult close failed ", e9);
                }
            }
            return d1Var2;
        }
    }

    @NonNull
    private d1<k> d(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        d1<k> f5;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.f.a("Received json response.");
            cVar = c.JSON;
            f5 = e(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.f.a("Handling zip response.");
            c cVar2 = c.ZIP;
            f5 = f(context, str, inputStream, str3);
            cVar = cVar2;
        }
        if (str3 != null && f5.b() != null && (gVar = this.f1582a) != null) {
            gVar.g(str, cVar);
        }
        return f5;
    }

    @NonNull
    private d1<k> e(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        g gVar;
        if (str2 != null && (gVar = this.f1582a) != null) {
            return d0.B(new FileInputStream(gVar.h(str, inputStream, c.JSON).getAbsolutePath()), str);
        }
        return d0.B(inputStream, null);
    }

    @NonNull
    private d1<k> f(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2) throws IOException {
        g gVar;
        if (str2 != null && (gVar = this.f1582a) != null) {
            return d0.W(context, new ZipInputStream(new FileInputStream(gVar.h(str, inputStream, c.ZIP))), str);
        }
        return d0.W(context, new ZipInputStream(inputStream), null);
    }

    @NonNull
    @WorkerThread
    public d1<k> c(Context context, @NonNull String str, @Nullable String str2) {
        k a5 = a(context, str, str2);
        if (a5 != null) {
            return new d1<>(a5);
        }
        com.airbnb.lottie.utils.f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
