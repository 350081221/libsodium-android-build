package com.lzf.easyfloat.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;
import p4.m;
import u3.i;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/lzf/easyfloat/utils/f;", "", "Landroid/widget/EditText;", "editText", "", TTDownloadField.TT_TAG, "Lkotlin/r2;", "j", "d", "(Ljava/lang/String;)Lkotlin/r2;", "f", "(Landroid/widget/EditText;Ljava/lang/String;)V", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final f f9289a = new f();

    private f() {
    }

    @m
    @i
    @u3.m
    public static final r2 c() {
        return e(null, 1, null);
    }

    @m
    @i
    @u3.m
    public static final r2 d(@m String str) {
        com.lzf.easyfloat.core.d e5 = com.lzf.easyfloat.core.e.f9234a.e(str);
        if (e5 == null) {
            return null;
        }
        e5.u().flags = 40;
        e5.w().updateViewLayout(e5.t(), e5.u());
        return r2.f19517a;
    }

    public static /* synthetic */ r2 e(String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        return d(str);
    }

    public static /* synthetic */ void g(f fVar, EditText editText, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        fVar.f(editText, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(EditText editText, String str, View view, MotionEvent motionEvent) {
        l0.p(editText, "$editText");
        if (motionEvent.getAction() == 0) {
            j(editText, str);
            return false;
        }
        return false;
    }

    @i
    @u3.m
    public static final void i(@l EditText editText) {
        l0.p(editText, "editText");
        k(editText, null, 2, null);
    }

    @i
    @u3.m
    public static final void j(@l final EditText editText, @m String str) {
        l0.p(editText, "editText");
        com.lzf.easyfloat.core.d e5 = com.lzf.easyfloat.core.e.f9234a.e(str);
        if (e5 != null) {
            e5.u().flags = 32;
            e5.w().updateViewLayout(e5.t(), e5.u());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.lzf.easyfloat.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                f.l(editText);
            }
        }, 100L);
    }

    public static /* synthetic */ void k(EditText editText, String str, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        j(editText, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EditText editText) {
        l0.p(editText, "$editText");
        InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void f(@l final EditText editText, @m final String str) {
        l0.p(editText, "editText");
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.lzf.easyfloat.utils.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean h5;
                h5 = f.h(editText, str, view, motionEvent);
                return h5;
            }
        });
    }
}
