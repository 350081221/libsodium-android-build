.class Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi24;
.super Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x18
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi24;",
        "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;",
        "Landroid/view/KeyEvent;",
        "event",
        "Lkotlin/r2;",
        "sendKeyEvent",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Landroid/view/View;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public sendKeyEvent(Landroid/view/KeyEvent;)V
    .locals 2
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl;->requireImm()Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImpl;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/view/inputmethod/InputMethodManager;->dispatchKeyEventFromInputMethod(Landroid/view/View;Landroid/view/KeyEvent;)V

    return-void
.end method
