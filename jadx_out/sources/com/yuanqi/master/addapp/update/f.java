package com.yuanqi.master.addapp.update;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\r\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ*\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lcom/yuanqi/master/addapp/update/StrokeParameters;", "", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "width", "Landroidx/compose/ui/unit/Dp;", "(JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getWidth-D9Ej5fM", "()F", "F", "component1", "component1-0d7_KjU", "component2", "component2-D9Ej5fM", "copy", "copy-l07J4OM", "(JF)Lcom/yuanqi/master/addapp/update/StrokeParameters;", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "toString", "", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final int f14502c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f14503a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14504b;

    private f(long j5, float f5) {
        this.f14503a = j5;
        this.f14504b = f5;
    }

    public /* synthetic */ f(long j5, float f5, w wVar) {
        this(j5, f5);
    }

    public static /* synthetic */ f d(f fVar, long j5, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = fVar.f14503a;
        }
        if ((i5 & 2) != 0) {
            f5 = fVar.f14504b;
        }
        return fVar.c(j5, f5);
    }

    public final long a() {
        return this.f14503a;
    }

    public final float b() {
        return this.f14504b;
    }

    @l
    public final f c(long j5, float f5) {
        return new f(j5, f5, null);
    }

    public final long e() {
        return this.f14503a;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Color.m3735equalsimpl0(this.f14503a, fVar.f14503a) && Dp.m6049equalsimpl0(this.f14504b, fVar.f14504b);
    }

    public final float f() {
        return this.f14504b;
    }

    public int hashCode() {
        return (Color.m3741hashCodeimpl(this.f14503a) * 31) + Dp.m6050hashCodeimpl(this.f14504b);
    }

    @l
    public String toString() {
        return "StrokeParameters(color=" + ((Object) Color.m3742toStringimpl(this.f14503a)) + ", width=" + ((Object) Dp.m6055toStringimpl(this.f14504b)) + ')';
    }
}
