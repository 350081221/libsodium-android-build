.class final Lcom/yuanqi/master/addapp/g$a;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/addapp/g;->a(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/l<",
        "Landroidx/navigation/NavGraphBuilder;",
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
        "Landroidx/navigation/NavGraphBuilder;",
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
.field final synthetic $navController:Landroidx/navigation/NavHostController;


# direct methods
.method constructor <init>(Landroidx/navigation/NavHostController;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0, p1}, Lcom/yuanqi/master/addapp/g$a;->invoke(Landroidx/navigation/NavGraphBuilder;)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/navigation/NavGraphBuilder;)V
    .locals 15
    .param p1    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lp4/l;
        .end annotation
    .end param

    move-object v0, p0

    const-string v1, "$this$NavHost"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/l0;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    sget-object v2, Lcom/yuanqi/master/addapp/g$a$b;->a:Lcom/yuanqi/master/addapp/g$a$b;

    invoke-virtual {v1, v2}, Landroidx/navigation/NavController;->addOnDestinationChangedListener(Landroidx/navigation/NavController$OnDestinationChangedListener;)V

    const-string v3, "main_screen"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 3
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$c;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$c;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x5f8c96ef

    const/4 v14, 0x1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    const/16 v11, 0x7e

    const/4 v12, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "select_screen"

    .line 4
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$d;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$d;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x7ea54e18

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "sort_screen"

    .line 5
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$e;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$e;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x57364037

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "check_permission_screen"

    .line 6
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$f;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$f;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x2fc73256

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "search_screen"

    .line 7
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$g;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$g;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x8582475

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "data_manager_screen"

    .line 8
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$h;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$h;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, -0x1f16e96c

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "process_limits_screen"

    .line 9
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$i;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$i;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, -0x4685f74d

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "about_screen"

    .line 10
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$j;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$j;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, -0x6df5052e

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    const-string v3, "web_screen"

    .line 11
    new-instance v1, Lcom/yuanqi/master/addapp/g$a$a;

    iget-object v2, v0, Lcom/yuanqi/master/addapp/g$a;->$navController:Landroidx/navigation/NavHostController;

    invoke-direct {v1, v2}, Lcom/yuanqi/master/addapp/g$a$a;-><init>(Landroidx/navigation/NavHostController;)V

    const v2, 0x6a9becf1

    invoke-static {v2, v14, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v10

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lv3/l;Lv3/l;Lv3/l;Lv3/l;Lv3/r;ILjava/lang/Object;)V

    return-void
.end method
