.class final Lcom/yuanqi/master/addapp/home/i$b$a$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/i$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
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
.method constructor <init>(Landroidx/activity/compose/ManagedActivityResultLauncher;Landroid/content/Context;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/addapp/home/i$b$a$b;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    invoke-static {}, Lcom/yuanqi/master/tools/f1;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 4
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-virtual {v1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/yuanqi/master/tools/f1;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$context:Landroid/content/Context;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-virtual {v0, v1, v2, v3}, Lcom/yuanqi/master/addapp/AddAppViewModel;->v0(Landroid/content/Context;ZLandroidx/activity/compose/ManagedActivityResultLauncher;)V

    return-void

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v1, p0, Lcom/yuanqi/master/addapp/home/i$b$a$b;->$context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yuanqi/master/addapp/AddAppViewModel;->u0(Landroid/content/Context;)V

    return-void
.end method
