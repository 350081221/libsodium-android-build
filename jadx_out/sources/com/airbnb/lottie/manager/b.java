package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.d;
import com.airbnb.lottie.utils.f;
import com.airbnb.lottie.utils.l;
import com.airbnb.lottie.y0;
import com.android.multidex.ClassPathElement;
import com.huawei.agconnect.apms.instrument.BitmapFactoryInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import java.io.IOException;
import java.util.Map;

@Instrumented
/* loaded from: classes2.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f1357e = new Object();

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Context f1358a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1359b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private d f1360c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, y0> f1361d;

    public b(Drawable.Callback callback, String str, d dVar, Map<String, y0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f1359b = str + ClassPathElement.SEPARATOR_CHAR;
        } else {
            this.f1359b = str;
        }
        this.f1361d = map;
        e(dVar);
        if (!(callback instanceof View)) {
            this.f1358a = null;
        } else {
            this.f1358a = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap d(String str, @Nullable Bitmap bitmap) {
        synchronized (f1357e) {
            this.f1361d.get(str).i(bitmap);
        }
        return bitmap;
    }

    @Nullable
    public Bitmap a(String str) {
        y0 y0Var = this.f1361d.get(str);
        if (y0Var == null) {
            return null;
        }
        Bitmap b5 = y0Var.b();
        if (b5 != null) {
            return b5;
        }
        d dVar = this.f1360c;
        if (dVar != null) {
            Bitmap a5 = dVar.a(y0Var);
            if (a5 != null) {
                d(str, a5);
            }
            return a5;
        }
        Context context = this.f1358a;
        if (context == null) {
            return null;
        }
        String d5 = y0Var.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (d5.startsWith("data:") && d5.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(d5.substring(d5.indexOf(44) + 1), 0);
                return d(str, BitmapFactoryInstrumentation.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e5) {
                f.f("data URL did not have correct base64 format.", e5);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f1359b)) {
                try {
                    Bitmap decodeStream = BitmapFactoryInstrumentation.decodeStream(context.getAssets().open(this.f1359b + d5), null, options);
                    if (decodeStream == null) {
                        f.e("Decoded image `" + str + "` is null.");
                        return null;
                    }
                    return d(str, l.m(decodeStream, y0Var.g(), y0Var.e()));
                } catch (IllegalArgumentException e6) {
                    f.f("Unable to decode image `" + str + "`.", e6);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e7) {
            f.f("Unable to open asset.", e7);
            return null;
        }
    }

    @Nullable
    public y0 b(String str) {
        return this.f1361d.get(str);
    }

    public boolean c(Context context) {
        if (this.f1358a instanceof Application) {
            context = context.getApplicationContext();
        }
        if (context == this.f1358a) {
            return true;
        }
        return false;
    }

    public void e(@Nullable d dVar) {
        this.f1360c = dVar;
    }

    @Nullable
    public Bitmap f(String str, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            y0 y0Var = this.f1361d.get(str);
            Bitmap b5 = y0Var.b();
            y0Var.i(null);
            return b5;
        }
        Bitmap b6 = this.f1361d.get(str).b();
        d(str, bitmap);
        return b6;
    }
}
