package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;

@i0(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aN\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b\u001a8\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b¨\u0006\u0013"}, d2 = {"", "T", "Landroid/content/Context;", "getSystemService", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/r2;", "Lkotlin/u;", "block", "withStyledAttributes", "resourceId", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ContextKt {
    public static final /* synthetic */ <T> T getSystemService(Context context) {
        l0.y(4, "T");
        return (T) ContextCompat.getSystemService(context, Object.class);
    }

    public static final void withStyledAttributes(@p4.l Context context, @p4.m AttributeSet attributeSet, @p4.l int[] iArr, @AttrRes int i5, @StyleRes int i6, @p4.l v3.l<? super TypedArray, r2> lVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, i6);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void withStyledAttributes$default(Context context, AttributeSet attributeSet, int[] iArr, int i5, int i6, v3.l lVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            attributeSet = null;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, i6);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void withStyledAttributes(@p4.l Context context, @StyleRes int i5, @p4.l int[] iArr, @p4.l v3.l<? super TypedArray, r2> lVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, iArr);
        lVar.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
