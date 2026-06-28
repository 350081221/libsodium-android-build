.class final Lcom/yuanqi/master/manager/e$c$a$h;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/e$c$a;->invoke(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
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
        "Landroidx/compose/animation/AnimatedVisibilityScope;",
        "invoke",
        "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"
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
.field final synthetic $angle$delegate:Landroidx/compose/runtime/MutableFloatState;

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

.field final synthetic $clickCount$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

.field final synthetic $showLocation$delegate:Lcom/yuanqi/master/tools/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/yuanqi/master/manager/ManagerViewModel;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "Landroid/content/Intent;",
            "Landroidx/activity/result/ActivityResult;",
            ">;",
            "Landroidx/activity/compose/ManagedActivityResultLauncher<",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Lcom/yuanqi/master/tools/x0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableFloatState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p4, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iput-object p6, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p8, p0, Lcom/yuanqi/master/manager/e$c$a$h;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/AnimatedVisibilityScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/manager/e$c$a$h;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .param p1    # Landroidx/compose/animation/AnimatedVisibilityScope;
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

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.yuanqi.master.manager.ManagerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManagerScreen.kt:276)"

    const v3, 0x3166d24d

    move/from16 v4, p3

    .line 2
    invoke-static {v3, v4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    const v4, 0x7f0f0030

    const v1, 0x7f1202c9

    const/4 v2, 0x6

    move-object/from16 v3, p2

    .line 3
    invoke-static {v1, v3, v2}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 4
    new-instance v1, Lcom/yuanqi/master/manager/e$c$a$h$a;

    iget-object v9, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$context:Landroid/content/Context;

    iget-object v10, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

    iget-object v11, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v12, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v13, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iget-object v14, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v15, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iget-object v2, v0, Lcom/yuanqi/master/manager/e$c$a$h;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, v1

    move-object/from16 v16, v2

    invoke-direct/range {v8 .. v16}, Lcom/yuanqi/master/manager/e$c$a$h$a;-><init>(Landroid/content/Context;Lcom/yuanqi/master/manager/ManagerViewModel;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V

    const/4 v10, 0x6

    const/16 v11, 0xc

    move-object/from16 v9, p2

    invoke-static/range {v4 .. v11}, Lcom/yuanqi/master/tools/a;->m(ILjava/lang/String;Ljava/lang/String;Lv3/p;Lv3/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    return-void
.end method
