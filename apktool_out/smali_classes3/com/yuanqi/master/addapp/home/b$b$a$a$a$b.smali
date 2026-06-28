.class final Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic $allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
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

.field final synthetic $storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroid/content/Context;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    invoke-static {}, Lcom/yuanqi/master/tools/f1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "\u6240\u6709\u6587\u4ef6\u8bbf\u95ee\u6743\u9650\u5df2\u83b7\u53d6"

    const/4 v3, 0x0

    .line 3
    invoke-static {v2, v3, v0, v1}, Lcom/yuanqi/master/tools/f1;->r(Ljava/lang/CharSequence;IILjava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    .line 5
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$context:Landroid/content/Context;

    .line 6
    iget-object v2, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 7
    iget-object v3, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 8
    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/master/addapp/AddAppViewModel;->R(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    :goto_0
    return-void
.end method
