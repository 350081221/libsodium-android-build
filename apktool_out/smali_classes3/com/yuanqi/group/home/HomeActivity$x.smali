.class final Lcom/yuanqi/group/home/HomeActivity$x;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->l1()V
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
.field final synthetic $showUpDateContentKey:Ljava/lang/String;

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/yuanqi/group/home/HomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$x;->$showUpDateContentKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeActivity$x;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$x;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    sget-object v0, Lcom/yuanqi/master/tools/w0;->a:Lcom/yuanqi/master/tools/w0;

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$x;->$showUpDateContentKey:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/tools/w0;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$x;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeViewModel;->M()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
