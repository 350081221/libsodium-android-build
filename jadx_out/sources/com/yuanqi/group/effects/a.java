package com.yuanqi.group.effects;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import com.android.dx.io.Opcodes;
import com.yuanqi.group.App;
import java.util.Random;

/* loaded from: classes3.dex */
public class a extends ValueAnimator {

    /* renamed from: e, reason: collision with root package name */
    private static final Interpolator f13775e = new AccelerateInterpolator(0.6f);

    /* renamed from: f, reason: collision with root package name */
    private static final float f13776f = 1.4f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f13777g;

    /* renamed from: h, reason: collision with root package name */
    private static final float f13778h;

    /* renamed from: i, reason: collision with root package name */
    private static final float f13779i;

    /* renamed from: j, reason: collision with root package name */
    private static final float f13780j;

    /* renamed from: k, reason: collision with root package name */
    static long f13781k;

    /* renamed from: a, reason: collision with root package name */
    private Paint f13782a = new Paint();

    /* renamed from: b, reason: collision with root package name */
    private b[] f13783b = new b[Opcodes.SHR_INT_LIT8];

    /* renamed from: c, reason: collision with root package name */
    private Rect f13784c;

    /* renamed from: d, reason: collision with root package name */
    private View f13785d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        float f13786a;

        /* renamed from: b, reason: collision with root package name */
        int f13787b;

        /* renamed from: c, reason: collision with root package name */
        float f13788c;

        /* renamed from: d, reason: collision with root package name */
        float f13789d;

        /* renamed from: e, reason: collision with root package name */
        float f13790e;

        /* renamed from: f, reason: collision with root package name */
        float f13791f;

        /* renamed from: g, reason: collision with root package name */
        float f13792g;

        /* renamed from: h, reason: collision with root package name */
        float f13793h;

        /* renamed from: i, reason: collision with root package name */
        float f13794i;

        /* renamed from: j, reason: collision with root package name */
        float f13795j;

        /* renamed from: k, reason: collision with root package name */
        float f13796k;

        /* renamed from: l, reason: collision with root package name */
        float f13797l;

        /* renamed from: m, reason: collision with root package name */
        float f13798m;

        /* renamed from: n, reason: collision with root package name */
        float f13799n;

        private b() {
        }

        public void a(float f5) {
            float f6 = f5 / a.f13776f;
            float f7 = this.f13798m;
            float f8 = 0.0f;
            if (f6 >= f7) {
                float f9 = this.f13799n;
                if (f6 <= 1.0f - f9) {
                    float f10 = (f6 - f7) / ((1.0f - f7) - f9);
                    float f11 = a.f13776f * f10;
                    if (f10 >= 0.7f) {
                        f8 = (f10 - 0.7f) / 0.3f;
                    }
                    this.f13786a = 1.0f - f8;
                    float f12 = this.f13795j * f11;
                    this.f13788c = this.f13791f + f12;
                    this.f13789d = ((float) (this.f13792g - (this.f13797l * Math.pow(f12, 2.0d)))) - (f12 * this.f13796k);
                    this.f13790e = a.f13779i + ((this.f13793h - a.f13779i) * f11);
                    return;
                }
            }
            this.f13786a = 0.0f;
        }
    }

    static {
        App.a aVar = App.f13716d;
        f13777g = com.yuanqi.group.abs.ui.b.b(aVar.a(), 5);
        f13778h = com.yuanqi.group.abs.ui.b.b(aVar.a(), 20);
        f13779i = com.yuanqi.group.abs.ui.b.b(aVar.a(), 2);
        f13780j = com.yuanqi.group.abs.ui.b.b(aVar.a(), 1);
        f13781k = 1104L;
    }

    public a(View view, Bitmap bitmap, Rect rect) {
        this.f13784c = new Rect(rect);
        Random random = new Random(System.currentTimeMillis());
        int width = bitmap.getWidth() / 17;
        int height = bitmap.getHeight() / 17;
        for (int i5 = 0; i5 < 15; i5++) {
            int i6 = 0;
            while (i6 < 15) {
                int i7 = (i5 * 15) + i6;
                i6++;
                this.f13783b[i7] = c(bitmap.getPixel(i6 * width, (i5 + 1) * height), random);
            }
        }
        this.f13785d = view;
        setFloatValues(0.0f, f13776f);
        setInterpolator(f13775e);
        setDuration(f13781k);
    }

    private b c(int i5, Random random) {
        float f5;
        b bVar = new b();
        bVar.f13787b = i5;
        float f6 = f13779i;
        bVar.f13790e = f6;
        if (random.nextFloat() < 0.2f) {
            bVar.f13793h = f6 + ((f13777g - f6) * random.nextFloat());
        } else {
            float f7 = f13780j;
            bVar.f13793h = f7 + ((f6 - f7) * random.nextFloat());
        }
        float nextFloat = random.nextFloat();
        float height = this.f13784c.height() * ((random.nextFloat() * 0.18f) + 0.2f);
        bVar.f13794i = height;
        if (nextFloat >= 0.2f) {
            height += 0.2f * height * random.nextFloat();
        }
        bVar.f13794i = height;
        float height2 = this.f13784c.height() * (random.nextFloat() - 0.5f) * 1.8f;
        bVar.f13795j = height2;
        if (nextFloat >= 0.2f) {
            if (nextFloat < 0.8f) {
                f5 = 0.6f;
            } else {
                f5 = 0.3f;
            }
            height2 *= f5;
        }
        bVar.f13795j = height2;
        float f8 = (bVar.f13794i * 4.0f) / height2;
        bVar.f13796k = f8;
        bVar.f13797l = (-f8) / height2;
        float centerX = this.f13784c.centerX();
        float f9 = f13778h;
        float nextFloat2 = centerX + ((random.nextFloat() - 0.5f) * f9);
        bVar.f13791f = nextFloat2;
        bVar.f13788c = nextFloat2;
        float centerY = this.f13784c.centerY() + (f9 * (random.nextFloat() - 0.5f));
        bVar.f13792g = centerY;
        bVar.f13789d = centerY;
        bVar.f13798m = random.nextFloat() * 0.14f;
        bVar.f13799n = random.nextFloat() * 0.4f;
        bVar.f13786a = 1.0f;
        return bVar;
    }

    public boolean b(Canvas canvas) {
        if (!isStarted()) {
            return false;
        }
        for (b bVar : this.f13783b) {
            bVar.a(((Float) getAnimatedValue()).floatValue());
            if (bVar.f13786a > 0.0f) {
                this.f13782a.setColor(bVar.f13787b);
                this.f13782a.setAlpha((int) (Color.alpha(bVar.f13787b) * bVar.f13786a));
                canvas.drawCircle(bVar.f13788c, bVar.f13789d, bVar.f13790e, this.f13782a);
            }
        }
        this.f13785d.invalidate();
        return true;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        super.start();
        this.f13785d.invalidate(this.f13784c);
    }
}
