package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import com.umeng.analytics.pro.bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@kotlin.i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR \u0010\f\u001a\u00020\u00028\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", bi.aA, "", "alpha", "Lkotlin/r2;", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "intrinsicSize", "J", "getIntrinsicSize-NH-jbRc", "()J", "<init>", "()V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public abstract class Brush {

    @p4.l
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    @kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\\\u0010\u000f\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u000f\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012J>\u0010\u0017\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\\\u0010\u0017\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018J>\u0010\u001c\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\\\u0010\u001c\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\\\u0010!\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\"JH\u0010%\u001a\u00020\f2*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$J*\u0010%\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "", "Lkotlin/u0;", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroidx/compose/ui/graphics/Brush;", "linearGradient-mHitzGk", "([Lkotlin/u0;JJI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "", "colors", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "startX", "endX", "horizontalGradient-8A-3gB4", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "horizontalGradient", "([Lkotlin/u0;FFI)Landroidx/compose/ui/graphics/Brush;", "startY", "endY", "verticalGradient-8A-3gB4", "verticalGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/u0;JFI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient-Uv8p0NA", "([Lkotlin/u0;J)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/Brush$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m3683horizontalGradient8A3gB4$default(Companion companion, List list, float f5, float f6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3693horizontalGradient8A3gB4((List<Color>) list, f5, f6, i5);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m3686linearGradientmHitzGk$default(Companion companion, kotlin.u0[] u0VarArr, long j5, long j6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                j5 = Offset.Companion.m3509getZeroF1C5BW0();
            }
            long j7 = j5;
            if ((i6 & 4) != 0) {
                j6 = Offset.Companion.m3507getInfiniteF1C5BW0();
            }
            long j8 = j6;
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3696linearGradientmHitzGk((kotlin.u0<Float, Color>[]) u0VarArr, j7, j8, i5);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m3688radialGradientP_VxKs$default(Companion companion, kotlin.u0[] u0VarArr, long j5, float f5, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                j5 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            long j6 = j5;
            if ((i6 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            float f6 = f5;
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3698radialGradientP_VxKs((kotlin.u0<Float, Color>[]) u0VarArr, j6, f6, i5);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m3690sweepGradientUv8p0NA$default(Companion companion, kotlin.u0[] u0VarArr, long j5, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j5 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            return companion.m3700sweepGradientUv8p0NA((kotlin.u0<Float, Color>[]) u0VarArr, j5);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m3691verticalGradient8A3gB4$default(Companion companion, List list, float f5, float f6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3701verticalGradient8A3gB4((List<Color>) list, f5, f6, i5);
        }

        @Stable
        @p4.l
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m3693horizontalGradient8A3gB4(@p4.l List<Color> list, float f5, float f6, int i5) {
            return m3695linearGradientmHitzGk(list, OffsetKt.Offset(f5, 0.0f), OffsetKt.Offset(f6, 0.0f), i5);
        }

        @Stable
        @p4.l
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m3696linearGradientmHitzGk(@p4.l kotlin.u0<Float, Color>[] u0VarArr, long j5, long j6, int i5) {
            ArrayList arrayList = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var : u0VarArr) {
                arrayList.add(Color.m3724boximpl(u0Var.getSecond().m3744unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var2 : u0VarArr) {
                arrayList2.add(Float.valueOf(u0Var2.getFirst().floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j5, j6, i5, null);
        }

        @Stable
        @p4.l
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m3698radialGradientP_VxKs(@p4.l kotlin.u0<Float, Color>[] u0VarArr, long j5, float f5, int i5) {
            ArrayList arrayList = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var : u0VarArr) {
                arrayList.add(Color.m3724boximpl(u0Var.getSecond().m3744unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var2 : u0VarArr) {
                arrayList2.add(Float.valueOf(u0Var2.getFirst().floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j5, f5, i5, null);
        }

        @Stable
        @p4.l
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m3700sweepGradientUv8p0NA(@p4.l kotlin.u0<Float, Color>[] u0VarArr, long j5) {
            ArrayList arrayList = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var : u0VarArr) {
                arrayList.add(Color.m3724boximpl(u0Var.getSecond().m3744unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(u0VarArr.length);
            for (kotlin.u0<Float, Color> u0Var2 : u0VarArr) {
                arrayList2.add(Float.valueOf(u0Var2.getFirst().floatValue()));
            }
            return new SweepGradient(j5, arrayList, arrayList2, null);
        }

        @Stable
        @p4.l
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m3701verticalGradient8A3gB4(@p4.l List<Color> list, float f5, float f6, int i5) {
            return m3695linearGradientmHitzGk(list, OffsetKt.Offset(0.0f, f5), OffsetKt.Offset(0.0f, f6), i5);
        }

        @Stable
        @p4.l
        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m3694horizontalGradient8A3gB4(@p4.l kotlin.u0<Float, Color>[] u0VarArr, float f5, float f6, int i5) {
            return m3696linearGradientmHitzGk((kotlin.u0<Float, Color>[]) Arrays.copyOf(u0VarArr, u0VarArr.length), OffsetKt.Offset(f5, 0.0f), OffsetKt.Offset(f6, 0.0f), i5);
        }

        @Stable
        @p4.l
        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m3702verticalGradient8A3gB4(@p4.l kotlin.u0<Float, Color>[] u0VarArr, float f5, float f6, int i5) {
            return m3696linearGradientmHitzGk((kotlin.u0<Float, Color>[]) Arrays.copyOf(u0VarArr, u0VarArr.length), OffsetKt.Offset(0.0f, f5), OffsetKt.Offset(0.0f, f6), i5);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m3684horizontalGradient8A3gB4$default(Companion companion, kotlin.u0[] u0VarArr, float f5, float f6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3694horizontalGradient8A3gB4((kotlin.u0<Float, Color>[]) u0VarArr, f5, f6, i5);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m3689sweepGradientUv8p0NA$default(Companion companion, List list, long j5, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                j5 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            return companion.m3699sweepGradientUv8p0NA((List<Color>) list, j5);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m3692verticalGradient8A3gB4$default(Companion companion, kotlin.u0[] u0VarArr, float f5, float f6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                f5 = 0.0f;
            }
            if ((i6 & 4) != 0) {
                f6 = Float.POSITIVE_INFINITY;
            }
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3702verticalGradient8A3gB4((kotlin.u0<Float, Color>[]) u0VarArr, f5, f6, i5);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m3687radialGradientP_VxKs$default(Companion companion, List list, long j5, float f5, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                j5 = Offset.Companion.m3508getUnspecifiedF1C5BW0();
            }
            long j6 = j5;
            if ((i6 & 4) != 0) {
                f5 = Float.POSITIVE_INFINITY;
            }
            float f6 = f5;
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3697radialGradientP_VxKs((List<Color>) list, j6, f6, i5);
        }

        @Stable
        @p4.l
        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m3695linearGradientmHitzGk(@p4.l List<Color> list, long j5, long j6, int i5) {
            return new LinearGradient(list, null, j5, j6, i5, null);
        }

        @Stable
        @p4.l
        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m3697radialGradientP_VxKs(@p4.l List<Color> list, long j5, float f5, int i5) {
            return new RadialGradient(list, null, j5, f5, i5, null);
        }

        @Stable
        @p4.l
        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m3699sweepGradientUv8p0NA(@p4.l List<Color> list, long j5) {
            return new SweepGradient(j5, list, null, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m3685linearGradientmHitzGk$default(Companion companion, List list, long j5, long j6, int i5, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                j5 = Offset.Companion.m3509getZeroF1C5BW0();
            }
            long j7 = j5;
            if ((i6 & 4) != 0) {
                j6 = Offset.Companion.m3507getInfiniteF1C5BW0();
            }
            long j8 = j6;
            if ((i6 & 8) != 0) {
                i5 = TileMode.Companion.m4105getClamp3opZhB0();
            }
            return companion.m3695linearGradientmHitzGk((List<Color>) list, j7, j8, i5);
        }
    }

    private Brush() {
        this.intrinsicSize = Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    public /* synthetic */ Brush(kotlin.jvm.internal.w wVar) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo3681applyToPq9zytI(long j5, @p4.l Paint paint, float f5);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo3682getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }
}
