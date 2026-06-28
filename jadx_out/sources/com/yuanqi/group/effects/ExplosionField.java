package com.yuanqi.group.effects;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yuanqi.group.App;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes3.dex */
public class ExplosionField extends View {

    /* renamed from: c, reason: collision with root package name */
    private static final Canvas f13765c = new Canvas();

    /* renamed from: a, reason: collision with root package name */
    private List<com.yuanqi.group.effects.a> f13766a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f13767b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExplosionField.this.f13766a.remove(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        Random f13769a = new Random();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13770b;

        b(View view) {
            this.f13770b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f13770b.setTranslationX((this.f13769a.nextFloat() - 0.5f) * this.f13770b.getWidth() * 0.05f);
            this.f13770b.setTranslationY((this.f13769a.nextFloat() - 0.5f) * this.f13770b.getHeight() * 0.05f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f13772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13773b;

        c(d dVar, View view) {
            this.f13772a = dVar;
            this.f13773b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = this.f13772a;
            if (dVar != null) {
                dVar.a(this.f13773b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(View view);
    }

    public ExplosionField(Context context) {
        super(context);
        this.f13766a = new ArrayList();
        this.f13767b = new int[2];
        k();
    }

    public static ExplosionField b(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        ExplosionField explosionField = new ExplosionField(activity);
        viewGroup.addView(explosionField, new ViewGroup.LayoutParams(-1, -1));
        return explosionField;
    }

    public static ExplosionField c(ViewGroup viewGroup, Activity activity) {
        ExplosionField explosionField = new ExplosionField(activity);
        viewGroup.addView(explosionField, new ViewGroup.LayoutParams(-1, -1));
        return explosionField;
    }

    public static Bitmap e(View view) {
        Drawable drawable;
        if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        view.clearFocus();
        Bitmap f5 = f(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888, 1);
        if (f5 != null) {
            Canvas canvas = f13765c;
            synchronized (canvas) {
                canvas.setBitmap(f5);
                view.draw(canvas);
                canvas.setBitmap(null);
            }
        }
        return f5;
    }

    public static Bitmap f(int i5, int i6, Bitmap.Config config, int i7) {
        try {
            return Bitmap.createBitmap(i5, i6, config);
        } catch (OutOfMemoryError e5) {
            e5.printStackTrace();
            if (i7 > 0) {
                System.gc();
                return f(i5, i6, config, i7 - 1);
            }
            return null;
        }
    }

    private void k() {
        Arrays.fill(this.f13767b, com.yuanqi.group.abs.ui.b.b(App.f13716d.a(), 32));
    }

    public void d() {
        this.f13766a.clear();
        invalidate();
    }

    public void g(int i5, int i6) {
        int[] iArr = this.f13767b;
        iArr[0] = i5;
        iArr[1] = i6;
    }

    public void h(Bitmap bitmap, Rect rect, long j5, long j6) {
        com.yuanqi.group.effects.a aVar = new com.yuanqi.group.effects.a(this, bitmap, rect);
        aVar.addListener(new a());
        aVar.setStartDelay(j5);
        aVar.setDuration(j6);
        this.f13766a.add(aVar);
        aVar.start();
    }

    public void i(View view) {
        j(view, null);
    }

    public void j(View view, d dVar) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        rect.offset(-iArr[0], -iArr[1]);
        int[] iArr2 = this.f13767b;
        rect.inset(-iArr2[0], -iArr2[1]);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new b(view));
        duration.addListener(new c(dVar, view));
        duration.start();
        long j5 = 100;
        view.animate().setDuration(150L).setStartDelay(j5).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).start();
        h(e(view), rect, j5, com.yuanqi.group.effects.a.f13781k);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<com.yuanqi.group.effects.a> it = this.f13766a.iterator();
        while (it.hasNext()) {
            it.next().b(canvas);
        }
    }

    public ExplosionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13766a = new ArrayList();
        this.f13767b = new int[2];
        k();
    }

    public ExplosionField(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13766a = new ArrayList();
        this.f13767b = new int[2];
        k();
    }
}
