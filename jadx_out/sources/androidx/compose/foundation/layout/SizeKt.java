package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011\u001a\u001e\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a*\u0010 \u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0019\u001a&\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a>\u0010*\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001e\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a*\u00101\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0019\u001a&\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010)\u001a>\u00106\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010.\u001a\u001e\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0019\u001a*\u00109\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0011\u001a \u0010;\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010@\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020A2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010B\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020C2\b\b\u0002\u0010>\u001a\u00020?H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fraction", "", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1112:1\n135#2:1113\n135#2:1114\n135#2:1115\n135#2:1116\n135#2:1117\n135#2:1118\n135#2:1119\n135#2:1120\n135#2:1121\n135#2:1122\n135#2:1123\n135#2:1124\n135#2:1125\n135#2:1126\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1113\n85#1:1114\n111#1:1115\n138#1:1116\n176#1:1117\n199#1:1118\n226#1:1119\n257#1:1120\n285#1:1121\n315#1:1122\n342#1:1123\n381#1:1124\n405#1:1125\n434#1:1126\n*E\n"})
/* loaded from: classes.dex */
public final class SizeKt {

    @l
    private static final FillElement FillWholeMaxHeight;

    @l
    private static final FillElement FillWholeMaxSize;

    @l
    private static final FillElement FillWholeMaxWidth;

    @l
    private static final WrapContentElement WrapContentHeightCenter;

    @l
    private static final WrapContentElement WrapContentHeightTop;

    @l
    private static final WrapContentElement WrapContentSizeCenter;

    @l
    private static final WrapContentElement WrapContentSizeTopStart;

    @l
    private static final WrapContentElement WrapContentWidthCenter;

    @l
    private static final WrapContentElement WrapContentWidthStart;

