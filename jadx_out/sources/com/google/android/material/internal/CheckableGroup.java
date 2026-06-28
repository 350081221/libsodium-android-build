package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes2.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    /* loaded from: classes2.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@NonNull Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@NonNull MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t5 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t5 != null) {
            uncheckInternal(t5, false);
        }
        boolean add = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@NonNull MaterialCheckable<T> materialCheckable, boolean z4) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z4 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t5) {
        this.checkables.put(Integer.valueOf(t5.getId()), t5);
        if (t5.isChecked()) {
            checkInternal(t5);
        }
        t5.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t6, boolean z4) {
                if (!z4) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t6, checkableGroup.selectionRequired)) {
                        return;
                    }
                } else if (!CheckableGroup.this.checkInternal(t6)) {
                    return;
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(@IdRes int i5) {
        T t5 = this.checkables.get(Integer.valueOf(i5));
        if (t5 != null && checkInternal(t5)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z4 = !this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z4) {
            onCheckedStateChanged();
        }
    }

    @NonNull
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @NonNull
    public List<Integer> getCheckedIdsSortedByChildOrder(@NonNull ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @IdRes
    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t5) {
        t5.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t5.getId()));
        this.checkedIds.remove(Integer.valueOf(t5.getId()));
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.selectionRequired = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.singleSelection != z4) {
            this.singleSelection = z4;
            clearCheck();
        }
    }

    public void uncheck(@IdRes int i5) {
        T t5 = this.checkables.get(Integer.valueOf(i5));
        if (t5 != null && uncheckInternal(t5, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
