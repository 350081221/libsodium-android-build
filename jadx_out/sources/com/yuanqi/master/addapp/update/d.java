package com.yuanqi.master.addapp.update;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JA\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lcom/yuanqi/master/addapp/update/LineParametersDefaults;", "", "()V", "defaultLinearGradient", "Landroidx/compose/ui/unit/Dp;", "F", "linearGradient", "Lcom/yuanqi/master/addapp/update/LineParameters;", "strokeWidth", "startColor", "Landroidx/compose/ui/graphics/Color;", "endColor", "startY", "", "endY", "linearGradient-eHXD8jA", "(FJJFF)Lcom/yuanqi/master/addapp/update/LineParameters;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nLineParametersDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineParametersDefaults.kt\ncom/yuanqi/master/addapp/update/LineParametersDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,26:1\n154#2:27\n*S KotlinDebug\n*F\n+ 1 LineParametersDefaults.kt\ncom/yuanqi/master/addapp/update/LineParametersDefaults\n*L\n10#1:27\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f14498a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final float f14499b = Dp.m6044constructorimpl(3);

    /* renamed from: c, reason: collision with root package name */
    public static final int f14500c = 0;

    private d() {
    }

    public static /* synthetic */ c b(d dVar, float f5, long j5, long j6, float f6, float f7, int i5, Object obj) {
        float f8;
        float f9;
        float f10;
        if ((i5 & 1) != 0) {
            f8 = f14499b;
        } else {
            f8 = f5;
        }
        if ((i5 & 8) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f6;
        }
        if ((i5 & 16) != 0) {
            f10 = Float.POSITIVE_INFINITY;
        } else {
            f10 = f7;
        }
        return dVar.a(f8, j5, j6, f9, f10);
    }

    @l
    public final c a(float f5, long j5, long j6, float f6, float f7) {
        List L;
        Brush.Companion companion = Brush.Companion;
        L = w.L(Color.m3724boximpl(j5), Color.m3724boximpl(j6));
        return new c(f5, Brush.Companion.m3691verticalGradient8A3gB4$default(companion, L, f6, f7, 0, 8, (Object) null), null);
    }
}
