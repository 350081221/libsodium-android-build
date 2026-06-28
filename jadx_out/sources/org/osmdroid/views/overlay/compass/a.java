package org.osmdroid.views.overlay.compass;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import androidx.core.view.ViewCompat;
import com.android.dx.io.Opcodes;
import org.osmdroid.library.R;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.IOverlayMenuProvider;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes4.dex */
public class a extends Overlay implements IOverlayMenuProvider, b {

    /* renamed from: z, reason: collision with root package name */
    public static final int f21894z = Overlay.getSafeMenuId();

    /* renamed from: a, reason: collision with root package name */
    private Paint f21895a;

    /* renamed from: b, reason: collision with root package name */
    protected MapView f21896b;

    /* renamed from: c, reason: collision with root package name */
    private final Display f21897c;

    /* renamed from: d, reason: collision with root package name */
    public c f21898d;

    /* renamed from: e, reason: collision with root package name */
    protected Bitmap f21899e;

    /* renamed from: f, reason: collision with root package name */
    protected Bitmap f21900f;

    /* renamed from: g, reason: collision with root package name */
    private final Matrix f21901g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21902h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21903i;

    /* renamed from: j, reason: collision with root package name */
    private int f21904j;

    /* renamed from: k, reason: collision with root package name */
    private float f21905k;

    /* renamed from: l, reason: collision with root package name */
    private float f21906l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21907m;

    /* renamed from: n, reason: collision with root package name */
    private float f21908n;

    /* renamed from: o, reason: collision with root package name */
    private float f21909o;

    /* renamed from: p, reason: collision with root package name */
    private final float f21910p;

    /* renamed from: q, reason: collision with root package name */
    protected final float f21911q;

    /* renamed from: r, reason: collision with root package name */
    protected final float f21912r;

    /* renamed from: s, reason: collision with root package name */
    protected final float f21913s;

    /* renamed from: t, reason: collision with root package name */
    protected final float f21914t;

    /* renamed from: u, reason: collision with root package name */
    protected long f21915u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21916v;

    /* renamed from: w, reason: collision with root package name */
    protected final float f21917w;

    /* renamed from: x, reason: collision with root package name */
    private int f21918x;

    /* renamed from: y, reason: collision with root package name */
    private float f21919y;

    public a(Context context, MapView mapView) {
        this(context, new d(context), mapView);
    }

    private Point c(float f5, float f6, float f7, float f8) {
        double radians = Math.toRadians((-f8) + 90.0f);
        double d5 = f7;
        return new Point(((int) f5) + ((int) (Math.cos(radians) * d5)), ((int) f6) - ((int) (d5 * Math.sin(radians))));
    }

