.class final Lcom/yuanqi/master/location/HistoryViewModel$c;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/HistoryViewModel;->f(Landroid/content/Context;Lv3/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/a<",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
.field final synthetic $action:Lv3/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/yuanqi/master/location/HistoryViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/HistoryViewModel;Lv3/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/location/HistoryViewModel;",
            "Lv3/a<",
            "Lkotlin/r2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/location/HistoryViewModel$c;->this$0:Lcom/yuanqi/master/location/HistoryViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/location/HistoryViewModel$c;->$action:Lv3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/location/HistoryViewModel$c;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    sget-object v0, Lcom/yuanqi/master/network/repository/e;->g:Lcom/yuanqi/master/network/repository/e;

    new-instance v1, Lcom/yuanqi/master/location/HistoryViewModel$c$a;

    iget-object v2, p0, Lcom/yuanqi/master/location/HistoryViewModel$c;->this$0:Lcom/yuanqi/master/location/HistoryViewModel;

    iget-object v3, p0, Lcom/yuanqi/master/location/HistoryViewModel$c;->$action:Lv3/a;

    invoke-direct {v1, v2, v3}, Lcom/yuanqi/master/location/HistoryViewModel$c$a;-><init>(Lcom/yuanqi/master/location/HistoryViewModel;Lv3/a;)V

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/network/repository/e;->k(Lv3/l;)Lio/reactivex/rxjava3/disposables/e;

    return-void
.end method
