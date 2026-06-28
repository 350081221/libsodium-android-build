package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/r2;", "Lkotlin/u;", "block", "record", "core-ktx_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PictureKt {
    @p4.l
    public static final Picture record(@p4.l Picture picture, int i5, int i6, @p4.l v3.l<? super Canvas, r2> lVar) {
        Canvas beginRecording = picture.beginRecording(i5, i6);
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            kotlin.jvm.internal.i0.d(1);
            picture.endRecording();
            kotlin.jvm.internal.i0.c(1);
        }
    }
}
