package com.bytedance.tools.ui.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.tools.R;
import com.bytedance.tools.ui.ui.b;
import com.bytedance.tools.ui.ui.c;

/* loaded from: classes2.dex */
public class a extends FragmentPagerAdapter {

    /* renamed from: b, reason: collision with root package name */
    @StringRes
    private static final int[] f6405b = {R.string.G, R.string.H, R.string.I};

    /* renamed from: a, reason: collision with root package name */
    private final Context f6406a;

    public a(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f6406a = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return 3;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i5) {
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    return null;
                }
                return new c();
            }
            return new b();
        }
        return new com.bytedance.tools.ui.ui.a();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @Nullable
    public CharSequence getPageTitle(int i5) {
        return this.f6406a.getResources().getString(f6405b[i5]);
    }
}
