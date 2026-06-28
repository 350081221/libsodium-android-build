package com.ss.android.downloadlib.c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.download.api.model.b;
import com.ss.android.socialbase.appdownloader.c.k;
import com.ss.android.socialbase.appdownloader.c.l;

/* loaded from: classes3.dex */
public class g extends com.ss.android.socialbase.appdownloader.c.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f10010a = "g";

    /* loaded from: classes3.dex */
    private static class a implements k {

        /* renamed from: a, reason: collision with root package name */
        private Dialog f10018a;

        public a(Dialog dialog) {
            if (dialog != null) {
                this.f10018a = dialog;
                a();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.c.k
        public void a() {
            Dialog dialog = this.f10018a;
            if (dialog != null) {
                dialog.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.c.k
        public boolean b() {
            Dialog dialog = this.f10018a;
            if (dialog != null) {
                return dialog.isShowing();
            }
            return false;
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.c.a, com.ss.android.socialbase.appdownloader.c.c
    public l a(Context context) {
        return new l(context) { // from class: com.ss.android.downloadlib.c.g.1

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f10011a;

            /* renamed from: c, reason: collision with root package name */
            private b.a f10013c;

            /* renamed from: d, reason: collision with root package name */
            private DialogInterface.OnClickListener f10014d;

            /* renamed from: e, reason: collision with root package name */
            private DialogInterface.OnClickListener f10015e;

            /* renamed from: f, reason: collision with root package name */
            private DialogInterface.OnCancelListener f10016f;

            {
                this.f10011a = context;
                this.f10013c = new b.a(context);
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l a(int i5) {
                this.f10013c.a(this.f10011a.getResources().getString(i5));
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l b(int i5, DialogInterface.OnClickListener onClickListener) {
                this.f10013c.d(this.f10011a.getResources().getString(i5));
                this.f10015e = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l a(String str) {
                this.f10013c.b(str);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l a(int i5, DialogInterface.OnClickListener onClickListener) {
                this.f10013c.c(this.f10011a.getResources().getString(i5));
                this.f10014d = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l a(DialogInterface.OnCancelListener onCancelListener) {
                this.f10016f = onCancelListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public l a(boolean z4) {
                this.f10013c.a(z4);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.c.l
            public k a() {
                this.f10013c.a(new b.InterfaceC0178b() { // from class: com.ss.android.downloadlib.c.g.1.1
                    @Override // com.ss.android.download.api.model.b.InterfaceC0178b
                    public void a(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f10014d != null) {
                            AnonymousClass1.this.f10014d.onClick(dialogInterface, -1);
                        }
                    }

                    @Override // com.ss.android.download.api.model.b.InterfaceC0178b
                    public void b(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f10015e != null) {
                            AnonymousClass1.this.f10015e.onClick(dialogInterface, -2);
                        }
                    }

                    @Override // com.ss.android.download.api.model.b.InterfaceC0178b
                    public void c(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f10016f != null && dialogInterface != null) {
                            AnonymousClass1.this.f10016f.onCancel(dialogInterface);
                        }
                    }
                });
                com.ss.android.downloadlib.g.k.a(g.f10010a, "getThemedAlertDlgBuilder", null);
                this.f10013c.a(3);
                return new a(com.ss.android.downloadlib.addownload.k.d().b(this.f10013c.a()));
            }
        };
    }
}
