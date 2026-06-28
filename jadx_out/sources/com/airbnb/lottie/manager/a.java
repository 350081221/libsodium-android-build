package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.i;
import com.airbnb.lottie.utils.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private final AssetManager f1354d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.c f1355e;

    /* renamed from: a, reason: collision with root package name */
    private final i<String> f1351a = new i<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<i<String>, Typeface> f1352b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Typeface> f1353c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private String f1356f = ".ttf";

    public a(Drawable.Callback callback, @Nullable com.airbnb.lottie.c cVar) {
        this.f1355e = cVar;
        if (!(callback instanceof View)) {
            f.e("LottieDrawable must be inside of a view for images to work.");
            this.f1354d = null;
        } else {
            this.f1354d = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface a(com.airbnb.lottie.model.c cVar) {
        Typeface typeface;
        String b5 = cVar.b();
        Typeface typeface2 = this.f1353c.get(b5);
        if (typeface2 != null) {
            return typeface2;
        }
        String d5 = cVar.d();
        String c5 = cVar.c();
        com.airbnb.lottie.c cVar2 = this.f1355e;
        if (cVar2 != null) {
            typeface = cVar2.b(b5, d5, c5);
            if (typeface == null) {
                typeface = this.f1355e.a(b5);
            }
        } else {
            typeface = null;
        }
        com.airbnb.lottie.c cVar3 = this.f1355e;
        if (cVar3 != null && typeface == null) {
            String d6 = cVar3.d(b5, d5, c5);
            if (d6 == null) {
                d6 = this.f1355e.c(b5);
            }
            if (d6 != null) {
                typeface = Typeface.createFromAsset(this.f1354d, d6);
            }
        }
        if (cVar.e() != null) {
            return cVar.e();
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f1354d, "fonts/" + b5 + this.f1356f);
        }
        this.f1353c.put(b5, typeface);
        return typeface;
    }

    private Typeface e(Typeface typeface, String str) {
        int i5;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i5 = 3;
        } else if (contains) {
            i5 = 2;
        } else if (contains2) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (typeface.getStyle() == i5) {
            return typeface;
        }
        return Typeface.create(typeface, i5);
    }

    public Typeface b(com.airbnb.lottie.model.c cVar) {
        this.f1351a.b(cVar.b(), cVar.d());
        Typeface typeface = this.f1352b.get(this.f1351a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e5 = e(a(cVar), cVar.d());
        this.f1352b.put(this.f1351a, e5);
        return e5;
    }

    public void c(String str) {
        this.f1356f = str;
    }

    public void d(@Nullable com.airbnb.lottie.c cVar) {
        this.f1355e = cVar;
    }
}
