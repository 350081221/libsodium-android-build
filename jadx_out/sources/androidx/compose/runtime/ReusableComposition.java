package androidx.compose.runtime;

import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00032\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H&\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/Composition;", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "setContentWithReuse", "(Lv3/p;)V", "deactivate", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ReusableComposition extends Composition {
    void deactivate();

    void setContentWithReuse(@l p<? super Composer, ? super Integer, r2> pVar);
}
