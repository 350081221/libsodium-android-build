.class final Lcom/yuanqi/master/manager/e$c$a$h$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/manager/e$c$a$h;->invoke(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V
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

.annotation build Lkotlin/jvm/internal/r1;
    value = {
        "SMAP\nManagerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1$1$8$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,351:1\n37#2,2:352\n*S KotlinDebug\n*F\n+ 1 ManagerScreen.kt\ncom/yuanqi/master/manager/ManagerScreenKt$ManagerScreen$3$1$1$8$1\n*L\n300#1:352,2\n*E\n"
    }
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

    iput-object p1, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

    iput-object p3, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p4, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p5, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iput-object p6, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iput-object p8, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/yuanqi/master/manager/e$c$a$h$a;->invoke()V

    sget-object v0, Lkotlin/r2;->a:Lkotlin/r2;

    return-object v0
.end method

.method public final invoke()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/yuanqi/master/tools/f1;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

    .line 4
    iget-object v2, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$context:Landroid/content/Context;

    .line 5
    iget-object v3, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$changeLocationResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    .line 6
    invoke-virtual {v1}, Lcom/yuanqi/master/manager/ManagerViewModel;->D()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/l0;->m(Ljava/lang/Object;)V

    .line 7
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$managerViewModel:Lcom/yuanqi/master/manager/ManagerViewModel;

    invoke-virtual {v0}, Lcom/yuanqi/master/manager/ManagerViewModel;->G()I

    move-result v5

    .line 8
    new-instance v6, Lcom/yuanqi/master/manager/e$c$a$h$a$a;

    iget-object v0, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$showLocation$delegate:Lcom/yuanqi/master/tools/x0;

    iget-object v7, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$showLocationFunction$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$angle$delegate:Landroidx/compose/runtime/MutableFloatState;

    iget-object v9, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$clickCount$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {v6, v0, v7, v8, v9}, Lcom/yuanqi/master/manager/e$c$a$h$a$a;-><init>(Lcom/yuanqi/master/tools/x0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;)V

    invoke-virtual/range {v1 .. v6}, Lcom/yuanqi/master/manager/ManagerViewModel;->n0(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Ljava/lang/String;ILv3/a;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/yuanqi/master/manager/e$c$a$h$a;->$locationPermissionResultLauncher:Landroidx/activity/compose/ManagedActivityResultLauncher;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-static {v1}, Lkotlin/collections/u;->L([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    .line 12
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
