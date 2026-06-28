package com.lzf.easyfloat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.lzf.easyfloat.R;
import com.lzf.easyfloat.interfaces.h;
import com.lzf.easyfloat.utils.b;
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

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010;\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006>"}, d2 = {"Lcom/lzf/easyfloat/widget/DefaultCloseView;", "Lcom/lzf/easyfloat/widget/BaseSwitchView;", "Landroid/util/AttributeSet;", "attrs", "Lkotlin/r2;", "b", "c", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "d", "", "w", bi.aJ, "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Lcom/lzf/easyfloat/interfaces/h;", "listener", "setTouchRangeListener", bi.ay, "I", "normalColor", "inRangeColor", "shapeType", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Path;", "e", "Landroid/graphics/Path;", ClientCookie.PATH_ATTR, "", "f", "F", "width", g.f22386a, "height", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Region;", "i", "Landroid/graphics/Region;", "region", "j", "totalRegion", "k", "Z", "inRange", "l", "zoomSize", "m", "Lcom/lzf/easyfloat/interfaces/h;", "Landroid/content/Context;", d.X, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class DefaultCloseView extends BaseSwitchView {

    /* renamed from: a, reason: collision with root package name */
    private int f9306a;

    /* renamed from: b, reason: collision with root package name */
    private int f9307b;

    /* renamed from: c, reason: collision with root package name */
    private int f9308c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f9309d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private Path f9310e;

    /* renamed from: f, reason: collision with root package name */
    private float f9311f;

    /* renamed from: g, reason: collision with root package name */
    private float f9312g;

    /* renamed from: h, reason: collision with root package name */
    @l
    private RectF f9313h;

    /* renamed from: i, reason: collision with root package name */
    @l
    private Region f9314i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private final Region f9315j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9316k;

    /* renamed from: l, reason: collision with root package name */
    private float f9317l;

    /* renamed from: m, reason: collision with root package name */
    @m
    private h f9318m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultCloseView(@l Context context) {
        this(context, null, 0, 6, null);
        l0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultCloseView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l0.p(context, "context");
    }

    public /* synthetic */ DefaultCloseView(Context context, AttributeSet attributeSet, int i5, int i6, w wVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i5);
    }

    private final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.f9199g, 0, 0);
        this.f9306a = obtainStyledAttributes.getColor(R.styleable.f9202j, this.f9306a);
        this.f9307b = obtainStyledAttributes.getColor(R.styleable.f9201i, this.f9307b);
        this.f9308c = obtainStyledAttributes.getInt(R.styleable.f9200h, this.f9308c);
        this.f9317l = obtainStyledAttributes.getDimension(R.styleable.f9203k, this.f9317l);
        obtainStyledAttributes.recycle();
    }

    private final void c() {
        Paint paint = new Paint();
        paint.setColor(this.f9306a);
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        r2 r2Var = r2.f19517a;
        this.f9309d = paint;
    }

    private final boolean d(MotionEvent motionEvent) {
        h hVar;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean contains = this.f9314i.contains(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        if (contains != this.f9316k) {
            this.f9316k = contains;
            invalidate();
        }
        h hVar2 = this.f9318m;
        if (hVar2 != null) {
            hVar2.b(contains, this);
        }
        if (motionEvent.getAction() == 1 && contains && (hVar = this.f9318m) != null) {
            hVar.a();
        }
        return contains;
    }

    @Override // com.lzf.easyfloat.widget.BaseSwitchView
    public void a() {
    }

    @Override // android.view.View
    protected void onDraw(@m Canvas canvas) {
        this.f9310e.reset();
        Paint paint = null;
        if (this.f9316k) {
            Paint paint2 = this.f9309d;
            if (paint2 == null) {
                l0.S("paint");
                paint2 = null;
            }
            paint2.setColor(this.f9307b);
            int i5 = this.f9308c;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        Path path = this.f9310e;
                        float f5 = this.f9311f / 2;
                        float f6 = this.f9312g;
                        path.addCircle(f5, f6, f6, Path.Direction.CW);
                    }
                } else {
                    this.f9313h.set(getPaddingLeft(), 0.0f, this.f9311f - getPaddingRight(), this.f9312g);
                    this.f9310e.addRect(this.f9313h, Path.Direction.CW);
                }
            } else {
                this.f9313h.set(getPaddingLeft(), 0.0f, this.f9311f - getPaddingRight(), this.f9312g * 2);
                this.f9310e.addOval(this.f9313h, Path.Direction.CW);
            }
        } else {
            Paint paint3 = this.f9309d;
            if (paint3 == null) {
                l0.S("paint");
                paint3 = null;
            }
            paint3.setColor(this.f9306a);
            int i6 = this.f9308c;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        Path path2 = this.f9310e;
                        float f7 = this.f9311f / 2;
                        float f8 = this.f9312g;
                        path2.addCircle(f7, f8, f8 - this.f9317l, Path.Direction.CW);
                        this.f9315j.set(0, (int) this.f9317l, (int) this.f9311f, (int) this.f9312g);
                    }
                } else {
                    this.f9313h.set(getPaddingLeft(), this.f9317l, this.f9311f - getPaddingRight(), this.f9312g);
                    this.f9310e.addRect(this.f9313h, Path.Direction.CW);
                    this.f9315j.set(getPaddingLeft(), (int) this.f9317l, ((int) this.f9311f) - getPaddingRight(), (int) this.f9312g);
                }
            } else {
                RectF rectF = this.f9313h;
                float paddingLeft = getPaddingLeft();
                float f9 = this.f9317l;
                float paddingRight = this.f9311f - getPaddingRight();
                float f10 = this.f9317l;
                rectF.set(paddingLeft + f9, f9, paddingRight - f10, (this.f9312g - f10) * 2);
                this.f9310e.addOval(this.f9313h, Path.Direction.CW);
                Region region = this.f9315j;
                int paddingLeft2 = getPaddingLeft();
                float f11 = this.f9317l;
                region.set(paddingLeft2 + ((int) f11), (int) f11, (int) ((this.f9311f - getPaddingRight()) - this.f9317l), (int) this.f9312g);
            }
            this.f9314i.setPath(this.f9310e, this.f9315j);
        }
        if (canvas != null) {
            Path path3 = this.f9310e;
            Paint paint4 = this.f9309d;
            if (paint4 == null) {
                l0.S("paint");
            } else {
                paint = paint4;
            }
            canvas.drawPath(path3, paint);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f9311f = i5;
        this.f9312g = i6;
    }

    @Override // com.lzf.easyfloat.widget.BaseSwitchView
    public void setTouchRangeListener(@l MotionEvent event, @m h hVar) {
        l0.p(event, "event");
        this.f9318m = hVar;
        d(event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public DefaultCloseView(@l Context context, @m AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        l0.p(context, "context");
        this.f9306a = Color.parseColor("#99000000");
        this.f9307b = Color.parseColor("#99FF0000");
        this.f9310e = new Path();
        this.f9313h = new RectF();
        this.f9314i = new Region();
        this.f9315j = new Region();
        this.f9317l = b.f9276a.a(context, 4.0f);
        if (attributeSet != null) {
            b(attributeSet);
        }
        c();
        setWillNotDraw(false);
    }
}
