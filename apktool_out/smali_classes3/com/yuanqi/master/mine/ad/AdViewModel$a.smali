.class final Lcom/yuanqi/master/mine/ad/AdViewModel$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/ad/AdViewModel;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Lcom/yuanqi/master/network/model/BasicResponse;",
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
        "Lcom/yuanqi/master/network/model/BasicResponse;",
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
.field final synthetic this$0:Lcom/yuanqi/master/mine/ad/AdViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/mine/ad/AdViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel$a;->this$0:Lcom/yuanqi/master/mine/ad/AdViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/yuanqi/master/network/model/BasicResponse;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/ad/AdViewModel$a;->invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Lcom/yuanqi/master/network/model/BasicResponse;)V
    .locals 5
    .param p1    # Lcom/yuanqi/master/network/model/BasicResponse;
        .annotation build Lp4/m;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel$a;->this$0:Lcom/yuanqi/master/mine/ad/AdViewModel;

    invoke-static {v0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->a(Lcom/yuanqi/master/mine/ad/AdViewModel;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/BasicResponse;->getCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_0

    const-string p1, "\u5df2\u83b7\u53d6VIP\u5956\u52b1"

    .line 4
    invoke-static {p1, v2, v1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/yuanqi/master/mine/ad/AdViewModel$a;->this$0:Lcom/yuanqi/master/mine/ad/AdViewModel;

    invoke-static {p1, v2}, Lcom/yuanqi/master/mine/ad/AdViewModel;->d(Lcom/yuanqi/master/mine/ad/AdViewModel;I)V

    .line 6
    sget-object p1, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    iget-object v0, p0, Lcom/yuanqi/master/mine/ad/AdViewModel$a;->this$0:Lcom/yuanqi/master/mine/ad/AdViewModel;

    invoke-static {v0}, Lcom/yuanqi/master/mine/ad/AdViewModel;->c(Lcom/yuanqi/master/mine/ad/AdViewModel;)Lkotlinx/coroutines/s0;

    move-result-object v0

    sget-object v1, Lcom/yuanqi/master/mine/ad/AdViewModel$a$a;->INSTANCE:Lcom/yuanqi/master/mine/ad/AdViewModel$a$a;

    invoke-virtual {p1, v0, v1}, Lcom/yuanqi/master/mine/account/a;->n(Lkotlinx/coroutines/s0;Lv3/a;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/yuanqi/master/network/model/BasicResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string p1, "\u8d60\u9001VIP\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc"

    .line 8
    invoke-static {p1, v2, v1, v0}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method
