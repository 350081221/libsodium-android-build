package com.yuanqi.group.home.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.yqtech.multiapp.R;
import com.yuanqi.group.App;
import com.yuanqi.group.home.device.DeviceFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class DevicePagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private List<String> f13871a;

    public DevicePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        ArrayList arrayList = new ArrayList();
        this.f13871a = arrayList;
        arrayList.add(App.f13716d.a().getResources().getString(R.string.title_user_device));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f13871a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i5) {
        return DeviceFragment.d();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i5) {
        return this.f13871a.get(i5);
    }
}
