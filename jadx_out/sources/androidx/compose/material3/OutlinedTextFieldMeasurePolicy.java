package androidx.compose.material3;

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
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J<\u0010\n\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0002J<\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\u0002J,\u0010\u0014\u001a\u00020\u0011*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\"\u0010\u0017\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "intrinsicWidth", "width", "intrinsicHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "maxIntrinsicHeight", "minIntrinsicHeight", "maxIntrinsicWidth", "minIntrinsicWidth", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/r2;", "onLabelMeasured", "Lv3/l;", "", "singleLine", "Z", "", "animationProgress", "F", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(Lv3/l;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1156:1\n116#2,2:1157\n33#2,6:1159\n118#2:1165\n116#2,2:1166\n33#2,6:1168\n118#2:1174\n116#2,2:1175\n33#2,6:1177\n118#2:1183\n116#2,2:1184\n33#2,6:1186\n118#2:1192\n116#2,2:1193\n33#2,6:1195\n118#2:1201\n116#2,2:1202\n33#2,6:1204\n118#2:1210\n544#2,2:1211\n33#2,6:1213\n546#2:1219\n116#2,2:1220\n33#2,6:1222\n118#2:1228\n544#2,2:1229\n33#2,6:1231\n546#2:1237\n544#2,2:1238\n33#2,6:1240\n546#2:1246\n116#2,2:1247\n33#2,6:1249\n118#2:1255\n116#2,2:1256\n33#2,6:1258\n118#2:1264\n116#2,2:1265\n33#2,6:1267\n118#2:1273\n116#2,2:1274\n33#2,6:1276\n118#2:1282\n116#2,2:1283\n33#2,6:1285\n118#2:1291\n116#2,2:1292\n33#2,6:1294\n118#2:1300\n116#2,2:1301\n33#2,6:1303\n118#2:1309\n116#2,2:1310\n33#2,6:1312\n118#2:1318\n116#2,2:1319\n33#2,6:1321\n118#2:1327\n116#2,2:1328\n33#2,6:1330\n118#2:1336\n116#2,2:1337\n33#2,6:1339\n118#2:1345\n544#2,2:1346\n33#2,6:1348\n546#2:1354\n116#2,2:1355\n33#2,6:1357\n118#2:1363\n116#2,2:1364\n33#2,6:1366\n118#2:1372\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n653#1:1157,2\n653#1:1159,6\n653#1:1165\n660#1:1166,2\n660#1:1168,6\n660#1:1174\n666#1:1175,2\n666#1:1177,6\n666#1:1183\n672#1:1184,2\n672#1:1186,6\n672#1:1192\n690#1:1193,2\n690#1:1195,6\n690#1:1201\n697#1:1202,2\n697#1:1204,6\n697#1:1210\n711#1:1211,2\n711#1:1213,6\n711#1:1219\n715#1:1220,2\n715#1:1222,6\n715#1:1228\n763#1:1229,2\n763#1:1231,6\n763#1:1237\n835#1:1238,2\n835#1:1240,6\n835#1:1246\n836#1:1247,2\n836#1:1249,6\n836#1:1255\n839#1:1256,2\n839#1:1258,6\n839#1:1264\n842#1:1265,2\n842#1:1267,6\n842#1:1273\n845#1:1274,2\n845#1:1276,6\n845#1:1282\n848#1:1283,2\n848#1:1285,6\n848#1:1291\n851#1:1292,2\n851#1:1294,6\n851#1:1300\n875#1:1301,2\n875#1:1303,6\n875#1:1309\n881#1:1310,2\n881#1:1312,6\n881#1:1318\n888#1:1319,2\n888#1:1321,6\n888#1:1327\n892#1:1328,2\n892#1:1330,6\n892#1:1336\n899#1:1337,2\n899#1:1339,6\n899#1:1345\n908#1:1346,2\n908#1:1348,6\n908#1:1354\n910#1:1355,2\n910#1:1357,6\n910#1:1363\n914#1:1364,2\n914#1:1366,6\n914#1:1372\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @p4.l
    private final v3.l<Size, r2> onLabelMeasured;

    @p4.l
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(@p4.l v3.l<? super Size, r2> lVar, boolean z4, float f5, @p4.l PaddingValues paddingValues) {
        this.onLabelMeasured = lVar;
        this.singleLine = z4;
        this.animationProgress = f5;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i5, v3.p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i6;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i8;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i9;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i10;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i11;
        IntrinsicMeasurable intrinsicMeasurable6;
        int i12;
        IntrinsicMeasurable intrinsicMeasurable7;
        int i13;
        int m2062calculateHeightmKXJcVc;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size) {
                intrinsicMeasurable = list.get(i14);
                if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "Leading")) {
                    break;
                }
                i14++;
            } else {
                intrinsicMeasurable = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            i6 = OutlinedTextFieldKt.substractConstraintSafely(i5, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            i7 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i5)).intValue();
        } else {
            i6 = i5;
            i7 = 0;
        }
        int size2 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 < size2) {
                intrinsicMeasurable2 = list.get(i15);
                if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Trailing")) {
                    break;
                }
                i15++;
            } else {
                intrinsicMeasurable2 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            i6 = OutlinedTextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            i8 = pVar.invoke(intrinsicMeasurable9, Integer.valueOf(i5)).intValue();
        } else {
            i8 = 0;
        }
        int size3 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size3) {
                intrinsicMeasurable3 = list.get(i16);
                if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Label")) {
                    break;
                }
                i16++;
            } else {
                intrinsicMeasurable3 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        if (intrinsicMeasurable10 != null) {
            i9 = pVar.invoke(intrinsicMeasurable10, Integer.valueOf(MathHelpersKt.lerp(i6, i5, this.animationProgress))).intValue();
        } else {
            i9 = 0;
        }
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 < size4) {
                intrinsicMeasurable4 = list.get(i17);
                if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                    break;
                }
                i17++;
            } else {
                intrinsicMeasurable4 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            i10 = pVar.invoke(intrinsicMeasurable11, Integer.valueOf(i6)).intValue();
            i6 = OutlinedTextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i10 = 0;
        }
        int size5 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size5) {
                intrinsicMeasurable5 = list.get(i18);
                if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                    break;
                }
                i18++;
            } else {
                intrinsicMeasurable5 = null;
                break;
            }
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            int intValue = pVar.invoke(intrinsicMeasurable12, Integer.valueOf(i6)).intValue();
            i6 = OutlinedTextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
            i11 = intValue;
        } else {
            i11 = 0;
        }
        int size6 = list.size();
        for (int i19 = 0; i19 < size6; i19++) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i19);
            if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), "TextField")) {
                int intValue2 = pVar.invoke(intrinsicMeasurable13, Integer.valueOf(i6)).intValue();
                int size7 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size7) {
                        intrinsicMeasurable6 = list.get(i20);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), "Hint")) {
                            break;
                        }
                        i20++;
                    } else {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                if (intrinsicMeasurable14 != null) {
                    i12 = pVar.invoke(intrinsicMeasurable14, Integer.valueOf(i6)).intValue();
                } else {
                    i12 = 0;
                }
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size8) {
                        IntrinsicMeasurable intrinsicMeasurable15 = list.get(i21);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable15), TextFieldImplKt.SupportingId)) {
                            intrinsicMeasurable7 = intrinsicMeasurable15;
                            break;
                        }
                        i21++;
                    } else {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable16 = intrinsicMeasurable7;
                if (intrinsicMeasurable16 != null) {
                    i13 = pVar.invoke(intrinsicMeasurable16, Integer.valueOf(i5)).intValue();
                } else {
                    i13 = 0;
                }
                m2062calculateHeightmKXJcVc = OutlinedTextFieldKt.m2062calculateHeightmKXJcVc(i7, i8, i10, i11, intValue2, i9, i12, i13, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2062calculateHeightmKXJcVc;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i5, v3.p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i6;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i7;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i8;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i9;
        IntrinsicMeasurable intrinsicMeasurable6;
        int i10;
        int m2063calculateWidthDHJA7U0;
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i12);
            if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), "TextField")) {
                int intValue = pVar.invoke(intrinsicMeasurable7, Integer.valueOf(i5)).intValue();
                int size2 = list.size();
                int i13 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i13 < size2) {
                        intrinsicMeasurable2 = list.get(i13);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "Label")) {
                            break;
                        }
                        i13++;
                    } else {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                if (intrinsicMeasurable8 != null) {
                    i6 = pVar.invoke(intrinsicMeasurable8, Integer.valueOf(i5)).intValue();
                } else {
                    i6 = 0;
                }
                int size3 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size3) {
                        intrinsicMeasurable3 = list.get(i14);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), "Trailing")) {
                            break;
                        }
                        i14++;
                    } else {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                if (intrinsicMeasurable9 != null) {
                    i7 = pVar.invoke(intrinsicMeasurable9, Integer.valueOf(i5)).intValue();
                } else {
                    i7 = 0;
                }
                int size4 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size4) {
                        intrinsicMeasurable4 = list.get(i15);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), "Leading")) {
                            break;
                        }
                        i15++;
                    } else {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                if (intrinsicMeasurable10 != null) {
                    i8 = pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i5)).intValue();
                } else {
                    i8 = 0;
                }
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size5) {
                        intrinsicMeasurable5 = list.get(i16);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                            break;
                        }
                        i16++;
                    } else {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                if (intrinsicMeasurable11 != null) {
                    i9 = pVar.invoke(intrinsicMeasurable11, Integer.valueOf(i5)).intValue();
                } else {
                    i9 = 0;
                }
                int size6 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size6) {
                        intrinsicMeasurable6 = list.get(i17);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                            break;
                        }
                        i17++;
                    } else {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                if (intrinsicMeasurable12 != null) {
                    i10 = pVar.invoke(intrinsicMeasurable12, Integer.valueOf(i5)).intValue();
                } else {
                    i10 = 0;
                }
                int size7 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i18);
                    if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), "Hint")) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i18++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                if (intrinsicMeasurable14 != null) {
                    i11 = pVar.invoke(intrinsicMeasurable14, Integer.valueOf(i5)).intValue();
                }
                m2063calculateWidthDHJA7U0 = OutlinedTextFieldKt.m2063calculateWidthDHJA7U0(i8, i7, i9, i10, intValue, i6, i11, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2063calculateWidthDHJA7U0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @p4.l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@p4.l MeasureScope measureScope, @p4.l List<? extends Measurable> list, long j5) {
        Measurable measurable;
        Placeable placeable;
        Measurable measurable2;
        Placeable placeable2;
        Measurable measurable3;
        Placeable placeable3;
        Measurable measurable4;
        Placeable placeable4;
        Measurable measurable5;
        Placeable placeable5;
        Measurable measurable6;
        int i5;
        Measurable measurable7;
        Placeable placeable6;
        int m2063calculateWidthDHJA7U0;
        Placeable placeable7;
        int m2062calculateHeightmKXJcVc;
        int i6;
        int i7;
        List<? extends Measurable> list2 = list;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
        long m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                measurable = list2.get(i8);
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable), "Leading")) {
                    break;
                }
                i8++;
            } else {
                measurable = null;
                break;
            }
        }
        Measurable measurable8 = measurable;
        if (measurable8 != null) {
            placeable = measurable8.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        } else {
            placeable = null;
        }
        int widthOrZero = TextFieldImplKt.widthOrZero(placeable) + 0;
        int max = Math.max(0, TextFieldImplKt.heightOrZero(placeable));
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 < size2) {
                measurable2 = list2.get(i9);
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable2), "Trailing")) {
                    break;
                }
                i9++;
            } else {
                measurable2 = null;
                break;
            }
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            placeable2 = measurable9.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, -widthOrZero, 0, 2, null));
        } else {
            placeable2 = null;
        }
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(placeable2);
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(placeable2));
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size3) {
                measurable3 = list2.get(i10);
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                    break;
                }
                i10++;
            } else {
                measurable3 = null;
                break;
            }
        }
        Measurable measurable10 = measurable3;
        if (measurable10 != null) {
            placeable3 = measurable10.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, -widthOrZero2, 0, 2, null));
        } else {
            placeable3 = null;
        }
        int widthOrZero3 = widthOrZero2 + TextFieldImplKt.widthOrZero(placeable3);
        int max3 = Math.max(max2, TextFieldImplKt.heightOrZero(placeable3));
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 < size4) {
                measurable4 = list2.get(i11);
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                    break;
                }
                i11++;
            } else {
                measurable4 = null;
                break;
            }
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            placeable4 = measurable11.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, -widthOrZero3, 0, 2, null));
        } else {
            placeable4 = null;
        }
        int widthOrZero4 = widthOrZero3 + TextFieldImplKt.widthOrZero(placeable4);
        int max4 = Math.max(max3, TextFieldImplKt.heightOrZero(placeable4));
        int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo504calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo298roundToPx0680j_4(this.paddingValues.mo505calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i12 = -widthOrZero4;
        int i13 = -mo298roundToPx0680j_4;
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, MathHelpersKt.lerp(i12 - mo298roundToPx0680j_42, -mo298roundToPx0680j_42, this.animationProgress), i13);
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 < size5) {
                Measurable measurable12 = list2.get(i14);
                int i15 = size5;
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable12), "Label")) {
                    measurable5 = measurable12;
                    break;
                }
                i14++;
                size5 = i15;
            } else {
                measurable5 = null;
                break;
            }
        }
        Measurable measurable13 = measurable5;
        if (measurable13 != null) {
            placeable5 = measurable13.mo4998measureBRTryo0(m6016offsetNN6EwU);
        } else {
            placeable5 = null;
        }
        if (placeable5 != null) {
            this.onLabelMeasured.invoke(Size.m3550boximpl(SizeKt.Size(placeable5.getWidth(), placeable5.getHeight())));
        }
        int size6 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size6) {
                measurable6 = list2.get(i16);
                int i17 = size6;
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                    break;
                }
                i16++;
                size6 = i17;
            } else {
                measurable6 = null;
                break;
            }
        }
        Measurable measurable14 = measurable6;
        if (measurable14 != null) {
            i5 = measurable14.minIntrinsicHeight(Constraints.m6002getMinWidthimpl(j5));
        } else {
            i5 = 0;
        }
        int max5 = Math.max(TextFieldImplKt.heightOrZero(placeable5) / 2, measureScope.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM()));
        long m5991copyZbe2FdA$default2 = Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6016offsetNN6EwU(j5, i12, (i13 - max5) - i5), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        int i18 = 0;
        while (i18 < size7) {
            int i19 = size7;
            Measurable measurable15 = list2.get(i18);
            int i20 = i18;
            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable15), "TextField")) {
                Placeable mo4998measureBRTryo0 = measurable15.mo4998measureBRTryo0(m5991copyZbe2FdA$default2);
                long m5991copyZbe2FdA$default3 = Constraints.m5991copyZbe2FdA$default(m5991copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size8) {
                        measurable7 = list2.get(i21);
                        int i22 = size8;
                        if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable7), "Hint")) {
                            break;
                        }
                        i21++;
                        list2 = list;
                        size8 = i22;
                    } else {
                        measurable7 = null;
                        break;
                    }
                }
                Measurable measurable16 = measurable7;
                if (measurable16 != null) {
                    placeable6 = measurable16.mo4998measureBRTryo0(m5991copyZbe2FdA$default3);
                } else {
                    placeable6 = null;
                }
                int max6 = Math.max(max4, Math.max(TextFieldImplKt.heightOrZero(mo4998measureBRTryo0), TextFieldImplKt.heightOrZero(placeable6)) + max5 + mo298roundToPx0680j_4);
                m2063calculateWidthDHJA7U0 = OutlinedTextFieldKt.m2063calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), mo4998measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable5), TextFieldImplKt.widthOrZero(placeable6), this.animationProgress, j5, measureScope.getDensity(), this.paddingValues);
                long m5991copyZbe2FdA$default4 = Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, 0, -max6, 1, null), 0, m2063calculateWidthDHJA7U0, 0, 0, 9, null);
                if (measurable14 != null) {
                    placeable7 = measurable14.mo4998measureBRTryo0(m5991copyZbe2FdA$default4);
                } else {
                    placeable7 = null;
                }
                int heightOrZero = TextFieldImplKt.heightOrZero(placeable7);
                m2062calculateHeightmKXJcVc = OutlinedTextFieldKt.m2062calculateHeightmKXJcVc(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), mo4998measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeable6), TextFieldImplKt.heightOrZero(placeable7), this.animationProgress, j5, measureScope.getDensity(), this.paddingValues);
                int i23 = m2062calculateHeightmKXJcVc - heightOrZero;
                int size9 = list.size();
                for (int i24 = 0; i24 < size9; i24++) {
                    Measurable measurable17 = list.get(i24);
                    if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable17), TextFieldImplKt.ContainerId)) {
                        if (m2063calculateWidthDHJA7U0 != Integer.MAX_VALUE) {
                            i6 = m2063calculateWidthDHJA7U0;
                        } else {
                            i6 = 0;
                        }
                        if (i23 != Integer.MAX_VALUE) {
                            i7 = i23;
                        } else {
                            i7 = 0;
                        }
                        return MeasureScope.layout$default(measureScope, m2063calculateWidthDHJA7U0, m2062calculateHeightmKXJcVc, null, new OutlinedTextFieldMeasurePolicy$measure$2(m2062calculateHeightmKXJcVc, m2063calculateWidthDHJA7U0, placeable, placeable2, placeable3, placeable4, mo4998measureBRTryo0, placeable5, placeable6, measurable17.mo4998measureBRTryo0(ConstraintsKt.Constraints(i6, m2063calculateWidthDHJA7U0, i7, i23)), placeable7, this, measureScope), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18 = i20 + 1;
            size7 = i19;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(intrinsicMeasureScope, list, i5, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
