package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "children", "Lv3/q;", "getChildren", "()Lv3/q;", "<init>", "(Landroidx/compose/ui/text/Placeholder;Lv3/q;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;

    @l
    private final q<String, Composer, Integer, r2> children;

    @l
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@l Placeholder placeholder, @l q<? super String, ? super Composer, ? super Integer, r2> qVar) {
        this.placeholder = placeholder;
        this.children = qVar;
    }

    @l
    public final q<String, Composer, Integer, r2> getChildren() {
        return this.children;
    }

    @l
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
