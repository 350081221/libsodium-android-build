.class public interface abstract Landroidx/compose/ui/focus/FocusOwner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusManager;


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H&J\u0008\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000bH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000bH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0018H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0019H&R\u0014\u0010\u001d\u001a\u00020\u001a8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010#\u001a\u00020\u001e8&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u0014\u0010\'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006(\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwner;",
        "Landroidx/compose/ui/focus/FocusManager;",
        "Lkotlin/r2;",
        "takeFocus",
        "releaseFocus",
        "",
        "force",
        "refreshFocusEvents",
        "clearFocus",
        "Landroidx/compose/ui/geometry/Rect;",
        "getFocusRect",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "keyEvent",
        "dispatchKeyEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "dispatchKeyEvent",
        "dispatchInterceptedSoftKeyboardEvent-ZmokQxo",
        "dispatchInterceptedSoftKeyboardEvent",
        "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
        "event",
        "dispatchRotaryEvent",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "node",
        "scheduleInvalidation",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "getLayoutDirection",
        "()Landroidx/compose/ui/unit/LayoutDirection;",
        "setLayoutDirection",
        "(Landroidx/compose/ui/unit/LayoutDirection;)V",
        "layoutDirection",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "getFocusTransactionManager",
        "()Landroidx/compose/ui/focus/FocusTransactionManager;",
        "focusTransactionManager",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract clearFocus(ZZ)V
.end method

.method public abstract dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract dispatchKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z
    .param p1    # Landroidx/compose/ui/input/rotary/RotaryScrollEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract getFocusRect()Landroidx/compose/ui/geometry/Rect;
    .annotation build Lp4/m;
    .end annotation
.end method

.method public abstract getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract getModifier()Landroidx/compose/ui/Modifier;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract releaseFocus()V
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .param p1    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract setLayoutDirection(Landroidx/compose/ui/unit/LayoutDirection;)V
    .param p1    # Landroidx/compose/ui/unit/LayoutDirection;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method

.method public abstract takeFocus()V
.end method
