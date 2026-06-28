package com.bytedance.tools.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.bytedance.tools.R;
import java.util.List;

/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: g, reason: collision with root package name */
    private final int f6434g;

    public a(Context context, RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        super(context, radioGroup, bVar, list);
        this.f6434g = 66666699;
        setTitle("手动输入");
        setId(66666699);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.tools.ui.view.c
    public void b(RadioGroup radioGroup, com.bytedance.tools.c.b bVar, List<com.bytedance.tools.c.b> list) {
        super.b(radioGroup, bVar, list);
        View.inflate(getContext(), R.layout.O, this.f6450d);
        EditText editText = (EditText) findViewById(R.id.K2);
        EditText editText2 = (EditText) findViewById(R.id.L2);
        com.bytedance.tools.c.b bVar2 = this.f6451e;
        if (bVar2 != null) {
            editText.setText(bVar2.a());
            editText2.setText(this.f6451e.d());
        }
    }

    @Override // com.bytedance.tools.ui.view.c
    public boolean d() {
        EditText editText = (EditText) findViewById(R.id.K2);
        EditText editText2 = (EditText) findViewById(R.id.L2);
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2) && TextUtils.getTrimmedLength(obj) == 16 && TextUtils.getTrimmedLength(obj2) == 16) {
            return false;
        }
        return true;
    }

    public void e() {
        EditText editText = (EditText) findViewById(R.id.K2);
        EditText editText2 = (EditText) findViewById(R.id.L2);
        editText.getEditableText().clear();
        editText2.getEditableText().clear();
    }

    @Override // com.bytedance.tools.ui.view.c
    public com.bytedance.tools.c.b getConfigModel() {
        com.bytedance.tools.c.b bVar = new com.bytedance.tools.c.b(((EditText) findViewById(R.id.K2)).getText().toString(), ((EditText) findViewById(R.id.L2)).getText().toString());
        this.f6451e = bVar;
        return bVar;
    }

    @Override // com.bytedance.tools.ui.view.c
    public String getImageMode() {
        return "";
    }
}
