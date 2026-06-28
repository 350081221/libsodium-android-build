package androidx.core.app;

import androidx.core.util.Consumer;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/core/app/OnMultiWindowModeChangedProvider;", "", "Landroidx/core/util/Consumer;", "Landroidx/core/app/MultiWindowModeChangedInfo;", "listener", "Lkotlin/r2;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface OnMultiWindowModeChangedProvider {
    void addOnMultiWindowModeChangedListener(@p4.l Consumer<MultiWindowModeChangedInfo> consumer);

    void removeOnMultiWindowModeChangedListener(@p4.l Consumer<MultiWindowModeChangedInfo> consumer);
}
