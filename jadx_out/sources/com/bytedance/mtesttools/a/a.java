package com.bytedance.mtesttools.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class a extends Activity {

    /* renamed from: a, reason: collision with root package name */
    ImageView f3990a;

    /* renamed from: b, reason: collision with root package name */
    TextView f3991b;

    /* renamed from: com.bytedance.mtesttools.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC0105a implements View.OnClickListener {
        ViewOnClickListenerC0105a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.finish();
        }
    }

    protected int c() {
        return R.layout.A0;
    }

    public void d(String str, boolean z4) {
        if (z4) {
            this.f3990a.setVisibility(0);
            this.f3990a.setOnClickListener(new ViewOnClickListenerC0105a());
        } else {
            this.f3990a.setVisibility(8);
        }
        this.f3991b.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(c());
        this.f3990a = (ImageView) findViewById(R.id.X);
        this.f3991b = (TextView) findViewById(R.id.Z3);
    }
}
