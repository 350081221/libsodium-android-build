.class final Lcom/yuanqi/group/home/HomeActivity$t;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity;->h1(Ljava/lang/String;ILjava/lang/String;)V
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
.field final synthetic $mName:Ljava/lang/String;

.field final synthetic $mPackageName:Ljava/lang/String;

.field final synthetic $mUserId:I

.field final synthetic this$0:Lcom/yuanqi/group/home/HomeActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$t;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput-object p2, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mPackageName:Ljava/lang/String;

    iput p3, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mUserId:I

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mName:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$t;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$t;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mPackageName:Ljava/lang/String;

    iget v2, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mUserId:I

    new-instance v3, Lcom/yuanqi/group/home/HomeActivity$t$a;

    iget-object v4, p0, Lcom/yuanqi/group/home/HomeActivity$t;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iget-object v5, p0, Lcom/yuanqi/group/home/HomeActivity$t;->$mName:Ljava/lang/String;

    invoke-direct {v3, v4, v2, v1, v5}, Lcom/yuanqi/group/home/HomeActivity$t$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/group/home/HomeViewModel;->S(Ljava/lang/String;ILv3/l;)V

    return-void
.end method
