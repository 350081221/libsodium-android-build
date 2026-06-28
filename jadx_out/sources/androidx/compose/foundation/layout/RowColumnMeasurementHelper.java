package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u0010\u0013\u001a\u000206\u0012\u0006\u0010;\u001a\u00020:\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?\u0012\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E¢\u0006\u0004\bL\u0010MJ(\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\n\u0010\u0012\u001a\u00020\u0002*\u00020\tJ\n\u0010\u0013\u001a\u00020\u0002*\u00020\tJ0\u0010\u001b\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u00102\u001a\u0002018\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0013\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0017\u0010;\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "", "", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/foundation/layout/RowColumnParentData;", "parentData", "crossAxisLayoutSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeCrossAxisAlignmentLine", "getCrossAxisPosition", "mainAxisSize", "crossAxisSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "startIndex", "endIndex", "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing-_EkL_-Y", "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;", "measureWithoutPlacing", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placeableScope", "measureResult", "crossAxisOffset", "Lkotlin/r2;", "placeHelper", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "getOrientation", "()Landroidx/compose/foundation/layout/LayoutOrientation;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "F", "getArrangementSpacing-D9Ej5fM", "()F", "Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/SizeMode;", "getCrossAxisSize", "()Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Ljava/util/List;", "getMeasurables", "()Ljava/util/List;", "", "placeables", "[Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "()[Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "[Landroidx/compose/foundation/layout/RowColumnParentData;", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n322#2:396\n322#2:397\n322#2:398\n321#2:399\n322#2:400\n321#2:401\n324#2:403\n322#2:404\n321#2:405\n322#2:406\n321#2:407\n324#2:408\n324#2:409\n323#2:410\n1#3:402\n*S KotlinDebug\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n*L\n111#1:396\n143#1:397\n144#1:398\n146#1:399\n166#1:400\n167#1:401\n210#1:403\n219#1:404\n220#1:405\n243#1:406\n282#1:407\n284#1:408\n287#1:409\n292#1:410\n*E\n"})
/* loaded from: classes.dex */
public final class RowColumnMeasurementHelper {
    public static final int $stable = 8;
    private final float arrangementSpacing;

    @l
    private final CrossAxisAlignment crossAxisAlignment;

    @l
    private final SizeMode crossAxisSize;

    @m
    private final Arrangement.Horizontal horizontalArrangement;

    @l
    private final List<Measurable> measurables;

    @l
    private final LayoutOrientation orientation;

    @l
    private final Placeable[] placeables;

    @l
    private final RowColumnParentData[] rowColumnParentData;

    @m
    private final Arrangement.Vertical verticalArrangement;

    /* JADX WARN: Multi-variable type inference failed */
    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List<? extends Measurable> list, Placeable[] placeableArr) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f5;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.measurables = list;
        this.placeables = placeableArr;
        int size = list.size();
        RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size];
        for (int i5 = 0; i5 < size; i5++) {
            rowColumnParentDataArr[i5] = RowColumnImplKt.getRowColumnParentData(this.measurables.get(i5));
        }
        this.rowColumnParentData = rowColumnParentDataArr;
    }

    public /* synthetic */ RowColumnMeasurementHelper(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, List list, Placeable[] placeableArr, w wVar) {
        this(layoutOrientation, horizontal, vertical, f5, sizeMode, crossAxisAlignment, list, placeableArr);
    }

    private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData rowColumnParentData, int i5, LayoutDirection layoutDirection, int i6) {
        CrossAxisAlignment crossAxisAlignment;
        if (rowColumnParentData == null || (crossAxisAlignment = rowColumnParentData.getCrossAxisAlignment()) == null) {
            crossAxisAlignment = this.crossAxisAlignment;
        }
        int crossAxisSize = i5 - crossAxisSize(placeable);
        if (this.orientation == LayoutOrientation.Horizontal) {
            layoutDirection = LayoutDirection.Ltr;
        }
        return crossAxisAlignment.align$foundation_layout_release(crossAxisSize, layoutDirection, placeable, i6);
    }

    private final int[] mainAxisPositions(int i5, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        if (this.orientation == LayoutOrientation.Vertical) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical != null) {
                vertical.arrange(measureScope, i5, iArr, iArr2);
            } else {
                throw new IllegalArgumentException("null verticalArrangement in Column".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal != null) {
                horizontal.arrange(measureScope, i5, iArr, measureScope.getLayoutDirection(), iArr2);
            } else {
                throw new IllegalArgumentException("null horizontalArrangement in Row".toString());
            }
        }
        return iArr2;
    }

    public final int crossAxisSize(@l Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getArrangementSpacing-D9Ej5fM, reason: not valid java name */
    public final float m581getArrangementSpacingD9Ej5fM() {
        return this.arrangementSpacing;
    }

    @l
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @l
    public final SizeMode getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @m
    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @l
    public final List<Measurable> getMeasurables() {
        return this.measurables;
    }

    @l
    public final LayoutOrientation getOrientation() {
        return this.orientation;
    }

    @l
    public final Placeable[] getPlaceables() {
        return this.placeables;
    }

    @m
    public final Arrangement.Vertical getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final int mainAxisSize(@l Placeable placeable) {
        return this.orientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    @l
    /* renamed from: measureWithoutPlacing-_EkL_-Y, reason: not valid java name */
    public final RowColumnMeasureHelperResult m582measureWithoutPlacing_EkL_Y(@l MeasureScope measureScope, long j5, int i5, int i6) {
        int m6002getMinWidthimpl;
        long v4;
        float f5;
        int i7;
        String str;
        String str2;
        float f6;
        String str3;
        String str4;
        String str5;
        long j6;
        String str6;
        String str7;
        String str8;
        int i8;
        RowColumnMeasurementHelper rowColumnMeasurementHelper;
        long K;
        int i9;
        long j7;
        String str9;
        long j8;
        String str10;
        long j9;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i10;
        String str17;
        boolean z4;
        int V;
        int L0;
        float f7;
        int i11;
        int i12;
        boolean z5;
        int L02;
        RowColumnMeasurementHelper rowColumnMeasurementHelper2;
        int i13;
        int i14;
        long v5;
        int max;
        Integer num;
        long j10;
        float f8;
        int i15;
        int i16;
        int i17;
        long v6;
        float f9;
        int i18;
        int i19;
        long j11;
        long v7;
        int i20;
        RowColumnMeasurementHelper rowColumnMeasurementHelper3 = this;
        int i21 = i6;
        long m522constructorimpl = OrientationIndependentConstraints.m522constructorimpl(j5, rowColumnMeasurementHelper3.orientation);
        long mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(rowColumnMeasurementHelper3.arrangementSpacing);
        int i22 = i21 - i5;
        int i23 = i5;
        float f10 = 0.0f;
        long j12 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z6 = false;
        while (true) {
            boolean z7 = true;
            if (i23 >= i21) {
                break;
            }
            Measurable measurable = rowColumnMeasurementHelper3.measurables.get(i23);
            RowColumnParentData rowColumnParentData = rowColumnMeasurementHelper3.rowColumnParentData[i23];
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            if (weight > 0.0f) {
                f8 = f10 + weight;
                i15 = i24 + 1;
                i16 = i23;
            } else {
                int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(m522constructorimpl);
                Placeable placeable = rowColumnMeasurementHelper3.placeables[i23];
                if (placeable == null) {
                    if (m6000getMaxWidthimpl == Integer.MAX_VALUE) {
                        f9 = f10;
                        i18 = i24;
                        i19 = m6000getMaxWidthimpl;
                        i20 = Integer.MAX_VALUE;
                        j11 = 0;
                    } else {
                        f9 = f10;
                        i18 = i24;
                        i19 = m6000getMaxWidthimpl;
                        j11 = 0;
                        v7 = u.v(m6000getMaxWidthimpl - j12, 0L);
                        i20 = (int) v7;
                    }
                    j10 = j12;
                    f8 = f9;
                    i15 = i18;
                    i16 = i23;
                    i17 = i19;
                    placeable = measurable.mo4998measureBRTryo0(OrientationIndependentConstraints.m535toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m524copyyUG9Ft0$default(m522constructorimpl, 0, i20, 0, 0, 8, null), rowColumnMeasurementHelper3.orientation));
                } else {
                    j10 = j12;
                    f8 = f10;
                    i15 = i24;
                    i16 = i23;
                    i17 = m6000getMaxWidthimpl;
                }
                long j13 = j10;
                v6 = u.v((i17 - j13) - rowColumnMeasurementHelper3.mainAxisSize(placeable), 0L);
                int min = Math.min((int) mo298roundToPx0680j_4, (int) v6);
                j12 = rowColumnMeasurementHelper3.mainAxisSize(placeable) + min + j13;
                int max2 = Math.max(i26, rowColumnMeasurementHelper3.crossAxisSize(placeable));
                if (!z6 && !RowColumnImplKt.isRelative(rowColumnParentData)) {
                    z7 = false;
                }
                rowColumnMeasurementHelper3.placeables[i16] = placeable;
                i25 = min;
                i26 = max2;
                z6 = z7;
            }
            i23 = i16 + 1;
            f10 = f8;
            i24 = i15;
        }
        long j14 = j12;
        float f11 = f10;
        int i27 = i24;
        if (i27 == 0) {
            j7 = j14 - i25;
            rowColumnMeasurementHelper = rowColumnMeasurementHelper3;
            i7 = i22;
            i8 = i26;
            i9 = 0;
        } else {
            float f12 = f11;
            if (f12 > 0.0f && Constraints.m6000getMaxWidthimpl(m522constructorimpl) != Integer.MAX_VALUE) {
                m6002getMinWidthimpl = Constraints.m6000getMaxWidthimpl(m522constructorimpl);
            } else {
                m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(m522constructorimpl);
            }
            long j15 = (i27 - 1) * mo298roundToPx0680j_4;
            v4 = u.v((m6002getMinWidthimpl - j14) - j15, 0L);
            if (f12 > 0.0f) {
                f5 = ((float) v4) / f12;
            } else {
                f5 = 0.0f;
            }
            int i28 = i5;
            long j16 = v4;
            while (true) {
                i7 = i22;
                str = "weightedSize ";
                str2 = "weightUnitSpace ";
                f6 = f12;
                str3 = "fixedSpace ";
                str4 = "totalWeight ";
                str5 = "weightChildrenCount ";
                j6 = v4;
                str6 = "arrangementSpacingPx ";
                str7 = "targetSpace ";
                str8 = "remainingToTarget ";
                if (i28 >= i21) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(rowColumnMeasurementHelper3.rowColumnParentData[i28]);
                float f13 = f5 * weight2;
                try {
                    L02 = kotlin.math.d.L0(f13);
                    j16 -= L02;
                    i28++;
                    rowColumnMeasurementHelper3 = this;
                    i22 = i7;
                    i21 = i6;
                    v4 = j6;
                    f12 = f6;
                } catch (IllegalArgumentException e5) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + Constraints.m6000getMaxWidthimpl(m522constructorimpl) + "mainAxisMin " + Constraints.m6002getMinWidthimpl(m522constructorimpl) + "targetSpace " + m6002getMinWidthimpl + "arrangementSpacingPx " + mo298roundToPx0680j_4 + "weightChildrenCount " + i27 + "fixedSpace " + j14 + "arrangementSpacingTotal " + j15 + str8 + j6 + str4 + f6 + str2 + f5 + "itemWeight " + weight2 + str + f13).initCause(e5);
                }
            }
            long j17 = j15;
            long j18 = j6;
            long j19 = j14;
            String str18 = "arrangementSpacingTotal ";
            long j20 = mo298roundToPx0680j_4;
            int i29 = i5;
            int i30 = i6;
            i8 = i26;
            int i31 = 0;
            while (i29 < i30) {
                String str19 = str3;
                if (this.placeables[i29] == null) {
                    Measurable measurable2 = this.measurables.get(i29);
                    int i32 = i27;
                    RowColumnParentData rowColumnParentData2 = this.rowColumnParentData[i29];
                    String str20 = str5;
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    if (weight3 > 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        long j21 = j20;
                        V = kotlin.math.d.V(j16);
                        String str21 = str6;
                        String str22 = str7;
                        j16 -= V;
                        float f14 = f5 * weight3;
                        L0 = kotlin.math.d.L0(f14);
                        int max3 = Math.max(0, L0 + V);
                        try {
                            if (RowColumnImplKt.getFill(rowColumnParentData2) && max3 != Integer.MAX_VALUE) {
                                i12 = max3;
                                i11 = V;
                            } else {
                                i11 = V;
                                i12 = 0;
                            }
                            try {
                                f7 = f14;
                                try {
                                    Placeable mo4998measureBRTryo0 = measurable2.mo4998measureBRTryo0(OrientationIndependentConstraints.m535toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m520constructorimpl(i12, max3, 0, Constraints.m5999getMaxHeightimpl(m522constructorimpl)), this.orientation));
                                    i31 += mainAxisSize(mo4998measureBRTryo0);
                                    i8 = Math.max(i8, crossAxisSize(mo4998measureBRTryo0));
                                    if (!z6 && !RowColumnImplKt.isRelative(rowColumnParentData2)) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    this.placeables[i29] = mo4998measureBRTryo0;
                                    z6 = z5;
                                    str10 = str22;
                                    str13 = str;
                                    str15 = str4;
                                    j9 = j19;
                                    str9 = str21;
                                    j20 = j21;
                                    str12 = str19;
                                    str17 = str18;
                                    str11 = str20;
                                    str14 = str2;
                                    str16 = str8;
                                    j8 = j18;
                                    i10 = i32;
                                } catch (IllegalArgumentException e6) {
                                    e = e6;
                                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + Constraints.m6000getMaxWidthimpl(m522constructorimpl) + "mainAxisMin " + Constraints.m6002getMinWidthimpl(m522constructorimpl) + str22 + m6002getMinWidthimpl + str21 + j21 + str20 + i32 + str19 + j19 + str18 + j17 + str8 + j18 + str4 + f6 + str2 + f5 + "weight " + weight3 + str + f7 + "remainderUnit " + i11 + "childMainAxisSize " + max3).initCause(e);
                                }
                            } catch (IllegalArgumentException e7) {
                                e = e7;
                                f7 = f14;
                            }
                        } catch (IllegalArgumentException e8) {
                            e = e8;
                            f7 = f14;
                            i11 = V;
                        }
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    str9 = str6;
                    j8 = j18;
                    int i33 = i27;
                    str10 = str7;
                    j9 = j19;
                    str11 = str5;
                    str12 = str19;
                    str13 = str;
                    str14 = str2;
                    str15 = str4;
                    str16 = str8;
                    i10 = i33;
                    str17 = str18;
                }
                i29++;
                i30 = i6;
                j17 = j17;
                j18 = j8;
                str18 = str17;
                str4 = str15;
                str = str13;
                str5 = str11;
                long j22 = j9;
                str7 = str10;
                str6 = str9;
                str3 = str12;
                i27 = i10;
                j19 = j22;
                str8 = str16;
                str2 = str14;
            }
            rowColumnMeasurementHelper = this;
            long j23 = j19;
            K = u.K(i31 + j17, 0L, Constraints.m6000getMaxWidthimpl(m522constructorimpl) - j23);
            i9 = (int) K;
            j7 = j23;
        }
        if (z6) {
            rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
            i13 = 0;
            i14 = 0;
            for (int i34 = i5; i34 < i6; i34++) {
                Placeable placeable2 = rowColumnMeasurementHelper2.placeables[i34];
                l0.m(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(rowColumnMeasurementHelper2.rowColumnParentData[i34]);
                if (crossAxisAlignment != null) {
                    num = crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2);
                } else {
                    num = null;
                }
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = 0;
                    }
                    i13 = Math.max(i13, intValue);
                    int crossAxisSize = rowColumnMeasurementHelper2.crossAxisSize(placeable2);
                    int intValue2 = num.intValue();
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = rowColumnMeasurementHelper2.crossAxisSize(placeable2);
                    }
                    i14 = Math.max(i14, crossAxisSize - intValue2);
                }
            }
        } else {
            rowColumnMeasurementHelper2 = rowColumnMeasurementHelper;
            i13 = 0;
            i14 = 0;
        }
        v5 = u.v(j7 + i9, 0L);
        int max4 = Math.max((int) v5, Constraints.m6002getMinWidthimpl(m522constructorimpl));
        if (Constraints.m5999getMaxHeightimpl(m522constructorimpl) != Integer.MAX_VALUE && rowColumnMeasurementHelper2.crossAxisSize == SizeMode.Expand) {
            max = Constraints.m5999getMaxHeightimpl(m522constructorimpl);
        } else {
            max = Math.max(i8, Math.max(Constraints.m6001getMinHeightimpl(m522constructorimpl), i14 + i13));
        }
        int i35 = max;
        int i36 = i7;
        int[] iArr = new int[i36];
        for (int i37 = 0; i37 < i36; i37++) {
            iArr[i37] = 0;
        }
        int[] iArr2 = new int[i36];
        for (int i38 = 0; i38 < i36; i38++) {
            Placeable placeable3 = rowColumnMeasurementHelper2.placeables[i38 + i5];
            l0.m(placeable3);
            iArr2[i38] = rowColumnMeasurementHelper2.mainAxisSize(placeable3);
        }
        return new RowColumnMeasureHelperResult(i35, max4, i5, i6, i13, rowColumnMeasurementHelper2.mainAxisPositions(max4, iArr2, iArr, measureScope));
    }

    public final void placeHelper(@l Placeable.PlacementScope placementScope, @l RowColumnMeasureHelperResult rowColumnMeasureHelperResult, int i5, @l LayoutDirection layoutDirection) {
        RowColumnParentData rowColumnParentData;
        int endIndex = rowColumnMeasureHelperResult.getEndIndex();
        for (int startIndex = rowColumnMeasureHelperResult.getStartIndex(); startIndex < endIndex; startIndex++) {
            Placeable placeable = this.placeables[startIndex];
            l0.m(placeable);
            int[] mainAxisPositions = rowColumnMeasureHelperResult.getMainAxisPositions();
            Object parentData = this.measurables.get(startIndex).getParentData();
            if (parentData instanceof RowColumnParentData) {
                rowColumnParentData = (RowColumnParentData) parentData;
            } else {
                rowColumnParentData = null;
            }
            int crossAxisPosition = getCrossAxisPosition(placeable, rowColumnParentData, rowColumnMeasureHelperResult.getCrossAxisSize(), layoutDirection, rowColumnMeasureHelperResult.getBeforeCrossAxisAlignmentLine()) + i5;
            if (this.orientation == LayoutOrientation.Horizontal) {
                Placeable.PlacementScope.place$default(placementScope, placeable, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], crossAxisPosition, 0.0f, 4, null);
            } else {
                Placeable.PlacementScope.place$default(placementScope, placeable, crossAxisPosition, mainAxisPositions[startIndex - rowColumnMeasureHelperResult.getStartIndex()], 0.0f, 4, null);
            }
        }
    }
}
