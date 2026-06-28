package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0018H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0019H&R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u00020\u001e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "Lkotlin/r2;", "takeFocus", "releaseFocus", "", TTDownloadField.TT_FORCE, "refreshFocusEvents", "clearFocus", "Landroidx/compose/ui/geometry/Rect;", "getFocusRect", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "dispatchKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchRotaryEvent", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    void clearFocus(boolean z4, boolean z5);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo3428dispatchInterceptedSoftKeyboardEventZmokQxo(@l KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-ZmokQxo, reason: not valid java name */
    boolean mo3429dispatchKeyEventZmokQxo(@l KeyEvent keyEvent);

    boolean dispatchRotaryEvent(@l RotaryScrollEvent rotaryScrollEvent);

    @m
    Rect getFocusRect();

    @l
    FocusTransactionManager getFocusTransactionManager();

    @l
    LayoutDirection getLayoutDirection();

    @l
    Modifier getModifier();

    void releaseFocus();

    void scheduleInvalidation(@l FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(@l FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(@l FocusTargetNode focusTargetNode);

    void setLayoutDirection(@l LayoutDirection layoutDirection);

    void takeFocus();
}
