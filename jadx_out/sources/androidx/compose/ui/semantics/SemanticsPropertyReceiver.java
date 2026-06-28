package androidx.compose.ui.semantics;

import kotlin.i0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "T", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "Lkotlin/r2;", "set", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface SemanticsPropertyReceiver {
    <T> void set(@l SemanticsPropertyKey<T> semanticsPropertyKey, T t5);
}
