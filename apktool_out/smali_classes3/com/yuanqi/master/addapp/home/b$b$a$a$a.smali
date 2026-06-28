.class final Lcom/yuanqi/master/addapp/home/b$b$a$a$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/home/b$b$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyListScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/r2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V"
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

    iput-object p1, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iput-object p4, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p7, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p8, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p11, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p12, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p13, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p14, p0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/lazy/LazyItemScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .param p1    # Landroidx/compose/foundation/lazy/LazyItemScope;
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

    move/from16 v1, p3

    const-string v2, "$this$item"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    .line 2
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_d

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.addapp.home.CheckPermissionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckPermissionScreen.kt:141)"

    const v4, -0x44f3a4b4

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const-string v5, "\u901a\u77e5\u6743\u9650"

    .line 5
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$notificationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->p(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/yuanqi/master/tools/f1;->k(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v6, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v6, v3

    :goto_2
    const/4 v7, 0x0

    .line 6
    new-instance v8, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$a;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$notificationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v8, v1, v4, v9}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$a;-><init>(Landroid/content/Context;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/4 v10, 0x6

    const/4 v11, 0x4

    move-object/from16 v9, p2

    invoke-static/range {v5 .. v11}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v12, "\u6240\u6709\u6587\u4ef6\u8bbf\u95ee\u6743\u9650"

    .line 7
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$allFilesAccessPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->A(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {}, Lcom/yuanqi/master/tools/f1;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    move v13, v2

    goto :goto_4

    :cond_6
    :goto_3
    move v13, v3

    :goto_4
    const/4 v14, 0x0

    .line 8
    new-instance v15, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v5, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$allFilesAccessPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v15, v1, v4, v5, v6}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$b;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/16 v17, 0x6

    const/16 v18, 0x4

    move-object/from16 v16, p2

    invoke-static/range {v12 .. v18}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v4, "\u5b58\u50a8\u6743\u9650"

    .line 9
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$storagePermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->q(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/yuanqi/master/tools/f1;->n(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_5

    :cond_7
    move v5, v2

    goto :goto_6

    :cond_8
    :goto_5
    move v5, v3

    :goto_6
    const/4 v6, 0x0

    .line 10
    new-instance v7, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$c;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$storagePermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v7, v1, v8}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$c;-><init>(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/4 v9, 0x6

    const/4 v10, 0x4

    move-object/from16 v8, p2

    invoke-static/range {v4 .. v10}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v11, "\u4f4d\u7f6e\u6743\u9650"

    .line 11
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$locationPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->s(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/yuanqi/master/tools/f1;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_7

    :cond_9
    move v12, v2

    goto :goto_8

    :cond_a
    :goto_7
    move v12, v3

    :goto_8
    const/4 v13, 0x0

    .line 12
    new-instance v14, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$d;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v4, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v14, v1, v4}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$d;-><init>(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/16 v16, 0x6

    const/16 v17, 0x4

    move-object/from16 v15, p2

    invoke-static/range {v11 .. v17}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v4, "\u521b\u5efa\u684c\u9762\u5feb\u6377\u65b9\u5f0f\u6743\u9650"

    .line 13
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$shortcutPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->w(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/yuanqi/master/tools/f1;->i(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_9

    :cond_b
    move v5, v2

    goto :goto_a

    :cond_c
    :goto_9
    move v5, v3

    :goto_a
    const/4 v6, 0x0

    .line 14
    new-instance v7, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$e;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v8, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v9, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$shortcutPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v7, v1, v8, v9}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$e;-><init>(Landroid/content/Context;Lcom/yuanqi/master/addapp/AddAppViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/4 v9, 0x6

    const/4 v10, 0x4

    move-object/from16 v8, p2

    invoke-static/range {v4 .. v10}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v11, "\u60ac\u6d6e\u7a97\u6743\u9650"

    .line 15
    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$floatingPermissionState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/yuanqi/master/addapp/home/b;->u(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-nez v1, :cond_e

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-static {v1}, Lcom/yuanqi/master/tools/f1;->f(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_b

    :cond_d
    move v12, v2

    goto :goto_c

    :cond_e
    :goto_b
    move v12, v3

    :goto_c
    const/4 v13, 0x0

    .line 16
    new-instance v14, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$f;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$floatingPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    invoke-direct {v14, v1, v2}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$f;-><init>(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;)V

    const/16 v16, 0x6

    const/16 v17, 0x4

    move-object/from16 v15, p2

    invoke-static/range {v11 .. v17}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "\u540e\u53f0\u8fd0\u884c\u6743\u9650"

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 17
    new-instance v4, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$g;

    iget-object v5, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v6, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-direct {v4, v5, v6}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$g;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V

    const/16 v6, 0x186

    const/4 v7, 0x2

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v7}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    const-string v8, "\u81ea\u542f\u52a8\u6743\u9650"

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 18
    new-instance v11, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$h;

    iget-object v1, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$addAppViewModel:Lcom/yuanqi/master/addapp/AddAppViewModel;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/home/b$b$a$a$a;->$context:Landroid/content/Context;

    invoke-direct {v11, v1, v2}, Lcom/yuanqi/master/addapp/home/b$b$a$a$a$h;-><init>(Lcom/yuanqi/master/addapp/AddAppViewModel;Landroid/content/Context;)V

    const/16 v13, 0x186

    const/4 v14, 0x2

    move-object/from16 v12, p2

    invoke-static/range {v8 .. v14}, Lcom/yuanqi/master/tools/a;->n(Ljava/lang/String;ZZLv3/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_f
    :goto_d
    return-void
.end method
