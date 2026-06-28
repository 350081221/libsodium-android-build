package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import kotlin.jvm.internal.r1;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1164:1\n116#2,2:1165\n33#2,6:1167\n118#2:1173\n116#2,2:1174\n33#2,6:1176\n118#2:1182\n116#2,2:1183\n33#2,6:1185\n118#2:1191\n116#2,2:1192\n33#2,6:1194\n118#2:1200\n116#2,2:1201\n33#2,6:1203\n118#2:1209\n116#2,2:1210\n33#2,6:1212\n118#2:1218\n544#2,2:1219\n33#2,6:1221\n546#2:1227\n116#2,2:1228\n33#2,6:1230\n118#2:1236\n544#2,2:1237\n33#2,6:1239\n546#2:1245\n544#2,2:1246\n33#2,6:1248\n546#2:1254\n116#2,2:1255\n33#2,6:1257\n118#2:1263\n116#2,2:1264\n33#2,6:1266\n118#2:1272\n116#2,2:1273\n33#2,6:1275\n118#2:1281\n116#2,2:1282\n33#2,6:1284\n118#2:1290\n116#2,2:1291\n33#2,6:1293\n118#2:1299\n116#2,2:1300\n33#2,6:1302\n118#2:1308\n116#2,2:1309\n33#2,6:1311\n118#2:1317\n116#2,2:1318\n33#2,6:1320\n118#2:1326\n116#2,2:1327\n33#2,6:1329\n118#2:1335\n116#2,2:1336\n33#2,6:1338\n118#2:1344\n116#2,2:1345\n33#2,6:1347\n118#2:1353\n544#2,2:1354\n33#2,6:1356\n546#2:1362\n116#2,2:1363\n33#2,6:1365\n118#2:1371\n116#2,2:1372\n33#2,6:1374\n118#2:1380\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n653#1:1165,2\n653#1:1167,6\n653#1:1173\n658#1:1174,2\n658#1:1176,6\n658#1:1182\n664#1:1183,2\n664#1:1185,6\n664#1:1191\n670#1:1192,2\n670#1:1194,6\n670#1:1200\n682#1:1201,2\n682#1:1203,6\n682#1:1209\n686#1:1210,2\n686#1:1212,6\n686#1:1218\n699#1:1219,2\n699#1:1221,6\n699#1:1227\n705#1:1228,2\n705#1:1230,6\n705#1:1236\n747#1:1237,2\n747#1:1239,6\n747#1:1245\n838#1:1246,2\n838#1:1248,6\n838#1:1254\n839#1:1255,2\n839#1:1257,6\n839#1:1263\n842#1:1264,2\n842#1:1266,6\n842#1:1272\n845#1:1273,2\n845#1:1275,6\n845#1:1281\n848#1:1282,2\n848#1:1284,6\n848#1:1290\n851#1:1291,2\n851#1:1293,6\n851#1:1299\n854#1:1300,2\n854#1:1302,6\n854#1:1308\n875#1:1309,2\n875#1:1311,6\n875#1:1317\n881#1:1318,2\n881#1:1320,6\n881#1:1326\n887#1:1327,2\n887#1:1329,6\n887#1:1335\n891#1:1336,2\n891#1:1338,6\n891#1:1344\n898#1:1345,2\n898#1:1347,6\n898#1:1353\n907#1:1354,2\n907#1:1356,6\n907#1:1362\n908#1:1363,2\n908#1:1365,6\n908#1:1371\n912#1:1372,2\n912#1:1374,6\n912#1:1380\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;

    @p4.l
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z4, float f5, @p4.l PaddingValues paddingValues) {
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
        int m2448calculateHeightmKXJcVc;
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
            i6 = TextFieldKt.substractConstraintSafely(i5, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
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
            i6 = TextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
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
            i9 = pVar.invoke(intrinsicMeasurable10, Integer.valueOf(i6)).intValue();
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
            int intValue = pVar.invoke(intrinsicMeasurable11, Integer.valueOf(i6)).intValue();
            i6 = TextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
            i10 = intValue;
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
            i11 = pVar.invoke(intrinsicMeasurable12, Integer.valueOf(i6)).intValue();
            i6 = TextFieldKt.substractConstraintSafely(i6, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
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
                        intrinsicMeasurable7 = list.get(i21);
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                            break;
                        }
                        i21++;
                    } else {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                if (intrinsicMeasurable15 != null) {
                    i13 = pVar.invoke(intrinsicMeasurable15, Integer.valueOf(i5)).intValue();
                } else {
                    i13 = 0;
                }
                m2448calculateHeightmKXJcVc = TextFieldKt.m2448calculateHeightmKXJcVc(intValue2, i9, i7, i8, i10, i11, i12, i13, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m2448calculateHeightmKXJcVc;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i5, v3.p<? super IntrinsicMeasurable, ? super Integer, Integer> pVar) {
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
        int m2449calculateWidthyeHjK3Y;
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
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
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
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
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
                        if (kotlin.jvm.internal.l0.g(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), "Leading")) {
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
                m2449calculateWidthyeHjK3Y = TextFieldKt.m2449calculateWidthyeHjK3Y(i10, i7, i8, i9, intValue, i6, i11, TextFieldImplKt.getZeroConstraints());
                return m2449calculateWidthyeHjK3Y;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, TextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(list, i5, TextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
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
        int m2449calculateWidthyeHjK3Y;
        Placeable placeable7;
        int m2448calculateHeightmKXJcVc;
        int i6;
        int i7;
        List<? extends Measurable> list2 = list;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo506calculateTopPaddingD9Ej5fM());
        int mo298roundToPx0680j_42 = measureScope.mo298roundToPx0680j_4(this.paddingValues.mo503calculateBottomPaddingD9Ej5fM());
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
                int i12 = size4;
                if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                    break;
                }
                i11++;
                size4 = i12;
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
        int i13 = -widthOrZero4;
        long m6016offsetNN6EwU = ConstraintsKt.m6016offsetNN6EwU(m5991copyZbe2FdA$default, i13, -mo298roundToPx0680j_42);
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
        int heightOrZero = TextFieldImplKt.heightOrZero(placeable5) + mo298roundToPx0680j_4;
        long m6016offsetNN6EwU2 = ConstraintsKt.m6016offsetNN6EwU(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null), i13, ((-heightOrZero) - mo298roundToPx0680j_42) - i5);
        int size7 = list.size();
        int i18 = 0;
        while (i18 < size7) {
            int i19 = size7;
            Measurable measurable15 = list2.get(i18);
            int i20 = i18;
            if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable15), "TextField")) {
                Placeable mo4998measureBRTryo0 = measurable15.mo4998measureBRTryo0(m6016offsetNN6EwU2);
                long m5991copyZbe2FdA$default2 = Constraints.m5991copyZbe2FdA$default(m6016offsetNN6EwU2, 0, 0, 0, 0, 14, null);
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
                    placeable6 = measurable16.mo4998measureBRTryo0(m5991copyZbe2FdA$default2);
                } else {
                    placeable6 = null;
                }
                int max5 = Math.max(max4, Math.max(TextFieldImplKt.heightOrZero(mo4998measureBRTryo0), TextFieldImplKt.heightOrZero(placeable6)) + heightOrZero + mo298roundToPx0680j_42);
                m2449calculateWidthyeHjK3Y = TextFieldKt.m2449calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable4), mo4998measureBRTryo0.getWidth(), TextFieldImplKt.widthOrZero(placeable5), TextFieldImplKt.widthOrZero(placeable6), j5);
                long m5991copyZbe2FdA$default3 = Constraints.m5991copyZbe2FdA$default(ConstraintsKt.m6017offsetNN6EwU$default(m5991copyZbe2FdA$default, 0, -max5, 1, null), 0, m2449calculateWidthyeHjK3Y, 0, 0, 9, null);
                if (measurable14 != null) {
                    placeable7 = measurable14.mo4998measureBRTryo0(m5991copyZbe2FdA$default3);
                } else {
                    placeable7 = null;
                }
                int heightOrZero2 = TextFieldImplKt.heightOrZero(placeable7);
                m2448calculateHeightmKXJcVc = TextFieldKt.m2448calculateHeightmKXJcVc(mo4998measureBRTryo0.getHeight(), TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable6), TextFieldImplKt.heightOrZero(placeable7), this.animationProgress, j5, measureScope.getDensity(), this.paddingValues);
                int i23 = m2448calculateHeightmKXJcVc - heightOrZero2;
                int size9 = list.size();
                for (int i24 = 0; i24 < size9; i24++) {
                    Measurable measurable17 = list.get(i24);
                    if (kotlin.jvm.internal.l0.g(LayoutIdKt.getLayoutId(measurable17), TextFieldImplKt.ContainerId)) {
                        if (m2449calculateWidthyeHjK3Y != Integer.MAX_VALUE) {
                            i6 = m2449calculateWidthyeHjK3Y;
                        } else {
                            i6 = 0;
                        }
                        if (i23 != Integer.MAX_VALUE) {
                            i7 = i23;
                        } else {
                            i7 = 0;
                        }
                        return MeasureScope.layout$default(measureScope, m2449calculateWidthyeHjK3Y, m2448calculateHeightmKXJcVc, null, new TextFieldMeasurePolicy$measure$1(placeable5, m2449calculateWidthyeHjK3Y, m2448calculateHeightmKXJcVc, mo4998measureBRTryo0, placeable6, placeable, placeable2, placeable3, placeable4, measurable17.mo4998measureBRTryo0(ConstraintsKt.Constraints(i6, m2449calculateWidthyeHjK3Y, i7, i23)), placeable7, this, mo298roundToPx0680j_4, measureScope), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i18 = i20 + 1;
            size7 = i19;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicHeight(intrinsicMeasureScope, list, i5, TextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@p4.l IntrinsicMeasureScope intrinsicMeasureScope, @p4.l List<? extends IntrinsicMeasurable> list, int i5) {
        return intrinsicWidth(list, i5, TextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }
}
