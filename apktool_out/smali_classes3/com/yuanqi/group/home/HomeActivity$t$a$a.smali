.class final Lcom/yuanqi/group/home/HomeActivity$t$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity$t$a;->invoke(Lv2/b;)V
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
.method constructor <init>(Lcom/yuanqi/group/home/HomeActivity;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput p2, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mUserId:I

    iput-object p3, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mPackageName:Ljava/lang/String;

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mName:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-static {v0}, Lcom/yuanqi/group/home/HomeActivity;->Y(Lcom/yuanqi/group/home/HomeActivity;)Lcom/yuanqi/group/home/r$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    iget v1, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mUserId:I

    iget-object v2, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mPackageName:Ljava/lang/String;

    iget-object v3, p0, Lcom/yuanqi/group/home/HomeActivity$t$a$a;->$mName:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/yuanqi/group/home/r$a;->g(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
