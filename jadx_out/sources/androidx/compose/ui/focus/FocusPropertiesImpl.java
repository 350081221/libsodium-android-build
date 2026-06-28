package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b3\u0010.R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001c\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\"\u0010\"\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR4\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R4\u0010/\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\t0%8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b/\u0010(\u0012\u0004\b2\u0010.\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,¨\u00064"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "Z", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "Landroidx/compose/ui/focus/FocusRequester;", "next", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", d.R, "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "Lv3/l;", "getEnter", "()Lv3/l;", "setEnter", "(Lv3/l;)V", "getEnter$annotations", "()V", com.alipay.sdk.m.x.d.f3034z, "getExit", "setExit", "getExit$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;

    @l
    private FocusRequester down;

    @l
    private FocusRequester end;

    @l
    private v3.l<? super FocusDirection, FocusRequester> enter;

    @l
    private v3.l<? super FocusDirection, FocusRequester> exit;

    @l
    private FocusRequester left;

    @l
    private FocusRequester next;

    @l
    private FocusRequester previous;

    @l
    private FocusRequester right;

    @l
    private FocusRequester start;

    @l
    private FocusRequester up;

    public FocusPropertiesImpl() {
        FocusRequester.Companion companion = FocusRequester.Companion;
        this.next = companion.getDefault();
        this.previous = companion.getDefault();
        this.up = companion.getDefault();
        this.down = companion.getDefault();
        this.left = companion.getDefault();
        this.right = companion.getDefault();
        this.start = companion.getDefault();
        this.end = companion.getDefault();
        this.enter = FocusPropertiesImpl$enter$1.INSTANCE;
        this.exit = FocusPropertiesImpl$exit$1.INSTANCE;
    }

    public static /* synthetic */ void getEnter$annotations() {
    }

    public static /* synthetic */ void getExit$annotations() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public v3.l<FocusDirection, FocusRequester> getEnter() {
        return this.enter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public v3.l<FocusDirection, FocusRequester> getExit() {
        return this.exit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    @l
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z4) {
        this.canFocus = z4;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(@l FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(@l FocusRequester focusRequester) {
        this.end = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnter(@l v3.l<? super FocusDirection, FocusRequester> lVar) {
        this.enter = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setExit(@l v3.l<? super FocusDirection, FocusRequester> lVar) {
        this.exit = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(@l FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(@l FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(@l FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(@l FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(@l FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(@l FocusRequester focusRequester) {
        this.up = focusRequester;
    }
}
