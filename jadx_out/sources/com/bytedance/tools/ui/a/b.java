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
public class b extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f6342a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.bytedance.tools.c.c> f6343b;

    /* renamed from: c, reason: collision with root package name */
    private int f6344c = 0;

    public b(Context context, List<com.bytedance.tools.c.c> list) {
        this.f6342a = context;
        this.f6343b = list;
    }

    public com.bytedance.tools.c.c a() {
        return this.f6343b.get(this.f6344c);
    }

    public void b(int i5) {
        this.f6344c = i5;
        notifyDataSetChanged();
    }

    public void c(List<com.bytedance.tools.c.c> list) {
        this.f6343b = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6343b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f6343b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f6342a).inflate(R.layout.Y0, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.f5758l2)).setText(this.f6343b.get(i5).d());
        if (i5 == this.f6344c) {
            inflate.findViewById(R.id.f5715e1).setVisibility(0);
        }
        return inflate;
    }
}
