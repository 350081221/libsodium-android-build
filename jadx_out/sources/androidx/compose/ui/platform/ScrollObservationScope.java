package androidx.compose.ui.platform;

import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/ScrollObservationScope;", "Landroidx/compose/ui/node/OwnerScope;", "semanticsNodeId", "", "allScopes", "", "oldXValue", "", "oldYValue", "horizontalScrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "verticalScrollAxisRange", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/ScrollAxisRange;Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "getAllScopes", "()Ljava/util/List;", "getHorizontalScrollAxisRange", "()Landroidx/compose/ui/semantics/ScrollAxisRange;", "setHorizontalScrollAxisRange", "(Landroidx/compose/ui/semantics/ScrollAxisRange;)V", "isValidOwnerScope", "", "()Z", "getOldXValue", "()Ljava/lang/Float;", "setOldXValue", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getOldYValue", "setOldYValue", "getSemanticsNodeId", "()I", "getVerticalScrollAxisRange", "setVerticalScrollAxisRange", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollObservationScope implements OwnerScope {

    @p4.l
    private final List<ScrollObservationScope> allScopes;

    @p4.m
    private ScrollAxisRange horizontalScrollAxisRange;

    @p4.m
    private Float oldXValue;

    @p4.m
    private Float oldYValue;
    private final int semanticsNodeId;

    @p4.m
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i5, @p4.l List<ScrollObservationScope> list, @p4.m Float f5, @p4.m Float f6, @p4.m ScrollAxisRange scrollAxisRange, @p4.m ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i5;
        this.allScopes = list;
        this.oldXValue = f5;
        this.oldYValue = f6;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @p4.l
    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    @p4.m
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    @p4.m
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @p4.m
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    @p4.m
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@p4.m ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(@p4.m Float f5) {
        this.oldXValue = f5;
    }

    public final void setOldYValue(@p4.m Float f5) {
        this.oldYValue = f5;
    }

    public final void setVerticalScrollAxisRange(@p4.m ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
