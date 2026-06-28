.class Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;
.super Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x18
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0013\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi24;",
        "Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;",
        "",
        "p0",
        "p1",
        "",
        "deleteSurroundingTextInCodePoints",
        "Landroid/os/Handler;",
        "getHandler",
        "Landroid/view/inputmethod/InputConnection;",
        "delegate",
        "Lkotlin/r2;",
        "closeDelegate",
        "Lkotlin/Function0;",
        "onConnectionClosed",
        "<init>",
        "(Landroid/view/inputmethod/InputConnection;Lv3/a;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lv3/a;)V
    .locals 0
    .param p1    # Landroid/view/inputmethod/InputConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/inputmethod/InputConnection;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;-><init>(Landroid/view/inputmethod/InputConnection;Lv3/a;)V

    return-void
.end method


# virtual methods
.method protected final closeDelegate(Landroid/view/inputmethod/InputConnection;)V
    .locals 0
    .param p1    # Landroid/view/inputmethod/InputConnection;
        .annotation build Lp4/l;
        .end annotation
    .end param

    invoke-interface {p1}, Landroid/view/inputmethod/InputConnection;->closeConnection()V

    return-void
.end method

.method public final deleteSurroundingTextInCodePoints(II)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;->getDelegate()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroid/view/inputmethod/InputConnection;->deleteSurroundingTextInCodePoints(II)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/text/input/NullableInputConnectionWrapperApi21;->getDelegate()Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/view/inputmethod/InputConnection;->getHandler()Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
