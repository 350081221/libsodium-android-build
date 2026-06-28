package com.yuanqi.master.addapp.update;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/yuanqi/master/addapp/update/CircleParametersDefaults;", "", "()V", "defaultCircleRadius", "Landroidx/compose/ui/unit/Dp;", "F", "circleParameters", "Lcom/yuanqi/master/addapp/update/CircleParameters;", "radius", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "stroke", "Lcom/yuanqi/master/addapp/update/StrokeParameters;", "icon", "", "circleParameters-1jbw_BE", "(FJLcom/yuanqi/master/addapp/update/StrokeParameters;Ljava/lang/Integer;)Lcom/yuanqi/master/addapp/update/CircleParameters;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCircleParametersDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleParametersDefaults.kt\ncom/yuanqi/master/addapp/update/CircleParametersDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,24:1\n154#2:25\n*S KotlinDebug\n*F\n+ 1 CircleParametersDefaults.kt\ncom/yuanqi/master/addapp/update/CircleParametersDefaults\n*L\n10#1:25\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final b f14492a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final float f14493b = Dp.m6044constructorimpl(12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14494c = 0;

    private b() {
    }

    public static /* synthetic */ a b(b bVar, float f5, long j5, f fVar, Integer num, int i5, Object obj) {
        f fVar2;
        Integer num2;
        if ((i5 & 1) != 0) {
            f5 = f14493b;
        }
        if ((i5 & 2) != 0) {
            j5 = Color.Companion.m3762getCyan0d7_KjU();
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            fVar2 = null;
        } else {
            fVar2 = fVar;
        }
        if ((i5 & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        return bVar.a(f5, j6, fVar2, num2);
    }

    @l
    public final a a(float f5, long j5, @m f fVar, @DrawableRes @m Integer num) {
        return new a(f5, j5, fVar, num, null);
    }
}
