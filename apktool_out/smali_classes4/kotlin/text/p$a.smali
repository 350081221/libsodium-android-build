.class public final Lkotlin/text/p$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/text/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(Lkotlin/text/p;)Lkotlin/text/p$b;
    .locals 1
    .param p0    # Lkotlin/text/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    new-instance v0, Lkotlin/text/p$b;

    invoke-direct {v0, p0}, Lkotlin/text/p$b;-><init>(Lkotlin/text/p;)V

    return-object v0
.end method
