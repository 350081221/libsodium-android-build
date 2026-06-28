package com.yuanqi.master.tools.guide.lifecycle;

import androidx.fragment.app.Fragment;

/* loaded from: classes3.dex */
public class ListenerFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    a f15158a;

    public void b(a aVar) {
        this.f15158a = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        z2.a.a("onDestroy: ");
        a aVar = this.f15158a;
        if (aVar != null) {
            aVar.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        a aVar = this.f15158a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        z2.a.a("onStart: ");
        a aVar = this.f15158a;
        if (aVar != null) {
            aVar.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        a aVar = this.f15158a;
        if (aVar != null) {
            aVar.onStop();
        }
    }
}
