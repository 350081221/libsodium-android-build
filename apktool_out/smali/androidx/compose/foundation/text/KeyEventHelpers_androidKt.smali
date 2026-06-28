.class public final Landroidx/compose/foundation/text/KeyEventHelpers_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0008\u0010\u0006\u001a\u00020\u0005H\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "",
        "cancelsTextSelection-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "cancelsTextSelection",
        "Lkotlin/r2;",
        "showCharacterPalette",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final cancelsTextSelection-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 2
    .param p0    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result p0

    sget-object v0, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final showCharacterPalette()V
    .locals 0

    return-void
.end method
