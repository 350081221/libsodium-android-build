package com.ss.android.socialbase.appdownloader.d;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.socialbase.appdownloader.c.k;
import com.ss.android.socialbase.appdownloader.c.l;

/* loaded from: classes3.dex */
public class a extends com.ss.android.socialbase.appdownloader.c.b {

    /* renamed from: a, reason: collision with root package name */
    private AlertDialog.Builder f10256a;

    /* renamed from: com.ss.android.socialbase.appdownloader.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0194a implements k {

        /* renamed from: a, reason: collision with root package name */
        private AlertDialog f10257a;

        public C0194a(AlertDialog.Builder builder) {
            if (builder != null) {
                this.f10257a = builder.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.c.k
        public void a() {
            AlertDialog alertDialog = this.f10257a;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.c.k
        public boolean b() {
            AlertDialog alertDialog = this.f10257a;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }
    }

    public a(Context context) {
        this.f10256a = new AlertDialog.Builder(context);
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public l a(int i5) {
        AlertDialog.Builder builder = this.f10256a;
        if (builder != null) {
            builder.setTitle(i5);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public l b(int i5, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f10256a;
        if (builder != null) {
            builder.setNegativeButton(i5, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public l a(String str) {
        AlertDialog.Builder builder = this.f10256a;
        if (builder != null) {
            builder.setMessage(str);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public l a(int i5, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.f10256a;
        if (builder != null) {
            builder.setPositiveButton(i5, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public l a(DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = this.f10256a;
        if (builder != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.c.l
    public k a() {
        return new C0194a(this.f10256a);
    }
}
