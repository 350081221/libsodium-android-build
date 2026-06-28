.class final Lcom/yuanqi/master/mine/MineViewModel$j;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/mine/MineViewModel;->h(Landroid/app/Activity;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Ljava/lang/String;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "msg",
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
.field final synthetic $context:Landroid/app/Activity;

.field final synthetic this$0:Lcom/yuanqi/master/mine/MineViewModel;


# direct methods
.method constructor <init>(Landroid/app/Activity;Lcom/yuanqi/master/mine/MineViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$j;->$context:Landroid/app/Activity;

    iput-object p2, p0, Lcom/yuanqi/master/mine/MineViewModel$j;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/mine/MineViewModel$j;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/yuanqi/master/mine/MineViewModel$j;->$context:Landroid/app/Activity;

    const v0, 0x7f12020a

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/mine/MineViewModel$j;->this$0:Lcom/yuanqi/master/mine/MineViewModel;

    invoke-virtual {v0, p1}, Lcom/yuanqi/master/mine/MineViewModel;->X(Ljava/lang/String;)V

    return-void
.end method
