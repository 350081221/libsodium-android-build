package com.ss.android.download.api.a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ss.android.download.api.config.l;
import com.ss.android.download.api.download.DownloadModel;
import com.ss.android.download.api.model.b;

/* loaded from: classes3.dex */
public class a implements l {
    @Override // com.ss.android.download.api.config.l
    public void a(int i5, @Nullable Context context, DownloadModel downloadModel, String str, Drawable drawable, int i6) {
        Toast.makeText(context, str, 0).show();
    }

    @Override // com.ss.android.download.api.config.l
    public Dialog b(@NonNull com.ss.android.download.api.model.b bVar) {
        return a(bVar);
    }

    private static Dialog a(final com.ss.android.download.api.model.b bVar) {
        if (bVar == null) {
            return null;
        }
        AlertDialog show = new AlertDialog.Builder(bVar.f9441a).setTitle(bVar.f9442b).setMessage(bVar.f9443c).setPositiveButton(bVar.f9444d, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.a.a.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                b.InterfaceC0178b interfaceC0178b = com.ss.android.download.api.model.b.this.f9448h;
                if (interfaceC0178b != null) {
                    interfaceC0178b.a(dialogInterface);
                }
            }
        }).setNegativeButton(bVar.f9445e, new DialogInterface.OnClickListener() { // from class: com.ss.android.download.api.a.a.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                b.InterfaceC0178b interfaceC0178b = com.ss.android.download.api.model.b.this.f9448h;
                if (interfaceC0178b != null) {
                    interfaceC0178b.b(dialogInterface);
                }
            }
        }).show();
        show.setCanceledOnTouchOutside(bVar.f9446f);
        show.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.download.api.a.a.3
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                b.InterfaceC0178b interfaceC0178b = com.ss.android.download.api.model.b.this.f9448h;
                if (interfaceC0178b != null) {
                    interfaceC0178b.c(dialogInterface);
                }
            }
        });
        Drawable drawable = bVar.f9447g;
        if (drawable != null) {
            show.setIcon(drawable);
        }
        return show;
    }
}
