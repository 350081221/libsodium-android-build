.class final Lcom/yuanqi/group/home/HomeActivity$n;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->R0(ILcom/yuanqi/group/home/models/b;Lv2/b;)V
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

.field final synthetic $noteApp:Lv2/b;

.field final synthetic $position:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;Lv2/b;ILcom/yuanqi/group/home/models/b;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$n;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$noteApp:Lv2/b;

    iput p3, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$position:I

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$appData:Lcom/yuanqi/group/home/models/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$n;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$n;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$n;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$noteApp:Lv2/b;

    new-instance v3, Lcom/yuanqi/group/home/HomeActivity$n$a;

    iget v4, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$position:I

    iget-object v5, p0, Lcom/yuanqi/group/home/HomeActivity$n;->$appData:Lcom/yuanqi/group/home/models/b;

    invoke-direct {v3, v1, v4, v5}, Lcom/yuanqi/group/home/HomeActivity$n$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;ILcom/yuanqi/group/home/models/b;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/group/home/HomeViewModel;->j0(Landroid/content/Context;Lv2/b;Lv3/a;)V

    return-void
.end method