    static {
        FillElement.Companion companion = FillElement.Companion;
        FillWholeMaxWidth = companion.width(1.0f);
        FillWholeMaxHeight = companion.height(1.0f);
        FillWholeMaxSize = companion.size(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.Companion;
        Alignment.Companion companion3 = Alignment.Companion;
        WrapContentWidthCenter = companion2.width(companion3.getCenterHorizontally(), false);
        WrapContentWidthStart = companion2.width(companion3.getStart(), false);
        WrapContentHeightCenter = companion2.height(companion3.getCenterVertically(), false);
        WrapContentHeightTop = companion2.height(companion3.getTop(), false);
        WrapContentSizeCenter = companion2.size(companion3.getCenter(), false);
        WrapContentSizeTopStart = companion2.size(companion3.getTopStart(), false);
    }

    @Stable
    @l
    /* renamed from: defaultMinSize-VpY3zN4 */
    public static final Modifier m586defaultMinSizeVpY3zN4(@l Modifier modifier, float f5, float f6) {
        return modifier.then(new UnspecifiedConstraintsElement(f5, f6, null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default */
    public static /* synthetic */ Modifier m587defaultMinSizeVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m586defaultMinSizeVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    public static final Modifier fillMaxHeight(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return modifier.then((f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxHeight : FillElement.Companion.height(f5));
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return fillMaxHeight(modifier, f5);
    }

    @Stable
    @l
    public static final Modifier fillMaxSize(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return modifier.then((f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxSize : FillElement.Companion.size(f5));
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return fillMaxSize(modifier, f5);
    }

    @Stable
    @l
    public static final Modifier fillMaxWidth(@l Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        return modifier.then((f5 > 1.0f ? 1 : (f5 == 1.0f ? 0 : -1)) == 0 ? FillWholeMaxWidth : FillElement.Companion.width(f5));
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 1.0f;
        }
        return fillMaxWidth(modifier, f5);
    }

    @Stable
    @l
    /* renamed from: height-3ABfNKs */
    public static final Modifier m588height3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(0.0f, f5, 0.0f, f5, true, noInspectorInfo, 5, null));
    }

    @Stable
    @l
    /* renamed from: heightIn-VpY3zN4 */
    public static final Modifier m589heightInVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(0.0f, f5, 0.0f, f6, true, noInspectorInfo, 5, null));
    }

    /* renamed from: heightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m590heightInVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m589heightInVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    /* renamed from: requiredHeight-3ABfNKs */
    public static final Modifier m591requiredHeight3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(0.0f, f5, 0.0f, f5, false, noInspectorInfo, 5, null));
    }

    @Stable
    @l
    /* renamed from: requiredHeightIn-VpY3zN4 */
    public static final Modifier m592requiredHeightInVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(0.0f, f5, 0.0f, f6, false, noInspectorInfo, 5, null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m593requiredHeightInVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m592requiredHeightInVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    /* renamed from: requiredSize-3ABfNKs */
    public static final Modifier m594requiredSize3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f5, f5, f5, false, noInspectorInfo, null));
    }

    @Stable
    @l
    /* renamed from: requiredSize-6HolHcs */
    public static final Modifier m595requiredSize6HolHcs(@l Modifier modifier, long j5) {
        return m596requiredSizeVpY3zN4(modifier, DpSize.m6142getWidthD9Ej5fM(j5), DpSize.m6140getHeightD9Ej5fM(j5));
    }

    @Stable
    @l
    /* renamed from: requiredSize-VpY3zN4 */
    public static final Modifier m596requiredSizeVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f6, f5, f6, false, noInspectorInfo, null));
    }

    @Stable
    @l
    /* renamed from: requiredSizeIn-qDBjuR0 */
    public static final Modifier m597requiredSizeInqDBjuR0(@l Modifier modifier, float f5, float f6, float f7, float f8) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f5, f6, f7, f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f6, f7, f8, false, noInspectorInfo, null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m598requiredSizeInqDBjuR0$default(Modifier modifier, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m597requiredSizeInqDBjuR0(modifier, f5, f6, f7, f8);
    }

    @Stable
    @l
    /* renamed from: requiredWidth-3ABfNKs */
    public static final Modifier m599requiredWidth3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, 0.0f, f5, 0.0f, false, noInspectorInfo, 10, null));
    }

    @Stable
    @l
    /* renamed from: requiredWidthIn-VpY3zN4 */
    public static final Modifier m600requiredWidthInVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, 0.0f, f6, 0.0f, false, noInspectorInfo, 10, null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m601requiredWidthInVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m600requiredWidthInVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    /* renamed from: size-3ABfNKs */
    public static final Modifier m602size3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f5, f5, f5, true, noInspectorInfo, null));
    }

    @Stable
    @l
    /* renamed from: size-6HolHcs */
    public static final Modifier m603size6HolHcs(@l Modifier modifier, long j5) {
        return m604sizeVpY3zN4(modifier, DpSize.m6142getWidthD9Ej5fM(j5), DpSize.m6140getHeightD9Ej5fM(j5));
    }

    @Stable
    @l
    /* renamed from: size-VpY3zN4 */
    public static final Modifier m604sizeVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f6, f5, f6, true, noInspectorInfo, null));
    }

    @Stable
    @l
    /* renamed from: sizeIn-qDBjuR0 */
    public static final Modifier m605sizeInqDBjuR0(@l Modifier modifier, float f5, float f6, float f7, float f8) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f5, f6, f7, f8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, f6, f7, f8, true, noInspectorInfo, null));
    }

    /* renamed from: sizeIn-qDBjuR0$default */
    public static /* synthetic */ Modifier m606sizeInqDBjuR0$default(Modifier modifier, float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m605sizeInqDBjuR0(modifier, f5, f6, f7, f8);
    }

    @Stable
    @l
    /* renamed from: width-3ABfNKs */
    public static final Modifier m607width3ABfNKs(@l Modifier modifier, float f5) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f5);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, 0.0f, f5, 0.0f, true, noInspectorInfo, 10, null));
    }

    @Stable
    @l
    /* renamed from: widthIn-VpY3zN4 */
    public static final Modifier m608widthInVpY3zN4(@l Modifier modifier, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeElement(f5, 0.0f, f6, 0.0f, true, noInspectorInfo, 10, null));
    }

    /* renamed from: widthIn-VpY3zN4$default */
    public static /* synthetic */ Modifier m609widthInVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m608widthInVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    public static final Modifier wrapContentHeight(@l Modifier modifier, @l Alignment.Vertical vertical, boolean z4) {
        WrapContentElement height;
        Alignment.Companion companion = Alignment.Companion;
        if (l0.g(vertical, companion.getCenterVertically()) && !z4) {
            height = WrapContentHeightCenter;
        } else if (l0.g(vertical, companion.getTop()) && !z4) {
            height = WrapContentHeightTop;
        } else {
            height = WrapContentElement.Companion.height(vertical, z4);
        }
        return modifier.then(height);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return wrapContentHeight(modifier, vertical, z4);
    }

    @Stable
    @l
    public static final Modifier wrapContentSize(@l Modifier modifier, @l Alignment alignment, boolean z4) {
        WrapContentElement size;
        Alignment.Companion companion = Alignment.Companion;
        if (l0.g(alignment, companion.getCenter()) && !z4) {
            size = WrapContentSizeCenter;
        } else if (l0.g(alignment, companion.getTopStart()) && !z4) {
            size = WrapContentSizeTopStart;
        } else {
            size = WrapContentElement.Companion.size(alignment, z4);
        }
        return modifier.then(size);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return wrapContentSize(modifier, alignment, z4);
    }

    @Stable
    @l
    public static final Modifier wrapContentWidth(@l Modifier modifier, @l Alignment.Horizontal horizontal, boolean z4) {
        WrapContentElement width;
        Alignment.Companion companion = Alignment.Companion;
        if (l0.g(horizontal, companion.getCenterHorizontally()) && !z4) {
            width = WrapContentWidthCenter;
        } else if (l0.g(horizontal, companion.getStart()) && !z4) {
            width = WrapContentWidthStart;
        } else {
            width = WrapContentElement.Companion.width(horizontal, z4);
        }
        return modifier.then(width);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return wrapContentWidth(modifier, horizontal, z4);
    }
}
