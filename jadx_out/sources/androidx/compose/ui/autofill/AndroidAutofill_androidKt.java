package androidx.compose.ui.autofill;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k0;
import kotlin.math.d;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001a\u0010\b\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroid/view/ViewStructure;", "root", "Lkotlin/r2;", "populateViewStructure", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "performAutofill", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nAndroidAutofill.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,231:1\n151#2,3:232\n33#2,4:235\n154#2,2:239\n38#2:241\n156#2:242\n37#3,2:243\n*S KotlinDebug\n*F\n+ 1 AndroidAutofill.android.kt\nandroidx/compose/ui/autofill/AndroidAutofill_androidKt\n*L\n96#1:232,3\n96#1:235,4\n96#1:239,2\n96#1:241\n96#1:242\n96#1:243,2\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofill_androidKt {
    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void performAutofill(@l AndroidAutofill androidAutofill, @l SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            int keyAt = sparseArray.keyAt(i5);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValue)) {
                androidAutofill.getAutofillTree().performAutofill(keyAt, autofillApi26Helper.textValue(autofillValue).toString());
            } else if (!autofillApi26Helper.isDate(autofillValue)) {
                if (!autofillApi26Helper.isList(autofillValue)) {
                    if (autofillApi26Helper.isToggle(autofillValue)) {
                        throw new k0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                } else {
                    throw new k0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
            } else {
                throw new k0("An operation is not implemented: b/138604541: Add onFill() callback for date");
            }
        }
    }

    @RequiresApi(26)
    @ExperimentalComposeUiApi
    public static final void populateViewStructure(@l AndroidAutofill androidAutofill, @l ViewStructure viewStructure) {
        int L0;
        int L02;
        int L03;
        int L04;
        int addChildCount = AutofillApi23Helper.INSTANCE.addChildCount(viewStructure, androidAutofill.getAutofillTree().getChildren().size());
        for (Map.Entry<Integer, AutofillNode> entry : androidAutofill.getAutofillTree().getChildren().entrySet()) {
            int intValue = entry.getKey().intValue();
            AutofillNode value = entry.getValue();
            AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.INSTANCE;
            ViewStructure newChild = autofillApi23Helper.newChild(viewStructure, addChildCount);
            if (newChild != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
                AutofillId autofillId = autofillApi26Helper.getAutofillId(viewStructure);
                l0.m(autofillId);
                autofillApi26Helper.setAutofillId(newChild, autofillId, intValue);
                autofillApi23Helper.setId(newChild, intValue, androidAutofill.getView().getContext().getPackageName(), null, null);
                autofillApi26Helper.setAutofillType(newChild, 1);
                List<AutofillType> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size = autofillTypes.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(AndroidAutofillType_androidKt.getAndroidType(autofillTypes.get(i5)));
                }
                autofillApi26Helper.setAutofillHints(newChild, (String[]) arrayList.toArray(new String[0]));
                Rect boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    L0 = d.L0(boundingBox.getLeft());
                    L02 = d.L0(boundingBox.getTop());
                    L03 = d.L0(boundingBox.getRight());
                    L04 = d.L0(boundingBox.getBottom());
                    AutofillApi23Helper.INSTANCE.setDimens(newChild, L0, L02, 0, 0, L03 - L0, L04 - L02);
                }
            }
            addChildCount++;
        }
    }
}
