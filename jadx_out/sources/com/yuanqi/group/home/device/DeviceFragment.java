package com.yuanqi.group.home.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.lody.virtual.os.VUserInfo;
import com.lody.virtual.os.VUserManager;
import com.yqtech.multiapp.R;
import com.yuanqi.group.home.models.e;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class DeviceFragment extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private ListView f13960a;

    /* renamed from: b, reason: collision with root package name */
    private com.yuanqi.group.home.adapters.a f13961b;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(AdapterView adapterView, View view, int i5, long j5) {
        DeviceDetailActiivty.P(this, this.f13961b.j(i5), i5);
    }

    public static DeviceFragment d() {
        return new DeviceFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        if (i6 == -1 && intent != null && intent.getIntExtra("pos", -1) >= 0) {
            this.f13961b.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_list_settings, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.yuanqi.group.home.adapters.a aVar = this.f13961b;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f13960a = (ListView) view.findViewById(R.id.listview);
        this.f13961b = new com.yuanqi.group.home.adapters.a(getContext());
        int userCount = VUserManager.get().getUserCount();
        ArrayList arrayList = new ArrayList(userCount);
        for (int i5 = 0; i5 < userCount; i5++) {
            VUserInfo userInfo = VUserManager.get().getUserInfo(i5);
            if (userInfo != null) {
                e eVar = new e(getContext(), null, userInfo.id);
                eVar.f14039c = userInfo.name;
                arrayList.add(eVar);
            }
        }
        this.f13961b.p(arrayList);
        this.f13960a.setAdapter((ListAdapter) this.f13961b);
        this.f13960a.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yuanqi.group.home.device.c
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i6, long j5) {
                DeviceFragment.this.c(adapterView, view2, i6, j5);
            }
        });
    }
}
