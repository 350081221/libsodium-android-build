package com.bytedance.tools.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class FoldSpinnerView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f6428a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f6429b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f6430c;

    /* renamed from: d, reason: collision with root package name */
    private String f6431d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6432e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FoldSpinnerView.this.f6432e = !r2.f6432e;
            FoldSpinnerView.this.a();
        }
    }

    public FoldSpinnerView(Context context, String str, boolean z4) {
        super(context);
        this.f6431d = str;
        this.f6432e = z4;
        e();
    }

    private void e() {
        setBackgroundColor(-1);
        setOrientation(1);
        addView(LayoutInflater.from(getContext()).inflate(R.layout.X0, (ViewGroup) this, false));
        this.f6428a = findViewById(R.id.Q4);
        this.f6429b = (TextView) findViewById(R.id.P4);
        this.f6430c = (ImageView) findViewById(R.id.O4);
        this.f6428a.setOnClickListener(new a());
        this.f6429b.setText(this.f6431d);
    }

    private void setChildVisible(int i5) {
        int childCount = getChildCount();
        for (int i6 = 1; i6 < childCount; i6++) {
            getChildAt(i6).setVisibility(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        int i5;
        int i6;
        ImageView imageView = this.f6430c;
        if (this.f6432e) {
            i5 = R.drawable.f5681x0;
        } else {
            i5 = R.drawable.f5672u0;
        }
        imageView.setImageResource(i5);
        if (this.f6432e) {
            i6 = 8;
        } else {
            i6 = 0;
        }
        setChildVisible(i6);
        b(this.f6432e);
    }

    protected void b(boolean z4) {
    }

    public String getTitleText() {
        return this.f6431d;
    }

    public void setIsFold(boolean z4) {
        this.f6432e = z4;
    }

    public void setTitleText(String str) {
        this.f6431d = str;
        TextView textView = this.f6429b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public FoldSpinnerView(Context context) {
        super(context);
        this.f6432e = false;
        e();
    }

    public FoldSpinnerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6432e = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f5374f4});
        this.f6431d = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        e();
    }
}
