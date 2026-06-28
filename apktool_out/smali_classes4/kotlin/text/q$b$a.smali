.class final Lkotlin/text/q$b$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/text/q$b;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/Integer;",
        "Lkotlin/text/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/text/MatchGroup;",
        "it",
        "",
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
.field final synthetic this$0:Lkotlin/text/q$b;


# direct methods
.method constructor <init>(Lkotlin/text/q$b;)V
    .locals 0

    iput-object p1, p0, Lkotlin/text/q$b$a;->this$0:Lkotlin/text/q$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lkotlin/text/q$b$a;->invoke(I)Lkotlin/text/m;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(I)Lkotlin/text/m;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/text/q$b$a;->this$0:Lkotlin/text/q$b;

    invoke-virtual {v0, p1}, Lkotlin/text/q$b;->get(I)Lkotlin/text/m;

    move-result-object p1

    return-object p1
.end method
