package com.bytedance.tools.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.tools.R;
import com.bytedance.tools.ui.ui.ToolRitDetailActivity;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f6354a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.bytedance.tools.c.d> f6355b;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bytedance.tools.c.d f6356a;

        a(com.bytedance.tools.c.d dVar) {
            this.f6356a = dVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent(e.this.f6354a, (Class<?>) ToolRitDetailActivity.class);
            intent.putExtra("rit_info", this.f6356a.c());
            e.this.f6354a.startActivity(intent);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        View f6358a;

        /* renamed from: b, reason: collision with root package name */
        TextView f6359b;

        b(View view) {
            this.f6358a = view.findViewById(R.id.f5757l1);
            this.f6359b = (TextView) view.findViewById(R.id.f5751k1);
        }
    }

    public e(Context context, List<com.bytedance.tools.c.d> list) {
        this.f6354a = context;
        this.f6355b = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6355b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f6355b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        b bVar;
        com.bytedance.tools.c.d dVar = (com.bytedance.tools.c.d) getItem(i5);
        if (view != null) {
            bVar = (b) view.getTag();
        } else {
            view = LayoutInflater.from(this.f6354a).inflate(R.layout.N, viewGroup, false);
            bVar = new b(view);
            view.setTag(bVar);
        }
        bVar.f6359b.setText(dVar.f6301a);
        bVar.f6358a.setOnClickListener(new a(dVar));
        return view;
    }
}
