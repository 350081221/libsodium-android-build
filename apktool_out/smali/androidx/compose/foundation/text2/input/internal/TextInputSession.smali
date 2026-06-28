.class public interface abstract Landroidx/compose/foundation/text2/input/internal/TextInputSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0008\u0005H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H&J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH&\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012\u00f8\u0001\u0001\u0082\u0002\r\n\u0005\u0008\u00a1\u001e0\u0001\n\u0004\u0008!0\u0001\u00a8\u0006\u0014\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/internal/TextInputSession;",
        "",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "block",
        "requestEdit",
        "Landroid/view/KeyEvent;",
        "keyEvent",
        "sendKeyEvent",
        "Landroidx/compose/ui/text/input/ImeAction;",
        "imeAction",
        "onImeAction-KlQnJC8",
        "(I)V",
        "onImeAction",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "getText",
        "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "text",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract getText()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
    .annotation build Lp4/l;
    .end annotation
.end method

.method public abstract onImeAction-KlQnJC8(I)V
.end method

.method public abstract requestEdit(Lv3/l;)V
    .param p1    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract sendKeyEvent(Landroid/view/KeyEvent;)V
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
