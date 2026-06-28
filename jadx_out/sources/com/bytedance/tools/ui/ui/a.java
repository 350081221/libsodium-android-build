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
import java.util.List;

/* loaded from: classes2.dex */
public class a extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private View f6376a;

    /* renamed from: b, reason: collision with root package name */
    private ListView f6377b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.tools.ui.a.c f6378c;

    private List<com.bytedance.tools.c.a> b() {
        return com.bytedance.tools.d.c.c(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.J, viewGroup, false);
        this.f6376a = inflate;
        ListView listView = (ListView) inflate.findViewById(R.id.Z);
        this.f6377b = listView;
        listView.setDivider(null);
        com.bytedance.tools.ui.a.c cVar = new com.bytedance.tools.ui.a.c(getContext(), b());
        this.f6378c = cVar;
        this.f6377b.setAdapter((ListAdapter) cVar);
        return this.f6376a;
    }
}
