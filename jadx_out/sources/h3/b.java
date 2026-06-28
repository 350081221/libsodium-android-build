package h3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.view.View;
import e3.i;
import e3.j;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends ImageSpan implements d {

    /* renamed from: a, reason: collision with root package name */
    private float f16133a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16134b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f16135c;

    /* renamed from: d, reason: collision with root package name */
    private final j f16136d;

    /* renamed from: e, reason: collision with root package name */
    private final i f16137e;

    public b(Drawable drawable, b bVar, i iVar, j jVar) {
        super(drawable, bVar.getSource());
        this.f16135c = bVar.f16135c;
        this.f16134b = bVar.f16134b;
        this.f16137e = iVar;
        this.f16136d = jVar;
    }

    public boolean a(int i5) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float f5 = i5;
            float f6 = drawable.getBounds().right;
            float f7 = this.f16133a;
            if (f5 <= f6 + f7 && f5 >= r0.left + f7) {
                return true;
            }
            return false;
        }
        return false;
    }

    public b b() {
        return new b(null, this.f16135c, this.f16134b, null, null);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        super.draw(canvas, charSequence, i5, i6, f5, i7, i8, i9, paint);
        this.f16133a = f5;
    }

    @Override // android.text.style.ImageSpan
    public String getSource() {
        return this.f16135c.get(this.f16134b);
    }

    @Override // h3.a, android.text.style.ClickableSpan
    public void onClick(View view) {
        i iVar = this.f16137e;
        if (iVar != null) {
            iVar.a(this.f16135c, this.f16134b);
        }
    }

    @Override // h3.c
    public boolean onLongClick(View view) {
        j jVar = this.f16136d;
        return jVar != null && jVar.a(this.f16135c, this.f16134b);
    }

    public b(Drawable drawable, List<String> list, int i5, i iVar, j jVar) {
        super(drawable, list.get(i5));
        this.f16135c = list;
        this.f16134b = i5;
        this.f16137e = iVar;
        this.f16136d = jVar;
    }
}
