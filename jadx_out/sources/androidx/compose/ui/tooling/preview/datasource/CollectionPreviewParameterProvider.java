package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.Collection;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.sequences.m;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "T", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "collection", "Ljava/util/Collection;", "Lkotlin/sequences/m;", "getValues", "()Lkotlin/sequences/m;", "values", "<init>", "(Ljava/util/Collection;)V", "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {
    public static final int $stable = 8;

    @l
    private final Collection<T> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionPreviewParameterProvider(@l Collection<? extends T> collection) {
        this.collection = collection;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @l
    public m<T> getValues() {
        m<T> x12;
        x12 = e0.x1(this.collection);
        return x12;
    }
}
