package com.bytedance.tools.d;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bytedance.tools.R;
import com.bytedance.tools.ui.FeedBackActivity;
import com.bytedance.tools.ui.ToolsActivity;

/* loaded from: classes2.dex */
public class i {

    /* loaded from: classes2.dex */
    static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f6312a;

        a(AppCompatActivity appCompatActivity) {
            this.f6312a = appCompatActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f6312a.onBackPressed();
        }
    }

    /* loaded from: classes2.dex */
    static class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AppCompatActivity f6313a;

        b(AppCompatActivity appCompatActivity) {
            this.f6313a = appCompatActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f6313a.startActivity(new Intent(this.f6313a, (Class<?>) FeedBackActivity.class));
        }
    }

    public static void a(AppCompatActivity appCompatActivity, Toolbar toolbar, String str) {
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.setTitle("");
        View inflate = LayoutInflater.from(appCompatActivity).inflate(R.layout.E, (ViewGroup) toolbar, false);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        inflate.setLayoutParams(layoutParams);
        toolbar.addView(inflate);
        appCompatActivity.setSupportActionBar(toolbar);
        ((TextView) inflate.findViewById(R.id.R1)).setText(str);
        inflate.findViewById(R.id.Q1).setOnClickListener(new a(appCompatActivity));
        if (appCompatActivity instanceof ToolsActivity) {
            inflate.findViewById(R.id.V0).setOnClickListener(new b(appCompatActivity));
        } else {
            inflate.findViewById(R.id.V0).setVisibility(8);
        }
    }
}
