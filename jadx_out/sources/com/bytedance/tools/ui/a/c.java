package com.bytedance.tools.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.tools.R;
import java.util.List;

/* loaded from: classes2.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f6345a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.bytedance.tools.c.a> f6346b;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        TextView f6347a;

        /* renamed from: b, reason: collision with root package name */
        TextView f6348b;

        a(View view) {
            this.f6347a = (TextView) view.findViewById(R.id.f5763m1);
            this.f6348b = (TextView) view.findViewById(R.id.f5745j1);
        }
    }

    public c(Context context, List<com.bytedance.tools.c.a> list) {
        this.f6345a = context;
        this.f6346b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6346b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f6346b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        com.bytedance.tools.c.a aVar = this.f6346b.get(i5);
        if (view == null) {
            View inflate = LayoutInflater.from(this.f6345a).inflate(R.layout.S, viewGroup, false);
            a aVar2 = new a(inflate);
            aVar2.f6347a.setText(aVar.f());
            aVar2.f6348b.setText(aVar.i());
            inflate.setTag(aVar2);
            return inflate;
        }
        a aVar3 = (a) view.getTag();
        aVar3.f6347a.setText(aVar.f());
        aVar3.f6348b.setText(aVar.i());
        return view;
    }
}
