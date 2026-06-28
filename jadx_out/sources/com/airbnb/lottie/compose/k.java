package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.compose.l;
import com.airbnb.lottie.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005BÓ\u0001\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b!R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "(Ljava/util/List;)V", "intProperties", "", "pointFProperties", "Landroid/graphics/PointF;", "floatProperties", "", "scaleProperties", "Lcom/airbnb/lottie/value/ScaleXY;", "colorFilterProperties", "Landroid/graphics/ColorFilter;", "intArrayProperties", "", "typefaceProperties", "Landroid/graphics/Typeface;", "bitmapProperties", "Landroid/graphics/Bitmap;", "charSequenceProperties", "", "pathProperties", "Landroid/graphics/Path;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "addTo", "", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "addTo$lottie_compose_release", "removeFrom", "removeFrom$lottie_compose_release", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLottieDynamicProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,194:1\n766#2:195\n857#2,2:196\n766#2:198\n857#2,2:199\n766#2:201\n857#2,2:202\n766#2:204\n857#2,2:205\n766#2:207\n857#2,2:208\n766#2:210\n857#2,2:211\n766#2:213\n857#2,2:214\n766#2:216\n857#2,2:217\n766#2:219\n857#2,2:220\n766#2:222\n857#2,2:223\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n1855#2,2:233\n1855#2,2:235\n1855#2,2:237\n1855#2,2:239\n1855#2,2:241\n1855#2,2:243\n1855#2,2:245\n1855#2,2:247\n1855#2,2:249\n1855#2,2:251\n1855#2,2:253\n1855#2,2:255\n1855#2,2:257\n1855#2,2:259\n1855#2,2:261\n1855#2,2:263\n*S KotlinDebug\n*F\n+ 1 LottieDynamicProperties.kt\ncom/airbnb/lottie/compose/LottieDynamicProperties\n*L\n110#1:195\n110#1:196,2\n111#1:198\n111#1:199,2\n112#1:201\n112#1:202,2\n113#1:204\n113#1:205,2\n114#1:207\n114#1:208,2\n115#1:210\n115#1:211,2\n116#1:213\n116#1:214,2\n117#1:216\n117#1:217,2\n118#1:219\n118#1:220,2\n119#1:222\n119#1:223,2\n123#1:225,2\n126#1:227,2\n129#1:229,2\n132#1:231,2\n135#1:233,2\n138#1:235,2\n141#1:237,2\n144#1:239,2\n147#1:241,2\n150#1:243,2\n156#1:245,2\n159#1:247,2\n162#1:249,2\n165#1:251,2\n168#1:253,2\n171#1:255,2\n174#1:257,2\n177#1:259,2\n180#1:261,2\n183#1:263,2\n*E\n"})
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final int f1235k = 8;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final List<m<Integer>> f1236a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final List<m<PointF>> f1237b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final List<m<Float>> f1238c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final List<m<com.airbnb.lottie.value.k>> f1239d;

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final List<m<ColorFilter>> f1240e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final List<m<Object[]>> f1241f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final List<m<Typeface>> f1242g;

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private final List<m<Bitmap>> f1243h;

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private final List<m<CharSequence>> f1244i;

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private final List<m<Path>> f1245j;

    public k(@p4.l List<m<Integer>> intProperties, @p4.l List<m<PointF>> pointFProperties, @p4.l List<m<Float>> floatProperties, @p4.l List<m<com.airbnb.lottie.value.k>> scaleProperties, @p4.l List<m<ColorFilter>> colorFilterProperties, @p4.l List<m<Object[]>> intArrayProperties, @p4.l List<m<Typeface>> typefaceProperties, @p4.l List<m<Bitmap>> bitmapProperties, @p4.l List<m<CharSequence>> charSequenceProperties, @p4.l List<m<Path>> pathProperties) {
        l0.p(intProperties, "intProperties");
        l0.p(pointFProperties, "pointFProperties");
        l0.p(floatProperties, "floatProperties");
        l0.p(scaleProperties, "scaleProperties");
        l0.p(colorFilterProperties, "colorFilterProperties");
        l0.p(intArrayProperties, "intArrayProperties");
        l0.p(typefaceProperties, "typefaceProperties");
        l0.p(bitmapProperties, "bitmapProperties");
        l0.p(charSequenceProperties, "charSequenceProperties");
        l0.p(pathProperties, "pathProperties");
        this.f1236a = intProperties;
        this.f1237b = pointFProperties;
        this.f1238c = floatProperties;
        this.f1239d = scaleProperties;
        this.f1240e = colorFilterProperties;
        this.f1241f = intArrayProperties;
        this.f1242g = typefaceProperties;
        this.f1243h = bitmapProperties;
        this.f1244i = charSequenceProperties;
        this.f1245j = pathProperties;
    }

    public final void a(@p4.l x0 drawable) {
        l.b g5;
        l.b g6;
        l.b g7;
        l.b g8;
        l.b g9;
        l.b g10;
        l.b g11;
        l.b g12;
        l.b g13;
        l.b g14;
        l0.p(drawable, "drawable");
        Iterator<T> it = this.f1236a.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            com.airbnb.lottie.model.e b5 = mVar.b();
            Object c5 = mVar.c();
            g14 = l.g(mVar.a());
            drawable.v(b5, c5, g14);
        }
        Iterator<T> it2 = this.f1237b.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            com.airbnb.lottie.model.e b6 = mVar2.b();
            Object c6 = mVar2.c();
            g13 = l.g(mVar2.a());
            drawable.v(b6, c6, g13);
        }
        Iterator<T> it3 = this.f1238c.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            com.airbnb.lottie.model.e b7 = mVar3.b();
            Object c7 = mVar3.c();
            g12 = l.g(mVar3.a());
            drawable.v(b7, c7, g12);
        }
        Iterator<T> it4 = this.f1239d.iterator();
        while (it4.hasNext()) {
            m mVar4 = (m) it4.next();
            com.airbnb.lottie.model.e b8 = mVar4.b();
            Object c8 = mVar4.c();
            g11 = l.g(mVar4.a());
            drawable.v(b8, c8, g11);
        }
        Iterator<T> it5 = this.f1240e.iterator();
        while (it5.hasNext()) {
            m mVar5 = (m) it5.next();
            com.airbnb.lottie.model.e b9 = mVar5.b();
            Object c9 = mVar5.c();
            g10 = l.g(mVar5.a());
            drawable.v(b9, c9, g10);
        }
        Iterator<T> it6 = this.f1241f.iterator();
        while (it6.hasNext()) {
            m mVar6 = (m) it6.next();
            com.airbnb.lottie.model.e b10 = mVar6.b();
            Object c10 = mVar6.c();
            g9 = l.g(mVar6.a());
            drawable.v(b10, c10, g9);
        }
        Iterator<T> it7 = this.f1242g.iterator();
        while (it7.hasNext()) {
            m mVar7 = (m) it7.next();
            com.airbnb.lottie.model.e b11 = mVar7.b();
            Object c11 = mVar7.c();
            g8 = l.g(mVar7.a());
            drawable.v(b11, c11, g8);
        }
        Iterator<T> it8 = this.f1243h.iterator();
        while (it8.hasNext()) {
            m mVar8 = (m) it8.next();
            com.airbnb.lottie.model.e b12 = mVar8.b();
            Object c12 = mVar8.c();
            g7 = l.g(mVar8.a());
            drawable.v(b12, c12, g7);
        }
        Iterator<T> it9 = this.f1244i.iterator();
        while (it9.hasNext()) {
            m mVar9 = (m) it9.next();
            com.airbnb.lottie.model.e b13 = mVar9.b();
            Object c13 = mVar9.c();
            g6 = l.g(mVar9.a());
            drawable.v(b13, c13, g6);
        }
        Iterator<T> it10 = this.f1245j.iterator();
        while (it10.hasNext()) {
            m mVar10 = (m) it10.next();
            com.airbnb.lottie.model.e b14 = mVar10.b();
            Object c14 = mVar10.c();
            g5 = l.g(mVar10.a());
            drawable.v(b14, c14, g5);
        }
    }

    public final void b(@p4.l x0 drawable) {
        l0.p(drawable, "drawable");
        Iterator<T> it = this.f1236a.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            drawable.v(mVar.b(), mVar.c(), null);
        }
        Iterator<T> it2 = this.f1237b.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            drawable.v(mVar2.b(), mVar2.c(), null);
        }
        Iterator<T> it3 = this.f1238c.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            drawable.v(mVar3.b(), mVar3.c(), null);
        }
        Iterator<T> it4 = this.f1239d.iterator();
        while (it4.hasNext()) {
            m mVar4 = (m) it4.next();
            drawable.v(mVar4.b(), mVar4.c(), null);
        }
        Iterator<T> it5 = this.f1240e.iterator();
        while (it5.hasNext()) {
            m mVar5 = (m) it5.next();
            drawable.v(mVar5.b(), mVar5.c(), null);
        }
        Iterator<T> it6 = this.f1241f.iterator();
        while (it6.hasNext()) {
            m mVar6 = (m) it6.next();
            drawable.v(mVar6.b(), mVar6.c(), null);
        }
        Iterator<T> it7 = this.f1242g.iterator();
        while (it7.hasNext()) {
            m mVar7 = (m) it7.next();
            drawable.v(mVar7.b(), mVar7.c(), null);
        }
        Iterator<T> it8 = this.f1243h.iterator();
        while (it8.hasNext()) {
            m mVar8 = (m) it8.next();
            drawable.v(mVar8.b(), mVar8.c(), null);
        }
        Iterator<T> it9 = this.f1244i.iterator();
        while (it9.hasNext()) {
            m mVar9 = (m) it9.next();
            drawable.v(mVar9.b(), mVar9.c(), null);
        }
        Iterator<T> it10 = this.f1245j.iterator();
        while (it10.hasNext()) {
            m mVar10 = (m) it10.next();
            drawable.v(mVar10.b(), mVar10.c(), null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(@p4.l java.util.List<? extends com.airbnb.lottie.compose.m<?>> r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.k.<init>(java.util.List):void");
    }
}
