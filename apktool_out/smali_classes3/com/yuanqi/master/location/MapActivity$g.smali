.class final Lcom/yuanqi/master/location/MapActivity$g;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/MapActivity;->e0()V
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
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "content",
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
.field final synthetic this$0:Lcom/yuanqi/master/location/MapActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/MapActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/location/MapActivity$g;->this$0:Lcom/yuanqi/master/location/MapActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/location/MapActivity$g;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/location/MapActivity$g;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-static {v0}, Lcom/yuanqi/master/location/MapActivity;->V(Lcom/yuanqi/master/location/MapActivity;)Lcom/yuanqi/master/location/MapViewModel;

    move-result-object v0

    new-instance v1, Lcom/yuanqi/master/location/MapActivity$g$a;

    iget-object v2, p0, Lcom/yuanqi/master/location/MapActivity$g;->this$0:Lcom/yuanqi/master/location/MapActivity;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/location/MapActivity$g$a;-><init>(Lcom/yuanqi/master/location/MapActivity;)V

    invoke-virtual {v0, p1, v1}, Lcom/yuanqi/master/location/MapViewModel;->f(Ljava/lang/String;Lv3/l;)V

    return-void
.end method
