package d1;

import a1.e;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    public static class a implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
            return i5 == 4;
        }
    }

    public static AlertDialog.Builder a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
            builder.setPositiveButton(str3, onClickListener2);
        }
        if (!TextUtils.isEmpty(str2) && onClickListener != null) {
            builder.setNegativeButton(str2, onClickListener);
        }
        return builder;
    }

    public static Dialog b(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder a5 = a(context, str, str3, onClickListener, str4, onClickListener2);
        a5.setTitle(str);
        a5.setMessage(str2);
        AlertDialog create = a5.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new a());
        try {
            create.show();
        } catch (Throwable th) {
            e.c(k0.a.A, "showDialog ", th);
        }
        return create;
    }
}
