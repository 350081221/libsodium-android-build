package com.bytedance.mtesttools.d;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.mtesttools.act.AdnDetailActivity;
import com.bytedance.tools.R;
import java.util.ArrayList;
import java.util.List;
import k1.f;

/* loaded from: classes2.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Context f4216a;

    /* renamed from: b, reason: collision with root package name */
    private List<j1.d> f4217b = new ArrayList();

    /* loaded from: classes2.dex */
    class a {

        /* renamed from: a, reason: collision with root package name */
        public RelativeLayout f4218a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f4219b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f4220c;

        /* renamed from: d, reason: collision with root package name */
        public TextView f4221d;

        /* renamed from: e, reason: collision with root package name */
        public TextView f4222e;

        /* renamed from: f, reason: collision with root package name */
        public TextView f4223f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.mtesttools.d.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class ViewOnClickListenerC0113a implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j1.d f4225a;

            ViewOnClickListenerC0113a(j1.d dVar) {
                this.f4225a = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(c.this.f4216a, (Class<?>) AdnDetailActivity.class);
                intent.putExtra("adn_config", this.f4225a);
                c.this.f4216a.startActivity(intent);
            }
        }

        a() {
        }

        public void a(int i5, j1.d dVar) {
            if (dVar.e() > 0) {
                this.f4219b.setImageResource(dVar.e());
                this.f4220c.setText(dVar.d());
                boolean e5 = f.e(dVar.c());
                if (f.k(dVar.c())) {
                    this.f4221d.setEnabled(true);
                    this.f4221d.setSelected(false);
                } else {
                    this.f4221d.setEnabled(false);
                }
                if (f.m(dVar.c())) {
                    this.f4222e.setEnabled(true);
                    this.f4222e.setSelected(false);
                } else {
                    this.f4222e.setEnabled(false);
                }
                if (e5) {
                    this.f4223f.setEnabled(true);
                    this.f4223f.setSelected(true);
                    this.f4223f.setText("不支持检测");
                } else {
                    boolean c5 = f.c(c.this.f4216a, dVar.c());
                    this.f4223f.setText("Manifest");
                    if (c5) {
                        this.f4223f.setEnabled(true);
                        this.f4223f.setSelected(false);
                    } else {
                        this.f4223f.setEnabled(false);
                    }
                }
            }
            this.f4218a.setOnClickListener(new ViewOnClickListenerC0113a(dVar));
        }
    }

    public c(Context context) {
        this.f4216a = context;
    }

    public void b(List<j1.d> list) {
        this.f4217b.clear();
        this.f4217b.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4217b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        return this.f4217b.get(i5);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f4216a).inflate(R.layout.G0, viewGroup, false);
            aVar = new a();
            aVar.f4218a = (RelativeLayout) view.findViewById(R.id.K);
            aVar.f4219b = (ImageView) view.findViewById(R.id.I);
            aVar.f4220c = (TextView) view.findViewById(R.id.M);
            aVar.f4221d = (TextView) view.findViewById(R.id.F);
            aVar.f4222e = (TextView) view.findViewById(R.id.f5747j3);
            aVar.f4223f = (TextView) view.findViewById(R.id.K1);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.a(i5, this.f4217b.get(i5));
        return view;
    }
}
