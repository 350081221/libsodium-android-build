package com.bytedance.tools.ui.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bytedance.tools.R;
import com.bytedance.tools.c.d;
import com.bytedance.tools.d.j;
import com.bytedance.tools.ui.a.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private View f6399a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f6400b;

    /* renamed from: c, reason: collision with root package name */
    private e f6401c;

    private List<d> b() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor b5 = com.bytedance.tools.d.d.b(getContext(), "setting_rit", new String[]{"rit"}, null, null, null, null, "rit ASC");
            if (b5 == null) {
                if (b5 != null) {
                    b5.close();
                }
                return arrayList;
            }
            while (b5.moveToNext()) {
                d dVar = new d();
                dVar.f6301a = b5.getString(b5.getColumnIndex("rit"));
                arrayList.add(dVar);
            }
            b5.close();
            j.f(arrayList);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.J, viewGroup, false);
        this.f6399a = inflate;
        this.f6400b = (ListView) inflate.findViewById(R.id.Z);
        e eVar = new e(getContext(), b());
        this.f6401c = eVar;
        this.f6400b.setAdapter((ListAdapter) eVar);
        this.f6400b.setEmptyView(this.f6399a.findViewById(android.R.id.empty));
        this.f6400b.setDivider(null);
        return this.f6399a;
    }
}
