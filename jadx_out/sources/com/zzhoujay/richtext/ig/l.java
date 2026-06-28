package com.zzhoujay.richtext.ig;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
class l implements e3.m {

    /* renamed from: a, reason: collision with root package name */
    private final com.zzhoujay.richtext.drawable.d f15848a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f15849b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15850c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15851d;

    private l(com.zzhoujay.richtext.drawable.d dVar, Bitmap bitmap) {
        this.f15848a = dVar;
        this.f15849b = bitmap;
        if (dVar == null) {
            if (bitmap != null) {
                this.f15850c = bitmap.getHeight();
                this.f15851d = bitmap.getWidth();
                return;
            }
            throw new f3.j();
        }
        if (bitmap == null) {
            this.f15850c = dVar.d();
            this.f15851d = dVar.e();
            return;
        }
        throw new f3.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(Bitmap bitmap) {
        return new l(null, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l d(com.zzhoujay.richtext.drawable.d dVar) {
        return new l(dVar, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap g() {
        return this.f15849b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.zzhoujay.richtext.drawable.d h() {
        return this.f15848a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable i(Resources resources) {
        com.zzhoujay.richtext.drawable.d dVar = this.f15848a;
        if (dVar == null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, this.f15849b);
            bitmapDrawable.setBounds(0, 0, this.f15849b.getWidth(), this.f15849b.getHeight());
            return bitmapDrawable;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f15850c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f15851d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f15848a != null;
    }

    @Override // e3.m
    public void recycle() {
        com.zzhoujay.richtext.drawable.d dVar = this.f15848a;
        if (dVar != null) {
            dVar.g();
        }
    }
}
