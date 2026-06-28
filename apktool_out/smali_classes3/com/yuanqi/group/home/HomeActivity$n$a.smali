.class final Lcom/yuanqi/group/home/HomeActivity$n$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity$n;->invoke()V
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
.field final synthetic $appData:Lcom/yuanqi/group/home/models/b;

.field final synthetic $position:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;ILcom/yuanqi/group/home/models/b;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput p2, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$position:I

    iput-object p3, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$appData:Lcom/yuanqi/group/home/models/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$n$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity;->X(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/adapters/LaunchpadAdapter;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    iget v1, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$position:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity;->Y(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/r$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$appData:Lcom/yuanqi/group/home/models/b;

    invoke-virtual {v1}, Lcom/yuanqi/group/home/models/b;->getUserId()I

    move-result v1

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$appData:Lcom/yuanqi/group/home/models/b;

    invoke-virtual {v2}, Lcom/yuanqi/group/home/models/b;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getPackageName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/yuanqi/group/home/HomeActivity$n$a;->$appData:Lcom/yuanqi/group/home/models/b;

    invoke-virtual {v3}, Lcom/yuanqi/group/home/models/b;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {v0, v1, v2, v3}, Lcom/yuanqi/group/home/r$a;->g(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
