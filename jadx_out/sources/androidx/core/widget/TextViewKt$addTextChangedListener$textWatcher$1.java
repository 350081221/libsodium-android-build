package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.r;

@i0(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", bi.aE, "Lkotlin/r2;", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n*L\n1#1,97:1\n*E\n"})
/* loaded from: classes2.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ v3.l<Editable, r2> $afterTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, r2> $beforeTextChanged;
    final /* synthetic */ r<CharSequence, Integer, Integer, Integer, r2> $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(v3.l<? super Editable, r2> lVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r2> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, r2> rVar2) {
        this.$afterTextChanged = lVar;
        this.$beforeTextChanged = rVar;
        this.$onTextChanged = rVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@m Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@m CharSequence charSequence, int i5, int i6, int i7) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@m CharSequence charSequence, int i5, int i6, int i7) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
    }
}
