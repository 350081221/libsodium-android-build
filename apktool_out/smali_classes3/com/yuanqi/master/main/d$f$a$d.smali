.class final Lcom/yuanqi/master/main/d$f$a$d;
.super Lkotlin/jvm/internal/n0;
.source "SourceFile"

# interfaces
.implements Lv3/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuanqi/master/main/d$f$a;->invoke(Landroidx/compose/foundation/lazy/grid/LazyGridScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/n0;",
        "Lv3/q<",
        "Landroidx/compose/foundation/layout/ColumnScope;",
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
        "Landroidx/compose/foundation/layout/ColumnScope;",
        "invoke",
        "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V"
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
.field final synthetic $info:Lcom/yuanqi/group/home/models/b;

.field final synthetic $mainViewModel:Lcom/yuanqi/master/main/MainViewModel;


# direct methods
.method constructor <init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;)V
    .locals 0

    iput-object p1, p0, Lcom/yuanqi/master/main/d$f$a$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    iput-object p2, p0, Lcom/yuanqi/master/main/d$f$a$d;->$info:Lcom/yuanqi/group/home/models/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/yuanqi/master/main/d$f$a$d;->invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/r2;->a:Lkotlin/r2;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .param p1    # Landroidx/compose/foundation/layout/ColumnScope;
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

    const-string v2, "$this$DropdownMenu"

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

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.yuanqi.master.main.MainScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainScreen.kt:196)"

    const v4, 0x5aef6efb

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Lcom/yuanqi/master/main/b;->a:Lcom/yuanqi/master/main/b;

    invoke-virtual {v1}, Lcom/yuanqi/master/main/b;->e()Lv3/p;

    move-result-object v2

    new-instance v3, Lcom/yuanqi/master/main/d$f$a$d$a;

    iget-object v4, v0, Lcom/yuanqi/master/main/d$f$a$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    iget-object v5, v0, Lcom/yuanqi/master/main/d$f$a$d;->$info:Lcom/yuanqi/group/home/models/b;

    invoke-direct {v3, v4, v5}, Lcom/yuanqi/master/main/d$f$a$d$a;-><init>(Lcom/yuanqi/master/main/MainViewModel;Lcom/yuanqi/group/home/models/b;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x6

    const/16 v13, 0x1fc

    move-object/from16 v11, p2

    invoke-static/range {v2 .. v13}, Landroidx/compose/material3/AndroidMenu_androidKt;->DropdownMenuItem(Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7

    move-object/from16 v18, p2

    .line 5
    invoke-static/range {v14 .. v20}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lcom/yuanqi/master/main/b;->f()Lv3/p;

    move-result-object v2

    .line 6
    new-instance v3, Lcom/yuanqi/master/main/d$f$a$d$b;

    iget-object v4, v0, Lcom/yuanqi/master/main/d$f$a$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-direct {v3, v4}, Lcom/yuanqi/master/main/d$f$a$d$b;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    const/4 v4, 0x0

    invoke-static/range {v2 .. v13}, Landroidx/compose/material3/AndroidMenu_androidKt;->DropdownMenuItem(Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 7
    invoke-static/range {v14 .. v20}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lcom/yuanqi/master/main/b;->g()Lv3/p;

    move-result-object v2

    .line 8
    new-instance v3, Lcom/yuanqi/master/main/d$f$a$d$c;

    iget-object v4, v0, Lcom/yuanqi/master/main/d$f$a$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-direct {v3, v4}, Lcom/yuanqi/master/main/d$f$a$d$c;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    const/4 v4, 0x0

    invoke-static/range {v2 .. v13}, Landroidx/compose/material3/AndroidMenu_androidKt;->DropdownMenuItem(Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 9
    invoke-static/range {v14 .. v20}, Landroidx/compose/material3/DividerKt;->HorizontalDivider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lcom/yuanqi/master/main/b;->h()Lv3/p;

    move-result-object v2

    .line 10
    new-instance v3, Lcom/yuanqi/master/main/d$f$a$d$d;

    iget-object v1, v0, Lcom/yuanqi/master/main/d$f$a$d;->$mainViewModel:Lcom/yuanqi/master/main/MainViewModel;

    invoke-direct {v3, v1}, Lcom/yuanqi/master/main/d$f$a$d$d;-><init>(Lcom/yuanqi/master/main/MainViewModel;)V

    invoke-static/range {v2 .. v13}, Landroidx/compose/material3/AndroidMenu_androidKt;->DropdownMenuItem(Lv3/p;Lv3/a;Landroidx/compose/ui/Modifier;Lv3/p;Lv3/p;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_3
    :goto_1
    return-void
.end method
