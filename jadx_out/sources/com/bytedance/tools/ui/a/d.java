package com.bytedance.tools.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.tools.R;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f6349a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.bytedance.tools.c.a> f6350b;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        com.bytedance.tools.ui.view.b f6351a;

        a(View view) {
            this.f6351a = (com.bytedance.tools.ui.view.b) view;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        TextView f6352a;

        /* renamed from: b, reason: collision with root package name */
        ImageView f6353b;

        b(View view) {
            this.f6352a = (TextView) view.findViewById(R.id.f5763m1);
            this.f6353b = (ImageView) view.findViewById(R.id.v4);
        }
    }

    public d(Context context, List<com.bytedance.tools.c.a> list) {
        this.f6349a = context;
        this.f6350b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6350b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f6350b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i5) {
        return this.f6350b.get(i5).a();
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i5);
        com.bytedance.tools.c.a aVar = this.f6350b.get(i5);
        if (view == null) {
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    com.bytedance.tools.ui.view.b bVar = new com.bytedance.tools.ui.view.b(this.f6349a, aVar.f(), aVar, aVar.l());
                    bVar.setTag(new a(bVar));
                    return bVar;
                }
                return view;
            }
            View inflate = LayoutInflater.from(this.f6349a).inflate(R.layout.T, viewGroup, false);
            b bVar2 = new b(inflate);
            bVar2.f6352a.setText(aVar.f());
            if ("1".equals(aVar.i())) {
                bVar2.f6353b.setImageResource(R.drawable.H0);
            } else {
                bVar2.f6353b.setImageResource(R.drawable.I0);
            }
            inflate.setTag(bVar2);
            return inflate;
        }
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                ((a) view.getTag()).f6351a.j(aVar.f(), aVar, aVar.l());
                return view;
            }
            return view;
        }
        b bVar3 = (b) view.getTag();
        if ("1".equals(aVar.i())) {
            bVar3.f6353b.setImageDrawable(this.f6349a.getResources().getDrawable(R.drawable.H0));
            return view;
        }
        bVar3.f6353b.setImageDrawable(this.f6349a.getResources().getDrawable(R.drawable.I0));
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
