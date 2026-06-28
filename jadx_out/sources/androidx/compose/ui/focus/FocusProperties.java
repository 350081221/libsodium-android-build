package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import com.umeng.analytics.pro.d;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR$\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR$\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rRB\u0010,\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)RB\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\b0$8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "<anonymous parameter 0>", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "getPrevious", "setPrevious", "previous", "getUp", "setUp", d.R, "getDown", "setDown", "down", "getLeft", "setLeft", "left", "getRight", "setRight", "right", "getStart", "setStart", "start", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "getEnter", "()Lv3/l;", "setEnter", "(Lv3/l;)V", "getEnter$annotations", "()V", "enter", "getExit", "setExit", "getExit$annotations", com.alipay.sdk.m.x.d.f3034z, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface FocusProperties {
    @ExperimentalComposeUiApi
    static /* synthetic */ void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    @l
    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    @ExperimentalComposeUiApi
    default v3.l<FocusDirection, FocusRequester> getEnter() {
        return FocusProperties$enter$1.INSTANCE;
    }

    @l
    @ExperimentalComposeUiApi
    default v3.l<FocusDirection, FocusRequester> getExit() {
        return FocusProperties$exit$1.INSTANCE;
    }

    @l
    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @l
    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean z4);

    default void setDown(@l FocusRequester focusRequester) {
    }

    default void setEnd(@l FocusRequester focusRequester) {
    }

    @ExperimentalComposeUiApi
    default void setEnter(@l v3.l<? super FocusDirection, FocusRequester> lVar) {
    }

    @ExperimentalComposeUiApi
    default void setExit(@l v3.l<? super FocusDirection, FocusRequester> lVar) {
    }

    default void setLeft(@l FocusRequester focusRequester) {
    }

    default void setNext(@l FocusRequester focusRequester) {
    }

    default void setPrevious(@l FocusRequester focusRequester) {
    }

    default void setRight(@l FocusRequester focusRequester) {
    }

    default void setStart(@l FocusRequester focusRequester) {
    }

    default void setUp(@l FocusRequester focusRequester) {
    }
}
