package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J<\u0010\n\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0002J<\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0002J,\u0010\u0014\u001a\u00020\u0011*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "width", "intrinsicHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/r2;", "onLabelMeasured", "Lv3/l;", "", "singleLine", "Z", "", "animationProgress", "F", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(Lv3/l;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,984:1\n116#2,2:985\n33#2,6:987\n118#2:993\n116#2,2:994\n33#2,6:996\n118#2:1002\n116#2,2:1003\n33#2,6:1005\n118#2:1011\n544#2,2:1012\n33#2,6:1014\n546#2:1020\n116#2,2:1021\n33#2,6:1023\n118#2:1029\n544#2,2:1030\n33#2,6:1032\n546#2:1038\n544#2,2:1039\n33#2,6:1041\n546#2:1047\n116#2,2:1048\n33#2,6:1050\n118#2:1056\n116#2,2:1057\n33#2,6:1059\n118#2:1065\n116#2,2:1066\n33#2,6:1068\n118#2:1074\n116#2,2:1075\n33#2,6:1077\n118#2:1083\n116#2,2:1084\n33#2,6:1086\n118#2:1092\n116#2,2:1093\n33#2,6:1095\n118#2:1101\n116#2,2:1102\n33#2,6:1104\n118#2:1110\n544#2,2:1111\n33#2,6:1113\n546#2:1119\n116#2,2:1120\n33#2,6:1122\n118#2:1128\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n581#1:985,2\n581#1:987,6\n581#1:993\n589#1:994,2\n589#1:996,6\n589#1:1002\n608#1:1003,2\n608#1:1005,6\n608#1:1011\n625#1:1012,2\n625#1:1014,6\n625#1:1020\n629#1:1021,2\n629#1:1023,6\n629#1:1029\n657#1:1030,2\n657#1:1032,6\n657#1:1038\n726#1:1039,2\n726#1:1041,6\n726#1:1047\n727#1:1048,2\n727#1:1050,6\n727#1:1056\n730#1:1057,2\n730#1:1059,6\n730#1:1065\n733#1:1066,2\n733#1:1068,6\n733#1:1074\n736#1:1075,2\n736#1:1077,6\n736#1:1083\n758#1:1084,2\n758#1:1086,6\n758#1:1092\n762#1:1093,2\n762#1:1095,6\n762#1:1101\n767#1:1102,2\n767#1:1104,6\n767#1:1110\n772#1:1111,2\n772#1:1113,6\n772#1:1119\n773#1:1120,2\n773#1:1122,6\n773#1:1128\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @l
    private final v3.l<Size, r2> onLabelMeasured;

    @l
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(@l v3.l<? super Size, r2> lVar, boolean z4, float f5, @l PaddingValues paddingValues) {
        this.onLabelMeasured = lVar;
        this.singleLine = z4;
        this.animationProgress = f5;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i5, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i6;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i8;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i9;
        int m1394calculateHeightO3s9Psw;
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            intrinsicMeasurable = null;
            if (i11 < size) {
                intrinsicMeasurable2 = list.get(i11);
                if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Leading")) {
                    break;
                }
                i11++;
            } else {
                intrinsicMeasurable2 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable2;
        if (intrinsicMeasurable5 != null) {
            i6 = i5 - intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE);
            i7 = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i5)).intValue();
        } else {
            i6 = i5;
            i7 = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 < size2) {
                intrinsicMeasurable3 = list.get(i12);
                if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                    break;
                }
                i12++;
            } else {
                intrinsicMeasurable3 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable3;
        if (intrinsicMeasurable6 != null) {
            i6 -= intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE);
            i8 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i5)).intValue();
        } else {
            i8 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size3) {
                intrinsicMeasurable4 = list.get(i13);
                if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Label")) {
                    break;
                }
                i13++;
            } else {
                intrinsicMeasurable4 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable4;
        if (intrinsicMeasurable7 != null) {
            i9 = pVar.invoke(intrinsicMeasurable7, Integer.valueOf(MathHelpersKt.lerp(i6, i5, this.animationProgress))).intValue();
        } else {
            i9 = 0;
        }
        int size4 = list.size();
        for (int i14 = 0; i14 < size4; i14++) {
            IntrinsicMeasurable intrinsicMeasurable8 = list.get(i14);
            if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable8), "TextField")) {
                int intValue = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i6)).intValue();
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i15);
                    if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i15++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                if (intrinsicMeasurable10 != null) {
                    i10 = pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i6)).intValue();
                }
                m1394calculateHeightO3s9Psw = OutlinedTextFieldKt.m1394calculateHeightO3s9Psw(i7, i8, intValue, i9, i10, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1394calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i5, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i6;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i8;
        int m1395calculateWidthO3s9Psw;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            IntrinsicMeasurable intrinsicMeasurable5 = list.get(i10);
            if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), "TextField")) {
                int intValue = pVar.invoke(intrinsicMeasurable5, Integer.valueOf(i5)).intValue();
                int size2 = list.size();
                int i11 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i11 < size2) {
                        intrinsicMeasurable2 = list.get(i11);
                        if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                            break;
                        }
                        i11++;
                    } else {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
                if (intrinsicMeasurable6 != null) {
                    i6 = pVar.invoke(intrinsicMeasurable6, Integer.valueOf(i5)).intValue();
                } else {
                    i6 = 0;
                }
                int size3 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        intrinsicMeasurable3 = list.get(i12);
                        if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                            break;
                        }
                        i12++;
                    } else {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
                if (intrinsicMeasurable7 != null) {
                    i7 = pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i5)).intValue();
                } else {
                    i7 = 0;
                }
                int size4 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size4) {
                        intrinsicMeasurable4 = list.get(i13);
                        if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                            break;
                        }
                        i13++;
                    } else {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
                if (intrinsicMeasurable8 != null) {
                    i8 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i5)).intValue();
                } else {
                    i8 = 0;
                }
                int size5 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable9 = list.get(i14);
                    if (l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable9), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable9;
                        break;
                    }
                    i14++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable;
                if (intrinsicMeasurable10 != null) {
                    i9 = pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i5)).intValue();
                }
                m1395calculateWidthO3s9Psw = OutlinedTextFieldKt.m1395calculateWidthO3s9Psw(i8, i7, intValue, i6, i9, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1395calculateWidthO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        Measurable measurable;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        Measurable measurable3;
        Placeable placeable3;
        Measurable measurable4;
        Placeable placeable4;
        int m1395calculateWidthO3s9Psw;
        int m1394calculateHeightO3s9Psw;
        int i5;
        int i6;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                measurable = list.get(i7);
                if (l0.g(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                    break;
                }
                i7++;
            } else {
                measurable = null;
                break;
            }
        }
        Measurable measurable5 = measurable;
        if (measurable5 != null) {
            placeable = measurable5.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable) + 0;
        int size2 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size2) {
                measurable2 = list.get(i8);
                if (l0.g(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                    break;
                }
                i8++;
            } else {
                measurable2 = null;
                break;
            }
        }
        Measurable measurable6 = measurable2;
        if (measurable6 != null) {
            placeable2 = measurable6.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo298roundToPx0680j_4(this.paddingValues.mo505calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i9 = -widthOrZero2;
        int i10 = -mo298roundToPx0680j_4;
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, MathHelpersKt.lerp(i9 - mo298roundToPx0680j_42, -mo298roundToPx0680j_42, this.animationProgress), i10);
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size3) {
                measurable3 = list.get(i11);
                if (l0.g(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                    break;
                }
                i11++;
            } else {
                measurable3 = null;
                break;
            }
        }
        Measurable measurable7 = measurable3;
        if (measurable7 != null) {
            placeable3 = measurable7.mo4998measureBRTryo0(m6016offsetNN6EwU);
        } else {
            placeable3 = null;
        }
        if (placeable3 != null) {
            this.onLabelMeasured.invoke(Size.m3550boximpl(SizeKt.Size(placeable3.getWidth(), placeable3.getHeight())));
        }
        long m5991copyZbe2FdA$default2 = Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6016offsetNN6EwU(j5, i9, i10 - Math.max(TextFieldImplKt.heightOrZero(placeable3) / 2, measureScope.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        for (int i12 = 0; i12 < size4; i12++) {
            Measurable measurable8 = list.get(i12);
            if (l0.g(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                Placeable mo4998measureBRTryo0 = measurable8.mo4998measureBRTryo0(m5991copyZbe2FdA$default2);
                long m5991copyZbe2FdA$default3 = Constraints.m5991copyZbe2FdA$default(m5991copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size5) {
                        measurable4 = list.get(i13);
                        int i14 = size5;
                        if (l0.g(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                            break;
                        }
                        i13++;
                        size5 = i14;
                    } else {
                        measurable4 = null;
                        break;
                    }
                }
                Measurable measurable9 = measurable4;
                if (measurable9 != null) {
                    placeable4 = measurable9.mo4998measureBRTryo0(m5991copyZbe2FdA$default3);
                } else {
                    placeable4 = null;
                }
                m1395calculateWidthO3s9Psw = OutlinedTextFieldKt.m1395calculateWidthO3s9Psw(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo4998measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), this.animationProgress, j5, measureScope.getDensity(), this.paddingValues);
                m1394calculateHeightO3s9Psw = OutlinedTextFieldKt.m1394calculateHeightO3s9Psw(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), mo4998measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), this.animationProgress, j5, measureScope.getDensity(), this.paddingValues);
                int size6 = list.size();
                for (int i15 = 0; i15 < size6; i15++) {
                    Measurable measurable10 = list.get(i15);
                    if (l0.g(LayoutIdKt.getLayoutId(measurable10), OutlinedTextFieldKt.BorderId)) {
                        if (m1395calculateWidthO3s9Psw != Integer.MAX_VALUE) {
                            i5 = m1395calculateWidthO3s9Psw;
                        } else {
                            i5 = 0;
                        }
                        if (m1394calculateHeightO3s9Psw != Integer.MAX_VALUE) {
                            i6 = m1394calculateHeightO3s9Psw;
                        } else {
                            i6 = 0;
                        }
                        return MeasureScope.layout$default(measureScope, m1395calculateWidthO3s9Psw, m1394calculateHeightO3s9Psw, null, new OutlinedTextFieldMeasurePolicy$measure$2(m1394calculateHeightO3s9Psw, m1395calculateWidthO3s9Psw, placeable, placeable2, mo4998measureBRTryo0, placeable3, placeable4, measurable10.mo4998measureBRTryo0(ConstraintsKt.Constraints(i5, m1395calculateWidthO3s9Psw, i6, m1394calculateHeightO3s9Psw)), this, measureScope), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
