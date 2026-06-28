package com.bytedance.tools.ui.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.widget.RadioGroup;
import com.bytedance.tools.R;

/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: l, reason: collision with root package name */
    private RadioGroup f6394l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6395m;

    public c(Context context) {
        super(context, R.layout.H);
        this.f6395m = false;
    }

    private void e() {
        this.f6394l = (RadioGroup) findViewById(R.id.f5827x2);
    }

    public void g(boolean z4) {
        this.f6395m = z4;
    }

    public boolean h() {
        RadioGroup radioGroup = this.f6394l;
        return radioGroup != null && radioGroup.getCheckedRadioButtonId() == R.id.Y1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.tools.ui.ui.a.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e();
    }

    @Override // com.bytedance.tools.ui.ui.a.a, android.app.Dialog
    public void show() {
        super.show();
        RadioGroup radioGroup = this.f6394l;
        if (radioGroup != null) {
            if (this.f6395m) {
                radioGroup.check(R.id.Y1);
            } else {
                radioGroup.check(R.id.f5815v0);
            }
        }
    }
}
