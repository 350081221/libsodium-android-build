package com.bytedance.mtesttools.d;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.mtesttools.act.AdSlotDetailActivity;
import com.bytedance.tools.R;
import j1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f4206a;

    /* renamed from: b, reason: collision with root package name */
    private List<f> f4207b = new ArrayList();

    /* loaded from: classes2.dex */
    class a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f4208a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f4209b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f4210c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f4211d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f4212e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.mtesttools.d.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class ViewOnClickListenerC0112a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f4214a;

            ViewOnClickListenerC0112a(f fVar) {
                this.f4214a = fVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(b.this.f4206a, (Class<?>) AdSlotDetailActivity.class);
                intent.putExtra("water_fall_config", this.f4214a);
                b.this.f4206a.startActivityForResult(intent, 22);
            }
        }

        a() {
        }

        public void a(int i5, f fVar) {
            if (fVar.f() > 0) {
                this.f4209b.setImageResource(fVar.f());
            }
            this.f4210c.setText(fVar.i());
            if (fVar.j()) {
                this.f4211d.setVisibility(0);
            } else {
                this.f4211d.setVisibility(8);
            }
            if (fVar.a() == 0) {
                this.f4212e.setText("未测试");
                this.f4212e.setEnabled(true);
                this.f4212e.setSelected(true);
            } else if (fVar.a() == 1) {
                this.f4212e.setText("测试完成");
                this.f4212e.setEnabled(true);
                this.f4212e.setSelected(false);
            } else {
                this.f4212e.setText("测试失败");
                this.f4212e.setEnabled(false);
            }
            this.f4208a.setOnClickListener(new ViewOnClickListenerC0112a(fVar));
        }
    }

    public b(Activity activity) {
        this.f4206a = activity;
    }

    public int a() {
        int i5 = 1;
        for (f fVar : this.f4207b) {
            if (fVar.a() == 0) {
                return 0;
            }
            if (fVar.a() == 2) {
                i5 = 2;
            }
        }
        return i5;
    }

    public void c(String str, int i5) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Iterator<f> it = this.f4207b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f next = it.next();
            if (str.equals(next.i())) {
                next.a(i5);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void d(List<f> list) {
        this.f4207b.clear();
        this.f4207b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4207b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f4207b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f4206a).inflate(R.layout.W0, viewGroup, false);
            aVar = new a();
            aVar.f4208a = (RelativeLayout) view.findViewById(R.id.A3);
            aVar.f4209b = (ImageView) view.findViewById(R.id.I);
            aVar.f4210c = (TextView) view.findViewById(R.id.f5828x3);
            aVar.f4211d = (TextView) view.findViewById(R.id.f5708d0);
            aVar.f4212e = (TextView) view.findViewById(R.id.C3);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a(i5, this.f4207b.get(i5));
        return view;
    }
}
