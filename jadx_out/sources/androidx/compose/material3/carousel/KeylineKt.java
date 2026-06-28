package androidx.compose.material3.carousel;

import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a1\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0000\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00002\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0000¨\u0006\u000e"}, d2 = {"", "carouselMainAxisSize", "Landroidx/compose/material3/carousel/CarouselAlignment;", "carouselAlignment", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "Lkotlin/r2;", "Lkotlin/u;", "keylines", "Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "", "pivotIndex", "pivotOffset", "material3_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KeylineKt {
    @l
    public static final KeylineList keylineListOf(float f5, @l CarouselAlignment carouselAlignment, @l v3.l<? super KeylineListScope, r2> lVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        lVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithAlignment(f5, carouselAlignment);
    }

    @l
    public static final KeylineList keylineListOf(float f5, int i5, float f6, @l v3.l<? super KeylineListScope, r2> lVar) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        lVar.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f5, i5, f6);
    }
}
