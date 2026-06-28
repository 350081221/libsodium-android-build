package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.alipay.sdk.m.x.d;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/focus/FocusRestorerNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Lkotlin/r2;", "applyFocusProperties", "Lkotlin/Function0;", "Landroidx/compose/ui/focus/FocusRequester;", "onRestoreFailed", "Lv3/a;", "getOnRestoreFailed", "()Lv3/a;", "setOnRestoreFailed", "(Lv3/a;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", d.f3026r, "Lv3/l;", "onEnter", "getOnEnter$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusRestorerNode extends Modifier.Node implements FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;

    @m
    private a<FocusRequester> onRestoreFailed;

    @l
    private final v3.l<FocusDirection, FocusRequester> onExit = new FocusRestorerNode$onExit$1(this);

    @l
    private final v3.l<FocusDirection, FocusRequester> onEnter = new FocusRestorerNode$onEnter$1(this);

    public FocusRestorerNode(@m a<FocusRequester> aVar) {
        this.onRestoreFailed = aVar;
    }

    private static /* synthetic */ void getOnEnter$annotations() {
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@l FocusProperties focusProperties) {
        focusProperties.setEnter(this.onEnter);
        focusProperties.setExit(this.onExit);
    }

    @m
    public final a<FocusRequester> getOnRestoreFailed() {
        return this.onRestoreFailed;
    }

    public final void setOnRestoreFailed(@m a<FocusRequester> aVar) {
        this.onRestoreFailed = aVar;
    }
}
