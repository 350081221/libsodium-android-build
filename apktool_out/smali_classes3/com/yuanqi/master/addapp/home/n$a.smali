.class final Lcom/yuanqi/master/addapp/home/n$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/n;->a(ILcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic $addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

.field final synthetic $appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $index:I

.field final synthetic $info:Lcom/yuanqi/group/home/models/c;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Lcom/yuanqi/group/home/models/c;Landroid/content/Context;Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Lcom/yuanqi/group/home/models/c;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/yuanqi/group/home/models/c;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/n$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/n$a;->$info:Lcom/yuanqi/group/home/models/c;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/n$a;->$context:Landroid/content/Context;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/n$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p5, p0, Lcom/yuanqi/master/addapp/home/n$a;->$index:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/n$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/addapp/AddAppViewModel;->E()Landroidx/compose/runtime/MutableState;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/yuanqi/master/mine/account/a;->a:Lcom/yuanqi/master/mine/account/a;

    invoke-virtual {v0}, Lcom/yuanqi/master/mine/account/a;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$a;->$info:Lcom/yuanqi/group/home/models/c;

    iget-object v1, v1, Lcom/yuanqi/group/home/models/c;->a:Ljava/lang/String;

    const-string v2, "packageName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l0;->o(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->M(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$a;->$context:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/yuanqi/master/BaseViewModel;->b(Landroid/content/Context;I)V

    return-void

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/n$a;->$info:Lcom/yuanqi/group/home/models/c;

    invoke-virtual {v0}, Lcom/yuanqi/group/home/models/c;->a()Lcom/yuanqi/group/home/models/c;

    move-result-object v0

    .line 6
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$a;->$info:Lcom/yuanqi/group/home/models/c;

    iget v1, v1, Lcom/yuanqi/group/home/models/c;->f:I

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 7
    iput v1, v0, Lcom/yuanqi/group/home/models/c;->f:I

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 8
    iput v1, v0, Lcom/yuanqi/group/home/models/c;->f:I

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/n$a;->$appShowList:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget v2, p0, Lcom/yuanqi/master/addapp/home/n$a;->$index:I

    invoke-static {v0}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
