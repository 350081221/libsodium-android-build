package androidx.compose.material3.carousel;

import kotlin.i0;

@i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScope;", "", "", "size", "", "isAnchor", "Lkotlin/r2;", "add", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface KeylineListScope {
    static /* synthetic */ void add$default(KeylineListScope keylineListScope, float f5, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        keylineListScope.add(f5, z4);
    }

    void add(float f5, boolean z4);
}
