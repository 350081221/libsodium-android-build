package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.animation.keyframe.o;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.b;
import com.airbnb.lottie.model.content.q;
import com.airbnb.lottie.utils.l;
import com.airbnb.lottie.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class i extends com.airbnb.lottie.model.layer.b {
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<com.airbnb.lottie.model.d, List<com.airbnb.lottie.animation.content.d>> M;
    private final LongSparseArray<String> N;
    private final List<d> O;
    private final o P;
    private final x0 Q;
    private final k R;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> S;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> T;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> U;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Integer, Integer> V;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> W;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> X;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Y;

    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> Z;

    /* renamed from: a0, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f1569a0;

    /* renamed from: b0, reason: collision with root package name */
    @Nullable
    private com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> f1570b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends Paint {
        a(int i5) {
            super(i5);
            setStyle(Paint.Style.FILL);
        }
    }

    /* loaded from: classes2.dex */
    class b extends Paint {
        b(int i5) {
            super(i5);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1573a;

        static {
            int[] iArr = new int[b.a.values().length];
            f1573a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1573a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1573a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(x0 x0Var, e eVar) {
        super(x0Var, eVar);
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.a aVar;
        com.airbnb.lottie.model.animatable.a aVar2;
        this.H = new StringBuilder(2);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new LongSparseArray<>();
        this.O = new ArrayList();
        this.Q = x0Var;
        this.R = eVar.c();
        o a5 = eVar.t().a();
        this.P = a5;
        a5.a(this);
        i(a5);
        com.airbnb.lottie.model.animatable.k u4 = eVar.u();
        if (u4 != null && (aVar2 = u4.f1368a) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a6 = aVar2.a();
            this.S = a6;
            a6.a(this);
            i(this.S);
        }
        if (u4 != null && (aVar = u4.f1369b) != null) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> a7 = aVar.a();
            this.U = a7;
            a7.a(this);
            i(this.U);
        }
        if (u4 != null && (bVar2 = u4.f1370c) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a8 = bVar2.a();
            this.W = a8;
            a8.a(this);
            i(this.W);
        }
        if (u4 != null && (bVar = u4.f1371d) != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> a9 = bVar.a();
            this.Y = a9;
            a9.a(this);
            i(this.Y);
        }
    }

    private String P(String str, int i5) {
        int codePointAt = str.codePointAt(i5);
        int charCount = Character.charCount(codePointAt) + i5;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j5 = codePointAt;
        if (this.N.containsKey(j5)) {
            return this.N.get(j5);
        }
        this.H.setLength(0);
        while (i5 < charCount) {
            int codePointAt3 = str.codePointAt(i5);
            this.H.appendCodePoint(codePointAt3);
            i5 += Character.charCount(codePointAt3);
        }
        String sb = this.H.toString();
        this.N.put(j5, sb);
        return sb;
    }

    private void Q(com.airbnb.lottie.model.b bVar, int i5) {
        int intValue;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.T;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.S;
            if (aVar2 != null) {
                this.K.setColor(aVar2.h().intValue());
            } else {
                this.K.setColor(bVar.f1390h);
            }
        }
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar3 = this.V;
        if (aVar3 != null) {
            this.L.setColor(aVar3.h().intValue());
        } else {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar4 = this.U;
            if (aVar4 != null) {
                this.L.setColor(aVar4.h().intValue());
            } else {
                this.L.setColor(bVar.f1391i);
            }
        }
        if (this.f1538x.h() == null) {
            intValue = 100;
        } else {
            intValue = this.f1538x.h().h().intValue();
        }
        int i6 = (((intValue * 255) / 100) * i5) / 255;
        this.K.setAlpha(i6);
        this.L.setAlpha(i6);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.X;
        if (aVar5 != null) {
            this.L.setStrokeWidth(aVar5.h().floatValue());
            return;
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar6 = this.W;
        if (aVar6 != null) {
            this.L.setStrokeWidth(aVar6.h().floatValue());
        } else {
            this.L.setStrokeWidth(bVar.f1392j * l.e());
        }
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void S(com.airbnb.lottie.model.d dVar, float f5, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        List<com.airbnb.lottie.animation.content.d> a02 = a0(dVar);
        for (int i5 = 0; i5 < a02.size(); i5++) {
            Path path = a02.get(i5).getPath();
            path.computeBounds(this.I, false);
            this.J.reset();
            this.J.preTranslate(0.0f, (-bVar.f1389g) * l.e());
            this.J.preScale(f5, f5);
            path.transform(this.J);
            if (bVar.f1393k) {
                V(path, this.K, canvas);
                V(path, this.L, canvas);
            } else {
                V(path, this.L, canvas);
                V(path, this.K, canvas);
            }
        }
    }

    private void T(String str, com.airbnb.lottie.model.b bVar, Canvas canvas) {
        if (bVar.f1393k) {
            R(str, this.K, canvas);
            R(str, this.L, canvas);
        } else {
            R(str, this.L, canvas);
            R(str, this.K, canvas);
        }
    }

    private void U(String str, com.airbnb.lottie.model.b bVar, Canvas canvas, float f5) {
        int i5 = 0;
        while (i5 < str.length()) {
            String P = P(str, i5);
            i5 += P.length();
            T(P, bVar, canvas);
            canvas.translate(this.K.measureText(P) + f5, 0.0f);
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, com.airbnb.lottie.model.b bVar, com.airbnb.lottie.model.c cVar, Canvas canvas, float f5, float f6, float f7) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            com.airbnb.lottie.model.d dVar = this.R.c().get(com.airbnb.lottie.model.d.c(str.charAt(i5), cVar.b(), cVar.d()));
            if (dVar != null) {
                S(dVar, f6, bVar, canvas);
                canvas.translate((((float) dVar.b()) * f6 * l.e()) + f7, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(com.airbnb.lottie.model.b r19, com.airbnb.lottie.model.c r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.c0(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.f1383a
            com.airbnb.lottie.x0 r2 = r7.Q
            com.airbnb.lottie.l1 r2 = r2.i0()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.getName()
            java.lang.String r1 = r2.c(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.K
            r2.setTypeface(r0)
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r0 = r7.f1569a0
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.f1385c
        L37:
            android.graphics.Paint r2 = r7.K
            float r3 = com.airbnb.lottie.utils.l.e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.L
            android.graphics.Paint r3 = r7.K
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.L
            android.graphics.Paint r3 = r7.K
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f1387e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.Z
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r3 = r7.Y
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = com.airbnb.lottie.utils.l.e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.b0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Le0
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f1395m
            if (r0 != 0) goto La1
            r0 = 0
            goto La3
        La1:
            float r0 = r0.x
        La3:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.f0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb5:
            int r2 = r0.size()
            if (r1 >= r2) goto Ldd
            java.lang.Object r2 = r0.get(r1)
            com.airbnb.lottie.model.layer.i$d r2 = (com.airbnb.lottie.model.layer.i.d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.airbnb.lottie.model.layer.i.d.a(r2)
            boolean r3 = r7.e0(r10, r8, r15, r3)
            if (r3 == 0) goto Ld7
            java.lang.String r2 = com.airbnb.lottie.model.layer.i.d.b(r2)
            r7.U(r2, r8, r10, r11)
        Ld7:
            r21.restore()
            int r1 = r1 + 1
            goto Lb5
        Ldd:
            int r6 = r17 + 1
            goto L92
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.i.X(com.airbnb.lottie.model.b, com.airbnb.lottie.model.c, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(com.airbnb.lottie.model.b r21, android.graphics.Matrix r22, com.airbnb.lottie.model.c r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r0 = r8.f1569a0
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.f1385c
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.airbnb.lottie.utils.l.g(r22)
            java.lang.String r0 = r9.f1383a
            java.util.List r12 = r8.b0(r0)
            int r13 = r12.size()
            int r0 = r9.f1387e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r1 = r8.Z
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
            goto L4c
        L3d:
            com.airbnb.lottie.animation.keyframe.a<java.lang.Float, java.lang.Float> r1 = r8.Y
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4c:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lbd
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.f1395m
            if (r0 != 0) goto L60
            r0 = 0
            goto L62
        L60:
            float r0 = r0.x
        L62:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.f0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L74:
            int r0 = r6.size()
            if (r5 >= r0) goto Lba
            java.lang.Object r0 = r6.get(r5)
            com.airbnb.lottie.model.layer.i$d r0 = (com.airbnb.lottie.model.layer.i.d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.airbnb.lottie.model.layer.i.d.a(r0)
            r4 = r24
            boolean r1 = r8.e0(r4, r9, r7, r1)
            if (r1 == 0) goto Laa
            java.lang.String r1 = com.airbnb.lottie.model.layer.i.d.b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.W(r1, r2, r3, r4, r5, r6, r7)
            goto Lb0
        Laa:
            r16 = r5
            r18 = r6
            r19 = r7
        Lb0:
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L74
        Lba:
            int r6 = r17 + 1
            goto L51
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.i.Y(com.airbnb.lottie.model.b, android.graphics.Matrix, com.airbnb.lottie.model.c, android.graphics.Canvas):void");
    }

    private d Z(int i5) {
        for (int size = this.O.size(); size < i5; size++) {
            this.O.add(new d(null));
        }
        return this.O.get(i5 - 1);
    }

    private List<com.airbnb.lottie.animation.content.d> a0(com.airbnb.lottie.model.d dVar) {
        if (this.M.containsKey(dVar)) {
            return this.M.get(dVar);
        }
        List<q> a5 = dVar.a();
        int size = a5.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new com.airbnb.lottie.animation.content.d(this.Q, this, a5.get(i5), this.R));
        }
        this.M.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Nullable
    private Typeface c0(com.airbnb.lottie.model.c cVar) {
        Typeface h5;
        com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar = this.f1570b0;
        if (aVar != null && (h5 = aVar.h()) != null) {
            return h5;
        }
        Typeface j02 = this.Q.j0(cVar);
        if (j02 != null) {
            return j02;
        }
        return cVar.e();
    }

    private boolean d0(int i5) {
        if (Character.getType(i5) != 16 && Character.getType(i5) != 27 && Character.getType(i5) != 6 && Character.getType(i5) != 28 && Character.getType(i5) != 8 && Character.getType(i5) != 19) {
            return false;
        }
        return true;
    }

    private boolean e0(Canvas canvas, com.airbnb.lottie.model.b bVar, int i5, float f5) {
        float f6;
        float f7;
        PointF pointF = bVar.f1394l;
        PointF pointF2 = bVar.f1395m;
        float e5 = l.e();
        float f8 = 0.0f;
        if (pointF == null) {
            f6 = 0.0f;
        } else {
            f6 = (bVar.f1388f * e5) + pointF.y;
        }
        float f9 = (i5 * bVar.f1388f * e5) + f6;
        if (this.Q.P() && pointF2 != null && pointF != null && f9 >= pointF.y + pointF2.y + bVar.f1385c) {
            return false;
        }
        if (pointF == null) {
            f7 = 0.0f;
        } else {
            f7 = pointF.x;
        }
        if (pointF2 != null) {
            f8 = pointF2.x;
        }
        int i6 = c.f1573a[bVar.f1386d.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    canvas.translate((f7 + (f8 / 2.0f)) - (f5 / 2.0f), f9);
                }
            } else {
                canvas.translate((f7 + f8) - f5, f9);
            }
        } else {
            canvas.translate(f7, f9);
        }
        return true;
    }

    private List<d> f0(String str, float f5, com.airbnb.lottie.model.c cVar, float f6, float f7, boolean z4) {
        float measureText;
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        int i7 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (z4) {
                com.airbnb.lottie.model.d dVar = this.R.c().get(com.airbnb.lottie.model.d.c(charAt, cVar.b(), cVar.d()));
                if (dVar != null) {
                    measureText = ((float) dVar.b()) * f6 * l.e();
                }
            } else {
                measureText = this.K.measureText(str.substring(i8, i8 + 1));
            }
            float f11 = measureText + f7;
            if (charAt == ' ') {
                z5 = true;
                f10 = f11;
            } else if (z5) {
                z5 = false;
                i7 = i8;
                f9 = f11;
            } else {
                f9 += f11;
            }
            f8 += f11;
            if (f5 > 0.0f && f8 >= f5 && charAt != ' ') {
                i5++;
                d Z = Z(i5);
                if (i7 == i6) {
                    Z.c(str.substring(i6, i8).trim(), (f8 - f11) - ((r9.length() - r7.length()) * f10));
                    i6 = i8;
                    i7 = i6;
                    f8 = f11;
                    f9 = f8;
                } else {
                    Z.c(str.substring(i6, i7 - 1).trim(), ((f8 - f9) - ((r7.length() - r13.length()) * f10)) - f10);
                    f8 = f9;
                    i6 = i7;
                }
            }
        }
        if (f8 > 0.0f) {
            i5++;
            Z(i5).c(str.substring(i6), f8);
        }
        return this.O.subList(0, i5);
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.model.f
    public <T> void d(T t5, @Nullable com.airbnb.lottie.value.j<T> jVar) {
        super.d(t5, jVar);
        if (t5 == c1.f1141a) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar = this.T;
            if (aVar != null) {
                H(aVar);
            }
            if (jVar == null) {
                this.T = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.T = qVar;
            qVar.a(this);
            i(this.T);
            return;
        }
        if (t5 == c1.f1142b) {
            com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVar2 = this.V;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (jVar == null) {
                this.V = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.V = qVar2;
            qVar2.a(this);
            i(this.V);
            return;
        }
        if (t5 == c1.f1159s) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar3 = this.X;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (jVar == null) {
                this.X = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.X = qVar3;
            qVar3.a(this);
            i(this.X);
            return;
        }
        if (t5 == c1.f1160t) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar4 = this.Z;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (jVar == null) {
                this.Z = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.Z = qVar4;
            qVar4.a(this);
            i(this.Z);
            return;
        }
        if (t5 == c1.F) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar5 = this.f1569a0;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (jVar == null) {
                this.f1569a0 = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar5 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f1569a0 = qVar5;
            qVar5.a(this);
            i(this.f1569a0);
            return;
        }
        if (t5 == c1.M) {
            com.airbnb.lottie.animation.keyframe.a<Typeface, Typeface> aVar6 = this.f1570b0;
            if (aVar6 != null) {
                H(aVar6);
            }
            if (jVar == null) {
                this.f1570b0 = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar6 = new com.airbnb.lottie.animation.keyframe.q(jVar);
            this.f1570b0 = qVar6;
            qVar6.a(this);
            i(this.f1570b0);
            return;
        }
        if (t5 == c1.O) {
            this.P.r(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.layer.b, com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        super.f(rectF, matrix, z4);
        rectF.set(0.0f, 0.0f, this.R.b().width(), this.R.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.b
    void t(Canvas canvas, Matrix matrix, int i5) {
        com.airbnb.lottie.model.b h5 = this.P.h();
        com.airbnb.lottie.model.c cVar = this.R.g().get(h5.f1384b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(h5, i5);
        if (this.Q.H1()) {
            Y(h5, matrix, cVar, canvas);
        } else {
            X(h5, cVar, canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f1574a;

        /* renamed from: b, reason: collision with root package name */
        private float f1575b;

        private d() {
            this.f1574a = "";
            this.f1575b = 0.0f;
        }

        void c(String str, float f5) {
            this.f1574a = str;
            this.f1575b = f5;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
