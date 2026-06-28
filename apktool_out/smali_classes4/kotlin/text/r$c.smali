.class final Lkotlin/text/r$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/r;->findAll(Ljava/lang/CharSequence;I)Lkotlin/sequences/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/text/p;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/text/MatchResult;",
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
.field final synthetic $input:Ljava/lang/CharSequence;

.field final synthetic $startIndex:I

.field final synthetic this$0:Lkotlin/text/r;


# direct methods
.method constructor <init>(Lkotlin/text/r;Ljava/lang/CharSequence;I)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/r$c;->this$0:Lkotlin/text/r;

    iput-object p2, p0, Lkotlin/text/r$c;->$input:Ljava/lang/CharSequence;

    iput p3, p0, Lkotlin/text/r$c;->$startIndex:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/text/r$c;->invoke()Lkotlin/text/p;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Lkotlin/text/p;
    .locals 3
    .annotation build Lp4/m;
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/text/r$c;->this$0:Lkotlin/text/r;

    iget-object v1, p0, Lkotlin/text/r$c;->$input:Ljava/lang/CharSequence;

    iget v2, p0, Lkotlin/text/r$c;->$startIndex:I

    invoke-virtual {v0, v1, v2}, Lkotlin/text/r;->find(Ljava/lang/CharSequence;I)Lkotlin/text/p;

    move-result-object v0

    return-object v0
.end method
