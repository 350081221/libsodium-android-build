package com.lzf.easyfloat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.interfaces.h;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.apache.http.cookie.ClientCookie;
import p4.l;
import p4.m;
import socket.g;
import u3.i;

@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/lzf/easyfloat/widget/DefaultAddView;", "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "Lkotlin/r2;", "b", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "c", "", "w", bi.aJ, "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/lzf/easyfloat/interfaces/h;", "listener", "setTouchRangeListener", "Landroid/graphics/Paint;", bi.ay, "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "Landroid/graphics/Path;", ClientCookie.PATH_ATTR, "", "F", "width", "d", "height", "Landroid/graphics/Region;", "e", "Landroid/graphics/Region;", "region", "f", "totalRegion", g.f22386a, "Z", "inRange", "zoomSize", "i", "Lcom/lzf/easyfloat/interfaces/h;", "Landroid/content/Context;", d.X, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class DefaultAddView extends BaseSwitchView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f9297a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private Path f9298b;

    /* renamed from: c, reason: collision with root package name */
    private float f9299c;

    /* renamed from: d, reason: collision with root package name */
    private float f9300d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private Region f9301e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final Region f9302f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9303g;

    /* renamed from: h, reason: collision with root package name */
    private float f9304h;

    /* renamed from: i, reason: collision with root package name */
    @m
    private h f9305i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultAddView(@l Context context) {
        this(context, null, 0, 6, null);
        l0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultAddView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l0.p(context, "context");
    }

    public /* synthetic */ DefaultAddView(Context context, AttributeSet attributeSet, int i5, int i6, w wVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i5);
    }

    private final void b() {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AA000000"));
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        r2 r2Var = r2.f19517a;
        this.f9297a = paint;
    }

    private final boolean c(MotionEvent motionEvent) {
        h hVar;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean contains = this.f9301e.contains(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        if (contains != this.f9303g) {
            this.f9303g = contains;
            invalidate();
        }
        h hVar2 = this.f9305i;
        if (hVar2 != null) {
            hVar2.b(contains, this);
        }
        if (motionEvent.getAction() == 1 && contains && (hVar = this.f9305i) != null) {
            hVar.a();
        }
        return contains;
    }

    @Override // com.lzf.easyfloat.widget.BaseSwitchView
    public void a() {
    }

    @Override // android.view.View
    protected void onDraw(@m Canvas canvas) {
        this.f9298b.reset();
        if (this.f9303g) {
            Path path = this.f9298b;
            float f5 = this.f9299c;
            float f6 = this.f9300d;
            path.addCircle(f5, f6, Math.min(f5, f6), Path.Direction.CW);
        } else {
            Path path2 = this.f9298b;
            float f7 = this.f9299c;
            float f8 = this.f9300d;
            path2.addCircle(f7, f8, Math.min(f7, f8) - this.f9304h, Path.Direction.CW);
            Region region = this.f9302f;
            float f9 = this.f9304h;
            region.set((int) f9, (int) f9, (int) this.f9299c, (int) this.f9300d);
            this.f9301e.setPath(this.f9298b, this.f9302f);
        }
        if (canvas != null) {
            Path path3 = this.f9298b;
            Paint paint = this.f9297a;
            if (paint == null) {
                l0.S("paint");
                paint = null;
            }
            canvas.drawPath(path3, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f9299c = i5;
        this.f9300d = i6;
    }

    @Override // com.lzf.easyfloat.widget.BaseSwitchView
    public void setTouchRangeListener(@l MotionEvent event, @m h hVar) {
        l0.p(event, "event");
        this.f9305i = hVar;
        c(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultAddView(@l Context context, @m AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        l0.p(context, "context");
        this.f9298b = new Path();
        this.f9301e = new Region();
        this.f9302f = new Region();
        this.f9304h = 18.0f;
        b();
        setWillNotDraw(false);
    }
}
