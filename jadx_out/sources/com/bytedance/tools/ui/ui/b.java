package com.bytedance.tools.ui.ui;

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
import com.bytedance.tools.d.g;
import com.bytedance.tools.ui.a.d;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private View f6396a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f6397b;

    /* renamed from: c, reason: collision with root package name */
    private d f6398c;

    private List<com.bytedance.tools.c.a> b() {
        return g.e(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.J, viewGroup, false);
        this.f6396a = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.Z);
        this.f6397b = listView;
        listView.setDivider(null);
        d dVar = new d(getContext(), b());
        this.f6398c = dVar;
        this.f6397b.setAdapter((ListAdapter) dVar);
        return this.f6396a;
    }
}
