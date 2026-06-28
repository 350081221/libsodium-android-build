.class final Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/p<",
        "Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "latitude",
        "",
        "longitude",
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
.field final synthetic this$0:Lcom/yuanqi/master/location/HistoryActivity;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/location/HistoryActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a$a;->invoke(DD)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(DD)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "extra_latitude"

    .line 3
    invoke-virtual {v1, v2, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    const-string p1, "extra_longitude"

    .line 4
    invoke-virtual {v1, p1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;D)Landroid/content/Intent;

    .line 5
    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    const/4 p1, -0x1

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 7
    iget-object p1, p0, Lcom/yuanqi/master/location/HistoryActivity$c$a$d$a$a$a$a;->this$0:Lcom/yuanqi/master/location/HistoryActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
