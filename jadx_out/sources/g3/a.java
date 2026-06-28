package g3;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import com.zzhoujay.richtext.g;
import com.zzhoujay.richtext.spans.LongClickableURLSpan;
import e3.h;
import e3.i;
import e3.j;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0447a {
    }

    private void a(SpannableStringBuilder spannableStringBuilder) {
        C0447a[] c0447aArr = (C0447a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0447a.class);
        if (c0447aArr != null && c0447aArr.length > 0) {
            for (C0447a c0447a : c0447aArr) {
                spannableStringBuilder.removeSpan(c0447a);
            }
        }
    }

    private void b(SpannableStringBuilder spannableStringBuilder, g gVar, boolean z4) {
        int length;
        int length2;
        int i5 = 0;
        if (z4) {
            LongClickableURLSpan[] longClickableURLSpanArr = (LongClickableURLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LongClickableURLSpan.class);
            if (longClickableURLSpanArr != null && longClickableURLSpanArr.length > 0) {
                int length3 = longClickableURLSpanArr.length;
                while (i5 < length3) {
                    f(spannableStringBuilder, gVar, longClickableURLSpanArr[i5]);
                    i5++;
                }
                return;
            }
            return;
        }
        if (gVar.f15758m >= 0) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            if (uRLSpanArr == null) {
                length2 = 0;
            } else {
                length2 = uRLSpanArr.length;
            }
            while (i5 < length2) {
                f(spannableStringBuilder, gVar, uRLSpanArr[i5]);
                i5++;
            }
            return;
        }
        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr2 == null) {
            length = 0;
        } else {
            length = uRLSpanArr2.length;
        }
        while (i5 < length) {
            spannableStringBuilder.removeSpan(uRLSpanArr2[i5]);
            i5++;
        }
    }

    private int c(SpannableStringBuilder spannableStringBuilder, c cVar, g gVar, boolean z4) {
        ImageSpan[] imageSpanArr;
        i iVar;
        j jVar;
        i iVar2;
        j jVar2;
        c cVar2 = cVar;
        int i5 = 0;
        if (z4) {
            h3.b[] bVarArr = (h3.b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h3.b.class);
            if (bVarArr != null && bVarArr.length > 0) {
                for (h3.b bVar : bVarArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(bVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(bVar);
                    spannableStringBuilder.removeSpan(bVar);
                    if (gVar.f15758m > 0) {
                        iVar2 = gVar.f15759n;
                        jVar2 = gVar.f15761p;
                    } else {
                        iVar2 = null;
                        jVar2 = null;
                    }
                    Drawable drawable = cVar2.getDrawable(bVar.getSource());
                    if (drawable == null) {
                        drawable = new ColorDrawable(0);
                    }
                    spannableStringBuilder.setSpan(new h3.b(drawable, bVar, iVar2, jVar2), spanStart, spanEnd, 33);
                }
                return bVarArr.length;
            }
        } else if (!gVar.f15757l && (imageSpanArr = (ImageSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class)) != null && imageSpanArr.length > 0) {
            ArrayList arrayList = new ArrayList(imageSpanArr.length);
            int i6 = 0;
            while (i6 < imageSpanArr.length) {
                ImageSpan imageSpan = imageSpanArr[i6];
                String source = imageSpan.getSource();
                arrayList.add(source);
                int spanStart2 = spannableStringBuilder.getSpanStart(imageSpan);
                int spanEnd2 = spannableStringBuilder.getSpanEnd(imageSpan);
                Object[] objArr = (ClickableSpan[]) spannableStringBuilder.getSpans(spanStart2, spanEnd2, ClickableSpan.class);
                if (objArr != null && objArr.length != 0) {
                    int length = objArr.length;
                    for (int i7 = i5; i7 < length; i7++) {
                        spannableStringBuilder.removeSpan(objArr[i7]);
                    }
                }
                if (gVar.f15758m > 0) {
                    iVar = gVar.f15759n;
                    jVar = gVar.f15761p;
                } else {
                    iVar = null;
                    jVar = null;
                }
                Drawable drawable2 = cVar2.getDrawable(source);
                if (drawable2 == null) {
                    drawable2 = new ColorDrawable(i5);
                }
                Object bVar2 = new h3.b(drawable2, arrayList, i6, iVar, jVar);
                spannableStringBuilder.removeSpan(imageSpan);
                spannableStringBuilder.setSpan(bVar2, spanStart2, spanEnd2, 33);
                i6++;
                cVar2 = cVar;
                i5 = 0;
            }
            return imageSpanArr.length;
        }
        return 0;
    }

    private boolean d(SpannableStringBuilder spannableStringBuilder) {
        C0447a[] c0447aArr = (C0447a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0447a.class);
        if (c0447aArr == null || c0447aArr.length <= 0) {
            return false;
        }
        return true;
    }

    private void f(SpannableStringBuilder spannableStringBuilder, g gVar, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        spannableStringBuilder.removeSpan(uRLSpan);
        com.zzhoujay.richtext.d dVar = new com.zzhoujay.richtext.d(uRLSpan.getURL());
        h hVar = gVar.f15756k;
        if (hVar != null) {
            hVar.a(dVar);
        }
        spannableStringBuilder.setSpan(new LongClickableURLSpan(dVar, gVar.f15760o, gVar.f15762q), spanStart, spanEnd, 33);
    }

    public int e(SpannableStringBuilder spannableStringBuilder, c cVar, g gVar) {
        boolean d5 = d(spannableStringBuilder);
        b(spannableStringBuilder, gVar, d5);
        return c(spannableStringBuilder, cVar, gVar, d5);
    }
}