    private void d() {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(200);
        Paint paint2 = new Paint();
        paint2.setColor(-7829368);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(2.0f);
        paint2.setAlpha(200);
        int i5 = (int) (this.f21917w * 50.0f);
        int i6 = i5 / 2;
        Bitmap bitmap = this.f21899e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f21899e = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21899e);
        float f5 = i6;
        canvas.drawCircle(f5, f5, this.f21917w * 20.0f, paint);
        canvas.drawCircle(f5, f5, this.f21917w * 20.0f, paint2);
        i(canvas, f5, f5, this.f21917w * 20.0f, 0.0f, paint2);
        i(canvas, f5, f5, this.f21917w * 20.0f, 90.0f, paint2);
        i(canvas, f5, f5, this.f21917w * 20.0f, 180.0f, paint2);
        i(canvas, f5, f5, this.f21917w * 20.0f, 270.0f, paint2);
    }

    private void e() {
        Paint paint = new Paint();
        paint.setColor(-6291456);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(Opcodes.REM_INT_LIT8);
        Paint paint2 = new Paint();
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(Opcodes.REM_INT_LIT8);
        Paint paint3 = new Paint();
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(Opcodes.REM_INT_LIT8);
        int i5 = (int) (this.f21917w * 50.0f);
        int i6 = i5 / 2;
        Bitmap bitmap = this.f21900f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f21900f = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21900f);
        Path path = new Path();
        float f5 = i6;
        path.moveTo(f5, f5 - (this.f21917w * 17.0f));
        path.lineTo((this.f21917w * 4.0f) + f5, f5);
        path.lineTo(f5 - (this.f21917w * 4.0f), f5);
        path.lineTo(f5, f5 - (this.f21917w * 17.0f));
        path.close();
        canvas.drawPath(path, paint);
        Path path2 = new Path();
        path2.moveTo(f5, (this.f21917w * 17.0f) + f5);
        path2.lineTo((this.f21917w * 4.0f) + f5, f5);
        path2.lineTo(f5 - (this.f21917w * 4.0f), f5);
        path2.lineTo(f5, (this.f21917w * 17.0f) + f5);
        path2.close();
        canvas.drawPath(path2, paint2);
        canvas.drawCircle(f5, f5, 2.0f, paint3);
    }

    private void f() {
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(Opcodes.REM_INT_LIT8);
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(Opcodes.REM_INT_LIT8);
        int i5 = (int) (this.f21917w * 50.0f);
        int i6 = i5 / 2;
        Bitmap bitmap = this.f21900f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f21900f = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f21900f);
        Path path = new Path();
        float f5 = i6;
        path.moveTo(f5, f5 - (this.f21917w * 17.0f));
        float f6 = this.f21917w;
        path.lineTo((f6 * 4.0f) + f5, (f6 * 17.0f) + f5);
        path.lineTo(f5, (this.f21917w * 8.5f) + f5);
        float f7 = this.f21917w;
        path.lineTo(f5 - (4.0f * f7), (f7 * 17.0f) + f5);
        path.lineTo(f5, f5 - (this.f21917w * 17.0f));
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawCircle(f5, f5, 2.0f, paint2);
    }

    private void i(Canvas canvas, float f5, float f6, float f7, float f8, Paint paint) {
        canvas.save();
        Point c5 = c(f5, f6, f7, f8);
        canvas.rotate(f8, c5.x, c5.y);
        Path path = new Path();
        path.moveTo(c5.x - (this.f21917w * 2.0f), c5.y);
        path.lineTo(c5.x + (this.f21917w * 2.0f), c5.y);
        path.lineTo(c5.x, c5.y - (this.f21917w * 5.0f));
        path.close();
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    private int m() {
        int rotation = this.f21897c.getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    private void p() {
        int ceil;
        int ceil2;
        int ceil3;
        int ceil4;
        if (this.f21915u + this.f21918x > System.currentTimeMillis()) {
            return;
        }
        this.f21915u = System.currentTimeMillis();
        Rect screenRect = this.f21896b.getProjection().getScreenRect();
        if (this.f21907m) {
            ceil = screenRect.left + ((int) Math.ceil(screenRect.exactCenterX() - this.f21911q));
            ceil2 = screenRect.top + ((int) Math.ceil(screenRect.exactCenterY() - this.f21912r));
            ceil3 = screenRect.left + ((int) Math.ceil(screenRect.exactCenterX() + this.f21911q));
            ceil4 = screenRect.top + ((int) Math.ceil(screenRect.exactCenterY() + this.f21912r));
        } else {
            ceil = screenRect.left + ((int) Math.ceil((this.f21908n * this.f21917w) - this.f21911q));
            ceil2 = screenRect.top + ((int) Math.ceil((this.f21909o * this.f21917w) - this.f21912r));
            ceil3 = screenRect.left + ((int) Math.ceil((this.f21908n * this.f21917w) + this.f21911q));
            ceil4 = ((int) Math.ceil((this.f21909o * this.f21917w) + this.f21912r)) + screenRect.top;
        }
        this.f21896b.postInvalidateMapCoordinates(ceil - 2, ceil2 - 2, ceil3 + 2, ceil4 + 2);
    }

    @Override // org.osmdroid.views.overlay.compass.b
    public void a(float f5, c cVar) {
        if (Float.isNaN(this.f21905k) || Math.abs(this.f21905k - f5) >= this.f21919y) {
            this.f21905k = f5;
            p();
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (q() && !Float.isNaN(this.f21905k)) {
            h(canvas, this.f21904j * (this.f21905k + this.f21906l + m()), projection.getScreenRect());
        }
    }

    public void g() {
        this.f21902h = false;
        c cVar = this.f21898d;
        if (cVar != null) {
            cVar.a();
        }
        this.f21905k = Float.NaN;
        if (this.f21896b != null) {
            p();
        }
    }

    protected void h(Canvas canvas, float f5, Rect rect) {
        float f6;
        float f7;
        Projection projection = this.f21896b.getProjection();
        if (this.f21907m) {
            Rect screenRect = projection.getScreenRect();
            f6 = screenRect.exactCenterX();
            f7 = screenRect.exactCenterY();
        } else {
            float f8 = this.f21908n;
            float f9 = this.f21917w;
            float f10 = f8 * f9;
            float f11 = f9 * this.f21909o;
            f6 = f10;
            f7 = f11;
        }
        this.f21901g.setTranslate(-this.f21911q, -this.f21912r);
        this.f21901g.postTranslate(f6, f7);
        projection.save(canvas, false, true);
        canvas.concat(this.f21901g);
        canvas.drawBitmap(this.f21899e, 0.0f, 0.0f, this.f21895a);
        projection.restore(canvas, true);
        this.f21901g.setRotate(-f5, this.f21913s, this.f21914t);
        this.f21901g.postTranslate(-this.f21913s, -this.f21914t);
        this.f21901g.postTranslate(f6, f7);
        projection.save(canvas, false, true);
        canvas.concat(this.f21901g);
        canvas.drawBitmap(this.f21900f, 0.0f, 0.0f, this.f21895a);
        projection.restore(canvas, true);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return this.f21916v;
    }

    public boolean j() {
        return k(this.f21898d);
    }

    public boolean k(c cVar) {
        y(cVar);
        boolean b5 = this.f21898d.b(this);
        this.f21902h = b5;
        if (this.f21896b != null) {
            p();
        }
        return b5;
    }

    public float l() {
        return this.f21906l;
    }

    public float n() {
        return this.f21905k;
    }

    public c o() {
        return this.f21898d;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView) {
        menu.add(0, f21894z + i5, 0, mapView.getContext().getResources().getString(R.string.f21705p)).setIcon(mapView.getContext().getResources().getDrawable(R.drawable.f21662d)).setCheckable(true);
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.f21896b = null;
        this.f21895a = null;
        g();
        this.f21898d = null;
        this.f21899e.recycle();
        this.f21900f.recycle();
        super.onDetach(mapView);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView) {
        if (menuItem.getItemId() - i5 == f21894z) {
            if (q()) {
                g();
                return true;
            }
            j();
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onPause() {
        this.f21903i = this.f21902h;
        c cVar = this.f21898d;
        if (cVar != null) {
            cVar.a();
        }
        super.onPause();
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView) {
        menu.findItem(f21894z + i5).setChecked(q());
        return false;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onResume() {
        super.onResume();
        if (this.f21903i) {
            j();
        }
    }

    public boolean q() {
        return this.f21902h;
    }

    public boolean r() {
        return this.f21907m;
    }

    public boolean s() {
        return this.f21904j < 0;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z4) {
        this.f21916v = z4;
    }

    public void t(float f5) {
        this.f21906l = f5;
    }

    public void u(float f5) {
        this.f21919y = f5;
    }

    public void v(float f5, float f6) {
        this.f21908n = f5;
        this.f21909o = f6;
    }

    public void w(boolean z4) {
        this.f21907m = z4;
    }

    public void x(int i5) {
        this.f21918x = i5;
    }

    public void y(c cVar) throws RuntimeException {
        if (cVar != null) {
            if (q()) {
                this.f21898d.a();
            }
            this.f21898d = cVar;
            return;
        }
        throw new RuntimeException("You must pass an IOrientationProvider to setOrientationProvider()");
    }

    public void z(boolean z4) {
        if (z4) {
            this.f21904j = -1;
            f();
        } else {
            this.f21904j = 1;
            e();
        }
    }

    public a(Context context, c cVar, MapView mapView) {
        this.f21895a = new Paint(2);
        this.f21901g = new Matrix();
        this.f21903i = false;
        this.f21904j = 1;
        this.f21905k = Float.NaN;
        this.f21906l = 0.0f;
        this.f21907m = false;
        this.f21908n = 35.0f;
        this.f21909o = 35.0f;
        this.f21910p = 20.0f;
        this.f21915u = 0L;
        this.f21916v = true;
        this.f21918x = 500;
        this.f21919y = 0.0f;
        this.f21917w = context.getResources().getDisplayMetrics().density;
        this.f21896b = mapView;
        this.f21897c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        d();
        if (this.f21904j > 0) {
            e();
        } else {
            f();
        }
        this.f21911q = (this.f21899e.getWidth() / 2.0f) - 0.5f;
        this.f21912r = (this.f21899e.getHeight() / 2.0f) - 0.5f;
        this.f21913s = (this.f21900f.getWidth() / 2.0f) - 0.5f;
        this.f21914t = (this.f21900f.getHeight() / 2.0f) - 0.5f;
        y(cVar);
    }
}
