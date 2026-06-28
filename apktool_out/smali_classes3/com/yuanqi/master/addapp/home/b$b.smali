.class final Lcom/yuanqi/master/addapp/home/b$b;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/b;->a(Landroidx/navigation/NavHostController;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "invoke",
        "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V"
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

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/b$b;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/b$b;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/b$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/b$b;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/b$b;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/b$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p7, p0, Lcom/yuanqi/master/addapp/home/b$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p8, p0, Lcom/yuanqi/master/addapp/home/b$b;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/yuanqi/master/addapp/home/b$b;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/yuanqi/master/addapp/home/b$b;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p11, p0, Lcom/yuanqi/master/addapp/home/b$b;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p12, p0, Lcom/yuanqi/master/addapp/home/b$b;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p13, p0, Lcom/yuanqi/master/addapp/home/b$b;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p14, p0, Lcom/yuanqi/master/addapp/home/b$b;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/PaddingValues;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/addapp/home/b$b;->invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .param p1    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/runtime/Composer;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v3, "it"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, v1, 0xe

    if-nez v3, :cond_1

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v3, v3, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_3

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_3

    .line 4
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous> (CheckPermissionScreen.kt:137)"

    const v5, 0x67313dd9    # 8.3699976E23f

    invoke-static {v5, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_4
    new-instance v14, Lcom/yuanqi/master/addapp/home/b$b$a;

    iget-object v3, v0, Lcom/yuanqi/master/addapp/home/b$b;->$context:Landroid/content/Context;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/b$b;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, v0, Lcom/yuanqi/master/addapp/home/b$b;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/b$b;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v7, v0, Lcom/yuanqi/master/addapp/home/b$b;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/b$b;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/b$b;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v10, v0, Lcom/yuanqi/master/addapp/home/b$b;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v11, v0, Lcom/yuanqi/master/addapp/home/b$b;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v12, v0, Lcom/yuanqi/master/addapp/home/b$b;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v13, v0, Lcom/yuanqi/master/addapp/home/b$b;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v15, v0, Lcom/yuanqi/master/addapp/home/b$b;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/yuanqi/master/addapp/home/b$b;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    move-object/from16 v17, v1

    move-object v1, v14

    move-object/from16 v2, p1

    move-object v0, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    invoke-direct/range {v1 .. v16}, Lcom/yuanqi/master/addapp/home/b$b$a;-><init>(Landroidx/compose/foundation/layout/PaddingValues;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const v1, 0x563129b2

    const/4 v2, 0x1

    move-object/from16 v3, p2

    invoke-static {v3, v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v3, v1}, Lcom/yuanqi/master/tools/a;->h(Lv3/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_5
    :goto_3
    return-void
.end method
