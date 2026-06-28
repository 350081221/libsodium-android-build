package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\tJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\nR&\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "T", "", "node", "Lkotlin/r2;", "scheduleInvalidation", "(Ljava/util/Set;Ljava/lang/Object;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Lkotlin/Function1;", "Lkotlin/Function0;", "onRequestApplyChangesListener", "Lv3/l;", "focusTargetNodes", "Ljava/util/Set;", "focusEventNodes", "focusPropertiesNodes", "invalidateNodes", "Lv3/a;", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;

    @l
    private final v3.l<a<r2>, r2> onRequestApplyChangesListener;

    @l
    private Set<FocusTargetNode> focusTargetNodes = new LinkedHashSet();

    @l
    private Set<FocusEventModifierNode> focusEventNodes = new LinkedHashSet();

    @l
    private Set<FocusPropertiesModifierNode> focusPropertiesNodes = new LinkedHashSet();

    @l
    private final a<r2> invalidateNodes = new FocusInvalidationManager$invalidateNodes$1(this);

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@l v3.l<? super a<r2>, r2> lVar) {
        this.onRequestApplyChangesListener = lVar;
    }

    public final void scheduleInvalidation(@l FocusTargetNode focusTargetNode) {
        scheduleInvalidation(this.focusTargetNodes, focusTargetNode);
    }

    public final void scheduleInvalidation(@l FocusEventModifierNode focusEventModifierNode) {
        scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
    }

    public final void scheduleInvalidation(@l FocusPropertiesModifierNode focusPropertiesModifierNode) {
        scheduleInvalidation(this.focusPropertiesNodes, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t5) {
        if (set.add(t5) && this.focusTargetNodes.size() + this.focusEventNodes.size() + this.focusPropertiesNodes.size() == 1) {
            this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
        }
    }
}
