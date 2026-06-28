package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,940:1\n116#2,2:941\n33#2,6:943\n118#2:949\n116#2,2:950\n33#2,6:952\n118#2:958\n116#2,2:959\n33#2,6:961\n118#2:967\n544#2,2:968\n33#2,6:970\n546#2:976\n116#2,2:977\n33#2,6:979\n118#2:985\n544#2,2:986\n33#2,6:988\n546#2:994\n116#2,2:995\n33#2,6:997\n118#2:1003\n116#2,2:1004\n33#2,6:1006\n118#2:1012\n116#2,2:1013\n33#2,6:1015\n118#2:1021\n116#2,2:1022\n33#2,6:1024\n118#2:1030\n116#2,2:1031\n33#2,6:1033\n118#2:1039\n116#2,2:1040\n33#2,6:1042\n118#2:1048\n116#2,2:1049\n33#2,6:1051\n118#2:1057\n544#2,2:1058\n33#2,6:1060\n546#2:1066\n116#2,2:1067\n33#2,6:1069\n118#2:1075\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n564#1:941,2\n564#1:943,6\n564#1:949\n570#1:950,2\n570#1:952,6\n570#1:958\n583#1:959,2\n583#1:961,6\n583#1:967\n603#1:968,2\n603#1:970,6\n603#1:976\n609#1:977,2\n609#1:979,6\n609#1:985\n708#1:986,2\n708#1:988,6\n708#1:994\n709#1:995,2\n709#1:997,6\n709#1:1003\n712#1:1004,2\n712#1:1006,6\n712#1:1012\n715#1:1013,2\n715#1:1015,6\n715#1:1021\n718#1:1022,2\n718#1:1024,6\n718#1:1030\n737#1:1031,2\n737#1:1033,6\n737#1:1039\n741#1:1040,2\n741#1:1042,6\n741#1:1048\n746#1:1049,2\n746#1:1051,6\n746#1:1057\n751#1:1058,2\n751#1:1060,6\n751#1:1066\n752#1:1067,2\n752#1:1069,6\n752#1:1075\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @l
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z4, float f5, @l PaddingValues paddingValues) {
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
        int i10;
        int m1510calculateHeightO3s9Psw;
        int size = list.size();
        boolean z4 = false;
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
            i9 = pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i6)).intValue();
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
                } else {
                    i10 = 0;
                }
                if (i9 > 0) {
                    z4 = true;
                }
                m1510calculateHeightO3s9Psw = TextFieldKt.m1510calculateHeightO3s9Psw(intValue, z4, i9, i7, i8, i10, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1510calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i5, p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i6;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i8;
        int m1511calculateWidthVsPV1Ek;
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
                m1511calculateWidthVsPV1Ek = TextFieldKt.m1511calculateWidthVsPV1Ek(i8, i7, intValue, i6, i9, TextFieldImplKt.getZeroConstraints());
                return m1511calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(list, i5, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
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
        int i5;
        int i6;
        Measurable measurable4;
        Placeable placeable4;
        int m1511calculateWidthVsPV1Ek;
        boolean z4;
        int m1510calculateHeightO3s9Psw;
        List<? extends Measurable> list2 = list;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM());
        int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
        int mo298roundToPx0680j_43 = measureScope.mo298roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                measurable = list2.get(i7);
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
                measurable2 = list2.get(i8);
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
        int i9 = -mo298roundToPx0680j_42;
        int i10 = -(widthOrZero + TextFieldImplKt.widthOrZero(placeable2));
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, i10, i9);
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size3) {
                measurable3 = list2.get(i11);
                int i12 = size3;
                if (l0.g(LayoutIdKt.getLayoutId(measurable3), "Label")) {
                    break;
                }
                i11++;
                size3 = i12;
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
            i5 = placeable3.get(AlignmentLineKt.getLastBaseline());
            if (i5 == Integer.MIN_VALUE) {
                i5 = placeable3.getHeight();
            }
        } else {
            i5 = 0;
        }
        int max = Math.max(i5, mo298roundToPx0680j_4);
        if (placeable3 != null) {
            i6 = (i9 - mo298roundToPx0680j_43) - max;
        } else {
            i6 = (-mo298roundToPx0680j_4) - mo298roundToPx0680j_42;
        }
        long m6016offsetNN6EwU2 = ConstraintsKt.m6016offsetNN6EwU(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null), i10, i6);
        int size4 = list.size();
        int i13 = 0;
        while (i13 < size4) {
            Measurable measurable8 = list2.get(i13);
            int i14 = size4;
            if (l0.g(LayoutIdKt.getLayoutId(measurable8), "TextField")) {
                Placeable mo4998measureBRTryo0 = measurable8.mo4998measureBRTryo0(m6016offsetNN6EwU2);
                long m5991copyZbe2FdA$default2 = Constraints.m5991copyZbe2FdA$default(m6016offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size5) {
                        measurable4 = list2.get(i15);
                        int i16 = size5;
                        if (l0.g(LayoutIdKt.getLayoutId(measurable4), "Hint")) {
                            break;
                        }
                        i15++;
                        list2 = list;
                        size5 = i16;
                    } else {
                        measurable4 = null;
                        break;
                    }
                }
                Measurable measurable9 = measurable4;
                if (measurable9 != null) {
                    placeable4 = measurable9.mo4998measureBRTryo0(m5991copyZbe2FdA$default2);
                } else {
                    placeable4 = null;
                }
                m1511calculateWidthVsPV1Ek = TextFieldKt.m1511calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), mo4998measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), j5);
                int height = mo4998measureBRTryo0.getHeight();
                if (placeable3 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                m1510calculateHeightO3s9Psw = TextFieldKt.m1510calculateHeightO3s9Psw(height, z4, max, TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable4), j5, measureScope.getDensity(), this.paddingValues);
                return MeasureScope.layout$default(measureScope, m1511calculateWidthVsPV1Ek, m1510calculateHeightO3s9Psw, null, new TextFieldMeasurePolicy$measure$1(placeable3, mo298roundToPx0680j_4, i5, m1511calculateWidthVsPV1Ek, m1510calculateHeightO3s9Psw, mo4998measureBRTryo0, placeable4, placeable, placeable2, this, max, mo298roundToPx0680j_43, measureScope), 4, null);
            }
            i13++;
            list2 = list;
            size4 = i14;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(list, i5, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
