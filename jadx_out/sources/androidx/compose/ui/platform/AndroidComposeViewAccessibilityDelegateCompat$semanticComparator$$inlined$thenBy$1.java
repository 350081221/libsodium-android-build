package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import com.umeng.analytics.pro.bi;
import java.util.Comparator;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", bi.ay, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$f", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@kotlin.jvm.internal.r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n1#1,328:1\n585#2:329\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1<T> implements Comparator {
    final /* synthetic */ Comparator $comparator;
    final /* synthetic */ Comparator $this_thenBy;

    public AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(Comparator comparator, Comparator comparator2) {
        this.$this_thenBy = comparator;
        this.$comparator = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t5, T t6) {
        int compare = this.$this_thenBy.compare(t5, t6);
        if (compare == 0) {
            return this.$comparator.compare(((SemanticsNode) t5).getLayoutNode$ui_release(), ((SemanticsNode) t6).getLayoutNode$ui_release());
        }
        return compare;
    }
}
