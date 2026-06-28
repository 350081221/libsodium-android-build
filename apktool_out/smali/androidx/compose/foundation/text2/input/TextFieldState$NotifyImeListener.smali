.class public interface abstract Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/text2/input/TextFieldState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NotifyImeListener"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e0\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"
    }
    d2 = {
        "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;",
        "",
        "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;",
        "oldValue",
        "newValue",
        "Lkotlin/r2;",
        "onChange",
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
.method public abstract onChange(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/TextFieldCharSequence;)V
    .param p1    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/text2/input/TextFieldCharSequence;
        .annotation build Lp4/l;
        .end annotation
    .end param
.end method
