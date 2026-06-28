package org.osmdroid.views.drawing;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import org.osmdroid.util.PointL;
import org.osmdroid.views.Projection;

@Deprecated
/* loaded from: classes4.dex */
public class c extends BitmapShader {

    /* renamed from: d, reason: collision with root package name */
    private static final PointL f21861d = new PointL();

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f21862a;

    /* renamed from: b, reason: collision with root package name */
    private int f21863b;

    /* renamed from: c, reason: collision with root package name */
    private int f21864c;

    public c(Bitmap bitmap, Shader.TileMode tileMode, Shader.TileMode tileMode2) {
        super(bitmap, tileMode, tileMode2);
        this.f21862a = new Matrix();
        this.f21863b = bitmap.getWidth();
        this.f21864c = bitmap.getHeight();
    }

    public void a(Projection projection) {
        PointL pointL = f21861d;
        projection.toMercatorPixels(0, 0, pointL);
        this.f21862a.setTranslate((float) ((-pointL.f21839x) % this.f21863b), (float) ((-pointL.f21840y) % this.f21864c));
        setLocalMatrix(this.f21862a);
    }
}
