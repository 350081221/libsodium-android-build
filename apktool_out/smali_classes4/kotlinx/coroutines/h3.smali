.class public final Lkotlinx/coroutines/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u000e\u0008\u0004\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\u0008*\n\u0010\u0006\"\u00020\u00032\u00020\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Lkotlin/r2;",
        "block",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "a",
        "Runnable",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lv3/a;)Ljava/lang/Runnable;
    .locals 1
    .param p0    # Lv3/a;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlinx/coroutines/h3$a;

    invoke-direct {v0, p0}, Lkotlinx/coroutines/h3$a;-><init>(Lv3/a;)V

    return-object v0
.end method
