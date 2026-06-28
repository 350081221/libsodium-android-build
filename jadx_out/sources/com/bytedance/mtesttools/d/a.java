package com.bytedance.mtesttools.d;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.bytedance.tools.R;
import j1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends BaseExpandableListAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f4199a;

    /* renamed from: b, reason: collision with root package name */
    private List<j1.c> f4200b = new ArrayList();

    /* renamed from: com.bytedance.mtesttools.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0111a {

        /* renamed from: a, reason: collision with root package name */
        public TextView f4201a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f4202b;

        C0111a() {
        }
    }

    /* loaded from: classes2.dex */
    class b {

        /* renamed from: a, reason: collision with root package name */
        public TextView f4204a;

        b() {
        }
    }

    public a(Context context) {
        this.f4199a = context;
    }

    @Override // android.widget.ExpandableListAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j1.c getGroup(int i5) {
        if (i5 >= this.f4200b.size()) {
            return null;
        }
        return this.f4200b.get(i5);
    }

    @Override // android.widget.ExpandableListAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e getChild(int i5, int i6) {
        j1.c cVar;
        if (i5 >= this.f4200b.size() || (cVar = this.f4200b.get(i5)) == null || cVar.e() == null || cVar.e().size() <= i6) {
            return null;
        }
        return cVar.e().get(i6);
    }

    public void c(String str, int i5) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<j1.c> it = this.f4200b.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            j1.c next = it.next();
            if (next != null && next.e() != null) {
                for (e eVar : next.e()) {
                    if (str.equals(eVar.b())) {
                        eVar.a(i5);
                        break loop0;
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public void d(List<j1.c> list) {
        if (list == null) {
            return;
        }
        this.f4200b.clear();
        this.f4200b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i5, int i6) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildType(int i5, int i6) {
        return super.getChildType(i5, i6);
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getChildTypeCount() {
        return 1;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i5, int i6, boolean z4, View view, ViewGroup viewGroup) {
        C0111a c0111a;
        if (view == null) {
            view = LayoutInflater.from(this.f4199a).inflate(R.layout.E0, viewGroup, false);
            c0111a = new C0111a();
            c0111a.f4201a = (TextView) view.findViewById(R.id.f5814v);
            c0111a.f4202b = (TextView) view.findViewById(R.id.A);
            view.setTag(c0111a);
        } else {
            c0111a = (C0111a) view.getTag();
        }
        e eVar = this.f4200b.get(i5).e().get(i6);
        c0111a.f4201a.setText(eVar.b());
        if (eVar.a() == 0) {
            c0111a.f4202b.setText("未测试");
            c0111a.f4202b.setEnabled(true);
            c0111a.f4202b.setSelected(true);
        } else if (eVar.a() == 1) {
            c0111a.f4202b.setText("测试完成");
            c0111a.f4202b.setEnabled(true);
            c0111a.f4202b.setSelected(false);
        } else {
            c0111a.f4202b.setText("测试失败");
            c0111a.f4202b.setEnabled(false);
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i5) {
        j1.c cVar;
        if (i5 >= this.f4200b.size() || (cVar = this.f4200b.get(i5)) == null || cVar.e() == null) {
            return 0;
        }
        return cVar.e().size();
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f4200b.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i5) {
        return 0L;
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupType(int i5) {
        return super.getGroupType(i5);
    }

    @Override // android.widget.BaseExpandableListAdapter, android.widget.HeterogeneousExpandableList
    public int getGroupTypeCount() {
        return super.getGroupTypeCount();
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i5, boolean z4, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f4199a).inflate(R.layout.F0, viewGroup, false);
            bVar = new b();
            bVar.f4204a = (TextView) view.findViewById(R.id.D);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.f4204a.setText(this.f4200b.get(i5).a());
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i5, int i6) {
        return true;
    }
}
