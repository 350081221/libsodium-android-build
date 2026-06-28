.class final Lcom/yuanqi/master/addapp/home/b$b$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/b$b$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/lazy/LazyListScope;",
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

.field final synthetic $allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

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

.field final synthetic $storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/yuanqi/master/addapp/AddAppViewModel;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p7, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p8, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p11, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p12, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p13, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p14, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyListScope;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/home/b$b$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
    .locals 20
    .param p1    # Landroidx/compose/foundation/lazy/LazyListScope;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "$this$LazyColumn"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$context:Landroid/content/Context;

    iget-object v7, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v12, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v13, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v14, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-object/from16 v16, v5

    move-object v5, v1

    move-object/from16 v17, v4

    move-object/from16 v18, v3

    move-object/from16 v19, v2

    invoke-direct/range {v5 .. v19}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;-><init>(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const v2, -0x44f3a4b4

    const/4 v3, 0x1

    invoke-static {v2, v3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    move-object/from16 v2, p1

    const/4 v1, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    move-object v4, v1

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/lazy/LazyListScope;->item$default(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/lang/Object;Ljava/lang/Object;Lv3/q;ILjava/lang/Object;)V

    return-void
.end method
