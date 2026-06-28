.class public final Landroidx/compose/foundation/text/KeyboardActionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0002\u0008\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/text/KeyboardActionScope;",
        "Lkotlin/r2;",
        "Lkotlin/u;",
        "onAny",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "KeyboardActions",
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
.method public static final KeyboardActions(Lv3/l;)Landroidx/compose/foundation/text/KeyboardActions;
    .locals 8
    .param p0    # Lv3/l;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/l<",
            "-",
            "Landroidx/compose/foundation/text/KeyboardActionScope;",
            "Lkotlin/r2;",
            ">;)",
            "Landroidx/compose/foundation/text/KeyboardActions;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v7, Landroidx/compose/foundation/text/KeyboardActions;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p0

    move-object v3, p0

    move-object v4, p0

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/l;)V

    return-object v7
.end method
