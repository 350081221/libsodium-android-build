.class final Lokio/v$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/v;->B(Lokio/d1;Z)Lkotlin/sequences/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lokio/d1;",
        "Lokio/d1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lokio/Path;",
        "it",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lokio/v;


# direct methods
.method constructor <init>(Lokio/v;)V
    .locals 0

    iput-object p1, p0, Lokio/v$a;->this$0:Lokio/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lokio/d1;

    invoke-virtual {p0, p1}, Lokio/v$a;->invoke(Lokio/d1;)Lokio/d1;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lokio/d1;)Lokio/d1;
    .locals 2
    .param p1    # Lokio/d1;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation build Lp4/l;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lokio/v$a;->this$0:Lokio/v;

    const-string v1, "listRecursively"

    invoke-virtual {v0, p1, v1}, Lokio/v;->P(Lokio/d1;Ljava/lang/String;)Lokio/d1;

    move-result-object p1

    return-object p1
.end method
