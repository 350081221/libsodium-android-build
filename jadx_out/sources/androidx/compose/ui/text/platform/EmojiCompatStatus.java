package androidx.compose.ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "newDelegate", "Lkotlin/r2;", "setDelegateForTesting$ui_text_release", "(Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;)V", "setDelegateForTesting", "delegate", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "Landroidx/compose/runtime/State;", "", "getFontLoaded", "()Landroidx/compose/runtime/State;", "fontLoaded", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    @l
    public static final EmojiCompatStatus INSTANCE = new EmojiCompatStatus();

    @l
    private static EmojiCompatStatusDelegate delegate = new DefaultImpl();
    public static final int $stable = 8;

    private EmojiCompatStatus() {
    }

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @l
    public State<Boolean> getFontLoaded() {
        return delegate.getFontLoaded();
    }

    @VisibleForTesting
    public final void setDelegateForTesting$ui_text_release(@m EmojiCompatStatusDelegate emojiCompatStatusDelegate) {
        if (emojiCompatStatusDelegate == null) {
            emojiCompatStatusDelegate = new DefaultImpl();
        }
        delegate = emojiCompatStatusDelegate;
    }
}
