package com.yuanqi.master.addapp.update;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/yuanqi/master/addapp/update/LineParameters;", "", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getStrokeWidth-D9Ej5fM", "()F", "F", "component1", "component1-D9Ej5fM", "component2", "copy", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Lcom/yuanqi/master/addapp/update/LineParameters;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14495c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final float f14496a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final Brush f14497b;

    private c(float f5, Brush brush) {
        l0.p(brush, "brush");
        this.f14496a = f5;
        this.f14497b = brush;
    }

    public /* synthetic */ c(float f5, Brush brush, w wVar) {
        this(f5, brush);
    }

    public static /* synthetic */ c d(c cVar, float f5, Brush brush, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = cVar.f14496a;
        }
        if ((i5 & 2) != 0) {
            brush = cVar.f14497b;
        }
        return cVar.c(f5, brush);
    }

    public final float a() {
        return this.f14496a;
    }

    @l
    public final Brush b() {
        return this.f14497b;
    }

    @l
    public final c c(float f5, @l Brush brush) {
        l0.p(brush, "brush");
        return new c(f5, brush, null);
    }

    @l
    public final Brush e() {
        return this.f14497b;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Dp.m6049equalsimpl0(this.f14496a, cVar.f14496a) && l0.g(this.f14497b, cVar.f14497b);
    }

    public final float f() {
        return this.f14496a;
    }

    public int hashCode() {
        return (Dp.m6050hashCodeimpl(this.f14496a) * 31) + this.f14497b.hashCode();
    }

    @l
    public String toString() {
        return "LineParameters(strokeWidth=" + ((Object) Dp.m6055toStringimpl(this.f14496a)) + ", brush=" + this.f14497b + ')';
    }
}
