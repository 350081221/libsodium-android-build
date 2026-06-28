package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001a\u0010\u0016\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/CombinedModifier;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "all", "", "other", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "outer", "Landroidx/compose/ui/Modifier;", "getOuter$ui_release", "()Landroidx/compose/ui/Modifier;", bi.ax, "getInner$ui_release", "<init>", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;

    @l
    private final Modifier inner;

    @l
    private final Modifier outer;

    public CombinedModifier(@l Modifier modifier, @l Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(@l v3.l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.all(lVar) && this.inner.all(lVar);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(@l v3.l<? super Modifier.Element, Boolean> lVar) {
        return this.outer.any(lVar) || this.inner.any(lVar);
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (l0.g(this.outer, combinedModifier.outer) && l0.g(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r5, @l p<? super R, ? super Modifier.Element, ? extends R> pVar) {
        return (R) this.inner.foldIn(this.outer.foldIn(r5, pVar), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r5, @l p<? super Modifier.Element, ? super R, ? extends R> pVar) {
        return (R) this.outer.foldOut(this.inner.foldOut(r5, pVar), pVar);
    }

    @l
    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    @l
    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @l
    public String toString() {
        return '[' + ((String) foldIn("", CombinedModifier$toString$1.INSTANCE)) + ']';
    }
}
