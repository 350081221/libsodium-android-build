.class final Lcom/yuanqi/master/manager/ManagerViewModel$t;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/ManagerViewModel;->n0(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Ljava/lang/String;ILv3/a;)V
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
.field final synthetic $changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $packageName:Ljava/lang/String;

.field final synthetic $userId:I

.field final synthetic this$0:Lcom/yuanqi/master/manager/ManagerViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/manager/ManagerViewModel;",
            "Landroid/content/Context;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p4, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$packageName:Ljava/lang/String;

    iput p5, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$userId:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/ManagerViewModel$t;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/yuanqi/master/manager/ManagerViewModel;->n(Lcom/yuanqi/master/manager/ManagerViewModel;Z)V

    .line 3
    iget-object v0, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->this$0:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v3, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$packageName:Ljava/lang/String;

    iget v4, p0, Lcom/yuanqi/master/manager/ManagerViewModel$t;->$userId:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/yuanqi/master/manager/ManagerViewModel;->j(Lcom/yuanqi/master/manager/ManagerViewModel;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Ljava/lang/String;I)V

    return-void
.end method
