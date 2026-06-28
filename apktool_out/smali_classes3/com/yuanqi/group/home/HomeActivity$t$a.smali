.class final Lcom/yuanqi/group/home/HomeActivity$t$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/group/home/HomeActivity$t;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lv2/b;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/yuanqi/master/database/model/AppNote;",
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

    iput-object p1, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    iput p2, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mUserId:I

    iput-object p3, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mPackageName:Ljava/lang/String;

    iput-object p4, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mName:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv2/b;

    invoke-virtual {p0, p1}, Lcom/yuanqi/group/home/HomeActivity$t$a;->invoke(Lv2/b;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lv2/b;)V
    .locals 6
    .param p1    # Lv2/b;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/HomeActivity;->w0()Lcom/yuanqi/group/home/HomeViewModel;

    move-result-object v0

    iget-object v1, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->this$0:Lcom/yuanqi/group/home/HomeActivity;

    new-instance v2, Lcom/yuanqi/group/home/HomeActivity$t$a$a;

    iget v3, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mUserId:I

    iget-object v4, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mPackageName:Ljava/lang/String;

    iget-object v5, p0, Lcom/yuanqi/group/home/HomeActivity$t$a;->$mName:Ljava/lang/String;

    invoke-direct {v2, v1, v3, v4, v5}, Lcom/yuanqi/group/home/HomeActivity$t$a$a;-><init>(Lcom/yuanqi/group/home/HomeActivity;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/yuanqi/group/home/HomeViewModel;->j0(Landroid/content/Context;Lv2/b;Lv3/a;)V

    return-void
.end method
