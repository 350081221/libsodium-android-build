package com.yuanqi.master.tools.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.yqtech.multiapp.R;
import com.yuanqi.master.tools.dialog.a;

/* loaded from: classes3.dex */
public class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final com.yuanqi.master.tools.dialog.a f15096a;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final a.C0433a f15097a;

        public a(Context context) {
            this(context, R.style.dialog);
        }

        public a a() {
            this.f15097a.f15094s = R.style.dialog_scale_anim;
            return this;
        }

        public b b() {
            a.C0433a c0433a = this.f15097a;
            b bVar = new b(c0433a.f15076a, c0433a.f15077b);
            this.f15097a.a(bVar.f15096a);
            bVar.setCancelable(this.f15097a.f15078c);
            if (this.f15097a.f15078c) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f15097a.f15079d);
            bVar.setOnDismissListener(this.f15097a.f15080e);
            DialogInterface.OnKeyListener onKeyListener = this.f15097a.f15081f;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public a c(boolean z4) {
            if (z4) {
                this.f15097a.f15094s = R.style.dialog_from_bottom_anim;
            }
            this.f15097a.f15095t = 80;
            return this;
        }

        public a d(boolean z4) {
            if (z4) {
                this.f15097a.f15094s = R.style.dialog_scale_anim;
            }
            this.f15097a.f15095t = 5;
            return this;
        }

        public a e(boolean z4) {
            if (z4) {
                this.f15097a.f15094s = R.style.dialog_scale_anim;
            }
            this.f15097a.f15095t = 48;
            return this;
        }

        public a f() {
            this.f15097a.f15090o = -1;
            return this;
        }

        public a g(int i5) {
            this.f15097a.f15094s = i5;
            return this;
        }

        public a h(int i5, Bitmap bitmap) {
            this.f15097a.f15087l.put(i5, bitmap);
            return this;
        }

        public a i(boolean z4) {
            this.f15097a.f15078c = z4;
            return this;
        }

        public a j(int i5) {
            a.C0433a c0433a = this.f15097a;
            c0433a.f15089n = null;
            c0433a.f15088m = i5;
            return this;
        }

        public a k(View view) {
            a.C0433a c0433a = this.f15097a;
            c0433a.f15089n = view;
            c0433a.f15088m = 0;
            return this;
        }

        public a l(int i5, int i6) {
            this.f15097a.f15086k.put(i5, Integer.valueOf(i6));
            return this;
        }

        public a m(DialogInterface.OnCancelListener onCancelListener) {
            this.f15097a.f15079d = onCancelListener;
            return this;
        }

        public a n(int i5, View.OnClickListener onClickListener) {
            this.f15097a.f15084i.put(i5, onClickListener);
            return this;
        }

        public a o(DialogInterface.OnDismissListener onDismissListener) {
            this.f15097a.f15080e = onDismissListener;
            return this;
        }

        public a p(DialogInterface.OnKeyListener onKeyListener) {
            this.f15097a.f15081f = onKeyListener;
            return this;
        }

        public a q(int i5, View.OnLongClickListener onLongClickListener) {
            this.f15097a.f15085j.put(i5, onLongClickListener);
            return this;
        }

        public a r(int i5, CharSequence charSequence) {
            this.f15097a.f15083h.put(i5, charSequence);
            return this;
        }

        public a s(int i5, int i6) {
            this.f15097a.f15082g.put(i5, Integer.valueOf(i6));
            return this;
        }

        public a t(int i5, int i6) {
            a.C0433a c0433a = this.f15097a;
            c0433a.f15090o = i5;
            c0433a.f15091p = i6;
            return this;
        }

        public a u(int i5, int i6, int i7, int i8) {
            a.C0433a c0433a = this.f15097a;
            c0433a.f15090o = i5;
            c0433a.f15091p = i6;
            c0433a.f15092q = i7;
            c0433a.f15093r = i8;
            return this;
        }

        public b v() {
            b b5 = b();
            b5.show();
            return b5;
        }

        public a(Context context, int i5) {
            this.f15097a = new a.C0433a(context, i5);
        }
    }

    public b(@NonNull Context context, @StyleRes int i5) {
        super(context, i5);
        this.f15096a = new com.yuanqi.master.tools.dialog.a(this, getWindow());
    }

    public <T extends View> T b(int i5) {
        return (T) this.f15096a.b(i5);
    }

    public void c(int i5, View.OnClickListener onClickListener) {
        this.f15096a.f(i5, onClickListener);
    }

    public void d(int i5, CharSequence charSequence) {
        this.f15096a.g(i5, charSequence);
    }
}
