package com.yuanqi.group.home.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yqtech.multiapp.R;
import com.yuanqi.group.abs.ui.a;

/* loaded from: classes3.dex */
public class a extends com.yuanqi.group.abs.ui.a<com.yuanqi.group.home.models.e> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yuanqi.group.home.adapters.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0260a extends a.C0257a {

        /* renamed from: c, reason: collision with root package name */
        final ImageView f13891c;

        /* renamed from: d, reason: collision with root package name */
        final TextView f13892d;

        /* renamed from: e, reason: collision with root package name */
        final TextView f13893e;

        public C0260a(View view) {
            super(view);
            this.f13891c = (ImageView) a(R.id.item_app_icon);
            this.f13892d = (TextView) a(R.id.item_app_name);
            this.f13893e = (TextView) a(R.id.item_location);
        }
    }

    public a(Context context) {
        super(context);
    }

    @Override // com.yuanqi.group.abs.ui.a
    protected View f(int i5, ViewGroup viewGroup) {
        View n5 = n(R.layout.item_location_app, viewGroup, false);
        n5.setTag(new C0260a(n5));
        return n5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yuanqi.group.abs.ui.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void d(View view, com.yuanqi.group.home.models.e eVar, int i5) {
        C0260a c0260a = (C0260a) view.getTag();
        if (eVar.f14040d == null) {
            c0260a.f13891c.setImageResource(R.mipmap.menu_about_us);
        } else {
            c0260a.f13891c.setVisibility(0);
            c0260a.f13891c.setImageDrawable(eVar.f14040d);
        }
        c0260a.f13892d.setText(eVar.f14039c);
        if (eVar.b()) {
            c0260a.f13893e.setText(R.string.mock_device);
        } else {
            c0260a.f13893e.setText(R.string.mock_none);
        }
    }
}
