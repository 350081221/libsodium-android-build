package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.q;

@StabilityInferred(parameters = 2)
@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012&\u0010\t\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\r\u0010\u000eR7\u0010\t\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "parameter", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Lv3/q;", "getContent", "()Lv3/q;", "<init>", "(Lv3/q;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@InternalComposeApi
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;

    @l
    private final q<P, Composer, Integer, r2> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(@l q<? super P, ? super Composer, ? super Integer, r2> qVar) {
        this.content = qVar;
    }

    @l
    public final q<P, Composer, Integer, r2> getContent() {
        return this.content;
    }
}
